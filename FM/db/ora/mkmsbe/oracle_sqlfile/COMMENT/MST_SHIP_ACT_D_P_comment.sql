
COMMENT ON TABLE MST_SHIP_ACT_D_P IS '出荷実績明細（改訂履歴） // Shipping result details (Rev. history)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_ACT_D_NO IS '出荷実績明細ＮＯ // #MA.SHIP_ACT_D_NO // Shipping result details No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_ACT_REV IS '出荷実績改訂番号 // #MA.SLIP_REV // Shipping result rev. number';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_ACT_NO IS '出荷実績ＮＯ // #MA.SHIP_ACT_NO // Shipping result No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_ALLOC_STS_NO IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_SLIP_SEQ IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_LOC_CD IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_STR_LN_CD IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ID_TYP IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ID_CD IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ID_NM IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_STR_LN_CD IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.PRI_PRNT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.IV_ITM_NM IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO1_MNG_TYP IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO2_MNG_TYP IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO3_MNG_TYP IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO4_MNG_TYP IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.DLV_QTY IS '納品数量 // #MA.QTY // Delivery qty.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_RET_QTY IS '出荷返品数量 // #MA.QTY // Shipping return qty.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SKIP_CHK_SHIP_FLG IS '出荷時構成チェック不要ＦＬＧ // #MA.FLG // Component check not required at shipping flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BD_WG_CD IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_DLV_INST_NO IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_DLV_INST_D_NO IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SHIP_RET_FLG IS '出荷返品対象ＦＬＧ // #MA.FLG // For shipping return flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.WMS_FLG IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.EXT_SHIP_ACT_NO IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BASE_DLV_SLIP_NO IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BASE_PROV_ACT_NO IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.INTR_D_RMRKS IS '内部明細備考 // #MS.SHIP_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.STK_LST_PRNT_FLG IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SUB_CHAR1 IS '予備１ // #MS.SHIP_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SUB_CHAR2 IS '予備２ // #MS.SHIP_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.SUB_CHAR3 IS '予備３ // #MS.SHIP_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_ACT_D_P.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

