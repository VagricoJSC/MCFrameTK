\encoding UTF-8

COMMENT ON VIEW msvt_mes_if IS 'ＳＣＭ実績受信ＩＦ // SCM result import IF';


COMMENT ON COLUMN msvt_mes_if.data_lno IS 'データ行ＮＯ // #MA.IF_DATA_LNO // Data row No.';


COMMENT ON COLUMN msvt_mes_if.data_no IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN msvt_mes_if.exe_sts_typ IS 'ＰＧ実行状況区分 // #MA.EXE_STS_TYP // PG execution status type';


COMMENT ON COLUMN msvt_mes_if.data_crud_typ IS 'データ更新区分 // #MA.DATA_CRUD_TYP // Data update type';


COMMENT ON COLUMN msvt_mes_if.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN msvt_mes_if.ext_data_no IS '外部システムデータＮＯ // #MA.IF_EXT_DATA_NO // External system data No.';


COMMENT ON COLUMN msvt_mes_if.ext_data_lno IS '外部システムデータ行ＮＯ // #MA.IF_EXT_DATA_LNO // External system data row No.';


COMMENT ON COLUMN msvt_mes_if.data_make_dt IS '送信元レコード作成日時 // #MA.YMDHMS // Creation date and time of source record';


COMMENT ON COLUMN msvt_mes_if.imp_flg IS '取込対象ＦＬＧ // #MA.FLG // To import flg.';


COMMENT ON COLUMN msvt_mes_if.recv_dt IS '受信日 // #MA.DT // Receiving date';


COMMENT ON COLUMN msvt_mes_if.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN msvt_mes_if.act_tm IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN msvt_mes_if.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN msvt_mes_if.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mes_if.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mes_if.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mes_if.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mes_if.if_itm_cd IS 'ＩＦ品目ＣＤ // #MA.IF_EXT_SYS_CD // IF item cd.';


COMMENT ON COLUMN msvt_mes_if.if_itm_sub1 IS 'ＩＦ枝番１ // #MA.ITM_SUB1 // IF branch No. 1';


COMMENT ON COLUMN msvt_mes_if.if_itm_sub2 IS 'ＩＦ枝番２ // #MA.ITM_SUB2 // IF branch No. 2';


COMMENT ON COLUMN msvt_mes_if.if_itm_sub3 IS 'ＩＦ枝番３ // #MA.ITM_SUB3 // IF branch No. 3';


COMMENT ON COLUMN msvt_mes_if.if_itm_nm IS 'ＩＦ品名 // #MA.IF_EXT_SYS_NM // IF item name';


COMMENT ON COLUMN msvt_mes_if.mfg_itm_cd IS '製造品目ＣＤ // #MA.ITM_CD // Mfg. item cd.';


COMMENT ON COLUMN msvt_mes_if.mfg_itm_sub1 IS '製造枝番１ // #MA.ITM_SUB1 // Mfg. branch No. 1';


COMMENT ON COLUMN msvt_mes_if.mfg_itm_sub2 IS '製造枝番２ // #MA.ITM_SUB2 // Mfg. branch No. 2';


COMMENT ON COLUMN msvt_mes_if.mfg_itm_sub3 IS '製造枝番３ // #MA.ITM_SUB3 // Mfg. branch No. 3';


COMMENT ON COLUMN msvt_mes_if.if_mfg_itm_cd IS 'ＩＦ製造品目ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. item cd.';


COMMENT ON COLUMN msvt_mes_if.if_mfg_itm_sub1 IS 'ＩＦ製造枝番１ // #MA.ITM_SUB1 // IF mfg. branch No. 1';


COMMENT ON COLUMN msvt_mes_if.if_mfg_itm_sub2 IS 'ＩＦ製造枝番２ // #MA.ITM_SUB2 // IF mfg. branch No. 2';


COMMENT ON COLUMN msvt_mes_if.if_mfg_itm_sub3 IS 'ＩＦ製造枝番３ // #MA.ITM_SUB3 // IF mfg. branch No. 3';


