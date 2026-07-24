package mcframe.serverMSLA.MSLAL6210;

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
	 * -- MSLAL6210_MST_INPT_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL6210_MST_INPT_SCHD_S01() {
		MSW_OPER_INST_KEY_R S0_W1 = MSW_OPER_INST_KEY_R.create("W1");
		MST_INPT_SCHD_R S0_T1 = MST_INPT_SCHD_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_OPER_INST_R S0_T3 = MST_OPER_INST_R.create("T3");
		MST_ITM_MFG_INST_R S0_T4 = MST_ITM_MFG_INST_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MAM_SUNDRY_ITM_R S0_M13 = MAM_SUNDRY_ITM_R.create("M13");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6210_MST_INPT_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.inpt_schd_no,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T2.mfg_inst_rev,
						S0_T4.mfg_loc_cd,
						S0_T4.itm_cd.as("mfg_itm_cd"),
						S0_T4.itm_sub1.as("mfg_itm_sub1"),
						S0_T4.itm_sub2.as("mfg_itm_sub2"),
						S0_T4.itm_sub3.as("mfg_itm_sub3"),
						nvl(
							S0_M13.itm_nm,
							S0_M12.itm_nm
						).as("mfg_itm_nm"),
						S0_T3.oper_cd,
						S0_T3.oper_seq,
						S0_T1.schd_tm,
						S0_T1.alt_grp_cd,
						S0_T1.alt_grp_seq,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
						S0_T1.base_unit_inpt_qty,
						S0_T1.base_unit_rqmt_qty,
						S0_T1.base_unit_fxd_rqmt_qty,
						S0_T1.base_unit_cd,
						S0_T1.inpt_loc_cd,
						S0_T1.inpt_str_ln_cd,
						S0_T1.gd_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno1_null_flg,
						S0_T1.sno2,
						S0_T1.sno2_null_flg,
						S0_T1.sno3,
						S0_T1.sno3_null_flg,
						S0_T1.sno4,
						S0_T1.sno4_null_flg,
						S0_T1.alloc_sno1,
						S0_T1.alloc_sno2,
						S0_T1.alloc_sno3,
						S0_T1.alloc_sno4,
						S0_T1.bkf_typ,
						S0_T1.cont_inpt_qty,
						S0_T1.cont_rqmt_qty,
						S0_T1.cont_fxd_rqmt_qty,
						S0_T1.cont_fctr_unit_cd,
						S0_T1.std_cont_fctr,
						S0_T1.act_cont_fctr,
						S0_T1.prov_typ,
						S0_T1.disp_seq,
						S0_T1.lot_mix_flg,
						S0_T1.sublot_mix_flg,
						S0_T1.yield_calc_flg,
						S0_T1.alloc_flg,
						S0_T1.base_unit_alt_qty,
						S0_T1.alt_itm_fix_flg,
						S0_T1.alt_itm_typ,
						S0_T1.alt_alloc_prio,
						S0_T1.alt_itm_ratio,
						S0_T1.alloc_ctl_typ,
						S0_T1.inpt_ctl_typ,
						S0_T1.inpt_rsn_cd,
						S0_T2.abort_flg,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T1.can_flg
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T1.oper_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
								.and(S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T3.oper_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M2.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M2.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M2.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M2.itm_sub3))
								.and(
									nvl(
										S0_T1.alloc_sno1,
										S0_T1.sno1
									).eq(S0_M2.sno1)
								)
								.and(
									nvl(
										S0_T1.alloc_sno2,
										S0_T1.sno2
									).eq(S0_M2.sno2)
								)
								.and(
									nvl(
										S0_T1.alloc_sno3,
										S0_T1.sno3
									).eq(S0_M2.sno3)
								)
								.and(
									nvl(
										S0_T1.alloc_sno4,
										S0_T1.sno4
									).eq(S0_M2.sno4)
								)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M12.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M12.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M12.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M12.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M13.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M13.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M13.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M13.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M13.sno1))
								.and(S0_T4.sno2.eq(S0_M13.sno2))
								.and(S0_T4.sno3.eq(S0_M13.sno3))
								.and(S0_T4.sno4.eq(S0_M13.sno4))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_INPT_SCHD_PR_R.class, r -> toCondition(
							r.getStringNE("inpt_schd_no")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_loc_nm", m.loc_nm());
							r.setStringNE("join_wg_cd_", m.wg_cd());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("inpt_loc_cd"),
							r.getStringNE("inpt_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_ALT_GRP_R.class, r -> toCondition(
							r.getStringNE("alt_grp_cd"),
							r.getStringNE("join_wg_cd_")
						))
						.addSelect(m -> toArray(
							m.alt_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("alt_grp_nm", m.alt_grp_nm());
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
							r.getStringNE("inpt_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inpt_rsn_nm", m.biz_rsn_nm());
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
					})
				)
			);
	}
	
	/**
	 * -- MSLAL6210_MST_OPER_INST_Query_S01
	 */
	static MCQueryPlan MSLAL6210_MST_OPER_INST_S01() {
		MSW_OPER_INST_KEY_R S0_W1 = MSW_OPER_INST_KEY_R.create("W1");
		MST_OPER_INST_R S0_T1 = MST_OPER_INST_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_ITM_MFG_INST_R S0_T3 = MST_ITM_MFG_INST_R.create("T3");
		MSVT_OPER_INST_PR_R S0_T4 = MSVT_OPER_INST_PR_R.create("T4");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_SUNDRY_ITM_R S0_M7 = MAM_SUNDRY_ITM_R.create("M7");
		MAM_DPT_R S0_M15 = MAM_DPT_R.create("M15");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6210_MST_OPER_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T2.mfg_inst_rev,
						S0_T3.mfg_loc_cd,
						S0_T3.itm_cd.as("mfg_itm_cd"),
						S0_T3.itm_sub1.as("mfg_itm_sub1"),
						S0_T3.itm_sub2.as("mfg_itm_sub2"),
						S0_T3.itm_sub3.as("mfg_itm_sub3"),
						nvl(
							S0_M7.itm_nm,
							S0_M6.itm_nm
						).as("mfg_itm_nm"),
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T1.disp_seq,
						S0_T1.st_schd_tm,
						S0_T1.end_schd_tm,
						S0_T1.oper_loc_cd,
						S0_T1.oper_str_ln_cd,
						S0_T1.base_unit_qty,
						S0_T1.oper_std_qty,
						S0_T1.oper_conv_qty,
						nullValue().as("oper_unit_qty"),
						S0_T1.oper_unit_cd,
						S0_T1.oper_unit_conv_rnd_typ,
						S0_T1.oper_unit_dec_place,
						S0_T1.bkf_flg,
						S0_T1.wk_cost_calc_flg,
						S0_T1.usr_cd,
						S0_T1.oper_lower_yield,
						S0_T1.oper_std_yield,
						S0_T1.oper_upper_yield,
						S0_T1.wip_rate,
						S0_T1.yield_oper_flg,
						S0_T1.oper_rsrc,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T4.mfg_sts_typ,
						S0_T3.mfg_mtd_typ,
						S0_T3.oper_ptn,
						S0_T3.bom_ptn,
						S0_T3.lot_no,
						S0_T3.sublot_no,
						S0_T3.sno1,
						S0_T3.sno2,
						S0_T3.sno3,
						S0_T3.sno4,
						S0_T3.strg_loc_cd,
						S0_T3.strg_str_ln_cd,
						S0_T3.mfg_str_ln_cd,
						S0_T3.wg_cd,
						S0_T3.site_cd,
						S0_T3.itm_lower_yield,
						S0_T3.itm_std_yield,
						S0_T3.itm_upper_yield,
						S0_T2.base_unit_yield_qty,
						S0_T2.base_unit_inst_qty,
						S0_T2.base_unit_cd,
						S0_T2.st_schd_tm.as("mfg_st_schd_tm"),
						S0_T2.end_schd_tm.as("mfg_end_schd_tm"),
						S0_T2.inst_dt,
						S0_T2.inst_prnt_tm,
						S0_T2.inst_prnt_flg,
						S0_T2.aprv_flg,
						S0_T2.mfg_aprv_sts_typ,
						S0_T2.aprv_dt,
						S0_T2.aprv_dpt_cd,
						S0_M15.dpt_nm.as("aprv_dpt_nm"),
						S0_T2.aprv_usr_cd,
						S0_T2.aprv_rsn,
						S0_T2.disp_pd,
						S0_T2.inst_dpt_cd,
						S0_M17.dpt_nm.as("inst_dpt_nm"),
						S0_T2.inst_usr_cd,
						S0_T2.abort_flg,
						S0_T2.schd_chg_flg,
						S0_T2.mfg_inst_unit_typ,
						S0_T2.intr_rmrks.as("mfg_intr_rmrks"),
						S0_T2.inst_rpt_rmrks.as("mfg_inst_rpt_rmrks"),
						S0_T2.inst_po_cnt_rmrks,
						S0_T2.can_flg.as("mfg_inst_can_flg"),
						S0_T1.can_flg
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_T1.oper_inst_no.eq(S0_W1.oper_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T2.mfg_inst_no.eq(S0_T1.mfg_inst_no)
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_T3.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.oper_inst_no.eq(S0_T1.oper_inst_no)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T3.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T3.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T3.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T3.itm_sub3.eq(S0_M7.itm_sub3))
								.and(S0_T3.sno1.eq(S0_M7.sno1))
								.and(S0_T3.sno2.eq(S0_M7.sno2))
								.and(S0_T3.sno3.eq(S0_M7.sno3))
								.and(S0_T3.sno4.eq(S0_M7.sno4))
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_T2.aprv_dpt_cd.eq(S0_M15.dpt_cd)
								.and(S0_T2.aprv_dt.between(S0_M15.st_dt, S0_M15.end_dt))
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T2.inst_dpt_cd.eq(S0_M17.dpt_cd)
								.and(S0_T2.inst_dt.between(S0_M17.st_dt, S0_M17.end_dt))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("oper_loc_cd"),
							r.getStringNE("oper_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_str_ln_nm", m.str_ln_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("oper_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd"),
							r.getStringNE("mfg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
							r.setNumberNE("base_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("aprv_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("aprv_usr_nm", m.usr_nm());
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
	 * -- MSLAL6210_MST_YIELD_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL6210_MST_YIELD_SCHD_S01() {
		MSW_OPER_INST_KEY_R S0_W1 = MSW_OPER_INST_KEY_R.create("W1");
		MST_YIELD_SCHD_R S0_T1 = MST_YIELD_SCHD_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_OPER_INST_R S0_T3 = MST_OPER_INST_R.create("T3");
		MST_ITM_MFG_INST_R S0_T4 = MST_ITM_MFG_INST_R.create("T4");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_ITM_R S0_M9 = MAM_ITM_R.create("M9");
		MAM_SUNDRY_ITM_R S0_M10 = MAM_SUNDRY_ITM_R.create("M10");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6210_MST_YIELD_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.yield_schd_no,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T2.mfg_inst_rev,
						S0_T4.mfg_loc_cd,
						S0_T4.itm_cd.as("mfg_itm_cd"),
						S0_T4.itm_sub1.as("mfg_itm_sub1"),
						S0_T4.itm_sub2.as("mfg_itm_sub2"),
						S0_T4.itm_sub3.as("mfg_itm_sub3"),
						nvl(
							S0_M10.itm_nm,
							S0_M9.itm_nm
						).as("mfg_itm_nm"),
						S0_T3.oper_cd,
						S0_T3.oper_seq,
						S0_T1.yield_typ,
						S0_T1.schd_tm,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.trd_unit_yield_qty,
						S0_T1.trd_unit_cd,
						S0_T1.base_unit_yield_qty,
						S0_T1.base_unit_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.strg_loc_cd,
						S0_T1.strg_str_ln_cd,
						S0_T1.disp_seq,
						S0_T2.abort_flg,
						S0_T1.intr_rmrks,
						S0_T1.inst_rpt_rmrks,
						S0_T1.can_flg
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T1.oper_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
								.and(S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T3.oper_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
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
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M9.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M9.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M9.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M9.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M10.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M10.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M10.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M10.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M10.sno1))
								.and(S0_T4.sno2.eq(S0_M10.sno2))
								.and(S0_T4.sno3.eq(S0_M10.sno3))
								.and(S0_T4.sno4.eq(S0_M10.sno4))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_YIELD_SCHD_PR_R.class, r -> toCondition(
							r.getStringNE("yield_schd_no")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_STR_LN_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd"),
							r.getStringNE("strg_str_ln_cd")
						))
						.addSelect(m -> toArray(
							m.str_ln_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_str_ln_nm", m.str_ln_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					})
				)
			);
	}

	/**
	 * -- MSLAL6210_MST_WK_SCHD_Query_S01
	 */
	static MCQueryPlan MSLAL6210_MST_WK_SCHD_S01() {
		MSW_OPER_INST_KEY_R S0_W1 = MSW_OPER_INST_KEY_R.create("W1");
		MST_WK_SCHD_R S0_T1 = MST_WK_SCHD_R.create("T1");
		MST_MFG_INST_R S0_T2 = MST_MFG_INST_R.create("T2");
		MST_OPER_INST_R S0_T3 = MST_OPER_INST_R.create("T3");
		MST_ITM_MFG_INST_R S0_T4 = MST_ITM_MFG_INST_R.create("T4");
		MAM_ITM_R S0_M6 = MAM_ITM_R.create("M6");
		MAM_SUNDRY_ITM_R S0_M7 = MAM_SUNDRY_ITM_R.create("M7");
		
		return createQueryPlan()
			.setQuery(
				sql("MSLAL6210_MST_WK_SCHD_Query_S01")
					.mainQuery()
					.select(
						S0_T1.wk_schd_no,
						S0_T1.oper_inst_no,
						S0_T1.mfg_inst_no,
						S0_T2.mfg_inst_rev,
						S0_T4.mfg_loc_cd,
						S0_T4.itm_cd.as("mfg_itm_cd"),
						S0_T4.itm_sub1.as("mfg_itm_sub1"),
						S0_T4.itm_sub2.as("mfg_itm_sub2"),
						S0_T4.itm_sub3.as("mfg_itm_sub3"),
						nvl(
							S0_M7.itm_nm,
							S0_M6.itm_nm
						).as("mfg_itm_nm"),
						S0_T3.oper_cd,
						S0_T3.oper_seq,
						S0_T1.wk_cost_cd,
						S0_T1.wk_cost_calc_flg,
						S0_T1.fxd_wk_cost,
						S0_T1.wk_cost,
						S0_T1.disp_seq,
						S0_T2.abort_flg,
						S0_T1.intr_rmrks,
						S0_T1.can_flg
					)
					.from(
						S0_W1
						.innerJoin(S0_T1).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T1.oper_inst_no)
							)
						)
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.mfg_inst_no.eq(S0_T2.mfg_inst_no)
								.and(S0_T1.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
							)
						)
						.innerJoin(S0_T3).on(
							bracket(
								S0_W1.oper_inst_no.eq(S0_T3.oper_inst_no)
							)
						)
						.innerJoin(S0_T4).on(
							bracket(
								S0_T4.itm_mfg_inst_no.eq(S0_T1.itm_mfg_inst_no)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M6.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M6.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M6.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M6.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T4.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T4.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T4.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T4.itm_sub3.eq(S0_M7.itm_sub3))
								.and(S0_T4.sno1.eq(S0_M7.sno1))
								.and(S0_T4.sno2.eq(S0_M7.sno2))
								.and(S0_T4.sno3.eq(S0_M7.sno3))
								.and(S0_T4.sno4.eq(S0_M7.sno4))
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MSVT_WK_SCHD_PR_R.class, r -> toCondition(
							r.getStringNE("wk_schd_no")
						))
						.addSelect(m -> toArray(
							m.mfg_sts_typ
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_sts_typ", m.mfg_sts_typ());
					}),
					j -> j
						.add(MAM_OPER_R.class, r -> toCondition(
							r.getStringNE("oper_cd")
						))
						.addSelect(m -> toArray(
							m.oper_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("oper_nm", m.oper_nm());
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
						.add(MAM_WK_COST_R.class, r -> toCondition(
							r.getStringNE("wk_cost_cd")
						))
						.addSelect(m -> toArray(
							m.wk_cost_nm,
							m.wk_cost_unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wk_cost_nm", m.wk_cost_nm());
							r.setStringNE("wk_cost_unit_nm", m.wk_cost_unit_nm());
					})
				)
			);
	}
}
