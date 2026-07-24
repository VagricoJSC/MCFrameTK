\encoding UTF-8

COMMENT ON VIEW mam_co IS '会社マスタ // Company master';


COMMENT ON COLUMN mam_co.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_co.co_alt_nm1 IS '会社別名１ // #MA.CO_ALT_NM1 // Company alias 1';


COMMENT ON COLUMN mam_co.base_co_alt_nm1 IS '会社別名１（ベース） // #MA.CO_ALT_NM1 // Company alias 1(Base)';


COMMENT ON COLUMN mam_co.co_alt_nm2 IS '会社別名２ // #MA.CO_ALT_NM2 // Company alias 2';


COMMENT ON COLUMN mam_co.base_co_alt_nm2 IS '会社別名２（ベース） // #MA.CO_ALT_NM2 // Company alias 2(Base)';


COMMENT ON COLUMN mam_co.co_alt_nm3 IS '会社別名３ // #MA.CO_ALT_NM3 // Company alias 3';


COMMENT ON COLUMN mam_co.base_co_alt_nm3 IS '会社別名３（ベース） // #MA.CO_ALT_NM3 // Company alias 3(Base)';


COMMENT ON COLUMN mam_co.co_alt_nm4 IS '会社別名４ // #MA.CO_ALT_NM4 // Company alias 4';


COMMENT ON COLUMN mam_co.base_co_alt_nm4 IS '会社別名４（ベース） // #MA.CO_ALT_NM4 // Company alias 4(Base)';


COMMENT ON COLUMN mam_co.zip_cd IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN mam_co.base_zip_cd IS '郵便番号（ベース） // #MA.ZIP_CD // Zip code(Base)';


COMMENT ON COLUMN mam_co.addr1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN mam_co.base_addr1 IS '住所１（ベース） // #MA.ADDR1 // Address 1(Base)';


COMMENT ON COLUMN mam_co.addr2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN mam_co.base_addr2 IS '住所２（ベース） // #MA.ADDR2 // Address 2(Base)';


COMMENT ON COLUMN mam_co.addr3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN mam_co.base_addr3 IS '住所３（ベース） // #MA.ADDR3 // Address 3(Base)';


COMMENT ON COLUMN mam_co.addr4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN mam_co.base_addr4 IS '住所４（ベース） // #MA.ADDR4 // Address 4(Base)';


COMMENT ON COLUMN mam_co.tel IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN mam_co.base_tel IS 'ＴＥＬ（ベース） // #MA.TEL // TEL(Base)';


COMMENT ON COLUMN mam_co.fax IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN mam_co.base_fax IS 'ＦＡＸ（ベース） // #MA.TEL // FAX(Base)';


COMMENT ON COLUMN mam_co.co_repl_nm IS '代表者名 // #MA.CO_REPL_NM // Representative name';


COMMENT ON COLUMN mam_co.base_co_repl_nm IS '代表者名（ベース） // #MA.CO_REPL_NM // Representative name(Base)';


COMMENT ON COLUMN mam_co.ein IS '法人番号 // #MA.EIN // Corporation number';


COMMENT ON COLUMN mam_co.biz_co_no IS '事業者ＮＯ // #MA.BIZ_CO_NO // Business No.';


COMMENT ON COLUMN mam_co.std_co_cd IS '標準企業コード // #MA.STD_CO_CD // Standard company code';


COMMENT ON COLUMN mam_co.cntry_cd IS '国ＣＤ // #MA.CNTRY_CD // Country cd.';


COMMENT ON COLUMN mam_co.area_cd IS '地域ＣＤ // #MA.AREA_CD // Region cd.';


COMMENT ON COLUMN mam_co.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mam_co.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mam_co.st_mon IS '期首年月 // #MA.MON // Beginning year';


COMMENT ON COLUMN mam_co.ac_cl_day IS '会計締日 // #MA.CL_DAY // Accounting closing day';


COMMENT ON COLUMN mam_co.ac_cl_mon_base IS '会計月度基準 // #MA.CL_MON_BASE // Accounting month basis';


COMMENT ON COLUMN mam_co.dt_switch_time IS '日付切替時間 // #MA.INT2 // Date switching time';


