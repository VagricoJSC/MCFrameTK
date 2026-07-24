package mcframe.serverMSBC.MSBCL0090;

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
	 * -- MSBCL0090_MST_OPER_ORDER_Query_S01
	 */
	static MCQueryPlan MSBCL0090_MST_OPER_ORDER_S01() {
		MST_OPER_ORDER_R S0_T1 = MST_OPER_ORDER_R.create("T1");
		MST_ITM_ORDER_R S0_T2 = MST_ITM_ORDER_R.create("T2");
		MCTempView S0_T3 = createTempView("T3");
		MSVT_WRK_SNO_R S0_T5 = MSVT_WRK_SNO_R.create("T5");
		MAM_OPER_R S0_M1 = MAM_OPER_R.create("M1");
		MAM_LOC_R S0_M2 = MAM_LOC_R.create("M2");
		MAM_SITE_R S0_M3 = MAM_SITE_R.create("M3");
		MAM_LOC_GRP_R S0_M4 = MAM_LOC_GRP_R.create("M4");
		MAM_ITM_R S0_M5 = MAM_ITM_R.create("M5");
		MAM_SUNDRY_ITM_R S0_M20 = MAM_SUNDRY_ITM_R.create("M20");
		MAM_ITM_TYP_D_R S0_M6 = MAM_ITM_TYP_D_R.create("M6");
		MAM_ITM_OPER_R S0_M7 = MAM_ITM_OPER_R.create("M7");
		MAM_WG_R S0_M9 = MAM_WG_R.create("M9");
		MAM_EXT_SYS_R S0_M11 = MAM_EXT_SYS_R.create("M11");
		MAM_LOC_R S0_M12 = MAM_LOC_R.create("M12");
		MAVM_RD_LOC_R S0_V1 = MAVM_RD_LOC_R.create("V1");
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
		MST_OPER_INST_R S1_T1 = MST_OPER_INST_R.create("T1");
		MCTempView S1_T2 = createTempView("T2");
		MST_OPER_ACT_R S2_T = MST_OPER_ACT_R.create("T");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBCL0090_MST_OPER_ORDER_Query_S01")
					.mainQuery()
					.select(
						S0_T1.oper_ord_no,
						S0_T1.itm_ord_no,
						S0_T1.oper_ord_sts_typ,
						S0_T1.disp_seq,
						S0_T1.oper_ptn,
						S0_T1.oper_cd,
						S0_T1.oper_seq,
						S0_T2.mfg_st_schd_dt,
						S0_T2.mfg_end_schd_dt,
						S0_T1.st_schd_tm,
						trunc(
							S0_T1.st_schd_tm,
							MCDateFmt.DD
						).as("st_schd_dt"),
						S0_T1.st_schd_tm.as("st_schd_hm"),
						S0_T1.inst_st_schd_tm,
						trunc(
							S0_T1.inst_st_schd_tm,
							MCDateFmt.DD
						).as("inst_st_schd_dt"),
						S0_T1.inst_st_schd_tm.as("inst_st_schd_hm"),
						S0_T1.act_st_tm,
						trunc(
							S0_T1.act_st_tm,
							MCDateFmt.DD
						).as("act_st_dt"),
						S0_T1.act_st_tm.as("act_st_hm"),
						S0_T1.end_schd_tm,
						trunc(
							S0_T1.end_schd_tm,
							MCDateFmt.DD
						).as("end_schd_dt"),
						S0_T1.end_schd_tm.as("end_schd_hm"),
						S0_T1.inst_end_schd_tm,
						trunc(
							S0_T1.inst_end_schd_tm,
							MCDateFmt.DD
						).as("inst_end_schd_dt"),
						S0_T1.inst_end_schd_tm.as("inst_end_schd_hm"),
						S0_T1.act_end_tm,
						trunc(
							S0_T1.act_end_tm,
							MCDateFmt.DD
						).as("act_end_dt"),
						S0_T1.act_end_tm.as("act_end_hm"),
						S0_T2.mfg_loc_cd,
						S0_T1.loc_cd,
						S0_M5.itm_typ,
						S0_M5.itm_typ_d_cd,
						S0_M5.itm_cd,
						S0_M5.itm_sub1,
						S0_M5.itm_sub2,
						S0_M5.itm_sub3,
						nvl(
							S0_M20.itm_nm,
							S0_M5.itm_nm
						).as("itm_nm"),
						S0_T1.oper_schd_qty,
						S0_T3.pr("base_unit_qty").as("oper_int_schd_qty"),
						S0_T3.pr("oper_unit_qty").as("oper_act_qty"),
						S0_T3.pr(S1_T1.oper_std_qty),
						S0_M7.oper_unit_cd,
						S0_M5.unit_cd.as("base_unit_cd"),
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.wg_cd,
						S0_T1.oper_rsrc,
						S0_T1.intr_rmrks.as("rmrks"),
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_func_id,
						S0_T1.ins_ts,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_func_id,
						S0_T1.upd_ts,
						S0_T1.upd_srv_req_no,
						S0_T3.pr(S1_T1.oper_std_qty).as("oper_inst_std_qty"),
						S0_T3.pr(S1_T1.oper_conv_qty).as("oper_inst_conv_qty"),
						S0_T3.pr(S1_T1.oper_unit_dec_place),
						S0_T3.pr(S1_T1.oper_unit_conv_rnd_typ),
						S0_M7.oper_std_qty,
						S0_M7.oper_conv_qty,
						S0_M7.dec_place,
						S0_M7.unit_conv_rnd_typ,
						S0_T2.ord_rcv_flg,
						S0_T2.ord_snd_flg,
						S0_T2.ext_sys_cd,
						S0_T2.ext_itm_ord_no,
						S0_T2.for_scheduler_frozen_flg,
						S0_T1.ext_oper_ord_no,
						S0_T1.scheduler_frozen_flg,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(
							bracket(
								S0_T1.itm_ord_no.eq(S0_T2.itm_ord_no)
								.and(MSC_ORD_GNRT_TYP$IS_UPLND(S0_T2.ord_gnrt_typ).eq(value(false)))
							)
						)
						.leftOuterJoin(
							subQuery()
							.select(
								S1_T1.oper_ord_no,
								S1_T1.oper_std_qty,
								S1_T1.oper_conv_qty,
								S1_T1.oper_unit_cd,
								S1_T1.oper_unit_conv_rnd_typ,
								S1_T1.oper_unit_dec_place,
								sum(
									nvl(
										S1_T1.base_unit_qty,
										value(0)
									)
								).as("base_unit_qty"),
								sum(S1_T2.pr("sum_act_oper_unit_qty")).as("oper_unit_qty")
							)
							.from(
								S1_T1
								.leftOuterJoin(
									subQuery()
									.select(
										S2_T.oper_inst_no,
										sum(
											nvl(
												S2_T.oper_unit_qty,
												value(0)
											)
										).as("sum_act_oper_unit_qty")
									)
									.from(S2_T)
									.where(
										value(0).eq(value(0))
									)
									.groupBy(S2_T.oper_inst_no).view(S1_T2)
								).on(
									bracket(
										S1_T1.oper_inst_no.eq(S1_T2.pr(S2_T.oper_inst_no))
									)
								)
							)
							.where(
								value(0).eq(value(0))
								.and(S1_T1.can_flg.eq(value(false)))
								.and(S1_T1.oper_ord_no.isNotNull())
							)
							.groupBy(
								S1_T1.oper_ord_no,
								S1_T1.oper_std_qty,
								S1_T1.oper_conv_qty,
								S1_T1.oper_unit_cd,
								S1_T1.oper_unit_conv_rnd_typ,
								S1_T1.oper_unit_dec_place
							).view(S0_T3)
						).on(
							bracket(
								S0_T1.oper_ord_no.eq(S0_T3.pr(S1_T1.oper_ord_no))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M5.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M5.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M5.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M5.itm_sub3))
							)
						)
						.leftOuterJoin(S0_M20).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M20.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M20.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M20.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M20.itm_sub3))
								.and(S0_T2.sno1.eq(S0_M20.sno1))
								.and(S0_T2.sno2.eq(S0_M20.sno2))
								.and(S0_T2.sno3.eq(S0_M20.sno3))
								.and(S0_T2.sno4.eq(S0_M20.sno4))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_T2.itm_cd.eq(S0_M7.itm_cd)
								.and(S0_T2.itm_sub1.eq(S0_M7.itm_sub1))
								.and(S0_T2.itm_sub2.eq(S0_M7.itm_sub2))
								.and(S0_T2.itm_sub3.eq(S0_M7.itm_sub3))
								.and(S0_T2.mst_mfg_loc_cd.eq(S0_M7.loc_cd))
								.and(S0_T1.oper_ptn.eq(S0_M7.oper_ptn))
								.and(S0_T1.oper_cd.eq(S0_M7.oper_cd))
								.and(S0_T1.oper_seq.eq(S0_M7.oper_seq))
								.and(S0_T2.mfg_st_schd_dt.between(S0_M7.st_dt, S0_M7.end_dt))
							)
						)
						.innerJoin(S0_V1).on(
							bracket(
								S0_T2.mfg_loc_cd.eq(S0_V1.loc_cd)
							)
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(MAC_STR$IS_NULL_VAL(S0_T1.oper_ptn).eq(value(false)))
						.cutoff$and(S0_T1.st_schd_tm.gte(bind("st_schd_hm_fr")))
						.cutoff$and(S0_T1.st_schd_tm.lte(bind("st_schd_hm_to")))
						.cutoff$and(S0_T1.end_schd_tm.gte(bind("end_schd_hm_fr")))
						.cutoff$and(S0_T1.end_schd_tm.lte(bind("end_schd_hm_to")))
						.cutoff$and(S0_T2.mfg_st_schd_dt.gte(bind("mfg_st_schd_dt_fr")))
						.cutoff$and(S0_T2.mfg_st_schd_dt.lte(bind("mfg_st_schd_dt_to")))
						.cutoff$and(S0_T2.mfg_end_schd_dt.gte(bind("mfg_end_schd_dt_fr")))
						.cutoff$and(S0_T2.mfg_end_schd_dt.lte(bind("mfg_end_schd_dt_to")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T2.mfg_loc_cd.like(bind("mfg_loc_cd")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T1.oper_ptn.like(bind("oper_ptn")))
						.cutoff$and(S0_T1.oper_cd.like(bind("oper_cd")))
						.cutoff$and(S0_T1.oper_seq.eq(bind("oper_seq")))
						.cutoff$and(S0_M5.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M5.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M5.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_M5.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_M5.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_M5.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M20.itm_nm,
								S0_M5.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.oper_ord_no.like(bind("oper_ord_no")))
						.cutoff$and(S0_T1.itm_ord_no.like(bind("itm_ord_no")))
						.cutoff$and(S0_T1.oper_rsrc.like(bind("oper_rsrc")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.ext_sys_cd.like(bind("ext_sys_cd")))
						.cutoff$and(S0_T2.ext_itm_ord_no.like(bind("ext_itm_ord_no")))
						.cutoff$and(S0_T1.ext_oper_ord_no.like(bind("ext_oper_ord_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
						.and(
							S0_T1.oper_ord_sts_typ.in(
								bind("wk_opn"),
								bind("wk_save"),
								bind("wk_fix"),
								bind("wk_part_inst"),
								bind("wk_inst"),
								bind("wk_cmpl")
							)
						)
						.cutoff$and(S0_T2.ord_rcv_flg.eq(bind("wk_ord_rcv_tgt_flg")))
						.cutoff$and(S0_T2.ord_snd_flg.eq(bind("wk_ord_snd_tgt_flg")))
					)
					.orderBy(
						S0_T1.itm_ord_no.asc(),
						S0_T1.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("wrk_no", "wrk_nm"))
					.view(v -> v.leftOuterJoin(S0_T5).on(bracket(S0_T2.sno1.eq(S0_T5.sno1))))
					.predicate(p -> p.cutoff$and(S0_T5.wrk_no.like(bind("wrk_no"))).cutoff$and(S0_T5.wrk_nm.like(bind("wrk_nm")))),
				when(boundOr("oper_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(bracket(S0_T1.oper_cd.eq(S0_M1.oper_cd))))
					.predicate(p -> p.cutoff$and(S0_M1.oper_nm.like(bind("oper_nm")))),
				when(boundOr("mfg_site_nm", "loc_grp_nm", "mfg_site_cd", "loc_grp_cd", "mfg_loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(bracket(S0_T2.mfg_loc_cd.eq(S0_M2.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M2.site_cd.like(bind("mfg_site_cd"))).cutoff$and(S0_M2.loc_grp_cd.like(bind("loc_grp_cd"))).cutoff$and(S0_M2.loc_nm.like(bind("mfg_loc_nm")))),
				when(boundOr("mfg_site_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(bracket(S0_M2.site_cd.eq(S0_M3.site_cd))))
					.predicate(p -> p.cutoff$and(S0_M3.site_nm.like(bind("mfg_site_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T1.loc_cd.eq(S0_M12.loc_cd))))
					.predicate(p -> p.cutoff$and(S0_M12.loc_nm.like(bind("loc_nm")))),
				when(boundOr("loc_grp_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_M2.loc_grp_cd.eq(S0_M4.loc_grp_cd))))
					.predicate(p -> p.cutoff$and(S0_M4.loc_grp_nm.like(bind("loc_grp_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M6).on(bracket(S0_M5.itm_typ.eq(S0_M6.itm_typ).and(S0_M5.itm_typ_d_cd.eq(S0_M6.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M6.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M9).on(bracket(S0_T1.wg_cd.eq(S0_M9.wg_cd))))
					.predicate(p -> p.cutoff$and(S0_M9.wg_nm.like(bind("wg_nm")))),
				when(boundOr("ext_sys_nm"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.ext_sys_cd.eq(S0_M11.ext_sys_cd))))
					.predicate(p -> p.cutoff$and(S0_M11.ext_sys_nm.like(bind("ext_sys_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M5.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M5.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M5.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M5.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M5.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M5.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M5.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M5.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M5.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M5.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M5.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M5.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							m.loc_grp_cd,
							m.loc_nm,
							m.site_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("mfg_site_cd", m.site_cd());
							r.setStringNE("loc_grp_cd", m.loc_grp_cd());
							r.setStringNE("mfg_loc_nm", m.loc_nm());
					}),
					j -> j
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
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
							r.getStringNE("loc_grp_cd")
						))
						.addSelect(m -> toArray(
							m.loc_grp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_grp_nm", m.loc_grp_nm());
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