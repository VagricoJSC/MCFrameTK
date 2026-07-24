\encoding UTF-8

COMMENT ON VIEW mst_bill_acst IS '売掛先別請求 // Billing by AR customer';


COMMENT ON COLUMN mst_bill_acst.bill_acst_no IS '売掛別請求ＮＯ // #MA.BILL_ACST_NO // Billing No. by AR customer';


COMMENT ON COLUMN mst_bill_acst.bill_mng_no IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN mst_bill_acst.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_bill_acst.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_bill_acst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_bill_acst.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_bill_acst.last_bill_amt IS '前回請求額 // #MA.MONEY // Last billing amount';


COMMENT ON COLUMN mst_bill_acst.xfr_amt IS '今回振込入金額 // #MA.MONEY // Current transfer payment received amount';


COMMENT ON COLUMN mst_bill_acst.note_amt IS '今回手形入金額 // #MA.MONEY // Current notes payment received amount';


COMMENT ON COLUMN mst_bill_acst.cash_amt IS '今回現金入金額 // #MA.MONEY // Current cash payment received amount';


COMMENT ON COLUMN mst_bill_acst.setoff_amt IS '今回相殺額 // #MA.MONEY // Current offset amount';


COMMENT ON COLUMN mst_bill_acst.setoff_tax_amt IS '今回相殺税額 // #MA.MONEY // Current offset tax amount';


COMMENT ON COLUMN mst_bill_acst.sw_amt IS '今回振替額 // #MA.MONEY // Current transfer amount';


COMMENT ON COLUMN mst_bill_acst.bfw_amt IS '今回繰越額 // #MA.MONEY // Current carry-over amount';


COMMENT ON COLUMN mst_bill_acst.sls_amt IS '今回売上額 // #MA.MONEY // Current sales amount';


COMMENT ON COLUMN mst_bill_acst.ret_amt IS '今回返品額 // #MA.MONEY // Current return amount';


COMMENT ON COLUMN mst_bill_acst.dscnt_amt IS '今回値引額 // #MA.MONEY // Current discount amount';


COMMENT ON COLUMN mst_bill_acst.sw_to_amt IS '今回振替額（振替先） // #MA.MONEY // Current transfer amount (Transfer destination)';


COMMENT ON COLUMN mst_bill_acst.tax_amt IS '今回税額 // #MA.MONEY // Current tax amount';


COMMENT ON COLUMN mst_bill_acst.bill_amt IS '今回請求額 // #MA.MONEY // Current billing amount';


COMMENT ON COLUMN mst_bill_acst.sub_char1 IS '予備１ // #MS.BILL_ACST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_bill_acst.sub_char2 IS '予備２ // #MS.BILL_ACST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_bill_acst.sub_char3 IS '予備３ // #MS.BILL_ACST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_bill_acst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_bill_acst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_bill_acst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_bill_acst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_bill_acst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_bill_acst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_bill_acst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_bill_acst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_bill_acst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_bill_acst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