COMMENT ON COLUMN msvt_mes_if.if_mfg_itm_nm IS 'ＩＦ製造品名 // #MA.IF_EXT_SYS_NM // IF mfg. item name';


COMMENT ON COLUMN msvt_mes_if.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN msvt_mes_if.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN msvt_mes_if.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mes_if.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mes_if.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mes_if.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mes_if.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN msvt_mes_if.if_trd_unit_cd IS 'ＩＦ取引単位ＣＤ // #MA.IF_EXT_SYS_CD // IF transaction unit cd.';


COMMENT ON COLUMN msvt_mes_if.if_trd_unit_nm IS 'ＩＦ取引単位名 // #MA.IF_EXT_SYS_NM // IF transaction unit name';


COMMENT ON COLUMN msvt_mes_if.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN msvt_mes_if.ent_unit_cd IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN msvt_mes_if.if_ent_unit_cd IS 'ＩＦ入力単位ＣＤ // #MA.IF_EXT_SYS_CD // IF input unit cd.';


COMMENT ON COLUMN msvt_mes_if.if_ent_unit_nm IS 'ＩＦ入力単位名 // #MA.IF_EXT_SYS_NM // IF input unit name';


COMMENT ON COLUMN msvt_mes_if.ent_unit_qty IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN msvt_mes_if.base_unit_inpt_qty IS '基準単位投入数量 // #MA.QTY // Base unit input qty.';


COMMENT ON COLUMN msvt_mes_if.cont_qty IS '有効成分（投入数量） // #MA.QTY // Active ingredient (Input qty.)';


COMMENT ON COLUMN msvt_mes_if.acxfr_qty IS '他勘定振替数量 // #MA.QTY // Other accounting transfer qty.';


COMMENT ON COLUMN msvt_mes_if.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN msvt_mes_if.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN msvt_mes_if.if_site_co_cd IS 'ＩＦ倉庫事業者ＣＤ // #MA.IF_EXT_SYS_CD // IF warehousing business cd.';


COMMENT ON COLUMN msvt_mes_if.if_site_co_nm IS 'ＩＦ倉庫事業者名 // #MA.IF_EXT_SYS_NM // IF warehousing business name';


COMMENT ON COLUMN msvt_mes_if.gi_lg_grp_cd IS '出庫物流グループＣＤ // #MA.LG_GRP_CD // GI distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_lg_grp_cd IS 'ＩＦ出庫物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF GI distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_lg_grp_nm IS 'ＩＦ出庫物流グループ名 // #MA.IF_EXT_SYS_NM // IF GI distribution group name';


COMMENT ON COLUMN msvt_mes_if.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_loc_cd IS 'ＩＦ出庫場所ＣＤ // #MA.IF_EXT_SYS_CD // IF GI location cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_loc_nm IS 'ＩＦ出庫場所名 // #MA.IF_EXT_SYS_NM // IF GI location name';


COMMENT ON COLUMN msvt_mes_if.gi_str_ln_cd IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_str_ln_cd IS 'ＩＦ出庫棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF GI rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_gi_str_ln_nm IS 'ＩＦ出庫棚・ライン名 // #MA.IF_EXT_SYS_NM // IF GI rack/line name';


COMMENT ON COLUMN msvt_mes_if.gr_lg_grp_cd IS '入庫物流グループＣＤ // #MA.LG_GRP_CD // GR distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_lg_grp_cd IS 'ＩＦ入庫物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF GR distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_lg_grp_nm IS 'ＩＦ入庫物流グループ名 // #MA.IF_EXT_SYS_NM // IF GR distribution group name';


COMMENT ON COLUMN msvt_mes_if.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_loc_cd IS 'ＩＦ入庫場所ＣＤ // #MA.IF_EXT_SYS_CD // IF GR location cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_loc_nm IS 'ＩＦ入庫場所名 // #MA.IF_EXT_SYS_NM // IF GR location name';


COMMENT ON COLUMN msvt_mes_if.gr_str_ln_cd IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_str_ln_cd IS 'ＩＦ入庫棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF GR rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_gr_str_ln_nm IS 'ＩＦ入庫棚・ライン名 // #MA.IF_EXT_SYS_NM // IF GR rack/line name';


