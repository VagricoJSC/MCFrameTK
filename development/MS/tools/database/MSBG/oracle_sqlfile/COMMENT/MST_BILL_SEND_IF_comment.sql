
COMMENT ON TABLE MST_BILL_SEND_IF IS '請求送信ＩＦ // Billing export IF';


COMMENT ON COLUMN MST_BILL_SEND_IF.DATA_LNO IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.DATA_CRUD_TYP IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN MST_BILL_SEND_IF.EXE_STS_TYP IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN MST_BILL_SEND_IF.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_CL_DT IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_DT IS '請求日 // #MA.DT // Billing date';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_NO IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_D_NO IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.PRE_BILL_NO IS '先行請求書ＮＯ // #MA.PRE_BILL_NO // Advance invoice No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.PRE_BILL_DT IS '先行請求日 // #MA.DT // Advance billing date';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_ST_DT IS '請求期間開始日 // #MA.DT // Billing period start date';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_END_DT IS '請求期間終了日 // #MA.DT // Billing period end date';


COMMENT ON COLUMN MST_BILL_SEND_IF.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.WRK_NO IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.WRK_NM IS '案件名 // #MA.WRK_NM // Sales project name';


COMMENT ON COLUMN MST_BILL_SEND_IF.EIN IS '法人番号 // #MA.EIN // Corporation number';


COMMENT ON COLUMN MST_BILL_SEND_IF.BIZ_CO_NO IS '事業者ＮＯ // #MA.BIZ_CO_NO // Business No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.ZIP_CD IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADDR1 IS '住所１ // #MA.ADDR // Address 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADDR2 IS '住所２ // #MA.ADDR // Address 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADDR3 IS '住所３ // #MA.ADDR // Address 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADDR4 IS '住所４ // #MA.ADDR // Address 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_DPT IS '請求部門 // #MA.DPT_NM // Billing dept.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TEL IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN MST_BILL_SEND_IF.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_CNTRY_CD IS 'ＩＦ国ＣＤ // #MA.IF_EXT_SYS_CD // IF country cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_CD IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_BCST_CD IS 'ＩＦ請求先ＣＤ // #MA.IF_EXT_SYS_CD // IF billing customer cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_NM IS '請求先名 // #MA.BP_NM // Billing customer name';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_BCST_NM IS '請求書宛先 // #MA.BILL_BCST_NM // Invoice destination';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_EIN IS '請求先法人番号 // #MA.EIN // Billing customer corporation number';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_BIZ_CO_NO IS '請求先事業者ＮＯ // #MA.BIZ_CO_NO // Billing customer business No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_ZIP_CD IS '請求先郵便番号 // #MA.ZIP_CD // Billing customer zip code';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_ADDR1 IS '請求先住所１ // #MA.ADDR // Billing customer address 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_ADDR2 IS '請求先住所２ // #MA.ADDR // Billing customer address 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_ADDR3 IS '請求先住所３ // #MA.ADDR // Billing customer address 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_ADDR4 IS '請求先住所４ // #MA.ADDR // Billing customer address 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_BCST_DPT IS '請求書送付部署 // #MA.BP_CNTCT_DPT // Invoice send-to dept.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_TEL IS '請求書送付ＴＥＬ // #MA.TEL // Invoice send-to TEL';


