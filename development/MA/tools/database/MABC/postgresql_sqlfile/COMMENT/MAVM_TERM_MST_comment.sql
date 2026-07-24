\encoding UTF-8

COMMENT ON VIEW mavm_term_mst IS '対象期間マスタビュー // Term master view';


COMMENT ON COLUMN mavm_term_mst.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mavm_term_mst.term_end_ym IS '期終了年月 // #MA.YM // End month of term';


COMMENT ON COLUMN mavm_term_mst.term_nm IS '期名称 // #MA.TERM_NM // Term name';


COMMENT ON COLUMN mavm_term_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_term_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_term_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_term_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_term_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_term_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_term_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_term_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_term_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_term_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_term_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_term_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_term_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_term_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_term_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_term_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_term_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_term_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_term_mst.term_nm_lcl1 IS '期名称（ロケール１） // #MA.TERM_NM // Term name (Locale 1)';


COMMENT ON COLUMN mavm_term_mst.term_nm_lcl2 IS '期名称（ロケール２） // #MA.TERM_NM // Term name (Locale 2)';


COMMENT ON COLUMN mavm_term_mst.term_nm_lcl3 IS '期名称（ロケール３） // #MA.TERM_NM // Term name (Locale 3)';


COMMENT ON COLUMN mavm_term_mst.term_nm_lcl4 IS '期名称（ロケール４） // #MA.TERM_NM // Term name (Locale 4)';


COMMENT ON COLUMN mavm_term_mst.term_nm_lcl5 IS '期名称（ロケール５） // #MA.TERM_NM // Term name (Locale 5)';

