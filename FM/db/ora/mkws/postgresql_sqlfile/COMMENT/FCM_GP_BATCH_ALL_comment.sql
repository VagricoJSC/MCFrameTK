\encoding UTF-8

COMMENT ON TABLE fcm_gp_batch_all IS '汎用バッチオンライン実行マスタ // General purpose online batch execution master';


COMMENT ON COLUMN fcm_gp_batch_all.gp_batch_no IS '処理ＮＯ // #FC.GP_BATCH_NO // Process No.';


COMMENT ON COLUMN fcm_gp_batch_all.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fcm_gp_batch_all.gp_batch_grp_cd IS '処理グループＣＤ // #FC.GP_BATCH_GRP_CD // Process group cd.';


COMMENT ON COLUMN fcm_gp_batch_all.gp_batch_order IS '実行順 // #FC.INT // Execution order';


COMMENT ON COLUMN fcm_gp_batch_all.module_id IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fcm_gp_batch_all.logic_id IS 'ロジックＩＤ // #FC.LOGIC_ID // Logic ID';


COMMENT ON COLUMN fcm_gp_batch_all.operation_id IS 'オペレーションＩＤ // #FC.OPERATION_ID // Operation ID';


COMMENT ON COLUMN fcm_gp_batch_all.version IS 'バージョン // #FC.VERSION // Version';


COMMENT ON COLUMN fcm_gp_batch_all.err_continue IS 'エラー継続 // #FC.FLG // Ignore error';


COMMENT ON COLUMN fcm_gp_batch_all.rmrks IS '備考 // #FC.GP_BATCH_RMRKS // Remarks';


COMMENT ON COLUMN fcm_gp_batch_all.rmrks2 IS '備考２ // #FC.GP_BATCH_RMRKS // Remarks 2';


COMMENT ON COLUMN fcm_gp_batch_all.rmrks3 IS '備考３ // #FC.GP_BATCH_RMRKS // Remarks 3';


COMMENT ON COLUMN fcm_gp_batch_all.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_gp_batch_all.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_gp_batch_all.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_gp_batch_all.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_gp_batch_all.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_gp_batch_all.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_gp_batch_all.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_gp_batch_all.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_gp_batch_all.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_gp_batch_all.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

