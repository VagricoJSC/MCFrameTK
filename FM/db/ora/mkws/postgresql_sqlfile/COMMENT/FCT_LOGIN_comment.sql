\encoding UTF-8

COMMENT ON TABLE fct_login IS 'ログイン情報 // Login info.';


COMMENT ON COLUMN fct_login.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_login.arc_cd IS 'アーキテクチャＣＤ // #FC.ARC_CD // Architecture cd.';


COMMENT ON COLUMN fct_login.login_seq IS 'ログインシーケンス // #FC.USR_LOGIN_SEQ // Login sequence';


COMMENT ON COLUMN fct_login.clt_id IS 'クライアントＩＤ // #FC.MACHINE // Client ID';


COMMENT ON COLUMN fct_login.login_tm IS 'ログイン時刻 // #FC.TS // Login time';


COMMENT ON COLUMN fct_login.last_req_tm IS '最終リクエスト時刻 // #FC.TS // Last request time';


COMMENT ON COLUMN fct_login.exec_flg IS '実行中ＦＬＧ // #FC.FLG // Executing flg.';


COMMENT ON COLUMN fct_login.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_login.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_login.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_login.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_login.prod IS '使用可能製品 //  // Available product';


COMMENT ON COLUMN fct_login.user_nm IS 'ユーザ名 // #FC.USR_NM // User name';