COMMENT ON COLUMN msvt_mes_if.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN msvt_mes_if.if_mfg_loc_cd IS 'ＩＦ製造場所ＣＤ // #MA.IF_EXT_SYS_CD // IF mfg. location cd.';


COMMENT ON COLUMN msvt_mes_if.if_mfg_loc_nm IS 'ＩＦ製造場所名 // #MA.IF_EXT_SYS_NM // IF mfg. location name';


COMMENT ON COLUMN msvt_mes_if.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN msvt_mes_if.if_strg_loc_cd IS 'ＩＦ格納場所ＣＤ // #MA.IF_EXT_SYS_CD // IF storage location cd.';


COMMENT ON COLUMN msvt_mes_if.if_strg_loc_nm IS 'ＩＦ格納場所名 // #MA.IF_EXT_SYS_NM // IF storage location name';


COMMENT ON COLUMN msvt_mes_if.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_strg_str_ln_cd IS 'ＩＦ格納棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF storage rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_strg_str_ln_nm IS 'ＩＦ格納棚・ライン名 // #MA.IF_EXT_SYS_NM // IF storage rack/line name';


COMMENT ON COLUMN msvt_mes_if.inpt_loc_cd IS '投入場所ＣＤ // #MA.LOC_CD // Input location cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_loc_cd IS 'ＩＦ投入場所ＣＤ // #MA.IF_EXT_SYS_CD // IF input location cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_loc_nm IS 'ＩＦ投入場所名 // #MA.IF_EXT_SYS_NM // IF input location name';


COMMENT ON COLUMN msvt_mes_if.inpt_str_ln_cd IS '投入棚・ラインＣＤ // #MA.STR_LN_CD // Input rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_str_ln_cd IS 'ＩＦ投入棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF input rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_str_ln_nm IS 'ＩＦ投入棚・ライン名 // #MA.IF_EXT_SYS_NM // IF input rack/line name';


COMMENT ON COLUMN msvt_mes_if.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN msvt_mes_if.if_oper_cd IS 'ＩＦ工程ＣＤ // #MA.IF_EXT_SYS_CD // IF operation cd.';


COMMENT ON COLUMN msvt_mes_if.if_oper_nm IS 'ＩＦ工程名 // #MA.IF_EXT_SYS_NM // IF operation name';


COMMENT ON COLUMN msvt_mes_if.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN msvt_mes_if.act_dpt_cd IS '実績部門ＣＤ // #MA.DPT_CD // Result dept. cd.';


COMMENT ON COLUMN msvt_mes_if.if_act_dpt_cd IS 'ＩＦ実績部門ＣＤ // #MA.IF_EXT_SYS_CD // IF result dept. cd.';


COMMENT ON COLUMN msvt_mes_if.if_act_dpt_nm IS 'ＩＦ実績部門名 // #MA.IF_EXT_SYS_NM // IF result dept. name';


COMMENT ON COLUMN msvt_mes_if.act_usr_cd IS '実績担当者ＣＤ // #MA.USR_CD // Result PIC cd.';


COMMENT ON COLUMN msvt_mes_if.if_act_usr_cd IS 'ＩＦ実績担当者ＣＤ // #MA.IF_EXT_SYS_CD // IF PIC of result cd.';


COMMENT ON COLUMN msvt_mes_if.if_act_usr_nm IS 'ＩＦ実績担当者名 // #MA.IF_EXT_SYS_NM // IF PIC of result name';


COMMENT ON COLUMN msvt_mes_if.wk_day_cd IS '勤務種類ＣＤ // #MA.WK_DAY_CD // Work type cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_day_cd IS 'ＩＦ勤務種類ＣＤ // #MA.IF_EXT_SYS_CD // IF work classification cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_day_nm IS 'ＩＦ勤務種類名 // #MA.IF_EXT_SYS_NM // IF work classification type name';


COMMENT ON COLUMN msvt_mes_if.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN msvt_mes_if.if_gd_cd IS 'ＩＦ格付ＣＤ // #MA.IF_EXT_SYS_CD // IF grading cd.';


