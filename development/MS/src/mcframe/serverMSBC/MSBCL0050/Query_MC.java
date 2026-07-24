package mcframe.serverMSBC.MSBCL0050;

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
	 * -- MSBCL0050_MST_ITM_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0050_MST_ITM_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MAVM_RD_LOC_R S0_M = MAVM_RD_LOC_R.create("M");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M21 = MAM_SUNDRY_ITM_R.create("M21");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_SITE_R S0_M5 = MAM_SITE_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S0_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S0_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_SITE_R S0_M10 = MAM_SITE_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_LOC_R S0_M14 = MAM_LOC_R.create("M14");
		MAM_SITE_R S0_M15 = MAM_SITE_R.create("M15");
		MAM_LOC_GRP_R S0_M16 = MAM_LOC_GRP_R.create("M16");
		MAM_WG_R S0_M17 = MAM_WG_R.create("M17");
		MAM_WG_R S0_M18 = MAM_WG_R.create("M18");
		MAM_ITM_TYP_D_R S0_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
		MAM_EXT_SYS_R S0_M22 = MAM_EXT_SYS_R.create("M22");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0050_MST_ITM_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_ord_no,
						S0_T1.itm_ord_typ,
						S0_T1.itm_ord_sts_typ,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M21.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
						S0_T1.inst_qty,
						S0_T1.yield_schd_qty,
						S0_M1.dec_place,
						S0_M1.rnd_typ,
						S0_M1.unit_cd.as("base_unit_cd"),
						S0_T1.oper_ptn,
						S0_T1.bom_ptn,
						S0_T1.nmr_qty,
						S0_T1.dnm_qty,
						S0_T1.fxd_yield_qty,
						S0_M1.cont_fctr_flg,
						S0_M1.cont_fctr_unit_cd,
						S0_M1.std_cont_fctr,
						S0_M1.cont_fctr_rnd_typ,
						S0_M1.cont_fctr_dec_place,
						S0_T1.master_dt,
						S0_T1.po_schd_dt,
						S0_T1.purc_lt,
						S0_T1.mfg_st_schd_dt,
						S0_T1.mfg_lt,
						S0_T1.mfg_end_schd_dt,
						S0_T1.gi_schd_dt,
						S0_T1.xfr_lt,
						S0_T1.strg_schd_dt,
						S0_T1.accpt_insp_lt,
						S0_T1.accpt_schd_dt,
						S0_T1.insp_st_schd_dt,
						S0_T1.insp_lt,
						S0_T1.insp_offst,
						S0_T1.insp_end_schd_dt,
						S0_T1.avl_schd_dt,
						S0_T1.strg_loc_cd,
						S0_T1.wg_cd,
						S0_T1.mfg_loc_cd,
						S0_T1.sppl_cd,
						S0_T1.maker_cd,
						S0_T1.rqst_loc_cd,
						S0_T1.rqst_wg_cd.as("rqst_wg_cd"),
						S0_T1.rqmt_no,
						S0_T1.io_schd_pr_no,
						S0_T1.sno1,
						S0_T1.sno2,
						S0_T1.sno3,
						S0_T1.sno4,
						S0_T1.ord_gnrt_typ,
						S0_T1.sim_mrp_no,
						decode(
							S0_M20.itm_cd,
							nullValue(),
							S0_T1.not_fix_flg,
							value(true)
						).as("not_fix_flg"),
						S0_T1.inst_po_cnt_rmrks,
						S0_T1.intr_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_cntr.as("itm_order_upd_cntr"),
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T1.ord_rcv_flg,
						S0_T1.ord_snd_flg,
						S0_T1.ext_sys_cd,
						S0_T1.ext_itm_ord_no,
						S0_T1.for_scheduler_frozen_flg,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_M).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M.loc_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M21.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M21.sno1))
								.and(S0_T1.sno2.eq(S0_M21.sno2))
								.and(S0_T1.sno3.eq(S0_M21.sno3))
								.and(S0_T1.sno4.eq(S0_M21.sno4))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M20.sno1))
								.and(S0_T1.sno2.eq(S0_M20.sno2))
								.and(S0_T1.sno3.eq(S0_M20.sno3))
								.and(S0_T1.sno4.eq(S0_M20.sno4))
								.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
								.and(S0_M20.del_flg.eq(value(false)))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T1.ord_gnrt_typ).eq(value(false)))
						.and(
							S0_T1.itm_ord_typ.in(
								bind("wk_mfg"),
								bind("wk_purc"),
								bind("wk_outsrc"),
								bind("wk_xfr"),
								bind("wk_wg_xfr")
							)
						)
						.and(
							S0_T1.itm_ord_sts_typ.in(
								bind("wk_opn"),
								bind("wk_sav"),
								bind("wk_fix"),
								bind("wk_part_inst"),
								bind("wk_inst"),
								bind("wk_cmpl")
							)
						)
						.cutoff$and(S0_T1.po_schd_dt.gte(bind("po_schd_dt_fr")))
						.cutoff$and(S0_T1.po_schd_dt.lte(bind("po_schd_dt_to")))
						.cutoff$and(S0_T1.mfg_st_schd_dt.gte(bind("mfg_st_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_st_schd_dt.lte(bind("mfg_st_schd_dt_to")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.gte(bind("mfg_end_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.lte(bind("mfg_end_schd_dt_to")))
						.cutoff$and(S0_T1.gi_schd_dt.gte(bind("gi_schd_dt_fr")))
						.cutoff$and(S0_T1.gi_schd_dt.lte(bind("gi_schd_dt_to")))
						.cutoff$and(S0_T1.strg_schd_dt.gte(bind("strg_schd_dt_fr")))
						.cutoff$and(S0_T1.strg_schd_dt.lte(bind("strg_schd_dt_to")))
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(S0_T1.insp_st_schd_dt.gte(bind("insp_st_schd_dt_fr")))
						.cutoff$and(S0_T1.insp_st_schd_dt.lte(bind("insp_st_schd_dt_to")))
						.cutoff$and(S0_T1.insp_end_schd_dt.gte(bind("insp_end_schd_dt_fr")))
						.cutoff$and(S0_T1.insp_end_schd_dt.lte(bind("insp_end_schd_dt_to")))
						.cutoff$and(S0_T1.avl_schd_dt.gte(bind("avl_schd_dt_fr")))
						.cutoff$and(S0_T1.avl_schd_dt.lte(bind("avl_schd_dt_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.rqst_loc_cd.like(bind("rqst_loc_cd")))
						.cutoff$and(S0_T1.rqst_wg_cd.like(bind("rqst_wg_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M21.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.ord_gnrt_typ.like(bind("ord_gnrt_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.rqmt_no.like(bind("rqmt_no")))
						.cutoff$and(S0_T1.sim_mrp_no.like(bind("sim_mrp_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T1.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T1.ext_itm_ord_no.like(bind("ext_itm_ord_no")))
						.cutoff$and(
							decode(
								S0_M20.itm_cd,
								nullValue(),
								S0_T1.not_fix_flg,
								value(true)
							).eq(bind("wk_not_fix_flg"))
						)
						.cutoff$and(S0_T1.ord_rcv_flg.eq(bind("wk_ord_rcv_tgt_flg")))
						.cutoff$and(S0_T1.ord_snd_flg.eq(bind("wk_ord_snd_tgt_flg")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(S0_T1.itm_ord_no.asc())
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T2).on(bracket(S0_T2.sno1.eq(S0_T1.sno1))))
					.predicate(p -> p.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_site_nm", "strg_lg_grp_nm", "strg_alloc_grp_nm", "strg_loc_grp_nm", "strg_loc_nm", "strg_site_cd", "strg_lg_grp_cd", "strg_alloc_grp_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.strg_loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_M4.site_cd.like(bind("strg_site_cd"))).cutoff$and(S0_M4.lg_grp_cd.like(bind("strg_lg_grp_cd"))).cutoff$and(S0_M4.alloc_grp_cd.like(bind("strg_alloc_grp_cd"))).cutoff$and(S0_M4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("strg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M4.site_cd.eq(S0_M5.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.site_nm.like(bind("strg_site_nm")))),
				when(boundOr("strg_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M4.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("strg_lg_grp_nm")))),
				when(boundOr("strg_alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M4.alloc_grp_cd.eq(S0_M7.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.alloc_grp_nm.like(bind("strg_alloc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M4.loc_grp_cd.eq(S0_M8.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("mfg_site_nm", "mfg_loc_grp_nm", "mfg_loc_nm", "mfg_site_cd", "mfg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M9.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.loc_nm.like(bind("mfg_loc_nm"))).cutoff$and(S0_M9.site_cd.like(bind("mfg_site_cd"))).cutoff$and(S0_M9.loc_grp_cd.like(bind("mfg_loc_grp_cd")))),
				when(boundOr("mfg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M9.site_cd.eq(S0_M10.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.site_nm.like(bind("mfg_site_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M9.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.sppl_cd.eq(S0_M12.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.maker_cd.eq(S0_M13.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.bp_nm.like(bind("maker_nm")))),
				when(boundOr("rqst_site_nm", "rqst_loc_grp_nm", "rqst_loc_nm", "rqst_site_cd", "rqst_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T1.rqst_loc_cd.eq(S0_M14.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.loc_nm.like(bind("rqst_loc_nm"))).cutoff$and(S0_M14.site_cd.like(bind("rqst_site_cd"))).cutoff$and(S0_M14.loc_grp_cd.like(bind("rqst_loc_grp_cd")))),
				when(boundOr("rqst_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M14.site_cd.eq(S0_M15.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.site_nm.like(bind("rqst_site_nm")))),
				when(boundOr("rqst_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_M14.loc_grp_cd.eq(S0_M16.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.loc_grp_nm.like(bind("rqst_loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.wg_cd.eq(S0_M17.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.wg_nm.like(bind("wg_nm")))),
				when(boundOr("rqst_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_T1.rqst_wg_cd.eq(S0_M18.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.wg_nm.like(bind("rqst_wg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M1.itm_typ.eq(S0_M19.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M19.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(v -> v.leftOuterJoin(S0_M22).on(bracket(S0_T1.ext_sys_cd.eq(S0_M22.ext_sys_cd))))
					.predicate(p -> p.cutoff$and(S0_M22.ext_sys_nm.like(bind("ext_sys_nm")))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("strg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_nm", m.loc_nm());
							r.setStringNE("strg_site_cd", m.site_cd());
							r.setStringNE("strg_lg_grp_cd", m.lg_grp_cd());
							r.setStringNE("strg_alloc_grp_cd", m.alloc_grp_cd());
							r.setStringNE("strg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("strg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LG_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_lg_grp_cd")
						))
						.addSelect(m -> toArray(
							m.lg_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_lg_grp_nm", m.lg_grp_nm());
					}),
					j -> j
						.add(MAM_ALLOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_alloc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_alloc_grp_nm", m.alloc_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("strg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("strg_loc_grp_nm", m.loc_grp_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_nm", m.loc_nm());
							r.setStringNE("mfg_site_cd", m.site_cd());
							r.setStringNE("mfg_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("mfg_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("mfg_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_nm", m.loc_nm());
							r.setStringNE("rqst_site_cd", m.site_cd());
							r.setStringNE("rqst_loc_grp_cd", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("rqst_site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_LOC_GRP_R.class, r -> toCondition(
							r.getStringNE("rqst_loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_loc_grp_nm", m.loc_grp_nm());
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
						.add(MAM_WG_R.class, r -> toCondition(
							r.getStringNE("rqst_wg_cd")
						))
						.addSelect(m -> toArray(
							m.wg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("rqst_wg_nm", m.wg_nm());
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
	 * -- MSBCL0050_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0050_MST_OPER_ORDER_S01() {
		MST_ITM_ORDER_R S0_T1 = MST_ITM_ORDER_R.create("T1");
		MST_OPER_ORDER_R S0_T2 = MST_OPER_ORDER_R.create("T2");
		MAVM_RD_LOC_R S0_M = MAVM_RD_LOC_R.create("M");
		MSVT_WRK_SNO_R S0_T3 = MSVT_WRK_SNO_R.create("T3");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M21 = MAM_SUNDRY_ITM_R.create("M21");
		MAM_LOC_R S0_M4 = MAM_LOC_R.create("M4");
		MAM_SITE_R S0_M5 = MAM_SITE_R.create("M5");
		MAM_LG_GRP_R S0_M6 = MAM_LG_GRP_R.create("M6");
		MAM_ALLOC_GRP_R S0_M7 = MAM_ALLOC_GRP_R.create("M7");
		MAM_LOC_GRP_R S0_M8 = MAM_LOC_GRP_R.create("M8");
		MAM_LOC_R S0_M9 = MAM_LOC_R.create("M9");
		MAM_SITE_R S0_M10 = MAM_SITE_R.create("M10");
		MAM_LOC_GRP_R S0_M11 = MAM_LOC_GRP_R.create("M11");
		MAM_BP_R S0_M12 = MAM_BP_R.create("M12");
		MAM_BP_R S0_M13 = MAM_BP_R.create("M13");
		MAM_LOC_R S0_M14 = MAM_LOC_R.create("M14");
		MAM_SITE_R S0_M15 = MAM_SITE_R.create("M15");
		MAM_LOC_GRP_R S0_M16 = MAM_LOC_GRP_R.create("M16");
		MAM_WG_R S0_M17 = MAM_WG_R.create("M17");
		MAM_WG_R S0_M18 = MAM_WG_R.create("M18");
		MAM_ITM_TYP_D_R S0_M19 = MAM_ITM_TYP_D_R.create("M19");
		MAM_ITM_NOT_FIX_R S0_M20 = MAM_ITM_NOT_FIX_R.create("M20");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0050_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.selectDistinct(
						S0_T2.itm_ord_no,
						S0_T2.oper_ord_no,
						S0_T2.oper_ord_sts_typ,
						S0_T2.oper_cd,
						// this field is appended by sql coverter.
						S0_T1.strg_loc_cd.as("join_strg_loc_cd_"),
						// this field is appended by sql coverter.
						S0_T1.mfg_loc_cd.as("join_mfg_loc_cd_"),
						// this field is appended by sql coverter.
						S0_T1.rqst_loc_cd.as("join_rqst_loc_cd_")
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
							)
						)
						.innerJoin(S0_M).on(
							bracket(
								S0_T1.strg_loc_cd.eq(S0_M.loc_cd)
							)
						)
						.leftOuterJoin(S0_M1).on(
							bracket(
								value(0).eq(value(0))
								.and(S0_T1.itm_cd.eq(S0_M1.itm_cd))
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M21).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M21.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M21.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M21.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M21.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M21.sno1))
								.and(S0_T1.sno2.eq(S0_M21.sno2))
								.and(S0_T1.sno3.eq(S0_M21.sno3))
								.and(S0_T1.sno4.eq(S0_M21.sno4))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T1.sno1.eq(S0_M20.sno1))
								.and(S0_T1.sno2.eq(S0_M20.sno2))
								.and(S0_T1.sno3.eq(S0_M20.sno3))
								.and(S0_T1.sno4.eq(S0_M20.sno4))
								.and(S0_T1.wg_cd.eq(S0_M20.wg_cd))
								.and(S0_M20.del_flg.eq(value(false)))
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T1.ord_gnrt_typ).eq(value(false)))
						.and(
							S0_T1.itm_ord_typ.in(
								bind("wk_mfg"),
								bind("wk_purc"),
								bind("wk_outsrc"),
								bind("wk_xfr"),
								bind("wk_wg_xfr")
							)
						)
						.and(
							S0_T1.itm_ord_sts_typ.in(
								bind("wk_opn"),
								bind("wk_sav"),
								bind("wk_fix"),
								bind("wk_part_inst"),
								bind("wk_inst"),
								bind("wk_cmpl")
							)
						)
						.and(MSC_OPER_ORD_STS_TYP$IS_OPN(S0_T2.oper_ord_sts_typ).eq(value(false)))
						.cutoff$and(S0_T1.po_schd_dt.gte(bind("po_schd_dt_fr")))
						.cutoff$and(S0_T1.po_schd_dt.lte(bind("po_schd_dt_to")))
						.cutoff$and(S0_T1.mfg_st_schd_dt.gte(bind("mfg_st_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_st_schd_dt.lte(bind("mfg_st_schd_dt_to")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.gte(bind("mfg_end_schd_dt_fr")))
						.cutoff$and(S0_T1.mfg_end_schd_dt.lte(bind("mfg_end_schd_dt_to")))
						.cutoff$and(S0_T1.gi_schd_dt.gte(bind("gi_schd_dt_fr")))
						.cutoff$and(S0_T1.gi_schd_dt.lte(bind("gi_schd_dt_to")))
						.cutoff$and(S0_T1.strg_schd_dt.gte(bind("strg_schd_dt_fr")))
						.cutoff$and(S0_T1.strg_schd_dt.lte(bind("strg_schd_dt_to")))
						.cutoff$and(S0_T1.accpt_schd_dt.gte(bind("accpt_schd_dt_fr")))
						.cutoff$and(S0_T1.accpt_schd_dt.lte(bind("accpt_schd_dt_to")))
						.cutoff$and(S0_T1.insp_st_schd_dt.gte(bind("insp_st_schd_dt_fr")))
						.cutoff$and(S0_T1.insp_st_schd_dt.lte(bind("insp_st_schd_dt_to")))
						.cutoff$and(S0_T1.insp_end_schd_dt.gte(bind("insp_end_schd_dt_fr")))
						.cutoff$and(S0_T1.insp_end_schd_dt.lte(bind("insp_end_schd_dt_to")))
						.cutoff$and(S0_T1.avl_schd_dt.gte(bind("avl_schd_dt_fr")))
						.cutoff$and(S0_T1.avl_schd_dt.lte(bind("avl_schd_dt_to")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.strg_loc_cd.like(bind("strg_loc_cd")))
						.cutoff$and(S0_T1.sppl_cd.like(bind("sppl_cd")))
						.cutoff$and(S0_T1.maker_cd.like(bind("maker_cd")))
						.cutoff$and(S0_T1.rqst_loc_cd.like(bind("rqst_loc_cd")))
						.cutoff$and(S0_T1.rqst_wg_cd.like(bind("rqst_wg_cd")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M21.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.ord_gnrt_typ.like(bind("ord_gnrt_typ")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.rqmt_no.like(bind("rqmt_no")))
						.cutoff$and(S0_T1.sim_mrp_no.like(bind("sim_mrp_no")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							decode(
								S0_M20.itm_cd,
								nullValue(),
								S0_T1.not_fix_flg,
								value(true)
							).eq(bind("wk_not_fix_flg"))
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T3).on(bracket(S0_T3.sno1.eq(S0_T1.sno1))))
					.predicate(p -> p.cutoff$and(S0_T3.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T3.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("strg_site_nm", "strg_lg_grp_nm", "strg_alloc_grp_nm", "strg_loc_grp_nm", "strg_loc_nm", "strg_site_cd", "strg_lg_grp_cd", "strg_alloc_grp_cd", "strg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T1.strg_loc_cd.eq(S0_M4.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_nm.like(bind("strg_loc_nm"))).cutoff$and(S0_M4.site_cd.like(bind("strg_site_cd"))).cutoff$and(S0_M4.lg_grp_cd.like(bind("strg_lg_grp_cd"))).cutoff$and(S0_M4.alloc_grp_cd.like(bind("strg_alloc_grp_cd"))).cutoff$and(S0_M4.loc_grp_cd.like(bind("strg_loc_grp_cd")))),
				when(boundOr("strg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M5).on(bracket(S0_M4.site_cd.eq(S0_M5.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M5.site_nm.like(bind("strg_site_nm")))),
				when(boundOr("strg_lg_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M4.lg_grp_cd.eq(S0_M6.lg_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M6.lg_grp_nm.like(bind("strg_lg_grp_nm")))),
				when(boundOr("strg_alloc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M7).on(bracket(S0_M4.alloc_grp_cd.eq(S0_M7.alloc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M7.alloc_grp_nm.like(bind("strg_alloc_grp_nm")))),
				when(boundOr("strg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M8).on(bracket(S0_M4.loc_grp_cd.eq(S0_M8.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M8.loc_grp_nm.like(bind("strg_loc_grp_nm")))),
				when(boundOr("mfg_site_nm", "mfg_loc_grp_nm", "mfg_loc_nm", "mfg_site_cd", "mfg_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.mfg_loc_cd.eq(S0_M9.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.loc_nm.like(bind("mfg_loc_nm"))).cutoff$and(S0_M9.site_cd.like(bind("mfg_site_cd"))).cutoff$and(S0_M9.loc_grp_cd.like(bind("mfg_loc_grp_cd")))),
				when(boundOr("mfg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M10).on(bracket(S0_M9.site_cd.eq(S0_M10.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M10.site_nm.like(bind("mfg_site_nm")))),
				when(boundOr("mfg_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_M9.loc_grp_cd.eq(S0_M11.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.loc_grp_nm.like(bind("mfg_loc_grp_nm")))),
				when(boundOr("sppl_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.sppl_cd.eq(S0_M12.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.bp_nm.like(bind("sppl_nm")))),
				when(boundOr("maker_nm"))
					.view(v -> v.leftOuterJoin(S0_M13).on(bracket(S0_T1.maker_cd.eq(S0_M13.bp_cd))))
					.predicate(p -> p.cutoff$and(S0_M13.bp_nm.like(bind("maker_nm")))),
				when(boundOr("rqst_site_nm", "rqst_loc_grp_nm", "rqst_loc_nm", "rqst_site_cd", "rqst_loc_grp_cd"))
					.view(v -> v.leftOuterJoin(S0_M14).on(bracket(S0_T1.rqst_loc_cd.eq(S0_M14.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M14.loc_nm.like(bind("rqst_loc_nm"))).cutoff$and(S0_M14.site_cd.like(bind("rqst_site_cd"))).cutoff$and(S0_M14.loc_grp_cd.like(bind("rqst_loc_grp_cd")))),
				when(boundOr("rqst_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M15).on(bracket(S0_M14.site_cd.eq(S0_M15.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M15.site_nm.like(bind("rqst_site_nm")))),
				when(boundOr("rqst_loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(bracket(S0_M14.loc_grp_cd.eq(S0_M16.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M16.loc_grp_nm.like(bind("rqst_loc_grp_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M17).on(bracket(S0_T1.wg_cd.eq(S0_M17.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M17.wg_nm.like(bind("wg_nm")))),
				when(boundOr("rqst_wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(bracket(S0_T1.rqst_wg_cd.eq(S0_M18.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M18.wg_nm.like(bind("rqst_wg_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M19).on(bracket(S0_M1.itm_typ.eq(S0_M19.itm_typ).and(S0_M1.itm_typ_d_cd.eq(S0_M19.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M19.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M1.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M1.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M1.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M1.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M1.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M1.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M1.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M1.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M1.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M1.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M1.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_strg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.alloc_grp_cd,
							m.lg_grp_cd,
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_lg_grp_cd_", m.lg_grp_cd());
							r.setStringNE("join_alloc_grp_cd_", m.alloc_grp_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_mfg_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("join_rqst_loc_cd_")
						))
						.addSelect(m -> toArray(
							m.loc_grp_cd,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("join_site_cd_", m.site_cd());
							r.setStringNE("join_loc_grp_cd_", m.loc_grp_cd());
					})
				)
			);
	}
	
	/**
	 * -- MSBCL0050_MST_OPER_ORDER_Query_S02
	 */
	static MCQueryPlan MSBCL0050_MST_OPER_ORDER_S02() {
		MST_OPER_ORDER_R oper = MST_OPER_ORDER_R.create("OPER");
		
		return createQueryPlan()
				.setQuery(
					sql("MSBCL0050_MST_OPER_ORDER_Query_S02")
						.mainQuery()
						.selectDistinct(
							oper.itm_ord_no,
							oper.scheduler_frozen_flg
						)
						.from(oper)
						.where(
							value(0).eq(value(0))
							.and(oper.itm_ord_no.eq(bind("itm_ord_no")))
						)
				);
	}
}