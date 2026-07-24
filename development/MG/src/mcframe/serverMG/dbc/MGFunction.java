package mcframe.serverMG.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGBooleanExpr;

/**
 * MGファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MGFunction extends MCFunctionFactory {
	
	/**
	 * MGPA_CO_PARM$F_GET_CALC_CTG_CD
	 */
	public static MCStringValue MGPA_CO_PARM$F_GET_CALC_CTG_CD(
		MCFMAGStringExpr I_CALC_CTG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_CO_PARM.F_GET_CALC_CTG_CD"},
										new String[]{"PostgreSQL", "MGPA_CO_PARM$F_GET_CALC_CTG_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_CALC_CTG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_UNIT$F_GET_CONV_QTY
	 */
	public static MCNumberValue MGPA_UNIT$F_GET_CONV_QTY(
		MCFMAGNumberExpr I_QTY,
		MCFMAGNumberExpr I_CONV_BASE_QTY,
		MCFMAGNumberExpr I_CONV_QTY,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_RND_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_UNIT.F_GET_CONV_QTY"},
										new String[]{"PostgreSQL", "MGPA_UNIT$F_GET_CONV_QTY"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_QTY, NUMBER),
			arg(I_CONV_BASE_QTY, NUMBER),
			arg(I_CONV_QTY, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_RND_TYP, STRING)
		);
	}
	
	/**
	 * MGPA_UNIT$F_GET_CONV_QTY_NE
	 */
	public static MCNumberValue MGPA_UNIT$F_GET_CONV_QTY_NE(
		MCFMAGNumberExpr I_QTY,
		MCFMAGNumberExpr I_CONV_BASE_QTY,
		MCFMAGNumberExpr I_CONV_QTY,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_RND_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_UNIT.F_GET_CONV_QTY_NE"},
										new String[]{"PostgreSQL", "MGPA_UNIT$F_GET_CONV_QTY_NE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_QTY, NUMBER),
			arg(I_CONV_BASE_QTY, NUMBER),
			arg(I_CONV_QTY, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_RND_TYP, STRING)
		);
	}
	
	/**
	 * MGPA_XCHNG$F_XCHNG
	 */
	public static MCNumberValue MGPA_XCHNG$F_XCHNG(
		MCFMAGStringExpr I_FR_CUR_CD,
		MCFMAGStringExpr I_TO_CUR_CD,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_XRATE_RND_TYP,
		MCFMAGNumberExpr I_AMT,
		MCFMAGStringExpr I_TGT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_XCHNG.F_XCHNG"},
										new String[]{"PostgreSQL", "MGPA_XCHNG$F_XCHNG"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_FR_CUR_CD, STRING),
			arg(I_TO_CUR_CD, STRING),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_XRATE_RND_TYP, STRING),
			arg(I_AMT, NUMBER),
			arg(I_TGT, STRING)
		);
	}
	
	/**
	 * MGPA_XCHNG$F_XCHNG2
	 */
	public static MCNumberValue MGPA_XCHNG$F_XCHNG2(
		MCFMAGStringExpr I_FR_CUR_CD,
		MCFMAGStringExpr I_TO_CUR_CD,
		MCFMAGNumberExpr I_XRATE,
		MCFMAGNumberExpr I_DEC_PLACE,
		MCFMAGStringExpr I_XRATE_RND_TYP,
		MCFMAGNumberExpr I_AMT,
		MCFMAGStringExpr I_TGT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_XCHNG.F_XCHNG2"},
										new String[]{"PostgreSQL", "MGPA_XCHNG$F_XCHNG2"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_FR_CUR_CD, STRING),
			arg(I_TO_CUR_CD, STRING),
			arg(I_XRATE, NUMBER),
			arg(I_DEC_PLACE, NUMBER),
			arg(I_XRATE_RND_TYP, STRING),
			arg(I_AMT, NUMBER),
			arg(I_TGT, STRING)
		);
	}
	
	/**
	 * MGPA_XCHNG$F_GET_RATE
	 */
	public static MCNumberValue MGPA_XCHNG$F_GET_RATE(
		MCFMAGStringExpr I_FR_CUR_CD,
		MCFMAGStringExpr I_TO_CUR_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_XCHNG.F_GET_RATE"},
										new String[]{"PostgreSQL", "MGPA_XCHNG$F_GET_RATE"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_FR_CUR_CD, STRING),
			arg(I_TO_CUR_CD, STRING)
		);
	}
	
	/**
	 * MGPA_COST_IF$F_GET_DPT
	 */
	public static MCStringValue MGPA_COST_IF$F_GET_DPT(
		MCFMAGStringExpr I_DPT,
		MCFMAGStringExpr I_FIX_DPT,
		MCFMAGDateExpr I_DT,
		MCFMAGBooleanExpr I_NOT_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_COST_IF.F_GET_DPT"},
										new String[]{"PostgreSQL", "MGPA_COST_IF$F_GET_DPT"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_DPT, STRING),
			arg(I_FIX_DPT, STRING),
			arg(I_DT, DATE),
			arg(I_NOT_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MGPA_COST_IF$F_GET_LOC_TO_DPT
	 */
	public static MCStringValue MGPA_COST_IF$F_GET_LOC_TO_DPT(
		MCFMAGStringExpr I_LOC
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_COST_IF.F_GET_LOC_TO_DPT"},
										new String[]{"PostgreSQL", "MGPA_COST_IF$F_GET_LOC_TO_DPT"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_DTL
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_DTL(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_DTL"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_DTL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_BOM
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_BOM(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_BOM"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_BOM"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_OPER
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_OPER(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_OPER"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_OPER"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_WK
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_WK(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_WK"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_WK"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PURC
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PURC(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PURC"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PURC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PROC
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PROC(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PROC"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PROC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PROV
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PROV(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PROV"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PROV"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_FIX
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_FIX(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_FIX"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_FIX"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ITM_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ITM_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD,
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ITM_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ITM_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING),
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_DTL_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_DTL_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_DTL_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_DTL_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_BOM_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_BOM_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_BOM_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_BOM_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_OPER_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_OPER_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_OPER_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_OPER_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_WK_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_WK_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_WK_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_WK_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PURC_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PURC_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PURC_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PURC_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PROC_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PROC_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PROC_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PROC_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_PROV_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_PROV_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_PROV_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_PROV_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_FIX_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_FIX_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_FIX_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_FIX_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_RATE_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_RATE_M(
		MCFMAGDateExpr I_TERM,
		MCFMAGStringExpr I_CALC_CTG_CD,
		MCFMAGStringExpr I_WG_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_RATE_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_RATE_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE),
			arg(I_CALC_CTG_CD, STRING),
			arg(I_WG_CD, STRING)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_RULE_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_RULE_M(
		MCFMAGDateExpr I_TERM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_RULE_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_RULE_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_WK_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_WK_M(
		MCFMAGDateExpr I_TERM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_WK_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_WK_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_EXPNS_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_EXPNS_M(
		MCFMAGDateExpr I_TERM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_EXPNS_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_EXPNS_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_INPT_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_INPT_M(
		MCFMAGDateExpr I_TERM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_INPT_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_INPT_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE)
		);
	}
	
	/**
	 * MGPA_FIX_CHK$F_ALC_OTHER_M
	 */
	public static MCBooleanValue MGPA_FIX_CHK$F_ALC_OTHER_M(
		MCFMAGDateExpr I_TERM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_FIX_CHK.F_ALC_OTHER_M"},
										new String[]{"PostgreSQL", "MGPA_FIX_CHK$F_ALC_OTHER_M"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_TERM, DATE)
		);
	}
	
	/**
	 * MGPA_CALC_ITM_RND$F_RND_BASE_UNIT
	 */
	public static MCNumberValue MGPA_CALC_ITM_RND$F_RND_BASE_UNIT(
		MCFMAGStringExpr I_ITM,
		MCFMAGNumberExpr I_QTY
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_CALC_ITM_RND.F_RND_BASE_UNIT"},
										new String[]{"PostgreSQL", "MGPA_CALC_ITM_RND$F_RND_BASE_UNIT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ITM, STRING),
			arg(I_QTY, NUMBER)
		);
	}
	
	/**
	 * MGPA_CALC_ITM_RND$F_RND_AMT
	 */
	public static MCNumberValue MGPA_CALC_ITM_RND$F_RND_AMT(
		MCFMAGNumberExpr I_AMT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_CALC_ITM_RND.F_RND_AMT"},
										new String[]{"PostgreSQL", "MGPA_CALC_ITM_RND$F_RND_AMT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_AMT, NUMBER)
		);
	}
	
	/**
	 * MGPA_CALC_FIX$F_CHK_FIX
	 */
	public static MCBooleanValue MGPA_CALC_FIX$F_CHK_FIX(
		MCFMAGStringExpr I_CALC_GRP_CD,
		MCFMAGDateExpr I_YM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGPA_CALC_FIX.F_CHK_FIX"},
										new String[]{"PostgreSQL", "MGPA_CALC_FIX$F_CHK_FIX"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_CALC_GRP_CD, STRING),
			arg(I_YM, DATE)
		);
	}
	
	/**
	 * MGC_ALC_REC_TYP$IS_MY_WG
	 */
	public static MCBooleanValue MGC_ALC_REC_TYP$IS_MY_WG(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGC_ALC_REC_TYP.IS_MY_WG"},
										new String[]{"PostgreSQL", "MGC_ALC_REC_TYP$IS_MY_WG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MGC_ALC_REC_TYP$IS_AC_IMP
	 */
	public static MCBooleanValue MGC_ALC_REC_TYP$IS_AC_IMP(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGC_ALC_REC_TYP.IS_AC_IMP"},
										new String[]{"PostgreSQL", "MGC_ALC_REC_TYP$IS_AC_IMP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MGC_ALC_REC_TYP$IS_PURC_ALC
	 */
	public static MCBooleanValue MGC_ALC_REC_TYP$IS_PURC_ALC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGC_ALC_REC_TYP.IS_PURC_ALC"},
										new String[]{"PostgreSQL", "MGC_ALC_REC_TYP$IS_PURC_ALC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MGC_ALC_REC_TYP$IS_OTHER_WG
	 */
	public static MCBooleanValue MGC_ALC_REC_TYP$IS_OTHER_WG(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGC_ALC_REC_TYP.IS_OTHER_WG"},
										new String[]{"PostgreSQL", "MGC_ALC_REC_TYP$IS_OTHER_WG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MGC_ALC_REC_TYP$IS_CARRY
	 */
	public static MCBooleanValue MGC_ALC_REC_TYP$IS_CARRY(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MGC_ALC_REC_TYP.IS_CARRY"},
										new String[]{"PostgreSQL", "MGC_ALC_REC_TYP$IS_CARRY"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MGPA_CO_PARM$F_GET_CALC_CTG_CD".equalsIgnoreCase(name)) {
			return binds -> MGPA_CO_PARM$F_GET_CALC_CTG_CD(bind(binds[0]));
		}
		if ("MGPA_UNIT$F_GET_CONV_QTY".equalsIgnoreCase(name)) {
			return binds -> MGPA_UNIT$F_GET_CONV_QTY(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MGPA_UNIT$F_GET_CONV_QTY_NE".equalsIgnoreCase(name)) {
			return binds -> MGPA_UNIT$F_GET_CONV_QTY_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MGPA_XCHNG$F_XCHNG".equalsIgnoreCase(name)) {
			return binds -> MGPA_XCHNG$F_XCHNG(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MGPA_XCHNG$F_XCHNG2".equalsIgnoreCase(name)) {
			return binds -> MGPA_XCHNG$F_XCHNG2(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_XCHNG$F_GET_RATE".equalsIgnoreCase(name)) {
			return binds -> MGPA_XCHNG$F_GET_RATE(bind(binds[0]), bind(binds[1]));
		}
		if ("MGPA_COST_IF$F_GET_DPT".equalsIgnoreCase(name)) {
			return binds -> MGPA_COST_IF$F_GET_DPT(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MGPA_COST_IF$F_GET_LOC_TO_DPT".equalsIgnoreCase(name)) {
			return binds -> MGPA_COST_IF$F_GET_LOC_TO_DPT(bind(binds[0]));
		}
		if ("MGPA_FIX_CHK$F_DTL".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_DTL(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_BOM".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_BOM(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_OPER".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_OPER(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_WK".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_WK(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_PURC".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PURC(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_PROC".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PROC(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_PROV".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PROV(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_FIX".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_FIX(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_ITM_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ITM_M(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]), bind(binds[6]));
		}
		if ("MGPA_FIX_CHK$F_DTL_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_DTL_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_BOM_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_BOM_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_OPER_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_OPER_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_WK_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_WK_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_PURC_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PURC_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_PROC_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PROC_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_PROV_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_PROV_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_FIX_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_FIX_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_ALC_RATE_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_RATE_M(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MGPA_FIX_CHK$F_ALC_RULE_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_RULE_M(bind(binds[0]));
		}
		if ("MGPA_FIX_CHK$F_ALC_WK_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_WK_M(bind(binds[0]));
		}
		if ("MGPA_FIX_CHK$F_ALC_EXPNS_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_EXPNS_M(bind(binds[0]));
		}
		if ("MGPA_FIX_CHK$F_ALC_INPT_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_INPT_M(bind(binds[0]));
		}
		if ("MGPA_FIX_CHK$F_ALC_OTHER_M".equalsIgnoreCase(name)) {
			return binds -> MGPA_FIX_CHK$F_ALC_OTHER_M(bind(binds[0]));
		}
		if ("MGPA_CALC_ITM_RND$F_RND_BASE_UNIT".equalsIgnoreCase(name)) {
			return binds -> MGPA_CALC_ITM_RND$F_RND_BASE_UNIT(bind(binds[0]), bind(binds[1]));
		}
		if ("MGPA_CALC_ITM_RND$F_RND_AMT".equalsIgnoreCase(name)) {
			return binds -> MGPA_CALC_ITM_RND$F_RND_AMT(bind(binds[0]));
		}
		if ("MGPA_CALC_FIX$F_CHK_FIX".equalsIgnoreCase(name)) {
			return binds -> MGPA_CALC_FIX$F_CHK_FIX(bind(binds[0]), bind(binds[1]));
		}
		if ("MGC_ALC_REC_TYP$IS_MY_WG".equalsIgnoreCase(name)) {
			return binds -> MGC_ALC_REC_TYP$IS_MY_WG(bind(binds[0]));
		}
		if ("MGC_ALC_REC_TYP$IS_AC_IMP".equalsIgnoreCase(name)) {
			return binds -> MGC_ALC_REC_TYP$IS_AC_IMP(bind(binds[0]));
		}
		if ("MGC_ALC_REC_TYP$IS_PURC_ALC".equalsIgnoreCase(name)) {
			return binds -> MGC_ALC_REC_TYP$IS_PURC_ALC(bind(binds[0]));
		}
		if ("MGC_ALC_REC_TYP$IS_OTHER_WG".equalsIgnoreCase(name)) {
			return binds -> MGC_ALC_REC_TYP$IS_OTHER_WG(bind(binds[0]));
		}
		if ("MGC_ALC_REC_TYP$IS_CARRY".equalsIgnoreCase(name)) {
			return binds -> MGC_ALC_REC_TYP$IS_CARRY(bind(binds[0]));
		}
		return null;
	}
}