COMMENT ON COLUMN msvt_mes_if.if_gd_nm IS 'ＩＦ格付名 // #MA.IF_EXT_SYS_NM // IF grading name';


COMMENT ON COLUMN msvt_mes_if.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN msvt_mes_if.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN msvt_mes_if.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN msvt_mes_if.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN msvt_mes_if.if_stk_bp_cd IS 'ＩＦ在庫取引先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory BP cd.';


COMMENT ON COLUMN msvt_mes_if.if_stk_bp_nm IS 'ＩＦ在庫取引先名 // #MA.IF_EXT_SYS_NM // IF inventory BP name';


COMMENT ON COLUMN msvt_mes_if.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN msvt_mes_if.if_stk_arrv_bp_cd IS 'ＩＦ在庫着荷先ＣＤ // #MA.IF_EXT_SYS_CD // IF inventory arriving point cd.';


COMMENT ON COLUMN msvt_mes_if.if_stk_arrv_bp_nm IS 'ＩＦ在庫着荷先名 // #MA.IF_EXT_SYS_NM // IF inventory arriving point name';


COMMENT ON COLUMN msvt_mes_if.yield_rsn_cd IS '出来高理由ＣＤ // #MA.BIZ_RSN_CD // Output reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_yield_rsn_cd IS 'ＩＦ出来高理由ＣＤ // #MA.IF_EXT_SYS_CD // IF output reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_yield_rsn_nm IS 'ＩＦ出来高理由名 // #MA.IF_EXT_SYS_NM // IF output reason name';


COMMENT ON COLUMN msvt_mes_if.acxfr_rsn_cd IS '他勘定振替理由ＣＤ // #MA.BIZ_RSN_CD // Other accounting transfer reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_rsn_cd IS 'ＩＦ他勘定振替理由ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_rsn_nm IS 'ＩＦ他勘定振替理由名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer reason name';


COMMENT ON COLUMN msvt_mes_if.inpt_rsn_cd IS '投入理由ＣＤ // #MA.BIZ_RSN_CD // Input reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_rsn_cd IS 'ＩＦ投入理由ＣＤ // #MA.IF_EXT_SYS_CD // IF input reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_rsn_nm IS 'ＩＦ投入理由名 // #MA.IF_EXT_SYS_NM // IF input reason name';


COMMENT ON COLUMN msvt_mes_if.loss_rsn_cd IS 'ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_loss_rsn_cd IS 'ＩＦロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_loss_rsn_nm IS 'ＩＦロス理由名 // #MA.IF_EXT_SYS_NM // IF loss reason name';


COMMENT ON COLUMN msvt_mes_if.old_loss_rsn_cd IS '変更前ロス理由ＣＤ // #MA.BIZ_RSN_CD // Loss reason cd. before change';


COMMENT ON COLUMN msvt_mes_if.if_old_loss_rsn_cd IS 'ＩＦ変更前ロス理由ＣＤ // #MA.IF_EXT_SYS_CD // IF loss reason before change cd.';


COMMENT ON COLUMN msvt_mes_if.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_rsn_cd IS 'ＩＦ工数理由ＣＤ // #MA.IF_EXT_SYS_CD // IF man-hour reason cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_rsn_nm IS 'ＩＦ工数理由名 // #MA.IF_EXT_SYS_NM // IF man-hour reason name';


COMMENT ON COLUMN msvt_mes_if.acxfr_bd_dpt_cd IS '他勘定振替負担部門ＣＤ // #MA.DPT_CD // Other accounting transfer charged dept. cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_bd_dpt_cd IS 'ＩＦ他勘定振替負担部門ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer charged dept. cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_bd_dpt_nm IS 'ＩＦ他勘定振替負担部門名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer charged dept. name';


COMMENT ON COLUMN msvt_mes_if.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN msvt_mes_if.bp_dlv_slip_no IS '業者納品書ＮＯ // #MA.BP_DLV_SLIP_NO // Vendor delivery note No.';


