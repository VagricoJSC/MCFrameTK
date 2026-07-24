
COMMENT ON TABLE MST_ACCPT_SEND_IF IS '検収送信ＩＦ // Acceptance export IF';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.BP_DLV_SLIP_NO IS '業者納品書ＮＯ // #MA.DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.BP_DLV_SLIP_LNO IS '業者納品書行ＮＯ // #MA.DLV_SLIP_D_NO // Vendor delivery note row No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IV_FLG IS 'インボイスＦＬＧ // #MA.FLG // Invoice flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_CNTRY_CD IS 'ＩＦ国ＣＤ // #MA.IF_EXT_SYS_CD // IF country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_PURC_DPT_CD IS 'ＩＦ購買部門ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing dept. cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_DPT_NM IS '購買部門名 // #MA.DPT_NM // Purchasing dept. name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_PURC_USR_CD IS 'ＩＦ購買担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing PIC cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_USR_NM IS '購買担当者名 // #MA.USR_NM // Purchasing PIC name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_SPPL_CD IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SPPL_NM IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SPPL_CNTRY_CD IS '発注先国ＣＤ // #MA.CNTRY_CD // Supplier country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_SPPL_CNTRY_CD IS 'ＩＦ発注先国ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_DT IS '仕入日 // #MA.DT // Purchase date';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.RED_SLIP_AC_DT IS '赤伝計上日 // #MA.DT // Credit voucher recording date';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.RED_SLIP_AC_YM IS '赤伝計上年月 // #MA.YM // Credit voucher recording month';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PAY_SCHD_DT IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ID_TYP IS '納入先識別区分 // #MS.SHIP_TO_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ID_CD IS '納入先識別ＣＤ // #MS.SHIP_TO_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_IN_TO_ID_CD IS 'ＩＦ納入先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination identification cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_NM IS '納入先名 // #MS.SHIP_TO_ID_NM // Delivery destination name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ZIP_CD IS '納入先郵便番号 // #MA.ZIP_CD // Delivery destination zip code';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ADDR1 IS '納入先住所１ // #MA.ADDR // Delivery destination address1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ADDR2 IS '納入先住所２ // #MA.ADDR // Delivery destination address2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ADDR3 IS '納入先住所３ // #MA.ADDR // Delivery destination address3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_ADDR4 IS '納入先住所４ // #MA.ADDR // Delivery destination address4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_CNTCT_DPT IS '納入先担当部署 // #MA.BP_CNTCT_DPT // Delivery destination dept. in charge';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_CNTCT_PSN IS '納入先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_TEL IS '納入先ＴＥＬ // #MA.TEL // Delivery destination TEL';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_FAX IS '納入先ＦＡＸ // #MA.TEL // Delivery destination FAX';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_SUNDRY_FLG IS '納入先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IN_TO_CNTRY_CD IS '納入先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_IN_TO_CNTRY_CD IS 'ＩＦ納入先国ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TDLV_CD IS 'ＩＦ配送先ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_CNTCT_DPT IS '配送先担当部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TDLV_CNTRY_CD IS '配送先国ＣＤ // #MA.CNTRY_CD // Receiving point country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TDLV_CNTRY_CD IS 'ＩＦ配送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_SITE_CD IS 'ＩＦ工場・物流倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF factory/distribution warehouse cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SITE_NM IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DRCT_DLV_FLG IS '直送ＦＬＧ // #MA.FLG // Direct-delivery flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DRCT_DLV_BP_CD IS '直送先会社ＣＤ // #MA.BP_CD // Direct-delivery destination company cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_DRCT_DLV_BP_CD IS 'ＩＦ直送先会社ＣＤ // #MA.IF_EXT_SYS_CD // IF direct-delivery destination company cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DRCT_DLV_BP_NM IS '直送先会社名 // #MA.BP_NM // Direct-delivery destination company name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DRCT_DLV_CNTRY_CD IS '直送先国ＣＤ // #MA.CNTRY_CD // Direct-delivery destination country cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_DRCT_DLV_CNTRY_CD IS 'ＩＦ直送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF direct-delivery destination country';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TRD_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TTERM_CD1 IS 'ＩＦ取引条件ＣＤ１ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_NM1 IS '取引条件名１ // #MA.TTERM_NM // Transaction terms name 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TTERM_CD2 IS 'ＩＦ取引条件ＣＤ２ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_NM2 IS '取引条件名２ // #MA.TTERM_NM // Transaction terms name 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TTERM_CD3 IS 'ＩＦ取引条件ＣＤ３ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_NM3 IS '取引条件名３ // #MA.TTERM_NM // Transaction terms name 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_UNIT_NM IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_DSCNT_RSN_CD IS 'ＩＦ値引理由ＣＤ // #MA.IF_EXT_SYS_CD // IF discount reason cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.DSCNT_RSN_NM IS '値引理由名 // #MA.BIZ_RSN_NM // Discount reason name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TAX_TYP IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_TAX_CD IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TAX_NM IS '税名 // #MA.TAX_NM // Tax name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TAX_RATE IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.ACCPT_DFCT_FLG IS '検収不良ＦＬＧ // #MA.FLG // Acceptance defective flg.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_ACT_NO IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_ACT_REV IS '仕入実績改訂番号 // #MA.SLIP_REV // Purchase result rev. number';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.PURC_ACT_D_NO IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.CO_NM IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ACCPT_SEND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

