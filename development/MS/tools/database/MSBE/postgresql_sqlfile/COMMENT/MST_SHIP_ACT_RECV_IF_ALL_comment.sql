\encoding UTF-8

COMMENT ON TABLE mst_ship_act_recv_if_all IS '出荷実績受信ＩＦ // Shipping result import IF';


COMMENT ON COLUMN mst_ship_act_recv_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_ship_act_recv_if_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_fr_lg_grp_cd IS 'ＩＦ出荷元物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF shipping point distribution group cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_fr_lg_grp_nm IS 'ＩＦ出荷元物流グループ名 // #MA.IF_EXT_SYS_NM // IF shipping point distribution group name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_site_co_cd IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_site_co_nm IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_trd_nm IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_tm IS '出荷日時 // #MA.TM // Shipping date and time';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_tm IS '納品日時 // #MA.TM // Delivery date and time';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_cst_cd IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_cst_nm IS 'ＩＦ得意先名 // #MA.IF_EXT_SYS_NM // IF customer name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_id_typ IS '送付先識別区分 // #MS.SHIP_TO_ID_TYP // Receiving point identification type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_id_cd IS '送付先識別ＣＤ // #MS.SHIP_TO_ID_CD // Receiving point identification cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_to_id_cd IS 'ＩＦ送付先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF receiving point identification cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_id_nm IS '送付先識別名 // #MS.SHIP_TO_ID_NM // Receiving point Identification name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_zip_cd IS '送付先郵便番号 // #MA.ZIP_CD // Receiving point zip code';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_addr1 IS '送付先住所１ // #MA.ADDR // Receiving point address 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_addr2 IS '送付先住所２ // #MA.ADDR // Receiving point address 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_addr3 IS '送付先住所３ // #MA.ADDR // Receiving point address 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_addr4 IS '送付先住所４ // #MA.ADDR // Receiving point address 4';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_cntct_dpt IS '送付先部署 // #MA.BP_CNTCT_DPT // Receiving point dept.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_cntct_psn IS '送付先担当者 // #MA.BP_CNTCT_PSN // Receiving point PIC';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_tel IS '送付先ＴＥＬ // #MA.TEL // Receiving point TEL';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_to_fax IS '送付先ＦＡＸ // #MA.TEL // Receiving point FAX';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_id_typ IS '納品先識別区分 // #MS.DLV_ID_TYP // Delivery destination identification type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_id_cd IS '納品先識別ＣＤ // #MS.DLV_ID_CD // Delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_dlv_id_cd IS 'ＩＦ納品先識別ＣＤ // #MA.IF_EXT_SYS_CD // IF delivery destination identification cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_id_nm IS '納品先識別名 // #MS.DLV_ID_NM // Delivery destination identification name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_str_ln_cd IS '納品棚・ラインＣＤ // #MA.STR_LN_CD // Delivery rack/line cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_dlv_str_ln_cd IS 'ＩＦ納品棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF delivery rack/line cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_dlv_str_ln_nm IS 'ＩＦ納品棚・ライン名 // #MA.IF_EXT_SYS_NM // IF delivery rack/line name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_zip_cd IS '納品先郵便番号 // #MA.ZIP_CD // Zip code (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_addr1 IS '納品先住所１ // #MA.ADDR // Address 1 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_addr2 IS '納品先住所２ // #MA.ADDR // Address 2 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_addr3 IS '納品先住所３ // #MA.ADDR // Address 3 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_addr4 IS '納品先住所４ // #MA.ADDR // Address 4 (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_cntct_dpt IS '納品先部署 // #MA.BP_CNTCT_DPT // Delivery destination dept.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_cntct_psn IS '納品先担当者 // #MA.BP_CNTCT_PSN // Delivery destination PIC';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_tel IS '納品先ＴＥＬ // #MA.TEL // TEL (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_fax IS '納品先ＦＡＸ // #MA.TEL // FAX (Delivery destination)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.pri_prnt_typ IS '価格印字区分 // #MA.PRI_PRNT_TYP // Print price type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.rqst_dpt_cd IS '依頼元部門ＣＤ // #MA.DPT_CD // Requesting dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rqst_dpt_cd IS 'ＩＦ依頼元部門ＣＤ // #MA.IF_EXT_SYS_CD // IF requesting dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rqst_dpt_nm IS 'ＩＦ依頼元部門名 // #MA.IF_EXT_SYS_NM // IF requesting dept. name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.rqst_usr_cd IS '依頼元担当者ＣＤ // #MA.USR_CD // Requesting PIC cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rqst_usr_cd IS 'ＩＦ依頼元担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF requesting PIC cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rqst_usr_nm IS 'ＩＦ依頼元担当者名 // #MA.IF_EXT_SYS_NM // IF requesting PIC name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_dpt_cd IS '出荷部門ＣＤ // #MA.DPT_CD // Shipping dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_dpt_cd IS 'ＩＦ出荷部門ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_dpt_nm IS 'ＩＦ出荷部門名 // #MA.IF_EXT_SYS_NM // IF shipping dept. name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_usr_cd IS '出荷担当者ＣＤ // #MA.USR_CD // Shipping PIC cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_usr_cd IS 'ＩＦ出荷担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping PIC cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_usr_nm IS 'ＩＦ出荷担当者名 // #MA.IF_EXT_SYS_NM // IF shipping PIC name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ext_ship_act_no IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_loc_cd IS 'ＩＦ出荷場所ＣＤ // #MA.IF_EXT_SYS_CD // IF shipping location cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_loc_nm IS 'ＩＦ出荷場所名 // #MA.IF_EXT_SYS_NM // IF shipping location name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ship_str_ln_cd IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_str_ln_cd IS 'ＩＦ出荷棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ship_str_ln_nm IS 'ＩＦ出荷棚・ライン名 // #MA.IF_EXT_SYS_NM // IF shipping rack/line name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_itm_cd IS '得意先品目ＣＤ // #MA.BP_ITM_CD // Customer item cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_itm_nm IS '得意先品名 // #MA.BP_ITM_NM // Customer item name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ent_unit_qty IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ent_unit_cd IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ent_unit_cd IS 'ＩＦ入力単位ＣＤ // #MA.IF_EXT_SYS_CD // IF input unit cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_ent_unit_nm IS 'ＩＦ入力単位名 // #MA.IF_EXT_SYS_NM // IF input unit name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_stk_arrv_bp_nm IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_ship_act_recv_if_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_stk_bp_nm IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rsn_cd IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_rsn_nm IS 'ＩＦ理由名 // #MA.IF_EXT_SYS_NM // IF reason name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_bd_dpt_cd IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_bd_dpt_nm IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_po_no IS '得意先注文ＮＯ // #MA.CST_PO_NO // Customer order No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_po_d_no IS '得意先注文明細ＮＯ // #MA.CST_PO_D_NO // Customer order details No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_dlv_inst_no IS '得意先納入指示ＮＯ // #MA.CST_DLV_INST_NO // Customer delivery order No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.cst_dlv_inst_d_no IS '得意先納入指示明細ＮＯ // #MA.CST_DLV_INST_D_NO // Customer delivery order details No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.base_dlv_slip_no IS '返品元納品書ＮＯ // #MA.DLV_SLIP_NO // Return-from delivery note No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.base_prov_act_no IS '返品元支給実績ＮＯ // #MA.PROV_ACT_NO // Return-from supply result No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.base_ac_dt IS '支給計上日（基） // #MA.DT // Supply recording date (Base)';


COMMENT ON COLUMN mst_ship_act_recv_if_all.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN mst_ship_act_recv_if_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_ship_act_recv_if_all.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN mst_ship_act_recv_if_all.intr_d_rmrks IS '内部明細備考 // #MS.SHIP_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_ship_act_recv_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_ship_act_recv_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_ship_act_recv_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_ship_act_recv_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_act_recv_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_act_recv_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

