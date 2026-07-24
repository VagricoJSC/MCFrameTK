\encoding UTF-8

COMMENT ON TABLE mam_dpt_his_cmn IS '組織変更履歴マスタ_（共通）_ // Organizational changes history master_(Common)_';


COMMENT ON COLUMN mam_dpt_his_cmn.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_dpt_his_cmn.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_dpt_his_cmn.dpt_his_rmrks IS '組織変更備考 // #MA.DPT_HIS_RMRKS // Organizational changes remarks';


COMMENT ON COLUMN mam_dpt_his_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_dpt_his_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_dpt_his_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_dpt_his_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_dpt_his_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_dpt_his_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_dpt_his_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_dpt_his_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

