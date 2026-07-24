
COMMENT ON TABLE MST_SLS_RET_SCHD IS '売上返品予定ヘッダ // Sales return schedule header';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SLS_RET_SCHD_NO IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SLS_RET_SCHD.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.REG_DT IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SLS_RET_SCHD_DT IS '売上返品予定日 // #MA.DT // Scheduled sales return date';


COMMENT ON COLUMN MST_SLS_RET_SCHD.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_SLS_RET_SCHD.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SLS_RET_SCHD.INTR_RMRKS IS '内部備考 // #MS.SLS_RET_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SLS_RET_SCHD.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.REF_IV_NO IS '対応インボイスＮＯ // #MA.IV_NO // Corresponding I/V No.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.RCV_SCHD_DT IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_SLS_RET_SCHD.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SUB_CHAR1 IS '予備１ // #MS.SLS_RET_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SUB_CHAR2 IS '予備２ // #MS.SLS_RET_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLS_RET_SCHD.SUB_CHAR3 IS '予備３ // #MS.SLS_RET_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLS_RET_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLS_RET_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLS_RET_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLS_RET_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLS_RET_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

