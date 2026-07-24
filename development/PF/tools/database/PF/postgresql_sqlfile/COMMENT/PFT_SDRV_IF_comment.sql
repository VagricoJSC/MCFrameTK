\encoding UTF-8

COMMENT ON VIEW pft_sdrv_if IS '送受信ＩＦ // Export and import IF';


COMMENT ON COLUMN pft_sdrv_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN pft_sdrv_if.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN pft_sdrv_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN pft_sdrv_if.not_send_flg IS '送信対象外ＦＬＧ // #MA.FLG // Not to be exported flg.';


COMMENT ON COLUMN pft_sdrv_if.conv_ope IS 'コード変換オペレーション // #MA.OPERATION // Code convert operation';


COMMENT ON COLUMN pft_sdrv_if.file_io_ope IS 'ファイル入出力オペレーション // #MA.OPERATION // File I/O operations';


COMMENT ON COLUMN pft_sdrv_if.web_api_ope IS 'ＷｅｂＡＰＩオペレーション // #MA.OPERATION // Web API operation';


COMMENT ON COLUMN pft_sdrv_if.cmd_exec_ope IS 'コマンド実行オペレーション // #MA.OPERATION // Command execution operation';


COMMENT ON COLUMN pft_sdrv_if.sdrv_sts_typ IS '送受信状況区分 // #MA.SDRV_STS_TYP // Exporting and importing status type';


COMMENT ON COLUMN pft_sdrv_if.sdrv_tm IS '送受信日時 // #MA.TM // Exporting/importing date and time';


COMMENT ON COLUMN pft_sdrv_if.sdrv_clt_id IS '送受信クライアントＩＤ // #MA.MACHINE // Exporting/importing client ID';


COMMENT ON COLUMN pft_sdrv_if.sdrv_usr_id IS '送受信ユーザＩＤ // #MA.FCM_USR_ID // Exporting/importing user ID';


COMMENT ON COLUMN pft_sdrv_if.sdrv_usr_nm IS '送受信ユーザ名 // #MA.FCM_USR_NM // Exporting/importing user name';


COMMENT ON COLUMN pft_sdrv_if.attr_char11 IS '業務情報文字列１１ // #MA.IF_SUB_CHAR11 // Business info. character string 11';


COMMENT ON COLUMN pft_sdrv_if.attr_char12 IS '業務情報文字列１２ // #MA.IF_SUB_CHAR12 // Business info. character string 12';


COMMENT ON COLUMN pft_sdrv_if.attr_char13 IS '業務情報文字列１３ // #MA.IF_SUB_CHAR13 // Business info. character string 13';


COMMENT ON COLUMN pft_sdrv_if.attr_char14 IS '業務情報文字列１４ // #MA.IF_SUB_CHAR14 // Business info. character string 14';


COMMENT ON COLUMN pft_sdrv_if.attr_char15 IS '業務情報文字列１５ // #MA.IF_SUB_CHAR15 // Business info. character string 15';


COMMENT ON COLUMN pft_sdrv_if.attr_char16 IS '業務情報文字列１６ // #MA.IF_SUB_CHAR16 // Business info. character string 16';


COMMENT ON COLUMN pft_sdrv_if.attr_char17 IS '業務情報文字列１７ // #MA.IF_SUB_CHAR17 // Business info. character string 17';


COMMENT ON COLUMN pft_sdrv_if.attr_char18 IS '業務情報文字列１８ // #MA.IF_SUB_CHAR18 // Business info. character string 18';


COMMENT ON COLUMN pft_sdrv_if.attr_char19 IS '業務情報文字列１９ // #MA.IF_SUB_CHAR19 // Business info. character string 19';


COMMENT ON COLUMN pft_sdrv_if.attr_char20 IS '業務情報文字列２０ // #MA.IF_SUB_CHAR20 // Business info. character string 20';


COMMENT ON COLUMN pft_sdrv_if.attr_char21 IS '業務情報文字列２１ // #MA.IF_SUB_CHAR21 // Business info. character string 21';


COMMENT ON COLUMN pft_sdrv_if.attr_char22 IS '業務情報文字列２２ // #MA.IF_SUB_CHAR22 // Business info. character string 22';


COMMENT ON COLUMN pft_sdrv_if.attr_char23 IS '業務情報文字列２３ // #MA.IF_SUB_CHAR23 // Business info. character string 23';


COMMENT ON COLUMN pft_sdrv_if.attr_char24 IS '業務情報文字列２４ // #MA.IF_SUB_CHAR24 // Business info. character string 24';


COMMENT ON COLUMN pft_sdrv_if.attr_char25 IS '業務情報文字列２５ // #MA.IF_SUB_CHAR25 // Business info. character string 25';


COMMENT ON COLUMN pft_sdrv_if.attr_char26 IS '業務情報文字列２６ // #MA.IF_SUB_CHAR26 // Business info. character string 26';


COMMENT ON COLUMN pft_sdrv_if.attr_char27 IS '業務情報文字列２７ // #MA.IF_SUB_CHAR27 // Business info. character string 27';


COMMENT ON COLUMN pft_sdrv_if.attr_char28 IS '業務情報文字列２８ // #MA.IF_SUB_CHAR28 // Business info. character string 28';


