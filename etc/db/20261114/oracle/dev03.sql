SET ESCCHAR @

-- 受注明細にカラムを追加
ALTER TABLE MST_SLO_D_ALL ADD (
    WRK_BR_NO     VARCHAR2(20 CHAR)  NULL,
    LIST_UPRI     NUMBER(21,8)       NULL,
    WL_SALE_UPRI  NUMBER(21,8)       NULL,
    UPRI_TYP      VARCHAR2(1 CHAR)   NULL,
    RATE          NUMBER(5,2)        NULL,
    COLOR         VARCHAR2(100 CHAR) NULL,
    NM_PLT        VARCHAR2(100 CHAR) NULL,
    CST_ITM_NO    VARCHAR2(3 CHAR)   NULL,
    EST_COST      NUMBER(21,8)       NULL,
    MATCH_DTL_KEY VARCHAR2(3 CHAR)   NULL,
    SLO_D_CMNT_1  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_2  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_3  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_4  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_5  VARCHAR2(100 CHAR) NULL
);

-- 受注明細（改定履歴）にカラムを追加
ALTER TABLE MST_SLO_D_P_ALL ADD (
    WRK_BR_NO     VARCHAR2(20 CHAR)  NULL,
    LIST_UPRI     NUMBER(21,8)       NULL,
    WL_SALE_UPRI  NUMBER(21,8)       NULL,
    UPRI_TYP      VARCHAR2(1 CHAR)   NULL,
    RATE          NUMBER(5,2)        NULL,
    COLOR         VARCHAR2(100 CHAR) NULL,
    NM_PLT        VARCHAR2(100 CHAR) NULL,
    CST_ITM_NO    VARCHAR2(3 CHAR)   NULL,
    EST_COST      NUMBER(21,8)       NULL,
    MATCH_DTL_KEY VARCHAR2(3 CHAR)   NULL,
    SLO_D_CMNT_1  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_2  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_3  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_4  VARCHAR2(100 CHAR) NULL,
    SLO_D_CMNT_5  VARCHAR2(100 CHAR) NULL
);

DROP TABLE MST_SLO_D_ALL_R CASCADE CONSTRAINTS PURGE;
DROP TABLE MST_SLO_D_P_ALL_R CASCADE CONSTRAINTS PURGE;

DELETE FROM FCM_HISTORY_TABLE WHERE 
TABLE_NAME = 'MST_SLO_D_ALL'
	OR TABLE_NAME = 'MST_SLO_D_P_ALL'
	;
	
development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D.sql
development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D_@S.sql
development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D_@U.sql

development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D_P.sql
development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D_P_@S.sql
development/MS/tools/database/MSBB/oracle_sqlfile/OBJECT/MST_SLO_D_P_@U.sql

development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_D_ALL_R.sql
development/MS/tools/database/MSBB/oracle_sqlfile/HST_TAB/MST_SLO_D_P_ALL_R.sql
development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_D_ALL_TR_R.sql
development/MS/tools/database/MSBB/oracle_sqlfile/HST_TR/MST_SLO_D_P_ALL_TR_R.sql

development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_D_ALL_comment.sql
development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_D_P_ALL_comment.sql
development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_D_P_comment.sql
development/MS/tools/database/MSBB/oracle_sqlfile/COMMENT/MST_SLO_D_comment.sql
