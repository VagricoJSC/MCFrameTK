package mcframe.serverMA.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGTimestampExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGBooleanExpr;

/**
 * MABCファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MABCFunction extends MCFunctionFactory {
	
	/**
	 * MAPA_CALC$F_RND
	 */
	public static MCNumberValue MAPA_CALC$F_RND(
		MCFMAGNumberExpr I_NUM,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_RND_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CALC.F_RND"},
										new String[]{"PostgreSQL", "MAPA_CALC$F_RND"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_NUM, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_RND_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_CALC$F_RND_NE
	 */
	public static MCNumberValue MAPA_CALC$F_RND_NE(
		MCFMAGNumberExpr I_NUM,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_RND_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CALC.F_RND_NE"},
										new String[]{"PostgreSQL", "MAPA_CALC$F_RND_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_NUM, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_RND_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_CALC$F_CALC_PER
	 */
	public static MCNumberValue MAPA_CALC$F_CALC_PER(
		MCFMAGNumberExpr I_SCHD_NUM,
		MCFMAGNumberExpr I_ACT_NUM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CALC.F_CALC_PER"},
										new String[]{"PostgreSQL", "MAPA_CALC$F_CALC_PER"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_SCHD_NUM, NUMBER),
			arg(I_ACT_NUM, NUMBER)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_DISP_ITM
	 */
	public static MCStringValue MAPA_COMM$F_TO_DISP_ITM(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_ITM_SUB_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_DISP_ITM"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_DISP_ITM"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_ITM_SUB_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_DISP_SNO
	 */
	public static MCStringValue MAPA_COMM$F_TO_DISP_SNO(
		MCFMAGStringExpr I_SNO1,
		MCFMAGStringExpr I_SNO2,
		MCFMAGStringExpr I_SNO3,
		MCFMAGStringExpr I_SNO4,
		MCFMAGStringExpr I_SNO_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_DISP_SNO"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_DISP_SNO"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SNO1, STRING),
			arg(I_SNO2, STRING),
			arg(I_SNO3, STRING),
			arg(I_SNO4, STRING),
			arg(I_SNO_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_GET_PARM
	 */
	public static MCStringValue MAPA_COMM$F_GET_PARM(
		MCFMAGStringExpr I_PARM_KEY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_GET_PARM"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_GET_PARM"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_PARM_KEY, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_ITM_CD
	 */
	public static MCStringValue MAPA_COMM$F_TO_ITM_CD(
		MCFMAGStringExpr I_DISP_ITM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_ITM_CD"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_ITM_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DISP_ITM, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_ITM_SUB1
	 */
	public static MCStringValue MAPA_COMM$F_TO_ITM_SUB1(
		MCFMAGStringExpr I_DISP_ITM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_ITM_SUB1"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_ITM_SUB1"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DISP_ITM, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_ITM_SUB2
	 */
	public static MCStringValue MAPA_COMM$F_TO_ITM_SUB2(
		MCFMAGStringExpr I_DISP_ITM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_ITM_SUB2"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_ITM_SUB2"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DISP_ITM, STRING)
		);
	}
	
	/**
	 * MAPA_COMM$F_TO_ITM_SUB3
	 */
	public static MCStringValue MAPA_COMM$F_TO_ITM_SUB3(
		MCFMAGStringExpr I_DISP_ITM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_COMM.F_TO_ITM_SUB3"},
										new String[]{"PostgreSQL", "MAPA_COMM$F_TO_ITM_SUB3"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DISP_ITM, STRING)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_PERIOD_ST_DT_NE
	 */
	public static MCDateValue MAPA_DT$F_GET_PERIOD_ST_DT_NE(
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_PERIOD_ST_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_PERIOD_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_PERIOD_END_DT_NE
	 */
	public static MCDateValue MAPA_DT$F_GET_PERIOD_END_DT_NE(
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_PERIOD_END_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_PERIOD_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_ADD_PERIOD_ST_DT_NE
	 */
	public static MCDateValue MAPA_DT$F_ADD_PERIOD_ST_DT_NE(
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_ADD,
		MCFMAGNumberExpr I_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_ADD_PERIOD_ST_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_ADD_PERIOD_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_ADD, NUMBER),
			arg(I_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_ADD_PERIOD_END_DT_NE
	 */
	public static MCDateValue MAPA_DT$F_ADD_PERIOD_END_DT_NE(
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_ADD,
		MCFMAGNumberExpr I_CL_DAY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_ADD_PERIOD_END_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_ADD_PERIOD_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_ADD, NUMBER),
			arg(I_CL_DAY, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_ST_DT_NE1
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_ST_DT_NE1(
		MCFMAGDateExpr I_YM,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_ST_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_END_DT_NE1
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_END_DT_NE1(
		MCFMAGDateExpr I_YM,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_END_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_ST_DT_NE2
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_ST_DT_NE2(
		MCFMAGDateExpr I_YM,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_ST_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_END_DT_NE2
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_END_DT_NE2(
		MCFMAGDateExpr I_YM,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_END_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_ST_DT_NE3
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_ST_DT_NE3(
		MCFMAGDateExpr I_YM,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_POS,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_ST_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_ST_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_POS, NUMBER),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_YM_END_DT_NE3
	 */
	public static MCDateValue MAPA_DT$F_GET_YM_END_DT_NE3(
		MCFMAGDateExpr I_YM,
		MCFMAGStringExpr I_PERIOD_TYP,
		MCFMAGNumberExpr I_POS,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_YM_END_DT_NE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_YM_END_DT_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_PERIOD_TYP, STRING),
			arg(I_POS, NUMBER),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_AC_YM1
	 */
	public static MCDateValue MAPA_DT$F_GET_AC_YM1(
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_AC_YM"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_AC_YM"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_DT$F_GET_AC_YM2
	 */
	public static MCDateValue MAPA_DT$F_GET_AC_YM2(
		MCFMAGDateExpr I_DT,
		MCFMAGNumberExpr I_CL_DAY,
		MCFMAGNumberExpr I_CL_MON_BASE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_GET_AC_YM"},
										new String[]{"PostgreSQL", "MAPA_DT$F_GET_AC_YM"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE),
			arg(I_CL_DAY, NUMBER),
			arg(I_CL_MON_BASE, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_CAL_DAYS
	 */
	public static MCNumberValue MAPA_DT$F_CAL_DAYS(
		MCFMAGDateExpr I_FR_DT,
		MCFMAGDateExpr I_TO_DT,
		MCFMAGStringExpr I_CAL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_CAL_DAYS"},
										new String[]{"PostgreSQL", "MAPA_DT$F_CAL_DAYS"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_FR_DT, DATE),
			arg(I_TO_DT, DATE),
			arg(I_CAL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_DT$F_CAL_DATE_LT
	 */
	public static MCDateValue MAPA_DT$F_CAL_DATE_LT(
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGNumberExpr I_LT,
		MCFMAGBooleanExpr I_FWD_FLG,
		MCFMAGStringExpr I_CAL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_CAL_DATE_LT"},
										new String[]{"PostgreSQL", "MAPA_DT$F_CAL_DATE_LT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BASE_DT, DATE),
			arg(I_LT, NUMBER),
			arg(I_FWD_FLG, BOOLEAN),
			arg(I_CAL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_DT$F_CAL_DATE
	 */
	public static MCDateValue MAPA_DT$F_CAL_DATE(
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGNumberExpr I_LT,
		MCFMAGBooleanExpr I_FWD_FLG,
		MCFMAGStringExpr I_CAL_CD,
		MCFMAGBooleanExpr I_XFR_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_CAL_DATE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_CAL_DATE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BASE_DT, DATE),
			arg(I_LT, NUMBER),
			arg(I_FWD_FLG, BOOLEAN),
			arg(I_CAL_CD, STRING),
			arg(I_XFR_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_DT$F_CAL_DATE_LOC
	 */
	public static MCDateValue MAPA_DT$F_CAL_DATE_LOC(
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGNumberExpr I_LT,
		MCFMAGBooleanExpr I_FWD_FLG,
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGBooleanExpr I_XFR_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_CAL_DATE_LOC"},
										new String[]{"PostgreSQL", "MAPA_DT$F_CAL_DATE_LOC"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BASE_DT, DATE),
			arg(I_LT, NUMBER),
			arg(I_FWD_FLG, BOOLEAN),
			arg(I_LOC_CD, STRING),
			arg(I_XFR_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_DT$F_CAL_DATE_MOVE
	 */
	public static MCDateValue MAPA_DT$F_CAL_DATE_MOVE(
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGNumberExpr I_LT,
		MCFMAGBooleanExpr I_FWD_FLG,
		MCFMAGStringExpr I_F_CAL_CD,
		MCFMAGStringExpr I_F_LOC_CD,
		MCFMAGStringExpr I_T_CAL_CD,
		MCFMAGStringExpr I_T_LOC_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_CAL_DATE_MOVE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_CAL_DATE_MOVE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_BASE_DT, DATE),
			arg(I_LT, NUMBER),
			arg(I_FWD_FLG, BOOLEAN),
			arg(I_F_CAL_CD, STRING),
			arg(I_F_LOC_CD, STRING),
			arg(I_T_CAL_CD, STRING),
			arg(I_T_LOC_CD, STRING)
		);
	}
	
	/**
	 * MAPA_DT$F_TO_YM
	 */
	public static MCDateValue MAPA_DT$F_TO_YM(
		MCFMAGDateExpr I_DATE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_TO_YM"},
										new String[]{"PostgreSQL", "MAPA_DT$F_TO_YM"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DATE, DATE)
		);
	}
	
	/**
	 * MAPA_DT$F_TO_DATE
	 */
	public static MCDateValue MAPA_DT$F_TO_DATE(
		MCFMAGDateExpr I_YM,
		MCFMAGNumberExpr I_DAYS
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_TO_DATE"},
										new String[]{"PostgreSQL", "MAPA_DT$F_TO_DATE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_YM, DATE),
			arg(I_DAYS, NUMBER)
		);
	}
	
	/**
	 * MAPA_DT$F_IS_WRKDAY
	 */
	public static MCBooleanValue MAPA_DT$F_IS_WRKDAY(
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_CAL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_IS_WRKDAY"},
										new String[]{"PostgreSQL", "MAPA_DT$F_IS_WRKDAY"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_DT, DATE),
			arg(I_CAL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_DT$F_IS_BEFORE_AFTER
	 */
	public static MCBooleanValue MAPA_DT$F_IS_BEFORE_AFTER(
		MCFMAGDateExpr I_DT1,
		MCFMAGDateExpr I_DT2
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DT.F_IS_BEFORE_AFTER"},
										new String[]{"PostgreSQL", "MAPA_DT$F_IS_BEFORE_AFTER"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_DT1, DATE),
			arg(I_DT2, DATE)
		);
	}
	
	/**
	 * MAPA_STD_COST$F_GET_STD_UPRI
	 */
	public static MCNumberValue MAPA_STD_COST$F_GET_STD_UPRI(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_STD_UPRI_SEL_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_STD_COST.F_GET_STD_UPRI"},
										new String[]{"PostgreSQL", "MAPA_STD_COST$F_GET_STD_UPRI"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_DT, DATE),
			arg(I_WG_CD, STRING),
			arg(I_STD_UPRI_SEL_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_STD_COST$F_GET_STD_AMT
	 */
	public static MCNumberValue MAPA_STD_COST$F_GET_STD_AMT(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_DT,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGNumberExpr I_QTY,
		MCFMAGStringExpr I_STD_UPRI_SEL_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_STD_COST.F_GET_STD_AMT"},
										new String[]{"PostgreSQL", "MAPA_STD_COST$F_GET_STD_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_DT, DATE),
			arg(I_WG_CD, STRING),
			arg(I_QTY, NUMBER),
			arg(I_STD_UPRI_SEL_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_DPT$F_GET_DPT_CD_NE
	 */
	public static MCStringValue MAPA_DPT$F_GET_DPT_CD_NE(
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DPT.F_GET_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_DPT$F_GET_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DPT_CD, STRING),
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_DPT$F_GET_DPT_CD
	 */
	public static MCStringValue MAPA_DPT$F_GET_DPT_CD(
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DPT.F_GET_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_DPT$F_GET_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DPT_CD, STRING),
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_DPT$F_CHECK_DPT_CD
	 */
	public static MCStringValue MAPA_DPT$F_CHECK_DPT_CD(
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_DPT.F_CHECK_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_DPT$F_CHECK_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DPT_CD, STRING),
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_SLS_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_SLS_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_SLS_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_SLS_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_PURC_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_PURC_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_PURC_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_PURC_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_PROV_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_PROV_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_PROV_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_PROV_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_WTAX_RATE
	 */
	public static MCNumberValue MAPA_TAX$F_GET_WTAX_RATE(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_WTAX_RATE"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_WTAX_RATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_SLS_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_NEW_SLS_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_SLS_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_SLS_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_SLS_TAX_DT
	 */
	public static MCDateValue MAPA_TAX$F_GET_NEW_SLS_TAX_DT(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_SLS_TAX_DT"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_SLS_TAX_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_PURC_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_NEW_PURC_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_PURC_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_PURC_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_PURC_TAX_DT
	 */
	public static MCDateValue MAPA_TAX$F_GET_NEW_PURC_TAX_DT(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_PURC_TAX_DT"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_PURC_TAX_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_PROV_TAX_CD
	 */
	public static MCStringValue MAPA_TAX$F_GET_NEW_PROV_TAX_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_PROV_TAX_CD"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_PROV_TAX_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TAX$F_GET_NEW_PROV_TAX_DT
	 */
	public static MCDateValue MAPA_TAX$F_GET_NEW_PROV_TAX_DT(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TAX.F_GET_NEW_PROV_TAX_DT"},
										new String[]{"PostgreSQL", "MAPA_TAX$F_GET_NEW_PROV_TAX_DT"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_BASE_CUR_CD
	 */
	public static MCStringValue MAPA_XCHNG$F_GET_BASE_CUR_CD(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_BASE_CUR_CD"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_BASE_CUR_CD"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_PTAX_CUR_CD
	 */
	public static MCStringValue MAPA_XCHNG$F_GET_PTAX_CUR_CD(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_PTAX_CUR_CD"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_PTAX_CUR_CD"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_XRATE_NE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_XRATE_NE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGStringExpr I_BASE_CUR_CD,
		MCFMAGStringExpr I_XRATE_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_XRATE_NE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_XRATE_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_CUR_CD, STRING),
			arg(I_XRATE_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_XRATE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_XRATE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGStringExpr I_BASE_CUR_CD,
		MCFMAGStringExpr I_XRATE_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_XRATE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_XRATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_CUR_CD, STRING),
			arg(I_XRATE_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_SLS_XRATE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_SLS_XRATE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_SLS_XRATE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_SLS_XRATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_SLS_XRATE_NE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_SLS_XRATE_NE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_SLS_XRATE_NE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_SLS_XRATE_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_PURC_XRATE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_PURC_XRATE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_PURC_XRATE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_PURC_XRATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_PURC_XRATE_NE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_PURC_XRATE_NE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_PURC_XRATE_NE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_PURC_XRATE_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_PROV_XRATE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_PROV_XRATE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_PROV_XRATE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_PROV_XRATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_GET_PROV_XRATE_NE
	 */
	public static MCNumberValue MAPA_XCHNG$F_GET_PROV_XRATE_NE(
		MCFMAGStringExpr I_TRD_CUR_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_GET_PROV_XRATE_NE"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_GET_PROV_XRATE_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_TRD_CUR_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_XCHNG$F_XCHNG
	 */
	public static MCNumberValue MAPA_XCHNG$F_XCHNG(
		MCFMAGNumberExpr I_AMT,
		MCFMAGNumberExpr I_XRATE,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_XRATE_RND_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_XCHNG.F_XCHNG"},
										new String[]{"PostgreSQL", "MAPA_XCHNG$F_XCHNG"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_AMT, NUMBER),
			arg(I_XRATE, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_XRATE_RND_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_UTIL$F_GET_DEF_GD_CD
	 */
	public static MCStringValue MAPA_UTIL$F_GET_DEF_GD_CD(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_UTIL.F_GET_DEF_GD_CD"},
										new String[]{"PostgreSQL", "MAPA_UTIL$F_GET_DEF_GD_CD"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_UTIL$F_GET_DEF_TRD_CD
	 */
	public static MCStringValue MAPA_UTIL$F_GET_DEF_TRD_CD(
		MCFMAGStringExpr I_TRD_PTN_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_UTIL.F_GET_DEF_TRD_CD"},
										new String[]{"PostgreSQL", "MAPA_UTIL$F_GET_DEF_TRD_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_TRD_PTN_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_UTIL$F_GET_SLO_XPNS_PURC_RSN_CD
	 */
	public static MCStringValue MAPA_UTIL$F_GET_SLO_XPNS_PURC_RSN_CD(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_UTIL.F_GET_SLO_XPNS_PURC_RSN_CD"},
										new String[]{"PostgreSQL", "MAPA_UTIL$F_GET_SLO_XPNS_PURC_RSN_CD"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_UTIL$F_GET_FXD_LOSS_RSN_CD
	 */
	public static MCStringValue MAPA_UTIL$F_GET_FXD_LOSS_RSN_CD(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_UTIL.F_GET_FXD_LOSS_RSN_CD"},
										new String[]{"PostgreSQL", "MAPA_UTIL$F_GET_FXD_LOSS_RSN_CD"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_AMT$F_GET_EXC_TAX_AMT
	 */
	public static MCNumberValue MAPA_AMT$F_GET_EXC_TAX_AMT(
		MCFMAGNumberExpr I_UPRI,
		MCFMAGNumberExpr I_QTY,
		MCFMAGStringExpr I_AMT_RND_TYP,
		MCFMAGStringExpr I_TAX_RND_TYP,
		MCFMAGNumberExpr I_AMT_DEC_PLACE,
		MCFMAGBooleanExpr I_INC_TAX_FLG,
		MCFMAGNumberExpr I_TAX_RATE,
		MCFMAGNumberExpr I_DSCNT_AMT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_AMT.F_GET_EXC_TAX_AMT"},
										new String[]{"PostgreSQL", "MAPA_AMT$F_GET_EXC_TAX_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_UPRI, NUMBER),
			arg(I_QTY, NUMBER),
			arg(I_AMT_RND_TYP, STRING),
			arg(I_TAX_RND_TYP, STRING),
			arg(I_AMT_DEC_PLACE, NUMBER),
			arg(I_INC_TAX_FLG, BOOLEAN),
			arg(I_TAX_RATE, NUMBER),
			arg(I_DSCNT_AMT, NUMBER)
		);
	}
	
	/**
	 * MAPA_AMT$F_GET_INC_TAX_AMT
	 */
	public static MCNumberValue MAPA_AMT$F_GET_INC_TAX_AMT(
		MCFMAGNumberExpr I_UPRI,
		MCFMAGNumberExpr I_QTY,
		MCFMAGStringExpr I_AMT_RND_TYP,
		MCFMAGStringExpr I_TAX_RND_TYP,
		MCFMAGNumberExpr I_AMT_DEC_PLACE,
		MCFMAGBooleanExpr I_INC_TAX_FLG,
		MCFMAGNumberExpr I_TAX_RATE,
		MCFMAGNumberExpr I_DSCNT_AMT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_AMT.F_GET_INC_TAX_AMT"},
										new String[]{"PostgreSQL", "MAPA_AMT$F_GET_INC_TAX_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_UPRI, NUMBER),
			arg(I_QTY, NUMBER),
			arg(I_AMT_RND_TYP, STRING),
			arg(I_TAX_RND_TYP, STRING),
			arg(I_AMT_DEC_PLACE, NUMBER),
			arg(I_INC_TAX_FLG, BOOLEAN),
			arg(I_TAX_RATE, NUMBER),
			arg(I_DSCNT_AMT, NUMBER)
		);
	}
	
	/**
	 * MAPA_AMT$F_GET_PURC_EXC_TAX_AMT
	 */
	public static MCNumberValue MAPA_AMT$F_GET_PURC_EXC_TAX_AMT(
		MCFMAGNumberExpr I_UPRI,
		MCFMAGNumberExpr I_PROC_UPRI,
		MCFMAGNumberExpr I_QTY,
		MCFMAGStringExpr I_AMT_RND_TYP,
		MCFMAGStringExpr I_TAX_RND_TYP,
		MCFMAGNumberExpr I_AMT_DEC_PLACE,
		MCFMAGBooleanExpr I_INC_TAX_FLG,
		MCFMAGNumberExpr I_TAX_RATE,
		MCFMAGNumberExpr I_DSCNT_AMT,
		MCFMAGBooleanExpr I_OUTSRC_FLG,
		MCFMAGBooleanExpr I_REPURC_OBLI_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_AMT.F_GET_PURC_EXC_TAX_AMT"},
										new String[]{"PostgreSQL", "MAPA_AMT$F_GET_PURC_EXC_TAX_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_UPRI, NUMBER),
			arg(I_PROC_UPRI, NUMBER),
			arg(I_QTY, NUMBER),
			arg(I_AMT_RND_TYP, STRING),
			arg(I_TAX_RND_TYP, STRING),
			arg(I_AMT_DEC_PLACE, NUMBER),
			arg(I_INC_TAX_FLG, BOOLEAN),
			arg(I_TAX_RATE, NUMBER),
			arg(I_DSCNT_AMT, NUMBER),
			arg(I_OUTSRC_FLG, BOOLEAN),
			arg(I_REPURC_OBLI_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_AMT$F_GET_PURC_INC_TAX_AMT
	 */
	public static MCNumberValue MAPA_AMT$F_GET_PURC_INC_TAX_AMT(
		MCFMAGNumberExpr I_UPRI,
		MCFMAGNumberExpr I_PROC_UPRI,
		MCFMAGNumberExpr I_QTY,
		MCFMAGStringExpr I_AMT_RND_TYP,
		MCFMAGStringExpr I_TAX_RND_TYP,
		MCFMAGNumberExpr I_AMT_DEC_PLACE,
		MCFMAGBooleanExpr I_INC_TAX_FLG,
		MCFMAGNumberExpr I_TAX_RATE,
		MCFMAGNumberExpr I_DSCNT_AMT,
		MCFMAGBooleanExpr I_OUTSRC_FLG,
		MCFMAGBooleanExpr I_REPURC_OBLI_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_AMT.F_GET_PURC_INC_TAX_AMT"},
										new String[]{"PostgreSQL", "MAPA_AMT$F_GET_PURC_INC_TAX_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_UPRI, NUMBER),
			arg(I_PROC_UPRI, NUMBER),
			arg(I_QTY, NUMBER),
			arg(I_AMT_RND_TYP, STRING),
			arg(I_TAX_RND_TYP, STRING),
			arg(I_AMT_DEC_PLACE, NUMBER),
			arg(I_INC_TAX_FLG, BOOLEAN),
			arg(I_TAX_RATE, NUMBER),
			arg(I_DSCNT_AMT, NUMBER),
			arg(I_OUTSRC_FLG, BOOLEAN),
			arg(I_REPURC_OBLI_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_TERM$F_GET_TERM
	 */
	public static MCDateValue MAPA_TERM$F_GET_TERM(
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TERM.F_GET_TERM"},
										new String[]{"PostgreSQL", "MAPA_TERM$F_GET_TERM"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_TERM$F_GET_TERM_NE
	 */
	public static MCDateValue MAPA_TERM$F_GET_TERM_NE(
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_TERM.F_GET_TERM_NE"},
										new String[]{"PostgreSQL", "MAPA_TERM$F_GET_TERM_NE"}
									}
							  );
		return value(
			physicalName,
			DATE,
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_CONTEXT$DEL_FLG_CTL_KEY
	 */
	public static MCStringValue MAPA_CONTEXT$DEL_FLG_CTL_KEY(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.DEL_FLG_CTL_KEY"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$DEL_FLG_CTL_KEY"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_CONTEXT$F_GET_DEL_FLG_CTL
	 */
	public static MCStringValue MAPA_CONTEXT$F_GET_DEL_FLG_CTL(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.F_GET_DEL_FLG_CTL"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$F_GET_DEL_FLG_CTL"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_CONTEXT$RELEASE_FLG_CTL_KEY
	 */
	public static MCStringValue MAPA_CONTEXT$RELEASE_FLG_CTL_KEY(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.RELEASE_FLG_CTL_KEY"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$RELEASE_FLG_CTL_KEY"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL
	 */
	public static MCStringValue MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.F_GET_RELEASE_FLG_CTL"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_CONTEXT$F_ITM_UNIT
	 */
	public static MCNumberValue MAPA_CONTEXT$F_ITM_UNIT(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.F_ITM_UNIT"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$F_ITM_UNIT"}
									}
							  );
		return value(
			physicalName,
			NUMBER
		);
	}
	
	/**
	 * MAPA_CONTEXT$F_ITM_WG
	 */
	public static MCNumberValue MAPA_CONTEXT$F_ITM_WG(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_CONTEXT.F_ITM_WG"},
										new String[]{"PostgreSQL", "MAPA_CONTEXT$F_ITM_WG"}
									}
							  );
		return value(
			physicalName,
			NUMBER
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MAPA_CALC$F_RND".equalsIgnoreCase(name)) {
			return binds -> MAPA_CALC$F_RND(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_CALC$F_RND_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_CALC$F_RND_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_CALC$F_CALC_PER".equalsIgnoreCase(name)) {
			return binds -> MAPA_CALC$F_CALC_PER(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_COMM$F_TO_DISP_ITM".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_DISP_ITM(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_COMM$F_TO_DISP_SNO".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_DISP_SNO(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_COMM$F_GET_PARM".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_GET_PARM(bind(binds[0]));
		}
		if ("MAPA_COMM$F_TO_ITM_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_ITM_CD(bind(binds[0]));
		}
		if ("MAPA_COMM$F_TO_ITM_SUB1".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_ITM_SUB1(bind(binds[0]));
		}
		if ("MAPA_COMM$F_TO_ITM_SUB2".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_ITM_SUB2(bind(binds[0]));
		}
		if ("MAPA_COMM$F_TO_ITM_SUB3".equalsIgnoreCase(name)) {
			return binds -> MAPA_COMM$F_TO_ITM_SUB3(bind(binds[0]));
		}
		if ("MAPA_DT$F_GET_PERIOD_ST_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_PERIOD_ST_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_GET_PERIOD_END_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_PERIOD_END_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_ADD_PERIOD_ST_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_ADD_PERIOD_ST_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_DT$F_ADD_PERIOD_END_DT_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_ADD_PERIOD_END_DT_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_DT$F_GET_YM_ST_DT_NE1".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_ST_DT_NE1(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_DT$F_GET_YM_END_DT_NE1".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_END_DT_NE1(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_DT$F_GET_YM_ST_DT_NE2".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_ST_DT_NE2(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_GET_YM_END_DT_NE2".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_END_DT_NE2(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_GET_YM_ST_DT_NE3".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_ST_DT_NE3(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_DT$F_GET_YM_END_DT_NE3".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_YM_END_DT_NE3(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_DT$F_GET_AC_YM1".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_AC_YM1(bind(binds[0]));
		}
		if ("MAPA_DT$F_GET_AC_YM2".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_GET_AC_YM2(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_CAL_DAYS".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_CAL_DAYS(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_DT$F_CAL_DATE_LT".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_CAL_DATE_LT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_DT$F_CAL_DATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_CAL_DATE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_DT$F_CAL_DATE_LOC".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_CAL_DATE_LOC(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_DT$F_CAL_DATE_MOVE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_CAL_DATE_MOVE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MAPA_DT$F_TO_YM".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_TO_YM(bind(binds[0]));
		}
		if ("MAPA_DT$F_TO_DATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_TO_DATE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_DT$F_IS_WRKDAY".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_IS_WRKDAY(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_DT$F_IS_BEFORE_AFTER".equalsIgnoreCase(name)) {
			return binds -> MAPA_DT$F_IS_BEFORE_AFTER(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_STD_COST$F_GET_STD_UPRI".equalsIgnoreCase(name)) {
			return binds -> MAPA_STD_COST$F_GET_STD_UPRI(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MAPA_STD_COST$F_GET_STD_AMT".equalsIgnoreCase(name)) {
			return binds -> MAPA_STD_COST$F_GET_STD_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]));
		}
		if ("MAPA_DPT$F_GET_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_DPT$F_GET_DPT_CD_NE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_DPT$F_GET_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_DPT$F_GET_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_DPT$F_CHECK_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_DPT$F_CHECK_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_TAX$F_GET_SLS_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_SLS_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_PURC_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_PURC_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_PROV_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_PROV_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_WTAX_RATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_WTAX_RATE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_TAX$F_GET_NEW_SLS_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_SLS_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_NEW_SLS_TAX_DT".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_SLS_TAX_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_NEW_PURC_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_PURC_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_NEW_PURC_TAX_DT".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_PURC_TAX_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_NEW_PROV_TAX_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_PROV_TAX_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_TAX$F_GET_NEW_PROV_TAX_DT".equalsIgnoreCase(name)) {
			return binds -> MAPA_TAX$F_GET_NEW_PROV_TAX_DT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_XCHNG$F_GET_BASE_CUR_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_BASE_CUR_CD();
		}
		if ("MAPA_XCHNG$F_GET_PTAX_CUR_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_PTAX_CUR_CD();
		}
		if ("MAPA_XCHNG$F_GET_XRATE_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_XRATE_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_XCHNG$F_GET_XRATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_XRATE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_XCHNG$F_GET_SLS_XRATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_SLS_XRATE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_GET_SLS_XRATE_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_SLS_XRATE_NE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_GET_PURC_XRATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_PURC_XRATE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_GET_PURC_XRATE_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_PURC_XRATE_NE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_GET_PROV_XRATE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_PROV_XRATE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_GET_PROV_XRATE_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_GET_PROV_XRATE_NE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_XCHNG$F_XCHNG".equalsIgnoreCase(name)) {
			return binds -> MAPA_XCHNG$F_XCHNG(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_UTIL$F_GET_DEF_GD_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_UTIL$F_GET_DEF_GD_CD();
		}
		if ("MAPA_UTIL$F_GET_DEF_TRD_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_UTIL$F_GET_DEF_TRD_CD(bind(binds[0]));
		}
		if ("MAPA_UTIL$F_GET_SLO_XPNS_PURC_RSN_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_UTIL$F_GET_SLO_XPNS_PURC_RSN_CD();
		}
		if ("MAPA_UTIL$F_GET_FXD_LOSS_RSN_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_UTIL$F_GET_FXD_LOSS_RSN_CD();
		}
		if ("MAPA_AMT$F_GET_EXC_TAX_AMT".equalsIgnoreCase(name)) {
			return binds -> MAPA_AMT$F_GET_EXC_TAX_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]));
		}
		if ("MAPA_AMT$F_GET_INC_TAX_AMT".equalsIgnoreCase(name)) {
			return binds -> MAPA_AMT$F_GET_INC_TAX_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]));
		}
		if ("MAPA_AMT$F_GET_PURC_EXC_TAX_AMT".equalsIgnoreCase(name)) {
			return binds -> MAPA_AMT$F_GET_PURC_EXC_TAX_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]), bind(binds[8]), bind(binds[9]), bind(binds[10]));
		}
		if ("MAPA_AMT$F_GET_PURC_INC_TAX_AMT".equalsIgnoreCase(name)) {
			return binds -> MAPA_AMT$F_GET_PURC_INC_TAX_AMT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]), bind(binds[7]), bind(binds[8]), bind(binds[9]), bind(binds[10]));
		}
		if ("MAPA_TERM$F_GET_TERM".equalsIgnoreCase(name)) {
			return binds -> MAPA_TERM$F_GET_TERM(bind(binds[0]));
		}
		if ("MAPA_TERM$F_GET_TERM_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_TERM$F_GET_TERM_NE(bind(binds[0]));
		}
		if ("MAPA_CONTEXT$DEL_FLG_CTL_KEY".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$DEL_FLG_CTL_KEY();
		}
		if ("MAPA_CONTEXT$F_GET_DEL_FLG_CTL".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$F_GET_DEL_FLG_CTL();
		}
		if ("MAPA_CONTEXT$RELEASE_FLG_CTL_KEY".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$RELEASE_FLG_CTL_KEY();
		}
		if ("MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$F_GET_RELEASE_FLG_CTL();
		}
		if ("MAPA_CONTEXT$F_ITM_UNIT".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$F_ITM_UNIT();
		}
		if ("MAPA_CONTEXT$F_ITM_WG".equalsIgnoreCase(name)) {
			return binds -> MAPA_CONTEXT$F_ITM_WG();
		}
		return null;
	}
}
