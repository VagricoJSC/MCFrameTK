
COMMENT ON TABLE MST_DMND_ALL IS '需要情報 // Demand';


COMMENT ON COLUMN MST_DMND_ALL.DMND_NO IS '需要ＮＯ // #MA.DMND_NO // Demand No.';


COMMENT ON COLUMN MST_DMND_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_DMND_ALL.DMND_DT IS '需要日 // #MA.DT // Demand date';


COMMENT ON COLUMN MST_DMND_ALL.DMND_ST_DT IS '需要期間開始日 // #MA.DT // Demand period start date';


COMMENT ON COLUMN MST_DMND_ALL.DMND_END_DT IS '需要期間終了日 // #MA.DT // Demand period end date';


COMMENT ON COLUMN MST_DMND_ALL.DLV_SCHD_ST_DT IS '納品予定期間開始日 // #MA.DT // Delivery schedule period start date';


COMMENT ON COLUMN MST_DMND_ALL.DLV_SCHD_END_DT IS '納品予定期間終了日 // #MA.DT // Delivery schedule period end date';


COMMENT ON COLUMN MST_DMND_ALL.DMND_PERIOD_TYP IS '需要期間区分 // #MA.PERIOD_TYP // Demand period type';


COMMENT ON COLUMN MST_DMND_ALL.DLY_DIV_FLG IS '日ばらし対象ＦＬＧ // #MA.FLG // For disaggregation by day flg.';


COMMENT ON COLUMN MST_DMND_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_DMND_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_DMND_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_DMND_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_DMND_ALL.SPLN_ITM_CD IS '計画品目ＣＤ // #MA.SPLN_ITM_CD // Plan item cd.';


COMMENT ON COLUMN MST_DMND_ALL.DMND_TYP IS '需要区分 // #MS.DMND_TYP // Demand type';


COMMENT ON COLUMN MST_DMND_ALL.DMND_QTY IS '需要数量 // #MA.QTY // Demand qty.';


COMMENT ON COLUMN MST_DMND_ALL.INPUT_QTY IS '登録数量 // #MA.QTY // Entry qty.';


COMMENT ON COLUMN MST_DMND_ALL.REC_QTY IS '消込数量 // #MA.QTY // Matching qty.';


COMMENT ON COLUMN MST_DMND_ALL.DMND_DPT_CD IS '需要元部門ＣＤ // #MA.DPT_CD // Demand source dept. cd.';


COMMENT ON COLUMN MST_DMND_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_DMND_ALL.DMND_USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MST_DMND_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_DMND_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_DMND_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_DMND_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_DMND_ALL.CST_FRCST_D_NO IS '顧客期間内示明細ＮＯ // #MA.CST_FRCST_D_NO // Sales forecast details No.';


COMMENT ON COLUMN MST_DMND_ALL.CST_FRCST_NO IS '顧客期間内示ＮＯ // #MA.CST_FRCST_NO // Sales forecast No.';


COMMENT ON COLUMN MST_DMND_ALL.YM IS '計画月度 // #MA.YM // Plan month';


COMMENT ON COLUMN MST_DMND_ALL.SPLN_VERS IS '販売計画バージョン // #MS.SPLN_VERS // Sales plan version';


COMMENT ON COLUMN MST_DMND_ALL.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MST_DMND_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_DMND_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_DMND_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_DMND_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_DMND_ALL.DMND_LOC_CD IS '需要場所ＣＤ // #MA.LOC_CD // Demand location cd.';


COMMENT ON COLUMN MST_DMND_ALL.INTR_RMRKS IS '内部備考 // #MS.DMND_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_DMND_ALL.SUB_CHAR1 IS '予備１ // #MS.DMND_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_DMND_ALL.SUB_CHAR2 IS '予備２ // #MS.DMND_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_DMND_ALL.SUB_CHAR3 IS '予備３ // #MS.DMND_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_DMND_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_DMND_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_DMND_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_DMND_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_DMND_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_DMND_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_DMND_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_DMND_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_DMND_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_DMND_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

