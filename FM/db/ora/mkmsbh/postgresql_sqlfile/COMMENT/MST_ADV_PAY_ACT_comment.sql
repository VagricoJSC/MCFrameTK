\encoding UTF-8

COMMENT ON VIEW mst_adv_pay_act IS '前渡金実績 // Advance payment result';


COMMENT ON COLUMN mst_adv_pay_act.adv_pay_act_no IS '前渡金実績ＮＯ // #MA.PAY_ACT_NO // Advance payment result No.';


COMMENT ON COLUMN mst_adv_pay_act.adv_pay_act_seq IS '前渡金実績連番 // #MA.SLIP_SEQ // Advance payment result sequence number';


COMMENT ON COLUMN mst_adv_pay_act.adv_pay_act_rev IS '前渡金実績改訂番号 // #MA.SLIP_REV // Advance payment result revision number';


COMMENT ON COLUMN mst_adv_pay_act.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_adv_pay_act.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mst_adv_pay_act.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mst_adv_pay_act.bsppl_dpt_cd IS '支払予定管理先担当部門ＣＤ // #MA.DPT_CD // Cd. of dept. in charge of scheduled payee';


COMMENT ON COLUMN mst_adv_pay_act.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_adv_pay_act.pay_dpt_cd IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mst_adv_pay_act.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_adv_pay_act.pay_usr_cd IS '支払担当者ＣＤ // #MA.USR_CD // Payment PIC cd.';


COMMENT ON COLUMN mst_adv_pay_act.pay_act_dt IS '支払実績日 // #MA.DT // Actual payment date';


COMMENT ON COLUMN mst_adv_pay_act.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_adv_pay_act.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_adv_pay_act.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_adv_pay_act.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_adv_pay_act.ap_sttl_cd IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN mst_adv_pay_act.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mst_adv_pay_act.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mst_adv_pay_act.com_paid_ap_sttl_cd IS '手数料債務決済方法ＣＤ // #MA.STTL_CD // Fee AP settlement method cd.';


COMMENT ON COLUMN mst_adv_pay_act.com_paid_ap_sttl_typ IS '手数料債務決済区分 // #MA.AP_STTL_TYP // Fee AP settlement type';


COMMENT ON COLUMN mst_adv_pay_act.com_paid_ac_rsn_cd IS '手数料会計理由ＣＤ // #MA.AC_RSN_CD // Fee accounting reason cd.';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_com_paid_tax_cd IS '手数料税ＣＤ // #MA.TAX_CD // Fee tax cd.';


COMMENT ON COLUMN mst_adv_pay_act.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_adv_pay_act.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_com_paid IS '取引通貨手数料金額 // #MA.MONEY // Fee amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_com_paid_tax_amt IS '取引通貨手数料税額 // #MA.MONEY // Fee tax amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_exc_com_paid IS '取引通貨手数料税抜額 // #MA.MONEY // Fee amount without tax (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_setoff_tgt_amt IS '取引通貨相殺対象額 // #MA.MONEY // Offset target amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_setoff_schd_amt IS '取引通貨相殺予定額 // #MA.MONEY // Offset schedule amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_setoff_act_amt IS '取引通貨相殺実績額 // #MA.MONEY // Offset result amount (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.trd_cur_not_proc_bal IS '取引通貨未処理残高 // #MA.MONEY // Unreconciled balance (Transaction currency)';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_com_paid IS '基準通貨手数料金額 // #MA.MONEY // Fee (Base currency)';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_com_paid_tax_amt IS '基準通貨手数料税額 // #MA.MONEY // Fee tax amount (Base currency)';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_exc_com_paid IS '基準通貨手数料税抜額 // #MA.MONEY // Fee without tax (Base currency)';


COMMENT ON COLUMN mst_adv_pay_act.base_cur_setoff_tgt_amt IS '基準通貨相殺対象額 // #MA.MONEY // Offset amount (Base currency)';


COMMENT ON COLUMN mst_adv_pay_act.pay_chk_mng_no IS '支払照合管理ＮＯ // #MA.PAY_CHK_MNG_NO // Payment collation management No.';


COMMENT ON COLUMN mst_adv_pay_act.pay_ntc_adv_pay_flg IS '支払通知書前渡金表示ＦＬＧ // #MA.FLG // Display advance payment on payment notice flg.';


COMMENT ON COLUMN mst_adv_pay_act.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_adv_pay_act.intr_rmrks IS '内部備考 // #MS.ADV_PAY_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_adv_pay_act.sub_char1 IS '予備１ // #MS.ADV_PAY_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_adv_pay_act.sub_char2 IS '予備２ // #MS.ADV_PAY_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_adv_pay_act.sub_char3 IS '予備３ // #MS.ADV_PAY_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_adv_pay_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_adv_pay_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_adv_pay_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_adv_pay_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_adv_pay_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_adv_pay_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_adv_pay_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_adv_pay_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_adv_pay_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_adv_pay_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

