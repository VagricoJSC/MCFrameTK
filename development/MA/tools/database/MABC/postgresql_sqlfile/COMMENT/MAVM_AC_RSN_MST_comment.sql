\encoding UTF-8

COMMENT ON VIEW mavm_ac_rsn_mst IS '会計理由マスタビュー // Accounting reason master view';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm IS '会計理由名 // #MA.AC_RSN_NM // Accounting reason name';


COMMENT ON COLUMN mavm_ac_rsn_mst.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mavm_ac_rsn_mst.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_invalid_flg IS '仕訳対象外ＦＬＧ // #MA.FLG // Not for journal flg.';


COMMENT ON COLUMN mavm_ac_rsn_mst.cost_invalid_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mavm_ac_rsn_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_ac_rsn_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_ac_rsn_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_ac_rsn_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_ac_rsn_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_ac_rsn_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_ac_rsn_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_ac_rsn_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_ac_rsn_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_ac_rsn_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_ac_rsn_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_ac_rsn_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_ac_rsn_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm_lcl1 IS '会計理由名（ロケール１） // #MA.AC_RSN_NM // Accounting reason name (Locale 1)';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm_lcl2 IS '会計理由名（ロケール２） // #MA.AC_RSN_NM // Accounting reason name (Locale 2)';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm_lcl3 IS '会計理由名（ロケール３） // #MA.AC_RSN_NM // Accounting reason name (Locale 3)';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm_lcl4 IS '会計理由名（ロケール４） // #MA.AC_RSN_NM // Accounting reason name (Locale 4)';


COMMENT ON COLUMN mavm_ac_rsn_mst.ac_rsn_nm_lcl5 IS '会計理由名（ロケール５） // #MA.AC_RSN_NM // Accounting reason name (Locale 5)';

