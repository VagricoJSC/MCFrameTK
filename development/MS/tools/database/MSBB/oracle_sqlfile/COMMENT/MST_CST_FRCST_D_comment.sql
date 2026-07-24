
COMMENT ON TABLE MST_CST_FRCST_D IS '顧客期間内示明細 // Sales forecast details';


COMMENT ON COLUMN MST_CST_FRCST_D.CST_FRCST_D_NO IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN MST_CST_FRCST_D.CST_FRCST_NO IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN MST_CST_FRCST_D.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MST_CST_FRCST_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_CST_FRCST_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_CST_FRCST_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_CST_FRCST_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_CST_FRCST_D.FRCST_PERIOD_TYP IS '内示期間区分 // #MS.PERIOD_TYP // Forecast period type';


COMMENT ON COLUMN MST_CST_FRCST_D.FRCST_ST_DT IS '内示期間開始日 // #MA.DT // Forecast period start date';


COMMENT ON COLUMN MST_CST_FRCST_D.FRCST_END_DT IS '内示期間終了日 // #MA.DT // Forecast period end date';


COMMENT ON COLUMN MST_CST_FRCST_D.FRCST_DT IS '内示期間 // #MA.DT // Forecast period';


COMMENT ON COLUMN MST_CST_FRCST_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_CST_FRCST_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_CST_FRCST_D.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_CST_FRCST_D.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_CST_FRCST_D.GI_LOC_CD IS '出庫元場所ＣＤ // #MA.LOC_CD // GI source location cd.';


COMMENT ON COLUMN MST_CST_FRCST_D.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_CST_FRCST_D.CST_ITM_NM IS '得意先品目名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_CST_FRCST_D.CST_FRCST_SLIP_D_NO IS '得意先内示書明細ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list details No.';


COMMENT ON COLUMN MST_CST_FRCST_D.PRMS_QTY IS '回答数量 // #MA.QTY // Replied qty.';


COMMENT ON COLUMN MST_CST_FRCST_D.FRCST_STOP_FLG IS '下位優先ＦＬＧ // #MA.FLG // Lower priority flg.';


COMMENT ON COLUMN MST_CST_FRCST_D.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_CST_FRCST_D.DMND_CNT_RMRKS IS '需要連絡備考 // #MS.DMND_CNT_RMRKS // Demand contact remarks';


COMMENT ON COLUMN MST_CST_FRCST_D.INTR_RMRKS IS '内部備考 // #MS.CST_FRCST_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_CST_FRCST_D.SUB_CHAR1 IS '予備１ // #MS.CST_FRCST_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_CST_FRCST_D.SUB_CHAR2 IS '予備２ // #MS.CST_FRCST_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_CST_FRCST_D.SUB_CHAR3 IS '予備３ // #MS.CST_FRCST_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_CST_FRCST_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_CST_FRCST_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_CST_FRCST_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_CST_FRCST_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_CST_FRCST_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

