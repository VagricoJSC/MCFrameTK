
COMMENT ON TABLE MST_MLY_AP_BAL IS '月次買掛残高 // Monthly AP balance';


COMMENT ON COLUMN MST_MLY_AP_BAL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_MLY_AP_BAL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_MLY_AP_BAL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_MLY_AP_BAL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_MLY_AP_BAL.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_MLY_AP_BAL.RCPT_IV_MNG_NO IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN MST_MLY_AP_BAL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_MLY_AP_BAL.AP_TYP IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN MST_MLY_AP_BAL.INIT_BAL IS '月初残高 // #MA.MONEY // Beginning balance';


COMMENT ON COLUMN MST_MLY_AP_BAL.PURC_AMT IS '当月仕入額 // #MA.MONEY // Purchase amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.RET_AMT IS '当月返品額 // #MA.MONEY // Return amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.DSCNT_AMT IS '当月値引額 // #MA.MONEY // Discount amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.SW_TO_AMT IS '当月振替額（振替先） // #MA.MONEY // Transferred amount (Current month)(Transfer)';


COMMENT ON COLUMN MST_MLY_AP_BAL.TAX_AMT IS '当月税額 // #MA.MONEY // Tax amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.CASH_AMT IS '当月現金支払額 // #MA.MONEY // Cash payment amount of current month';


COMMENT ON COLUMN MST_MLY_AP_BAL.NOTE_AMT IS '当月手形支払額 // #MA.MONEY // Notes payment amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.ACCOUNT_AMT IS '当月預金支払額 // #MA.MONEY // Deposit payment amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.SETOFF_AMT IS '当月相殺額 // #MA.MONEY // Offset amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.SW_AMT IS '当月振替額 // #MA.MONEY // Transferred amount (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.END_BAL IS '当月残高 // #MA.MONEY // Balance (Current month)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_INIT_BAL IS '基準通貨月初残高 // #MA.MONEY // Beginning balance (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_PURC_AMT IS '基準通貨当月仕入額 // #MA.MONEY // Current month purchase amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_RET_AMT IS '基準通貨当月返品額 // #MA.MONEY // Current month return amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_DSCNT_AMT IS '基準通貨当月値引額 // #MA.MONEY // Current month discount amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_SW_TO_AMT IS '基準通貨当月振替額（振替先） // #MA.MONEY // Current month transfer amount (Transfer) (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_TAX_AMT IS '基準通貨当月税額 // #MA.MONEY // Current month tax amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_CASH_AMT IS '基準通貨当月現金支払額 // #MA.MONEY // Current month cash payment amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_NOTE_AMT IS '基準通貨当月手形支払額 // #MA.MONEY // Current month notes payment amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_ACCOUNT_AMT IS '基準通貨当月預金支払額 // #MA.MONEY // Current month deposit payment amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_SETOFF_AMT IS '基準通貨当月相殺額 // #MA.MONEY // Current month offset amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_SW_AMT IS '基準通貨当月振替額 // #MA.MONEY // Current month transfer amount (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.BASE_CUR_END_BAL IS '基準通貨当月残高 // #MA.MONEY // Current month balance (Base currency)';


COMMENT ON COLUMN MST_MLY_AP_BAL.EXC_GAIN_LOSS IS '為替差損益 // #MA.MONEY // Exchange gain/loss';


COMMENT ON COLUMN MST_MLY_AP_BAL.TOTAL_EXC_GAIN_LOSS IS '累計為替差損益 // #MA.MONEY // Accumulation exchange gain/loss';


COMMENT ON COLUMN MST_MLY_AP_BAL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_MLY_AP_BAL.SUB_CHAR1 IS '予備１ // #MS.MLY_AP_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_MLY_AP_BAL.SUB_CHAR2 IS '予備２ // #MS.MLY_AP_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_MLY_AP_BAL.SUB_CHAR3 IS '予備３ // #MS.MLY_AP_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_MLY_AP_BAL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_MLY_AP_BAL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_MLY_AP_BAL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_MLY_AP_BAL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_MLY_AP_BAL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

