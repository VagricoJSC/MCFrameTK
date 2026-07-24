package mcframe.serverMGBB.MGBBL0380;

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
	 * -- MGBBL0380_MGT_ACT_STK_IF_Query_S01
	 */
	static MCQueryPlan MGBBL0380_MGT_ACT_STK_IF_S01() {
		MGT_ACT_STK_IF_R S0_T = MGT_ACT_STK_IF_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S0_AREA = MAM_AREA_R.create("AREA");
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
		MAM_BP_GRP_R S0_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S0_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S0_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S0_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S0_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S0_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S0_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S0_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S0_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S0_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0380_MGT_ACT_STK_IF_Query_S01")
					.mainQuery()
					.select(
						S0_T.data_lno,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.ym,
						S0_T.mng_dpt_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						S0_ITM.itm_jnl_cd,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.bp_cd,
						S0_T.asst_typ,
						S0_T.qty,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						S0_T.first_gr_dt,
						S0_T.vld_dt,
						S0_T.lmt_dt,
						S0_T.non_mov_base_dt,
						S0_T.rmrks,
						S0_T.sub_char1,
						S0_T.sub_char2,
						S0_T.sub_char3,
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
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_T.ym.gte(S0_TERM.term)
							.and(S0_T.ym.lt(S0_TERM.term_end_ym))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_T.itm_cd.eq(S0_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRY_ITM).on(
							S0_T.itm_cd.eq(S0_SUNDRY_ITM.itm_cd)
							.and(S0_T.itm_sub1.eq(S0_SUNDRY_ITM.itm_sub1))
							.and(S0_T.itm_sub2.eq(S0_SUNDRY_ITM.itm_sub2))
							.and(S0_T.itm_sub3.eq(S0_SUNDRY_ITM.itm_sub3))
							.and(S0_T.sno1.eq(S0_SUNDRY_ITM.sno1))
							.and(S0_T.sno2.eq(S0_SUNDRY_ITM.sno2))
							.and(S0_T.sno3.eq(S0_SUNDRY_ITM.sno3))
							.and(S0_T.sno4.eq(S0_SUNDRY_ITM.sno4))
						)
						.addDynamicView()
						.addDynamicView(DS0C_ITM_GRP)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
						.addDynamicPredicate()
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.ym.gte(bind("ym_fr")))
						.cutoff$and(S0_T.ym.lte(bind("ym_to")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_T.itm_cd.like(bind("itm_cd")))
						.cutoff$and(S0_T.itm_sub1.like(bind("itm_sub1")))
						.cutoff$and(S0_T.itm_sub2.like(bind("itm_sub2")))
						.cutoff$and(S0_T.itm_sub3.like(bind("itm_sub3")))
						.cutoff$and(
							nvl(
								S0_SUNDRY_ITM.itm_nm,
								S0_ITM.itm_nm
							).like(bind("itm_nm"))
						)
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.asst_typ.like(bind("asst_typ")))
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T.bp_cd.isNull())
						)
						.cutoff$and(
							bracket(
								bind("except_other_flg_str").eq(value(true))
								.and(
									S0_T.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
						)
						.addDynamicPredicate(DS0C_ITM_GRP)
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.mng_dpt_cd.asc(),
						S0_ITM.itm_typ.asc(),
						S0_ITM.itm_typ_d_cd.asc(),
						S0_ITM.itm_jnl_cd.asc(),
						S0_T.itm_cd.asc(),
						S0_T.itm_sub1.asc(),
						S0_T.itm_sub2.asc(),
						S0_T.itm_sub3.asc(),
						S0_T.lot_no.asc(),
						S0_T.sublot_no.asc(),
						S0_T.sno1.asc(),
						S0_T.sno2.asc(),
						S0_T.sno3.asc(),
						S0_T.sno4.asc(),
						S0_T.data_lno.asc()
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_nm"))
					.view(v -> v.leftOuterJoin(S0_CALC_CTG).on(S0_T.calc_ctg_cd.eq(S0_CALC_CTG.calc_ctg_cd)))
					.predicate(p -> p.cutoff$and(S0_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("mng_dpt_nm"))
					.view(v -> v.leftOuterJoin(S0_MNG_DPT).on(S0_T.mng_dpt_cd.eq(S0_MNG_DPT.dpt_cd).and(S0_TERM.term.eq(S0_MNG_DPT.term))))
					.predicate(p -> p.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("cntry_nm", "area_nm", "bp_grp_flg1", "bp_grp_flg2", "bp_grp_flg3", "bp_grp_flg4", "bp_grp_flg5", "bp_grp_flg6", "bp_grp_flg7", "bp_grp_flg8", "bp_grp_flg9", "bp_grp_flg10", "bp_nm", "cntry_cd", "area_cd"))
					.view(v -> v.leftOuterJoin(S0_BP).on(S0_T.bp_cd.eq(S0_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm"))).cutoff$and(S0_BP.cntry_cd.like(bind("cntry_cd"))).cutoff$and(S0_BP.area_cd.like(bind("area_cd")))),
				when(boundOr("cntry_nm"))
					.view(v -> v.leftOuterJoin(S0_CNTRY).on(S0_BP.cntry_cd.eq(S0_CNTRY.cntry_cd)))
					.predicate(p -> p.cutoff$and(S0_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(v -> v.leftOuterJoin(S0_AREA).on(S0_BP.area_cd.eq(S0_AREA.area_cd)))
					.predicate(p -> p.cutoff$and(S0_AREA.area_nm.like(bind("area_nm")))),
				when(boundOr("itm_grp_flg1"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP1).on(S0_ITM.itm_grp_cd1.eq(S0_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd1.like(bind("itm_grp_cd1"))).cutoff$and(S0_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP2).on(S0_ITM.itm_grp_cd2.eq(S0_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd2.like(bind("itm_grp_cd2"))).cutoff$and(S0_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP3).on(S0_ITM.itm_grp_cd3.eq(S0_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd3.like(bind("itm_grp_cd3"))).cutoff$and(S0_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP4).on(S0_ITM.itm_grp_cd4.eq(S0_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd4.like(bind("itm_grp_cd4"))).cutoff$and(S0_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP5).on(S0_ITM.itm_grp_cd5.eq(S0_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd5.like(bind("itm_grp_cd5"))).cutoff$and(S0_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP6).on(S0_ITM.itm_grp_cd6.eq(S0_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd6.like(bind("itm_grp_cd6"))).cutoff$and(S0_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP7).on(S0_ITM.itm_grp_cd7.eq(S0_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd7.like(bind("itm_grp_cd7"))).cutoff$and(S0_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP8).on(S0_ITM.itm_grp_cd8.eq(S0_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd8.like(bind("itm_grp_cd8"))).cutoff$and(S0_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP9).on(S0_ITM.itm_grp_cd9.eq(S0_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd9.like(bind("itm_grp_cd9"))).cutoff$and(S0_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.view(DS0C_ITM_GRP, v -> v.leftOuterJoin(S0_ITM_GRP10).on(S0_ITM.itm_grp_cd10.eq(S0_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_BP.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_BP.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_BP.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_BP.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_BP.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_BP.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_BP.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_BP.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_BP.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_BP.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_BP.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10"))))
			)
			.setJoinInfo(
				joinInfo(
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
						.add(MAM_COST_DPT_R.class, r -> toCondition(
							r.getStringNE("mng_dpt_cd"),
							r.getDateNE("join_term_")
						))
						.addSelect(m -> toArray(
							m.dpt_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("mng_dpt_nm", m.dpt_nm());
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
						.add(MAM_BP_R.class, r -> toCondition(
							r.getStringNE("bp_cd")
						))
						.addSelect(m -> toArray(
							m.area_cd,
							m.bp_nm,
							m.cntry_cd
						))
						.addMap((r, m) -> {
							r.setStringNE("bp_nm", m.bp_nm());
							r.setStringNE("join_cntry_cd_", m.cntry_cd());
							r.setStringNE("join_area_cd_", m.area_cd());
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
					})
				)
			);
	}
}