
COMMENT ON TABLE MST_DLV_SLIP_D_ALL IS '納品伝票明細 // Delivery slip details';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_SLIP_D_SEQ IS '納品書明細連番 // #MA.SLIP_SEQ // Delivery note details serial number';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_SLIP_SEQ IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.LOT_PLURAL_FLG IS 'ロット複数ＦＬＧ // #MA.FLG // Lot multiple flg.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUBLOT_PLURAL_FLG IS 'サブロット複数ＦＬＧ // #MA.FLG // Multiple sublots flg.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.FIX_NO_TYP IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.FIX_NO IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SLO_QTY IS '受注数量 // #MA.QTY // Sales order qty.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SLO_UNIT_CD IS '受注単位ＣＤ // #MA.UNIT_CD // Sales order unit cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_INST_QTY IS '納入指示数量 // #MA.QTY // Delivery order qty.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_INST_UNIT_CD IS '納入指示単位ＣＤ // #MA.UNIT_CD // Delivery order cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_CUR_DSCNT_AMT IS '基準通貨値引額 // #MA.MONEY // Discount amount (Base currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.PROV_TYP IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.PROV_BASIS_TYP IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_INST_NO IS '納入指示ＮＯ // #MA.CST_DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.DLV_INST_D_NO IS '納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SHIP_DLV_SLIP_D_NO IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SHIP_DLV_SLIP_MULTI_FLG IS '出荷時納品書明細複数ＦＬＧ // #MA.FLG // Multiple delivery note details at shipping flg.';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.IO_TYP IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.BASE_AC_DT IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUB_CHAR1 IS '予備１ // #MS.DLV_SLIP_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUB_CHAR2 IS '予備２ // #MS.DLV_SLIP_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.SUB_CHAR3 IS '予備３ // #MS.DLV_SLIP_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_DLV_SLIP_D_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

