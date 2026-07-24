\encoding UTF-8

COMMENT ON VIEW mam_stk_eval IS '在庫評価マスタ // Inventory revaluation master';


COMMENT ON COLUMN mam_stk_eval.stk_eval_cd IS '在庫評価ＣＤ // #MA.STK_EVAL_CD // Inventory revaluation cd.';


COMMENT ON COLUMN mam_stk_eval.stk_eval_nm IS '在庫評価名 // #MA.STK_EVAL_NM // Inventory revaluation name';


COMMENT ON COLUMN mam_stk_eval.base_stk_eval_nm IS '在庫評価名（ベース） // #MA.STK_EVAL_NM // Inventory revaluation name(Base)';


COMMENT ON COLUMN mam_stk_eval.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_stk_eval.cut_flg IS '切捨ＦＬＧ // #MA.FLG // Round down flg.';


COMMENT ON COLUMN mam_stk_eval.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mam_stk_eval.lump_rate_flg IS '一括指定ＦＬＧ // #MA.FLG // Bulk specification flg.';


COMMENT ON COLUMN mam_stk_eval.eval_rate IS '評価率（％） // #MA.RATE // Evaluation rate (%)';


COMMENT ON COLUMN mam_stk_eval.upri_set_typ IS '単価設定区分 // #MA.UPRI_SET_TYP // Unit price setting type';


COMMENT ON COLUMN mam_stk_eval.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_stk_eval.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_stk_eval.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_stk_eval.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_stk_eval.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_stk_eval.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_stk_eval.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_stk_eval.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_stk_eval.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_stk_eval.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_stk_eval.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_stk_eval.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_stk_eval.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_stk_eval.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_stk_eval.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_stk_eval.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_stk_eval.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

