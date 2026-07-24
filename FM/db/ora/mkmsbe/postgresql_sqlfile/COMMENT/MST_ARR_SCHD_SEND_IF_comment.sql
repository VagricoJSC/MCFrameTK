\encoding UTF-8

COMMENT ON VIEW mst_arr_schd_send_if IS '入荷予定送信ＩＦ // Receipt schedule export IF';


COMMENT ON COLUMN mst_arr_schd_send_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_arr_schd_send_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_arr_schd_send_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_arr_schd_send_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_arr_schd_send_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_schd_no IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN mst_arr_schd_send_if.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_arr_schd_send_if.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_inst_no IS '納入指示ＮＯ // #MA.DLV_INST_NO // Delivery order No.';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.prms_rcpt_no IS '納期回答受領ＮＯ // #MA.PRMS_RCPT_NO // Order promising result received No.';


COMMENT ON COLUMN mst_arr_schd_send_if.prms_rcpt_d_no IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.purc_act_no IS '仕入実績ＮＯ // #MA.PURC_ACT_NO // Purchase result No.';


COMMENT ON COLUMN mst_arr_schd_send_if.purc_act_d_no IS '仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Purchase result details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.purc_act_io_no IS '仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Purchase result GR/GI No.';


COMMENT ON COLUMN mst_arr_schd_send_if.rcpt_iv_no IS '受領インボイスＮＯ // #MA.IV_NO // Purchase invoice No.';


COMMENT ON COLUMN mst_arr_schd_send_if.rcpt_iv_mng_no IS '受領インボイス管理ＮＯ // #MA.RCPT_IV_MNG_NO // Purchase invoice management No.';


COMMENT ON COLUMN mst_arr_schd_send_if.rcpt_iv_d_no IS '受領インボイス明細ＮＯ // #MA.RCPT_IV_D_NO // Purchase invoice details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.sls_ret_schd_no IS '売上返品予定ＮＯ // #MA.SLS_RET_SCHD_NO // Sales return schedule No.';


COMMENT ON COLUMN mst_arr_schd_send_if.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_slip_d_seq IS '納品書明細連番 // #MA.SLIP_SEQ // Delivery note details serial number';


COMMENT ON COLUMN mst_arr_schd_send_if.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mst_arr_schd_send_if.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_nm IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_schd_tm IS '入荷予定日時 // #MA.TM // Scheduled receipt date and time';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_lg_grp_cd IS '入荷物流グループＣＤ // #MA.LG_GRP_CD // Receipt distribution group cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_arr_lg_grp_cd IS 'ＩＦ入荷物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF receipt distribution group cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_lg_grp_nm IS '入荷物流グループ名 // #MA.LG_GRP_NM // Receipt distribution group name';


COMMENT ON COLUMN mst_arr_schd_send_if.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_site_co_cd IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.site_co_nm IS '倉庫事業者名 // #MA.SITE_CO_NM // Warehousing business name';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_loc_cd IS '入荷場所ＣＤ // #MA.LOC_CD // Receipt location cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_arr_loc_cd IS 'ＩＦ入荷場所ＣＤ // #MA.IF_EXT_SYS_CD // IF receipt location cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_loc_nm IS '入荷場所名 // #MA.LOC_NM // Receipt location name';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_str_ln_cd IS '入荷棚・ラインＣＤ // #MA.STR_LN_CD // Receipt rack/line cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_arr_str_ln_cd IS 'ＩＦ入荷棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF receipt rack/line cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_str_ln_nm IS '入荷棚・ライン名 // #MA.STR_LN_NM // Receipt rack/line name';


COMMENT ON COLUMN mst_arr_schd_send_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_arr_schd_send_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_arr_schd_send_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_arr_schd_send_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_arr_schd_send_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_arr_schd_send_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_arr_schd_send_if.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_arr_schd_send_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_arr_schd_send_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_arr_schd_send_if.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_arr_schd_send_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_arr_schd_send_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_arr_schd_send_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_arr_schd_send_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_arr_schd_send_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.gd_nm IS '格付名 // #MA.STK_GD_NM // Grading name';


