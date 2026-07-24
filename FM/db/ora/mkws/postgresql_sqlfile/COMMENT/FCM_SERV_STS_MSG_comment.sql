\encoding UTF-8

COMMENT ON TABLE fcm_serv_sts_msg IS 'サーバステータスメッセージマスタ // Server status message master';


COMMENT ON COLUMN fcm_serv_sts_msg.mid IS 'サーバステータスメッセージサロゲートキー // #FC.ROW_ID // Server status message surrogate key';


COMMENT ON COLUMN fcm_serv_sts_msg.sid IS 'サーバステータスサロゲートキー // #FC.ROW_ID // Server status surrogate key';


COMMENT ON COLUMN fcm_serv_sts_msg.lcl_cd IS 'ロケールＣＤ // #FC.LOCALE_CD // Locale cd.';


COMMENT ON COLUMN fcm_serv_sts_msg.msg IS 'メッセージ // #FC.MSG // Message';


COMMENT ON COLUMN fcm_serv_sts_msg.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_serv_sts_msg.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_serv_sts_msg.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_serv_sts_msg.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_serv_sts_msg.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

