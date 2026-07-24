
COMMENT ON TABLE MAM_CO_ALL IS '会社マスタ // Company master';


COMMENT ON COLUMN MAM_CO_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_CO_ALL.CO_ALT_NM1 IS '会社別名１ // #MA.CO_ALT_NM1 // Company alias 1';


COMMENT ON COLUMN MAM_CO_ALL.CO_ALT_NM2 IS '会社別名２ // #MA.CO_ALT_NM2 // Company alias 2';


COMMENT ON COLUMN MAM_CO_ALL.CO_ALT_NM3 IS '会社別名３ // #MA.CO_ALT_NM3 // Company alias 3';


COMMENT ON COLUMN MAM_CO_ALL.CO_ALT_NM4 IS '会社別名４ // #MA.CO_ALT_NM4 // Company alias 4';


COMMENT ON COLUMN MAM_CO_ALL.ZIP_CD IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN MAM_CO_ALL.ADDR1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN MAM_CO_ALL.ADDR2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN MAM_CO_ALL.ADDR3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN MAM_CO_ALL.ADDR4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN MAM_CO_ALL.TEL IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN MAM_CO_ALL.FAX IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN MAM_CO_ALL.CO_REPL_NM IS '代表者名 // #MA.CO_REPL_NM // Representative name';


COMMENT ON COLUMN MAM_CO_ALL.EIN IS '法人番号 // #MA.EIN // Corporation number';


COMMENT ON COLUMN MAM_CO_ALL.BIZ_CO_NO IS '事業者ＮＯ // #MA.BIZ_CO_NO // Business No.';


COMMENT ON COLUMN MAM_CO_ALL.STD_CO_CD IS '標準企業コード // #MA.STD_CO_CD // Standard company code';


COMMENT ON COLUMN MAM_CO_ALL.CNTRY_CD IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN MAM_CO_ALL.AREA_CD IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN MAM_CO_ALL.BASE_CUR_CD IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN MAM_CO_ALL.PTAX_CUR_CD IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN MAM_CO_ALL.ST_MON IS '期首年月 // #MA.MON // Beginning year';


COMMENT ON COLUMN MAM_CO_ALL.AC_CL_DAY IS '会計締日 // #MA.CL_DAY // Accounting closing day';


COMMENT ON COLUMN MAM_CO_ALL.AC_CL_MON_BASE IS '会計月度基準 // #MA.CL_MON_BASE // Accounting month basis';


COMMENT ON COLUMN MAM_CO_ALL.DT_SWITCH_TIME IS '日付切替時間 // #MA.INT2 // Date switching time';


COMMENT ON COLUMN MAM_CO_ALL.AR_NO_USE_FLG IS '債権不使用ＦＬＧ // #MA.FLG // AR not use flg.';


COMMENT ON COLUMN MAM_CO_ALL.AP_NO_USE_FLG IS '債務不使用ＦＬＧ // #MA.FLG // AP not used flg.';


COMMENT ON COLUMN MAM_CO_ALL.TEMP_AP_USE_FLG IS '暫定買掛使用ＦＬＧ // #MA.FLG // Temporary AP use flg.';


COMMENT ON COLUMN MAM_CO_ALL.STD_CAL_CD IS '標準カレンダＣＤ // #MA.CAL_CD // Standard calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.BILL_CL_CAL_CD IS '請求締カレンダＣＤ // #MA.CAL_CD // Billing closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.PAY_SCHD_CL_CAL_CD IS '支払予定締カレンダＣＤ // #MA.CAL_CD // Payment schedule closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.SLS_CL_FLG IS '売上締ＦＬＧ // #MA.FLG // Sales closing flg.';


COMMENT ON COLUMN MAM_CO_ALL.RCV_CL_FLG IS '入金締ＦＬＧ // #MA.FLG // Payment received closing flg.';


COMMENT ON COLUMN MAM_CO_ALL.PURC_CL_FLG IS '仕入締ＦＬＧ // #MA.FLG // Purchase closing flg.';