COMMENT ON COLUMN msvt_mes_if.bp_dlv_slip_d_no IS '業者納品書明細ＮＯ // #MA.BP_DLV_SLIP_D_NO // Vendor delivery note details No.';


COMMENT ON COLUMN msvt_mes_if.ship_fr_valid_dt IS '出荷元期限 // #MA.DT // Shipping point deadline';


COMMENT ON COLUMN msvt_mes_if.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_cost_cd IS 'ＩＦ工数管理ＣＤ // #MA.IF_EXT_SYS_CD // IF work element cd.';


COMMENT ON COLUMN msvt_mes_if.if_wk_cost_nm IS 'ＩＦ工数管理名 // #MA.IF_EXT_SYS_NM // IF work element name';


COMMENT ON COLUMN msvt_mes_if.st_act_tm IS '着手実績日時 // #MA.TM // Actual start date and time';


COMMENT ON COLUMN msvt_mes_if.end_act_tm IS '終了実績日時 // #MA.TM // Actual end date and time';


COMMENT ON COLUMN msvt_mes_if.oper_unit_qty IS '工程単位実績数量 // #MA.QTY // Operation unit result qty.';


COMMENT ON COLUMN msvt_mes_if.bkf_ctl_flg IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN msvt_mes_if.wk_cost_calc_ctl_flg IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN msvt_mes_if.oper_yield IS '工程実際収率 // #MA.YIELD // Operation actual yield';


COMMENT ON COLUMN msvt_mes_if.not_cmpl_flg IS '未完了ＦＬＧ // #MA.FLG // Uncompleted flg.';


COMMENT ON COLUMN msvt_mes_if.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN msvt_mes_if.yield_rate IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN msvt_mes_if.itm_yield IS '品目実際収率 // #MA.YIELD // Item actual yield';


COMMENT ON COLUMN msvt_mes_if.all_oper_act_reg_flg IS '全工程実績作成ＦＬＧ // #MA.FLG // All operation results creation flg.';


COMMENT ON COLUMN msvt_mes_if.same_lot_flg IS '同一ロットＦＬＧ // #MA.FLG // Same lot flg.';


COMMENT ON COLUMN msvt_mes_if.not_pd_chk_flg IS '期限チェックしないＦＬＧ // #MA.FLG // No expiration check flg.';


COMMENT ON COLUMN msvt_mes_if.if_inpt_typ IS 'ＩＦ投入区分 // #MS.IF_INPT_TYP // IF input type';


COMMENT ON COLUMN msvt_mes_if.wk_cost IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN msvt_mes_if.st_hm IS '着手時刻 // #MA.TM // Start time';


COMMENT ON COLUMN msvt_mes_if.end_hm IS '終了時刻 // #MA.TM // End time';


COMMENT ON COLUMN msvt_mes_if.brk_pd IS '中断時間 // #MA.INT4 // Downtime';


COMMENT ON COLUMN msvt_mes_if.wk_cost_calc_upd_flg IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN msvt_mes_if.arr_cnt_rmrks IS '入荷連絡備考 // #MS.ARR_CNT_RMRKS // Receipt contact remarks';


COMMENT ON COLUMN msvt_mes_if.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN msvt_mes_if.trd_rmrks IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN msvt_mes_if.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN msvt_mes_if.intr_rmrks IS '内部備考 // #MS.IF_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN msvt_mes_if.intr_d_rmrks IS '内部明細備考 // #MS.IF_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN msvt_mes_if.mfg_act_intr_rmrks IS '内部備考（製造） // #MS.MFG_ACT_INTR_RMRKS // Internal remarks (Mfg.)';


COMMENT ON COLUMN msvt_mes_if.rpt_rmrks IS '記録書備考 // #MS.IF_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN msvt_mes_if.mfg_act_rpt_rmrks IS '記録書備考（製造） // #MS.MFG_ACT_RPT_RMRKS // Record sheet remarks (Mfg.)';


COMMENT ON COLUMN msvt_mes_if.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN msvt_mes_if.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN msvt_mes_if.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN msvt_mes_if.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN msvt_mes_if.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN msvt_mes_if.arr_schd_no IS '入荷予定ＮＯ // #MA.ARR_SCHD_NO // Receipt schedule No.';


