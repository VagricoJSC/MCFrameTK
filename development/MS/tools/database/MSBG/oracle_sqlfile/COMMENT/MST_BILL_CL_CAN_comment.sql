
COMMENT ON TABLE MST_BILL_CL_CAN IS '請求締解除実績 // Billing closing cancel result';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_MNG_NO IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_CL_DT IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_NO IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_REV IS '請求書改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN MST_BILL_CL_CAN.PRE_BILL_NO IS '先行請求書ＮＯ // #MA.PRE_BILL_NO // Advance invoice No.';


COMMENT ON COLUMN MST_BILL_CL_CAN.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_XRATE IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN MST_BILL_CL_CAN.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_CL_CAN.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_DPT_CD IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN MST_BILL_CL_CAN.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_DT IS '請求日 // #MA.DT // Billing date';


COMMENT ON COLUMN MST_BILL_CL_CAN.PRE_BILL_DT IS '先行請求日 // #MA.DT // Advance billing date';


COMMENT ON COLUMN MST_BILL_CL_CAN.LAST_BILL_AMT IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.XFR_AMT IS '今回振込入金額 // #MA.MONEY // Current transfer payment received amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.NOTE_AMT IS '今回手形入金額 // #MA.MONEY // Current notes payment received amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.CASH_AMT IS '今回現金入金額 // #MA.MONEY // Current cash payment received amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.SETOFF_AMT IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.SETOFF_TAX_AMT IS '今回相殺税額 // #MA.MONEY // Current offset tax amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.SW_AMT IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.BFW_AMT IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.SLS_AMT IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.RET_AMT IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.DSCNT_AMT IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.SW_TO_AMT IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN MST_BILL_CL_CAN.TAX_AMT IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_AMT IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.ADV_AMT_BAL IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN MST_BILL_CL_CAN.ADV_AMT IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.ADV_SETOFF_AMT IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.ADV_SETOFF_TAX_AMT IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_EACH_SLS_FLG IS '売上都度請求ＦＬＧ // #MA.FLG // Billing at each sales flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_CL_STS_TYP IS '請求締状況区分 // #MS.BILL_CL_STS_TYP // Billing closing status type';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_CL_TYP IS '請求締処理区分 // #MA.BILL_CL_TYP // Billing closing type';


COMMENT ON COLUMN MST_BILL_CL_CAN.FOREIGN_FLG IS '国外ＦＬＧ // #MA.FLG // Foreign flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_TAX_CALC_TYP IS '税計算区分 // #MS.BILL_TAX_CALC_TYP // Tax calculation type';


COMMENT ON COLUMN MST_BILL_CL_CAN.PRNT_FLG IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BILL_RQ_FLG IS '請求書要否ＦＬＧ // #MA.FLG // Invoice required flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.BASE_DT IS '基準日 // #MA.DT // Base date';


COMMENT ON COLUMN MST_BILL_CL_CAN.RCV_SCHD_AMT IS '入金予定額 // #MA.MONEY // Amount of payment receipt schedule';


COMMENT ON COLUMN MST_BILL_CL_CAN.RCV_ACT_AMT IS '入金実績額 // #MA.MONEY // Payment received result amount';


COMMENT ON COLUMN MST_BILL_CL_CAN.NOT_APPL_BAL IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN MST_BILL_CL_CAN.LAST_RCV_DT IS '最終入金日 // #MA.DT // Last payment received date';


COMMENT ON COLUMN MST_BILL_CL_CAN.RCV_SCHD_ADJST_FLG IS '入金予定調整済ＦＬＧ // #MA.FLG // Payment receipt schedule adjusted flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.EDI_FLG IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.EXISTS_INTERIM_FLG IS '仮単価存在ＦＬＧ // #MA.FLG // Temporary unit price exist flg.';


COMMENT ON COLUMN MST_BILL_CL_CAN.DTL_CNT IS '請求明細数 // #MA.MONEY // Number of billing details';


COMMENT ON COLUMN MST_BILL_CL_CAN.SUB_CHAR1 IS '予備１ // #MS.BILL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_BILL_CL_CAN.SUB_CHAR2 IS '予備２ // #MS.BILL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_BILL_CL_CAN.SUB_CHAR3 IS '予備３ // #MS.BILL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_BILL_CL_CAN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_CL_CAN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_CL_CAN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_CL_CAN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_CL_CAN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

