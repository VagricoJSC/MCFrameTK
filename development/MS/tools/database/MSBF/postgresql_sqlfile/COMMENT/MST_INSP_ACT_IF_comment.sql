\encoding UTF-8

COMMENT ON VIEW mst_insp_act_if IS '検査実績送信ＩＦ // Inspection result export IF';


COMMENT ON COLUMN mst_insp_act_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_insp_act_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_insp_act_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_insp_act_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_insp_act_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_insp_act_if.dpt_st_dt IS '部門マスタ適用開始日 // #MA.DT // Dept. master application start date';


COMMENT ON COLUMN mst_insp_act_if.data_upd_ts IS '送信元レコード更新日時 // #MA.SYS_TS // Update date and time of source record';


COMMENT ON COLUMN mst_insp_act_if.bi_not_send_flg IS 'ＢＩ送信対象外ＦＬＧ // #MA.FLG // BI not to be exported flg.';


COMMENT ON COLUMN mst_insp_act_if.insp_act_d_no IS '検査実績明細ＮＯ // #MA.INSP_ACT_D_NO // Inspection result details No.';


COMMENT ON COLUMN mst_insp_act_if.insp_act_no IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN mst_insp_act_if.st_act_tm IS '検査開始実績日時 // #MA.TM // Actual inspection start date and time';


COMMENT ON COLUMN mst_insp_act_if.end_act_tm IS '検査終了実績日時 // #MA.TM // Actual inspection end date and time';


COMMENT ON COLUMN mst_insp_act_if.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_insp_act_if.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_insp_act_if.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_act_if.src_no1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN mst_insp_act_if.src_no2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN mst_insp_act_if.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_insp_act_if.insp_mtd_typ IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN mst_insp_act_if.insp_sts_typ IS '検査状況区分 // #MS.INSP_STS_TYP // Inspection status type';


COMMENT ON COLUMN mst_insp_act_if.st_schd_tm IS '検査開始予定日時 // #MA.TM // Scheduled inspection start date and time';


COMMENT ON COLUMN mst_insp_act_if.end_schd_tm IS '検査終了予定日時 // #MA.TM // Scheduled inspection end date and time';


COMMENT ON COLUMN mst_insp_act_if.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_insp_act_if.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_insp_act_if.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_insp_act_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_act_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_act_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_act_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_act_if.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_insp_act_if.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_insp_act_if.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_insp_act_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_insp_act_if.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_insp_act_if.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_insp_act_if.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_insp_act_if.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_insp_act_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_act_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_act_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_insp_act_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_insp_act_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_insp_act_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_insp_act_if.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_insp_act_if.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_insp_act_if.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_act_if.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_act_if.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_act_if.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_act_if.dfct_rsn_cd IS '不良理由ＣＤ // #MA.BIZ_RSN_CD // Defective reason cd.';


COMMENT ON COLUMN mst_insp_act_if.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_insp_act_if.intr_rmrks IS '内部備考 // #MS.INSP_ACT_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_act_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_insp_act_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_insp_act_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_insp_act_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_insp_act_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_insp_act_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_insp_act_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_insp_act_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_insp_act_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_insp_act_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_insp_act_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_insp_act_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_insp_act_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_insp_act_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_insp_act_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_insp_act_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_insp_act_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_insp_act_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_insp_act_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_insp_act_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_insp_act_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_insp_act_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_insp_act_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_insp_act_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_insp_act_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_insp_act_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_insp_act_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_insp_act_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_insp_act_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_insp_act_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_insp_act_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_insp_act_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_insp_act_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_insp_act_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_insp_act_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_insp_act_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_insp_act_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_insp_act_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_insp_act_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_insp_act_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_insp_act_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_insp_act_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_insp_act_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_insp_act_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_act_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_act_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_act_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_act_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_act_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_act_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_act_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_act_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_act_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

