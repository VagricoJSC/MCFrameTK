\encoding UTF-8

COMMENT ON TABLE fcm_mining_condition IS 'マイニング検索条件 // Mining search criteria';


COMMENT ON COLUMN fcm_mining_condition.mining_id IS 'マイニングＩＤ // #FC.MINING_ID // Mining ID';


COMMENT ON COLUMN fcm_mining_condition.col_id IS '項目名 // #FC.RES_KEY // Column name';


COMMENT ON COLUMN fcm_mining_condition.col_nm IS '表示名称 // #FC.RES_VAL // Display name';


COMMENT ON COLUMN fcm_mining_condition.list_order IS '表示順序 // #FC.SORT_ORDER // Display sequence';


COMMENT ON COLUMN fcm_mining_condition.scr_itm_id IS '画面項目名 // #FC.COLUMN_ID // Screen column name';


COMMENT ON COLUMN fcm_mining_condition.md_itm_id IS 'ＭＤ画面項目名 // #FC.COLUMN_ID // MD screen column name';


COMMENT ON COLUMN fcm_mining_condition.data_typ IS 'データ型区分 // #FC.DATA_TYPE_TYP // Data type';


COMMENT ON COLUMN fcm_mining_condition.require_flg IS '必須ＦＬＧ // #FC.FLG // Required flg.';


COMMENT ON COLUMN fcm_mining_condition.init_val IS '初期値 // #FC.RES_VAL // Initial value';


COMMENT ON COLUMN fcm_mining_condition.editable_flg IS '編集可ＦＬＧ // #FC.FLG // Editable flg.';


COMMENT ON COLUMN fcm_mining_condition.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_mining_condition.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_mining_condition.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_mining_condition.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_mining_condition.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_mining_condition.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_mining_condition.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_mining_condition.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_mining_condition.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_mining_condition.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

