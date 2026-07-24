\encoding UTF-8

COMMENT ON TABLE mst_ap_appl_schd_all IS '買掛消込予定 // AP reconciliation schedule';


COMMENT ON COLUMN mst_ap_appl_schd_all.ap_appl_schd_no IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN mst_ap_appl_schd_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ap_appl_schd_all.pay_schd_no IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN mst_ap_appl_schd_all.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_ap_appl_schd_all.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_ap_appl_schd_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_ap_appl_schd_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_appl_schd_all.trd_cur_com_paid_tax_amt IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_appl_schd_all.trd_cur_exc_com_paid IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN mst_ap_appl_schd_all.trd_cur_appl_amt IS '取引通貨消込額 // #MA.MONEY // Reconciled amount (Transaction currency)';


COMMENT ON COLUMN mst_ap_appl_schd_all.pay_sts_typ IS '支払状況区分 // #MS.PAY_STS_TYP // Payment status type';


COMMENT ON COLUMN mst_ap_appl_schd_all.sub_char1 IS '予備１ // #MS.AP_APPL_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ap_appl_schd_all.sub_char2 IS '予備２ // #MS.AP_APPL_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ap_appl_schd_all.sub_char3 IS '予備３ // #MS.AP_APPL_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ap_appl_schd_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ap_appl_schd_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ap_appl_schd_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ap_appl_schd_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ap_appl_schd_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

