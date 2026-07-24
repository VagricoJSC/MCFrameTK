package mcframe.serverMS.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGBooleanExpr;

/**
 * MSBGファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MSBGFunction extends MCFunctionFactory {
	
	/**
	 * MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO
	 */
	public static MCStringValue MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_BILL_DPT_CD,
		MCFMAGStringExpr I_IV_NO,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGStringExpr I_WRK_NO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_LAST_BILL_MNG_NO"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_DPT_CD, STRING),
			arg(I_IV_NO, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_WRK_NO, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_MAX_CL_DAY
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_MAX_CL_DAY(
		MCFMAGStringExpr I_BCST_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_MAX_CL_DAY"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_MAX_CL_DAY"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_BCST_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_SCHD_BILL_DT
	 */
	public static MCDateValue MSPA_AR_UTIL$F_GET_SCHD_BILL_DT(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BILL_BASE_DT,
		MCFMAGNumberExpr I_BILL_CRRYOVR_TIMES,
		MCFMAGBooleanExpr I_GET_NOT_BILL_DAY_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_SCHD_BILL_DT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_SCHD_BILL_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_BASE_DT, DATE),
			arg(I_BILL_CRRYOVR_TIMES, NUMBER),
			arg(I_GET_NOT_BILL_DAY_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(
		MCFMAGStringExpr I_ACST_CD,
		MCFMAGStringExpr I_IV_NO,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGStringExpr I_WRK_NO,
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGStringExpr I_AR_TYP,
		MCFMAGDateExpr I_AR_CL_YM,
		MCFMAGNumberExpr I_MON,
		MCFMAGBooleanExpr I_BEF_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_AR_NOT_APPL_BAL"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ACST_CD, STRING),
			arg(I_IV_NO, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_WRK_NO, STRING),
			arg(I_DPT_CD, STRING),
			arg(I_AR_TYP, STRING),
			arg(I_AR_CL_YM, DATE),
			arg(I_MON, NUMBER),
			arg(I_BEF_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_BILL_CL_DAY
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_BILL_CL_DAY(
		MCFMAGDateExpr I_BILL_YM,
		MCFMAGStringExpr I_BILL_CL_TYP,
		MCFMAGBooleanExpr I_BILL_EACH_SLS_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_BILL_CL_DAY"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_BILL_CL_DAY"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_BILL_YM, DATE),
			arg(I_BILL_CL_TYP, STRING),
			arg(I_BILL_EACH_SLS_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_LAST_BILL_AMT
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_BILL_DPT_CD,
		MCFMAGStringExpr I_IV_NO,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGStringExpr I_WRK_NO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_LAST_BILL_AMT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_LAST_BILL_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_DPT_CD, STRING),
			arg(I_IV_NO, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_WRK_NO, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT
	 */
	public static MCDateValue MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_BILL_DPT_CD,
		MCFMAGStringExpr I_IV_NO,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGStringExpr I_WRK_NO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_LAST_BILL_CL_DT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_DPT_CD, STRING),
			arg(I_IV_NO, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_WRK_NO, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_COMBINE_DT
	 */
	public static MCDateValue MSPA_AR_UTIL$F_COMBINE_DT(
		MCFMAGDateExpr I_BASEDATE,
		MCFMAGNumberExpr I_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_COMBINE_DT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_COMBINE_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BASEDATE, DATE),
			arg(I_DAY, NUMBER)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_BILL_CL_FLG1
	 */
	public static MCBooleanValue MSPA_AR_UTIL$F_GET_BILL_CL_FLG1(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BILL_BASIS_DT,
		MCFMAGNumberExpr I_BILL_CRRYOVR_TIMES,
		MCFMAGDateExpr I_BILL_CL_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_BILL_CL_FLG"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_BILL_CL_FLG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_BASIS_DT, DATE),
			arg(I_BILL_CRRYOVR_TIMES, NUMBER),
			arg(I_BILL_CL_DT, DATE)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_BILL_CL_FLG2
	 */
	public static MCBooleanValue MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BILL_BASIS_DT,
		MCFMAGNumberExpr I_BILL_CRRYOVR_TIMES,
		MCFMAGDateExpr I_BILL_CL_YM,
		MCFMAGNumberExpr I_BILL_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_BILL_CL_FLG"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_BILL_CL_FLG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BCST_CD, STRING),
			arg(I_BILL_BASIS_DT, DATE),
			arg(I_BILL_CRRYOVR_TIMES, NUMBER),
			arg(I_BILL_CL_YM, DATE),
			arg(I_BILL_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_RCV_SCHD_DT
	 */
	public static MCDateValue MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(
		MCFMAGStringExpr I_BILL_MNG_NO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_RCV_SCHD_DT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_RCV_SCHD_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BILL_MNG_NO, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_BCST_DPT
	 */
	public static MCStringValue MSPA_AR_UTIL$F_GET_BCST_DPT(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGStringExpr I_SLS_DPT_CD,
		MCFMAGStringExpr I_AR_DPT_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_BCST_DPT"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_BCST_DPT"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_SLS_DPT_CD, STRING),
			arg(I_AR_DPT_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_BCST_DPT_NE
	 */
	public static MCStringValue MSPA_AR_UTIL$F_GET_BCST_DPT_NE(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGStringExpr I_SLS_DPT_CD,
		MCFMAGStringExpr I_AR_DPT_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_BCST_DPT_NE"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_BCST_DPT_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_SLS_DPT_CD, STRING),
			arg(I_AR_DPT_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_MAX_RCV_DAY
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_MAX_RCV_DAY(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGNumberExpr I_AMT,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_MAX_RCV_DAY"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_MAX_RCV_DAY"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_BCST_CD, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_AMT, NUMBER),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGNumberExpr I_AMT,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_MAX_RCV_CRRYOVR_MONS"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_BCST_CD, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_AMT, NUMBER),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP
	 */
	public static MCStringValue MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGStringExpr I_CUR_CD,
		MCFMAGNumberExpr I_AMT,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_CRRYOVR_MONS_TYP"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_CUR_CD, STRING),
			arg(I_AMT, NUMBER),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO
	 */
	public static MCStringValue MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO(
		MCFMAGStringExpr I_BILL_D_NO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_ORG_BILL_D_NO"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BILL_D_NO, STRING)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_AC_YM_NE
	 */
	public static MCDateValue MSPA_AR_UTIL$F_GET_AC_YM_NE(
		MCFMAGDateExpr I_AC_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_AC_YM_NE"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_AC_YM_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_AC_DT, DATE)
		);
	}
	
	/**
	 * MSPA_AR_UTIL$F_GET_AMT_DISP_PM
	 */
	public static MCNumberValue MSPA_AR_UTIL$F_GET_AMT_DISP_PM(
		MCFMAGStringExpr I_TRD_PTN_TYP,
		MCFMAGBooleanExpr I_DSCNT_ITM_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_AR_UTIL.F_GET_AMT_DISP_PM"},
										new String[]{"PostgreSQL", "MSPA_AR_UTIL$F_GET_AMT_DISP_PM"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_PTN_TYP, STRING),
			arg(I_DSCNT_ITM_FLG, BOOLEAN)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_LAST_BILL_MNG_NO(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MSPA_AR_UTIL$F_GET_MAX_CL_DAY".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_MAX_CL_DAY(bind(binds[0]));
		}
		if ("MSPA_AR_UTIL$F_GET_SCHD_BILL_DT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_SCHD_BILL_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_AR_NOT_APPL_BAL(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]), bind(binds[8]));
		}
		if ("MSPA_AR_UTIL$F_GET_BILL_CL_DAY".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_BILL_CL_DAY(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MSPA_AR_UTIL$F_GET_LAST_BILL_AMT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_LAST_BILL_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_LAST_BILL_CL_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MSPA_AR_UTIL$F_COMBINE_DT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_COMBINE_DT(bind(binds[0]), bind(binds[1]));
		}
		if ("MSPA_AR_UTIL$F_GET_BILL_CL_FLG1".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_BILL_CL_FLG1(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_BILL_CL_FLG2".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_BILL_CL_FLG2(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MSPA_AR_UTIL$F_GET_RCV_SCHD_DT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_RCV_SCHD_DT(bind(binds[0]));
		}
		if ("MSPA_AR_UTIL$F_GET_BCST_DPT".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_BCST_DPT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_BCST_DPT_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_BCST_DPT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_MAX_RCV_DAY".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_MAX_RCV_DAY(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_MAX_RCV_CRRYOVR_MONS(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_CRRYOVR_MONS_TYP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_ORG_BILL_D_NO(bind(binds[0]));
		}
		if ("MSPA_AR_UTIL$F_GET_AC_YM_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_AC_YM_NE(bind(binds[0]));
		}
		if ("MSPA_AR_UTIL$F_GET_AMT_DISP_PM".equalsIgnoreCase(name)) {
			return binds -> MSPA_AR_UTIL$F_GET_AMT_DISP_PM(bind(binds[0]), bind(binds[1]));
		}
		return null;
	}
}
