
COMMENT ON TABLE MST_ONR_PROV_BAL IS '有償支給残高情報 // Chargeable supply balance info.';


COMMENT ON COLUMN MST_ONR_PROV_BAL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_ONR_PROV_BAL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_ONR_PROV_BAL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_ONR_PROV_BAL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_ONR_PROV_BAL.INIT_BAL IS '月初残高 // #MA.MONEY // Beginning balance';


COMMENT ON COLUMN MST_ONR_PROV_BAL.ONR_PROV_AMT IS '当月有償支給額 // #MA.MONEY // Chargeable supply amount (Current month)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.ONR_PROV_RET_AMT IS '当月有償支給戻し額 // #MA.MONEY // Chargeable supply refundable amount (Current month)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.SETOFF_AMT IS '当月相殺額 // #MA.MONEY // Offset amount (Current month)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.TAX_AMT IS '当月税額 // #MA.MONEY // Tax amount (Current month)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.END_BAL IS '当月残高 // #MA.MONEY // Balance (Current month)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_INIT_BAL IS '基準通貨月初残高 // #MA.MONEY // Beginning balance (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_ONR_PROV_AMT IS '基準通貨当月有償支給額 // #MA.MONEY // Current month chargeable supply amount (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_ONR_PROV_RET_AMT IS '基準通貨当月有償支給戻し額 // #MA.MONEY // Current month chargeable supply repayment amount (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_SETOFF_AMT IS '基準通貨当月相殺額 // #MA.MONEY // Current month offset amount (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_TAX_AMT IS '基準通貨当月税額 // #MA.MONEY // Current month tax amount (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.BASE_CUR_END_BAL IS '基準通貨当月残高 // #MA.MONEY // Current month balance (Base currency)';


COMMENT ON COLUMN MST_ONR_PROV_BAL.SUB_CHAR1 IS '予備１ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ONR_PROV_BAL.SUB_CHAR2 IS '予備２ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ONR_PROV_BAL.SUB_CHAR3 IS '予備３ // #MS.MLY_ONR_PROV_BAL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ONR_PROV_BAL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ONR_PROV_BAL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ONR_PROV_BAL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ONR_PROV_BAL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ONR_PROV_BAL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

