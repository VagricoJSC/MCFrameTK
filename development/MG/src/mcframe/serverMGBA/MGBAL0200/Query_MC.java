package mcframe.serverMGBA.MGBAL0200;

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
	 * -- MGBAL0200_MGT_PLN_INPT_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_INPT_I01() {
		MGT_PLN_INPT_R S0 = MGT_PLN_INPT_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S1_PAR = MAM_ITM_R.create("PAR");
		MAM_ITM_R S1_CHD = MAM_ITM_R.create("CHD");
		MGT_ACT_INPT_IF_R S2_T1 = MGT_ACT_INPT_IF_R.create("T1");
		MGT_ITM_MFG_INST_R S2_T2 = MGT_ITM_MFG_INST_R.create("T2");
		MGT_INST_OPER_R S2_T3 = MGT_INST_OPER_R.create("T3");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S3_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S4_OPER = MAM_OPER_R.create("OPER");
		MAM_COST_DPT_R S5_INPT_DPT = MAM_COST_DPT_R.create("INPT_DPT");
		MAM_BP_R S6_BP = MAM_BP_R.create("BP");
		MAM_CUR_R S7_CUR = MAM_CUR_R.create("CUR");
		MAM_EXPNS_R S8_EXPNS = MAM_EXPNS_R.create("EXPNS");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_INPT_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_inpt_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.par_itm_cd,
						S0.par_itm_sub1,
						S0.par_itm_sub2,
						S0.par_itm_sub3,
						S0.par_lot_no,
						S0.par_sublot_no,
						S0.par_sno1,
						S0.par_sno2,
						S0.par_sno3,
						S0.par_sno4,
						S0.asst_typ,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.oper_cd,
						S0.oper_seq,
						S0.inpt_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.stk_bp_cd,
						S0.prov_typ,
						S0.unit_cd,
						S0.qty,
						S0.cur_cd,
						S0.amt,
						S0.expns_cd
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_INPT_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T2.mng_dpt_cd),
							S1_T.pr(S2_T1.par_itm_cd),
							S1_T.pr(S2_T1.par_itm_sub1),
							S1_T.pr(S2_T1.par_itm_sub2),
							S1_T.pr(S2_T1.par_itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr("asst_typ"),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr(S2_T3.oper_cd),
							S1_T.pr(S2_T3.oper_seq),
							S1_T.pr("inpt_dpt_cd"),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.stk_bp_cd),
							S1_T.pr("prov_typ"),
							S1_CHD.unit_cd,
							sum(S1_T.pr(S2_T1.qty)),
							S1_T.pr("cur_cd"),
							sum(S1_T.pr("amt")),
							S1_T.pr(S2_T1.expns_cd)
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T2.mng_dpt_cd,
								S2_T1.par_itm_cd,
								S2_T1.par_itm_sub1,
								S2_T1.par_itm_sub2,
								S2_T1.par_itm_sub3,
								nvl(
									S2_T2.asst_typ,
									bind("asst_prod")
								).as("asst_typ"),
								S2_T1.loc_cd,
								S2_T1.str_ln_cd,
								S2_T3.oper_cd,
								S2_T3.oper_seq,
								S2_T1.mng_dpt_cd.as("inpt_dpt_cd"),
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.stk_bp_cd,
								decode(
									S2_T1.ac_slip_typ,
									bind("ac_slip_in_onr"),
									bind("prov_onr"),
									bind("ac_slip_in_ss"),
									bind("prov_ss"),
									nvl2(
										nvl(
											S2_T1.stk_bp_cd,
											S2_LOC.sppl_cd
										),
										bind("prov_ffr"),
										nullValue()
									)
								).as("prov_typ"),
								S2_T1.qty,
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										decode(
											S2_T1.amt,
											nullValue(),
											nullValue(),
											bind("bcur_cd")
										),
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											decode(
												S2_T1.amt,
												nullValue(),
												nullValue(),
												bind("bcur_cd")
											),
											S2_T1.trd_cur_cd
										)
									)
								).as("cur_cd"),
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										S2_T1.amt,
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											S2_T1.amt,
											S2_T1.trd_cur_amt
										)
									)
								).as("amt"),
								S2_T1.expns_cd
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									S2_T2.itm_cd.eq(S2_T1.par_itm_cd)
									.and(S2_T2.itm_sub1.eq(S2_T1.par_itm_sub1))
									.and(S2_T2.itm_sub2.eq(S2_T1.par_itm_sub2))
									.and(S2_T2.itm_sub3.eq(S2_T1.par_itm_sub3))
									.and(S2_T2.itm_mfg_inst_no.eq(S2_T1.itm_mfg_inst_no))
									.and(S2_T2.mfg_act_no.eq(S2_T1.mfg_act_no))
									.and(S2_T2.calc_ctg_cd.eq(S2_T1.calc_ctg_cd))
								)
								.leftOuterJoin(S2_T3).on(
									S2_T3.itm_cd.eq(S2_T1.par_itm_cd)
									.and(S2_T3.itm_sub1.eq(S2_T1.par_itm_sub1))
									.and(S2_T3.itm_sub2.eq(S2_T1.par_itm_sub2))
									.and(S2_T3.itm_sub3.eq(S2_T1.par_itm_sub3))
									.and(S2_T3.itm_mfg_inst_no.eq(S2_T1.itm_mfg_inst_no))
									.and(S2_T3.mfg_act_no.eq(S2_T1.mfg_act_no))
									.and(S2_T3.oper_act_no.eq(S2_T1.oper_act_no))
									.and(S2_T3.calc_ctg_cd.eq(S2_T1.calc_ctg_cd))
								)
								.innerJoin(S2_LOC).on(S2_LOC.loc_cd.eq(S2_T1.loc_cd))
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T2.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_PAR).on(
								S1_PAR.itm_cd.eq(S1_T.pr(S2_T1.par_itm_cd))
								.and(S1_PAR.itm_sub1.eq(S1_T.pr(S2_T1.par_itm_sub1)))
								.and(S1_PAR.itm_sub2.eq(S1_T.pr(S2_T1.par_itm_sub2)))
								.and(S1_PAR.itm_sub3.eq(S1_T.pr(S2_T1.par_itm_sub3)))
								.and(S1_PAR.del_flg.eq(value(false)))
							)
							.innerJoin(S1_CHD).on(
								S1_CHD.itm_cd.eq(S1_T.pr(S2_T1.itm_cd))
								.and(S1_CHD.itm_sub1.eq(S1_T.pr(S2_T1.itm_sub1)))
								.and(S1_CHD.itm_sub2.eq(S1_T.pr(S2_T1.itm_sub2)))
								.and(S1_CHD.itm_sub3.eq(S1_T.pr(S2_T1.itm_sub3)))
								.and(S1_CHD.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.str_ln_cd).eq(bind("null_val"))
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_STR_LN)
										.where(
											value(0).eq(value(0))
											.and(S3_STR_LN.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
											.and(S3_STR_LN.str_ln_cd.eq(S1_T.pr(S2_T1.str_ln_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T3.oper_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_OPER)
										.where(
											value(0).eq(value(0))
											.and(S4_OPER.oper_cd.eq(S1_T.pr(S2_T3.oper_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr("inpt_dpt_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S5_INPT_DPT)
										.where(
											value(0).eq(value(0))
											.and(S5_INPT_DPT.dpt_cd.eq(S1_T.pr("inpt_dpt_cd")))
											.and(S5_INPT_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.stk_bp_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S6_BP)
										.where(
											value(0).eq(value(0))
											.and(S6_BP.bp_cd.eq(S1_T.pr(S2_T1.stk_bp_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr("cur_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S7_CUR)
										.where(
											value(0).eq(value(0))
											.and(S7_CUR.cur_cd.eq(S1_T.pr("cur_cd")))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.expns_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S8_EXPNS)
										.where(
											value(0).eq(value(0))
											.and(S8_EXPNS.expns_cd.eq(S1_T.pr(S2_T1.expns_cd)))
										)
									)
								)
							)
						)
						.groupBy(
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T2.mng_dpt_cd),
							S1_T.pr(S2_T1.par_itm_cd),
							S1_T.pr(S2_T1.par_itm_sub1),
							S1_T.pr(S2_T1.par_itm_sub2),
							S1_T.pr(S2_T1.par_itm_sub3),
							S1_T.pr("asst_typ"),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr(S2_T3.oper_cd),
							S1_T.pr(S2_T3.oper_seq),
							S1_T.pr("inpt_dpt_cd"),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.stk_bp_cd),
							S1_T.pr("prov_typ"),
							S1_CHD.unit_cd,
							S1_T.pr("cur_cd"),
							S1_T.pr(S2_T1.expns_cd)
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_ITM_WK_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_ITM_WK_I01() {
		MGT_PLN_ITM_WK_R S0 = MGT_PLN_ITM_WK_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MGT_ACT_INST_WK_IF_R S2_T1 = MGT_ACT_INST_WK_IF_R.create("T1");
		MGT_ITM_MFG_INST_R S2_T2 = MGT_ITM_MFG_INST_R.create("T2");
		MGT_INST_OPER_R S2_T3 = MGT_INST_OPER_R.create("T3");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_STR_LN_R S3_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S4_OPER = MAM_OPER_R.create("OPER");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_ITM_WK_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_itm_wk_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.oper_cd,
						S0.oper_seq,
						S0.wk_cost_cd,
						S0.wk_cost
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_ITM_WK_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T2.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr(S2_T3.oper_cd),
							S1_T.pr(S2_T3.oper_seq),
							S1_T.pr(S2_T1.wk_cost_cd),
							S1_T.pr("wk_cost")
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T2.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd,
								S2_T1.str_ln_cd,
								S2_T3.oper_cd,
								S2_T3.oper_seq,
								S2_T1.wk_cost_cd,
								sum(S2_T1.wk_cost).as("wk_cost")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									S2_T2.itm_cd.eq(S2_T1.itm_cd)
									.and(S2_T2.itm_sub1.eq(S2_T1.itm_sub1))
									.and(S2_T2.itm_sub2.eq(S2_T1.itm_sub2))
									.and(S2_T2.itm_sub3.eq(S2_T1.itm_sub3))
									.and(S2_T2.itm_mfg_inst_no.eq(S2_T1.itm_mfg_inst_no))
									.and(S2_T2.mfg_act_no.eq(S2_T1.mfg_act_no))
									.and(S2_T2.calc_ctg_cd.eq(S2_T1.calc_ctg_cd))
								)
								.leftOuterJoin(S2_T3).on(
									S2_T3.itm_cd.eq(S2_T1.itm_cd)
									.and(S2_T3.itm_sub1.eq(S2_T1.itm_sub1))
									.and(S2_T3.itm_sub2.eq(S2_T1.itm_sub2))
									.and(S2_T3.itm_sub3.eq(S2_T1.itm_sub3))
									.and(S2_T3.itm_mfg_inst_no.eq(S2_T1.itm_mfg_inst_no))
									.and(S2_T3.mfg_act_no.eq(S2_T1.mfg_act_no))
									.and(S2_T3.oper_act_no.eq(S2_T1.oper_act_no))
									.and(S2_T3.calc_ctg_cd.eq(S2_T1.calc_ctg_cd))
								)
								.innerJoin(S2_ITM).on(
									S2_ITM.itm_cd.eq(S2_T1.itm_cd)
									.and(S2_ITM.itm_sub1.eq(S2_T1.itm_sub1))
									.and(S2_ITM.itm_sub2.eq(S2_T1.itm_sub2))
									.and(S2_ITM.itm_sub3.eq(S2_T1.itm_sub3))
									.and(S2_ITM.del_flg.eq(value(false)))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							)
							.groupBy(
								S2_T1.wg_cd,
								S2_T2.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd,
								S2_T1.str_ln_cd,
								S2_T3.oper_cd,
								S2_T3.oper_seq,
								S2_T1.wk_cost_cd
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T2.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
							.innerJoin(S1_WK_COST).on(S1_WK_COST.wk_cost_cd.eq(S1_T.pr(S2_T1.wk_cost_cd)))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.str_ln_cd).eq(bind("null_val"))
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_STR_LN)
										.where(
											value(0).eq(value(0))
											.and(S3_STR_LN.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
											.and(S3_STR_LN.str_ln_cd.eq(S1_T.pr(S2_T1.str_ln_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T3.oper_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_OPER)
										.where(
											value(0).eq(value(0))
											.and(S4_OPER.oper_cd.eq(S1_T.pr(S2_T3.oper_cd)))
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_MFG_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_MFG_I01() {
		MGT_PLN_MFG_R S0 = MGT_PLN_MFG_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MGT_ACT_MFG_IF_R S2_T1 = MGT_ACT_MFG_IF_R.create("T1");
		MGT_ITM_MFG_INST_R S2_T2 = MGT_ITM_MFG_INST_R.create("T2");
		MAM_STR_LN_R S3_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_CUR_R S4_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_MFG_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_mfg_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.loc_cd,
						S0.str_ln_cd,
						S0.asst_typ,
						S0.unit_cd,
						S0.qty,
						S0.cur_cd,
						S0.amt
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_MFG_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T2.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr("asst_typ"),
							S1_ITM.unit_cd,
							sum(S1_T.pr(S2_T1.qty)),
							S1_T.pr("cur_cd"),
							sum(S1_T.pr("amt"))
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T2.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.loc_cd,
								S2_T1.str_ln_cd,
								nvl(
									S2_T2.asst_typ,
									bind("asst_prod")
								).as("asst_typ"),
								S2_T1.qty,
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										decode(
											S2_T1.amt,
											nullValue(),
											nullValue(),
											bind("bcur_cd")
										),
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											decode(
												S2_T1.amt,
												nullValue(),
												nullValue(),
												bind("bcur_cd")
											),
											S2_T1.trd_cur_cd
										)
									)
								).as("cur_cd"),
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										S2_T1.amt,
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											S2_T1.amt,
											S2_T1.trd_cur_amt
										)
									)
								).as("amt")
							)
							.from(
								S2_T1
								.innerJoin(S2_T2).on(
									S2_T1.itm_cd.eq(S2_T2.itm_cd)
									.and(S2_T1.itm_sub1.eq(S2_T2.itm_sub1))
									.and(S2_T1.itm_sub2.eq(S2_T2.itm_sub2))
									.and(S2_T1.itm_sub3.eq(S2_T2.itm_sub3))
									.and(S2_T1.itm_mfg_inst_no.eq(S2_T2.itm_mfg_inst_no))
									.and(S2_T1.mfg_act_no.eq(S2_T2.mfg_act_no))
									.and(S2_T2.calc_ctg_cd.eq(S2_T1.calc_ctg_cd))
								)
							)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T2.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T.pr(S2_T1.itm_cd))
								.and(S1_ITM.itm_sub1.eq(S1_T.pr(S2_T1.itm_sub1)))
								.and(S1_ITM.itm_sub2.eq(S1_T.pr(S2_T1.itm_sub2)))
								.and(S1_ITM.itm_sub3.eq(S1_T.pr(S2_T1.itm_sub3)))
								.and(S1_ITM.del_flg.eq(value(false)))
							)
							.innerJoin(S1_LOC).on(S1_LOC.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.str_ln_cd).eq(bind("null_val"))
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_STR_LN)
										.where(
											value(0).eq(value(0))
											.and(S3_STR_LN.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
											.and(S3_STR_LN.str_ln_cd.eq(S1_T.pr(S2_T1.str_ln_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr("cur_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_CUR)
										.where(
											value(0).eq(value(0))
											.and(S4_CUR.cur_cd.eq(S1_T.pr("cur_cd")))
										)
									)
								)
							)
						)
						.groupBy(
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T2.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.str_ln_cd),
							S1_T.pr("asst_typ"),
							S1_ITM.unit_cd,
							S1_T.pr("cur_cd")
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_OTHER_WK_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_OTHER_WK_I01() {
		MGT_PLN_OTHER_WK_R S0 = MGT_PLN_OTHER_WK_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_WK_COST_R S1_WK_COST = MAM_WK_COST_R.create("WK_COST");
		MGT_ACT_OTHER_WK_IF_R S2_T1 = MGT_ACT_OTHER_WK_IF_R.create("T1");
		MAM_COST_DPT_R S3_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_COST_CTG_R S4_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_LOC_R S5_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S6_OPER = MAM_OPER_R.create("OPER");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_OTHER_WK_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_other_wk_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.dpt_cd,
						S0.ctg_cd,
						S0.loc_cd,
						S0.oper_cd,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.wk_cost_cd,
						S0.wk_cost
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_OTHER_WK_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.dpt_cd),
							S1_T.pr(S2_T1.ctg_cd),
							S1_T.pr(S2_T1.loc_cd),
							S1_T.pr(S2_T1.oper_cd),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							S1_T.pr(S2_T1.wk_cost_cd),
							S1_T.pr("wk_cost")
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T1.dpt_cd,
								S2_T1.ctg_cd,
								S2_T1.loc_cd,
								S2_T1.oper_cd,
								S2_T1.wk_cost_cd,
								sum(S2_T1.wk_cost).as("wk_cost")
							)
							.from(S2_T1)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							)
							.groupBy(
								S2_T1.wg_cd,
								S2_T1.dpt_cd,
								S2_T1.ctg_cd,
								S2_T1.loc_cd,
								S2_T1.oper_cd,
								S2_T1.wk_cost_cd
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_WK_COST).on(S1_WK_COST.wk_cost_cd.eq(S1_T.pr(S2_T1.wk_cost_cd)))
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_DPT)
										.where(
											value(0).eq(value(0))
											.and(S3_DPT.dpt_cd.eq(S1_T.pr(S2_T1.dpt_cd)))
											.and(S3_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.ctg_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_CTG)
										.where(
											value(0).eq(value(0))
											.and(S4_CTG.ctg_cd.eq(S1_T.pr(S2_T1.ctg_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.loc_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S5_LOC)
										.where(
											value(0).eq(value(0))
											.and(S5_LOC.loc_cd.eq(S1_T.pr(S2_T1.loc_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.oper_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S6_OPER)
										.where(
											value(0).eq(value(0))
											.and(S6_OPER.oper_cd.eq(S1_T.pr(S2_T1.oper_cd)))
										)
									)
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_PURC_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_PURC_I01() {
		MGT_PLN_PURC_R S0 = MGT_PLN_PURC_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_BP_R S1_SPPL = MAM_BP_R.create("SPPL");
		MGT_ACT_PURC_IF_R S2_T1 = MGT_ACT_PURC_IF_R.create("T1");
		MAM_COST_DPT_R S3_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_CUR_R S4_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_PURC_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_purc_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.sppl_cd,
						S0.alc_dpt_cd,
						S0.asst_typ,
						S0.unit_cd,
						S0.qty,
						S0.cur_cd,
						S0.amt
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_PURC_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.sppl_cd),
							S1_T.pr(S2_T1.alc_dpt_cd),
							S1_T.pr(S2_T1.asst_typ),
							S1_ITM.unit_cd,
							sum(S1_T.pr(S2_T1.qty)),
							S1_T.pr("trd_cur_cd"),
							sum(S1_T.pr("amt"))
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T1.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.sppl_cd,
								S2_T1.alc_dpt_cd,
								S2_T1.asst_typ,
								S2_T1.qty,
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										decode(
											S2_T1.amt,
											nullValue(),
											nullValue(),
											bind("bcur_cd")
										),
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											decode(
												S2_T1.amt,
												nullValue(),
												nullValue(),
												bind("bcur_cd")
											),
											S2_T1.trd_cur_cd
										)
									)
								).as("trd_cur_cd"),
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										S2_T1.amt,
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											S2_T1.amt,
											S2_T1.trd_cur_amt
										)
									)
								).as("amt")
							)
							.from(S2_T1)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T1.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T.pr(S2_T1.itm_cd))
								.and(S1_ITM.itm_sub1.eq(S1_T.pr(S2_T1.itm_sub1)))
								.and(S1_ITM.itm_sub2.eq(S1_T.pr(S2_T1.itm_sub2)))
								.and(S1_ITM.itm_sub3.eq(S1_T.pr(S2_T1.itm_sub3)))
								.and(S1_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.MNG.value())))
								.and(S1_ITM.del_flg.eq(value(false)))
							)
							.innerJoin(S1_SPPL).on(
								S1_SPPL.bp_cd.eq(S1_T.pr(S2_T1.sppl_cd))
								.and(S1_SPPL.sppl_flg.eq(value(true)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.alc_dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_ALC_DPT)
										.where(
											value(0).eq(value(0))
											.and(S3_ALC_DPT.dpt_cd.eq(S1_T.pr(S2_T1.alc_dpt_cd)))
											.and(S3_ALC_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr("trd_cur_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_CUR)
										.where(
											value(0).eq(value(0))
											.and(S4_CUR.cur_cd.eq(S1_T.pr("trd_cur_cd")))
										)
									)
								)
							)
						)
						.groupBy(
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.sppl_cd),
							S1_T.pr(S2_T1.alc_dpt_cd),
							S1_T.pr(S2_T1.asst_typ),
							S1_ITM.unit_cd,
							S1_T.pr("trd_cur_cd")
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_SLS_Query_I01
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_SLS_I01() {
		MGT_PLN_SLS_R S0 = MGT_PLN_SLS_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MGT_ACT_SLS_IF_R S2_T1 = MGT_ACT_SLS_IF_R.create("T1");
		MAM_COST_DPT_R S3_SLS_DPT = MAM_COST_DPT_R.create("SLS_DPT");
		MAM_COST_DPT_R S4_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_CUR_R S5_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_SLS_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_sls_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.asst_typ,
						S0.cst_cd,
						S0.dlv_cd,
						S0.sls_dpt_cd,
						S0.sls_usr_cd,
						S0.alc_dpt_cd,
						S0.dest_cd1,
						S0.dest_cd2,
						S0.dest_cd3,
						S0.cost_sls_cd1,
						S0.cost_sls_cd2,
						S0.cost_sls_cd3,
						S0.cost_sls_cd4,
						S0.cost_sls_cd5,
						S0.unit_cd,
						S0.qty,
						S0.cur_cd,
						S0.amt
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_SLS_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.asst_typ),
							nullValue(),
							nullValue(),
							S1_T.pr(S2_T1.sls_dpt_cd),
							nullValue(),
							S1_T.pr(S2_T1.alc_dpt_cd),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							nullValue(),
							S1_ITM.unit_cd,
							sum(S1_T.pr(S2_T1.qty)),
							S1_T.pr("trd_cur_cd"),
							sum(S1_T.pr("trd_cur_amt"))
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T1.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.asst_typ,
								S2_T1.sls_dpt_cd,
								S2_T1.alc_dpt_cd,
								S2_T1.qty,
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										decode(
											S2_T1.amt,
											nullValue(),
											nullValue(),
											bind("bcur_cd")
										),
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											decode(
												S2_T1.amt,
												nullValue(),
												nullValue(),
												bind("bcur_cd")
											),
											S2_T1.trd_cur_cd
										)
									)
								).as("trd_cur_cd"),
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										S2_T1.amt,
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											S2_T1.amt,
											S2_T1.trd_cur_amt
										)
									)
								).as("trd_cur_amt")
							)
							.from(S2_T1)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T1.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T.pr(S2_T1.itm_cd))
								.and(S1_ITM.itm_sub1.eq(S1_T.pr(S2_T1.itm_sub1)))
								.and(S1_ITM.itm_sub2.eq(S1_T.pr(S2_T1.itm_sub2)))
								.and(S1_ITM.itm_sub3.eq(S1_T.pr(S2_T1.itm_sub3)))
								.and(S1_ITM.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.sls_dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_SLS_DPT)
										.where(
											value(0).eq(value(0))
											.and(S3_SLS_DPT.dpt_cd.eq(S1_T.pr(S2_T1.sls_dpt_cd)))
											.and(S3_SLS_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.alc_dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_ALC_DPT)
										.where(
											value(0).eq(value(0))
											.and(S4_ALC_DPT.dpt_cd.eq(S1_T.pr(S2_T1.alc_dpt_cd)))
											.and(S4_ALC_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr("trd_cur_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S5_CUR)
										.where(
											value(0).eq(value(0))
											.and(S5_CUR.cur_cd.eq(S1_T.pr("trd_cur_cd")))
										)
									)
								)
							)
						)
						.groupBy(
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.asst_typ),
							S1_T.pr(S2_T1.sls_dpt_cd),
							S1_T.pr(S2_T1.alc_dpt_cd),
							S1_ITM.unit_cd,
							S1_T.pr("trd_cur_cd")
						)
					)
			);
	}
	
	/**
	 * -- MGBAL0200_MGT_PLN_SLS_Query_I02
	 */
	static MCQueryPlan MGBAL0200_MGT_PLN_SLS_I02() {
		MGT_PLN_SLS_R S0 = MGT_PLN_SLS_R.create();
		MCTempView S1_T = createTempView("T");
		MAVM_WR_WG_R S1_WG = MAVM_WR_WG_R.create("WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MGT_ACT_SLS_IF_R S2_T1 = MGT_ACT_SLS_IF_R.create("T1");
		MAM_BP_R S3_CST = MAM_BP_R.create("CST");
		MAM_BP_R S4_DLV = MAM_BP_R.create("DLV");
		MAM_COST_DPT_R S5_SLS_DPT = MAM_COST_DPT_R.create("SLS_DPT");
		MAM_USR_R S6_USR = MAM_USR_R.create("USR");
		MAM_COST_DPT_R S7_ALC_DPT = MAM_COST_DPT_R.create("ALC_DPT");
		MAM_BP_R S8_DEST1 = MAM_BP_R.create("DEST1");
		MAM_BP_R S9_DEST2 = MAM_BP_R.create("DEST2");
		MAM_BP_R S10_DEST3 = MAM_BP_R.create("DEST3");
		MAM_COST_SLS_R S11_COST_SLS1 = MAM_COST_SLS_R.create("COST_SLS1");
		MAM_COST_SLS_R S12_COST_SLS2 = MAM_COST_SLS_R.create("COST_SLS2");
		MAM_COST_SLS_R S13_COST_SLS3 = MAM_COST_SLS_R.create("COST_SLS3");
		MAM_COST_SLS_R S14_COST_SLS4 = MAM_COST_SLS_R.create("COST_SLS4");
		MAM_COST_SLS_R S15_COST_SLS5 = MAM_COST_SLS_R.create("COST_SLS5");
		MAM_CUR_R S16_CUR = MAM_CUR_R.create("CUR");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBAL0200_MGT_PLN_SLS_Query_I02")
					.insert(S0)
					.columns(
						S0.pln_sls_key,
						S0.calc_ctg_cd,
						S0.ym,
						S0.wg_cd,
						S0.mng_dpt_cd,
						S0.itm_cd,
						S0.itm_sub1,
						S0.itm_sub2,
						S0.itm_sub3,
						S0.lot_no,
						S0.sublot_no,
						S0.sno1,
						S0.sno2,
						S0.sno3,
						S0.sno4,
						S0.asst_typ,
						S0.cst_cd,
						S0.dlv_cd,
						S0.sls_dpt_cd,
						S0.sls_usr_cd,
						S0.alc_dpt_cd,
						S0.dest_cd1,
						S0.dest_cd2,
						S0.dest_cd3,
						S0.cost_sls_cd1,
						S0.cost_sls_cd2,
						S0.cost_sls_cd3,
						S0.cost_sls_cd4,
						S0.cost_sls_cd5,
						S0.unit_cd,
						S0.qty,
						S0.cur_cd,
						S0.amt
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_SLS_KEY.value())),
							bind("pln_calc_ctg_cd"),
							bind("pln_ym"),
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							bind("null_val"),
							S1_T.pr(S2_T1.asst_typ),
							S1_T.pr(S2_T1.cst_cd),
							S1_T.pr(S2_T1.dlv_cd),
							S1_T.pr(S2_T1.sls_dpt_cd),
							S1_T.pr(S2_T1.sls_usr_cd),
							S1_T.pr(S2_T1.alc_dpt_cd),
							S1_T.pr(S2_T1.dest_cd1),
							S1_T.pr(S2_T1.dest_cd2),
							S1_T.pr(S2_T1.dest_cd3),
							S1_T.pr(S2_T1.cost_sls_cd1),
							S1_T.pr(S2_T1.cost_sls_cd2),
							S1_T.pr(S2_T1.cost_sls_cd3),
							S1_T.pr(S2_T1.cost_sls_cd4),
							S1_T.pr(S2_T1.cost_sls_cd5),
							S1_ITM.unit_cd,
							sum(S1_T.pr(S2_T1.qty)),
							S1_T.pr("trd_cur_cd"),
							sum(S1_T.pr("trd_cur_amt"))
						)
						.from(
							subQuery()
							.select(
								S2_T1.wg_cd,
								S2_T1.mng_dpt_cd,
								S2_T1.itm_cd,
								S2_T1.itm_sub1,
								S2_T1.itm_sub2,
								S2_T1.itm_sub3,
								S2_T1.asst_typ,
								S2_T1.cst_cd,
								S2_T1.dlv_cd,
								S2_T1.sls_dpt_cd,
								S2_T1.sls_usr_cd,
								S2_T1.alc_dpt_cd,
								S2_T1.dest_cd1,
								S2_T1.dest_cd2,
								S2_T1.dest_cd3,
								S2_T1.cost_sls_cd1,
								S2_T1.cost_sls_cd2,
								S2_T1.cost_sls_cd3,
								S2_T1.cost_sls_cd4,
								S2_T1.cost_sls_cd5,
								S2_T1.qty,
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										decode(
											S2_T1.amt,
											nullValue(),
											nullValue(),
											bind("bcur_cd")
										),
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											decode(
												S2_T1.amt,
												nullValue(),
												nullValue(),
												bind("bcur_cd")
											),
											S2_T1.trd_cur_cd
										)
									)
								).as("trd_cur_cd"),
								decode(
									bind("amt_flg_str"),
									value(false),
									nullValue(),
									decode(
										bind("trd_amt_flg_str"),
										value(false),
										S2_T1.amt,
										decode(
											S2_T1.trd_cur_amt,
											nullValue(),
											S2_T1.amt,
											S2_T1.trd_cur_amt
										)
									)
								).as("trd_cur_amt")
							)
							.from(S2_T1)
							.where(
								value(0).eq(value(0))
								.cutoff$and(S2_T1.calc_ctg_cd.like(bind("act_calc_ctg_cd")))
								.cutoff$and(S2_T1.ym.between(bind("act_ym_fr"), bind("act_ym_to")))
								.cutoff$and(S2_T1.ym.eq(bind("act_ym")))
								.and(S2_T1.no_pln_flg.eq(value(false)))
							).view(S1_T)
							.innerJoin(S1_WG).on(S1_WG.wg_cd.eq(S1_T.pr(S2_T1.wg_cd)))
							.innerJoin(S1_TERM).on(bind("pln_ym").between(S1_TERM.term, S1_TERM.term_end_ym.subtractDays(value(MCNumber.ONE))))
							.innerJoin(S1_DPT).on(
								S1_DPT.dpt_cd.eq(S1_T.pr(S2_T1.mng_dpt_cd))
								.and(S1_DPT.term.eq(S1_TERM.term))
							)
							.innerJoin(S1_ITM).on(
								S1_ITM.itm_cd.eq(S1_T.pr(S2_T1.itm_cd))
								.and(S1_ITM.itm_sub1.eq(S1_T.pr(S2_T1.itm_sub1)))
								.and(S1_ITM.itm_sub2.eq(S1_T.pr(S2_T1.itm_sub2)))
								.and(S1_ITM.itm_sub3.eq(S1_T.pr(S2_T1.itm_sub3)))
								.and(S1_ITM.del_flg.eq(value(false)))
							)
						)
						.where(
							value(0).eq(value(0))
							.and(
								S1_T.pr(S2_T1.cst_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S3_CST)
										.where(
											value(0).eq(value(0))
											.and(S3_CST.bp_cd.eq(S1_T.pr(S2_T1.cst_cd)))
											.and(S3_CST.cst_flg.eq(value(true)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.dlv_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S4_DLV)
										.where(
											value(0).eq(value(0))
											.and(S4_DLV.bp_cd.eq(S1_T.pr(S2_T1.dlv_cd)))
											.and(S4_DLV.dlv_flg.eq(value(true)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.sls_dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S5_SLS_DPT)
										.where(
											value(0).eq(value(0))
											.and(S5_SLS_DPT.dpt_cd.eq(S1_T.pr(S2_T1.sls_dpt_cd)))
											.and(S5_SLS_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.sls_usr_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S6_USR)
										.where(
											value(0).eq(value(0))
											.and(S6_USR.usr_cd.eq(S1_T.pr(S2_T1.sls_usr_cd)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.alc_dpt_cd).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S7_ALC_DPT)
										.where(
											value(0).eq(value(0))
											.and(S7_ALC_DPT.dpt_cd.eq(S1_T.pr(S2_T1.alc_dpt_cd)))
											.and(S7_ALC_DPT.term.eq(S1_TERM.term))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.dest_cd1).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S8_DEST1)
										.where(
											value(0).eq(value(0))
											.and(S8_DEST1.bp_cd.eq(S1_T.pr(S2_T1.dest_cd1)))
											.and(S8_DEST1.dest_flg.eq(value(true)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.dest_cd2).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S9_DEST2)
										.where(
											value(0).eq(value(0))
											.and(S9_DEST2.bp_cd.eq(S1_T.pr(S2_T1.dest_cd2)))
											.and(S9_DEST2.dest_flg.eq(value(true)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.dest_cd3).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S10_DEST3)
										.where(
											value(0).eq(value(0))
											.and(S10_DEST3.bp_cd.eq(S1_T.pr(S2_T1.dest_cd3)))
											.and(S10_DEST3.dest_flg.eq(value(true)))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.cost_sls_cd1).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S11_COST_SLS1)
										.where(
											value(0).eq(value(0))
											.and(S11_COST_SLS1.cost_sls_cd.eq(S1_T.pr(S2_T1.cost_sls_cd1)))
											.and(S11_COST_SLS1.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S1.value())))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.cost_sls_cd2).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S12_COST_SLS2)
										.where(
											value(0).eq(value(0))
											.and(S12_COST_SLS2.cost_sls_cd.eq(S1_T.pr(S2_T1.cost_sls_cd2)))
											.and(S12_COST_SLS2.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S2.value())))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.cost_sls_cd3).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S13_COST_SLS3)
										.where(
											value(0).eq(value(0))
											.and(S13_COST_SLS3.cost_sls_cd.eq(S1_T.pr(S2_T1.cost_sls_cd3)))
											.and(S13_COST_SLS3.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S3.value())))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.cost_sls_cd4).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S14_COST_SLS4)
										.where(
											value(0).eq(value(0))
											.and(S14_COST_SLS4.cost_sls_cd.eq(S1_T.pr(S2_T1.cost_sls_cd4)))
											.and(S14_COST_SLS4.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S4.value())))
										)
									)
								)
							)
							.and(
								S1_T.pr(S2_T1.cost_sls_cd5).isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S15_COST_SLS5)
										.where(
											value(0).eq(value(0))
											.and(S15_COST_SLS5.cost_sls_cd.eq(S1_T.pr(S2_T1.cost_sls_cd5)))
											.and(S15_COST_SLS5.cost_sls_typ.eq(value(MAC_COST_SLS_TYP.S5.value())))
										)
									)
								)
							)
							.and(
								S1_T.pr("trd_cur_cd").isNull()
								.or(
									exists(
										subQuery()
										.select(value(1))
										.from(S16_CUR)
										.where(
											value(0).eq(value(0))
											.and(S16_CUR.cur_cd.eq(S1_T.pr("trd_cur_cd")))
										)
									)
								)
							)
						)
						.groupBy(
							S1_T.pr(S2_T1.wg_cd),
							S1_T.pr(S2_T1.mng_dpt_cd),
							S1_T.pr(S2_T1.itm_cd),
							S1_T.pr(S2_T1.itm_sub1),
							S1_T.pr(S2_T1.itm_sub2),
							S1_T.pr(S2_T1.itm_sub3),
							S1_T.pr(S2_T1.asst_typ),
							S1_T.pr(S2_T1.cst_cd),
							S1_T.pr(S2_T1.dlv_cd),
							S1_T.pr(S2_T1.sls_dpt_cd),
							S1_T.pr(S2_T1.sls_usr_cd),
							S1_T.pr(S2_T1.alc_dpt_cd),
							S1_T.pr(S2_T1.dest_cd1),
							S1_T.pr(S2_T1.dest_cd2),
							S1_T.pr(S2_T1.dest_cd3),
							S1_T.pr(S2_T1.cost_sls_cd1),
							S1_T.pr(S2_T1.cost_sls_cd2),
							S1_T.pr(S2_T1.cost_sls_cd3),
							S1_T.pr(S2_T1.cost_sls_cd4),
							S1_T.pr(S2_T1.cost_sls_cd5),
							S1_ITM.unit_cd,
							S1_T.pr("trd_cur_cd")
						)
					)
			);
	}
}