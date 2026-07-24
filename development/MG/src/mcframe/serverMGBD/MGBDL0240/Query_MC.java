package mcframe.serverMGBD.MGBDL0240;

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
	 * -- MGBDL0240_MGT_ACT_ALC_AMT_Query_I01
	 */
	static MCQueryPlan MGBDL0240_MGT_ACT_ALC_AMT_I01() {
		MGT_ACT_ALC_AMT_R S0 = MGT_ACT_ALC_AMT_R.create();
		MGT_PRE_ALC_R S1_T = MGT_PRE_ALC_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_ACT_ALC_AMT_Query_I01")
					.insert(S0)
					.columns(
						S0.act_alc_amt_key,
						S0.calc_ctg_cd,
						S0.alc_rec_typ,
						S0.wg_cd,
						S0.ym,
						S0.alc_ac_cd,
						S0.dpt_cd,
						S0.loc_cd,
						S0.oper_cd,
						S0.bp_cd,
						S0.ctg_cd,
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
						S0.itm_mfg_inst_no,
						S0.iv_no,
						S0.po_no,
						S0.slo_no,
						S0.amt,
						S0.trd_wg_cd,
						S0.trd_calc_grp_cd,
						S0.trd_calc_no,
						S0.pre_alc_fin_flg
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY.value())),
							bind("calc_ctg_cd"),
							decode(
								S1_T.wg_cd,
								S1_T.src_wg_cd,
								value(MGC_ALC_REC_TYP.MY_WG.value()),
								value(MGC_ALC_REC_TYP.OTHER_WG.value())
							),
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.alc_ac_cd,
							S1_T.dpt_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.bp_cd,
							S1_T.ctg_cd,
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
							S1_T.itm_mfg_inst_no,
							S1_T.iv_no,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.amt,
							S1_T.src_wg_cd,
							S1_T.calc_grp_cd,
							S1_T.calc_no,
							value(false)
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_no.eq(bind("calc_no")))
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_ACT_ALC_AMT_Query_U01
	 */
	static MCQueryPlan MGBDL0240_MGT_ACT_ALC_AMT_U01() {
		MGT_ACT_ALC_AMT_R S0_T = MGT_ACT_ALC_AMT_R.create("T");
		MGT_CALC_PRE_ALC_AMT_R S1_TB1 = MGT_CALC_PRE_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_ACT_ALC_AMT_Query_U01")
					.update(S0_T)
					.set(S0_T.pre_alc_fin_flg).eq(bind("pre_alc_fin_flg"))
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S1_TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(S1_TB1.calc_no.eq(bind("calc_no")))
									.and(S1_TB1.ym.eq(S0_T.ym))
									.and(S1_TB1.wg_cd.eq(S0_T.wg_cd))
									.and(S1_TB1.alc_amt_key.eq(S0_T.act_alc_amt_key))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S01
	 */
	static MCQueryPlan MGBDL0240_MGT_CALC_PRE_ALC_AMT_S01() {
		MGT_CALC_PRE_ALC_AMT_R S0_T1 = MGT_CALC_PRE_ALC_AMT_R.create("T1");
		MGT_PLN_ALC_AMT_R S1_TB1 = MGT_PLN_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S01")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.alc_amt_key.eq(S1_TB1.pln_alc_amt_key))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S02
	 */
	static MCQueryPlan MGBDL0240_MGT_CALC_PRE_ALC_AMT_S02() {
		MGT_CALC_PRE_ALC_AMT_R S0_T1 = MGT_CALC_PRE_ALC_AMT_R.create("T1");
		MGT_ACT_ALC_AMT_R S1_TB1 = MGT_ACT_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							notExists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.alc_amt_key.eq(S1_TB1.act_alc_amt_key))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S03
	 */
	static MCQueryPlan MGBDL0240_MGT_CALC_PRE_ALC_AMT_S03() {
		MGT_CALC_PRE_ALC_AMT_R S0_T1 = MGT_CALC_PRE_ALC_AMT_R.create("T1");
		MGT_PLN_ALC_AMT_R S1_TB1 = MGT_PLN_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S03")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.alc_amt_key.eq(S1_TB1.pln_alc_amt_key))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S04
	 */
	static MCQueryPlan MGBDL0240_MGT_CALC_PRE_ALC_AMT_S04() {
		MGT_CALC_PRE_ALC_AMT_R S0_T1 = MGT_CALC_PRE_ALC_AMT_R.create("T1");
		MGT_ACT_ALC_AMT_R S1_TB1 = MGT_ACT_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_CALC_PRE_ALC_AMT_Query_S04")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.alc_amt_key.eq(S1_TB1.act_alc_amt_key))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PLN_ALC_AMT_Query_I01
	 */
	static MCQueryPlan MGBDL0240_MGT_PLN_ALC_AMT_I01() {
		MGT_PLN_ALC_AMT_R S0 = MGT_PLN_ALC_AMT_R.create();
		MGT_PRE_ALC_R S1_T = MGT_PRE_ALC_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PLN_ALC_AMT_Query_I01")
					.insert(S0)
					.columns(
						S0.pln_alc_amt_key,
						S0.calc_ctg_cd,
						S0.alc_rec_typ,
						S0.wg_cd,
						S0.ym,
						S0.alc_ac_cd,
						S0.dpt_cd,
						S0.loc_cd,
						S0.oper_cd,
						S0.bp_cd,
						S0.ctg_cd,
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
						S0.amt,
						S0.trd_wg_cd,
						S0.trd_calc_grp_cd,
						S0.trd_calc_no,
						S0.pre_alc_fin_flg
					)
					.query(
						subQuery()
						.select(
							MAPA_NUM$F_GET_SEQ(value(MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.value())),
							bind("calc_ctg_cd"),
							decode(
								S1_T.wg_cd,
								S1_T.src_wg_cd,
								value(MGC_ALC_REC_TYP.MY_WG.value()),
								value(MGC_ALC_REC_TYP.OTHER_WG.value())
							),
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.alc_ac_cd,
							S1_T.dpt_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.bp_cd,
							S1_T.ctg_cd,
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
							S1_T.amt,
							S1_T.src_wg_cd,
							S1_T.calc_grp_cd,
							S1_T.calc_no,
							value(false)
						)
						.from(S1_T)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.and(S1_T.calc_no.eq(bind("calc_no")))
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PLN_ALC_AMT_Query_U01
	 */
	static MCQueryPlan MGBDL0240_MGT_PLN_ALC_AMT_U01() {
		MGT_PLN_ALC_AMT_R S0_T = MGT_PLN_ALC_AMT_R.create("T");
		MGT_CALC_PRE_ALC_AMT_R S1_TB1 = MGT_CALC_PRE_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PLN_ALC_AMT_Query_U01")
					.update(S0_T)
					.set(S0_T.pre_alc_fin_flg).eq(bind("pre_alc_fin_flg"))
					.where(
						value(0).eq(value(0))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S1_TB1.calc_grp_cd.eq(bind("calc_grp_cd")))
									.and(S1_TB1.calc_no.eq(bind("calc_no")))
									.and(S1_TB1.ym.eq(S0_T.ym))
									.and(S1_TB1.wg_cd.eq(S0_T.wg_cd))
									.and(S1_TB1.alc_amt_key.eq(S0_T.pln_alc_amt_key))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PRE_ALC_Query_S01
	 */
	static MCQueryPlan MGBDL0240_MGT_PRE_ALC_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_PRE_ALC_R S1_T = MGT_PRE_ALC_R.create("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ALC_AC_R S1_ALC_AC = MAM_ALC_AC_R.create("ALC_AC");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP1 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP1");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP2 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP2");
		MAM_ALC_AC_GRP_R S1_ALC_AC_GRP3 = MAM_ALC_AC_GRP_R.create("ALC_AC_GRP3");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
		MAM_LOC_R S1_LOC = MAM_LOC_R.create("LOC");
		MAM_OPER_R S1_OPER = MAM_OPER_R.create("OPER");
		MAM_BP_GRP_R S1_BP_GRP1 = MAM_BP_GRP_R.create("BP_GRP1");
		MAM_BP_GRP_R S1_BP_GRP2 = MAM_BP_GRP_R.create("BP_GRP2");
		MAM_BP_GRP_R S1_BP_GRP3 = MAM_BP_GRP_R.create("BP_GRP3");
		MAM_BP_GRP_R S1_BP_GRP4 = MAM_BP_GRP_R.create("BP_GRP4");
		MAM_BP_GRP_R S1_BP_GRP5 = MAM_BP_GRP_R.create("BP_GRP5");
		MAM_BP_GRP_R S1_BP_GRP6 = MAM_BP_GRP_R.create("BP_GRP6");
		MAM_BP_GRP_R S1_BP_GRP7 = MAM_BP_GRP_R.create("BP_GRP7");
		MAM_BP_GRP_R S1_BP_GRP8 = MAM_BP_GRP_R.create("BP_GRP8");
		MAM_BP_GRP_R S1_BP_GRP9 = MAM_BP_GRP_R.create("BP_GRP9");
		MAM_BP_GRP_R S1_BP_GRP10 = MAM_BP_GRP_R.create("BP_GRP10");
		MAM_COST_CTG_R S1_CTG = MAM_COST_CTG_R.create("CTG");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
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
		MAM_WG_R S1_SRC_WG = MAM_WG_R.create("SRC_WG");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PRE_ALC_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_T.ym,
							S1_T.alc_ac_cd,
							S1_T.dpt_cd,
							S1_T.loc_cd,
							S1_T.oper_cd,
							S1_T.bp_cd,
							S1_T.ctg_cd,
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
							S1_T.itm_mfg_inst_no,
							S1_T.iv_no,
							S1_T.po_no,
							S1_T.slo_no,
							S1_T.src_wg_cd,
							S1_T.amt,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_DAC).on(S1_T.wg_cd.eq(S1_DAC.wg_cd))
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
							.leftOuterJoin(S1_ALC_AC).on(S1_T.alc_ac_cd.eq(S1_ALC_AC.alc_ac_cd))
							.leftOuterJoin(S1_ALC_AC_GRP1).on(
								value(MAC_ALC_AC_GRP_TYP.GRP1.value()).eq(S1_ALC_AC_GRP1.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd1.eq(S1_ALC_AC_GRP1.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP2).on(
								value(MAC_ALC_AC_GRP_TYP.GRP2.value()).eq(S1_ALC_AC_GRP2.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd2.eq(S1_ALC_AC_GRP2.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_ALC_AC_GRP3).on(
								value(MAC_ALC_AC_GRP_TYP.GRP3.value()).eq(S1_ALC_AC_GRP3.alc_ac_grp_typ)
								.and(S1_ALC_AC.alc_ac_grp_cd3.eq(S1_ALC_AC_GRP3.alc_ac_grp_cd))
							)
							.leftOuterJoin(S1_BP).on(S1_T.bp_cd.eq(S1_BP.bp_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.ym.gte(bind("ym_fr")))
							.cutoff$and(S1_T.ym.lte(bind("ym_to")))
							.cutoff$and(S1_T.alc_ac_cd.like(bind("alc_ac_cd")))
							.cutoff$and(S1_ALC_AC.alc_ac_nm.like(bind("alc_ac_nm")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd1.like(bind("alc_ac_grp_cd1")))
							.cutoff$and(S1_ALC_AC_GRP1.alc_ac_grp_nm.like(bind("alc_ac_grp_nm1")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd2.like(bind("alc_ac_grp_cd2")))
							.cutoff$and(S1_ALC_AC_GRP2.alc_ac_grp_nm.like(bind("alc_ac_grp_nm2")))
							.cutoff$and(S1_ALC_AC.alc_ac_grp_cd3.like(bind("alc_ac_grp_cd3")))
							.cutoff$and(S1_ALC_AC_GRP3.alc_ac_grp_nm.like(bind("alc_ac_grp_nm3")))
							.cutoff$and(S1_T.dpt_cd.like(bind("dpt_cd")))
							.cutoff$and(S1_T.loc_cd.like(bind("loc_cd")))
							.cutoff$and(S1_T.oper_cd.like(bind("oper_cd")))
							.cutoff$and(S1_T.bp_cd.like(bind("bp_cd")))
							.cutoff$and(S1_T.ctg_cd.like(bind("ctg_cd")))
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
							.cutoff$and(S1_T.itm_mfg_inst_no.like(bind("itm_mfg_inst_no")))
							.cutoff$and(S1_T.iv_no.like(bind("iv_no")))
							.cutoff$and(S1_T.po_no.like(bind("po_no")))
							.cutoff$and(S1_T.slo_no.like(bind("slo_no")))
							.cutoff$and(S1_T.src_wg_cd.like(bind("src_wg_cd")))
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
							.cutoff$and(S1_BP.bp_grp_cd1.like(bind("bp_grp_cd1")))
							.cutoff$and(S1_BP.bp_grp_cd2.like(bind("bp_grp_cd2")))
							.cutoff$and(S1_BP.bp_grp_cd3.like(bind("bp_grp_cd3")))
							.cutoff$and(S1_BP.bp_grp_cd4.like(bind("bp_grp_cd4")))
							.cutoff$and(S1_BP.bp_grp_cd5.like(bind("bp_grp_cd5")))
							.cutoff$and(S1_BP.bp_grp_cd6.like(bind("bp_grp_cd6")))
							.cutoff$and(S1_BP.bp_grp_cd7.like(bind("bp_grp_cd7")))
							.cutoff$and(S1_BP.bp_grp_cd8.like(bind("bp_grp_cd8")))
							.cutoff$and(S1_BP.bp_grp_cd9.like(bind("bp_grp_cd9")))
							.cutoff$and(S1_BP.bp_grp_cd10.like(bind("bp_grp_cd10")))
							.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))
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
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.wg_cd)),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_nm"))
					.groupBy(DS0D, S0_T.pr("wg_nm")),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("alc_ac_flg"))
					.select(DS0D, S0_T.pr(S1_T.alc_ac_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.alc_ac_cd)),
				when(boundOr("alc_ac_flg"))
					.select(DS0D, S0_T.pr("alc_ac_nm"))
					.groupBy(DS0D, S0_T.pr("alc_ac_nm")),
				when(boundOr("alc_ac_grp_flg1"))
					.select(DS0D, S0_T.pr("alc_ac_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_cd1")),
				when(boundOr("alc_ac_grp_flg1"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm1")),
				when(boundOr("alc_ac_grp_flg2"))
					.select(DS0D, S0_T.pr("alc_ac_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_cd2")),
				when(boundOr("alc_ac_grp_flg2"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm2")),
				when(boundOr("alc_ac_grp_flg3"))
					.select(DS0D, S0_T.pr("alc_ac_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_cd3")),
				when(boundOr("alc_ac_grp_flg3"))
					.select(DS0D, S0_T.pr("alc_ac_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("alc_ac_grp_nm3")),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr(S1_T.dpt_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.dpt_cd)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr(S1_T.loc_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.loc_cd)),
				when(boundOr("loc_flg"))
					.select(DS0D, S0_T.pr("loc_nm"))
					.groupBy(DS0D, S0_T.pr("loc_nm")),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr(S1_T.oper_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.oper_cd)),
				when(boundOr("oper_flg"))
					.select(DS0D, S0_T.pr("oper_nm"))
					.groupBy(DS0D, S0_T.pr("oper_nm")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr(S1_T.bp_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.bp_cd)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_cd1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd1")),
				when(boundOr("bp_grp_flg1"))
					.select(DS0D, S0_T.pr("bp_grp_nm1"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm1")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_cd2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd2")),
				when(boundOr("bp_grp_flg2"))
					.select(DS0D, S0_T.pr("bp_grp_nm2"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm2")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_cd3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd3")),
				when(boundOr("bp_grp_flg3"))
					.select(DS0D, S0_T.pr("bp_grp_nm3"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm3")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_cd4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd4")),
				when(boundOr("bp_grp_flg4"))
					.select(DS0D, S0_T.pr("bp_grp_nm4"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm4")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_cd5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd5")),
				when(boundOr("bp_grp_flg5"))
					.select(DS0D, S0_T.pr("bp_grp_nm5"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm5")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_cd6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd6")),
				when(boundOr("bp_grp_flg6"))
					.select(DS0D, S0_T.pr("bp_grp_nm6"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm6")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_cd7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd7")),
				when(boundOr("bp_grp_flg7"))
					.select(DS0D, S0_T.pr("bp_grp_nm7"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm7")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_cd8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd8")),
				when(boundOr("bp_grp_flg8"))
					.select(DS0D, S0_T.pr("bp_grp_nm8"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm8")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_cd9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd9")),
				when(boundOr("bp_grp_flg9"))
					.select(DS0D, S0_T.pr("bp_grp_nm9"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm9")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_cd10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_cd10")),
				when(boundOr("bp_grp_flg10"))
					.select(DS0D, S0_T.pr("bp_grp_nm10"))
					.groupBy(DS0D, S0_T.pr("bp_grp_nm10")),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr(S1_T.ctg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.ctg_cd)),
				when(boundOr("ctg_flg"))
					.select(DS0D, S0_T.pr("ctg_nm"))
					.groupBy(DS0D, S0_T.pr("ctg_nm")),
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
					.select(DS0D, S0_T.pr(S1_T.lot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.lot_no)),
				when(boundOr("sublot_flg"))
					.select(DS0D, S0_T.pr(S1_T.sublot_no))
					.groupBy(DS0D, S0_T.pr(S1_T.sublot_no)),
				when(boundOr("sno1_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno1))
					.groupBy(DS0D, S0_T.pr(S1_T.sno1)),
				when(boundOr("sno2_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno2))
					.groupBy(DS0D, S0_T.pr(S1_T.sno2)),
				when(boundOr("sno3_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno3))
					.groupBy(DS0D, S0_T.pr(S1_T.sno3)),
				when(boundOr("sno4_flg"))
					.select(DS0D, S0_T.pr(S1_T.sno4))
					.groupBy(DS0D, S0_T.pr(S1_T.sno4)),
				when(boundOr("itm_mfg_inst_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_mfg_inst_no)),
				when(boundOr("iv_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.iv_no))
					.groupBy(DS0D, S0_T.pr(S1_T.iv_no)),
				when(boundOr("po_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.po_no))
					.groupBy(DS0D, S0_T.pr(S1_T.po_no)),
				when(boundOr("slo_no_flg"))
					.select(DS0D, S0_T.pr(S1_T.slo_no))
					.groupBy(DS0D, S0_T.pr(S1_T.slo_no)),
				when(boundOr("src_wg_flg"))
					.select(DS0D, S0_T.pr(S1_T.src_wg_cd))
					.groupBy(DS0D, S0_T.pr(S1_T.src_wg_cd)),
				when(boundOr("src_wg_flg"))
					.select(DS0D, S0_T.pr("src_wg_nm"))
					.groupBy(DS0D, S0_T.pr("src_wg_nm")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.amt)).as("amt")),
				when(boundOr("wg_flg"))
					.select(DS1D, S1_DAC.wg_nm.as("wg_nm"))
					.groupBy(DS1D, S1_DAC.wg_nm),
				when(boundOr("alc_ac_flg"))
					.select(DS1D, S1_ALC_AC.alc_ac_nm.as("alc_ac_nm"))
					.groupBy(DS1D, S1_ALC_AC.alc_ac_nm),
				when(boundOr("alc_ac_grp_flg1"))
					.select(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_cd.as("alc_ac_grp_cd1"))
					.groupBy(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_cd),
				when(boundOr("alc_ac_grp_flg1"))
					.select(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_nm.as("alc_ac_grp_nm1"))
					.groupBy(DS1D, S1_ALC_AC_GRP1.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp_flg2"))
					.select(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_cd.as("alc_ac_grp_cd2"))
					.groupBy(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_cd),
				when(boundOr("alc_ac_grp_flg2"))
					.select(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_nm.as("alc_ac_grp_nm2"))
					.groupBy(DS1D, S1_ALC_AC_GRP2.alc_ac_grp_nm),
				when(boundOr("alc_ac_grp_flg3"))
					.select(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_cd.as("alc_ac_grp_cd3"))
					.groupBy(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_cd),
				when(boundOr("alc_ac_grp_flg3"))
					.select(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_nm.as("alc_ac_grp_nm3"))
					.groupBy(DS1D, S1_ALC_AC_GRP3.alc_ac_grp_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("loc_flg"))
					.select(DS1D, S1_LOC.loc_nm.as("loc_nm"))
					.groupBy(DS1D, S1_LOC.loc_nm),
				when(boundOr("loc_flg", "loc_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_LOC).on(S1_T.loc_cd.eq(S1_LOC.loc_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_LOC.loc_nm.like(bind("loc_nm")))),
				when(boundOr("oper_flg"))
					.select(DS1D, S1_OPER.oper_nm.as("oper_nm"))
					.groupBy(DS1D, S1_OPER.oper_nm),
				when(boundOr("oper_flg", "oper_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_OPER).on(S1_T.oper_cd.eq(S1_OPER.oper_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_OPER.oper_nm.like(bind("oper_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP.bp_grp_cd1.as("bp_grp_cd1"))
					.groupBy(DS1D, S1_BP.bp_grp_cd1),
				when(boundOr("bp_grp_flg1"))
					.select(DS1D, S1_BP_GRP1.bp_grp_nm.as("bp_grp_nm1"))
					.groupBy(DS1D, S1_BP_GRP1.bp_grp_nm),
				when(boundOr("bp_grp_flg1", "bp_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP1).on(S1_BP.bp_grp_cd1.eq(S1_BP_GRP1.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S1_BP_GRP1.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP1.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP.bp_grp_cd2.as("bp_grp_cd2"))
					.groupBy(DS1D, S1_BP.bp_grp_cd2),
				when(boundOr("bp_grp_flg2"))
					.select(DS1D, S1_BP_GRP2.bp_grp_nm.as("bp_grp_nm2"))
					.groupBy(DS1D, S1_BP_GRP2.bp_grp_nm),
				when(boundOr("bp_grp_flg2", "bp_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP2).on(S1_BP.bp_grp_cd2.eq(S1_BP_GRP2.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S1_BP_GRP2.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP2.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP.bp_grp_cd3.as("bp_grp_cd3"))
					.groupBy(DS1D, S1_BP.bp_grp_cd3),
				when(boundOr("bp_grp_flg3"))
					.select(DS1D, S1_BP_GRP3.bp_grp_nm.as("bp_grp_nm3"))
					.groupBy(DS1D, S1_BP_GRP3.bp_grp_nm),
				when(boundOr("bp_grp_flg3", "bp_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP3).on(S1_BP.bp_grp_cd3.eq(S1_BP_GRP3.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S1_BP_GRP3.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP3.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP.bp_grp_cd4.as("bp_grp_cd4"))
					.groupBy(DS1D, S1_BP.bp_grp_cd4),
				when(boundOr("bp_grp_flg4"))
					.select(DS1D, S1_BP_GRP4.bp_grp_nm.as("bp_grp_nm4"))
					.groupBy(DS1D, S1_BP_GRP4.bp_grp_nm),
				when(boundOr("bp_grp_flg4", "bp_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP4).on(S1_BP.bp_grp_cd4.eq(S1_BP_GRP4.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S1_BP_GRP4.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP4.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP.bp_grp_cd5.as("bp_grp_cd5"))
					.groupBy(DS1D, S1_BP.bp_grp_cd5),
				when(boundOr("bp_grp_flg5"))
					.select(DS1D, S1_BP_GRP5.bp_grp_nm.as("bp_grp_nm5"))
					.groupBy(DS1D, S1_BP_GRP5.bp_grp_nm),
				when(boundOr("bp_grp_flg5", "bp_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP5).on(S1_BP.bp_grp_cd5.eq(S1_BP_GRP5.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S1_BP_GRP5.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP5.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP.bp_grp_cd6.as("bp_grp_cd6"))
					.groupBy(DS1D, S1_BP.bp_grp_cd6),
				when(boundOr("bp_grp_flg6"))
					.select(DS1D, S1_BP_GRP6.bp_grp_nm.as("bp_grp_nm6"))
					.groupBy(DS1D, S1_BP_GRP6.bp_grp_nm),
				when(boundOr("bp_grp_flg6", "bp_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP6).on(S1_BP.bp_grp_cd6.eq(S1_BP_GRP6.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S1_BP_GRP6.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP6.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP.bp_grp_cd7.as("bp_grp_cd7"))
					.groupBy(DS1D, S1_BP.bp_grp_cd7),
				when(boundOr("bp_grp_flg7"))
					.select(DS1D, S1_BP_GRP7.bp_grp_nm.as("bp_grp_nm7"))
					.groupBy(DS1D, S1_BP_GRP7.bp_grp_nm),
				when(boundOr("bp_grp_flg7", "bp_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP7).on(S1_BP.bp_grp_cd7.eq(S1_BP_GRP7.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S1_BP_GRP7.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP7.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP.bp_grp_cd8.as("bp_grp_cd8"))
					.groupBy(DS1D, S1_BP.bp_grp_cd8),
				when(boundOr("bp_grp_flg8"))
					.select(DS1D, S1_BP_GRP8.bp_grp_nm.as("bp_grp_nm8"))
					.groupBy(DS1D, S1_BP_GRP8.bp_grp_nm),
				when(boundOr("bp_grp_flg8", "bp_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP8).on(S1_BP.bp_grp_cd8.eq(S1_BP_GRP8.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S1_BP_GRP8.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP8.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP.bp_grp_cd9.as("bp_grp_cd9"))
					.groupBy(DS1D, S1_BP.bp_grp_cd9),
				when(boundOr("bp_grp_flg9"))
					.select(DS1D, S1_BP_GRP9.bp_grp_nm.as("bp_grp_nm9"))
					.groupBy(DS1D, S1_BP_GRP9.bp_grp_nm),
				when(boundOr("bp_grp_flg9", "bp_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP9).on(S1_BP.bp_grp_cd9.eq(S1_BP_GRP9.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S1_BP_GRP9.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP9.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP.bp_grp_cd10.as("bp_grp_cd10"))
					.groupBy(DS1D, S1_BP.bp_grp_cd10),
				when(boundOr("bp_grp_flg10"))
					.select(DS1D, S1_BP_GRP10.bp_grp_nm.as("bp_grp_nm10"))
					.groupBy(DS1D, S1_BP_GRP10.bp_grp_nm),
				when(boundOr("bp_grp_flg10", "bp_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP_GRP10).on(S1_BP.bp_grp_cd10.eq(S1_BP_GRP10.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S1_BP_GRP10.bp_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP_GRP10.bp_grp_nm.like(bind("bp_grp_nm10")))),
				when(boundOr("ctg_flg"))
					.select(DS1D, S1_CTG.ctg_nm.as("ctg_nm"))
					.groupBy(DS1D, S1_CTG.ctg_nm),
				when(boundOr("ctg_flg", "ctg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_CTG).on(S1_T.ctg_cd.eq(S1_CTG.ctg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_CTG.ctg_nm.like(bind("ctg_nm")))),
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
				when(boundOr("src_wg_flg"))
					.select(DS1D, S1_SRC_WG.wg_nm.as("src_wg_nm"))
					.groupBy(DS1D, S1_SRC_WG.wg_nm),
				when(boundOr("src_wg_flg", "src_wg_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_SRC_WG).on(S1_T.src_wg_cd.eq(S1_SRC_WG.wg_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_SRC_WG.wg_nm.like(bind("src_wg_nm")))),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("alc_ac_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.alc_ac_cd).asc()),
				when(boundOr("dpt_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.dpt_cd).asc())
			);
	}

	/**
	 * -- MGBDL0240_MGT_PRE_ALC_Query_S02
	 */
	static MCQueryPlan MGBDL0240_MGT_PRE_ALC_S02() {
		MGT_PRE_ALC_R S0_T1 = MGT_PRE_ALC_R.create("T1");
		MGT_PLN_ALC_AMT_R S1_TB1 = MGT_PLN_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PRE_ALC_Query_S02")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.src_wg_cd.eq(S1_TB1.trd_wg_cd))
									.and(S1_TB1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PRE_ALC_Query_S03
	 */
	static MCQueryPlan MGBDL0240_MGT_PRE_ALC_S03() {
		MGT_PRE_ALC_R S0_T1 = MGT_PRE_ALC_R.create("T1");
		MGT_ACT_ALC_AMT_R S1_TB1 = MGT_ACT_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PRE_ALC_Query_S03")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.src_wg_cd.eq(S1_TB1.trd_wg_cd))
									.and(S1_TB1.calc_ctg_cd.eq(bind("calc_ctg_cd")))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PRE_ALC_Query_S04
	 */
	static MCQueryPlan MGBDL0240_MGT_PRE_ALC_S04() {
		MGT_PRE_ALC_R S0_T1 = MGT_PRE_ALC_R.create("T1");
		MGT_PLN_ALC_AMT_R S1_TB1 = MGT_PLN_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PRE_ALC_Query_S04")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.src_wg_cd.eq(S1_TB1.trd_wg_cd))
									.and(S0_T1.calc_grp_cd.eq(S1_TB1.trd_calc_grp_cd))
									.and(S0_T1.calc_no.eq(S1_TB1.trd_calc_no))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
	
	/**
	 * -- MGBDL0240_MGT_PRE_ALC_Query_S05
	 */
	static MCQueryPlan MGBDL0240_MGT_PRE_ALC_S05() {
		MGT_PRE_ALC_R S0_T1 = MGT_PRE_ALC_R.create("T1");
		MGT_ACT_ALC_AMT_R S1_TB1 = MGT_ACT_ALC_AMT_R.create("TB1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBDL0240_MGT_PRE_ALC_Query_S05")
					.mainQuery()
					.select(countAll().as("cnt"))
					.from(S0_T1)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.calc_grp_cd.eq(bind("calc_grp_cd")))
						.and(S0_T1.calc_no.eq(bind("calc_no")))
						.and(
							exists(
								subQuery()
								.select(value("X"))
								.from(S1_TB1)
								.where(
									value(0).eq(value(0))
									.and(S0_T1.ym.eq(S1_TB1.ym))
									.and(S0_T1.wg_cd.eq(S1_TB1.wg_cd))
									.and(S0_T1.src_wg_cd.eq(S1_TB1.trd_wg_cd))
									.and(S0_T1.calc_grp_cd.eq(S1_TB1.trd_calc_grp_cd))
									.and(S0_T1.calc_no.eq(S1_TB1.trd_calc_no))
									.and(S1_TB1.pre_alc_fin_flg.eq(value(true)))
								)
							)
						)
					)
			);
	}
}