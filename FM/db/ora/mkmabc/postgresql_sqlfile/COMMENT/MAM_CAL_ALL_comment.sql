\encoding UTF-8

COMMENT ON TABLE mam_cal_all IS 'カレンダマスタ_（全社）_ // Calendar master_(Company-wide)_';


COMMENT ON COLUMN mam_cal_all.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mam_cal_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_cal_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_cal_all.sun_off_flg IS '日曜休日ＦＬＧ // #MA.FLG // Sunday holiday flg.';


COMMENT ON COLUMN mam_cal_all.mon_off_flg IS '月曜休日ＦＬＧ // #MA.FLG // Monday holiday flg.';


COMMENT ON COLUMN mam_cal_all.tue_off_flg IS '火曜休日ＦＬＧ // #MA.FLG // Tuesday holiday flg.';


COMMENT ON COLUMN mam_cal_all.wed_off_flg IS '水曜休日ＦＬＧ // #MA.FLG // Wednesday holiday flg.';


COMMENT ON COLUMN mam_cal_all.thu_off_flg IS '木曜休日ＦＬＧ // #MA.FLG // Thursday holiday flg.';


COMMENT ON COLUMN mam_cal_all.fri_off_flg IS '金曜休日ＦＬＧ // #MA.FLG // Friday holiday flg.';


COMMENT ON COLUMN mam_cal_all.sat_off_flg IS '土曜休日ＦＬＧ // #MA.FLG // Saturday holiday flg.';


COMMENT ON COLUMN mam_cal_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cal_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cal_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cal_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_cal_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_cal_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_cal_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_cal_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cal_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cal_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cal_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cal_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cal_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cal_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cal_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cal_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cal_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_cal_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

