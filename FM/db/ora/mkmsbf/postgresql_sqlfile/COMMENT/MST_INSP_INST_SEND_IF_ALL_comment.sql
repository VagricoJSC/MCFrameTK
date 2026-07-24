\encoding UTF-8

COMMENT ON TABLE mst_insp_inst_send_if_all IS '検査指図送信ＩＦ // Inspection order export IF';


COMMENT ON COLUMN mst_insp_inst_send_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_freq IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_mtd_typ IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_sts_typ IS '検査状況区分 // #MS.INSP_STS_TYP // Inspection status type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_bind_typ IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.col_schd_flg IS '予定まとめＦＬＧ // #MA.FLG // Schedule aggregation flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_lst_prnt_flg IS '検査指図リスト発行済ＦＬＧ // #MA.FLG // Inspection order list issued flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_lst_prnt_tm IS '検査指図リスト発行日時 // #MA.TM // Inspection order list issue date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.arr_tm IS '入荷日時 // #MA.TM // Receipt date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.first_gr_dt IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.lmt_dt_frm IS '起算日 // #MA.DT // Base date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_sppl_cd IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sppl_nm IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_maker_cd IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.maker_nm IS 'メーカ名 // #MA.BP_NM // Maker name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_mfg_loc_cd IS 'ＩＦ製造場所ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. location cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.mfg_loc_nm IS '製造場所名 // #MA.LOC_NM // Mfg. location name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.to_site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_to_site_cd IS 'ＩＦ工場・物流倉庫ＣＤ // #MA.IF_EXT_SYS_CD // IF factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.to_site_nm IS '工場・物流倉庫名 // #MA.SITE_NM // Factory/Distribution warehouse name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_pack_unit_cd IS 'ＩＦ荷姿単位ＣＤ // #MA.IF_EXT_SYS_CD // IF SKU cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.pack_unit_nm IS '荷姿単位名 // #MA.UNIT_NM // SKU name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_lst_no IS '検査指図リストＮＯ // #MA.INSP_LST_NO // Inspection order list No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.inst_dt IS '指図日 // #MA.DT // Order date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_inst_dpt_cd IS 'ＩＦ指図部門ＣＤ // #MA.IF_EXT_SYS_CD // IF order dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.inst_dpt_nm IS '指図部門名 // #MA.DPT_NM // Order dept. name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_inst_usr_cd IS 'ＩＦ指図担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF order PIC cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.inst_usr_nm IS '指図担当者名 // #MA.USR_NM // Order PIC name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_dpt_cd IS '作成元部門ＣＤ // #MA.DPT_CD // Creating source dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_src_dpt_cd IS 'ＩＦ作成元部門ＣＤ // #MA.IF_EXT_SYS_CD // IF creating source dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_dpt_nm IS '作成元部門名 // #MA.DPT_NM // Creating source dept. name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_usr_cd IS '作成元担当者ＣＤ // #MA.USR_CD // Creating source PIC cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_src_usr_cd IS 'ＩＦ作成元担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF creating source PIC cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_usr_nm IS '作成元担当者名 // #MA.USR_NM // Creating source PIC name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.mfg_st_schd_tm IS '製造着手予定日時 // #MA.TM // Scheduled mfg. start date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.mfg_end_schd_tm IS '製造終了予定日時 // #MA.TM // Scheduled mfg. end date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_st_tm IS '検査開始予定日時 // #MA.TM // Scheduled inspection start date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_end_tm IS '検査終了予定日時 // #MA.TM // Scheduled inspection end date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_ptn_cd IS '検査パタンＣＤ // #MA.INSP_PTN_CD // Inspection pattern cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_ptn_nm IS '検査パタン名 // #MA.INSP_PTN_NM // Inspection pattern name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.std_req_flg IS '規格検査必須ＦＬＧ // #MA.FLG // Specific inspection required flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.std_cnf_req_flg IS '規格実績確認必須ＦＬＧ // #MA.FLG // Specific result check required flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_std_no IS '規格書ＮＯ // #MA.INSP_STD_NO // Specific inspection No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.plnt_aprv_flg IS '工場出荷承認対象ＦＬＧ // #MA.FLG // For factory release approval flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_rslt_prnt_flg IS '検査成績書発行済ＦＬＧ // #MA.FLG // Inspection report printed flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_rslt_prnt_tm IS '検査成績書発行日時 // #MA.TM // Inspection report printed date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.seq IS '検査成績書連番 // #MA.PRNT_SEQ // Inspection report sequence number';


