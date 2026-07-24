\encoding UTF-8

COMMENT ON TABLE fcm_memo IS 'ユーザメモマスタ // User memo master';


COMMENT ON COLUMN fcm_memo.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fcm_memo.locale IS 'ロケール // #FC.LOCALE_CD // Locale';


COMMENT ON COLUMN fcm_memo.memo_key IS 'キー // #FC.MEMO_KEY // Key';


COMMENT ON COLUMN fcm_memo.memo IS 'メモ // #FC.MEMO // Memo';


COMMENT ON COLUMN fcm_memo.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fcm_memo.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fcm_memo.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fcm_memo.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fcm_memo.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_memo.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_memo.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_memo.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_memo.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_memo.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_memo.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_memo.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_memo.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_memo.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