COMMENT ON COLUMN MST_BILL_SEND_IF.BCST_CNTRY_CD IS '請求先国ＣＤ // #MA.CNTRY_CD // Billing customer country cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_BCST_CNTRY_CD IS 'ＩＦ請求先国ＣＤ // #MA.IF_EXT_SYS_CD // IF billing customer country cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_TRD_CUR_CD IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_XRATE IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN MST_BILL_SEND_IF.LAST_BILL_AMT IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_AMT IS '支払額 // #MA.MONEY // Payment amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.SW_AMT IS '振替額 // #MA.MONEY // Transfer amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.SETOFF_AMT IS '相殺額 // #MA.MONEY // Offset amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.BFW_AMT IS '差引繰越額 // #MA.MONEY // Variance carry-over amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.SLS_AMT IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.DSCNT_AMT IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.RET_AMT IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_AMT IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.SW_TO_AMT IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_AMT IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE1 IS '税率１ // #MA.TAX_RATE // Tax rate 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT1 IS '税率毎売上額１ // #MA.MONEY // Sales amount per tax rate 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT1 IS '税率毎税額１ // #MA.MONEY // Tax amount per tax rate 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT1 IS '税率毎基準通貨税額１ // #MA.MONEY // Tax amount (Base currency) per tax rate 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE2 IS '税率２ // #MA.TAX_RATE // Tax rate 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT2 IS '税率毎売上額２ // #MA.MONEY // Sales amount per tax rate 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT2 IS '税率毎税額２ // #MA.MONEY // Tax amount per tax rate 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT2 IS '税率毎基準通貨税額２ // #MA.MONEY // Tax amount (Base currency) per tax rate 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE3 IS '税率３ // #MA.TAX_RATE // Tax rate 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT3 IS '税率毎売上額３ // #MA.MONEY // Sales amount per tax rate 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT3 IS '税率毎税額３ // #MA.MONEY // Tax amount per tax rate 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT3 IS '税率毎基準通貨税額３ // #MA.MONEY // Tax amount (Base currency) per tax rate 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE4 IS '税率４ // #MA.TAX_RATE // Tax rate 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT4 IS '税率毎売上額４ // #MA.MONEY // Sales amount per tax rate 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT4 IS '税率毎税額４ // #MA.MONEY // Tax amount per tax rate 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT4 IS '税率毎基準通貨税額４ // #MA.MONEY // Tax amount (Base currency) per tax rate 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE5 IS '税率５ // #MA.TAX_RATE // Tax rate 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT5 IS '税率毎売上額５ // #MA.MONEY // Sales amount per tax rate 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT5 IS '税率毎税額５ // #MA.MONEY // Tax amount per tax rate 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT5 IS '税率毎基準通貨税額５ // #MA.MONEY // Tax amount (Base currency) per tax rate 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE6 IS '税率６ // #MA.TAX_RATE // Tax rate 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT6 IS '税率毎売上額６ // #MA.MONEY // Sales amount per tax rate 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT6 IS '税率毎税額６ // #MA.MONEY // Tax amount per tax rate 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT6 IS '税率毎基準通貨税額６ // #MA.MONEY // Tax amount (Base currency) per tax rate 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE7 IS '税率７ // #MA.TAX_RATE // Tax rate 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT7 IS '税率毎売上額７ // #MA.MONEY // Sales amount per tax rate 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT7 IS '税率毎税額７ // #MA.MONEY // Tax amount per tax rate 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT7 IS '税率毎基準通貨税額７ // #MA.MONEY // Tax amount (Base currency) per tax rate 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE8 IS '税率８ // #MA.TAX_RATE // Tax rate 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT8 IS '税率毎売上額８ // #MA.MONEY // Sales amount per tax rate 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT8 IS '税率毎税額８ // #MA.MONEY // Tax amount per tax rate 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT8 IS '税率毎基準通貨税額８ // #MA.MONEY // Tax amount (Base currency) per tax rate 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE9 IS '税率９ // #MA.TAX_RATE // Tax rate 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT9 IS '税率毎売上額９ // #MA.MONEY // Sales amount per tax rate 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT9 IS '税率毎税額９ // #MA.MONEY // Tax amount per tax rate 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT9 IS '税率毎基準通貨税額９ // #MA.MONEY // Tax amount (Base currency) per tax rate 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE10 IS '税率１０ // #MA.TAX_RATE // Tax rate 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_SLS_AMT10 IS '税率毎売上額１０ // #MA.MONEY // Sales amount per tax rate 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_TAX_AMT10 IS '税率毎税額１０ // #MA.MONEY // Tax amount per tax rate 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE_BASE_TAX_AMT10 IS '税率毎基準通貨税額１０ // #MA.MONEY // Tax amount (Base currency) per tax rate 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADV_AMT_BAL IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADV_AMT IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADV_SETOFF_AMT IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.ADV_SETOFF_TAX_AMT IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT1 IS '入金予定日１ // #MA.DT // Scheduled payment receipt date 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT1 IS '入金予定額１ // #MA.MONEY // Scheduled payment receipt amount 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD1 IS '入金方法ＣＤ１ // #MA.STTL_CD // Payment receipt method cd. 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD1 IS 'ＩＦ入金方法ＣＤ１ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM1 IS '入金方法名１ // #MA.STTL_NM // Payment receipt method name 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT2 IS '入金予定日２ // #MA.DT // Scheduled payment receipt date 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT2 IS '入金予定額２ // #MA.MONEY // Scheduled payment receipt amount 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD2 IS '入金方法ＣＤ２ // #MA.STTL_CD // Payment receipt method cd. 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD2 IS 'ＩＦ入金方法ＣＤ２ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM2 IS '入金方法名２ // #MA.STTL_NM // Payment receipt method name 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT3 IS '入金予定日３ // #MA.DT // Scheduled payment receipt date 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT3 IS '入金予定額３ // #MA.MONEY // Scheduled payment receipt amount 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD3 IS '入金方法ＣＤ３ // #MA.STTL_CD // Payment receipt method cd. 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD3 IS 'ＩＦ入金方法ＣＤ３ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM3 IS '入金方法名３ // #MA.STTL_NM // Payment receipt method name 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT4 IS '入金予定日４ // #MA.DT // Scheduled payment receipt date 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT4 IS '入金予定額４ // #MA.MONEY // Scheduled payment receipt amount 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD4 IS '入金方法ＣＤ４ // #MA.STTL_CD // Payment receipt method cd. 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD4 IS 'ＩＦ入金方法ＣＤ４ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM4 IS '入金方法名４ // #MA.STTL_NM // Payment receipt method name 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT5 IS '入金予定日５ // #MA.DT // Scheduled payment receipt date 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT5 IS '入金予定額５ // #MA.MONEY // Scheduled payment receipt amount 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD5 IS '入金方法ＣＤ５ // #MA.STTL_CD // Payment receipt method cd. 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD5 IS 'ＩＦ入金方法ＣＤ５ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM5 IS '入金方法名５ // #MA.STTL_NM // Payment receipt method name 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT6 IS '入金予定日６ // #MA.DT // Scheduled payment receipt date 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT6 IS '入金予定額６ // #MA.MONEY // Scheduled payment receipt amount 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD6 IS '入金方法ＣＤ６ // #MA.STTL_CD // Payment receipt method cd. 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD6 IS 'ＩＦ入金方法ＣＤ６ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM6 IS '入金方法名６ // #MA.STTL_NM // Payment receipt method name 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT7 IS '入金予定日７ // #MA.DT // Scheduled payment receipt date 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT7 IS '入金予定額７ // #MA.MONEY // Scheduled payment receipt amount 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD7 IS '入金方法ＣＤ７ // #MA.STTL_CD // Payment receipt method cd. 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD7 IS 'ＩＦ入金方法ＣＤ７ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM7 IS '入金方法名７ // #MA.STTL_NM // Payment receipt method name 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT8 IS '入金予定日８ // #MA.DT // Scheduled payment receipt date 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT8 IS '入金予定額８ // #MA.MONEY // Scheduled payment receipt amount 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD8 IS '入金方法ＣＤ８ // #MA.STTL_CD // Payment receipt method cd. 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD8 IS 'ＩＦ入金方法ＣＤ８ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM8 IS '入金方法名８ // #MA.STTL_NM // Payment receipt method name 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT9 IS '入金予定日９ // #MA.DT // Scheduled payment receipt date 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT9 IS '入金予定額９ // #MA.MONEY // Scheduled payment receipt amount 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD9 IS '入金方法ＣＤ９ // #MA.STTL_CD // Payment receipt method cd. 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD9 IS 'ＩＦ入金方法ＣＤ９ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM9 IS '入金方法名９ // #MA.STTL_NM // Payment receipt method name 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_DT10 IS '入金予定日１０ // #MA.DT // Scheduled payment receipt date 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_SCHD_AMT10 IS '入金予定額１０ // #MA.MONEY // Scheduled payment receipt amount 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_CD10 IS '入金方法ＣＤ１０ // #MA.STTL_CD // Payment receipt method cd. 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_RCV_MTD_CD10 IS 'ＩＦ入金方法ＣＤ１０ // #MA.IF_EXT_SYS_CD // IF payment receipt method cd. 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_MTD_NM10 IS '入金方法名１０ // #MA.STTL_NM // Payment receipt method name 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_AC_CD IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_BANK_AC_CD IS 'ＩＦ口座ＣＤ // #MA.IF_EXT_SYS_CD // IF bank account cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_AC_TYP IS '口座区分 // #MA.BANK_AC_TYP // Bank account type';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_AC_NO IS '口座番号 // #MA.BANK_AC_NO // Bank account number';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_AC_HOLDER IS '口座名義 // #MA.BANK_AC_HOLDER // Bank account holder';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_AC_HOLDER_SUB IS '口座名義別名 // #MA.BANK_AC_HOLDER_SUB // Account holder alias name';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_CD IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BANK_NM IS '銀行名 // #MA.BANK_NM // Bank name';


