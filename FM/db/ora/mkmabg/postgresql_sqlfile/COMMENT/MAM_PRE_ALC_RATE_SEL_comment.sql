\encoding UTF-8

COMMENT ON VIEW mam_pre_alc_rate_sel IS '一次配賦基準選択マスタ // Departmental alloc. basis selection master';


COMMENT ON COLUMN mam_pre_alc_rate_sel.alc_ac_cd IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mam_pre_alc_rate_sel.pre_alc_rate_cd IS '一次配賦基準ＣＤ // #MA.PRE_ALC_RATE_CD // Departmental alloc. basis cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.trd_alc_ac_cd IS '振替配賦科目ＣＤ // #MA.ALC_AC_CD // Transfer allocation account cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.trd_wg_cd IS '振替ワーキンググループＣＤ // #MA.WG_CD // Transfer WG cd.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.pre_alc_dpt_ptn IS '配賦先部門パタン // #MA.PRE_ALC_DPT_PTN // Allocation destination department pattern';


COMMENT ON COLUMN mam_pre_alc_rate_sel.fin_flg IS '終了ＦＬＧ // #MA.FLG // Terminate flg.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pre_alc_rate_sel.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pre_alc_rate_sel.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pre_alc_rate_sel.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pre_alc_rate_sel.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pre_alc_rate_sel.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pre_alc_rate_sel.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pre_alc_rate_sel.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pre_alc_rate_sel.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pre_alc_rate_sel.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pre_alc_rate_sel.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pre_alc_rate_sel.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