COMMENT ON COLUMN msvt_mes_if.po_d_no IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN msvt_mes_if.prms_rcpt_d_no IS '納期回答受領明細ＮＯ // #MA.PRMS_RCPT_D_NO // Order promising result received details No.';


COMMENT ON COLUMN msvt_mes_if.dlv_inst_d_no IS '納入指示明細ＮＯ // #MA.DLV_INST_D_NO // Delivery order details No.';


COMMENT ON COLUMN msvt_mes_if.sls_ret_schd_d_no IS '売上返品予定明細ＮＯ // #MA.SLS_RET_SCHD_D_NO // Sales return schedule details No.';


COMMENT ON COLUMN msvt_mes_if.iv_d_no IS 'インボイス明細ＮＯ // #MA.IV_D_NO // Invoice details No.';


COMMENT ON COLUMN msvt_mes_if.xfr_inst_no IS '移動指図ＮＯ // #MA.XFR_INST_NO // Movement order No.';


COMMENT ON COLUMN msvt_mes_if.xfr_alloc_sts_no IS '移動引当状況ＮＯ // #MA.XFR_ALLOC_STS_NO // Movement allocation status No.';


COMMENT ON COLUMN msvt_mes_if.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_INST_NO // Output schedule No.';


COMMENT ON COLUMN msvt_mes_if.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN msvt_mes_if.wk_schd_no IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN msvt_mes_if.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN msvt_mes_if.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_mes_if.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN msvt_mes_if.ext_ship_act_no IS '外部出荷実績ＮＯ // #MA.EXT_SHIP_ACT_NO // External shipping result No.';


COMMENT ON COLUMN msvt_mes_if.ext_arr_act_no IS '外部入荷実績ＮＯ // #MA.EXT_ARR_ACT_NO // External receipt result No.';


COMMENT ON COLUMN msvt_mes_if.ext_xfr_act_no IS '外部移動実績ＮＯ // #MA.EXT_XFR_ACT_NO // External movement result No.';


COMMENT ON COLUMN msvt_mes_if.ext_oper_act_no IS '外部工程実績ＮＯ // #MA.EXT_OPER_ACT_NO // External operation result No.';


COMMENT ON COLUMN msvt_mes_if.ext_yield_act_no IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN msvt_mes_if.ext_inpt_act_no IS '外部投入実績ＮＯ // #MA.EXT_INPT_ACT_NO // External input result No.';


COMMENT ON COLUMN msvt_mes_if.ext_wk_act_no IS '外部工数実績ＮＯ // #MA.EXT_WK_ACT_NO // External man-hour result No.';


COMMENT ON COLUMN msvt_mes_if.req_no IS 'サーバリクエストＮＯ // #MA.SRV_REQ_NO // Server request No.';


COMMENT ON COLUMN msvt_mes_if.sub_char1 IS '予備ＣＨＡＲ項目１ // #MA.IF_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN msvt_mes_if.sub_char2 IS '予備ＣＨＡＲ項目２ // #MA.IF_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN msvt_mes_if.sub_char3 IS '予備ＣＨＡＲ項目３ // #MA.IF_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN msvt_mes_if.sub_char4 IS '予備ＣＨＡＲ項目４ // #MA.IF_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN msvt_mes_if.sub_char5 IS '予備ＣＨＡＲ項目５ // #MA.IF_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN msvt_mes_if.sub_char6 IS '予備ＣＨＡＲ項目６ // #MA.IF_SUB_CHAR6 // Spare CHAR column 6';


COMMENT ON COLUMN msvt_mes_if.sub_char7 IS '予備ＣＨＡＲ項目７ // #MA.IF_SUB_CHAR7 // Spare CHAR column 7';


COMMENT ON COLUMN msvt_mes_if.sub_char8 IS '予備ＣＨＡＲ項目８ // #MA.IF_SUB_CHAR8 // Spare CHAR column 8';


