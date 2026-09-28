\encoding UTF-8

COMMENT ON TABLE mam_out_appr_all IS '外注者決裁者マスタ // Sales forecast aggregated';


COMMENT ON COLUMN mam_out_appr_all.appr_acnt_id8 IS '決済者個人番号８桁 // #MA.USR_CD // ';


COMMENT ON COLUMN mam_out_appr_all.acnt_id8 IS '個人番号８桁 // #MA.USR_CD // ';


COMMENT ON COLUMN mam_out_appr_all.co_cd IS '会社CD // #MA.CO_CD // ';


COMMENT ON COLUMN mam_out_appr_all.appr_acnt_id5 IS '決済者個人番号５桁 // #MA.USR_CD // ';


COMMENT ON COLUMN mam_out_appr_all.acnt_id5 IS '個人番号５桁 // #MA.USR_CD // ';


COMMENT ON COLUMN mam_out_appr_all.main_appr_flg IS '主決済者フラグ // #MA.FLG // ';


COMMENT ON COLUMN mam_out_appr_all.upd_acnt_id IS '更新者 // #MA.USR_CD // ';


COMMENT ON COLUMN mam_out_appr_all.upd_dat IS '更新日時 // #MA.SYS_TS // ';


COMMENT ON COLUMN mam_out_appr_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_out_appr_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_out_appr_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_out_appr_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_out_appr_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_out_appr_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_out_appr_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_out_appr_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_out_appr_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_out_appr_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_out_appr_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_out_appr_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_out_appr_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_out_appr_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_out_appr_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_out_appr_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_out_appr_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

