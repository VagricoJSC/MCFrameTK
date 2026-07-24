\encoding UTF-8

COMMENT ON VIEW mst_iv_no IS 'インボイスＮＯ // Invoice No.';


COMMENT ON COLUMN mst_iv_no.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_iv_no.sub_char1 IS '予備１ // #MS.IV_NO_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_iv_no.sub_char2 IS '予備２ // #MS.IV_NO_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_iv_no.sub_char3 IS '予備３ // #MS.IV_NO_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_iv_no.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_iv_no.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_iv_no.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_iv_no.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_iv_no.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_iv_no.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_iv_no.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_iv_no.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_iv_no.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_iv_no.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

