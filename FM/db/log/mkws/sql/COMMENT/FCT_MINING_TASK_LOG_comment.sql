
COMMENT ON TABLE FCT_MINING_TASK_LOG IS 'マイニングタスク実行ログ // Run mining task log';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.TASK_ID IS 'タスクＩＤ // #FC.MINING_TASK_ID // Task ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.SCHE_ID IS 'スケジュールＩＤ //  // Schedule ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.SCHE_DT IS '実行予定日時 // #FC.DT // Scheduled execution date and time';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.START_DT IS '実行開始日時 // #FC.DT // Execution start date and time';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.END_DT IS '実行終了日時 // #FC.DT // Execution end date and time';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.SRV_ID IS 'サーバＩＤ // #FC.MACHINE // Server ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.MSG_ID IS 'メッセージＩＤ // #FC.MSG_ID // Message ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.MSG_BIND IS 'バインドリスト // #FC.MSG_BIND // Binding list';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCT_MINING_TASK_LOG.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

