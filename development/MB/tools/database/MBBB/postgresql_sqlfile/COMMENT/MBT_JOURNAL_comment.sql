\encoding UTF-8

COMMENT ON VIEW mbt_journal IS '仕訳情報テーブル // Journal info. table';


COMMENT ON COLUMN mbt_journal.jnl_grp_no IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN mbt_journal.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_journal.ac_if_typ IS '会計ＩＦ区分 // #MA.AC_IF_TYP // Accounting IF type';


COMMENT ON COLUMN mbt_journal.slip_cnt_id IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN mbt_journal.jnl_no IS '仕訳伝票ＮＯ // #MA.JNL_NO // Journal slip No.';


COMMENT ON COLUMN mbt_journal.jnl_no_seq IS '仕訳伝票明細番号 // #MA.JNL_NO_SEQ // Journal slip details number';


COMMENT ON COLUMN mbt_journal.dc_typ IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN mbt_journal.ac_slip_dt IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN mbt_journal.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_journal.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mbt_journal.slip_seq_no IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN mbt_journal.dpt_cd IS '部門ＣＤ // #MA.AC_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mbt_journal.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mbt_journal.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mbt_journal.project_cd IS 'プロジェクトＣＤ // #MA.SUMMARY_CD // Project cd.';


COMMENT ON COLUMN mbt_journal.summary_cd0 IS '集計ＣＤ０ // #MA.SUMMARY_CD // Aggregated cd. 0';


COMMENT ON COLUMN mbt_journal.summary_cd1 IS '集計ＣＤ１ // #MA.SUMMARY_CD // Aggregated cd. 1';


COMMENT ON COLUMN mbt_journal.summary_cd2 IS '集計ＣＤ２ // #MA.SUMMARY_CD // Aggregated cd. 2';


COMMENT ON COLUMN mbt_journal.summary_cd3 IS '集計ＣＤ３ // #MA.SUMMARY_CD // Aggregated cd. 3';


COMMENT ON COLUMN mbt_journal.summary_cd4 IS '集計ＣＤ４ // #MA.SUMMARY_CD // Aggregated cd. 4';


COMMENT ON COLUMN mbt_journal.summary_cd5 IS '集計ＣＤ５ // #MA.SUMMARY_CD // Aggregated cd. 5';


COMMENT ON COLUMN mbt_journal.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mbt_journal.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mbt_journal.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mbt_journal.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mbt_journal.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mbt_journal.bp_typ IS '取引先区分 // #MA.MASTER_TYP // BP type';


COMMENT ON COLUMN mbt_journal.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mbt_journal.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mbt_journal.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mbt_journal.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mbt_journal.base_cur_sum_amt IS '基準通貨税込金額 // #MA.MONEY // Tax included amount (Base currency)';


COMMENT ON COLUMN mbt_journal.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_journal.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mbt_journal.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_journal.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mbt_journal.trd_cur_sum_amt IS '取引通貨税込金額 // #MA.MONEY // Tax included amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_journal.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mbt_journal.ptax_cur_sum_amt IS '納税通貨税込金額 // #MA.MONEY // Tax included amount (Tax currency)';


COMMENT ON COLUMN mbt_journal.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mbt_journal.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mbt_journal.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mbt_journal.tax_typ IS '税区分 // #MA.AC_TAX_TYP // Tax type';


COMMENT ON COLUMN mbt_journal.tax_cd IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN mbt_journal.foreign_flg IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN mbt_journal.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_journal.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_journal.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mbt_journal.ptax_xrate_cd IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN mbt_journal.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_journal.bill_no IS '請求／支払ＮＯ // #MA.BILL_PAY_NO // Billing/payment No.';


COMMENT ON COLUMN mbt_journal.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mbt_journal.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mbt_journal.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_journal.cls_jnl_typ IS '決算仕訳区分 // #MA.CLS_JNL_TYP // Closing entry type';


COMMENT ON COLUMN mbt_journal.alloc_jnl_flg IS '配賦仕訳ＦＬＧ // #MA.FLG // Allocation journal flg.';


COMMENT ON COLUMN mbt_journal.spot_flg IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN mbt_journal.sttl_schd_dt IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN mbt_journal.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mbt_journal.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mbt_journal.other_ac_cd IS '相手勘定科目ＣＤ // #MA.AC_CD // Counterpart account cd.';


COMMENT ON COLUMN mbt_journal.other_sub_ac_cd IS '相手補助勘定科目ＣＤ // #MA.SUB_AC_CD // Counterpart subsidiary account cd.';


COMMENT ON COLUMN mbt_journal.other_dpt_cd IS '相手部門ＣＤ // #MA.AC_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN mbt_journal.abstract1 IS '摘要１ // #MA.ABSTRACT_T // Abstract 1';


COMMENT ON COLUMN mbt_journal.abstract2 IS '摘要２ // #MA.ABSTRACT_T // Abstract 2';


COMMENT ON COLUMN mbt_journal.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_journal.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_journal.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_journal.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_journal.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_journal.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_journal.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_journal.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_journal.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_journal.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_journal.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_journal.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_journal.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_journal.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_journal.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_journal.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_journal.send_flg IS '送信ＦＬＧ // #MA.FLG // Export flg.';


COMMENT ON COLUMN mbt_journal.jnl_ptn IS '仕訳パタン // #MA.JNL_PTN_NM // Journal pattern';


COMMENT ON COLUMN mbt_journal.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_journal.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_journal.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_journal.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_journal.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_journal.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_journal.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_journal.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_journal.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_journal.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mbt_journal.base_cur_tax_base_amt IS '基準通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Base currency)';


COMMENT ON COLUMN mbt_journal.trd_cur_tax_base_amt IS '取引通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal.ptax_cur_tax_base_amt IS '納税通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Tax currency)';

