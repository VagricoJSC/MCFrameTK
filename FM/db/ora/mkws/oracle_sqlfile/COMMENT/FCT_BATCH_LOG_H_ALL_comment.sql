
COMMENT ON TABLE FCT_BATCH_LOG_H_ALL IS 'バッチログヘッダ // Batch log header';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.BATCH_LOG_NO IS 'ログＮＯ //  // Log No.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CO_CD IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.REQ_NO IS 'サーバリクエストＮＯ // #FC.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.DATA_REF_CTL IS 'データ参照制御 //  // Data reference control';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.START_TS IS '開始日時 // #FC.TS // Start date and time';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.LAST_TS IS '最終更新日時 // #FC.TS // Last update date and time';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.LOGIN_SEQ IS 'ログインシーケンス // #FC.USR_LOGIN_SEQ // Login sequence';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.EMSG_SEQ IS '終了ログ連番 //  // Termination log sequence number';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.EXT_ATTR1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.EXT_ATTR2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.EXT_ATTR3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.USR_CD IS '実行ユーザＣＤ // #FC.USR_ID // Executor cd.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.GP_BATCH_GRP_CD IS '処理グループＣＤ //  // Process group cd.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_MODULE_ID IS '呼出元モジュールＩＤ // #FC.MODULE_ID // Caller module ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_LOGIC_ID IS '呼出元ロジックＩＤ // #FC.LOGIC_ID // Caller logic ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_OPERATION_ID IS '呼出元オペレーションＩＤ // #FC.OPERATION_ID // Caller operation ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_PG_ID IS '呼出元プログラムＩＤ // #FC.FUNC_ID // Caller program ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_CLT_ID IS '呼出元クライアント // #FC.MACHINE // Caller client';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.CALL_PLSQL_ID IS '呼出元ＰＬＳＱＬ //  // Caller PLSQL';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.LCL_CD IS '実行ロケールＣＤ // #FC.LOCALE_CD // Execution locale cd.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.END_FLG IS '終了ＦＬＧ //  // Terminate flg.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.WARN_FLG IS '警告ありＦＬＧ //  // With warning flg.';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS1 IS '備考１ //  // Remarks 1';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS2 IS '備考２ //  // Remarks 2';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS3 IS '備考３ //  // Remarks 3';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS4 IS '備考４ //  // Remarks 4';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS5 IS '備考５ //  // Remarks 5';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS6 IS '備考６ //  // Remarks 6';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS7 IS '備考７ //  // Remarks 7';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS8 IS '備考８ //  // Remarks 8';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS9 IS '備考９ //  // Remarks 9';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.RMRKS10 IS '備考１０ //  // Remarks 10';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCT_BATCH_LOG_H_ALL.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