COMMENT ON COLUMN MAM_CO_ALL.PAY_CL_FLG IS '支払締ＦＬＧ // #MA.FLG // Payment closing flg.';


COMMENT ON COLUMN MAM_CO_ALL.SLS_CL_CAL_CD IS '売上締カレンダＣＤ // #MA.CAL_CD // Sales closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.RCV_CL_CAL_CD IS '入金締カレンダＣＤ // #MA.CAL_CD // Payment received closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.PURC_CL_CAL_CD IS '仕入締カレンダＣＤ // #MA.CAL_CD // Purchase closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.PAY_CL_CAL_CD IS '支払締カレンダＣＤ // #MA.CAL_CD // Payment closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.STK_CL_CAL_CD IS '在庫締カレンダＣＤ // #MA.CAL_CD // Inventory closing calendar cd.';


COMMENT ON COLUMN MAM_CO_ALL.SLS_CL_DELAY_DAYS IS '売上締日遅延日数 // #MA.DELAY_DAYS // Delay days (Sales closing day)';


COMMENT ON COLUMN MAM_CO_ALL.SLS_CL_BA_TYP IS '売上締日前後区分 // #MA.BA_TYP // Sales closing day before/after type';


COMMENT ON COLUMN MAM_CO_ALL.RCV_CL_DELAY_DAYS IS '入金締日遅延日数 // #MA.DELAY_DAYS // Delayed days (Payment received closing day)';


COMMENT ON COLUMN MAM_CO_ALL.RCV_CL_BA_TYP IS '入金締日前後区分 // #MA.BA_TYP // Payment received closing day before/after type';


COMMENT ON COLUMN MAM_CO_ALL.PURC_CL_DELAY_DAYS IS '仕入締日遅延日数 // #MA.DELAY_DAYS // Delay days (Purchase closing day)';


COMMENT ON COLUMN MAM_CO_ALL.PURC_CL_BA_TYP IS '仕入締日前後区分 // #MA.BA_TYP // Purchase closing day before/after type';


COMMENT ON COLUMN MAM_CO_ALL.PAY_CL_DELAY_DAYS IS '支払締日遅延日数 // #MA.DELAY_DAYS // Delay days (Payment closing day)';


COMMENT ON COLUMN MAM_CO_ALL.PAY_CL_BA_TYP IS '支払締日前後区分 // #MA.BA_TYP // Payment closing day before/after type';


COMMENT ON COLUMN MAM_CO_ALL.STK_CL_DELAY_DAYS IS '在庫締日遅延日数 // #MA.DELAY_DAYS // Delay days (Inventory closing day)';


COMMENT ON COLUMN MAM_CO_ALL.STK_CL_BA_TYP IS '在庫締日前後区分 // #MA.BA_TYP // Inventory closing day before/after type';


COMMENT ON COLUMN MAM_CO_ALL.SLS_XRATE_CD IS '売上為替レートＣＤ // #MA.XRATE_CD // Sales exchange rate cd.';


COMMENT ON COLUMN MAM_CO_ALL.PURC_XRATE_CD IS '仕入為替レートＣＤ // #MA.XRATE_CD // Purchase exchange rate cd.';


COMMENT ON COLUMN MAM_CO_ALL.PROV_XRATE_CD IS '支給為替レートＣＤ // #MA.XRATE_CD // Supply exchange rate cd.';


COMMENT ON COLUMN MAM_CO_ALL.BILL_XRATE_CONV_FLG IS '請求時為替レート換算ＦＬＧ // #MA.FLG // Convert at exchange rate upon billing flg.';


COMMENT ON COLUMN MAM_CO_ALL.BILL_XRATE_CD IS '請求為替レートＣＤ // #MA.XRATE_CD // Billing exchange rate cd.';


COMMENT ON COLUMN MAM_CO_ALL.PAY_XRATE_CONV_FLG IS '支払照合時為替レート換算ＦＬＧ // #MA.FLG // Convert at exchange rate upon payment collation flg.';