COMMENT ON COLUMN MST_BILL_SEND_IF.BRANCH_CD IS '支店ＣＤ // #MA.BANK_BRANCH_CD // Branch cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.BRANCH_NM IS '支店名 // #MA.BANK_BRANCH_NM // Branch name';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_TRD_CD IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_NM IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MST_BILL_SEND_IF.SLIP_STS_TYP IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN MST_BILL_SEND_IF.DLV_SLIP_NO IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.DLV_SLIP_D_NO IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.SHIP_DLV_SLIP_NO IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN MST_BILL_SEND_IF.SHIP_DLV_SLIP_D_NO IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN MST_BILL_SEND_IF.ACT_NO IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.ACT_REV IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN MST_BILL_SEND_IF.ACT_D_NO IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.CST_PO_NO IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.CST_PO_D_NO IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_BILL_SEND_IF.DLV_DT IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN MST_BILL_SEND_IF.RCV_DT IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN MST_BILL_SEND_IF.BILL_BASIS_DT IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN MST_BILL_SEND_IF.BASE_AC_DT IS '計上日（基） // #MA.DT // Recording date (Base)';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_ITM_CD IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_ITM_SUB1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_ITM_SUB2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_ITM_SUB3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_ALT_NM1 IS '品目別名１ // #MA.ITM_ALT_NM1 // Item alias name 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_ALT_NM2 IS '品目別名２ // #MA.ITM_ALT_NM2 // Item alias name 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_ALT_NM3 IS '品目別名３ // #MA.ITM_ALT_NM3 // Item alias name 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.ITM_ALT_NM4 IS '品目別名４ // #MA.ITM_ALT_NM4 // Item alias name 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_TRD_UNIT_CD IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_UNIT_NM IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_BILL_SEND_IF.INTERIM_FLG IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CUR_UPRI IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CUR_DSCNT_AMT IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_CD IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_TAX_CD IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_NM IS '税名 // #MA.TAX_NM // Tax name';


COMMENT ON COLUMN MST_BILL_SEND_IF.TAX_RATE IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN MST_BILL_SEND_IF.INC_TAX_FLG IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_CUR_TAX_AMT IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN MST_BILL_SEND_IF.TRD_D_RMRKS IS '明細備考 // #MA.TRD_D_RMRKS // Details remarks';


COMMENT ON COLUMN MST_BILL_SEND_IF.IF_CO_CD IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN MST_BILL_SEND_IF.CO_NM IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN MST_BILL_SEND_IF.BATCH_LOG_NO IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN MST_BILL_SEND_IF.LOG_SUB_KEY1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.LOG_SUB_KEY2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_CHAR30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_NUM1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_NUM2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_NUM3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_NUM4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_NUM5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_DT1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_DT2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_DT3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_DT4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN MST_BILL_SEND_IF.SUB_DT5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN MST_BILL_SEND_IF.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_BILL_SEND_IF.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_BILL_SEND_IF.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_BILL_SEND_IF.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_BILL_SEND_IF.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

