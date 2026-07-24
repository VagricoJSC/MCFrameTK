\encoding UTF-8

COMMENT ON TABLE fcm_pushmsg_setting IS 'プッシュメッセージ管理 // Push message management';


COMMENT ON COLUMN fcm_pushmsg_setting.user_id IS '受信ユーザＩＤ // #FC.USR_ID // Receiving user ID';


COMMENT ON COLUMN fcm_pushmsg_setting.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fcm_pushmsg_setting.logic_id IS 'ロジックＩＤ // #FC.LOGIC_ID // Logic ID';


COMMENT ON COLUMN fcm_pushmsg_setting.operation_id IS 'オペレーションＩＤ // #FC.OPERATION_ID // Operation ID';


COMMENT ON COLUMN fcm_pushmsg_setting.param_key IS '設定キー // #FC.RES_KEY // Setting key';


COMMENT ON COLUMN fcm_pushmsg_setting.param_val IS '設定値 // #FC.RES_VAL // Setting value';


COMMENT ON COLUMN fcm_pushmsg_setting.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_pushmsg_setting.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_pushmsg_setting.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_pushmsg_setting.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_pushmsg_setting.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

