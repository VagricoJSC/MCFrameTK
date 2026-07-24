\encoding UTF-8

COMMENT ON TABLE mst_bill_recv_if_all IS '請求受信ＩＦ // Billing import IF';


COMMENT ON COLUMN mst_bill_recv_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_bill_recv_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_bill_recv_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_bill_recv_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_bill_recv_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_bill_recv_if_all.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_bill_recv_if_all.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_bill_recv_if_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_bill_recv_if_all.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_cl_dt IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_dt IS '請求日 // #MA.DT // Billing date';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_d_no IS '請求明細ＮＯ // #MA.BILL_D_NO // Billing details No.';


COMMENT ON COLUMN mst_bill_recv_if_all.pre_bill_no IS '先行請求書ＮＯ // #MA.PRE_BILL_NO // Advance invoice No.';


COMMENT ON COLUMN mst_bill_recv_if_all.pre_bill_dt IS '先行請求日 // #MA.DT // Advance billing date';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_st_dt IS '請求期間開始日 // #MA.DT // Billing period start date';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_end_dt IS '請求期間終了日 // #MA.DT // Billing period end date';


COMMENT ON COLUMN mst_bill_recv_if_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_recv_if_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_bill_recv_if_all.wrk_nm IS '案件名 // #MA.WRK_NM // Sales project name';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_cd IS '請求元ＣＤ // #MA.BP_CD // Billing source cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_bill_src_cd IS 'ＩＦ請求元ＣＤ // #MA.IF_EXT_SYS_CD // IF billing source cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_bill_src_nm IS 'ＩＦ請求元名 // #MA.IF_EXT_SYS_NM // IF billing source name';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_ein IS '請求元法人番号 // #MA.EIN // Billing source corporation No.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_biz_co_no IS '請求元事業者ＮＯ // #MA.BIZ_CO_NO // Billing source business No.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_zip_cd IS '請求元郵便番号 // #MA.ZIP_CD // Billing source zip code';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_addr1 IS '請求元住所１ // #MA.ADDR // Billing source address 1';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_addr2 IS '請求元住所２ // #MA.ADDR // Billing source address 2';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_addr3 IS '請求元住所３ // #MA.ADDR // Billing source address 3';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_addr4 IS '請求元住所４ // #MA.ADDR // Billing source address 4';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_dpt IS '請求元部門 // #MA.DPT_NM // Billing source dept.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_src_tel IS '請求元ＴＥＬ // #MA.TEL // Billing source TEL';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_trd_cur_cd IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction currency cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_xrate IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN mst_bill_recv_if_all.last_bill_amt IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN mst_bill_recv_if_all.rcv_amt IS '支払額 // #MA.MONEY // Payment amount';


COMMENT ON COLUMN mst_bill_recv_if_all.sw_amt IS '振替額 // #MA.MONEY // Transfer amount';


COMMENT ON COLUMN mst_bill_recv_if_all.setoff_amt IS '相殺額 // #MA.MONEY // Offset amount';


COMMENT ON COLUMN mst_bill_recv_if_all.bfw_amt IS '差引繰越額 // #MA.MONEY // Variance carry-over amount';


COMMENT ON COLUMN mst_bill_recv_if_all.sls_amt IS '今回買上額 // #MA.MONEY // Current payment amount';


