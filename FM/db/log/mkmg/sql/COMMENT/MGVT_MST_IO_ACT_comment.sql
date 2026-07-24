
COMMENT ON TABLE MGVT_MST_IO_ACT IS '受払実績ビュー // GR/GI result view';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLIP_NO IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLIP_SEQ_NO IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_TM IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLIP_REV_NO IS '伝票改訂番号 // #MA.SLIP_REV // Slip rev. number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_NO IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_SEQ IS 'ヘッダ実績連番 // #MA.SLIP_SEQ // Header result sequence number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_REV_NO IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_D_NO IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_D_SEQ IS '明細実績連番 // #MA.SLIP_SEQ // Details result sequence number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_IO_NO IS '実績受払ＮＯ // #MA.ACT_IO_NO // Result GR/GI No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_IO_SEQ IS '実績受払連番 // #MA.SLIP_SEQ // Result GR/GI sequence number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UN_FIX_FLG IS '金額未確定ＦＬＧ // #MA.FLG // Amount unfirm flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TEMP_AP_FLG IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRN_TYP IS 'トランザクション区分 //  // Transaction type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.IO_ACT_TYP IS '受払区分 //  // GR/GI type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.IO_TYP IS '入出庫区分 //  // GR/GI type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.RSN_CD IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GI_WG_CD IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GR_WG_CD IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_DPT_CD IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PURC_DPT_CD IS '購買部門ＣＤ // #MA.DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AP_DPT_CD IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLS_DPT_CD IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AR_DPT_CD IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GI_DPT_CD IS '出庫部門ＣＤ // #MA.DPT_CD // GI dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GR_DPT_CD IS '入庫部門ＣＤ // #MA.DPT_CD // GR dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_DPT_CD IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DPT_CD1 IS '予備部門ＣＤ１ // #MA.DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DPT_CD2 IS '予備部門ＣＤ２ // #MA.DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DPT_CD3 IS '予備部門ＣＤ３ // #MA.DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACT_USR_CD IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLS_USR_CD IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.MFG_USR_CD IS '製造担当者ＣＤ // #MA.USR_CD // Mfg. PIC cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PURC_USR_CD IS '購買担当者ＣＤ // #MA.USR_CD // Purchasing PIC cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AC_ITM_GRP_CD IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STK_MNG_TYP IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ASSET_MNG_TYP IS '資産管理区分 // #MA.ASSET_MNG_TYP // Asset management type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUNDRY_ITM_FLG IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STK_ARRV_BP_CD IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGVT_MST_IO_ACT.FIX_NO_TYP IS '確定ＮＯ区分 //  // Firm No. type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.FIX_NO IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.IN_XFR_TYP IS '積送品区分 //  // In-transit type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STK_INSP_TYP IS '在庫検査区分 //  // Inventory inspection type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STK_ID_TYP IS '在庫識別区分 //  // Inventory identification type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STK_BP_CD IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PACK_UNIT_QTY IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PACK_UNIT_CD IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_PROC_AMT IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_ONR_PROV_AMT IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MGVT_MST_IO_ACT.WTAX_RATE IS '源泉税率 // #MA.WTAX_RATE // Withholding tax rate';


COMMENT ON COLUMN MGVT_MST_IO_ACT.WTAX_AMT IS '源泉税額 // #MA.MONEY // Withholding tax';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.FOREIGN_FLG IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_XRATE_CD IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.RCPT_IV_NO IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_CTG_CD IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_BP_CD IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_OPER_CD IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_LOC_CD IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_SLO_NO IS '負担受注ＮＯ // #MA.SLO_NO // Charged sales No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_PO_NO IS '負担発注ＮＯ // #MA.PO_NO // Charged PO No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_IV_NO IS '負担インボイスＮＯ // #MA.IV_NO // Charged invoice No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BD_WG_CD IS '負担ワーキンググループＣＤ // #MA.WG_CD // Charged WG cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TDLV_CD IS '配送先ＣＤ // #MA.BP_CD // Receiving point cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PSPPL_CD IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.BSPPL_CD IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.CRED_CD IS '与信管理先ＣＤ // #MA.BP_CD // Credit managed BP cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SPOT_FLG IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STTL_SCHD_DT IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AREA_CD IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ITM_INST_QTY IS '品目指図数量 // #MA.QTY // Item order qty.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.MFG_ST_QTY IS '製造着手数量 // #MA.QTY // Mfg. start qty.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.YIELD_RATE IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN MGVT_MST_IO_ACT.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MGVT_MST_IO_ACT.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INPT_LOC_CD IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INPT_STR_LN_CD IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.OUTSRC_MFG_LOC_CD IS '外注製造場所ＣＤ // #MA.LOC_CD // Subcontracting mfg. location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.OUTSRC_MFG_LOC_DPT_CD IS '外注製造場所部門ＣＤ // #MA.DPT_CD // Subcontracting mfg. location dept. cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.OUTSRC_MFG_LOC_WG_CD IS '外注製造場所ワーキンググループＣＤ // #MA.WG_CD // Subcontracting mfg. location WG cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STRG_STR_LN_CD IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MGVT_MST_IO_ACT.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GI_LOC_CD IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.GR_LOC_CD IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.STKTK_BASE_DT IS '棚卸基準日 // #MA.DT // Base date of inventory count';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_AC_ITM_GRP_CD IS '親会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Parent accounting item classification cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_JNL_CD IS '親品目仕訳ＣＤ // #MA.ITM_JNL_CD // Parent item journal cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_SUB1 IS '親品目枝番１ // #MA.ITM_SUB1 // Parent item branch No. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_SUB2 IS '親品目枝番２ // #MA.ITM_SUB2 // Parent item branch No. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_SUB3 IS '親品目枝番３ // #MA.ITM_SUB3 // Parent item branch No. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_ITM_NM IS '親品名 // #MA.ITM_NM // Parent item name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_LOT_NO IS '親ロットＮＯ // #MA.LOT_NO // Parent lot No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SUBLOT_NO IS '親サブロットＮＯ // #MA.SUBLOT_NO // Parent sublot No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SNO1 IS '親手配ＮＯ１ // #MA.SNO1 // Parent SEIBAN No. 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SNO2 IS '親手配ＮＯ２ // #MA.SNO2 // Parent SEIBAN No. 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SNO3 IS '親手配ＮＯ３ // #MA.SNO3 // Parent SEIBAN No. 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SNO4 IS '親手配ＮＯ４ // #MA.SNO4 // Parent SEIBAN No. 4';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACCRUAL_FLG IS '在庫発生基準ＦＬＧ // #MA.FLG // Inventory accrual base flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.ACCPT_FLG IS '資産発生基準ＦＬＧ // #MA.FLG // Asset accrual base flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.AVL_FLG IS '使用可能日基準ＦＬＧ // #MA.FLG // Available date basis flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MGVT_MST_IO_ACT.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SLIP_NO IS '親伝票ＮＯ // #MA.SLIP_NO // Parent slip No.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.PAR_SLIP_SEQ_NO IS '親伝票連番 // #MA.SLIP_SEQ // Parent slip sequence number';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SLIP_CMPL_FLG IS '補完ＦＬＧ // #MA.FLG // Complement flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.SEND_FLG IS '送信対象ＦＬＧ // #MA.FLG // To be exported flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.C_IMP_FLG IS '原価取込済ＦＬＧ // #MA.FLG // Cost imported flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.A_IMP_FLG IS '会計ＩＦ取込済ＦＬＧ // #MA.FLG // Accounting IF imported flg.';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_IO_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_IO_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

