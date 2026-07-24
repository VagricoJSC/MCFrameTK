package mcframe.serverMBBE.MBBEL0090;

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
	 * -- MBBEL0090_MBC_BULK_IMP_CTL_Query_S01
	 */
	static MCQueryPlan MBBEL0090_MBC_BULK_IMP_CTL_S01() {
		MBC_BULK_IMP_CTL_R S0_T = MBC_BULK_IMP_CTL_R.create("T");
		MBC_BULK_IMP_CTG_R S0_M1 = MBC_BULK_IMP_CTG_R.create("M1");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBEL0090_MBC_BULK_IMP_CTL_Query_S01")
					.mainQuery()
					.select(
						S0_T.table_ctg,
						S0_M1.table_ctg_nm,
						S0_M1.table_ctg_seq,
						S0_T.table_id,
						S0_T.table_nm,
						S0_T.table_seq
					)
					.from(
						S0_T
						.leftOuterJoin(S0_M1).on(S0_T.table_ctg.eq(S0_M1.table_ctg))
					)
					.where(
						value(0).eq(value(0))
						.cutoff$and(S0_T.table_ctg.like(bind("table_ctg")))
						.cutoff$and(S0_M1.table_ctg_nm.like(bind("table_ctg_nm")))
						.cutoff$and(S0_T.table_id.like(bind("table_id")))
						.cutoff$and(S0_T.table_nm.like(bind("table_nm")))
						.addDynamicPredicate(REP1)
					)
					.orderBy(
						S0_M1.table_ctg_seq.asc(),
						S0_T.table_ctg.asc(),
						S0_T.table_seq.asc(),
						S0_T.table_id.asc()
					)
			);
	}
	
	/**
	 * -- MBBEL0090_MBC_BULK_IMP_CTL_Query_S02
	 */
	static MCQueryPlan MBBEL0090_MBC_BULK_IMP_CTL_S02() {
		MBW_BULK_IMP_CTL_KEY_R S0_W = MBW_BULK_IMP_CTL_KEY_R.create("W");
		MBC_BULK_IMP_CTL_R S0_T = MBC_BULK_IMP_CTL_R.create("T");
		MBC_BULK_IMP_CTG_R S0_M1 = MBC_BULK_IMP_CTG_R.create("M1");
		
		
		return createQueryPlan()
			.setQuery(
				sql("MBBEL0090_MBC_BULK_IMP_CTL_Query_S02")
					.mainQuery()
					.select(
						S0_W.table_id,
						S0_T.table_ctg,
						S0_T.db_class_path,
						S0_T.chk_ope,
						S0_T.upd_ope,
						S0_M1.table_ctg_seq,
						S0_T.table_seq
					)
					.from(
						S0_W
						.innerJoin(S0_T).on(S0_W.table_id.eq(S0_T.table_id))
						.leftOuterJoin(S0_M1).on(S0_T.table_ctg.eq(S0_M1.table_ctg))
					)
					.where(
						value(0).eq(value(0))
					)
			);
	}

	/**
	 * MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE01
	 */
	static MCDynamicSQLInfo MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE01() {
		MBC_BULK_IMP_CTL_R S0_T = MBC_BULK_IMP_CTL_R.create("T");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		return when(null)
				.predicate(REP1, p -> p.and(S0_T.table_id.notLike(value("MAM_BP_"))
						.and(S0_T.table_id.notLike(value("MAM_BP1_")))));
	}
	
	/**
	 * MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE02
	 */
	static MCDynamicSQLInfo MBBEL0090_MBC_BULK_IMP_CTL_S01_WHERE02() {
		MBC_BULK_IMP_CTL_R S0_T = MBC_BULK_IMP_CTL_R.create("T");
		MCDynamicSQLID REP1 = createDynamicSQLID("REP1");
		
		return when(null)
				.predicate(REP1, p -> p.and(substr(S0_T.table_id, value(0), value(10)).neq(value("MAM_BP_ALL"))
						.and(substr(S0_T.table_id, value(0),value(10)).neq(value("MAM_BP_CMN")))));
	}
}