\encoding UTF-8

COMMENT ON VIEW mam_slip_form IS '伝票帳票マスタ // Slip report master';


COMMENT ON COLUMN mam_slip_form.slip_form_cd IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN mam_slip_form.slip_form_nm IS '伝票帳票名 // #MA.SLIP_FORM_NM // Slip report name';


COMMENT ON COLUMN mam_slip_form.base_slip_form_nm IS '伝票帳票名（ベース） // #MA.SLIP_FORM_NM // Slip report name(Base)';


COMMENT ON COLUMN mam_slip_form.slip_form_id IS '帳票ＩＤ // #MA.SLIP_FORM_ID // Report ID';


COMMENT ON COLUMN mam_slip_form.copy_slip_form_id IS '控帳票ＩＤ // #MA.SLIP_FORM_ID // Refrain slip ID';


COMMENT ON COLUMN mam_slip_form.line_num IS '行数 // #MA.INT // Number of rows';


COMMENT ON COLUMN mam_slip_form.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_slip_form.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_slip_form.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_slip_form.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_slip_form.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_slip_form.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_slip_form.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_slip_form.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_slip_form.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_slip_form.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_slip_form.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_slip_form.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_slip_form.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_slip_form.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_slip_form.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_slip_form.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_slip_form.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

