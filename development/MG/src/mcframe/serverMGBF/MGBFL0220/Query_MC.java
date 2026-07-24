package mcframe.serverMGBF.MGBFL0220;

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
	 * -- MGBFL0220_MGT_ARG_Query_S01
	 */
	static MCQueryPlan MGBFL0220_MGT_ARG_S01() {
		MGT_ARG_R S0_T = MGT_ARG_R.create("T");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0220_MGT_ARG_Query_S01")
					.mainQuery()
					.select(
						min(S0_T.st_ym).as("st_ym"),
						max(S0_T.end_ym).as("end_ym")
					)
					.from(S0_T)
					.where(
						value(0).eq(value(0))
						.and(S0_T.calc_grp_cd.eq(bind("calc_grp_cd")))
						.cutoff$and(S0_T.calc_no.like(bind("calc_no")))
					)
			);
	}
	
	/**
	 * -- MGBFL0220_MGT_IO_Query_S01
	 */
	static MCQueryPlan MGBFL0220_MGT_IO_S01() {
		MCTempView S0_T = createTempView("T");
		MGT_IO_R S1_T = MGT_IO_R.create("T");
		MAVM_RD_WG_R S1_WG = MAVM_RD_WG_R.create("WG");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_COST_DPT_R S1_DPT = MAM_COST_DPT_R.create("DPT");
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
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0220_MGT_IO_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.wg_cd,
							S1_WG.wg_nm,
							S1_T.ym,
							S1_T.itm_cd,
							S1_T.itm_sub1,
							S1_T.itm_sub2,
							S1_T.itm_sub3,
							S1_T.mng_dpt_cd.as("dpt_cd"),
							S1_T.lot_no,
							S1_T.sublot_no,
							S1_T.sno1,
							S1_T.sno2,
							S1_T.sno3,
							S1_T.sno4,
							S1_T.asst_typ,
							decode(
								S1_T.ave_upri,
								value(0),
								nullValue(),
								S1_T.std_qty
							).as("std_qty"),
							decode(
								S1_T.ave_upri,
								value(0),
								nullValue(),
								S1_T.ave_upri
							).as("ave_upri"),
							S1_T.std_upri,
							decode(
								bind("st_ym"),
								nullValue(),
								S1_T.st_stk_qty,
								decode(
									nvl(
										S1_T.ym_sub,
										bind("st_ym")
									),
									bind("st_ym"),
									S1_T.st_stk_qty,
									value(0)
								)
							).as("st_stk_qty"),
							decode(
								bind("st_ym"),
								nullValue(),
								S1_T.st_stk_amt,
								decode(
									nvl(
										S1_T.ym_sub,
										bind("st_ym")
									),
									bind("st_ym"),
									S1_T.st_stk_amt,
									value(0)
								)
							).as("st_stk_amt"),
							S1_T.mfg_qty,
							S1_T.mfg_amt,
							S1_T.purc_qty,
							S1_T.purc_amt,
							S1_T.mfg_gr_qty,
							S1_T.mfg_gr_amt,
							S1_T.othr_gr_qty,
							S1_T.othr_gr_amt,
							S1_T.alc_amt,
							S1_T.inpt_qty,
							S1_T.inpt_amt,
							S1_T.plnt_gi_qty,
							S1_T.plnt_gi_amt,
							S1_T.othr_gi_qty,
							S1_T.othr_gi_amt,
							S1_T.prov_qty,
							S1_T.prov_amt,
							S1_T.sls_qty,
							S1_T.sls_amt,
							decode(
								bind("end_ym"),
								nullValue(),
								S1_T.end_stk_qty,
								decode(
									nvl(
										S1_T.ym_sub,
										bind("end_ym")
									),
									bind("end_ym"),
									S1_T.end_stk_qty,
									value(0)
								)
							).as("end_stk_qty"),
							decode(
								bind("end_ym"),
								nullValue(),
								S1_T.end_stk_amt,
								decode(
									nvl(
										S1_T.ym_sub,
										bind("end_ym")
									),
									bind("end_ym"),
									S1_T.end_stk_amt,
									value(0)
								)
							).as("end_stk_amt"),
							S1_T.diff_qty,
							S1_T.diff_amt,
							S1_T.xpns_inpt_qty,
							S1_T.xpns_inpt_amt,
							addDynamicSelect(DS1D)
						)
						.from(
							S1_T
							.innerJoin(S1_WG).on(S1_T.wg_cd.eq(S1_WG.wg_cd))
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
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.calc_grp_cd.eq(bind("calc_grp_cd")))
							.cutoff$and(S1_T.calc_no.like(bind("calc_no")))
							.cutoff$and(S1_T.wg_cd.like(bind("wg_cd")))
							.cutoff$and(S1_WG.wg_nm.like(bind("wg_nm")))
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
							.and(
								bind("asst_mng_flg").eq(value(false))
								.or(bind("asst_mng_flg").eq(value(true)))
								.and(S1_ITM.asset_mng_typ.eq(value(MAC_ASSET_MNG_TYP.MNG.value())))
							)
							.cutoff$and(S1_T.ym.eq(bind("ym")))
							.cutoff$and(S1_T.lot_no.like(bind("lot_no")))
							.cutoff$and(S1_T.sublot_no.like(bind("sublot_no")))
							.cutoff$and(S1_T.sno1.like(bind("sno1")))
							.cutoff$and(S1_T.sno2.like(bind("sno2")))
							.cutoff$and(S1_T.sno3.like(bind("sno3")))
							.cutoff$and(S1_T.sno4.like(bind("sno4")))
							.cutoff$and(S1_T.asst_typ.like(bind("asst_typ")))
							.cutoff$and(S1_T.mng_dpt_cd.like(bind("dpt_cd")))
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
					.select(DS0D, S0_T.pr(S1_WG.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_WG.wg_nm)),
				when(boundOr("ym_flg"))
					.select(DS0D, S0_T.pr(S1_T.ym))
					.groupBy(DS0D, S0_T.pr(S1_T.ym)),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_cd"))
					.groupBy(DS0D, S0_T.pr("dpt_cd")),
				when(boundOr("dpt_flg"))
					.select(DS0D, S0_T.pr("dpt_nm"))
					.groupBy(DS0D, S0_T.pr("dpt_nm")),
				when(boundOr("itm_flg"))
					.select(DS0D, S0_T.pr(S1_T.itm_sub3))
					.groupBy(DS0D, S0_T.pr(S1_T.itm_sub3)),
				when(boundOr("itm_typ_flg"))
					.select(DS0D, S0_T.pr("itm_typ"))
					.groupBy(DS0D, S0_T.pr("itm_typ")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_cd"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_cd")),
				when(boundOr("itm_jnl_flg"))
					.select(DS0D, S0_T.pr("itm_jnl_cd"))
					.groupBy(DS0D, S0_T.pr("itm_jnl_cd")),
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
					.select(DS0D, S0_T.pr("itm_nm"))
					.groupBy(DS0D, S0_T.pr("itm_nm")),
				when(boundOr("itm_typ_d_flg"))
					.select(DS0D, S0_T.pr("itm_typ_d_nm"))
					.groupBy(DS0D, S0_T.pr("itm_typ_d_nm")),
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
				when(boundOr("asst_flg"))
					.select(DS0D, S0_T.pr(S1_T.asst_typ))
					.groupBy(DS0D, S0_T.pr(S1_T.asst_typ)),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_cd"))
					.groupBy(DS0D, S0_T.pr("unit_cd")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("unit_nm"))
					.groupBy(DS0D, S0_T.pr("unit_nm")),
				when(boundOr("qty_flg"))
					.select(DS0D, S0_T.pr("dec_place"))
					.groupBy(DS0D, S0_T.pr("dec_place")),
				when(null)
					.select(DS0D, nvl(avg(S0_T.pr("std_qty")),value(0)).as("std_qty")),
				when(null)
					.select(DS0D, nvl(avg(S0_T.pr("ave_upri")),value(0)).as("ave_upri")),
				when(null)
					.select(DS0D, sum(S0_T.pr("st_stk_qty")).as("st_stk_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("st_stk_amt")).as("st_stk_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.mfg_qty)).as("mfg_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.mfg_amt)).as("mfg_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.purc_qty)).as("purc_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.purc_amt)).as("purc_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.mfg_gr_qty)).as("mfg_gr_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.mfg_gr_amt)).as("mfg_gr_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.othr_gr_qty)).as("othr_gr_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.othr_gr_amt)).as("othr_gr_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.alc_amt)).as("alc_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.inpt_qty)).as("inpt_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.inpt_amt)).as("inpt_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.plnt_gi_qty)).as("plnt_gi_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.plnt_gi_amt)).as("plnt_gi_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.othr_gi_qty)).as("othr_gi_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.othr_gi_amt)).as("othr_gi_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.prov_qty)).as("prov_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.prov_amt)).as("prov_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.sls_qty)).as("sls_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.sls_amt)).as("sls_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("end_stk_qty")).as("end_stk_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("end_stk_amt")).as("end_stk_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.diff_qty)).as("diff_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.diff_amt)).as("diff_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.xpns_inpt_qty)).as("xpns_inpt_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr(S1_T.xpns_inpt_amt)).as("xpns_inpt_amt")),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.ym.gte(S1_TERM.term).and(S1_T.ym.lt(S1_TERM.term_end_ym)))),
				when(boundOr("dpt_flg"))
					.select(DS1D, S1_DPT.dpt_nm.as("dpt_nm"))
					.groupBy(DS1D, S1_DPT.dpt_nm),
				when(boundOr("dpt_flg", "dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_DPT).on(S1_T.mng_dpt_cd.eq(S1_DPT.dpt_cd).and(S1_TERM.term.eq(S1_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_DPT.dpt_nm.like(bind("dpt_nm")))),
				when(boundOr("itm_typ_flg"))
					.select(DS1D, S1_ITM.itm_typ.as("itm_typ"))
					.groupBy(DS1D, S1_ITM.itm_typ),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM.itm_typ_d_cd.as("itm_typ_d_cd"))
					.groupBy(DS1D, S1_ITM.itm_typ_d_cd),
				when(boundOr("itm_jnl_flg"))
					.select(DS1D, S1_ITM.itm_jnl_cd.as("itm_jnl_cd"))
					.groupBy(DS1D, S1_ITM.itm_jnl_cd),
				when(boundOr("itm_flg"))
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_typ_d_flg"))
					.select(DS1D, S1_ITM_TYP_D.itm_typ_d_nm.as("itm_typ_d_nm"))
					.groupBy(DS1D, S1_ITM_TYP_D.itm_typ_d_nm),
				when(boundOr("itm_typ_d_flg", "itm_typ_d_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_TYP_D).on(S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ).and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))),
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
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.unit_cd.as("unit_cd"))
					.groupBy(DS1D, S1_ITM.unit_cd),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_UNIT.unit_nm.as("unit_nm"))
					.groupBy(DS1D, S1_UNIT.unit_nm),
				when(boundOr("qty_flg"))
					.view(DS1D, v -> v.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))),
				when(boundOr("qty_flg"))
					.select(DS1D, S1_ITM.dec_place.as("dec_place"))
					.groupBy(DS1D, S1_ITM.dec_place),
				when(boundOr("wg_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.wg_cd).asc()),
				when(boundOr("ym_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.ym).asc()),
				when(boundOr("dpt_flg"))
					.orderBy(DS0D, S0_T.pr("dpt_cd").asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub3).asc()),
				when(boundOr("itm_typ_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ").asc()),
				when(boundOr("itm_typ_d_flg"))
					.orderBy(DS0D, S0_T.pr("itm_typ_d_cd").asc()),
				when(boundOr("itm_jnl_flg"))
					.orderBy(DS0D, S0_T.pr("itm_jnl_cd").asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_cd).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub1).asc()),
				when(boundOr("itm_flg"))
					.orderBy(DS0D, S0_T.pr(S1_T.itm_sub2).asc())
			);
	}
}