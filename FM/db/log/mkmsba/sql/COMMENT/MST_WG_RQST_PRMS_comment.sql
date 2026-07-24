
COMMENT ON TABLE MST_WG_RQST_PRMS IS 'ＷＧ間依頼回答 // Inventory request from other WG replied';


COMMENT ON COLUMN MST_WG_RQST_PRMS.WG_RQST_PRMS_NO IS 'ＷＧ間依頼回答ＮＯ // #MA.WG_RQST_PRMS_NO // Inventory request from other WG replied No.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.WG_RQST_NO IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN MST_WG_RQST_PRMS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.FIX_FLG IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.FIX_DT IS '確定日 // #MA.DT // Firm date';


COMMENT ON COLUMN MST_WG_RQST_PRMS.PRMS_TRD_UNIT_QTY IS '回答取引単位数量 // #MA.QTY // Replied transaction unit qty.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.PRMS_TRD_UNIT_CD IS '回答取引単位ＣＤ // #MA.UNIT_CD // Replied transaction unit cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.PRMS_BASE_UNIT_QTY IS '回答基準単位数量 // #MA.QTY // Replied base unit qty.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.PRMS_BASE_UNIT_CD IS '回答基準単位ＣＤ // #MA.UNIT_CD // Replied base unit cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.GR_SCHD_TM IS '回答入庫日時 // #MA.TM // Replied GR date and time';


COMMENT ON COLUMN MST_WG_RQST_PRMS.GI_LG_GRP_CD IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.GI_STR_LN_CD IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.GI_RQST_TM IS '回答出庫日時 // #MA.TM // Replied GI date and time';


COMMENT ON COLUMN MST_WG_RQST_PRMS.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.MAKER_CD IS 'メーカ // #MA.BP_CD // Maker';


COMMENT ON COLUMN MST_WG_RQST_PRMS.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_WG_RQST_PRMS.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_WG_RQST_PRMS.PRMS_RMRKS IS '回答備考 // #MS.WG_RQST_PRMS_RMRKS // Replied remarks';


COMMENT ON COLUMN MST_WG_RQST_PRMS.INTR_RMRKS IS '内部備考 // #MS.WG_RQST_PRMS_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_WG_RQST_PRMS.SUB_CHAR1 IS '予備１ // #MS.WG_RQST_PRMS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_WG_RQST_PRMS.SUB_CHAR2 IS '予備２ // #MS.WG_RQST_PRMS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_WG_RQST_PRMS.SUB_CHAR3 IS '予備３ // #MS.WG_RQST_PRMS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_WG_RQST_PRMS.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_WG_RQST_PRMS.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_WG_RQST_PRMS.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_WG_RQST_PRMS.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_WG_RQST_PRMS.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

