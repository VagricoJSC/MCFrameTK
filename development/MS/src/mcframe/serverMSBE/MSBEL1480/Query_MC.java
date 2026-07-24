package mcframe.serverMSBE.MSBEL1480;

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
	 * -- MSBEL1480_MST_SHIP_STK_RPL_LST_Query_S01
	 */
	static MCQueryPlan MSBEL1480_MST_SHIP_STK_RPL_LST_S01() {
		MST_SHIP_STK_RPL_LST_R S0_T1 = MST_SHIP_STK_RPL_LST_R.create("T1");
		MSVT_WRK_SNO_R S0_T2 = MSVT_WRK_SNO_R.create("T2");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_SUNDRY_ITM_R S0_M2 = MAM_SUNDRY_ITM_R.create("M2");
		MAM_UNIT_R S0_M3 = MAM_UNIT_R.create("M3");
		MAM_ITM_TYP_D_R S0_M4 = MAM_ITM_TYP_D_R.create("M4");
		MAM_LOC_R S0_M5 = MAM_LOC_R.create("M5");
		MAM_SITE_R S0_M6 = MAM_SITE_R.create("M6");
		MAM_WG_R S0_M7 = MAM_WG_R.create("M7");
		MAM_LG_GRP_R S0_M8 = MAM_LG_GRP_R.create("M8");
		MAM_LOC_GRP_R S0_M9 = MAM_LOC_GRP_R.create("M9");
		MAM_STR_LN_R S0_M10 = MAM_STR_LN_R.create("M10");
		MAM_STK_GD_R S0_M11 = MAM_STK_GD_R.create("M11");
		MAVM_ITM_UNIT_R S0_M12 = MAVM_ITM_UNIT_R.create("M12");
		MAM_UNIT_R S0_M13 = MAM_UNIT_R.create("M13");
		MAM_BP_R S0_M14 = MAM_BP_R.create("M14");
		MAM_BP_R S0_M15 = MAM_BP_R.create("M15");
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
		MAVM_RD_LOC_R S1_W1 = MAVM_RD_LOC_R.create("W1");
		MAVM_RD_LG_GRP_R S2_W2 = MAVM_RD_LG_GRP_R.create("W2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL1480_MST_SHIP_STK_RPL_LST_Query_S01")
					.mainQuery()
					.select(
						S0_T1.batch_data_no,
						S0_T1.exec_tm,
						S0_T1.batch_log_no,
						S0_T1.io_schd_typ,
						S0_T1.io_schd_sts_typ,
						S0_T1.slip_schd_no,
						S0_T1.alloc_flg,
						S0_T1.io_schd_no,
						S0_T1.io_schd_seq,
						S0_T1.io_schd_sub_typ1,
						S0_T1.io_schd_sub_no1,
						S0_T1.io_schd_sub_seq1,
						S0_T1.io_schd_sub_typ2,
						S0_T1.io_schd_sub_no2,
						S0_T1.io_schd_sub_seq2,
						S0_T1.io_schd_sub_typ3,
						S0_T1.io_schd_sub_no3,
						S0_T1.io_schd_sub_seq3,
						S0_T1.io_schd_sub_typ4,
						S0_T1.io_schd_sub_no4,
						S0_T1.io_schd_sub_seq4,
						S0_T1.io_schd_pr_no,
						S0_T1.loc_cd,
						S0_M5.loc_nm,
						S0_M5.str_ln_tgt_flg,
						S0_T1.str_ln_cd,
						S0_M10.str_ln_nm,
						S0_M5.loc_grp_cd,
						S0_M9.loc_grp_nm,
						S0_M5.lg_grp_cd,
						S0_M8.lg_grp_nm,
						S0_T1.wg_cd,
						S0_M7.wg_nm,
						S0_M5.site_cd,
						S0_M6.site_nm,
						S0_T1.schd_dt,
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						nvl(
							S0_M2.itm_nm,
							S0_M1.itm_nm
						).as("itm_nm"),
						S0_T1.ver_no,
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
						S0_T2.wrk_no,
						S0_T2.wrk_nm,
						S0_T1.gd_cd,
						S0_M11.gd_nm,
						S0_T1.quality_typ,
						S0_T1.stk_id_typ,
						S0_T1.stk_bp_cd,
						S0_M14.bp_nm.as("stk_bp_nm"),
						S0_T1.stk_arrv_bp_cd,
						S0_M15.bp_nm.as("stk_arrv_bp_nm"),
						S0_T1.pack_unit_cd,
						S0_M13.unit_nm.as("pack_unit_nm"),
						S0_M12.dec_place.as("pack_unit_dec_place"),
						S0_M12.conv_base_qty.as("pack_unit_conv_base_qty"),
						S0_M12.conv_qty.as("pack_unit_conv_qty"),
						S0_M12.rnd_typ.as("pack_unit_rnd_typ"),
						S0_T1.pack_unit_short_qty,
						S0_T1.base_unit_cd,
						S0_M3.unit_nm.as("base_unit_nm"),
						S0_M1.dec_place.as("base_unit_dec_place"),
						S0_M1.rnd_typ.as("base_unit_rnd_typ"),
						S0_T1.base_unit_short_qty,
						S0_T1.vld_dt_fr,
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_T2).on(
							bracket(
								S0_T2.sno1.eq(S0_T1.sno1)
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
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.unit_cd.eq(S0_T1.base_unit_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.itm_typ.eq(S0_M1.itm_typ)
								.and(S0_M4.itm_typ_d_cd.eq(S0_M1.itm_typ_d_cd))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.loc_cd.eq(S0_T1.loc_cd)
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.site_cd.eq(S0_M5.site_cd)
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.wg_cd.eq(S0_T1.wg_cd)
							)
						)
						.leftOuterJoin(S0_M8).on(
							bracket(
								S0_M8.lg_grp_cd.eq(S0_M5.lg_grp_cd)
							)
						)
						.leftOuterJoin(S0_M9).on(
							bracket(
								S0_M9.loc_grp_cd.eq(S0_M5.loc_grp_cd)
							)
						)
						.leftOuterJoin(S0_M10).on(
							bracket(
								S0_M10.loc_cd.eq(S0_T1.loc_cd)
								.and(S0_M10.str_ln_cd.eq(S0_T1.str_ln_cd))
							)
						)
						.leftOuterJoin(S0_M11).on(
							bracket(
								S0_M11.gd_cd.eq(S0_T1.gd_cd)
							)
						)
						.leftOuterJoin(S0_M12).on(
							bracket(
								S0_M12.itm_cd.eq(S0_T1.itm_cd)
								.and(S0_M12.itm_sub1.eq(S0_T1.itm_sub1))
								.and(S0_M12.itm_sub2.eq(S0_T1.itm_sub2))
								.and(S0_M12.itm_sub3.eq(S0_T1.itm_sub3))
								.and(S0_M12.unit_cd.eq(S0_T1.pack_unit_cd))
							)
						)
						.leftOuterJoin(S0_M13).on(
							bracket(
								S0_M13.unit_cd.eq(S0_T1.pack_unit_cd)
							)
						)
						.leftOuterJoin(S0_M14).on(
							bracket(
								S0_M14.bp_cd.eq(S0_T1.stk_bp_cd)
							)
						)
						.leftOuterJoin(S0_M15).on(
							bracket(
								S0_M15.bp_cd.eq(S0_T1.stk_arrv_bp_cd)
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_W1)
								.where(
									S1_W1.loc_cd.eq(S0_T1.loc_cd)
								)
							)
							.or(
								exists(
									subQuery()
									.select(value("X"))
									.from(S2_W2)
									.where(
										S2_W2.lg_grp_cd.eq(S0_M5.lg_grp_cd)
									)
								)
							)
						)
						.cutoff$and(S0_T1.schd_dt.gte(bind("schd_dt_fr")))
						.cutoff$and(S0_T1.schd_dt.lte(bind("schd_dt_to")))
						.cutoff$and(S0_M5.site_cd.like(bind("site_cd")))
						.cutoff$and(S0_M6.site_nm.like(bind("site_nm")))
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_M7.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_M5.lg_grp_cd.like(bind("lg_grp_cd")))
						.cutoff$and(S0_M8.lg_grp_nm.like(bind("lg_grp_nm")))
						.cutoff$and(S0_M5.loc_grp_cd.like(bind("loc_grp_cd")))
						.cutoff$and(S0_M9.loc_grp_nm.like(bind("loc_grp_nm")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_M5.loc_nm.like(bind("loc_nm")))
						.cutoff$and(S0_T1.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_M10.str_ln_nm.like(bind("str_ln_nm")))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M4.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_M2.itm_nm,
								S0_M1.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
						.cutoff$and(S0_T1.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T1.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T1.sno1.like(bind("sno1")))
						.cutoff$and(S0_T1.sno2.like(bind("sno2")))
						.cutoff$and(S0_T1.sno3.like(bind("sno3")))
						.cutoff$and(S0_T1.sno4.like(bind("sno4")))
						.cutoff$and(S0_T2.wrk_no.like(bind("wrk_no")))
						.cutoff$and(S0_T2.wrk_nm.like(bind("wrk_nm")))
						.cutoff$and(S0_T1.batch_log_no.like(bind("batch_log_no")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T1.schd_dt.asc(),
						S0_T1.itm_cd.asc(),
						S0_T1.itm_sub1.asc(),
						S0_T1.itm_sub2.asc(),
						S0_T1.itm_sub3.asc(),
						S0_T1.lot_no.asc(),
						S0_T1.sublot_no.asc()
					)
			)
			.setDynamicSQLInfo(
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
			);
	}
}