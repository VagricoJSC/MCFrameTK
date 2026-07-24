
COMMENT ON TABLE MST_CST_FRCST IS '顧客期間内示情報 // Sales forecast info.';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_R_NO IS '顧客期間内示レコードＮＯ // #MA.CST_FRCST_R_NO // Sales forecast record No.';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_NO IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_D_NO IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN MST_CST_FRCST.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_CST_FRCST.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_PRNT_DT IS '得意先内示書発行日 // #MA.DT // Customer forecast list issue date';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_SLIP_NO IS '得意先内示書ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list No.';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_DPT_CD IS '担当部門ＣＤ // #MA.DPT_CD // Dept. in charge cd.';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MST_CST_FRCST.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_CST_FRCST.RCPT_DT IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_CST_FRCST.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MST_CST_FRCST.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_CST_FRCST.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_CST_FRCST.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_CST_FRCST.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_PERIOD_TYP IS '内示期間区分 // #MS.PERIOD_TYP // Forecast period type';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_DT IS '内示期間 // #MA.DT // Forecast period';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_ST_DT IS '内示期間開始日 // #MA.DT // Forecast period start date';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_END_DT IS '内示期間終了日 // #MA.DT // Forecast period end date';


COMMENT ON COLUMN MST_CST_FRCST.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_CST_FRCST.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_CST_FRCST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_CST_FRCST.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_CST_FRCST.NET_QTY IS '正味内示数量 // #MA.QTY // Net forecast qty.';


COMMENT ON COLUMN MST_CST_FRCST.GI_LOC_CD IS '出庫元場所ＣＤ // #MA.LOC_CD // GI source location cd.';


COMMENT ON COLUMN MST_CST_FRCST.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_CST_FRCST.CST_ITM_NM IS '得意先品目名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_CST_FRCST.CST_FRCST_SLIP_D_NO IS '得意先内示書明細ＮＯ // #MA.CST_FRCST_SLIP_NO // Customer forecast list details No.';


COMMENT ON COLUMN MST_CST_FRCST.PRMS_QTY IS '回答数量 // #MA.QTY // Replied qty.';


COMMENT ON COLUMN MST_CST_FRCST.FRCST_STOP_FLG IS '下位優先ＦＬＧ // #MA.FLG // Lower priority flg.';


COMMENT ON COLUMN MST_CST_FRCST.DMND_CNT_RMRKS IS '需要連絡備考 // #MS.DMND_CNT_RMRKS // Demand contact remarks';


COMMENT ON COLUMN MST_CST_FRCST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_CST_FRCST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_CST_FRCST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_CST_FRCST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_CST_FRCST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_CST_FRCST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_CST_FRCST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_CST_FRCST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_CST_FRCST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_CST_FRCST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

