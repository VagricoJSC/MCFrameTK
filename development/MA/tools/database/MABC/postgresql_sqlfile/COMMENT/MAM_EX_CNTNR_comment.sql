\encoding UTF-8

COMMENT ON VIEW mam_ex_cntnr IS '輸出梱包容器マスタ // Export package container master';


COMMENT ON COLUMN mam_ex_cntnr.cntnr_cd IS '梱包容器ＣＤ // #MA.CNTNR_CD // Packing container cd.';


COMMENT ON COLUMN mam_ex_cntnr.cntnr_nm IS '梱包容器名 // #MA.CNTNR_NM // Packing container name';


COMMENT ON COLUMN mam_ex_cntnr.base_cntnr_nm IS '梱包容器名（ベース） // #MA.CNTNR_NM // Packing container name(Base)';


COMMENT ON COLUMN mam_ex_cntnr.wt IS '重量 // #MA.WT // Weight';


COMMENT ON COLUMN mam_ex_cntnr.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_ex_cntnr.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_ex_cntnr.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_ex_cntnr.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_ex_cntnr.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_ex_cntnr.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_ex_cntnr.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_ex_cntnr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_ex_cntnr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_ex_cntnr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_ex_cntnr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_ex_cntnr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_ex_cntnr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_ex_cntnr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_ex_cntnr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_ex_cntnr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_ex_cntnr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

