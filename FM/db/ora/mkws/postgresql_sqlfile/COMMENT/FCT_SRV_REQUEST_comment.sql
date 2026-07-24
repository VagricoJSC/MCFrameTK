\encoding UTF-8

COMMENT ON TABLE fct_srv_request IS 'サーバリクエスト情報 // Server request info.';


COMMENT ON COLUMN fct_srv_request.srv_req_no IS 'サーバリクエストＮＯ // #FC.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN fct_srv_request.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_srv_request.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_srv_request.ext_attr1 IS '拡張属性１ // #FC.USR_EXT_ATTR // Extended attribute 1';


COMMENT ON COLUMN fct_srv_request.ext_attr2 IS '拡張属性２ // #FC.USR_EXT_ATTR // Extended attribute 2';


COMMENT ON COLUMN fct_srv_request.ext_attr3 IS '拡張属性３ // #FC.USR_EXT_ATTR // Extended attribute 3';


COMMENT ON COLUMN fct_srv_request.status IS 'オペレーションステータス // #FC.OPERATION_STS // Operation status';


COMMENT ON COLUMN fct_srv_request.start_dt IS '実行開始時刻 // #FC.DT // Execution start time';


COMMENT ON COLUMN fct_srv_request.end_dt IS '実行終了時刻 // #FC.DT // Execution end time';


COMMENT ON COLUMN fct_srv_request.clt_id IS 'クライアントＩＤ // #FC.MACHINE // Client ID';


COMMENT ON COLUMN fct_srv_request.c_req_no IS 'クライアントリクエストＮＯ // #FC.SRV_REQ_NO // Client request No.';


COMMENT ON COLUMN fct_srv_request.c_req_ts IS 'クライアントリクエスト送信日時 // #FC.TS // Client request sent date and time';


COMMENT ON COLUMN fct_srv_request.c_locale IS 'クライアントロケール // #FC.LOCALE_CD // Client locale';


COMMENT ON COLUMN fct_srv_request.c_time_zone IS 'クライアントタイムゾーン // #FC.TIME_ZONE // Client time zone';


COMMENT ON COLUMN fct_srv_request.call_pg_id IS '呼び出し元ＩＤ // #FC.CALL_PG_ID // Caller ID';


COMMENT ON COLUMN fct_srv_request.operation_cd IS 'オペレーション区分 // #FC.OPERATION_CD // Operation type';


COMMENT ON COLUMN fct_srv_request.btn_res_key IS 'ボタンリソースキー // #FC.RES_KEY // Button resource key';


COMMENT ON COLUMN fct_srv_request.action_id IS 'アクションＩＤ // #FC.ACTION_ID // Action ID';


COMMENT ON COLUMN fct_srv_request.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fct_srv_request.logic_id IS 'ロジックＩＤ // #FC.LOGIC_ID // Logic ID';


COMMENT ON COLUMN fct_srv_request.ope_id IS 'オペレーションＩＤ // #FC.OPERATION_ID // Operation ID';


COMMENT ON COLUMN fct_srv_request.gp_batch_grp_cd IS '汎用バッチ処理グループＣＤ // #FC.GP_BATCH_GRP_CD // General purpose batch processing group cd.';


COMMENT ON COLUMN fct_srv_request.srv_id IS 'サーバＩＤ // #FC.MACHINE // Server ID';


COMMENT ON COLUMN fct_srv_request.async_flg IS '非同期ＦＬＧ // #FC.FLG // Asynchronous flg.';


COMMENT ON COLUMN fct_srv_request.up_param IS '上り電文ファイル // #FC.BIN // Request message file';


COMMENT ON COLUMN fct_srv_request.down_param IS '下り電文ファイル // #FC.BIN // Response message file';


COMMENT ON COLUMN fct_srv_request.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_srv_request.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_srv_request.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_srv_request.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_srv_request.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_srv_request.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_srv_request.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_srv_request.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_srv_request.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_srv_request.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

