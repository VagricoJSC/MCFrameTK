package mcframe.serverMSBF.MSBFL0070;

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
	 * -- MSBFL0070_MST_INSP_ACT_D_Query_S01
	 */
	static MCQueryPlan MSBFL0070_MST_INSP_ACT_D_S01() {
		MST_INSP_ACT_D_R S0_T1 = MST_INSP_ACT_D_R.create("T1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0070_MST_INSP_ACT_D_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_T1.loc_cd,
						S0_T1.str_ln_cd,
						S0_T1.stk_arrv_bp_cd,
						S0_T1.gd_cd,
						S0_T1.quality_typ,
						S0_T1.stk_insp_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.fix_no_typ,
						S0_T1.fix_no,
						nullValue().as("stk_pack_unit_qty"),
						nullValue().as("stk_pack_unit_cd"),
						nullValue().as("stk_pack_unit_nm"),
						nullValue().as("stk_pack_unit_dec_place"),
						nullValue().as("stk_pack_unit_rnd_typ"),
						nullValue().as("stk_base_unit_qty"),
						nullValue().as("stk_base_unit_cd"),
						nullValue().as("stk_base_unit_nm"),
						nullValue().as("stk_base_unit_dec_place"),
						nullValue().as("stk_base_unit_rnd_typ"),
						S0_T1.pack_unit_qty,
						S0_T1.pack_unit_cd,
						S0_T1.base_unit_qty,
						S0_T1.base_unit_cd,
						S0_T1.pack_xfr_pack_unit_qty,
						S0_T1.pack_xfr_pack_unit_cd,
						S0_T1.pack_xfr_base_unit_qty,
						S0_T1.pack_xfr_base_unit_cd,
						S0_T1.dfct_rsn_cd,
						S0_T1.ac_dt,
						S0_T1.insp_act_d_no,
						nullValue().as("insp_judg_d_no"),
						S0_T1.insp_act_no,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.lims_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_insp_act_d_no
					)
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_act_no.eq(bind("insp_act_no")))
					)
					.orderBy(
						S0_T1.ac_dt.asc(),
						S0_T1.loc_cd.asc(),
						S0_T1.str_ln_cd.asc(),
						S0_T1.stk_arrv_bp_cd.asc(),
						S0_T1.quality_typ.asc(),
						S0_T1.gd_cd.asc(),
						S0_T1.dfct_rsn_cd.asc()
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.str_ln_tgt_flg,
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setStringNE("wg_cd", m.wg_cd());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
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
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
							r.getStringNE("pack_xfr_pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_xfr_pack_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_xfr_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_xfr_base_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dfct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dfct_rsn_nm", m.biz_rsn_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
							r.setNumberNE("pack_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("pack_unit_conv_qty", m.conv_qty());
							r.setStringNE("pack_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_xfr_pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.conv_base_qty,
							m.conv_qty,
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_xfr_pack_unit_dec_place", m.dec_place());
							r.setNumberNE("pack_xfr_pack_unit_dmn_qty", m.conv_base_qty());
							r.setNumberNE("pack_xfr_pack_unit_conv_qty", m.conv_qty());
							r.setStringNE("pack_xfr_pack_unit_rnd_typ", m.rnd_typ());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("pack_xfr_base_unit_dec_place", m.dec_place());
							r.setStringNE("pack_xfr_base_unit_rnd_typ", m.rnd_typ());
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
	 * -- MSBFL0070_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0070_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MST_INSP_ACT_R S0_T2 = MST_INSP_ACT_R.create("T2");
		MCTempView S0_V1 = createTempView("V1");
		MAM_DPT_R S0_M7 = MAM_DPT_R.create("M7");
		MAM_DPT_R S0_M9 = MAM_DPT_R.create("M9");
		MAM_ITM_R S0_M12 = MAM_ITM_R.create("M12");
		MST_INSP_SCHD_R S1_T5 = MST_INSP_SCHD_R.create("T5");
		MAVM_RD_LOC_R S2_V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S2_T4 = MST_INSP_SCHD_R.create("T4");
		MAVM_APRV_USR_R S3_V2 = MAVM_APRV_USR_R.create("V2");
		MAVM_RD_LOC_R S4_V1 = MAVM_RD_LOC_R.create("V1");
		MST_INSP_SCHD_R S4_T4 = MST_INSP_SCHD_R.create("T4");
		MAVM_APRV_USR_R S5_V2 = MAVM_APRV_USR_R.create("V2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0070_MST_INSP_INST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.insp_no,
						S0_T2.insp_act_no,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_T1.itm_nm,
							S0_M12.itm_nm
						).as("itm_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.insp_freq,
						S0_T1.insp_ptn_cd,
						S0_T1.insp_mtd_typ,
						S0_T1.insp_typ,
						S0_T1.insp_sts_typ,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.pack_unit_qty.as("inst_pack_unit_qty"),
						S0_T1.pack_unit_cd,
						S0_T1.base_unit_qty.as("inst_base_unit_qty"),
						nullValue().as("rem_base_unit_qty"),
						S0_T1.base_unit_cd,
						S0_T2.good_qty,
						S0_T2.dfct_qty,
						S0_T2.base_unit_qty.as("act_ttl_qty"),
						nullValue().as("judg_ttl_qty"),
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.to_site_cd,
						S0_T1.bp_lot_no,
						value(false).as("std_insp_flg"),
						S0_T1.std_req_flg,
						S0_T1.std_cnf_req_flg,
						value(false).as("std_cmpl_flg"),
						value(false).as("std_cnf_cmpl_flg"),
						S0_T1.insp_rslt_prnt_flg,
						S0_T1.insp_rslt_prnt_tm,
						trunc(
							S0_T2.st_tm,
							MCDateFmt.DD
						).as("st_dt"),
						S0_T2.st_tm.as("st_hm"),
						trunc(
							S0_T2.end_tm,
							MCDateFmt.DD
						).as("end_dt"),
						S0_T2.end_tm.as("end_hm"),
						S0_T1.master_dt,
						S0_T2.act_usr_cd,
						S0_T2.act_dpt_cd,
						S0_M7.dpt_nm.as("act_dpt_nm"),
						S0_T2.insp_judg_rslt_typ,
						S0_T2.judg_dt,
						S0_T2.judg_usr_cd,
						S0_T2.judg_dpt_cd,
						S0_M9.dpt_nm.as("judg_dpt_nm"),
						S0_T2.judg_rsn,
						S0_T2.dfct_rsn_cd,
						S0_T2.quality_typ,
						S0_T2.gd_cd,
						S0_V1.pr("smpl_inst_qty").as("smpl_inst_qty"),
						S0_T1.base_unit_cd.as("smpl_inst_unit_cd"),
						S0_M12.std_cont_fctr,
						S0_T1.act_cont_fctr,
						nullValue().as("vld_pd"),
						nullValue().as("lmt_pd"),
						nullValue().as("calc_pd_typ"),
						S0_T2.lmt_dt_frm_typ,
						S0_T1.lmt_up_flg,
						S0_M12.lmt_ctl_flg,
						S0_M12.lmt_ctl_categ,
						S0_T2.lmt_dt_frm,
						S0_T2.vld_dt,
						S0_T2.lmt_dt,
						S0_T2.intr_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
						S0_M12.cont_fctr_flg,
						nvl(
							S0_T2.ins_usr_id,
							S0_T1.ins_usr_id
						).as("ins_usr_id"),
						nvl(
							S0_T2.ins_usr_nm,
							S0_T1.ins_usr_nm
						).as("ins_usr_nm"),
						nvl(
							S0_T2.ins_func_id,
							S0_T1.ins_func_id
						).as("ins_func_id"),
						nvl(
							S0_T2.ins_ts,
							S0_T1.ins_ts
						).as("ins_ts"),
						nvl(
							S0_T2.upd_usr_id,
							S0_T1.upd_usr_id
						).as("upd_usr_id"),
						nvl(
							S0_T2.upd_usr_nm,
							S0_T1.upd_usr_nm
						).as("upd_usr_nm"),
						nvl(
							S0_T2.upd_func_id,
							S0_T1.upd_func_id
						).as("upd_func_id"),
						nvl(
							S0_T2.upd_ts,
							S0_T1.upd_ts
						).as("upd_ts"),
						nvl(
							S0_T2.upd_srv_req_no,
							S0_T1.upd_srv_req_no
						).as("upd_srv_req_no"),
						S0_T1.upd_cntr.as("inst_upd_cntr"),
						S0_T2.upd_cntr.as("act_upd_cntr"),
						S0_V1.pr("in_prmt_insp_flg"),
						S0_T2.lims_flg,
						S0_T2.ext_sys_cd,
						S0_T2.ext_insp_act_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T1.insp_no.eq(S0_T2.insp_no)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T5.insp_no,
								sum(S1_T5.smpl_inst_qty).as("smpl_inst_qty"),
								max(S1_T5.in_prmt_insp_flg).as("in_prmt_insp_flg")
							)
							.from(S1_T5)
							.groupBy(S1_T5.insp_no).view(S0_V1)
						).on(
							bracket(
								S0_T1.insp_no.eq(S0_V1.pr(S1_T5.insp_no))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.act_dpt_cd.eq(S0_M7.dpt_cd)
								.and(
									trunc(
										S0_T2.st_tm,
										MCDateFmt.DD
									).between(S0_M7.st_dt, S0_M7.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_T2.judg_dpt_cd.eq(S0_M9.dpt_cd)
								.and(
									trunc(
										S0_T2.st_tm,
										MCDateFmt.DD
									).between(S0_M9.st_dt, S0_M9.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M12.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M12.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M12.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M12.itm_sub3))
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.insp_no.eq(bind("insp_no")))
						.and(
							bracket(
								bind("ope_val").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S2_V1
											.leftOuterJoin(S2_T4).on(
												bracket(
													S0_T1.insp_no.eq(S2_T4.insp_no)
												)
											)
										)
										.where(
											S2_V1.loc_cd.eq(cases()
													.when(S2_T4.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
														.then(S2_T4.mfg_loc_cd)
													.otherwise(S2_T4.loc_cd)
											)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value("2"))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S3_V2)
										.where(
											S3_V2.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
											.and(S3_V2.usr_cd.eq(bind("login_usr_cd")))
											.and(S3_V2.st_dt.lte(bind("dt")))
											.and(
												S3_V2.end_dt.isNull()
												.or(S3_V2.end_dt.gte(bind("dt")))
											)
										)
									)
								)
							)
							.or(
								bind("ope_val").eq(value("3"))
								.and(
									bracket(
										bracket(
											S0_T1.insp_aprv_sts_typ.isNull()
											.or(S0_T1.insp_aprv_sts_typ.neq(value(MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value())))
										)
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(
													S4_V1
													.leftOuterJoin(S4_T4).on(
														bracket(
															S0_T1.insp_no.eq(S4_T4.insp_no)
														)
													)
												)
												.where(
													S4_V1.loc_cd.eq(cases()
															.when(S4_T4.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
																.then(S4_T4.mfg_loc_cd)
															.otherwise(S4_T4.loc_cd)
													)
												)
											)
										)
									)
									.or(
										S0_T1.insp_aprv_sts_typ.eq(value(MSC_INSP_APRV_STS_TYP.JUDG_ACPT.value()))
										.and(
											exists(
												subQuery()
												.select(value("X"))
												.from(S5_V2)
												.where(
													S5_V2.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
													.and(S5_V2.usr_cd.eq(bind("login_usr_cd")))
													.and(S5_V2.st_dt.lte(bind("dt")))
													.and(
														S5_V2.end_dt.isNull()
														.or(S5_V2.end_dt.gte(bind("dt")))
													)
												)
											)
										)
									)
								)
							)
						)
					)
			)
			.setJoinInfo(
				joinInfo(
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
							m.lmt_dt,
							m.lot_rmrks,
							m.ver_no,
							m.vld_dt
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
							r.setDateNE("vld_dt_now", m.vld_dt());
							r.setDateNE("lmt_dt_now", m.lmt_dt());
							r.setStringNE("lot_rmrks", m.lot_rmrks());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("pack_unit_nm", m.unit_nm());
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
							r.setStringNE("smpl_inst_unit_nm", m.unit_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("sppl_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("sppl_nm", m.bp_nm());
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
						.add(MAM_USR_R.class, r -> toCondition(
							r.getStringNE("judg_usr_cd")
						))
						.addSelect(m -> toArray(
							m.usr_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("judg_usr_nm", m.usr_nm());
					}),
					j -> j
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("dfct_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dfct_rsn_nm", m.biz_rsn_nm());
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
						.add(MAM_INSP_PTN_R.class, r -> toCondition(
							r.getStringNE("insp_ptn_cd")
						))
						.addSelect(m -> toArray(
							m.insp_ptn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("insp_ptn_nm", m.insp_ptn_nm());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("to_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("to_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
					}),
					j -> j
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("base_unit_dec_place", m.dec_place());
							r.setStringNE("base_unit_rnd_typ", m.rnd_typ());
							r.setNumberNE("smpl_inst_unit_dec_place", m.dec_place());
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
}