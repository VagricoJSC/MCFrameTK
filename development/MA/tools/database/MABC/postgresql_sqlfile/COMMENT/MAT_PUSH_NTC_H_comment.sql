\encoding UTF-8

COMMENT ON VIEW mat_push_ntc_h IS 'プッシュ通知ヘッダ // Push notification header';


COMMENT ON COLUMN mat_push_ntc_h.push_ntc_no IS 'プッシュ通知ＮＯ // #MA.PUSH_NTC_NO // Push notifications No.';


COMMENT ON COLUMN mat_push_ntc_h.push_ntc_typ IS 'プッシュ通知区分 // #MA.PUSH_NTC_TYP // Push notification type';


COMMENT ON COLUMN mat_push_ntc_h.msg_id IS 'メッセージＩＤ // #MA.MSG_ID // Message ID';


COMMENT ON COLUMN mat_push_ntc_h.src_module_id IS '通知元モジュールＩＤ // #MA.MODULE_ID // Notify-from module ID';


COMMENT ON COLUMN mat_push_ntc_h.src_logic_id IS '通知元ロジックＩＤ // #MA.OPERATION // Notify-from logic ID';


COMMENT ON COLUMN mat_push_ntc_h.src_operation_id IS '通知元オペレーションＩＤ // #MA.OPERATION // Notify-from operation ID';


COMMENT ON COLUMN mat_push_ntc_h.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mat_push_ntc_h.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mat_push_ntc_h.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mat_push_ntc_h.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mat_push_ntc_h.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mat_push_ntc_h.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mat_push_ntc_h.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mat_push_ntc_h.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mat_push_ntc_h.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mat_push_ntc_h.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

