\encoding UTF-8

COMMENT ON VIEW mst_purc_ret_act_io IS '仕入返品実績受払 // Purchase return result GR/GI';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_act_io_no IS '仕入返品実績受払ＮＯ // #MA.PURC_RET_ACT_IO_NO // Purchase return result GR/GI No.';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_act_no IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_act_d_no IS '仕入返品実績明細ＮＯ // #MA.PURC_RET_ACT_D_NO // Purchase return result details No.';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_act_rev IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_loc_wg_cd IS '仕入返品元場所ＷＧ ＣＤ // #MA.WG_CD // Purchase return-from location WG cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_loc_cd IS '仕入返品元場所ＣＤ // #MA.LOC_CD // Purchase return-from location cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_purc_ret_act_io.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_purc_ret_act_io.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_purc_ret_act_io.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_purc_ret_act_io.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_purc_ret_act_io.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_purc_ret_act_io.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_purc_ret_act_io.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.stk_arrv_bp_cd IS '在庫着荷先 // #MA.BP_CD // Inventory arriving point';


COMMENT ON COLUMN mst_purc_ret_act_io.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_purc_ret_act_io.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_purc_ret_act_io.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_purc_ret_act_io.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_purc_ret_act_io.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_cont_qty IS '仕入有効成分 // #MA.PURC_CONT_QTY // Purchase active ingredient';


COMMENT ON COLUMN mst_purc_ret_act_io.ref_arr_act_no IS '参照入荷実績ＮＯ // #MA.ARR_ACT_NO // Reference receipt result No.';


COMMENT ON COLUMN mst_purc_ret_act_io.ref_arr_act_rev IS '参照入荷実績改訂番号 // #MA.SLIP_REV // Reference receipt result rev. number';


COMMENT ON COLUMN mst_purc_ret_act_io.ref_purc_act_io_no IS '参照仕入実績受払ＮＯ // #MA.PURC_ACT_IO_NO // Reference purchase result GR/GI No.';


COMMENT ON COLUMN mst_purc_ret_act_io.ref_purc_act_io_seq IS '参照仕入実績受払連番 // #MA.SLIP_SEQ // Reference purchase result GR/GI sequence number';


COMMENT ON COLUMN mst_purc_ret_act_io.purc_ret_schd_io_no IS '仕入返品予定受払ＮＯ // #MA.PURC_RET_SCHD_IO_NO // Purchase return schedule GR/GI No.';


COMMENT ON COLUMN mst_purc_ret_act_io.sls_act_io_no IS '売上実績受払ＮＯ // #MA.SLS_ACT_IO_NO // Sales result GR/GI No.';


COMMENT ON COLUMN mst_purc_ret_act_io.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_purc_ret_act_io.sub_char1 IS '予備項目１ // #MS.PURC_RET_ACT_IO_SUB_CHAR1 // Spare column 1';


COMMENT ON COLUMN mst_purc_ret_act_io.sub_char2 IS '予備項目２ // #MS.PURC_RET_ACT_IO_SUB_CHAR2 // Spare column 2';


COMMENT ON COLUMN mst_purc_ret_act_io.sub_char3 IS '予備項目３ // #MS.PURC_RET_ACT_IO_SUB_CHAR3 // Spare column 3';


COMMENT ON COLUMN mst_purc_ret_act_io.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_ret_act_io.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_ret_act_io.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_ret_act_io.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_ret_act_io.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

