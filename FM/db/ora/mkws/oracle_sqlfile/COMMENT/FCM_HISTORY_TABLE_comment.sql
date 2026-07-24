
COMMENT ON TABLE FCM_HISTORY_TABLE IS '履歴テーブルマスタ // History table master';


COMMENT ON COLUMN FCM_HISTORY_TABLE.HISTORY_TABLE_NAME IS '履歴テーブル名 // #FC.HISTORY_TABLE_NAME // History table name';


COMMENT ON COLUMN FCM_HISTORY_TABLE.TABLE_NAME IS 'テーブル名 // #FC.TABLE_NAME // Table name';


COMMENT ON COLUMN FCM_HISTORY_TABLE.TRIGGER_NAME IS 'トリガー名 // #FC.TRIGGER_NAME // Trigger name';


COMMENT ON COLUMN FCM_HISTORY_TABLE.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCM_HISTORY_TABLE.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCM_HISTORY_TABLE.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCM_HISTORY_TABLE.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCM_HISTORY_TABLE.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

