\encoding UTF-8

COMMENT ON TABLE fct_mining_task_log IS 'マイニングタスク実行ログ // Run mining task log';


COMMENT ON COLUMN fct_mining_task_log.task_id IS 'タスクＩＤ // #FC.MINING_TASK_ID // Task ID';


COMMENT ON COLUMN fct_mining_task_log.sche_id IS 'スケジュールＩＤ //  // Schedule ID';


COMMENT ON COLUMN fct_mining_task_log.sche_dt IS '実行予定日時 // #FC.DT // Scheduled execution date and time';


COMMENT ON COLUMN fct_mining_task_log.start_dt IS '実行開始日時 // #FC.DT // Execution start date and time';


COMMENT ON COLUMN fct_mining_task_log.end_dt IS '実行終了日時 // #FC.DT // Execution end date and time';


COMMENT ON COLUMN fct_mining_task_log.srv_id IS 'サーバＩＤ // #FC.MACHINE // Server ID';


COMMENT ON COLUMN fct_mining_task_log.msg_id IS 'メッセージＩＤ // #FC.MSG_ID // Message ID';


COMMENT ON COLUMN fct_mining_task_log.msg_bind IS 'バインドリスト // #FC.MSG_BIND // Binding list';


COMMENT ON COLUMN fct_mining_task_log.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_mining_task_log.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_mining_task_log.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_mining_task_log.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_mining_task_log.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_mining_task_log.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_mining_task_log.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_mining_task_log.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_mining_task_log.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_mining_task_log.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

