\encoding UTF-8

COMMENT ON VIEW mam_bank_ac IS '口座マスタ // Bank account master';


COMMENT ON COLUMN mam_bank_ac.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mam_bank_ac.bank_ac_nm IS '口座名 // #MA.BANK_AC_NM // Bank account name';


COMMENT ON COLUMN mam_bank_ac.base_bank_ac_nm IS '口座名（ベース） // #MA.BANK_AC_NM // Bank account name(Base)';


COMMENT ON COLUMN mam_bank_ac.ext_flg IS '社外ＦＬＧ // #MA.FLG // External flg.';


COMMENT ON COLUMN mam_bank_ac.bank_cd IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN mam_bank_ac.branch_cd IS '支店ＣＤ // #MA.BANK_BRANCH_CD // Branch cd.';


COMMENT ON COLUMN mam_bank_ac.bank_ac_no IS '口座番号 // #MA.BANK_AC_NO // Bank account number';


COMMENT ON COLUMN mam_bank_ac.bank_ac_typ IS '口座区分 // #MA.BANK_AC_TYP // Bank account type';


COMMENT ON COLUMN mam_bank_ac.bank_ac_holder IS '口座名義 // #MA.BANK_AC_HOLDER // Bank account holder';


COMMENT ON COLUMN mam_bank_ac.bank_ac_holder_sub IS '口座名義別名 // #MA.BANK_AC_HOLDER_SUB // Account holder alias name';


COMMENT ON COLUMN mam_bank_ac.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_bank_ac.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_bank_ac.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_bank_ac.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_bank_ac.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_bank_ac.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_bank_ac.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_bank_ac.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_bank_ac.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_bank_ac.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_bank_ac.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_bank_ac.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_bank_ac.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_bank_ac.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_bank_ac.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_bank_ac.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_bank_ac.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

