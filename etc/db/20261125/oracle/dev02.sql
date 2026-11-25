SET ESCCHAR @

CREATE TABLE MST_SLO_ALL_BAK AS SELECT * FROM MST_SLO_ALL;
CREATE TABLE MST_SLO_P_ALL_BAK AS SELECT * FROM MST_SLO_P_ALL;

DROP TABLE MST_SLO_ALL CASCADE CONSTRAINTS PURGE;
DROP TABLE MST_SLO_P_ALL CASCADE CONSTRAINTS PURGE;

DROP TABLE MST_SLO_ALL_R CASCADE CONSTRAINTS PURGE;
DROP TABLE MST_SLO_P_ALL_R CASCADE CONSTRAINTS PURGE;

DELETE FROM FCM_HISTORY_TABLE WHERE 
TABLE_NAME = 'MST_SLO_ALL'
OR TABLE_NAME = 'MST_SLO_P_ALL'
	;


@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_ALL.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_@S.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_@U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_ALL_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_ALL_TR_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CO_VT/MST_SLO_ALL_TR_K.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK01.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK02.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK03.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK04.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK05.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK06.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK07.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK08.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_ALL_comment.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_comment.sql



@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_ALL.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_@S.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_@U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_P_ALL_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_P_ALL_TR_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/U_TR/MST_SLO_ALL_TR_U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/U_TR/MST_SLO_P_ALL_TR_U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CO_VT/MST_SLO_P_ALL_TR_K.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK01.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK02.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK03.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK04.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK05.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK06.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK07.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK08.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_P_ALL_comment.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_P_comment.sql



