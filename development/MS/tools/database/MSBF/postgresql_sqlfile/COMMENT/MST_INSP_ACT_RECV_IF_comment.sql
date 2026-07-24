\encoding UTF-8

COMMENT ON VIEW mst_insp_act_recv_if IS '検査実績受信ＩＦ // Inspection result import IF';


COMMENT ON COLUMN mst_insp_act_recv_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_insp_act_recv_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_insp_act_recv_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_insp_act_recv_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_insp_act_recv_if.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_insp_act_recv_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_insp_act_recv_if.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_insp_act_recv_if.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_act_recv_if.insp_schd_no IS '検査予定ＮＯ // #MA.INSP_SCHD_NO // Inspection schedule No.';


COMMENT ON COLUMN mst_insp_act_recv_if.st_act_tm IS '検査開始日時 // #MA.TM // Inspection start date and time';


COMMENT ON COLUMN mst_insp_act_recv_if.end_act_tm IS '検査終了日時 // #MA.TM // Inspection finish date and time';


COMMENT ON COLUMN mst_insp_act_recv_if.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_act_usr_cd IS 'ＩＦ実施担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC of implement cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_act_usr_nm IS 'ＩＦ実施担当者名 // #MA.IF_EXT_SYS_NM // IF PIC of implement name';


COMMENT ON COLUMN mst_insp_act_recv_if.act_dpt_cd IS '実施担当部門ＣＤ // #MA.DPT_CD // Implementation dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_act_dpt_cd IS 'ＩＦ実施担当部門ＣＤ // #MA.IF_EXT_SYS_CD // IF implementation dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_act_dpt_nm IS 'ＩＦ実施担当部門名 // #MA.IF_EXT_SYS_NM // IF implementation dept. name';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_quality_typ IS '良品区分（抜取） // #MA.QUALITY_TYP // Conforming type (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_gd_cd IS '格付ＣＤ（抜取） // #MA.STK_GD_CD // Grading cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_gd_cd IS 'ＩＦ格付ＣＤ（抜取） // #MA.IF_EXT_SYS_CD // IF grading cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_gd_nm IS 'ＩＦ格付名（抜取） // #MA.IF_EXT_SYS_NM // IF grading name (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_dfct_rsn_cd IS '不良理由ＣＤ（抜取） // #MA.BIZ_RSN_CD // Defective reason cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_dfct_rsn_cd IS 'ＩＦ不良理由ＣＤ（抜取） // #MA.IF_EXT_SYS_CD // IF defective reason cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_dfct_rsn_nm IS 'ＩＦ不良理由名（抜取） // #MA.IF_EXT_SYS_NM // IF defective reason name (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_insp_act_recv_if.vld_dt_upd_flg IS '有効期限更新ＦＬＧ // #MA.FLG // Expiration date update flg.';


COMMENT ON COLUMN mst_insp_act_recv_if.lmt_dt_frm IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN mst_insp_act_recv_if.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_insp_act_recv_if.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mst_insp_act_recv_if.intr_rmrks IS '内部備考 // #MS.INSP_INST_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_act_recv_if.lot_rmrks IS 'ロット備考 // #MS.LOT_RMRKS // Lot remarks';


COMMENT ON COLUMN mst_insp_act_recv_if.imp_only_judg IS '判定のみ取込ＦＬＧ // #MA.FLG // Import decision only flg.';


COMMENT ON COLUMN mst_insp_act_recv_if.insp_judg_rslt_typ IS '検査判定結果区分 // #MS.INSP_JUDG_RSLT_TYP // Inspection decision result type';


COMMENT ON COLUMN mst_insp_act_recv_if.judg_dt IS '判定日 // #MA.DT // Decision date';


COMMENT ON COLUMN mst_insp_act_recv_if.judg_usr_cd IS '判定者ＣＤ // #MA.USR_CD // Decision PIC cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_judg_usr_cd IS 'ＩＦ判定者ＣＤ // #MA.IF_EXT_SYS_CD // IF decision PIC cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_judg_usr_nm IS 'ＩＦ判定者名 // #MA.IF_EXT_SYS_NM // IF decision PIC name';


COMMENT ON COLUMN mst_insp_act_recv_if.judg_dpt_cd IS '判定部門ＣＤ // #MA.DPT_CD // Decision dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_judg_dpt_cd IS 'ＩＦ判定部門ＣＤ // #MA.IF_EXT_SYS_CD // IF decision dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_judg_dpt_nm IS 'ＩＦ判定部門名 // #MA.IF_EXT_SYS_NM // IF decision dept. name';


COMMENT ON COLUMN mst_insp_act_recv_if.judg_rsn IS '判定理由 // #MS.INSP_JUDG_RSN // Decision reason';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_insp_act_no IS '外部検査実績ＮＯ // #MA.EXT_INSP_ACT_NO // External inspection result No.';


