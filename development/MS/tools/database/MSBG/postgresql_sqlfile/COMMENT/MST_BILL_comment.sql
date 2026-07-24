\encoding UTF-8

COMMENT ON VIEW mst_bill IS '請求ヘッダ // Billing header';


COMMENT ON COLUMN mst_bill.bill_mng_no IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN mst_bill.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_bill.bill_cl_dt IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN mst_bill.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mst_bill.bill_rev IS '請求書改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN mst_bill.pre_bill_no IS '先行請求書ＮＯ // #MA.PRE_BILL_NO // Advance invoice No.';


COMMENT ON COLUMN mst_bill.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_bill.bill_xrate IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN mst_bill.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_bill.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_bill.bill_dpt_cd IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN mst_bill.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_bill.bill_dt IS '請求日 // #MA.DT // Billing date';


COMMENT ON COLUMN mst_bill.pre_bill_dt IS '先行請求日 // #MA.DT // Advance billing date';


COMMENT ON COLUMN mst_bill.last_bill_amt IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN mst_bill.xfr_amt IS '今回振込入金額 // #MA.MONEY // Current transfer payment received amount';


COMMENT ON COLUMN mst_bill.note_amt IS '今回手形入金額 // #MA.MONEY // Current notes payment received amount';


COMMENT ON COLUMN mst_bill.cash_amt IS '今回現金入金額 // #MA.MONEY // Current cash payment received amount';


COMMENT ON COLUMN mst_bill.setoff_amt IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN mst_bill.setoff_tax_amt IS '今回相殺税額 // #MA.MONEY // Current offset tax amount';


COMMENT ON COLUMN mst_bill.sw_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_bill.bfw_amt IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN mst_bill.sls_amt IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN mst_bill.ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_bill.dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_bill.sw_to_amt IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN mst_bill.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_bill.bill_amt IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN mst_bill.adv_amt_bal IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN mst_bill.adv_amt IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN mst_bill.adv_setoff_amt IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN mst_bill.adv_setoff_tax_amt IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN mst_bill.bill_each_sls_flg IS '売上都度請求ＦＬＧ // #MA.FLG // Billing at each sales flg.';


COMMENT ON COLUMN mst_bill.bill_cl_sts_typ IS '請求締状況区分 // #MS.BILL_CL_STS_TYP // Billing closing status type';


COMMENT ON COLUMN mst_bill.bill_cl_typ IS '請求締処理区分 // #MA.BILL_CL_TYP // Billing closing type';


COMMENT ON COLUMN mst_bill.foreign_flg IS '国外ＦＬＧ // #MA.FLG // Foreign flg.';


COMMENT ON COLUMN mst_bill.bill_tax_calc_typ IS '税計算区分 // #MS.BILL_TAX_CALC_TYP // Tax calculation type';


COMMENT ON COLUMN mst_bill.prnt_flg IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN mst_bill.bill_rq_flg IS '請求書要否ＦＬＧ // #MA.FLG // Invoice required flg.';


COMMENT ON COLUMN mst_bill.base_dt IS '基準日 // #MA.DT // Base date';


COMMENT ON COLUMN mst_bill.rcv_schd_amt IS '入金予定額 // #MA.MONEY // Amount of payment receipt schedule';


COMMENT ON COLUMN mst_bill.rcv_act_amt IS '入金実績額 // #MA.MONEY // Payment received result amount';


COMMENT ON COLUMN mst_bill.not_appl_bal IS '未消込残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN mst_bill.last_rcv_dt IS '最終入金日 // #MA.DT // Last payment received date';


COMMENT ON COLUMN mst_bill.rcv_schd_adjst_flg IS '入金予定調整済ＦＬＧ // #MA.FLG // Payment receipt schedule adjusted flg.';


COMMENT ON COLUMN mst_bill.edi_flg IS 'ＥＤＩＦＬＧ // #MA.FLG // EDI flg.';


COMMENT ON COLUMN mst_bill.sub_char1 IS '予備１ // #MS.BILL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill.sub_char2 IS '予備２ // #MS.BILL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill.sub_char3 IS '予備３ // #MS.BILL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_bill.bill_d_sel_flg IS '明細選択済ＦＬＧ // #MA.FLG // Details selected flg.';