COMMENT ON COLUMN mam_co.ar_no_use_flg IS '債権不使用ＦＬＧ // #MA.FLG // AR not use flg.';


COMMENT ON COLUMN mam_co.ap_no_use_flg IS '債務不使用ＦＬＧ // #MA.FLG // AP not used flg.';


COMMENT ON COLUMN mam_co.temp_ap_use_flg IS '暫定買掛使用ＦＬＧ // #MA.FLG // Temporary AP use flg.';


COMMENT ON COLUMN mam_co.std_cal_cd IS '標準カレンダＣＤ // #MA.CAL_CD // Standard calendar cd.';


COMMENT ON COLUMN mam_co.bill_cl_cal_cd IS '請求締カレンダＣＤ // #MA.CAL_CD // Billing closing calendar cd.';


COMMENT ON COLUMN mam_co.pay_schd_cl_cal_cd IS '支払予定締カレンダＣＤ // #MA.CAL_CD // Payment schedule closing calendar cd.';


COMMENT ON COLUMN mam_co.sls_cl_flg IS '売上締ＦＬＧ // #MA.FLG // Sales closing flg.';


COMMENT ON COLUMN mam_co.rcv_cl_flg IS '入金締ＦＬＧ // #MA.FLG // Payment received closing flg.';


COMMENT ON COLUMN mam_co.purc_cl_flg IS '仕入締ＦＬＧ // #MA.FLG // Purchase closing flg.';


COMMENT ON COLUMN mam_co.pay_cl_flg IS '支払締ＦＬＧ // #MA.FLG // Payment closing flg.';


COMMENT ON COLUMN mam_co.sls_cl_cal_cd IS '売上締カレンダＣＤ // #MA.CAL_CD // Sales closing calendar cd.';


COMMENT ON COLUMN mam_co.rcv_cl_cal_cd IS '入金締カレンダＣＤ // #MA.CAL_CD // Payment received closing calendar cd.';


COMMENT ON COLUMN mam_co.purc_cl_cal_cd IS '仕入締カレンダＣＤ // #MA.CAL_CD // Purchase closing calendar cd.';


COMMENT ON COLUMN mam_co.pay_cl_cal_cd IS '支払締カレンダＣＤ // #MA.CAL_CD // Payment closing calendar cd.';


COMMENT ON COLUMN mam_co.stk_cl_cal_cd IS '在庫締カレンダＣＤ // #MA.CAL_CD // Inventory closing calendar cd.';


COMMENT ON COLUMN mam_co.sls_cl_delay_days IS '売上締日遅延日数 // #MA.DELAY_DAYS // Delay days (Sales closing day)';


COMMENT ON COLUMN mam_co.sls_cl_ba_typ IS '売上締日前後区分 // #MA.BA_TYP // Sales closing day before/after type';


COMMENT ON COLUMN mam_co.rcv_cl_delay_days IS '入金締日遅延日数 // #MA.DELAY_DAYS // Delayed days (Payment received closing day)';


COMMENT ON COLUMN mam_co.rcv_cl_ba_typ IS '入金締日前後区分 // #MA.BA_TYP // Payment received closing day before/after type';


COMMENT ON COLUMN mam_co.purc_cl_delay_days IS '仕入締日遅延日数 // #MA.DELAY_DAYS // Delay days (Purchase closing day)';


COMMENT ON COLUMN mam_co.purc_cl_ba_typ IS '仕入締日前後区分 // #MA.BA_TYP // Purchase closing day before/after type';


COMMENT ON COLUMN mam_co.pay_cl_delay_days IS '支払締日遅延日数 // #MA.DELAY_DAYS // Delay days (Payment closing day)';


COMMENT ON COLUMN mam_co.pay_cl_ba_typ IS '支払締日前後区分 // #MA.BA_TYP // Payment closing day before/after type';


COMMENT ON COLUMN mam_co.stk_cl_delay_days IS '在庫締日遅延日数 // #MA.DELAY_DAYS // Delay days (Inventory closing day)';


COMMENT ON COLUMN mam_co.stk_cl_ba_typ IS '在庫締日前後区分 // #MA.BA_TYP // Inventory closing day before/after type';


