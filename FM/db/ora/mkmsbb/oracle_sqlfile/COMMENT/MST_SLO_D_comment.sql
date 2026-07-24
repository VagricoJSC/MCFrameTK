
COMMENT ON TABLE MST_SLO_D IS '受注明細 // Sales order details';


COMMENT ON COLUMN MST_SLO_D.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_SLO_D.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_SLO_D.SLO_REV IS '受注改訂番号 // #MA.SLIP_REV // Sales order rev. number';


COMMENT ON COLUMN MST_SLO_D.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_SLO_D.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SLO_D.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SLO_D.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SLO_D.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SLO_D.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_SLO_D.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_SLO_D.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SLO_D.SNO1_NULL_FLG IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN MST_SLO_D.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SLO_D.SNO2_NULL_FLG IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN MST_SLO_D.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SLO_D.SNO3_NULL_FLG IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN MST_SLO_D.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SLO_D.SNO4_NULL_FLG IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN MST_SLO_D.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SLO_D.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SLO_D.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_SLO_D.SLS_ITM_NO IS '販売品目ＮＯ // #MA.SLS_ITM_NO // Sales item No.';


COMMENT ON COLUMN MST_SLO_D.SHIP_INST_TYP IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN MST_SLO_D.SHIP_SCHD_SPLIT_TYP IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN MST_SLO_D.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MST_SLO_D.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_SLO_D.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_SLO_D.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_SLO_D.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SLO_D.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SLO_D.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SLO_D.DLV_LG_GRP_CD IS '納品先物流グループＣＤ // #MA.LG_GRP_CD // Delivery destination distribution group cd.';


COMMENT ON COLUMN MST_SLO_D.PRI_PRNT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_SLO_D.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MST_SLO_D.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MST_SLO_D.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MST_SLO_D.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_SLO_D.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_SLO_D.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_SLO_D.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_SLO_D.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SLO_D.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SLO_D.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SLO_D.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SLO_D.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SLO_D.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SLO_D.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SLO_D.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SLO_D.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SLO_D.TDLV_LG_GRP_CD IS '配送先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MST_SLO_D.DLV_DAY_WEEK_TYP IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN MST_SLO_D.SLS_CSTSTK_FLG IS '預り売上ＦＬＧ // #MA.FLG // Sales keeping customer inventory flg.';


COMMENT ON COLUMN MST_SLO_D.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SLO_D.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SLO_D.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_SLO_D.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_SLO_D.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_SLO_D.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_SLO_D.COST_UPRI IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN MST_SLO_D.COST_AMT IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN MST_SLO_D.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_SLO_D.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_D.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_D.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_SLO_D.IV_UPRI IS 'インボイス表記単価 // #MA.MONEY // Unit price for invoice';


COMMENT ON COLUMN MST_SLO_D.IV_AMT IS 'インボイス表記金額 // #MA.MONEY // Amount for invoice';


COMMENT ON COLUMN MST_SLO_D.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_SLO_D.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_SLO_D.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_D.PROC_TYP IS '手配区分 // #MA.SLO_PROC_TYP // Procurement type';


COMMENT ON COLUMN MST_SLO_D.SLS_UPRI_REQ_TYP IS '販売単価取得区分 // #MA.SLS_UPRI_REQ_TYP // Sales unit price acquisition type';


COMMENT ON COLUMN MST_SLO_D.SET_ITM_GRP_NO IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN MST_SLO_D.SHIP_RQST_TM IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN MST_SLO_D.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_SLO_D.SLS_SCHD_DT IS '売上予定日 // #MA.DT // Scheduled sales date';


COMMENT ON COLUMN MST_SLO_D.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_SLO_D.PRMS_FLG IS '納期回答ＦＬＧ // #MA.FLG // Order promising flg.';


COMMENT ON COLUMN MST_SLO_D.RQST_TO_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MST_SLO_D.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_SLO_D.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_SLO_D.ALLOC_SCOPE_TYP IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN MST_SLO_D.ALLOC_TYP IS '引当区分 // #MA.ALLOC_TYP // Allocation type';


COMMENT ON COLUMN MST_SLO_D.ALLOC_GRP_CD IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN MST_SLO_D.SHIP_LG_GRP_CD IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN MST_SLO_D.DEF_LOC_CD IS 'デフォルト場所ＣＤ // #MA.LOC_CD // Default location cd.';


