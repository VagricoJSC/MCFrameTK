\encoding UTF-8

COMMENT ON TABLE fcm_grant_user_grp IS 'ユーザグループ割当マスタ // User group assignment master';


COMMENT ON COLUMN fcm_grant_user_grp.gid IS '内部グループ割当ＩＤ // #FC.ROW_ID // Internal group assignment ID';


COMMENT ON COLUMN fcm_grant_user_grp.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fcm_grant_user_grp.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fcm_grant_user_grp.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fcm_grant_user_grp.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fcm_grant_user_grp.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fcm_grant_user_grp.ugid IS '内部グループＩＤ // #FC.ROW_ID // Internal group ID';


COMMENT ON COLUMN fcm_grant_user_grp.st_dt IS '適用開始日 // #FC.DT // Application start date';


COMMENT ON COLUMN fcm_grant_user_grp.end_dt IS '適用終了日 // #FC.DT // Application end date';


COMMENT ON COLUMN fcm_grant_user_grp.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_grant_user_grp.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_grant_user_grp.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_grant_user_grp.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_grant_user_grp.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_grant_user_grp.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_grant_user_grp.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_grant_user_grp.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_grant_user_grp.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_grant_user_grp.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

