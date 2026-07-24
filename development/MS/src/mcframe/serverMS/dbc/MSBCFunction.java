package mcframe.serverMS.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;

/**
 * MSBCファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MSBCFunction extends MCFunctionFactory {
	
	/**
	 * MSPA_ORD$F_GET_VER_NO1
	 */
	public static MCStringValue MSPA_ORD$F_GET_VER_NO1(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_STRC_LOC_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_ORD.F_GET_VER_NO"},
										new String[]{"PostgreSQL", "MSPA_ORD$F_GET_VER_NO"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_STRC_LOC_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MSPA_ORD$F_GET_VER_NO2
	 */
	public static MCStringValue MSPA_ORD$F_GET_VER_NO2(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_STRC_LOC_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_ORD.F_GET_VER_NO"},
										new String[]{"PostgreSQL", "MSPA_ORD$F_GET_VER_NO"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_STRC_LOC_CD, STRING)
		);
	}
	
	/**
	 * MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT
	 */
	public static MCDateValue MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT(
		MCFMAGStringExpr I_IO_SCHD_PR_NO,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_LOT_NO,
		MCFMAGStringExpr I_SNO1,
		MCFMAGStringExpr I_SNO2,
		MCFMAGStringExpr I_SNO3,
		MCFMAGStringExpr I_SNO4,
		MCFMAGStringExpr I_LOC_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_ORD.F_GET_ALLOC_PLN_GI_SCHD_DT"},
										new String[]{"PostgreSQL", "MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_IO_SCHD_PR_NO, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_LOT_NO, STRING),
			arg(I_SNO1, STRING),
			arg(I_SNO2, STRING),
			arg(I_SNO3, STRING),
			arg(I_SNO4, STRING),
			arg(I_LOC_CD, STRING)
		);
	}
	
	/**
	 * MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT_NE
	 */
	public static MCDateValue MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT_NE(
		MCFMAGStringExpr I_IO_SCHD_PR_NO,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_LOT_NO,
		MCFMAGStringExpr I_SNO1,
		MCFMAGStringExpr I_SNO2,
		MCFMAGStringExpr I_SNO3,
		MCFMAGStringExpr I_SNO4,
		MCFMAGStringExpr I_LOC_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_ORD.F_GET_ALLOC_PLN_GI_SCHD_DT_NE"},
										new String[]{"PostgreSQL", "MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_IO_SCHD_PR_NO, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_LOT_NO, STRING),
			arg(I_SNO1, STRING),
			arg(I_SNO2, STRING),
			arg(I_SNO3, STRING),
			arg(I_SNO4, STRING),
			arg(I_LOC_CD, STRING)
		);
	}
	
	/**
	 * MSPA_LD_CALC$F_GET_ST_DT_NE
	 */
	public static MCDateValue MSPA_LD_CALC$F_GET_ST_DT_NE(
		MCFMAGDateExpr I_ST_DT,
		MCFMAGDateExpr I_END_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_AC_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_LD_CALC.F_GET_ST_DT_NE"},
										new String[]{"PostgreSQL", "MSPA_LD_CALC$F_GET_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_ST_DT, DATE),
			arg(I_END_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_AC_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MSPA_LD_CALC$F_GET_END_DT_NE
	 */
	public static MCDateValue MSPA_LD_CALC$F_GET_END_DT_NE(
		MCFMAGDateExpr I_ST_DT,
		MCFMAGDateExpr I_END_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_AC_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_LD_CALC.F_GET_END_DT_NE"},
										new String[]{"PostgreSQL", "MSPA_LD_CALC$F_GET_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_ST_DT, DATE),
			arg(I_END_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_AC_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE
	 */
	public static MCStringValue MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(
		MCFMAGStringExpr I_KEY,
		MCFMAGDateExpr I_ST_DT,
		MCFMAGDateExpr I_END_DT,
		MCFMAGDateExpr I_CAL_FR,
		MCFMAGDateExpr I_CAL_TO
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSPA_LD_CALC.F_GET_GRP_BY_KEY_NE"},
										new String[]{"PostgreSQL", "MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_KEY, STRING),
			arg(I_ST_DT, DATE),
			arg(I_END_DT, DATE),
			arg(I_CAL_FR, DATE),
			arg(I_CAL_TO, DATE)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MSPA_ORD$F_GET_VER_NO1".equalsIgnoreCase(name)) {
			return binds -> MSPA_ORD$F_GET_VER_NO1(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MSPA_ORD$F_GET_VER_NO2".equalsIgnoreCase(name)) {
			return binds -> MSPA_ORD$F_GET_VER_NO2(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT".equalsIgnoreCase(name)) {
			return binds -> MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]), bind(binds[8]), bind(binds[9]), bind(binds[10]));
		}
		if ("MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_ORD$F_GET_ALLOC_PLN_GI_SCHD_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]), bind(binds[8]), bind(binds[9]), bind(binds[10]));
		}
		if ("MSPA_LD_CALC$F_GET_ST_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_LD_CALC$F_GET_ST_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_LD_CALC$F_GET_END_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_LD_CALC$F_GET_END_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE".equalsIgnoreCase(name)) {
			return binds -> MSPA_LD_CALC$F_GET_GRP_BY_KEY_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		return null;
	}
}
