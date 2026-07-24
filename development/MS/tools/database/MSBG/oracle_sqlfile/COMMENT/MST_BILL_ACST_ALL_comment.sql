
COMMENT ON TABLE MST_BILL_ACST_ALL IS '売掛先別請求 // Billing by AR customer';


COMMENT ON COLUMN MST_BILL_ACST_ALL.BILL_ACST_NO IS '売掛別請求ＮＯ // #MA.BILL_ACST_NO // Billing No. by AR customer';


COMMENT ON COLUMN MST_BILL_ACST_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_BILL_ACST_ALL.BILL_MNG_NO IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN MST_BILL_ACST_ALL.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MST_BILL_ACST_ALL.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_BILL_ACST_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_BILL_ACST_ALL.AR_TYP IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN MST_BILL_ACST_ALL.LAST_BILL_AMT IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.XFR_AMT IS '今回振込入金額 // #MA.MONEY // Current transfer payment received amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.NOTE_AMT IS '今回手形入金額 // #MA.MONEY // Current notes payment received amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.CASH_AMT IS '今回現金入金額 // #MA.MONEY // Current cash payment received amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SETOFF_AMT IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SETOFF_TAX_AMT IS '今回相殺税額 // #MA.MONEY // Current offset tax amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SW_AMT IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.BFW_AMT IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SLS_AMT IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.RET_AMT IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.DSCNT_AMT IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SW_TO_AMT IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN MST_BILL_ACST_ALL.TAX_AMT IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.BILL_AMT IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SUB_CHAR1 IS '予備１ // #MS.BILL_ACST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SUB_CHAR2 IS '予備２ // #MS.BILL_ACST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_BILL_ACST_ALL.SUB_CHAR3 IS '予備３ // #MS.BILL_ACST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_BILL_ACST_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_ACST_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_ACST_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_ACST_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_ACST_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

