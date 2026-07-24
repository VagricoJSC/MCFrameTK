
COMMENT ON TABLE FCT_PUSHMSG_SEND IS 'プッシュメッセージ送受信 // Push message sending and receiving';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.PUSH_ID IS 'プッシュＩＤ // #FC.ROW_ID // Push ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.USER_ID IS '受信ユーザＩＤ // #FC.USR_ID // Receiving user ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.SEND_DT IS '送信時刻 // #FC.DT // Send time';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.RECV_DT IS '受信時刻 // #FC.DT // Receiving time';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCT_PUSHMSG_SEND.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

