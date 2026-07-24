package mcframe.serverMGBD.MGBDL0590;

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
import mcframe.commonMG.constant.*;
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;
import mcframe.serverPF.dbc.*;
import mcframe.serverMG.dbc.*;

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
import static mcframe.serverMG.dbc.MGFunction.*;

public class Query_MC {
	
	/**
	 * -- MGBDL0590_MGT_ITM_SLS_Query_S01
	 */
	static MCQueryPlan MGBDL0590_MGT_ITM_SLS_S01() {
		MGT_ITM_SLS_R S0_T = MGT_ITM_SLS_R.create("T");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_COST_DPT_R S0_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_BP_R S0_CST = MAM_BP_R.create("CST");
		MAM_BP_R S0_DLV = MAM_BP_R.create("DLV");
		MAM_BP_R S0_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S0_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S0_DEST3 = MAM_BP_R.create("DEST3");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_WG_R S0_WG = MAM_WG_R.create("WG");
		MAM_CUR_R S0_CUR = MAM_CUR_R.create("CUR");
		MAM_CNTRY_R S0_CST_CNTRY = MAM_CNTRY_R.create("CST_CNTRY");
		MAM_AREA_R S0_CST_AREA = MAM_AREA_R.create("CST_AREA");
		MAM_CNTRY_R S0_DLV_CNTRY = MAM_CNTRY_R.create("DLV_CNTRY");
		MAM_AREA_R S0_DLV_AREA = MAM_AREA_R.create("DLV_AREA");
		MAM_ITM_GRP_R S0_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S0_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S0_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S0_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S0_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S0_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S0_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S0_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S0_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S0_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_BP_GRP_R S0_CST_GRP1 = MAM_BP_GRP_R.create("CST_GRP1");
		MAM_BP_GRP_R S0_CST_GRP2 = MAM_BP_GRP_R.create("CST_GRP2");
		MAM_BP_GRP_R S0_CST_GRP3 = MAM_BP_GRP_R.create("CST_GRP3");
		MAM_BP_GRP_R S0_CST_GRP4 = MAM_BP_GRP_R.create("CST_GRP4");
		MAM_BP_GRP_R S0_CST_GRP5 = MAM_BP_GRP_R.create("CST_GRP5");
		MAM_BP_GRP_R S0_CST_GRP6 = MAM_BP_GRP_R.create("CST_GRP6");
		MAM_BP_GRP_R S0_CST_GRP7 = MAM_BP_GRP_R.create("CST_GRP7");
		MAM_BP_GRP_R S0_CST_GRP8 = MAM_BP_GRP_R.create("CST_GRP8");
		MAM_BP_GRP_R S0_CST_GRP9 = MAM_BP_GRP_R.create("CST_GRP9");
		MAM_BP_GRP_R S0_CST_GRP10 = MAM_BP_GRP_R.create("CST_GRP10");
		MAM_BP_GRP_R S0_DLV_GRP1 = MAM_BP_GRP_R.create("DLV_GRP1");
		MAM_BP_GRP_R S0_DLV_GRP2 = MAM_BP_GRP_R.create("DLV_GRP2");
		MAM_BP_GRP_R S0_DLV_GRP3 = MAM_BP_GRP_R.create("DLV_GRP3");
		MAM_BP_GRP_R S0_DLV_GRP4 = MAM_BP_GRP_R.create("DLV_GRP4");
		MAM_BP_GRP_R S0_DLV_GRP5 = MAM_BP_GRP_R.create("DLV_GRP5");
		MAM_BP_GRP_R S0_DLV_GRP6 = MAM_BP_GRP_R.create("DLV_GRP6");
		MAM_BP_GRP_R S0_DLV_GRP7 = MAM_BP_GRP_R.create("DLV_GRP7");
		MAM_BP_GRP_R S0_DLV_GRP8 = MAM_BP_GRP_R.create("DLV_GRP8");
		MAM_BP_GRP_R S0_DLV_GRP9 = MAM_BP_GRP_R.create("DLV_GRP9");
		MAM_BP_GRP_R S0_DLV_GRP10 = MAM_BP_GRP_R.create("DLV_GRP10");
		MAVM_RD_WG_R S1_RDWG = MAVM_RD_WG_R.create("RDWG");
		MAVM_RD_WG_R S2_RDWG = MAVM_RD_WG_R.create("RDWG");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0590_MGT_ITM_SLS_Query_S01")
					.mainQuery()
					.select(
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.dpt_cd,
						S0_T.cst_cd,
						S0_T.dlv_cd,
						S0_T.dest_cd1,
						S0_T.dest_cd2,
						S0_T.dest_cd3,
						S0_T.term,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.base_qty,
						S0_T.cur_cd,
						S0_T.upri,
						S0_T.prio,
						S0_T.alc_val1,
						S0_T.alc_val2,
						S0_T.alc_val3,
						S0_T.alc_val4,
						S0_T.alc_val5,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
						S0_T.non_calc_flg,
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no,
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						addDynamicSelect(DS0D)
					)
					.from(
						S0_T
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.addDynamicView()
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_T.term.gte(bind("term_fr")))
						.cutoff$and(S0_T.term.lte(bind("term_to")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(S0_ITM.itm_nm.like(bind("itm_nm")))
						.cutoff$and(S0_T.cur_cd.like(bind("cur_cd")))
						.cutoff$and(S0_T.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T.cst_cd.like(bind("cst_cd")))
						.cutoff$and(S0_T.dlv_cd.like(bind("dlv_cd")))
						.cutoff$and(S0_T.dest_cd1.like(bind("dest_cd1")))
						.cutoff$and(S0_T.dest_cd2.like(bind("dest_cd2")))
						.cutoff$and(S0_T.dest_cd3.like(bind("dest_cd3")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
						.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
						.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
						.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
						.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
						.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
						.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
						.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
						.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
						.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
						.cutoff$and(S0_T.non_calc_flg.eq(bind("non_calc_flg_str")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.term.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.dpt_cd.asc(),
						S0_T.cst_cd.asc(),
						S0_T.dlv_cd.asc(),
						S0_T.dest_cd1.asc(),
						S0_T.dest_cd2.asc(),
						S0_T.dest_cd3.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_DPT).on(S0_T.dpt_cd.eq(S0_DPT.dpt_cd).and(S0_T.term.eq(S0_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("cst_cntry_nm", "cst_area_nm", "cst_grp_nm1", "cst_grp_nm2", "cst_grp_nm3", "cst_grp_nm4", "cst_grp_nm5", "cst_grp_nm6", "cst_grp_nm7", "cst_grp_nm8", "cst_grp_nm9", "cst_grp_nm10", "cst_nm", "cst_cntry_cd", "cst_area_cd", "cst_grp_cd1", "cst_grp_cd2", "cst_grp_cd3", "cst_grp_cd4", "cst_grp_cd5", "cst_grp_cd6", "cst_grp_cd7", "cst_grp_cd8", "cst_grp_cd9", "cst_grp_cd10"))
					.view(v -> v.leftOuterJoin(S0_CST).on(S0_T.cst_cd.eq(S0_CST.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_CST.bp_nm.like(bind("cst_nm"))).cutoff$and(S0_CST.cntry_cd.like(bind("cst_cntry_cd"))).cutoff$and(S0_CST.area_cd.like(bind("cst_area_cd"))).cutoff$and(S0_CST.bp_grp_cd1.like(bind("cst_grp_cd1"))).cutoff$and(S0_CST.bp_grp_cd2.like(bind("cst_grp_cd2"))).cutoff$and(S0_CST.bp_grp_cd3.like(bind("cst_grp_cd3"))).cutoff$and(S0_CST.bp_grp_cd4.like(bind("cst_grp_cd4"))).cutoff$and(S0_CST.bp_grp_cd5.like(bind("cst_grp_cd5"))).cutoff$and(S0_CST.bp_grp_cd6.like(bind("cst_grp_cd6"))).cutoff$and(S0_CST.bp_grp_cd7.like(bind("cst_grp_cd7"))).cutoff$and(S0_CST.bp_grp_cd8.like(bind("cst_grp_cd8"))).cutoff$and(S0_CST.bp_grp_cd9.like(bind("cst_grp_cd9"))).cutoff$and(S0_CST.bp_grp_cd10.like(bind("cst_grp_cd10")))),
				when(boundOr("dlv_cntry_nm", "dlv_area_nm", "dlv_grp_nm1", "dlv_grp_nm2", "dlv_grp_nm3", "dlv_grp_nm4", "dlv_grp_nm5", "dlv_grp_nm6", "dlv_grp_nm7", "dlv_grp_nm8", "dlv_grp_nm9", "dlv_grp_nm10", "dlv_nm", "dlv_cntry_cd", "dlv_area_cd", "dlv_grp_cd1", "dlv_grp_cd2", "dlv_grp_cd3", "dlv_grp_cd4", "dlv_grp_cd5", "dlv_grp_cd6", "dlv_grp_cd7", "dlv_grp_cd8", "dlv_grp_cd9", "dlv_grp_cd10"))
					.view(v -> v.leftOuterJoin(S0_DLV).on(S0_T.dlv_cd.eq(S0_DLV.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DLV.bp_nm.like(bind("dlv_nm"))).cutoff$and(S0_DLV.cntry_cd.like(bind("dlv_cntry_cd"))).cutoff$and(S0_DLV.area_cd.like(bind("dlv_area_cd"))).cutoff$and(S0_DLV.bp_grp_cd1.like(bind("dlv_grp_cd1"))).cutoff$and(S0_DLV.bp_grp_cd2.like(bind("dlv_grp_cd2"))).cutoff$and(S0_DLV.bp_grp_cd3.like(bind("dlv_grp_cd3"))).cutoff$and(S0_DLV.bp_grp_cd4.like(bind("dlv_grp_cd4"))).cutoff$and(S0_DLV.bp_grp_cd5.like(bind("dlv_grp_cd5"))).cutoff$and(S0_DLV.bp_grp_cd6.like(bind("dlv_grp_cd6"))).cutoff$and(S0_DLV.bp_grp_cd7.like(bind("dlv_grp_cd7"))).cutoff$and(S0_DLV.bp_grp_cd8.like(bind("dlv_grp_cd8"))).cutoff$and(S0_DLV.bp_grp_cd9.like(bind("dlv_grp_cd9"))).cutoff$and(S0_DLV.bp_grp_cd10.like(bind("dlv_grp_cd10")))),
				when(boundOr("dest_nm1"))
					.view(v -> v.leftOuterJoin(S0_DEST1).on(S0_T.dest_cd1.eq(S0_DEST1.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST1.bp_nm.like(bind("dest_nm1")))),
				when(boundOr("dest_nm2"))
					.view(v -> v.leftOuterJoin(S0_DEST2).on(S0_T.dest_cd2.eq(S0_DEST2.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST2.bp_nm.like(bind("dest_nm2")))),
				when(boundOr("dest_nm3"))
					.view(v -> v.leftOuterJoin(S0_DEST3).on(S0_T.dest_cd3.eq(S0_DEST3.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_DEST3.bp_nm.like(bind("dest_nm3")))),
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("wg_nm"))
					.view(v -> v.leftOuterJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd)))
					.predicate(p -> p.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))),
				when(boundOr("cur_nm"))
					.view(v -> v.leftOuterJoin(S0_CUR).on(S0_T.cur_cd.eq(S0_CUR.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_CUR.cur_nm.like(bind("cur_nm")))),
				when(boundOr("cmn_only_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))),
				when(boundOr("wg_only_flg"))
					.predicate(DS0D, p -> p.and(exists(subQuery().select(S1_RDWG.prAll()).from(S1_RDWG).where(S1_RDWG.wg_cd.eq(S0_T.wg_cd))))),
				when(boundOr("cmn_wg_flg"))
					.predicate(DS0D, p -> p.and(S0_T.wg_cd.eq(value(MAC_STR.NULL_VAL.value())).or(exists(subQuery().select(S2_RDWG.prAll()).from(S2_RDWG).where(S2_RDWG.wg_cd.eq(S0_T.wg_cd)))))),
				when(boundOr("cst_cntry_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_CNTRY).on(S0_CST.cntry_cd.eq(S0_CST_CNTRY.cntry_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_CNTRY.cntry_nm.like(bind("cst_cntry_nm")))),
				when(boundOr("cst_area_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_AREA).on(S0_CST.area_cd.eq(S0_CST_AREA.area_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_AREA.area_nm.like(bind("cst_area_nm")))),
				when(boundOr("dlv_cntry_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_CNTRY).on(S0_DLV.cntry_cd.eq(S0_DLV_CNTRY.cntry_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_CNTRY.cntry_nm.like(bind("dlv_cntry_nm")))),
				when(boundOr("dlv_area_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_AREA).on(S0_DLV.area_cd.eq(S0_DLV_AREA.area_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_AREA.area_nm.like(bind("dlv_area_nm")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("cst_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP1).on(S0_CST.bp_grp_cd1.eq(S0_CST_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_CST_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP1.bp_grp_nm.like(bind("cst_grp_nm1")))),
				when(boundOr("cst_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP2).on(S0_CST.bp_grp_cd2.eq(S0_CST_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_CST_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP2.bp_grp_nm.like(bind("cst_grp_nm2")))),
				when(boundOr("cst_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP3).on(S0_CST.bp_grp_cd3.eq(S0_CST_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_CST_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP3.bp_grp_nm.like(bind("cst_grp_nm3")))),
				when(boundOr("cst_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP4).on(S0_CST.bp_grp_cd4.eq(S0_CST_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_CST_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP4.bp_grp_nm.like(bind("cst_grp_nm4")))),
				when(boundOr("cst_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP5).on(S0_CST.bp_grp_cd5.eq(S0_CST_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_CST_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP5.bp_grp_nm.like(bind("cst_grp_nm5")))),
				when(boundOr("cst_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP6).on(S0_CST.bp_grp_cd6.eq(S0_CST_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_CST_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP6.bp_grp_nm.like(bind("cst_grp_nm6")))),
				when(boundOr("cst_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP7).on(S0_CST.bp_grp_cd7.eq(S0_CST_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_CST_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP7.bp_grp_nm.like(bind("cst_grp_nm7")))),
				when(boundOr("cst_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP8).on(S0_CST.bp_grp_cd8.eq(S0_CST_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_CST_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP8.bp_grp_nm.like(bind("cst_grp_nm8")))),
				when(boundOr("cst_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP9).on(S0_CST.bp_grp_cd9.eq(S0_CST_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_CST_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP9.bp_grp_nm.like(bind("cst_grp_nm9")))),
				when(boundOr("cst_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CST_GRP10).on(S0_CST.bp_grp_cd10.eq(S0_CST_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_CST_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_CST_GRP10.bp_grp_nm.like(bind("cst_grp_nm10")))),
				when(boundOr("dlv_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP1).on(S0_DLV.bp_grp_cd1.eq(S0_DLV_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_DLV_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP1.bp_grp_nm.like(bind("dlv_grp_nm1")))),
				when(boundOr("dlv_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP2).on(S0_DLV.bp_grp_cd2.eq(S0_DLV_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_DLV_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP2.bp_grp_nm.like(bind("dlv_grp_nm2")))),
				when(boundOr("dlv_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP3).on(S0_DLV.bp_grp_cd3.eq(S0_DLV_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_DLV_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP3.bp_grp_nm.like(bind("dlv_grp_nm3")))),
				when(boundOr("dlv_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP4).on(S0_DLV.bp_grp_cd4.eq(S0_DLV_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_DLV_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP4.bp_grp_nm.like(bind("dlv_grp_nm4")))),
				when(boundOr("dlv_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP5).on(S0_DLV.bp_grp_cd5.eq(S0_DLV_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_DLV_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP5.bp_grp_nm.like(bind("dlv_grp_nm5")))),
				when(boundOr("dlv_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP6).on(S0_DLV.bp_grp_cd6.eq(S0_DLV_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_DLV_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP6.bp_grp_nm.like(bind("dlv_grp_nm6")))),
				when(boundOr("dlv_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP7).on(S0_DLV.bp_grp_cd7.eq(S0_DLV_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_DLV_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP7.bp_grp_nm.like(bind("dlv_grp_nm7")))),
				when(boundOr("dlv_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP8).on(S0_DLV.bp_grp_cd8.eq(S0_DLV_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_DLV_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP8.bp_grp_nm.like(bind("dlv_grp_nm8")))),
				when(boundOr("dlv_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP9).on(S0_DLV.bp_grp_cd9.eq(S0_DLV_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_DLV_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP9.bp_grp_nm.like(bind("dlv_grp_nm9")))),
				when(boundOr("dlv_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_DLV_GRP10).on(S0_DLV.bp_grp_cd10.eq(S0_DLV_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_DLV_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_DLV_GRP10.bp_grp_nm.like(bind("dlv_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("itm_jnl_nm", m.itm_jnl_nm());
					}),
					j -> j
						.add(MAM_UNIT_R.class, r -> toCondition(
							r.getStringNE("unit_cd")
						))
						.addSelect(m -> toArray(
							m.unit_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("unit_nm", m.unit_nm());
					}),
					j -> j
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("dpt_cd"),
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dpt_nm", m.dpt_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dlv_cd")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dlv_nm", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd1")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm1", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd2")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm2", m.bp_nm());
					}),
					j -> j
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("dest_cd3")
						))
						.addSelect(m -> toArray(
							m.bp_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("dest_nm3", m.bp_nm());
					}),
					j -> j
						.add(MAM_TERM_R.class, r -> toCondition(
							r.getDateNE("term")
						))
						.addSelect(m -> toArray(
							m.term_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("term_nm", m.term_nm());
					}),
					j -> j
						.add(MAM_CALC_CTG_R.class, r -> toCondition(
							r.getStringNE("calc_ctg_cd")
						))
						.addSelect(m -> toArray(
							m.calc_ctg_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("calc_ctg_nm", m.calc_ctg_nm());
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
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("cur_cd")
						))
						.addSelect(m -> toArray(
							m.cur_nm,
							m.upri_dec_place
						))
						.addMap((r, m) -> {
							r.setStringNE("cur_nm", m.cur_nm());
							r.setNumberNE("upri_dec_place", m.upri_dec_place());
					})
				)
			);
	}
}