COMMENT ON COLUMN msvt_mes_if.sub_char9 IS '予備ＣＨＡＲ項目９ // #MA.IF_SUB_CHAR9 // Spare CHAR column 9';


COMMENT ON COLUMN msvt_mes_if.sub_char10 IS '予備ＣＨＡＲ項目１０ // #MA.IF_SUB_CHAR10 // Spare CHAR column 10';


COMMENT ON COLUMN msvt_mes_if.sub_char11 IS '予備ＣＨＡＲ項目１１ // #MA.IF_SUB_CHAR11 // Spare CHAR column 11';


COMMENT ON COLUMN msvt_mes_if.sub_char12 IS '予備ＣＨＡＲ項目１２ // #MA.IF_SUB_CHAR12 // Spare CHAR column 12';


COMMENT ON COLUMN msvt_mes_if.sub_char13 IS '予備ＣＨＡＲ項目１３ // #MA.IF_SUB_CHAR13 // Spare CHAR column 13';


COMMENT ON COLUMN msvt_mes_if.sub_char14 IS '予備ＣＨＡＲ項目１４ // #MA.IF_SUB_CHAR14 // Spare CHAR column 14';


COMMENT ON COLUMN msvt_mes_if.sub_char15 IS '予備ＣＨＡＲ項目１５ // #MA.IF_SUB_CHAR15 // Spare CHAR column 15';


COMMENT ON COLUMN msvt_mes_if.sub_char16 IS '予備ＣＨＡＲ項目１６ // #MA.IF_SUB_CHAR16 // Spare CHAR column 16';


COMMENT ON COLUMN msvt_mes_if.sub_char17 IS '予備ＣＨＡＲ項目１７ // #MA.IF_SUB_CHAR17 // Spare CHAR column 17';


COMMENT ON COLUMN msvt_mes_if.sub_char18 IS '予備ＣＨＡＲ項目１８ // #MA.IF_SUB_CHAR18 // Spare CHAR column 18';


COMMENT ON COLUMN msvt_mes_if.sub_char19 IS '予備ＣＨＡＲ項目１９ // #MA.IF_SUB_CHAR19 // Spare CHAR column 19';


COMMENT ON COLUMN msvt_mes_if.sub_char20 IS '予備ＣＨＡＲ項目２０ // #MA.IF_SUB_CHAR20 // Spare CHAR column 20';


COMMENT ON COLUMN msvt_mes_if.sub_char21 IS '予備ＣＨＡＲ項目２１ // #MA.IF_SUB_CHAR21 // Spare CHAR column 21';


COMMENT ON COLUMN msvt_mes_if.sub_char22 IS '予備ＣＨＡＲ項目２２ // #MA.IF_SUB_CHAR22 // Spare CHAR column 22';


COMMENT ON COLUMN msvt_mes_if.sub_char23 IS '予備ＣＨＡＲ項目２３ // #MA.IF_SUB_CHAR23 // Spare CHAR column 23';


COMMENT ON COLUMN msvt_mes_if.sub_char24 IS '予備ＣＨＡＲ項目２４ // #MA.IF_SUB_CHAR24 // Spare CHAR column 24';


COMMENT ON COLUMN msvt_mes_if.sub_char25 IS '予備ＣＨＡＲ項目２５ // #MA.IF_SUB_CHAR25 // Spare CHAR column 25';


COMMENT ON COLUMN msvt_mes_if.sub_char26 IS '予備ＣＨＡＲ項目２６ // #MA.IF_SUB_CHAR26 // Spare CHAR column 26';


COMMENT ON COLUMN msvt_mes_if.sub_char27 IS '予備ＣＨＡＲ項目２７ // #MA.IF_SUB_CHAR27 // Spare CHAR column 27';


COMMENT ON COLUMN msvt_mes_if.sub_char28 IS '予備ＣＨＡＲ項目２８ // #MA.IF_SUB_CHAR28 // Spare CHAR column 28';


COMMENT ON COLUMN msvt_mes_if.sub_char29 IS '予備ＣＨＡＲ項目２９ // #MA.IF_SUB_CHAR29 // Spare CHAR column 29';


