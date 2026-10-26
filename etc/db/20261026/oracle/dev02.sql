SET ESCCHAR @




CREATE TABLE MAM_CST_SLS_UPRI_APL_ALL_BAK AS SELECT * FROM MAM_CST_SLS_UPRI_APL_ALL;
CREATE TABLE MAM_CST_SLS_UPRI_ALL_BAK AS SELECT * FROM MAM_CST_SLS_UPRI_ALL;

DROP TABLE MAM_CST_SLS_UPRI_APL_ALL CASCADE CONSTRAINTS PURGE;
DROP TABLE MAM_CST_SLS_UPRI_ALL CASCADE CONSTRAINTS PURGE;

DROP TABLE MAM_CST_SLS_UPRI_APL_ALL_R CASCADE CONSTRAINTS PURGE;
DROP TABLE MAM_CST_SLS_UPRI_ALL_R CASCADE CONSTRAINTS PURGE;




@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_APL_ALL.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_APL.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_APL_@U.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_APL_@S.sql

@development/MA/tools/database/MABS/oracle_sqlfile/HST_TAB/MAM_CST_SLS_UPRI_APL_ALL_R.sql
@development/MA/tools/database/MABS/oracle_sqlfile/HST_TR/MAM_CST_SLS_UPRI_APL_ALL_TR_R.sql

@development/MA/tools/database/MABS/oracle_sqlfile/U_TR/MAM_CST_SLS_UPRI_APL_ALL_TR_U.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CO_VT/MAM_CST_SLS_UPRI_APL_ALL_TR_K.sql

@development/MA/tools/database/MABS/oracle_sqlfile/COMMENT/MAM_CST_SLS_UPRI_APL_comment.sql
@development/MA/tools/database/MABS/oracle_sqlfile/COMMENT/MAM_CST_SLS_UPRI_APL_ALL_comment.sql

@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_APL_ALL_CK04.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_APL_ALL_CK03.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_APL_ALL_CK02.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_APL_ALL_CK01.sql





@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_ALL.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_@U.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI_@S.sql
@development/MA/tools/database/MABS/oracle_sqlfile/OBJECT/MAM_CST_SLS_UPRI.sql

@development/MA/tools/database/MABS/oracle_sqlfile/HST_TAB/MAM_CST_SLS_UPRI_ALL_R.sql
@development/MA/tools/database/MABS/oracle_sqlfile/HST_TR/MAM_CST_SLS_UPRI_ALL_TR_R.sql

@development/MA/tools/database/MABS/oracle_sqlfile/CO_VT/MAM_CST_SLS_UPRI_ALL_TR_K.sql
@development/MA/tools/database/MABS/oracle_sqlfile/U_TR/MAM_CST_SLS_UPRI_ALL_TR_U.sql

@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_ALL_CK03.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_ALL_CK02.sql
@development/MA/tools/database/MABS/oracle_sqlfile/CHECK/MAM_CST_SLS_UPRI_ALL_CK01.sql

@development/MA/tools/database/MABS/oracle_sqlfile/other/MAM_CST_SLS_UPRI_.sql
@development/MA/tools/database/MABS/oracle_sqlfile/other/MAM_CST_SLS_UPRI.sql

@development/MA/tools/database/MABS/oracle_sqlfile/COMMENT/MAM_CST_SLS_UPRI_comment.sql
@development/MA/tools/database/MABS/oracle_sqlfile/COMMENT/MAM_CST_SLS_UPRI__comment.sql
@development/MA/tools/database/MABS/oracle_sqlfile/COMMENT/MAM_CST_SLS_UPRI_ALL_comment.sql

@development/MA/tools/database/MABS/oracle_sqlfile/other/MAVM_CST_SLS_UPRI.sql





--MAM_CST_SLS_UPRI_APL_ALL
INSERT INTO MAM_CST_SLS_UPRI_APL_ALL (
CST_CD
, DLV_CD
, DEST_CD1
, DEST_CD2
, DEST_CD3
, SLS_UPRI_GRP_CD
, ITM_CD
, ITM_SUB1
, ITM_SUB2
, ITM_SUB3
, UNIT_CD
, LOT_QTY
, CUR_CD
, WG_CD
, ST_DT
, CO_CD
, END_DT
, UPRI
, UPRI_BF
, INTERIM_FLG
, UPRI_RATE
, UPRI_RATE_BF
, SUB_UPRI1
, SUB_UPRI2
, SUB_UPRI3
, NOT_COST_FLG
, MEMO1
, MEMO2
, MEMO3
, DEL_FLG
, DEL_USR_ID
, DEL_USR_NM
, DEL_TS
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
, APL_NO
, ST_DT_BF
, APRV_NO
, REF_FLG
, MST_APL_MEMO
)
SELECT
CST_CD
, DLV_CD
, DEST_CD1
, DEST_CD2
, DEST_CD3
, SLS_UPRI_GRP_CD
, ITM_CD
, ITM_SUB1
, ITM_SUB2
, ITM_SUB3
, UNIT_CD
, LOT_QTY
, CUR_CD
, WG_CD
, ST_DT
, CO_CD
, END_DT
, UPRI
, UPRI_BF
, INTERIM_FLG
, UPRI_RATE
, UPRI_RATE_BF
, SUB_UPRI1
, SUB_UPRI2
, SUB_UPRI3
, NOT_COST_FLG
, MEMO1
, MEMO2
, MEMO3
, DEL_FLG
, DEL_USR_ID
, DEL_USR_NM
, DEL_TS
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
, APL_NO
, ST_DT_BF
, APRV_NO
, REF_FLG
, MST_APL_MEMO
FROM MAM_CST_SLS_UPRI_APL_ALL_BAK;




--MAM_CST_SLS_UPRI_APL_ALL
INSERT INTO MAM_CST_SLS_UPRI_ALL (
CST_CD
, DLV_CD
, DEST_CD1
, DEST_CD2
, DEST_CD3
, SLS_UPRI_GRP_CD
, ITM_CD
, ITM_SUB1
, ITM_SUB2
, ITM_SUB3
, UNIT_CD
, LOT_QTY
, CUR_CD
, WG_CD
, ST_DT
, CO_CD
, END_DT
, UPRI
, UPRI_BF
, INTERIM_FLG
, UPRI_RATE
, UPRI_RATE_BF
, SUB_UPRI1
, SUB_UPRI2
, SUB_UPRI3
, NOT_COST_FLG
, MEMO1
, MEMO2
, MEMO3
, DEL_FLG
, DEL_USR_ID
, DEL_USR_NM
, DEL_TS
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
CST_CD
, DLV_CD
, DEST_CD1
, DEST_CD2
, DEST_CD3
, SLS_UPRI_GRP_CD
, ITM_CD
, ITM_SUB1
, ITM_SUB2
, ITM_SUB3
, UNIT_CD
, LOT_QTY
, CUR_CD
, WG_CD
, ST_DT
, CO_CD
, END_DT
, UPRI
, UPRI_BF
, INTERIM_FLG
, UPRI_RATE
, UPRI_RATE_BF
, SUB_UPRI1
, SUB_UPRI2
, SUB_UPRI3
, NOT_COST_FLG
, MEMO1
, MEMO2
, MEMO3
, DEL_FLG
, DEL_USR_ID
, DEL_USR_NM
, DEL_TS
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
FROM MAM_CST_SLS_UPRI_ALL_BAK;