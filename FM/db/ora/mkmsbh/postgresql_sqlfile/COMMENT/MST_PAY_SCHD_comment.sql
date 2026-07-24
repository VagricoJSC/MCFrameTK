\encoding UTF-8

COMMENT ON VIEW mst_pay_schd IS '支払予定 // Payment schedule';


COMMENT ON COLUMN mst_pay_schd.pay_schd_no IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN mst_pay_schd.pay_chk_mng_no IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN mst_pay_schd.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_pay_schd.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_pay_schd.pay_dpt_cd IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mst_pay_schd.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mst_pay_schd.ap_sttl_cd IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN mst_pay_schd.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mst_pay_schd.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mst_pay_schd.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mst_pay_schd.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_pay_schd.ap_setoff_typ IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN mst_pay_schd.setoff_cd IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN mst_pay_schd.setoff_nm IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN mst_pay_schd.so_dpt_cd IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN mst_pay_schd.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_pay_schd.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_pay_schd.trd_cur_com_paid_tax_cd IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN mst_pay_schd.trd_cur_com_paid_tax_amt IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN mst_pay_schd.trd_cur_exc_com_paid IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN mst_pay_schd.trd_cur_appl_amt IS '取引通貨消込額 // #MA.MONEY // Reconciled amount (Transaction currency)';


COMMENT ON COLUMN mst_pay_schd.pay_sts_typ IS '支払状況区分 // #MS.PAY_STS_TYP // Payment status type';


COMMENT ON COLUMN mst_pay_schd.sw_flg IS '振替済ＦＬＧ // #MA.FLG // Transferred flg.';


COMMENT ON COLUMN mst_pay_schd.rcv_bill_no IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN mst_pay_schd.adv_pay_act_no IS '前渡金支払実績ＮＯ // #MA.PAY_ACT_NO // Advance payment amount payment result No.';


COMMENT ON COLUMN mst_pay_schd.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mst_pay_schd.note_typ IS '手形区分 // #MA.NOTE_TYP // Note type';


COMMENT ON COLUMN mst_pay_schd.note_rsn_cd IS '手形理由ＣＤ // #MA.NOTE_RSN_CD // Note reason cd.';


COMMENT ON COLUMN mst_pay_schd.draw_dt IS '振出日 // #MA.DT // Drawing date';


COMMENT ON COLUMN mst_pay_schd.due_dt IS '支払期日 // #MA.DT // Payment due date';


COMMENT ON COLUMN mst_pay_schd.note_days IS '手形サイト // #MA.DAYS // Note sight';


COMMENT ON COLUMN mst_pay_schd.drawer_nm IS '振出人名 // #MA.DRAWER_NM // Drawer name';


COMMENT ON COLUMN mst_pay_schd.draw_bank_cd IS '振出銀行ＣＤ // #MA.BANK_CD // Drawing bank cd.';


COMMENT ON COLUMN mst_pay_schd.draw_branch_cd IS '振出支店ＣＤ // #MA.BANK_BRANCH_CD // Drawing branch cd.';


COMMENT ON COLUMN mst_pay_schd.endrsr IS '裏書人 // #MA.NOTE_ENDRSR // Endorser';


COMMENT ON COLUMN mst_pay_schd.accptr IS '引受人 // #MA.NOTE_ACCPTR // Accepted by';


COMMENT ON COLUMN mst_pay_schd.pay_ntc_d_print_rmrks IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN mst_pay_schd.pay_schd_print_rmrks IS '支払予定表備考 // #MS.PAY_SCHD_PRINT_RMRKS // Payment schedule table details';


COMMENT ON COLUMN mst_pay_schd.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_pay_schd.intr_rmrks IS '内部備考 // #MS.PAY_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_pay_schd.sub_char1 IS '予備１ // #MS.PAY_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pay_schd.sub_char2 IS '予備２ // #MS.PAY_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pay_schd.sub_char3 IS '予備３ // #MS.PAY_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pay_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pay_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pay_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pay_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pay_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pay_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pay_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pay_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pay_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pay_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

