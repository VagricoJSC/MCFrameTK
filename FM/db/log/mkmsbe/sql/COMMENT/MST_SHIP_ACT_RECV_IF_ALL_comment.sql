
COMMENT ON TABLE MST_SHIP_ACT_RECV_IF_ALL IS '出荷実績受信ＩＦ // Shipping result import IF';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_INST_NO IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_FR_LG_GRP_CD IS 'ＩＦ出荷元物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF shipping point distribution group cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_FR_LG_GRP_NM IS 'ＩＦ出荷元物流グループ名 // #MA.IF_EXT_SYS_NM // IF shipping point distribution group name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SITE_CO_CD IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SITE_CO_CD IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SITE_CO_NM IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_TRD_CD IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_TRD_NM IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_CST_CD IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_CST_NM IS 'ＩＦ得意先名 // #MA.IF_EXT_SYS_NM // IF customer name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ID_TYP IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ID_CD IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_TO_ID_CD IS 'ＩＦ送付先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ID_NM IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ZIP_CD IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ADDR1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ADDR2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ADDR3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_ADDR4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_CNTCT_DPT IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_CNTCT_PSN IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_TEL IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_TO_FAX IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ID_TYP IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ID_CD IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_DLV_ID_CD IS 'ＩＦ納品先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination identification cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ID_NM IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_STR_LN_CD IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_DLV_STR_LN_CD IS 'ＩＦ納品棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF delivery rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_DLV_STR_LN_NM IS 'ＩＦ納品棚・ライン名 // #MA.IF_EXT_SYS_NM // IF delivery rack/line name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.PRI_PRNT_TYP IS '価格印字区分 // #MA.PRI_PRNT_TYP // Print price type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RQST_DPT_CD IS 'ＩＦ依頼元部門ＣＤ // #MA.IF_EXT_SYS_CD // IF requesting dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RQST_DPT_NM IS 'ＩＦ依頼元部門名 // #MA.IF_EXT_SYS_NM // IF requesting dept. name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RQST_USR_CD IS 'ＩＦ依頼元担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF requesting PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RQST_USR_NM IS 'ＩＦ依頼元担当者名 // #MA.IF_EXT_SYS_NM // IF requesting PIC name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_DPT_CD IS '出荷部門ＣＤ // #MA.DPT_CD // Shipping dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_DPT_CD IS 'ＩＦ出荷部門ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_DPT_NM IS 'ＩＦ出荷部門名 // #MA.IF_EXT_SYS_NM // IF shipping dept. name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_USR_CD IS '出荷担当者ＣＤ // #MA.USR_CD // Shipping PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_USR_CD IS 'ＩＦ出荷担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping PIC cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_USR_NM IS 'ＩＦ出荷担当者名 // #MA.IF_EXT_SYS_NM // IF shipping PIC name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_INST_D_NO IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_ALLOC_STS_NO IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IV_D_NO IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.EXT_SHIP_ACT_NO IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_LOC_CD IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_LOC_CD IS 'ＩＦ出荷場所ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping location cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_LOC_NM IS 'ＩＦ出荷場所名 // #MA.IF_EXT_SYS_NM // IF shipping location name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SHIP_STR_LN_CD IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_STR_LN_CD IS 'ＩＦ出荷棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF shipping rack/line cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_SHIP_STR_LN_NM IS 'ＩＦ出荷棚・ライン名 // #MA.IF_EXT_SYS_NM // IF shipping rack/line name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ITM_NM IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ENT_UNIT_QTY IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ENT_UNIT_CD IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ENT_UNIT_CD IS 'ＩＦ入力単位ＣＤ // #MA.IF_EXT_SYS_CD // IF input unit cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_ENT_UNIT_NM IS 'ＩＦ入力単位名 // #MA.IF_EXT_SYS_NM // IF input unit name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_STK_ARRV_BP_CD IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_STK_ARRV_BP_NM IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_GD_CD IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_GD_NM IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_STK_BP_CD IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_STK_BP_NM IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RSN_CD IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_RSN_NM IS 'ＩＦ理由名 // #MA.IF_EXT_SYS_NM // IF reason name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_BD_DPT_CD IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_BD_DPT_NM IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_DLV_INST_NO IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.CST_DLV_INST_D_NO IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.BASE_DLV_SLIP_NO IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.BASE_PROV_ACT_NO IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.INTR_D_RMRKS IS '内部明細備考 // #MS.SHIP_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.IF_CO_NM IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.REQ_NO IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SHIP_ACT_RECV_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

