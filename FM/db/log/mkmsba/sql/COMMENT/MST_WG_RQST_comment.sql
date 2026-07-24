
COMMENT ON TABLE MST_WG_RQST IS 'ＷＧ間依頼 // Inventory request from other WG';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_NO IS 'ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // No. of inventory request from other WG';


COMMENT ON COLUMN MST_WG_RQST.LAST_WG_RQST_NO IS '前回ＷＧ間依頼ＮＯ // #MA.WG_RQST_NO // Last inventory request No. from other WG';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_TYP IS 'ＷＧ間依頼種類区分 // #MS.WG_RQST_TYP // Inventory request from other WG classification type';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_SRC_TYP IS 'ＷＧ間依頼作成元区分 // #MS.WG_RQST_SRC_TYP // Inventory request from other WG creating source type';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_SRC_NO IS 'ＷＧ間依頼元識別ＮＯ // #MA.WG_RQST_SRC_NO // Source of inventory request from other WG identification No.';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_STS_TYP IS 'ＷＧ間依頼状況区分 // #MS.WG_RQST_STS_TYP // Inventory request from other WG status type';


COMMENT ON COLUMN MST_WG_RQST.RQST_DT IS '依頼日 // #MA.DT // Request date';


COMMENT ON COLUMN MST_WG_RQST.PRMS_NTC_FLG IS '回答通知ＦＬＧ // #MA.FLG // Replied flg.';


COMMENT ON COLUMN MST_WG_RQST.PRMS_DT IS '回答通知日 // #MA.DT // Replied date';


COMMENT ON COLUMN MST_WG_RQST.RE_PRMS_NTC_FLG IS '回答再通知ＦＬＧ // #MA.FLG // Re-replied flg.';


COMMENT ON COLUMN MST_WG_RQST.RE_PRMS_DT IS '回答再通知日 // #MA.DT // Re-replied date';


COMMENT ON COLUMN MST_WG_RQST.PRMS_UNCN_FLG IS '回答未確認ＦＬＧ // #MA.FLG // Reply unchecked flg.';


COMMENT ON COLUMN MST_WG_RQST.RE_RQST_FLG IS '再調整依頼ＦＬＧ // #MA.FLG // Readjustment request flg.';


COMMENT ON COLUMN MST_WG_RQST.RE_RQST_DT IS '再調整依頼日 // #MA.DT // Readjustment request date';


COMMENT ON COLUMN MST_WG_RQST.MAN_PRMS_FLG IS '手動回答ＦＬＧ // #MA.FLG // Manual replied flg.';


COMMENT ON COLUMN MST_WG_RQST.RQST_CRRCT_FLG IS '依頼元訂正ＦＬＧ // #MA.FLG // Edited by request source flg.';


COMMENT ON COLUMN MST_WG_RQST.DLV_INST_RCPT_FLG IS '納入指示受領ＦＬＧ // #MA.FLG // Delivery order received flg.';


COMMENT ON COLUMN MST_WG_RQST.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_WG_RQST.RQST_FR_WG_CD IS '依頼元ワーキンググループＣＤ // #MA.WG_CD // Requesting WG cd.';


COMMENT ON COLUMN MST_WG_RQST.RQST_FR_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_WG_RQST.RQST_FR_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_WG_RQST.GR_LOC_WG_CD IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN MST_WG_RQST.GR_LG_GRP_CD IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN MST_WG_RQST.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_WG_RQST.GR_STR_LN_CD IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN MST_WG_RQST.GR_RQST_TM IS '入庫依頼日時 // #MA.TM // GR request date and time';


COMMENT ON COLUMN MST_WG_RQST.RQST_TO_WG_CD IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MST_WG_RQST.GI_LOC_WG_CD IS '出庫ワーキンググループＣＤ // #MA.LG_GRP_CD // GI WG cd.';


COMMENT ON COLUMN MST_WG_RQST.GI_LG_GRP_CD IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN MST_WG_RQST.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_WG_RQST.GI_STR_LN_CD IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN MST_WG_RQST.GI_RQST_TM IS '出庫依頼日時 // #MA.TM // GI request date and time';


