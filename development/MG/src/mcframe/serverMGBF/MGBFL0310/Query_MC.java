package mcframe.serverMGBF.MGBFL0310;

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
	 * -- MGBFL0310_MGT_STK_LOSS_Query_S01
	 */
	static MCQueryPlan MGBFL0310_MGT_STK_LOSS_S01() {
		MGT_STK_LOSS_R S0_T = MGT_STK_LOSS_R.create("T");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_STK_EVAL_R S0_STK_EVAL = MAM_STK_EVAL_R.create("STK_EVAL");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
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
		MAM_CNTRY_R S0_CNTRY = MAM_CNTRY_R.create("CNTRY");
		MAM_AREA_R S0_AREA = MAM_AREA_R.create("AREA");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0310_MGT_STK_LOSS_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						S0_T.ym,
						S0_T.stk_eval_cd,
						S0_STK_EVAL.stk_eval_nm,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.mng_dpt_cd,
						S0_MNG_DPT.dpt_nm.as("mng_dpt_nm"),
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
						S0_ITM_TYP_D.itm_typ_d_nm,
						S0_ITM.itm_jnl_cd,
						S0_ITM_JNL.itm_jnl_nm,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.sppl_cd.as("bp_cd"),
						S0_BP.bp_nm,
						S0_T.asst_typ,
						S0_T.amt.as("loss"),
						S0_T.ins_usr_id,
						S0_T.ins_usr_nm,
						S0_T.ins_ts,
						S0_T.ins_func_id,
						S0_T.upd_cntr,
						S0_T.upd_usr_id,
						S0_T.upd_usr_nm,
						S0_T.upd_ts,
						S0_T.upd_func_id,
						S0_T.upd_srv_req_no
					)
					.from(
						S0_T
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.leftOuterJoin(S0_STK_EVAL).on(S0_STK_EVAL.stk_eval_cd.eq(S0_T.stk_eval_cd))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.dpt_cd.eq(S0_T.mng_dpt_cd)
							.and(S0_MNG_DPT.term.eq(S0_TERM.term))
						)
						.leftOuterJoin(S0_ITM).on(
							S0_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
						)
						.leftOuterJoin(S0_SUNDRY_ITM).on(
							S0_SUNDRY_ITM.itm_cd.eq(S0_T.itm_cd)
							.and(S0_SUNDRY_ITM.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_SUNDRY_ITM.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_SUNDRY_ITM.itm_sub3.eq(S0_T.itm_sub3))
							.and(S0_SUNDRY_ITM.sno1.eq(S0_T.sno1))
							.and(S0_SUNDRY_ITM.sno2.eq(S0_T.sno2))
							.and(S0_SUNDRY_ITM.sno3.eq(S0_T.sno3))
							.and(S0_SUNDRY_ITM.sno4.eq(S0_T.sno4))
						)
						.leftOuterJoin(S0_ITM_TYP_D).on(
							S0_ITM_TYP_D.itm_typ.eq(S0_ITM.itm_typ)
							.and(S0_ITM_TYP_D.itm_typ_d_cd.eq(S0_ITM.itm_typ_d_cd))
						)
						.leftOuterJoin(S0_ITM_JNL).on(S0_ITM_JNL.itm_jnl_cd.eq(S0_ITM.itm_jnl_cd))
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T.sppl_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_no.eq(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.cutoff$and(S0_T.stk_eval_cd.like(bind("stk_eval_cd")))
						.cutoff$and(S0_STK_EVAL.stk_eval_nm.like(bind("stk_eval_nm")))
						.cutoff$and(S0_ITM.itm_typ.like(bind("itm_typ")))
						.cutoff$and(S0_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
						.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
						.cutoff$and(S0_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
						.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
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
						.cutoff$and(S0_T.wg_cd.like(bind("wg_cd")))
						.cutoff$and(S0_WG.wg_nm.like(bind("wg_nm")))
						.cutoff$and(S0_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
						.cutoff$and(S0_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))
						.cutoff$and(S0_T.lot_no.like(bind("lot_no")))
						.cutoff$and(S0_T.sublot_no.like(bind("sublot_no")))
						.cutoff$and(S0_T.sno1.like(bind("sno1")))
						.cutoff$and(S0_T.sno2.like(bind("sno2")))
						.cutoff$and(S0_T.sno3.like(bind("sno3")))
						.cutoff$and(S0_T.sno4.like(bind("sno4")))
						.cutoff$and(S0_T.asst_typ.like(bind("asst_typ")))
						.cutoff$and(
							bind("no_bp_flg_str").eq(value(true))
							.and(S0_T.sppl_cd.isNull())
						)
						.cutoff$and(S0_T.sppl_cd.like(bind("bp_cd")))
						.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm")))
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
						.cutoff$and(S0_BP.bp_grp_cd1.like(bind("bp_grp_cd1")))
						.cutoff$and(S0_BP.bp_grp_cd2.like(bind("bp_grp_cd2")))
						.cutoff$and(S0_BP.bp_grp_cd3.like(bind("bp_grp_cd3")))
						.cutoff$and(S0_BP.bp_grp_cd4.like(bind("bp_grp_cd4")))
						.cutoff$and(S0_BP.bp_grp_cd5.like(bind("bp_grp_cd5")))
						.cutoff$and(S0_BP.bp_grp_cd6.like(bind("bp_grp_cd6")))
						.cutoff$and(S0_BP.bp_grp_cd7.like(bind("bp_grp_cd7")))
						.cutoff$and(S0_BP.bp_grp_cd8.like(bind("bp_grp_cd8")))
						.cutoff$and(S0_BP.bp_grp_cd9.like(bind("bp_grp_cd9")))
						.cutoff$and(S0_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))
						.cutoff$and(S0_BP.cntry_cd.like(bind("cntry_cd")))
						.cutoff$and(S0_BP.area_cd.like(bind("area_cd")))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						S0_T.stk_eval_cd.asc(),
						S0_T.wg_cd.asc(),
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
						S0_T.sppl_cd.asc(),
						S0_T.asst_typ.asc()
					)
			)
			.setDynamicSQLInfo(
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
				when(boundOr("bp_grp_nm1"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP1).on(S0_BP.bp_grp_cd1.eq(S0_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_BP_GRP1.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_nm2"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP2).on(S0_BP.bp_grp_cd2.eq(S0_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_BP_GRP2.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_nm3"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP3).on(S0_BP.bp_grp_cd3.eq(S0_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_BP_GRP3.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_nm4"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP4).on(S0_BP.bp_grp_cd4.eq(S0_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_BP_GRP4.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_nm5"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP5).on(S0_BP.bp_grp_cd5.eq(S0_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_BP_GRP5.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_nm6"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP6).on(S0_BP.bp_grp_cd6.eq(S0_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_BP_GRP6.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_nm7"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP7).on(S0_BP.bp_grp_cd7.eq(S0_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_BP_GRP7.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_nm8"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP8).on(S0_BP.bp_grp_cd8.eq(S0_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_BP_GRP8.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_nm9"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP9).on(S0_BP.bp_grp_cd9.eq(S0_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_BP_GRP9.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_nm10"))
					.view(DS0D, v -> v.leftOuterJoin(S0_BP_GRP10).on(S0_BP.bp_grp_cd10.eq(S0_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_BP_GRP10.bp_grp_typ))))
					.predicate(DS0D, p -> p.cutoff$and(S0_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("cntry_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_CNTRY).on(S0_BP.cntry_cd.eq(S0_CNTRY.cntry_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_CNTRY.cntry_nm.like(bind("cntry_nm")))),
				when(boundOr("area_nm"))
					.view(DS0D, v -> v.leftOuterJoin(S0_AREA).on(S0_BP.area_cd.eq(S0_AREA.area_cd)))
					.predicate(DS0D, p -> p.cutoff$and(S0_AREA.area_nm.like(bind("area_nm"))))
			);
	}
}