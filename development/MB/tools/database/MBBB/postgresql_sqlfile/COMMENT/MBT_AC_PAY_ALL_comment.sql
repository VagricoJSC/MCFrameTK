\encoding UTF-8

COMMENT ON TABLE mbt_ac_pay_all IS '会計支払情報 // Accounting payment info.';


COMMENT ON COLUMN mbt_ac_pay_all.data_no IS 'データＮＯ // #MA.IT_DAT_NO // Data No.';


COMMENT ON COLUMN mbt_ac_pay_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_ac_pay_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mbt_ac_pay_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_ac_pay_all.pay_act_no IS '支払実績ＮＯ // #MA.PAY_ACT_NO // Payment result No.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_act_seq IS '支払実績連番 // #MA.SLIP_SEQ // Payment result sequence No.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_act_rev IS '支払実績改訂番号 // #MA.SLIP_REV // Payment result revision number';


COMMENT ON COLUMN mbt_ac_pay_all.pay_act_d_no IS '支払実績明細ＮＯ // #MA.PAY_ACT_D_NO // Payment result details No.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_act_d_seq IS '支払実績明細連番 // #MA.SLIP_SEQ // Payment result details sequence number';


COMMENT ON COLUMN mbt_ac_pay_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_ac_pay_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mbt_ac_pay_all.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mbt_ac_pay_all.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_dpt_cd IS '支払部門ＣＤ // #MA.AC_DPT_CD // Payment dept. cd.';


COMMENT ON COLUMN mbt_ac_pay_all.bsppl_dpt_cd IS '支払予定管理先部門ＣＤ // #MA.AC_DPT_CD // Scheduled payee dept. cd.';


COMMENT ON COLUMN mbt_ac_pay_all.ap_dpt_cd IS '債務部門ＣＤ // #MA.AC_DPT_CD // AP dept. cd.';


COMMENT ON COLUMN mbt_ac_pay_all.so_dpt_cd IS '相殺部門ＣＤ // #MA.AC_DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dpt_cd1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dpt_cd2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dpt_cd3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN mbt_ac_pay_all.psppl_cd IS '支払先ＣＤ // #MA.BP_CD // Payee cd.';


COMMENT ON COLUMN mbt_ac_pay_all.bsppl_cd IS '支払予定管理先ＣＤ // #MA.BP_CD // Scheduled payee cd.';


COMMENT ON COLUMN mbt_ac_pay_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mbt_ac_pay_all.setoff_cd IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN mbt_ac_pay_all.setoff_nm IS '任意相殺先名 // #MA.BP_NM // Optional offset destination name';


COMMENT ON COLUMN mbt_ac_pay_all.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mbt_ac_pay_all.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_ac_pay_all.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_ac_pay_all.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mbt_ac_pay_all.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_ac_pay_all.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_pay_all.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_pay_all.tax_cd IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN mbt_ac_pay_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_ac_pay_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_ac_pay_all.rcv_bill_no IS '相手先請求書ＮＯ // #MA.RCV_BILL_NO // Counterpart invoice No.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_chk_no IS '支払照合ＮＯ // #MA.PAY_CHK_NO // Payment collation No.';


COMMENT ON COLUMN mbt_ac_pay_all.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_ac_pay_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_ac_pay_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mbt_ac_pay_all.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mbt_ac_pay_all.pay_bank_ac_cd IS '支払先口座ＣＤ // #MA.BANK_AC_CD // Payee account cd.';


COMMENT ON COLUMN mbt_ac_pay_all.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_key10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN mbt_ac_pay_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mbt_ac_pay_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_ac_pay_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_ac_pay_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_ac_pay_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_ac_pay_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_ac_pay_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_ac_pay_all.jnl_fin_cnt IS '仕訳実行回数 // #MA.JNL_FIN_CNT // Number of journalizing';


COMMENT ON COLUMN mbt_ac_pay_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_ac_pay_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_ac_pay_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_ac_pay_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_ac_pay_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_ac_pay_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_ac_pay_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_ac_pay_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_ac_pay_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_ac_pay_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

