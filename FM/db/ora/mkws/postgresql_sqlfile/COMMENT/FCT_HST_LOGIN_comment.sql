\encoding UTF-8

COMMENT ON TABLE fct_hst_login IS 'ログイン履歴 // Login history';


COMMENT ON COLUMN fct_hst_login.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_hst_login.login_seq IS 'ログインシーケンス // #FC.USR_LOGIN_SEQ // Login sequence';


COMMENT ON COLUMN fct_hst_login.hst_typ IS '履歴種別 //  // History type';


COMMENT ON COLUMN fct_hst_login.arc_cd IS 'アーキテクチャＣＤ // #FC.ARC_CD // Architecture cd.';


COMMENT ON COLUMN fct_hst_login.clt_id IS 'クライアントＩＤ // #FC.MACHINE // Client ID';


COMMENT ON COLUMN fct_hst_login.hst_tm IS '履歴登録時刻 // #FC.TS // History entry time';


COMMENT ON COLUMN fct_hst_login.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_hst_login.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_hst_login.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_hst_login.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_hst_login.prod IS '使用可能製品 //  // Available product';


COMMENT ON COLUMN fct_hst_login.user_nm IS 'ユーザ名 // #FC.USR_NM // User name';


COMMENT ON COLUMN fct_hst_login.row_id IS 'ROWID //  // ROW ID';


COMMENT ON COLUMN fct_hst_login.clt_type IS '接続種別 //  // Connection type';

