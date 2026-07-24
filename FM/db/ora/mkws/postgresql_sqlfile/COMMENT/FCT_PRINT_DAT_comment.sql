\encoding UTF-8

COMMENT ON TABLE fct_print_dat IS '印刷データ // Print data';


COMMENT ON COLUMN fct_print_dat.print_seq IS '印刷番号 // #FC.PRINT_SEQ // Print number';


COMMENT ON COLUMN fct_print_dat.report_type IS '帳票種別 // #FC.REPORT_TYPE // Report type';


COMMENT ON COLUMN fct_print_dat.report_id IS '帳票ＩＤ // #FC.REPORT_ID // Report ID';


COMMENT ON COLUMN fct_print_dat.report_version IS '帳票バージョン // #FC.REPORT_VERSION // Report version';


COMMENT ON COLUMN fct_print_dat.form_file_name IS 'フォームファイル名 // #FC.PRINT_FILE_NAME // Form file name';


COMMENT ON COLUMN fct_print_dat.data_file_name IS 'データファイル名 // #FC.PRINT_FILE_NAME // Data file name';


COMMENT ON COLUMN fct_print_dat.data_file IS 'データファイル // #FC.BIN // Data file';


COMMENT ON COLUMN fct_print_dat.if_file IS 'I/Fファイル // #FC.BIN // IF file';


COMMENT ON COLUMN fct_print_dat.container IS 'コンテナ // #FC.CONTAINER // Container';


COMMENT ON COLUMN fct_print_dat.rowsize IS '件数 // #FC.INT // Number of rows';


COMMENT ON COLUMN fct_print_dat.print_locale_cd IS '印刷時ロケール // #FC.LOCALE_CD // Locale at printing';


COMMENT ON COLUMN fct_print_dat.print_option IS '印刷オプション // #FC.PRINT_OPTIN // Print option';


COMMENT ON COLUMN fct_print_dat.print_dt IS '印刷日時 // #FC.DT // Printed date and time';


COMMENT ON COLUMN fct_print_dat.printer_name IS 'プリンタ名 // #FC.PRINTER_NAME // Printer name';


COMMENT ON COLUMN fct_print_dat.cartridge IS 'カートリッジ // #FC.CARTRIDGE // Cartridge';


COMMENT ON COLUMN fct_print_dat.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_print_dat.persistent IS '永続ＦＬＧ // #FC.FLG // Permanent flg.';


COMMENT ON COLUMN fct_print_dat.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_print_dat.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_print_dat.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_print_dat.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_print_dat.app_title1 IS '業務タイトル１ // #FC.PRINT_APP_TITLE // Business title 1';


COMMENT ON COLUMN fct_print_dat.app_title2 IS '業務タイトル２ // #FC.PRINT_APP_TITLE // Business title 2';


COMMENT ON COLUMN fct_print_dat.app_title3 IS '業務タイトル３ // #FC.PRINT_APP_TITLE // Business title 3';


COMMENT ON COLUMN fct_print_dat.app_title4 IS '業務タイトル４ // #FC.PRINT_APP_TITLE // Business title 4';


COMMENT ON COLUMN fct_print_dat.app_title5 IS '業務タイトル５ // #FC.PRINT_APP_TITLE // Business title 5';


COMMENT ON COLUMN fct_print_dat.app_report_no1 IS '業務帳票ＮＯ１ // #FC.PRINT_APP_REPORT_NO // Business report No. 1';


COMMENT ON COLUMN fct_print_dat.app_report_no2 IS '業務帳票ＮＯ２ // #FC.PRINT_APP_REPORT_NO // Business report No. 2';


COMMENT ON COLUMN fct_print_dat.app_report_no3 IS '業務帳票ＮＯ３ // #FC.PRINT_APP_REPORT_NO // Business report No. 3';


COMMENT ON COLUMN fct_print_dat.app_report_no4 IS '業務帳票ＮＯ４ // #FC.PRINT_APP_REPORT_NO // Business report No. 4';


COMMENT ON COLUMN fct_print_dat.app_report_no5 IS '業務帳票ＮＯ５ // #FC.PRINT_APP_REPORT_NO // Business report No. 5';


COMMENT ON COLUMN fct_print_dat.app_itm_cd IS '業務品目ＣＤ // #FC.PRINT_APP_ITM_CD // Business items cd.';


COMMENT ON COLUMN fct_print_dat.app_itm_sub1 IS '業務品目枝番１ // #FC.PRINT_APP_ITM_SUB // Business item branch No. 1';


