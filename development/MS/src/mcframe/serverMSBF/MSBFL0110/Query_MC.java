package mcframe.serverMSBF.MSBFL0110;

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
	 * -- MSBFL0110_MST_LOT_Query_S01
	 */
	static MCQueryPlan MSBFL0110_MST_LOT_S01() {
		MST_LOT_R S0_T1 = MST_LOT_R.create("T1");
		MAM_ITM_R S0_M1 = MAM_ITM_R.create("M1");
		MAM_ITM_TYP_D_R S0_M2 = MAM_ITM_TYP_D_R.create("M2");
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
		MST_STK_R S1_T2 = MST_STK_R.create("T2");
		MST_STK_R S2_T2 = MST_STK_R.create("T2");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBFL0110_MST_LOT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.itm_cd,
						S0_T1.itm_sub1,
						S0_T1.itm_sub2,
						S0_T1.itm_sub3,
						S0_M1.itm_nm,
						S0_M1.sundry_itm_flg,
						S0_M1.cont_fctr_flg,
						S0_M1.ver_flg,
						S0_T1.lot_no,
						S0_T1.sublot_no,
						S0_T1.schd_flg,
						S0_T1.ver_no,
						S0_T1.first_gr_dt,
						S0_T1.base_gr_dt,
						S0_T1.unreg_lmt_flg,
						S0_T1.vld_dt,
						S0_T1.lmt_dt,
						S0_T1.lot_mng_typ,
						S0_T1.sublot_mng_typ,
						S0_T1.bp_lot_no,
						S0_T1.stk_insp_typ,
						S0_T1.quality_typ,
						S0_T1.mfg_aprv_sts_typ,
						S0_T1.insp_aprv_sts_typ,
						S0_T1.plnt_aprv_sts_typ,
						S0_T1.mrkt_judg_sts_typ,
						S0_T1.first_gr_dt_save_flg,
						S0_T1.act_cont_fctr,
						S0_T1.lmt_dt_frm_typ,
						S0_T1.lmt_dt_frm,
						S0_T1.lot_seq,
						S0_T1.lot_rmrks,
						S0_T1.lot_sub_char1,
						S0_T1.lot_sub_char2,
						S0_T1.lot_sub_char3,
						S0_T1.lot_sub_char4,
						S0_T1.lot_sub_char5,
						S0_T1.lot_sub_num1,
						S0_T1.lot_sub_num2,
						S0_T1.lot_sub_num3,
						S0_T1.lot_sub_num4,
						S0_T1.lot_sub_num5,
						S0_T1.lot_sub_dt1,
						S0_T1.lot_sub_dt2,
						S0_T1.lot_sub_dt3,
						S0_T1.lot_sub_dt4,
						S0_T1.lot_sub_dt5,
						S0_T1.lot_sub_flg1,
						S0_T1.lot_sub_flg2,
						S0_T1.lot_sub_flg3,
						S0_T1.lot_sub_flg4,
						S0_T1.lot_sub_flg5,
						bracket(
							cases()
								.when(
									bracket(
										subQuery()
										.select(count(S1_T2.itm_cd))
										.from(S1_T2)
										.where(
											value(0).eq(value(0))
											.and(S0_T1.itm_cd.eq(S1_T2.itm_cd))
											.and(S0_T1.itm_sub1.eq(S1_T2.itm_sub1))
											.and(S0_T1.itm_sub2.eq(S1_T2.itm_sub2))
											.and(S0_T1.itm_sub3.eq(S1_T2.itm_sub3))
											.and(S0_T1.lot_no.eq(S1_T2.lot_no))
											.and(
												bracket(
													MAC_SUBLOT_MNG_TYP$IS_STK(S0_M1.sublot_mng_typ).neq(value(true))
													.and(S0_T1.sublot_no.eq(S1_T2.sublot_no))
												)
												.or(MAC_SUBLOT_MNG_TYP$IS_STK(S0_M1.sublot_mng_typ).eq(value(true)))
											)
											.and(S1_T2.base_unit_qty.gt(value(0)))
										)
									).gt(value(0))
								)
									.then(value(true))
								.otherwise(value(false))
						).as("stk_flg"),
						S0_T1.ins_usr_id,
						S0_T1.ins_usr_nm,
						S0_T1.ins_ts,
						S0_T1.ins_func_id,
						S0_T1.upd_cntr,
						S0_T1.upd_usr_id,
						S0_T1.upd_usr_nm,
						S0_T1.upd_ts,
						S0_T1.upd_func_id,
						S0_T1.upd_srv_req_no,
						S0_M1.itm_typ,
						S0_M1.itm_typ_d_cd,
						S0_M2.itm_typ_d_nm,
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_T1.itm_cd.eq(S0_M1.itm_cd)
								.and(S0_T1.itm_sub1.eq(S0_M1.itm_sub1))
								.and(S0_T1.itm_sub2.eq(S0_M1.itm_sub2))
								.and(S0_T1.itm_sub3.eq(S0_M1.itm_sub3))
								.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M1.itm_typ.eq(S0_M2.itm_typ)
								.and(S0_M1.itm_typ_d_cd.eq(S0_M2.itm_typ_d_cd))
							)
						)
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_M1.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_M1.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_M2.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_T1.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T1.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T1.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T1.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_M1.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T1.ver_no.like(bind("ver_no")))
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
						.cutoff$and(S0_T1.first_gr_dt.gte(bind("first_gr_dt_fr")))
						.cutoff$and(S0_T1.first_gr_dt.lte(bind("first_gr_dt_to")))
						.cutoff$and(S0_T1.vld_dt.gte(bind("vld_dt_fr")))
						.cutoff$and(S0_T1.vld_dt.lte(bind("vld_dt_to")))
						.cutoff$and(S0_T1.lmt_dt.gte(bind("lmt_dt_fr")))
						.cutoff$and(S0_T1.lmt_dt.lte(bind("lmt_dt_to")))
						.and(
							bracket(
								bind("unreg_lmt_flg").eq(value(true))
								.and(S0_T1.unreg_lmt_flg.eq(value(true)))
							)
							.or(bind("unreg_lmt_flg").eq(value(false)))
						)
						.and(
							bracket(
								bind("stk_flg").eq(value(true))
								.and(
									subQuery()
									.select(count(S2_T2.itm_cd))
									.from(S2_T2)
									.where(
										value(0).eq(value(0))
										.and(S0_T1.itm_cd.eq(S2_T2.itm_cd))
										.and(S0_T1.itm_sub1.eq(S2_T2.itm_sub1))
										.and(S0_T1.itm_sub2.eq(S2_T2.itm_sub2))
										.and(S0_T1.itm_sub3.eq(S2_T2.itm_sub3))
										.and(S0_T1.lot_no.eq(S2_T2.lot_no))
										.and(
											bracket(
												MAC_SUBLOT_MNG_TYP$IS_STK(S0_M1.sublot_mng_typ).neq(value(true))
												.and(S0_T1.sublot_no.eq(S2_T2.sublot_no))
											)
											.or(MAC_SUBLOT_MNG_TYP$IS_STK(S0_M1.sublot_mng_typ).eq(value(true)))
										)
										.and(S2_T2.base_unit_qty.gt(value(0)))
									).gt(value(0))
								)
							)
							.or(bind("stk_flg").eq(value(false)))
						)
						.cutoff$and(S0_T1.lot_mng_typ.like(bind("lot_mng_typ")))
						.cutoff$and(S0_T1.sublot_mng_typ.like(bind("sublot_mng_typ")))
						.cutoff$and(S0_T1.lot_rmrks.like(bind("lot_rmrks")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
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
			);
	}
}