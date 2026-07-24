\encoding UTF-8

COMMENT ON TABLE fcm_mining_sumcond IS 'マイニング集計条件 // Mining aggregation criteria';


COMMENT ON COLUMN fcm_mining_sumcond.mining_id IS 'マイニングＩＤ // #FC.MINING_ID // Mining ID';


COMMENT ON COLUMN fcm_mining_sumcond.sumcond IS '集計条件名 // #FC.RES_VAL // Aggregation criteria name';


COMMENT ON COLUMN fcm_mining_sumcond.list_order IS '順序 // #FC.SORT_ORDER // Sequence';


COMMENT ON COLUMN fcm_mining_sumcond.col_id IS '比較項目名 // #FC.RES_KEY // Comparison column name';


COMMENT ON COLUMN fcm_mining_sumcond.data_typ IS 'データ型区分 // #FC.DATA_TYPE_TYP // Data type';


COMMENT ON COLUMN fcm_mining_sumcond.cond_val IS '条件値 // #FC.RES_VAL // Condition value';


COMMENT ON COLUMN fcm_mining_sumcond.relative_ope IS '比較演算子 // #FC.RES_VAL // Comparison operator';


COMMENT ON COLUMN fcm_mining_sumcond.logic_ope IS '論理演算子 // #FC.RES_VAL // Logical operators';


COMMENT ON COLUMN fcm_mining_sumcond.inv_flg IS '無効ＦＬＧ // #FC.FLG // Invalid flg.';


COMMENT ON COLUMN fcm_mining_sumcond.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_mining_sumcond.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_mining_sumcond.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_mining_sumcond.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_mining_sumcond.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_mining_sumcond.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_mining_sumcond.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_mining_sumcond.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_mining_sumcond.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_mining_sumcond.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

