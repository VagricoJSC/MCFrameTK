SET ESCCHAR @

-- 受注ヘッダを変更
ALTER TABLE MST_SLO_ALL DROP COLUMN JIP_CST_CD;
ALTER TABLE MST_SLO_ALL ADD (CAN_RQST_FLG CHAR(1) DEFAULT '0' NOT NULL);

DELETE FROM FCM_HISTORY_TABLE WHERE 
TABLE_NAME = 'MST_SLO_ALL'
	;

@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_@S.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_@U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_ALL_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_ALL_TR_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CO_VT/MST_SLO_ALL_TR_K.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/U_TR/MST_SLO_ALL_TR_U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_ALL_CK09.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_ALL_comment.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_comment.sql


-- 受注ヘッダ（改定履歴）を変更
CREATE TABLE MST_SLO_P_ALL_BAK AS SELECT * FROM MST_SLO_P_ALL;
DROP TABLE MST_SLO_P_ALL CASCADE CONSTRAINTS PURGE;
DROP TABLE MST_SLO_P_ALL_R CASCADE CONSTRAINTS PURGE;

DELETE FROM FCM_HISTORY_TABLE WHERE 
TABLE_NAME = 'MST_SLO_P_ALL'
	;

@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_ALL.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_@S.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_P_@U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CO_VT/MST_SLO_P_ALL_TR_K.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_P_ALL_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_P_ALL_TR_R.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/U_TR/MST_SLO_P_ALL_TR_U.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK01.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK02.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK03.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK04.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK05.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK06.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK07.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK08.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/CHECK/MST_SLO_P_ALL_CK09.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_P_ALL_comment.sql
@development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_P_comment.sql





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
)
SELECT
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
FROM MST_SLO_P_ALL_BAK;

