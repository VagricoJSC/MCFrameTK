package mcframe.serverMSBE.MSBEL1410;

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
	 * -- MSBEL1410_MST_SHIP_ALLOC_STS_Query_S01
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_ALLOC_STS_S01() {
		MST_SHIP_ALLOC_STS_R S0_T7 = MST_SHIP_ALLOC_STS_R.create("T7");
		MST_SHIP_INST_D_R S0_T2 = MST_SHIP_INST_D_R.create("T2");
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MCTempView S0_T3 = createTempView("T3");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MST_SLO_D_R S0_T5 = MST_SLO_D_R.create("T5");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		MST_DLV_INST_RCPT_R S0_T12 = MST_DLV_INST_RCPT_R.create("T12");
		MCTempView S0_T15 = createTempView("T15");
		MAM_LG_GRP_R S0_M1 = MAM_LG_GRP_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_SHIP_TERM_R S0_M3 = MAM_SHIP_TERM_R.create("M3");
		MAM_TRD_R S0_M4 = MAM_TRD_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAVM_ITM_UNIT_R S0_M9 = MAVM_ITM_UNIT_R.create("M9");
		MAM_ITM_R S0_M11 = MAM_ITM_R.create("M11");
		MAM_LOC_R S0_M12 = MAM_LOC_R.create("M12");
		MAM_STR_LN_R S0_M13 = MAM_STR_LN_R.create("M13");
		MAM_DPT_R S0_M16 = MAM_DPT_R.create("M16");
		MAM_USR_R S0_M17 = MAM_USR_R.create("M17");
		MAM_SUNDRY_ITM_R S0_M22 = MAM_SUNDRY_ITM_R.create("M22");
		MAM_ITM_TYP_D_R S0_M18 = MAM_ITM_TYP_D_R.create("M18");
		MAM_SITE_R S0_M19 = MAM_SITE_R.create("M19");
		MAM_WG_R S0_M20 = MAM_WG_R.create("M20");
		MAM_ALLOC_GRP_R S0_M21 = MAM_ALLOC_GRP_R.create("M21");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_BP_R S0_M24 = MAM_BP_R.create("M24");
		MSVM_SHIP_TO_ID_R S0_M26 = MSVM_SHIP_TO_ID_R.create("M26");
		MSVM_DLV_ID_R S0_M27 = MSVM_DLV_ID_R.create("M27");
		MAM_ITM_LCL_R S0_M28 = MAM_ITM_LCL_R.create("M28");
		MCTempView S0_M29 = createTempView("M29");
		MAVM_RD_LG_GRP_R S0_M99 = MAVM_RD_LG_GRP_R.create("M99");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MAM_ITM_GRP_R S0_MM41 = MAM_ITM_GRP_R.create("MM41");
		MAM_ITM_GRP_R S0_MM42 = MAM_ITM_GRP_R.create("MM42");
		MAM_ITM_GRP_R S0_MM43 = MAM_ITM_GRP_R.create("MM43");
		MAM_ITM_GRP_R S0_MM44 = MAM_ITM_GRP_R.create("MM44");
		MAM_ITM_GRP_R S0_MM45 = MAM_ITM_GRP_R.create("MM45");
		MAM_ITM_GRP_R S0_MM46 = MAM_ITM_GRP_R.create("MM46");
		MAM_ITM_GRP_R S0_MM47 = MAM_ITM_GRP_R.create("MM47");
		MAM_ITM_GRP_R S0_MM48 = MAM_ITM_GRP_R.create("MM48");
		MAM_ITM_GRP_R S0_MM49 = MAM_ITM_GRP_R.create("MM49");
		MAM_ITM_GRP_R S0_MM410 = MAM_ITM_GRP_R.create("MM410");
		MST_SHIP_SCHD_R S1 = MST_SHIP_SCHD_R.create();
		MST_SHIP_ACT_D_R S2 = MST_SHIP_ACT_D_R.create();
		MAM_LG_CTL_R S3 = MAM_LG_CTL_R.create();
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SHIP_TO_GRP = createDynamicSQLID("DS0C_SHIP_TO_GRP");
		
		MCSubQuery S0_M9_dec_place = subQuery().select(S0_M9.dec_place).from(S0_M9).where(
				bracket(
						S0_M9.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M9.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M9.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M9.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M9.unit_cd.eq(S0_T7.ent_unit_cd))
					));
		
		MCSubQuery S0_M9_rnd_typ = subQuery().select(S0_M9.rnd_typ).from(S0_M9).where(
				bracket(
						S0_M9.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M9.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M9.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M9.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M9.unit_cd.eq(S0_T7.ent_unit_cd))
					));
		
		MCSubQuery S0_M9_unit_wt = subQuery().select(S0_M9.unit_wt).from(S0_M9).where(
				bracket(
						S0_M9.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M9.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M9.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M9.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M9.unit_cd.eq(S0_T7.ent_unit_cd))
					));
		
		MCSubQuery S0_M9_unit_dim = subQuery().select(S0_M9.unit_dim).from(S0_M9).where(
				bracket(
						S0_M9.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M9.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M9.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M9.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M9.unit_cd.eq(S0_T7.ent_unit_cd))
					));
		
		MCSubQuery S0_M26_ship_to_id_nm = subQuery().select(S0_M26.ship_to_id_nm).from(S0_M26).where(
				bracket(
						S0_M26.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
						.and(S0_M26.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
					));
		
		MCSubQuery S0_M27_dlv_id_nm = subQuery().select(S0_M27.dlv_id_nm).from(S0_M27).where(
				bracket(
						S0_T4.dlv_id_typ.eq(S0_M27.dlv_id_typ)
						.and(nvl(S0_T3.pr("dlv_cd"), S0_T4.dlv_id_cd).eq(S0_M27.dlv_id_cd))
					));

		MCSubQuery S0_M28_itm_nm = subQuery().select(S0_M28.itm_nm)
				.from(S0_M28
				.innerJoin(S0_M27).on(
						bracket(
								S0_T4.dlv_id_typ.eq(S0_M27.dlv_id_typ)
							)
						))
				.where(
						bracket(
						S0_M28.itm_cd.eq(S0_T2.itm_cd)
						.and(S0_M28.itm_sub1.eq(S0_T2.itm_sub1))
						.and(S0_M28.itm_sub2.eq(S0_T2.itm_sub2))
						.and(S0_M28.itm_sub3.eq(S0_T2.itm_sub3))
						.and(S0_M28.lcl_cd.eq(S0_M27.prnt_lcl_cd))
						.and(S0_M27.dlv_id_cd.eq(nvl(S0_T3.pr("dlv_cd"), S0_T4.dlv_id_cd)))
							)
						);
		
		MCSubQuery S0_M29_iv_trd_flg = subQuery().select(S0_M29.pr("iv_trd_flg")).from(subQuery()
				.select(max(S3.iv_trd_flg)
						.as("iv_trd_flg"),
						S3.fr_lg_grp_cd,
						S3.to_lg_grp_cd)
				.from(S3)
				.groupBy(S3.fr_lg_grp_cd,
						S3.to_lg_grp_cd)
				.view(S0_M29)
				.innerJoin(S0_M27).on(bracket(
						S0_M27.lg_grp_cd.eq(S0_M29.pr(S3.to_lg_grp_cd)))))
				.where(value(0).eq(value(0)).and(
						S0_T1.ship_fr_lg_grp_cd.eq(S0_M29.pr(S3.fr_lg_grp_cd)))
						.and(S0_M27.dlv_id_typ.eq(S0_T4.dlv_id_typ))
						.and(S0_M27.dlv_id_cd.eq(nvl(S0_T3.pr("dlv_cd"),S0_T4.dlv_id_cd))));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_ALLOC_STS_Query_S01")
					.mainQuery()
					.select(
						decode(
							S0_T3.pr("min_pr_sts_typ"),
							S0_T3.pr("max_pr_sts_typ"),
							S0_T3.pr("min_pr_sts_typ"),
							value(MSC_PR_STS_TYP.PART_SHIP.value())
						).as("pr_sts_typ"),
						S0_T3.pr("ship_abl_flg"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T12.dlv_rqst_tm,
							MCDateFmt.DD
						).as("dlv_rqst_dt"),
						S0_T12.dlv_rqst_tm.as("dlv_rqst_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						trunc(
							S0_T1.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.ship_inst_tm.as("ship_inst_hm"),
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.wg_cd,
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M26_ship_to_id_nm
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
						S0_T4.dlv_id_typ,
						nvl(
							S0_T3.pr("dlv_cd"),
							S0_T4.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T3.pr("dlv_cd"),
							decode(
								S0_T3.pr("dlv_sundry_flg"),
								value(true),
								S0_T3.pr("dlv_nm"),
								S0_M27_dlv_id_nm
							),
							decode(
								S0_T4.dlv_sundry_flg,
								value(true),
								S0_T4.dlv_id_nm,
								S0_M27_dlv_id_nm
							)
						).as("dlv_id_nm"),
						S0_T1.ship_wk_cd,
						S0_T1.ship_term_cd,
						S0_T2.trd_cd,
						S0_T4.cst_cd,
						S0_T4.rqst_dpt_cd,
						S0_M6.dpt_nm.as("rqst_dpt_nm"),
						S0_T4.rqst_usr_cd,
						trunc(
							S0_T3.pr("pd_inst_dlv_tm"),
							MCDateFmt.DD
						).as("pd_inst_dlv_dt"),
						S0_T3.pr("pd_inst_dlv_tm").as("pd_inst_dlv_hm"),
						trunc(
							S0_T3.pr("ship_rqst_tm"),
							MCDateFmt.DD
						).as("ship_rqst_dt"),
						S0_T3.pr("ship_rqst_tm").as("ship_rqst_hm"),
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						decode(
								S0_T2.sundry_itm_flg,
							value(true),
							nvl(
								S0_T2.itm_nm,
								S0_M22.itm_nm
							),
							S0_M11.itm_nm
						).as("itm_nm"),
						decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.iv_itm_nm,
									S0_M22.itm_nm
								),
								nvl(
									S0_M28_itm_nm,
									S0_M11.itm_nm
								)
							).as("iv_itm_nm"),
						S0_T7.sno1,
						S0_T7.sno2,
						S0_T7.sno3,
						S0_T7.sno4,
						S0_T2.abort_flg,
						S0_T7.ent_unit_cd.as("trd_unit_cd"),
						S0_M9_dec_place.as("trd_unit_dec_place"),
						S0_M9_rnd_typ.as("trd_unit_rnd_typ"),
						S0_T7.ent_unit_qty.as("trd_unit_qty"),
						S0_T7.base_unit_cd,
						S0_M11.dec_place.as("base_unit_dec_place"),
						S0_M11.rnd_typ.as("base_unit_rnd_typ"),
						S0_T7.base_unit_qty,
						S0_M11.cont_fctr_unit_cd,
						S0_M11.std_cont_fctr,
						S0_M11.cont_fctr_flg,
						S0_M11.cont_fctr_dec_place,
						S0_M11.cont_fctr_rnd_typ,
						S0_T7.alloc_flg,
						S0_T7.alloc_scope_typ,
						S0_T4.alloc_typ,
						S0_T7.ship_loc_cd,
						S0_T7.ship_str_ln_cd,
						S0_T7.lot_no,
						S0_T7.sublot_no,
						S0_T7.gd_cd,
						S0_T7.quality_typ,
						S0_T7.stk_insp_typ,
						S0_T7.stk_id_typ,
						S0_T7.stk_bp_cd,
						S0_T7.ship_act_qty,
						nvl(
							S0_M9_unit_wt,
							value(0)
						).multiply(S0_T7.ent_unit_qty).as("ship_wt"),
						nvl(
							S0_M9_unit_dim,
							value(0)
						).multiply(S0_T7.ent_unit_qty).as("ship_dim"),
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M16.dpt_nm.as("inst_dpt_nm"),
						S0_T7.wms_flg,
						S0_T2.base_dlv_slip_no,
						S0_T2.base_prov_act_no,
						S0_T2.base_ac_dt,
						S0_T2.ship_cnt_rmrks,
						S0_T2.trd_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T1.inst_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.inst_d_rmrks,
						S0_T2.intr_d_rmrks,
						S0_T2.sub_char1.as("d_sub_char1"),
						S0_T2.sub_char2.as("d_sub_char2"),
						S0_T2.sub_char3.as("d_sub_char3"),
						S0_T7.ship_schd_no,
						S0_T1.ship_inst_no,
						S0_T2.ship_inst_d_no,
						S0_T7.disp_seq,
						decode(
							S0_T3.pr("inst_bndl_flg"),
							value(true),
							nullValue(),
							S0_T4.xfr_schd_no
						).as("xfr_schd_no"),
						S0_T4.slo_d_no,
						S0_T1.iv_no,
						S0_T7.dlv_slip_no,
						S0_T7.dlv_slip_seq,
						S0_T10.dlv_slip_rev,
						decode(
							nvl(
								S0_T15.pr("cnt"),
								value(0)
							),
							value(0),
							value(false),
							value(1),
							value(false),
							value(true)
						).as("act_split_flg"),
						S0_T7.ship_alloc_sts_no,
						S0_T1.pick_prnt_flg.as("pick_prnted_flg"),
						S0_T1.ship_inst_prnt_flg.as("inst_prnted_flg"),
						nvl(
							S0_T10.slip_prnt_flg,
							value(false)
						).as("dlv_prnted_flg"),
						nvl(
							S0_T10.ship_adv_prnt_flg,
							value(false)
						).as("adv_prnted_flg"),
						S0_M11.itm_typ,
						S0_M11.itm_typ_d_cd,
						S0_T7.ins_usr_id,
						S0_T7.ins_usr_nm,
						S0_T7.ins_func_id,
						S0_T7.ins_ts,
						S0_T7.upd_usr_id,
						S0_T7.upd_usr_nm,
						S0_T7.upd_func_id,
						S0_T7.upd_ts,
						S0_T7.upd_srv_req_no,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(S0_M29_iv_trd_flg).as("iv_trd_flg"),
						addDynamicSelect(DS0C_SHIP_TO_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP),
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T7
						.innerJoin(S0_T2).on(
							bracket(
								S0_T7.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.innerJoin(S0_T1).on(
							bracket(
								S0_T2.ship_inst_no.eq(S0_T1.ship_inst_no)
							)
						)
						.innerJoin(
							subQuery()
							.select(
								min(S1.ship_abl_flg).as("ship_abl_flg"),
								min(S1.pd_inst_dlv_tm).as("pd_inst_dlv_tm"),
								min(S1.ship_rqst_tm).as("ship_rqst_tm"),
								max(S1.ship_schd_tm).as("ship_schd_tm"),
								max(S1.dlv_schd_tm).as("dlv_schd_tm"),
								min(S1.pr_sts_typ).as("min_pr_sts_typ"),
								max(S1.pr_sts_typ).as("max_pr_sts_typ"),
								max(S1.ship_pr_no).as("ship_pr_no"),
								max(S1.dlv_inst_rcpt_no).as("dlv_inst_rcpt_no"),
								S1.ship_inst_d_no
								,min(S1.inst_bndl_flg).as("inst_bndl_flg")
								,max(S1.dlv_cd).as("dlv_cd")
								,max(S1.dlv_sundry_flg).as("dlv_sundry_flg")
								,max(S1.dlv_nm).as("dlv_nm")
							)
							.from(S1)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S1.ship_schd_no.like(bind("ship_schd_no")))
							)
							.groupBy(S1.ship_inst_d_no).view(S0_T3)
						).on(
							bracket(
								S0_T2.ship_inst_d_no.eq(S0_T3.pr(S1.ship_inst_d_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T3.pr("ship_pr_no").eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T7.dlv_slip_no.eq(S0_T10.dlv_slip_no)
								.and(S0_T7.dlv_slip_seq.eq(S0_T10.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T12).on(
							bracket(
								S0_T3.pr("dlv_inst_rcpt_no").eq(S0_T12.dlv_inst_rcpt_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								countAll().as("cnt"),
								S2.ship_alloc_sts_no
							)
							.from(S2)
							.where(
								S2.can_flg.eq(value(false))
							)
							.groupBy(S2.ship_alloc_sts_no).view(S0_T15)
						).on(
							bracket(
								S0_T7.ship_alloc_sts_no.eq(S0_T15.pr(S2.ship_alloc_sts_no))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T4.rqst_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_M6.st_dt.lte(S0_T1.ship_inst_tm))
								.and(S0_M6.end_dt.gt(S0_T1.ship_inst_tm))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M11.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M16).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M16.dpt_cd)
								.and(S0_M16.st_dt.lte(S0_T1.ship_inst_tm))
								.and(S0_M16.end_dt.gt(S0_T1.ship_inst_tm))
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M22.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M22.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M22.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M22.itm_sub3))
								.and(S0_T7.sno1.eq(S0_M22.sno1))
								.and(S0_T7.sno2.eq(S0_M22.sno2))
								.and(S0_T7.sno3.eq(S0_M22.sno3))
								.and(S0_T7.sno4.eq(S0_M22.sno4))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.ship_fr_lg_grp_cd.eq(S0_M99.lg_grp_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SHIP_TO_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(
								decode(
									S0_T3.pr("min_pr_sts_typ"),
									S0_T3.pr("max_pr_sts_typ"),
									S0_T3.pr("min_pr_sts_typ"),
									value(MSC_PR_STS_TYP.PART_SHIP.value())
								).eq(bind("tmp_sts_not_inst"))
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_inst").isNotNull()
									.and(S0_T3.pr("max_pr_sts_typ").eq(value(MSC_PR_STS_TYP.INST.value())))
								)
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_part_ship").isNotNull()
									.and(
										S0_T3.pr("min_pr_sts_typ").neq(S0_T3.pr("max_pr_sts_typ"))
										.or(S0_T3.pr("max_pr_sts_typ").eq(value(MSC_PR_STS_TYP.PART_SHIP.value())))
									)
								)
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_ship").isNotNull()
									.and(S0_T3.pr("min_pr_sts_typ").eq(value(MSC_PR_STS_TYP.SHIP.value())))
								)
							)
						)
						.cutoff$and(
							bracket(
								bracket(
									bind("not_alloc_flg_str").eq(value(true))
									.and(
										S0_T4.alloc_typ.in(
											value(MAC_ALLOC_TYP.IMMED.value()),
											value(MAC_ALLOC_TYP.LATER.value())
										)
										.or(S0_T4.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value())))
										.and(S0_T4.xfr_schd_no.isNotNull())
									)
									.and(S0_T7.alloc_flg.eq(value(false)))
								)
								.or(
									bind("all_alloc_flg_str").eq(value(true))
									.and(S0_T7.alloc_flg.eq(value(true)))
								)
								.or(
									bind("alloc_invalid_flg_str").eq(value(true))
									.and(
										S0_T4.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
										.and(S0_T4.xfr_schd_no.isNull())
										.or(S0_T4.alloc_typ.isNull())
									)
									.and(S0_T7.alloc_flg.eq(value(false)))
								)
							)
						)
						.cutoff$and(
							MAPA_DT$F_IS_BEFORE_AFTER(
								S0_T1.ship_schd_tm,
								S0_T3.pr("ship_rqst_tm")
							).eq(value(false))
							.and(bind("tmp_late_ship").eq(value(true)))
						)
						.cutoff$and(
							MAPA_DT$F_IS_BEFORE_AFTER(
								S0_T1.dlv_schd_tm,
								S0_T3.pr("pd_inst_dlv_tm")
							).eq(value(false))
							.and(bind("tmp_late_rqst").eq(value(true)))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.pick_prnt_flg.eq(bind("tmp_pick_prnted")))
							.cutoff$or(S0_T1.pick_prnt_flg.neq(bind("tmp_pick_not_prnted")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.ship_inst_prnt_flg.eq(bind("tmp_inst_prnted")))
							.cutoff$or(S0_T1.ship_inst_prnt_flg.neq(bind("tmp_inst_not_prnted")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T10.slip_prnt_flg.eq(bind("tmp_dlv_prnted")))
							.cutoff$or(
								S0_T10.slip_prnt_flg.neq(bind("tmp_dlv_not_prnted"))
								.or(S0_T10.slip_prnt_flg.isNull())
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T10.ship_adv_prnt_flg.eq(bind("tmp_adv_prnted")))
							.cutoff$or(
								S0_T10.ship_adv_prnt_flg.neq(bind("tmp_adv_not_prnted"))
								.or(S0_T10.ship_adv_prnt_flg.isNull())
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T7.wms_flg.eq(bind("tmp_wms_flg")))
							.cutoff$or(S0_T7.wms_flg.neq(bind("tmp_not_wms_flg")))
						)
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T1.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T7.ship_loc_cd.like(bind("ship_loc_cd")))
						.cutoff$and(S0_T7.ship_str_ln_cd.like(bind("ship_str_ln_cd")))
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(true),
								S0_T1.ship_to_id_nm,
								S0_M26_ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T4.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(
							nvl(
								S0_T3.pr("dlv_cd"),
								S0_T4.dlv_id_cd
							).like(bind("dlv_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T3.pr("dlv_cd"),
								decode(
									S0_T3.pr("dlv_sundry_flg"),
									value(true),
									S0_T3.pr("dlv_nm"),
									S0_M27_dlv_id_nm
								),
								decode(
									S0_T4.dlv_sundry_flg,
									value(true),
									S0_T4.dlv_id_nm,
									S0_M27_dlv_id_nm
								)
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(S0_T4.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_M11.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M11.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							decode(
									S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.itm_nm,
									S0_M22.itm_nm
								),
								S0_M11.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(
							decode(
								S0_T2.sundry_itm_flg,
								value(true),
								nvl(
									S0_T2.iv_itm_nm,
									S0_M22.itm_nm
								),
								nvl(
									S0_M28_itm_nm,
									S0_M11.itm_nm
								)
							).like(bind("iv_itm_nm"))
						)
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M16.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T7.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(
							decode(
								S0_T3.pr("inst_bndl_flg"),
								value(true),
								nullValue(),
								S0_T4.xfr_schd_no
							).like(bind("xfr_schd_no"))
						)
						.cutoff$and(S0_T4.slo_d_no.like(bind("slo_d_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("d_sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("d_sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("d_sub_char3")))
						.addDynamicPredicate(DS0C_SHIP_TO_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.ship_inst_no.asc(),
						S0_T2.ship_inst_d_no.asc(),
						S0_T7.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("slo_no", "cst_itm_cd", "cst_itm_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T4.slo_d_no.eq(S0_T5.slo_d_no))))
					.predicate(p -> p.cutoff$and(S0_T5.slo_no.like(bind("slo_no"))).cutoff$and(S0_T5.cst_itm_cd.like(bind("cst_itm_cd"))).cutoff$and(S0_T5.cst_itm_nm.like(bind("cst_itm_nm")))),
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.ship_fr_lg_grp_cd.eq(S0_M1.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("ship_wk_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.ship_wk_cd.eq(S0_M2.ship_wk_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.ship_term_cd.eq(S0_M3.ship_term_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T2.trd_cd.eq(S0_M4.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.trd_nm.like(bind("trd_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T4.cst_cd.eq(S0_M5.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("site_nm", "alloc_grp_nm", "site_cd", "ship_loc_nm", "alloc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T7.ship_loc_cd.eq(S0_M12.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.site_cd.like(bind("site_cd"))).cutoff$and(S0_M12.loc_nm.like(bind("ship_loc_nm"))).cutoff$and(S0_M12.alloc_grp_cd.like(bind("alloc_grp_cd")))),
				when(boundOr("ship_str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T7.ship_loc_cd.eq(S0_M13.loc_cd).and(S0_T7.ship_str_ln_cd.eq(S0_M13.str_ln_cd)))))
					.predicate(p -> p.cutoff$and(S0_M13.str_ln_nm.like(bind("ship_str_ln_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.inst_usr_cd.eq(S0_M17.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_M11.itm_typ.eq(S0_M18.itm_typ).and(S0_M11.itm_typ_d_cd.eq(S0_M18.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M18.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M12.site_cd.eq(S0_M19.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M19.site_nm.like(bind("site_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_T1.wg_cd.eq(S0_M20.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M20.wg_nm.like(bind("wg_nm")))),
				when(boundOr("alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M21).on(bracket(S0_M12.alloc_grp_cd.eq(S0_M21.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M21.alloc_grp_nm.like(bind("alloc_grp_nm")))),
				when(boundOr("ship_to_grp_flg1", "ship_to_grp_flg2", "ship_to_grp_flg3", "ship_to_grp_flg4", "ship_to_grp_flg5", "ship_to_grp_flg6", "ship_to_grp_flg7", "ship_to_grp_flg8", "ship_to_grp_flg9", "ship_to_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T1.ship_to_id_cd.eq(S0_M25.bp_cd)))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M24).on(bracket(
						nvl(
							S0_T3.pr("dlv_cd"),
							S0_T4.dlv_id_cd
						).eq(S0_M24.bp_cd)))),
				when(boundOr("ship_to_grp_flg1"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd1.as("ship_to_grp_cd1"), S0_MM11.bp_grp_nm.as("ship_to_grp_nm1"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M25.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd1.like(bind("ship_to_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("ship_to_grp_nm1")))),
				when(boundOr("ship_to_grp_flg2"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd2.as("ship_to_grp_cd2"), S0_MM12.bp_grp_nm.as("ship_to_grp_nm2"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M25.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd2.like(bind("ship_to_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("ship_to_grp_nm2")))),
				when(boundOr("ship_to_grp_flg3"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd3.as("ship_to_grp_cd3"), S0_MM13.bp_grp_nm.as("ship_to_grp_nm3"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M25.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd3.like(bind("ship_to_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("ship_to_grp_nm3")))),
				when(boundOr("ship_to_grp_flg4"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd4.as("ship_to_grp_cd4"), S0_MM14.bp_grp_nm.as("ship_to_grp_nm4"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M25.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd4.like(bind("ship_to_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("ship_to_grp_nm4")))),
				when(boundOr("ship_to_grp_flg5"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd5.as("ship_to_grp_cd5"), S0_MM15.bp_grp_nm.as("ship_to_grp_nm5"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M25.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd5.like(bind("ship_to_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("ship_to_grp_nm5")))),
				when(boundOr("ship_to_grp_flg6"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd6.as("ship_to_grp_cd6"), S0_MM16.bp_grp_nm.as("ship_to_grp_nm6"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M25.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd6.like(bind("ship_to_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("ship_to_grp_nm6")))),
				when(boundOr("ship_to_grp_flg7"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd7.as("ship_to_grp_cd7"), S0_MM17.bp_grp_nm.as("ship_to_grp_nm7"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M25.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd7.like(bind("ship_to_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("ship_to_grp_nm7")))),
				when(boundOr("ship_to_grp_flg8"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd8.as("ship_to_grp_cd8"), S0_MM18.bp_grp_nm.as("ship_to_grp_nm8"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M25.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd8.like(bind("ship_to_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("ship_to_grp_nm8")))),
				when(boundOr("ship_to_grp_flg9"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd9.as("ship_to_grp_cd9"), S0_MM19.bp_grp_nm.as("ship_to_grp_nm9"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M25.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd9.like(bind("ship_to_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("ship_to_grp_nm9")))),
				when(boundOr("ship_to_grp_flg10"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd10.as("ship_to_grp_cd10"), S0_MM110.bp_grp_nm.as("ship_to_grp_nm10"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M25.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd10.like(bind("ship_to_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("ship_to_grp_nm10")))),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M24.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M24.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M24.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M24.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M24.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M24.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M24.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M24.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M24.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M24.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M24.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M24.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10")))),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M5.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M5.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M5.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M5.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M5.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M5.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M5.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M5.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M5.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M5.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd1.as("itm_grp_cd1"), S0_MM41.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM41).on(S0_M11.itm_grp_cd1.eq(S0_MM41.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM41.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM41.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd2.as("itm_grp_cd2"), S0_MM42.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM42).on(S0_M11.itm_grp_cd2.eq(S0_MM42.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM42.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM42.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd3.as("itm_grp_cd3"), S0_MM43.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM43).on(S0_M11.itm_grp_cd3.eq(S0_MM43.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM43.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM43.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd4.as("itm_grp_cd4"), S0_MM44.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM44).on(S0_M11.itm_grp_cd4.eq(S0_MM44.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM44.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM44.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd5.as("itm_grp_cd5"), S0_MM45.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM45).on(S0_M11.itm_grp_cd5.eq(S0_MM45.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM45.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM45.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd6.as("itm_grp_cd6"), S0_MM46.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM46).on(S0_M11.itm_grp_cd6.eq(S0_MM46.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM46.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM46.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd7.as("itm_grp_cd7"), S0_MM47.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM47).on(S0_M11.itm_grp_cd7.eq(S0_MM47.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM47.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM47.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd8.as("itm_grp_cd8"), S0_MM48.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM48).on(S0_M11.itm_grp_cd8.eq(S0_MM48.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM48.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM48.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd9.as("itm_grp_cd9"), S0_MM49.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM49).on(S0_M11.itm_grp_cd9.eq(S0_MM49.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM49.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM49.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M11.itm_grp_cd10.as("itm_grp_cd10"), S0_MM410.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM410).on(S0_M11.itm_grp_cd10.eq(S0_MM410.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM410.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M11.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM410.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("slo_d_no")
						))
						.addSelect(m -> toArray(
							m.cst_itm_cd,
							m.cst_itm_nm,
							m.dlv_day_week_typ,
							m.set_itm_grp_no,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("cst_itm_cd", m.cst_itm_cd());
							r.setStringNE("cst_itm_nm", m.cst_itm_nm());
							r.setStringNE("dlv_day_week_typ", m.dlv_day_week_typ());
							r.setNumberNE("set_itm_grp_no", m.set_itm_grp_no());
							r.setStringNE("slo_no", m.slo_no());
					}),
					j -> j
						.add(MST_SLO_R.class, r -> toCondition(
							r.getStringNE("slo_no")
						))
						.addSelect(m -> toArray(
							m.assort_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("assort_typ", m.assort_typ());
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
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
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
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("cont_fctr_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("ship_loc_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_loc_nm", m.loc_nm());
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_alloc_grp_cd_", m.alloc_grp_cd());
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
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_ALLOC_STS_Query_S02
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_ALLOC_STS_S02() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MST_SHIP_INST_D_R S0_T2 = MST_SHIP_INST_D_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MST_SHIP_PR_R S0_T4 = MST_SHIP_PR_R.create("T4");
		MST_SLO_R S0_T5 = MST_SLO_R.create("T5");
		MST_SHIP_ALLOC_STS_P_R S0_T7 = MST_SHIP_ALLOC_STS_P_R.create("T7");
		MST_SHIP_SCHD_R S0_T8 = MST_SHIP_SCHD_R.create("T8");
		MST_DLV_SLIP_R S0_T10 = MST_DLV_SLIP_R.create("T10");
		MAM_LG_GRP_R S0_M1 = MAM_LG_GRP_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_SHIP_TERM_R S0_M3 = MAM_SHIP_TERM_R.create("M3");
		MAM_TRD_R S0_M4 = MAM_TRD_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_DPT_R S0_M6 = MAM_DPT_R.create("M6");
		MAM_USR_R S0_M7 = MAM_USR_R.create("M7");
		MAM_BP_R S0_M8 = MAM_BP_R.create("M8");
		MAM_BP_R S0_M9 = MAM_BP_R.create("M9");
		MSVM_SHIP_TO_ID_R S0_M10 = MSVM_SHIP_TO_ID_R.create("M10");
		MSVM_DLV_ID_R S0_M11 = MSVM_DLV_ID_R.create("M11");
		
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_BP_GRP_R S0_MM21 = MAM_BP_GRP_R.create("MM21");
		MAM_BP_GRP_R S0_MM22 = MAM_BP_GRP_R.create("MM22");
		MAM_BP_GRP_R S0_MM23 = MAM_BP_GRP_R.create("MM23");
		MAM_BP_GRP_R S0_MM24 = MAM_BP_GRP_R.create("MM24");
		MAM_BP_GRP_R S0_MM25 = MAM_BP_GRP_R.create("MM25");
		MAM_BP_GRP_R S0_MM26 = MAM_BP_GRP_R.create("MM26");
		MAM_BP_GRP_R S0_MM27 = MAM_BP_GRP_R.create("MM27");
		MAM_BP_GRP_R S0_MM28 = MAM_BP_GRP_R.create("MM28");
		MAM_BP_GRP_R S0_MM29 = MAM_BP_GRP_R.create("MM29");
		MAM_BP_GRP_R S0_MM210 = MAM_BP_GRP_R.create("MM210");
		MAM_BP_GRP_R S0_MM31 = MAM_BP_GRP_R.create("MM31");
		MAM_BP_GRP_R S0_MM32 = MAM_BP_GRP_R.create("MM32");
		MAM_BP_GRP_R S0_MM33 = MAM_BP_GRP_R.create("MM33");
		MAM_BP_GRP_R S0_MM34 = MAM_BP_GRP_R.create("MM34");
		MAM_BP_GRP_R S0_MM35 = MAM_BP_GRP_R.create("MM35");
		MAM_BP_GRP_R S0_MM36 = MAM_BP_GRP_R.create("MM36");
		MAM_BP_GRP_R S0_MM37 = MAM_BP_GRP_R.create("MM37");
		MAM_BP_GRP_R S0_MM38 = MAM_BP_GRP_R.create("MM38");
		MAM_BP_GRP_R S0_MM39 = MAM_BP_GRP_R.create("MM39");
		MAM_BP_GRP_R S0_MM310 = MAM_BP_GRP_R.create("MM310");
		MST_SHIP_SCHD_R S1 = MST_SHIP_SCHD_R.create("W1");
		MST_SHIP_ALLOC_STS_R S2 = MST_SHIP_ALLOC_STS_R.create("W2");
		MST_DLV_SLIP_D_R S3 = MST_DLV_SLIP_D_R.create("W3");
		
		MCDynamicSQLID DS0C_CST_GRP = createDynamicSQLID("DS0C_CST_GRP");
		MCDynamicSQLID DS0C_DLV_GRP = createDynamicSQLID("DS0C_DLV_GRP");
		MCDynamicSQLID DS0C_SHIP_TO_GRP = createDynamicSQLID("DS0C_SHIP_TO_GRP");
		
		MCSubQuery S0_M10_ship_to_id_nm = subQuery().select(S0_M10.ship_to_id_nm).from(S0_M10).where(
				bracket(
						S0_M10.ship_to_id_typ.eq(S0_T1.ship_to_id_typ)
						.and(S0_M10.ship_to_id_cd.eq(S0_T1.ship_to_id_cd))
					));
		
		MCSubQuery S0_M11_dlv_id_nm = subQuery().select(S0_M11.dlv_id_nm).from(S0_M11).where(
				bracket(
						S0_T4.dlv_id_typ.eq(S0_M11.dlv_id_typ)
						.and(nvl(S0_T8.dlv_cd, S0_T4.dlv_id_cd).eq(S0_M11.dlv_id_cd))
					));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_ALLOC_STS_Query_S02")
					.mainQuery()
					.select(
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						trunc(
							S0_T1.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.ship_inst_tm.as("ship_inst_hm"),
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						S0_T1.ship_to_id_nm,
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
						S0_T4.dlv_id_typ,
						nvl(
							S0_T8.dlv_cd,
							S0_T4.dlv_id_cd
						).as("dlv_id_cd"),
						nvl2(
							S0_T8.dlv_cd,
							S0_T8.dlv_sundry_flg,
							S0_T4.dlv_sundry_flg
						).as("dlv_sundry_flg"),
						nvl2(
							S0_T8.dlv_cd,
							S0_T8.dlv_nm,
							S0_T4.dlv_id_nm
						).as("dlv_id_nm"),
						S0_T1.ship_wk_cd,
						S0_T1.ship_term_cd,
						S0_T2.trd_cd,
						S0_T4.cst_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M6.dpt_nm.as("inst_dpt_nm"),
						S0_T2.trd_rmrks,
						S0_T1.inst_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ship_inst_no,
						S0_T1.iv_no,
						S0_T5.slo_no,
						S0_T7.dlv_slip_no,
						S0_T7.dlv_slip_seq.add(
							decode(S0_T1.can_flg, value(false), value(0), value(1))
						).as("dlv_slip_seq"),
						S0_T10.dlv_slip_rev,
						subQuery()
							.select(count(S3.dlv_slip_d_no))
							.from(S3)
							.where(
								S3.dlv_slip_no.eq(S0_T7.dlv_slip_no)
								.and(S3.dlv_slip_seq.eq(S0_T7.dlv_slip_seq))
						).as("num_of_details"),
						S0_T10.slip_prnt_flg.as("dlv_prnted_flg"),
						S0_T10.ship_adv_prnt_flg.as("adv_prnted_flg"),
						S0_T1.can_flg,
						S0_T3.pr("min_pr_sts_typ"),
						S0_T3.pr("max_pr_sts_typ"),
						S0_T10.ins_usr_id,
						S0_T10.ins_usr_nm,
						S0_T10.ins_func_id,
						S0_T10.ins_ts,
						S0_T1.upd_cntr.as("ship_inst_upd_cntr"),
						S0_T10.upd_usr_id,
						S0_T10.upd_usr_nm,
						S0_T10.upd_func_id,
						S0_T10.upd_ts,
						S0_T10.upd_srv_req_no,
						addDynamicSelect(DS0C_SHIP_TO_GRP),
						addDynamicSelect(DS0C_DLV_GRP),
						addDynamicSelect(DS0C_CST_GRP)
					)
					.from(
						S0_T7
						.innerJoin(S0_T1).on(
							bracket(
								S0_T7.ship_inst_no.eq(S0_T1.ship_inst_no)
								.and(S0_T7.ship_inst_rev.eq(S0_T1.ship_inst_rev))
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T7.ship_inst_d_no.eq(S0_T2.ship_inst_d_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								min(S1.pr_sts_typ).as("min_pr_sts_typ"),
								max(S1.pr_sts_typ).as("max_pr_sts_typ"),
								S2.dlv_slip_no
							)
							.from(S1
								.innerJoin(S2).on(S2.ship_inst_d_no.eq(S1.ship_inst_d_no))
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2.dlv_slip_no.like(bind("dlv_slip_no")))
							)
							.groupBy(S2.dlv_slip_no).view(S0_T3)
						).on(
							bracket(
								S0_T7.dlv_slip_no.eq(S0_T3.pr(S2.dlv_slip_no))
							)
						)
						.leftOuterJoin(S0_T8).on(
							bracket(
								S0_T2.ship_inst_d_no.eq(S0_T8.ship_inst_d_no)
								.or(S0_T7.ship_schd_no.eq(S0_T8.ship_schd_no))
							)
						)
						.leftOuterJoin(S0_T4).on(
							bracket(
								S0_T8.ship_pr_no.eq(S0_T4.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T10).on(
							bracket(
								S0_T7.dlv_slip_no.eq(S0_T10.dlv_slip_no)
								.and(S0_T7.dlv_slip_seq.eq(S0_T10.dlv_slip_seq))
							)
						)
						.leftOuterJoin(S0_T5).on(
							bracket(
								S0_T10.slo_no.eq(S0_T5.slo_no)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M6.dpt_cd)
								.and(S0_M6.st_dt.lte(S0_T1.ship_inst_tm))
								.and(S0_M6.end_dt.gt(S0_T1.ship_inst_tm))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SHIP_TO_GRP)
						.addDynamicView(DS0C_DLV_GRP)
						.addDynamicView(DS0C_CST_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(true).eq(value(false))
							.cutoff$or(
								decode(
									S0_T3.pr("min_pr_sts_typ"),
									S0_T3.pr("max_pr_sts_typ"),
									S0_T3.pr("min_pr_sts_typ"),
									value(MSC_PR_STS_TYP.PART_SHIP.value())
								).eq(bind("tmp_sts_not_inst"))
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_inst").isNotNull()
									.and(S0_T3.pr("max_pr_sts_typ").eq(value(MSC_PR_STS_TYP.INST.value())))
								)
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_part_ship").isNotNull()
									.and(
										S0_T3.pr("min_pr_sts_typ").neq(S0_T3.pr("max_pr_sts_typ"))
										.or(S0_T3.pr("max_pr_sts_typ").eq(value(MSC_PR_STS_TYP.PART_SHIP.value())))
									)
								)
							)
							.cutoff$or(
								bracket(
									bind("tmp_sts_ship").isNotNull()
									.and(S0_T3.pr("min_pr_sts_typ").eq(value(MSC_PR_STS_TYP.SHIP.value())))
								)
							)
							.cutoff$or(
								bracket(
									bind("can_disp_flg").eq(value(true))
								)
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T10.slip_prnt_flg.eq(bind("tmp_dlv_prnted")))
							.cutoff$or(
								S0_T10.slip_prnt_flg.neq(bind("tmp_dlv_not_prnted"))
								.or(S0_T10.slip_prnt_flg.isNull())
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T10.ship_adv_prnt_flg.eq(bind("tmp_adv_prnted")))
							.cutoff$or(
								S0_T10.ship_adv_prnt_flg.neq(bind("tmp_adv_not_prnted"))
								.or(S0_T10.ship_adv_prnt_flg.isNull())
							)
						)
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T1.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(true),
								S0_T1.ship_to_id_nm,
								S0_M10_ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T4.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(
							nvl(
								S0_T8.dlv_cd,
								S0_T4.dlv_id_cd
							).like(bind("dlv_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T8.dlv_cd,
								decode(
									S0_T8.dlv_sundry_flg,
									value(true),
									S0_T8.dlv_nm,
									S0_M11_dlv_id_nm
								),
								decode(
									S0_T4.dlv_sundry_flg,
									value(true),
									S0_T4.dlv_id_nm,
									S0_M11_dlv_id_nm
								)
							).like(bind("dlv_id_nm"))
						)
						.cutoff$and(S0_T4.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_T2.trd_cd.like(bind("trd_cd")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M6.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T10.slo_no.like(bind("slo_no")))
						.cutoff$and(S0_T7.dlv_slip_no.like(bind("dlv_slip_no")))
						.cutoff$and(S0_T1.iv_no.like(bind("iv_no")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.addDynamicPredicate(DS0C_SHIP_TO_GRP)
						.addDynamicPredicate(DS0C_DLV_GRP)
						.addDynamicPredicate(DS0C_CST_GRP)
					)
					.groupBy(
						S0_T1.ship_schd_tm,
						S0_T1.dlv_schd_tm,
						S0_T1.ship_inst_tm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						S0_T1.ship_to_id_nm,
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
						S0_T4.dlv_id_typ,
						nvl(
							S0_T8.dlv_cd,
							S0_T4.dlv_id_cd
						),
						nvl2(
							S0_T8.dlv_cd,
							S0_T8.dlv_sundry_flg,
							S0_T4.dlv_sundry_flg
						),
						nvl2(
							S0_T8.dlv_cd,
							S0_T8.dlv_nm,
							S0_T4.dlv_id_nm
						),
						S0_T1.ship_wk_cd,
						S0_T1.ship_term_cd,
						S0_T2.trd_cd,
						S0_T4.cst_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M6.dpt_nm,
						S0_T2.trd_rmrks,
						S0_T1.inst_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ship_inst_no,
						S0_T1.iv_no,
						S0_T5.slo_no,
						S0_T7.dlv_slip_no,
						S0_T7.dlv_slip_seq,
						S0_T10.dlv_slip_rev,
						S0_T10.slip_prnt_flg,
						S0_T10.ship_adv_prnt_flg,
						S0_T1.can_flg,
						S0_T3.pr("min_pr_sts_typ"),
						S0_T3.pr("max_pr_sts_typ"),
						S0_T10.ins_usr_id,
						S0_T10.ins_usr_nm,
						S0_T10.ins_func_id,
						S0_T10.ins_ts,
						S0_T1.upd_cntr,
						S0_T10.upd_usr_id,
						S0_T10.upd_usr_nm,
						S0_T10.upd_func_id,
						S0_T10.upd_ts,
						S0_T10.upd_srv_req_no,
						addDynamicGroupBy(DS0C_SHIP_TO_GRP),
						addDynamicGroupBy(DS0C_DLV_GRP),
						addDynamicGroupBy(DS0C_CST_GRP)
					)
					.orderBy(
						S0_T7.dlv_slip_no.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.ship_fr_lg_grp_cd.eq(S0_M1.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("ship_wk_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.ship_wk_cd.eq(S0_M2.ship_wk_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.ship_term_cd.eq(S0_M3.ship_term_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T2.trd_cd.eq(S0_M4.trd_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.trd_nm.like(bind("trd_nm")))),
				when(boundOr("cst_grp_flg1", "cst_grp_flg2", "cst_grp_flg3", "cst_grp_flg4", "cst_grp_flg5", "cst_grp_flg6", "cst_grp_flg7", "cst_grp_flg8", "cst_grp_flg9", "cst_grp_flg10", "cst_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T4.cst_cd.eq(S0_M5.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.bp_nm.like(bind("cst_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T1.inst_usr_cd.eq(S0_M7.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("ship_to_grp_flg1", "ship_to_grp_flg2", "ship_to_grp_flg3", "ship_to_grp_flg4", "ship_to_grp_flg5", "ship_to_grp_flg6", "ship_to_grp_flg7", "ship_to_grp_flg8", "ship_to_grp_flg9", "ship_to_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_T1.ship_to_id_cd.eq(S0_M8.bp_cd)))),
				when(boundOr("dlv_grp_flg1", "dlv_grp_flg2", "dlv_grp_flg3", "dlv_grp_flg4", "dlv_grp_flg5", "dlv_grp_flg6", "dlv_grp_flg7", "dlv_grp_flg8", "dlv_grp_flg9", "dlv_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(
						nvl(
							S0_T8.dlv_cd,
							S0_T4.dlv_id_cd
						).eq(S0_M9.bp_cd)))),
				when(boundOr("ship_to_grp_flg1"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd1.as("ship_to_grp_cd1"), S0_MM11.bp_grp_nm.as("ship_to_grp_nm1"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M8.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd1.like(bind("ship_to_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("ship_to_grp_nm1"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd1, S0_MM11.bp_grp_nm),
				when(boundOr("ship_to_grp_flg2"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd2.as("ship_to_grp_cd2"), S0_MM12.bp_grp_nm.as("ship_to_grp_nm2"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M8.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd2.like(bind("ship_to_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("ship_to_grp_nm2"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd2, S0_MM12.bp_grp_nm),
				when(boundOr("ship_to_grp_flg3"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd3.as("ship_to_grp_cd3"), S0_MM13.bp_grp_nm.as("ship_to_grp_nm3"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M8.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd3.like(bind("ship_to_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("ship_to_grp_nm3"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd3, S0_MM13.bp_grp_nm),
				when(boundOr("ship_to_grp_flg4"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd4.as("ship_to_grp_cd4"), S0_MM14.bp_grp_nm.as("ship_to_grp_nm4"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M8.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd4.like(bind("ship_to_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("ship_to_grp_nm4"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd4, S0_MM14.bp_grp_nm),
				when(boundOr("ship_to_grp_flg5"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd5.as("ship_to_grp_cd5"), S0_MM15.bp_grp_nm.as("ship_to_grp_nm5"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M8.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd5.like(bind("ship_to_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("ship_to_grp_nm5"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd5, S0_MM15.bp_grp_nm),
				when(boundOr("ship_to_grp_flg6"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd6.as("ship_to_grp_cd6"), S0_MM16.bp_grp_nm.as("ship_to_grp_nm6"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M8.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd6.like(bind("ship_to_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("ship_to_grp_nm6"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd6, S0_MM16.bp_grp_nm),
				when(boundOr("ship_to_grp_flg7"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd7.as("ship_to_grp_cd7"), S0_MM17.bp_grp_nm.as("ship_to_grp_nm7"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M8.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd7.like(bind("ship_to_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("ship_to_grp_nm7"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd7, S0_MM17.bp_grp_nm),
				when(boundOr("ship_to_grp_flg8"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd8.as("ship_to_grp_cd8"), S0_MM18.bp_grp_nm.as("ship_to_grp_nm8"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M8.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd8.like(bind("ship_to_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("ship_to_grp_nm8"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd8, S0_MM18.bp_grp_nm),
				when(boundOr("ship_to_grp_flg9"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd9.as("ship_to_grp_cd9"), S0_MM19.bp_grp_nm.as("ship_to_grp_nm9"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M8.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd9.like(bind("ship_to_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("ship_to_grp_nm9"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd9, S0_MM19.bp_grp_nm),
				when(boundOr("ship_to_grp_flg10"))
					.select(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd10.as("ship_to_grp_cd10"), S0_MM110.bp_grp_nm.as("ship_to_grp_nm10"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M8.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M8.bp_grp_cd10.like(bind("ship_to_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("ship_to_grp_nm10"))))
					.groupBy(DS0C_SHIP_TO_GRP, S0_M8.bp_grp_cd10, S0_MM110.bp_grp_nm),
				when(boundOr("dlv_grp_flg1"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd1.as("dlv_grp_cd1"), S0_MM21.bp_grp_nm.as("dlv_grp_nm1"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM21).on(S0_M9.bp_grp_cd1.eq(S0_MM21.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM21.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_MM21.bp_grp_nm.like(bind("dlv_grp_nm1"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd1, S0_MM21.bp_grp_nm),
				when(boundOr("dlv_grp_flg2"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd2.as("dlv_grp_cd2"), S0_MM22.bp_grp_nm.as("dlv_grp_nm2"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM22).on(S0_M9.bp_grp_cd2.eq(S0_MM22.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM22.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_MM22.bp_grp_nm.like(bind("dlv_grp_nm2"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd2, S0_MM22.bp_grp_nm),
				when(boundOr("dlv_grp_flg3"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd3.as("dlv_grp_cd3"), S0_MM23.bp_grp_nm.as("dlv_grp_nm3"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM23).on(S0_M9.bp_grp_cd3.eq(S0_MM23.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM23.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_MM23.bp_grp_nm.like(bind("dlv_grp_nm3"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd3, S0_MM23.bp_grp_nm),
				when(boundOr("dlv_grp_flg4"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd4.as("dlv_grp_cd4"), S0_MM24.bp_grp_nm.as("dlv_grp_nm4"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM24).on(S0_M9.bp_grp_cd4.eq(S0_MM24.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM24.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_MM24.bp_grp_nm.like(bind("dlv_grp_nm4"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd4, S0_MM24.bp_grp_nm),
				when(boundOr("dlv_grp_flg5"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd5.as("dlv_grp_cd5"), S0_MM25.bp_grp_nm.as("dlv_grp_nm5"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM25).on(S0_M9.bp_grp_cd5.eq(S0_MM25.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM25.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_MM25.bp_grp_nm.like(bind("dlv_grp_nm5"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd5, S0_MM25.bp_grp_nm),
				when(boundOr("dlv_grp_flg6"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd6.as("dlv_grp_cd6"), S0_MM26.bp_grp_nm.as("dlv_grp_nm6"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM26).on(S0_M9.bp_grp_cd6.eq(S0_MM26.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM26.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_MM26.bp_grp_nm.like(bind("dlv_grp_nm6"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd6, S0_MM26.bp_grp_nm),
				when(boundOr("dlv_grp_flg7"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd7.as("dlv_grp_cd7"), S0_MM27.bp_grp_nm.as("dlv_grp_nm7"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM27).on(S0_M9.bp_grp_cd7.eq(S0_MM27.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM27.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_MM27.bp_grp_nm.like(bind("dlv_grp_nm7"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd7, S0_MM27.bp_grp_nm),
				when(boundOr("dlv_grp_flg8"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd8.as("dlv_grp_cd8"), S0_MM28.bp_grp_nm.as("dlv_grp_nm8"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM28).on(S0_M9.bp_grp_cd8.eq(S0_MM28.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM28.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_MM28.bp_grp_nm.like(bind("dlv_grp_nm8"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd8, S0_MM28.bp_grp_nm),
				when(boundOr("dlv_grp_flg9"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd9.as("dlv_grp_cd9"), S0_MM29.bp_grp_nm.as("dlv_grp_nm9"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM29).on(S0_M9.bp_grp_cd9.eq(S0_MM29.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM29.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_MM29.bp_grp_nm.like(bind("dlv_grp_nm9"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd9, S0_MM29.bp_grp_nm),
				when(boundOr("dlv_grp_flg10"))
					.select(DS0C_DLV_GRP, S0_M9.bp_grp_cd10.as("dlv_grp_cd10"), S0_MM210.bp_grp_nm.as("dlv_grp_nm10"))
					.view(DS0C_DLV_GRP, v -> v.leftOuterJoin(S0_MM210).on(S0_M9.bp_grp_cd10.eq(S0_MM210.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM210.bp_grp_typ))))
					.predicate(DS0C_DLV_GRP, p -> p.cutoff$and(S0_M9.bp_grp_cd10.like(bind("dlv_grp_cd10"))).cutoff$and(S0_MM210.bp_grp_nm.like(bind("dlv_grp_nm10"))))
					.groupBy(DS0C_DLV_GRP, S0_M9.bp_grp_cd10, S0_MM210.bp_grp_nm),
				when(boundOr("cst_grp_flg1"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd1.as("cst_grp_cd1"), S0_MM31.bp_grp_nm.as("cst_grp_nm1"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM31).on(S0_M5.bp_grp_cd1.eq(S0_MM31.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM31.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_MM31.bp_grp_nm.like(bind("cst_grp_nm1"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd1, S0_MM31.bp_grp_nm),
				when(boundOr("cst_grp_flg2"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd2.as("cst_grp_cd2"), S0_MM32.bp_grp_nm.as("cst_grp_nm2"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM32).on(S0_M5.bp_grp_cd2.eq(S0_MM32.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM32.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_MM32.bp_grp_nm.like(bind("cst_grp_nm2"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd2, S0_MM32.bp_grp_nm),
				when(boundOr("cst_grp_flg3"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd3.as("cst_grp_cd3"), S0_MM33.bp_grp_nm.as("cst_grp_nm3"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM33).on(S0_M5.bp_grp_cd3.eq(S0_MM33.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM33.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_MM33.bp_grp_nm.like(bind("cst_grp_nm3"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd3, S0_MM33.bp_grp_nm),
				when(boundOr("cst_grp_flg4"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd4.as("cst_grp_cd4"), S0_MM34.bp_grp_nm.as("cst_grp_nm4"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM34).on(S0_M5.bp_grp_cd4.eq(S0_MM34.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM34.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_MM34.bp_grp_nm.like(bind("cst_grp_nm4"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd4, S0_MM34.bp_grp_nm),
				when(boundOr("cst_grp_flg5"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd5.as("cst_grp_cd5"), S0_MM35.bp_grp_nm.as("cst_grp_nm5"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM35).on(S0_M5.bp_grp_cd5.eq(S0_MM35.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM35.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_MM35.bp_grp_nm.like(bind("cst_grp_nm5"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd5, S0_MM35.bp_grp_nm),
				when(boundOr("cst_grp_flg6"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd6.as("cst_grp_cd6"), S0_MM36.bp_grp_nm.as("cst_grp_nm6"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM36).on(S0_M5.bp_grp_cd6.eq(S0_MM36.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM36.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_MM36.bp_grp_nm.like(bind("cst_grp_nm6"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd6, S0_MM36.bp_grp_nm),
				when(boundOr("cst_grp_flg7"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd7.as("cst_grp_cd7"), S0_MM37.bp_grp_nm.as("cst_grp_nm7"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM37).on(S0_M5.bp_grp_cd7.eq(S0_MM37.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM37.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_MM37.bp_grp_nm.like(bind("cst_grp_nm7"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd7, S0_MM37.bp_grp_nm),
				when(boundOr("cst_grp_flg8"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd8.as("cst_grp_cd8"), S0_MM38.bp_grp_nm.as("cst_grp_nm8"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM38).on(S0_M5.bp_grp_cd8.eq(S0_MM38.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM38.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_MM38.bp_grp_nm.like(bind("cst_grp_nm8"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd8, S0_MM38.bp_grp_nm),
				when(boundOr("cst_grp_flg9"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd9.as("cst_grp_cd9"), S0_MM39.bp_grp_nm.as("cst_grp_nm9"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM39).on(S0_M5.bp_grp_cd9.eq(S0_MM39.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM39.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_MM39.bp_grp_nm.like(bind("cst_grp_nm9"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd9, S0_MM39.bp_grp_nm),
				when(boundOr("cst_grp_flg10"))
					.select(DS0C_CST_GRP, S0_M5.bp_grp_cd10.as("cst_grp_cd10"), S0_MM310.bp_grp_nm.as("cst_grp_nm10"))
					.view(DS0C_CST_GRP, v -> v.leftOuterJoin(S0_MM310).on(S0_M5.bp_grp_cd10.eq(S0_MM310.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM310.bp_grp_typ))))
					.predicate(DS0C_CST_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("cst_grp_cd10"))).cutoff$and(S0_MM310.bp_grp_nm.like(bind("cst_grp_nm10"))))
					.groupBy(DS0C_CST_GRP, S0_M5.bp_grp_cd10, S0_MM310.bp_grp_nm)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVM_SHIP_TO_ID_R.class, r -> toCondition(
							r.getStringNE("ship_to_id_typ"),
							r.getStringNE("ship_to_id_cd")
						))
						.addSelect(m -> toArray(
							m.ship_to_id_nm
						))
						.addMap((r, m) -> {
							if (!r.getBooleanNE("ship_to_sundry_flg")) {
								r.setStringNE("ship_to_id_nm", m.ship_to_id_nm());
							}
					}),
					j -> j
						.add(MSVM_DLV_ID_R.class, r -> toCondition(
							r.getStringNE("dlv_id_typ"),
							r.getStringNE("dlv_id_cd")
						))
						.addSelect(m -> toArray(
							m.dlv_id_nm
						))
						.addMap((r, m) -> {
							if (!r.getBooleanNE("dlv_sundry_flg")) {
								r.setStringNE("dlv_id_nm", m.dlv_id_nm());
							}
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_INST_Query_S01
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_INST_S01() {
		MST_SHIP_INST_R S0_T1 = MST_SHIP_INST_R.create("T1");
		MAM_LG_GRP_R S0_M1 = MAM_LG_GRP_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_SHIP_TERM_R S0_M3 = MAM_SHIP_TERM_R.create("M3");
		MAM_USR_R S0_M4 = MAM_USR_R.create("M4");
		MAM_DPT_R S0_M5 = MAM_DPT_R.create("M5");
		MSVM_SHIP_TO_ID_R S0_M6 = MSVM_SHIP_TO_ID_R.create("M6");
		MAVM_RD_LG_GRP_R S0_M99 = MAVM_RD_LG_GRP_R.create("M99");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MST_SHIP_INST_D_R S1_W1 = MST_SHIP_INST_D_R.create("W1");
		
		MCDynamicSQLID DS0C_SHIP_TO_GRP = createDynamicSQLID("DS0C_SHIP_TO_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_INST_Query_S01")
					.mainQuery()
					.select(
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						trunc(
							S0_T1.ship_inst_tm,
							MCDateFmt.DD
						).as("ship_inst_dt"),
						S0_T1.ship_inst_tm.as("ship_inst_hm"),
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.wg_cd,
						S0_T1.ship_to_lg_grp_cd,
						S0_T1.ship_to_id_typ,
						S0_T1.ship_to_id_cd,
						decode(
							S0_T1.ship_to_sundry_flg,
							value(true),
							S0_T1.ship_to_id_nm,
							S0_M6.ship_to_id_nm
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
						S0_T1.ship_wk_cd,
						S0_T1.ship_term_cd,
						S0_T1.inst_usr_cd,
						S0_T1.inst_dpt_cd,
						S0_M5.dpt_nm.as("inst_dpt_nm"),
						S0_T1.inst_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ship_inst_no,
						S0_T1.iv_no,
						S0_T1.pick_prnt_flg.as("pick_prnted_flg"),
						S0_T1.ship_inst_prnt_flg.as("inst_prnted_flg"),
						S0_T1.ship_adv_prnt_flg.as("adv_prnted_flg"),
						S0_T1.dlv_prnt_flg.as("dlv_prnted_flg"),
						S0_T1.can_flg,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("ship_inst_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						addDynamicSelect(DS0C_SHIP_TO_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M5.dpt_cd)
								.and(S0_M5.st_dt.lte(S0_T1.ship_inst_tm))
								.and(S0_M5.end_dt.gt(S0_T1.ship_inst_tm))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T1.ship_to_id_typ.eq(S0_M6.ship_to_id_typ)
								.and(S0_T1.ship_to_id_cd.eq(S0_M6.ship_to_id_cd))
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.ship_fr_lg_grp_cd.eq(S0_M99.lg_grp_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SHIP_TO_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(
							S0_T1.can_flg.eq(value(false))
							.and(bind("not_prnt_mode_flg").eq(value(true)))
						)
						.cutoff$and(
							bind("prnt_mode_flg").eq(value(true))
							.and(
								S0_T1.can_flg.eq(value(false))
								.or(S0_T1.can_flg.eq(value(true))
									.and(bind("can_disp_flg").eq(value(true))))
							)
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.pick_prnt_flg.eq(bind("tmp_pick_prnted")))
							.cutoff$or(S0_T1.pick_prnt_flg.neq(bind("tmp_pick_not_prnted")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.ship_inst_prnt_flg.eq(bind("tmp_inst_prnted")))
							.cutoff$or(S0_T1.ship_inst_prnt_flg.neq(bind("tmp_inst_not_prnted")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.ship_adv_prnt_flg.eq(bind("tmp_adv_prnted")))
							.cutoff$or(S0_T1.ship_adv_prnt_flg.neq(bind("tmp_adv_not_prnted")))
						)
						.and(
							value(true).eq(value(false))
							.cutoff$or(S0_T1.dlv_prnt_flg.eq(bind("tmp_dlv_prnted")))
							.cutoff$or(S0_T1.dlv_prnt_flg.neq(bind("tmp_dlv_not_prnted")))
						)
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(S0_T1.ship_inst_tm.gte(bind("ship_inst_hm_fr")))
						.cutoff$and(S0_T1.ship_inst_tm.lte(bind("ship_inst_hm_to")))
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.ship_to_id_typ.like(bind("ship_to_id_typ")))
						.cutoff$and(S0_T1.ship_to_id_cd.like(bind("ship_to_id_cd")))
						.cutoff$and(
							decode(
								S0_T1.ship_to_sundry_flg,
								value(true),
								S0_T1.ship_to_id_nm,
								S0_M6.ship_to_id_nm
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M5.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T1.ship_inst_no.like(bind("ship_inst_no")))
						.cutoff$and(S0_T1.inst_rmrks.like(bind("inst_rmrks")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W1)
								.where(
									value(0).eq(value(0))
									.and(S1_W1.ship_inst_no.eq(S0_T1.ship_inst_no))
									.and(S1_W1.abort_flg.eq(bind("no_abort")))
								)
							)
						)
						.addDynamicPredicate(DS0C_SHIP_TO_GRP)
					)
					.orderBy(S0_T1.ship_inst_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.ship_fr_lg_grp_cd.eq(S0_M1.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("ship_wk_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.ship_wk_cd.eq(S0_M2.ship_wk_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.ship_term_cd.eq(S0_M3.ship_term_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.inst_usr_cd.eq(S0_M4.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("ship_to_grp_flg1", "ship_to_grp_flg2", "ship_to_grp_flg3", "ship_to_grp_flg4", "ship_to_grp_flg5", "ship_to_grp_flg6", "ship_to_grp_flg7", "ship_to_grp_flg8", "ship_to_grp_flg9", "ship_to_grp_flg10"))
					.view(v -> v.leftOuterJoin(S0_M25).on(bracket(S0_T1.ship_to_id_cd.eq(S0_M25.bp_cd)))),
				when(boundOr("ship_to_grp_flg1"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd1.as("ship_to_grp_cd1"), S0_MM11.bp_grp_nm.as("ship_to_grp_nm1"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M25.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd1.like(bind("ship_to_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("ship_to_grp_nm1")))),
				when(boundOr("ship_to_grp_flg2"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd2.as("ship_to_grp_cd2"), S0_MM12.bp_grp_nm.as("ship_to_grp_nm2"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M25.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd2.like(bind("ship_to_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("ship_to_grp_nm2")))),
				when(boundOr("ship_to_grp_flg3"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd3.as("ship_to_grp_cd3"), S0_MM13.bp_grp_nm.as("ship_to_grp_nm3"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M25.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd3.like(bind("ship_to_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("ship_to_grp_nm3")))),
				when(boundOr("ship_to_grp_flg4"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd4.as("ship_to_grp_cd4"), S0_MM14.bp_grp_nm.as("ship_to_grp_nm4"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M25.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd4.like(bind("ship_to_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("ship_to_grp_nm4")))),
				when(boundOr("ship_to_grp_flg5"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd5.as("ship_to_grp_cd5"), S0_MM15.bp_grp_nm.as("ship_to_grp_nm5"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M25.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd5.like(bind("ship_to_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("ship_to_grp_nm5")))),
				when(boundOr("ship_to_grp_flg6"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd6.as("ship_to_grp_cd6"), S0_MM16.bp_grp_nm.as("ship_to_grp_nm6"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M25.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd6.like(bind("ship_to_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("ship_to_grp_nm6")))),
				when(boundOr("ship_to_grp_flg7"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd7.as("ship_to_grp_cd7"), S0_MM17.bp_grp_nm.as("ship_to_grp_nm7"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M25.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd7.like(bind("ship_to_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("ship_to_grp_nm7")))),
				when(boundOr("ship_to_grp_flg8"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd8.as("ship_to_grp_cd8"), S0_MM18.bp_grp_nm.as("ship_to_grp_nm8"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M25.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd8.like(bind("ship_to_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("ship_to_grp_nm8")))),
				when(boundOr("ship_to_grp_flg9"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd9.as("ship_to_grp_cd9"), S0_MM19.bp_grp_nm.as("ship_to_grp_nm9"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M25.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd9.like(bind("ship_to_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("ship_to_grp_nm9")))),
				when(boundOr("ship_to_grp_flg10"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd10.as("ship_to_grp_cd10"), S0_MM110.bp_grp_nm.as("ship_to_grp_nm10"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M25.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd10.like(bind("ship_to_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("ship_to_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("adv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("inst_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_usr_nm", m.usr_nm());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_INST_Query_S02
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_INST_S02() {
		MCTempView S0_SUB1 = createTempView("SUB1");
		MCTempView S0_SUB2 = createTempView("SUB2");
		MCTempView S0_SUB3 = createTempView("SUB3");
		MSW_SHIP_INST_KEY_R S1_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S1_TB0 = MST_SHIP_INST_R.create("TB0");
		MST_SHIP_INST_D_R S1_TB1 = MST_SHIP_INST_D_R.create("TB1");
		MST_SHIP_ALLOC_STS_P_R S1_TB2 = MST_SHIP_ALLOC_STS_P_R.create("TB2");
		MAVM_ITM_UNIT_R S1_TB5 = MAVM_ITM_UNIT_R.create("TB5");
		MSW_SHIP_INST_KEY_R S2_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_R S2_TA1 = MST_SHIP_INST_R.create("TA1");
		MST_SHIP_ALLOC_STS_P_R S2_TA2 = MST_SHIP_ALLOC_STS_P_R.create("TA2");
		MSW_SHIP_INST_KEY_R S3_W1 = MSW_SHIP_INST_KEY_R.create("W1");
		MST_SHIP_INST_D_R S3_TC1 = MST_SHIP_INST_D_R.create("TC1");
		MST_SHIP_SCHD_R S3_TC2 = MST_SHIP_SCHD_R.create("TC2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_INST_Query_S02")
					.mainQuery()
					.select(
						S0_SUB1.pr(S1_TB1.ship_inst_no),
						S0_SUB1.pr("ship_wt"),
						S0_SUB1.pr("ship_dim"),
						S0_SUB2.pr("num_of_details"),
						S0_SUB3.pr("min_pr_sts_typ"),
						S0_SUB3.pr("max_pr_sts_typ")
					)
					.from(
						subQuery()
						.select(
							S1_TB1.ship_inst_no,
							sum(
								nvl(
									S1_TB5.unit_wt,
									value(0)
								).multiply(S1_TB2.ent_unit_qty)
							).as("ship_wt"),
							sum(
								nvl(
									S1_TB5.unit_dim,
									value(0)
								).multiply(S1_TB2.ent_unit_qty)
							).as("ship_dim")
						)
						.from(
							S1_W1
							.innerJoin(S1_TB0).on(
								bracket(
									S1_W1.ship_inst_no.eq(S1_TB0.ship_inst_no)
								)
							)
							.innerJoin(S1_TB1).on(
								bracket(
									S1_W1.ship_inst_no.eq(S1_TB1.ship_inst_no)
								)
							)
							.innerJoin(S1_TB2).on(
								bracket(
									S1_TB1.ship_inst_d_no.eq(S1_TB2.ship_inst_d_no)
									.and(S1_TB0.ship_inst_rev.eq(S1_TB2.ship_inst_rev))
								)
							)
							.leftOuterJoin(S1_TB5).on(
								bracket(
									S1_TB1.itm_cd.eq(S1_TB5.itm_cd)
									.and(S1_TB1.itm_sub1.eq(S1_TB5.itm_sub1))
									.and(S1_TB1.itm_sub2.eq(S1_TB5.itm_sub2))
									.and(S1_TB1.itm_sub3.eq(S1_TB5.itm_sub3))
									.and(S1_TB2.ent_unit_cd.eq(S1_TB5.unit_cd))
								)
							)
						)
						.groupBy(S1_TB1.ship_inst_no).view(S0_SUB1)
						.innerJoin(
							subQuery()
							.select(
								countDistinct(S2_TA2.ship_inst_d_no).as("num_of_details"),
								S2_TA1.ship_inst_no
							)
							.from(
								S2_W1
								.innerJoin(S2_TA1).on(
									bracket(
										S2_W1.ship_inst_no.eq(S2_TA1.ship_inst_no)
									)
								)
							.innerJoin(S2_TA2).on(
								bracket(
									S2_TA1.ship_inst_no.eq(S2_TA2.ship_inst_no)
									.and(S2_TA1.ship_inst_rev.eq(S2_TA2.ship_inst_rev))
								)
							)
							)
							.groupBy(S2_TA1.ship_inst_no).view(S0_SUB2)
						).on(
							bracket(
								S0_SUB1.pr(S1_TB1.ship_inst_no).eq(S0_SUB2.pr(S2_TA1.ship_inst_no))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								min(S3_TC2.pr_sts_typ).as("min_pr_sts_typ"),
								max(S3_TC2.pr_sts_typ).as("max_pr_sts_typ"),
								S3_TC1.ship_inst_no
							)
							.from(
								S3_W1
								.innerJoin(S3_TC1).on(
									bracket(
										S3_W1.ship_inst_no.eq(S3_TC1.ship_inst_no)
									)
								)
								.innerJoin(S3_TC2).on(
									bracket(
										S3_TC1.ship_inst_d_no.eq(S3_TC2.ship_inst_d_no)
									)
								)
							)
							.where(
								S3_TC1.can_flg.eq(value(false))
							)
							.groupBy(S3_TC1.ship_inst_no).view(S0_SUB3)
						).on(
							bracket(
								S0_SUB2.pr(S2_TA1.ship_inst_no).eq(S0_SUB3.pr(S3_TC1.ship_inst_no))
							)
						)
					)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_SCHD_Query_S01
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_SCHD_S01() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MSW_SHIP_SCHD_KEY_R S0_W = MSW_SHIP_SCHD_KEY_R.create("W");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SHIP_ALLOC_STS_R S0_T3 = MST_SHIP_ALLOC_STS_R.create("T3");
		MCTempView S0_T5 = createTempView("T5");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MSVM_DLV_ID_R S0_M5 = MSVM_DLV_ID_R.create("M5");
		MCTempView S0_M4 = createTempView("M4");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MSW_SHIP_SCHD_KEY_R S1_W1 = MSW_SHIP_SCHD_KEY_R.create("W1");
		MST_IV_MAP_R S1_W2 = MST_IV_MAP_R.create("W2");
		MST_IV_D_R S1_W3 = MST_IV_D_R.create("W3");
		MST_IV_R S1_W4 = MST_IV_R.create("W4");
		MAM_LG_CTL_R S2 = MAM_LG_CTL_R.create();
		MCTempView S0_M7 = createTempView("M7");
		
		MCSubQuery S0_M7_iv_trd_flg = subQuery().select(S0_M7.pr("iv_trd_flg"))
				.from(subQuery()
						.select(S0_M4.pr("iv_trd_flg"), S0_M4.pr("fr_lg_grp_cd"),
								S0_M5.dlv_id_typ, S0_M5.dlv_id_cd)
						.from(subQuery()
								.select(max(S2.iv_trd_flg).as("iv_trd_flg"),
										S2.fr_lg_grp_cd, S2.to_lg_grp_cd)
								.from(S2).groupBy(S2.fr_lg_grp_cd, S2.to_lg_grp_cd)
								.view(S0_M4).innerJoin(S0_M5)
								.on(bracket(
										S0_M5.lg_grp_cd.eq(S0_M4.pr(S2.to_lg_grp_cd)))))
						.view(S0_M7))
				.where(bracket(S0_M7.pr("dlv_id_typ").eq(S0_T2.dlv_id_typ)
						.and(S0_M7.pr("dlv_id_cd").eq(nvl(S0_T1.dlv_cd, S0_T2.dlv_id_cd)))
						.and(S0_T1.ship_fr_lg_grp_cd.eq(S0_M7.pr("fr_lg_grp_cd")))));
		
		MCSubQuery S0_T5_disp_seq = subQuery().select(S0_T5.pr("disp_seq"))
				.from(subQuery()
						.select(S1_W2.ship_schd_no, min(S1_W3.disp_seq).as("disp_seq"))
						.from(S1_W1.innerJoin(S1_W2)
								.on(bracket(S1_W2.ship_schd_no.eq(S1_W1.ship_schd_no)))
								.innerJoin(S1_W3)
								.on(bracket(S1_W3.iv_d_no.eq(S1_W2.iv_d_no)))
								.innerJoin(S1_W4)
								.on(bracket(S1_W4.iv_mng_no.eq(S1_W3.iv_mng_no))))
						.where(S1_W4.iv_ship_flg.eq(value(true)))
						.groupBy(S1_W2.ship_schd_no).view(S0_T5))
				.where(bracket(S0_T1.ship_schd_no.eq(S0_T5.pr(S1_W2.ship_schd_no))));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T2.loc_cd.as("ship_loc_cd"),
						S0_T2.str_ln_cd.as("ship_str_ln_cd"),
						nvl(
							S0_T2.ship_lg_grp_cd,
							S0_M3.lg_grp_cd
						).as("ship_lg_grp_cd"),
						S0_T3.ship_loc_cd.as("alloc_loc_cd"),
						S0_T3.ship_str_ln_cd.as("alloc_str_ln_cd"),
						S0_T2.dlv_str_ln_cd,
						S0_T2.trd_cd,
						S0_T2.trd_ptn_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_T1.itm_nm
						).as("itm_nm"),
						S0_T1.iv_itm_nm,
						S0_T1.sundry_itm_flg,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T3.sno1.as("alloc_sno1"),
						S0_T3.sno2.as("alloc_sno2"),
						S0_T3.sno3.as("alloc_sno3"),
						S0_T3.sno4.as("alloc_sno4"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.ver_no,
						S0_T3.lot_no.as("alloc_lot_no"),
						S0_T3.sublot_no.as("alloc_sublot_no"),
						S0_T3.ver_no.as("alloc_ver_no"),
						S0_T1.stk_arrv_bp_cd,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T3.stk_id_typ,
						S0_T3.stk_bp_cd,
						S0_T1.trd_unit_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T3.ent_unit_qty.as("alloc_ent_unit_qty"),
						S0_T3.ent_unit_cd.as("alloc_ent_unit_cd"),
						S0_T3.base_unit_qty.as("alloc_base_unit_qty"),
						S0_T3.base_unit_cd.as("alloc_base_unit_cd"),
						S0_T2.rsn_cd,
						S0_T2.bd_dpt_cd,
						S0_T1.not_lot_mix_flg,
						S0_T1.not_sublot_mix_flg,
						S0_T3.vld_dt_fr.as("valid_dt_from"),
						S0_T3.vld_dt_to.as("valid_dt_to"),
						S0_T1.base_dlv_slip_no,
						S0_T1.base_prov_act_no,
						S0_T1.base_ac_dt,
						S0_T1.ship_cnt_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.trd_d_rmrks,
						S0_T1.ship_schd_no,
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(S0_M7_iv_trd_flg).as("iv_trd_flg"),
						S0_T3.alloc_flg,
						S0_T3.alloc_scope_typ,
						S0_T3.ship_alloc_sts_no,
						S0_T2.dlv_id_typ,
						nvl(
							S0_T1.dlv_cd,
							S0_T2.dlv_id_cd
						).as("dlv_id_cd"),
						S0_T5_disp_seq.as("iv_d_disp_seq"),
						S0_T2.def_loc_cd,
						decode(
							S0_T1.ship_fr_lg_grp_cd,
							S0_M3.lg_grp_cd,
							S0_M6.ship_loc_prio_flg,
							value(false)
						).as("ship_loc_prio_flg"),
						// this field is appended by sql coverter.
						S0_T2.slo_d_no.as("join_slo_d_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_W).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_W.ship_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T3.ship_schd_no)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M2.sno1))
								.and(S0_T1.sno2.eq(S0_M2.sno2))
								.and(S0_T1.sno3.eq(S0_M2.sno3))
								.and(S0_T1.sno4.eq(S0_M2.sno4))
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_T2.def_loc_cd.eq(S0_M3.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
							)
						)
					)
					.orderBy(
						S0_T1.ship_schd_no.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.iv_itm_nm.asc(),
						S0_T1.sno1.asc(),
						S0_T1.sno2.asc(),
						S0_T1.sno3.asc(),
						S0_T1.sno4.asc(),
						S0_T1.lot_no.asc(),
						S0_T1.sublot_no.asc(),
						S0_T1.stk_arrv_bp_cd.asc(),
						S0_T1.gd_cd.asc(),
						S0_T1.quality_typ.asc(),
						S0_T1.stk_insp_typ.asc(),
						S0_T1.stk_id_typ.asc(),
						S0_T1.stk_bp_cd.asc()
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_SLO_D_R.class, r -> toCondition(
							r.getStringNE("join_slo_d_no_")
						))
						.addSelect(m -> toArray(
							m.disp_seq,
							m.slo_no
						))
						.addMap((r, m) -> {
							r.setStringNE("slo_no", m.slo_no());
							r.setNumberNE("slo_d_disp_seq", m.disp_seq());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.skip_chk_ship_flg,
							m.stk_mng_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_mng_typ", m.stk_mng_typ());
							r.setBooleanNE("skip_chk_ship_flg", m.skip_chk_ship_flg());
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_SCHD_Query_S02
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_SCHD_S02() {
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_PR_R S0_T2 = MST_SHIP_PR_R.create("T2");
		MST_SLO_D_R S0_T6 = MST_SLO_D_R.create("T6");
		MST_SLO_R S0_T7 = MST_SLO_R.create("T7");
		MAM_LG_GRP_R S0_M1 = MAM_LG_GRP_R.create("M1");
		MAM_SHIP_WK_R S0_M2 = MAM_SHIP_WK_R.create("M2");
		MAM_SHIP_TERM_R S0_M3 = MAM_SHIP_TERM_R.create("M3");
		MSVM_SHIP_TO_ID_R S0_M4 = MSVM_SHIP_TO_ID_R.create("M4");
		MAM_LG_CTL_R S0_M22 = MAM_LG_CTL_R.create("M22");
		MAM_SHIP_WK_GRP_R S0_M23 = MAM_SHIP_WK_GRP_R.create("M23");
		MAM_LG_CTL_R S0_M221 = MAM_LG_CTL_R.create("M221");
		MAM_SHIP_WK_GRP_R S0_M231 = MAM_SHIP_WK_GRP_R.create("M231");
		MAM_BP_R S0_M25 = MAM_BP_R.create("M25");
		MSVM_DLV_ID_R S0_M31 = MSVM_DLV_ID_R.create("M31");
		MCTempView S0_M30 = createTempView("M30");
		MAVM_RD_LG_GRP_R S0_M99 = MAVM_RD_LG_GRP_R.create("M99");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		MAM_LG_CTL_R S1 = MAM_LG_CTL_R.create();
		MST_IV_MAP_R S2_T_T1 = MST_IV_MAP_R.create("T_T1");
		
		MCDynamicSQLID DS0C_SHIP_TO_GRP = createDynamicSQLID("DS0C_SHIP_TO_GRP");
		MCSubQuery S0_M4_ship_to_id_nm = subQuery().select(S0_M4.ship_to_id_nm).from(S0_M4).where(
				bracket(
						nvl2(
							S0_T1.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T2.ship_to_id_typ
						).eq(S0_M4.ship_to_id_typ)
						.and(
							nvl(
								nvl(
									S0_T1.tdlv_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S0_T1.dlv_cd,
										nullValue()
									)
								),
								S0_T2.ship_to_id_cd
							).eq(S0_M4.ship_to_id_cd)
						)
					));
		
		MCSubQuery S0_M31_iv_trd_flg = subQuery().select(S0_M30.pr("iv_trd_flg")).from(subQuery()
				.select(max(S1.iv_trd_flg)
						.as("iv_trd_flg"),
						S1.fr_lg_grp_cd,
						S1.to_lg_grp_cd)
				.from(S1)
				.groupBy(S1.fr_lg_grp_cd,
						S1.to_lg_grp_cd)
				.view(S0_M30)
				.innerJoin(S0_M31).on(bracket(
						S0_M31.lg_grp_cd.eq(S0_M30.pr(S1.to_lg_grp_cd)))))
				.where(value(0).eq(value(0)).and(
						S0_T1.ship_fr_lg_grp_cd.eq(S0_M30.pr(S1.fr_lg_grp_cd)))
						.and(S0_M31.dlv_id_typ.eq(S0_T2.dlv_id_typ))
						.and(S0_M31.dlv_id_cd.eq(nvl(S0_T1.dlv_cd,S0_T2.dlv_id_cd))));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_SCHD_Query_S02")
					.mainQuery()
					.select(
						S0_T1.ship_schd_no,
						S0_T1.upd_cntr.as("ship_schd_upd_cntr"),
						S0_T1.ship_pr_no,
						S0_T2.upd_cntr.as("ship_pr_upd_cntr"),
						trunc(
							S0_T1.ship_schd_tm,
							MCDateFmt.DD
						).as("ship_schd_dt"),
						S0_T1.ship_schd_tm.as("ship_schd_hm"),
						trunc(
							S0_T1.dlv_schd_tm,
							MCDateFmt.DD
						).as("dlv_schd_dt"),
						S0_T1.dlv_schd_tm.as("dlv_schd_hm"),
						nullValue().as("ship_inst_dt"),
						nullValue().as("ship_inst_hm"),
						S0_T2.dlv_rqst_tm,
						S0_T1.ship_fr_lg_grp_cd,
						S0_T1.wg_cd,
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_lg_grp_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_lg_grp_cd,
									S0_T2.ship_to_lg_grp_cd
								),
								S0_T2.ship_to_lg_grp_cd
							)
						).as("ship_to_lg_grp_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
							S0_T2.ship_to_id_typ
						).as("ship_to_id_typ"),
						nvl(
							nvl(
								S0_T1.tdlv_cd,
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T1.dlv_cd,
									nullValue()
								)
							),
							S0_T2.ship_to_id_cd
						).as("ship_to_id_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							nvl(
								S0_T1.tdlv_nm,
								S0_M4_ship_to_id_nm
							),
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									nvl(
										S0_T1.dlv_nm,
										S0_M4_ship_to_id_nm
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M4_ship_to_id_nm
									)
								),
								nvl(
									S0_T2.ship_to_id_nm,
									S0_M4_ship_to_id_nm
								)
							)
						).as("ship_to_id_nm"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_zip_cd,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_zip_cd,
									S0_T2.ship_to_zip_cd
								),
								S0_T2.ship_to_zip_cd
							)
						).as("ship_to_zip_cd"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr1,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr1,
									S0_T2.ship_to_addr1
								),
								S0_T2.ship_to_addr1
							)
						).as("ship_to_addr1"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr2,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr2,
									S0_T2.ship_to_addr2
								),
								S0_T2.ship_to_addr2
							)
						).as("ship_to_addr2"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr3,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr3,
									S0_T2.ship_to_addr3
								),
								S0_T2.ship_to_addr3
							)
						).as("ship_to_addr3"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_addr4,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_addr4,
									S0_T2.ship_to_addr4
								),
								S0_T2.ship_to_addr4
							)
						).as("ship_to_addr4"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_dpt,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_dpt,
									S0_T2.ship_to_cntct_dpt
								),
								S0_T2.ship_to_cntct_dpt
							)
						).as("ship_to_cntct_dpt"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_cntct_psn,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_cntct_psn,
									S0_T2.ship_to_cntct_psn
								),
								S0_T2.ship_to_cntct_psn
							)
						).as("ship_to_cntct_psn"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_tel,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_tel,
									S0_T2.ship_to_tel
								),
								S0_T2.ship_to_tel
							)
						).as("ship_to_tel"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_fax,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_fax,
									S0_T2.ship_to_fax
								),
								S0_T2.ship_to_fax
							)
						).as("ship_to_fax"),
						nvl2(
							S0_T1.tdlv_cd,
							S0_T1.tdlv_sundry_flg,
							decode(
								S0_T2.ship_to_id_typ,
								value(MSC_SHIP_TO_ID_TYP.DLV.value()),
								nvl2(
									S0_T1.dlv_cd,
									S0_T1.dlv_sundry_flg,
									S0_T2.ship_to_sundry_flg
								),
								S0_T2.ship_to_sundry_flg
							)
						).as("ship_to_sundry_flg"),
						nvl(S0_T1.via_dlv_typ, S0_T2.via_dlv_typ).as("via_dlv_typ"),
						S0_T1.ship_term_cd,
						nvl(
							S0_M22.ship_wk_grp_cd,
							S0_M221.ship_wk_grp_cd
						).as("ship_wk_grp_cd"),
						decode(
							S0_M22.ship_wk_grp_cd,
							nullValue(),
							S0_M231.ship_wk_grp_nm,
							S0_M23.ship_wk_grp_nm
						).as("ship_wk_grp_nm"),
						S0_T1.ship_wk_cd,
						S0_T2.dlv_id_typ,
						nullValue().as("inst_usr_cd"),
						nullValue().as("inst_usr_nm"),
						nullValue().as("inst_dpt_cd"),
						nullValue().as("inst_dpt_nm"),
						nullValue().as("inst_rmrks"),
						nullValue().as("intr_rmrks"),
						nullValue().as("sub_char1"),
						nullValue().as("sub_char2"),
						nullValue().as("sub_char3"),
						nullValue().as("ship_inst_no"),
						value(false).as("pick_prnted_flg"),
						value(false).as("inst_prnted_flg"),
						value(false).as("dlv_prnted_flg"),
						value(false).as("adv_prnted_flg"),
						cases()
							.when(S0_T2.trd_ptn_typ.eq(value(MAC_TRD_PTN_TYP.PROV_RTN.value())))
								.then(value(false))
							.otherwise(S0_M31_iv_trd_flg).as("iv_trd_flg"),
						S0_T2.trd_ptn_typ,
						addDynamicSelect(DS0C_SHIP_TO_GRP),
						// this field is appended by sql coverter.
						S0_T2.xfr_schd_no.as("join_xfr_schd_no_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_pr_no.eq(S0_T2.ship_pr_no)
							)
						)
						.leftOuterJoin(S0_T6).on(
							bracket(
								S0_T2.slo_d_no.eq(S0_T6.slo_d_no)
							)
						)
						.leftOuterJoin(S0_T7).on(
							bracket(
								S0_T6.slo_no.eq(S0_T7.slo_no)
							)
						)
						.leftOuterJoin(S0_M22).on(
							bracket(
								S0_M22.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(
									S0_M22.to_lg_grp_cd.eq(nvl(
											nvl(
												S0_T1.tdlv_lg_grp_cd,
												decode(
													S0_T2.ship_to_id_typ,
													value(MSC_SHIP_TO_ID_TYP.DLV.value()),
													S0_T1.dlv_lg_grp_cd,
													nullValue()
												)
											),
											S0_T2.ship_to_lg_grp_cd
										)
									)
								)
								.and(S0_M22.ship_term_cd.eq(S0_T1.ship_term_cd))
							)
						)
						.leftOuterJoin(S0_M23).on(
							bracket(
								S0_M23.ship_wk_grp_cd.eq(S0_M22.ship_wk_grp_cd)
							)
						)
						.leftOuterJoin(S0_M221).on(
							bracket(
								S0_M221.fr_lg_grp_cd.eq(S0_T1.ship_fr_lg_grp_cd)
								.and(
									S0_M221.to_lg_grp_cd.eq(nvl2(
											S0_T1.tdlv_cd,
											S0_T1.tdlv_lg_grp_cd,
											decode(
												S0_T2.ship_to_id_typ,
												value(MSC_SHIP_TO_ID_TYP.DLV.value()),
												nvl2(
													S0_T1.dlv_cd,
													S0_T1.dlv_lg_grp_cd,
													S0_T2.ship_to_lg_grp_cd
												),
												S0_T2.ship_to_lg_grp_cd
											)
										)
									)
								)
								.and(S0_M221.ship_term_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_M231).on(
							bracket(
								S0_M231.ship_wk_grp_cd.eq(S0_M221.ship_wk_grp_cd)
							)
						)
						.leftOuterJoin(S0_M25).on(
							bracket(
								nvl(
									nvl(
										S0_T1.tdlv_cd,
										decode(
											S0_T2.ship_to_id_typ,
											value(MSC_SHIP_TO_ID_TYP.DLV.value()),
											S0_T1.dlv_cd,
											nullValue()
										)
									),
									S0_T2.ship_to_id_cd
								).eq(S0_M25.bp_cd)
							)
						)
						.innerJoin(S0_M99).on(
							bracket(
								S0_T1.ship_fr_lg_grp_cd.eq(S0_M99.lg_grp_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_SHIP_TO_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.ship_inst_d_no.isNull())
						.and(S0_T1.ship_block_flg.eq(value(false)))
						.and(S0_T1.ship_skip_flg.eq(value(false)))
						.and(S0_T1.ship_abl_flg.eq(value(true)))
						.and(S0_T1.abort_flg.eq(value(false)))
						.cutoff$and(
							bracket(
								bracket(
									bind("not_alloc_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.in(
											value(MAC_ALLOC_TYP.IMMED.value()),
											value(MAC_ALLOC_TYP.LATER.value())
										)
										.or(S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value())))
										.and(S0_T2.xfr_schd_no.isNotNull())
									)
									.and(S0_T1.alloc_qty.eq(value(0)))
								)
								.or(
									bind("part_alloc_flg_str").eq(value(true))
									.and(S0_T1.base_unit_qty.gt(S0_T1.alloc_qty))
									.and(S0_T1.alloc_qty.gt(value(0)))
								)
								.or(
									bind("all_alloc_flg_str").eq(value(true))
									.and(S0_T1.alloc_qty.eq(S0_T1.base_unit_qty))
								)
								.or(
									bind("alloc_invalid_flg_str").eq(value(true))
									.and(
										S0_T2.alloc_typ.eq(value(MAC_ALLOC_TYP.NON.value()))
										.and(S0_T2.xfr_schd_no.isNull())
										.or(S0_T2.alloc_typ.isNull())
									)
									.and(S0_T1.alloc_qty.eq(value(0)))
								)
							)
						)
						.and(S0_T2.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NON.value())))
						.and(S0_T2.ship_inst_typ.neq(value(MAC_SHIP_INST_TYP.NO_PICK.value())))
						.and(
							not(
								S0_T6.via_dlv_typ.eq(value(MAC_VIA_DLV_TYP.NOT_VIA.value()))
								.and(S0_T7.sls_basis_typ.eq(value(MAC_SLS_BASIS_TYP.SHIP_BASIS.value())))
								.and(S0_T7.iv_no.isNotNull())
								.and(
									notExists(
										subQuery()
										.select(nullValue())
										.from(S2_T_T1)
										.where(
											S0_T1.ship_schd_no.eq(S2_T_T1.ship_schd_no)
										)
									)
								)
							)
						)
						.cutoff$and(bind("tmp_pick_not_prnted_false").isNull())
						.cutoff$and(bind("tmp_inst_not_prnted_false").isNull())
						.cutoff$and(bind("tmp_dlv_not_prnted_false").isNull())
						.cutoff$and(bind("tmp_adv_not_prnted_false").isNull())
						.cutoff$and(S0_T1.ship_schd_tm.gte(bind("ship_schd_hm_fr")))
						.cutoff$and(S0_T1.ship_schd_tm.lte(bind("ship_schd_hm_to")))
						.cutoff$and(bind("ship_inst_hm_fr").isNull())
						.cutoff$and(bind("ship_inst_hm_to").isNull())
						.cutoff$and(S0_T1.ship_fr_lg_grp_cd.like(bind("lg_grp_cd")))
						.addDynamicPredicate()
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								value(MSC_SHIP_TO_ID_TYP.TDLV.value()),
								S0_T2.ship_to_id_typ
							).like(bind("ship_to_id_typ"))
						)
						.cutoff$and(
							nvl(
								nvl(
									S0_T1.tdlv_cd,
									decode(
										S0_T2.ship_to_id_typ,
										value(MSC_SHIP_TO_ID_TYP.DLV.value()),
										S0_T1.dlv_cd,
										nullValue()
									)
								),
								S0_T2.ship_to_id_cd
							).like(bind("ship_to_id_cd"))
						)
						.cutoff$and(
							nvl2(
								S0_T1.tdlv_cd,
								nvl(
									S0_T1.tdlv_nm,
									S0_M4_ship_to_id_nm
								),
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									nvl2(
										S0_T1.dlv_cd,
										nvl(
											S0_T1.dlv_nm,
											S0_M4_ship_to_id_nm
										),
										nvl(
											S0_T2.ship_to_id_nm,
											S0_M4_ship_to_id_nm
										)
									),
									nvl(
										S0_T2.ship_to_id_nm,
										S0_M4_ship_to_id_nm
									)
								)
							).like(bind("ship_to_id_nm"))
						)
						.cutoff$and(S0_T1.ship_term_cd.like(bind("ship_term_cd")))
						.cutoff$and(S0_T1.ship_wk_cd.like(bind("ship_wk_cd")))
						.cutoff$and(S0_T2.dlv_id_typ.like(bind("dlv_id_typ")))
						.cutoff$and(bind("inst_usr_cd").isNull())
						.cutoff$and(bind("inst_usr_nm").isNull())
						.cutoff$and(bind("inst_dpt_cd").isNull())
						.cutoff$and(bind("inst_dpt_nm").isNull())
						.cutoff$and(bind("ship_inst_no").isNull())
						.cutoff$and(bind("inst_rmrks").isNull())
						.cutoff$and(bind("intr_rmrks").isNull())
						.cutoff$and(bind("sub_char1").isNull())
						.cutoff$and(bind("sub_char2").isNull())
						.cutoff$and(bind("sub_char3").isNull())
						.addDynamicPredicate(DS0C_SHIP_TO_GRP)
					)
					.orderBy(
						S0_T1.ship_schd_tm.asc(),
						S0_T1.dlv_schd_tm.asc(),
						S0_T1.ship_schd_no.asc(),
						S0_T1.ship_fr_lg_grp_cd.asc(),
						S0_T2.ship_to_id_typ.asc(),
						nvl(
							nvl(
								S0_T1.tdlv_cd,
								decode(
									S0_T2.ship_to_id_typ,
									value(MSC_SHIP_TO_ID_TYP.DLV.value()),
									S0_T1.dlv_cd,
									nullValue()
								)
							),
							S0_T2.ship_to_id_cd
						).asc(),
						S0_T1.ship_term_cd.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.ship_fr_lg_grp_cd.eq(S0_M1.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.lg_grp_nm.like(bind("lg_grp_nm")))),
				when(boundOr("ship_wk_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T1.ship_wk_cd.eq(S0_M2.ship_wk_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.ship_wk_nm.like(bind("ship_wk_nm")))),
				when(boundOr("ship_term_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_T1.ship_term_cd.eq(S0_M3.ship_term_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.ship_term_nm.like(bind("ship_term_nm")))),
				when(boundOr("ship_to_grp_flg1"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd1.as("ship_to_grp_cd1"), S0_MM11.bp_grp_nm.as("ship_to_grp_nm1"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M25.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd1.like(bind("ship_to_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("ship_to_grp_nm1")))),
				when(boundOr("ship_to_grp_flg2"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd2.as("ship_to_grp_cd2"), S0_MM12.bp_grp_nm.as("ship_to_grp_nm2"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M25.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd2.like(bind("ship_to_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("ship_to_grp_nm2")))),
				when(boundOr("ship_to_grp_flg3"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd3.as("ship_to_grp_cd3"), S0_MM13.bp_grp_nm.as("ship_to_grp_nm3"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M25.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd3.like(bind("ship_to_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("ship_to_grp_nm3")))),
				when(boundOr("ship_to_grp_flg4"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd4.as("ship_to_grp_cd4"), S0_MM14.bp_grp_nm.as("ship_to_grp_nm4"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M25.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd4.like(bind("ship_to_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("ship_to_grp_nm4")))),
				when(boundOr("ship_to_grp_flg5"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd5.as("ship_to_grp_cd5"), S0_MM15.bp_grp_nm.as("ship_to_grp_nm5"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M25.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd5.like(bind("ship_to_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("ship_to_grp_nm5")))),
				when(boundOr("ship_to_grp_flg6"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd6.as("ship_to_grp_cd6"), S0_MM16.bp_grp_nm.as("ship_to_grp_nm6"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M25.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd6.like(bind("ship_to_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("ship_to_grp_nm6")))),
				when(boundOr("ship_to_grp_flg7"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd7.as("ship_to_grp_cd7"), S0_MM17.bp_grp_nm.as("ship_to_grp_nm7"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M25.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd7.like(bind("ship_to_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("ship_to_grp_nm7")))),
				when(boundOr("ship_to_grp_flg8"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd8.as("ship_to_grp_cd8"), S0_MM18.bp_grp_nm.as("ship_to_grp_nm8"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M25.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd8.like(bind("ship_to_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("ship_to_grp_nm8")))),
				when(boundOr("ship_to_grp_flg9"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd9.as("ship_to_grp_cd9"), S0_MM19.bp_grp_nm.as("ship_to_grp_nm9"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M25.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd9.like(bind("ship_to_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("ship_to_grp_nm9")))),
				when(boundOr("ship_to_grp_flg10"))
					.select(DS0C_SHIP_TO_GRP, S0_M25.bp_grp_cd10.as("ship_to_grp_cd10"), S0_MM110.bp_grp_nm.as("ship_to_grp_nm10"))
					.view(DS0C_SHIP_TO_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M25.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_SHIP_TO_GRP, p -> p.cutoff$and(S0_M25.bp_grp_cd10.like(bind("ship_to_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("ship_to_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_XFR_SCHD_R.class, r -> toCondition(
							r.getStringNE("join_xfr_schd_no_")
						))
						.addSelect(m -> toArray(
							m.xfr_src_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("xfr_src_typ", m.xfr_src_typ());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("ship_fr_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm,
							m.pick_list_flg,
							m.ship_inst_flg,
							m.ship_slip_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_fr_lg_grp_nm", m.lg_grp_nm());
							r.setBooleanNE("dlv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("adv_prnt_flg", m.ship_slip_flg());
							r.setBooleanNE("pick_prnt_flg", m.pick_list_flg());
							r.setBooleanNE("inst_prnt_flg", m.ship_inst_flg());
					}),
					j -> j
						.add(MAM_SHIP_WK_R.class, r -> toCondition(
							r.getStringNE("ship_wk_cd")
						))
						.addSelect(m -> toArray(
							m.ship_wk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ship_wk_nm", m.ship_wk_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSBEL1410_MST_SHIP_SCHD_Query_S03
	 */
	static MCQueryPlan MSBEL1410_MST_SHIP_SCHD_S03() {
		MSW_SHIP_SCHD_KEY_R S0_W1 = MSW_SHIP_SCHD_KEY_R.create("W1");
		MST_SHIP_SCHD_R S0_T1 = MST_SHIP_SCHD_R.create("T1");
		MST_SHIP_ALLOC_STS_R S0_T2 = MST_SHIP_ALLOC_STS_R.create("T2");
		MAVM_ITM_UNIT_R S0_M1 = MAVM_ITM_UNIT_R.create("M1");
		
		MCSubQuery S0_M1_unit_wt = subQuery().select(S0_M1.unit_wt).from(S0_M1).where(
				bracket(
						S0_M1.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M1.unit_cd.eq(S0_T2.ent_unit_cd))
					));
		
		MCSubQuery S0_M1_unit_dim = subQuery().select(S0_M1.unit_dim).from(S0_M1).where(
				bracket(
						S0_M1.itm_cd.eq(S0_T1.itm_cd)
						.and(S0_M1.itm_sub1.eq(S0_T1.itm_sub1))
						.and(S0_M1.itm_sub2.eq(S0_T1.itm_sub2))
						.and(S0_M1.itm_sub3.eq(S0_T1.itm_sub3))
						.and(S0_M1.unit_cd.eq(S0_T2.ent_unit_cd))
					));
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1410_MST_SHIP_SCHD_Query_S03")
					.mainQuery()
					.select(
						S0_T1.ship_schd_no,
						sum(
							nvl(
								S0_M1_unit_wt,
								value(0)
							).multiply(S0_T2.ent_unit_qty)
						).as("ship_wt"),
						sum(
							nvl(
								S0_M1_unit_dim,
								value(0)
							).multiply(S0_T2.ent_unit_qty)
						).as("ship_dim")
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.ship_schd_no.eq(S0_T1.ship_schd_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.ship_schd_no.eq(S0_T2.ship_schd_no)
							)
						)
					)
					.groupBy(S0_T1.ship_schd_no)
			);
	}
}