
COMMENT ON TABLE MST_PO_RECV_IF_ALL IS '発注受信ＩＦ // PO import IF';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXT_DATA_NO IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXT_DATA_LNO IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DATA_MAKE_DT IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IMP_FLG IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.RECV_DT IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXT_PO_NO IS '外部発注ＮＯ // #MA.EXT_PO_NO // External PO No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EXT_PO_D_NO IS '外部発注明細ＮＯ // #MA.EXT_PO_D_NO // External PO details No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PRNT_PO_FLG IS '注文書発行ＦＬＧ // #MA.FLG // PO sheet issue flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PRNT_DLV_FLG IS '納品書発行ＦＬＧ // #MA.FLG // Delivery note issue flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_DT IS '発注日 // #MA.DT // PO date';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_CD IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_NM IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_SPPL_CD IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_SPPL_NM IS 'ＩＦ発注先名 // #MA.IF_EXT_SYS_NM // IF supplier name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_DPT_CD IS 'ＩＦ購買部門ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_DPT_NM IS 'ＩＦ購買部門名 // #MA.IF_EXT_SYS_NM // IF purchasing dept. name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_USR_CD IS 'ＩＦ購買担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF purchasing PIC cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_USR_NM IS 'ＩＦ購買担当者名 // #MA.IF_EXT_SYS_NM // IF purchasing PIC name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_CUR_NM IS 'ＩＦ取引通貨名 // #MA.IF_EXT_SYS_NM // IF transaction currency name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.XRATE_INPT_FLG IS '為替レート指定ＦＬＧ // #MA.FLG // Set exchange rate flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PTAX_XRATE_INPT_FLG IS '納税為替レート指定ＦＬＧ // #MA.FLG // Taxpaying exchange rate specification flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_PRINT_CD IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PO_PRINT_CD IS 'ＩＦ注文書表示ＣＤ // #MA.IF_EXT_SYS_CD // IF display PO sheet cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PO_PRINT_NM IS 'ＩＦ注文書表示名 // #MA.IF_EXT_SYS_NM // IF display PO sheet name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_PO_PRINT_SCHD_DT IS '変更注文書発行予定日 // #MA.DT // Scheduled change PO sheet issue date after change';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.CRCT_RSN_CD IS '訂正理由ＣＤ // #MS.PO_CRCT_RSN_CD // Correction reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_CRCT_RSN_CD IS 'ＩＦ訂正理由ＣＤ // #MA.IF_EXT_SYS_CD // IF correction reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_CRCT_RSN_NM IS 'ＩＦ訂正理由名 // #MA.IF_EXT_SYS_NM // IF correction reason name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_CD1 IS '取引条件ＣＤ１ // #MA.TTERM_CD // Transaction terms cd. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_CD1 IS 'ＩＦ取引条件ＣＤ１ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_NM1 IS 'ＩＦ取引条件名１ // #MA.IF_EXT_SYS_NM // IF transaction terms name 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_RMRKS1 IS '取引条件備考１ // #MS.TTERM_RMRKS1 // Transaction terms remarks 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_CD2 IS '取引条件ＣＤ２ // #MA.TTERM_CD // Transaction terms cd. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_CD2 IS 'ＩＦ取引条件ＣＤ２ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_NM2 IS 'ＩＦ取引条件名２ // #MA.IF_EXT_SYS_NM // IF transaction terms name 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_RMRKS2 IS '取引条件備考２ // #MS.TTERM_RMRKS2 // Transaction terms remarks 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_CD3 IS '取引条件ＣＤ３ // #MA.TTERM_CD // Transaction terms cd. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_CD3 IS 'ＩＦ取引条件ＣＤ３ // #MA.IF_EXT_SYS_CD // IF transaction terms cd. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TTERM_NM3 IS 'ＩＦ取引条件名３ // #MA.IF_EXT_SYS_NM // IF transaction terms name 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TTERM_RMRKS3 IS '取引条件備考３ // #MS.TTERM_RMRKS3 // Transaction terms remarks 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INTR_RMRKS IS '内部備考 // #MS.PO_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_PRINT_RMRKS IS '注文書備考 // #MS.PO_PRINT_RMRKS // PO sheet remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DLV_SLIP_RMRKS IS '納品書備考 // #MA.TRD_RMRKS // Delivery note remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_ITM_NM IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IV_ITM_NM IS 'インボイス表記品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_ID_TYP IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_MAKER_CD IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_MAKER_NM IS 'ＩＦメーカ名 // #MA.IF_EXT_SYS_NM // IF maker name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BP_LOT_NO IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IN_TO_LOC_CD IS '納入場所ＣＤ // #MA.LOC_CD // Delivery location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_IN_TO_LOC_CD IS 'ＩＦ納入場所ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_IN_TO_LOC_NM IS 'ＩＦ納入場所名 // #MA.IF_EXT_SYS_NM // IF delivery location name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_STR_LN_CD IS 'ＩＦ棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF rack/line cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_STR_LN_NM IS 'ＩＦ棚・ライン名 // #MA.IF_EXT_SYS_NM // IF rack/line name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_MFG_LOC_CD IS 'ＩＦ製造場所ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_MFG_LOC_NM IS 'ＩＦ製造場所名 // #MA.IF_EXT_SYS_NM // IF mfg. location name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DLV_RQST_TM IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.RQST_AVL_RQST_DT IS '依頼元使用可能希望日 // #MA.DT // Request source desired available date';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_SCHD_DT IS '仕入予定日 // #MA.DT // Scheduled purchase date';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SYNC_FLG IS '同時計上ＦＬＧ // #MA.FLG // Simultaneous recording flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TRD_UNIT_NM IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_UPRI_REQ_TYP IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPRI_NOT_TGT_FLG IS '単価取得対象外ＦＬＧ // #MA.FLG // Not to acquire unit price flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TAX_FIX_FLG IS '税指定ＦＬＧ // #MA.FLG // Tax specified flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TAX_CD IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_TAX_NM IS 'ＩＦ税名 // #MA.IF_EXT_SYS_NM // IF tax name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DSCNT_RSN_CD IS '値引理由ＣＤ // #MA.BIZ_RSN_CD // Discount reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_DSCNT_RSN_CD IS 'ＩＦ値引理由ＣＤ // #MA.IF_EXT_SYS_CD // IF discount reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_DSCNT_RSN_NM IS 'ＩＦ値引理由名 // #MA.IF_EXT_SYS_NM // IF discount reason name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CUR_PROC_UPRI IS '取引通貨加工単価 // #MA.MONEY // Subcontracting unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_CUR_ONR_PROV_UPRI IS '取引通貨有償支給単価 // #MA.MONEY // Chargeable supply unit price (Transaction currency)';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PURC_RSN_CD IS '仕入理由ＣＤ // #MA.BIZ_RSN_CD // Purchase reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_RSN_CD IS 'ＩＦ仕入理由ＣＤ // #MA.IF_EXT_SYS_CD // IF purchase reason cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_PURC_RSN_NM IS 'ＩＦ仕入理由名 // #MA.IF_EXT_SYS_NM // IF purchase reason name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PRI_PRINT_FLG IS '価格印字ＦＬＧ // #MA.FLG // Print price flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_CONF_RCPT_FLG IS '請書受領ＦＬＧ // #MA.FLG // Confirmation received flg.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_CONF_RCPT_DT IS '請書受領日 // #MA.DT // Confirmation received date';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PAY_CRRYOVR_TIMES IS '支払繰越回数 // #MA.CRRYOVR_TIMES // Payment carry-over count';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_AP_DPT_CD IS 'ＩＦ債務部門ＣＤ // #MA.IF_EXT_SYS_CD // IF AP dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_AP_DPT_NM IS 'ＩＦ債務部門名 // #MA.IF_EXT_SYS_NM // IF AP dept. name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_DPT_CD IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_DPT_NM IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_ITM_CD IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_ITM_SUB1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_ITM_SUB2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_ITM_SUB3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_ITM_CD IS 'ＩＦ負担品目ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_ITM_SUB1 IS 'ＩＦ負担枝番１ // #MA.ITM_SUB1 // IF charged branch No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_ITM_SUB2 IS 'ＩＦ負担枝番２ // #MA.ITM_SUB2 // IF charged branch No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_ITM_SUB3 IS 'ＩＦ負担枝番３ // #MA.ITM_SUB3 // IF charged branch No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_ITM_NM IS 'ＩＦ負担品目名 // #MA.IF_EXT_SYS_NM // IF charged item name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SNO1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SNO2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SNO3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SNO4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_LOC_CD IS 'ＩＦ負担場所ＣＤ // #MA.IF_EXT_SYS_CD // IF charged location cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_LOC_NM IS 'ＩＦ負担場所名 // #MA.IF_EXT_SYS_NM // IF charged location name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_LOT_NO IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SUBLOT_NO IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_CTG_CD IS 'ＩＦ負担品群ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item category cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_CTG_NM IS 'ＩＦ負担品群名 // #MA.IF_EXT_SYS_NM // IF charged item category name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_OPER_CD IS 'ＩＦ負担工程ＣＤ // #MA.IF_EXT_SYS_CD // IF charged operation cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_BD_OPER_NM IS 'ＩＦ負担工程名 // #MA.IF_EXT_SYS_NM // IF charged operation name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INTR_D_RMRKS IS '内部明細備考 // #MS.PO_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.PO_PRINT_D_RMRKS IS '注文書明細備考 // #MS.PO_PRINT_D_RMRKS // PO sheet details remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.ARR_CNT_RMRKS IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.DLV_SLIP_D_RMRKS IS '納品書明細備考 // #MA.TRD_D_RMRKS // Delivery note details remarks';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.IF_CO_NM IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_CHAR1 IS 'ＥＤＩ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI spare CHAR column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_CHAR2 IS 'ＥＤＩ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI spare CHAR column 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_CHAR3 IS 'ＥＤＩ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI spare CHAR column 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_CHAR4 IS 'ＥＤＩ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI spare CHAR column 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_CHAR5 IS 'ＥＤＩ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI spare CHAR column 5';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_NUM1 IS 'ＥＤＩ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI spare NUM column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_DT1 IS 'ＥＤＩ予備ＤＡＴＥ項目１ // #MA.DT // EDI spare DATE column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_CHAR1 IS 'ＥＤＩ明細予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // EDI details spare CHAR column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_CHAR2 IS 'ＥＤＩ明細予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // EDI details spare CHAR column 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_CHAR3 IS 'ＥＤＩ明細予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // EDI details spare CHAR column 3';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_CHAR4 IS 'ＥＤＩ明細予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // EDI details spare CHAR column 4';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_CHAR5 IS 'ＥＤＩ明細予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // EDI details spare CHAR column 5';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_NUM1 IS 'ＥＤＩ明細予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // EDI details spare NUM column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.EDI_SUB_D_DT1 IS 'ＥＤＩ明細予備ＤＡＴＥ項目１ // #MA.DT // EDI details spare DATE column 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_PO_RECV_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

