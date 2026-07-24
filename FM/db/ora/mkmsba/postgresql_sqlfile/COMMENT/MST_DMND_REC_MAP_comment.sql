\encoding UTF-8

COMMENT ON VIEW mst_dmnd_rec_map IS '需要情報消込マップ // Demand matching map';


COMMENT ON COLUMN mst_dmnd_rec_map.fr_dmnd_no IS '消込元需要ＮＯ // #MA.DMND_NO // Matching source demand No.';


COMMENT ON COLUMN mst_dmnd_rec_map.to_dmnd_no IS '消込先需要ＮＯ // #MA.DMND_NO // Matching destination demand No.';


COMMENT ON COLUMN mst_dmnd_rec_map.rec_qty IS '消込数量 // #MA.QTY // Matching qty.';


COMMENT ON COLUMN mst_dmnd_rec_map.sub_char1 IS '予備１ // #MS.DMND_REC_MAP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dmnd_rec_map.sub_char2 IS '予備２ // #MS.DMND_REC_MAP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dmnd_rec_map.sub_char3 IS '予備３ // #MS.DMND_REC_MAP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dmnd_rec_map.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dmnd_rec_map.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dmnd_rec_map.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dmnd_rec_map.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dmnd_rec_map.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

