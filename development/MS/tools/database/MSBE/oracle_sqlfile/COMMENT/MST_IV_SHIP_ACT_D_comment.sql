
COMMENT ON TABLE MST_IV_SHIP_ACT_D IS 'インボイス出荷実績明細 // Invoice shipping result details';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.IV_SHIP_ACT_D_NO IS 'インボイス出荷実績明細ＮＯ // #MA.IV_SHIP_ACT_D_NO // Shipping invoice result details No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SHIP_LOC_CD IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SHIP_STR_LN_CD IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.ARR_STR_LN_CD IS '入荷棚・ラインＣＤ // #MA.STR_LN_CD // Receipt rack/line cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SHIP_ACT_D_NO IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SUB_CHAR1 IS '予備１ // #MS.IV_SHIP_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SUB_CHAR2 IS '予備２ // #MS.IV_SHIP_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.SUB_CHAR3 IS '予備３ // #MS.IV_SHIP_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_IV_SHIP_ACT_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

