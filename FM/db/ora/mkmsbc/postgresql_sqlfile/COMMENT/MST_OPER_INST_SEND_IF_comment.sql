\encoding UTF-8

COMMENT ON VIEW mst_oper_inst_send_if IS '工程指図送信ＩＦ // Operation order export IF';


COMMENT ON COLUMN mst_oper_inst_send_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_oper_inst_send_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_oper_inst_send_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_oper_inst_send_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_oper_inst_send_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_loc_cd IS 'ＩＦ製造場所 // #MA.IF_EXT_SYS_CD // IF mfg. location';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_loc_nm IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_itm_cd IS '製造品目 // #MA.ITM_CD // Mfg. item';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_itm_cd IS 'ＩＦ製造品目 // #MA.IF_EXT_SYS_CD // IF mfg. item';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_itm_nm IS '製造品名 // #MA.ITM_NM // Mfg. item name';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_nm IS '工程名 // #MA.OPER_NM // Operation name';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_oper_inst_send_if.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mst_oper_inst_send_if.st_schd_tm IS '着手予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.end_schd_tm IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_loc_cd IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_oper_loc_cd IS 'ＩＦ工程場所ＣＤ // #MA.IF_EXT_SYS_CD // IF operation location cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_loc_nm IS '工程場所名 // #MA.LOC_NM // Operation location name';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_str_ln_cd IS '工程棚・ラインＣＤ // #MA.STR_LN_CD // Operation rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_oper_str_ln_cd IS 'ＩＦ工程棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF operation rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_str_ln_nm IS '工程棚・ライン名 // #MA.STR_LN_NM // Operation rack/line name';


COMMENT ON COLUMN mst_oper_inst_send_if.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_std_qty IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_conv_qty IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_unit_qty IS '工程単位数量 // #MA.QTY // Operation unit qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_unit_cd IS '工程単位ＣＤ // #MA.UNIT_CD // Operation unit cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_oper_unit_cd IS 'ＩＦ工程単位ＣＤ // #MA.IF_EXT_SYS_CD // IF operation unit cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_unit_nm IS '工程単位名 // #MA.UNIT_NM // Operation unit name';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_unit_conv_rnd_typ IS '工程換算端数処理区分 // #MA.RND_TYP // Operation conversion rounding type';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_unit_dec_place IS '工程単位小数部有効桁数 // #MA.DEC_PLACE // Operation unit number of decimal places';


COMMENT ON COLUMN mst_oper_inst_send_if.bkf_flg IS 'バックフラッシュ許可ＦＬＧ // #MA.FLG // Allow backflush flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.wk_cost_calc_flg IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_usr_cd IS 'ＩＦ担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.usr_nm IS '担当者名 // #MA.USR_NM // PIC name';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_lower_yield IS '工程下限収率 // #MA.YIELD // Operation min. yield';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_std_yield IS '工程標準収率 // #MA.YIELD // Operation standard yield';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_upper_yield IS '工程上限収率 // #MA.YIELD // Operation max. yield';


COMMENT ON COLUMN mst_oper_inst_send_if.wip_rate IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN mst_oper_inst_send_if.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.intr_rmrks IS '内部備考（工程） // #MS.OPER_INST_INTR_RMRKS // Internal remarks (Operation)';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_rpt_rmrks IS '指図書備考（工程） // #MS.OPER_INST_RPT_RMRKS // Order sheet remarks (Operation)';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_sts_typ IS '製造状況区分（工程） // #MS.MFG_STS_TYP // Mfg. status (Operation)';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_mtd_typ IS '生産方法区分 // #MS.MFG_MTD_TYP // Production method type';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_oper_inst_send_if.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_oper_inst_send_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_oper_inst_send_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_oper_inst_send_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_oper_inst_send_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_oper_inst_send_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_oper_inst_send_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_oper_inst_send_if.strg_loc_cd IS '格納先場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_strg_loc_cd IS 'ＩＦ格納場所ＣＤ // #MA.IF_EXT_SYS_CD // IF storage location cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.strg_loc_nm IS '格納先場所名 // #MA.LOC_NM // Storage location name';


