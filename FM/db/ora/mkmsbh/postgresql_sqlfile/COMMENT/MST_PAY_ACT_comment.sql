\encoding UTF-8

COMMENT ON VIEW mst_pay_act IS '支払実績ヘッダ // Payment result header';


COMMENT ON COLUMN mst_pay_act.pay_act_no IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN mst_pay_act.pay_act_seq IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN mst_pay_act.pay_act_rev IS '支払実績改訂番号 // #MA.SLIP_REV // Payment result revision number';


COMMENT ON COLUMN mst_pay_act.slip_sts_typ IS '伝票状況区分 // #MA.SLIP_STS_TYP // Slip status type';


COMMENT ON COLUMN mst_pay_act.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mst_pay_act.pay_dpt_cd IS '支払部門ＣＤ // #MA.DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mst_pay_act.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_pay_act.pay_usr_cd IS '支払担当者ＣＤ // #MA.USR_CD // Payment PIC cd.';


COMMENT ON COLUMN mst_pay_act.pay_act_dt IS '支払実績日 // #MA.DT // Actual payment date';


COMMENT ON COLUMN mst_pay_act.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_pay_act.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_pay_act.pay_basis_dt IS '支払起算日 // #MA.DT // Payment base date';


COMMENT ON COLUMN mst_pay_act.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_pay_act.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mst_pay_act.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mst_pay_act.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mst_pay_act.ap_sttl_cd IS '債務決済方法ＣＤ // #MA.STTL_CD // AP settlement method cd.';


COMMENT ON COLUMN mst_pay_act.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mst_pay_act.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mst_pay_act.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mst_pay_act.ap_setoff_typ IS '相殺先区分 // #MA.AP_SETOFF_TYP // Offset destination type';


COMMENT ON COLUMN mst_pay_act.setoff_cd IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN mst_pay_act.setoff_nm IS '相殺先名 // #MA.BP_NM // Offset destination name';


COMMENT ON COLUMN mst_pay_act.so_dpt_cd IS '相殺部門ＣＤ // #MA.DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN mst_pay_act.schd_act_flg IS '予定時実績ＦＬＧ // #MA.FLG // Result at schedule flg.';


COMMENT ON COLUMN mst_pay_act.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_pay_act.intr_rmrks IS '内部備考 // #MS.PAY_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_pay_act.par_pay_act_no IS '親支払実績ＮＯ // #MA.PAY_ACT_NO // Parent payment result No.';


COMMENT ON COLUMN mst_pay_act.par_pay_act_seq IS '親支払実績連番 // #MA.SLIP_SEQ // Parent payment result sequence No.';


COMMENT ON COLUMN mst_pay_act.sub_char1 IS '予備１ // #MS.PAY_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_pay_act.sub_char2 IS '予備２ // #MS.PAY_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_pay_act.sub_char3 IS '予備３ // #MS.PAY_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_pay_act.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_pay_act.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_pay_act.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_pay_act.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_pay_act.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_pay_act.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_pay_act.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_pay_act.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_pay_act.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_pay_act.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

