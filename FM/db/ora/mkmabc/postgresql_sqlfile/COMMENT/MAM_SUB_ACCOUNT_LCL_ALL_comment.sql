\encoding UTF-8

COMMENT ON TABLE mam_sub_account_lcl_all IS '補助勘定科目マスタ_（全社）_(ロケール別情報) // Subsidiary account master_(Company-wide)_(Info. by locale)';


COMMENT ON COLUMN mam_sub_account_lcl_all.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mam_sub_account_lcl_all.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mam_sub_account_lcl_all.sub_ac_nm IS '補助勘定科目名 // #MA.SUB_AC_NM // Subsidiary account name';


COMMENT ON COLUMN mam_sub_account_lcl_all.sub_ac_nm2 IS '補助勘定科目略名 // #MA.SUB_AC_NM2 // Subsidiary account abbreviation';


COMMENT ON COLUMN mam_sub_account_lcl_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_sub_account_lcl_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_sub_account_lcl_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_sub_account_lcl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_sub_account_lcl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_sub_account_lcl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_sub_account_lcl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_sub_account_lcl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_sub_account_lcl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_sub_account_lcl_all.lcl_cd IS 'ロケールＣＤ // #MA.LCL_CD // Locale cd.';

