
COMMENT ON TABLE MAM_STTL_CMN IS '決済方法マスタ_（共通）_ // Settlement method master_(Common)_';


COMMENT ON COLUMN MAM_STTL_CMN.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MAM_STTL_CMN.STTL_NM IS '決済方法名 // #MA.STTL_NM // Settlement method name';


COMMENT ON COLUMN MAM_STTL_CMN.AR_STTL_FLG IS '債権決済方法ＦＬＧ // #MA.FLG // AR settlement method flg.';


COMMENT ON COLUMN MAM_STTL_CMN.AP_STTL_FLG IS '債務決済方法ＦＬＧ // #MA.FLG // AP settlement method flg.';


COMMENT ON COLUMN MAM_STTL_CMN.AR_STTL_TYP IS '債権決済区分 // #MA.AR_STTL_TYP // AR settlement type';


COMMENT ON COLUMN MAM_STTL_CMN.RCV_REG_TYP IS '入金登録区分 // #MA.RCV_REG_TYP // Payment received entry type';


COMMENT ON COLUMN MAM_STTL_CMN.SLS_PURC_TYP IS '売上仕入税区分 // #MA.SLS_PURC_TYP // Sales purchase tax type';


COMMENT ON COLUMN MAM_STTL_CMN.CALC_COM_PAID_FLG IS '手数料計算ＦＬＧ // #MA.FLG // Fee calculation flg.';


COMMENT ON COLUMN MAM_STTL_CMN.AR_SETOFF_CD IS '相殺方法ＣＤ // #MA.STTL_CD // Offset method cd.';


COMMENT ON COLUMN MAM_STTL_CMN.DEBT_CRED_ID_TYP IS '債権債務先識別区分 // #MA.DEBT_CRED_ID_TYP // AR/AP BP identification type';


COMMENT ON COLUMN MAM_STTL_CMN.AP_STTL_TYP IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN MAM_STTL_CMN.AP_SETOFF_TYP IS '債務相殺先区分 // #MA.AP_SETOFF_TYP // AP offset destination type';


COMMENT ON COLUMN MAM_STTL_CMN.AP_SETOFF_ACT_FLG IS '債務相殺実績計上ＦＬＧ // #MA.FLG // AP offset result recording flg.';


COMMENT ON COLUMN MAM_STTL_CMN.BILL_TAX_DISP_FLG IS '請求書税額表示ＦＬＧ // #MA.FLG // Display tax amount on invoice flg.';


COMMENT ON COLUMN MAM_STTL_CMN.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAM_STTL_CMN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_STTL_CMN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_STTL_CMN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_STTL_CMN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_STTL_CMN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_STTL_CMN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_STTL_CMN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_STTL_CMN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_STTL_CMN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_STTL_CMN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_STTL_CMN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_STTL_CMN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

