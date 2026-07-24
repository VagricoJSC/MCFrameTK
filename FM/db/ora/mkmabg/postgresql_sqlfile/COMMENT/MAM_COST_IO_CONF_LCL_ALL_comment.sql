\encoding UTF-8

COMMENT ON TABLE mam_cost_io_conf_lcl_all IS '原価個別受払表構成マスタ_（全社）_(ロケール別情報) // Custom T account configuration master_(Company-wide)_(Info. by locale)';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.cost_io_id IS '受払表ＩＤ // #MA.COST_IO_ID // GR/GI list ID';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.io_col_cd IS '受払項目ＣＤ // #MA.IO_COL_CD // GR/GI column cd.';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.io_col_nm IS '受払項目名 // #MA.IO_COL_NM // GR/GI column name';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_cost_io_conf_lcl_all.lcl_cd IS 'ロケールＣＤ // #MA.LCL_CD // Locale cd.';

