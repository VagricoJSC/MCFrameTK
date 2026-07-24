\encoding UTF-8

COMMENT ON TABLE mst_bill_his_all IS '請求書ヘッダ履歴 // Invoice header history';


COMMENT ON COLUMN mst_bill_his_all.bill_his_no IS '請求書履歴ＮＯ // #MA.BILL_HIS_NO // Invoice history No.';


COMMENT ON COLUMN mst_bill_his_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_bill_his_all.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_his_all.bill_rev IS '請求書改訂番号 // #MA.SLIP_REV // Invoice rev. number';


COMMENT ON COLUMN mst_bill_his_all.latest_flg IS '最新ＦＬＧ // #MA.FLG // Latest flg.';


COMMENT ON COLUMN mst_bill_his_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_bill_his_all.bill_cl_dt IS '請求締年月日 // #MA.DT // Billing closing day';


COMMENT ON COLUMN mst_bill_his_all.bill_each_sls_flg IS '売上都度請求ＦＬＧ // #MA.FLG // Billing at each sales flg.';


COMMENT ON COLUMN mst_bill_his_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_bill_his_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_bill_his_all.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_bill_his_all.bill_dpt_cd IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN mst_bill_his_all.bill_xrate IS '請求為替レート // #MA.MONEY // Billing exchange rate';


COMMENT ON COLUMN mst_bill_his_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_bill_his_all.last_bill_amt IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN mst_bill_his_all.rcv_amt IS '今回入金額 // #MA.MONEY // Current payment received amount';


COMMENT ON COLUMN mst_bill_his_all.sw_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_bill_his_all.bfw_amt IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN mst_bill_his_all.sls_amt IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN mst_bill_his_all.dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_bill_his_all.ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_bill_his_all.setoff_amt IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN mst_bill_his_all.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_bill_his_all.sw_to_amt IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN mst_bill_his_all.bill_amt IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN mst_bill_his_all.adv_amt_bal IS '前受金残高 // #MA.MONEY // Advance received balance';


COMMENT ON COLUMN mst_bill_his_all.adv_amt IS '前受金入金額 // #MA.MONEY // Advance received payment amount';


COMMENT ON COLUMN mst_bill_his_all.adv_setoff_amt IS '前受金相殺額 // #MA.MONEY // Advance received offset amount';


COMMENT ON COLUMN mst_bill_his_all.adv_setoff_tax_amt IS '前受金相殺税額 // #MA.MONEY // Advance received offset tax amount';


COMMENT ON COLUMN mst_bill_his_all.sub_char1 IS '予備１ // #MS.BILL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_his_all.sub_char2 IS '予備２ // #MS.BILL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_his_all.sub_char3 IS '予備３ // #MS.BILL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_his_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_his_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_his_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_his_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_his_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_his_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_his_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_his_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_his_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_his_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

