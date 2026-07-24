\encoding UTF-8

COMMENT ON TABLE mst_rcv_act_d_all IS '入金実績明細 // Payment received result details';


COMMENT ON COLUMN mst_rcv_act_d_all.rcv_act_d_no IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN mst_rcv_act_d_all.rcv_act_d_seq IS '入金実績明細連番 // #MA.SLIP_SEQ // Payment received result details sequence number';


COMMENT ON COLUMN mst_rcv_act_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.rcv_act_no IS '入金実績ＮＯ // #MA.RCV_ACT_NO // Payment received result No.';


COMMENT ON COLUMN mst_rcv_act_d_all.rcv_act_seq IS '入金実績連番 // #MA.SLIP_SEQ // Payment received result sequence number';


COMMENT ON COLUMN mst_rcv_act_d_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_rcv_act_d_all.bill_mng_no IS '請求管理ＮＯ // #MA.BILL_MNG_NO // Billing management No.';


COMMENT ON COLUMN mst_rcv_act_d_all.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.bill_dpt_cd IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.ar_dpt_cd IS '債権部門ＣＤ // #MA.DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_rcv_act_d_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_rcv_act_d_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_rcv_act_d_all.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';


COMMENT ON COLUMN mst_rcv_act_d_all.ar_sttl_cd1 IS '債権決済方法ＣＤ１ // #MA.STTL_CD // AR settlement method cd. 1';


COMMENT ON COLUMN mst_rcv_act_d_all.ar_sttl_typ1 IS '債権決済区分１ // #MA.AR_STTL_TYP // AR settlement type 1';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_amt1 IS '取引通貨金額１ // #MA.MONEY // Amount 1 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_tax_amt1 IS '取引通貨内税額１ // #MA.MONEY // Tax inclusive amount 1 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_amt2 IS '取引通貨金額２ // #MA.MONEY // Amount 2 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_tax_amt2 IS '取引通貨内税額２ // #MA.MONEY // Tax inclusive amount 2 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_amt3 IS '取引通貨金額３ // #MA.MONEY // Amount 3 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_cur_tax_amt3 IS '取引通貨内税額３ // #MA.MONEY // Tax inclusive amount 3 (Transaction currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_amt1 IS '基準通貨金額１ // #MA.MONEY // Amount 1 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_tax_amt1 IS '基準通貨内税額１ // #MA.MONEY // Tax inclusive amount 1 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_amt2 IS '基準通貨金額２ // #MA.MONEY // Amount 2 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_tax_amt2 IS '基準通貨内税額２ // #MA.MONEY // Tax inclusive amount 2 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_amt3 IS '基準通貨金額３ // #MA.MONEY // Amount 3 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.base_cur_tax_amt3 IS '基準通貨内税額３ // #MA.MONEY // Tax inclusive amount 3 (Base currency)';


COMMENT ON COLUMN mst_rcv_act_d_all.trd_xrate IS '取引時為替レート // #MA.MONEY // Exchange rate at trading';


COMMENT ON COLUMN mst_rcv_act_d_all.gen_rcv_no IS '発生入金ＮＯ // #MA.RCV_NO // Source incoming payment result No.';


COMMENT ON COLUMN mst_rcv_act_d_all.bill_d_rmrks IS '請求書明細備考 // #MS.BILL_D_RMRKS // Invoice details remarks';


COMMENT ON COLUMN mst_rcv_act_d_all.sub_char1 IS '予備１ // #MS.RCV_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_rcv_act_d_all.sub_char2 IS '予備２ // #MS.RCV_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_rcv_act_d_all.sub_char3 IS '予備３ // #MS.RCV_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_rcv_act_d_all.appl_cmpl_flg IS '消込完了ＦＬＧ // #MA.FLG // Reconciled flg.';


COMMENT ON COLUMN mst_rcv_act_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_rcv_act_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_rcv_act_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_rcv_act_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_rcv_act_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

