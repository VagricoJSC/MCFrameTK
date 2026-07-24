\encoding UTF-8

COMMENT ON VIEW mat_da_wg IS 'ＷＧデータアクセス情報 // WG data access info.';


COMMENT ON COLUMN mat_da_wg.login_seq IS 'ログインシーケンス // #MA.LOGIN_SEQ // Login sequence';


COMMENT ON COLUMN mat_da_wg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mat_da_wg.rd_flg IS '検索可能ＦＬＧ // #MA.FLG // Searchable flg.';


COMMENT ON COLUMN mat_da_wg.wr_flg IS '更新可能ＦＬＧ // #MA.FLG // Updatable flg.';


COMMENT ON COLUMN mat_da_wg.usr_id IS 'ユーザＩＤ // #MA.FCM_USR_ID // User ID';


COMMENT ON COLUMN mat_da_wg.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mat_da_wg.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mat_da_wg.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mat_da_wg.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mat_da_wg.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mat_da_wg.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mat_da_wg.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mat_da_wg.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mat_da_wg.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mat_da_wg.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

