\encoding UTF-8

COMMENT ON TABLE fct_running_grps IS '実行中グループ // Executing group';


COMMENT ON COLUMN fct_running_grps.req_no IS 'サーバ処理番号 // #FC.SRV_REQ_NO // Server process number';


COMMENT ON COLUMN fct_running_grps.ope_id IS 'オペレーションＩＤ // #FC.PARA_ITM_PTN // Operation ID';


COMMENT ON COLUMN fct_running_grps.gid IS '内部グループＩＤ // #FC.ROW_ID // Internal group ID';


COMMENT ON COLUMN fct_running_grps.man_flg IS '手動ＦＬＧ // #FC.FLG // Manual flg.';


COMMENT ON COLUMN fct_running_grps.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_running_grps.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_running_grps.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_running_grps.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_running_grps.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_running_grps.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_running_grps.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_running_grps.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_running_grps.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_running_grps.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

