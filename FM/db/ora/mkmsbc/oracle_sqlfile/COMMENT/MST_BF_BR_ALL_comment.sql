
COMMENT ON TABLE MST_BF_BR_ALL IS 'バックフラッシュバッチ結果確認 // Check backflush batch results';


COMMENT ON COLUMN MST_BF_BR_ALL.BATCH_DATA_NO IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN MST_BF_BR_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_BF_BR_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_BF_BR_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_BF_BR_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_BF_BR_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_BF_BR_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_BF_BR_ALL.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_BF_BR_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_BF_BR_ALL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_BF_BR_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MST_BF_BR_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MST_BF_BR_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MST_BF_BR_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MST_BF_BR_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_BF_BR_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MST_BF_BR_ALL.ST_ACT_TM IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN MST_BF_BR_ALL.END_ACT_TM IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN MST_BF_BR_ALL.BF_TGT_CNT IS 'ＢＦ対象子品目件数 // #MA.INT // Number of child items for BF';


COMMENT ON COLUMN MST_BF_BR_ALL.BF_SUCCESS_CNT IS 'ＢＦ成功子品目件数 // #MA.INT // Number of child items in BF success';


COMMENT ON COLUMN MST_BF_BR_ALL.BF_FAILURE_CNT IS 'ＢＦ失敗子品目件数 // #MA.INT // Number of child items in BF failure';


COMMENT ON COLUMN MST_BF_BR_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BF_BR_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BF_BR_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BF_BR_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BF_BR_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

