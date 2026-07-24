\encoding UTF-8

COMMENT ON TABLE mst_ship_inst_send_if_all IS '出荷指図送信ＩＦ // Shipping order export IF';


COMMENT ON COLUMN mst_ship_inst_send_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_inst_rev IS '出荷指図改訂番号 // #MA.SLIP_REV // Shipping order rev. number';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_fr_lg_grp_cd IS 'ＩＦ出荷元物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_fr_lg_grp_nm IS '出荷元物流グループ名 // #MA.LG_GRP_NM // Shipping point distribution group name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_site_co_cd IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.site_co_nm IS '倉庫事業者名 // #MA.SITE_CO_NM // Warehousing business name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_inst_tm IS '出荷指図日時 // #MA.TM // Shipping order date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_schd_tm IS '出荷予定日時 // #MA.TM // Scheduled shipping date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_schd_tm IS '納品予定日時 // #MA.TM // Scheduled delivery date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_wk_cd IS '出荷作業ＣＤ // #MA.SHIP_WK_CD // Shipping operation cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_wk_cd IS 'ＩＦ出荷作業ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping operation cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_wk_nm IS '出荷作業名 // #MA.SHIP_TERM_NM // Shipping operation name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_term_cd IS 'ＩＦ出荷条件ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping conditions cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_term_nm IS '出荷条件名 // #MA.SHIP_WK_NM // Shipping conditions name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_dpt_cd IS '指図部門ＣＤ // #MA.DPT_CD // Order dept. cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_inst_dpt_cd IS 'ＩＦ指図部門ＣＤ // #MA.IF_EXT_SYS_CD // IF order dept. cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_dpt_nm IS '指図部門名 // #MA.DPT_NM // Order dept. name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_usr_cd IS '指図担当者ＣＤ // #MA.USR_CD // Order PIC cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_inst_usr_cd IS 'ＩＦ指図担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF order PIC cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_usr_nm IS '指図担当者名 // #MA.USR_CD // Order PIC name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_to_lg_grp_cd IS 'ＩＦ出荷先物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point distribution group cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_lg_grp_nm IS '出荷先物流グループ名 // #MA.LG_GRP_NM // Receiving point distribution group name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_to_id_cd IS 'ＩＦ送付先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point identification cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_zip_cd IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_addr1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_addr2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_addr3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_addr4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_cntct_dpt IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_cntct_psn IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_tel IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_fax IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_to_sundry_flg IS '送付先諸口ＦＬＧ // #MA.FLG // Miscellaneous receiving point flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_dlv_id_cd IS 'ＩＦ納品先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_cst_cd IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.cst_nm IS '得意先名 // #MA.BP_NM // Customer name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_dest_cd1 IS 'ＩＦ仕向先ＣＤ１ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_nm1 IS '仕向先名１ // #MA.BP_NM // Distribution channel name 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_dest_cd2 IS 'ＩＦ仕向先ＣＤ２ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_nm2 IS '仕向先名２ // #MA.BP_NM // Distribution channel name 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_dest_cd3 IS 'ＩＦ仕向先ＣＤ３ // #MA.IF_EXT_SYS_CD // IF distribution channel cd. 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dest_nm3 IS '仕向先名３ // #MA.BP_NM // Distribution channel name 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_nm IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_loc_cd IS 'ＩＦ出荷場所ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping location cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_loc_nm IS '出荷場所名 // #MA.LOC_NM // Shipping location name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_str_ln_cd IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ship_str_ln_cd IS 'ＩＦ出荷棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_str_ln_nm IS '出荷棚・ライン名 // #MA.STR_LN_NM // Shipping rack/line name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_loc_tel IS '出荷場所ＴＥＬ // #MA.TEL // Shipping location TEL';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_loc_fax IS '出荷場所ＦＡＸ // #MA.TEL // Shipping location FAX';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dlv_rqst_tm IS '納入希望日時 // #MA.TM // Desired delivery date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.pd_inst_dlv_tm IS '納品依頼日時 // #MA.TM // Delivery request date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_rqst_tm IS '出荷希望日時 // #MA.TM // Desired shipping date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.assort_flg IS '品揃ＦＬＧ // #MA.FLG // Assortment flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.set_itm_grp_no IS '品揃グループＮＯ // #MA.SET_ITM_GRP_NO // Assortment group No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.gd_nm IS '格付名 // #MA.STK_GD_NM // Grading name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.stk_bp_nm IS '在庫取引先名 // #MA.BP_NM // Inventory BP name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_qty IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_cd IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_ent_unit_cd IS 'ＩＦ入力単位ＣＤ // #MA.IF_EXT_SYS_CD // IF input unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_nm IS '入力単位名 // #MA.UNIT_NM // Input unit name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_bnum IS '入力単位入数 // #MA.QTY // Quantity within input unit';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_wt IS '入力単位重量 // #MA.QTY // Input unit weight';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ent_unit_dim IS '入力単位容積 // #MA.QTY // Input unit volume';


COMMENT ON COLUMN mst_ship_inst_send_if_all.wt_unit_cd IS '重量単位ＣＤ // #MA.UNIT_CD // Weight unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_wt_unit_cd IS 'ＩＦ重量単位ＣＤ // #MA.IF_EXT_SYS_CD // IF weight unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.wt_unit_nm IS '重量単位名 // #MA.UNIT_NM // Weight unit name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dim_unit_cd IS '容積単位ＣＤ // #MA.UNIT_CD // Volume unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_dim_unit_cd IS 'ＩＦ容積単位ＣＤ // #MA.IF_EXT_SYS_CD // IF volume unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.dim_unit_nm IS '容積単位名 // #MA.UNIT_NM // Volume unit name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.trd_unit_nm IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_pack_unit_cd IS 'ＩＦ荷姿単位ＣＤ // #MA.IF_EXT_SYS_CD // IF SKU cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.pack_unit_nm IS '荷姿単位名 // #MA.UNIT_NM // SKU name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.alloc_flg IS '引当済ＦＬＧ // #MA.FLG // Allocated flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sls_acxfr_flg IS '販売他勘定ＦＬＧ // #MA.FLG // Sales other accounting flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sls_cststk_flg IS '預り出荷ＦＬＧ // #MA.FLG // Customer inventory shipment flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.vmi_flg IS '貸出出荷ＦＬＧ // #MA.FLG // Consignment shipment flg.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_ship_inst_send_if_all.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mst_ship_inst_send_if_all.first_gr_dt IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN mst_ship_inst_send_if_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ret_prov_typ IS '支給区分（返品） // #MA.PROV_TYP // Supply type (Return)';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ret_prov_basis_typ IS '支給計上区分（返品） // #MA.PROV_BASIS_TYP // Supply recording type (Return)';


COMMENT ON COLUMN mst_ship_inst_send_if_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_rsn_cd IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.rsn_nm IS '理由名 // #MA.BIZ_RSN_NM // Reason name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_rmrks IS '指図備考 // #MS.SHIP_INST_RMRKS // Order remarks';


COMMENT ON COLUMN mst_ship_inst_send_if_all.inst_d_rmrks IS '指図明細備考 // #MS.SHIP_INST_D_RMRKS // Order details remarks';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ship_cnt_rmrks IS '出荷連絡備考 // #MS.SHIP_CNT_RMRKS // Shipping notification remarks';


COMMENT ON COLUMN mst_ship_inst_send_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_ship_inst_send_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_ship_inst_send_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_ship_inst_send_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_ship_inst_send_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_inst_send_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

