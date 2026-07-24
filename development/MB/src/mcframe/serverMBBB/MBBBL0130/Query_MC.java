package mcframe.serverMBBB.MBBBL0130;

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
	 * -- MBBBL0130_MBT_JOURNAL_Query_S01
	 */
	static MCQueryPlan MBBBL0130_MBT_JOURNAL_S01() {
		MBT_JOURNAL_R S0_T1 = MBT_JOURNAL_R.create("T1");
		MAM_ACCOUNT_R S0_M1 = MAM_ACCOUNT_R.create("M1");
		MAM_CUR_R S0_M2 = MAM_CUR_R.create("M2");
		MAM_CUR_R S0_M3 = MAM_CUR_R.create("M3");
		MAM_AC_DPT_R S0_M4 = MAM_AC_DPT_R.create("M4");
		MAM_SUB_ACCOUNT_R S0_M5 = MAM_SUB_ACCOUNT_R.create("M5");
		MAM_AC_TAX_R S0_M6 = MAM_AC_TAX_R.create("M6");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBBL0130_MBT_JOURNAL_Query_S01")
					.mainQuery()
					.select(
						S0_T1.jnl_grp_no,
						S0_T1.ac_ym,
						S0_T1.ac_if_typ,
						S0_T1.slip_cnt_id,
						S0_T1.dpt_cd,
						S0_M4.ac_dpt_nm.as("dpt_nm"),
						S0_T1.ac_cd,
						S0_M1.ac_nm,
						S0_M1.dc_typ,
						S0_T1.sub_ac_cd,
						S0_M5.sub_ac_nm,
						S0_T1.tax_cd,
						S0_M6.ac_tax_nm.as("tax_nm"),
						S0_T1.base_cur_cd,
						S0_M2.cur_nm.as("base_cur_nm"),
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
						S0_M3.cur_nm.as("trd_cur_nm"),
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
								S0_M1.ac_cd.eq(S0_T1.ac_cd)
							)
						)
						.leftOuterJoin(S0_M2).on(
							bracket(
								S0_M2.cur_cd.eq(S0_T1.base_cur_cd)
							)
						)
						.leftOuterJoin(S0_M3).on(
							bracket(
								S0_M3.cur_cd.eq(S0_T1.trd_cur_cd)
							)
						)
						.leftOuterJoin(S0_M4).on(
							bracket(
								S0_M4.ac_dpt_cd.eq(S0_T1.dpt_cd)
								.and(S0_T1.ac_dt.between(S0_M4.st_dt, S0_M4.end_dt))
							)
						)
						.leftOuterJoin(S0_M5).on(
							bracket(
								S0_M5.ac_cd.eq(S0_T1.ac_cd)
								.and(S0_M5.sub_ac_cd.eq(S0_T1.sub_ac_cd))
							)
						)
						.leftOuterJoin(S0_M6).on(
							bracket(
								S0_M6.ac_tax_cd.eq(S0_T1.tax_cd)
							)
						)
					)
					.where(
						value(0).eq(value(0))
						.and(S0_T1.jnl_grp_no.eq(bind("jnl_grp_no")))
						.cutoff$and(S0_T1.ac_ym.eq(bind("ac_ym")))
						.cutoff$and(S0_T1.ac_if_typ.like(bind("ac_if_typ")))
						.cutoff$and(S0_T1.slip_cnt_id.like(bind("slip_cnt_id")))
						.cutoff$and(S0_T1.dpt_cd.like(bind("dpt_cd")))
						.cutoff$and(S0_T1.ac_cd.like(bind("ac_cd")))
						.cutoff$and(S0_M1.ac_typ.like(bind("ac_typ")))
						.cutoff$and(S0_T1.tax_cd.like(bind("tax_cd")))
						.cutoff$and(S0_M4.ac_dpt_nm.like(bind("dpt_nm")))
						.cutoff$and(S0_M1.ac_nm.like(bind("ac_nm")))
						.cutoff$and(S0_M6.ac_tax_nm.like(bind("tax_nm")))
					)
					.groupBy(
						S0_T1.jnl_grp_no,
						S0_T1.ac_ym,
						S0_T1.ac_if_typ,
						S0_T1.slip_cnt_id,
						S0_T1.dpt_cd,
						S0_M4.ac_dpt_nm,
						S0_T1.ac_cd,
						S0_M1.ac_nm,
						S0_M1.dc_typ,
						S0_T1.sub_ac_cd,
						S0_M5.sub_ac_nm,
						S0_T1.tax_cd,
						S0_M6.ac_tax_nm,
						S0_T1.base_cur_cd,
						S0_M2.cur_nm,
						S0_T1.trd_cur_cd,
						S0_M3.cur_nm
					)
			);
	}
}