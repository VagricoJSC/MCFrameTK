\encoding UTF-8

COMMENT ON TABLE mam_account_cmn IS '勘定科目マスタ_（共通）_ // Account master_(Common)_';


COMMENT ON COLUMN mam_account_cmn.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mam_account_cmn.ac_nm IS '勘定科目名 // #MA.AC_NM // Account name';


COMMENT ON COLUMN mam_account_cmn.ac_nm2 IS '勘定科目略名 // #MA.AC_NM2 // Account abbreviation name';


COMMENT ON COLUMN mam_account_cmn.dc_typ IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN mam_account_cmn.sub_flg IS '補助科目使用ＦＬＧ // #MA.FLG // Subsidiary account used flg.';


COMMENT ON COLUMN mam_account_cmn.ac_typ IS '勘定科目区分 // #MA.AC_CD_TYP // Account type';


COMMENT ON COLUMN mam_account_cmn.ac_tax_cd IS '会計税ＣＤ // #MA.AC_TAX_CD // Accounting tax cd.';


COMMENT ON COLUMN mam_account_cmn.ac_tax_typ IS '会計税区分 // #MA.AC_TAX_TYP // Accounting tax type';


COMMENT ON COLUMN mam_account_cmn.foreign_flg IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN mam_account_cmn.sum0_flg IS '集計０使用ＦＬＧ // #MA.FLG // Aggregated 0 used flg.';


COMMENT ON COLUMN mam_account_cmn.sum1_flg IS '集計１使用ＦＬＧ // #MA.FLG // Aggregated 1 used flg.';


COMMENT ON COLUMN mam_account_cmn.sum2_flg IS '集計２使用ＦＬＧ // #MA.FLG // Aggregated 2 used flg.';


COMMENT ON COLUMN mam_account_cmn.sum3_flg IS '集計３使用ＦＬＧ // #MA.FLG // Aggregated 3 used flg.';


COMMENT ON COLUMN mam_account_cmn.sum4_flg IS '集計４使用ＦＬＧ // #MA.FLG // Aggregated 4 used flg.';


COMMENT ON COLUMN mam_account_cmn.sum5_flg IS '集計５使用ＦＬＧ // #MA.FLG // Aggregated 5 used flg.';


COMMENT ON COLUMN mam_account_cmn.project_flg IS 'プロジェクト使用ＦＬＧ // #MA.FLG // Project used flg.';


COMMENT ON COLUMN mam_account_cmn.bp_flg IS '取引先使用ＦＬＧ // #MA.FLG // BP used flg.';


COMMENT ON COLUMN mam_account_cmn.usr_flg IS '担当者使用ＦＬＧ // #MA.FLG // PIC used flg.';


COMMENT ON COLUMN mam_account_cmn.bank_ac_flg IS '口座使用ＦＬＧ // #MA.FLG // Bank account used flg.';


COMMENT ON COLUMN mam_account_cmn.ap_typ IS 'ＡＰ科目区分 // #MA.AC_TYP // AP type';


COMMENT ON COLUMN mam_account_cmn.ar_typ IS 'ＡＲ科目区分 // #MA.AC_TYP // AR type';


COMMENT ON COLUMN mam_account_cmn.ac_typ1 IS '科目予備区分１ // #MA.AC_TYP // Account spare type 1';


COMMENT ON COLUMN mam_account_cmn.ac_typ2 IS '科目予備区分２ // #MA.AC_TYP // Account spare type 2';


COMMENT ON COLUMN mam_account_cmn.ac_typ3 IS '科目予備区分３ // #MA.AC_TYP // Account spare type 3';


COMMENT ON COLUMN mam_account_cmn.ac_typ4 IS '科目予備区分４ // #MA.AC_TYP // Account spare type 4';


COMMENT ON COLUMN mam_account_cmn.ac_typ5 IS '科目予備区分５ // #MA.AC_TYP // Account spare type 5';


COMMENT ON COLUMN mam_account_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_account_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_account_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_account_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_account_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_account_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_account_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_account_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_account_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_account_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_account_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_account_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_account_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_account_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_account_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_account_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_account_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

