\encoding UTF-8

COMMENT ON VIEW mst_rcv IS '入金 // Payment received';


COMMENT ON COLUMN mst_rcv.rcv_no IS '入金ＮＯ // #MA.RCV_NO // Payment received No.';


COMMENT ON COLUMN mst_rcv.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mst_rcv.dat_typ IS 'データ区分 // #MS.RCV_DAT_TYP // Data type';


COMMENT ON COLUMN mst_rcv.rcst_cd IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN mst_rcv.bcst_cd IS '請求先ＣＤ // #MA.BP_CD // Billing customer cd.';


COMMENT ON COLUMN mst_rcv.bill_dpt_cd IS '請求部門ＣＤ // #MA.DPT_CD // Billing dept. cd.';


COMMENT ON COLUMN mst_rcv.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mst_rcv.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_rcv.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_rcv.rcv_dpt_cd IS '入金部門ＣＤ // #MA.DPT_CD // Payment receiving dept. cd.';


COMMENT ON COLUMN mst_rcv.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_rcv.rcv_usr_cd IS '入金担当者ＣＤ // #MA.USR_CD // Payment received PIC cd.';


COMMENT ON COLUMN mst_rcv.rcv_dt IS '入金日 // #MA.DT // Payment received date';


COMMENT ON COLUMN mst_rcv.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_rcv.rcv_mtd_cd IS '入金方法ＣＤ // #MA.STTL_CD // Payment received method cd.';


COMMENT ON COLUMN mst_rcv.rcv_typ IS '入金区分 // #MA.AR_STTL_TYP // Payment received type';


COMMENT ON COLUMN mst_rcv.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_rcv.xfr_psn IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN mst_rcv.note_mng_no IS '手形管理ＮＯ // #MA.NOTE_MNG_NO // Note management No.';


COMMENT ON COLUMN mst_rcv.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_rcv.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_rcv.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_rcv.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_rcv.rcv_rmrks IS '入金備考 // #MS.RCV_RMRKS // Payment received remarks';


COMMENT ON COLUMN mst_rcv.src_rcv_act_no IS '発生元入金実績ＮＯ // #MA.RCV_ACT_NO // Source incoming payment result received No.';


COMMENT ON COLUMN mst_rcv.src_rcv_act_seq IS '発生元入金実績連番 // #MA.SLIP_SEQ // Source incoming payment result sequence number';


COMMENT ON COLUMN mst_rcv.src_rcv_act_d_no IS '発生元入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Source incoming payment result details No.';


COMMENT ON COLUMN mst_rcv.src_rcv_act_d_seq IS '発生元入金実績明細連番 // #MA.SLIP_SEQ // Source incoming payment result details sequence number';


COMMENT ON COLUMN mst_rcv.pay_act_no IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN mst_rcv.rcv_amt IS '入金額 // #MA.MONEY // Payment received amount';


COMMENT ON COLUMN mst_rcv.rcv_proc_amt IS '入金処理額 // #MA.MONEY // Processed payment received amount';


COMMENT ON COLUMN mst_rcv.not_proc_bal IS '未処理残高 // #MA.MONEY // Unreconciled balance';


COMMENT ON COLUMN mst_rcv.com_paid IS '振込手数料 // #MA.MONEY // Transfer fee';


COMMENT ON COLUMN mst_rcv.bill_setoff_amt IS '請求済相殺額 // #MA.MONEY // Billing offset amount';


COMMENT ON COLUMN mst_rcv.auto_appl_basis_dt IS '自動消込基準日 // #MA.DT // Auto-reconciliation base date';


COMMENT ON COLUMN mst_rcv.rcv_auto_appl_tgt_flg IS '入金自動消込対象ＦＬＧ // #MA.FLG // For auto-reconciliation flg.';


COMMENT ON COLUMN mst_rcv.auto_appl_sts_typ IS '自動消込状況区分 // #MS.AUTO_APPL_STS_TYP // Auto-reconciliation status type';


COMMENT ON COLUMN mst_rcv.fb_flg IS 'ＦＢＦＬＧ // #MA.FLG // FB flg.';


COMMENT ON COLUMN mst_rcv.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_rcv.ext_rcv_no IS '外部入金ＮＯ // #MA.EXT_RCV_NO // External payment received No.';


COMMENT ON COLUMN mst_rcv.seq_no IS '枝番 // #MA.INT // Branch number';


COMMENT ON COLUMN mst_rcv.prnt_flg IS '発行済ＦＬＧ // #MA.FLG // Issued flg.';


COMMENT ON COLUMN mst_rcv.div_src_rcv_no IS '分割元入金ＮＯ // #MA.RCV_NO // Payment received split source No.';


COMMENT ON COLUMN mst_rcv.div_flg IS '分割済ＦＬＧ // #MA.FLG // Split flg.';


COMMENT ON COLUMN mst_rcv.sub_char1 IS '予備１ // #MS.RCV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_rcv.sub_char2 IS '予備２ // #MS.RCV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_rcv.sub_char3 IS '予備３ // #MS.RCV_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_rcv.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_rcv.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_rcv.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_rcv.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_rcv.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_rcv.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_rcv.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_rcv.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_rcv.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_rcv.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_rcv.ar_typ IS '債権区分 // #MA.AR_TYP // AR type';

