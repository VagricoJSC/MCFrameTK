\encoding UTF-8

COMMENT ON VIEW mbt_account_if IS '勘定科目マスタ受信ＩＦ // Account master import IF';


COMMENT ON COLUMN mbt_account_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mbt_account_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mbt_account_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mbt_account_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mbt_account_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mbt_account_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mbt_account_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mbt_account_if.data_make_dt IS '送信元レコード作成日時 // #MA.TM // Creation date and time of source record';


COMMENT ON COLUMN mbt_account_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mbt_account_if.ac_cd IS '勘定科目ＣＤ // #MA.AC_CD // Account cd.';


COMMENT ON COLUMN mbt_account_if.ac_nm IS '勘定科目名 // #MA.AC_NM // Account name';


COMMENT ON COLUMN mbt_account_if.ac_nm_lcl1 IS '勘定科目名_ロケール１ // #MA.AC_NM // Account name_locale 1';


COMMENT ON COLUMN mbt_account_if.ac_nm_lcl2 IS '勘定科目名_ロケール２ // #MA.AC_NM // Account name_locale 2';


COMMENT ON COLUMN mbt_account_if.ac_nm_lcl3 IS '勘定科目名_ロケール３ // #MA.AC_NM // Account name_locale 3';


COMMENT ON COLUMN mbt_account_if.ac_nm2 IS '勘定科目略名 // #MA.AC_NM2 // Account abbreviation name';


COMMENT ON COLUMN mbt_account_if.ac_nm2_lcl1 IS '勘定科目略名_ロケール１ // #MA.AC_NM2 // Account abbreviation name_locale 1';


COMMENT ON COLUMN mbt_account_if.ac_nm2_lcl2 IS '勘定科目略名_ロケール２ // #MA.AC_NM2 // Account abbreviation name_locale 2';


COMMENT ON COLUMN mbt_account_if.ac_nm2_lcl3 IS '勘定科目略名_ロケール３ // #MA.AC_NM2 // Account abbreviation name_locale 3';


COMMENT ON COLUMN mbt_account_if.dc_typ IS '貸借区分 // #MA.DC_TYP // Debit and credit type';


COMMENT ON COLUMN mbt_account_if.sub_flg IS '補助科目使用ＦＬＧ // #MA.FLG // Subsidiary account used flg.';


COMMENT ON COLUMN mbt_account_if.ac_typ IS '勘定科目区分 // #MA.AC_CD_TYP // Account type';


COMMENT ON COLUMN mbt_account_if.ac_tax_cd IS '会計税ＣＤ // #MA.AC_TAX_CD // Accounting tax cd.';


COMMENT ON COLUMN mbt_account_if.ac_tax_typ IS '会計税区分 // #MA.AC_TAX_TYP // Accounting tax type';


COMMENT ON COLUMN mbt_account_if.foreign_flg IS '外貨ＦＬＧ // #MA.FLG // Foreign currency flg.';


COMMENT ON COLUMN mbt_account_if.sum0_flg IS '集計０使用ＦＬＧ // #MA.FLG // Aggregated 0 used flg.';


COMMENT ON COLUMN mbt_account_if.sum1_flg IS '集計１使用ＦＬＧ // #MA.FLG // Aggregated 1 used flg.';


COMMENT ON COLUMN mbt_account_if.sum2_flg IS '集計２使用ＦＬＧ // #MA.FLG // Aggregated 2 used flg.';


COMMENT ON COLUMN mbt_account_if.sum3_flg IS '集計３使用ＦＬＧ // #MA.FLG // Aggregated 3 used flg.';


COMMENT ON COLUMN mbt_account_if.sum4_flg IS '集計４使用ＦＬＧ // #MA.FLG // Aggregated 4 used flg.';


COMMENT ON COLUMN mbt_account_if.sum5_flg IS '集計５使用ＦＬＧ // #MA.FLG // Aggregated 5 used flg.';


COMMENT ON COLUMN mbt_account_if.project_flg IS 'プロジェクト使用ＦＬＧ // #MA.FLG // Project used flg.';


COMMENT ON COLUMN mbt_account_if.bp_flg IS '取引先使用ＦＬＧ // #MA.FLG // BP used flg.';


COMMENT ON COLUMN mbt_account_if.usr_flg IS '担当者使用ＦＬＧ // #MA.FLG // PIC used flg.';


COMMENT ON COLUMN mbt_account_if.bank_ac_flg IS '口座使用ＦＬＧ // #MA.FLG // Bank account used flg.';


COMMENT ON COLUMN mbt_account_if.ap_typ IS 'ＡＰ科目区分 // #MA.AC_TYP // AP type';


COMMENT ON COLUMN mbt_account_if.ar_typ IS 'ＡＲ科目区分 // #MA.AC_TYP // AR type';


COMMENT ON COLUMN mbt_account_if.ac_typ1 IS '科目予備区分１ // #MA.AC_TYP // Account spare type 1';


COMMENT ON COLUMN mbt_account_if.ac_typ2 IS '科目予備区分２ // #MA.AC_TYP // Account spare type 2';


COMMENT ON COLUMN mbt_account_if.ac_typ3 IS '科目予備区分３ // #MA.AC_TYP // Account spare type 3';


COMMENT ON COLUMN mbt_account_if.ac_typ4 IS '科目予備区分４ // #MA.AC_TYP // Account spare type 4';


COMMENT ON COLUMN mbt_account_if.ac_typ5 IS '科目予備区分５ // #MA.AC_TYP // Account spare type 5';


COMMENT ON COLUMN mbt_account_if.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mbt_account_if.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mbt_account_if.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mbt_account_if.if_sub_char1 IS 'ＩＦ予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // IF spare CHAR column 1';


