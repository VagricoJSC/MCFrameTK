package mcframe.serverMSBF.MSBFL0060;

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
	 * -- MSBFL0060_MST_INSP_INST_Query_S01
	 */
	static MCQueryPlan MSBFL0060_MST_INSP_INST_S01() {
		MST_INSP_INST_R S0_T1 = MST_INSP_INST_R.create("T1");
		MST_INSP_ACT_R S0_T2 = MST_INSP_ACT_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MST_LOT_R S0_T3 = MST_LOT_R.create("T3");
		MCTempView S0_V1 = createTempView("V1");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_BP_R S0_M5 = MAM_BP_R.create("M5");
		MAM_BP_R S0_M6 = MAM_BP_R.create("M6");
		MAM_USR_R S0_M7 = MAM_USR_R.create("M7");
		MAM_DPT_R S0_M8 = MAM_DPT_R.create("M8");
		MAM_USR_R S0_M9 = MAM_USR_R.create("M9");
		MAM_DPT_R S0_M10 = MAM_DPT_R.create("M10");
		MAM_INSP_PTN_R S0_M13 = MAM_INSP_PTN_R.create("M13");
		MAM_SITE_R S0_M14 = MAM_SITE_R.create("M14");
		MAM_ITM_TYP_D_R S0_M15 = MAM_ITM_TYP_D_R.create("M15");
		MAM_USR_R S0_M16 = MAM_USR_R.create("M16");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		MAM_ITM_GRP_R S0_MM1 = MAM_ITM_GRP_R.create("MM1");
		MAM_ITM_GRP_R S0_MM2 = MAM_ITM_GRP_R.create("MM2");
		MAM_ITM_GRP_R S0_MM3 = MAM_ITM_GRP_R.create("MM3");
		MAM_ITM_GRP_R S0_MM4 = MAM_ITM_GRP_R.create("MM4");
		MAM_ITM_GRP_R S0_MM5 = MAM_ITM_GRP_R.create("MM5");
		MAM_ITM_GRP_R S0_MM6 = MAM_ITM_GRP_R.create("MM6");
		MAM_ITM_GRP_R S0_MM7 = MAM_ITM_GRP_R.create("MM7");
		MAM_ITM_GRP_R S0_MM8 = MAM_ITM_GRP_R.create("MM8");
		MAM_ITM_GRP_R S0_MM9 = MAM_ITM_GRP_R.create("MM9");
		MAM_ITM_GRP_R S0_MM10 = MAM_ITM_GRP_R.create("MM10");
		MAM_BP_GRP_R S0_MM_BP1 = MAM_BP_GRP_R.create("MM_BP1");
		MAM_BP_GRP_R S0_MM_BP2 = MAM_BP_GRP_R.create("MM_BP2");
		MAM_BP_GRP_R S0_MM_BP3 = MAM_BP_GRP_R.create("MM_BP3");
		MAM_BP_GRP_R S0_MM_BP4 = MAM_BP_GRP_R.create("MM_BP4");
		MAM_BP_GRP_R S0_MM_BP5 = MAM_BP_GRP_R.create("MM_BP5");
		MAM_BP_GRP_R S0_MM_BP6 = MAM_BP_GRP_R.create("MM_BP6");
		MAM_BP_GRP_R S0_MM_BP7 = MAM_BP_GRP_R.create("MM_BP7");
		MAM_BP_GRP_R S0_MM_BP8 = MAM_BP_GRP_R.create("MM_BP8");
		MAM_BP_GRP_R S0_MM_BP9 = MAM_BP_GRP_R.create("MM_BP9");
		MAM_BP_GRP_R S0_MM_BP10 = MAM_BP_GRP_R.create("MM_BP10");
		MST_INSP_SCHD_R S1_T4 = MST_INSP_SCHD_R.create("T4");
		MCTempView S0_V2 = createTempView("V2");
		MST_INSP_SCHD_R S2_T4 = MST_INSP_SCHD_R.create("T4");
		MST_STD_INSP_ACT_R S2_W1 = MST_STD_INSP_ACT_R.create("W1");
		MST_STD_INSP_ACT_R S3_W1 = MST_STD_INSP_ACT_R.create("W1");
		MST_STD_INSP_ACT_R S4_W1 = MST_STD_INSP_ACT_R.create("W1");
		MST_INSP_SCHD_R S5_T3 = MST_INSP_SCHD_R.create("T3");
		MAVM_RD_LOC_R S5_V2 = MAVM_RD_LOC_R.create("V2");
		MAVM_APRV_USR_R S6_V3 = MAVM_APRV_USR_R.create("V3");
		MAM_SCM_IF_CTL_R S0_M18 = MAM_SCM_IF_CTL_R.create("LIMS_CTLF1");
		MAM_SCM_IF_CTL_R S0_M19 = MAM_SCM_IF_CTL_R.create("LIMS_CTLF2");
		MAM_SCM_IF_CTL_R S0_M20 = MAM_SCM_IF_CTL_R.create("LIMS_CTLT1");
		MAM_SCM_IF_CTL_R S0_M21 = MAM_SCM_IF_CTL_R.create("LIMS_CTLT2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_SPPL_GRP = createDynamicSQLID("DS0C_SPPL_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0060_MST_INSP_INST_Query_S01")
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
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T3.ver_no,
						S0_T1.src_no1,
						S0_T1.src_no2,
						S0_T1.insp_freq,
						S0_T1.insp_ptn_cd,
						S0_T1.insp_mtd_typ,
						S0_T1.insp_typ,
						S0_T1.insp_sts_typ,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.pack_unit_qty.as("inst_pack_unit_qty"),
						S0_T1.pack_unit_cd.as("inst_pack_unit_cd"),
						S0_T1.base_unit_qty.as("inst_base_unit_qty"),
						S0_T1.base_unit_cd.as("inst_base_unit_cd"),
						S0_T2.base_unit_qty.as("act_ttl_qty"),
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
						S0_T1.inst_dt,
						trunc(
							S0_T1.st_tm,
							MCDateFmt.DD
						).as("inst_st_dt"),
						S0_T1.st_tm.as("inst_st_hm"),
						trunc(
							S0_T1.end_tm,
							MCDateFmt.DD
						).as("inst_end_dt"),
						S0_T1.end_tm.as("inst_end_hm"),
						S0_T1.master_dt,
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
						S0_T2.act_usr_cd,
						S0_T2.act_dpt_cd,
						S0_M8.dpt_nm.as("act_dpt_nm"),
						S0_T2.insp_judg_rslt_typ,
						S0_T2.judg_dt,
						S0_T2.judg_usr_cd,
						S0_T2.judg_dpt_cd,
						S0_M10.dpt_nm.as("judg_dpt_nm"),
						S0_T2.judg_rsn,
						S0_T2.dfct_rsn_cd,
						S0_T2.quality_typ,
						S0_T2.gd_cd,
						S0_V1.pr("smpl_inst_qty"),
						S0_V1.pr("loc_cd"),
						S0_T1.base_unit_cd.as("smpl_inst_unit_cd"),
						S0_M1.cont_fctr_flg,
						S0_M1.std_cont_fctr,
						S0_T1.act_cont_fctr,
						S0_T2.lmt_dt_frm_typ,
						S0_T3.vld_dt.as("vld_dt_now"),
						S0_T3.lmt_dt.as("lmt_dt_now"),
						S0_T1.lmt_up_flg,
						S0_M1.lmt_ctl_flg,
						S0_M1.lmt_ctl_categ,
						S0_T2.lmt_dt_frm,
						S0_T2.vld_dt,
						S0_T2.lmt_dt,
						S0_T1.insp_bind_typ,
						S0_T2.good_qty,
						S0_T2.dfct_qty,
						S0_T1.insp_std_no,
						S0_T2.intr_rmrks.as("act_intr_rmrks"),
						S0_T3.lot_rmrks,
						S0_T2.sub_char1,
						S0_T2.sub_char2,
						S0_T2.sub_char3,
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
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_V2.pr("in_prmt_insp_flg"),
						addDynamicSelect(DS0C_ITM_GRP),
						addDynamicSelect(DS0C_SPPL_GRP),
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
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_T3).on(
							bracket(
								S0_T1.itm_cd.eq(S0_T3.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_T3.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_T3.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_T3.itm_sub3))
								.and(S0_T1.lot_no.eq(S0_T3.lot_no))
								.and(
									bracket(
										MAC_STR$IS_NULL_VAL(S0_T1.sublot_no).eq(value(true))
										.and(
											S0_M1.sublot_mng_typ.in(
												value(MAC_SUBLOT_MNG_TYP.NOT_MNG.value()),
												value(MAC_SUBLOT_MNG_TYP.STK.value())
											)
										)
									)
									.or(S0_T3.sublot_no.eq(S0_T1.sublot_no))
								)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T4.insp_no,
								max(S1_T4.loc_cd).as("loc_cd"),
								sum(S1_T4.smpl_inst_qty).as("smpl_inst_qty")
							)
							.from(S1_T4)
							.groupBy(S1_T4.insp_no).view(S0_V1)
						).on(
							bracket(
								S0_T1.insp_no.eq(S0_V1.pr(S1_T4.insp_no))
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_T2.act_dpt_cd.eq(S0_M8.dpt_cd)
								.and(
									trunc(
										S0_T2.st_tm,
										MCDateFmt.DD
									).between(S0_M8.st_dt, S0_M8.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_T2.judg_dpt_cd.eq(S0_M10.dpt_cd)
								.and(
									trunc(
										S0_T2.st_tm,
										MCDateFmt.DD
									).between(S0_M10.st_dt, S0_M10.end_dt)
								)
							)
						)
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T1.inst_dpt_cd.eq(S0_M17.dpt_cd)
								.and(
									trunc(
										S0_T1.st_tm,
										MCDateFmt.DD
									).between(S0_M17.st_dt, S0_M17.end_dt)
								)
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S2_T4.insp_no,
								max(S2_T4.in_prmt_insp_flg).as("in_prmt_insp_flg")
							)
							.from(S2_T4)
							.groupBy(S2_T4.insp_no).view(S0_V2)
						).on(
							bracket(
								S0_T1.insp_no.eq(S0_V2.pr(S2_T4.insp_no))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_SPPL_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							value(1).eq(value(0))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_ord")))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_str")))
							.cutoff$or(S0_T1.insp_sts_typ.eq(bind("tmp_insp_sts_typ_cmpl")))
						)
						.cutoff$and(S0_T1.st_tm.gte(bind("inst_st_hm_fr")))
						.cutoff$and(S0_T1.st_tm.lte(bind("inst_st_hm_to")))
						.cutoff$and(S0_T1.end_tm.gte(bind("inst_end_hm_fr")))
						.cutoff$and(S0_T1.end_tm.lte(bind("inst_end_hm_to")))
						.cutoff$and(S0_T1.inst_dt.gte(bind("inst_dt_fr")))
						.cutoff$and(S0_T1.inst_dt.lte(bind("inst_dt_to")))
						.cutoff$and(S0_T2.judg_dt.gte(bind("judg_dt_fr")))
						.cutoff$and(S0_T2.judg_dt.lte(bind("judg_dt_to")))
						.cutoff$and(S0_T2.st_tm.gte(bind("st_hm_fr")))
						.cutoff$and(S0_T2.st_tm.lte(bind("st_hm_to")))
						.cutoff$and(S0_T2.end_tm.gte(bind("end_hm_fr")))
						.cutoff$and(S0_T2.end_tm.lte(bind("end_hm_to")))
						.cutoff$and(S0_T1.insp_rslt_prnt_tm.gte(bind("insp_rslt_prnt_tm_fr")))
						.cutoff$and(S0_T1.insp_rslt_prnt_tm.lte(bind("insp_rslt_prnt_tm_to")))
						.cutoff$and(
							nvl(
								S0_T2.upd_ts,
								S0_T1.upd_ts
							).gte(bind("upd_ts_fr"))
						)
						.cutoff$and(
							nvl(
								S0_T2.upd_ts,
								S0_T1.upd_ts
							).lte(bind("upd_ts_to"))
						)
						.cutoff$and(S0_T1.to_site_cd.like(bind("site_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.insp_typ.like(bind("insp_typ")))
						.cutoff$and(S0_T1.insp_mtd_typ.like(bind("insp_mtd_typ")))
						.cutoff$and(S0_T1.insp_ptn_cd.like(bind("insp_ptn_cd")))
						.cutoff$and(S0_T1.insp_aprv_sts_typ.like(bind("insp_aprv_sts_typ")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_T1.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(
							bracket(
								bracket(
									S0_M1.sublot_mng_typ.neq(value(MAC_SUBLOT_MNG_TYP.STK.value()))
									.and(S0_T1.sublot_no.like(bind("sublot_no")))
								)
								.or(
									S0_M1.sublot_mng_typ.eq(value(MAC_SUBLOT_MNG_TYP.STK.value()))
									.and(S0_T1.sublot_no.eq(value(MAC_STR.NULL_VAL.value())))
								)
							)
						)
						.cutoff$and(S0_T1.bp_lot_no.like(bind("bp_lot_no")))
						.cutoff$and(S0_T1.inst_usr_cd.like(bind("inst_usr_cd")))
						.cutoff$and(S0_T1.inst_dpt_cd.like(bind("inst_dpt_cd")))
						.cutoff$and(S0_M17.dpt_nm.like(bind("inst_dpt_nm")))
						.cutoff$and(S0_T2.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T2.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M8.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T2.judg_usr_cd.like(bind("judg_usr_cd")))
						.cutoff$and(S0_T2.judg_dpt_cd.like(bind("judg_dpt_cd")))
						.cutoff$and(S0_M10.dpt_nm.like(bind("judg_dpt_nm")))
						.cutoff$and(S0_T1.insp_no.like(bind("insp_no")))
						.cutoff$and(S0_T2.insp_act_no.like(bind("insp_act_no")))
						.cutoff$and(
							S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))
							.and(S0_T1.src_no1.like(bind("mfg_inst_no")))
						)
						.cutoff$and(
							S0_T1.insp_typ.eq(value(MSC_INSP_TYP.ACCPT.value()))
							.and(S0_T1.src_no1.like(bind("po_d_no")))
						)
						.cutoff$and(S0_T2.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.insp_rslt_prnt_flg.eq(bind("tmp_rslt_prnt_flg_cutoff")))
						.cutoff$and(
							S0_T1.insp_mtd_typ.eq(value(MAC_INSP_MTD_TYP.SPEC.value()))
							.and(
								exists(
									subQuery()
									.select(nullValue())
									.from(S2_W1)
									.where(
										S0_T1.insp_no.eq(S2_W1.insp_no)
									)
								)
							)
							.and(
								notExists(
									subQuery()
									.select(nullValue())
									.from(S3_W1)
									.where(
										S0_T1.insp_no.eq(S3_W1.insp_no)
										.and(S3_W1.cnf_flg.eq(bind("tmp_cnf_cmpl_flg_cutoff")))
									)
								)
							)
						)
						.cutoff$and(
							S0_T1.insp_mtd_typ.eq(value(MAC_INSP_MTD_TYP.SPEC.value()))
							.and(
								exists(
									subQuery()
									.select(nullValue())
									.from(S4_W1)
									.where(
										S0_T1.insp_no.eq(S4_W1.insp_no)
										.and(S4_W1.cnf_flg.eq(bind("tmp_cnf_not_cmpl_flg_cutoff")))
									)
								)
							)
						)
						.and(
							bracket(
								bind("ope_not_judg").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(
											S5_T3
											.innerJoin(S5_V2).on(
												bracket(
													S5_V2.loc_cd.eq(cases()
															.when(S5_T3.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value())))
																.then(S5_T3.mfg_loc_cd)
															.otherwise(S5_T3.loc_cd)
													)
												)
											)
										)
										.where(
											S0_T1.insp_no.eq(S5_T3.insp_no)
										)
									)
								)
							)
							.or(
								bind("ope_judg").eq(value(true))
								.and(
									exists(
										subQuery()
										.select(value("X"))
										.from(S6_V3)
										.where(
											S6_V3.aprv_role_cd.eq(S0_T1.insp_aprv_role_cd)
											.and(S6_V3.usr_cd.eq(bind("login_usr_cd")))
											.and(S6_V3.st_dt.lte(bind("dt")))
											.and(
												S6_V3.end_dt.isNull()
												.or(S6_V3.end_dt.gte(bind("dt")))
											)
										)
									)
								)
							)
						)
						.and(
							bracket(
								bind("tmp_lims_t").eq(value(true))
								.and(bind("tmp_lims_f").eq(value(true)))
							)
							.or(
								bind("tmp_lims_t").eq(value(true))
								.and(
									bracket(
										S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))
										.and(
											exists(
												subQuery().select(value(1)).from(S0_M18)
												.where(
													S0_M18.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.value()))
													.and(S0_M18.loc_cd.eq(S0_T1.mfg_loc_cd))
													.and(
														S0_M18.itm_cd.isNull()
														.or(
															S0_M18.itm_cd.eq(S0_T1.itm_cd)
															.and(S0_M18.itm_sub1.eq(S0_T1.itm_sub1))
															.and(S0_M18.itm_sub2.eq(S0_T1.itm_sub2))
															.and(S0_M18.itm_sub3.eq(S0_T1.itm_sub3))
														)
													)
													.and(bind("today").between(S0_M18.st_dt, S0_M18.end_dt))
													.and(S0_M18.del_flg.eq(value(false)))
													.cutoff$or(
														bracket(
															S0_T2.lims_flg.eq(value(true))
															.and(bind("tmp_lims_t").eq(value(true)))
														)
													)
												)
											)
										)
									)
									.or(
										S0_T1.insp_typ.neq(value(MSC_INSP_TYP.PRDCT.value()))
										.and(
											exists(
												subQuery().select(value(1))
												.from(S5_T3
													.innerJoin(S0_M19).on(
														S5_T3.loc_cd.eq(S0_M19.loc_cd)
														.and(S5_T3.insp_no.eq(S0_T1.insp_no))
														.and(S0_M19.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.value())))
														.and(
															S0_M19.itm_cd.isNull()
															.or(
																S0_M19.itm_cd.eq(S0_T1.itm_cd)
																.and(S0_M19.itm_sub1.eq(S0_T1.itm_sub1))
																.and(S0_M19.itm_sub2.eq(S0_T1.itm_sub2))
																.and(S0_M19.itm_sub3.eq(S0_T1.itm_sub3))
															)
														)
														.and(bind("today").between(S0_M19.st_dt, S0_M19.end_dt))
														.and(S0_M19.del_flg.eq(value(false)))
														.cutoff$or(
															bracket(
																S0_T2.lims_flg.eq(value(true))
																.and(bind("tmp_lims_t").eq(value(true)))
															)
														)
													)
												)
											)
										)
									)
								)
							)
							.or(
								bind("tmp_lims_f").eq(value(true))
								.and(
									bracket(
										S0_T1.insp_typ.eq(value(MSC_INSP_TYP.PRDCT.value()))
										.and(
											notExists(
												subQuery().select(value(1)).from(S0_M20)
												.where(
													S0_M20.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.value()))
													.and(S0_M20.loc_cd.eq(S0_T1.mfg_loc_cd))
													.and(
														S0_M20.itm_cd.isNull()
														.or(
															S0_M20.itm_cd.eq(S0_T1.itm_cd)
															.and(S0_M20.itm_sub1.eq(S0_T1.itm_sub1))
															.and(S0_M20.itm_sub2.eq(S0_T1.itm_sub2))
															.and(S0_M20.itm_sub3.eq(S0_T1.itm_sub3))
														)
													)
													.and(bind("today").between(S0_M20.st_dt, S0_M20.end_dt))
													.and(S0_M20.del_flg.eq(value(false)))
													.cutoff$or(
														bracket(
															S0_T2.lims_flg.eq(value(true))
															.and(bind("tmp_lims_f").eq(value(true)))
														)
													)
												)
											)
										)
									)
									.or(
										S0_T1.insp_typ.neq(value(MSC_INSP_TYP.PRDCT.value()))
										.and(
											notExists(
												subQuery().select(value(1))
												.from(S5_T3
													.innerJoin(S0_M21).on(
														S5_T3.loc_cd.eq(S0_M21.loc_cd)
														.and(S5_T3.insp_no.eq(S0_T1.insp_no))
														.and(S0_M21.if_proc_typ.eq(value(MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.value())))
														.and(
															S0_M21.itm_cd.isNull()
															.or(
																S0_M21.itm_cd.eq(S0_T1.itm_cd)
																.and(S0_M21.itm_sub1.eq(S0_T1.itm_sub1))
																.and(S0_M21.itm_sub2.eq(S0_T1.itm_sub2))
																.and(S0_M21.itm_sub3.eq(S0_T1.itm_sub3))
															)
														)
														.and(bind("today").between(S0_M21.st_dt, S0_M21.end_dt))
														.and(S0_M21.del_flg.eq(value(false)))
														.cutoff$or(
															bracket(
																S0_T2.lims_flg.eq(value(true))
																.and(bind("tmp_lims_f").eq(value(true)))
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
						.cutoff$and(S0_T2.ext_insp_act_no.like(bind("ext_insp_act_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_SPPL_GRP)
					)
					.orderBy(S0_T1.insp_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("sppl_grp_flg1", "sppl_grp_flg2", "sppl_grp_flg3", "sppl_grp_flg4", "sppl_grp_flg5", "sppl_grp_flg6", "sppl_grp_flg7", "sppl_grp_flg8", "sppl_grp_flg9", "sppl_grp_flg10", "sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_T1.sppl_cd.eq(S0_M5.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_T1.maker_cd.eq(S0_M6.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.bp_nm.like(bind("maker_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_T2.act_usr_cd.eq(S0_M7.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("judg_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T2.judg_usr_cd.eq(S0_M9.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.usr_nm.like(bind("judg_usr_nm")))),
				when(boundOr("insp_ptn_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.insp_ptn_cd.eq(S0_M13.insp_ptn_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.insp_ptn_nm.like(bind("insp_ptn_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T1.to_site_cd.eq(S0_M14.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.site_nm.like(bind("site_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M1.itm_typ.eq(S0_M15.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M15.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M15.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("inst_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_T1.inst_usr_cd.eq(S0_M16.usr_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.usr_nm.like(bind("inst_usr_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M1.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("sppl_grp_flg1"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd1.as("sppl_grp_cd1"), S0_MM_BP1.bp_grp_nm.as("sppl_grp_nm1"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP1).on(S0_M5.bp_grp_cd1.eq(S0_MM_BP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM_BP1.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd1.like(bind("sppl_grp_cd1"))).cutoff$and(S0_MM_BP1.bp_grp_nm.like(bind("sppl_grp_nm1")))),
				when(boundOr("sppl_grp_flg2"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd2.as("sppl_grp_cd2"), S0_MM_BP2.bp_grp_nm.as("sppl_grp_nm2"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP2).on(S0_M5.bp_grp_cd2.eq(S0_MM_BP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM_BP2.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd2.like(bind("sppl_grp_cd2"))).cutoff$and(S0_MM_BP2.bp_grp_nm.like(bind("sppl_grp_nm2")))),
				when(boundOr("sppl_grp_flg3"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd3.as("sppl_grp_cd3"), S0_MM_BP3.bp_grp_nm.as("sppl_grp_nm3"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP3).on(S0_M5.bp_grp_cd3.eq(S0_MM_BP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM_BP3.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd3.like(bind("sppl_grp_cd3"))).cutoff$and(S0_MM_BP3.bp_grp_nm.like(bind("sppl_grp_nm3")))),
				when(boundOr("sppl_grp_flg4"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd4.as("sppl_grp_cd4"), S0_MM_BP4.bp_grp_nm.as("sppl_grp_nm4"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP4).on(S0_M5.bp_grp_cd4.eq(S0_MM_BP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM_BP4.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd4.like(bind("sppl_grp_cd4"))).cutoff$and(S0_MM_BP4.bp_grp_nm.like(bind("sppl_grp_nm4")))),
				when(boundOr("sppl_grp_flg5"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd5.as("sppl_grp_cd5"), S0_MM_BP5.bp_grp_nm.as("sppl_grp_nm5"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP5).on(S0_M5.bp_grp_cd5.eq(S0_MM_BP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM_BP5.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd5.like(bind("sppl_grp_cd5"))).cutoff$and(S0_MM_BP5.bp_grp_nm.like(bind("sppl_grp_nm5")))),
				when(boundOr("sppl_grp_flg6"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd6.as("sppl_grp_cd6"), S0_MM_BP6.bp_grp_nm.as("sppl_grp_nm6"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP6).on(S0_M5.bp_grp_cd6.eq(S0_MM_BP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM_BP6.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd6.like(bind("sppl_grp_cd6"))).cutoff$and(S0_MM_BP6.bp_grp_nm.like(bind("sppl_grp_nm6")))),
				when(boundOr("sppl_grp_flg7"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd7.as("sppl_grp_cd7"), S0_MM_BP7.bp_grp_nm.as("sppl_grp_nm7"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP7).on(S0_M5.bp_grp_cd7.eq(S0_MM_BP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM_BP7.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd7.like(bind("sppl_grp_cd7"))).cutoff$and(S0_MM_BP7.bp_grp_nm.like(bind("sppl_grp_nm7")))),
				when(boundOr("sppl_grp_flg8"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd8.as("sppl_grp_cd8"), S0_MM_BP8.bp_grp_nm.as("sppl_grp_nm8"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP8).on(S0_M5.bp_grp_cd8.eq(S0_MM_BP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM_BP8.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd8.like(bind("sppl_grp_cd8"))).cutoff$and(S0_MM_BP8.bp_grp_nm.like(bind("sppl_grp_nm8")))),
				when(boundOr("sppl_grp_flg9"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd9.as("sppl_grp_cd9"), S0_MM_BP9.bp_grp_nm.as("sppl_grp_nm9"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP9).on(S0_M5.bp_grp_cd9.eq(S0_MM_BP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM_BP9.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd9.like(bind("sppl_grp_cd9"))).cutoff$and(S0_MM_BP9.bp_grp_nm.like(bind("sppl_grp_nm9")))),
				when(boundOr("sppl_grp_flg10"))
					.select(DS0C_SPPL_GRP, S0_M5.bp_grp_cd10.as("sppl_grp_cd10"), S0_MM_BP10.bp_grp_nm.as("sppl_grp_nm10"))
					.view(DS0C_SPPL_GRP, v -> v.leftOuterJoin(S0_MM_BP10).on(S0_M5.bp_grp_cd10.eq(S0_MM_BP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM_BP10.bp_grp_typ))))
					.predicate(DS0C_SPPL_GRP, p -> p.cutoff$and(S0_M5.bp_grp_cd10.like(bind("sppl_grp_cd10"))).cutoff$and(S0_MM_BP10.bp_grp_nm.like(bind("sppl_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("inst_pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_pack_unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("inst_base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("inst_base_unit_nm", m.unit_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.wg_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("wg_cd", m.wg_cd());
					}),
					j -> j
						.add(MAVM_ITM_UNIT_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("inst_pack_unit_cd")
						))
						.addSelect(m -> toArray(
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("inst_pack_unit_dec_place", m.dec_place());
							r.setStringNE("inst_pack_unit_rnd_typ", m.rnd_typ());
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
							r.setNumberNE("inst_base_unit_dec_place", m.dec_place());
							r.setStringNE("inst_base_unit_rnd_typ", m.rnd_typ());
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