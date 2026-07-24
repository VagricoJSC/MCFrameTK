\encoding UTF-8

COMMENT ON VIEW mam_sub_account IS '補助勘定科目マスタ // Subsidiary account master';


COMMENT ON COLUMN mam_sub_account.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mam_sub_account.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mam_sub_account.sub_ac_nm IS '補助勘定科目名 // #MA.SUB_AC_NM // Subsidiary account name';


COMMENT ON COLUMN mam_sub_account.base_sub_ac_nm IS '補助勘定科目名（ベース） // #MA.SUB_AC_NM // Subsidiary account name(Base)';


COMMENT ON COLUMN mam_sub_account.sub_ac_nm2 IS '補助勘定科目略名 // #MA.SUB_AC_NM2 // Subsidiary account abbreviation';


COMMENT ON COLUMN mam_sub_account.base_sub_ac_nm2 IS '補助勘定科目略名（ベース） // #MA.SUB_AC_NM2 // Subsidiary account abbreviation(Base)';


COMMENT ON COLUMN mam_sub_account.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_sub_account.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_sub_account.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_sub_account.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_sub_account.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_sub_account.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_sub_account.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_sub_account.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_sub_account.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_sub_account.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_sub_account.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_sub_account.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_sub_account.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_sub_account.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_sub_account.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_sub_account.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_sub_account.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

