\encoding UTF-8

COMMENT ON TABLE mst_mly_stk_dtl_all IS '月次受払在庫 // Monthly GR/GI and inventory';


COMMENT ON COLUMN mst_mly_stk_dtl_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_mly_stk_dtl_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_mly_stk_dtl_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_mly_stk_dtl_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_mly_stk_dtl_all.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.io_act_typ IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN mst_mly_stk_dtl_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mst_mly_stk_dtl_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sub_char1 IS '予備１ // #MS.MLY_STK_DTL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sub_char2 IS '予備２ // #MS.MLY_STK_DTL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mly_stk_dtl_all.sub_char3 IS '予備３ // #MS.MLY_STK_DTL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mly_stk_dtl_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mly_stk_dtl_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mly_stk_dtl_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mly_stk_dtl_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mly_stk_dtl_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

