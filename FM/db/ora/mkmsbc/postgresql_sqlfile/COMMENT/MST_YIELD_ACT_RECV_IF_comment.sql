\encoding UTF-8

COMMENT ON VIEW mst_yield_act_recv_if IS '出来高実績受信ＩＦ // Output result import IF';


COMMENT ON COLUMN mst_yield_act_recv_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_yield_act_recv_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_yield_act_recv_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_yield_act_recv_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_yield_act_recv_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_yield_act_recv_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_yield_act_recv_if.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_yield_act_recv_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_yield_act_recv_if.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_yield_act_recv_if.unschd_act_flg IS '計画外実績ＦＬＧ // #MA.FLG // Unplanned result flg.';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_INST_NO // Output schedule No.';


COMMENT ON COLUMN mst_yield_act_recv_if.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_loc_cd IS 'ＩＦ製造場所 // #MA.IF_EXT_SYS_CD // IF mfg. location';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_loc_nm IS 'ＩＦ製造場所名 // #MA.IF_EXT_SYS_NM // IF mfg. location name';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_str_ln_cd IS '製造棚・ラインＣＤ // #MA.STR_LN_CD // Mfg. rack/line cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_str_ln_cd IS 'ＩＦ製造棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. rack/line cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_str_ln_nm IS 'ＩＦ製造棚・ライン名 // #MA.IF_EXT_SYS_NM // IF mfg. rack/line name';


COMMENT ON COLUMN mst_yield_act_recv_if.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_itm_cd IS '製造品目 // #MA.ITM_CD // Mfg. item';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_itm_cd IS 'ＩＦ製造品目 // #MA.IF_EXT_SYS_CD // IF mfg. item';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_itm_nm IS 'ＩＦ製造品名 // #MA.IF_EXT_SYS_NM // IF mfg. item name';


COMMENT ON COLUMN mst_yield_act_recv_if.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_oper_nm IS 'ＩＦ工程名 // #MA.IF_EXT_SYS_NM // IF operation name';


COMMENT ON COLUMN mst_yield_act_recv_if.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_yield_act_recv_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_yield_act_recv_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_yield_act_recv_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_yield_act_recv_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_yield_act_recv_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_yield_act_recv_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_yield_act_recv_if.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_yield_act_recv_if.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_yield_act_recv_if.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_trd_unit_nm IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN mst_yield_act_recv_if.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_rate IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN mst_yield_act_recv_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_yield_act_recv_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_yield_act_recv_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_yield_act_recv_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_yield_act_recv_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_yield_act_recv_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_yield_act_recv_if.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_yield_act_recv_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_rsn_cd IS '出来高理由ＣＤ // #MA.BIZ_RSN_CD // Output reason cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_yield_rsn_cd IS 'ＩＦ出来高理由ＣＤ // #MA.IF_EXT_SYS_CD // IF output reason cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_yield_rsn_nm IS 'ＩＦ出来高理由名 // #MA.IF_EXT_SYS_NM // IF output reason name';


COMMENT ON COLUMN mst_yield_act_recv_if.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_strg_loc_cd IS 'ＩＦ格納場所ＣＤ // #MA.IF_EXT_SYS_CD // IF storage location cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_strg_loc_nm IS 'ＩＦ格納場所名 // #MA.IF_EXT_SYS_NM // IF storage location name';


COMMENT ON COLUMN mst_yield_act_recv_if.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_strg_str_ln_cd IS 'ＩＦ格納棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF storage rack/line cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_strg_str_ln_nm IS 'ＩＦ格納棚・ライン名 // #MA.IF_EXT_SYS_NM // IF storage rack/line name';


COMMENT ON COLUMN mst_yield_act_recv_if.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN mst_yield_act_recv_if.same_lot_flg IS '同一ロットＦＬＧ // #MA.FLG // Same lot flg.';


COMMENT ON COLUMN mst_yield_act_recv_if.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_act_intr_rmrks IS '内部備考（出来高） // #MS.YIELD_ACT_INTR_RMRKS // Internal remarks (Output)';


COMMENT ON COLUMN mst_yield_act_recv_if.yield_act_rpt_rmrks IS '記録書備考（出来高） // #MS.YIELD_ACT_RPT_RMRKS // Record sheet remarks (Output)';


COMMENT ON COLUMN mst_yield_act_recv_if.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_yield_act_recv_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_yield_act_recv_if.itm_yield IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_act_dpt_cd IS '製造実績部門ＣＤ // #MA.DPT_CD // Mfg. result dept. cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_act_dpt_cd IS 'ＩＦ製造実績部門ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. result dept. cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_act_dpt_nm IS 'ＩＦ製造実績部門名 // #MA.IF_EXT_SYS_NM // IF mfg. result dept. name';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_act_usr_cd IS '製造実績責任者ＣＤ // #MA.USR_CD // Mfg. result PIC cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_act_usr_cd IS 'ＩＦ製造実績責任者ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. result management PIC cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_mfg_act_usr_nm IS 'ＩＦ製造実績責任者名 // #MA.IF_EXT_SYS_NM // IF mfg. result management PIC name';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_act_intr_rmrks IS '内部備考（製造） // #MS.MFG_ACT_INTR_RMRKS // Internal remarks (Mfg.)';


COMMENT ON COLUMN mst_yield_act_recv_if.mfg_act_rpt_rmrks IS '記録書備考（製造） // #MS.MFG_ACT_RPT_RMRKS // Record sheet remarks (Mfg.)';


COMMENT ON COLUMN mst_yield_act_recv_if.all_oper_act_reg_flg IS '全工程実績作成ＦＬＧ // #MA.FLG // All operation results creation flg.';


COMMENT ON COLUMN mst_yield_act_recv_if.ext_oper_act_no IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN mst_yield_act_recv_if.ext_yield_act_no IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_yield_act_recv_if.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_yield_act_recv_if.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_yield_act_recv_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_yield_act_recv_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_yield_act_recv_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_yield_act_recv_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_yield_act_recv_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_yield_act_recv_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_yield_act_recv_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_yield_act_recv_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_yield_act_recv_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

