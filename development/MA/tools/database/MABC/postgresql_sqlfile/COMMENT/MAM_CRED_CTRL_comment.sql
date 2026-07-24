\encoding UTF-8

COMMENT ON VIEW mam_cred_ctrl IS '与信限度額マスタ // Credit limit master';


COMMENT ON COLUMN mam_cred_ctrl.cred_cd IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN mam_cred_ctrl.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mam_cred_ctrl.cred_limit IS '与信限度額 // #MA.MONEY // Credit limit';


COMMENT ON COLUMN mam_cred_ctrl.alarm_point IS 'アラーム使用率 // #MA.PER // Alarm usage rate';


COMMENT ON COLUMN mam_cred_ctrl.act_typ IS '限度額超過処理区分 // #MA.CRED_ACT_TYP // Excess of limit amount process type';


COMMENT ON COLUMN mam_cred_ctrl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cred_ctrl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cred_ctrl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cred_ctrl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_cred_ctrl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_cred_ctrl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_cred_ctrl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_cred_ctrl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cred_ctrl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cred_ctrl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cred_ctrl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cred_ctrl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cred_ctrl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cred_ctrl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cred_ctrl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cred_ctrl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cred_ctrl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