COMMENT ON COLUMN fct_print_dat.app_itm_sub2 IS '業務品目枝番２ // #FC.PRINT_APP_ITM_SUB // Business item branch No. 2';


COMMENT ON COLUMN fct_print_dat.app_itm_sub3 IS '業務品目枝番３ // #FC.PRINT_APP_ITM_SUB // Business item branch No. 3';


COMMENT ON COLUMN fct_print_dat.app_itm_nm IS '業務品名 // #FC.PRINT_APP_ITM_NM // Business item name';


COMMENT ON COLUMN fct_print_dat.app_report_sts1 IS '業務帳票ステータス１ // #FC.PRINT_APP_REPORT_STS // Business report status 1';


COMMENT ON COLUMN fct_print_dat.app_report_sts2 IS '業務帳票ステータス２ // #FC.PRINT_APP_REPORT_STS // Business report status 2';


COMMENT ON COLUMN fct_print_dat.app_report_sts3 IS '業務帳票ステータス３ // #FC.PRINT_APP_REPORT_STS // Business report status 3';


COMMENT ON COLUMN fct_print_dat.app_report_sts4 IS '業務帳票ステータス４ // #FC.PRINT_APP_REPORT_STS // Business report status 4';


COMMENT ON COLUMN fct_print_dat.app_report_sts5 IS '業務帳票ステータス５ // #FC.PRINT_APP_REPORT_STS // Business report status 5';


COMMENT ON COLUMN fct_print_dat.app_report_sts_nm1 IS '業務帳票ステータス名１ // #FC.PRINT_APP_REPORT_STS_NM // Business report status name 1';


COMMENT ON COLUMN fct_print_dat.app_report_sts_nm2 IS '業務帳票ステータス名２ // #FC.PRINT_APP_REPORT_STS_NM // Business report status name 2';


COMMENT ON COLUMN fct_print_dat.app_report_sts_nm3 IS '業務帳票ステータス名３ // #FC.PRINT_APP_REPORT_STS_NM // Business report status name 3';


COMMENT ON COLUMN fct_print_dat.app_report_sts_nm4 IS '業務帳票ステータス名４ // #FC.PRINT_APP_REPORT_STS_NM // Business report status name 4';


COMMENT ON COLUMN fct_print_dat.app_report_sts_nm5 IS '業務帳票ステータス名５ // #FC.PRINT_APP_REPORT_STS_NM // Business report status name 5';


COMMENT ON COLUMN fct_print_dat.app_usr_cd1 IS '業務担当者情報１ // #FC.PRINT_APP_USR_CD // Business PIC info. 1';


COMMENT ON COLUMN fct_print_dat.app_usr_cd2 IS '業務担当者情報２ // #FC.PRINT_APP_USR_CD // Business PIC info. 2';


COMMENT ON COLUMN fct_print_dat.app_usr_cd3 IS '業務担当者情報３ // #FC.PRINT_APP_USR_CD // Business PIC info. 3';


COMMENT ON COLUMN fct_print_dat.app_usr_cd4 IS '業務担当者情報４ // #FC.PRINT_APP_USR_CD // Business PIC info. 4';


COMMENT ON COLUMN fct_print_dat.app_usr_cd5 IS '業務担当者情報５ // #FC.PRINT_APP_USR_CD // Business PIC info. 5';


COMMENT ON COLUMN fct_print_dat.app_usr_nm1 IS '業務担当者情報名１ // #FC.PRINT_APP_USR_NM // Business PIC info. name 1';


COMMENT ON COLUMN fct_print_dat.app_usr_nm2 IS '業務担当者情報名２ // #FC.PRINT_APP_USR_NM // Business PIC info. name 2';


COMMENT ON COLUMN fct_print_dat.app_usr_nm3 IS '業務担当者情報名３ // #FC.PRINT_APP_USR_NM // Business PIC info. name 3';


COMMENT ON COLUMN fct_print_dat.app_usr_nm4 IS '業務担当者情報名４ // #FC.PRINT_APP_USR_NM // Business PIC info. name 4';


COMMENT ON COLUMN fct_print_dat.app_usr_nm5 IS '業務担当者情報名５ // #FC.PRINT_APP_USR_NM // Business PIC info. name 5';


COMMENT ON COLUMN fct_print_dat.app_from_cd1 IS '業務発行元情報１ // #FC.PRINT_APP_FROM_CD // Business issuer info. info. 1';


