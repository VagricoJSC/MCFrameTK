
COMMENT ON TABLE FCM_GP_BATCH IS '汎用バッチオンライン実行マスタ // General purpose online batch execution master';


COMMENT ON COLUMN FCM_GP_BATCH.GP_BATCH_NO IS '処理ＮＯ // #FC.GP_BATCH_NO // Process No.';


COMMENT ON COLUMN FCM_GP_BATCH.GP_BATCH_GRP_CD IS '処理グループＣＤ // #FC.GP_BATCH_GRP_CD // Process group cd.';


COMMENT ON COLUMN FCM_GP_BATCH.GP_BATCH_ORDER IS '実行順 // #FC.INT // Execution order';


COMMENT ON COLUMN FCM_GP_BATCH.MODULE_ID IS 'モジュールＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN FCM_GP_BATCH.LOGIC_ID IS 'ロジックＩＤ // #FC.LOGIC_ID // Logic ID';


COMMENT ON COLUMN FCM_GP_BATCH.OPERATION_ID IS 'オペレーションＩＤ // #FC.OPERATION_ID // Operation ID';


COMMENT ON COLUMN FCM_GP_BATCH.VERSION IS 'バージョン // #FC.VERSION // Version';


COMMENT ON COLUMN FCM_GP_BATCH.ERR_CONTINUE IS 'エラー継続 // #FC.FLG // Ignore error';


COMMENT ON COLUMN FCM_GP_BATCH.RMRKS IS '備考 // #FC.GP_BATCH_RMRKS // Remarks';


COMMENT ON COLUMN FCM_GP_BATCH.RMRKS2 IS '備考２ // #FC.GP_BATCH_RMRKS // Remarks 2';


COMMENT ON COLUMN FCM_GP_BATCH.RMRKS3 IS '備考３ // #FC.GP_BATCH_RMRKS // Remarks 3';


COMMENT ON COLUMN FCM_GP_BATCH.INS_USR_ID IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN FCM_GP_BATCH.INS_USR_NM IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN FCM_GP_BATCH.INS_TS IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN FCM_GP_BATCH.INS_FUNC_ID IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_CNTR IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_USR_ID IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_USR_NM IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_TS IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_FUNC_ID IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN FCM_GP_BATCH.UPD_SRV_REQ_NO IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

