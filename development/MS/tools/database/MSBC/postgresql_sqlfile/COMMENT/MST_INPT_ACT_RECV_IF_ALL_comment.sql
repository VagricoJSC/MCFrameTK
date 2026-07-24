\encoding UTF-8

COMMENT ON TABLE mst_inpt_act_recv_if_all IS '投入実績受信ＩＦ // Input result import IF';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_loc_cd IS 'ＩＦ製造場所 // #MA.IF_EXT_SYS_CD // IF mfg. location';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_loc_nm IS 'ＩＦ製造場所名 // #MA.IF_EXT_SYS_NM // IF mfg. location name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_itm_cd IS '製造品目 // #MA.ITM_CD // Mfg. item';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_itm_cd IS 'ＩＦ製造品目 // #MA.IF_EXT_SYS_CD // IF mfg. item';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_mfg_itm_nm IS 'ＩＦ製造品名 // #MA.IF_EXT_SYS_NM // IF mfg. item name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_oper_nm IS 'ＩＦ工程名 // #MA.IF_EXT_SYS_NM // IF operation name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_loc_cd IS 'ＩＦ投入場所ＣＤ // #MA.IF_EXT_SYS_CD // IF input location cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_loc_nm IS 'ＩＦ投入場所名 // #MA.IF_EXT_SYS_NM // IF input location name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_str_ln_cd IS 'ＩＦ投入棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF input rack/line cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_str_ln_nm IS 'ＩＦ投入棚・ライン名 // #MA.IF_EXT_SYS_NM // IF input rack/line name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_stk_bp_nm IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_stk_arrv_bp_nm IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.base_unit_inpt_qty IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.cont_qty IS '有効成分（投入数量） // #MA.QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.acxfr_qty IS '他勘定振替数量 // #MA.QTY // Other accounting transfer qty.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.acxfr_rsn_cd IS '他勘定振替理由ＣＤ // #MA.BIZ_RSN_CD // Other accounting transfer reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_acxfr_rsn_cd IS 'ＩＦ他勘定振替理由ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_acxfr_rsn_nm IS 'ＩＦ他勘定振替理由名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer reason name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.acxfr_bd_dpt_cd IS '他勘定振替負担部門ＣＤ // #MA.DPT_CD // Other accounting transfer charged dept. cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_acxfr_bd_dpt_cd IS 'ＩＦ他勘定振替負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer charged dept. cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_acxfr_bd_dpt_nm IS 'ＩＦ他勘定振替負担部門名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer charged dept. name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.act_intr_rmrks IS '内部備考 // #MS.INPT_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.inpt_act_rpt_rmrks IS '記録書備考 // #MS.INPT_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.act_trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.not_pd_chk_flg IS '期限チェックしないＦＬＧ // #MA.FLG // No expiration check flg.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_typ IS 'ＩＦ投入区分 // #MS.IF_INPT_TYP // IF input type';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.inpt_rsn_cd IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_rsn_cd IS 'ＩＦ投入理由ＣＤ // #MA.IF_EXT_SYS_CD // IF input reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_inpt_rsn_nm IS 'ＩＦ投入理由名 // #MA.IF_EXT_SYS_NM // IF input reason name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.loss_rsn_cd IS 'ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_loss_rsn_cd IS 'ＩＦロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_loss_rsn_nm IS 'ＩＦロス理由名 // #MA.IF_EXT_SYS_NM // IF loss reason name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.old_loss_rsn_cd IS '変更前ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd. before change';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_old_loss_rsn_cd IS 'ＩＦ変更前ロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason before change cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_oper_act_no IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_inpt_act_no IS '外部投入実績ＮＯ // #MA.EXT_INPT_ACT_NO // External input result No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ext_yield_act_no IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_act_recv_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

