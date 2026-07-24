package mcframe.serverMGBF.MGBFL0260;

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
	 * -- MGBFL0260_MAM_COST_IO_CONF_Query_S01
	 */
	static MCQueryPlan MGBFL0260_MAM_COST_IO_CONF_S01() {
		MAM_COST_IO_CONF_R S0_M1 = MAM_COST_IO_CONF_R.create("M1");
		MAM_COST_IO_COL_R S0_M2 = MAM_COST_IO_COL_R.create("M2");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0260_MAM_COST_IO_CONF_Query_S01")
					.mainQuery()
					.select(
						S0_M1.io_col_cd,
						S0_M1.io_col_nm,
						S0_M1.io_seq,
						S0_M1.io_tgt_typ,
						S0_M1.unit_flg,
						S0_M1.qty_flg,
						S0_M1.amt_flg,
						S0_M1.std_flg,
						S0_M1.diff_flg,
						S0_M1.fg_r,
						S0_M1.fg_g,
						S0_M1.fg_b,
						S0_M1.bg_r,
						S0_M1.bg_g,
						S0_M1.bg_b,
						S0_M2.ac_slip_typ,
						S0_M2.ac_rsn_cd
					)
					.from(
						S0_M1
						.leftOuterJoin(S0_M2).on(
							S0_M2.cost_io_id.eq(S0_M1.cost_io_id)
							.and(S0_M2.io_col_cd.eq(S0_M1.io_col_cd))
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_M1.cost_io_id.eq(bind("cost_io_id")))
					)
					.orderBy(
						S0_M1.io_seq.asc(),
						S0_M2.ac_slip_typ.asc(),
						S0_M2.ac_rsn_cd.asc()
					)
			);
	}
	
	/**
	 * -- MGBFL0260_MGT_COST_IO_Query_S01
	 */
	static MCQueryPlan MGBFL0260_MGT_COST_IO_S01() {
		MCTempView S0_T = createTempView("T");
		MAVM_RD_WG_R S1_DAC = MAVM_RD_WG_R.create("DAC");
		MAM_ITM_R S1_ITM = MAM_ITM_R.create("ITM");
		MAM_SUNDRY_ITM_R S1_SUNDRY_ITM = MAM_SUNDRY_ITM_R.create("SUNDRY_ITM");
		MAM_ITM_JNL_R S1_ITM_JNL = MAM_ITM_JNL_R.create("ITM_JNL");
		MAM_ITM_TYP_D_R S1_ITM_TYP_D = MAM_ITM_TYP_D_R.create("ITM_TYP_D");
		MAM_UNIT_R S1_UNIT = MAM_UNIT_R.create("UNIT");
		MAM_COST_DPT_R S1_MNG_DPT = MAM_COST_DPT_R.create("MNG_DPT");
		MAM_BP_R S1_BP = MAM_BP_R.create("BP");
		MAM_TERM_R S1_TERM = MAM_TERM_R.create("TERM");
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
		
		MCDynamicSQLID DS0D = createDynamicSQLID("DS0D");
		MCDynamicSQLID DS1D = createDynamicSQLID("DS1D");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		MCTempView S1_T = createTempView("T");
		
		return createQueryPlan()
			.setQuery(
				sql("MGBFL0260_MGT_COST_IO_Query_S01")
					.mainQuery()
					.select(addDynamicSelect(DS0D))
					.from(
						subQuery()
						.select(
							S1_T.pr("calc_grp_cd"),
							S1_T.pr("calc_no"),
							S1_T.pr("wg_cd"),
							S1_DAC.wg_nm,
							S1_T.pr("ym"),
							S1_T.pr("mng_dpt_cd"),
							S1_T.pr("itm_cd"),
							S1_T.pr("itm_sub1"),
							S1_T.pr("itm_sub2"),
							S1_T.pr("itm_sub3"),
							S1_T.pr("lot_no"),
							S1_T.pr("sublot_no"),
							S1_T.pr("sno1"),
							S1_T.pr("sno2"),
							S1_T.pr("sno3"),
							S1_T.pr("sno4"),
							S1_ITM.itm_jnl_cd,
							S1_ITM_JNL.itm_jnl_nm,
							S1_ITM.itm_typ,
							S1_ITM.itm_typ_d_cd,
							S1_ITM_TYP_D.itm_typ_d_nm,
							S1_T.pr("bp_cd"),
							S1_T.pr("asst_typ"),
							S1_ITM.unit_cd,
							S1_UNIT.unit_nm,
							S1_ITM.dec_place,
							S1_T.pr("qty01"),
							S1_T.pr("amt01"),
							S1_T.pr("std01"),
							S1_T.pr("qty02"),
							S1_T.pr("amt02"),
							S1_T.pr("std02"),
							S1_T.pr("qty03"),
							S1_T.pr("amt03"),
							S1_T.pr("std03"),
							S1_T.pr("qty04"),
							S1_T.pr("amt04"),
							S1_T.pr("std04"),
							S1_T.pr("qty05"),
							S1_T.pr("amt05"),
							S1_T.pr("std05"),
							S1_T.pr("qty06"),
							S1_T.pr("amt06"),
							S1_T.pr("std06"),
							S1_T.pr("qty07"),
							S1_T.pr("amt07"),
							S1_T.pr("std07"),
							S1_T.pr("qty08"),
							S1_T.pr("amt08"),
							S1_T.pr("std08"),
							S1_T.pr("qty09"),
							S1_T.pr("amt09"),
							S1_T.pr("std09"),
							S1_T.pr("qty10"),
							S1_T.pr("amt10"),
							S1_T.pr("std10"),
							S1_T.pr("qty11"),
							S1_T.pr("amt11"),
							S1_T.pr("std11"),
							S1_T.pr("qty12"),
							S1_T.pr("amt12"),
							S1_T.pr("std12"),
							S1_T.pr("qty13"),
							S1_T.pr("amt13"),
							S1_T.pr("std13"),
							S1_T.pr("qty14"),
							S1_T.pr("amt14"),
							S1_T.pr("std14"),
							S1_T.pr("qty15"),
							S1_T.pr("amt15"),
							S1_T.pr("std15"),
							S1_T.pr("qty16"),
							S1_T.pr("amt16"),
							S1_T.pr("std16"),
							S1_T.pr("qty17"),
							S1_T.pr("amt17"),
							S1_T.pr("std17"),
							S1_T.pr("qty18"),
							S1_T.pr("amt18"),
							S1_T.pr("std18"),
							S1_T.pr("qty19"),
							S1_T.pr("amt19"),
							S1_T.pr("std19"),
							S1_T.pr("qty20"),
							S1_T.pr("amt20"),
							S1_T.pr("std20"),
							S1_T.pr("qty21"),
							S1_T.pr("amt21"),
							S1_T.pr("std21"),
							S1_T.pr("qty22"),
							S1_T.pr("amt22"),
							S1_T.pr("std22"),
							S1_T.pr("qty23"),
							S1_T.pr("amt23"),
							S1_T.pr("std23"),
							S1_T.pr("qty24"),
							S1_T.pr("amt24"),
							S1_T.pr("std24"),
							S1_T.pr("qty25"),
							S1_T.pr("amt25"),
							S1_T.pr("std25"),
							S1_T.pr("qty26"),
							S1_T.pr("amt26"),
							S1_T.pr("std26"),
							S1_T.pr("qty27"),
							S1_T.pr("amt27"),
							S1_T.pr("std27"),
							S1_T.pr("qty28"),
							S1_T.pr("amt28"),
							S1_T.pr("std28"),
							S1_T.pr("qty29"),
							S1_T.pr("amt29"),
							S1_T.pr("std29"),
							S1_T.pr("qty30"),
							S1_T.pr("amt30"),
							S1_T.pr("std30"),
							S1_T.pr("diff_qty"),
							S1_T.pr("diff_amt"),
							S1_T.pr("diff_std"),
							S1_T.pr("ave_tgt"),
							addDynamicSelect(DS1D)
						)
						.from(
							addDynamicView(REP1)
							.innerJoin(S1_DAC).on(S1_T.pr("wg_cd").eq(S1_DAC.wg_cd))
							.leftOuterJoin(S1_ITM).on(
								S1_T.pr("itm_cd").eq(S1_ITM.itm_cd)
								.and(S1_T.pr("itm_sub1").eq(S1_ITM.itm_sub1))
								.and(S1_T.pr("itm_sub2").eq(S1_ITM.itm_sub2))
								.and(S1_T.pr("itm_sub3").eq(S1_ITM.itm_sub3))
							)
							.leftOuterJoin(S1_SUNDRY_ITM).on(
								S1_T.pr("itm_cd").eq(S1_SUNDRY_ITM.itm_cd)
								.and(S1_T.pr("itm_sub1").eq(S1_SUNDRY_ITM.itm_sub1))
								.and(S1_T.pr("itm_sub2").eq(S1_SUNDRY_ITM.itm_sub2))
								.and(S1_T.pr("itm_sub3").eq(S1_SUNDRY_ITM.itm_sub3))
								.and(S1_T.pr("sno1").eq(S1_SUNDRY_ITM.sno1))
								.and(S1_T.pr("sno2").eq(S1_SUNDRY_ITM.sno2))
								.and(S1_T.pr("sno3").eq(S1_SUNDRY_ITM.sno3))
								.and(S1_T.pr("sno4").eq(S1_SUNDRY_ITM.sno4))
							)
							.leftOuterJoin(S1_ITM_JNL).on(S1_ITM.itm_jnl_cd.eq(S1_ITM_JNL.itm_jnl_cd))
							.leftOuterJoin(S1_ITM_TYP_D).on(
								S1_ITM.itm_typ.eq(S1_ITM_TYP_D.itm_typ)
								.and(S1_ITM.itm_typ_d_cd.eq(S1_ITM_TYP_D.itm_typ_d_cd))
							)
							.leftOuterJoin(S1_UNIT).on(S1_ITM.unit_cd.eq(S1_UNIT.unit_cd))
							.addDynamicView(DS1D)
						)
						.where(
							value(0).eq(value(0))
							.and(S1_T.pr("calc_grp_cd").eq(bind("calc_grp_cd")))
							.and(S1_T.pr("calc_no").eq(bind("calc_no")))
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
							.cutoff$and(S1_ITM.itm_jnl_cd.like(bind("itm_jnl_cd")))
							.cutoff$and(S1_ITM_JNL.itm_jnl_nm.like(bind("itm_jnl_nm")))
							.cutoff$and(S1_ITM.itm_typ.like(bind("itm_typ")))
							.cutoff$and(S1_ITM.itm_typ_d_cd.like(bind("itm_typ_d_cd")))
							.cutoff$and(S1_T.pr("itm_cd").like(bind("itm_cd")))
							.cutoff$and(S1_T.pr("itm_sub1").like(bind("itm_sub1")))
							.cutoff$and(S1_T.pr("itm_sub2").like(bind("itm_sub2")))
							.cutoff$and(S1_T.pr("itm_sub3").like(bind("itm_sub3")))
							.cutoff$and(
								nvl(
									S1_SUNDRY_ITM.itm_nm,
									S1_ITM.itm_nm
								).like(bind("itm_nm"))
							)
							.cutoff$and(S1_T.pr("lot_no").like(bind("lot_no")))
							.cutoff$and(S1_T.pr("sublot_no").like(bind("sublot_no")))
							.cutoff$and(S1_T.pr("sno1").like(bind("sno1")))
							.cutoff$and(S1_T.pr("sno2").like(bind("sno2")))
							.cutoff$and(S1_T.pr("sno3").like(bind("sno3")))
							.cutoff$and(S1_T.pr("sno4").like(bind("sno4")))
							.cutoff$and(S1_ITM_TYP_D.itm_typ_d_nm.like(bind("itm_typ_d_nm")))
							.cutoff$and(S1_T.pr("mng_dpt_cd").like(bind("mng_dpt_cd")))
							.cutoff$and(S1_T.pr("ym").eq(bind("ym")))
							.cutoff$and(S1_T.pr("wg_cd").like(bind("wg_cd")))
							.cutoff$and(S1_DAC.wg_nm.like(bind("wg_nm")))
							.cutoff$and(S1_T.pr("bp_cd").like(bind("bp_cd")))
							.cutoff$and(
								bind("no_bp_flg_str").eq(value(true))
								.and(S1_T.pr("bp_cd").isNull())
							)
							.cutoff$and(S1_T.pr("asst_typ").like(bind("asst_typ")))
							.cutoff$and(
								bind("asst_cnd").eq(value(true))
								.and(
									S1_T.pr("asst_typ").in(
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
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_cd"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_cd")),
				when(boundOr("mng_dpt_flg"))
					.select(DS0D, S0_T.pr("mng_dpt_nm"))
					.groupBy(DS0D, S0_T.pr("mng_dpt_nm")),
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
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr("wg_cd"))
					.groupBy(DS0D, S0_T.pr("wg_cd")),
				when(boundOr("wg_flg"))
					.select(DS0D, S0_T.pr(S1_DAC.wg_nm))
					.groupBy(DS0D, S0_T.pr(S1_DAC.wg_nm)),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_cd"))
					.groupBy(DS0D, S0_T.pr("bp_cd")),
				when(boundOr("bp_flg"))
					.select(DS0D, S0_T.pr("bp_nm"))
					.groupBy(DS0D, S0_T.pr("bp_nm")),
				when(boundOr("asst_typ_flg"))
					.select(DS0D, S0_T.pr("asst_typ"))
					.groupBy(DS0D, S0_T.pr("asst_typ")),
				when(null)
					.select(DS0D, S0_T.pr("calc_grp_cd"))
					.groupBy(DS0D, S0_T.pr("calc_grp_cd")),
				when(null)
					.select(DS0D, S0_T.pr("calc_no"))
					.groupBy(DS0D, S0_T.pr("calc_no")),
				when(null)
					.select(DS0D, S0_T.pr("ym"))
					.groupBy(DS0D, S0_T.pr("ym")),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM_TYP_D.itm_typ_d_nm))
					.groupBy(DS0D, S0_T.pr(S1_ITM_TYP_D.itm_typ_d_nm)),
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
					.select(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM_JNL.itm_jnl_nm))
					.groupBy(DS0D, S0_T.pr(S1_ITM_JNL.itm_jnl_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.unit_cd))
					.groupBy(DS0D, S0_T.pr(S1_ITM.unit_cd)),
				when(null)
					.select(DS0D, S0_T.pr(S1_UNIT.unit_nm))
					.groupBy(DS0D, S0_T.pr(S1_UNIT.unit_nm)),
				when(null)
					.select(DS0D, S0_T.pr(S1_ITM.dec_place))
					.groupBy(DS0D, S0_T.pr(S1_ITM.dec_place)),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty01")).as("qty01")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt01")).as("amt01")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std01")).as("std01")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty02")).as("qty02")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt02")).as("amt02")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std02")).as("std02")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty03")).as("qty03")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt03")).as("amt03")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std03")).as("std03")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty04")).as("qty04")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt04")).as("amt04")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std04")).as("std04")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty05")).as("qty05")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt05")).as("amt05")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std05")).as("std05")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty06")).as("qty06")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt06")).as("amt06")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std06")).as("std06")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty07")).as("qty07")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt07")).as("amt07")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std07")).as("std07")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty08")).as("qty08")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt08")).as("amt08")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std08")).as("std08")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty09")).as("qty09")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt09")).as("amt09")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std09")).as("std09")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty10")).as("qty10")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt10")).as("amt10")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std10")).as("std10")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty11")).as("qty11")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt11")).as("amt11")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std11")).as("std11")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty12")).as("qty12")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt12")).as("amt12")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std12")).as("std12")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty13")).as("qty13")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt13")).as("amt13")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std13")).as("std13")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty14")).as("qty14")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt14")).as("amt14")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std14")).as("std14")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty15")).as("qty15")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt15")).as("amt15")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std15")).as("std15")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty16")).as("qty16")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt16")).as("amt16")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std16")).as("std16")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty17")).as("qty17")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt17")).as("amt17")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std17")).as("std17")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty18")).as("qty18")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt18")).as("amt18")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std18")).as("std18")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty19")).as("qty19")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt19")).as("amt19")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std19")).as("std19")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty20")).as("qty20")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt20")).as("amt20")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std20")).as("std20")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty21")).as("qty21")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt21")).as("amt21")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std21")).as("std21")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty22")).as("qty22")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt22")).as("amt22")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std22")).as("std22")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty23")).as("qty23")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt23")).as("amt23")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std23")).as("std23")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty24")).as("qty24")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt24")).as("amt24")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std24")).as("std24")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty25")).as("qty25")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt25")).as("amt25")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std25")).as("std25")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty26")).as("qty26")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt26")).as("amt26")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std26")).as("std26")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty27")).as("qty27")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt27")).as("amt27")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std27")).as("std27")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty28")).as("qty28")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt28")).as("amt28")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std28")).as("std28")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty29")).as("qty29")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt29")).as("amt29")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std29")).as("std29")),
				when(null)
					.select(DS0D, sum(S0_T.pr("qty30")).as("qty30")),
				when(null)
					.select(DS0D, sum(S0_T.pr("amt30")).as("amt30")),
				when(null)
					.select(DS0D, sum(S0_T.pr("std30")).as("std30")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_qty")).as("diff_qty")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_amt")).as("diff_amt")),
				when(null)
					.select(DS0D, sum(S0_T.pr("diff_std")).as("diff_std")),
				when(null)
					.select(DS0D, sum(S0_T.pr("ave_tgt")).as("ave_tgt")),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.innerJoin(S1_TERM).on(S1_T.pr("ym_sub").gte(S1_TERM.term).and(S1_T.pr("ym_sub").lt(S1_TERM.term_end_ym)))),
				when(boundOr("mng_dpt_flg"))
					.select(DS1D, S1_MNG_DPT.dpt_nm.as("mng_dpt_nm"))
					.groupBy(DS1D, S1_MNG_DPT.dpt_nm),
				when(boundOr("mng_dpt_flg", "mng_dpt_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_MNG_DPT).on(S1_T.pr("mng_dpt_cd").eq(S1_MNG_DPT.dpt_cd).and(S1_TERM.term.eq(S1_MNG_DPT.term))))
					.predicate(DS1D, p -> p.cutoff$and(S1_MNG_DPT.dpt_nm.like(bind("mng_dpt_nm")))),
				when(boundOr("bp_flg"))
					.select(DS1D, S1_BP.bp_nm.as("bp_nm"))
					.groupBy(DS1D, S1_BP.bp_nm),
				when(boundOr("bp_flg", "bp_nm"))
					.view(DS1D, v -> v.leftOuterJoin(S1_BP).on(S1_T.pr("bp_cd").eq(S1_BP.bp_cd)))
					.predicate(DS1D, p -> p.cutoff$and(S1_BP.bp_nm.like(bind("bp_nm")))),
				when(null)
					.select(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm).as("itm_nm"))
					.groupBy(DS1D, nvl(S1_SUNDRY_ITM.itm_nm,S1_ITM.itm_nm)),
				when(boundOr("itm_grp_nm1"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP1).on(S1_ITM.itm_grp_cd1.eq(S1_ITM_GRP1.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP1.value()).eq(S1_ITM_GRP1.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP1.itm_grp_nm.like(bind("itm_grp_nm1")))),
				when(boundOr("itm_grp_nm2"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP2).on(S1_ITM.itm_grp_cd2.eq(S1_ITM_GRP2.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP2.value()).eq(S1_ITM_GRP2.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP2.itm_grp_nm.like(bind("itm_grp_nm2")))),
				when(boundOr("itm_grp_nm3"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP3).on(S1_ITM.itm_grp_cd3.eq(S1_ITM_GRP3.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP3.value()).eq(S1_ITM_GRP3.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP3.itm_grp_nm.like(bind("itm_grp_nm3")))),
				when(boundOr("itm_grp_nm4"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP4).on(S1_ITM.itm_grp_cd4.eq(S1_ITM_GRP4.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP4.value()).eq(S1_ITM_GRP4.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP4.itm_grp_nm.like(bind("itm_grp_nm4")))),
				when(boundOr("itm_grp_nm5"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP5).on(S1_ITM.itm_grp_cd5.eq(S1_ITM_GRP5.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP5.value()).eq(S1_ITM_GRP5.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP5.itm_grp_nm.like(bind("itm_grp_nm5")))),
				when(boundOr("itm_grp_nm6"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP6).on(S1_ITM.itm_grp_cd6.eq(S1_ITM_GRP6.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP6.value()).eq(S1_ITM_GRP6.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP6.itm_grp_nm.like(bind("itm_grp_nm6")))),
				when(boundOr("itm_grp_nm7"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP7).on(S1_ITM.itm_grp_cd7.eq(S1_ITM_GRP7.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP7.value()).eq(S1_ITM_GRP7.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP7.itm_grp_nm.like(bind("itm_grp_nm7")))),
				when(boundOr("itm_grp_nm8"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP8).on(S1_ITM.itm_grp_cd8.eq(S1_ITM_GRP8.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP8.value()).eq(S1_ITM_GRP8.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP8.itm_grp_nm.like(bind("itm_grp_nm8")))),
				when(boundOr("itm_grp_nm9"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP9).on(S1_ITM.itm_grp_cd9.eq(S1_ITM_GRP9.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP9.value()).eq(S1_ITM_GRP9.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP9.itm_grp_nm.like(bind("itm_grp_nm9")))),
				when(boundOr("itm_grp_nm10"))
					.view(DS1D, v -> v.leftOuterJoin(S1_ITM_GRP10).on(S1_ITM.itm_grp_cd10.eq(S1_ITM_GRP10.itm_grp_cd).and(value(MAC_ITM_GRP_TYP.GRP10.value()).eq(S1_ITM_GRP10.itm_grp_typ))))
					.predicate(DS1D, p -> p.cutoff$and(S1_ITM_GRP10.itm_grp_nm.like(bind("itm_grp_nm10")))),
				when(boundOr("mng_dpt_flg"))
					.orderBy(DS0D, S0_T.pr("mng_dpt_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("ym").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_typ).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_typ_d_cd).asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_cd").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub1").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub2").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr("itm_sub3").asc()),
				when(null)
					.orderBy(DS0D, S0_T.pr(S1_ITM.itm_jnl_cd).asc())
			);
	}
}