COMMENT ON COLUMN msvt_mes_if.sub_char30 IS '予備ＣＨＡＲ項目３０ // #MA.IF_SUB_CHAR30 // Spare CHAR column 30';


COMMENT ON COLUMN msvt_mes_if.sub_num1 IS '予備ＮＵＭ項目１ // #MA.IF_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN msvt_mes_if.sub_num2 IS '予備ＮＵＭ項目２ // #MA.IF_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN msvt_mes_if.sub_num3 IS '予備ＮＵＭ項目３ // #MA.IF_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN msvt_mes_if.sub_num4 IS '予備ＮＵＭ項目４ // #MA.IF_SUB_NUM4 // Spare NUM column 4';


COMMENT ON COLUMN msvt_mes_if.sub_num5 IS '予備ＮＵＭ項目５ // #MA.IF_SUB_NUM5 // Spare NUM column 5';


COMMENT ON COLUMN msvt_mes_if.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN msvt_mes_if.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN msvt_mes_if.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN msvt_mes_if.sub_dt4 IS '予備ＤＡＴＥ項目４ // #MA.DT // Spare DATE column 4';


COMMENT ON COLUMN msvt_mes_if.sub_dt5 IS '予備ＤＡＴＥ項目５ // #MA.DT // Spare DATE column 5';


COMMENT ON COLUMN msvt_mes_if.batch_log_no IS 'ログＮＯ // #MA.BATCH_LOG_NO // Log No.';


COMMENT ON COLUMN msvt_mes_if.log_sub_key1 IS 'ログサブキー１ // #MA.BATCH_LOG_SUB_KEY1 // Log sub key 1';


COMMENT ON COLUMN msvt_mes_if.log_sub_key2 IS 'ログサブキー２ // #MA.BATCH_LOG_SUB_KEY2 // Log sub key 2';


COMMENT ON COLUMN msvt_mes_if.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN msvt_mes_if.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN msvt_mes_if.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN msvt_mes_if.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN msvt_mes_if.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN msvt_mes_if.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN msvt_mes_if.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN msvt_mes_if.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN msvt_mes_if.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN msvt_mes_if.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN msvt_mes_if.acxfr_lg_grp_cd IS '他勘定振替物流グループＣＤ // #MA.LG_GRP_CD // Other accounting transfer distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_lg_grp_cd IS 'ＩＦ他勘定振替物流グループＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer distribution group cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_lg_grp_nm IS 'ＩＦ他勘定振替物流グループ名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer distribution group name';


COMMENT ON COLUMN msvt_mes_if.acxfr_loc_cd IS '他勘定振替場所ＣＤ // #MA.LOC_CD // Other accounting transfer location cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_loc_cd IS 'ＩＦ他勘定振替場所ＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer location cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_loc_nm IS 'ＩＦ他勘定振替場所名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer location name';


COMMENT ON COLUMN msvt_mes_if.acxfr_str_ln_cd IS '他勘定振替棚・ラインＣＤ // #MA.STR_LN_CD // Other accounting transfer rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_str_ln_cd IS 'ＩＦ他勘定振替棚・ラインＣＤ // #MA.IF_EXT_SYS_CD // IF other accounting transfer rack/line cd.';


COMMENT ON COLUMN msvt_mes_if.if_acxfr_str_ln_nm IS 'ＩＦ他勘定振替棚・ライン名 // #MA.IF_EXT_SYS_NM // IF other accounting transfer rack/line name';


COMMENT ON COLUMN msvt_mes_if.acxfr_inst_no IS '他勘定振替指図ＮＯ // #MA.ACXFR_INST_NO // Other accounting transfer order No.';


COMMENT ON COLUMN msvt_mes_if.acxfr_inst_d_no IS '他勘定振替指図明細ＮＯ // #MA.ACXFR_INST_D_NO // Other accounting transfer order details No.';


COMMENT ON COLUMN msvt_mes_if.ext_acxfr_act_no IS '外部他勘定振替実績ＮＯ // #MA.EXT_ACXFR_ACT_NO // External other accounting transfer result No.';

