\encoding UTF-8

COMMENT ON TABLE fct_pushmsg_send IS 'プッシュメッセージ送受信 // Push message sending and receiving';


COMMENT ON COLUMN fct_pushmsg_send.push_id IS 'プッシュＩＤ // #FC.ROW_ID // Push ID';


COMMENT ON COLUMN fct_pushmsg_send.user_id IS '受信ユーザＩＤ // #FC.USR_ID // Receiving user ID';


COMMENT ON COLUMN fct_pushmsg_send.send_dt IS '送信時刻 // #FC.DT // Send time';


COMMENT ON COLUMN fct_pushmsg_send.recv_dt IS '受信時刻 // #FC.DT // Receiving time';


COMMENT ON COLUMN fct_pushmsg_send.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_pushmsg_send.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_pushmsg_send.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_pushmsg_send.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_pushmsg_send.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_pushmsg_send.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_pushmsg_send.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_pushmsg_send.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_pushmsg_send.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_pushmsg_send.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

