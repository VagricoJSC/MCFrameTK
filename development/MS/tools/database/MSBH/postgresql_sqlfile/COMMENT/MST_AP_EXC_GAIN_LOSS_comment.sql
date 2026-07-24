\encoding UTF-8

COMMENT ON VIEW mst_ap_exc_gain_loss IS '債務為替差損益 // Exchange gain/loss';


COMMENT ON COLUMN mst_ap_exc_gain_loss.pay_act_d_no IS '支払実績明細ＮＯ // #MA.PAY_ACT_D_NO // Payment result details No.';


COMMENT ON COLUMN mst_ap_exc_gain_loss.pay_act_d_seq IS '支払実績明細連番 // #MA.SLIP_SEQ // Payment result details sequence number';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ap_xrate_rev_his_no IS '債務為替レート評価替履歴ＮＯ // #MA.AP_XRATE_REV_HIST_NO // AP exchange rate revaluation history No.';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ref_ap_xrate_rev_his_no IS '参照債務為替レート評価替履歴ＮＯ // #MA.AP_XRATE_REV_HIST_NO // Reference AP exchange rate revaluation history No.';


COMMENT ON COLUMN mst_ap_exc_gain_loss.exc_gain_loss IS '為替差損益 // #MA.MONEY // Exchange gain/loss';


COMMENT ON COLUMN mst_ap_exc_gain_loss.sub_char1 IS '予備１ // #MS.AP_EXC_GAIN_LOSS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ap_exc_gain_loss.sub_char2 IS '予備２ // #MS.AP_EXC_GAIN_LOSS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ap_exc_gain_loss.sub_char3 IS '予備３ // #MS.AP_EXC_GAIN_LOSS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ap_exc_gain_loss.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ap_exc_gain_loss.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

