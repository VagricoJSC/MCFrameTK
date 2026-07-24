package mcframe.serverMGBF.MGBFL0300;

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
	 * -- MGBFL0300_MGT_ACC_TOP_Query_S01
	 */
	static MCQueryPlan MGBFL0300_MGT_ACC_TOP_S01() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S0_T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_STK_LOSS_R S0_T3 = MGT_STK_LOSS_R.create("T3");
		MGW_STK_EVAL_R S0_T4 = MGW_STK_EVAL_R.create("T4");
		MGW_ACT_STK_R S0_T5 = MGW_ACT_STK_R.create("T5");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_STK_EVAL_R S0_STK_EVAL = MAM_STK_EVAL_R.create("STK_EVAL");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CALC_PTN_R S0_CALC_PTN = MAM_CALC_PTN_R.create("CALC_PTN");
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
				sql("MGBFL0300_MGT_ACC_TOP_Query_S01")
					.mainQuery()
					.select(
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						bind("stk_eval_cd").as("stk_eval_cd"),
						S0_T.ym,
						decode(
							S0_T3.calc_no,
							nullValue(),
							value(false),
							value(true)
						).as("summed_flg"),
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
						S0_T.bp_cd,
						S0_BP.bp_nm,
						S0_T.asst_typ,
						S0_T.qty,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						sum(S0_T2.act_cost).as("stk_amt"),
						MAPA_CALC$F_RND(
							S0_T.qty.multiply(S0_T4.upri).divide(S0_T4.base_qty),
							bind("amt_dec_place"),
							bind("amt_rnd_typ")
						).as("eval_amt"),
						S0_T3.amt.as("summed_loss"),
						S0_T5.first_gr_dt,
						S0_T5.vld_dt,
						S0_T5.lmt_dt,
						S0_T5.non_mov_base_dt,
						monthsBetween(
							bind("ym"),
							S0_T5.non_mov_base_dt
						).as("non_mov_num")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T3.calc_no.eq(S0_T.calc_no)
							.and(S0_T3.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T3.wg_cd.eq(S0_T.wg_cd))
							.and(S0_T3.ym.eq(S0_T.ym))
							.and(S0_T3.mng_dpt_cd.eq(S0_T.mng_dpt_cd))
							.and(S0_T3.itm_cd.eq(S0_T.itm_cd))
							.and(S0_T3.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_T3.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_T3.itm_sub3.eq(S0_T.itm_sub3))
							.and(S0_T3.lot_no.eq(S0_T.lot_no))
							.and(S0_T3.sublot_no.eq(S0_T.sublot_no))
							.and(S0_T3.sno1.eq(S0_T.sno1))
							.and(S0_T3.sno2.eq(S0_T.sno2))
							.and(S0_T3.sno3.eq(S0_T.sno3))
							.and(S0_T3.sno4.eq(S0_T.sno4))
							.and(
								nvl(
									S0_T3.sppl_cd,
									bind("dummy_string")
								).eq(nvl(
										S0_T.bp_cd,
										bind("dummy_string")
									)
								)
							)
							.and(S0_T3.asst_typ.eq(S0_T.asst_typ))
						)
						.leftOuterJoin(S0_ITM).on(
								S0_ITM.itm_cd.eq(S0_T.itm_cd)
								.and(S0_ITM.itm_sub1.eq(S0_T.itm_sub1))
								.and(S0_ITM.itm_sub2.eq(S0_T.itm_sub2))
								.and(S0_ITM.itm_sub3.eq(S0_T.itm_sub3))
							)
						.leftOuterJoin(S0_CALC_PTN).on(S0_CALC_PTN.calc_ptn_cd.eq(S0_ITM.calc_ptn_cd))
						.innerJoin(S0_T4).on(
							S0_T4.wg_cd.eq(S0_T.wg_cd)
							.and(
								S0_T4.mng_dpt_cd.eq(S0_T.mng_dpt_cd)
								.or(S0_T4.mng_dpt_cd.eq(value(MAC_STR.NULL_VAL.value())))
							)
							.and(S0_T4.itm_cd.eq(S0_T.itm_cd))
							.and(S0_T4.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_T4.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_T4.itm_sub3.eq(S0_T.itm_sub3))
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.lot_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.lot_no.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.lot_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.lot_no.eq(S0_T.lot_no))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.sublot_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.sublot_no.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.sublot_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.sublot_no.eq(S0_T.sublot_no))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.sno1_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.sno1.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.sno1_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.sno1.eq(S0_T.sno1))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.sno2_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.sno2.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.sno2_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.sno2.eq(S0_T.sno2))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.sno3_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.sno3.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.sno3_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.sno3.eq(S0_T.sno3))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								bracket(
									nvl(
										S0_CALC_PTN.sno4_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.NON.value()))
									.or(bind("upri_set_typ").eq(bind("upri_set_typ_std")))
								)
								.and(S0_T4.sno4.eq(value(MAC_STR.NULL_VAL.value())))
								.or(
									nvl(
										S0_CALC_PTN.sno4_loss_eval_typ,
										value(MAC_LOSS_EVAL_TYP.NON.value())
									).eq(value(MAC_LOSS_EVAL_TYP.TGT.value()))
								)
								.and(S0_T4.sno4.eq(S0_T.sno4))
								.and(
									bind("upri_set_typ").isNull()
									.or(bind("upri_set_typ").neq(bind("upri_set_typ_std")))
								)
							)
							.and(
								S0_T4.asst_typ.eq(S0_T.asst_typ)
								.or(S0_T4.asst_typ.eq(value(MAC_STR.NULL_VAL.value())))
							)
						)
						.leftOuterJoin(S0_T5).on(
							S0_T5.wg_cd.eq(S0_T.wg_cd)
							.and(S0_T5.mng_dpt_cd.eq(S0_T.mng_dpt_cd))
							.and(S0_T5.itm_cd.eq(S0_T.itm_cd))
							.and(S0_T5.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_T5.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_T5.itm_sub3.eq(S0_T.itm_sub3))
							.and(S0_T5.lot_no.eq(S0_T.lot_no))
							.and(S0_T5.sublot_no.eq(S0_T.sublot_no))
							.and(S0_T5.sno1.eq(S0_T.sno1))
							.and(S0_T5.sno2.eq(S0_T.sno2))
							.and(S0_T5.sno3.eq(S0_T.sno3))
							.and(S0_T5.sno4.eq(S0_T.sno4))
							.and(
								nvl(
									S0_T5.bp_cd,
									bind("dummy_string")
								).eq(nvl(
										S0_T.bp_cd,
										bind("dummy_string")
									)
								)
							)
							.and(S0_T5.asst_typ.eq(S0_T.asst_typ))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_STK_EVAL).on(S0_STK_EVAL.stk_eval_cd.eq(bind("stk_eval_cd")))
						.innerJoin(S0_TERM).on(
							S0_TERM.term.lte(S0_T.ym)
							.and(S0_TERM.term_end_ym.gt(S0_T.ym))
						)
						.leftOuterJoin(S0_MNG_DPT).on(
							S0_MNG_DPT.dpt_cd.eq(S0_T.mng_dpt_cd)
							.and(S0_MNG_DPT.term.eq(S0_TERM.term))
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
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T.bp_cd))
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_no.eq(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
						.and(S0_T.asst_typ.neq(value(MAC_ASST_TYP.OTH.value())))
						.and(S0_T.repurc_obli_flg.eq(value(false)))
						.cutoff$and(
							bind("unsumming_flg_str").eq(value(true))
							.and(S0_T3.calc_no.isNull())
						)
						.cutoff$and(
							bind("summed_flg_str").eq(value(true))
							.and(S0_T3.calc_no.isNotNull())
						)
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
							.and(S0_T.bp_cd.isNull())
						)
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm")))
						.cutoff$and(S0_T5.first_gr_dt.gte(bind("first_gr_dt_fr")))
						.cutoff$and(S0_T5.first_gr_dt.lte(bind("first_gr_dt_to")))
						.cutoff$and(S0_T5.vld_dt.gte(bind("vld_dt_fr")))
						.cutoff$and(S0_T5.vld_dt.lte(bind("vld_dt_to")))
						.cutoff$and(S0_T5.lmt_dt.gte(bind("lmt_dt_fr")))
						.cutoff$and(S0_T5.lmt_dt.lte(bind("lmt_dt_to")))
						.cutoff$and(S0_T5.non_mov_base_dt.gte(bind("non_mov_base_dt_fr")))
						.cutoff$and(S0_T5.non_mov_base_dt.lte(bind("non_mov_base_dt_to")))
						.cutoff$and(
							monthsBetween(
								bind("ym"),
								S0_T5.non_mov_base_dt
							).gte(bind("non_mov_num_fr"))
						)
						.cutoff$and(
							monthsBetween(
								bind("ym"),
								S0_T5.non_mov_base_dt
							).lte(bind("non_mov_num_to"))
						)
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
					.groupBy(
						S0_T.top_rec_no,
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						S0_T.ym,
						S0_T3.calc_no,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.mng_dpt_cd,
						S0_MNG_DPT.dpt_nm,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.itm_nm,
						S0_SUNDRY_ITM.itm_nm,
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
						S0_T.bp_cd,
						S0_BP.bp_nm,
						S0_T.asst_typ,
						S0_T.qty,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_T4.base_qty,
						S0_T4.upri,
						S0_T3.amt,
						S0_T5.first_gr_dt,
						S0_T5.vld_dt,
						S0_T5.lmt_dt,
						S0_T5.non_mov_base_dt
					)
					.orderBy(
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
						S0_T.bp_cd.asc(),
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
	
	/**
	 * -- MGBFL0300_MGT_ACC_TOP_Query_S02
	 */
	static MCQueryPlan MGBFL0300_MGT_ACC_TOP_S02() {
		MGT_ACC_TOP_R S0_T = MGT_ACC_TOP_R.create("T");
		MGT_ACC_SML_COST_R S0_T2 = MGT_ACC_SML_COST_R.create("T2");
		MGT_STK_LOSS_R S0_T3 = MGT_STK_LOSS_R.create("T3");
		MGW_ACT_STK_R S0_T5 = MGW_ACT_STK_R.create("T5");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_STK_EVAL_R S0_STK_EVAL = MAM_STK_EVAL_R.create("STK_EVAL");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_BP_R S0_BP = MAM_BP_R.create("BP");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
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
				sql("MGBFL0300_MGT_ACC_TOP_Query_S02")
					.mainQuery()
					.select(
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						bind("stk_eval_cd").as("stk_eval_cd"),
						S0_T.ym,
						decode(
							S0_T3.calc_no,
							nullValue(),
							value(false),
							value(true)
						).as("summed_flg"),
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
						S0_T.bp_cd,
						S0_BP.bp_nm,
						S0_T.asst_typ,
						S0_T.qty,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						sum(S0_T2.act_cost).as("stk_amt"),
						MAPA_CALC$F_RND(
							sum(S0_T2.act_cost).multiply(S0_STK_EVAL.eval_rate).divide(value(100)),
							bind("amt_dec_place"),
							bind("amt_rnd_typ")
						).as("eval_amt"),
						S0_T3.amt.as("summed_loss"),
						S0_T5.first_gr_dt,
						S0_T5.vld_dt,
						S0_T5.lmt_dt,
						S0_T5.non_mov_base_dt,
						monthsBetween(
							bind("ym"),
							S0_T5.non_mov_base_dt
						).as("non_mov_num")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T2.calc_no.eq(S0_T.calc_no)
							.and(S0_T2.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T2.top_rec_no.eq(S0_T.top_rec_no))
						)
						.leftOuterJoin(S0_T3).on(
							S0_T3.calc_no.eq(S0_T.calc_no)
							.and(S0_T3.calc_grp_cd.eq(S0_T.calc_grp_cd))
							.and(S0_T3.wg_cd.eq(S0_T.wg_cd))
							.and(S0_T3.ym.eq(S0_T.ym))
							.and(S0_T3.mng_dpt_cd.eq(S0_T.mng_dpt_cd))
							.and(S0_T3.itm_cd.eq(S0_T.itm_cd))
							.and(S0_T3.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_T3.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_T3.itm_sub3.eq(S0_T.itm_sub3))
							.and(S0_T3.lot_no.eq(S0_T.lot_no))
							.and(S0_T3.sublot_no.eq(S0_T.sublot_no))
							.and(S0_T3.sno1.eq(S0_T.sno1))
							.and(S0_T3.sno2.eq(S0_T.sno2))
							.and(S0_T3.sno3.eq(S0_T.sno3))
							.and(S0_T3.sno4.eq(S0_T.sno4))
							.and(
								nvl(
									S0_T3.sppl_cd,
									bind("dummy_string")
								).eq(nvl(
										S0_T.bp_cd,
										bind("dummy_string")
									)
								)
							)
							.and(S0_T3.asst_typ.eq(S0_T.asst_typ))
						)
						.leftOuterJoin(S0_T5).on(
							S0_T5.wg_cd.eq(S0_T.wg_cd)
							.and(S0_T5.mng_dpt_cd.eq(S0_T.mng_dpt_cd))
							.and(S0_T5.itm_cd.eq(S0_T.itm_cd))
							.and(S0_T5.itm_sub1.eq(S0_T.itm_sub1))
							.and(S0_T5.itm_sub2.eq(S0_T.itm_sub2))
							.and(S0_T5.itm_sub3.eq(S0_T.itm_sub3))
							.and(S0_T5.lot_no.eq(S0_T.lot_no))
							.and(S0_T5.sublot_no.eq(S0_T.sublot_no))
							.and(S0_T5.sno1.eq(S0_T.sno1))
							.and(S0_T5.sno2.eq(S0_T.sno2))
							.and(S0_T5.sno3.eq(S0_T.sno3))
							.and(S0_T5.sno4.eq(S0_T.sno4))
							.and(
								nvl(
									S0_T5.bp_cd,
									bind("dummy_string")
								).eq(nvl(
										S0_T.bp_cd,
										bind("dummy_string")
									)
								)
							)
							.and(S0_T5.asst_typ.eq(S0_T.asst_typ))
						)
						.innerJoin(S0_WG).on(S0_WG.wg_cd.eq(S0_T.wg_cd))
						.innerJoin(S0_STK_EVAL).on(S0_STK_EVAL.stk_eval_cd.eq(bind("stk_eval_cd")))
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
						.leftOuterJoin(S0_BP).on(S0_BP.bp_cd.eq(S0_T.bp_cd))
						.leftOuterJoin(S0_UNIT).on(S0_UNIT.unit_cd.eq(S0_ITM.unit_cd))
						.addDynamicView(DS0D)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_no.eq(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T.ym.eq(bind("ym")))
						.and(S0_T.calc_rec_typ.eq(value(MGC_CALC_REC_TYP.END_STK.value())))
						.and(S0_T.asst_typ.neq(value(MAC_ASST_TYP.OTH.value())))
						.and(S0_T.repurc_obli_flg.eq(value(false)))
						.cutoff$and(
							bind("unsumming_flg_str").eq(value(true))
							.and(S0_T3.calc_no.isNull())
						)
						.cutoff$and(
							bind("summed_flg_str").eq(value(true))
							.and(S0_T3.calc_no.isNotNull())
						)
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
							.and(S0_T.bp_cd.isNull())
						)
						.cutoff$and(S0_T.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_BP.bp_nm.like(bind("bp_nm")))
						.cutoff$and(S0_T5.first_gr_dt.gte(bind("first_gr_dt_fr")))
						.cutoff$and(S0_T5.first_gr_dt.lte(bind("first_gr_dt_to")))
						.cutoff$and(S0_T5.vld_dt.gte(bind("vld_dt_fr")))
						.cutoff$and(S0_T5.vld_dt.lte(bind("vld_dt_to")))
						.cutoff$and(S0_T5.lmt_dt.gte(bind("lmt_dt_fr")))
						.cutoff$and(S0_T5.lmt_dt.lte(bind("lmt_dt_to")))
						.cutoff$and(S0_T5.non_mov_base_dt.gte(bind("non_mov_base_dt_fr")))
						.cutoff$and(S0_T5.non_mov_base_dt.lte(bind("non_mov_base_dt_to")))
						.cutoff$and(
							monthsBetween(
								bind("ym"),
								S0_T5.non_mov_base_dt
							).gte(bind("non_mov_num_fr"))
						)
						.cutoff$and(
							monthsBetween(
								bind("ym"),
								S0_T5.non_mov_base_dt
							).lte(bind("non_mov_num_to"))
						)
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
					.groupBy(
						S0_T.top_rec_no,
						S0_T.calc_no,
						S0_T.calc_grp_cd,
						S0_T.ym,
						S0_T3.calc_no,
						S0_T.wg_cd,
						S0_WG.wg_nm,
						S0_T.mng_dpt_cd,
						S0_MNG_DPT.dpt_nm,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_ITM.itm_nm,
						S0_SUNDRY_ITM.itm_nm,
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
						S0_T.bp_cd,
						S0_BP.bp_nm,
						S0_T.asst_typ,
						S0_T.qty,
						S0_ITM.unit_cd,
						S0_UNIT.unit_nm,
						S0_ITM.dec_place,
						S0_STK_EVAL.lump_rate_flg,
						S0_STK_EVAL.eval_rate,
						S0_T3.amt,
						S0_T5.first_gr_dt,
						S0_T5.vld_dt,
						S0_T5.lmt_dt,
						S0_T5.non_mov_base_dt
					)
					.orderBy(
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
						S0_T.bp_cd.asc(),
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
	
	
	/**
	 * -- MGBFL0300_MGT_STK_LOSS_Query_I01
	 */
	static MCQueryPlan MGBFL0300_MGT_STK_LOSS_I01() {
		MGT_STK_LOSS_R S0 = MGT_STK_LOSS_R.create();
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0300_MGT_STK_LOSS_Query_I01")
					.insert(S0)
					.columns(
						S0.calc_no,
						S0.calc_grp_cd,
						S0.wg_cd,
						S0.ym,
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
						S0.asst_typ,
						S0.amt,
						S0.stk_eval_cd
					)
					.values(
						bind("calc_no"),
						bind("calc_grp_cd"),
						bind("wg_cd"),
						bind("ym"),
						bind("mng_dpt_cd"),
						bind("itm_cd"),
						bind("itm_sub1"),
						bind("itm_sub2"),
						bind("itm_sub3"),
						bind("lot_no"),
						bind("sublot_no"),
						bind("sno1"),
						bind("sno2"),
						bind("sno3"),
						bind("sno4"),
						bind("bp_cd"),
						bind("asst_typ"),
						bind("loss"),
						bind("stk_eval_cd")
					)
			);
	}
}