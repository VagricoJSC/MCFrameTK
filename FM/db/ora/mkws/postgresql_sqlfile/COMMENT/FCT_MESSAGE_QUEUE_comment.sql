\encoding UTF-8

COMMENT ON TABLE fct_message_queue IS 'メッセージキュー // Message queue';


COMMENT ON COLUMN fct_message_queue.message_queue_id IS 'メッセージキューＩＤ // #FC.MESSAGE_QUEUE_ID // Message queue ID';


COMMENT ON COLUMN fct_message_queue.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_message_queue.user_nm IS 'ユーザ名 // #FC.USR_NM // User name';


COMMENT ON COLUMN fct_message_queue.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_message_queue.locale_language IS '言語 //  // Language';


COMMENT ON COLUMN fct_message_queue.locale_country IS '国 //  // Country';


COMMENT ON COLUMN fct_message_queue.func_id IS '機能ＩＤ // #FC.FUNC_ID // function ID';


COMMENT ON COLUMN fct_message_queue.status IS ' // #FC.MESSAGE_QUEUE_STATUS // ';


COMMENT ON COLUMN fct_message_queue.consumer_id IS ' // #FC.MESSAGE_QUEUE_CONSUMER_ID // ';


COMMENT ON COLUMN fct_message_queue.srv_req_no IS 'サーバリクエストＮＯ // #FC.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN fct_message_queue.start_ts IS '開始日時 // #FC.TS // Start date and time';


COMMENT ON COLUMN fct_message_queue.end_ts IS '終了日時 // #FC.TS // End date and time';


COMMENT ON COLUMN fct_message_queue.msg_id IS 'メッセージＩＤ // #FC.MSG_ID // Message ID';


COMMENT ON COLUMN fct_message_queue.msg_lvl IS 'メッセージレベル // #FC.MSG_LVL // Message level';


COMMENT ON COLUMN fct_message_queue.msg_txt IS 'メッセージ本文 // #FC.MSG // Message body';


COMMENT ON COLUMN fct_message_queue.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_message_queue.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_message_queue.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_message_queue.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_message_queue.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_message_queue.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_message_queue.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_message_queue.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_message_queue.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_message_queue.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