COMMENT ON COLUMN mst_bill_recv_if_all.dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_bill_recv_if_all.ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_bill_recv_if_all.sw_to_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_amt IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate1 IS '税率１ // #MA.TAX_RATE // Tax rate 1';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt1 IS '税率毎買上額１ // #MA.MONEY // Purchase amount 1 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt1 IS '税率毎税額１ // #MA.MONEY // Tax amount per tax rate 1';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt1 IS '税率毎基準通貨税額１ // #MA.MONEY // Tax amount (Base currency) per tax rate 1';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate2 IS '税率２ // #MA.TAX_RATE // Tax rate 2';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt2 IS '税率毎買上額２ // #MA.MONEY // Purchase amount 2 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt2 IS '税率毎税額２ // #MA.MONEY // Tax amount per tax rate 2';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt2 IS '税率毎基準通貨税額２ // #MA.MONEY // Tax amount (Base currency) per tax rate 2';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate3 IS '税率３ // #MA.TAX_RATE // Tax rate 3';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt3 IS '税率毎買上額３ // #MA.MONEY // Purchase amount 3 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt3 IS '税率毎税額３ // #MA.MONEY // Tax amount per tax rate 3';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt3 IS '税率毎基準通貨税額３ // #MA.MONEY // Tax amount (Base currency) per tax rate 3';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate4 IS '税率４ // #MA.TAX_RATE // Tax rate 4';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt4 IS '税率毎買上額４ // #MA.MONEY // Purchase amount 4 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt4 IS '税率毎税額４ // #MA.MONEY // Tax amount per tax rate 4';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt4 IS '税率毎基準通貨税額４ // #MA.MONEY // Tax amount (Base currency) per tax rate 4';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate5 IS '税率５ // #MA.TAX_RATE // Tax rate 5';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt5 IS '税率毎買上額５ // #MA.MONEY // Purchase amount 5 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt5 IS '税率毎税額５ // #MA.MONEY // Tax amount per tax rate 5';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt5 IS '税率毎基準通貨税額５ // #MA.MONEY // Tax amount (Base currency) per tax rate 5';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate6 IS '税率６ // #MA.TAX_RATE // Tax rate 6';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt6 IS '税率毎買上額６ // #MA.MONEY // Purchase amount 6 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt6 IS '税率毎税額６ // #MA.MONEY // Tax amount per tax rate 6';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt6 IS '税率毎基準通貨税額６ // #MA.MONEY // Tax amount (Base currency) per tax rate 6';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate7 IS '税率７ // #MA.TAX_RATE // Tax rate 7';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt7 IS '税率毎買上額７ // #MA.MONEY // Purchase amount 7 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt7 IS '税率毎税額７ // #MA.MONEY // Tax amount per tax rate 7';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt7 IS '税率毎基準通貨税額７ // #MA.MONEY // Tax amount (Base currency) per tax rate 7';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate8 IS '税率８ // #MA.TAX_RATE // Tax rate 8';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt8 IS '税率毎買上額８ // #MA.MONEY // Purchase amount 8 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt8 IS '税率毎税額８ // #MA.MONEY // Tax amount per tax rate 8';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt8 IS '税率毎基準通貨税額８ // #MA.MONEY // Tax amount (Base currency) per tax rate 8';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate9 IS '税率９ // #MA.TAX_RATE // Tax rate 9';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt9 IS '税率毎買上額９ // #MA.MONEY // Purchase amount 9 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt9 IS '税率毎税額９ // #MA.MONEY // Tax amount per tax rate 9';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt9 IS '税率毎基準通貨税額９ // #MA.MONEY // Tax amount (Base currency) per tax rate 9';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate10 IS '税率１０ // #MA.TAX_RATE // Tax rate 10';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_sls_amt10 IS '税率毎買上額１０ // #MA.MONEY // Purchase amount 10 per tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_tax_amt10 IS '税率毎税額１０ // #MA.MONEY // Tax amount per tax rate 10';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate_base_tax_amt10 IS '税率毎基準通貨税額１０ // #MA.MONEY // Tax amount (Base currency) per tax rate 10';


