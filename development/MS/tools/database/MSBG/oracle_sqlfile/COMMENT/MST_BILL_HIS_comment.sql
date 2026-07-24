
COMMENT ON TABLE MST_BILL_HIS IS '請求書ヘッダ履歴 // Invoice header history';


COMMENT ON COLUMN MST_BILL_HIS.BILL_HIS_NO IS '請求書履歴ＮＯ // #MA.BILL_HIS_NO // Invoice history No.';


COMMENT ON COLUMN MST_BILL_HIS.BILL_NO IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_HIS.BILL_REV IS '請求書改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN MST_BILL_HIS.LATEST_FLG IS '最新ＦＬＧ // #MA.FLG // Latest flg.';


COMMENT ON COLUMN MST_BILL_HIS.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_BILL_HIS.BILL_CL_DT IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN MST_BILL_HIS.BILL_EACH_SLS_FLG IS '売上都度請求ＦＬＧ // #MA.FLG // Billing at each sales flg.';


COMMENT ON COLUMN MST_BILL_HIS.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_HIS.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_BILL_HIS.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_BILL_HIS.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_BILL_HIS.BILL_XRATE IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN MST_BILL_HIS.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_BILL_HIS.LAST_BILL_AMT IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN MST_BILL_HIS.RCV_AMT IS '今回入金額 // #MA.MONEY // Current payment received amount';


COMMENT ON COLUMN MST_BILL_HIS.SW_AMT IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN MST_BILL_HIS.BFW_AMT IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN MST_BILL_HIS.SLS_AMT IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN MST_BILL_HIS.DSCNT_AMT IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN MST_BILL_HIS.RET_AMT IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN MST_BILL_HIS.SETOFF_AMT IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN MST_BILL_HIS.TAX_AMT IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN MST_BILL_HIS.SW_TO_AMT IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN MST_BILL_HIS.BILL_AMT IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN MST_BILL_HIS.ADV_AMT_BAL IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN MST_BILL_HIS.ADV_AMT IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN MST_BILL_HIS.ADV_SETOFF_AMT IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN MST_BILL_HIS.ADV_SETOFF_TAX_AMT IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN MST_BILL_HIS.SUB_CHAR1 IS '予備１ // #MS.BILL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_BILL_HIS.SUB_CHAR2 IS '予備２ // #MS.BILL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_BILL_HIS.SUB_CHAR3 IS '予備３ // #MS.BILL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_BILL_HIS.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_HIS.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_HIS.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_HIS.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_HIS.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_HIS.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_HIS.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_HIS.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_HIS.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_HIS.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

