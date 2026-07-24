package mcframe.serverMA.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGNumberExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGBooleanExpr;

/**
 * MABSファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MABSFunction extends MCFunctionFactory {
	
	/**
	 * MAPA_NUM$F_GET_NEW_ORA_SEQ_NM
	 */
	public static MCStringValue MAPA_NUM$F_GET_NEW_ORA_SEQ_NM(
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_NUM.F_GET_NEW_ORA_SEQ_NM"},
										new String[]{"PostgreSQL", "MAPA_NUM$F_GET_NEW_ORA_SEQ_NM"}
									}
							  );
		return value(
			physicalName,
			STRING
		);
	}
	
	/**
	 * MAPA_NUM$F_GET_SEQ
	 */
	public static MCNumberValue MAPA_NUM$F_GET_SEQ(
		MCFMAGStringExpr I_ORA_SEQ_NM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_NUM.F_GET_SEQ"},
										new String[]{"PostgreSQL", "MAPA_NUM$F_GET_SEQ"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_ORA_SEQ_NM, STRING)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_SLO_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_SLO_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_SLO_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_SLO_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_PO_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_PO_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_PO_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_PO_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_SLS_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_SLS_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_SLS_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_SLS_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_PURC_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_PURC_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_PURC_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_PURC_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_ORDER_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_ORDER_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_ORDER_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_ORDER_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_MFG_INST_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_MFG_INST_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_MFG_INST_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_MFG_INST_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_SHIP_INST_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_SHIP_INST_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_SHIP_INST_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_SHIP_INST_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_XFR_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_XFR_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_XFR_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_XFR_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_IS_EX_STOP
	 */
	public static MCBooleanValue MAPA_ITM$F_IS_EX_STOP(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_CNTRY_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_IS_EX_STOP"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_IS_EX_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_CNTRY_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_ITM$F_GET_SLS_ITM_GRP_CD
	 */
	public static MCStringValue MAPA_ITM$F_GET_SLS_ITM_GRP_CD(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_ITM.F_GET_SLS_ITM_GRP_CD"},
										new String[]{"PostgreSQL", "MAPA_ITM$F_GET_SLS_ITM_GRP_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_SLO_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_SLO_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_SLO_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_SLO_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_PO_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_PO_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_PO_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_PO_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_SLS_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_SLS_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_SLS_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_SLS_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_PURC_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_PURC_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_PURC_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_PURC_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_ORDER_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_ORDER_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_ORDER_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_ORDER_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_MFG_INST_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_MFG_INST_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_MFG_INST_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_MFG_INST_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_SHIP_INST_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_SHIP_INST_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_SHIP_INST_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_SHIP_INST_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_IS_XFR_STOP
	 */
	public static MCBooleanValue MAPA_BP$F_IS_XFR_STOP(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_IS_XFR_STOP"},
										new String[]{"PostgreSQL", "MAPA_BP$F_IS_XFR_STOP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_CST
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_CST(
		MCFMAGStringExpr I_CST_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_CST"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_CST"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_CST_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_ACST
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_ACST(
		MCFMAGStringExpr I_ACST_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_ACST"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_ACST"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ACST_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_BCST
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_BCST(
		MCFMAGStringExpr I_BCST_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_BCST"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_BCST"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_BP_ADDR
	 */
	public static MCStringValue MAPA_BP$F_GET_BP_ADDR(
		MCFMAGStringExpr I_BP_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGStringExpr I_BP_ADDR_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_BP_ADDR"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_BP_ADDR"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BP_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_BP_ADDR_TYP, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AR_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_AR_DPT_CD_NE(
		MCFMAGStringExpr I_CST_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AR_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AR_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_CST_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AR_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_AR_DPT_CD(
		MCFMAGStringExpr I_CST_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AR_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AR_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_CST_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_BCST_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_BCST_DPT_CD_NE(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_BCST_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_BCST_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_BCST_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_BCST_DPT_CD(
		MCFMAGStringExpr I_BCST_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_BCST_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_BCST_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BCST_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(
		MCFMAGStringExpr I_SPPL_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_VMI_PURC_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SPPL_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_VMI_PURC_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_VMI_PURC_DPT_CD(
		MCFMAGStringExpr I_SPPL_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_VMI_PURC_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_VMI_PURC_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SPPL_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AP_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_AP_DPT_CD_NE(
		MCFMAGStringExpr I_ASPPL_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AP_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AP_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ASPPL_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AP_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_AP_DPT_CD(
		MCFMAGStringExpr I_ASPPL_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AP_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AP_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ASPPL_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AP_DPT_CD_NE2
	 */
	public static MCStringValue MAPA_BP$F_GET_AP_DPT_CD_NE2(
		MCFMAGStringExpr I_SPPL_CD,
		MCFMAGStringExpr I_ASPPL_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AP_DPT_CD_NE2"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AP_DPT_CD_NE2"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SPPL_CD, STRING),
			arg(I_ASPPL_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_AP_DPT_CD2
	 */
	public static MCStringValue MAPA_BP$F_GET_AP_DPT_CD2(
		MCFMAGStringExpr I_SPPL_CD,
		MCFMAGStringExpr I_ASPPL_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_AP_DPT_CD2"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_AP_DPT_CD2"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SPPL_CD, STRING),
			arg(I_ASPPL_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_BSPPL_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_BSPPL_DPT_CD_NE(
		MCFMAGStringExpr I_BSPPL_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_BSPPL_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_BSPPL_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BSPPL_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_BSPPL_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_BSPPL_DPT_CD(
		MCFMAGStringExpr I_BSPPL_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_BSPPL_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_BSPPL_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BSPPL_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_SPPL
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_SPPL(
		MCFMAGStringExpr I_SPPL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_SPPL"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_SPPL"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_SPPL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_ASPPL
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_ASPPL(
		MCFMAGStringExpr I_ASPPL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_ASPPL"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_ASPPL"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ASPPL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_CRED_OF_BSPPL
	 */
	public static MCStringValue MAPA_BP$F_GET_CRED_OF_BSPPL(
		MCFMAGStringExpr I_BSPPL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_CRED_OF_BSPPL"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_CRED_OF_BSPPL"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_BSPPL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_PAY_DPT_CD_NE
	 */
	public static MCStringValue MAPA_BP$F_GET_PAY_DPT_CD_NE(
		MCFMAGStringExpr I_PSPPL_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_PAY_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_PAY_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_PSPPL_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_BP$F_GET_PAY_DPT_CD
	 */
	public static MCStringValue MAPA_BP$F_GET_PAY_DPT_CD(
		MCFMAGStringExpr I_PSPPL_CD,
		MCFMAGDateExpr I_BASE_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_BP.F_GET_PAY_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_BP$F_GET_PAY_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_PSPPL_CD, STRING),
			arg(I_BASE_DT, DATE)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_IN_LOC
	 */
	public static MCStringValue MAPA_LOC$F_GET_IN_LOC(
		MCFMAGStringExpr I_ITM_CD,
		MCFMAGStringExpr I_ITM_SUB1,
		MCFMAGStringExpr I_ITM_SUB2,
		MCFMAGStringExpr I_ITM_SUB3,
		MCFMAGStringExpr I_LOC_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_IN_LOC"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_IN_LOC"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_ITM_CD, STRING),
			arg(I_ITM_SUB1, STRING),
			arg(I_ITM_SUB2, STRING),
			arg(I_ITM_SUB3, STRING),
			arg(I_LOC_CD, STRING)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_ASST_DPT_CD_NE
	 */
	public static MCStringValue MAPA_LOC$F_GET_ASST_DPT_CD_NE(
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGDateExpr I_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_ASST_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_ASST_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC_CD, STRING),
			arg(I_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_ASST_DPT_CD
	 */
	public static MCStringValue MAPA_LOC$F_GET_ASST_DPT_CD(
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_ASST_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_ASST_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC_CD, STRING),
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_SLS_DPT_CD_NE
	 */
	public static MCStringValue MAPA_LOC$F_GET_SLS_DPT_CD_NE(
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGDateExpr I_DT,
		MCFMAGBooleanExpr I_NO_CHK_FLG
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_SLS_DPT_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_SLS_DPT_CD_NE"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC_CD, STRING),
			arg(I_DT, DATE),
			arg(I_NO_CHK_FLG, BOOLEAN)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_SLS_DPT_CD
	 */
	public static MCStringValue MAPA_LOC$F_GET_SLS_DPT_CD(
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_SLS_DPT_CD"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_SLS_DPT_CD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC_CD, STRING),
			arg(I_DT, DATE)
		);
	}
	
	/**
	 * MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE
	 */
	public static MCStringValue MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE(
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_SLS_DPT_LOC_CD_NE"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE"}
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
	 * MAPA_LOC$F_GET_SLS_DPT_LOC_CD
	 */
	public static MCStringValue MAPA_LOC$F_GET_SLS_DPT_LOC_CD(
		MCFMAGStringExpr I_DPT_CD,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_SLS_DPT_LOC_CD"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_SLS_DPT_LOC_CD"}
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
	 * MAPA_LOC$F_GET_LOC_ADDR
	 */
	public static MCStringValue MAPA_LOC$F_GET_LOC_ADDR(
		MCFMAGStringExpr I_LOC_CD,
		MCFMAGDateExpr I_BASE_DT,
		MCFMAGStringExpr I_LOC_ADDR,
		MCFMAGStringExpr I_LCL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_LOC.F_GET_LOC_ADDR"},
										new String[]{"PostgreSQL", "MAPA_LOC$F_GET_LOC_ADDR"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_LOC_CD, STRING),
			arg(I_BASE_DT, DATE),
			arg(I_LOC_ADDR, STRING),
			arg(I_LCL_CD, STRING)
		);
	}
	
	/**
	 * MAPA_SLS_UPRI$F_GET_SLS_UPRI_RANK
	 */
	public static MCStringValue MAPA_SLS_UPRI$F_GET_SLS_UPRI_RANK(
		MCFMAGStringExpr I_CST_CD,
		MCFMAGStringExpr I_DLV_CD,
		MCFMAGStringExpr I_DEST_CD1,
		MCFMAGStringExpr I_DEST_CD2,
		MCFMAGStringExpr I_DEST_CD3,
		MCFMAGDateExpr I_DT
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAPA_SLS_UPRI.F_GET_SLS_UPRI_RANK"},
										new String[]{"PostgreSQL", "MAPA_SLS_UPRI$F_GET_SLS_UPRI_RANK"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_CST_CD, STRING),
			arg(I_DLV_CD, STRING),
			arg(I_DEST_CD1, STRING),
			arg(I_DEST_CD2, STRING),
			arg(I_DEST_CD3, STRING),
			arg(I_DT, DATE)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MAPA_NUM$F_GET_NEW_ORA_SEQ_NM".equalsIgnoreCase(name)) {
			return binds -> MAPA_NUM$F_GET_NEW_ORA_SEQ_NM();
		}
		if ("MAPA_NUM$F_GET_SEQ".equalsIgnoreCase(name)) {
			return binds -> MAPA_NUM$F_GET_SEQ(bind(binds[0]));
		}
		if ("MAPA_ITM$F_IS_SLO_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_SLO_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_PO_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_PO_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_SLS_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_SLS_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_PURC_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_PURC_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_ORDER_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_ORDER_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_MFG_INST_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_MFG_INST_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_SHIP_INST_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_SHIP_INST_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_XFR_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_XFR_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_ITM$F_IS_EX_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_IS_EX_STOP(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		if ("MAPA_ITM$F_GET_SLS_ITM_GRP_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_ITM$F_GET_SLS_ITM_GRP_CD(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_BP$F_IS_SLO_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_SLO_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_PO_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_PO_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_SLS_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_SLS_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_PURC_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_PURC_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_ORDER_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_ORDER_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_MFG_INST_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_MFG_INST_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_SHIP_INST_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_SHIP_INST_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_IS_XFR_STOP".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_IS_XFR_STOP(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_CST".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_CST(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_ACST".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_ACST(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_BCST".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_BCST(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_BP_ADDR".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_BP_ADDR(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_AR_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AR_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_AR_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AR_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_BCST_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_BCST_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_BCST_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_BCST_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_VMI_PURC_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_VMI_PURC_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_VMI_PURC_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_AP_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AP_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_AP_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AP_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_AP_DPT_CD_NE2".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AP_DPT_CD_NE2(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_BP$F_GET_AP_DPT_CD2".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_AP_DPT_CD2(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_BSPPL_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_BSPPL_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_BSPPL_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_BSPPL_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_SPPL".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_SPPL(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_ASPPL".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_ASPPL(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_CRED_OF_BSPPL".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_CRED_OF_BSPPL(bind(binds[0]));
		}
		if ("MAPA_BP$F_GET_PAY_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_PAY_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_BP$F_GET_PAY_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_BP$F_GET_PAY_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_LOC$F_GET_IN_LOC".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_IN_LOC(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]));
		}
		if ("MAPA_LOC$F_GET_ASST_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_ASST_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_LOC$F_GET_ASST_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_ASST_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_LOC$F_GET_SLS_DPT_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_SLS_DPT_CD_NE(bind(binds[0]), bind(binds[1]), bind(binds[2]));
		}
		if ("MAPA_LOC$F_GET_SLS_DPT_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_SLS_DPT_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_SLS_DPT_LOC_CD_NE(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_LOC$F_GET_SLS_DPT_LOC_CD".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_SLS_DPT_LOC_CD(bind(binds[0]), bind(binds[1]));
		}
		if ("MAPA_LOC$F_GET_LOC_ADDR".equalsIgnoreCase(name)) {
			return binds -> MAPA_LOC$F_GET_LOC_ADDR(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]));
		}
		if ("MAPA_SLS_UPRI$F_GET_SLS_UPRI_RANK".equalsIgnoreCase(name)) {
			return binds -> MAPA_SLS_UPRI$F_GET_SLS_UPRI_RANK(bind(binds[0]), bind(binds[1]), bind(binds[2]), bind(binds[3]), bind(binds[4]), bind(binds[5]));
		}
		return null;
	}
}
