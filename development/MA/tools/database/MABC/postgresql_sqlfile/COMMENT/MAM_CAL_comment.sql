\encoding UTF-8

COMMENT ON VIEW mam_cal IS 'カレンダマスタ // Calendar master';


COMMENT ON COLUMN mam_cal.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mam_cal.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_cal.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_cal.sun_off_flg IS '日曜休日ＦＬＧ // #MA.FLG // Sunday holiday flg.';


COMMENT ON COLUMN mam_cal.mon_off_flg IS '月曜休日ＦＬＧ // #MA.FLG // Monday holiday flg.';


COMMENT ON COLUMN mam_cal.tue_off_flg IS '火曜休日ＦＬＧ // #MA.FLG // Tuesday holiday flg.';


COMMENT ON COLUMN mam_cal.wed_off_flg IS '水曜休日ＦＬＧ // #MA.FLG // Wednesday holiday flg.';


COMMENT ON COLUMN mam_cal.thu_off_flg IS '木曜休日ＦＬＧ // #MA.FLG // Thursday holiday flg.';


COMMENT ON COLUMN mam_cal.fri_off_flg IS '金曜休日ＦＬＧ // #MA.FLG // Friday holiday flg.';


COMMENT ON COLUMN mam_cal.sat_off_flg IS '土曜休日ＦＬＧ // #MA.FLG // Saturday holiday flg.';


COMMENT ON COLUMN mam_cal.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_cal.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_cal.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_cal.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_cal.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_cal.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_cal.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_cal.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_cal.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_cal.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_cal.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_cal.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_cal.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_cal.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_cal.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_cal.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_cal.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

