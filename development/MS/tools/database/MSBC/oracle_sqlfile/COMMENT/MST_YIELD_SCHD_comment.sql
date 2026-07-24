
COMMENT ON TABLE MST_YIELD_SCHD IS '出来高予定 // Output schedule';


COMMENT ON COLUMN MST_YIELD_SCHD.YIELD_SCHD_NO IS '出来高予定ＮＯ // #MA.YIELD_SCHD_NO // Output schedule No.';


COMMENT ON COLUMN MST_YIELD_SCHD.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_YIELD_SCHD.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_YIELD_SCHD.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_YIELD_SCHD.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_YIELD_SCHD.YIELD_TYP IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN MST_YIELD_SCHD.SCHD_TM IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN MST_YIELD_SCHD.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_YIELD_SCHD.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_YIELD_SCHD.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_YIELD_SCHD.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_YIELD_SCHD.TRD_UNIT_YIELD_QTY IS '取引単位出来高予定数量 // #MA.QTY // Transaction unit scheduled output qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_YIELD_SCHD.BASE_UNIT_YIELD_QTY IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_YIELD_SCHD.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_YIELD_SCHD.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_YIELD_SCHD.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_YIELD_SCHD.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_YIELD_SCHD.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_YIELD_SCHD.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_YIELD_SCHD.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MST_YIELD_SCHD.STRG_STR_LN_CD IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN MST_YIELD_SCHD.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MST_YIELD_SCHD.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MST_YIELD_SCHD.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_YIELD_SCHD.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MST_YIELD_SCHD.INTR_RMRKS IS '内部備考 // #MS.YIELD_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_YIELD_SCHD.INST_RPT_RMRKS IS '指図書備考 // #MS.YIELD_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN MST_YIELD_SCHD.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MST_YIELD_SCHD.SUB_CHAR1 IS '予備１ // #MS.YIELD_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_YIELD_SCHD.SUB_CHAR2 IS '予備２ // #MS.YIELD_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_YIELD_SCHD.SUB_CHAR3 IS '予備３ // #MS.YIELD_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_YIELD_SCHD.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_YIELD_SCHD.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_YIELD_SCHD.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_YIELD_SCHD.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_YIELD_SCHD.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

