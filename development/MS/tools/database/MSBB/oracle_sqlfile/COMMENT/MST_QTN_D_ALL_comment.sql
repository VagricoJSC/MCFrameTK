
COMMENT ON TABLE MST_QTN_D_ALL IS '見積明細 // Quotation details';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_D_NO IS '見積明細ＮＯ // #MA.QTN_D_NO // Quotation details No.';


COMMENT ON COLUMN MST_QTN_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_NO IS '見積ＮＯ // #MA.QTN_NO // Quotation No.';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_REV IS '見積改訂番号 // #MA.SLIP_REV // Quotation rev. number';


COMMENT ON COLUMN MST_QTN_D_ALL.DISP_SEQ IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_QTN_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_QTN_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_QTN_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_QTN_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_QTN_D_ALL.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_QTN_D_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MST_QTN_D_ALL.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MST_QTN_D_ALL.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_QTN_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_QTN_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.SLS_ITM_NO IS '販売品目ＮＯ // #MA.SLS_ITM_NO // Sales item No.';


COMMENT ON COLUMN MST_QTN_D_ALL.NO_ITM_CD_FLG IS '品目ＣＤ未採番ＦＬＧ // #MA.FLG // Item cd. unnumbered flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.UPRI_NOT_TGT_FLG IS '単価再取得対象外ＦＬＧ // #MA.FLG // Not to reacquire unit price flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_STD_SLS_UPRI IS '取引通貨標準販売単価 // #MA.MONEY // Standard sales unit price (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_STD_SLS_AMT IS '取引通貨標準販売金額 // #MA.MONEY // Standard sales amount (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.UPRI_RATE IS '仕切率 // #MA.PER // Discount rate';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_UPRI IS '取引通貨仕切単価 // #MA.MONEY // Discount unit price (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_AMT IS '取引通貨仕切金額 // #MA.MONEY // Discount unit amount (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_QTN_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_STD_SLS_TAX_AMT IS '取引通貨標準販売税額 // #MA.MONEY // Standard sales tax (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨仕切税額 // #MA.MONEY // Discount unit tax (Transaction currency)';


COMMENT ON COLUMN MST_QTN_D_ALL.SET_ITM_GRP_NO IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN MST_QTN_D_ALL.COST_UPRI IS '原価単価 // #MA.MONEY // Unit cost';


COMMENT ON COLUMN MST_QTN_D_ALL.COST_AMT IS '原価金額 // #MA.MONEY // Total cost';


COMMENT ON COLUMN MST_QTN_D_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_D_RMRKS IS '見積明細備考 // #MS.QTN_D_RMRKS // Quotation details remarks';


COMMENT ON COLUMN MST_QTN_D_ALL.INTR_RMRKS IS '内部備考 // #MS.QTN_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_D_RSLT_RSN_CD IS '見積明細結果理由ＣＤ // #MS.SLO_RSN_CD // Quotation details result reason cd.';


COMMENT ON COLUMN MST_QTN_D_ALL.QTN_D_RSLT_RSN_RMRKS IS '見積明細結果理由備考 // #MS.QTN_D_RSLT_RSN_RMRKS // Quotation details result reason remarks';


COMMENT ON COLUMN MST_QTN_D_ALL.SLO_TRNST_QTY IS '受注引継数量 // #MA.QTY // Sales order copy qty.';


COMMENT ON COLUMN MST_QTN_D_ALL.SLS_TRNST_QTY IS '売上実績引継数量 // #MA.QTY // Sales results copy qty.';


COMMENT ON COLUMN MST_QTN_D_ALL.CST_QTN_RQST_D_NO IS '得意先見積依頼明細ＮＯ // #MA.CST_QTN_RQST_D_NO // Customer quotation request details No.';


COMMENT ON COLUMN MST_QTN_D_ALL.SUB_CHAR1 IS '予備１ // #MS.QTN_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_QTN_D_ALL.SUB_CHAR2 IS '予備２ // #MS.QTN_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_QTN_D_ALL.SUB_CHAR3 IS '予備３ // #MS.QTN_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_COMP_SEQ IS '構成表連番 // #MA.SLIP_SEQ // Configuration table sequence number';


COMMENT ON COLUMN MST_QTN_D_ALL.ITM_SPEC_SEQ IS '仕様表連番 // #MA.SLIP_SEQ // Specification table sequence number';


COMMENT ON COLUMN MST_QTN_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_QTN_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_QTN_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_QTN_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_QTN_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

