\encoding UTF-8

COMMENT ON TABLE mst_bill_d_appl_act_all IS '請求明細消込実績 // Billing details reconciled result';


COMMENT ON COLUMN mst_bill_d_appl_act_all.rcv_act_d_no IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN mst_bill_d_appl_act_all.bill_d_no IS '消込請求明細ＮＯ // #MA.BILL_D_NO // Reconcile invoice details No.';


COMMENT ON COLUMN mst_bill_d_appl_act_all.parent_bill_d_no IS '消込親請求明細ＮＯ // #MA.BILL_D_NO // Reconcile parent invoice details No.';


COMMENT ON COLUMN mst_bill_d_appl_act_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_d_appl_act_all.appl_dt IS '消込日 // #MA.DT // Reconciled date';


COMMENT ON COLUMN mst_bill_d_appl_act_all.appl_amt IS '消込額 // #MA.MONEY // Reconciled amount';


COMMENT ON COLUMN mst_bill_d_appl_act_all.sub_char1 IS '予備１ // #MS.BILL_D_APPL_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_d_appl_act_all.sub_char2 IS '予備２ // #MS.BILL_D_APPL_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_d_appl_act_all.sub_char3 IS '予備３ // #MS.BILL_D_APPL_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_d_appl_act_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_d_appl_act_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_d_appl_act_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_d_appl_act_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_d_appl_act_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

