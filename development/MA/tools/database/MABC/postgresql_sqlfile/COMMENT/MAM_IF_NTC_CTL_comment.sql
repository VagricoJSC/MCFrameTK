\encoding UTF-8

COMMENT ON VIEW mam_if_ntc_ctl IS 'ＩＦ通知制御マスタ // IF notification control master';


COMMENT ON COLUMN mam_if_ntc_ctl.module_id IS 'モジュールＩＤ // #MA.MODULE_ID // Module ID';


COMMENT ON COLUMN mam_if_ntc_ctl.logic_id IS 'ロジックＩＤ // #MA.LOGIC_ID // Logic ID';


COMMENT ON COLUMN mam_if_ntc_ctl.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_if_ntc_ctl.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mam_if_ntc_ctl.ntc_title IS '通知タイトル // #MA.NTC_TITLE // Notification title';


COMMENT ON COLUMN mam_if_ntc_ctl.biz_usr_ntc_flg IS '業務担当者通知ＦＬＧ // #MA.FLG // Business PIC notification flg.';


COMMENT ON COLUMN mam_if_ntc_ctl.msg_lvl IS '受信メッセージレベル // #MA.MSG_LVL // Receiving message level';


COMMENT ON COLUMN mam_if_ntc_ctl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_if_ntc_ctl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_if_ntc_ctl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_if_ntc_ctl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_if_ntc_ctl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_if_ntc_ctl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_if_ntc_ctl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_if_ntc_ctl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_if_ntc_ctl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_if_ntc_ctl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_if_ntc_ctl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_if_ntc_ctl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

