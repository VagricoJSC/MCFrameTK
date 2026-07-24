\encoding UTF-8

COMMENT ON VIEW mat_seq IS '発番情報 // Numbering info.';


COMMENT ON COLUMN mat_seq.num_biz_typ IS '発番業務区分 // #MA.NUM_BIZ_TYP // Numbering operation type';


COMMENT ON COLUMN mat_seq.num_ptn_cd IS '発番パタンＣＤ // #MA.NUM_PTN_CD // Numbering pattern cd.';


COMMENT ON COLUMN mat_seq.key_elm IS 'キー要素 // #MA.NUMBERING_UNDISP // Key element';


COMMENT ON COLUMN mat_seq.seq_typ IS 'シーケンス区分 // #MA.SEQ_TYP // Sequence type';


COMMENT ON COLUMN mat_seq.ora_seq_nm IS 'シーケンス名 // #MA.ORA_OBJ_NM // Sequence name';


COMMENT ON COLUMN mat_seq.min_val IS '最小値 // #MA.NUM_SEQ // Min. value';


COMMENT ON COLUMN mat_seq.max_val IS '最大値 // #MA.NUM_SEQ // Max. value';


COMMENT ON COLUMN mat_seq.increment_by IS '増加量 // #MA.NUM_INC // Increment';


COMMENT ON COLUMN mat_seq.cycl_flg IS '自動リセット許可ＦＬＧ // #MA.FLG // Allow auto-reset flg.';


COMMENT ON COLUMN mat_seq.last_val IS '現在値 // #MA.NUM_SEQ // Current value';


COMMENT ON COLUMN mat_seq.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mat_seq.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mat_seq.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mat_seq.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mat_seq.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mat_seq.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mat_seq.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mat_seq.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mat_seq.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mat_seq.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

