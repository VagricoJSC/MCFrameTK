package mcframe.serverMS.dbc;

import static mcframe.commonCore.lang.MCDataType.*;
import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.function.Function;
import mcframe.serverCore.mcjdbc.MCDatabaseManager;
import mcframe.serverCore.queryapi.IFMCFMSQL.MCFMAGStringExpr;

/**
 * MSファンクションクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
public class MSFunction extends MCFunctionFactory {
	
	/**
	 * MSC_BILL_CL_STS_TYP$IS_NOT_BILL
	 */
	public static MCBooleanValue MSC_BILL_CL_STS_TYP$IS_NOT_BILL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_BILL_CL_STS_TYP.IS_NOT_BILL"},
										new String[]{"PostgreSQL", "MSC_BILL_CL_STS_TYP$IS_NOT_BILL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_INSP_TYP$IS_ACCPT
	 */
	public static MCBooleanValue MSC_INSP_TYP$IS_ACCPT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_INSP_TYP.IS_ACCPT"},
										new String[]{"PostgreSQL", "MSC_INSP_TYP$IS_ACCPT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_INSP_TYP$IS_PRDCT
	 */
	public static MCBooleanValue MSC_INSP_TYP$IS_PRDCT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_INSP_TYP.IS_PRDCT"},
										new String[]{"PostgreSQL", "MSC_INSP_TYP$IS_PRDCT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_ACT_TYP$IO_TYP
	 */
	public static MCStringValue MSC_IO_ACT_TYP$IO_TYP(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_ACT_TYP.IO_TYP"},
										new String[]{"PostgreSQL", "MSC_IO_ACT_TYP$IO_TYP"}
									}
							  );
		return value(
			physicalName,
			STRING,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO
	 */
	public static MCBooleanValue MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_SUB_TYP.IS_ITM_ORD_NO"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_TYP$IS_GI
	 */
	public static MCBooleanValue MSC_IO_TYP$IS_GI(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_TYP.IS_GI"},
										new String[]{"PostgreSQL", "MSC_IO_TYP$IS_GI"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_TYP$IS_GR
	 */
	public static MCBooleanValue MSC_IO_TYP$IS_GR(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_TYP.IS_GR"},
										new String[]{"PostgreSQL", "MSC_IO_TYP$IS_GR"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_ITM_ORD_TYP$IS_MFG
	 */
	public static MCBooleanValue MSC_ITM_ORD_TYP$IS_MFG(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_ITM_ORD_TYP.IS_MFG"},
										new String[]{"PostgreSQL", "MSC_ITM_ORD_TYP$IS_MFG"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_ITM_ORD_TYP$IS_OUTSRC
	 */
	public static MCBooleanValue MSC_ITM_ORD_TYP$IS_OUTSRC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_ITM_ORD_TYP.IS_OUTSRC"},
										new String[]{"PostgreSQL", "MSC_ITM_ORD_TYP$IS_OUTSRC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_ITM_ORD_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MSC_ITM_ORD_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_ITM_ORD_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_ITM_ORD_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MSC_ITM_ORD_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_ORD_TYP, STRING)
		);
	}
	
	/**
	 * MSC_ITM_ORD_STS_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MSC_ITM_ORD_STS_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_ITM_ORD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_ITM_ORD_STS_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MSC_ITM_ORD_STS_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_ITM_ORD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_MRKT_JUDG_STS_TYP$IS_ACPT
	 */
	public static MCBooleanValue MSC_MRKT_JUDG_STS_TYP$IS_ACPT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_MRKT_JUDG_STS_TYP.IS_ACPT"},
										new String[]{"PostgreSQL", "MSC_MRKT_JUDG_STS_TYP$IS_ACPT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT
	 */
	public static MCBooleanValue MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_MRKT_JUDG_STS_TYP.IS_NOT_ACPT"},
										new String[]{"PostgreSQL", "MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_ORD_GNRT_TYP$IS_UPLND
	 */
	public static MCBooleanValue MSC_ORD_GNRT_TYP$IS_UPLND(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_ORD_GNRT_TYP.IS_UPLND"},
										new String[]{"PostgreSQL", "MSC_ORD_GNRT_TYP$IS_UPLND"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_PLNT_APRV_STS_TYP$IS_ACPT
	 */
	public static MCBooleanValue MSC_PLNT_APRV_STS_TYP$IS_ACPT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_PLNT_APRV_STS_TYP.IS_ACPT"},
										new String[]{"PostgreSQL", "MSC_PLNT_APRV_STS_TYP$IS_ACPT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_PR_STS_TYP$IS_COMP
	 */
	public static MCBooleanValue MSC_PR_STS_TYP$IS_COMP(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_PR_STS_TYP.IS_COMP"},
										new String[]{"PostgreSQL", "MSC_PR_STS_TYP$IS_COMP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_QTN_TYP$IS_QTN
	 */
	public static MCBooleanValue MSC_QTN_TYP$IS_QTN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_QTN_TYP.IS_QTN"},
										new String[]{"PostgreSQL", "MSC_QTN_TYP$IS_QTN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_SCHD_ACT_TYP$IS_SCHD
	 */
	public static MCBooleanValue MSC_SCHD_ACT_TYP$IS_SCHD(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_SCHD_ACT_TYP.IS_SCHD"},
										new String[]{"PostgreSQL", "MSC_SCHD_ACT_TYP$IS_SCHD"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_STK_ID_TYP$IS_ACCPT_DFCT
	 */
	public static MCBooleanValue MSC_STK_ID_TYP$IS_ACCPT_DFCT(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_STK_ID_TYP.IS_ACCPT_DFCT"},
										new String[]{"PostgreSQL", "MSC_STK_ID_TYP$IS_ACCPT_DFCT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_DLV_ID_TYP$IS_DLV
	 */
	public static MCBooleanValue MSC_DLV_ID_TYP$IS_DLV(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_DLV_ID_TYP.IS_DLV"},
										new String[]{"PostgreSQL", "MSC_DLV_ID_TYP$IS_DLV"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_DLV_ID_TYP$IS_LOC
	 */
	public static MCBooleanValue MSC_DLV_ID_TYP$IS_LOC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_DLV_ID_TYP.IS_LOC"},
										new String[]{"PostgreSQL", "MSC_DLV_ID_TYP$IS_LOC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_DLV_ID_TYP$IS_SPPL
	 */
	public static MCBooleanValue MSC_DLV_ID_TYP$IS_SPPL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_DLV_ID_TYP.IS_SPPL"},
										new String[]{"PostgreSQL", "MSC_DLV_ID_TYP$IS_SPPL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_DLV_ID_TYP$IS_CO
	 */
	public static MCBooleanValue MSC_DLV_ID_TYP$IS_CO(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_DLV_ID_TYP.IS_CO"},
										new String[]{"PostgreSQL", "MSC_DLV_ID_TYP$IS_CO"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_SCHD_STK_TYP$SCHD_STK_PRIO
	 */
	public static MCNumberValue MSC_SCHD_STK_TYP$SCHD_STK_PRIO(
		MCFMAGStringExpr I_SCHD_STK_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_SCHD_STK_TYP.SCHD_STK_PRIO"},
										new String[]{"PostgreSQL", "MSC_SCHD_STK_TYP$SCHD_STK_PRIO"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_SCHD_STK_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MSC_IO_SCHD_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_IO_SCHD_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE
	 */
	public static MCBooleanValue MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE(
		MCFMAGStringExpr I_IO_SCHD_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_TYP.IS_UPD_LOT_TRACE"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_TYP, STRING)
		);
	}
	
	/**
	 * MSC_OPER_ORD_STS_TYP$IS_OPN
	 */
	public static MCBooleanValue MSC_OPER_ORD_STS_TYP$IS_OPN(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_OPER_ORD_STS_TYP.IS_OPN"},
										new String[]{"PostgreSQL", "MSC_OPER_ORD_STS_TYP$IS_OPN"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_TYP$IS_XFR_GI_ALL
	 */
	public static MCBooleanValue MSC_IO_SCHD_TYP$IS_XFR_GI_ALL(
		MCFMAGStringExpr I_IO_SCHD_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_TYP.IS_XFR_GI_ALL"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_TYP$IS_XFR_GI_ALL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_TYP$IS_XFR_GR_ALL
	 */
	public static MCBooleanValue MSC_IO_SCHD_TYP$IS_XFR_GR_ALL(
		MCFMAGStringExpr I_IO_SCHD_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_TYP.IS_XFR_GR_ALL"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_TYP$IS_XFR_GR_ALL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_TYP, STRING)
		);
	}
	
	/**
	 * MSC_SHIP_TO_ID_TYP$IS_LOC
	 */
	public static MCBooleanValue MSC_SHIP_TO_ID_TYP$IS_LOC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_SHIP_TO_ID_TYP.IS_LOC"},
										new String[]{"PostgreSQL", "MSC_SHIP_TO_ID_TYP$IS_LOC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_SHIP_RQST_ID_TYP$IS_LOC
	 */
	public static MCBooleanValue MSC_SHIP_RQST_ID_TYP$IS_LOC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_SHIP_RQST_ID_TYP.IS_LOC"},
										new String[]{"PostgreSQL", "MSC_SHIP_RQST_ID_TYP$IS_LOC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_SHIP_RQST_ID_TYP$IS_SPPL
	 */
	public static MCBooleanValue MSC_SHIP_RQST_ID_TYP$IS_SPPL(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_SHIP_RQST_ID_TYP.IS_SPPL"},
										new String[]{"PostgreSQL", "MSC_SHIP_RQST_ID_TYP$IS_SPPL"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	/**
	 * MSC_IO_ACT_TYP$SLIP_SORT_SEQ
	 */
	public static MCNumberValue MSC_IO_ACT_TYP$SLIP_SORT_SEQ(
		MCFMAGStringExpr I_IO_ACT_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_ACT_TYP.SLIP_SORT_SEQ"},
										new String[]{"PostgreSQL", "MSC_IO_ACT_TYP$SLIP_SORT_SEQ"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_IO_ACT_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_ACT_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MSC_IO_ACT_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_IO_ACT_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_ACT_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MSC_IO_ACT_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_ACT_TYP, STRING)
		);
	}
	
	/**
	 * MSC_MFG_APRV_STS_TYP$STATE_ORDER
	 */
	public static MCNumberValue MSC_MFG_APRV_STS_TYP$STATE_ORDER(
		MCFMAGStringExpr I_MFG_APRV_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_MFG_APRV_STS_TYP.STATE_ORDER"},
										new String[]{"PostgreSQL", "MSC_MFG_APRV_STS_TYP$STATE_ORDER"}
									}
							  );
		return value(
			physicalName,
			NUMBER,
			arg(I_MFG_APRV_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_STS_TYP$IS_OPN_GRP
	 */
	public static MCBooleanValue MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(
		MCFMAGStringExpr I_IO_SCHD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_STS_TYP.IS_OPN_GRP"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_STS_TYP$IS_OPN_GRP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_STS_TYP$IS_FIX_GRP
	 */
	public static MCBooleanValue MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(
		MCFMAGStringExpr I_IO_SCHD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_STS_TYP.IS_FIX_GRP"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_STS_TYP$IS_FIX_GRP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP
	 */
	public static MCBooleanValue MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP(
		MCFMAGStringExpr I_IO_SCHD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_STS_TYP.IS_SCHD_GRP"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_STS_TYP$IS_ORD_GRP
	 */
	public static MCBooleanValue MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(
		MCFMAGStringExpr I_IO_SCHD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_STS_TYP.IS_ORD_GRP"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_STS_TYP$IS_ORD_GRP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP
	 */
	public static MCBooleanValue MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP(
		MCFMAGStringExpr I_IO_SCHD_STS_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IO_SCHD_STS_TYP.IS_ORDSAV_GRP"},
										new String[]{"PostgreSQL", "MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_IO_SCHD_STS_TYP, STRING)
		);
	}
	
	/**
	 * MSC_INSP_TYP$IS_BI_TGT
	 */
	public static MCBooleanValue MSC_INSP_TYP$IS_BI_TGT(
		MCFMAGStringExpr I_INSP_TYP
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_INSP_TYP.IS_BI_TGT"},
										new String[]{"PostgreSQL", "MSC_INSP_TYP$IS_BI_TGT"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_INSP_TYP, STRING)
		);
	}
	
	/**
	 * MSC_IN_TO_ID_TYP$IS_LOC
	 */
	public static MCBooleanValue MSC_IN_TO_ID_TYP$IS_LOC(
		MCFMAGStringExpr I_VALUE
	) {
		String physicalName = MCDatabaseManager.judgeStoredFunction(
									new String[][]{
										new String[]{"Oracle", "MSC_IN_TO_ID_TYP.IS_LOC"},
										new String[]{"PostgreSQL", "MSC_IN_TO_ID_TYP$IS_LOC"}
									}
							  );
		return value(
			physicalName,
			BOOLEAN,
			arg(I_VALUE, STRING)
		);
	}
	
	public static Function<String[], MCExprValue> getFunctionExecuter(String name) {
		if ("MSC_BILL_CL_STS_TYP$IS_NOT_BILL".equalsIgnoreCase(name)) {
			return binds -> MSC_BILL_CL_STS_TYP$IS_NOT_BILL(bind(binds[0]));
		}
		if ("MSC_INSP_TYP$IS_ACCPT".equalsIgnoreCase(name)) {
			return binds -> MSC_INSP_TYP$IS_ACCPT(bind(binds[0]));
		}
		if ("MSC_INSP_TYP$IS_PRDCT".equalsIgnoreCase(name)) {
			return binds -> MSC_INSP_TYP$IS_PRDCT(bind(binds[0]));
		}
		if ("MSC_IO_ACT_TYP$IO_TYP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_ACT_TYP$IO_TYP(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_SUB_TYP$IS_ITM_ORD_NO(bind(binds[0]));
		}
		if ("MSC_IO_TYP$IS_GI".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_TYP$IS_GI(bind(binds[0]));
		}
		if ("MSC_IO_TYP$IS_GR".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_TYP$IS_GR(bind(binds[0]));
		}
		if ("MSC_ITM_ORD_TYP$IS_MFG".equalsIgnoreCase(name)) {
			return binds -> MSC_ITM_ORD_TYP$IS_MFG(bind(binds[0]));
		}
		if ("MSC_ITM_ORD_TYP$IS_OUTSRC".equalsIgnoreCase(name)) {
			return binds -> MSC_ITM_ORD_TYP$IS_OUTSRC(bind(binds[0]));
		}
		if ("MSC_ITM_ORD_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MSC_ITM_ORD_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MSC_ITM_ORD_STS_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MSC_ITM_ORD_STS_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MSC_MRKT_JUDG_STS_TYP$IS_ACPT".equalsIgnoreCase(name)) {
			return binds -> MSC_MRKT_JUDG_STS_TYP$IS_ACPT(bind(binds[0]));
		}
		if ("MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT".equalsIgnoreCase(name)) {
			return binds -> MSC_MRKT_JUDG_STS_TYP$IS_NOT_ACPT(bind(binds[0]));
		}
		if ("MSC_ORD_GNRT_TYP$IS_UPLND".equalsIgnoreCase(name)) {
			return binds -> MSC_ORD_GNRT_TYP$IS_UPLND(bind(binds[0]));
		}
		if ("MSC_PLNT_APRV_STS_TYP$IS_ACPT".equalsIgnoreCase(name)) {
			return binds -> MSC_PLNT_APRV_STS_TYP$IS_ACPT(bind(binds[0]));
		}
		if ("MSC_PR_STS_TYP$IS_COMP".equalsIgnoreCase(name)) {
			return binds -> MSC_PR_STS_TYP$IS_COMP(bind(binds[0]));
		}
		if ("MSC_QTN_TYP$IS_QTN".equalsIgnoreCase(name)) {
			return binds -> MSC_QTN_TYP$IS_QTN(bind(binds[0]));
		}
		if ("MSC_SCHD_ACT_TYP$IS_SCHD".equalsIgnoreCase(name)) {
			return binds -> MSC_SCHD_ACT_TYP$IS_SCHD(bind(binds[0]));
		}
		if ("MSC_STK_ID_TYP$IS_ACCPT_DFCT".equalsIgnoreCase(name)) {
			return binds -> MSC_STK_ID_TYP$IS_ACCPT_DFCT(bind(binds[0]));
		}
		if ("MSC_DLV_ID_TYP$IS_DLV".equalsIgnoreCase(name)) {
			return binds -> MSC_DLV_ID_TYP$IS_DLV(bind(binds[0]));
		}
		if ("MSC_DLV_ID_TYP$IS_LOC".equalsIgnoreCase(name)) {
			return binds -> MSC_DLV_ID_TYP$IS_LOC(bind(binds[0]));
		}
		if ("MSC_DLV_ID_TYP$IS_SPPL".equalsIgnoreCase(name)) {
			return binds -> MSC_DLV_ID_TYP$IS_SPPL(bind(binds[0]));
		}
		if ("MSC_DLV_ID_TYP$IS_CO".equalsIgnoreCase(name)) {
			return binds -> MSC_DLV_ID_TYP$IS_CO(bind(binds[0]));
		}
		if ("MSC_SCHD_STK_TYP$SCHD_STK_PRIO".equalsIgnoreCase(name)) {
			return binds -> MSC_SCHD_STK_TYP$SCHD_STK_PRIO(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_TYP$IS_UPD_LOT_TRACE(bind(binds[0]));
		}
		if ("MSC_OPER_ORD_STS_TYP$IS_OPN".equalsIgnoreCase(name)) {
			return binds -> MSC_OPER_ORD_STS_TYP$IS_OPN(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_TYP$IS_XFR_GI_ALL".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_TYP$IS_XFR_GI_ALL(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_TYP$IS_XFR_GR_ALL".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_TYP$IS_XFR_GR_ALL(bind(binds[0]));
		}
		if ("MSC_SHIP_TO_ID_TYP$IS_LOC".equalsIgnoreCase(name)) {
			return binds -> MSC_SHIP_TO_ID_TYP$IS_LOC(bind(binds[0]));
		}
		if ("MSC_SHIP_RQST_ID_TYP$IS_LOC".equalsIgnoreCase(name)) {
			return binds -> MSC_SHIP_RQST_ID_TYP$IS_LOC(bind(binds[0]));
		}
		if ("MSC_SHIP_RQST_ID_TYP$IS_SPPL".equalsIgnoreCase(name)) {
			return binds -> MSC_SHIP_RQST_ID_TYP$IS_SPPL(bind(binds[0]));
		}
		if ("MSC_IO_ACT_TYP$SLIP_SORT_SEQ".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_ACT_TYP$SLIP_SORT_SEQ(bind(binds[0]));
		}
		if ("MSC_IO_ACT_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_ACT_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MSC_MFG_APRV_STS_TYP$STATE_ORDER".equalsIgnoreCase(name)) {
			return binds -> MSC_MFG_APRV_STS_TYP$STATE_ORDER(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_STS_TYP$IS_OPN_GRP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_STS_TYP$IS_OPN_GRP(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_STS_TYP$IS_FIX_GRP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_STS_TYP$IS_FIX_GRP(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_STS_TYP$IS_SCHD_GRP(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_STS_TYP$IS_ORD_GRP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_STS_TYP$IS_ORD_GRP(bind(binds[0]));
		}
		if ("MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP".equalsIgnoreCase(name)) {
			return binds -> MSC_IO_SCHD_STS_TYP$IS_ORDSAV_GRP(bind(binds[0]));
		}
		if ("MSC_INSP_TYP$IS_BI_TGT".equalsIgnoreCase(name)) {
			return binds -> MSC_INSP_TYP$IS_BI_TGT(bind(binds[0]));
		}
		if ("MSC_IN_TO_ID_TYP$IS_LOC".equalsIgnoreCase(name)) {
			return binds -> MSC_IN_TO_ID_TYP$IS_LOC(bind(binds[0]));
		}
		return null;
	}
}
