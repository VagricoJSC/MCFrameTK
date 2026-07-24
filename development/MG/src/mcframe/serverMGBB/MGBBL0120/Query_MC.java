package mcframe.serverMGBB.MGBBL0120;

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
	 * -- MGBBL0120_MGT_ACT_INPT_Query_S01
	 */
	static MCQueryPlan MGBBL0120_MGT_ACT_INPT_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_ACT_INPT_R S1_T = MGT_ACT_INPT_R.create("T");
		MGT_INST_OPER_R S1_T2 = MGT_INST_OPER_R.create("T2");
		MGT_ITM_MFG_INST_R S1_T3 = MGT_ITM_MFG_INST_R.create("T3");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_SUNDRY_ITM_R S1_PAR_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("PAR_SUNDRY_ITM");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MCTempView S1_T4 = createTempView("T4");
		MAM_CALC_CTG_R S1_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R S1_PAR_ITM_TYP_D = MAM_ITM_TYP_D_R.create("PAR_ITM_TYP_D");
		MAM_ITM_JNL_R S1_PAR_ITM_JNL = MAM_ITM_JNL_R.create("PAR_ITM_JNL");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S1_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
		MAM_COST_DPT_R S1_INPT_DPT = MAM_COST_DPT_R.create("INPT_DPT");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_GRP_R S1_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S1_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S1_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S1_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S1_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S1_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S1_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S1_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S1_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S1_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S1_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S1_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_BP_R S1_STK_BP = MAM_BP_R.create("STK_BP");
		MAM_AC_RSN_R S1_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_CUR_R S1_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_EXPNS_R S1_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		MGT_ACT_INPT_R S2_W1 = MGT_ACT_INPT_R.create("W1");
		MGT_ACT_INPT_EXPNS_R S2_W2 = MGT_ACT_INPT_EXPNS_R.create("W2");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0120_MGT_ACT_INPT_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.calc_ctg_cd,
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_T.ym,
							S1_T.ac_dt,
							S1_T3.mng_dpt_cd,
							S1_T.par_itm_cd,
							S1_T.par_itm_sub1,
							S1_T.par_itm_sub2,
							S1_T.par_itm_sub3,
							S1_T.itm_mfg_inst_no,
							S1_T.mfg_act_no,
							S1_T3.lot_no.as("par_lot_no"),
							S1_T3.sublot_no.as("par_sublot_no"),
							S1_T3.sno1.as("par_sno1"),
							S1_T3.sno2.as("par_sno2"),
							S1_T3.sno3.as("par_sno3"),
							S1_T3.sno4.as("par_sno4"),
							S1_T3.asst_typ.as("par_asst_typ"),
							S1_T.mng_dpt_cd.as("inpt_dpt_cd"),
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.asst_typ,
							S1_T.loc_cd,
							S1_T.str_ln_cd,
							S1_T.oper_act_no,
							S1_T2.disp_seq,
							S1_T2.oper_cd,
							S1_T2.oper_seq,
							S1_T.bp_cd,
							S1_T.stk_bp_cd,
							S1_T.ac_slip_typ,
							S1_T.ac_rsn_cd,
							S1_T.qty,
							S1_T.amt,
							S1_T.trd_cur_cd,
							S1_T.trd_cur_amt,
							S1_T.xrate,
							S1_T.rec_eval_typ,
							S1_T4.pr("amt").as("expns_amt"),
							S1_T.expns_cd,
							S1_T.eval_loop_flg,
							S1_T.zero_effect_flg,
							S1_T.act_inpt_id,
							S1_T.act_inpt_id_sub,
							S1_T.rmrks,
							S1_T.sub_char1,
							S1_T.sub_char2,
							S1_T.sub_char3,
							S1_T.ins_usr_id,
							S1_T.ins_usr_nm,
							S1_T.ins_func_id,
							S1_T.ins_ts,
							S1_T.upd_usr_id,
							S1_T.upd_usr_nm,
							S1_T.upd_func_id,
							S1_T.upd_ts,
							S1_T.upd_srv_req_no,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.leftOuterJoin(S1_T2).on(
								S1_T.calc_ctg_cd.eq(S1_T2.calc_ctg_cd)
								.and(S1_T.par_itm_cd.eq(S1_T2.itm_cd))
								.and(S1_T.par_itm_sub1.eq(S1_T2.itm_sub1))
								.and(S1_T.par_itm_sub2.eq(S1_T2.itm_sub2))
								.and(S1_T.par_itm_sub3.eq(S1_T2.itm_sub3))
								.and(S1_T.itm_mfg_inst_no.eq(S1_T2.itm_mfg_inst_no))
								.and(S1_T.mfg_act_no.eq(S1_T2.mfg_act_no))
								.and(S1_T.oper_act_no.eq(S1_T2.oper_act_no))
							)
							.leftOuterJoin(S1_T3).on(
								S1_T.calc_ctg_cd.eq(S1_T3.calc_ctg_cd)
								.and(S1_T.par_itm_cd.eq(S1_T3.itm_cd))
								.and(S1_T.par_itm_sub1.eq(S1_T3.itm_sub1))
								.and(S1_T.par_itm_sub2.eq(S1_T3.itm_sub2))
								.and(S1_T.par_itm_sub3.eq(S1_T3.itm_sub3))
								.and(S1_T.itm_mfg_inst_no.eq(S1_T3.itm_mfg_inst_no))
								.and(S1_T.mfg_act_no.eq(S1_T3.mfg_act_no))
							)
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
							.leftOuterJoin(S1_PAR_ITM).on(
								S1_T.par_itm_cd.eq(S1_PAR_ITM.itm_cd)
								.and(S1_T.par_itm_sub1.eq(S1_PAR_ITM.itm_sub1))
								.and(S1_T.par_itm_sub2.eq(S1_PAR_ITM.itm_sub2))
								.and(S1_T.par_itm_sub3.eq(S1_PAR_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_PAR_SUNDRY_ITM).on(
								S1_T3.itm_cd.eq(S1_PAR_SUNDRY_ITM.itm_cd)
								.and(S1_T3.itm_sub1.eq(S1_PAR_SUNDRY_ITM.itm_sub1))
								.and(S1_T3.itm_sub2.eq(S1_PAR_SUNDRY_ITM.itm_sub2))
								.and(S1_T3.itm_sub3.eq(S1_PAR_SUNDRY_ITM.itm_sub3))
								.and(S1_T3.sno1.eq(S1_PAR_SUNDRY_ITM.sno1))
								.and(S1_T3.sno2.eq(S1_PAR_SUNDRY_ITM.sno2))
								.and(S1_T3.sno3.eq(S1_PAR_SUNDRY_ITM.sno3))
								.and(S1_T3.sno4.eq(S1_PAR_SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(S1_ITM).on(
								S1_T.itm_cd.eq(S1_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T.itm_cd.eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T.itm_sub1.eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T.itm_sub2.eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T.itm_sub3.eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T.sno1.eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T.sno2.eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T.sno3.eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T.sno4.eq(S1_SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(
								subQuery()
								.select(
									S2_W1.act_inpt_id,
									S2_W1.act_inpt_id_sub,
									sum(S2_W2.amt).as("amt")
								)
								.from(
									S2_W1
									.leftOuterJoin(S2_W2).on(
										S2_W1.act_inpt_id.eq(S2_W2.act_inpt_id)
										.and(S2_W1.act_inpt_id_sub.eq(S2_W2.act_inpt_id_sub))
									)
								)
								.where(
									value(0).eq(value(0))
								)
								.groupBy(
									S2_W1.act_inpt_id,
									S2_W1.act_inpt_id_sub
								).view(S1_T4)
							).on(
								S1_T.act_inpt_id.eq(S1_T4.pr(S2_W1.act_inpt_id))
								.and(S1_T.act_inpt_id_sub.eq(S1_T4.pr(S2_W1.act_inpt_id_sub)))
							)
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.cutoff$and(S1_T.calc_ctg_cd.like(bind("calc_ctg_cd")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.act_inpt_id.like(bind("act_inpt_id")))
							.cutoff$and(S1_PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
							.cutoff$and(S1_PAR_ITM.itm_typ.like(bind("par_itm_typ")))
							.cutoff$and(S1_PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
							.cutoff$and(S1_T.par_itm_cd.like(bind("par_itm_cd")))
							.cutoff$and(S1_T.par_itm_sub1.like(bind("par_itm_sub1")))
							.cutoff$and(S1_T.par_itm_sub2.like(bind("par_itm_sub2")))
							.cutoff$and(S1_T.par_itm_sub3.like(bind("par_itm_sub3")))
							.cutoff$and(
								nvl(
									S1_PAR_SUNDRY_ITM.itm_nm,
									S1_PAR_ITM.itm_nm
								).like(bind("par_itm_nm"))
							)
							.cutoff$and(S1_T3.lot_no.like(bind("par_lot_no")))
							.cutoff$and(S1_T3.sublot_no.like(bind("par_sublot_no")))
							.cutoff$and(S1_T3.sno1.like(bind("par_sno1")))
							.cutoff$and(S1_T3.sno2.like(bind("par_sno2")))
							.cutoff$and(S1_T3.sno3.like(bind("par_sno3")))
							.cutoff$and(S1_T3.sno4.like(bind("par_sno4")))
							.cutoff$and(S1_T3.asst_typ.like(bind("par_asst_typ")))
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.mfg_act_no.like(bind("mfg_act_no")))
							.cutoff$and(S1_T3.mng_dpt_cd.like(bind("inpt_dpt_cd")))
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_T.itm_cd.like(bind("itm_cd")))
							.cutoff$and(S1_T.itm_sub1.like(bind("itm_sub1")))
							.cutoff$and(S1_T.itm_sub2.like(bind("itm_sub2")))
							.cutoff$and(S1_T.itm_sub3.like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.str_ln_cd.like(bind("str_ln_cd")))
							.cutoff$and(S1_T.oper_act_no.like(bind("oper_act_no")))
							.cutoff$and(S1_T2.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.stk_bp_cd.like(bind("stk_bp_cd")))
							.cutoff$and(S1_T.ac_slip_typ.like(bind("ac_slip_typ")))
							.cutoff$and(S1_T.ac_rsn_cd.like(bind("ac_rsn_cd")))
							.cutoff$and(S1_T.trd_cur_cd.like(bind("trd_cur_cd")))
							.cutoff$and(S1_T.rec_eval_typ.like(bind("rec_eval_typ")))
							.cutoff$and(S1_T.rmrks.like(bind("rmrks")))
							.cutoff$and(S1_T.sub_char1.like(bind("sub_char1")))
							.cutoff$and(S1_T.sub_char2.like(bind("sub_char2")))
							.cutoff$and(S1_T.sub_char3.like(bind("sub_char3")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9")))
							.cutoff$and(S1_PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10")))
							.cutoff$and(S1_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
							.cutoff$and(S1_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
							.cutoff$and(S1_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
							.cutoff$and(S1_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
							.cutoff$and(S1_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
							.cutoff$and(S1_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
							.cutoff$and(S1_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
							.cutoff$and(S1_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
							.cutoff$and(S1_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
							.cutoff$and(S1_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
							.cutoff$and(
									bind("no_bp_flg_str").eq(value(true))
									.and(S1_T.bp_cd.isNull())
								)
							.cutoff$and(
								bind("no_stk_bp_flg_str").eq(value(true))
								.and(S1_T.stk_bp_cd.isNull())
							)
							.cutoff$and(
								bind("no_ac_rsn_flg_str").eq(value(true))
								.and(S1_T.ac_rsn_cd.isNull())
							)
							.cutoff$and(
								bind("chd_asst_cnd").eq(value(true))
								.and(
									S1_T.asst_typ.in(
										value(MAC_ASST_TYP.CO_SLS.value()),
										value(MAC_ASST_TYP.CO_PROD.value())
									)
								)
							)
							.addDynamicPredicate(DS1D)
						).view(S0_T)
					)
					.groupBy(addDynamicGroupBy(DS0D))
					.having(
						value(0).eq(value(0))
						.addDynamicPredicate(DS0D)
					)
					.orderBy(
						addDynamicOrderBy(DS0D)
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.calc_ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd)),
				when(boundOr("calc_ctg_flg"))
					.select(DS0D, S0_T.pr("calc_ctg_nm"))
					.groupBy(DS0D, S0_T.pr("calc_ctg_nm")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.par_itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.par_itm_sub1)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.par_itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.par_itm_sub2)),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.par_itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.par_itm_sub3)),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("ac_dt_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_dt))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_dt)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T3.mng_dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T3.mng_dpt_cd)),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ_d_cd")),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("par_itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("par_itm_jnl_cd")),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.par_itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.par_itm_cd)),
				when(boundOr("par_itm_flg"))
					.select(DS0D, S0_T.pr("par_itm_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_nm")),
				when(boundOr("par_itm_typ_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ")),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("par_itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_typ_d_nm")),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS0D, S0_T.pr("par_itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("par_itm_jnl_nm")),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd1")),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm1")),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd2")),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm2")),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd3")),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm3")),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd4")),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm4")),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd5")),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm5")),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd6")),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm6")),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd7")),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm7")),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd8")),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm8")),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd9")),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm9")),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("par_itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_cd10")),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS0D, S0_T.pr("par_itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("par_itm_grp_nm10")),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.mfg_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.mfg_act_no)),
				when(boundOr("par_asst_typ_flg"))
					.select(DS0D, S0_T.pr("par_asst_typ"))
					.groupBy(DS0D, S0_T.pr("par_asst_typ")),
				when(boundOr("par_lot_flg"))
					.select(DS0D, S0_T.pr("par_lot_no"))
					.groupBy(DS0D, S0_T.pr("par_lot_no")),
				when(boundOr("par_sublot_flg"))
					.select(DS0D, S0_T.pr("par_sublot_no"))
					.groupBy(DS0D, S0_T.pr("par_sublot_no")),
				when(boundOr("par_sno1_flg"))
					.select(DS0D, S0_T.pr("par_sno1"))
					.groupBy(DS0D, S0_T.pr("par_sno1")),
				when(boundOr("par_sno2_flg"))
					.select(DS0D, S0_T.pr("par_sno2"))
					.groupBy(DS0D, S0_T.pr("par_sno2")),
				when(boundOr("par_sno3_flg"))
					.select(DS0D, S0_T.pr("par_sno3"))
					.groupBy(DS0D, S0_T.pr("par_sno3")),
				when(boundOr("par_sno4_flg"))
					.select(DS0D, S0_T.pr("par_sno4"))
					.groupBy(DS0D, S0_T.pr("par_sno4")),
				when(boundOr("inpt_dpt_flg"))
					.select(DS0D, S0_T.pr("inpt_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("inpt_dpt_cd")),
				when(boundOr("inpt_dpt_flg"))
					.select(DS0D, S0_T.pr("inpt_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("inpt_dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_cd)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub1))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub1)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub2))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub2)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd1")),
				when(boundOr("itm_grp_flg1"))
					.select(DS0D, S0_T.pr("itm_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm1")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd2")),
				when(boundOr("itm_grp_flg2"))
					.select(DS0D, S0_T.pr("itm_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm2")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd3")),
				when(boundOr("itm_grp_flg3"))
					.select(DS0D, S0_T.pr("itm_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm3")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd4")),
				when(boundOr("itm_grp_flg4"))
					.select(DS0D, S0_T.pr("itm_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm4")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd5")),
				when(boundOr("itm_grp_flg5"))
					.select(DS0D, S0_T.pr("itm_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm5")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd6")),
				when(boundOr("itm_grp_flg6"))
					.select(DS0D, S0_T.pr("itm_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm6")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd7")),
				when(boundOr("itm_grp_flg7"))
					.select(DS0D, S0_T.pr("itm_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm7")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd8")),
				when(boundOr("itm_grp_flg8"))
					.select(DS0D, S0_T.pr("itm_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm8")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd9")),
				when(boundOr("itm_grp_flg9"))
					.select(DS0D, S0_T.pr("itm_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm9")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_cd10")),
				when(boundOr("itm_grp_flg10"))
					.select(DS0D, S0_T.pr("itm_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("itm_grp_nm10")),
				when(boundOr("lot_flg"))
					.select(DS0D, S0_T.pr("lot_no"))
					.groupBy(DS0D, S0_T.pr("lot_no")),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr("sublot_no"))
					.groupBy(DS0D, S0_T.pr("sublot_no")),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr("sno1"))
					.groupBy(DS0D, S0_T.pr("sno1")),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr("sno2"))
					.groupBy(DS0D, S0_T.pr("sno2")),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr("sno3"))
					.groupBy(DS0D, S0_T.pr("sno3")),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr("sno4"))
					.groupBy(DS0D, S0_T.pr("sno4")),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr("asst_typ"))
					.groupBy(DS0D, S0_T.pr("asst_typ")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr(S1_T.str_ln_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.str_ln_cd)),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("oper_act_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_act_no))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_act_no)),
				when(boundOr("seq_flg"))
					.select(DS0D, S0_T.pr(S1_T2.disp_seq))
					.groupBy(DS0D, S0_T.pr(S1_T2.disp_seq)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T2.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T2.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("disp_oper_seq_flg"))
					.select(DS0D, S0_T.pr(S1_T2.oper_seq))
					.groupBy(DS0D, S0_T.pr(S1_T2.oper_seq)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("stk_bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.stk_bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.stk_bp_cd)),
				when(boundOr("stk_bp_flg"))
					.select(DS0D, S0_T.pr("stk_bp_nm"))
					.groupBy(DS0D, S0_T.pr("stk_bp_nm")),
				when(boundOr("ac_slip_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_slip_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_slip_typ)),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr(S1_T.ac_rsn_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ac_rsn_cd)),
				when(boundOr("ac_rsn_flg"))
					.select(DS0D, S0_T.pr("ac_rsn_nm"))
					.groupBy(DS0D, S0_T.pr("ac_rsn_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, sum(S0_T.pr(S1_T.qty)).as("qty")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr(S1_T.trd_cur_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.trd_cur_cd)),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_cur_nm"))
					.groupBy(DS0D, S0_T.pr("trd_cur_nm")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, sum(S0_T.pr(S1_T.trd_cur_amt)).as("trd_cur_amt")),
				when(boundOr("trd_cur_flg"))
					.select(DS0D, S0_T.pr("trd_amt_dec_place"))
					.groupBy(DS0D, S0_T.pr("trd_amt_dec_place")),
				when(boundOr("xrate_flg"))
					.select(DS0D, S0_T.pr(S1_T.xrate))
					.groupBy(DS0D, S0_T.pr(S1_T.xrate)),
				when(boundOr("rec_eval_typ_flg"))
					.select(DS0D, S0_T.pr(S1_T.rec_eval_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.rec_eval_typ)),
				when(boundOr("rec_eval_typ_flg"))
					.select(DS0D, sum(S0_T.pr("expns_amt")).as("expns_amt")),
				when(boundOr("expns_flg"))
					.select(DS0D, S0_T.pr(S1_T.expns_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.expns_cd)),
				when(boundOr("expns_flg"))
					.select(DS0D, S0_T.pr("expns_nm"))
					.groupBy(DS0D, S0_T.pr("expns_nm")),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.eval_loop_flg))
					.groupBy(DS0D, S0_T.pr(S1_T.eval_loop_flg)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.zero_effect_flg))
					.groupBy(DS0D, S0_T.pr(S1_T.zero_effect_flg)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.act_inpt_id))
					.groupBy(DS0D, S0_T.pr(S1_T.act_inpt_id)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.act_inpt_id_sub))
					.groupBy(DS0D, S0_T.pr(S1_T.act_inpt_id_sub)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.rmrks))
					.groupBy(DS0D, S0_T.pr(S1_T.rmrks)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char1))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char1)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char2))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char2)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.sub_char3))
					.groupBy(DS0D, S0_T.pr(S1_T.sub_char3)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_usr_id))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_usr_id)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_usr_nm))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_usr_nm)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_func_id))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_func_id)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.ins_ts))
					.groupBy(DS0D, S0_T.pr(S1_T.ins_ts)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_usr_id))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_usr_id)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_usr_nm))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_usr_nm)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_func_id))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_func_id)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_ts))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_ts)),
				when(boundOr("act_inpt_id_flg"))
					.select(DS0D, S0_T.pr(S1_T.upd_srv_req_no))
					.groupBy(DS0D, S0_T.pr(S1_T.upd_srv_req_no)),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.amt)).as("amt")),
				when(boundOr("calc_ctg_flg"))
					.select(DS1D, S1_CALC_CTG.calc_ctg_nm.as("calc_ctg_nm"))
					.groupBy(DS1D, S1_CALC_CTG.calc_ctg_nm),
				when(boundOr("calc_ctg_flg", "calc_ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CALC_CTG).on(S1_T.calc_ctg_cd.eq(S1_CALC_CTG.calc_ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CALC_CTG.calc_ctg_nm.like(bind("calc_ctg_nm")))),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm", "inpt_dpt_flg", "inpt_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T3.mng_dpt_cd.eq(S1_MNG_DPT.dpt_cd).and(S1_TERM.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS1D, S1_PAR_ITM.itm_typ_d_cd.as("par_itm_typ_d_cd"))
					.groupBy(DS1D, S1_PAR_ITM.itm_typ_d_cd),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS1D, S1_PAR_ITM.itm_jnl_cd.as("par_itm_jnl_cd"))
					.groupBy(DS1D, S1_PAR_ITM.itm_jnl_cd),
				when(boundOr("par_itm_flg"))
					.select(DS1D, nvl(S1_PAR_SUNDRY_ITM.itm_nm,S1_PAR_ITM.itm_nm).as("par_itm_nm"))
					.groupBy(DS1D, nvl(S1_PAR_SUNDRY_ITM.itm_nm,S1_PAR_ITM.itm_nm)),
				when(boundOr("par_itm_typ_flg"))
					.select(DS1D, S1_PAR_ITM.itm_typ.as("par_itm_typ"))
					.groupBy(DS1D, S1_PAR_ITM.itm_typ),
				when(boundOr("par_itm_typ_d_flg"))
					.select(DS1D, S1_PAR_ITM_TYP_D.itm_typ_d_nm.as("par_itm_typ_d_nm"))
					.groupBy(DS1D, S1_PAR_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("par_itm_typ_d_flg", "par_itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_TYP_D).on(S1_PAR_ITM.itm_typ.eq(S1_PAR_ITM_TYP_D.itm_typ).and(S1_PAR_ITM.itm_typ_d_cd.eq(S1_PAR_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_TYP_D.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("par_itm_jnl_flg"))
					.select(DS1D, S1_PAR_ITM_JNL.itm_jnl_nm.as("par_itm_jnl_nm"))
					.groupBy(DS1D, S1_PAR_ITM_JNL.itm_jnl_nm),
				when(boundOr("par_itm_jnl_flg", "par_itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_JNL).on(S1_PAR_ITM.itm_jnl_cd.eq(S1_PAR_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_JNL.itm_jnl_nm.like(bind("par_itm_jnl_nm")))),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd1.as("par_itm_grp_cd1"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd1),
				when(boundOr("par_itm_grp_flg1"))
					.select(DS1D, S1_PAR_ITM_GRP1.itm_grp_nm.as("par_itm_grp_nm1"))
					.groupBy(DS1D, S1_PAR_ITM_GRP1.itm_grp_nm),
				when(boundOr("par_itm_grp_flg1", "par_itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP1).on(S1_PAR_ITM.itm_grp_cd1.eq(S1_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd2.as("par_itm_grp_cd2"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd2),
				when(boundOr("par_itm_grp_flg2"))
					.select(DS1D, S1_PAR_ITM_GRP2.itm_grp_nm.as("par_itm_grp_nm2"))
					.groupBy(DS1D, S1_PAR_ITM_GRP2.itm_grp_nm),
				when(boundOr("par_itm_grp_flg2", "par_itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP2).on(S1_PAR_ITM.itm_grp_cd2.eq(S1_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd3.as("par_itm_grp_cd3"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd3),
				when(boundOr("par_itm_grp_flg3"))
					.select(DS1D, S1_PAR_ITM_GRP3.itm_grp_nm.as("par_itm_grp_nm3"))
					.groupBy(DS1D, S1_PAR_ITM_GRP3.itm_grp_nm),
				when(boundOr("par_itm_grp_flg3", "par_itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP3).on(S1_PAR_ITM.itm_grp_cd3.eq(S1_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd4.as("par_itm_grp_cd4"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd4),
				when(boundOr("par_itm_grp_flg4"))
					.select(DS1D, S1_PAR_ITM_GRP4.itm_grp_nm.as("par_itm_grp_nm4"))
					.groupBy(DS1D, S1_PAR_ITM_GRP4.itm_grp_nm),
				when(boundOr("par_itm_grp_flg4", "par_itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP4).on(S1_PAR_ITM.itm_grp_cd4.eq(S1_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd5.as("par_itm_grp_cd5"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd5),
				when(boundOr("par_itm_grp_flg5"))
					.select(DS1D, S1_PAR_ITM_GRP5.itm_grp_nm.as("par_itm_grp_nm5"))
					.groupBy(DS1D, S1_PAR_ITM_GRP5.itm_grp_nm),
				when(boundOr("par_itm_grp_flg5", "par_itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP5).on(S1_PAR_ITM.itm_grp_cd5.eq(S1_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd6.as("par_itm_grp_cd6"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd6),
				when(boundOr("par_itm_grp_flg6"))
					.select(DS1D, S1_PAR_ITM_GRP6.itm_grp_nm.as("par_itm_grp_nm6"))
					.groupBy(DS1D, S1_PAR_ITM_GRP6.itm_grp_nm),
				when(boundOr("par_itm_grp_flg6", "par_itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP6).on(S1_PAR_ITM.itm_grp_cd6.eq(S1_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd7.as("par_itm_grp_cd7"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd7),
				when(boundOr("par_itm_grp_flg7"))
					.select(DS1D, S1_PAR_ITM_GRP7.itm_grp_nm.as("par_itm_grp_nm7"))
					.groupBy(DS1D, S1_PAR_ITM_GRP7.itm_grp_nm),
				when(boundOr("par_itm_grp_flg7", "par_itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP7).on(S1_PAR_ITM.itm_grp_cd7.eq(S1_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd8.as("par_itm_grp_cd8"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd8),
				when(boundOr("par_itm_grp_flg8"))
					.select(DS1D, S1_PAR_ITM_GRP8.itm_grp_nm.as("par_itm_grp_nm8"))
					.groupBy(DS1D, S1_PAR_ITM_GRP8.itm_grp_nm),
				when(boundOr("par_itm_grp_flg8", "par_itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP8).on(S1_PAR_ITM.itm_grp_cd8.eq(S1_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd9.as("par_itm_grp_cd9"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd9),
				when(boundOr("par_itm_grp_flg9"))
					.select(DS1D, S1_PAR_ITM_GRP9.itm_grp_nm.as("par_itm_grp_nm9"))
					.groupBy(DS1D, S1_PAR_ITM_GRP9.itm_grp_nm),
				when(boundOr("par_itm_grp_flg9", "par_itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP9).on(S1_PAR_ITM.itm_grp_cd9.eq(S1_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS1D, S1_PAR_ITM.itm_grp_cd10.as("par_itm_grp_cd10"))
					.groupBy(DS1D, S1_PAR_ITM.itm_grp_cd10),
				when(boundOr("par_itm_grp_flg10"))
					.select(DS1D, S1_PAR_ITM_GRP10.itm_grp_nm.as("par_itm_grp_nm10"))
					.groupBy(DS1D, S1_PAR_ITM_GRP10.itm_grp_nm),
				when(boundOr("par_itm_grp_flg10", "par_itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_PAR_ITM_GRP10).on(S1_PAR_ITM.itm_grp_cd10.eq(S1_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10")))),
				when(boundOr("inpt_dpt_flg"))
					.select(DS1D, S1_INPT_DPT.dpt_nm.as("inpt_dpt_nm"))
					.groupBy(DS1D, S1_INPT_DPT.dpt_nm),
				when(boundOr("inpt_dpt_flg", "inpt_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_INPT_DPT).on(S1_T.mng_dpt_cd.eq(S1_INPT_DPT.dpt_cd).and(S1_TERM.term.eq(S1_INPT_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_INPT_DPT.dpt_nm.like(bind("inpt_dpt_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM_JNL.itm_jnl_nm.as("itm_jnl_nm"))
					.groupBy(DS1D, S1_ITM_JNL.itm_jnl_nm),
				when(boundOr("itm_jnl_flg", "itm_jnl_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM.itm_grp_cd1.as("itm_grp_cd1"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd1),
				when(boundOr("itm_grp_flg1"))
					.select(DS1D, S1_ITM_GRP1.itm_grp_nm.as("itm_grp_nm1"))
					.groupBy(DS1D, S1_ITM_GRP1.itm_grp_nm),
				when(boundOr("itm_grp_flg1", "itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM.itm_grp_cd2.as("itm_grp_cd2"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd2),
				when(boundOr("itm_grp_flg2"))
					.select(DS1D, S1_ITM_GRP2.itm_grp_nm.as("itm_grp_nm2"))
					.groupBy(DS1D, S1_ITM_GRP2.itm_grp_nm),
				when(boundOr("itm_grp_flg2", "itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM.itm_grp_cd3.as("itm_grp_cd3"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd3),
				when(boundOr("itm_grp_flg3"))
					.select(DS1D, S1_ITM_GRP3.itm_grp_nm.as("itm_grp_nm3"))
					.groupBy(DS1D, S1_ITM_GRP3.itm_grp_nm),
				when(boundOr("itm_grp_flg3", "itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM.itm_grp_cd4.as("itm_grp_cd4"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd4),
				when(boundOr("itm_grp_flg4"))
					.select(DS1D, S1_ITM_GRP4.itm_grp_nm.as("itm_grp_nm4"))
					.groupBy(DS1D, S1_ITM_GRP4.itm_grp_nm),
				when(boundOr("itm_grp_flg4", "itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM.itm_grp_cd5.as("itm_grp_cd5"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd5),
				when(boundOr("itm_grp_flg5"))
					.select(DS1D, S1_ITM_GRP5.itm_grp_nm.as("itm_grp_nm5"))
					.groupBy(DS1D, S1_ITM_GRP5.itm_grp_nm),
				when(boundOr("itm_grp_flg5", "itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM.itm_grp_cd6.as("itm_grp_cd6"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd6),
				when(boundOr("itm_grp_flg6"))
					.select(DS1D, S1_ITM_GRP6.itm_grp_nm.as("itm_grp_nm6"))
					.groupBy(DS1D, S1_ITM_GRP6.itm_grp_nm),
				when(boundOr("itm_grp_flg6", "itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM.itm_grp_cd7.as("itm_grp_cd7"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd7),
				when(boundOr("itm_grp_flg7"))
					.select(DS1D, S1_ITM_GRP7.itm_grp_nm.as("itm_grp_nm7"))
					.groupBy(DS1D, S1_ITM_GRP7.itm_grp_nm),
				when(boundOr("itm_grp_flg7", "itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM.itm_grp_cd8.as("itm_grp_cd8"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd8),
				when(boundOr("itm_grp_flg8"))
					.select(DS1D, S1_ITM_GRP8.itm_grp_nm.as("itm_grp_nm8"))
					.groupBy(DS1D, S1_ITM_GRP8.itm_grp_nm),
				when(boundOr("itm_grp_flg8", "itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM.itm_grp_cd9.as("itm_grp_cd9"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd9),
				when(boundOr("itm_grp_flg9"))
					.select(DS1D, S1_ITM_GRP9.itm_grp_nm.as("itm_grp_nm9"))
					.groupBy(DS1D, S1_ITM_GRP9.itm_grp_nm),
				when(boundOr("itm_grp_flg9", "itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM.itm_grp_cd10.as("itm_grp_cd10"))
					.groupBy(DS1D, S1_ITM.itm_grp_cd10),
				when(boundOr("itm_grp_flg10"))
					.select(DS1D, S1_ITM_GRP10.itm_grp_nm.as("itm_grp_nm10"))
					.groupBy(DS1D, S1_ITM_GRP10.itm_grp_nm),
				when(boundOr("itm_grp_flg10", "itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("loc_flg", "site_flg", "site_cd", "site_nm", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.site_cd.like(bind("site_cd"))).cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("site_flg"))
					.select(DS1D, S1_LOC.site_cd.as("site_cd"))
					.groupBy(DS1D, S1_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS1D, S1_SITE.site_nm.as("site_nm"))
					.groupBy(DS1D, S1_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SITE).on(S1_LOC.site_cd.eq(S1_SITE.site_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS1D, S1_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS1D, S1_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STR_LN).on(S1_T.loc_cd.eq(S1_STR_LN.loc_cd).and(S1_T.str_ln_cd.eq(S1_STR_LN.str_ln_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T2.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(boundOr("stk_bp_flg"))
					.select(DS1D, S1_STK_BP.bp_nm.as("stk_bp_nm"))
					.groupBy(DS1D, S1_STK_BP.bp_nm),
				when(boundOr("stk_bp_flg", "stk_bp_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_STK_BP).on(S1_T.stk_bp_cd.eq(S1_STK_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_STK_BP.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("ac_rsn_flg"))
					.select(DS1D, S1_AC_RSN.ac_rsn_nm.as("ac_rsn_nm"))
					.groupBy(DS1D, S1_AC_RSN.ac_rsn_nm),
				when(boundOr("ac_rsn_flg", "ac_rsn_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_AC_RSN).on(S1_T.ac_rsn_cd.eq(S1_AC_RSN.ac_rsn_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(boundOr("itm_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(boundOr("itm_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_TRD_CUR.cur_nm.as("trd_cur_nm"))
					.groupBy(DS1D, S1_TRD_CUR.cur_nm),
				when(boundOr("trd_cur_flg", "trd_cur_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_TRD_CUR).on(S1_T.trd_cur_cd.eq(S1_TRD_CUR.cur_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("trd_cur_flg"))
					.select(DS1D, S1_TRD_CUR.amt_dec_place.as("trd_amt_dec_place"))
					.groupBy(DS1D, S1_TRD_CUR.amt_dec_place),
				when(boundOr("expns_flg"))
					.select(DS1D, S1_EXPNS.expns_nm.as("expns_nm"))
					.groupBy(DS1D, S1_EXPNS.expns_nm),
				when(boundOr("expns_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_EXPNS).on(S1_T.expns_cd.eq(S1_EXPNS.expns_cd))),
				when(boundOr("calc_ctg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.calc_ctg_cd).asc()),
				when(boundOr("par_itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.par_itm_sub1).asc()),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("par_itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.par_itm_sub2).asc()),
				when(boundOr("par_itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.par_itm_sub3).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("ac_dt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ac_dt).asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T3.mng_dpt_cd).asc()),
				when(boundOr("par_itm_typ_d_flg"))
					.orderBy(DS0D, S0_T.pr("par_itm_typ_d_cd").asc()),
				when(boundOr("par_itm_jnl_flg"))
					.orderBy(DS0D, S0_T.pr("par_itm_jnl_cd").asc()),
				when(boundOr("par_itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.par_itm_cd).asc()),
				when(boundOr("par_itm_typ_flg"))
					.orderBy(DS0D, S0_T.pr("par_itm_typ").asc()),
				when(boundOr("itm_mfg_inst_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no).asc()),
				when(boundOr("mfg_act_no_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.mfg_act_no).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub1).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub2).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub3).asc()),
				when(boundOr("itm_typ_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(boundOr("itm_typ_d_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(boundOr("itm_jnl_flg"))
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(boundOr("act_inpt_id_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.act_inpt_id).asc())
			);
	}
}