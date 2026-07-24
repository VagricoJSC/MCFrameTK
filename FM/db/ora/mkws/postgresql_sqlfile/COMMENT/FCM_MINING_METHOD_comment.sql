\encoding UTF-8

COMMENT ON TABLE fcm_mining_method IS 'マイニング方法 // Mining method';


COMMENT ON COLUMN fcm_mining_method.mining_id IS 'マイニングＩＤ // #FC.MINING_ID // Mining ID';


COMMENT ON COLUMN fcm_mining_method.col_id IS '項目名 // #FC.RES_KEY // Column name';


COMMENT ON COLUMN fcm_mining_method.col_nm IS '表示名称 // #FC.RES_VAL // Display name';


COMMENT ON COLUMN fcm_mining_method.list_order IS '表示順序 // #FC.SORT_ORDER // Display sequence';


COMMENT ON COLUMN fcm_mining_method.sum_info_typ IS '集計区分 // #FC.SUM_INFO_TYP // Aggregation type';


COMMENT ON COLUMN fcm_mining_method.sumcond IS '集計条件名 // #FC.RES_VAL // Aggregation criteria name';


COMMENT ON COLUMN fcm_mining_method.rank_flg IS '順位ＦＬＧ // #FC.FLG // Ranking flg.';


COMMENT ON COLUMN fcm_mining_method.rank_typ IS '順位ソート区分 // #FC.SORT_TYP // Rank sort type';


COMMENT ON COLUMN fcm_mining_method.rank_size IS '有効順位 // #FC.INT // Valid order';


COMMENT ON COLUMN fcm_mining_method.date_fmt IS '日時書式 // #FC.RES_VAL // Date and time format';


COMMENT ON COLUMN fcm_mining_method.fill_dt_flg IS '日時補完ＦＬＧ // #FC.FLG // Date and time complement flg.';


COMMENT ON COLUMN fcm_mining_method.fill_dt_fm IS '日時補完開始日時 // #FC.TS // Date and time complement start date and time';


COMMENT ON COLUMN fcm_mining_method.fill_dt_to IS '日時補完終了日時 // #FC.TS // Date and time complement end date and time';


COMMENT ON COLUMN fcm_mining_method.formula IS '計算式 // #FC.FORMULA // Calculation formula';


COMMENT ON COLUMN fcm_mining_method.dec_place IS '小数部有効桁数 // #FC.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN fcm_mining_method.round_mode_typ IS '端数処理区分 // #FC.ROUND_MODE_TYP // Rounding type';


COMMENT ON COLUMN fcm_mining_method.null_zero IS 'NULL集計0変換 // #FC.FLG // Convert to 0 when aggregation is null';


COMMENT ON COLUMN fcm_mining_method.sort_order IS 'ソート順 // #FC.SORT_ORDER // Sort order';


COMMENT ON COLUMN fcm_mining_method.sort_typ IS 'ソート区分 // #FC.SORT_TYP // Sort type';


COMMENT ON COLUMN fcm_mining_method.graph_typ IS 'グラフ種類 // #FC.GRAPH_TYP // Chart type';


COMMENT ON COLUMN fcm_mining_method.graph_label_flg IS 'グラフ行ラベルＦＬＧ // #FC.FLG // Chart row label flg.';


COMMENT ON COLUMN fcm_mining_method.graph_color IS 'グラフ色 // #FC.COLOR // Chart color';


COMMENT ON COLUMN fcm_mining_method.inv_flg IS '無効ＦＬＧ // #FC.FLG // Invalid flg.';


COMMENT ON COLUMN fcm_mining_method.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fcm_mining_method.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fcm_mining_method.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fcm_mining_method.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fcm_mining_method.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fcm_mining_method.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fcm_mining_method.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fcm_mining_method.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fcm_mining_method.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fcm_mining_method.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