COMMENT ON COLUMN MST_WG_RQST.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_WG_RQST.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_WG_RQST.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_WG_RQST.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_WG_RQST.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_WG_RQST.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_WG_RQST.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_WG_RQST.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_WG_RQST.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_WG_RQST.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_WG_RQST.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_WG_RQST.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_WG_RQST.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_WG_RQST.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_WG_RQST.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_WG_RQST.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_WG_RQST.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_WG_RQST.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_WG_RQST.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_WG_RQST.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_WG_RQST.VLD_DT_TO IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN MST_WG_RQST.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_WG_RQST.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_WG_RQST.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_WG_RQST.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_WG_RQST.NOT_CMPL_QTY IS '基準単位依頼残数量 // #MA.QTY // Base unit remaining request qty.';


COMMENT ON COLUMN MST_WG_RQST.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_WG_RQST.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_WG_RQST.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_WG_RQST.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_WG_RQST.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_WG_RQST.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_WG_RQST.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_WG_RQST.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_WG_RQST.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_WG_RQST.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_WG_RQST.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_WG_RQST.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_WG_RQST.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_WG_RQST.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_WG_RQST.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_WG_RQST.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_WG_RQST.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_WG_RQST.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_WG_RQST.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_WG_RQST.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_WG_RQST.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_WG_RQST.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_WG_RQST.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_WG_RQST.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_WG_RQST.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_WG_RQST.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_WG_RQST.PURC_RSN_CD IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN MST_WG_RQST.XPNS_PO_FLG IS '経費購買ＦＬＧ // #MA.FLG // Expenses purchasing flg.';


COMMENT ON COLUMN MST_WG_RQST.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_WG_RQST.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_WG_RQST.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_WG_RQST.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_WG_RQST.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_WG_RQST.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_WG_RQST.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_WG_RQST.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_WG_RQST.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_WG_RQST.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_WG_RQST.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_WG_RQST.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_WG_RQST.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_WG_RQST.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_WG_RQST.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_WG_RQST.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_WG_RQST.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_WG_RQST.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_WG_RQST.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_WG_RQST.RQST_CRRCT_DT IS '依頼元訂正日 // #MA.DT // Date edited by request source';


COMMENT ON COLUMN MST_WG_RQST.RQST_CAN_DT IS '依頼元取消日 // #MA.DT // Request source cancellation date';


COMMENT ON COLUMN MST_WG_RQST.PRMS_CAN_DT IS '回答通知取消日 // #MA.DT // Reply cancelled date';


COMMENT ON COLUMN MST_WG_RQST.INST_DT IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN MST_WG_RQST.INST_CAN_DT IS '指図取消日 // #MA.DT // Order cancellation date';


COMMENT ON COLUMN MST_WG_RQST.ACT_DT IS '実績日 // #MA.DT // Actual date';


COMMENT ON COLUMN MST_WG_RQST.ACT_CAN_DT IS '実績取消日 // #MA.DT // Result cancel date';


COMMENT ON COLUMN MST_WG_RQST.WG_RQST_CNT_RMRKS IS '依頼連絡備考 // #MS.WG_RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN MST_WG_RQST.WG_RE_RQST_CNT_RMRKS IS '再調整依頼連絡備考 // #MS.WG_RE_RQST_CNT_RMRKS // Readjustment request contact remarks';


COMMENT ON COLUMN MST_WG_RQST.INTR_RMRKS IS '依頼元内部備考 // #MS.WG_RQST_INTR_RMRKS // Request source internal remarks';


COMMENT ON COLUMN MST_WG_RQST.COMP_CNG_FLG IS '構成変更ＦＬＧ // #MA.FLG // Configuration changes flg.';


COMMENT ON COLUMN MST_WG_RQST.SPEC_CNG_FLG IS '仕様変更ＦＬＧ // #MA.FLG // Specification change flg.';


COMMENT ON COLUMN MST_WG_RQST.SUB_CHAR1 IS '予備１ // #MS.WG_RQST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_WG_RQST.SUB_CHAR2 IS '予備２ // #MS.WG_RQST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_WG_RQST.SUB_CHAR3 IS '予備３ // #MS.WG_RQST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_WG_RQST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_WG_RQST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_WG_RQST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_WG_RQST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_WG_RQST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_WG_RQST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_WG_RQST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_WG_RQST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_WG_RQST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_WG_RQST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