COMMENT ON COLUMN mst_insp_inst_send_if_all.lmt_up_flg IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_aprv_flg IS '検査承認対象ＦＬＧ // #MA.FLG // For inspection approval flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_aprv_sts_typ IS '検査承認状況区分 // #MS.INSP_APRV_STS_TYP // Inspection approval status type';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_dt IS '承認日 // #MA.DT // Approval date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_aprv_role_cd IS '検査承認役割ＣＤ // #MA.APRV_ROLE_CD // Inspection approval role cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_aprv_role_nm IS '検査承認役割名 // #MA.APRV_ROLE_NM // Inspection approval role name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_dpt_cd IS '承認部門ＣＤ // #MA.DPT_CD // Approval dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_aprv_dpt_cd IS 'ＩＦ承認部門ＣＤ // #MA.IF_EXT_SYS_CD // IF approval dept. cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_dpt_nm IS '承認部門名 // #MA.DPT_NM // Approval dept. name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_usr_cd IS '承認者ＣＤ // #MA.USR_CD // Approver cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_aprv_usr_cd IS 'ＩＦ承認者ＣＤ // #MA.IF_EXT_SYS_CD // IF approver cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_usr_nm IS '承認者名 // #MA.USR_NM // Approver name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.aprv_rsn IS '承認理由 // #MS.INSP_INST_APRV_RSN // Approval reason';


COMMENT ON COLUMN mst_insp_inst_send_if_all.act_cont_fctr IS '実際有効成分係数 // #MA.ACT_CONT_FCTR // Actual active ingredient coefficient';


