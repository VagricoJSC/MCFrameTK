\encoding UTF-8

COMMENT ON TABLE mst_bill_rcpt_all IS '請求受領ヘッダ // Billing receipt header';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_rcpt_no IS '請求受領ＮＯ // #MA.BILL_RCPT_NO // Billing receipt No.';


COMMENT ON COLUMN mst_bill_rcpt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_rcpt_all.invalid_flg IS '無効ＦＬＧ // #MA.FLG // Invalid flg.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_cl_dt IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_dt IS '請求日 // #MA.DT // Billing date';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_rcpt_all.pre_bill_no IS '先行請求書ＮＯ // #MA.PRE_BILL_NO // Advance invoice No.';


COMMENT ON COLUMN mst_bill_rcpt_all.pre_bill_dt IS '先行請求日 // #MA.DT // Advance billing date';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_st_dt IS '請求期間開始日 // #MA.DT // Billing period start date';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_end_dt IS '請求期間終了日 // #MA.DT // Billing period end date';


COMMENT ON COLUMN mst_bill_rcpt_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_rcpt_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_bill_rcpt_all.wrk_nm IS '案件名 // #MA.WRK_NM // Sales project name';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_cd IS '請求元ＣＤ // #MA.BP_CD // Billing source cd.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_ein IS '請求元法人番号 // #MA.EIN // Billing source corporation No.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_biz_co_no IS '請求元事業者ＮＯ // #MA.BIZ_CO_NO // Billing source business No.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_zip_cd IS '請求元郵便番号 // #MA.ZIP_CD // Billing source zip code';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_addr1 IS '請求元住所１ // #MA.ADDR // Billing source address 1';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_addr2 IS '請求元住所２ // #MA.ADDR // Billing source address 2';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_addr3 IS '請求元住所３ // #MA.ADDR // Billing source address 3';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_addr4 IS '請求元住所４ // #MA.ADDR // Billing source address 4';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_dpt IS '請求元部門 // #MA.DPT_NM // Billing source dept.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_src_tel IS '請求元ＴＥＬ // #MA.TEL // Billing source TEL';


COMMENT ON COLUMN mst_bill_rcpt_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_xrate IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN mst_bill_rcpt_all.last_bill_amt IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN mst_bill_rcpt_all.rcv_amt IS '支払額 // #MA.MONEY // Payment amount';


COMMENT ON COLUMN mst_bill_rcpt_all.sw_amt IS '振替額 // #MA.MONEY // Transfer amount';


COMMENT ON COLUMN mst_bill_rcpt_all.setoff_amt IS '相殺額 // #MA.MONEY // Offset amount';


COMMENT ON COLUMN mst_bill_rcpt_all.bfw_amt IS '差引繰越額 // #MA.MONEY // Variance carry-over amount';


COMMENT ON COLUMN mst_bill_rcpt_all.sls_amt IS '今回買上額 // #MA.MONEY // Current payment amount';


COMMENT ON COLUMN mst_bill_rcpt_all.dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_bill_rcpt_all.ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_bill_rcpt_all.sw_to_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_amt IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate1 IS '税率１ // #MA.TAX_RATE // Tax rate 1';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt1 IS '税率毎買上額１ // #MA.MONEY // Purchase amount 1 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt1 IS '税率毎税額１ // #MA.MONEY // Tax amount per tax rate 1';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt1 IS '税率毎基準通貨税額１ // #MA.MONEY // Tax amount (Base currency) per tax rate 1';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate2 IS '税率２ // #MA.TAX_RATE // Tax rate 2';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt2 IS '税率毎買上額２ // #MA.MONEY // Purchase amount 2 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt2 IS '税率毎税額２ // #MA.MONEY // Tax amount per tax rate 2';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt2 IS '税率毎基準通貨税額２ // #MA.MONEY // Tax amount (Base currency) per tax rate 2';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate3 IS '税率３ // #MA.TAX_RATE // Tax rate 3';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt3 IS '税率毎買上額３ // #MA.MONEY // Purchase amount 3 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt3 IS '税率毎税額３ // #MA.MONEY // Tax amount per tax rate 3';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt3 IS '税率毎基準通貨税額３ // #MA.MONEY // Tax amount (Base currency) per tax rate 3';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate4 IS '税率４ // #MA.TAX_RATE // Tax rate 4';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt4 IS '税率毎買上額４ // #MA.MONEY // Purchase amount 4 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt4 IS '税率毎税額４ // #MA.MONEY // Tax amount per tax rate 4';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt4 IS '税率毎基準通貨税額４ // #MA.MONEY // Tax amount (Base currency) per tax rate 4';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate5 IS '税率５ // #MA.TAX_RATE // Tax rate 5';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt5 IS '税率毎買上額５ // #MA.MONEY // Purchase amount 5 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt5 IS '税率毎税額５ // #MA.MONEY // Tax amount per tax rate 5';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt5 IS '税率毎基準通貨税額５ // #MA.MONEY // Tax amount (Base currency) per tax rate 5';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate6 IS '税率６ // #MA.TAX_RATE // Tax rate 6';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt6 IS '税率毎買上額６ // #MA.MONEY // Purchase amount 6 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt6 IS '税率毎税額６ // #MA.MONEY // Tax amount per tax rate 6';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt6 IS '税率毎基準通貨税額６ // #MA.MONEY // Tax amount (Base currency) per tax rate 6';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate7 IS '税率７ // #MA.TAX_RATE // Tax rate 7';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt7 IS '税率毎買上額７ // #MA.MONEY // Purchase amount 7 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt7 IS '税率毎税額７ // #MA.MONEY // Tax amount per tax rate 7';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt7 IS '税率毎基準通貨税額７ // #MA.MONEY // Tax amount (Base currency) per tax rate 7';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate8 IS '税率８ // #MA.TAX_RATE // Tax rate 8';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt8 IS '税率毎買上額８ // #MA.MONEY // Purchase amount 8 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt8 IS '税率毎税額８ // #MA.MONEY // Tax amount per tax rate 8';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt8 IS '税率毎基準通貨税額８ // #MA.MONEY // Tax amount (Base currency) per tax rate 8';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate9 IS '税率９ // #MA.TAX_RATE // Tax rate 9';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt9 IS '税率毎買上額９ // #MA.MONEY // Purchase amount 9 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt9 IS '税率毎税額９ // #MA.MONEY // Tax amount per tax rate 9';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt9 IS '税率毎基準通貨税額９ // #MA.MONEY // Tax amount (Base currency) per tax rate 9';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate10 IS '税率１０ // #MA.TAX_RATE // Tax rate 10';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_sls_amt10 IS '税率毎買上額１０ // #MA.MONEY // Purchase amount 10 per tax rate';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_tax_amt10 IS '税率毎税額１０ // #MA.MONEY // Tax amount per tax rate 10';


