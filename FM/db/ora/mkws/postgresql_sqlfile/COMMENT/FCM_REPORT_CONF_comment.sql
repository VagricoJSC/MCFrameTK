\encoding UTF-8

COMMENT ON TABLE fcm_report_conf IS '帳票出力設定マスタ // Report output setting master';


COMMENT ON COLUMN fcm_report_conf.conf_id IS '設定ＩＤ // #FC.ROW_ID // Setting ID';


COMMENT ON COLUMN fcm_report_conf.report_id IS '帳票ＩＤ // #FC.REPORT_ID // Report ID';


COMMENT ON COLUMN fcm_report_conf.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fcm_report_conf.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fcm_report_conf.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fcm_report_conf.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fcm_report_conf.locale_cd IS 'ロケールＣＤ // #FC.LOCALE_CD // Locale cd.';


COMMENT ON COLUMN fcm_report_conf.priority IS '優先順位 // #FC.PRIORITY // Priority';


COMMENT ON COLUMN fcm_report_conf.value1 IS '値１ // #FC.REPORT_KEY_VALUE // Value 1';


COMMENT ON COLUMN fcm_report_conf.value2 IS '値２ // #FC.REPORT_KEY_VALUE // Value 2';


COMMENT ON COLUMN fcm_report_conf.value3 IS '値３ // #FC.REPORT_KEY_VALUE // Value 3';


COMMENT ON COLUMN fcm_report_conf.value4 IS '値４ // #FC.REPORT_KEY_VALUE // Value 4';


COMMENT ON COLUMN fcm_report_conf.value5 IS '値５ // #FC.REPORT_KEY_VALUE // Value 5';


COMMENT ON COLUMN fcm_report_conf.server_print IS 'サーバ印刷ＦＬＧ // #FC.FLG // Server print flg.';


COMMENT ON COLUMN fcm_report_conf.print_exec IS '印刷実行 // #FC.FLG // Execute print';


COMMENT ON COLUMN fcm_report_conf.printer_id IS 'プリンタＩＤ // #FC.PRINTER_ID // Printer ID';


COMMENT ON COLUMN fcm_report_conf.print_copy IS '印刷部数 // #FC.PRINT_COPY // Number of printouts';


COMMENT ON COLUMN fcm_report_conf.form_file_name IS 'フォームファイル名 // #FC.PRINT_FILE_NAME // Form file name';


COMMENT ON COLUMN fcm_report_conf.cartridge IS 'カートリッジ // #FC.CARTRIDGE // Cartridge';


COMMENT ON COLUMN fcm_report_conf.reprint_mark IS '再印刷印字用文字列 // #FC.REPRINT_MARK // Re-printing string for print';


COMMENT ON COLUMN fcm_report_conf.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_report_conf.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_report_conf.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_report_conf.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_report_conf.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_report_conf.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_report_conf.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_report_conf.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_report_conf.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_report_conf.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

