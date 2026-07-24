\encoding UTF-8

COMMENT ON TABLE mst_rcv_schd_all IS '入金予定 // Payment receipt schedule';


COMMENT ON COLUMN mst_rcv_schd_all.rcv_schd_no IS '入金予定ＮＯ // #MA.RCV_SCHD_NO // Payment receipt schedule No.';


COMMENT ON COLUMN mst_rcv_schd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_rcv_schd_all.bill_mng_no IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN mst_rcv_schd_all.rcv_schd_dt IS '入金予定日 // #MA.DT // Scheduled payment receipt date';


COMMENT ON COLUMN mst_rcv_schd_all.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_rcv_schd_all.rcv_typ IS '入金区分 // #MA.AR_STTL_TYP // Payment received type';


COMMENT ON COLUMN mst_rcv_schd_all.rcv_schd_amt IS '入金予定額 // #MA.MONEY // Amount of payment receipt schedule';


COMMENT ON COLUMN mst_rcv_schd_all.sub_char1 IS '予備１ // #MS.RCV_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_rcv_schd_all.sub_char2 IS '予備２ // #MS.RCV_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_rcv_schd_all.sub_char3 IS '予備３ // #MS.RCV_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_rcv_schd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_rcv_schd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_rcv_schd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_rcv_schd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_rcv_schd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_rcv_schd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_rcv_schd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_rcv_schd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_rcv_schd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_rcv_schd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

