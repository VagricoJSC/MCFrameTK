
COMMENT ON TABLE MBT_JOURNAL IS '仕訳情報テーブル // Journal info. table';


COMMENT ON COLUMN MBT_JOURNAL.JNL_GRP_NO IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN MBT_JOURNAL.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBT_JOURNAL.AC_IF_TYP IS '会計ＩＦ区分 // #MA.AC_IF_TYP // Accounting IF type';


COMMENT ON COLUMN MBT_JOURNAL.SLIP_CNT_ID IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN MBT_JOURNAL.JNL_NO IS '仕訳伝票ＮＯ // #MA.JNL_NO // Journal slip No.';


COMMENT ON COLUMN MBT_JOURNAL.JNL_NO_SEQ IS '仕訳伝票明細番号 // #MA.JNL_NO_SEQ // Journal slip details number';


COMMENT ON COLUMN MBT_JOURNAL.DC_TYP IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN MBT_JOURNAL.AC_SLIP_DT IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN MBT_JOURNAL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MBT_JOURNAL.SLIP_NO IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN MBT_JOURNAL.SLIP_SEQ_NO IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN MBT_JOURNAL.DPT_CD IS '部門ＣＤ // #MA.AC_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MBT_JOURNAL.AC_CD IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN MBT_JOURNAL.SUB_AC_CD IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN MBT_JOURNAL.PROJECT_CD IS 'プロジェクトＣＤ // #MA.SUMMARY_CD // Project cd.';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD0 IS '集計ＣＤ０ // #MA.SUMMARY_CD // Aggregated cd. 0';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD1 IS '集計ＣＤ１ // #MA.SUMMARY_CD // Aggregated cd. 1';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD2 IS '集計ＣＤ２ // #MA.SUMMARY_CD // Aggregated cd. 2';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD3 IS '集計ＣＤ３ // #MA.SUMMARY_CD // Aggregated cd. 3';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD4 IS '集計ＣＤ４ // #MA.SUMMARY_CD // Aggregated cd. 4';


COMMENT ON COLUMN MBT_JOURNAL.SUMMARY_CD5 IS '集計ＣＤ５ // #MA.SUMMARY_CD // Aggregated cd. 5';


COMMENT ON COLUMN MBT_JOURNAL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MBT_JOURNAL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MBT_JOURNAL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MBT_JOURNAL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MBT_JOURNAL.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MBT_JOURNAL.BP_TYP IS '取引先区分 // #MA.MASTER_TYP // BP type';


COMMENT ON COLUMN MBT_JOURNAL.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MBT_JOURNAL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MBT_JOURNAL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_UPRI IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_SUM_AMT IS '基準通貨税込金額 // #MA.MONEY // Tax included amount (Base currency)';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_AMT IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_TAX_AMT IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_SUM_AMT IS '取引通貨税込金額 // #MA.MONEY // Tax included amount (Transaction currency)';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_UPRI IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_SUM_AMT IS '納税通貨税込金額 // #MA.MONEY // Tax included amount (Tax currency)';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_AMT IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_TAX_AMT IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MBT_JOURNAL.TAX_TYP IS '税区分 // #MA.AC_TAX_TYP // Tax type';


COMMENT ON COLUMN MBT_JOURNAL.TAX_CD IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN MBT_JOURNAL.FOREIGN_FLG IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN MBT_JOURNAL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MBT_JOURNAL.XRATE_CD IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_XRATE IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_XRATE_CD IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN MBT_JOURNAL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MBT_JOURNAL.BILL_NO IS '請求／支払ＮＯ // #MA.BILL_PAY_NO // Billing/payment No.';


COMMENT ON COLUMN MBT_JOURNAL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MBT_JOURNAL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MBT_JOURNAL.USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MBT_JOURNAL.CLS_JNL_TYP IS '決算仕訳区分 // #MA.CLS_JNL_TYP // Closing entry type';


COMMENT ON COLUMN MBT_JOURNAL.ALLOC_JNL_FLG IS '配賦仕訳ＦＬＧ // #MA.FLG // Allocation journal flg.';


COMMENT ON COLUMN MBT_JOURNAL.SPOT_FLG IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN MBT_JOURNAL.STTL_SCHD_DT IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN MBT_JOURNAL.STTL_CD IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN MBT_JOURNAL.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MBT_JOURNAL.OTHER_AC_CD IS '相手勘定科目ＣＤ // #MA.AC_CD // Counterpart account cd.';


COMMENT ON COLUMN MBT_JOURNAL.OTHER_SUB_AC_CD IS '相手補助勘定科目ＣＤ // #MA.SUB_AC_CD // Counterpart subsidiary account cd.';


COMMENT ON COLUMN MBT_JOURNAL.OTHER_DPT_CD IS '相手部門ＣＤ // #MA.AC_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN MBT_JOURNAL.ABSTRACT1 IS '摘要１ // #MA.ABSTRACT_T // Abstract 1';


COMMENT ON COLUMN MBT_JOURNAL.ABSTRACT2 IS '摘要２ // #MA.ABSTRACT_T // Abstract 2';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MBT_JOURNAL.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MBT_JOURNAL.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MBT_JOURNAL.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MBT_JOURNAL.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MBT_JOURNAL.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MBT_JOURNAL.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MBT_JOURNAL.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MBT_JOURNAL.SEND_FLG IS '送信ＦＬＧ // #MA.FLG // Export flg.';


COMMENT ON COLUMN MBT_JOURNAL.JNL_PTN IS '仕訳パタン // #MA.JNL_PTN_NM // Journal pattern';


COMMENT ON COLUMN MBT_JOURNAL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_JOURNAL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_JOURNAL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_JOURNAL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_JOURNAL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_JOURNAL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_JOURNAL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_JOURNAL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_JOURNAL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_JOURNAL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MBT_JOURNAL.BASE_CUR_TAX_BASE_AMT IS '基準通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Base currency)';


COMMENT ON COLUMN MBT_JOURNAL.TRD_CUR_TAX_BASE_AMT IS '取引通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Transaction currency)';


COMMENT ON COLUMN MBT_JOURNAL.PTAX_CUR_TAX_BASE_AMT IS '納税通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Tax currency)';

