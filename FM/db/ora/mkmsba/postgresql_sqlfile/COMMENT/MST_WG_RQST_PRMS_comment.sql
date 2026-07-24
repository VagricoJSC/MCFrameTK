\encoding UTF-8

COMMENT ON VIEW mst_wg_rqst_prms IS 'ＷＧ間依頼回答 // Inventory request from other WG replied';


COMMENT ON COLUMN mst_wg_rqst_prms.wg_rqst_prms_no IS 'ＷＧ間依頼回答ＮＯ // #MA.WG_RQST_PRMS_NO // Inventory request from other WG replied No.';


COMMENT ON COLUMN mst_wg_rqst_prms.wg_rqst_no IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN mst_wg_rqst_prms.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_wg_rqst_prms.fix_dt IS '確定日 // #MA.DT // Firm date';


COMMENT ON COLUMN mst_wg_rqst_prms.prms_trd_unit_qty IS '回答取引単位数量 // #MA.QTY // Replied transaction unit qty.';


COMMENT ON COLUMN mst_wg_rqst_prms.prms_trd_unit_cd IS '回答取引単位ＣＤ // #MA.UNIT_CD // Replied transaction unit cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.prms_base_unit_qty IS '回答基準単位数量 // #MA.QTY // Replied base unit qty.';


COMMENT ON COLUMN mst_wg_rqst_prms.prms_base_unit_cd IS '回答基準単位ＣＤ // #MA.UNIT_CD // Replied base unit cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.gr_schd_tm IS '回答入庫日時 // #MA.TM // Replied GR date and time';


COMMENT ON COLUMN mst_wg_rqst_prms.gi_lg_grp_cd IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.gi_str_ln_cd IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.gi_rqst_tm IS '回答出庫日時 // #MA.TM // Replied GI date and time';


COMMENT ON COLUMN mst_wg_rqst_prms.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.maker_cd IS 'メーカ // #MA.BP_CD // Maker';


COMMENT ON COLUMN mst_wg_rqst_prms.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_wg_rqst_prms.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_wg_rqst_prms.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_wg_rqst_prms.prms_rmrks IS '回答備考 // #MS.WG_RQST_PRMS_RMRKS // Replied remarks';


COMMENT ON COLUMN mst_wg_rqst_prms.intr_rmrks IS '内部備考 // #MS.WG_RQST_PRMS_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_wg_rqst_prms.sub_char1 IS '予備１ // #MS.WG_RQST_PRMS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wg_rqst_prms.sub_char2 IS '予備２ // #MS.WG_RQST_PRMS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wg_rqst_prms.sub_char3 IS '予備３ // #MS.WG_RQST_PRMS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wg_rqst_prms.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wg_rqst_prms.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wg_rqst_prms.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wg_rqst_prms.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wg_rqst_prms.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