COMMENT ON COLUMN MAM_CO_ALL.PAY_XRATE_CD IS '支払照合為替レートＣＤ // #MA.XRATE_CD // Payment collation exchange rate cd.';


COMMENT ON COLUMN MAM_CO_ALL.MON01_XRATE_REV_FLG IS '１月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in January';


COMMENT ON COLUMN MAM_CO_ALL.MON02_XRATE_REV_FLG IS '２月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in February';


COMMENT ON COLUMN MAM_CO_ALL.MON03_XRATE_REV_FLG IS '３月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in March';


COMMENT ON COLUMN MAM_CO_ALL.MON04_XRATE_REV_FLG IS '４月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in April';


COMMENT ON COLUMN MAM_CO_ALL.MON05_XRATE_REV_FLG IS '５月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in May';


COMMENT ON COLUMN MAM_CO_ALL.MON06_XRATE_REV_FLG IS '６月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in June';


COMMENT ON COLUMN MAM_CO_ALL.MON07_XRATE_REV_FLG IS '７月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in July';


COMMENT ON COLUMN MAM_CO_ALL.MON08_XRATE_REV_FLG IS '８月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in August';


COMMENT ON COLUMN MAM_CO_ALL.MON09_XRATE_REV_FLG IS '９月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in September';


COMMENT ON COLUMN MAM_CO_ALL.MON10_XRATE_REV_FLG IS '１０月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in October';


COMMENT ON COLUMN MAM_CO_ALL.MON11_XRATE_REV_FLG IS '１１月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in November';


COMMENT ON COLUMN MAM_CO_ALL.MON12_XRATE_REV_FLG IS '１２月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in December';


COMMENT ON COLUMN MAM_CO_ALL.SLS_UPRI_REQ_TYP IS '販売単価取得区分 // #MA.SLS_UPRI_REQ_TYP // Sales unit price acquisition type';


COMMENT ON COLUMN MAM_CO_ALL.PURC_UPRI_REQ_TYP IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN MAM_CO_ALL.OUTSRC_UPRI_TYP IS '外注単価区分 // #MA.OUTSRC_UPRI_TYP // Subcontracting unit price type';


COMMENT ON COLUMN MAM_CO_ALL.SLS_BASIS_TYP IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN MAM_CO_ALL.BILL_BASIS_TYP IS '請求起算区分 // #MA.BILL_BASIS_TYP // Billing initial base type';


COMMENT ON COLUMN MAM_CO_ALL.SHIP_SCHD_SPLIT_TYP IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN MAM_CO_ALL.XFR_STK_MNG_TYP IS '積送在庫管轄先区分 // #MA.XFR_STK_MNG_TYP // In-transit inventory controlled site type';


COMMENT ON COLUMN MAM_CO_ALL.SETOFF_TAX_RND_TYP IS '相殺税額端数処理区分 // #MA.RND_TYP // Offset tax rounding type';


COMMENT ON COLUMN MAM_CO_ALL.XRATE_RND_TYP IS '為替端数処理区分 // #MA.RND_TYP // Exchange rounding type';


COMMENT ON COLUMN MAM_CO_ALL.COM_PAID_TAX_RND_TYP IS '支払手数料税額端数処理区分 // #MA.RND_TYP // Rounding type (Payment fee tax)';


COMMENT ON COLUMN MAM_CO_ALL.WTAX_RND_TYP IS '源泉税額端数処理区分 // #MA.RND_TYP // Withholding tax rounding type';


COMMENT ON COLUMN MAM_CO_ALL.STK_AMT_RND_TYP IS '在庫金額端数処理区分 // #MA.RND_TYP // Inventory amount rounding type';


COMMENT ON COLUMN MAM_CO_ALL.STK_AMT_DEC_PLACE IS '在庫金額小数部有効桁数 // #MA.DEC_PLACE // Inventory amount number of decimal places';