COMMENT ON COLUMN MST_SLO_D.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_SLO_D.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_SLO_D.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SLO_D.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SLO_D.VMI_FLG IS '貸出ＦＬＧ // #MA.FLG // Consignment flg.';


COMMENT ON COLUMN MST_SLO_D.WTAX_RATE IS '源泉税率 // #MA.TAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_SLO_D.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_SLO_D.WG_RQST_CNT_RMRKS IS '依頼連絡備考 // #MS.WG_RQST_CNT_RMRKS // Request contact remarks';


COMMENT ON COLUMN MST_SLO_D.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MST_SLO_D.BILL_CRRYOVR_TIMES IS '請求繰越回数 // #MA.CRRYOVR_TIMES // Billing carry-over count';


COMMENT ON COLUMN MST_SLO_D.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_SLO_D.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_SLO_D.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_SLO_D.CST_PO_D_RMRKS IS '得意先注文明細備考 // #MS.CST_PO_D_RMRKS // Customer order details remarks';


COMMENT ON COLUMN MST_SLO_D.SLS_RSN_CD IS '売上理由ＣＤ // #MA.BIZ_RSN_CD // Sales reason cd.';


COMMENT ON COLUMN MST_SLO_D.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_SLO_D.RQST_DT IS '依頼日 // #MA.DT // Request date';


COMMENT ON COLUMN MST_SLO_D.RQST_DLV_RQST_DT IS '依頼納入希望日 // #MA.DT // Request desired delivery date';


COMMENT ON COLUMN MST_SLO_D.RQST_PRMS_DT IS '依頼回答日 // #MA.DT // Request replied date';


COMMENT ON COLUMN MST_SLO_D.RQST_PRMS_DLV_DT IS '依頼回答納入日 // #MA.DT // Request replied delivery date';


COMMENT ON COLUMN MST_SLO_D.RQST_UNIT_CD IS '依頼単位ＣＤ // #MA.UNIT_CD // Request unit cd.';


COMMENT ON COLUMN MST_SLO_D.RQST_QTY IS '依頼数量 // #MA.QTY // Request qty.';


COMMENT ON COLUMN MST_SLO_D.SLO_SUM_BASE_DT IS '受注集計基準日 // #MA.DT // Sales order aggregated base date';


COMMENT ON COLUMN MST_SLO_D.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_SLO_D.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_SLO_D.QTN_D_NO IS '見積明細ＮＯ // #MA.QTN_D_NO // Quotation details No.';


COMMENT ON COLUMN MST_SLO_D.SHIP_CNT_RMRKS IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN MST_SLO_D.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_SLO_D.INTR_RMRKS IS '内部備考 // #MS.SLO_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_SLO_D.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_SLO_D.SUB_CHAR1 IS '予備１ // #MS.SLO_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_SLO_D.SUB_CHAR2 IS '予備２ // #MS.SLO_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_SLO_D.SUB_CHAR3 IS '予備３ // #MS.SLO_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_SLO_D.ITM_COMP_SEQ IS '構成表連番 // #MA.PRNT_SEQ // Configuration table sequence number';


COMMENT ON COLUMN MST_SLO_D.ITM_SPEC_SEQ IS '仕様表連番 // #MA.PRNT_SEQ // Specification table sequence number';


COMMENT ON COLUMN MST_SLO_D.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SLO_D.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_SLO_D.CAN_RSN_CD IS '取消理由ＣＤ // #MS.SLO_RSN_CD // Canceling reason cd.';


COMMENT ON COLUMN MST_SLO_D.SLO_D_CAN_RMKRS IS '明細取消備考 // #MS.SLO_D_CAN_RMKRS // Details cancel remarks';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_CHAR1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_CHAR2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_CHAR3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_CHAR4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_CHAR5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_NUM1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN MST_SLO_D.EDI_SUB_D_DT1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN MST_SLO_D.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLO_D.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLO_D.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLO_D.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLO_D.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLO_D.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLO_D.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLO_D.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLO_D.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLO_D.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MST_SLO_D.NOT_LG_MIX_FLG IS '物流グループ混在不可ＦＬＧ // #MA.FLG // Prohibit mixed distribution group flg.';


COMMENT ON COLUMN MST_SLO_D.NOT_LOT_MIX_FLG IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN MST_SLO_D.NOT_SUBLOT_MIX_FLG IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';

