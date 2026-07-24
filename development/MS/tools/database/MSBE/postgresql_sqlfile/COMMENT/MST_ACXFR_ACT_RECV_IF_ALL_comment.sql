\encoding UTF-8

COMMENT ON TABLE mst_acxfr_act_recv_if_all IS '他勘定振替実績受信ＩＦ // Other accounting transfer result import IF';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ext_acxfr_act_no IS '外部他勘定振替実績ＮＯ // #MA.EXT_ACXFR_ACT_NO // External other accounting transfer result No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_trd_cd IS 'ＩＦ取引ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_trd_nm IS 'ＩＦ取引名 // #MA.IF_EXT_SYS_NM // IF transaction name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_lg_grp_cd IS 'ＩＦ物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF distribution group cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_lg_grp_nm IS 'ＩＦ物流グループ名 // #MA.IF_EXT_SYS_NM // IF distribution group name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_site_co_cd IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_site_co_nm IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_loc_cd IS 'ＩＦ場所ＣＤ // #MA.IF_EXT_SYS_CD // IF location cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_loc_nm IS 'ＩＦ場所名 // #MA.IF_EXT_SYS_NM // IF location name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.acxfr_inst_no IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.acxfr_inst_d_no IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.acxfr_act_tm IS '他勘定振替実績日時 // #MA.TM // Actual other accounting transfer date and time';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.act_dpt_cd IS '実施部門ＣＤ // #MA.DPT_CD // Implement dept. cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_act_dpt_cd IS 'ＩＦ実施部門ＣＤ // #MA.IF_EXT_SYS_CD // IF implementation dept.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_act_dpt_nm IS 'ＩＦ実施部門名 // #MA.IF_EXT_SYS_NM // IF implementation dept. name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.act_usr_cd IS '実施担当者ＣＤ // #MA.USR_CD // Implementation PIC cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_act_usr_cd IS 'ＩＦ実施担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC of implement cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_act_usr_nm IS 'ＩＦ実施担当者名 // #MA.IF_EXT_SYS_NM // IF PIC of implement name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_trd_unit_nm IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_str_ln_cd IS 'ＩＦ棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF rack/line cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_str_ln_nm IS 'ＩＦ棚・ライン名 // #MA.IF_EXT_SYS_NM // IF rack/line name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_stk_arrv_bp_nm IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_stk_bp_nm IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_rsn_cd IS 'ＩＦ理由ＣＤ // #MA.IF_EXT_SYS_CD // IF reason cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_rsn_nm IS 'ＩＦ理由名 // #MA.IF_EXT_SYS_NM // IF reason name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_dpt_cd IS 'ＩＦ負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF charged dept. cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_dpt_nm IS 'ＩＦ負担部門名 // #MA.IF_EXT_SYS_NM // IF charged dept. name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_loc_cd IS '負担場所ＣＤ // #MA.LOC_CD // Charged location cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_loc_cd IS 'ＩＦ負担場所ＣＤ // #MA.IF_EXT_SYS_CD // IF charged location cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_loc_nm IS 'ＩＦ負担場所名 // #MA.IF_EXT_SYS_NM // IF charged location name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_ctg_cd IS '負担品群ＣＤ // #MA.COST_CTG_CD // Charged item category cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_ctg_cd IS 'ＩＦ負担品群ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item category cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_ctg_nm IS 'ＩＦ負担品群名 // #MA.IF_EXT_SYS_NM // IF charged item category name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_oper_cd IS '負担工程ＣＤ // #MA.OPER_CD // Charged operation cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_oper_cd IS 'ＩＦ負担工程ＣＤ // #MA.IF_EXT_SYS_CD // IF charged operation cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_oper_nm IS 'ＩＦ負担工程名 // #MA.IF_EXT_SYS_NM // IF charged operation name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_bp_cd IS '負担取引先ＣＤ // #MA.BP_CD // Charged BP cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_bp_cd IS 'ＩＦ負担取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF charged BP cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_bp_nm IS 'ＩＦ負担取引先名 // #MA.IF_EXT_SYS_NM // IF charged BP name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_itm_cd IS '負担品目ＣＤ // #MA.ITM_CD // Charged item cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_itm_sub1 IS '負担枝番１ // #MA.ITM_SUB1 // Charged branch No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_itm_sub2 IS '負担枝番２ // #MA.ITM_SUB2 // Charged branch No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_itm_sub3 IS '負担枝番３ // #MA.ITM_SUB3 // Charged branch No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_itm_cd IS 'ＩＦ負担品目ＣＤ // #MA.IF_EXT_SYS_CD // IF charged item cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_itm_sub1 IS 'ＩＦ負担枝番１ // #MA.ITM_SUB1 // IF charged branch No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_itm_sub2 IS 'ＩＦ負担枝番２ // #MA.ITM_SUB2 // IF charged branch No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_itm_sub3 IS 'ＩＦ負担枝番３ // #MA.ITM_SUB3 // IF charged branch No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_bd_itm_nm IS 'ＩＦ負担品目名 // #MA.IF_EXT_SYS_NM // IF charged item name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_lot_no IS '負担ロットＮＯ // #MA.LOT_NO // Charged lot No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_sublot_no IS '負担サブロットＮＯ // #MA.SUBLOT_NO // Charged sublot No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_sno1 IS '負担手配ＮＯ１ // #MA.SNO1 // Charged SEIBAN No. 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_sno2 IS '負担手配ＮＯ２ // #MA.SNO2 // Charged SEIBAN No. 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_sno3 IS '負担手配ＮＯ３ // #MA.SNO3 // Charged SEIBAN No. 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.bd_sno4 IS '負担手配ＮＯ４ // #MA.SNO4 // Charged SEIBAN No. 4';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.intr_d_rmrks IS '内部明細備考 // #MS.ACXFR_ACT_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_co_cd IS 'ＩＦ会社ＣＤ // #MA.IF_EXT_SYS_CD // IF company cd.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.if_co_nm IS 'ＩＦ会社名 // #MA.IF_EXT_SYS_NM // IF company name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_acxfr_act_recv_if_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

