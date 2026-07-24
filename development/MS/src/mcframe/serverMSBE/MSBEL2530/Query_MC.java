package mcframe.serverMSBE.MSBEL2530;

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
	 * -- MSBEL2530_MST_STK_XFR_ACT_Query_S01
	 */
	static MCQueryPlan MSBEL2530_MST_STK_XFR_ACT_S01() {
		MST_STK_XFR_ACT_R S0_T1 = MST_STK_XFR_ACT_R.create("T1");
		MST_STK_XFR_ACT_D_R S0_T2 = MST_STK_XFR_ACT_D_R.create("T2");
		MAM_TRD_R S0_M1 = MAM_TRD_R.create("M1");
		MAM_WG_R S0_M2 = MAM_WG_R.create("M2");
		MAM_LOC_R S0_M3 = MAM_LOC_R.create("M3");
		MAM_ITM_R S0_M4 = MAM_ITM_R.create("M4");
		MSVT_LOT_LIST_R S0_M11 = MSVT_LOT_LIST_R.create("M11");
		MAM_STR_LN_R S0_M12 = MAM_STR_LN_R.create("M12");
		MAM_USR_R S0_M16 = MAM_USR_R.create("M16");
		MAM_DPT_R S0_M17 = MAM_DPT_R.create("M17");
		MAM_BIZ_RSN_R S0_M18 = MAM_BIZ_RSN_R.create("M18");
		MAM_ITM_TYP_D_R S0_M20 = MAM_ITM_TYP_D_R.create("M20");
		MAVM_RD_LOC_R S0_M21 = MAVM_RD_LOC_R.create("M21");
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
		MST_DLV_SLIP_R S1_T9 = MST_DLV_SLIP_R.create("T9");
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MSBEL2530_MST_STK_XFR_ACT_Query_S01")
					.mainQuery()
					.select(
						S0_T1.trd_cd,
						S0_T1.wg_cd,
						S0_T2.io_typ,
						S0_T2.itm_cd,
						S0_T2.itm_sub1,
						S0_T2.itm_sub2,
						S0_T2.itm_sub3,
						S0_T2.lot_no,
						S0_T2.sublot_no,
						S0_T2.trd_unit_cd,
						S0_T2.trd_unit_qty,
						S0_T2.base_unit_cd,
						S0_T2.base_unit_qty,
						S0_T2.pack_unit_cd,
						S0_T2.pack_unit_qty,
						trunc(
							S0_T1.stk_xfr_act_tm,
							MCDateFmt.DD
						).as("stk_xfr_act_dt"),
						S0_T1.stk_xfr_act_tm.as("stk_xfr_act_hm"),
						S0_T1.ac_dt,
						S0_T1.loc_cd,
						S0_T2.str_ln_cd,
						S0_T2.stk_arrv_bp_cd,
						S0_T2.quality_typ,
						S0_T2.stk_insp_typ,
						S0_T2.stk_id_typ,
						S0_T2.gd_cd,
						S0_T2.stk_bp_cd,
						S0_T2.sno1,
						S0_T2.sno2,
						S0_T2.sno3,
						S0_T2.sno4,
						S0_T1.act_usr_cd,
						S0_T1.act_dpt_cd,
						S0_M17.dpt_nm.as("act_dpt_nm"),
						S0_T1.stk_xfr_rsn_cd,
						S0_T1.intr_rmrks,
						S0_T1.trd_rmrks,
						S0_T1.sub_char1,
						S0_T1.sub_char2,
						S0_T1.sub_char3,
						S0_T2.intr_d_rmrks,
						S0_T2.trd_d_rmrks,
						S0_T2.sub_char1.as("sub_d_char1"),
						S0_T2.sub_char2.as("sub_d_char2"),
						S0_T2.sub_char3.as("sub_d_char3"),
						S0_T2.disp_seq,
						S0_T2.stk_xfr_act_no,
						S0_T2.stk_xfr_act_d_no,
						S0_T2.fix_no_typ,
						S0_T2.fix_no,
						bracket(
							subQuery()
							.select(max(S1_T9.dlv_slip_no))
							.from(S1_T9)
							.where(
								S0_T2.stk_xfr_act_no.eq(S1_T9.dlv_slip_act_no)
								.and(S1_T9.trn_typ.eq(value(MSC_TRN_TYP.STK_XFR.value())))
								.and(S1_T9.slip_sts_typ.eq(value(MAC_SLIP_STS_TYP.CRT.value())))
							)
						).as("dlv_slip_no"),
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
						addDynamicSelect(DS0C_ITM_GRP)
					)
					.from(
						S0_T1
						.innerJoin(S0_T2).on(S0_T1.stk_xfr_act_no.eq(S0_T2.stk_xfr_act_no))
						.leftOuterJoin(S0_M17).on(
							bracket(
								S0_T1.act_dpt_cd.eq(S0_M17.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M17.st_dt, S0_M17.end_dt))
							)
						)
						.innerJoin(S0_M21).on(S0_T1.loc_cd.eq(S0_M21.loc_cd))
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T1.trd_cd.like(bind("trd_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T1.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T1.stk_xfr_act_no.like(bind("stk_xfr_act_no")))
						.cutoff$and(S0_T1.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T2.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T2.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T2.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T2.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T2.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_T2.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T2.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T2.sno1.like(bind("sno1")))
						.cutoff$and(S0_T2.sno2.like(bind("sno2")))
						.cutoff$and(S0_T2.sno3.like(bind("sno3")))
						.cutoff$and(S0_T2.sno4.like(bind("sno4")))
						.cutoff$and(S0_T1.ac_dt.gte(bind("ac_dt_fr")))
						.cutoff$and(S0_T1.ac_dt.lte(bind("ac_dt_to")))
						.cutoff$and(S0_T1.stk_xfr_act_tm.gte(bind("xfr_act_hm_fr")))
						.cutoff$and(S0_T1.stk_xfr_act_tm.lte(bind("xfr_act_hm_to")))
						.cutoff$and(S0_T1.act_usr_cd.like(bind("act_usr_cd")))
						.cutoff$and(S0_T1.act_dpt_cd.like(bind("act_dpt_cd")))
						.cutoff$and(S0_M17.dpt_nm.like(bind("act_dpt_nm")))
						.cutoff$and(S0_T1.stk_xfr_rsn_cd.like(bind("stk_xfr_rsn_cd")))
						.cutoff$and(S0_T1.intr_rmrks.like(bind("intr_rmrks")))
						.cutoff$and(S0_T1.trd_rmrks.like(bind("trd_rmrks")))
						.cutoff$and(S0_T1.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T1.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T1.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_T2.intr_d_rmrks.like(bind("intr_d_rmrks")))
						.cutoff$and(S0_T2.trd_d_rmrks.like(bind("trd_d_rmrks")))
						.cutoff$and(S0_T2.sub_char1.like(bind("sub_d_char1")))
						.cutoff$and(S0_T2.sub_char2.like(bind("sub_d_char2")))
						.cutoff$and(S0_T2.sub_char3.like(bind("sub_d_char3")))
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T2.stk_xfr_act_no.asc(),
						S0_T2.io_typ.desc(),
						S0_T2.disp_seq.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("trd_nm"))
					.view(v -> v.leftOuterJoin(S0_M1).on(S0_T1.trd_cd.eq(S0_M1.trd_cd)))
					.predicate(p -> p.cutoff$and(S0_M1.trd_nm.like(bind("trd_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_M2).on(S0_T1.wg_cd.eq(S0_M2.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_M2.wg_nm.like(bind("wg_nm")))),
				when(boundOr("loc_nm"))
					.view(v -> v.leftOuterJoin(S0_M3).on(S0_T1.loc_cd.eq(S0_M3.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_M3.loc_nm.like(bind("loc_nm")))),
				when(boundOr("itm_typ_d_nm", "itm_grp_flg1", "itm_grp_flg2", "itm_grp_flg3", "itm_grp_flg4", "itm_grp_flg5", "itm_grp_flg6", "itm_grp_flg7", "itm_grp_flg8", "itm_grp_flg9", "itm_grp_flg10", "itm_typ", "itm_typ_d_cd", "itm_nm"))
					.view(v -> v.leftOuterJoin(S0_M4).on(bracket(S0_T2.itm_cd.eq(S0_M4.itm_cd).and(S0_T2.itm_sub1.eq(S0_M4.itm_sub1)).and(S0_T2.itm_sub2.eq(S0_M4.itm_sub2)).and(S0_T2.itm_sub3.eq(S0_M4.itm_sub3)))))
					.predicate(p -> p.cutoff$and(S0_M4.itm_typ.like(bind("itm_typ"))).cutoff$and(S0_M4.itm_typ_d_cd.like(bind("itm_typ_d_cd"))).cutoff$and(S0_M4.itm_nm.like(bind("itm_nm")))),
				when(boundOr("ver_no"))
					.view(v -> v.leftOuterJoin(S0_M11).on(bracket(S0_T2.itm_cd.eq(S0_M11.itm_cd).and(S0_T2.itm_sub1.eq(S0_M11.itm_sub1)).and(S0_T2.itm_sub2.eq(S0_M11.itm_sub2)).and(S0_T2.itm_sub3.eq(S0_M11.itm_sub3)).and(S0_T2.lot_no.eq(S0_M11.lot_no)).and(S0_T2.sublot_no.eq(S0_M11.sublot_no)))))
					.predicate(p -> p.cutoff$and(S0_M11.ver_no.like(bind("ver_no")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_M12).on(bracket(S0_T2.str_ln_cd.eq(S0_M12.str_ln_cd).and(S0_T1.loc_cd.eq(S0_M12.loc_cd)))))
					.predicate(p -> p.cutoff$and(S0_M12.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("act_usr_nm"))
					.view(v -> v.leftOuterJoin(S0_M16).on(S0_T1.act_usr_cd.eq(S0_M16.usr_cd)))
					.predicate(p -> p.cutoff$and(S0_M16.usr_nm.like(bind("act_usr_nm")))),
				when(boundOr("stk_xfr_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_M18).on(S0_T1.stk_xfr_rsn_cd.eq(S0_M18.biz_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_M18.biz_rsn_nm.like(bind("stk_xfr_rsn_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_M20).on(bracket(S0_M4.itm_typ.eq(S0_M20.itm_typ).and(S0_M4.itm_typ_d_cd.eq(S0_M20.itm_typ_d_cd)))))
					.predicate(p -> p.cutoff$and(S0_M20.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd1.as("itm_grp_cd1"), S0_MM1.itm_grp_nm.as("itm_grp_nm1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM1).on(S0_M4.itm_grp_cd1.eq(S0_MM1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_MM1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_MM1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd2.as("itm_grp_cd2"), S0_MM2.itm_grp_nm.as("itm_grp_nm2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM2).on(S0_M4.itm_grp_cd2.eq(S0_MM2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_MM2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_MM2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd3.as("itm_grp_cd3"), S0_MM3.itm_grp_nm.as("itm_grp_nm3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM3).on(S0_M4.itm_grp_cd3.eq(S0_MM3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_MM3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_MM3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd4.as("itm_grp_cd4"), S0_MM4.itm_grp_nm.as("itm_grp_nm4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM4).on(S0_M4.itm_grp_cd4.eq(S0_MM4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_MM4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_MM4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd5.as("itm_grp_cd5"), S0_MM5.itm_grp_nm.as("itm_grp_nm5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM5).on(S0_M4.itm_grp_cd5.eq(S0_MM5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_MM5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_MM5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd6.as("itm_grp_cd6"), S0_MM6.itm_grp_nm.as("itm_grp_nm6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM6).on(S0_M4.itm_grp_cd6.eq(S0_MM6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_MM6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_MM6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd7.as("itm_grp_cd7"), S0_MM7.itm_grp_nm.as("itm_grp_nm7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM7).on(S0_M4.itm_grp_cd7.eq(S0_MM7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_MM7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_MM7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd8.as("itm_grp_cd8"), S0_MM8.itm_grp_nm.as("itm_grp_nm8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM8).on(S0_M4.itm_grp_cd8.eq(S0_MM8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_MM8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_MM8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd9.as("itm_grp_cd9"), S0_MM9.itm_grp_nm.as("itm_grp_nm9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM9).on(S0_M4.itm_grp_cd9.eq(S0_MM9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_MM9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_MM9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS0C_ITM_GRP, S0_M4.itm_grp_cd10.as("itm_grp_cd10"), S0_MM10.itm_grp_nm.as("itm_grp_nm10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_MM10).on(S0_M4.itm_grp_cd10.eq(S0_MM10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_MM10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_M4.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_MM10.itm_grp_nm.like(bind("itm_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
					j -> j
						.add(MST_WRK_SNO_R.class, r -> toCondition(
							r.getStringNE("sno1")
						))
						.addSelect(m -> toArray(
							m.wrk_no
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_no", m.wrk_no());
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
						.add(MAM_ITM_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3")
						))
						.addSelect(m -> toArray(
							m.itm_nm,
							m.itm_typ,
							m.itm_typ_d_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_nm", m.itm_nm());
							r.setStringNE("itm_typ", m.itm_typ());
							r.setStringNE("itm_typ_d_cd", m.itm_typ_d_cd());
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
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("trd_unit_dec_place", m.dec_place());
							r.setStringNE("trd_unit_rnd_typ", m.rnd_typ());
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
							r.getStringNE("base_unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("base_unit_nm", m.unit_nm());
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
							m.dec_place,
							m.rnd_typ
						))
						.addMap((r, m) -> {
							r.setNumberNE("pack_unit_dec_place", m.dec_place());
							r.setStringNE("pack_unit_rnd_typ", m.rnd_typ());
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
						.add(MSVT_LOT_LIST_R.class, r -> toCondition(
							r.getStringNE("itm_cd"),
							r.getStringNE("itm_sub1"),
							r.getStringNE("itm_sub2"),
							r.getStringNE("itm_sub3"),
							r.getStringNE("lot_no"),
							r.getStringNE("sublot_no")
						))
						.addSelect(m -> toArray(
							m.ver_no
						))
						.addMap((r, m) -> {
							r.setStringNE("ver_no", m.ver_no());
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
						.add(MST_WRK_R.class, r -> toCondition(
							r.getStringNE("wrk_no")
						))
						.addSelect(m -> toArray(
							m.wrk_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("wrk_nm", m.wrk_nm());
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
						.add(MAM_BIZ_RSN_R.class, r -> toCondition(
							r.getStringNE("stk_xfr_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.biz_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("stk_xfr_rsn_nm", m.biz_rsn_nm());
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
}