\encoding UTF-8

COMMENT ON TABLE fct_notice IS '通知 // Notification';


COMMENT ON COLUMN fct_notice.notice_id IS '通知ＩＤ // #FC.NUM_STR // Notification ID';


COMMENT ON COLUMN fct_notice.start_dt IS '使用開始日 // #FC.DT // Start date';


COMMENT ON COLUMN fct_notice.end_dt IS '使用停止日 // #FC.DT // Stop date';


COMMENT ON COLUMN fct_notice.locale_cd IS 'ロケールＣＤ // #FC.LOCALE_CD // Locale cd.';


COMMENT ON COLUMN fct_notice.notice_title IS '情報タイトル // #FC.NOTICE_TITLE // Info. title';


COMMENT ON COLUMN fct_notice.text_line IS 'テキスト // #FC.TEXT_LINE // Text';


COMMENT ON COLUMN fct_notice.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_notice.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_notice.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_notice.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_notice.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_notice.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_notice.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_notice.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_notice.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_notice.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_notice.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_notice.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_notice.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_notice.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

