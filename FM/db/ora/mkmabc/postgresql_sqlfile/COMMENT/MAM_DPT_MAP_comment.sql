\encoding UTF-8

COMMENT ON VIEW mam_dpt_map IS '部門変更対応マスタ // Dept. changes corresponding master';


COMMENT ON COLUMN mam_dpt_map.old_dpt_cd IS '旧部門ＣＤ // #MA.DPT_CD // Old dept. cd.';


COMMENT ON COLUMN mam_dpt_map.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_dpt_map.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_dpt_map.new_dpt_cd IS '新部門ＣＤ // #MA.DPT_CD // New dept. cd.';


COMMENT ON COLUMN mam_dpt_map.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_dpt_map.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_dpt_map.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_dpt_map.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_dpt_map.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_dpt_map.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_dpt_map.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_dpt_map.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_dpt_map.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_dpt_map.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

