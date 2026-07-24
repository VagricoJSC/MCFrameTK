\encoding UTF-8

COMMENT ON TABLE mbt_biz_dat_dl_all IS '業務データダウンロード管理 // Business data download management';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_id IS '業務データＩＤ // #MA.BIZ_DAT_ID // Business data ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_nm IS '業務データ名 // #MA.BIZ_DAT_NM // Business data name';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_rmrks1 IS '業務データ備考１ // #MA.BIZ_DAT_RMRKS // Business data remarks 1';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_rmrks2 IS '業務データ備考２ // #MA.BIZ_DAT_RMRKS // Business data remarks 2';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_rmrks3 IS '業務データ備考３ // #MA.BIZ_DAT_RMRKS // Business data remarks 3';


COMMENT ON COLUMN mbt_biz_dat_dl_all.module_id IS 'モジュールＩＤ // #MA.MODULE_ID // Module ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.logic_id IS 'ロジックＩＤ // #MA.LOGIC_ID // Logic ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.func_actyp IS '機能種別 // #MA.FUNC_ACTYP // Function type';


COMMENT ON COLUMN mbt_biz_dat_dl_all.biz_dat_get_typ IS '業務データ取得区分 // #MA.BIZ_DAT_GET_TYP // Business data acquisition type';


COMMENT ON COLUMN mbt_biz_dat_dl_all.sql_src IS 'ＳＱＬ // #MA.SQL_SRC // SQL';


COMMENT ON COLUMN mbt_biz_dat_dl_all.operation IS 'オペレーションＩＤ // #MA.OPERATION // Operation ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.res_path IS 'リソースパス // #MA.PATH // Resource Path';


COMMENT ON COLUMN mbt_biz_dat_dl_all.form_file_nm IS '帳票フォーム名 // #MA.PRINT_FILE_NAME // Report form name';


COMMENT ON COLUMN mbt_biz_dat_dl_all.cartridge IS '帳票出力カートリッジ // #MA.CARTRIDGE // Report output cartridge';


COMMENT ON COLUMN mbt_biz_dat_dl_all.print_flg IS '帳票出力を有効にする // #MA.FLG // Enable report output';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dwnld_flg IS '帳票をダウンロードする // #MA.FLG // Download report';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col1 IS '日付条件項目１ // #MA.COND_COL // Date condition column 1';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col2 IS '日付条件項目２ // #MA.COND_COL // Date condition column 2';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col3 IS '日付条件項目３ // #MA.COND_COL // Date condition column 3';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col4 IS '日付条件項目４ // #MA.COND_COL // Date condition column 4';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col5 IS '日付条件項目５ // #MA.COND_COL // Date condition column 5';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col6 IS '日付条件項目６ // #MA.COND_COL // Date condition column 6';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col7 IS '日付条件項目７ // #MA.COND_COL // Date condition column 7';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col8 IS '日付条件項目８ // #MA.COND_COL // Date condition column 8';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col9 IS '日付条件項目９ // #MA.COND_COL // Date condition column 9';


COMMENT ON COLUMN mbt_biz_dat_dl_all.dt_cond_col10 IS '日付条件項目１０ // #MA.COND_COL // Date condition column 10';


COMMENT ON COLUMN mbt_biz_dat_dl_all.str_cond_col1 IS '文字列条件項目１ // #MA.COND_COL // String condition column 1';


COMMENT ON COLUMN mbt_biz_dat_dl_all.str_cond_col2 IS '文字列条件項目２ // #MA.COND_COL // String condition column 2';


COMMENT ON COLUMN mbt_biz_dat_dl_all.str_cond_col3 IS '文字列条件項目３ // #MA.COND_COL // String condition column 3';


COMMENT ON COLUMN mbt_biz_dat_dl_all.str_cond_col4 IS '文字列条件項目４ // #MA.COND_COL // String condition column 4';


COMMENT ON COLUMN mbt_biz_dat_dl_all.str_cond_col5 IS '文字列条件項目５ // #MA.COND_COL // String condition column 5';


COMMENT ON COLUMN mbt_biz_dat_dl_all.num_cond_col1 IS '数値条件項目１ // #MA.COND_COL // Numerical condition column 1';


COMMENT ON COLUMN mbt_biz_dat_dl_all.num_cond_col2 IS '数値条件項目２ // #MA.COND_COL // Numerical condition column 2';


COMMENT ON COLUMN mbt_biz_dat_dl_all.num_cond_col3 IS '数値条件項目３ // #MA.COND_COL // Numerical condition column 3';


COMMENT ON COLUMN mbt_biz_dat_dl_all.num_cond_col4 IS '数値条件項目４ // #MA.COND_COL // Numerical condition column 4';


COMMENT ON COLUMN mbt_biz_dat_dl_all.num_cond_col5 IS '数値条件項目５ // #MA.COND_COL // Numerical condition column 5';


COMMENT ON COLUMN mbt_biz_dat_dl_all.flg_cond_col1 IS 'フラグ条件項目１ // #MA.COND_COL // Flg. criteria column 1';


COMMENT ON COLUMN mbt_biz_dat_dl_all.flg_cond_col2 IS 'フラグ条件項目２ // #MA.COND_COL // Flg. criteria column 2';


COMMENT ON COLUMN mbt_biz_dat_dl_all.flg_cond_col3 IS 'フラグ条件項目３ // #MA.COND_COL // Flg. criteria column 3';


COMMENT ON COLUMN mbt_biz_dat_dl_all.flg_cond_col4 IS 'フラグ条件項目４ // #MA.COND_COL // Flg. criteria column 4';


COMMENT ON COLUMN mbt_biz_dat_dl_all.flg_cond_col5 IS 'フラグ条件項目５ // #MA.COND_COL // Flg. criteria column 5';


COMMENT ON COLUMN mbt_biz_dat_dl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_biz_dat_dl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_biz_dat_dl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_biz_dat_dl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

