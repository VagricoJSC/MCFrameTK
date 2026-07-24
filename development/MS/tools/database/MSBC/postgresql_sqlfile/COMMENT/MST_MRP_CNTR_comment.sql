\encoding UTF-8

COMMENT ON VIEW mst_mrp_cntr IS 'ＭＲＰカウンタ情報 // MRP counter info.';


COMMENT ON COLUMN mst_mrp_cntr.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_mrp_cntr.mrp_cntr_typ IS 'ＭＲＰカウンタ区分 // #MS.MRP_CNTR_TYP // MRP counter type';


COMMENT ON COLUMN mst_mrp_cntr.prefix IS '接頭辞 // #MS.MRP_CNTR_PREFIX // Prefix';


COMMENT ON COLUMN mst_mrp_cntr.cntr IS 'カウンタ // #MS.MRP_CNTR // Counter';


COMMENT ON COLUMN mst_mrp_cntr.max_val IS '最大値 // #MS.MRP_CNTR // Max. value';


COMMENT ON COLUMN mst_mrp_cntr.min_val IS '最小値 // #MS.MRP_CNTR // Min. value';


COMMENT ON COLUMN mst_mrp_cntr.intr_rmrks IS '内部備考 // #MS.MRPCNTR_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_mrp_cntr.sub_char1 IS '予備１ // #MS.MRPCNTR_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mrp_cntr.sub_char2 IS '予備２ // #MS.MRPCNTR_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mrp_cntr.sub_char3 IS '予備３ // #MS.MRPCNTR_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mrp_cntr.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mrp_cntr.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mrp_cntr.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mrp_cntr.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mrp_cntr.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mrp_cntr.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mrp_cntr.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mrp_cntr.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mrp_cntr.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mrp_cntr.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

