\encoding UTF-8

COMMENT ON TABLE mam_slip_jnl_cmn IS '会計伝票区分仕訳マスタ_（共通）_ // Accounting slip type journal master_(Common)_';


COMMENT ON COLUMN mam_slip_jnl_cmn.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mam_slip_jnl_cmn.summary_typ IS '集計区分 // #MA.SUMMARY_TYP // Aggregation type';


COMMENT ON COLUMN mam_slip_jnl_cmn.slo_no_flg IS '受注ＮＯ使用ＦＬＧ // #MA.FLG // Sales order No. used flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.po_no_flg IS '発注ＮＯ使用ＦＬＧ // #MA.FLG // PO No. use flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.iv_no_flg IS 'インボイスＮＯ使用ＦＬＧ // #MA.FLG // Invoice No. used flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.bill_no_flg IS '請求／支払ＮＯ使用ＦＬＧ // #MA.FLG // Billing/payment No. used flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.trd_unit_flg IS '取引単位使用ＦＬＧ // #MA.FLG // Transaction unit used flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.red_input_flg IS '取消データ取込ＦＬＧ // #MA.FLG // Cancel data import flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.jnl_act_cd IS '仕訳実行ＣＤ // #MA.JNL_ACT_CD // Journalizing cd.';


COMMENT ON COLUMN mam_slip_jnl_cmn.auto_jnl_key_cd IS '自動仕訳キーＣＤ // #MA.AUTO_JNL_KEY_CD // Auto-journal key cd.';


COMMENT ON COLUMN mam_slip_jnl_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_slip_jnl_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_slip_jnl_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_slip_jnl_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_slip_jnl_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_slip_jnl_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_slip_jnl_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_slip_jnl_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_slip_jnl_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_slip_jnl_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_slip_jnl_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_slip_jnl_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

