\encoding UTF-8

COMMENT ON VIEW mgvt_mst_mly_rqmt IS '月次生産依頼ビュー // Monthly production request view';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.ym IS '計画年月 // #MA.YM // Plan month';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.prod_ym IS '生産年月 // #MA.YM // Production month';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.mps_grp_cd IS 'ＭＰＳグループＣＤ // #MA.MPS_GRP_CD // MPS group cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.qty IS '月次計画数量 // #MA.QTY // Monthly plan qty.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.intr_rmrks IS '内部備考 //  // Internal remarks';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_mly_rqmt.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

