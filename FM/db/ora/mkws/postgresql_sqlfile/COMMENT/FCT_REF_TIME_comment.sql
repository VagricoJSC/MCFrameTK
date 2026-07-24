\encoding UTF-8

COMMENT ON TABLE fct_ref_time IS '参照日時取得用テーブル // Table for reference date and time acquisition';


COMMENT ON COLUMN fct_ref_time.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_ref_time.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_ref_time.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_ref_time.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_ref_time.req_no IS 'リクエストＮＯ // #FC.SRV_REQ_NO // Request No.';


COMMENT ON COLUMN fct_ref_time.thread_no IS 'スレッドＮＯ // #FC.THREAD_NO // Thread No.';


COMMENT ON COLUMN fct_ref_time.table_name IS 'テーブル名 // #FC.TABLE_NAME // Table name';


COMMENT ON COLUMN fct_ref_time.ref_time IS '参照日時 // #FC.SYS_TS // Reference date and time';

