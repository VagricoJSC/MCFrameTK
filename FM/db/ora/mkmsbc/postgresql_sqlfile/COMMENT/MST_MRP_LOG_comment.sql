\encoding UTF-8

COMMENT ON VIEW mst_mrp_log IS 'ＭＲＰログ情報 // MRP log info.';


COMMENT ON COLUMN mst_mrp_log.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_mrp_log.mrp_calc_no IS 'ＭＲＰ計算ＮＯ // #MA.MRP_CALC_NO // MRP calculation No.';


COMMENT ON COLUMN mst_mrp_log.seq_no IS 'シーケンス // #MA.INT // Sequence';


COMMENT ON COLUMN mst_mrp_log.mrp_typ IS 'ＭＲＰ区分 // #MS.MRP_TYP // MRP type';


COMMENT ON COLUMN mst_mrp_log.log_time IS 'ログ時間 // #MS.LOG_TIME // Log time';


COMMENT ON COLUMN mst_mrp_log.msg_id IS 'メッセージＩＤ // #MA.MSG_ID // Message ID';


COMMENT ON COLUMN mst_mrp_log.msg IS 'メッセージ // #MA.MSG // Message';


COMMENT ON COLUMN mst_mrp_log.gp_batch_grp_cd IS '処理グループＣＤ // #MA.GP_BATCH_GRP_CD // Process group cd.';


COMMENT ON COLUMN mst_mrp_log.sub_char1 IS '予備１ // #MS.MRPLOG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mrp_log.sub_char2 IS '予備２ // #MS.MRPLOG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mrp_log.sub_char3 IS '予備３ // #MS.MRPLOG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mrp_log.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mrp_log.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mrp_log.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mrp_log.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mrp_log.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mrp_log.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mrp_log.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mrp_log.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mrp_log.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mrp_log.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