COMMENT ON COLUMN mam_co.sls_xrate_cd IS '売上為替レートＣＤ // #MA.XRATE_CD // Sales exchange rate cd.';


COMMENT ON COLUMN mam_co.purc_xrate_cd IS '仕入為替レートＣＤ // #MA.XRATE_CD // Purchase exchange rate cd.';


COMMENT ON COLUMN mam_co.prov_xrate_cd IS '支給為替レートＣＤ // #MA.XRATE_CD // Supply exchange rate cd.';


COMMENT ON COLUMN mam_co.bill_xrate_conv_flg IS '請求時為替レート換算ＦＬＧ // #MA.FLG // Convert at exchange rate upon billing flg.';


COMMENT ON COLUMN mam_co.bill_xrate_cd IS '請求為替レートＣＤ // #MA.XRATE_CD // Billing exchange rate cd.';


COMMENT ON COLUMN mam_co.pay_xrate_conv_flg IS '支払照合時為替レート換算ＦＬＧ // #MA.FLG // Convert at exchange rate upon payment collation flg.';


COMMENT ON COLUMN mam_co.pay_xrate_cd IS '支払照合為替レートＣＤ // #MA.XRATE_CD // Payment collation exchange rate cd.';


COMMENT ON COLUMN mam_co.mon01_xrate_rev_flg IS '１月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in January';


COMMENT ON COLUMN mam_co.mon02_xrate_rev_flg IS '２月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in February';


COMMENT ON COLUMN mam_co.mon03_xrate_rev_flg IS '３月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in March';


COMMENT ON COLUMN mam_co.mon04_xrate_rev_flg IS '４月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in April';


COMMENT ON COLUMN mam_co.mon05_xrate_rev_flg IS '５月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in May';


COMMENT ON COLUMN mam_co.mon06_xrate_rev_flg IS '６月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in June';


COMMENT ON COLUMN mam_co.mon07_xrate_rev_flg IS '７月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in July';


COMMENT ON COLUMN mam_co.mon08_xrate_rev_flg IS '８月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in August';


COMMENT ON COLUMN mam_co.mon09_xrate_rev_flg IS '９月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in September';


COMMENT ON COLUMN mam_co.mon10_xrate_rev_flg IS '１０月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in October';


COMMENT ON COLUMN mam_co.mon11_xrate_rev_flg IS '１１月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in November';


COMMENT ON COLUMN mam_co.mon12_xrate_rev_flg IS '１２月為替レート評価替ＦＬＧ // #MA.FLG // Exchange rate revaluation flg. in December';


COMMENT ON COLUMN mam_co.sls_upri_req_typ IS '販売単価取得区分 // #MA.SLS_UPRI_REQ_TYP // Sales unit price acquisition type';


COMMENT ON COLUMN mam_co.purc_upri_req_typ IS '購買単価取得区分 // #MA.PURC_UPRI_REQ_TYP // Purchase unit price acquisition type';


COMMENT ON COLUMN mam_co.outsrc_upri_typ IS '外注単価区分 // #MA.OUTSRC_UPRI_TYP // Subcontracting unit price type';


COMMENT ON COLUMN mam_co.sls_basis_typ IS '売上計上区分 // #MA.SLS_BASIS_TYP // Revenue recording type';


COMMENT ON COLUMN mam_co.bill_basis_typ IS '請求起算区分 // #MA.BILL_BASIS_TYP // Billing initial base type';


COMMENT ON COLUMN mam_co.ship_schd_split_typ IS '出荷予定分割区分 // #MA.SHIP_SCHD_SPLIT_TYP // Shipping schedule split type';


COMMENT ON COLUMN mam_co.xfr_stk_mng_typ IS '積送在庫管轄先区分 // #MA.XFR_STK_MNG_TYP // In-transit inventory controlled site type';


COMMENT ON COLUMN mam_co.setoff_tax_rnd_typ IS '相殺税額端数処理区分 // #MA.RND_TYP // Offset tax rounding type';


COMMENT ON COLUMN mam_co.xrate_rnd_typ IS '為替端数処理区分 // #MA.RND_TYP // Exchange rounding type';