COMMENT ON COLUMN mst_insp_act_recv_if.stk_loc_cd IS '在庫場所ＣＤ // #MA.LOC_CD // Inventory location cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_stk_loc_cd IS 'ＩＦ在庫場所ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory location cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_stk_loc_nm IS 'ＩＦ在庫場所名 // #MA.IF_EXT_SYS_NM // IF inventory location name';


COMMENT ON COLUMN mst_insp_act_recv_if.stk_str_ln_cd IS '在庫棚・ラインＣＤ // #MA.STR_LN_CD // Inventory rack/line cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_stk_str_ln_cd IS 'ＩＦ在庫棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF inventory rack/line cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_stk_str_ln_nm IS 'ＩＦ在庫棚・ライン名 // #MA.IF_EXT_SYS_NM // IF inventory rack/line name';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_quality_typ IS '良品区分（全数） // #MA.QUALITY_TYP // Conforming type (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_gd_cd IS '格付ＣＤ（全数） // #MA.STK_GD_CD // Grading cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_gd_cd IS 'ＩＦ格付ＣＤ（全数） // #MA.IF_EXT_SYS_CD // IF grading cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_gd_nm IS 'ＩＦ格付名（全数） // #MA.IF_EXT_SYS_NM // IF grading name (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_dfct_rsn_cd IS '不良理由ＣＤ（全数） // #MA.BIZ_RSN_CD // Defective reason cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_dfct_rsn_cd IS 'ＩＦ不良理由ＣＤ（全数） // #MA.IF_EXT_SYS_CD // IF defective reason cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_dfct_rsn_nm IS 'ＩＦ不良理由名（全数） // #MA.IF_EXT_SYS_NM // IF defective reason name (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_act_tm IS '実績日時（全数） // #MA.TM // Actual date and time (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.base_flg IS '基準ＦＬＧ // #MA.FLG // Base flg.';


COMMENT ON COLUMN mst_insp_act_recv_if.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_act_recv_if.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_pack_unit_cd IS 'ＩＦ荷姿単位ＣＤ // #MA.IF_EXT_SYS_CD // IF SKU cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_pack_unit_nm IS 'ＩＦ荷姿単位名 // #MA.IF_EXT_SYS_NM // IF SKU name';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_pack_xfr_pack_unit_qty IS '荷姿振替荷姿単位数量（全数） // #MA.QTY // SKU transfer SKU qty. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_pack_xfr_pack_unit_cd IS '荷姿振替荷姿単位ＣＤ（全数） // #MA.UNIT_CD // SKU transfer SKU cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_pack_xfr_pack_unit_cd IS 'ＩＦ荷姿振替荷姿単位ＣＤ（全数） // #MA.IF_EXT_SYS_CD // IF SKU transfer SKU cd. (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_ttl_pack_xfr_pack_unit_nm IS 'ＩＦ荷姿振替荷姿単位名（全数） // #MA.IF_EXT_SYS_NM // IF SKU transfer SKU name (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ttl_intr_rmrks IS '内部備考（全数） // #MS.INSP_INST_INTR_RMRKS // Internal remarks (100%)';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_insp_act_d_no IS '外部検査実績明細ＮＯ // #MA.EXT_INSP_ACT_D_NO // External inspection result details No.';


COMMENT ON COLUMN mst_insp_act_recv_if.so_qty IS '引落数量 // #MA.QTY // Deducted qty.';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_qty IS '抜取数量 // #MA.QTY // Sampling qty.';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_pack_xfr_pack_unit_qty IS '荷姿振替荷姿単位数量（抜取） // #MA.QTY // SKU transfer SKU qty. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_pack_xfr_pack_unit_cd IS '荷姿振替荷姿単位ＣＤ（抜取） // #MA.UNIT_CD // SKU transfer SKU cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_pack_xfr_pack_unit_cd IS 'ＩＦ荷姿振替荷姿単位ＣＤ（抜取） // #MA.IF_EXT_SYS_CD // IF SKU transfer SKU cd. (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.if_smpl_pack_xfr_pack_unit_nm IS 'ＩＦ荷姿振替荷姿単位名（抜取） // #MA.IF_EXT_SYS_NM // IF SKU transfer SKU name (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_act_tm IS '実績日時（抜取） // #MA.TM // Actual date and time (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_bd_dpt_cd IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_bd_dpt_nm IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN mst_insp_act_recv_if.trd_rmrks IS '取引備考 // #MS.INSP_SMPL_ACT_TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_insp_act_recv_if.smpl_intr_rmrks IS '内部備考（抜取） // #MS.INSP_SMPL_ACT_INTR_RMRKS // Internal remarks (Sampling)';


COMMENT ON COLUMN mst_insp_act_recv_if.ext_insp_smpl_act_no IS '外部検査抜取実績ＮＯ // #MA.EXT_INSP_SMPL_ACT_NO // External inspection sampling result No.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_insp_act_recv_if.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_insp_act_recv_if.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_insp_act_recv_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_insp_act_recv_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_insp_act_recv_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_insp_act_recv_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_insp_act_recv_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_act_recv_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_act_recv_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_act_recv_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_act_recv_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

