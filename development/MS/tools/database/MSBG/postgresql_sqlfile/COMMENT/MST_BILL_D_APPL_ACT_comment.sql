\encoding UTF-8

COMMENT ON VIEW mst_bill_d_appl_act IS '請求明細消込実績 // Billing details reconciled result';


COMMENT ON COLUMN mst_bill_d_appl_act.rcv_act_d_no IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN mst_bill_d_appl_act.bill_d_no IS '消込請求明細ＮＯ // #MA.BILL_D_NO // Reconcile invoice details No.';


COMMENT ON COLUMN mst_bill_d_appl_act.parent_bill_d_no IS '消込親請求明細ＮＯ // #MA.BILL_D_NO // Reconcile parent invoice details No.';


COMMENT ON COLUMN mst_bill_d_appl_act.appl_dt IS '消込日 // #MA.DT // Reconciled date';


COMMENT ON COLUMN mst_bill_d_appl_act.appl_amt IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN mst_bill_d_appl_act.sub_char1 IS '予備１ // #MS.BILL_D_APPL_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_d_appl_act.sub_char2 IS '予備２ // #MS.BILL_D_APPL_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_d_appl_act.sub_char3 IS '予備３ // #MS.BILL_D_APPL_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_d_appl_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_d_appl_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_d_appl_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_d_appl_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_d_appl_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

