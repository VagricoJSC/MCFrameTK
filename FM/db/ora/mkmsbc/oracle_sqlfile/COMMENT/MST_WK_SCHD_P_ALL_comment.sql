
COMMENT ON TABLE MST_WK_SCHD_P_ALL IS '工数予定（改訂履歴） // Man-hour schedule (Rev. history)';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.WK_SCHD_NO IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.MFG_INST_REV IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.WK_COST_CALC_FLG IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.FXD_WK_COST IS '予定工数（固定） // #MA.WK_COST_QTY // Schedule man-hour (Constant)';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.WK_COST IS '予定工数（数量依存） // #MA.WK_COST_QTY // Schedule man-hour (Qty.-dependent)';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.MST_FXD_WK_COST IS 'マスタ工数（固定） // #MA.WK_COST_QTY // Master man-hour (Constant)';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.MST_WK_COST IS 'マスタ工数（数量依存） // #MA.WK_COST_QTY // Master man-hour (Qty.-dependent)';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.INTR_RMRKS IS '内部備考 // #MS.WK_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.SUB_CHAR1 IS '予備１ // #MS.WK_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.SUB_CHAR2 IS '予備２ // #MS.WK_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.SUB_CHAR3 IS '予備３ // #MS.WK_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_WK_SCHD_P_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

