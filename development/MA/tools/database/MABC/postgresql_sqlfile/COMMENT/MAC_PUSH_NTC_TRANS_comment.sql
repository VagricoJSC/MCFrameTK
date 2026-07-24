\encoding UTF-8

COMMENT ON TABLE mac_push_ntc_trans IS 'プッシュ通知遷移情報管理 // Push notification transition info. management';


COMMENT ON COLUMN mac_push_ntc_trans.push_ntc_typ IS 'プッシュ通知区分 // #MA.PUSH_NTC_TYP // Push notification type';


COMMENT ON COLUMN mac_push_ntc_trans.column_seq IS 'カラム順序 // #MA.INT // Column sequence';


COMMENT ON COLUMN mac_push_ntc_trans.client_typ IS 'クライアント区分 // #MA.CLIENT_TYP // Client type';


COMMENT ON COLUMN mac_push_ntc_trans.column_path IS 'カラムパス // #MA.IC_STR // Column path';


COMMENT ON COLUMN mac_push_ntc_trans.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mac_push_ntc_trans.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mac_push_ntc_trans.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mac_push_ntc_trans.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mac_push_ntc_trans.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mac_push_ntc_trans.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mac_push_ntc_trans.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mac_push_ntc_trans.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mac_push_ntc_trans.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mac_push_ntc_trans.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mac_push_ntc_trans.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mac_push_ntc_trans.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mac_push_ntc_trans.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

