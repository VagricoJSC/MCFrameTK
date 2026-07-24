\encoding UTF-8

COMMENT ON VIEW mbt_journal_snd_if IS '仕訳送信ＩＦ // Journal export IF';


COMMENT ON COLUMN mbt_journal_snd_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mbt_journal_snd_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mbt_journal_snd_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mbt_journal_snd_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mbt_journal_snd_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mbt_journal_snd_if.jnl_grp_no IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN mbt_journal_snd_if.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_journal_snd_if.ac_if_typ IS '会計ＩＦ区分 // #MA.AC_IF_TYP // Accounting IF type';


COMMENT ON COLUMN mbt_journal_snd_if.slip_cnt_id IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN mbt_journal_snd_if.jnl_no IS '仕訳伝票ＮＯ // #MA.JNL_NO // Journal slip No.';


COMMENT ON COLUMN mbt_journal_snd_if.jnl_no_seq IS '仕訳伝票明細番号 // #MA.JNL_NO_SEQ // Journal slip details number';


COMMENT ON COLUMN mbt_journal_snd_if.dc_typ IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN mbt_journal_snd_if.ac_slip_dt IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN mbt_journal_snd_if.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mbt_journal_snd_if.slip_no IS '伝票ＮＯ // #MA.SLIP_NO // Slip No.';


COMMENT ON COLUMN mbt_journal_snd_if.slip_seq_no IS '伝票連番 // #MA.SLIP_SEQ // Slip sequence number';


COMMENT ON COLUMN mbt_journal_snd_if.dpt_cd IS '部門ＣＤ // #MA.AC_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mbt_journal_snd_if.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.sub_ac_cd IS '補助勘定科目ＣＤ // #MA.SUB_AC_CD // Subsidiary account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.project_cd IS 'プロジェクトＣＤ // #MA.SUMMARY_CD // Project cd.';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd0 IS '集計ＣＤ０ // #MA.SUMMARY_CD // Aggregated cd. 0';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd1 IS '集計ＣＤ１ // #MA.SUMMARY_CD // Aggregated cd. 1';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd2 IS '集計ＣＤ２ // #MA.SUMMARY_CD // Aggregated cd. 2';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd3 IS '集計ＣＤ３ // #MA.SUMMARY_CD // Aggregated cd. 3';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd4 IS '集計ＣＤ４ // #MA.SUMMARY_CD // Aggregated cd. 4';


COMMENT ON COLUMN mbt_journal_snd_if.summary_cd5 IS '集計ＣＤ５ // #MA.SUMMARY_CD // Aggregated cd. 5';


COMMENT ON COLUMN mbt_journal_snd_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mbt_journal_snd_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mbt_journal_snd_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mbt_journal_snd_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mbt_journal_snd_if.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mbt_journal_snd_if.bp_typ IS '取引先区分 // #MA.MASTER_TYP // BP type';


COMMENT ON COLUMN mbt_journal_snd_if.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mbt_journal_snd_if.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mbt_journal_snd_if.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_sum_amt IS '基準通貨税込金額 // #MA.MONEY // Tax included amount (Base currency)';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_amt IS '基準通貨金額 // #MA.MONEY // Amount (Base currency)';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_tax_amt IS '基準通貨税額 // #MA.MONEY // Tax amount (Base currency)';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_cd IS '基準通貨ＣＤ // #MA.CUR_CD // Base currency cd.';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_upri IS '取引通貨単価 // #MA.MONEY // Unit price (Transaction currency)';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_sum_amt IS '取引通貨税込金額 // #MA.MONEY // Tax included amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_amt IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_tax_amt IS '取引通貨税額 // #MA.MONEY // Tax amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_upri IS '納税通貨単価 // #MA.MONEY // Unit price (Tax currency)';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_sum_amt IS '納税通貨税込金額 // #MA.MONEY // Tax included amount (Tax currency)';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_amt IS '納税通貨金額 // #MA.MONEY // Amount (Tax currency)';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_tax_amt IS '納税通貨税額 // #MA.MONEY // Tax amount (Tax currency)';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_cd IS '納税通貨ＣＤ // #MA.CUR_CD // Taxpaying currency cd.';


COMMENT ON COLUMN mbt_journal_snd_if.tax_typ IS '税区分 // #MA.AC_TAX_TYP // Tax type';


COMMENT ON COLUMN mbt_journal_snd_if.tax_cd IS '税ＣＤ // #MA.AC_TAX_CD // Tax cd.';


COMMENT ON COLUMN mbt_journal_snd_if.foreign_flg IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN mbt_journal_snd_if.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mbt_journal_snd_if.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_xrate IS '納税為替レート // #MA.MONEY // Taxpaying exchange rate';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_xrate_cd IS '納税為替レートＣＤ // #MA.XRATE_CD // Taxpaying exchange rate cd.';


COMMENT ON COLUMN mbt_journal_snd_if.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mbt_journal_snd_if.bill_no IS '請求／支払ＮＯ // #MA.BILL_PAY_NO // Billing/payment No.';


COMMENT ON COLUMN mbt_journal_snd_if.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mbt_journal_snd_if.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mbt_journal_snd_if.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mbt_journal_snd_if.cls_jnl_typ IS '決算仕訳区分 // #MA.CLS_JNL_TYP // Closing entry type';


COMMENT ON COLUMN mbt_journal_snd_if.alloc_jnl_flg IS '配賦仕訳ＦＬＧ // #MA.FLG // Allocation journal flg.';


COMMENT ON COLUMN mbt_journal_snd_if.spot_flg IS '都度精算ＦＬＧ // #MA.FLG // Settlement per transaction flg.';


