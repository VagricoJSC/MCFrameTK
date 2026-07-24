\encoding UTF-8

COMMENT ON VIEW mst_dly_sd IS '日次供給情報 // Daily supply info.';


COMMENT ON COLUMN mst_dly_sd.dly_sd_no IS '日次供給ＮＯ // #MA.DLY_SD_NO // Daily supply No.';


COMMENT ON COLUMN mst_dly_sd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_dly_sd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_dly_sd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_dly_sd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_dly_sd.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_dly_sd.due_dt IS '納期 // #MA.DT // Due date';


COMMENT ON COLUMN mst_dly_sd.rqmt_qty IS '所要数量 // #MA.QTY // Requirements qty.';


COMMENT ON COLUMN mst_dly_sd.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_dly_sd.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_dly_sd.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mst_dly_sd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_dly_sd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_dly_sd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_dly_sd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_dly_sd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_dly_sd.intr_rmrks IS '内部備考 // #MS.DLY_SD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_dly_sd.sub_char1 IS '予備１ // #MS.DLY_SD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_dly_sd.sub_char2 IS '予備２ // #MS.DLY_SD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_dly_sd.sub_char3 IS '予備３ // #MS.DLY_SD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_dly_sd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_dly_sd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_dly_sd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_dly_sd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_dly_sd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_dly_sd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_dly_sd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_dly_sd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_dly_sd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_dly_sd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

