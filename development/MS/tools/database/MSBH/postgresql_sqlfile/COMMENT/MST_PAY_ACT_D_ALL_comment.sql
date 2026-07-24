\encoding UTF-8

COMMENT ON TABLE mst_pay_act_d_all IS '支払実績明細 // Payment result details';


COMMENT ON COLUMN mst_pay_act_d_all.pay_act_d_no IS '支払実績明細ＮＯ // #MA.PAY_ACT_D_NO // Payment result details No.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_act_d_seq IS '支払実績明細連番 // #MA.SLIP_SEQ // Payment result details sequence number';


COMMENT ON COLUMN mst_pay_act_d_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_act_no IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_act_seq IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN mst_pay_act_d_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_pay_act_d_all.ap_appl_schd_no IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_schd_no IS '支払予定ＮＯ // #MA.PAY_SCHD_NO // Payment schedule No.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_chk_mng_no IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN mst_pay_act_d_all.calc_tgt_pay_chk_mng_no IS '計算対象支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // (Calculation) Payment collation management No.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_d_no IS '買掛明細ＮＯ // #MA.AP_D_NO // AP details No.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_sttl_cd IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mst_pay_act_d_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mst_pay_act_d_all.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_pay_act_d_all.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mst_pay_act_d_all.trd_cur_com_paid_tax_cd IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_setoff_typ IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN mst_pay_act_d_all.setoff_cd IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN mst_pay_act_d_all.setoff_nm IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN mst_pay_act_d_all.so_dpt_cd IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN mst_pay_act_d_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_pay_act_d_all.trd_cur_com_paid_tax_amt IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN mst_pay_act_d_all.trd_cur_exc_com_paid IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN mst_pay_act_d_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_pay_act_d_all.base_cur_com_paid_tax_amt IS '基準通貨手数料税額 // #MA.MONEY // Fee tax amount (Base currency)';


COMMENT ON COLUMN mst_pay_act_d_all.base_cur_exc_com_paid IS '基準通貨手数料税抜額 // #MA.MONEY // Fee without tax (Base currency)';


COMMENT ON COLUMN mst_pay_act_d_all.rcv_no IS '入金ＮＯ // #MA.RCV_NO // Payment received No.';


COMMENT ON COLUMN mst_pay_act_d_all.adv_pay_act_no IS '前渡金支払実績ＮＯ // #MA.PAY_ACT_NO // Advance payment amount payment result No.';


COMMENT ON COLUMN mst_pay_act_d_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_pay_act_d_all.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mst_pay_act_d_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mst_pay_act_d_all.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_pay_act_d_all.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_pay_act_d_all.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_pay_act_d_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_pay_act_d_all.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mst_pay_act_d_all.pay_ntc_d_print_rmrks IS '支払通知書明細備考 // #MS.PAY_NTC_D_PRINT_RMRKS // Payment notice details remarks';


COMMENT ON COLUMN mst_pay_act_d_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_pay_act_d_all.intr_d_rmrks IS '内部明細備考 // #MS.PAY_ACT_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_pay_act_d_all.par_pay_act_d_no IS '親支払実績明細ＮＯ // #MA.PAY_ACT_NO // Parent payment result details No.';


COMMENT ON COLUMN mst_pay_act_d_all.par_pay_act_d_seq IS '親支払実績明細連番 // #MA.SLIP_SEQ // Parent payment result details sequence number';


COMMENT ON COLUMN mst_pay_act_d_all.sub_char1 IS '予備１ // #MS.PAY_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pay_act_d_all.sub_char2 IS '予備２ // #MS.PAY_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pay_act_d_all.sub_char3 IS '予備３ // #MS.PAY_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pay_act_d_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pay_act_d_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pay_act_d_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pay_act_d_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pay_act_d_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pay_act_d_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pay_act_d_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pay_act_d_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pay_act_d_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pay_act_d_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

