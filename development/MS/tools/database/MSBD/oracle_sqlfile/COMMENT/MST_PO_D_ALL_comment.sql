
COMMENT ON TABLE MST_PO_D_ALL IS '発注明細 // PO details';


COMMENT ON COLUMN MST_PO_D_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_PO_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PO_D_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_PO_D_ALL.PO_REV IS '発注改訂番号 // #MA.SLIP_REV // PO rev. number';


COMMENT ON COLUMN MST_PO_D_ALL.PO_SCHD_NO IS '発注予定ＮＯ // #MA.PO_SCHD_NO // PO schedule No.';


COMMENT ON COLUMN MST_PO_D_ALL.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_PO_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PO_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PO_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PO_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PO_D_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PO_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PO_D_ALL.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_PO_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PO_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PO_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PO_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_RSN_CD IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_PO_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_PO_D_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_PO_D_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_PO_D_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PO_D_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PO_D_ALL.IN_TO_LOC_CD IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN MST_PO_D_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_PO_D_ALL.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_LT IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN MST_PO_D_ALL.RQST_DLV_RQST_TM IS '依頼元納入希望日時 // #MA.TM // Request source desired delivery date and time';


COMMENT ON COLUMN MST_PO_D_ALL.RQST_AVL_RQST_DT IS '依頼元使用可能希望日 // #MA.DT // Request source desired available date';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_SCHD_DT IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_BASIS_TYP IS '仕入計上区分 // #MA.PURC_BASIS_TYP // Purchase recording type';


COMMENT ON COLUMN MST_PO_D_ALL.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_PO_D_ALL.PURC_UPRI_REQ_TYP IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_PO_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_PO_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_PO_D_ALL.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_D_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_PO_D_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_PO_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PO_D_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PO_D_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_PO_D_ALL.DRCT_DLV_TYP IS '直納区分 // #MS.DRCT_DLV_TYP // Direct-delivery type';


COMMENT ON COLUMN MST_PO_D_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_PO_D_ALL.BNDL_FLG IS 'まとめＦＬＧ // #MA.FLG // Aggregation flg.';


COMMENT ON COLUMN MST_PO_D_ALL.RQST_SLO_FLG IS '依頼元受注ＦＬＧ // #MA.FLG // Request source orders flg.';


COMMENT ON COLUMN MST_PO_D_ALL.OUTSRC_ITM_ORD_NO IS '外注品目オーダＮＯ // #MA.ITM_ORD_NO // Subcontracting item order No.';


COMMENT ON COLUMN MST_PO_D_ALL.OUTSRC_FLG IS '外注ＦＬＧ // #MA.FLG // Subcontracting flg.';


COMMENT ON COLUMN MST_PO_D_ALL.UPLND_FLG IS '計画外ＦＬＧ // #MA.FLG // Unplanned flg.';


COMMENT ON COLUMN MST_PO_D_ALL.SCHD_CHG_FLG IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN MST_PO_D_ALL.PO_CONF_RCPT_FLG IS '請書受領ＦＬＧ // #MA.FLG // Confirmation received flg.';


COMMENT ON COLUMN MST_PO_D_ALL.PO_CONF_RCPT_DT IS '請書受領日 // #MA.DT // Confirmation received date';


COMMENT ON COLUMN MST_PO_D_ALL.PRI_PRINT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_SLIP_INVALID_FLG IS '納品書対象外ＦＬＧ // #MA.FLG // Not for elivery note flg.';


COMMENT ON COLUMN MST_PO_D_ALL.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MST_PO_D_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_PO_D_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_PO_D_ALL.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_PO_D_ALL.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_PO_D_ALL.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_PO_D_ALL.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_WG_CD IS '負担ＷＧ ＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_PO_D_ALL.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MST_PO_D_ALL.EXT_PO_D_NO IS '外部発注明細ＮＯ // #MA.EXT_PO_D_NO // External PO details No.';


COMMENT ON COLUMN MST_PO_D_ALL.INTR_RMRKS IS '内部明細備考 // #MS.PO_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PO_D_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PO_D_ALL.PO_PRINT_D_RMRKS IS '注文書明細備考 // #MS.PO_PRINT_D_RMRKS // PO sheet details remarks';


COMMENT ON COLUMN MST_PO_D_ALL.DLV_SLIP_D_RMRKS IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN MST_PO_D_ALL.SUB_CHAR1 IS '予備１ // #MS.PO_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_PO_D_ALL.SUB_CHAR2 IS '予備２ // #MS.PO_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_PO_D_ALL.SUB_CHAR3 IS '予備３ // #MS.PO_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_PO_D_ALL.RQST_CAN_FLG IS '紐切れＦＬＧ // #MA.FLG // Unpegged flg.';


COMMENT ON COLUMN MST_PO_D_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_CHAR1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_CHAR2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_CHAR3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_CHAR4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_CHAR5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_NUM1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN MST_PO_D_ALL.EDI_SUB_D_DT1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN MST_PO_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PO_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PO_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PO_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PO_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