COMMENT ON COLUMN mst_oper_inst_send_if.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_strg_str_ln_cd IS 'ＩＦ格納棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF storage rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.strg_str_ln_nm IS '格納棚・ライン名 // #MA.STR_LN_NM // Storage rack/line name';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_str_ln_cd IS '製造棚・ラインＣＤ // #MA.STR_LN_CD // Mfg. rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_mfg_str_ln_cd IS 'ＩＦ製造棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. rack/line cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_str_ln_nm IS '製造棚・ライン名 // #MA.STR_LN_NM // Mfg. rack/line name';


COMMENT ON COLUMN mst_oper_inst_send_if.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_wg_cd IS 'ＩＦワーキンググループＣＤ // #MA.IF_EXT_SYS_CD // IF working group cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.wg_nm IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN mst_oper_inst_send_if.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_site_cd IS 'ＩＦ工場・物流倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mst_oper_inst_send_if.itm_lower_yield IS '品目下限収率 // #MA.YIELD // Item min. yield';


COMMENT ON COLUMN mst_oper_inst_send_if.itm_std_yield IS '品目標準収率 // #MA.YIELD // Item standard yield';


COMMENT ON COLUMN mst_oper_inst_send_if.itm_upper_yield IS '品目上限収率 // #MA.YIELD // Item max. yield';


COMMENT ON COLUMN mst_oper_inst_send_if.base_unit_yield_qty IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.base_unit_inst_qty IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN mst_oper_inst_send_if.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_st_schd_tm IS '製造着手予定日時 // #MA.TM // Scheduled mfg. start date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_end_schd_tm IS '製造終了予定日時 // #MA.TM // Scheduled mfg. end date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_dt IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_prnt_tm IS '指図書発行日時 // #MA.TM // Order sheet issued date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_prnt_flg IS '指図書発行済ＦＬＧ // #MA.FLG // Order sheet issued flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_flg IS '承認対象ＦＬＧ // #MA.FLG // For approval flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_aprv_sts_typ IS '製造承認状況区分 // #MS.MFG_APRV_STS_TYP // Mfg. approval status type';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_aprv_dpt_cd IS 'ＩＦ承認部門ＣＤ // #MA.IF_EXT_SYS_CD // IF approval dept. cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_dpt_nm IS '承認部門名 // #MA.DPT_NM // Approval dept. name';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_aprv_usr_cd IS 'ＩＦ承認者ＣＤ // #MA.IF_EXT_SYS_CD // IF approver cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_usr_nm IS '承認者名 // #MA.USR_NM // Approver name';


COMMENT ON COLUMN mst_oper_inst_send_if.aprv_rsn IS '承認理由 // #MS.APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_oper_inst_send_if.disp_pd IS '印字用表示期限 // #MS.DISP_PD // Display expiration for print';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_inst_dpt_cd IS 'ＩＦ指図部門ＣＤ // #MA.IF_EXT_SYS_CD // IF order dept. cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_dpt_nm IS '指図部門名 // #MA.DPT_NM // Order dept. name';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.if_inst_usr_cd IS 'ＩＦ指図担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF order PIC cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_usr_nm IS '指図担当者名 // #MA.USR_NM // Order PIC name';


COMMENT ON COLUMN mst_oper_inst_send_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.schd_chg_flg IS '計画変更ＦＬＧ // #MA.FLG // Plan changed flg.';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_inst_unit_typ IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN mst_oper_inst_send_if.oper_rsrc IS '工程資源 // #MA.OPER_RSRC // Operation resources';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_intr_rmrks IS '内部備考（製造） // #MS.MFG_INST_INTR_RMRKS // Internal remarks (Mfg.)';


COMMENT ON COLUMN mst_oper_inst_send_if.mfg_inst_rpt_rmrks IS '指図書備考（製造） // #MS.MFG_INST_RPT_RMRKS // Order sheet remarks (Mfg.)';


COMMENT ON COLUMN mst_oper_inst_send_if.inst_po_cnt_rmrks IS '指図・発注連絡備考 // #MS.INST_PO_CNT_RMRKS // Order/PO contact remarks';


COMMENT ON COLUMN mst_oper_inst_send_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_oper_inst_send_if.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_oper_inst_send_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_oper_inst_send_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_oper_inst_send_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_oper_inst_send_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_oper_inst_send_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_oper_inst_send_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_oper_inst_send_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_oper_inst_send_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

