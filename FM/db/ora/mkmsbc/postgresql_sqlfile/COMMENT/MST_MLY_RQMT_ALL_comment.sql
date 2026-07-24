\encoding UTF-8

COMMENT ON TABLE mst_mly_rqmt_all IS '月次生産依頼 // Monthly production request';


COMMENT ON COLUMN mst_mly_rqmt_all.ym IS '計画年月 // #MA.YM // Plan month';


COMMENT ON COLUMN mst_mly_rqmt_all.prod_ym IS '生産年月 // #MA.YM // Production month';


COMMENT ON COLUMN mst_mly_rqmt_all.mps_grp_cd IS 'ＭＰＳグループＣＤ // #MA.MPS_GRP_CD // MPS group cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_mly_rqmt_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_mly_rqmt_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_mly_rqmt_all.co_cd IS ' // #MA.CO_CD // ';


COMMENT ON COLUMN mst_mly_rqmt_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.qty IS '月次計画数量 // #MA.QTY // Monthly plan qty.';


COMMENT ON COLUMN mst_mly_rqmt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_mly_rqmt_all.intr_rmrks IS '内部備考 // #MS.MLYRQST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_mly_rqmt_all.sub_char1 IS '予備１ // #MS.MLYRQST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mly_rqmt_all.sub_char2 IS '予備２ // #MS.MLYRQST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mly_rqmt_all.sub_char3 IS '予備３ // #MS.MLYRQST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mly_rqmt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mly_rqmt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mly_rqmt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mly_rqmt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mly_rqmt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

