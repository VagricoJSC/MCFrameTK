
COMMENT ON TABLE MST_STKTK_ACT IS '実棚情報 // Inventory info.';


COMMENT ON COLUMN MST_STKTK_ACT.STKTK_BASE_DT IS '棚卸基準日 // #MA.DT // Base date of inventory count';


COMMENT ON COLUMN MST_STKTK_ACT.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_STKTK_ACT.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_STKTK_ACT.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_STKTK_ACT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_STKTK_ACT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_STKTK_ACT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_STKTK_ACT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_STKTK_ACT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_STKTK_ACT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_STKTK_ACT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_STKTK_ACT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_STKTK_ACT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_STKTK_ACT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_STKTK_ACT.FIX_NO_FLG IS '確定ＮＯＦＬＧ // #MA.FLG // Firm No. flg.';


COMMENT ON COLUMN MST_STKTK_ACT.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_STKTK_ACT.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_STKTK_ACT.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_STKTK_ACT.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_STKTK_ACT.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_STKTK_ACT.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_STKTK_ACT.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_STKTK_ACT.KEEP_DATA_FLG IS '保持データＦＬＧ // #MA.FLG // Kept data flg.';


COMMENT ON COLUMN MST_STKTK_ACT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_STKTK_ACT.TOR_QTY IS '理論在庫数量 // #MA.QTY // Logical inventory qty.';


COMMENT ON COLUMN MST_STKTK_ACT.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_STKTK_ACT.ACT_DIFF_QTY IS '実棚差異数量 // #MA.QTY // Inventory variance qty.';


COMMENT ON COLUMN MST_STKTK_ACT.ACT_INPUT_FLG IS '実棚入力済ＦＬＧ // #MA.FLG // Counted qty. input completed flg.';


COMMENT ON COLUMN MST_STKTK_ACT.USE_DIFF_FLG IS '差異数量使用ＦＬＧ // #MA.FLG // Variance qty. use flg.';


COMMENT ON COLUMN MST_STKTK_ACT.STKTK_ACT_RMRKS IS '実棚備考 // #MS.STKTK_ACT_RMRKS // Inventory remarks';


COMMENT ON COLUMN MST_STKTK_ACT.INTR_RMRKS IS '内部備考 // #MS.STKTK_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_STKTK_ACT.STKTK_ACT_NO IS '棚卸実績ＮＯ // #MA.STKTK_ACT_NO // Inventory count result No.';


COMMENT ON COLUMN MST_STKTK_ACT.STKTK_ITM_SPC_FLG IS '棚卸品目指定ＦＬＧ // #MA.FLG // Inventory count items specified flg.';


COMMENT ON COLUMN MST_STKTK_ACT.SUB_CHAR1 IS '予備１ // #MS.STKTK_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_STKTK_ACT.SUB_CHAR2 IS '予備２ // #MS.STKTK_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_STKTK_ACT.SUB_CHAR3 IS '予備３ // #MS.STKTK_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_STKTK_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_STKTK_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_STKTK_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_STKTK_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_STKTK_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

