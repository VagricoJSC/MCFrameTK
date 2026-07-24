\encoding UTF-8

COMMENT ON VIEW mst_slo_prms IS '受注納期回答 // Sales order promising';


COMMENT ON COLUMN mst_slo_prms.slo_prms_no IS '受注納期回答ＮＯ // #MA.SLO_PRMS_NO // Sales order promising No.';


COMMENT ON COLUMN mst_slo_prms.slo_prms_rev IS '受注納期回答改訂番号 // #MA.SLIP_REV // Sales order promising Rev. No.';


COMMENT ON COLUMN mst_slo_prms.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_slo_prms.slo_d_no IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN mst_slo_prms.slo_prms_h_no IS '受注納期回答ヘッダＮＯ // #MA.SLO_PRMS_H_NO // Order promising header No.';


COMMENT ON COLUMN mst_slo_prms.dlv_inst_rcpt_no IS '納入指示受領ＮＯ // #MA.DLV_INST_RCPT_NO // Delivery order received No.';


COMMENT ON COLUMN mst_slo_prms.prms_dlv_tm IS '回答納入日時 // #MA.TM // Replied delivery date and time';


COMMENT ON COLUMN mst_slo_prms.trd_unit_prms_qty IS '取引単位回答数量 // #MA.QTY // Transaction unit replied qty.';


COMMENT ON COLUMN mst_slo_prms.base_unit_prms_qty IS '基準単位回答数量 // #MA.QTY // Base unit replied qty.';


COMMENT ON COLUMN mst_slo_prms.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_slo_prms.prms_rmrks IS '回答備考 // #MS.SLO_PRMS_RMRKS // Replied remarks';


COMMENT ON COLUMN mst_slo_prms.intr_rmrks IS '内部備考 // #MS.SLO_PRMS_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_slo_prms.sub_char1 IS '予備１ // #MS.SLO_PRMS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_slo_prms.sub_char2 IS '予備２ // #MS.SLO_PRMS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_slo_prms.sub_char3 IS '予備３ // #MS.SLO_PRMS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_slo_prms.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_slo_prms.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_slo_prms.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_slo_prms.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_slo_prms.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_slo_prms.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_slo_prms.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_slo_prms.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_slo_prms.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_slo_prms.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

