\encoding UTF-8

COMMENT ON TABLE mst_pay_ntc_his_all IS '支払通知書ヘッダ履歴 // Payment notice header history';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_ntc_his_no IS '支払通知書履歴ＮＯ // #MA.PAY_NTC_HIS_NO // Payment notice history No.';


COMMENT ON COLUMN mst_pay_ntc_his_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_ntc_rev IS '支払通知書改訂番号 // #MA.SLIP_REV // Payment notice rev. number';


COMMENT ON COLUMN mst_pay_ntc_his_all.latest_flg IS '最新ＦＬＧ // #MA.FLG // Latest flg.';


COMMENT ON COLUMN mst_pay_ntc_his_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_pay_ntc_his_all.bsppl_cl_dt IS '支払予定管理先締年月日 // #MA.DT // Scheduled payee closing year, month, and date';


COMMENT ON COLUMN mst_pay_ntc_his_all.reg_dt IS '登録日 // #MA.DT // Entry date';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_spot_flg IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN mst_pay_ntc_his_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_pay_ntc_his_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_pay_ntc_his_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_pay_ntc_his_all.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_xrate IS '支払照合為替レート // #MA.MONEY // Payment collation exchange rate';


COMMENT ON COLUMN mst_pay_ntc_his_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_pay_ntc_his_all.last_pay_schd_amt IS '前回支払予定額 // #MA.MONEY // Last payment schedule amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.pay_amt IS '今回支払額 // #MA.MONEY // Current payment amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.sw_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.bfw_amt IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.purc_amt IS '今回仕入額 // #MA.MONEY // Current purchase amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.purc_dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.purc_ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.setoff_amt IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.sw_to_amt IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN mst_pay_ntc_his_all.schd_pay_amt IS '今回支払予定額 // #MA.MONEY // Current scheduled payment amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.adv_pay_bal IS '前渡金残高 // #MA.MONEY // Advance payment balance';


COMMENT ON COLUMN mst_pay_ntc_his_all.adv_pay_amt IS '前渡金支払額 // #MA.MONEY // Advance payment amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.adv_pay_setoff_amt IS '前渡金相殺額 // #MA.MONEY // Advance payment offset amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.adv_pay_setoff_tax_amt IS '前渡金相殺税額 // #MA.MONEY // Advance payment offset tax amount';


COMMENT ON COLUMN mst_pay_ntc_his_all.sub_char1 IS '予備１ // #MS.PAY_CHK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pay_ntc_his_all.sub_char2 IS '予備２ // #MS.PAY_CHK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pay_ntc_his_all.sub_char3 IS '予備３ // #MS.PAY_CHK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pay_ntc_his_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pay_ntc_his_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pay_ntc_his_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pay_ntc_his_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pay_ntc_his_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

