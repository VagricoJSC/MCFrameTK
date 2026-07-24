\encoding UTF-8

COMMENT ON TABLE fcm_gp_batch_args IS '汎用バッチオンライン実行引数マスタ // General purpose online batch execution argument master';


COMMENT ON COLUMN fcm_gp_batch_args.gp_batch_no IS '処理ＮＯ // #FC.GP_BATCH_NO // Process No.';


COMMENT ON COLUMN fcm_gp_batch_args.item_nm IS '項目名 // #FC.GP_BATCH_ITEM_NM // Column name';


COMMENT ON COLUMN fcm_gp_batch_args.required IS '必須 // #FC.FLG // Required';


COMMENT ON COLUMN fcm_gp_batch_args.data_type_typ IS 'データ型区分 // #FC.DATA_TYPE_TYP // Data type';


COMMENT ON COLUMN fcm_gp_batch_args.arg IS '引数 // #FC.GP_BATCH_ARG // Argument';


COMMENT ON COLUMN fcm_gp_batch_args.rmrks IS '備考 // #FC.GP_BATCH_ARG_RMRKS // Remarks';


COMMENT ON COLUMN fcm_gp_batch_args.editable IS '変更可能 // #FC.FLG // Changeable';


COMMENT ON COLUMN fcm_gp_batch_args.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_gp_batch_args.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_gp_batch_args.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_gp_batch_args.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_gp_batch_args.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_gp_batch_args.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_gp_batch_args.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_gp_batch_args.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_gp_batch_args.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_gp_batch_args.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