--MST_SLO_ALL
INSERT INTO MST_SLO_ALL (
SLO_NO
, CO_CD
, SLO_REV
, TRD_CD
, TRD_PTN_TYP
, SLO_DT
, SLO_TYP
, CST_CD
, CST_PO_NO
, CST_PO_REV
, TRD_CUR_CD
, XRATE_INPT_FLG
, XRATE
, PTAX_XRATE_INPT_FLG
, PTAX_XRATE
, SLS_USR_CD
, SLS_DPT_CD
, WG_CD
, IV_NO
, TTERM_CD1
, TTERM_RMRKS1
, TTERM_CD2
, TTERM_RMRKS2
, TTERM_CD3
, TTERM_RMRKS3
, TRNSPT_CD
, VSSL_FLGHT
, LOAD_PORT_CD
, ETD_DT
, DSCHRG_PORT_CD
, ETA_DT
, VIA_PORT_CD
, VIA_SCHD_DT
, ASSORT_TYP
, SLS_BASIS_TYP
, AR_DPT_CD
, WRK_NO
, RCPT_DT
, RCPT_USR_CD
, TRD_RMRKS
, INTR_RMRKS
, CST_PO_RMRKS
, QTN_NO
, QTN_REV
, ADV_SHIP_CTRL_TYP
, ADV_BILL_AMT
, ADV_RCV_AMT
, SUB_CHAR1
, SUB_CHAR2
, SUB_CHAR3
, APRV_FLG
, APRV_NO
, APRV_STS_TYP
, EDI_FLG
, CAN_FLG
, CAN_RSN_CD
, CAN_RMRKS
, CRED_UPD_AMT
, EDI_SUB_CHAR1
, EDI_SUB_CHAR2
, EDI_SUB_CHAR3
, EDI_SUB_CHAR4
, EDI_SUB_CHAR5
, EDI_SUB_NUM1
, EDI_SUB_DT1
, INS_USR_ID
, INS_USR_NM
, INS_TS
, INS_FUNC_ID
, UPD_CNTR
, UPD_USR_ID
, UPD_USR_NM
, UPD_TS
, UPD_FUNC_ID
, UPD_SRV_REQ_NO
, SLS_DT
, SLO_APRV_DT
, APRV_DT
, SHIP_PRNT_NO_CST_NM_FLG
, SRC_WRK_NO
, ZOHO_SLS_SCHD_NO
, SLO_LAST_SLS_FLG
, PROD_ITM_CD
, PROD_ITM_SUB1
, PROD_ITM_SUB2
, PROD_ITM_SUB3
, PROD_ITM_NM
, SURV_LINE_QTY
, DIAMETER
, MATCH_KEY
, RCPT_NO
, APPL_DOC_NO
, DLV_DRAW_NO
, SLO_NUM_TYP
, SLO_NUM
, HDR_QTY
, HDR_AMT
, PAINT_CLR
, SALES_COND
, SHIP_SP_INSTR_TYP
, SPEC_DLV_NOTE_TYP
, ORD_DLV_DT
, MRKT_CD
, CNTRY_SIGN
, VES_NATL
, SHIPYARD_CD
, VES_NO
, VES_NM
, TONNAGE
, VES_TYP
, INSP_STD
, ROYALTY_TRG_AMT
, ROYALTY_PSPPL
, INS_LOC_1
, INS_LOC_2
, SFI_NO
, PS_SAL_AFT_DT
, WIT_INSP_TYP
, EQUIP_TYP
, SPEC_DOC_TYP
, MODEL_JP_EN_TYP
, INSP_REP_TYP
, INSP_REP_QTY
, CONS_DRAW_TYP
, CONS_DRAW_QTY
, CONST_DRAW_TYP
, CONST_DRAW_QTY
, COMP_DRAW_TYP
, COMP_DRAW_QTY
, INST_MANUAL_TYP
, INST_MANUAL_QTY
, APRV_DRAW_TYP
, APRV_DRAW_QTY
, SLO_CNG_RSN
, FRC_RSN_CD
, MAIN_DRAW_NO
, SLO_CMNT_1
, SLO_CMNT_2
, SLO_CMNT_3
, SLO_CMNT_4
, SLO_CMNT_5
, SRC_SHIP_FLG
, JIP_SLO_TYP

FROM MST_SLO_ALL_BAK;



--MST_SLO_P_ALL
INSERT INTO MST_SLO_P_ALL (
SLO_NO
, CO_CD
, SLO_REV
, TRD_CD
, TRD_PTN_TYP
, SLO_DT
, SLO_TYP
, CST_CD
, CST_PO_NO
, CST_PO_REV
, TRD_CUR_CD
, XRATE_INPT_FLG
, XRATE
, PTAX_XRATE_INPT_FLG
, PTAX_XRATE
, SLS_USR_CD
, SLS_DPT_CD
, WG_CD
, IV_NO
, TTERM_CD1
, TTERM_RMRKS1
, TTERM_CD2
, TTERM_RMRKS2
, TTERM_CD3
, TTERM_RMRKS3
, TRNSPT_CD
, VSSL_FLGHT
, LOAD_PORT_CD
, ETD_DT
, DSCHRG_PORT_CD
, ETA_DT
, VIA_PORT_CD
, VIA_SCHD_DT
, ASSORT_TYP
, SLS_BASIS_TYP
, AR_DPT_CD
, WRK_NO
, RCPT_DT
, RCPT_USR_CD
, TRD_RMRKS
, INTR_RMRKS
, CST_PO_RMRKS
, QTN_NO
, QTN_REV
, ADV_SHIP_CTRL_TYP
, ADV_BILL_AMT
, ADV_RCV_AMT
, SUB_CHAR1
, SUB_CHAR2
, SUB_CHAR3
, APRV_FLG
, APRV_NO
, APRV_STS_TYP
, EDI_FLG
, CAN_FLG
, CAN_RSN_CD
, CAN_RMRKS
, CRED_UPD_AMT
, EDI_SUB_CHAR1
, EDI_SUB_CHAR2
, EDI_SUB_CHAR3
, EDI_SUB_CHAR4
, EDI_SUB_CHAR5
, EDI_SUB_NUM1
, EDI_SUB_DT1
, INS_USR_ID
, INS_USR_NM
, INS_TS
, INS_FUNC_ID
, UPD_CNTR
, UPD_USR_ID
, UPD_USR_NM
, UPD_TS
, UPD_FUNC_ID
, UPD_SRV_REQ_NO
, SLS_DT
, SLO_APRV_DT
, APRV_DT
, SHIP_PRNT_NO_CST_NM_FLG
, SRC_WRK_NO
, ZOHO_SLS_SCHD_NO
, SLO_LAST_SLS_FLG
, PROD_ITM_CD
, PROD_ITM_SUB1
, PROD_ITM_SUB2
, PROD_ITM_SUB3
, PROD_ITM_NM
, SURV_LINE_QTY
, DIAMETER
, MATCH_KEY
, RCPT_NO
, APPL_DOC_NO
, DLV_DRAW_NO
, SLO_NUM_TYP
, SLO_NUM
, HDR_QTY
, HDR_AMT
, PAINT_CLR
, SALES_COND
, SHIP_SP_INSTR_TYP
, SPEC_DLV_NOTE_TYP
, ORD_DLV_DT
, MRKT_CD
, CNTRY_SIGN
, VES_NATL
, SHIPYARD_CD
, VES_NO
, VES_NM
, TONNAGE
, VES_TYP
, INSP_STD
, ROYALTY_TRG_AMT
, ROYALTY_PSPPL
, INS_LOC_1
, INS_LOC_2
, SFI_NO
, PS_SAL_AFT_DT
, WIT_INSP_TYP
, EQUIP_TYP
, SPEC_DOC_TYP
, MODEL_JP_EN_TYP
, INSP_REP_TYP
, INSP_REP_QTY
, CONS_DRAW_TYP
, CONS_DRAW_QTY
, CONST_DRAW_TYP
, CONST_DRAW_QTY
, COMP_DRAW_TYP
, COMP_DRAW_QTY
, INST_MANUAL_TYP
, INST_MANUAL_QTY
, APRV_DRAW_TYP
, APRV_DRAW_QTY
, SLO_CNG_RSN
, FRC_RSN_CD
, MAIN_DRAW_NO
, SLO_CMNT_1
, SLO_CMNT_2
, SLO_CMNT_3
, SLO_CMNT_4
, SLO_CMNT_5
, SRC_SHIP_FLG
, JIP_SLO_TYP

FROM MST_SLO_P_ALL_BAK;

