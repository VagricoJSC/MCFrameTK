\encoding UTF-8

COMMENT ON VIEW mgvt_mst_mly_stk_dtl IS '月次受払在庫ビュー // Monthly GR/GI and inventory view';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.fix_no_typ IS '確定ＮＯ区分 //  // Firm No. type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.in_xfr_typ IS '積送品区分 //  // In-transit type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.stk_insp_typ IS '在庫検査区分 //  // Inventory inspection type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.stk_id_typ IS '在庫識別区分 //  // Inventory identification type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.io_act_typ IS '受払区分 //  // GR/GI type';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sub_char1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sub_char2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.sub_char3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgvt_mst_mly_stk_dtl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

