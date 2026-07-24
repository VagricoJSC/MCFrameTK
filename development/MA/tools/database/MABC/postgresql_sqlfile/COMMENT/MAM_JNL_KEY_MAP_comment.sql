\encoding UTF-8

COMMENT ON VIEW mam_jnl_key_map IS '仕訳キー対応マスタ // Journal key mapping master';


COMMENT ON COLUMN mam_jnl_key_map.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_jnl_key_map.cost_flg IS '原価ＦＬＧ // #MA.FLG // Cost flg.';


COMMENT ON COLUMN mam_jnl_key_map.jnl_key_col_typ IS '仕訳キー項目区分 // #MA.JNL_KEY_COL_TYP // Journal key column type';


COMMENT ON COLUMN mam_jnl_key_map.jnl_key_set_col_typ IS '仕訳キー設定項目区分 // #MA.JNL_KEY_SET_COL_TYP // Journal key setting column type';


COMMENT ON COLUMN mam_jnl_key_map.bp_jnl_key_set_col_typ IS '取引先仕訳キー設定項目区分 // #MA.JNL_KEY_SET_COL_TYP // BP journal key setting column type';


COMMENT ON COLUMN mam_jnl_key_map.default_cd IS 'デフォルトＣＤ // #MA.JNL_KEY // Default cd.';


COMMENT ON COLUMN mam_jnl_key_map.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_jnl_key_map.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_jnl_key_map.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_jnl_key_map.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_jnl_key_map.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_jnl_key_map.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_jnl_key_map.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_jnl_key_map.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_jnl_key_map.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_jnl_key_map.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_jnl_key_map.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_jnl_key_map.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_jnl_key_map.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_jnl_key_map.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_jnl_key_map.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_jnl_key_map.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_jnl_key_map.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

