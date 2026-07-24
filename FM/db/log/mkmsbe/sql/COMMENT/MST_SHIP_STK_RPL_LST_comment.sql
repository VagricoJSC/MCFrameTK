
COMMENT ON TABLE MST_SHIP_STK_RPL_LST IS '出荷品不足一覧 // Replenishment for shipping item shortage';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.BATCH_DATA_NO IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.EXEC_TM IS '実行日時 // #MA.TM // Execution date and time';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.BATCH_LOG_NO IS 'バッチログＮＯ // #MA.BATCH_LOG_NO // Batch log No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_TYP IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_STS_TYP IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SLIP_SCHD_NO IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.ALLOC_FLG IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_NO IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SEQ IS '受払予定連番 // #MA.INT3 // GR/GI schedule sequence number';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_TYP1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_NO1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_SEQ1 IS '受払予定予備連番１ // #MA.INT3 // GR/GI schedule spare sequence No. 1';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_TYP2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_NO2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_SEQ2 IS '受払予定予備連番２ // #MA.INT3 // GR/GI schedule spare sequence No. 2';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_TYP3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_NO3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_SEQ3 IS '受払予定予備連番３ // #MA.INT3 // GR/GI schedule spare sequence No. 3';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_TYP4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_NO4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_SUB_SEQ4 IS '受払予定予備連番４ // #MA.INT3 // GR/GI schedule spare sequence No. 4';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SCHD_DT IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.PACK_UNIT_SHORT_QTY IS '荷姿単位不足数 // #MA.QTY // SKU shortage qty.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.BASE_UNIT_SHORT_QTY IS '基準単位不足数 // #MA.QTY // Base unit shortage qty.';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_STK_RPL_LST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

