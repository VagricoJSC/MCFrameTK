\encoding UTF-8

COMMENT ON VIEW mam_push_ntc IS 'プッシュ通知制御マスタ // Push notification control master';


COMMENT ON COLUMN mam_push_ntc.push_ntc_typ IS 'プッシュ通知区分 // #MA.PUSH_NTC_TYP // Push notification type';


COMMENT ON COLUMN mam_push_ntc.ntc_wg_cd IS '通知先ワーキンググループＣＤ // #MA.WG_CD // Notify-to WG cd.';


COMMENT ON COLUMN mam_push_ntc.ntc_dpt_cd IS '通知先部門ＣＤ // #MA.DPT_CD // Notify-to dept. cd.';


COMMENT ON COLUMN mam_push_ntc.ntc_aprv_role_cd IS '通知先承認役割ＣＤ // #MA.APRV_ROLE_CD // Notify-to approval role cd.';


COMMENT ON COLUMN mam_push_ntc.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_push_ntc.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_push_ntc.msg_imp_typ IS 'メッセージ重要度区分 // #MA.MSG_IMP_TYP // Message importance level';


COMMENT ON COLUMN mam_push_ntc.push_typ IS 'プッシュ受信方式区分 // #MA.PUSH_TYP // Push receiving system type';


COMMENT ON COLUMN mam_push_ntc.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_push_ntc.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_push_ntc.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_push_ntc.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_push_ntc.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_push_ntc.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_push_ntc.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_push_ntc.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_push_ntc.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_push_ntc.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_push_ntc.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_push_ntc.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_push_ntc.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_push_ntc.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_push_ntc.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_push_ntc.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_push_ntc.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

