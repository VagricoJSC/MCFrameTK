\encoding UTF-8

COMMENT ON TABLE fct_pushmsg IS 'プッシュメッセージ // Push message';


COMMENT ON COLUMN fct_pushmsg.push_id IS 'プッシュＩＤ // #FC.ROW_ID // Push ID';


COMMENT ON COLUMN fct_pushmsg.user_id IS '送信ユーザＩＤ // #FC.USR_ID // Sending user ID';


COMMENT ON COLUMN fct_pushmsg.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_pushmsg.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fct_pushmsg.logic_id IS 'ロジックＩＤ // #FC.LOGIC_ID // Logic ID';


COMMENT ON COLUMN fct_pushmsg.operation_id IS 'オペレーションＩＤ // #FC.OPERATION_ID // Operation ID';


COMMENT ON COLUMN fct_pushmsg.msg_id IS 'メッセージＩＤ // #FC.MSG_ID // Message ID';


COMMENT ON COLUMN fct_pushmsg.msg_bind IS 'バインドリスト // #FC.MSG_BIND // Binding list';


COMMENT ON COLUMN fct_pushmsg.title_id IS 'タイトルメッセージＩＤ // #FC.MSG_ID // Title message ID';


COMMENT ON COLUMN fct_pushmsg.title_bind IS 'タイトルバインドリスト // #FC.MSG_BIND // Title binding list';


COMMENT ON COLUMN fct_pushmsg.importance IS '重要度 // #FC.FLG // Importance';


COMMENT ON COLUMN fct_pushmsg.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_pushmsg.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_pushmsg.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_pushmsg.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_pushmsg.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_pushmsg.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_pushmsg.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_pushmsg.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_pushmsg.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_pushmsg.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

