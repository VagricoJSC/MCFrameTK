package mcframe.serverMGBB.MGBBL0320;

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
	 * -- MGBBL0320_MGT_ACT_INPT_IF_Query_S01
	 */
	static MCQueryPlan MGBBL0320_MGT_ACT_INPT_IF_S01() {
		MGT_ACT_INPT_IF_R S0_T = MGT_ACT_INPT_IF_R.create("T");
		MGT_ITM_MFG_INST_R S0_T2 = MGT_ITM_MFG_INST_R.create("T2");
		MAVM_RD_WG_R S0_WG = MAVM_RD_WG_R.create("WG");
		MAM_TERM_R S0_TERM = MAM_TERM_R.create("TERM");
		MAM_ITM_R S0_PAR_ITM = MAM_ITM_R.create("PAR_ITM");
		MAM_SUNDRY_ITM_R S0_PAR_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("PAR_SUNDRY_ITM");
		MAM_ITM_R S0_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S0_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_CALC_CTG_R S0_CALC_CTG = MAM_CALC_CTG_R.create("CALC_CTG");
		MAM_COST_DPT_R S0_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_ITM_TYP_D_R S0_PAR_ITM_TYP_D = MAM_ITM_TYP_D_R.create("PAR_ITM_TYP_D");
		MAM_ITM_JNL_R S0_PAR_ITM_JNL = MAM_ITM_JNL_R.create("PAR_ITM_JNL");
		MAM_ITM_TYP_D_R S0_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S0_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S0_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_AC_RSN_R S0_AC_RSN = MAM_AC_RSN_R.create("AC_RSN");
		MAM_CUR_R S0_TRD_CUR = MAM_CUR_R.create("TRD_CUR");
		MAM_BP_R S0_STK_BP = MAM_BP_R.create("STK_BP");
		MAM_LOC_R S0_LOC = MAM_LOC_R.create("LOC");
		MAM_STR_LN_R S0_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_SITE_R S0_SITE = MAM_SITE_R.create("SITE");
		MAM_EXPNS_R S0_EXPNS = MAM_EXPNS_R.create("EXPNS");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP1 = MAM_ITM_GRP_R.create("PAR_ITM_GRP1");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP2 = MAM_ITM_GRP_R.create("PAR_ITM_GRP2");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP3 = MAM_ITM_GRP_R.create("PAR_ITM_GRP3");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP4 = MAM_ITM_GRP_R.create("PAR_ITM_GRP4");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP5 = MAM_ITM_GRP_R.create("PAR_ITM_GRP5");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP6 = MAM_ITM_GRP_R.create("PAR_ITM_GRP6");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP7 = MAM_ITM_GRP_R.create("PAR_ITM_GRP7");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP8 = MAM_ITM_GRP_R.create("PAR_ITM_GRP8");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP9 = MAM_ITM_GRP_R.create("PAR_ITM_GRP9");
		MAM_ITM_GRP_R S0_PAR_ITM_GRP10 = MAM_ITM_GRP_R.create("PAR_ITM_GRP10");
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
		
		MCDynamicSQLID DS0C_ITM_GRP = createDynamicSQLID("DS0C_ITM_GRP");
		MCDynamicSQLID DS0C_PAR_ITM_GRP = createDynamicSQLID("DS0C_PAR_ITM_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBBL0320_MGT_ACT_INPT_IF_Query_S01")
					.mainQuery()
					.select(
						S0_T.data_lno,
						S0_T.calc_ctg_cd,
						S0_T.wg_cd,
						S0_T.ym,
						S0_T.ac_dt,
						S0_T.par_itm_cd,
						S0_T.par_itm_sub1,
						S0_T.par_itm_sub2,
						S0_T.par_itm_sub3,
						S0_T.itm_mfg_inst_no,
						S0_T.mfg_act_no,
						S0_T.oper_act_no,
						S0_T.loc_cd,
						S0_T.str_ln_cd,
						S0_T.mng_dpt_cd,
						S0_T.itm_cd,
						S0_T.itm_sub1,
						S0_T.itm_sub2,
						S0_T.itm_sub3,
						S0_T.lot_no,
						S0_T.sublot_no,
						S0_T.sno1,
						S0_T.sno2,
						S0_T.sno3,
						S0_T.sno4,
						S0_T.ac_slip_typ,
						S0_T.ac_rsn_cd,
						S0_T.stk_bp_cd,
						S0_T.asst_typ,
						S0_T.qty,
						S0_T.amt,
						S0_T.trd_cur_cd,
						S0_T.trd_cur_amt,
						S0_T.xrate,
						S0_T.rec_eval_typ,
						S0_T.expns_cd,
						S0_T.no_pln_flg,
						S0_T.no_itm_info_flg,
						S0_T.zero_effect_flg,
						S0_T.slip_no,
						S0_T.slip_seq_no,
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
						S0_WG.wg_nm,
						S0_PAR_ITM.itm_typ.as("par_itm_typ"),
						S0_PAR_ITM.itm_typ_d_cd.as("par_itm_typ_d_cd"),
						nvl(
							S0_PAR_SUNDRY_ITM.itm_nm,
							S0_PAR_ITM.itm_nm
						).as("par_itm_nm"),
						S0_PAR_ITM.itm_jnl_cd.as("par_itm_jnl_cd"),
						S0_ITM.itm_typ,
						S0_ITM.itm_typ_d_cd,
						nvl(
							S0_SUNDRY_ITM.itm_nm,
							S0_ITM.itm_nm
						).as("itm_nm"),
						S0_ITM.itm_jnl_cd,
						S0_ITM.unit_cd,
						S0_ITM.dec_place,
						// this field is appended by sql coverter.
						S0_TERM.term.as("join_term_")
					)
					.from(
						S0_T
						.leftOuterJoin(S0_T2).on(
							S0_T.calc_ctg_cd.eq(S0_T2.calc_ctg_cd)
							.and(S0_T.par_itm_cd.eq(S0_T2.itm_cd))
							.and(S0_T.par_itm_sub1.eq(S0_T2.itm_sub1))
							.and(S0_T.par_itm_sub2.eq(S0_T2.itm_sub2))
							.and(S0_T.par_itm_sub3.eq(S0_T2.itm_sub3))
							.and(S0_T.itm_mfg_inst_no.eq(S0_T2.itm_mfg_inst_no))
							.and(S0_T.mfg_act_no.eq(S0_T2.mfg_act_no))
						)
						.innerJoin(S0_WG).on(S0_T.wg_cd.eq(S0_WG.wg_cd))
						.innerJoin(S0_TERM).on(
							S0_T.ym.gte(S0_TERM.term)
							.and(S0_T.ym.lt(S0_TERM.term_end_ym))
						)
						.leftOuterJoin(S0_PAR_ITM).on(
							S0_T.par_itm_cd.eq(S0_PAR_ITM.itm_cd)
							.and(S0_T.par_itm_sub1.eq(S0_PAR_ITM.itm_sub1))
							.and(S0_T.par_itm_sub2.eq(S0_PAR_ITM.itm_sub2))
							.and(S0_T.par_itm_sub3.eq(S0_PAR_ITM.itm_sub3))
						)
						.leftOuterJoin(S0_PAR_SUNDRY_ITM).on(
							S0_T2.itm_cd.eq(S0_PAR_SUNDRY_ITM.itm_cd)
							.and(S0_T2.itm_sub1.eq(S0_PAR_SUNDRY_ITM.itm_sub1))
							.and(S0_T2.itm_sub2.eq(S0_PAR_SUNDRY_ITM.itm_sub2))
							.and(S0_T2.itm_sub3.eq(S0_PAR_SUNDRY_ITM.itm_sub3))
							.and(S0_T2.sno1.eq(S0_PAR_SUNDRY_ITM.sno1))
							.and(S0_T2.sno2.eq(S0_PAR_SUNDRY_ITM.sno2))
							.and(S0_T2.sno3.eq(S0_PAR_SUNDRY_ITM.sno3))
							.and(S0_T2.sno4.eq(S0_PAR_SUNDRY_ITM.sno4))
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
						.addDynamicView(DS0C_PAR_ITM_GRP)
						.addDynamicView(DS0C_ITM_GRP)
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
						.cutoff$and(S0_T.slip_no.like(bind("slip_no")))
						.cutoff$and(S0_PAR_ITM.itm_jnl_cd.like(bind("par_itm_jnl_cd")))
						.cutoff$and(S0_PAR_ITM.itm_typ.like(bind("par_itm_typ")))
						.cutoff$and(S0_PAR_ITM.itm_typ_d_cd.like(bind("par_itm_typ_d_cd")))
						.cutoff$and(S0_T.par_itm_cd.like(bind("par_itm_cd")))
						.cutoff$and(S0_T.par_itm_sub1.like(bind("par_itm_sub1")))
						.cutoff$and(S0_T.par_itm_sub2.like(bind("par_itm_sub2")))
						.cutoff$and(S0_T.par_itm_sub3.like(bind("par_itm_sub3")))
						.cutoff$and(
							nvl(
								S0_PAR_SUNDRY_ITM.itm_nm,
								S0_PAR_ITM.itm_nm
							).like(bind("par_itm_nm"))
						)
						.cutoff$and(S0_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
						.cutoff$and(S0_T.mfg_act_no.like(bind("mfg_act_no")))
						.cutoff$and(S0_T.oper_act_no.like(bind("oper_act_no")))
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
						.cutoff$and(S0_T.loc_cd.like(bind("loc_cd")))
						.cutoff$and(S0_T.str_ln_cd.like(bind("str_ln_cd")))
						.cutoff$and(S0_T.ac_slip_typ.like(bind("ac_slip_typ")))
						.cutoff$and(S0_T.ac_rsn_cd.like(bind("ac_rsn_cd")))
						.cutoff$and(S0_T.trd_cur_cd.like(bind("trd_cur_cd")))
						.cutoff$and(S0_T.stk_bp_cd.like(bind("stk_bp_cd")))
						.cutoff$and(S0_T.rec_eval_typ.like(bind("rec_eval_typ")))
						.cutoff$and(S0_T.rmrks.like(bind("rmrks")))
						.cutoff$and(S0_T.sub_char1.like(bind("sub_char1")))
						.cutoff$and(S0_T.sub_char2.like(bind("sub_char2")))
						.cutoff$and(S0_T.sub_char3.like(bind("sub_char3")))
						.cutoff$and(
							bind("no_stk_bp_flg_str").eq(value(true))
							.and(S0_T.stk_bp_cd.isNull())
						)
						.cutoff$and(
							bind("no_ac_rsn_flg_str").eq(value(true))
							.and(S0_T.ac_rsn_cd.isNull())
						)
						.addDynamicPredicate(DS0C_PAR_ITM_GRP)
						.addDynamicPredicate(DS0C_ITM_GRP)
					)
					.orderBy(
						S0_T.calc_ctg_cd.asc(),
						S0_T.wg_cd.asc(),
						S0_T.ym.asc(),
						S0_T.ac_dt.asc(),
						S0_T.mng_dpt_cd.asc(),
						S0_PAR_ITM.itm_typ.asc(),
						S0_PAR_ITM.itm_typ_d_cd.asc(),
						S0_PAR_ITM.itm_jnl_cd.asc(),
						S0_T.par_itm_cd.asc(),
						S0_T.par_itm_sub1.asc(),
						S0_T.par_itm_sub2.asc(),
						S0_T.par_itm_sub3.asc(),
						S0_T.itm_mfg_inst_no.asc(),
						S0_T.mfg_act_no.asc(),
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
				when(boundOr("par_itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_PAR_ITM_TYP_D).on(S0_PAR_ITM.itm_typ.eq(S0_PAR_ITM_TYP_D.itm_typ).and(S0_PAR_ITM.itm_typ_d_cd.eq(S0_PAR_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_PAR_ITM_TYP_D.itm_typ_d_nm.like(bind("par_itm_typ_d_nm")))),
				when(boundOr("par_itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_PAR_ITM_JNL).on(S0_PAR_ITM.itm_jnl_cd.eq(S0_PAR_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_PAR_ITM_JNL.itm_jnl_nm.like(bind("par_itm_jnl_nm")))),
				when(boundOr("itm_typ_d_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_TYP_D).on(S0_ITM.itm_typ.eq(S0_ITM_TYP_D.itm_typ).and(S0_ITM.itm_typ_d_cd.eq(S0_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(p -> p.cutoff$and(S0_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
				when(boundOr("itm_jnl_nm"))
					.view(v -> v.leftOuterJoin(S0_ITM_JNL).on(S0_ITM.itm_jnl_cd.eq(S0_ITM_JNL.itm_jnl_cd)))
					.predicate(p -> p.cutoff$and(S0_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))),
				when(boundOr("ac_rsn_nm"))
					.view(v -> v.leftOuterJoin(S0_AC_RSN).on(S0_T.ac_rsn_cd.eq(S0_AC_RSN.ac_rsn_cd)))
					.predicate(p -> p.cutoff$and(S0_AC_RSN.ac_rsn_nm.like(bind("ac_rsn_nm")))),
				when(boundOr("trd_cur_nm"))
					.view(v -> v.leftOuterJoin(S0_TRD_CUR).on(S0_T.trd_cur_cd.eq(S0_TRD_CUR.cur_cd)))
					.predicate(p -> p.cutoff$and(S0_TRD_CUR.cur_nm.like(bind("trd_cur_nm")))),
				when(boundOr("stk_bp_nm"))
					.view(v -> v.leftOuterJoin(S0_STK_BP).on(S0_T.stk_bp_cd.eq(S0_STK_BP.bp_cd)))
					.predicate(p -> p.cutoff$and(S0_STK_BP.bp_nm.like(bind("stk_bp_nm")))),
				when(boundOr("site_nm", "loc_nm", "site_cd"))
					.view(v -> v.leftOuterJoin(S0_LOC).on(S0_T.loc_cd.eq(S0_LOC.loc_cd)))
					.predicate(p -> p.cutoff$and(S0_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S0_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("str_ln_nm"))
					.view(v -> v.leftOuterJoin(S0_STR_LN).on(S0_T.loc_cd.eq(S0_STR_LN.loc_cd).and(S0_T.str_ln_cd.eq(S0_STR_LN.str_ln_cd))))
					.predicate(p -> p.cutoff$and(S0_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("site_nm"))
					.view(v -> v.leftOuterJoin(S0_SITE).on(S0_LOC.site_cd.eq(S0_SITE.site_cd)))
					.predicate(p -> p.cutoff$and(S0_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("par_itm_grp_flg1"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP1).on(S0_PAR_ITM.itm_grp_cd1.eq(S0_PAR_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S0_PAR_ITM_GRP1.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd1.like(bind("par_itm_grp_cd1"))).cutoff$and(S0_PAR_ITM_GRP1.itm_grp_nm.like(bind("par_itm_grp_nm1")))),
				when(boundOr("par_itm_grp_flg2"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP2).on(S0_PAR_ITM.itm_grp_cd2.eq(S0_PAR_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S0_PAR_ITM_GRP2.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd2.like(bind("par_itm_grp_cd2"))).cutoff$and(S0_PAR_ITM_GRP2.itm_grp_nm.like(bind("par_itm_grp_nm2")))),
				when(boundOr("par_itm_grp_flg3"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP3).on(S0_PAR_ITM.itm_grp_cd3.eq(S0_PAR_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S0_PAR_ITM_GRP3.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd3.like(bind("par_itm_grp_cd3"))).cutoff$and(S0_PAR_ITM_GRP3.itm_grp_nm.like(bind("par_itm_grp_nm3")))),
				when(boundOr("par_itm_grp_flg4"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP4).on(S0_PAR_ITM.itm_grp_cd4.eq(S0_PAR_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S0_PAR_ITM_GRP4.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd4.like(bind("par_itm_grp_cd4"))).cutoff$and(S0_PAR_ITM_GRP4.itm_grp_nm.like(bind("par_itm_grp_nm4")))),
				when(boundOr("par_itm_grp_flg5"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP5).on(S0_PAR_ITM.itm_grp_cd5.eq(S0_PAR_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S0_PAR_ITM_GRP5.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd5.like(bind("par_itm_grp_cd5"))).cutoff$and(S0_PAR_ITM_GRP5.itm_grp_nm.like(bind("par_itm_grp_nm5")))),
				when(boundOr("par_itm_grp_flg6"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP6).on(S0_PAR_ITM.itm_grp_cd6.eq(S0_PAR_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S0_PAR_ITM_GRP6.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd6.like(bind("par_itm_grp_cd6"))).cutoff$and(S0_PAR_ITM_GRP6.itm_grp_nm.like(bind("par_itm_grp_nm6")))),
				when(boundOr("par_itm_grp_flg7"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP7).on(S0_PAR_ITM.itm_grp_cd7.eq(S0_PAR_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S0_PAR_ITM_GRP7.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd7.like(bind("par_itm_grp_cd7"))).cutoff$and(S0_PAR_ITM_GRP7.itm_grp_nm.like(bind("par_itm_grp_nm7")))),
				when(boundOr("par_itm_grp_flg8"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP8).on(S0_PAR_ITM.itm_grp_cd8.eq(S0_PAR_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S0_PAR_ITM_GRP8.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd8.like(bind("par_itm_grp_cd8"))).cutoff$and(S0_PAR_ITM_GRP8.itm_grp_nm.like(bind("par_itm_grp_nm8")))),
				when(boundOr("par_itm_grp_flg9"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP9).on(S0_PAR_ITM.itm_grp_cd9.eq(S0_PAR_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S0_PAR_ITM_GRP9.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd9.like(bind("par_itm_grp_cd9"))).cutoff$and(S0_PAR_ITM_GRP9.itm_grp_nm.like(bind("par_itm_grp_nm9")))),
				when(boundOr("par_itm_grp_flg10"))
					.view(DS0C_PAR_ITM_GRP, v -> v.leftOuterJoin(S0_PAR_ITM_GRP10).on(S0_PAR_ITM.itm_grp_cd10.eq(S0_PAR_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S0_PAR_ITM_GRP10.itm_grp_typ))))
					.predicate(DS0C_PAR_ITM_GRP, p -> p.cutoff$and(S0_PAR_ITM.itm_grp_cd10.like(bind("par_itm_grp_cd10"))).cutoff$and(S0_PAR_ITM_GRP10.itm_grp_nm.like(bind("par_itm_grp_nm10")))),
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
					.predicate(DS0C_ITM_GRP, p -> p.cutoff$and(S0_ITM.itm_grp_cd10.like(bind("itm_grp_cd10"))).cutoff$and(S0_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10"))))
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
							r.getStringNE("par_itm_typ"),
							r.getStringNE("par_itm_typ_d_cd")
						))
						.addSelect(m -> toArray(
							m.itm_typ_d_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_typ_d_nm", m.itm_typ_d_nm());
					}),
					j -> j
						.add(MAM_ITM_JNL_R.class, r -> toCondition(
							r.getStringNE("par_itm_jnl_cd")
						))
						.addSelect(m -> toArray(
							m.itm_jnl_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("par_itm_jnl_nm", m.itm_jnl_nm());
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
						.add(MAM_AC_RSN_R.class, r -> toCondition(
							r.getStringNE("ac_rsn_cd")
						))
						.addSelect(m -> toArray(
							m.ac_rsn_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("ac_rsn_nm", m.ac_rsn_nm());
					}),
					j -> j
						.add(MAM_CUR_R.class, r -> toCondition(
							r.getStringNE("trd_cur_cd")
						))
						.addSelect(m -> toArray(
							m.amt_dec_place,
							m.cur_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("trd_cur_nm", m.cur_nm());
							r.setNumberNE("trd_amt_dec_place", m.amt_dec_place());
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
						.add(MAM_LOC_R.class, r -> toCondition(
							r.getStringNE("loc_cd")
						))
						.addSelect(m -> toArray(
							m.loc_nm,
							m.site_cd,
							m.str_ln_tgt_flg
						))
						.addMap((r, m) -> {
							r.setStringNE("loc_nm", m.loc_nm());
							r.setBooleanNE("str_ln_tgt_flg", m.str_ln_tgt_flg());
							r.setStringNE("site_cd", m.site_cd());
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
						.add(MAM_SITE_R.class, r -> toCondition(
							r.getStringNE("site_cd")
						))
						.addSelect(m -> toArray(
							m.site_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("site_nm", m.site_nm());
					}),
					j -> j
						.add(MAM_EXPNS_R.class, r -> toCondition(
							r.getStringNE("expns_cd")
						))
						.addSelect(m -> toArray(
							m.expns_nm
						))
						.addMap((r, m) -> {
							r.setStringNE("expns_nm", m.expns_nm());
					})
				)
			);
	}
}