\encoding UTF-8

COMMENT ON VIEW mam_ac_rsn IS '会計理由マスタ // Accounting reason master';


COMMENT ON COLUMN mam_ac_rsn.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_ac_rsn.ac_rsn_nm IS '会計理由名 // #MA.AC_RSN_NM // Accounting reason name';


COMMENT ON COLUMN mam_ac_rsn.base_ac_rsn_nm IS '会計理由名（ベース） // #MA.AC_RSN_NM // Accounting reason name(Base)';


COMMENT ON COLUMN mam_ac_rsn.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mam_ac_rsn.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mam_ac_rsn.ac_invalid_flg IS '仕訳対象外ＦＬＧ // #MA.FLG // Not for journal flg.';


COMMENT ON COLUMN mam_ac_rsn.cost_invalid_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_ac_rsn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_ac_rsn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_ac_rsn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_ac_rsn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_ac_rsn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_ac_rsn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_ac_rsn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_ac_rsn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_ac_rsn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_ac_rsn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_ac_rsn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_ac_rsn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_ac_rsn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_ac_rsn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_ac_rsn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_ac_rsn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_ac_rsn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

