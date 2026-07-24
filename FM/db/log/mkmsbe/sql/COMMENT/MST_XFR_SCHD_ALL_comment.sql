
COMMENT ON TABLE MST_XFR_SCHD_ALL IS '移動・移送予定 // Movement/transport schedule';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.XFR_SCHD_NO IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.XFR_SRC_TYP IS '移動・移送元区分 // #MS.XFR_SRC_TYP // Source movement/transport type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.XFR_SRC_NO IS '移動・移送元ＮＯ // #MA.XFR_SRC_NO // Source movement/transport No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_WG_CD IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_LG_GRP_CD IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_STR_LN_CD IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_STK_ARRV_BP_CD IS '出庫在庫着荷先ＣＤ // #MA.BP_CD // GI inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_WG_CD IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_LG_GRP_CD IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_STR_LN_CD IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_STK_ARRV_BP_CD IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GI_RQST_TM IS '出庫希望日時 // #MA.TM // Desired GI date and time';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.GR_RQST_TM IS '入庫希望日時 // #MA.TM // Desired GR date and time';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RCPT_DT IS '受付日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RQST_USR_CD IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RQST_DPT_CD IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_BLOCK_FLG IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ID_TYP IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ID_CD IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ID_NM IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ZIP_CD IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ADDR1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ADDR2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ADDR3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_ADDR4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_CNTCT_DPT IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_CNTCT_PSN IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_TEL IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_FAX IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_TO_SUNDRY_FLG IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INPT_SCHD_NO IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.CONT_QTY IS '投入有効成分 // #MA.CONT_QTY // Input active ingredient';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RQST_MOD_FLG IS '依頼元訂正ＦＬＧ // #MA.FLG // Edited by request source flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RQST_CAN_FLG IS '紐切れＦＬＧ // #MA.FLG // Unpegged flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.NOT_LOT_MIX_FLG IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.NOT_SUBLOT_MIX_FLG IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.VLD_DT_FR IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.VLD_DT_TO IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_PROV_TYP IS '支給区分（返品） // #MA.PROV_TYP // Supply type (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_PROV_BASIS_TYP IS '支給計上区分（返品） // #MA.PROV_BASIS_TYP // Supply recording type (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_XRATE_INPT_FLG IS '為替レート指定ＦＬＧ（返品） // #MA.FLG // Set exchange rate flg. (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_XRATE IS '為替レート（返品） // #MA.MONEY // Exchange rate (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ（返品） // #MA.FLG // Taxpaying exchange rate specification flg. (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_PTAX_XRATE IS '納税為替レート（返品） // #MA.MONEY // Taxpaying exchange rate (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TRD_CUR_CD IS '取引通貨ＣＤ（返品） // #MA.CUR_CD // Transaction currency cd. (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TAX_FIX_FLG IS '税指定ＦＬＧ（返品） // #MA.FLG // Tax specified flg. (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TAX_CD IS '税ＣＤ（返品） // #MA.TAX_CD // Tax cd. (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TRD_CUR_UPRI IS '取引通貨単価（返品） // #MA.MONEY // Unit price (Transaction currency) (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TRD_CUR_AMT IS '取引通貨金額（返品） // #MA.MONEY // Amount (Transaction currency) (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_TRD_CUR_TAX_AMT IS '取引通貨税額（返品） // #MA.MONEY // Tax amount (Transaction currency) (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_WTAX_RATE IS '源泉税率（返品） // #MA.WTAX_RATE // Withholding tax rate (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RET_WTAX_AMT IS '源泉税額（返品） // #MA.MONEY // Withholding tax (Return)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BASE_DLV_SLIP_NO IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BASE_PROV_ACT_NO IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.RQST_CNT_RMRKS IS '依頼連絡備考 // #MS.RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SHIP_CNT_RMRKS IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INTR_RMRKS IS '内部備考 // #MS.XFR_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SUB_CHAR1 IS '予備１ // #MS.XFR_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SUB_CHAR2 IS '予備２ // #MS.XFR_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.SUB_CHAR3 IS '予備３ // #MS.XFR_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_XFR_SCHD_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

