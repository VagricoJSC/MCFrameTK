\encoding UTF-8

COMMENT ON VIEW mam_pre_alc_ctg IS '一次配賦基準カテゴリマスタ // Departmental alloc. basis category master';


COMMENT ON COLUMN mam_pre_alc_ctg.pre_alc_rate_cd IS '一次配賦基準ＣＤ // #MA.PRE_ALC_RATE_CD // Departmental alloc. basis cd.';


COMMENT ON COLUMN mam_pre_alc_ctg.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mam_pre_alc_ctg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_pre_alc_ctg.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mam_pre_alc_ctg.data_pln_sa_typ IS '計画データ予実区分 // #MA.SA_TYP // Planning data plan/result type';


COMMENT ON COLUMN mam_pre_alc_ctg.data_act_sa_typ IS '実績データ予実区分 // #MA.SA_TYP // Result data plan/result type';


COMMENT ON COLUMN mam_pre_alc_ctg.key_pln_sa_typ IS '計画キー予実区分 // #MA.SA_TYP // Plan key plan/result type';


COMMENT ON COLUMN mam_pre_alc_ctg.key_act_sa_typ IS '実績キー予実区分 // #MA.SA_TYP // Result key plan/result type';


COMMENT ON COLUMN mam_pre_alc_ctg.key_pln_ym IS '計画キー対象年月 // #MA.YM // Plan key target month';


COMMENT ON COLUMN mam_pre_alc_ctg.key_act_ym IS '実績キー対象年月 // #MA.YM // Result key target month';


COMMENT ON COLUMN mam_pre_alc_ctg.rate_coeff_flg IS '比率係数ＦＬＧ // #MA.FLG // Ratio coefficient flg.';


COMMENT ON COLUMN mam_pre_alc_ctg.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_pre_alc_ctg.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_pre_alc_ctg.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_pre_alc_ctg.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_pre_alc_ctg.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_pre_alc_ctg.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_pre_alc_ctg.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_pre_alc_ctg.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_pre_alc_ctg.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_pre_alc_ctg.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_pre_alc_ctg.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_pre_alc_ctg.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

