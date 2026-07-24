\encoding UTF-8

COMMENT ON TABLE fcm_roleitem IS 'ロール項目マスタ // Role target master';


COMMENT ON COLUMN fcm_roleitem.iid IS '内部ロール項目ＩＤ // #FC.ROW_ID // Internal role target ID';


COMMENT ON COLUMN fcm_roleitem.rid IS '内部ロールＩＤ // #FC.ROLE_ID // Internal role ID';


COMMENT ON COLUMN fcm_roleitem.type_cd IS '権限種類 // #FC.AC_TYP // Authority type';


COMMENT ON COLUMN fcm_roleitem.actype IS '権限 // #FC.AC // Authority';


COMMENT ON COLUMN fcm_roleitem.chk_pw IS 'パスワードチェック // #FC.FLG // Password check';


COMMENT ON COLUMN fcm_roleitem.chk_id IS 'ユーザＩＤチェック // #FC.FLG // User ID check';


COMMENT ON COLUMN fcm_roleitem.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_roleitem.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_roleitem.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_roleitem.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_roleitem.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_roleitem.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_roleitem.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_roleitem.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_roleitem.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_roleitem.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

