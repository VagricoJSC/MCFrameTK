\encoding UTF-8

COMMENT ON TABLE mst_ar_appl_schd_all IS '売掛消込予定 // AR reconciliation schedule';


COMMENT ON COLUMN mst_ar_appl_schd_all.ar_appl_schd_no IS '売掛消込予定ＮＯ // #MA.AR_APPL_SCHD_NO // AR reconciliation schedule No.';


COMMENT ON COLUMN mst_ar_appl_schd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ar_appl_schd_all.bill_acst_no IS '売掛別請求ＮＯ // #MA.BILL_ACST_NO // Billing No. by AR customer';


COMMENT ON COLUMN mst_ar_appl_schd_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_ar_appl_schd_all.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_ar_appl_schd_all.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_ar_appl_schd_all.rcv_schd_dt IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN mst_ar_appl_schd_all.appl_tgt_amt IS '消込対象額 // #MA.MONEY // Reconciled target amount';


COMMENT ON COLUMN mst_ar_appl_schd_all.appl_amt IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN mst_ar_appl_schd_all.not_appl_bal IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN mst_ar_appl_schd_all.sub_char1 IS '予備１ // #MS.AR_APPL_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ar_appl_schd_all.sub_char2 IS '予備２ // #MS.AR_APPL_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ar_appl_schd_all.sub_char3 IS '予備３ // #MS.AR_APPL_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ar_appl_schd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ar_appl_schd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ar_appl_schd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ar_appl_schd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ar_appl_schd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