COMMENT ON COLUMN MAM_CO_ALL.SLS_BDJ_RND_TYP IS '販売予算単位区分 // #MA.BIG_NUM_RND_TYP // Sales budget unit type';


COMMENT ON COLUMN MAM_CO_ALL.PO_PRINT_CD IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN MAM_CO_ALL.STK_LST_CNF_NUM IS '現品票確認枚数 // #MA.INT4 // Checked number of identification tags';


COMMENT ON COLUMN MAM_CO_ALL.STK_LST_LIMIT_NUM IS '現品票印刷上限枚数 // #MA.INT4 // Maximum number of identification tag printing';


COMMENT ON COLUMN MAM_CO_ALL.GM_STD_UPRI_TYP IS '標準単価取得区分（粗利計算用） // #MA.STD_UPRI_SEL_TYP // Standard unit cost acquisition type (For gross profit calculation)';


COMMENT ON COLUMN MAM_CO_ALL.STK_STD_UPRI_TYP IS '標準単価取得区分（在庫評価用） // #MA.STD_UPRI_SEL_TYP // Standard unit cost acquisition type (For inventory valuation)';


COMMENT ON COLUMN MAM_CO_ALL.AC_SLIP_DIGIT IS '仕訳伝票ＮＯ桁数 // #MA.INT_DIGIT // Journal slip No. digits';


COMMENT ON COLUMN MAM_CO_ALL.AC_SLIP_SEQ_FLG IS '貸借明細番号ＦＬＧ // #MA.FLG // Debit credit details number flg.';


COMMENT ON COLUMN MAM_CO_ALL.CST_PRNT_TYP IS '帳票発行区分（得意先） // #MA.PRNT_TYP // Slip issue type (Customer)';


COMMENT ON COLUMN MAM_CO_ALL.ACST_PRNT_TYP IS '帳票発行区分（売掛先） // #MA.PRNT_TYP // Slip issue type (AR customer)';


COMMENT ON COLUMN MAM_CO_ALL.BCST_PRNT_TYP IS '帳票発行区分（請求先） // #MA.PRNT_TYP // Slip issue type (Billing customer)';


COMMENT ON COLUMN MAM_CO_ALL.RCST_PRNT_TYP IS '帳票発行区分（入金先） // #MA.PRNT_TYP // Slip issue type (Payer)';


COMMENT ON COLUMN MAM_CO_ALL.SPPL_PRNT_TYP IS '帳票発行区分（発注先） // #MA.PRNT_TYP // Slip issue type (Supplier)';


COMMENT ON COLUMN MAM_CO_ALL.ASPPL_PRNT_TYP IS '帳票発行区分（買掛先） // #MA.PRNT_TYP // Slip issue type (AP supplier)';


COMMENT ON COLUMN MAM_CO_ALL.BSPPL_PRNT_TYP IS '帳票発行区分（支払予定管理先） // #MA.PRNT_TYP // Slip issue type (Scheduled payee)';


COMMENT ON COLUMN MAM_CO_ALL.PSPPL_PRNT_TYP IS '帳票発行区分（支払先） // #MA.PRNT_TYP // Slip issue type (Payee)';


COMMENT ON COLUMN MAM_CO_ALL.DLV_PRNT_TYP IS '帳票発行区分（納品先） // #MA.PRNT_TYP // Slip issue type (Delivery destination)';


COMMENT ON COLUMN MAM_CO_ALL.RPT_STRG_EXT_SYS_CD IS '帳票保存システムＣＤ // #MA.EXT_SYS_CD // Report storage external system cd.';


COMMENT ON COLUMN MAM_CO_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_CO_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_CO_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_CO_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_CO_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_CO_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_CO_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_CO_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_CO_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_CO_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_CO_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_CO_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_CO_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_CO_ALL.EARLY_SHIP_DT_ADD_DAYS IS '最早出荷日加算日数 // #MA.DAYS // Number of days added to earliest shipping date';

