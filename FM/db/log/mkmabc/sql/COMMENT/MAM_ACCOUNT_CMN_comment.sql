
COMMENT ON TABLE MAM_ACCOUNT_CMN IS '勘定科目マスタ_（共通）_ // Account master_(Common)_';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_CD IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_NM IS '勘定科目名 // #MA.AC_NM // Account name';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_NM2 IS '勘定科目略名 // #MA.AC_NM2 // Account abbreviation name';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.DC_TYP IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUB_FLG IS '補助科目使用ＦＬＧ // #MA.FLG // Subsidiary account used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP IS '勘定科目区分 // #MA.AC_CD_TYP // Account type';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TAX_CD IS '会計税ＣＤ // #MA.AC_TAX_CD // Accounting tax cd.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TAX_TYP IS '会計税区分 // #MA.AC_TAX_TYP // Accounting tax type';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.FOREIGN_FLG IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM0_FLG IS '集計０使用ＦＬＧ // #MA.FLG // Aggregated 0 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM1_FLG IS '集計１使用ＦＬＧ // #MA.FLG // Aggregated 1 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM2_FLG IS '集計２使用ＦＬＧ // #MA.FLG // Aggregated 2 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM3_FLG IS '集計３使用ＦＬＧ // #MA.FLG // Aggregated 3 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM4_FLG IS '集計４使用ＦＬＧ // #MA.FLG // Aggregated 4 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.SUM5_FLG IS '集計５使用ＦＬＧ // #MA.FLG // Aggregated 5 used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.PROJECT_FLG IS 'プロジェクト使用ＦＬＧ // #MA.FLG // Project used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.BP_FLG IS '取引先使用ＦＬＧ // #MA.FLG // BP used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.USR_FLG IS '担当者使用ＦＬＧ // #MA.FLG // PIC used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.BANK_AC_FLG IS '口座使用ＦＬＧ // #MA.FLG // Bank account used flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AP_TYP IS 'ＡＰ科目区分 // #MA.AC_TYP // AP type';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AR_TYP IS 'ＡＲ科目区分 // #MA.AC_TYP // AR type';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP1 IS '科目予備区分１ // #MA.AC_TYP // Account spare type 1';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP2 IS '科目予備区分２ // #MA.AC_TYP // Account spare type 2';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP3 IS '科目予備区分３ // #MA.AC_TYP // Account spare type 3';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP4 IS '科目予備区分４ // #MA.AC_TYP // Account spare type 4';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.AC_TYP5 IS '科目予備区分５ // #MA.AC_TYP // Account spare type 5';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_ACCOUNT_CMN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

