\encoding UTF-8

COMMENT ON TABLE fct_hst_header IS '更新履歴ヘッダ // Update history header';


COMMENT ON COLUMN fct_hst_header.hst_id IS '履歴ＩＤ // #FC.HST_ID // History ID';


COMMENT ON COLUMN fct_hst_header.table_name IS 'テーブル名 // #FC.TABLE_NAME // Table name';


COMMENT ON COLUMN fct_hst_header.key_id IS 'キーＩＤ //  // Key ID';


COMMENT ON COLUMN fct_hst_header.action_id IS 'アクションＩＤ // #FC.ACTION_ID // Action ID';


COMMENT ON COLUMN fct_hst_header.hst_type IS '履歴種別 //  // History type';


COMMENT ON COLUMN fct_hst_header.hst_time IS '履歴登録時間 // #FC.DT // History entry time';


COMMENT ON COLUMN fct_hst_header.hst_user_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_hst_header.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_hst_header.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_hst_header.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_hst_header.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';