COMMENT ON COLUMN mbt_journal_snd_if.sttl_schd_dt IS '決済予定日 // #MA.DT // Scheduled settlement date';


COMMENT ON COLUMN mbt_journal_snd_if.sttl_cd IS '決済方法ＣＤ // #MA.STTL_CD // Settlement method cd.';


COMMENT ON COLUMN mbt_journal_snd_if.bank_ac_cd IS '口座ＣＤ // #MA.BANK_AC_CD // Bank account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.other_ac_cd IS '相手勘定科目ＣＤ // #MA.AC_CD // Counterpart account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.other_sub_ac_cd IS '相手補助勘定科目ＣＤ // #MA.SUB_AC_CD // Counterpart subsidiary account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.other_dpt_cd IS '相手部門ＣＤ // #MA.AC_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN mbt_journal_snd_if.abstract1 IS '摘要１ // #MA.ABSTRACT_T // Abstract 1';


COMMENT ON COLUMN mbt_journal_snd_if.abstract2 IS '摘要２ // #MA.ABSTRACT_T // Abstract 2';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mbt_journal_snd_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mbt_journal_snd_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mbt_journal_snd_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mbt_journal_snd_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mbt_journal_snd_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mbt_journal_snd_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mbt_journal_snd_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_char30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_num1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_num2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_num3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_num4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_num5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_dt1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_dt2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_dt3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_dt4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_dt5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN mbt_journal_snd_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mbt_journal_snd_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mbt_journal_snd_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mbt_journal_snd_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_journal_snd_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_journal_snd_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_journal_snd_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_journal_snd_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_journal_snd_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_journal_snd_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_journal_snd_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_journal_snd_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_journal_snd_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mbt_journal_snd_if.base_cur_tax_base_amt IS '基準通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Base currency)';


COMMENT ON COLUMN mbt_journal_snd_if.trd_cur_tax_base_amt IS '取引通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Transaction currency)';


COMMENT ON COLUMN mbt_journal_snd_if.ptax_cur_tax_base_amt IS '納税通貨税額計算基準金額 // #MA.MONEY // Tax calculation base amount (Tax currency)';


COMMENT ON COLUMN mbt_journal_snd_if.itm_grp_typ IS '品目分類区分 // #MA.ITM_GRP_TYP // Item classification type';


COMMENT ON COLUMN mbt_journal_snd_if.itm_grp_cd IS '品目分類ＣＤ // #MA.ITM_GRP_CD // Item classification cd.';


COMMENT ON COLUMN mbt_journal_snd_if.bank_cd IS '銀行ＣＤ // #MA.BANK_CD // Bank cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_dpt_cd IS 'ＩＦ部門ＣＤ // #MA.IF_EXT_SYS_CD // IF dept. cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_ac_cd IS 'ＩＦ勘定科目ＣＤ // #MA.IF_EXT_SYS_CD // IF account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_sub_ac_cd IS 'ＩＦ補助勘定科目ＣＤ // #MA.IF_EXT_SYS_CD // IF subsidiary account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_project_cd IS 'ＩＦプロジェクトＣＤ // #MA.IF_EXT_SYS_CD // IF project cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd0 IS 'ＩＦ集計ＣＤ０ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 0';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd1 IS 'ＩＦ集計ＣＤ１ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 1';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd2 IS 'ＩＦ集計ＣＤ２ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 2';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd3 IS 'ＩＦ集計ＣＤ３ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd4 IS 'ＩＦ集計ＣＤ４ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 4';


COMMENT ON COLUMN mbt_journal_snd_if.if_summary_cd5 IS 'ＩＦ集計ＣＤ５ // #MA.IF_EXT_SYS_CD // IF aggregated cd. 5';


COMMENT ON COLUMN mbt_journal_snd_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.IF_EXT_SYS_CD // IF branch No. 1';


COMMENT ON COLUMN mbt_journal_snd_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.IF_EXT_SYS_CD // IF branch No. 2';


COMMENT ON COLUMN mbt_journal_snd_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.IF_EXT_SYS_CD // IF branch No. 3';


COMMENT ON COLUMN mbt_journal_snd_if.if_bp_cd IS 'ＩＦ取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF BP cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_base_cur_cd IS 'ＩＦ基準通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF base currency cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_trd_cur_cd IS 'ＩＦ取引通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_ptax_cur_cd IS 'ＩＦ納税通貨ＣＤ // #MA.IF_EXT_SYS_CD // IF taxpaying currency cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_tax_cd IS 'ＩＦ税ＣＤ // #MA.IF_EXT_SYS_CD // IF tax cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_usr_cd IS 'ＩＦ担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_sttl_cd IS 'ＩＦ決済方法ＣＤ // #MA.IF_EXT_SYS_CD // IF settlement method cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_bank_ac_cd IS 'ＩＦ口座ＣＤ // #MA.IF_EXT_SYS_CD // IF bank account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_bank_cd IS 'ＩＦ銀行ＣＤ // #MA.IF_EXT_SYS_CD // IF bank cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_other_ac_cd IS 'ＩＦ相手勘定科目ＣＤ // #MA.IF_EXT_SYS_CD // IF counterpart account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_other_sub_ac_cd IS 'ＩＦ相手補助勘定科目ＣＤ // #MA.IF_EXT_SYS_CD // IF counterpart subsidiary account cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_other_dpt_cd IS 'ＩＦ相手部門ＣＤ // #MA.IF_EXT_SYS_CD // IF counterpart dept. cd.';


COMMENT ON COLUMN mbt_journal_snd_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';

