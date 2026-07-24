\encoding UTF-8

COMMENT ON TABLE fct_searchcondition IS '履歴検索条件 // History search criteria';


COMMENT ON COLUMN fct_searchcondition.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_searchcondition.table_name IS 'テーブル名 // #FC.TABLE_NAME // Table name';


COMMENT ON COLUMN fct_searchcondition.rows_no IS '表示順 // #FC.ROWS_NO // Display order';


COMMENT ON COLUMN fct_searchcondition.valid_flg IS '表示ＦＬＧ // #FC.FLG // Display flg.';


COMMENT ON COLUMN fct_searchcondition.column_name IS '項目名 // #FC.COLUMN_NAME // Column name';


COMMENT ON COLUMN fct_searchcondition.search_operator IS '検索条件 // #FC.SEARCH_OPERATOR // Search criteria';


COMMENT ON COLUMN fct_searchcondition.search_value IS '検索値 // #FC.SEARCH_VALUE // Search value';


COMMENT ON COLUMN fct_searchcondition.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_searchcondition.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_searchcondition.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_searchcondition.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_searchcondition.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_searchcondition.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_searchcondition.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_searchcondition.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_searchcondition.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_searchcondition.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