COMMENT ON COLUMN mam_co.com_paid_tax_rnd_typ IS '支払手数料税額端数処理区分 // #MA.RND_TYP // Rounding type (Payment fee tax)';


COMMENT ON COLUMN mam_co.wtax_rnd_typ IS '源泉税額端数処理区分 // #MA.RND_TYP // Withholding tax rounding type';


COMMENT ON COLUMN mam_co.stk_amt_rnd_typ IS '在庫金額端数処理区分 // #MA.RND_TYP // Inventory amount rounding type';


COMMENT ON COLUMN mam_co.stk_amt_dec_place IS '在庫金額小数部有効桁数 // #MA.DEC_PLACE // Inventory amount number of decimal places';


COMMENT ON COLUMN mam_co.sls_bdj_rnd_typ IS '販売予算単位区分 // #MA.BIG_NUM_RND_TYP // Sales budget unit type';


COMMENT ON COLUMN mam_co.po_print_cd IS '注文書表示ＣＤ // #MA.PO_PRINT_CD // Display PO sheet cd.';


COMMENT ON COLUMN mam_co.stk_lst_cnf_num IS '現品票確認枚数 // #MA.INT4 // Checked number of identification tags';


COMMENT ON COLUMN mam_co.stk_lst_limit_num IS '現品票印刷上限枚数 // #MA.INT4 // Maximum number of identification tag printing';


COMMENT ON COLUMN mam_co.gm_std_upri_typ IS '標準単価取得区分（粗利計算用） // #MA.STD_UPRI_SEL_TYP // Standard unit cost acquisition type (For gross profit calculation)';


COMMENT ON COLUMN mam_co.stk_std_upri_typ IS '標準単価取得区分（在庫評価用） // #MA.STD_UPRI_SEL_TYP // Standard unit cost acquisition type (For inventory valuation)';


COMMENT ON COLUMN mam_co.ac_slip_digit IS '仕訳伝票ＮＯ桁数 // #MA.INT_DIGIT // Journal slip No. digits';


COMMENT ON COLUMN mam_co.ac_slip_seq_flg IS '貸借明細番号ＦＬＧ // #MA.FLG // Debit credit details number flg.';


COMMENT ON COLUMN mam_co.cst_prnt_typ IS '帳票発行区分（得意先） // #MA.PRNT_TYP // Slip issue type (Customer)';


COMMENT ON COLUMN mam_co.acst_prnt_typ IS '帳票発行区分（売掛先） // #MA.PRNT_TYP // Slip issue type (AR customer)';


COMMENT ON COLUMN mam_co.bcst_prnt_typ IS '帳票発行区分（請求先） // #MA.PRNT_TYP // Slip issue type (Billing customer)';


COMMENT ON COLUMN mam_co.rcst_prnt_typ IS '帳票発行区分（入金先） // #MA.PRNT_TYP // Slip issue type (Payer)';


COMMENT ON COLUMN mam_co.sppl_prnt_typ IS '帳票発行区分（発注先） // #MA.PRNT_TYP // Slip issue type (Supplier)';


COMMENT ON COLUMN mam_co.asppl_prnt_typ IS '帳票発行区分（買掛先） // #MA.PRNT_TYP // Slip issue type (AP supplier)';


COMMENT ON COLUMN mam_co.bsppl_prnt_typ IS '帳票発行区分（支払予定管理先） // #MA.PRNT_TYP // Slip issue type (Scheduled payee)';


COMMENT ON COLUMN mam_co.psppl_prnt_typ IS '帳票発行区分（支払先） // #MA.PRNT_TYP // Slip issue type (Payee)';


COMMENT ON COLUMN mam_co.dlv_prnt_typ IS '帳票発行区分（納品先） // #MA.PRNT_TYP // Slip issue type (Delivery destination)';


COMMENT ON COLUMN mam_co.rpt_strg_ext_sys_cd IS '帳票保存システムＣＤ // #MA.EXT_SYS_CD // Report storage external system cd.';


COMMENT ON COLUMN mam_co.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_co.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_co.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_co.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_co.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_co.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_co.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_co.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_co.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_co.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_co.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_co.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_co.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_co.early_ship_dt_add_days IS '最早出荷日加算日数 // #MA.DAYS // Number of days added to earliest shipping date';