COMMENT ON COLUMN mst_bill_rcpt_all.tax_rate_base_tax_amt10 IS '税率毎基準通貨税額１０ // #MA.MONEY // Tax amount (Base currency) per tax rate 10';


COMMENT ON COLUMN mst_bill_rcpt_all.adv_amt_bal IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN mst_bill_rcpt_all.adv_amt IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN mst_bill_rcpt_all.adv_setoff_amt IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN mst_bill_rcpt_all.adv_setoff_tax_amt IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt1 IS '支払予定日１ // #MA.DT // Scheduled payment date 1';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt1 IS '支払予定額１ // #MA.MONEY // Payment schedule amount 1';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd1 IS '支払方法ＣＤ１ // #MA.STTL_CD // Payment method cd. 1';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt2 IS '支払予定日２ // #MA.DT // Scheduled payment date 2';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt2 IS '支払予定額２ // #MA.MONEY // Payment schedule amount 2';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd2 IS '支払方法ＣＤ２ // #MA.STTL_CD // Payment method cd. 2';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt3 IS '支払予定日３ // #MA.DT // Scheduled payment date 3';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt3 IS '支払予定額３ // #MA.MONEY // Payment schedule amount 3';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd3 IS '支払方法ＣＤ３ // #MA.STTL_CD // Payment method cd. 3';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt4 IS '支払予定日４ // #MA.DT // Scheduled payment date 4';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt4 IS '支払予定額４ // #MA.MONEY // Payment schedule amount 4';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd4 IS '支払方法ＣＤ４ // #MA.STTL_CD // Payment method cd. 4';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt5 IS '支払予定日５ // #MA.DT // Scheduled payment date 5';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt5 IS '支払予定額５ // #MA.MONEY // Payment schedule amount 5';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd5 IS '支払方法ＣＤ５ // #MA.STTL_CD // Payment method cd. 5';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt6 IS '支払予定日６ // #MA.DT // Scheduled payment date 6';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt6 IS '支払予定額６ // #MA.MONEY // Payment schedule amount 6';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd6 IS '支払方法ＣＤ６ // #MA.STTL_CD // Payment method cd. 6';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt7 IS '支払予定日７ // #MA.DT // Scheduled payment date 7';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt7 IS '支払予定額７ // #MA.MONEY // Payment schedule amount 7';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd7 IS '支払方法ＣＤ７ // #MA.STTL_CD // Payment method cd. 7';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt8 IS '支払予定日８ // #MA.DT // Scheduled payment date 8';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt8 IS '支払予定額８ // #MA.MONEY // Payment schedule amount 8';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd8 IS '支払方法ＣＤ８ // #MA.STTL_CD // Payment method cd. 8';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt9 IS '支払予定日９ // #MA.DT // Scheduled payment date 9';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt9 IS '支払予定額９ // #MA.MONEY // Payment schedule amount 9';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd9 IS '支払方法ＣＤ９ // #MA.STTL_CD // Payment method cd. 9';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_dt10 IS '支払予定日１０ // #MA.DT // Scheduled payment date 10';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_schd_amt10 IS '支払予定額１０ // #MA.MONEY // Payment schedule amount 10';


COMMENT ON COLUMN mst_bill_rcpt_all.pay_mtd_cd10 IS '支払方法ＣＤ１０ // #MA.STTL_CD // Payment method cd. 10';


COMMENT ON COLUMN mst_bill_rcpt_all.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_bcst_nm IS '請求書宛先 // #MA.BILL_BCST_NM // Invoice destination';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_ein IS '請求書送付法人番号 // #MA.EIN // Invoice send-to corporation No.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_biz_co_no IS '請求書送付事業者ＮＯ // #MA.BIZ_CO_NO // Invoice send-to business No.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_zip_cd IS '請求書送付郵便番号 // #MA.ZIP_CD // Invoice send-to zip code';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_addr1 IS '請求書送付住所１ // #MA.ADDR // Invoice send-to address 1';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_addr2 IS '請求書送付住所２ // #MA.ADDR // Invoice send-to address 2';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_addr3 IS '請求書送付住所３ // #MA.ADDR // Invoice send-to address 3';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_addr4 IS '請求書送付住所４ // #MA.ADDR // Invoice send-to address 4';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_bcst_dpt IS '請求書送付部署 // #MA.BP_CNTCT_DPT // Invoice send-to dept.';


COMMENT ON COLUMN mst_bill_rcpt_all.bill_tel IS '請求書送付ＴＥＬ // #MA.TEL // Invoice send-to TEL';


COMMENT ON COLUMN mst_bill_rcpt_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_rcpt_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_rcpt_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_rcpt_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_rcpt_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