COMMENT ON COLUMN fct_print_dat.app_from_cd2 IS '業務発行元情報２ // #FC.PRINT_APP_FROM_CD // Business issuer info. info. 2';


COMMENT ON COLUMN fct_print_dat.app_from_cd3 IS '業務発行元情報３ // #FC.PRINT_APP_FROM_CD // Business issuer info. info. 3';


COMMENT ON COLUMN fct_print_dat.app_from_cd4 IS '業務発行元情報４ // #FC.PRINT_APP_FROM_CD // Business issuer info. info. 4';


COMMENT ON COLUMN fct_print_dat.app_from_cd5 IS '業務発行元情報５ // #FC.PRINT_APP_FROM_CD // Business issuer info. info. 5';


COMMENT ON COLUMN fct_print_dat.app_from_nm1 IS '業務発行元情報名１ // #FC.PRINT_APP_FROM_NM // Business issuer info. name 1';


COMMENT ON COLUMN fct_print_dat.app_from_nm2 IS '業務発行元情報名２ // #FC.PRINT_APP_FROM_NM // Business issuer info. name 2';


COMMENT ON COLUMN fct_print_dat.app_from_nm3 IS '業務発行元情報名３ // #FC.PRINT_APP_FROM_NM // Business issuer info. name 3';


COMMENT ON COLUMN fct_print_dat.app_from_nm4 IS '業務発行元情報名４ // #FC.PRINT_APP_FROM_NM // Business issuer info. name 4';


COMMENT ON COLUMN fct_print_dat.app_from_nm5 IS '業務発行元情報名５ // #FC.PRINT_APP_FROM_NM // Business issuer info. name 5';


COMMENT ON COLUMN fct_print_dat.app_to_cd1 IS '業務宛先情報１ // #FC.PRINT_APP_TO_CD // Business destination info. 1';


COMMENT ON COLUMN fct_print_dat.app_to_cd2 IS '業務宛先情報２ // #FC.PRINT_APP_TO_CD // Business destination info. 2';


COMMENT ON COLUMN fct_print_dat.app_to_cd3 IS '業務宛先情報３ // #FC.PRINT_APP_TO_CD // Business destination info. 3';


COMMENT ON COLUMN fct_print_dat.app_to_cd4 IS '業務宛先情報４ // #FC.PRINT_APP_TO_CD // Business destination info. 4';


COMMENT ON COLUMN fct_print_dat.app_to_cd5 IS '業務宛先情報５ // #FC.PRINT_APP_TO_CD // Business destination info. 5';


COMMENT ON COLUMN fct_print_dat.app_to_nm1 IS '業務宛先情報名１ // #FC.PRINT_APP_TO_NM // Business destination info. name 1';


COMMENT ON COLUMN fct_print_dat.app_to_nm2 IS '業務宛先情報名２ // #FC.PRINT_APP_TO_NM // Business destination info. name 2';


COMMENT ON COLUMN fct_print_dat.app_to_nm3 IS '業務宛先情報名３ // #FC.PRINT_APP_TO_NM // Business destination info. name 3';


COMMENT ON COLUMN fct_print_dat.app_to_nm4 IS '業務宛先情報名４ // #FC.PRINT_APP_TO_NM // Business destination info. name 4';


COMMENT ON COLUMN fct_print_dat.app_to_nm5 IS '業務宛先情報名５ // #FC.PRINT_APP_TO_NM // Business destination info. name 5';


COMMENT ON COLUMN fct_print_dat.app_rmrks1 IS '業務備考１ // #FC.PRINT_APP_RMRKS // Business remarks 1';


COMMENT ON COLUMN fct_print_dat.app_rmrks2 IS '業務備考２ // #FC.PRINT_APP_RMRKS // Business remarks 2';


COMMENT ON COLUMN fct_print_dat.app_rmrks3 IS '業務備考３ // #FC.PRINT_APP_RMRKS // Business remarks 3';


COMMENT ON COLUMN fct_print_dat.app_rmrks4 IS '業務備考４ // #FC.PRINT_APP_RMRKS // Business remarks 4';


COMMENT ON COLUMN fct_print_dat.app_rmrks5 IS '業務備考５ // #FC.PRINT_APP_RMRKS // Business remarks 5';


COMMENT ON COLUMN fct_print_dat.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_print_dat.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_print_dat.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_print_dat.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_print_dat.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_print_dat.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_print_dat.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_print_dat.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_print_dat.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_print_dat.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

