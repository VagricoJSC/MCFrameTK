\encoding UTF-8

COMMENT ON VIEW mat_push_ntc_trans IS 'プッシュ通知遷移情報明細 // Push notification transition info. details';


COMMENT ON COLUMN mat_push_ntc_trans.push_ntc_no IS 'プッシュ通知ＮＯ // #MA.PUSH_NTC_NO // Push notifications No.';


COMMENT ON COLUMN mat_push_ntc_trans.column_seq IS 'カラム順序 // #MA.INT // Column sequence';


COMMENT ON COLUMN mat_push_ntc_trans.data_val IS 'データ値 // #MA.IC_STR // Data values';


COMMENT ON COLUMN mat_push_ntc_trans.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mat_push_ntc_trans.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mat_push_ntc_trans.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mat_push_ntc_trans.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mat_push_ntc_trans.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mat_push_ntc_trans.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mat_push_ntc_trans.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mat_push_ntc_trans.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mat_push_ntc_trans.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mat_push_ntc_trans.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