COMMENT ON COLUMN mst_arr_schd_send_if.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_arr_schd_send_if.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_arr_schd_send_if.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_arr_schd_send_if.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.stk_bp_nm IS '在庫取引先名 // #MA.BP_NM // Inventory BP name';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_nm IS '取引単位名 // #MA.UNIT_NM // Transaction unit name';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_bnum IS '取引単位入数 // #MA.QTY // Quantity within Transaction unit';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_wt IS '取引単位重量 // #MA.QTY // Transaction unit weight';


COMMENT ON COLUMN mst_arr_schd_send_if.trd_unit_dim IS '取引単位容積 // #MA.QTY // Transaction unit volume';


COMMENT ON COLUMN mst_arr_schd_send_if.wt_unit_cd IS '重量単位ＣＤ // #MA.UNIT_CD // Weight unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_wt_unit_cd IS 'ＩＦ重量単位ＣＤ // #MA.IF_EXT_SYS_CD // IF weight unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.wt_unit_nm IS '重量単位名 // #MA.UNIT_NM // Weight unit name';


COMMENT ON COLUMN mst_arr_schd_send_if.dim_unit_cd IS '容積単位ＣＤ // #MA.UNIT_CD // Volume unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_dim_unit_cd IS 'ＩＦ容積単位ＣＤ // #MA.IF_EXT_SYS_CD // IF volume unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.dim_unit_nm IS '容積単位名 // #MA.UNIT_NM // Volume unit name';


COMMENT ON COLUMN mst_arr_schd_send_if.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_arr_schd_send_if.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_base_unit_cd IS 'ＩＦ基準単位ＣＤ // #MA.IF_EXT_SYS_CD // IF base unit cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.base_unit_nm IS '基準単位名 // #MA.UNIT_NM // Base unit name';


COMMENT ON COLUMN mst_arr_schd_send_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_arr_schd_send_if.vld_dt IS '有効期限 // #MA.DT // Expiration date';


COMMENT ON COLUMN mst_arr_schd_send_if.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN mst_arr_schd_send_if.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_sppl_cd IS 'ＩＦ発注先ＣＤ // #MA.IF_EXT_SYS_CD // IF supplier cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.sppl_nm IS '発注先名 // #MA.BP_NM // Supplier name';


COMMENT ON COLUMN mst_arr_schd_send_if.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_cst_cd IS 'ＩＦ得意先ＣＤ // #MA.IF_EXT_SYS_CD // IF customer cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.cst_nm IS '得意先名 // #MA.BP_NM // Customer name';


COMMENT ON COLUMN mst_arr_schd_send_if.ship_lg_grp_cd IS '出荷物流グループＣＤ // #MA.LG_GRP_CD // Shipping distribution group cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_ship_lg_grp_cd IS 'ＩＦ出荷物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF shipping distribution group cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.ship_lg_grp_nm IS '出荷物流グループ名 // #MA.LG_GRP_NM // Shipping distribution group name';


COMMENT ON COLUMN mst_arr_schd_send_if.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_arr_schd_send_if.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_maker_cd IS 'ＩＦメーカＣＤ // #MA.IF_EXT_SYS_CD // IF maker cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.maker_nm IS 'メーカ名 // #MA.BP_NM // Maker name';


COMMENT ON COLUMN mst_arr_schd_send_if.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_arr_schd_send_if.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_rsn_cd IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.rsn_nm IS '理由名 // #MA.BIZ_RSN_NM // Reason name';


COMMENT ON COLUMN mst_arr_schd_send_if.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN mst_arr_schd_send_if.dlv_inst_print_d_rmrks IS '納入指示書明細備考 // #MS.DLV_INST_PRINT_D_RMRKS // Delivery order details remarks';


COMMENT ON COLUMN mst_arr_schd_send_if.prms_rmrks IS '納期回答備考 // #MS.PRMS_RMRKS // Order promising remarks';


COMMENT ON COLUMN mst_arr_schd_send_if.prov_arr_flg IS '支給品着荷ＦＬＧ // #MA.FLG // Supply item arrival flg.';


COMMENT ON COLUMN mst_arr_schd_send_if.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_arr_schd_send_if.co_nm IS '会社名 // #MA.CO_NM // Company name';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_arr_schd_send_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_arr_schd_send_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_arr_schd_send_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_arr_schd_send_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_arr_schd_send_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_arr_schd_send_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_arr_schd_send_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_arr_schd_send_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_arr_schd_send_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

