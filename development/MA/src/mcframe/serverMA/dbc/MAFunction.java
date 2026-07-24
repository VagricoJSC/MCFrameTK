package mcframe.serverMA.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGDateExpr;

/**
 * MAファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MAFunction extends MCFunctionFactory {
	
	/**
	 * MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN
	 */
	public static MCBooleanValue MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN(
		MCFMAGStringExpr I_PUSH_NTC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PUSH_NTC_TYP.IS_TO_APRV_MAIN"},
										new String[]{"PostgreSQL", "MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_PUSH_NTC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB
	 */
	public static MCBooleanValue MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB(
		MCFMAGStringExpr I_PUSH_NTC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PUSH_NTC_TYP.IS_TO_APRV_SUB"},
										new String[]{"PostgreSQL", "MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_PUSH_NTC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_SA_TYP$IS_PLN
	 */
	public static MCBooleanValue MAC_SA_TYP$IS_PLN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SA_TYP.IS_PLN"},
										new String[]{"PostgreSQL", "MAC_SA_TYP$IS_PLN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SA_TYP$IS_ACT
	 */
	public static MCBooleanValue MAC_SA_TYP$IS_ACT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SA_TYP.IS_ACT"},
										new String[]{"PostgreSQL", "MAC_SA_TYP$IS_ACT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_ASST_TYP$IS_OTH
	 */
	public static MCBooleanValue MAC_ASST_TYP$IS_OTH(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_ASST_TYP.IS_OTH"},
										new String[]{"PostgreSQL", "MAC_ASST_TYP$IS_OTH"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_ASST_TYP$IS_CO_PROD
	 */
	public static MCBooleanValue MAC_ASST_TYP$IS_CO_PROD(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_ASST_TYP.IS_CO_PROD"},
										new String[]{"PostgreSQL", "MAC_ASST_TYP$IS_CO_PROD"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_ASST_TYP$IS_CO_SLS
	 */
	public static MCBooleanValue MAC_ASST_TYP$IS_CO_SLS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_ASST_TYP.IS_CO_SLS"},
										new String[]{"PostgreSQL", "MAC_ASST_TYP$IS_CO_SLS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_AC_SLIP_TYP$IS_PROD_ITM_SO
	 */
	public static MCBooleanValue MAC_AC_SLIP_TYP$IS_PROD_ITM_SO(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_AC_SLIP_TYP.IS_PROD_ITM_SO"},
										new String[]{"PostgreSQL", "MAC_AC_SLIP_TYP$IS_PROD_ITM_SO"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_PURC
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_PURC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_PURC"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_PURC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_PROV
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_PROV(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_PROV"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_PROV"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_XFR
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_XFR(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_XFR"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_XFR"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_XFR_RTN
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_XFR_RTN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_XFR_RTN"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_XFR_RTN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_SLS
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_SLS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_SLS"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_SLS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_SHIP
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_SHIP(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_SHIP"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_SHIP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_PURC_XPNS
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_PURC_XPNS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_PURC_XPNS"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_PURC_XPNS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_TRD_PTN_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MAC_TRD_PTN_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_TRD_PTN_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MAC_TRD_PTN_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_PERIOD_TYP$IS_WEEKLY
	 */
	public static MCBooleanValue MAC_PERIOD_TYP$IS_WEEKLY(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PERIOD_TYP.IS_WEEKLY"},
										new String[]{"PostgreSQL", "MAC_PERIOD_TYP$IS_WEEKLY"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_PERIOD_TYP$IS_DAILY
	 */
	public static MCBooleanValue MAC_PERIOD_TYP$IS_DAILY(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PERIOD_TYP.IS_DAILY"},
										new String[]{"PostgreSQL", "MAC_PERIOD_TYP$IS_DAILY"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_PERIOD_TYP$IS_TENDAYS
	 */
	public static MCBooleanValue MAC_PERIOD_TYP$IS_TENDAYS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PERIOD_TYP.IS_TENDAYS"},
										new String[]{"PostgreSQL", "MAC_PERIOD_TYP$IS_TENDAYS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_PERIOD_TYP$IS_MONTHLY
	 */
	public static MCBooleanValue MAC_PERIOD_TYP$IS_MONTHLY(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_PERIOD_TYP.IS_MONTHLY"},
										new String[]{"PostgreSQL", "MAC_PERIOD_TYP$IS_MONTHLY"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_VIA_DLV_TYP$IS_VIA
	 */
	public static MCBooleanValue MAC_VIA_DLV_TYP$IS_VIA(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_VIA_DLV_TYP.IS_VIA"},
										new String[]{"PostgreSQL", "MAC_VIA_DLV_TYP$IS_VIA"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_VIA_DLV_TYP$IS_NOT_VIA
	 */
	public static MCBooleanValue MAC_VIA_DLV_TYP$IS_NOT_VIA(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_VIA_DLV_TYP.IS_NOT_VIA"},
										new String[]{"PostgreSQL", "MAC_VIA_DLV_TYP$IS_NOT_VIA"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_APRV_STS_TYP$IS_ACPT
	 */
	public static MCBooleanValue MAC_APRV_STS_TYP$IS_ACPT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_APRV_STS_TYP.IS_ACPT"},
										new String[]{"PostgreSQL", "MAC_APRV_STS_TYP$IS_ACPT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_APRV_STS_TYP$IS_RJCT
	 */
	public static MCBooleanValue MAC_APRV_STS_TYP$IS_RJCT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_APRV_STS_TYP.IS_RJCT"},
										new String[]{"PostgreSQL", "MAC_APRV_STS_TYP$IS_RJCT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_APRV_STS_TYP$IS_OPN
	 */
	public static MCBooleanValue MAC_APRV_STS_TYP$IS_OPN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_APRV_STS_TYP.IS_OPN"},
										new String[]{"PostgreSQL", "MAC_APRV_STS_TYP$IS_OPN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_APRV_STS_TYP$IS_FIX
	 */
	public static MCBooleanValue MAC_APRV_STS_TYP$IS_FIX(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_APRV_STS_TYP.IS_FIX"},
										new String[]{"PostgreSQL", "MAC_APRV_STS_TYP$IS_FIX"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_APRV_STS_TYP$IS_LAST_RJCT
	 */
	public static MCBooleanValue MAC_APRV_STS_TYP$IS_LAST_RJCT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_APRV_STS_TYP.IS_LAST_RJCT"},
										new String[]{"PostgreSQL", "MAC_APRV_STS_TYP$IS_LAST_RJCT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLO_PROC_TYP$IS_PURC_DDLV
	 */
	public static MCBooleanValue MAC_SLO_PROC_TYP$IS_PURC_DDLV(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLO_PROC_TYP.IS_PURC_DDLV"},
										new String[]{"PostgreSQL", "MAC_SLO_PROC_TYP$IS_PURC_DDLV"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLO_PROC_TYP$IS_ALLOC
	 */
	public static MCBooleanValue MAC_SLO_PROC_TYP$IS_ALLOC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLO_PROC_TYP.IS_ALLOC"},
										new String[]{"PostgreSQL", "MAC_SLO_PROC_TYP$IS_ALLOC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLO_PROC_TYP$IS_PROC
	 */
	public static MCBooleanValue MAC_SLO_PROC_TYP$IS_PROC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLO_PROC_TYP.IS_PROC"},
										new String[]{"PostgreSQL", "MAC_SLO_PROC_TYP$IS_PROC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLO_PROC_TYP$IS_ALLOC_PROC
	 */
	public static MCBooleanValue MAC_SLO_PROC_TYP$IS_ALLOC_PROC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLO_PROC_TYP.IS_ALLOC_PROC"},
										new String[]{"PostgreSQL", "MAC_SLO_PROC_TYP$IS_ALLOC_PROC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLIP_STS_TYP$IS_CRT
	 */
	public static MCBooleanValue MAC_SLIP_STS_TYP$IS_CRT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLIP_STS_TYP.IS_CRT"},
										new String[]{"PostgreSQL", "MAC_SLIP_STS_TYP$IS_CRT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLIP_STS_TYP$IS_DIS
	 */
	public static MCBooleanValue MAC_SLIP_STS_TYP$IS_DIS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLIP_STS_TYP.IS_DIS"},
										new String[]{"PostgreSQL", "MAC_SLIP_STS_TYP$IS_DIS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLIP_STS_TYP$IS_CAN
	 */
	public static MCBooleanValue MAC_SLIP_STS_TYP$IS_CAN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLIP_STS_TYP.IS_CAN"},
										new String[]{"PostgreSQL", "MAC_SLIP_STS_TYP$IS_CAN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLS_BASIS_TYP$IS_IN_BASIS
	 */
	public static MCBooleanValue MAC_SLS_BASIS_TYP$IS_IN_BASIS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLS_BASIS_TYP.IS_IN_BASIS"},
										new String[]{"PostgreSQL", "MAC_SLS_BASIS_TYP$IS_IN_BASIS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLS_BASIS_TYP$IS_SHIP_BASIS
	 */
	public static MCBooleanValue MAC_SLS_BASIS_TYP$IS_SHIP_BASIS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLS_BASIS_TYP.IS_SHIP_BASIS"},
										new String[]{"PostgreSQL", "MAC_SLS_BASIS_TYP$IS_SHIP_BASIS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SLS_BASIS_TYP$IS_ARRIVALBASIS
	 */
	public static MCBooleanValue MAC_SLS_BASIS_TYP$IS_ARRIVALBASIS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SLS_BASIS_TYP.IS_ARRIVAL_BASIS"},
										new String[]{"PostgreSQL", "MAC_SLS_BASIS_TYP$IS_ARRIVAL_BASIS"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SHIP_INST_TYP$IS_PICK
	 */
	public static MCBooleanValue MAC_SHIP_INST_TYP$IS_PICK(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SHIP_INST_TYP.IS_PICK"},
										new String[]{"PostgreSQL", "MAC_SHIP_INST_TYP$IS_PICK"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SHIP_INST_TYP$IS_NO_PICK
	 */
	public static MCBooleanValue MAC_SHIP_INST_TYP$IS_NO_PICK(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SHIP_INST_TYP.IS_NO_PICK"},
										new String[]{"PostgreSQL", "MAC_SHIP_INST_TYP$IS_NO_PICK"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SHIP_INST_TYP$IS_NON
	 */
	public static MCBooleanValue MAC_SHIP_INST_TYP$IS_NON(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SHIP_INST_TYP.IS_NON"},
										new String[]{"PostgreSQL", "MAC_SHIP_INST_TYP$IS_NON"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_MFG_INST_UNIT_TYP$IS_ITM
	 */
	public static MCBooleanValue MAC_MFG_INST_UNIT_TYP$IS_ITM(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_MFG_INST_UNIT_TYP.IS_ITM"},
										new String[]{"PostgreSQL", "MAC_MFG_INST_UNIT_TYP$IS_ITM"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_MFG_INST_UNIT_TYP$IS_OPER
	 */
	public static MCBooleanValue MAC_MFG_INST_UNIT_TYP$IS_OPER(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_MFG_INST_UNIT_TYP.IS_OPER"},
										new String[]{"PostgreSQL", "MAC_MFG_INST_UNIT_TYP$IS_OPER"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_QUALITY_TYP$IS_GOOD
	 */
	public static MCBooleanValue MAC_QUALITY_TYP$IS_GOOD(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_QUALITY_TYP.IS_GOOD"},
										new String[]{"PostgreSQL", "MAC_QUALITY_TYP$IS_GOOD"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_QUALITY_TYP$IS_DFCT_OPER
	 */
	public static MCBooleanValue MAC_QUALITY_TYP$IS_DFCT_OPER(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_QUALITY_TYP.IS_DFCT_OPER"},
										new String[]{"PostgreSQL", "MAC_QUALITY_TYP$IS_DFCT_OPER"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_QUALITY_TYP$IS_DFCT_INSP
	 */
	public static MCBooleanValue MAC_QUALITY_TYP$IS_DFCT_INSP(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_QUALITY_TYP.IS_DFCT_INSP"},
										new String[]{"PostgreSQL", "MAC_QUALITY_TYP$IS_DFCT_INSP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_QUALITY_TYP$IS_SSPND
	 */
	public static MCBooleanValue MAC_QUALITY_TYP$IS_SSPND(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_QUALITY_TYP.IS_SSPND"},
										new String[]{"PostgreSQL", "MAC_QUALITY_TYP$IS_SSPND"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_LOT_MNG_TYP$IS_NOT_MNG
	 */
	public static MCBooleanValue MAC_LOT_MNG_TYP$IS_NOT_MNG(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_LOT_MNG_TYP.IS_NOT_MNG"},
										new String[]{"PostgreSQL", "MAC_LOT_MNG_TYP$IS_NOT_MNG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_LOT_MNG_TYP$IS_DUPL_ABL
	 */
	public static MCBooleanValue MAC_LOT_MNG_TYP$IS_DUPL_ABL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_LOT_MNG_TYP.IS_DUPL_ABL"},
										new String[]{"PostgreSQL", "MAC_LOT_MNG_TYP$IS_DUPL_ABL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_LOT_MNG_TYP$IS_UNIQ
	 */
	public static MCBooleanValue MAC_LOT_MNG_TYP$IS_UNIQ(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_LOT_MNG_TYP.IS_UNIQ"},
										new String[]{"PostgreSQL", "MAC_LOT_MNG_TYP$IS_UNIQ"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SUBLOT_MNG_TYP$IS_NOT_MNG
	 */
	public static MCBooleanValue MAC_SUBLOT_MNG_TYP$IS_NOT_MNG(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SUBLOT_MNG_TYP.IS_NOT_MNG"},
										new String[]{"PostgreSQL", "MAC_SUBLOT_MNG_TYP$IS_NOT_MNG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SUBLOT_MNG_TYP$IS_DUPL_ABL
	 */
	public static MCBooleanValue MAC_SUBLOT_MNG_TYP$IS_DUPL_ABL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SUBLOT_MNG_TYP.IS_DUPL_ABL"},
										new String[]{"PostgreSQL", "MAC_SUBLOT_MNG_TYP$IS_DUPL_ABL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SUBLOT_MNG_TYP$IS_STK
	 */
	public static MCBooleanValue MAC_SUBLOT_MNG_TYP$IS_STK(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SUBLOT_MNG_TYP.IS_STK"},
										new String[]{"PostgreSQL", "MAC_SUBLOT_MNG_TYP$IS_STK"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_SUBLOT_MNG_TYP$IS_UNIQ
	 */
	public static MCBooleanValue MAC_SUBLOT_MNG_TYP$IS_UNIQ(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_SUBLOT_MNG_TYP.IS_UNIQ"},
										new String[]{"PostgreSQL", "MAC_SUBLOT_MNG_TYP$IS_UNIQ"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_AP_STTL_TYP$IS_COM_PAID
	 */
	public static MCBooleanValue MAC_AP_STTL_TYP$IS_COM_PAID(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_AP_STTL_TYP.IS_COM_PAID"},
										new String[]{"PostgreSQL", "MAC_AP_STTL_TYP$IS_COM_PAID"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_RPT_TGT_TYP$IS_ST
	 */
	public static MCBooleanValue MAC_RPT_TGT_TYP$IS_ST(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_RPT_TGT_TYP.IS_ST"},
										new String[]{"PostgreSQL", "MAC_RPT_TGT_TYP$IS_ST"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_RPT_TGT_TYP$IS_END
	 */
	public static MCBooleanValue MAC_RPT_TGT_TYP$IS_END(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_RPT_TGT_TYP.IS_END"},
										new String[]{"PostgreSQL", "MAC_RPT_TGT_TYP$IS_END"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_STR$IS_NULL_VAL
	 */
	public static MCBooleanValue MAC_STR$IS_NULL_VAL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_STR.IS_NULL_VAL"},
										new String[]{"PostgreSQL", "MAC_STR$IS_NULL_VAL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_Y4M$IS_NULL_VAL
	 */
	public static MCBooleanValue MAC_Y4M$IS_NULL_VAL(
		MCFMAGDateExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_Y4M.IS_NULL_VAL"},
										new String[]{"PostgreSQL", "MAC_Y4M$IS_NULL_VAL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, DATE)
		);
	}
	
	/**
	 * MAC_RPT_KEY_TYP$ITM_GRP
	 */
	public static MCStringValue MAC_RPT_KEY_TYP$ITM_GRP(
		MCFMAGStringExpr I_RPT_KEY_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_RPT_KEY_TYP.ITM_GRP"},
										new String[]{"PostgreSQL", "MAC_RPT_KEY_TYP$ITM_GRP"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_RPT_KEY_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_EDI
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_EDI(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_EDI"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_EDI"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_PLM
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_PLM(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_PLM"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_PLM"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_SEND
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_SEND(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_SEND"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_SEND"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_YIELD_TYP$IS_BYPROD
	 */
	public static MCStringValue MAC_YIELD_TYP$IS_BYPROD(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_YIELD_TYP.IS_BYPROD"},
										new String[]{"PostgreSQL", "MAC_YIELD_TYP$IS_BYPROD"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_MST_NM$CONTAINS
	 */
	public static MCStringValue MAC_MST_NM$CONTAINS(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_MST_NM.CONTAINS"},
										new String[]{"PostgreSQL", "MAC_MST_NM$CONTAINS"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MAC_MST_NM$V2NAME
	 */
	public static MCStringValue MAC_MST_NM$V2NAME(
		MCFMAGStringExpr I_VALUE,
		MCFMAGStringExpr I_LCL_CD
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_MST_NM.V2NAME"},
										new String[]{"PostgreSQL", "MAC_MST_NM$V2NAME"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_VALUE, STRING),
			arg(I_LCL_CD, STRING)
		);
	}
	
	/**
	 * MAC_MST_NM$MST_SORT
	 */
	public static MCNumberValue MAC_MST_NM$MST_SORT(
		MCFMAGStringExpr I_MST_NM
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_MST_NM.MST_SORT"},
										new String[]{"PostgreSQL", "MAC_MST_NM$MST_SORT"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_MST_NM, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_AC
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_AC(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_AC"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_AC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_SCM
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_SCM(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_SCM"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_SCM"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_FB
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_FB(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_FB"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_FB"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_BI
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_BI(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_BI"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_BI"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_SAP
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_SAP(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_SAP"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_SAP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	/**
	 * MAC_IF_PROC_TYP$IS_PCM
	 */
	public static MCBooleanValue MAC_IF_PROC_TYP$IS_PCM(
		MCFMAGStringExpr I_IF_PROC_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MAC_IF_PROC_TYP.IS_PCM"},
										new String[]{"PostgreSQL", "MAC_IF_PROC_TYP$IS_PCM"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IF_PROC_TYP, STRING)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN".equalsIgnoreCase(name)) {
			return binds -> MAC_PUSH_NTC_TYP$IS_TO_APRV_MAIN(bind(binds[0]));
		}
		if ("MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB".equalsIgnoreCase(name)) {
			return binds -> MAC_PUSH_NTC_TYP$IS_TO_APRV_SUB(bind(binds[0]));
		}
		if ("MAC_SA_TYP$IS_PLN".equalsIgnoreCase(name)) {
			return binds -> MAC_SA_TYP$IS_PLN(bind(binds[0]));
		}
		if ("MAC_SA_TYP$IS_ACT".equalsIgnoreCase(name)) {
			return binds -> MAC_SA_TYP$IS_ACT(bind(binds[0]));
		}
		if ("MAC_ASST_TYP$IS_OTH".equalsIgnoreCase(name)) {
			return binds -> MAC_ASST_TYP$IS_OTH(bind(binds[0]));
		}
		if ("MAC_ASST_TYP$IS_CO_PROD".equalsIgnoreCase(name)) {
			return binds -> MAC_ASST_TYP$IS_CO_PROD(bind(binds[0]));
		}
		if ("MAC_ASST_TYP$IS_CO_SLS".equalsIgnoreCase(name)) {
			return binds -> MAC_ASST_TYP$IS_CO_SLS(bind(binds[0]));
		}
		if ("MAC_AC_SLIP_TYP$IS_PROD_ITM_SO".equalsIgnoreCase(name)) {
			return binds -> MAC_AC_SLIP_TYP$IS_PROD_ITM_SO(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_PURC".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_PURC(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_PROV".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_PROV(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_XFR".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_XFR(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_XFR_RTN".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_XFR_RTN(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_SLS".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_SLS(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_SHIP".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_SHIP(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_PURC_XPNS".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_PURC_XPNS(bind(binds[0]));
		}
		if ("MAC_TRD_PTN_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MAC_TRD_PTN_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MAC_PERIOD_TYP$IS_WEEKLY".equalsIgnoreCase(name)) {
			return binds -> MAC_PERIOD_TYP$IS_WEEKLY(bind(binds[0]));
		}
		if ("MAC_PERIOD_TYP$IS_DAILY".equalsIgnoreCase(name)) {
			return binds -> MAC_PERIOD_TYP$IS_DAILY(bind(binds[0]));
		}
		if ("MAC_PERIOD_TYP$IS_TENDAYS".equalsIgnoreCase(name)) {
			return binds -> MAC_PERIOD_TYP$IS_TENDAYS(bind(binds[0]));
		}
		if ("MAC_PERIOD_TYP$IS_MONTHLY".equalsIgnoreCase(name)) {
			return binds -> MAC_PERIOD_TYP$IS_MONTHLY(bind(binds[0]));
		}
		if ("MAC_VIA_DLV_TYP$IS_VIA".equalsIgnoreCase(name)) {
			return binds -> MAC_VIA_DLV_TYP$IS_VIA(bind(binds[0]));
		}
		if ("MAC_VIA_DLV_TYP$IS_NOT_VIA".equalsIgnoreCase(name)) {
			return binds -> MAC_VIA_DLV_TYP$IS_NOT_VIA(bind(binds[0]));
		}
		if ("MAC_APRV_STS_TYP$IS_ACPT".equalsIgnoreCase(name)) {
			return binds -> MAC_APRV_STS_TYP$IS_ACPT(bind(binds[0]));
		}
		if ("MAC_APRV_STS_TYP$IS_RJCT".equalsIgnoreCase(name)) {
			return binds -> MAC_APRV_STS_TYP$IS_RJCT(bind(binds[0]));
		}
		if ("MAC_APRV_STS_TYP$IS_OPN".equalsIgnoreCase(name)) {
			return binds -> MAC_APRV_STS_TYP$IS_OPN(bind(binds[0]));
		}
		if ("MAC_APRV_STS_TYP$IS_FIX".equalsIgnoreCase(name)) {
			return binds -> MAC_APRV_STS_TYP$IS_FIX(bind(binds[0]));
		}
		if ("MAC_APRV_STS_TYP$IS_LAST_RJCT".equalsIgnoreCase(name)) {
			return binds -> MAC_APRV_STS_TYP$IS_LAST_RJCT(bind(binds[0]));
		}
		if ("MAC_SLO_PROC_TYP$IS_PURC_DDLV".equalsIgnoreCase(name)) {
			return binds -> MAC_SLO_PROC_TYP$IS_PURC_DDLV(bind(binds[0]));
		}
		if ("MAC_SLO_PROC_TYP$IS_ALLOC".equalsIgnoreCase(name)) {
			return binds -> MAC_SLO_PROC_TYP$IS_ALLOC(bind(binds[0]));
		}
		if ("MAC_SLO_PROC_TYP$IS_PROC".equalsIgnoreCase(name)) {
			return binds -> MAC_SLO_PROC_TYP$IS_PROC(bind(binds[0]));
		}
		if ("MAC_SLO_PROC_TYP$IS_ALLOC_PROC".equalsIgnoreCase(name)) {
			return binds -> MAC_SLO_PROC_TYP$IS_ALLOC_PROC(bind(binds[0]));
		}
		if ("MAC_SLIP_STS_TYP$IS_CRT".equalsIgnoreCase(name)) {
			return binds -> MAC_SLIP_STS_TYP$IS_CRT(bind(binds[0]));
		}
		if ("MAC_SLIP_STS_TYP$IS_DIS".equalsIgnoreCase(name)) {
			return binds -> MAC_SLIP_STS_TYP$IS_DIS(bind(binds[0]));
		}
		if ("MAC_SLIP_STS_TYP$IS_CAN".equalsIgnoreCase(name)) {
			return binds -> MAC_SLIP_STS_TYP$IS_CAN(bind(binds[0]));
		}
		if ("MAC_SLS_BASIS_TYP$IS_IN_BASIS".equalsIgnoreCase(name)) {
			return binds -> MAC_SLS_BASIS_TYP$IS_IN_BASIS(bind(binds[0]));
		}
		if ("MAC_SLS_BASIS_TYP$IS_SHIP_BASIS".equalsIgnoreCase(name)) {
			return binds -> MAC_SLS_BASIS_TYP$IS_SHIP_BASIS(bind(binds[0]));
		}
		if ("MAC_SLS_BASIS_TYP$IS_ARRIVALBASIS".equalsIgnoreCase(name)) {
			return binds -> MAC_SLS_BASIS_TYP$IS_ARRIVALBASIS(bind(binds[0]));
		}
		if ("MAC_SHIP_INST_TYP$IS_PICK".equalsIgnoreCase(name)) {
			return binds -> MAC_SHIP_INST_TYP$IS_PICK(bind(binds[0]));
		}
		if ("MAC_SHIP_INST_TYP$IS_NO_PICK".equalsIgnoreCase(name)) {
			return binds -> MAC_SHIP_INST_TYP$IS_NO_PICK(bind(binds[0]));
		}
		if ("MAC_SHIP_INST_TYP$IS_NON".equalsIgnoreCase(name)) {
			return binds -> MAC_SHIP_INST_TYP$IS_NON(bind(binds[0]));
		}
		if ("MAC_MFG_INST_UNIT_TYP$IS_ITM".equalsIgnoreCase(name)) {
			return binds -> MAC_MFG_INST_UNIT_TYP$IS_ITM(bind(binds[0]));
		}
		if ("MAC_MFG_INST_UNIT_TYP$IS_OPER".equalsIgnoreCase(name)) {
			return binds -> MAC_MFG_INST_UNIT_TYP$IS_OPER(bind(binds[0]));
		}
		if ("MAC_QUALITY_TYP$IS_GOOD".equalsIgnoreCase(name)) {
			return binds -> MAC_QUALITY_TYP$IS_GOOD(bind(binds[0]));
		}
		if ("MAC_QUALITY_TYP$IS_DFCT_OPER".equalsIgnoreCase(name)) {
			return binds -> MAC_QUALITY_TYP$IS_DFCT_OPER(bind(binds[0]));
		}
		if ("MAC_QUALITY_TYP$IS_DFCT_INSP".equalsIgnoreCase(name)) {
			return binds -> MAC_QUALITY_TYP$IS_DFCT_INSP(bind(binds[0]));
		}
		if ("MAC_QUALITY_TYP$IS_SSPND".equalsIgnoreCase(name)) {
			return binds -> MAC_QUALITY_TYP$IS_SSPND(bind(binds[0]));
		}
		if ("MAC_LOT_MNG_TYP$IS_NOT_MNG".equalsIgnoreCase(name)) {
			return binds -> MAC_LOT_MNG_TYP$IS_NOT_MNG(bind(binds[0]));
		}
		if ("MAC_LOT_MNG_TYP$IS_DUPL_ABL".equalsIgnoreCase(name)) {
			return binds -> MAC_LOT_MNG_TYP$IS_DUPL_ABL(bind(binds[0]));
		}
		if ("MAC_LOT_MNG_TYP$IS_UNIQ".equalsIgnoreCase(name)) {
			return binds -> MAC_LOT_MNG_TYP$IS_UNIQ(bind(binds[0]));
		}
		if ("MAC_SUBLOT_MNG_TYP$IS_NOT_MNG".equalsIgnoreCase(name)) {
			return binds -> MAC_SUBLOT_MNG_TYP$IS_NOT_MNG(bind(binds[0]));
		}
		if ("MAC_SUBLOT_MNG_TYP$IS_DUPL_ABL".equalsIgnoreCase(name)) {
			return binds -> MAC_SUBLOT_MNG_TYP$IS_DUPL_ABL(bind(binds[0]));
		}
		if ("MAC_SUBLOT_MNG_TYP$IS_STK".equalsIgnoreCase(name)) {
			return binds -> MAC_SUBLOT_MNG_TYP$IS_STK(bind(binds[0]));
		}
		if ("MAC_SUBLOT_MNG_TYP$IS_UNIQ".equalsIgnoreCase(name)) {
			return binds -> MAC_SUBLOT_MNG_TYP$IS_UNIQ(bind(binds[0]));
		}
		if ("MAC_AP_STTL_TYP$IS_COM_PAID".equalsIgnoreCase(name)) {
			return binds -> MAC_AP_STTL_TYP$IS_COM_PAID(bind(binds[0]));
		}
		if ("MAC_RPT_TGT_TYP$IS_ST".equalsIgnoreCase(name)) {
			return binds -> MAC_RPT_TGT_TYP$IS_ST(bind(binds[0]));
		}
		if ("MAC_RPT_TGT_TYP$IS_END".equalsIgnoreCase(name)) {
			return binds -> MAC_RPT_TGT_TYP$IS_END(bind(binds[0]));
		}
		if ("MAC_STR$IS_NULL_VAL".equalsIgnoreCase(name)) {
			return binds -> MAC_STR$IS_NULL_VAL(bind(binds[0]));
		}
		if ("MAC_Y4M$IS_NULL_VAL".equalsIgnoreCase(name)) {
			return binds -> MAC_Y4M$IS_NULL_VAL(bind(binds[0]));
		}
		if ("MAC_RPT_KEY_TYP$ITM_GRP".equalsIgnoreCase(name)) {
			return binds -> MAC_RPT_KEY_TYP$ITM_GRP(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_EDI".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_EDI(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_PLM".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_PLM(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_SEND".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_SEND(bind(binds[0]));
		}
		if ("MAC_YIELD_TYP$IS_BYPROD".equalsIgnoreCase(name)) {
			return binds -> MAC_YIELD_TYP$IS_BYPROD(bind(binds[0]));
		}
		if ("MAC_MST_NM$CONTAINS".equalsIgnoreCase(name)) {
			return binds -> MAC_MST_NM$CONTAINS(bind(binds[0]));
		}
		if ("MAC_MST_NM$V2NAME".equalsIgnoreCase(name)) {
			return binds -> MAC_MST_NM$V2NAME(bind(binds[0]), bind(binds[1]));
		}
		if ("MAC_MST_NM$MST_SORT".equalsIgnoreCase(name)) {
			return binds -> MAC_MST_NM$MST_SORT(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_AC".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_AC(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_SCM".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_SCM(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_FB".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_FB(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_BI".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_BI(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_SAP".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_SAP(bind(binds[0]));
		}
		if ("MAC_IF_PROC_TYP$IS_PCM".equalsIgnoreCase(name)) {
			return binds -> MAC_IF_PROC_TYP$IS_PCM(bind(binds[0]));
		}
		return null;
	}
}