COMMENT ON COLUMN mst_bill_recv_if_all.adv_amt_bal IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN mst_bill_recv_if_all.adv_amt IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN mst_bill_recv_if_all.adv_setoff_amt IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN mst_bill_recv_if_all.adv_setoff_tax_amt IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt1 IS '支払予定日１ // #MA.DT // Scheduled payment date 1';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt1 IS '支払予定額１ // #MA.MONEY // Payment schedule amount 1';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd1 IS '支払方法ＣＤ１ // #MA.STTL_CD // Payment method cd. 1';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd1 IS 'ＩＦ支払方法ＣＤ１ // #MA.IF_EXT_SYS_CD // IF payment method cd. 1';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm1 IS 'ＩＦ支払方法名１ // #MA.IF_EXT_SYS_NM // IF payment method name 1';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt2 IS '支払予定日２ // #MA.DT // Scheduled payment date 2';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt2 IS '支払予定額２ // #MA.MONEY // Payment schedule amount 2';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd2 IS '支払方法ＣＤ２ // #MA.STTL_CD // Payment method cd. 2';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd2 IS 'ＩＦ支払方法ＣＤ２ // #MA.IF_EXT_SYS_CD // IF payment method cd. 2';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm2 IS 'ＩＦ支払方法名２ // #MA.IF_EXT_SYS_NM // IF payment method name 2';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt3 IS '支払予定日３ // #MA.DT // Scheduled payment date 3';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt3 IS '支払予定額３ // #MA.MONEY // Payment schedule amount 3';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd3 IS '支払方法ＣＤ３ // #MA.STTL_CD // Payment method cd. 3';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd3 IS 'ＩＦ支払方法ＣＤ３ // #MA.IF_EXT_SYS_CD // IF payment method cd. 3';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm3 IS 'ＩＦ支払方法名３ // #MA.IF_EXT_SYS_NM // IF payment method name 3';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt4 IS '支払予定日４ // #MA.DT // Scheduled payment date 4';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt4 IS '支払予定額４ // #MA.MONEY // Payment schedule amount 4';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd4 IS '支払方法ＣＤ４ // #MA.STTL_CD // Payment method cd. 4';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd4 IS 'ＩＦ支払方法ＣＤ４ // #MA.IF_EXT_SYS_CD // IF payment method cd. 4';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm4 IS 'ＩＦ支払方法名４ // #MA.IF_EXT_SYS_NM // IF payment method name 4';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt5 IS '支払予定日５ // #MA.DT // Scheduled payment date 5';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt5 IS '支払予定額５ // #MA.MONEY // Payment schedule amount 5';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd5 IS '支払方法ＣＤ５ // #MA.STTL_CD // Payment method cd. 5';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd5 IS 'ＩＦ支払方法ＣＤ５ // #MA.IF_EXT_SYS_CD // IF payment method cd. 5';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm5 IS 'ＩＦ支払方法名５ // #MA.IF_EXT_SYS_NM // IF payment method name 5';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt6 IS '支払予定日６ // #MA.DT // Scheduled payment date 6';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt6 IS '支払予定額６ // #MA.MONEY // Payment schedule amount 6';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd6 IS '支払方法ＣＤ６ // #MA.STTL_CD // Payment method cd. 6';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd6 IS 'ＩＦ支払方法ＣＤ６ // #MA.IF_EXT_SYS_CD // IF payment method cd. 6';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm6 IS 'ＩＦ支払方法名６ // #MA.IF_EXT_SYS_NM // IF payment method name 6';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt7 IS '支払予定日７ // #MA.DT // Scheduled payment date 7';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt7 IS '支払予定額７ // #MA.MONEY // Payment schedule amount 7';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd7 IS '支払方法ＣＤ７ // #MA.STTL_CD // Payment method cd. 7';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd7 IS 'ＩＦ支払方法ＣＤ７ // #MA.IF_EXT_SYS_CD // IF payment method cd. 7';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm7 IS 'ＩＦ支払方法名７ // #MA.IF_EXT_SYS_NM // IF payment method name 7';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt8 IS '支払予定日８ // #MA.DT // Scheduled payment date 8';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt8 IS '支払予定額８ // #MA.MONEY // Payment schedule amount 8';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd8 IS '支払方法ＣＤ８ // #MA.STTL_CD // Payment method cd. 8';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd8 IS 'ＩＦ支払方法ＣＤ８ // #MA.IF_EXT_SYS_CD // IF payment method cd. 8';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm8 IS 'ＩＦ支払方法名８ // #MA.IF_EXT_SYS_NM // IF payment method name 8';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt9 IS '支払予定日９ // #MA.DT // Scheduled payment date 9';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt9 IS '支払予定額９ // #MA.MONEY // Payment schedule amount 9';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd9 IS '支払方法ＣＤ９ // #MA.STTL_CD // Payment method cd. 9';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd9 IS 'ＩＦ支払方法ＣＤ９ // #MA.IF_EXT_SYS_CD // IF payment method cd. 9';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm9 IS 'ＩＦ支払方法名９ // #MA.IF_EXT_SYS_NM // IF payment method name 9';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_dt10 IS '支払予定日１０ // #MA.DT // Scheduled payment date 10';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_schd_amt10 IS '支払予定額１０ // #MA.MONEY // Payment schedule amount 10';


COMMENT ON COLUMN mst_bill_recv_if_all.pay_mtd_cd10 IS '支払方法ＣＤ１０ // #MA.STTL_CD // Payment method cd. 10';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_cd10 IS 'ＩＦ支払方法ＣＤ１０ // #MA.IF_EXT_SYS_CD // IF payment method cd. 10';


COMMENT ON COLUMN mst_bill_recv_if_all.if_pay_mtd_nm10 IS 'ＩＦ支払方法名１０ // #MA.IF_EXT_SYS_NM // IF payment method name 10';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_bank_ac_cd IS 'ＩＦ口座ＣＤ // #MA.IF_EXT_SYS_CD // IF bank account cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_ac_typ IS '口座区分 // #MA.BANK_AC_TYP // Bank account type';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_ac_no IS '口座番号 // #MA.BANK_AC_NO // Bank account number';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_ac_holder IS '口座名義 // #MA.BANK_AC_HOLDER // Bank account holder';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_ac_holder_sub IS '口座名義別名 // #MA.BANK_AC_HOLDER_SUB // Account holder alias name';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_cd IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.bank_nm IS '銀行名 // #MA.BANK_NM // Bank name';


