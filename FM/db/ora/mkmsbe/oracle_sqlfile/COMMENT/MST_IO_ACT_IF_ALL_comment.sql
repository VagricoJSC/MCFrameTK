
COMMENT ON TABLE MST_IO_ACT_IF_ALL IS '受払実績送信ＩＦ // GR/GI result export IF';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DPT_ST_DT IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DATA_UPD_TS IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BI_NOT_SEND_FLG IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STD_COST_AMT IS '標準単価金額 // #MA.MONEY // Standard unit amount';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLIP_NO IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLIP_SEQ_NO IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_TM IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_NO IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_SEQ IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_REV_NO IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_D_NO IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_D_SEQ IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_IO_NO IS '実績受払ＮＯ // #MA.ACT_IO_NO // Result GR/GI No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_IO_SEQ IS '実績受払連番 // #MA.SLIP_SEQ // Result GR/GI sequence number';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UN_FIX_FLG IS '金額未確定ＦＬＧ // #MA.FLG // Amount unfirm flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TEMP_AP_FLG IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRN_TYP IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.IO_ACT_TYP IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.IO_TYP IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GI_WG_CD IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GR_WG_CD IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GI_DPT_CD IS '出庫部門ＣＤ // #MA.DPT_CD // GI dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GR_DPT_CD IS '入庫部門ＣＤ // #MA.DPT_CD // GR dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DPT_CD1 IS '予備部門ＣＤ１ // #MA.DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DPT_CD2 IS '予備部門ＣＤ２ // #MA.DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DPT_CD3 IS '予備部門ＣＤ３ // #MA.DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MFG_USR_CD IS '製造担当者ＣＤ // #MA.USR_CD // Mfg. PIC cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AC_ITM_GRP_CD IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.IN_XFR_TYP IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STK_ID_TYP IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_PROC_AMT IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_ONR_PROV_AMT IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.FOREIGN_FLG IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_XRATE_CD IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CRED_CD IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SPOT_FLG IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STTL_SCHD_DT IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AREA_CD IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ITM_INST_QTY IS '品目指図数量 // #MA.QTY // Item order qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MFG_ST_QTY IS '製造着手数量 // #MA.QTY // Mfg. start qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.YIELD_RATE IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.STKTK_BASE_DT IS '棚卸基準日 // #MA.DT // Base date of inventory count';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_AC_ITM_GRP_CD IS '親会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Parent accounting item classification cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_JNL_CD IS '親品目仕訳ＣＤ // #MA.ITM_JNL_CD // Parent item journal cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_SUB1 IS '親品目枝番１ // #MA.ITM_SUB1 // Parent item branch No. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_SUB2 IS '親品目枝番２ // #MA.ITM_SUB2 // Parent item branch No. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_SUB3 IS '親品目枝番３ // #MA.ITM_SUB3 // Parent item branch No. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_ITM_NM IS '親品名 // #MA.ITM_NM // Parent item name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_LOT_NO IS '親ロットＮＯ // #MA.LOT_NO // Parent lot No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_SUBLOT_NO IS '親サブロットＮＯ // #MA.SUBLOT_NO // Parent sublot No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_SNO1 IS '親手配ＮＯ１ // #MA.SNO1 // Parent SEIBAN No. 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_SNO2 IS '親手配ＮＯ２ // #MA.SNO2 // Parent SEIBAN No. 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_SNO3 IS '親手配ＮＯ３ // #MA.SNO3 // Parent SEIBAN No. 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PAR_SNO4 IS '親手配ＮＯ４ // #MA.SNO4 // Parent SEIBAN No. 4';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACCRUAL_FLG IS '在庫発生基準ＦＬＧ // #MA.FLG // Inventory accrual base flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ACCPT_FLG IS '資産発生基準ＦＬＧ // #MA.FLG // Asset accrual base flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.AVL_FLG IS '使用可能日基準ＦＬＧ // #MA.FLG // Available date basis flg.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BUF_QTY IS '安全在庫数量 // #MA.QTY // Fluctuation inventory qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.RORD_STK_QTY IS '発注点在庫数量 // #MA.QTY // Reorder point inventory qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.RORD_RQST_QTY IS '発注点依頼数量 // #MA.QTY // Reorder point request qty.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_IO_ACT_IF_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

