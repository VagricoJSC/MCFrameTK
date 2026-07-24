\encoding UTF-8

COMMENT ON TABLE mac_push_ntc_clt IS '通知クライアント管理 // Notification client management';


COMMENT ON COLUMN mac_push_ntc_clt.push_ntc_typ IS 'プッシュ通知区分 // #MA.PUSH_NTC_TYP // Push notification type';


COMMENT ON COLUMN mac_push_ntc_clt.client_typ IS 'クライアント区分 // #MA.CLIENT_TYP // Client type';


COMMENT ON COLUMN mac_push_ntc_clt.trans_module_id IS '遷移先モジュールＩＤ // #MA.MODULE_ID // Transition destination module ID';


COMMENT ON COLUMN mac_push_ntc_clt.trans_screen_id IS '遷移先画面ＩＤ // #MA.SCREEN_ID // Transition destination screen ID';


COMMENT ON COLUMN mac_push_ntc_clt.trans_btn_path IS '遷移後実行ボタン // #MA.IC_STR // Execute after transition button';


COMMENT ON COLUMN mac_push_ntc_clt.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mac_push_ntc_clt.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mac_push_ntc_clt.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mac_push_ntc_clt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mac_push_ntc_clt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mac_push_ntc_clt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mac_push_ntc_clt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mac_push_ntc_clt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mac_push_ntc_clt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mac_push_ntc_clt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mac_push_ntc_clt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mac_push_ntc_clt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mac_push_ntc_clt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

