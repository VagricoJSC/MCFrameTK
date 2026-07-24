\encoding UTF-8

COMMENT ON TABLE fcm_user IS 'システムユーザマスタ // System user master';


COMMENT ON COLUMN fcm_user.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fcm_user.user_nm IS 'ユーザ名 // #FC.USR_NM // User name';


COMMENT ON COLUMN fcm_user.user_pw IS 'パスワード // #FC.USR_PW // Password';


COMMENT ON COLUMN fcm_user.pw_mod_dt IS 'パスワード変更日 // #FC.DT // Password change date';


COMMENT ON COLUMN fcm_user.act_dt IS 'アカウント発効日 // #FC.DT // Account active date';


COMMENT ON COLUMN fcm_user.inact_dt IS 'アカウント失効日 // #FC.DT // Account inactive date';


COMMENT ON COLUMN fcm_user.inv_flg IS '無効ＦＬＧ // #FC.FLG // Invalid flg.';


COMMENT ON COLUMN fcm_user.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_user.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_user.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_user.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_user.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_user.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_user.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_user.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_user.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_user.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

