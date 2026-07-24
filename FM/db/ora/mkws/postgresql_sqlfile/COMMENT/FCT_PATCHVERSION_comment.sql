\encoding UTF-8

COMMENT ON TABLE fct_patchversion IS 'ＤＢパッチバージョン管理テーブル // DB patch version management table';


COMMENT ON COLUMN fct_patchversion.product_id IS '製品ＩＤ // #FC.PRODUCT_ID // Product ID';


COMMENT ON COLUMN fct_patchversion.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fct_patchversion.version IS 'バージョン //  // Version';


COMMENT ON COLUMN fct_patchversion.branch IS '枝版 //  // Branch version';


COMMENT ON COLUMN fct_patchversion.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';

