\encoding UTF-8

COMMENT ON VIEW mbt_ac_rcv IS '会計入金情報 // Accounting payment received info.';


COMMENT ON COLUMN mbt_ac_rcv.data_no IS 'データＮＯ // #MA.IT_DAT_NO // Data No.';


COMMENT ON COLUMN mbt_ac_rcv.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mbt_ac_rcv.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_ac_rcv.rcv_act_no IS '入金実績ＮＯ // #MA.RCV_ACT_NO // Payment received result No.';


COMMENT ON COLUMN mbt_ac_rcv.rcv_act_seq IS '入金実績連番 // #MA.SLIP_SEQ // Payment received result sequence number';


COMMENT ON COLUMN mbt_ac_rcv.rcv_act_rev IS '入金実績改訂番号 // #MA.SLIP_REV // Payment received result rev. number';


COMMENT ON COLUMN mbt_ac_rcv.rcv_act_d_no IS '入金実績明細ＮＯ // #MA.RCV_ACT_D_NO // Payment received result details No.';


COMMENT ON COLUMN mbt_ac_rcv.rcv_act_d_seq IS '入金実績明細連番 // #MA.SLIP_SEQ // Payment received result details sequence number';


COMMENT ON COLUMN mbt_ac_rcv.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_ac_rcv.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mbt_ac_rcv.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mbt_ac_rcv.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mbt_ac_rcv.ar_dpt_cd IS '債権部門ＣＤ // #MA.AC_DPT_CD // AR dept. cd.';


COMMENT ON COLUMN mbt_ac_rcv.rcv_dpt_cd IS '入金部門ＣＤ // #MA.AC_DPT_CD // Payment receiving dept. cd.';


COMMENT ON COLUMN mbt_ac_rcv.so_dpt_cd IS '相殺部門ＣＤ // #MA.AC_DPT_CD // Offset dept. cd.';


COMMENT ON COLUMN mbt_ac_rcv.sub_dpt_cd1 IS '予備部門ＣＤ１ // #MA.AC_DPT_CD // Spare dept. cd. 1';


COMMENT ON COLUMN mbt_ac_rcv.sub_dpt_cd2 IS '予備部門ＣＤ２ // #MA.AC_DPT_CD // Spare dept. cd. 2';


COMMENT ON COLUMN mbt_ac_rcv.sub_dpt_cd3 IS '予備部門ＣＤ３ // #MA.AC_DPT_CD // Spare dept. cd. 3';


COMMENT ON COLUMN mbt_ac_rcv.rcst_cd IS '入金先ＣＤ // #MA.BP_CD // Payer cd.';


COMMENT ON COLUMN mbt_ac_rcv.acst_cd IS '売掛先ＣＤ // #MA.BP_CD // AR customer cd.';


COMMENT ON COLUMN mbt_ac_rcv.setoff_cd IS '相殺先ＣＤ // #MA.BP_CD // Offset destination cd.';


COMMENT ON COLUMN mbt_ac_rcv.foreign_flg IS '国外取引ＦＬＧ // #MA.FLG // Foreign transaction flg.';


COMMENT ON COLUMN mbt_ac_rcv.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_ac_rcv.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_ac_rcv.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mbt_ac_rcv.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_ac_rcv.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_rcv.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mbt_ac_rcv.tax_cd IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN mbt_ac_rcv.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_ac_rcv.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_ac_rcv.bill_no IS '請求書ＮＯ // #MA.BILL_NO // Invoice No.';


COMMENT ON COLUMN mbt_ac_rcv.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_ac_rcv.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_ac_rcv.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mbt_ac_rcv.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mbt_ac_rcv.xfr_psn IS '振込人名 // #MA.XFR_PSN // Payment person name';


COMMENT ON COLUMN mbt_ac_rcv.note_no IS '手形番号 // #MA.NOTE_NO // Note number';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key1 IS '仕訳キー項目１ // #MA.JNL_KEY1 // Journal key column 1';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key2 IS '仕訳キー項目２ // #MA.JNL_KEY2 // Journal key column 2';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key3 IS '仕訳キー項目３ // #MA.JNL_KEY3 // Journal key column 3';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key4 IS '仕訳キー項目４ // #MA.JNL_KEY4 // Journal key column 4';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key5 IS '仕訳キー項目５ // #MA.JNL_KEY5 // Journal key column 5';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key6 IS '仕訳キー項目６ // #MA.JNL_KEY6 // Journal key column 6';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key7 IS '仕訳キー項目７ // #MA.JNL_KEY7 // Journal key column 7';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key8 IS '仕訳キー項目８ // #MA.JNL_KEY8 // Journal key column 8';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key9 IS '仕訳キー項目９ // #MA.JNL_KEY9 // Journal key column 9';


COMMENT ON COLUMN mbt_ac_rcv.jnl_key10 IS '仕訳キー項目１０ // #MA.JNL_KEY10 // Journal key column 10';


COMMENT ON COLUMN mbt_ac_rcv.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mbt_ac_rcv.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mbt_ac_rcv.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_ac_rcv.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_ac_rcv.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_ac_rcv.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_ac_rcv.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_ac_rcv.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_ac_rcv.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_ac_rcv.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_ac_rcv.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_ac_rcv.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_ac_rcv.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_ac_rcv.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_ac_rcv.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_ac_rcv.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_ac_rcv.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_ac_rcv.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_ac_rcv.jnl_fin_cnt IS '仕訳実行回数 // #MA.JNL_FIN_CNT // Number of journalizing';


COMMENT ON COLUMN mbt_ac_rcv.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_ac_rcv.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_ac_rcv.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_ac_rcv.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_ac_rcv.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_ac_rcv.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_ac_rcv.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_ac_rcv.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_ac_rcv.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_ac_rcv.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

