\encoding UTF-8

COMMENT ON VIEW mst_dlv_inst IS '納入指示ヘッダ // Delivery order header';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_no IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_rev IS '納入指示改訂番号 // #MA.SLIP_REV // Delivery order rev. number';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_seq IS '納入指示連番 // #MA.SLIP_SEQ // Delivery order sequence number';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_grp_no IS '納入指示ＧＮＯ // #MS.DLV_INST_GRP_NO // Delivery order G No.';


COMMENT ON COLUMN mst_dlv_inst.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_print_dt IS '納入指示書発行日時 // #MA.TM // Delivery order issue date and time';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_print_flg IS '納入指示書発行済ＦＬＧ // #MA.FLG // Delivery order issued flg.';


COMMENT ON COLUMN mst_dlv_inst.last_dlv_inst_rev IS '最新納入指示改訂番号 // #MA.SLIP_REV // Latest delivery order rev. number';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_dt IS '納入指示日 // #MA.DT // Delivery order date';


COMMENT ON COLUMN mst_dlv_inst.edi_flg IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_dlv_inst.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_dlv_inst.dlv_inst_print_rmrks IS '納入指示書備考 // #MS.DLV_INST_PRINT_RMRKS // Delivery order remarks';


COMMENT ON COLUMN mst_dlv_inst.intr_rmrks IS '内部備考 // #MS.DLV_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_dlv_inst.sub_char1 IS '予備１ // #MS.DLV_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dlv_inst.sub_char2 IS '予備２ // #MS.DLV_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dlv_inst.sub_char3 IS '予備３ // #MS.DLV_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dlv_inst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dlv_inst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dlv_inst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dlv_inst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dlv_inst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dlv_inst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dlv_inst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dlv_inst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dlv_inst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dlv_inst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

