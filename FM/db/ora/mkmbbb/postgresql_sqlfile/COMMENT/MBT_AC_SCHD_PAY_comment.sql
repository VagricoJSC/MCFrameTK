\encoding UTF-8

COMMENT ON VIEW mbt_ac_schd_pay IS '会計支払依頼情報 // Accounting payment request info.';


COMMENT ON COLUMN mbt_ac_schd_pay.data_no IS 'データＮＯ // #MA.IT_DAT_NO // Data No.';


COMMENT ON COLUMN mbt_ac_schd_pay.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_ac_schd_pay.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_ac_schd_pay.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_ap_typ IS '支払債務区分 // #MA.PAY_AP_TYP // Payment obligation type';


COMMENT ON COLUMN mbt_ac_schd_pay.ap_appl_schd_no IS '買掛消込予定ＮＯ // #MA.AP_APPL_SCHD_NO // AP reconciliation schedule No.';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_dpt_cd IS '支払部門ＣＤ // #MA.AC_DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.bsppl_dpt_cd IS '支払予定管理先部門ＣＤ // #MA.AC_DPT_CD // Scheduled payee dept. cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.ap_dpt_cd IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dpt_cd1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dpt_cd2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dpt_cd3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN mbt_ac_schd_pay.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mbt_ac_schd_pay.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_ac_schd_pay.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_schd_pay.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_spot_flg IS '都度支払ＦＬＧ // #MA.FLG // Payment per transaction flg.';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_schd_dt IS '支払予定日 // #MA.DT // Scheduled payment date';


COMMENT ON COLUMN mbt_ac_schd_pay.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.ap_sttl_typ IS '債務決済区分 // #MA.AP_STTL_TYP // AP settlement type';


COMMENT ON COLUMN mbt_ac_schd_pay.ap_typ IS '債務区分 // #MA.AP_TYP // AP type';


COMMENT ON COLUMN mbt_ac_schd_pay.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.drawer_nm IS '振込人名 // #MA.DRAWER_NM // Payment person name';


COMMENT ON COLUMN mbt_ac_schd_pay.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mbt_ac_schd_pay.due_dt IS '手形満期日 // #MA.DT // Note expiration date';


COMMENT ON COLUMN mbt_ac_schd_pay.draw_dt IS '手形振出日 // #MA.DT // Note drawing date';


COMMENT ON COLUMN mbt_ac_schd_pay.rcv_bill_no IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN mbt_ac_schd_pay.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_ac_schd_pay.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_ac_schd_pay.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mbt_ac_schd_pay.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mbt_ac_schd_pay.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_ac_schd_pay.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_ac_schd_pay.send_flg IS '送信ＦＬＧ // #MA.FLG // Export flg.';


COMMENT ON COLUMN mbt_ac_schd_pay.proc_no IS '処理ＮＯ // #MA.JNL_PROC_NO // Process No.';


COMMENT ON COLUMN mbt_ac_schd_pay.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_ac_schd_pay.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_ac_schd_pay.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_ac_schd_pay.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_ac_schd_pay.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

