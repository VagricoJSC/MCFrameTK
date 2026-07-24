\encoding UTF-8

COMMENT ON TABLE mst_yield_schd_snd_if_all IS '出来高予定送信ＩＦ // Output schedule export IF';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_SCHD_NO // Output schedule No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_mfg_loc_cd IS 'ＩＦ製造場所 // #MA.IF_EXT_SYS_CD // IF mfg. location';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_loc_nm IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_itm_cd IS '製造品目 // #MA.ITM_CD // Mfg. item';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_mfg_itm_cd IS 'ＩＦ製造品目 // #MA.IF_EXT_SYS_CD // IF mfg. item';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_itm_nm IS '製造品名 // #MA.ITM_NM // Mfg. item name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.oper_nm IS '工程名 // #MA.OPER_NM // Operation name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.schd_tm IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.trd_unit_yield_qty IS '取引単位出来高予定数量 // #MA.QTY // Transaction unit scheduled output qty.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.trd_unit_nm IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.base_unit_yield_qty IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_strg_loc_cd IS 'ＩＦ格納場所ＣＤ // #MA.IF_EXT_SYS_CD // IF storage location cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.strg_loc_nm IS '格納場所名 // #MA.LOC_NM // Storage location name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_strg_str_ln_cd IS 'ＩＦ格納棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF storage rack/line cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.strg_str_ln_nm IS '格納棚・ライン名 // #MA.STR_LN_NM // Storage rack/line name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.intr_rmrks IS '内部備考 // #MS.YIELD_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.inst_rpt_rmrks IS '指図書備考 // #MS.YIELD_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.mfg_sts_typ IS '製造状況区分（出来高） // #MS.MFG_STS_TYP // Mfg. status type (Output)';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_yield_schd_snd_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

