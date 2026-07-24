
COMMENT ON TABLE MST_BILL_D_APPL_BAL IS '請求明細消込残高 // Billing details reconciled balance';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.BILL_D_NO IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.PARENT_BILL_D_NO IS '親請求明細ＮＯ // #MA.BILL_D_NO // Parent billing details No.';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.LAST_APPL_DT IS '最終消込日 // #MA.DT // Last reconciled date';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.APPL_TGT_AMT IS '消込対象額 // #MA.MONEY // Reconciled target amount';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.APPL_AMT IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.NOT_APPL_BAL IS '消込残高 // #MA.MONEY // Reconciled balance';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.SUB_CHAR1 IS '予備１ // #MS.BILL_D_APPL_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.SUB_CHAR2 IS '予備２ // #MS.BILL_D_APPL_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.SUB_CHAR3 IS '予備３ // #MS.BILL_D_APPL_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_D_APPL_BAL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

