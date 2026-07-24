\encoding UTF-8

COMMENT ON TABLE mam_pre_alc_dpt_all IS '一次配賦先部門マスタ // Departmental alloc. destination dept. master';


COMMENT ON COLUMN mam_pre_alc_dpt_all.pre_alc_dpt_ptn IS '配賦先部門パタン // #MA.PRE_ALC_DPT_PTN // Allocation destination department pattern';


COMMENT ON COLUMN mam_pre_alc_dpt_all.src_dpt_cd IS '配賦元部門ＣＤ // #MA.COST_DPT_CD // Allocation source dept. cd.';


COMMENT ON COLUMN mam_pre_alc_dpt_all.dst_dpt_cd IS '配賦先部門ＣＤ // #MA.COST_DPT_CD // Allocation destination dept. cd.';


COMMENT ON COLUMN mam_pre_alc_dpt_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mam_pre_alc_dpt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_pre_alc_dpt_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pre_alc_dpt_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pre_alc_dpt_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pre_alc_dpt_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pre_alc_dpt_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pre_alc_dpt_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pre_alc_dpt_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pre_alc_dpt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pre_alc_dpt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pre_alc_dpt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pre_alc_dpt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pre_alc_dpt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

