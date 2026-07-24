
COMMENT ON TABLE MST_AR_APPL_SCHD_ALL IS '売掛消込予定 // AR reconciliation schedule';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.AR_APPL_SCHD_NO IS '売掛消込予定ＮＯ // #MA.AR_APPL_SCHD_NO // AR reconciliation schedule No.';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.BILL_ACST_NO IS '売掛別請求ＮＯ // #MA.BILL_ACST_NO // Billing No. by AR customer';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.AR_TYP IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.RCV_MTD_CD IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.RCV_SCHD_DT IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.APPL_TGT_AMT IS '消込対象額 // #MA.MONEY // Reconciled target amount';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.APPL_AMT IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.NOT_APPL_BAL IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.SUB_CHAR1 IS '予備１ // #MS.AR_APPL_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.SUB_CHAR2 IS '予備２ // #MS.AR_APPL_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.SUB_CHAR3 IS '予備３ // #MS.AR_APPL_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_AR_APPL_SCHD_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

