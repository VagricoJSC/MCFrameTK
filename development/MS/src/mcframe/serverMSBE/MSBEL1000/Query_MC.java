package mcframe.serverMSBE.MSBEL1000;

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
	 * -- MSBEL1000_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1000_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MSW_SHIP_PR_KEY_R S0_W1 = MSW_SHIP_PR_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1000_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(S0_T1.ship_pr_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_W1.ship_pr_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.alloc_qty.gt(value(0)))
					)
			);
	}
	
	/**
	 * -- MSBEL1000_MST_XFR_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBEL1000_MST_XFR_ALLOC_STS_S01() {
		MST_XFR_ALLOC_STS_R S0_T1 = MST_XFR_ALLOC_STS_R.create("T1");
		MSW_XFR_SCHD_KEY_R S0_W1 = MSW_XFR_SCHD_KEY_R.create("W1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1000_MST_XFR_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(S0_T1.xfr_schd_no)
					.from(
						S0_T1
						.innerJoin(S0_W1).on(
							bracket(
								S0_T1.xfr_schd_no.eq(S0_W1.xfr_schd_no)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.alloc_flg.eq(value(true)))
					)
			);
	}
	
	/**
	 * -- MSBEL1000_MST_XFR_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1000_MST_XFR_SCHD_S01() {
		MST_XFR_SCHD_R S0_T1 = MST_XFR_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_LG_GRP_R S0_M2 = MAM_LG_GRP_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_STR_LN_R S0_M4 = MAM_STR_LN_R.create("M4");
		MAVM_BP_NM_R S0_M5 = MAVM_BP_NM_R.create("M5");
		MAM_WG_R S0_M6 = MAM_WG_R.create("M6");
		MAM_SITE_R S0_M7 = MAM_SITE_R.create("M7");
		MAM_LG_GRP_R S0_M8 = MAM_LG_GRP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_WG_R S0_M12 = MAM_WG_R.create("M12");
		MAM_SITE_R S0_M13 = MAM_SITE_R.create("M13");
		MAM_UNIT_R S0_M14 = MAM_UNIT_R.create("M14");
		MSVT_WRK_SNO_R S0_T4 = MSVT_WRK_SNO_R.create("T4");
		MAM_UNIT_R S0_M15 = MAM_UNIT_R.create("M15");
		MAM_STK_GD_R S0_M16 = MAM_STK_GD_R.create("M16");
		MAVM_BP_NM_R S0_M17 = MAVM_BP_NM_R.create("M17");
		MAM_USR_R S0_M18 = MAM_USR_R.create("M18");
		MAM_DPT_R S0_M19 = MAM_DPT_R.create("M19");
		MAM_BIZ_RSN_R S0_M20 = MAM_BIZ_RSN_R.create("M20");
		MAM_DPT_R S0_M21 = MAM_DPT_R.create("M21");
		MAM_CUR_R S0_M22 = MAM_CUR_R.create("M22");
		MAM_TAX_R S0_M23 = MAM_TAX_R.create("M23");
		MAM_CUR_R S0_M24 = MAM_CUR_R.create("M24");
		MAM_TAX_R S0_M25 = MAM_TAX_R.create("M25");
		MAM_ITM_R S0_M26 = MAM_ITM_R.create("M26");
		MAM_SUNDRY_ITM_R S0_M27 = MAM_SUNDRY_ITM_R.create("M27");
		MAM_ITM_TYP_D_R S0_M28 = MAM_ITM_TYP_D_R.create("M28");
		MAM_SHIP_TERM_R S0_M32 = MAM_SHIP_TERM_R.create("M32");
		MAM_CUR_R S0_M35 = MAM_CUR_R.create("M35");
		MAM_CUR_R S0_M36 = MAM_CUR_R.create("M36");
		MAM_LG_CTL_R S0_M37 = MAM_LG_CTL_R.create("M37");
		MAM_LG_CTL_R S0_M38 = MAM_LG_CTL_R.create("M38");
		MAVM_BP_NM_R S0_M39 = MAVM_BP_NM_R.create("M39");
		MAVM_RD_LG_GRP_R S0_DACGI = MAVM_RD_LG_GRP_R.create("DACGI");
		MAVM_RD_LOC_R S0_DACGR = MAVM_RD_LOC_R.create("DACGR");
		MAM_ITM_LG_GRP_R S0_M40 = MAM_ITM_LG_GRP_R.create("M40");
		MAM_LOC_R S0_M41 = MAM_LOC_R.create("M41");
		MAVM_RD_LOC_R S0_DACGILOC = MAVM_RD_LOC_R.create("DACGILOC");
		MAM_ITM_GRP_R S0_ITMG1 = MAM_ITM_GRP_R.create("ITMG1");
		MAM_ITM_GRP_R S0_ITMG2 = MAM_ITM_GRP_R.create("ITMG2");
		MAM_ITM_GRP_R S0_ITMG3 = MAM_ITM_GRP_R.create("ITMG3");
		MAM_ITM_GRP_R S0_ITMG4 = MAM_ITM_GRP_R.create("ITMG4");
		MAM_ITM_GRP_R S0_ITMG5 = MAM_ITM_GRP_R.create("ITMG5");
		MAM_ITM_GRP_R S0_ITMG6 = MAM_ITM_GRP_R.create("ITMG6");
		MAM_ITM_GRP_R S0_ITMG7 = MAM_ITM_GRP_R.create("ITMG7");
		MAM_ITM_GRP_R S0_ITMG8 = MAM_ITM_GRP_R.create("ITMG8");
		MAM_ITM_GRP_R S0_ITMG9 = MAM_ITM_GRP_R.create("ITMG9");
		MAM_ITM_GRP_R S0_ITMG10 = MAM_ITM_GRP_R.create("ITMG10");
		MST_SHIP_SCHD_R S1_W1 = MST_SHIP_SCHD_R.create("W1");
		MST_XFR_ALLOC_STS_SV_R S2_X1 = MST_XFR_ALLOC_STS_SV_R.create("X1");
		MST_XFR_ALLOC_STS_R S3_X2 = MST_XFR_ALLOC_STS_R.create("X2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1000_MST_XFR_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.trd_ptn_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
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
						S0_M26.prov_upri_cng_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_M26.ver_flg,
						S0_T1.ver_no,
						S0_T1.trd_unit_cd,
						S0_T1.trd_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.base_unit_qty,
						S0_M26.cont_fctr_flg,
						S0_M26.cont_fctr_unit_cd,
						S0_M26.cont_fctr_dec_place,
						S0_M26.cont_fctr_rnd_typ,
						S0_T1.cont_qty,
						S0_M26.std_cont_fctr,
						S0_T1.gi_loc_cd,
						S0_T1.gi_str_ln_cd,
						S0_T1.gi_lg_grp_cd,
						S0_T1.gi_wg_cd,
						S0_T1.gr_loc_cd,
						S0_M9.loc_nm.as("gr_loc_nm"),
						S0_M9.str_ln_tgt_flg.as("gr_str_ln_tgt_flg"),
						S0_T1.gr_str_ln_cd,
						S0_T1.gr_lg_grp_cd,
						S0_T1.gr_wg_cd,
						S0_M9.site_cd.as("gr_site_cd"),
						S0_T1.quality_typ,
						S0_T1.gd_cd,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.gi_stk_arrv_bp_cd,
						S0_M9.sppl_cd.as("gr_sppl_cd"),
						trunc(
							S0_T1.gi_rqst_tm,
							MCDateFmt.DD
						).as("gi_rqst_dt"),
						S0_T1.gi_rqst_tm.as("gi_rqst_hm"),
						trunc(
							S0_T1.gr_rqst_tm,
							MCDateFmt.DD
						).as("gr_rqst_dt"),
						S0_T1.gr_rqst_tm.as("gr_rqst_hm"),
						cases()
							.when(S0_T1.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(
								nvl(
									S0_M37.iv_trd_flg,
									S0_M38.iv_trd_flg
								)
							).as("iv_trd_flg"),
						S0_T1.rcpt_dt,
						S0_T1.rqst_usr_cd,
						S0_T1.rqst_dpt_cd,
						S0_M19.dpt_nm.as("rqst_dpt_nm"),
						S0_T1.rqst_mod_flg,
						S0_T1.rqst_can_flg,
						S0_T1.ship_term_cd,
						S0_T1.ship_inst_typ,
						S0_T1.rsn_cd,
						S0_T1.bd_dpt_cd,
						S0_M21.dpt_nm.as("bd_dpt_nm"),
						S0_T1.ship_block_flg,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_id_typ,
							value(MSC_SHIP_TO_ID_TYP.LOC.value()),
							S0_M9.loc_nm,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							decode(
								S0_T1.ship_to_sundry_flg,
								value(false),
								S0_M39.bp_nm,
								S0_T1.ship_to_id_nm
							),
							nullValue()
						).as("ship_to_id_nm"),
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
						S0_T1.via_dlv_typ,
						S0_T1.prov_typ,
						S0_T1.prov_basis_typ,
						S0_T1.trd_cur_cd,
						S0_T1.trd_cur_upri,
						S0_T1.trd_cur_amt,
						S0_T1.tax_fix_flg,
						S0_T1.tax_cd,
						S0_T1.trd_cur_tax_amt,
						S0_T1.xrate_inpt_flg,
						S0_T1.xrate,
						S0_M35.cur_cd.as("base_cur_cd"),
						S0_M35.cur_nm.as("base_cur_nm"),
						S0_M35.amt_dec_place.as("base_cur_amt_dec_place"),
						S0_M36.cur_cd.as("ptax_cur_cd"),
						S0_M36.cur_nm.as("ptax_cur_nm"),
						S0_M36.amt_dec_place.as("ptax_cur_amt_dec_place"),
						S0_T1.ptax_xrate_inpt_flg,
						S0_T1.ptax_xrate,
						S0_T1.wtax_rate,
						S0_T1.wtax_amt,
						S0_T1.ret_prov_typ,
						S0_T1.ret_prov_basis_typ,
						S0_T1.ret_trd_cur_cd,
						S0_T1.ret_trd_cur_upri,
						S0_T1.ret_trd_cur_amt,
						S0_T1.ret_tax_fix_flg,
						S0_T1.ret_tax_cd,
						S0_T1.ret_trd_cur_tax_amt,
						S0_T1.ret_xrate_inpt_flg,
						S0_T1.ret_xrate,
						S0_T1.ret_ptax_xrate_inpt_flg,
						S0_T1.ret_ptax_xrate,
						S0_T1.ret_wtax_rate,
						S0_T1.ret_wtax_amt,
						S0_T1.base_dlv_slip_no,
						S0_T1.base_prov_act_no,
						S0_T1.base_ac_dt,
						S0_T1.rqst_cnt_rmrks,
						S0_T1.ship_cnt_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.xfr_src_typ,
						S0_T1.xfr_src_no,
						S0_T1.xfr_schd_no,
						S0_T1.itm_ord_no,
						S0_T1.mfg_inst_no,
						S0_T1.oper_inst_no,
						S0_T1.inpt_schd_no,
						S0_T1.slo_no,
						S0_T1.slo_d_no,
						S0_T1.io_schd_pr_no,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T1.vld_dt_fr,
						S0_T1.vld_dt_to,
						S0_M26.itm_typ,
						S0_M26.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T2.ship_pr_no,
						S0_M26.ship_term_cd.as("ship_term_cd_inv"),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.xfr_schd_no.eq(S0_T2.xfr_schd_no)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T1.gr_loc_cd.eq(S0_M9.loc_cd)
							)
						)
						.leftOuterJoin(S0_M19).on(
							bracket(
								S0_T1.rqst_dpt_cd.eq(S0_M19.dpt_cd)
								.and(S0_T1.rcpt_dt.between(S0_M19.st_dt, S0_M19.end_dt))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.bd_dpt_cd.eq(S0_M21.dpt_cd)
								.and(S0_T1.rcpt_dt.between(S0_M21.st_dt, S0_M21.end_dt))
							)
						)
						.leftOuterJoin(S0_M26).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M26.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M26.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M26.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M26.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M27).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M27.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M27.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M27.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M27.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M27.sno1))
								.and(S0_T1.sno2.eq(S0_M27.sno2))
								.and(S0_T1.sno3.eq(S0_M27.sno3))
								.and(S0_T1.sno4.eq(S0_M27.sno4))
							)
						)
						.leftOuterJoin(S0_M35).on(
							bracket(
								S0_M35.cur_cd.eq(MAPA_XCHNG$F_GET_BASE_CUR_CD())
							)
						)
						.leftOuterJoin(S0_M36).on(
							bracket(
								S0_M36.cur_cd.eq(MAPA_XCHNG$F_GET_PTAX_CUR_CD())
							)
						)
						.leftOuterJoin(S0_M37).on(
							bracket(
								S0_M37.fr_lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)
								.and(S0_M37.to_lg_grp_cd.eq(S0_T1.gr_lg_grp_cd))
								.and(S0_M37.ship_term_cd.eq(S0_T1.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M38).on(
							bracket(
								S0_M38.fr_lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)
								.and(S0_M38.to_lg_grp_cd.eq(S0_T1.gr_lg_grp_cd))
								.and(S0_M38.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M39).on(
							bracket(
								S0_T1.ship_to_id_cd.eq(S0_M39.bp_cd)
							)
						)
						.leftOuterJoin(S0_DACGI).on(
							bracket(
								S0_DACGI.lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_DACGR).on(
							bracket(
								S0_DACGR.loc_cd.eq(S0_T1.gr_loc_cd)
							)
						)
						.leftOuterJoin(S0_M40).on(
							bracket(
								S0_M40.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M40.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M40.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M40.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M40.lg_grp_cd.eq(S0_T1.gi_lg_grp_cd))
							)
						)
						.leftOuterJoin(S0_M41).on(
							bracket(
								S0_M41.lg_grp_cd.eq(S0_T1.gi_lg_grp_cd)
								.and(S0_M41.lg_def_flg.eq(value(true)))
								.and(S0_M41.del_flg.eq(value(false)))
							)
						)
						.leftOuterJoin(S0_DACGILOC).on(
							bracket(
								S0_DACGILOC.loc_cd.eq(coalesce(
										S0_T1.gi_loc_cd,
										S0_M40.lg_def_loc_cd,
										S0_M41.loc_cd
									)
								)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							S0_DACGI.lg_grp_cd.isNotNull()
							.or(S0_DACGR.loc_cd.isNotNull())
							.or(S0_DACGILOC.loc_cd.isNotNull())
						)
						.cutoff$and(S0_T1.rqst_mod_flg.eq(bind("rqst_mod_flg_str")))
						.cutoff$and(S0_T1.rqst_can_flg.eq(bind("rqst_can_flg_str")))
						.cutoff$and(S0_T1.gi_rqst_tm.gte(bind("gi_rqst_hm_fr")))
						.cutoff$and(S0_T1.gi_rqst_tm.lte(bind("gi_rqst_hm_to")))
						.cutoff$and(S0_T1.gr_rqst_tm.gte(bind("gr_rqst_hm_fr")))
						.cutoff$and(S0_T1.gr_rqst_tm.lte(bind("gr_rqst_hm_to")))
						.cutoff$and(S0_T1.rcpt_dt.gte(bind("rcpt_dt_fr")))
						.cutoff$and(S0_T1.rcpt_dt.lte(bind("rcpt_dt_to")))
						.cutoff$and(S0_T1.gi_loc_cd.like(bind("gi_loc_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.gi_str_ln_cd.like(bind("gi_str_ln_cd")))
						.cutoff$and(S0_T1.gi_stk_arrv_bp_cd.like(bind("gi_stk_arrv_bp_cd")))
						.cutoff$and(S0_T1.gi_wg_cd.like(bind("gi_wg_cd")))
						.cutoff$and(S0_T1.gi_lg_grp_cd.like(bind("gi_lg_grp_cd")))
						.cutoff$and(S0_T1.gr_loc_cd.like(bind("gr_loc_cd")))
						.cutoff$and(S0_M9.loc_nm.like(bind("gr_loc_nm")))
						.cutoff$and(S0_T1.gr_str_ln_cd.like(bind("gr_str_ln_cd")))
						.cutoff$and(S0_M9.site_cd.like(bind("gr_site_cd")))
						.cutoff$and(S0_T1.gr_wg_cd.like(bind("gr_wg_cd")))
						.cutoff$and(S0_T1.gr_lg_grp_cd.like(bind("gr_lg_grp_cd")))
						.cutoff$and(S0_M26.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M26.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M27.itm_nm,
								S0_M26.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.trd_unit_cd.like(bind("trd_unit_cd")))
						.cutoff$and(S0_T1.base_unit_cd.like(bind("base_unit_cd")))
						.cutoff$and(S0_T1.gd_cd.like(bind("gd_cd")))
						.cutoff$and(S0_T1.quality_typ.like(bind("quality_typ")))
						.cutoff$and(S0_T1.stk_id_typ.like(bind("stk_id_typ")))
						.cutoff$and(S0_T1.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0_T1.rqst_usr_cd.like(bind("rqst_usr_cd")))
						.cutoff$and(S0_T1.rqst_dpt_cd.like(bind("rqst_dpt_cd")))
						.cutoff$and(S0_M19.dpt_nm.like(bind("rqst_dpt_nm")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_inst_typ.like(bind("ship_inst_typ")))
						.cutoff$and(S0_T1.rsn_cd.like(bind("rsn_cd")))
						.cutoff$and(S0_T1.bd_dpt_cd.like(bind("bd_dpt_cd")))
						.cutoff$and(S0_M21.dpt_nm.like(bind("bd_dpt_nm")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(S0_T1.ship_to_zip_cd.like(bind("ship_to_zip_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.LOC.value()),
								S0_M9.loc_nm,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								decode(
									S0_T1.ship_to_sundry_flg,
									value(false),
									S0_M39.bp_nm,
									S0_T1.ship_to_id_nm
								),
								nullValue()
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T1.ship_to_addr1.like(bind("ship_to_addr1")))
						.cutoff$and(S0_T1.ship_to_addr2.like(bind("ship_to_addr2")))
						.cutoff$and(S0_T1.ship_to_addr3.like(bind("ship_to_addr3")))
						.cutoff$and(S0_T1.ship_to_addr4.like(bind("ship_to_addr4")))
						.cutoff$and(S0_T1.ship_to_cntct_dpt.like(bind("ship_to_cntct_dpt")))
						.cutoff$and(S0_T1.ship_to_cntct_psn.like(bind("ship_to_cntct_psn")))
						.cutoff$and(S0_T1.ship_to_tel.like(bind("ship_to_tel")))
						.cutoff$and(S0_T1.ship_to_fax.like(bind("ship_to_fax")))
						.cutoff$and(S0_T1.prov_typ.like(bind("prov_typ")))
						.cutoff$and(S0_T1.prov_basis_typ.like(bind("prov_basis_typ")))
						.cutoff$and(S0_T1.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(
							S0_M36.cur_cd.like(bind("ptax_cur_cd"))
							.and(
								S0_T1.prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GI.value()))
								.or(S0_T1.prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GR.value())))
								.or(S0_T1.ret_prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GI.value())))
								.or(S0_T1.ret_prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GR.value())))
							)
						)
						.cutoff$and(
							S0_M36.cur_nm.like(bind("ptax_cur_nm"))
							.and(
								S0_T1.prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GI.value()))
								.or(S0_T1.prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GR.value())))
								.or(S0_T1.ret_prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GI.value())))
								.or(S0_T1.ret_prov_basis_typ.eq(value(MAC_PROV_BASIS_TYP.GR.value())))
							)
						)
						.cutoff$and(S0_T1.ret_prov_typ.like(bind("ret_prov_typ")))
						.cutoff$and(S0_T1.ret_prov_basis_typ.like(bind("ret_prov_basis_typ")))
						.cutoff$and(S0_T1.ret_trd_cur_cd.like(bind("ret_trd_cur_cd")))
						.cutoff$and(S0_T1.ret_tax_cd.like(bind("ret_tax_cd")))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.rqst_cnt_rmrks.like(bind("rqst_cnt_rmrks")))
						.cutoff$and(S0_T1.ship_cnt_rmrks.like(bind("ship_cnt_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.xfr_src_typ.like(bind("xfr_src_typ")))
						.cutoff$and(S0_T1.xfr_src_no.like(bind("xfr_src_no")))
						.cutoff$and(S0_T1.xfr_schd_no.like(bind("xfr_schd_no")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.mfg_inst_no.like(bind("mfg_inst_no")))
						.cutoff$and(S0_T1.oper_inst_no.like(bind("oper_inst_no")))
						.cutoff$and(S0_T1.inpt_schd_no.like(bind("inpt_schd_no")))
						.cutoff$and(S0_T1.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T1.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(
							bracket(
								bind("inst_exc_flg_str").eq(value(true))
								.and(
									bracket(
										S0_T2.ship_pr_no.isNotNull()
										.and(S0_T2.ship_inst_qty.eq(value(0)))
										.and(S0_T2.ship_act_qty.eq(value(0)))
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S1_W1)
												.where(
													S0_T2.ship_pr_no.eq(S1_W1.ship_pr_no)
													.and(S1_W1.abort_flg.eq(value(true)))
												)
											)
										)
									)
									.or(
										S0_T1.gi_lg_grp_cd.eq(S0_T1.gr_lg_grp_cd)
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S2_X1)
												.where(
													S0_T1.xfr_schd_no.eq(S2_X1.xfr_schd_no)
												)
											)
										)
										.and(
											notExists(
												subQuery()
												.select(value("X"))
												.from(S3_X2)
												.where(
													S0_T1.xfr_schd_no.eq(S3_X2.xfr_schd_no)
													.and(
														S3_X2.pr_sts_typ.neq(value(MSC_PR_STS_TYP.NOT_INST.value()))
														.or(S3_X2.abort_flg.eq(value(true)))
													)
												)
											)
										)
									)
								)
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.xfr_schd_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.trd_cd.eq(S0_M1.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("gi_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.gi_lg_grp_cd.eq(S0_M2.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.lg_grp_nm.like(bind("gi_lg_grp_nm")))),
				when(boundOr("gi_site_nm", "gi_loc_nm", "gi_site_cd"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.gi_loc_cd.eq(S0_M3.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("gi_loc_nm"))).cutoff$and(S0_M3.site_cd.like(bind("gi_site_cd")))),
				when(boundOr("gi_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.gi_loc_cd.eq(S0_M4.loc_cd).and(S0_T1.gi_str_ln_cd.eq(S0_M4.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M4.str_ln_nm.like(bind("gi_str_ln_nm")))),
				when(boundOr("gi_stk_arrv_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.gi_stk_arrv_bp_cd.eq(S0_M5.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.bp_nm.like(bind("gi_stk_arrv_bp_nm")))),
				when(boundOr("gi_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.gi_wg_cd.eq(S0_M6.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.wg_nm.like(bind("gi_wg_nm")))),
				when(boundOr("gi_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M3.site_cd.eq(S0_M7.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.site_nm.like(bind("gi_site_nm")))),
				when(boundOr("gr_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.gr_lg_grp_cd.eq(S0_M8.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.lg_grp_nm.like(bind("gr_lg_grp_nm")))),
				when(boundOr("gr_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_T1.gr_loc_cd.eq(S0_M10.loc_cd).and(S0_T1.gr_str_ln_cd.eq(S0_M10.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M10.str_ln_nm.like(bind("gr_str_ln_nm")))),
				when(boundOr("gr_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.gr_wg_cd.eq(S0_M12.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.wg_nm.like(bind("gr_wg_nm")))),
				when(boundOr("gr_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_M9.site_cd.eq(S0_M13.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.site_nm.like(bind("gr_site_nm")))),
				when(boundOr("trd_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T1.trd_unit_cd.eq(S0_M14.unit_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.unit_nm.like(bind("trd_unit_nm")))),
				when(boundOr("wrk_no", "wkk_nm"))
					.view(v -> v.leftOuterJoin(S0_T4).on(bracket(S0_T1.sno1.eq(S0_T4.sno1))))
					.predicate(p -> p.cutoff$and(S0_T4.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T4.wrk_nm.like(bind("wkk_nm")))),
				when(boundOr("base_unit_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_T1.base_unit_cd.eq(S0_M15.unit_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.unit_nm.like(bind("base_unit_nm")))),
				when(boundOr("gd_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T1.gd_cd.eq(S0_M16.gd_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.gd_nm.like(bind("gd_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.stk_bp_cd.eq(S0_M17.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("rqst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_T1.rqst_usr_cd.eq(S0_M18.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.usr_nm.like(bind("rqst_usr_nm")))),
				when(boundOr("rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T1.rsn_cd.eq(S0_M20.biz_rsn_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.biz_rsn_nm.like(bind("rsn_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T1.trd_cur_cd.eq(S0_M22.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("tax_nm", "tax_typ"))
					.view(v -> v.leftOuterJoin(S0_M23).on(bracket(S0_T1.tax_cd.eq(S0_M23.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M23.tax_nm.like(bind("tax_nm"))).cutoff$and(S0_M23.tax_typ.like(bind("tax_typ")))),
				when(boundOr("ret_trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(S0_T1.ret_trd_cur_cd.eq(S0_M24.cur_cd))))
					.predicate(p -> p.cutoff$and(S0_M24.cur_nm.like(bind("ret_trd_cur_nm")))),
				when(boundOr("ret_tax_nm", "ret_tax_typ"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T1.ret_tax_cd.eq(S0_M25.tax_cd))))
					.predicate(p -> p.cutoff$and(S0_M25.tax_nm.like(bind("ret_tax_nm"))).cutoff$and(S0_M25.tax_typ.like(bind("ret_tax_typ")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M28).on(bracket(S0_M26.itm_typ.eq(S0_M28.itm_typ).and(S0_M26.itm_typ_d_cd.eq(S0_M28.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M28.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M32).on(bracket(S0_T1.ship_term_cd.eq(S0_M32.ship_term_cd))))
					.predicate(p -> p.cutoff$and(S0_M32.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd1.as("itm_grp_cd1"), S0_ITMG1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG1).on(S0_M26.itm_grp_cd1.eq(S0_ITMG1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITMG1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITMG1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd2.as("itm_grp_cd2"), S0_ITMG2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG2).on(S0_M26.itm_grp_cd2.eq(S0_ITMG2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITMG2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITMG2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd3.as("itm_grp_cd3"), S0_ITMG3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG3).on(S0_M26.itm_grp_cd3.eq(S0_ITMG3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITMG3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITMG3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd4.as("itm_grp_cd4"), S0_ITMG4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG4).on(S0_M26.itm_grp_cd4.eq(S0_ITMG4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITMG4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITMG4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd5.as("itm_grp_cd5"), S0_ITMG5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG5).on(S0_M26.itm_grp_cd5.eq(S0_ITMG5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITMG5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITMG5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd6.as("itm_grp_cd6"), S0_ITMG6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG6).on(S0_M26.itm_grp_cd6.eq(S0_ITMG6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITMG6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITMG6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd7.as("itm_grp_cd7"), S0_ITMG7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG7).on(S0_M26.itm_grp_cd7.eq(S0_ITMG7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITMG7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITMG7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd8.as("itm_grp_cd8"), S0_ITMG8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG8).on(S0_M26.itm_grp_cd8.eq(S0_ITMG8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITMG8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITMG8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd9.as("itm_grp_cd9"), S0_ITMG9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG9).on(S0_M26.itm_grp_cd9.eq(S0_ITMG9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITMG9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITMG9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M26.itm_grp_cd10.as("itm_grp_cd10"), S0_ITMG10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITMG10).on(S0_M26.itm_grp_cd10.eq(S0_ITMG10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITMG10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M26.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITMG10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gi_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_lg_grp_nm", m.lg_grp_nm());
					}),
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
							r.setBooleanNE("gi_str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("gi_site_cd", m.site_cd());
							r.setStringNE("gi_sppl_cd", m.sppl_cd());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("gi_stk_arrv_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_stk_arrv_bp_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gi_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gi_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("gr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_lg_grp_nm", m.lg_grp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("gr_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_wg_nm", m.wg_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("gr_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_site_nm", m.site_nm());
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
						.add(MAVM_BP_NM_R.class, r -> toCondition(
							r.getStringNE("stk_bp_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_bp_nm", m.bp_nm());
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
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("tax_nm", m.tax_nm());
							r.setNumberNE("tax_rate", m.tax_rate());
							r.setStringNE("tax_typ", m.tax_typ());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("ret_trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_trd_cur_nm", m.cur_nm());
							r.setNumberNE("ret_trd_cur_amt_dec_place", m.amt_dec_place());
							r.setNumberNE("ret_trd_cur_upri_dec_place", m.upri_dec_place());
					}),
					j -> j
						.add(MAM_TAX_R.class, r -> toCondition(
							r.getStringNE("ret_tax_cd")
						))
						.addSelect(m -> toArray(
							m.tax_nm,
							m.tax_rate,
							m.tax_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("ret_tax_nm", m.tax_nm());
							r.setNumberNE("ret_tax_rate", m.tax_rate());
							r.setStringNE("ret_tax_typ", m.tax_typ());
					}),
					j -> j
						.add(MAM_ITM_TYP_D_R.class, r -> toCondition(
							r.getStringNE("itm_typ"),
							r.getStringNE("itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_typ_d_nm", m.itm_typ_d_nm());
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
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_conv_base_qty", m.conv_base_qty());
							r.setNumberNE("trd_unit_conv_qty", m.conv_qty());
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
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("cont_fctr_unit_nm", m.unit_nm());
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
						.add(MST_LOT_R.class, r -> toCondition(
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gi_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_amt_rnd_typ,
							m.prov_tax_rnd_typ,
							m.prov_upri_cng_flg,
							m.subcon_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gi_cur_cd", m.cur_cd());
							r.setBooleanNE("gi_subcon_flg", m.subcon_flg());
							r.setBooleanNE("gi_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setBooleanNE("gi_prov_upri_cng_flg", m.prov_upri_cng_flg());
							r.setStringNE("gi_prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("gi_prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("gr_sppl_cd")
						))
						.addSelect(m -> toArray(
							m.cur_cd,
							m.onr_prsppl_flg,
							m.prov_amt_rnd_typ,
							m.prov_basis_typ,
							m.prov_rcv_typ,
							m.prov_tax_rnd_typ,
							m.prov_upri_cng_flg,
							m.subcon_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("gr_cur_cd", m.cur_cd());
							r.setBooleanNE("gr_subcon_flg", m.subcon_flg());
							r.setBooleanNE("gr_onr_prsppl_flg", m.onr_prsppl_flg());
							r.setStringNE("gr_prov_rcv_typ", m.prov_rcv_typ());
							r.setStringNE("gr_prov_basis_typ", m.prov_basis_typ());
							r.setBooleanNE("gr_prov_upri_cng_flg", m.prov_upri_cng_flg());
							r.setStringNE("gr_prov_amt_rnd_typ", m.prov_amt_rnd_typ());
							r.setStringNE("gr_prov_tax_rnd_typ", m.prov_tax_rnd_typ());
					})
				)
			);
	}
}