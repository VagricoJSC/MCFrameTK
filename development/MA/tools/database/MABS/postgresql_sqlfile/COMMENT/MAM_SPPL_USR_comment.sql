\encoding UTF-8

COMMENT ON VIEW mam_sppl_usr IS '発注先担当マスタ // Supplier PIC master';


COMMENT ON COLUMN mam_sppl_usr.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mam_sppl_usr.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_sppl_usr.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_sppl_usr.purc_usr_cd IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN mam_sppl_usr.purc_dpt_cd IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN mam_sppl_usr.outsrc_usr_cd IS '外注担当者ＣＤ // #MA.USR_CD // Subcontracting PIC cd.';


COMMENT ON COLUMN mam_sppl_usr.outsrc_dpt_cd IS '外注部門ＣＤ // #MA.DPT_CD // Subcontracting dept. cd.';


COMMENT ON COLUMN mam_sppl_usr.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_sppl_usr.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_sppl_usr.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_sppl_usr.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_sppl_usr.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_sppl_usr.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_sppl_usr.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_sppl_usr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_sppl_usr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_sppl_usr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_sppl_usr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_sppl_usr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_sppl_usr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_sppl_usr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_sppl_usr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_sppl_usr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_sppl_usr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