COMMENT ON COLUMN mbt_account_if.if_sub_char2 IS 'ＩＦ予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // IF spare CHAR column 2';


COMMENT ON COLUMN mbt_account_if.if_sub_char3 IS 'ＩＦ予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // IF spare CHAR column 3';


COMMENT ON COLUMN mbt_account_if.if_sub_char4 IS 'ＩＦ予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // IF spare CHAR column 4';


COMMENT ON COLUMN mbt_account_if.if_sub_char5 IS 'ＩＦ予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // IF spare CHAR column 5';


COMMENT ON COLUMN mbt_account_if.if_sub_char6 IS 'ＩＦ予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // IF spare CHAR column 6';


COMMENT ON COLUMN mbt_account_if.if_sub_char7 IS 'ＩＦ予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // IF spare CHAR column 7';


COMMENT ON COLUMN mbt_account_if.if_sub_char8 IS 'ＩＦ予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // IF spare CHAR column 8';


COMMENT ON COLUMN mbt_account_if.if_sub_char9 IS 'ＩＦ予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // IF spare CHAR column 9';


COMMENT ON COLUMN mbt_account_if.if_sub_char10 IS 'ＩＦ予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // IF spare CHAR column 10';


COMMENT ON COLUMN mbt_account_if.if_sub_char11 IS 'ＩＦ予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // IF spare CHAR column 11';


COMMENT ON COLUMN mbt_account_if.if_sub_char12 IS 'ＩＦ予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // IF spare CHAR column 12';


COMMENT ON COLUMN mbt_account_if.if_sub_char13 IS 'ＩＦ予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // IF spare CHAR column 13';


COMMENT ON COLUMN mbt_account_if.if_sub_char14 IS 'ＩＦ予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // IF spare CHAR column 14';


COMMENT ON COLUMN mbt_account_if.if_sub_char15 IS 'ＩＦ予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // IF spare CHAR column 15';


COMMENT ON COLUMN mbt_account_if.if_sub_char16 IS 'ＩＦ予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // IF spare CHAR column 16';


COMMENT ON COLUMN mbt_account_if.if_sub_char17 IS 'ＩＦ予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // IF spare CHAR column 17';


COMMENT ON COLUMN mbt_account_if.if_sub_char18 IS 'ＩＦ予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // IF spare CHAR column 18';


COMMENT ON COLUMN mbt_account_if.if_sub_char19 IS 'ＩＦ予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // IF spare CHAR column 19';


COMMENT ON COLUMN mbt_account_if.if_sub_char20 IS 'ＩＦ予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // IF spare CHAR column 20';


COMMENT ON COLUMN mbt_account_if.if_sub_char21 IS 'ＩＦ予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // IF spare CHAR column 21';


COMMENT ON COLUMN mbt_account_if.if_sub_char22 IS 'ＩＦ予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // IF spare CHAR column 22';


COMMENT ON COLUMN mbt_account_if.if_sub_char23 IS 'ＩＦ予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // IF spare CHAR column 23';


COMMENT ON COLUMN mbt_account_if.if_sub_char24 IS 'ＩＦ予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // IF spare CHAR column 24';


COMMENT ON COLUMN mbt_account_if.if_sub_char25 IS 'ＩＦ予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // IF spare CHAR column 25';


COMMENT ON COLUMN mbt_account_if.if_sub_char26 IS 'ＩＦ予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // IF spare CHAR column 26';


COMMENT ON COLUMN mbt_account_if.if_sub_char27 IS 'ＩＦ予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // IF spare CHAR column 27';


COMMENT ON COLUMN mbt_account_if.if_sub_char28 IS 'ＩＦ予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // IF spare CHAR column 28';


COMMENT ON COLUMN mbt_account_if.if_sub_char29 IS 'ＩＦ予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // IF spare CHAR column 29';


COMMENT ON COLUMN mbt_account_if.if_sub_char30 IS 'ＩＦ予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // IF spare CHAR column 30';


COMMENT ON COLUMN mbt_account_if.if_sub_num1 IS 'ＩＦ予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // IF spare NUM column 1';


COMMENT ON COLUMN mbt_account_if.if_sub_num2 IS 'ＩＦ予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // IF spare NUM column 2';


COMMENT ON COLUMN mbt_account_if.if_sub_num3 IS 'ＩＦ予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // IF spare NUM column 3';


COMMENT ON COLUMN mbt_account_if.if_sub_num4 IS 'ＩＦ予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // IF spare NUM column 4';


COMMENT ON COLUMN mbt_account_if.if_sub_num5 IS 'ＩＦ予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // IF spare NUM column 5';


COMMENT ON COLUMN mbt_account_if.if_sub_dt1 IS 'ＩＦ予備ＤＡＴＥ項目１ // #MA.DT // IF spare DATE column 1';


COMMENT ON COLUMN mbt_account_if.if_sub_dt2 IS 'ＩＦ予備ＤＡＴＥ項目２ // #MA.DT // IF spare DATE column 2';


COMMENT ON COLUMN mbt_account_if.if_sub_dt3 IS 'ＩＦ予備ＤＡＴＥ項目３ // #MA.DT // IF spare DATE column 3';


COMMENT ON COLUMN mbt_account_if.if_sub_dt4 IS 'ＩＦ予備ＤＡＴＥ項目４ // #MA.DT // IF spare DATE column 4';


COMMENT ON COLUMN mbt_account_if.if_sub_dt5 IS 'ＩＦ予備ＤＡＴＥ項目５ // #MA.DT // IF spare DATE column 5';


COMMENT ON COLUMN mbt_account_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mbt_account_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mbt_account_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mbt_account_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_account_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_account_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_account_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_account_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_account_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_account_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_account_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_account_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_account_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

