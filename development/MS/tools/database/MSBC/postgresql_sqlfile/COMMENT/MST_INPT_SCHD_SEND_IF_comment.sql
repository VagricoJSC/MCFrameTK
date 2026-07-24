\encoding UTF-8

COMMENT ON VIEW mst_inpt_schd_send_if IS '投入予定送信ＩＦ // Input schedule export IF';


COMMENT ON COLUMN mst_inpt_schd_send_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_inpt_schd_send_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_inpt_schd_send_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_mfg_loc_cd IS 'ＩＦ製造場所 // #MA.IF_EXT_SYS_CD // IF mfg. location';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_loc_nm IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_itm_cd IS '製造品目 // #MA.ITM_CD // Mfg. item';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_mfg_itm_cd IS 'ＩＦ製造品目 // #MA.IF_EXT_SYS_CD // IF mfg. item';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_itm_nm IS '製造品名 // #MA.ITM_NM // Mfg. item name';


COMMENT ON COLUMN mst_inpt_schd_send_if.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.oper_nm IS '工程名 // #MA.OPER_NM // Operation name';


COMMENT ON COLUMN mst_inpt_schd_send_if.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_inpt_schd_send_if.schd_tm IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_alt_grp_cd IS 'ＩＦ代替グループＣＤ // #MA.IF_EXT_SYS_CD // IF alternative group cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_grp_nm IS '代替グループ名 // #MA.ALT_GRP_NM // Alternative group name';


COMMENT ON COLUMN mst_inpt_schd_send_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_inpt_schd_send_if.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_inpt_qty IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_rqmt_qty IS '基準単位必要数量 // #MA.QTY // Base unit required qty.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_fxd_rqmt_qty IS '基準単位固定必要数量 // #MA.QTY // Base unit fixed required qty.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_inpt_loc_cd IS 'ＩＦ投入場所ＣＤ // #MA.IF_EXT_SYS_CD // IF input location cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_loc_nm IS '投入場所名 // #MA.LOC_NM // Input location name';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_inpt_str_ln_cd IS 'ＩＦ投入棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF input rack/line cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_str_ln_nm IS '投入棚・ライン名 // #MA.STR_LN_NM // Input rack/line name';


COMMENT ON COLUMN mst_inpt_schd_send_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.gd_nm IS '格付名 // #MA.STK_GD_NM // Grading name';


COMMENT ON COLUMN mst_inpt_schd_send_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_schd_send_if.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_sno1 IS '引当手配ＮＯ１ // #MA.SNO1 // Allocation SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_sno2 IS '引当手配ＮＯ２ // #MA.SNO2 // Allocation SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_sno3 IS '引当手配ＮＯ３ // #MA.SNO3 // Allocation SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_sno4 IS '引当手配ＮＯ４ // #MA.SNO4 // Allocation SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_schd_send_if.bkf_typ IS '投入品バックフラッシュ区分 // #MA.BKF_TYP // Input item backflush type';


COMMENT ON COLUMN mst_inpt_schd_send_if.cont_inpt_qty IS '有効成分（投入数量） // #MA.CONT_QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN mst_inpt_schd_send_if.cont_rqmt_qty IS '有効成分（必要数量） // #MA.CONT_QTY // Active ingredient (Required qty.)';


COMMENT ON COLUMN mst_inpt_schd_send_if.cont_fxd_rqmt_qty IS '有効成分（固定必要数量） // #MA.CONT_QTY // Active ingredient (Fixed required qty.)';


COMMENT ON COLUMN mst_inpt_schd_send_if.cont_fctr_unit_cd IS '有効成分単位ＣＤ // #MA.UNIT_CD // Active ingredient unit cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_cont_fctr_unit_cd IS 'ＩＦ有効成分単位ＣＤ // #MA.IF_EXT_SYS_CD // IF active ingredient unit cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.cont_fctr_unit_nm IS '有効成分単位名 // #MA.UNIT_NM // Active ingredient unit name';


COMMENT ON COLUMN mst_inpt_schd_send_if.std_cont_fctr IS '標準有効成分係数 // #MA.STD_CONT_FCTR // Standard active ingredient coefficient';


COMMENT ON COLUMN mst_inpt_schd_send_if.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_inpt_schd_send_if.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_inpt_schd_send_if.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mst_inpt_schd_send_if.lot_mix_flg IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.sublot_mix_flg IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.yield_calc_flg IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_flg IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.base_unit_alt_qty IS '基準単位代替元数量 // #MA.QTY // Base unit alternative sources qty.';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_itm_fix_flg IS '代替品目指定ＦＬＧ // #MA.FLG // Alternative item specification flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_alloc_prio IS '代替品目引当優先順位 // #MA.INT // Alternative item allocation priority';


COMMENT ON COLUMN mst_inpt_schd_send_if.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mst_inpt_schd_send_if.alloc_ctl_typ IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_rsn_cd IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_inpt_rsn_cd IS 'ＩＦ投入理由ＣＤ // #MA.IF_EXT_SYS_CD // IF input reason cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.inpt_rsn_nm IS '投入理由名 // #MA.BIZ_RSN_NM // Input reason name';


COMMENT ON COLUMN mst_inpt_schd_send_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_inpt_schd_send_if.intr_rmrks IS '内部備考 // #MS.INPT_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_inpt_schd_send_if.inst_rpt_rmrks IS '指図書備考 // #MS.INPT_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN mst_inpt_schd_send_if.mfg_sts_typ IS '製造状況区分（投入） // #MS.MFG_STS_TYP // Mfg. status (Input)';


COMMENT ON COLUMN mst_inpt_schd_send_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_inpt_schd_send_if.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_inpt_schd_send_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_inpt_schd_send_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_inpt_schd_send_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_inpt_schd_send_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_inpt_schd_send_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_schd_send_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_schd_send_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_schd_send_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_schd_send_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

