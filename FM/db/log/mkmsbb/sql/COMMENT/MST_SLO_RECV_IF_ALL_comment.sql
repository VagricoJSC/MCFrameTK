
COMMENT ON TABLE MST_SLO_RECV_IF_ALL IS '受注受信ＩＦ // Sales order import IF';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_PO_REV IS '得意先注文改訂番号 // #MA.SLIP_REV // Customer order rev. number';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CST_CD IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CST_NM IS 'ＩＦ得意先名 // #MA.IF_EXT_SYS_NM // IF customer name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_CD1 IS 'ＩＦ仕向先ＣＤ１ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_NM1 IS 'ＩＦ仕向先名１ // #MA.IF_EXT_SYS_NM // IF distribution channel name 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_CD2 IS 'ＩＦ仕向先ＣＤ２ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_NM2 IS 'ＩＦ仕向先名２ // #MA.IF_EXT_SYS_NM // IF distribution channel name 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_CD3 IS 'ＩＦ仕向先ＣＤ３ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DEST_NM3 IS 'ＩＦ仕向先名３ // #MA.IF_EXT_SYS_NM // IF distribution channel name 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.PO_DT IS '注文日 // #MA.DT // PO date';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SLS_CSTSTK_FLG IS '預り売上ＦＬＧ // #MA.FLG // Sales keeping customer inventory flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SLO_TYP IS '受注区分 // #MS.SLO_TYP // Sales order type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SLS_DPT_CD IS 'ＩＦ売上部門ＣＤ // #MA.IF_EXT_SYS_CD // IF sales dept. cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SLS_DPT_NM IS 'ＩＦ売上部門名 // #MA.IF_EXT_SYS_NM // IF sales dept. name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SLS_USR_CD IS 'ＩＦ売上担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF sales PIC cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SLS_USR_NM IS 'ＩＦ売上担当者名 // #MA.IF_EXT_SYS_NM // IF sales PIC name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DLV_CD IS 'ＩＦ納品先ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_NM IS '納品先名 // #MA.BP_NM // Delivery destination name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_CNTCT_DPT IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_CNTCT_PSN IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_ZIP_CD IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_ADDR1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_ADDR2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_ADDR3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_ADDR4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_TEL IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_FAX IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_CNTRY_CD IS '納品先国ＣＤ // #MA.CNTRY_CD // Delivery destination country cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DLV_CNTRY_CD IS 'ＩＦ納品先国ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination country cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TDLV_CD IS 'ＩＦ配送先ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_NM IS '配送先名 // #MA.BP_NM // Receiving point name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_CNTCT_DPT IS '配送先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_CNTCT_PSN IS '配送先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_ZIP_CD IS '配送先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_ADDR1 IS '配送先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_ADDR2 IS '配送先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_ADDR3 IS '配送先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_ADDR4 IS '配送先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_TEL IS '配送先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_FAX IS '配送先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TDLV_CNTRY_CD IS '配送先国ＣＤ // #MA.CNTRY_CD // Receiving point country cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TDLV_CNTRY_CD IS 'ＩＦ配送先国ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point country cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_DAY_WEEK_TYP IS '着曜日 // #MA.DAY_WEEK_TYP // Arrival day of week';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.PRI_PRNT_TYP IS '価格印字区分 // #MA.PRI_PRNT_TYP // Print price type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_WRK_NO IS 'ＩＦ案件ＮＯ // #MA.IF_EXT_SYS_CD // IF project No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_WRK_NM IS 'ＩＦ案件名 // #MA.IF_EXT_SYS_NM // IF project name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_CD1 IS 'ＩＦ取引条件ＣＤ１ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_NM1 IS 'ＩＦ取引条件名１ // #MA.IF_EXT_SYS_NM // IF transaction terms name 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_CD2 IS 'ＩＦ取引条件ＣＤ２ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_NM2 IS 'ＩＦ取引条件名２ // #MA.IF_EXT_SYS_NM // IF transaction terms name 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_CD3 IS 'ＩＦ取引条件ＣＤ３ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TTERM_NM3 IS 'ＩＦ取引条件名３ // #MA.IF_EXT_SYS_NM // IF transaction terms name 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRNSPT_CD IS '輸送方法ＣＤ // #MA.TRNSPT_CD // Transportation method cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TRNSPT_CD IS 'ＩＦ輸送方法ＣＤ // #MA.IF_EXT_SYS_CD // IF transportation method cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TRNSPT_NM IS 'ＩＦ輸送方法名 // #MA.IF_EXT_SYS_NM // IF transportation method name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.LOAD_PORT_CD IS '船積港ＣＤ // #MA.PORT_CD // Loading port cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_LOAD_PORT_CD IS 'ＩＦ船積港ＣＤ // #MA.IF_EXT_SYS_CD // IF loading port cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_LOAD_PORT_NM IS 'ＩＦ船積港名 // #MA.IF_EXT_SYS_NM // IF loading port name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DSCHRG_PORT_CD IS '船卸港ＣＤ // #MA.PORT_CD // Unloading port cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DSCHRG_PORT_CD IS 'ＩＦ船卸港ＣＤ // #MA.IF_EXT_SYS_CD // IF discharging port cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DSCHRG_PORT_NM IS 'ＩＦ船卸港名 // #MA.IF_EXT_SYS_NM // IF discharging port name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.VIA_PORT_CD IS '経由地ＣＤ // #MA.PORT_CD // Stopover point cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_VIA_PORT_CD IS 'ＩＦ経由地ＣＤ // #MA.IF_EXT_SYS_CD // IF stopover point cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_VIA_PORT_NM IS 'ＩＦ経由地名 // #MA.IF_EXT_SYS_NM // IF stopover point name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_ITM_NM IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CNTRY_ORG_CD IS '原産地ＣＤ // #MA.CNTRY_CD // Place of origin cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CNTRY_ORG_CD IS 'ＩＦ原産地ＣＤ // #MA.IF_EXT_SYS_CD // IF origin cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_GD_CD IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_GD_NM IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_TRD_UNIT_NM IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TAX_RATE IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TAX_TYP IS '税区分 // #MA.TAX_TYP // Tax type';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DSCNT_RSN_CD IS 'ＩＦ値引理由ＣＤ // #MA.IF_EXT_SYS_CD // IF discount reason cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_DSCNT_RSN_NM IS 'ＩＦ値引理由名 // #MA.IF_EXT_SYS_NM // IF discount reason name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SHIP_WH_CD IS '出荷倉庫ＣＤ // #MA.LG_GRP_CD // Shipping warehouse cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SHIP_WH_CD IS 'ＩＦ出荷倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping warehouse cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_SHIP_WH_NM IS 'ＩＦ出荷倉庫名 // #MA.IF_EXT_SYS_NM // IF shipping warehouse name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SHIP_BLOCK_FLG IS '出荷留めＦＬＧ // #MA.FLG // Pending shipping flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ABORT_FLG IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SET_ITM_GRP_NO IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_MAKER_CD IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_MAKER_NM IS 'ＩＦメーカ名 // #MA.IF_EXT_SYS_NM // IF maker name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_PO_RMRKS IS '得意先注文備考 // #MS.CST_PO_RMRKS // Customer order remarks';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.CST_PO_D_RMRKS IS '得意先注文明細備考 // #MS.CST_PO_D_RMRKS // Customer order details remarks';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.IF_CO_NM IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPRI_NOT_CHK_FLG IS '単価チェック対象外ＦＬＧ // #MA.FLG // Not for unit price check flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.AMT_NOT_CHK_FLG IS '金額チェック対象外ＦＬＧ // #MA.FLG // Not for amount check flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.TAX_NOT_CHK_FLG IS '税チェック対象外ＦＬＧ // #MA.FLG // Not for tax check flg.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_CHAR1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_CHAR2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_CHAR3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_CHAR4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_CHAR5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_NUM1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_DT1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_CHAR1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_CHAR2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_CHAR3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_CHAR4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_CHAR5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_NUM1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.EDI_SUB_D_DT1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_SLO_RECV_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

