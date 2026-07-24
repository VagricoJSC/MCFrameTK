\encoding UTF-8

COMMENT ON TABLE fct_batch_log_h_all IS 'バッチログヘッダ // Batch log header';


COMMENT ON COLUMN fct_batch_log_h_all.batch_log_no IS 'ログＮＯ //  // Log No.';


COMMENT ON COLUMN fct_batch_log_h_all.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_batch_log_h_all.req_no IS 'サーバリクエストＮＯ // #FC.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN fct_batch_log_h_all.data_ref_ctl IS 'データ参照制御 //  // Data reference control';


COMMENT ON COLUMN fct_batch_log_h_all.start_ts IS '開始日時 // #FC.TS // Start date and time';


COMMENT ON COLUMN fct_batch_log_h_all.last_ts IS '最終更新日時 // #FC.TS // Last update date and time';


COMMENT ON COLUMN fct_batch_log_h_all.login_seq IS 'ログインシーケンス // #FC.USR_LOGIN_SEQ // Login sequence';


COMMENT ON COLUMN fct_batch_log_h_all.emsg_seq IS '終了ログ連番 //  // Termination log sequence number';


COMMENT ON COLUMN fct_batch_log_h_all.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_batch_log_h_all.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_batch_log_h_all.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_batch_log_h_all.usr_cd IS '実行ユーザＣＤ // #FC.USR_ID // Executor cd.';


COMMENT ON COLUMN fct_batch_log_h_all.gp_batch_grp_cd IS '処理グループＣＤ //  // Process group cd.';


COMMENT ON COLUMN fct_batch_log_h_all.call_module_id IS '呼出元モジュールＩＤ // #FC.MODULE_ID // Caller module ID';


COMMENT ON COLUMN fct_batch_log_h_all.call_logic_id IS '呼出元ロジックＩＤ // #FC.LOGIC_ID // Caller logic ID';


COMMENT ON COLUMN fct_batch_log_h_all.call_operation_id IS '呼出元オペレーションＩＤ // #FC.OPERATION_ID // Caller operation ID';


COMMENT ON COLUMN fct_batch_log_h_all.call_pg_id IS '呼出元プログラムＩＤ // #FC.FUNC_ID // Caller program ID';


COMMENT ON COLUMN fct_batch_log_h_all.call_clt_id IS '呼出元クライアント // #FC.MACHINE // Caller client';


COMMENT ON COLUMN fct_batch_log_h_all.call_plsql_id IS '呼出元ＰＬＳＱＬ //  // Caller PLSQL';


COMMENT ON COLUMN fct_batch_log_h_all.lcl_cd IS '実行ロケールＣＤ // #FC.LOCALE_CD // Execution locale cd.';


COMMENT ON COLUMN fct_batch_log_h_all.end_flg IS '終了ＦＬＧ //  // Terminate flg.';


COMMENT ON COLUMN fct_batch_log_h_all.warn_flg IS '警告ありＦＬＧ //  // With warning flg.';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks1 IS '備考１ //  // Remarks 1';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks2 IS '備考２ //  // Remarks 2';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks3 IS '備考３ //  // Remarks 3';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks4 IS '備考４ //  // Remarks 4';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks5 IS '備考５ //  // Remarks 5';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks6 IS '備考６ //  // Remarks 6';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks7 IS '備考７ //  // Remarks 7';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks8 IS '備考８ //  // Remarks 8';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks9 IS '備考９ //  // Remarks 9';


COMMENT ON COLUMN fct_batch_log_h_all.rmrks10 IS '備考１０ //  // Remarks 10';


COMMENT ON COLUMN fct_batch_log_h_all.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_batch_log_h_all.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_batch_log_h_all.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_batch_log_h_all.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_batch_log_h_all.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_batch_log_h_all.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_batch_log_h_all.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_batch_log_h_all.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_batch_log_h_all.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_batch_log_h_all.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