COMMENT ON COLUMN pft_sdrv_if.attr_char29 IS '業務情報文字列２９ // #MA.IF_SUB_CHAR29 // Business info. character string 29';


COMMENT ON COLUMN pft_sdrv_if.attr_char30 IS '業務情報文字列３０ // #MA.IF_SUB_CHAR30 // Business info. character string 30';


COMMENT ON COLUMN pft_sdrv_if.attr_tm1 IS '業務情報日時１ // #MA.TM // Business info. date and time 1';


COMMENT ON COLUMN pft_sdrv_if.attr_tm2 IS '業務情報日時２ // #MA.TM // Business info. date and time 2';


COMMENT ON COLUMN pft_sdrv_if.attr_tm3 IS '業務情報日時３ // #MA.TM // Business info. date and time 3';


COMMENT ON COLUMN pft_sdrv_if.attr_tm4 IS '業務情報日時４ // #MA.TM // Business info. date and time 4';


COMMENT ON COLUMN pft_sdrv_if.attr_tm5 IS '業務情報日時５ // #MA.TM // Business info. date and time 5';


COMMENT ON COLUMN pft_sdrv_if.not_send_upd_flg IS '送信後訂正不可ＦＬＧ // #MA.FLG // Uncorrectable after exporting flg.';


COMMENT ON COLUMN pft_sdrv_if.sdrv_if_rmrks IS '備考 // #MA.SDRV_IF_RMRKS // Remarks';


COMMENT ON COLUMN pft_sdrv_if.attr_char1 IS '業務情報文字列１ // #MA.IF_SUB_CHAR1 // Business info. character string 1';


COMMENT ON COLUMN pft_sdrv_if.attr_char2 IS '業務情報文字列２ // #MA.IF_SUB_CHAR2 // Business info. character string 2';


COMMENT ON COLUMN pft_sdrv_if.attr_char3 IS '業務情報文字列３ // #MA.IF_SUB_CHAR3 // Business info. character string 3';


COMMENT ON COLUMN pft_sdrv_if.attr_char4 IS '業務情報文字列４ // #MA.IF_SUB_CHAR4 // Business info. character string 4';


COMMENT ON COLUMN pft_sdrv_if.attr_char5 IS '業務情報文字列５ // #MA.IF_SUB_CHAR5 // Business info. character string 5';


COMMENT ON COLUMN pft_sdrv_if.attr_char6 IS '業務情報文字列６ // #MA.IF_SUB_CHAR6 // Business info. character string 6';


COMMENT ON COLUMN pft_sdrv_if.attr_char7 IS '業務情報文字列７ // #MA.IF_SUB_CHAR7 // Business info. character string 7';


COMMENT ON COLUMN pft_sdrv_if.attr_char8 IS '業務情報文字列８ // #MA.IF_SUB_CHAR8 // Business info. character string 8';


COMMENT ON COLUMN pft_sdrv_if.attr_char9 IS '業務情報文字列９ // #MA.IF_SUB_CHAR9 // Business info. character string 9';


COMMENT ON COLUMN pft_sdrv_if.attr_char10 IS '業務情報文字列１０ // #MA.IF_SUB_CHAR10 // Business info. character string 10';


COMMENT ON COLUMN pft_sdrv_if.attr_num1 IS '業務情報数値１ // #MA.IF_SUB_NUM1 // Business info. numerical value 1';


COMMENT ON COLUMN pft_sdrv_if.attr_num2 IS '業務情報数値２ // #MA.IF_SUB_NUM2 // Business info. numerical value 2';


COMMENT ON COLUMN pft_sdrv_if.attr_num3 IS '業務情報数値３ // #MA.IF_SUB_NUM3 // Business info. numerical value 3';


COMMENT ON COLUMN pft_sdrv_if.attr_num4 IS '業務情報数値４ // #MA.IF_SUB_NUM4 // Business info. numerical value 4';


COMMENT ON COLUMN pft_sdrv_if.attr_num5 IS '業務情報数値５ // #MA.IF_SUB_NUM5 // Business info. numerical value 5';


COMMENT ON COLUMN pft_sdrv_if.attr_dt1 IS '業務情報日付１ // #MA.DT // Business info. date 1';


COMMENT ON COLUMN pft_sdrv_if.attr_dt2 IS '業務情報日付２ // #MA.DT // Business info. date 2';


COMMENT ON COLUMN pft_sdrv_if.attr_dt3 IS '業務情報日付３ // #MA.DT // Business info. date 3';


COMMENT ON COLUMN pft_sdrv_if.attr_dt4 IS '業務情報日付４ // #MA.DT // Business info. date 4';


COMMENT ON COLUMN pft_sdrv_if.attr_dt5 IS '業務情報日付５ // #MA.DT // Business info. date 5';


COMMENT ON COLUMN pft_sdrv_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN pft_sdrv_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN pft_sdrv_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN pft_sdrv_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN pft_sdrv_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN pft_sdrv_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN pft_sdrv_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN pft_sdrv_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN pft_sdrv_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN pft_sdrv_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN pft_sdrv_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN pft_sdrv_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN pft_sdrv_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

