\encoding UTF-8

COMMENT ON TABLE mam_sttl_cmn IS '決済方法マスタ_（共通）_ // Settlement method master_(Common)_';


COMMENT ON COLUMN mam_sttl_cmn.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mam_sttl_cmn.sttl_nm IS '決済方法名 // #MA.STTL_NM // Settlement method name';


COMMENT ON COLUMN mam_sttl_cmn.ar_sttl_flg IS '債権決済方法ＦＬＧ // #MA.FLG // AR settlement method flg.';


COMMENT ON COLUMN mam_sttl_cmn.ap_sttl_flg IS '債務決済方法ＦＬＧ // #MA.FLG // AP settlement method flg.';


COMMENT ON COLUMN mam_sttl_cmn.ar_sttl_typ IS '債権決済区分 // #MA.AR_STTL_TYP // AR settlement type';


COMMENT ON COLUMN mam_sttl_cmn.rcv_reg_typ IS '入金登録区分 // #MA.RCV_REG_TYP // Payment received entry type';


COMMENT ON COLUMN mam_sttl_cmn.sls_purc_typ IS '売上仕入税区分 // #MA.SLS_PURC_TYP // Sales purchase tax type';


COMMENT ON COLUMN mam_sttl_cmn.calc_com_paid_flg IS '手数料計算ＦＬＧ // #MA.FLG // Fee calculation flg.';


COMMENT ON COLUMN mam_sttl_cmn.ar_setoff_cd IS '相殺方法ＣＤ // #MA.STTL_CD // Offset method cd.';


COMMENT ON COLUMN mam_sttl_cmn.debt_cred_id_typ IS '債権債務先識別区分 // #MA.DEBT_CRED_ID_TYP // AR/AP BP identification type';


COMMENT ON COLUMN mam_sttl_cmn.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mam_sttl_cmn.ap_setoff_typ IS '債務相殺先区分 // #MA.AP_SETOFF_TYP // AP offset destination type';


COMMENT ON COLUMN mam_sttl_cmn.ap_setoff_act_flg IS '債務相殺実績計上ＦＬＧ // #MA.FLG // AP offset result recording flg.';


COMMENT ON COLUMN mam_sttl_cmn.bill_tax_disp_flg IS '請求書税額表示ＦＬＧ // #MA.FLG // Display tax amount on invoice flg.';


COMMENT ON COLUMN mam_sttl_cmn.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mam_sttl_cmn.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_sttl_cmn.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_sttl_cmn.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_sttl_cmn.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_sttl_cmn.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_sttl_cmn.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_sttl_cmn.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_sttl_cmn.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_sttl_cmn.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_sttl_cmn.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_sttl_cmn.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_sttl_cmn.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_sttl_cmn.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_sttl_cmn.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_sttl_cmn.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_sttl_cmn.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_sttl_cmn.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

