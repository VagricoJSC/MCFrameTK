
COMMENT ON TABLE MST_SCHE_EXEC IS 'スケジューラ実行情報 // Scheduler execution info.';


COMMENT ON COLUMN MST_SCHE_EXEC.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SCHE_EXEC.EXEC_FLG IS '実行中ＦＬＧ // #MA.FLG // Executing flg.';


COMMENT ON COLUMN MST_SCHE_EXEC.FROM_DT IS '対象期間開始日 // #MA.DT // Start date of the term';


COMMENT ON COLUMN MST_SCHE_EXEC.TO_DT IS '対象期間終了日 // #MA.DT // End date of the term';


COMMENT ON COLUMN MST_SCHE_EXEC.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_SCHE_EXEC.INTR_RMRKS IS '内部備考 // #MS.SCHEEXEC_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SCHE_EXEC.SUB_CHAR1 IS '予備１ // #MS.SCHEEXEC_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SCHE_EXEC.SUB_CHAR2 IS '予備２ // #MS.SCHEEXEC_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SCHE_EXEC.SUB_CHAR3 IS '予備３ // #MS.SCHEEXEC_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SCHE_EXEC.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SCHE_EXEC.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SCHE_EXEC.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SCHE_EXEC.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SCHE_EXEC.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

