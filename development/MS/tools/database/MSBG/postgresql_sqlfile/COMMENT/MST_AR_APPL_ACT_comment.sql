\encoding UTF-8

COMMENT ON VIEW mst_ar_appl_act IS '売掛消込実績 // AR reconciliation result';


COMMENT ON COLUMN mst_ar_appl_act.ar_appl_act_no IS '売掛消込実績ＮＯ // #MA.AR_APPL_ACT_NO // AR reconciliation result No.';


COMMENT ON COLUMN mst_ar_appl_act.ar_appl_schd_no IS '売掛消込予定ＮＯ // #MA.AR_APPL_SCHD_NO // AR reconciliation schedule No.';


COMMENT ON COLUMN mst_ar_appl_act.rcv_act_d_no IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN mst_ar_appl_act.rcv_act_d_seq IS '入金実績明細連番 // #MA.SLIP_SEQ // Payment received result details sequence number';


COMMENT ON COLUMN mst_ar_appl_act.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_ar_appl_act.rcv_act_dt IS '入金実績日 // #MA.DT // Actual payment received date';


COMMENT ON COLUMN mst_ar_appl_act.appl_amt IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN mst_ar_appl_act.sub_char1 IS '予備１ // #MS.AR_APPL_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ar_appl_act.sub_char2 IS '予備２ // #MS.AR_APPL_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ar_appl_act.sub_char3 IS '予備３ // #MS.AR_APPL_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ar_appl_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ar_appl_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ar_appl_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ar_appl_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ar_appl_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ar_appl_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ar_appl_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ar_appl_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ar_appl_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ar_appl_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

