package mcframe.serverMBBB.MBBBL0140;

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
import mcframe.serverCore.dbc.*;
import mcframe.serverMA.dbc.*;
import mcframe.serverMB.dbc.*;

import static mcframe.serverCore.dbc.CoreFunction.*;
import static mcframe.serverMA.dbc.MAFunction.*;
import static mcframe.serverMA.dbc.MABCFunction.*;
import static mcframe.serverMA.dbc.MABGFunction.*;
import static mcframe.serverMA.dbc.MABSFunction.*;
import static mcframe.serverMA.dbc.MAUAFunction.*;
import static mcframe.serverMB.dbc.MBBAFunction.*;
import static mcframe.serverMB.dbc.MBBBFunction.*;
import static mcframe.serverMB.dbc.MBBEFunction.*;

public class Query_MC {
	
	/**
	 * -- MBBBL0140_MBT_JOURNAL_Query_S01
	 */
	static MCQueryPlan MBBBL0140_MBT_JOURNAL_S01() {
		MBT_JOURNAL_R S0_T1 = MBT_JOURNAL_R.create("T1");
		MAM_BP_R S0_M1 = MAM_BP_R.create("M1");
		MAM_ACCOUNT_R S0_M2 = MAM_ACCOUNT_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
		MAM_CUR_R S0_M4 = MAM_CUR_R.create("M4");
		MAM_AC_DPT_R S0_M5 = MAM_AC_DPT_R.create("M5");
		MAM_SUB_ACCOUNT_R S0_M6 = MAM_SUB_ACCOUNT_R.create("M6");
		MAM_AC_TAX_R S0_M7 = MAM_AC_TAX_R.create("M7");
		MAM_BP_GRP_R S0_MM11 = MAM_BP_GRP_R.create("MM11");
		MAM_BP_GRP_R S0_MM12 = MAM_BP_GRP_R.create("MM12");
		MAM_BP_GRP_R S0_MM13 = MAM_BP_GRP_R.create("MM13");
		MAM_BP_GRP_R S0_MM14 = MAM_BP_GRP_R.create("MM14");
		MAM_BP_GRP_R S0_MM15 = MAM_BP_GRP_R.create("MM15");
		MAM_BP_GRP_R S0_MM16 = MAM_BP_GRP_R.create("MM16");
		MAM_BP_GRP_R S0_MM17 = MAM_BP_GRP_R.create("MM17");
		MAM_BP_GRP_R S0_MM18 = MAM_BP_GRP_R.create("MM18");
		MAM_BP_GRP_R S0_MM19 = MAM_BP_GRP_R.create("MM19");
		MAM_BP_GRP_R S0_MM110 = MAM_BP_GRP_R.create("MM110");
		
		MCDynamicSQLID DS0C_BP_GRP = createDynamicSQLID("DS0C_BP_GRP");
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL0140_MBT_JOURNAL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.jnl_grp_no,
						S0_T1.ac_ym,
						S0_T1.ac_if_typ,
						S0_T1.slip_cnt_id,
						S0_T1.dpt_cd,
						S0_M5.ac_dpt_nm.as("dpt_nm"),
						S0_T1.bp_typ,
						S0_T1.bp_cd,
						S0_M1.bp_nm,
						S0_T1.ac_cd,
						S0_M2.ac_nm,
						S0_M2.dc_typ,
						S0_T1.sub_ac_cd,
						S0_M6.sub_ac_nm,
						S0_T1.tax_cd,
						S0_M7.ac_tax_nm.as("tax_nm"),
						S0_T1.base_cur_cd,
						S0_M3.cur_nm.as("base_cur_nm"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.DR.value()),
								S0_T1.base_cur_amt,
								value(0)
							)
						).as("d_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.DR.value()),
								S0_T1.base_cur_tax_amt,
								value(0)
							)
						).as("d_tax_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.CR.value()),
								S0_T1.base_cur_amt,
								value(0)
							)
						).as("c_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.CR.value()),
								S0_T1.base_cur_tax_amt,
								value(0)
							)
						).as("c_tax_amt"),
						S0_T1.trd_cur_cd,
						S0_M4.cur_nm.as("trd_cur_nm"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.DR.value()),
								S0_T1.trd_cur_amt,
								value(0)
							)
						).as("d_trd_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.DR.value()),
								S0_T1.trd_cur_tax_amt,
								value(0)
							)
						).as("d_trd_tax_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.CR.value()),
								S0_T1.trd_cur_amt,
								value(0)
							)
						).as("c_trd_amt"),
						sum(
							decode(
								S0_T1.dc_typ,
								value(MAC_DC_TYP.CR.value()),
								S0_T1.trd_cur_tax_amt,
								value(0)
							)
						).as("c_trd_tax_amt")
					)
					.from(
						S0_T1
						.leftOuterJoin(S0_M1).on(
							bracket(
								S0_M1.bp_cd.eq(S0_T1.bp_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.ac_cd.eq(S0_T1.ac_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.cur_cd.eq(S0_T1.base_cur_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.cur_cd.eq(S0_T1.trd_cur_cd)
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.ac_dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M5.st_dt, S0_M5.end_dt))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.ac_cd.eq(S0_T1.ac_cd)
								.and(S0_M6.sub_ac_cd.eq(S0_T1.sub_ac_cd))
							)
						)
						.leftOuterJoin(S0_M7).on(
							bracket(
								S0_M7.ac_tax_cd.eq(S0_T1.tax_cd)
							)
						)
						.addDynamicView(DS0C_BP_GRP)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.jnl_grp_no.eq(bind("jnl_grp_no")))
						.cutoff$and(S0_T1.ac_ym.eq(bind("ac_ym")))
						.cutoff$and(S0_T1.ac_if_typ.like(bind("ac_if_typ")))
						.cutoff$and(S0_T1.slip_cnt_id.like(bind("slip_cnt_id")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T1.bp_cd.like(bind("bp_cd")))
						.cutoff$and(S0_T1.ac_cd.like(bind("ac_cd")))
						.cutoff$and(S0_M2.ac_typ.like(bind("ac_typ")))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_M5.ac_dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M1.bp_nm.like(bind("bp_nm")))
						.cutoff$and(S0_M2.ac_nm.like(bind("ac_nm")))
						.cutoff$and(S0_M7.ac_tax_nm.like(bind("tax_nm")))
						.cutoff$and(S0_T1.bp_typ.like(bind("bp_typ")))
						.addDynamicPredicate(DS0C_BP_GRP)
					)
					.groupBy(
						S0_T1.jnl_grp_no,
						S0_T1.ac_ym,
						S0_T1.ac_if_typ,
						S0_T1.slip_cnt_id,
						S0_T1.dpt_cd,
						S0_M5.ac_dpt_nm,
						S0_T1.bp_typ,
						S0_T1.bp_cd,
						S0_M1.bp_nm,
						S0_T1.ac_cd,
						S0_M2.ac_nm,
						S0_M2.dc_typ,
						S0_T1.sub_ac_cd,
						S0_M6.sub_ac_nm,
						S0_T1.tax_cd,
						S0_M7.ac_tax_nm,
						S0_T1.base_cur_cd,
						S0_M3.cur_nm,
						S0_T1.trd_cur_cd,
						S0_M4.cur_nm
					)
			)
			.setDynamicSQLInfo(
				when(boundOr("bp_grp_flg1"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM11).on(S0_M1.bp_grp_cd1.eq(S0_MM11.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP1.value()).eq(S0_MM11.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd1.like(bind("bp_grp_cd1"))).cutoff$and(S0_MM11.bp_grp_nm.like(bind("bp_grp_nm1")))),
				when(boundOr("bp_grp_flg2"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM12).on(S0_M1.bp_grp_cd2.eq(S0_MM12.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP2.value()).eq(S0_MM12.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd2.like(bind("bp_grp_cd2"))).cutoff$and(S0_MM12.bp_grp_nm.like(bind("bp_grp_nm2")))),
				when(boundOr("bp_grp_flg3"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM13).on(S0_M1.bp_grp_cd3.eq(S0_MM13.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP3.value()).eq(S0_MM13.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd3.like(bind("bp_grp_cd3"))).cutoff$and(S0_MM13.bp_grp_nm.like(bind("bp_grp_nm3")))),
				when(boundOr("bp_grp_flg4"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM14).on(S0_M1.bp_grp_cd4.eq(S0_MM14.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP4.value()).eq(S0_MM14.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd4.like(bind("bp_grp_cd4"))).cutoff$and(S0_MM14.bp_grp_nm.like(bind("bp_grp_nm4")))),
				when(boundOr("bp_grp_flg5"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM15).on(S0_M1.bp_grp_cd5.eq(S0_MM15.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP5.value()).eq(S0_MM15.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd5.like(bind("bp_grp_cd5"))).cutoff$and(S0_MM15.bp_grp_nm.like(bind("bp_grp_nm5")))),
				when(boundOr("bp_grp_flg6"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM16).on(S0_M1.bp_grp_cd6.eq(S0_MM16.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP6.value()).eq(S0_MM16.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd6.like(bind("bp_grp_cd6"))).cutoff$and(S0_MM16.bp_grp_nm.like(bind("bp_grp_nm6")))),
				when(boundOr("bp_grp_flg7"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM17).on(S0_M1.bp_grp_cd7.eq(S0_MM17.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP7.value()).eq(S0_MM17.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd7.like(bind("bp_grp_cd7"))).cutoff$and(S0_MM17.bp_grp_nm.like(bind("bp_grp_nm7")))),
				when(boundOr("bp_grp_flg8"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM18).on(S0_M1.bp_grp_cd8.eq(S0_MM18.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP8.value()).eq(S0_MM18.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd8.like(bind("bp_grp_cd8"))).cutoff$and(S0_MM18.bp_grp_nm.like(bind("bp_grp_nm8")))),
				when(boundOr("bp_grp_flg9"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM19).on(S0_M1.bp_grp_cd9.eq(S0_MM19.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP9.value()).eq(S0_MM19.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd9.like(bind("bp_grp_cd9"))).cutoff$and(S0_MM19.bp_grp_nm.like(bind("bp_grp_nm9")))),
				when(boundOr("bp_grp_flg10"))
					.view(DS0C_BP_GRP, v -> v.leftOuterJoin(S0_MM110).on(S0_M1.bp_grp_cd10.eq(S0_MM110.bp_grp_cd).and(value(MAC_BP_GRP_TYP.GRP10.value()).eq(S0_MM110.bp_grp_typ))))
					.predicate(DS0C_BP_GRP, p -> p.cutoff$and(S0_M1.bp_grp_cd10.like(bind("bp_grp_cd10"))).cutoff$and(S0_MM110.bp_grp_nm.like(bind("bp_grp_nm10"))))
			);
	}
}