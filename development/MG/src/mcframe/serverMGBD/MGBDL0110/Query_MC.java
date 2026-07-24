package mcframe.serverMGBD.MGBDL0110;

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
	 * -- MGBDL0110_MGT_ARG_Query_S01
	 */
	static MCQueryPlan MGBDL0110_MGT_ARG_S01() {
		MGT_ARG_R S0_T = MGT_ARG_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0110_MGT_ARG_Query_S01")
					.mainQuery()
					.select(
						S0_T.st_ym,
						S0_T.end_ym
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_no.eq(bind("calc_no")))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
					)
			);
	}
	
	/**
	 * -- MGBDL0110_MGT_EXP_OPER_Query_S01
	 */
	static MCQueryPlan MGBDL0110_MGT_EXP_OPER_S01() {
		MCTempView S0_T = createTempView("T");
		MCTempView S1_X = createTempView("X");
		MGT_EXP_OPER_R S2_T = MGT_EXP_OPER_R.create("T");
		MGT_CALC_ITM_OPER_R S2_T2 = MGT_CALC_ITM_OPER_R.create("T2");
		MAVM_RD_WG_R S2_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S2_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S2_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_TYP_D_R S2_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_ITM_JNL_R S2_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_UNIT_R S2_ITM_UNIT = MAM_UNIT_R.create("ITM_UNIT");
		MAM_UNIT_R S2_OPER_UNIT = MAM_UNIT_R.create("OPER_UNIT");
		MAM_OPER_R S2_OPER = MAM_OPER_R.create("OPER");
		MAM_COST_DPT_R S2_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_LOC_R S2_LOC = MAM_LOC_R.create("LOC");
		MAM_SITE_R S2_SITE = MAM_SITE_R.create("SITE");
		MAM_STR_LN_R S2_STR_LN = MAM_STR_LN_R.create("STR_LN");
		MAM_TERM_R S2_TERM = MAM_TERM_R.create("TERM");
		MAM_ITM_GRP_R S2_ITM_GRP1 = MAM_ITM_GRP_R.create("ITM_GRP1");
		MAM_ITM_GRP_R S2_ITM_GRP2 = MAM_ITM_GRP_R.create("ITM_GRP2");
		MAM_ITM_GRP_R S2_ITM_GRP3 = MAM_ITM_GRP_R.create("ITM_GRP3");
		MAM_ITM_GRP_R S2_ITM_GRP4 = MAM_ITM_GRP_R.create("ITM_GRP4");
		MAM_ITM_GRP_R S2_ITM_GRP5 = MAM_ITM_GRP_R.create("ITM_GRP5");
		MAM_ITM_GRP_R S2_ITM_GRP6 = MAM_ITM_GRP_R.create("ITM_GRP6");
		MAM_ITM_GRP_R S2_ITM_GRP7 = MAM_ITM_GRP_R.create("ITM_GRP7");
		MAM_ITM_GRP_R S2_ITM_GRP8 = MAM_ITM_GRP_R.create("ITM_GRP8");
		MAM_ITM_GRP_R S2_ITM_GRP9 = MAM_ITM_GRP_R.create("ITM_GRP9");
		MAM_ITM_GRP_R S2_ITM_GRP10 = MAM_ITM_GRP_R.create("ITM_GRP10");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS2D = createDynamicSQLID("DS2D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0110_MGT_EXP_OPER_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(S1_X.prAll())
						.from(
							subQuery()
							.select(
								S2_T.wg_cd,
								S2_T.ym,
								S2_T.mng_dpt_cd,
								S2_T.itm_cd,
								S2_T.itm_sub1,
								S2_T.itm_sub2,
								S2_T.itm_sub3,
								S2_T.itm_mfg_inst_no,
								S2_T.mfg_act_no,
								S2_T.lot_no,
								S2_T.sublot_no,
								S2_T.sno1,
								S2_T.sno2,
								S2_T.sno3,
								S2_T.sno4,
								S2_T.loc_cd,
								S2_T.str_ln_cd,
								S2_T.asst_typ,
								S2_T.oper_cd,
								S2_T.oper_seq,
								S2_T.disp_seq,
								S2_T.qty,
								S2_T2.oper_std_qty,
								S2_T2.oper_conv_qty,
								S2_T2.unit_conv_rnd_typ,
								S2_WG.wg_nm,
								nvl(
									S2_SUNDRY_ITM.itm_nm,
									S2_ITM.itm_nm
								).as("itm_nm"),
								S2_ITM.itm_typ,
								S2_ITM.itm_typ_d_cd,
								S2_ITM_TYP_D.itm_typ_d_nm,
								S2_ITM.itm_jnl_cd,
								S2_ITM_JNL.itm_jnl_nm,
								S2_ITM.unit_cd,
								S2_ITM_UNIT.unit_nm,
								S2_ITM.dec_place,
								S2_OPER.oper_nm,
								nvl(
									S2_T2.oper_unit_cd,
									S2_ITM.unit_cd
								).as("oper_unit_cd"),
								nvl(
									S2_OPER_UNIT.unit_nm,
									S2_ITM_UNIT.unit_nm
								).as("oper_unit_nm"),
								nvl(
									S2_T2.dec_place,
									S2_ITM.dec_place
								).as("oper_dec_place"),
								rowNumber()
									.over()
									.partitionBy(
										S2_T.wg_cd,
										S2_T.ym,
										S2_T.mng_dpt_cd,
										S2_T.itm_cd,
										S2_T.itm_sub1,
										S2_T.itm_sub2,
										S2_T.itm_sub3,
										S2_T.itm_mfg_inst_no,
										S2_T.mfg_act_no,
										S2_T.lot_no,
										S2_T.sublot_no,
										S2_T.sno1,
										S2_T.sno2,
										S2_T.sno3,
										S2_T.sno4,
										S2_T.loc_cd,
										S2_T.str_ln_cd,
										S2_T.asst_typ,
										S2_T.oper_cd,
										S2_T.oper_seq,
										S2_T.disp_seq,
										S2_T.qty
									)
									.orderBy(
										decode(
											S2_T2.loc_cd,
											value(MAC_STR.NULL_VAL.value()),
											nullValue(),
											S2_T2.loc_cd
										).asc()
									).as("rn"),
								addDynamicSelect(DS2D)
							)
							.from(
								S2_T
								.innerJoin(S2_T2).on(
									S2_T.calc_no.eq(S2_T2.calc_no)
									.and(S2_T.calc_grp_cd.eq(S2_T2.calc_grp_cd))
									.and(
										S2_T.wg_cd.eq(S2_T2.wg_cd)
										.or(S2_T2.wg_cd.eq(value(MAC_STR.NULL_VAL.value())))
									)
									.and(S2_T.itm_cd.eq(S2_T2.itm_cd))
									.and(S2_T.itm_sub1.eq(S2_T2.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_T2.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_T2.itm_sub3))
									.and(
										S2_T.loc_cd.eq(S2_T2.loc_cd)
										.or(S2_T2.loc_cd.eq(value(MAC_STR.NULL_VAL.value())))
									)
									.and(S2_T.oper_ptn.eq(S2_T2.oper_ptn))
									.and(S2_T.oper_cd.eq(S2_T2.oper_cd))
									.and(S2_T.oper_seq.eq(S2_T2.oper_seq))
								)
								.innerJoin(S2_WG).on(S2_T.wg_cd.eq(S2_WG.wg_cd))
								.leftOuterJoin(S2_ITM).on(
									S2_T.itm_cd.eq(S2_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_ITM.itm_sub3))
								)
								.leftOuterJoin(S2_SUNDRY_ITM).on(
									S2_T.itm_cd.eq(S2_SUNDRY_ITM.itm_cd)
									.and(S2_T.itm_sub1.eq(S2_SUNDRY_ITM.itm_sub1))
									.and(S2_T.itm_sub2.eq(S2_SUNDRY_ITM.itm_sub2))
									.and(S2_T.itm_sub3.eq(S2_SUNDRY_ITM.itm_sub3))
									.and(S2_T.sno1.eq(S2_SUNDRY_ITM.sno1))
									.and(S2_T.sno2.eq(S2_SUNDRY_ITM.sno2))
									.and(S2_T.sno3.eq(S2_SUNDRY_ITM.sno3))
									.and(S2_T.sno4.eq(S2_SUNDRY_ITM.sno4))
								)
								.leftOuterJoin(S2_ITM_TYP_D).on(
									S2_ITM.itm_typ.eq(S2_ITM_TYP_D.itm_typ)
									.and(S2_ITM.itm_typ_d_cd.eq(S2_ITM_TYP_D.itm_typ_d_cd))
								)
								.leftOuterJoin(S2_ITM_JNL).on(S2_ITM.itm_jnl_cd.eq(S2_ITM_JNL.itm_jnl_cd))
								.leftOuterJoin(S2_ITM_UNIT).on(S2_ITM.unit_cd.eq(S2_ITM_UNIT.unit_cd))
								.leftOuterJoin(S2_OPER_UNIT).on(S2_T2.oper_unit_cd.eq(S2_OPER_UNIT.unit_cd))
								.leftOuterJoin(S2_OPER).on(S2_T.oper_cd.eq(S2_OPER.oper_cd))
								.addDynamicView(DS2D)
							)
							.where(
								value(0).eq(value(0))
								.and(S2_T.calc_no.eq(bind("calc_no")))
								.and(S2_T.calc_grp_cd.eq(bind("calc_grp_cd")))
								.cutoff$and(S2_T.wg_cd.like(bind("wg_cd")))
								.cutoff$and(S2_WG.wg_nm.like(bind("wg_nm")))
								.cutoff$and(S2_T.mng_dpt_cd.like(bind("mng_dpt_cd")))
								.cutoff$and(S2_ITM.itm_typ.like(bind("itm_typ")))
								.cutoff$and(S2_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
								.cutoff$and(S2_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
								.cutoff$and(S2_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
								.cutoff$and(S2_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
								.cutoff$and(S2_T.itm_cd.like(bind("itm_cd")))
								.cutoff$and(S2_T.itm_sub1.like(bind("itm_sub1")))
								.cutoff$and(S2_T.itm_sub2.like(bind("itm_sub2")))
								.cutoff$and(S2_T.itm_sub3.like(bind("itm_sub3")))
								.cutoff$and(
									nvl(
										S2_SUNDRY_ITM.itm_nm,
										S2_ITM.itm_nm
									).like(bind("itm_nm"))
								)
								.cutoff$and(S2_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
								.cutoff$and(S2_T.mfg_act_no.like(bind("mfg_act_no")))
								.cutoff$and(S2_T.lot_no.like(bind("lot_no")))
								.cutoff$and(S2_T.sublot_no.like(bind("sublot_no")))
								.cutoff$and(S2_T.sno1.like(bind("sno1")))
								.cutoff$and(S2_T.sno2.like(bind("sno2")))
								.cutoff$and(S2_T.sno3.like(bind("sno3")))
								.cutoff$and(S2_T.sno4.like(bind("sno4")))
								.cutoff$and(S2_T.loc_cd.like(bind("loc_cd")))
								.cutoff$and(S2_T.str_ln_cd.like(bind("str_ln_cd")))
								.cutoff$and(S2_T.asst_typ.like(bind("asst_typ")))
								.cutoff$and(S2_T.oper_cd.like(bind("oper_cd")))
								.cutoff$and(S2_OPER.oper_nm.like(bind("oper_nm")))
								.cutoff$and(S2_ITM.itm_grp_cd1.like(bind("itm_grp_cd1")))
								.cutoff$and(S2_ITM.itm_grp_cd2.like(bind("itm_grp_cd2")))
								.cutoff$and(S2_ITM.itm_grp_cd3.like(bind("itm_grp_cd3")))
								.cutoff$and(S2_ITM.itm_grp_cd4.like(bind("itm_grp_cd4")))
								.cutoff$and(S2_ITM.itm_grp_cd5.like(bind("itm_grp_cd5")))
								.cutoff$and(S2_ITM.itm_grp_cd6.like(bind("itm_grp_cd6")))
								.cutoff$and(S2_ITM.itm_grp_cd7.like(bind("itm_grp_cd7")))
								.cutoff$and(S2_ITM.itm_grp_cd8.like(bind("itm_grp_cd8")))
								.cutoff$and(S2_ITM.itm_grp_cd9.like(bind("itm_grp_cd9")))
								.cutoff$and(S2_ITM.itm_grp_cd10.like(bind("itm_grp_cd10")))
								.addDynamicPredicate(DS2D)
							).view(S1_X)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_X.pr("rn").eq(value(1)))
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
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_cd"))
					.groupBy(DS0D, S0_T.pr("wg_cd")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_cd")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr("itm_mfg_inst_no"))
					.groupBy(DS0D, S0_T.pr("itm_mfg_inst_no")),
				when(boundOr("mfg_act_no_flg"))
					.select(DS0D, S0_T.pr("mfg_act_no"))
					.groupBy(DS0D, S0_T.pr("mfg_act_no")),
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
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_cd"))
					.groupBy(DS0D, S0_T.pr("site_cd")),
				when(boundOr("site_flg"))
					.select(DS0D, S0_T.pr("site_nm"))
					.groupBy(DS0D, S0_T.pr("site_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_cd"))
					.groupBy(DS0D, S0_T.pr("loc_cd")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_cd"))
					.groupBy(DS0D, S0_T.pr("str_ln_cd")),
				when(boundOr("str_ln_flg"))
					.select(DS0D, S0_T.pr("str_ln_nm"))
					.groupBy(DS0D, S0_T.pr("str_ln_nm")),
				when(boundOr("asst_flg"))
					.select(DS0D, S0_T.pr("asst_typ"))
					.groupBy(DS0D, S0_T.pr("asst_typ")),
				when(boundOr("disp_seq_flg"))
					.select(DS0D, S0_T.pr("disp_seq"))
					.groupBy(DS0D, S0_T.pr("disp_seq")),
				when(boundOr("disp_seq_flg"))
					.select(DS0D, S0_T.pr("oper_seq"))
					.groupBy(DS0D, S0_T.pr("oper_seq")),
				when(null)
					.select(DS0D, S0_T.pr("itm_cd"))
					.groupBy(DS0D, S0_T.pr("itm_cd")),
				when(null)
					.select(DS0D, S0_T.pr("itm_sub1"))
					.groupBy(DS0D, S0_T.pr("itm_sub1")),
				when(null)
					.select(DS0D, S0_T.pr("itm_sub2"))
					.groupBy(DS0D, S0_T.pr("itm_sub2")),
				when(null)
					.select(DS0D, S0_T.pr("itm_sub3"))
					.groupBy(DS0D, S0_T.pr("itm_sub3")),
				when(null)
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(null)
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
				when(null)
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
				when(null)
					.select(DS0D, S0_T.pr("itm_jnl_nm"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_nm")),
				when(null)
					.select(DS0D, S0_T.pr("oper_cd"))
					.groupBy(DS0D, S0_T.pr("oper_cd")),
				when(null)
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(null)
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(null)
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(null)
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, S0_T.pr("oper_unit_cd"))
					.groupBy(DS0D, S0_T.pr("oper_unit_cd")),
				when(null)
					.select(DS0D, S0_T.pr("oper_unit_nm"))
					.groupBy(DS0D, S0_T.pr("oper_unit_nm")),
				when(null)
					.select(DS0D, S0_T.pr("oper_dec_place"))
					.groupBy(DS0D, S0_T.pr("oper_dec_place")),
				when(null)
					.select(DS0D, S0_T.pr("oper_std_qty"))
					.groupBy(DS0D, S0_T.pr("oper_std_qty")),
				when(null)
					.select(DS0D, S0_T.pr("oper_conv_qty"))
					.groupBy(DS0D, S0_T.pr("oper_conv_qty")),
				when(null)
					.select(DS0D, S0_T.pr("unit_conv_rnd_typ"))
					.groupBy(DS0D, S0_T.pr("unit_conv_rnd_typ")),
				when(null)
					.select(DS0D, S0_T.pr("ym"))
					.groupBy(DS0D, S0_T.pr("ym")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty")).as("qty")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS2D, v -> v.innerJoin(S2_TERM).on(S2_T.ym.gte(S2_TERM.term).and(S2_T.ym.lt(S2_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS2D, S2_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS2D, S2_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_MNG_DPT).on(S2_T.mng_dpt_cd.eq(S2_MNG_DPT.dpt_cd).and(S2_TERM.term.eq(S2_MNG_DPT.term))))
					.predicate(DS2D, p -> p.cutoff$and(S2_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("loc_flg", "loc_nm", "site_cd", "site_nm", "site_flg"))
					.view(DS2D, v -> v.leftOuterJoin(S2_LOC).on(S2_T.loc_cd.eq(S2_LOC.loc_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_LOC.loc_nm.like(bind("loc_nm"))).cutoff$and(S2_LOC.site_cd.like(bind("site_cd")))),
				when(boundOr("site_flg"))
					.select(DS2D, S2_LOC.site_cd.as("site_cd"))
					.groupBy(DS2D, S2_LOC.site_cd),
				when(boundOr("site_flg"))
					.select(DS2D, S2_SITE.site_nm.as("site_nm"))
					.groupBy(DS2D, S2_SITE.site_nm),
				when(boundOr("site_flg", "site_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_SITE).on(S2_LOC.site_cd.eq(S2_SITE.site_cd)))
					.predicate(DS2D, p -> p.cutoff$and(S2_SITE.site_nm.like(bind("site_nm")))),
				when(boundOr("loc_flg"))
					.select(DS2D, S2_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS2D, S2_LOC.loc_nm),
				when(boundOr("str_ln_flg"))
					.select(DS2D, S2_STR_LN.str_ln_nm.as("str_ln_nm"))
					.groupBy(DS2D, S2_STR_LN.str_ln_nm),
				when(boundOr("str_ln_flg", "str_ln_nm"))
					.view(DS2D, v -> v.leftOuterJoin(S2_STR_LN).on(S2_T.loc_cd.eq(S2_STR_LN.loc_cd).and(S2_T.str_ln_cd.eq(S2_STR_LN.str_ln_cd))))
					.predicate(DS2D, p -> p.cutoff$and(S2_STR_LN.str_ln_nm.like(bind("str_ln_nm")))),
				when(boundOr("itm_grp_nm1"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP1).on(S2_ITM.itm_grp_cd1.eq(S2_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S2_ITM_GRP1.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP2).on(S2_ITM.itm_grp_cd2.eq(S2_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S2_ITM_GRP2.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP3).on(S2_ITM.itm_grp_cd3.eq(S2_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S2_ITM_GRP3.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP4).on(S2_ITM.itm_grp_cd4.eq(S2_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S2_ITM_GRP4.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP5).on(S2_ITM.itm_grp_cd5.eq(S2_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S2_ITM_GRP5.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP6).on(S2_ITM.itm_grp_cd6.eq(S2_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S2_ITM_GRP6.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP7).on(S2_ITM.itm_grp_cd7.eq(S2_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S2_ITM_GRP7.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP8).on(S2_ITM.itm_grp_cd8.eq(S2_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S2_ITM_GRP8.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP9).on(S2_ITM.itm_grp_cd9.eq(S2_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S2_ITM_GRP9.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS2D, v -> v.leftOuterJoin(S2_ITM_GRP10).on(S2_ITM.itm_grp_cd10.eq(S2_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S2_ITM_GRP10.itm_grp_typ))))
					.predicate(DS2D, p -> p.cutoff$and(S2_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr("wg_cd").asc()),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr("mng_dpt_cd").asc()),
				when(boundOr("itm_mfg_inst_no_flg"))
					.orderBy(DS0D, S0_T.pr("itm_mfg_inst_no").asc()),
				when(boundOr("mfg_act_no_flg"))
					.orderBy(DS0D, S0_T.pr("mfg_act_no").asc()),
				when(boundOr("lot_flg"))
					.orderBy(DS0D, S0_T.pr("lot_no").asc()),
				when(boundOr("sublot_flg"))
					.orderBy(DS0D, S0_T.pr("sublot_no").asc()),
				when(boundOr("sno1_flg"))
					.orderBy(DS0D, S0_T.pr("sno1").asc()),
				when(boundOr("sno2_flg"))
					.orderBy(DS0D, S0_T.pr("sno2").asc()),
				when(boundOr("sno3_flg"))
					.orderBy(DS0D, S0_T.pr("sno3").asc()),
				when(boundOr("sno4_flg"))
					.orderBy(DS0D, S0_T.pr("sno4").asc()),
				when(boundOr("site_flg"))
					.orderBy(DS0D, S0_T.pr("site_cd").asc()),
				when(boundOr("loc_flg"))
					.orderBy(DS0D, S0_T.pr("loc_cd").asc()),
				when(boundOr("str_ln_flg"))
					.orderBy(DS0D, S0_T.pr("str_ln_cd").asc()),
				when(boundOr("asst_flg"))
					.orderBy(DS0D, S0_T.pr("asst_typ").asc()),
				when(boundOr("disp_seq_flg"))
					.orderBy(DS0D, S0_T.pr("disp_seq").asc()),
				when(boundOr("disp_seq_flg"))
					.orderBy(DS0D, S0_T.pr("oper_seq").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub1").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub2").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub3").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("oper_cd").asc())
			);
	}
}