COMMENT ON COLUMN mst_bill_recv_if_all.branch_cd IS '支店ＣＤ // #MA.BANK_BRANCH_CD // Branch cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.branch_nm IS '支店名 // #MA.BANK_BRANCH_NM // Branch name';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_trd_nm IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_bill_recv_if_all.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_bill_recv_if_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_bill_recv_if_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_bill_recv_if_all.ship_dlv_slip_no IS '出荷時納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No. at shipping';


COMMENT ON COLUMN mst_bill_recv_if_all.ship_dlv_slip_d_no IS '出荷時納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No. at shipping';


COMMENT ON COLUMN mst_bill_recv_if_all.act_no IS 'ヘッダ実績ＮＯ // #MA.ACT_NO // Header result No.';


COMMENT ON COLUMN mst_bill_recv_if_all.act_rev IS 'ヘッダ実績改訂番号 // #MA.SLIP_REV // Header result rev. number';


COMMENT ON COLUMN mst_bill_recv_if_all.act_d_no IS '明細実績ＮＯ // #MA.ACT_D_NO // Details result No.';


COMMENT ON COLUMN mst_bill_recv_if_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_bill_recv_if_all.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_bill_recv_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_bill_recv_if_all.dlv_dt IS '納品日 // #MA.DT // Delivery date';


COMMENT ON COLUMN mst_bill_recv_if_all.rcv_dt IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_basis_dt IS '請求起算日 // #MA.DT // Billing base date';


COMMENT ON COLUMN mst_bill_recv_if_all.base_ac_dt IS '計上日（基） // #MA.DT // Recording date (Base)';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_bill_recv_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_bill_recv_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_bill_recv_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_bill_recv_if_all.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_alt_nm1 IS '品目別名１ // #MA.ITM_ALT_NM1 // Item alias name 1';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_alt_nm2 IS '品目別名２ // #MA.ITM_ALT_NM2 // Item alias name 2';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_alt_nm3 IS '品目別名３ // #MA.ITM_ALT_NM3 // Item alias name 3';


COMMENT ON COLUMN mst_bill_recv_if_all.itm_alt_nm4 IS '品目別名４ // #MA.ITM_ALT_NM4 // Item alias name 4';


COMMENT ON COLUMN mst_bill_recv_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_bill_recv_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_bill_recv_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_bill_recv_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_trd_unit_nm IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_bill_recv_if_all.interim_flg IS '仮単価ＦＬＧ // #MA.FLG // Temporary unit price flg.';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cur_dscnt_amt IS '取引通貨値引額 // #MA.MONEY // Discount amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_cd IS '税ＣＤ // #MA.TAX_CD // Tax cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_tax_cd IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_tax_nm IS 'ＩＦ税名 // #MA.IF_EXT_SYS_NM // IF tax name';


COMMENT ON COLUMN mst_bill_recv_if_all.tax_rate IS '税率 // #MA.TAX_RATE // Tax rate';


COMMENT ON COLUMN mst_bill_recv_if_all.inc_tax_flg IS '内税ＦＬＧ // #MA.FLG // Tax inclusive flg.';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mst_bill_recv_if_all.trd_d_rmrks IS '明細備考 // #MA.TRD_D_RMRKS // Details remarks';


COMMENT ON COLUMN mst_bill_recv_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_bill_recv_if_all.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_bcst_nm IS '請求書宛先 // #MA.BILL_BCST_NM // Invoice destination';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_ein IS '請求書送付法人番号 // #MA.EIN // Invoice send-to corporation No.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_biz_co_no IS '請求書送付事業者ＮＯ // #MA.BIZ_CO_NO // Invoice send-to business No.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_zip_cd IS '請求書送付郵便番号 // #MA.ZIP_CD // Invoice send-to zip code';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_addr1 IS '請求書送付住所１ // #MA.ADDR // Invoice send-to address 1';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_addr2 IS '請求書送付住所２ // #MA.ADDR // Invoice send-to address 2';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_addr3 IS '請求書送付住所３ // #MA.ADDR // Invoice send-to address 3';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_addr4 IS '請求書送付住所４ // #MA.ADDR // Invoice send-to address 4';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_bcst_dpt IS '請求書送付部署 // #MA.BP_CNTCT_DPT // Invoice send-to dept.';


COMMENT ON COLUMN mst_bill_recv_if_all.bill_tel IS '請求書送付ＴＥＬ // #MA.TEL // Invoice send-to TEL';


COMMENT ON COLUMN mst_bill_recv_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_bill_recv_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_bill_recv_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_bill_recv_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_bill_recv_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_recv_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_recv_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_recv_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_recv_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

