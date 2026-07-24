\encoding UTF-8

COMMENT ON TABLE mam_rec_eval_set_all IS '個別評価設定マスタ // Individual evaluation setting master';


COMMENT ON COLUMN mam_rec_eval_set_all.set_tgt_typ IS '設定対象区分 // #MA.SET_TGT_TYP // Setting type';


COMMENT ON COLUMN mam_rec_eval_set_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_rec_eval_set_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_rec_eval_set_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mam_rec_eval_set_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_rec_eval_set_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_rec_eval_set_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_rec_eval_set_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_rec_eval_set_all.amt_set_typ IS '金額設定区分 // #MA.AMT_SET_TYP // Amount setting type';


COMMENT ON COLUMN mam_rec_eval_set_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mam_rec_eval_set_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rec_eval_set_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rec_eval_set_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rec_eval_set_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rec_eval_set_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rec_eval_set_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rec_eval_set_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rec_eval_set_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rec_eval_set_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rec_eval_set_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rec_eval_set_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rec_eval_set_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

