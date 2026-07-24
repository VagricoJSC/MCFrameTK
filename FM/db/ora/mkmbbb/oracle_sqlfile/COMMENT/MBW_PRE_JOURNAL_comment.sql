
COMMENT ON TABLE MBW_PRE_JOURNAL IS '仕訳前情報テーブル // Info. table before journalization';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_GRP_NO IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PRE_JNL_SEQ IS '仮仕訳連番 // #MA.JNL_NO_SEQ // Temporary journal sequence number';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_UNIT IS '仕訳単位 // #MA.JNL_UNIT // Journal unit';


COMMENT ON COLUMN MBW_PRE_JOURNAL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_SLIP_DT IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SLIP_NO IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SLIP_SEQ_NO IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_JNL_CD IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PURC_DPT_CD IS '購買部門ＣＤ // #MA.AC_DPT_CD // Purchasing dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AP_DPT_CD IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SLS_DPT_CD IS '売上部門ＣＤ // #MA.AC_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AR_DPT_CD IS '債権部門ＣＤ // #MA.AC_DPT_CD // AR dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.GI_DPT_CD IS '出庫部門ＣＤ // #MA.AC_DPT_CD // GI dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.GR_DPT_CD IS '入庫部門ＣＤ // #MA.AC_DPT_CD // GR dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BD_DPT_CD IS '負担部門ＣＤ // #MA.AC_DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.RCV_DPT_CD IS '入金部門ＣＤ／支払部門ＣＤ // #MA.AC_DPT_CD // Payment receiving dept. cd./Payment dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SO_DPT_CD IS '相殺部門ＣＤ // #MA.AC_DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DPT_CD1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DPT_CD2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DPT_CD3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PURC_TYP IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN MBW_PRE_JOURNAL.UN_FIX_FLG IS '金額未確定ＦＬＧ // #MA.FLG // Amount unfirm flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TEMP_AP_FLG IS '暫定買掛ＦＬＧ // #MA.FLG // Temporary AP flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.FOREIGN_FLG IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AC_ITM_GRP_CD IS '会計品目分類ＣＤ // #MA.AC_ITM_GRP_CD // Accounting item classification cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TAX_CD IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_XRATE_CD IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MBW_PRE_JOURNAL.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_CUR_PROC_AMT IS '取引通貨加工金額 // #MA.MONEY // Subcontracting amount (Transaction currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_CUR_ONR_PROV_AMT IS '取引通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Transaction currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_CUR_PROC_AMT IS '基準通貨加工金額 // #MA.MONEY // Subcontracting amount (Base currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BASE_CUR_ONR_PROV_AMT IS '基準通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Base currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_CUR_PROC_AMT IS '納税通貨加工金額 // #MA.MONEY // Subcontracting amount (Tax currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PTAX_CUR_ONR_PROV_AMT IS '納税通貨有償支給金額 // #MA.MONEY // Chargeable supply amount (Tax currency)';


COMMENT ON COLUMN MBW_PRE_JOURNAL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BILL_NO IS '請求／支払ＮＯ // #MA.BILL_PAY_NO // Billing/payment No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ACST_CD IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.ASPPL_CD IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.INV_COM_CD IS '在庫保管先ＣＤ // #MA.BP_CD // Inventory storage destination cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.RCST_CD IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SETOFF_CD IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SPOT_FLG IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.STTL_SCHD_DT IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN MBW_PRE_JOURNAL.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.CST_ITM_CD IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.CST_ITM_NM IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SPPL_ITM_CD IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SPPL_ITM_NM IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.XFR_PSN IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN MBW_PRE_JOURNAL.PROJECT_CD IS 'プロジェクトＣＤ // #MA.SUMMARY_CD // Project cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD0 IS '集計ＣＤ０ // #MA.SUMMARY_CD // Aggregated cd. 0';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD1 IS '集計ＣＤ１ // #MA.SUMMARY_CD // Aggregated cd. 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD2 IS '集計ＣＤ２ // #MA.SUMMARY_CD // Aggregated cd. 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD3 IS '集計ＣＤ３ // #MA.SUMMARY_CD // Aggregated cd. 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD4 IS '集計ＣＤ４ // #MA.SUMMARY_CD // Aggregated cd. 4';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUMMARY_CD5 IS '集計ＣＤ５ // #MA.SUMMARY_CD // Aggregated cd. 5';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_ITM_CD IS '振替先品目ＣＤ // #MA.ITM_CD // Transfer Item cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_ITM_SUB1 IS '振替先枝番１ // #MA.ITM_SUB1 // Transfer branch No. 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_ITM_SUB2 IS '振替先枝番２ // #MA.ITM_SUB2 // Transfer branch No. 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_ITM_SUB3 IS '振替先枝番３ // #MA.ITM_SUB3 // Transfer branch No. 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_ITM_NM IS '振替先品名 // #MA.ITM_NM // Transfer item name';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_PROJECT_CD IS '振替先プロジェクトＣＤ // #MA.SUMMARY_CD // Transfer project cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD0 IS '振替先集計ＣＤ０ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 0';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD1 IS '振替先集計ＣＤ１ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD2 IS '振替先集計ＣＤ２ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD3 IS '振替先集計ＣＤ３ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD4 IS '振替先集計ＣＤ４ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 4';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_SUMMARY_CD5 IS '振替先集計ＣＤ５ // #MA.SUMMARY_CD // Transfer destination aggregation cd. 5';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TRD_D_RMRKS IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN MBW_PRE_JOURNAL.JNL_KEY10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MBW_PRE_JOURNAL.TMP_NUM IS '集計用数量 // #MA.QTY // Quantity for aggregation';


COMMENT ON COLUMN MBW_PRE_JOURNAL.AUTO_JNL_KEY_CD IS '自動仕訳キーＣＤ // #MA.AUTO_JNL_KEY_CD // Auto-journal key cd.';


COMMENT ON COLUMN MBW_PRE_JOURNAL.SETOFF_NM IS '任意相殺先名 // #MA.BP_NM // Optional offset destination name';

