
COMMENT ON TABLE MST_ESHIP_ACT_SEND_IF IS 'ＥＤＩ出荷実績送信ＩＦ // EDI shipping result export IF';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_DLV_INST_NO IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_DLV_INST_D_NO IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IV_FLG IS 'インボイス取引ＦＬＧ // #MA.FLG // Shipping invoice biz flg.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRN_TYP IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_ACT_NO IS '納品伝票実績ＮＯ // #MA.DLV_SLIP_ACT_NO // Delivery slip result No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_NO IS '納品書ＮＯ // #MA.IF_DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_REV IS '納品書改訂番号 // #MA.SLIP_REV // Delivery note rev. number';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.IF_DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SHIP_TM IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_TM IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_CST_CD IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_NM IS '得意先名 // #MA.BP_NM // Customer name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_CNTRY_CD IS '得意先国ＣＤ // #MA.CNTRY_CD // Customer country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_CST_CNTRY_CD IS 'ＩＦ得意先国ＣＤ // #MA.IF_EXT_SYS_CD // IF customer country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_DLV_CD IS 'ＩＦ納品先ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SUNDRY_FLG IS '納品先諸口ＦＬＧ // #MA.FLG // Miscellaneous delivery destination flg.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_CNTRY_CD IS '納品先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_DLV_CNTRY_CD IS 'ＩＦ納品先国ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_TDLV_CD IS 'ＩＦ配送先ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_SUNDRY_FLG IS '配送先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TDLV_CNTRY_CD IS '配送先国ＣＤ // #MA.CNTRY_CD // Receiving point country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_TDLV_CNTRY_CD IS 'ＩＦ配送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.VIA_DLV_TYP IS '配送先経由区分 // #MA.VIA_DLV_TYP // Receiving point stopover type';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_SLS_DPT_CD IS 'ＩＦ売上部門ＣＤ // #MA.IF_EXT_SYS_CD // IF sales dept. cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SLS_DPT_NM IS '売上部門名 // #MA.DPT_NM // Sales dept. name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_SLS_USR_CD IS 'ＩＦ売上担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF sales PIC cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SLS_USR_NM IS '売上担当者名 // #MA.USR_NM // Sales PIC name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_UNIT_NM IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_TRD_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_TAX_CD IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TAX_NM IS '税名 // #MA.TAX_NM // Tax name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TAX_TYP IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TAX_RATE IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.VLD_DT IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.LMT_DT IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_RMRKS IS '納品書備考 // #MA.TRD_RMRKS // Delivery note remarks';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.DLV_SLIP_D_RMRKS IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CO_NM IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.IF_CNTRY_CD IS 'ＩＦ国ＣＤ // #MA.IF_EXT_SYS_CD // IF country cd.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ESHIP_ACT_SEND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