COMMENT ON COLUMN mst_insp_inst_send_if_all.intr_rmrks IS '内部備考 // #MS.INSP_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_schd_no IS '検査予定ＮＯ // #MA.INSP_SCHD_NO // Inspection schedule No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_no1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_no2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_no3 IS '作成元ＮＯ３ // #MA.SRC_NO // Source No. 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.src_no4 IS '作成元ＮＯ４ // #MA.SRC_NO // Source No. 4';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_loc_cd IS '場所ＣＤ（予定） // #MA.LOC_CD // Location cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_loc_cd IS 'ＩＦ場所ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF location cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_loc_nm IS '場所名（予定） // #MA.LOC_NM // Location name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_str_ln_cd IS '棚・ラインＣＤ（予定） // #MA.STR_LN_CD // Rack/Line cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_str_ln_cd IS 'ＩＦ棚・ラインＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF rack/line cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_str_ln_nm IS '棚・ライン名（予定） // #MA.STR_LN_NM // Rack/Line name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_arrv_bp_cd IS '在庫着荷先ＣＤ（予定） // #MA.BP_CD // Inventory arriving point cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_arrv_bp_nm IS '在庫着荷先名（予定） // #MA.BP_NM // Inventory arriving point name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_sno1 IS '手配ＮＯ１（予定） // #MA.SNO1 // SEIBAN No. 1 (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_sno2 IS '手配ＮＯ２（予定） // #MA.SNO2 // SEIBAN No. 2 (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_sno3 IS '手配ＮＯ３（予定） // #MA.SNO3 // SEIBAN No. 3 (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_sno4 IS '手配ＮＯ４（予定） // #MA.SNO4 // SEIBAN No. 4 (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_gd_cd IS '格付ＣＤ（予定） // #MA.STK_GD_CD // Grading cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_gd_cd IS 'ＩＦ格付ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF grading cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_gd_nm IS '格付名（予定） // #MA.STK_GD_NM // Grading name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_quality_typ IS '良品区分（予定） // #MA.QUALITY_TYP // Conforming type (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_insp_typ IS '在庫検査区分（予定） // #MS.STK_INSP_TYP // Inventory inspection type (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_id_typ IS '在庫識別区分（予定） // #MS.STK_ID_TYP // Inventory identification type (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_bp_cd IS '在庫取引先ＣＤ（予定） // #MA.BP_CD // Inventory BP cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF inventory BP cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_stk_bp_nm IS '在庫取引先名（予定） // #MA.BP_NM // Inventory BP name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_pack_unit_qty IS '荷姿単位数量（予定） // #MA.QTY // SKU qty. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_pack_unit_cd IS '荷姿単位ＣＤ（予定） // #MA.UNIT_CD // SKU cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_pack_unit_cd IS 'ＩＦ荷姿単位ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF SKU cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_pack_unit_nm IS '荷姿単位名（予定） // #MA.UNIT_NM // SKU name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_base_unit_qty IS '基準単位数量（予定） // #MA.QTY // Base unit qty. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_base_unit_cd IS '基準単位ＣＤ（予定） // #MA.UNIT_CD // Base unit cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_schd_base_unit_cd IS 'ＩＦ基準単位ＣＤ（予定） // #MA.IF_EXT_SYS_CD // IF base unit cd. (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.schd_base_unit_nm IS '基準単位名（予定） // #MA.UNIT_NM // Base unit name (Schedule)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_loc_cd IS '場所ＣＤ（在庫） // #MA.LOC_CD // Location cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_loc_cd IS 'ＩＦ場所ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF location cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_loc_nm IS '場所名（在庫） // #MA.LOC_NM // Location name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_str_ln_cd IS '棚・ラインＣＤ（在庫） // #MA.STR_LN_CD // Rack/Line cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_str_ln_cd IS 'ＩＦ棚・ラインＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF rack/line cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_str_ln_nm IS '棚・ライン名（在庫） // #MA.STR_LN_NM // Rack/Line name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ（在庫） // #MA.BP_CD // Inventory arriving point cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_arrv_bp_nm IS '在庫着荷先名（在庫） // #MA.BP_NM // Inventory arriving point name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_sno1 IS '手配ＮＯ１（在庫） // #MA.SNO1 // SEIBAN No. 1 (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_sno2 IS '手配ＮＯ２（在庫） // #MA.SNO2 // SEIBAN No. 2 (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_sno3 IS '手配ＮＯ３（在庫） // #MA.SNO3 // SEIBAN No. 3 (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_sno4 IS '手配ＮＯ４（在庫） // #MA.SNO4 // SEIBAN No. 4 (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_fix_no_typ IS '確定ＮＯ区分（在庫） // #MS.FIX_NO_TYP // Firm No. type (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_fix_no IS '確定ＮＯ（在庫） // #MA.FIX_NO // Firm No. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_pack_unit_cd IS '荷姿単位ＣＤ（在庫） // #MA.UNIT_CD // SKU cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_pack_unit_cd IS 'ＩＦ荷姿単位ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF SKU cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_pack_unit_nm IS '荷姿単位名（在庫） // #MA.UNIT_NM // SKU name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_gd_cd IS '格付ＣＤ（在庫） // #MA.STK_GD_CD // Grading cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_gd_cd IS 'ＩＦ格付ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF grading cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_gd_nm IS '格付名（在庫） // #MA.STK_GD_NM // Grading name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_quality_typ IS '良品区分（在庫） // #MA.QUALITY_TYP // Conforming type (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_insp_typ IS '在庫検査区分（在庫） // #MS.STK_INSP_TYP // Inventory inspection type (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_id_typ IS '在庫識別区分（在庫） // #MS.STK_ID_TYP // Inventory identification type (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_bp_cd IS '在庫取引先ＣＤ（在庫） // #MA.BP_CD // Inventory BP cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ（在庫） // #MA.IF_EXT_SYS_CD // IF inventory BP cd. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_bp_nm IS '在庫取引先名（在庫） // #MA.BP_NM // Inventory BP name (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_pack_unit_qty IS '荷姿単位数量（在庫） // #MA.QTY // SKU qty. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.stk_base_unit_qty IS '基準単位数量（在庫） // #MA.QTY // Base unit qty. (Inventory)';


COMMENT ON COLUMN mst_insp_inst_send_if_all.smpl_schd_qty IS '抜取予定数量 // #MA.QTY // Sampling scheduled qty.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.smpl_inst_qty IS '抜取指図数量 // #MA.QTY // Sampling order qty.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.own_insp_no IS '参照検査ＮＯ // #MA.INSP_NO // Reference inspection No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.own_insp_schd_no IS '参照検査予定ＮＯ // #MA.INSP_SCHD_NO // Reference inspection schedule No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.org_insp_schd_no IS '初回検査予定ＮＯ // #MA.INSP_SCHD_NO // Initial inspection schedule No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_insp_inst_send_if_all.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.in_prmt_insp_flg IS '検査中使用許可ＦＬＧ // #MA.FLG // Allow inspecting use flg.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.trd_nm IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_lt IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_offst IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN mst_insp_inst_send_if_all.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN mst_insp_inst_send_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_insp_inst_send_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_insp_inst_send_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_insp_inst_send_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_insp_inst_send_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_inst_send_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

