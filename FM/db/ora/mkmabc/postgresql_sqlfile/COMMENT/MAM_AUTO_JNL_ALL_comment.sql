\encoding UTF-8

COMMENT ON TABLE mam_auto_jnl_all IS '自動仕訳マスタ_（全社）_ // Auto-journal master_(Company-wide)_';


COMMENT ON COLUMN mam_auto_jnl_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_auto_jnl_all.auto_jnl_key_cd IS '自動仕訳キーＣＤ // #MA.AUTO_JNL_KEY_CD // Auto-journal key cd.';


COMMENT ON COLUMN mam_auto_jnl_all.auto_jnl_grp IS '自動仕訳グループ // #MA.AUTO_JNL_GRP // Auto-journal group';


COMMENT ON COLUMN mam_auto_jnl_all.jnl_ptn_cd IS '仕訳パタンＣＤ // #MA.JNL_PTN_CD // Journal pattern cd.';


COMMENT ON COLUMN mam_auto_jnl_all.prio IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN mam_auto_jnl_all.ac_if_typ IS '会計ＩＦ区分 // #MA.AC_IF_TYP // Accounting IF type';


COMMENT ON COLUMN mam_auto_jnl_all.id_typ IS '伝票ＩＤ区分 // #MA.ID_TYP // Slip ID type';


COMMENT ON COLUMN mam_auto_jnl_all.slip_cnt_id IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN mam_auto_jnl_all.std_rnd_typ IS '標準評価端数処理区分 // #MA.RND_TYP // Standard evaluation rounding type';


COMMENT ON COLUMN mam_auto_jnl_all.cls_jnl_typ IS '決算仕訳区分 // #MA.CLS_JNL_TYP // Closing entry type';


COMMENT ON COLUMN mam_auto_jnl_all.compound_jnl_typ IS '複合仕訳区分 // #MA.COMPOUND_JNL_TYP // Compound journal type';


COMMENT ON COLUMN mam_auto_jnl_all.alloc_jnl_flg IS '配賦仕訳ＦＬＧ // #MA.FLG // Allocation journal flg.';


COMMENT ON COLUMN mam_auto_jnl_all.minus_flg IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN mam_auto_jnl_all.rev_flg IS '貸借逆転ＦＬＧ // #MA.FLG // Debit credit reverse flg.';


COMMENT ON COLUMN mam_auto_jnl_all.minus_rev_flg IS 'マイナス逆転ＦＬＧ // #MA.FLG // Reverse minus flg.';


COMMENT ON COLUMN mam_auto_jnl_all.default_flg IS 'デフォルトＦＬＧ // #MA.FLG // Default flg.';


COMMENT ON COLUMN mam_auto_jnl_all.abs_typ IS '摘要区分 // #MA.ABS_TYP // Abstract type';


COMMENT ON COLUMN mam_auto_jnl_all.abstract1 IS '摘要 // #MA.ABSTRACT_M // Abstract';


COMMENT ON COLUMN mam_auto_jnl_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_auto_jnl_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_auto_jnl_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_auto_jnl_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_auto_jnl_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_auto_jnl_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_auto_jnl_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_auto_jnl_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_auto_jnl_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_auto_jnl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_auto_jnl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_auto_jnl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_auto_jnl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_auto_jnl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_auto_jnl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_auto_jnl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_auto_jnl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_auto_jnl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_auto_jnl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_auto_jnl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

