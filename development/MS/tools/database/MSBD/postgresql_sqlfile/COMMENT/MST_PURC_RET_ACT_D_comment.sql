\encoding UTF-8

COMMENT ON VIEW mst_purc_ret_act_d IS '仕入返品実績明細 // Purchase return result details';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_act_d_no IS '仕入返品実績明細ＮＯ // #MA.PURC_RET_ACT_D_NO // Purchase return result details No.';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_act_no IS '仕入返品実績ＮＯ // #MA.PURC_RET_ACT_NO // Purchase return result No.';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_act_rev IS '仕入返品実績改訂番号 // #MA.SLIP_REV // Purchase return result rev. number';


COMMENT ON COLUMN mst_purc_ret_act_d.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_purc_ret_act_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_purc_ret_act_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_purc_ret_act_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_purc_ret_act_d.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_purc_ret_act_d.itm_nm IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN mst_purc_ret_act_d.iv_itm_nm IS 'インボイス表記用品名 // #MA.ITM_NM // Item name for invoice';


COMMENT ON COLUMN mst_purc_ret_act_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_purc_ret_act_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_purc_ret_act_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_purc_ret_act_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_purc_ret_act_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_purc_ret_act_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_purc_ret_act_d.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_typ IS '購買区分 // #MA.PURC_TYP // Purchase type';


COMMENT ON COLUMN mst_purc_ret_act_d.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_purc_ret_act_d.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_purc_ret_act_d.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_purc_ret_act_d.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_purc_ret_act_d.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_purc_ret_act_d.stk_mng_typ IS '在庫管理区分 // #MA.STK_MNG_TYP // Inventory management type';


COMMENT ON COLUMN mst_purc_ret_act_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.stk_arrv_bp_cd IS '在庫着荷先 // #MA.BP_CD // Inventory arriving point';


COMMENT ON COLUMN mst_purc_ret_act_d.ret_rsn_cd IS '返品理由ＣＤ // #MA.BIZ_RSN_CD // Return reason cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.sundry_itm_flg IS '諸口品ＦＬＧ // #MA.FLG // Miscellaneous item flg.';


COMMENT ON COLUMN mst_purc_ret_act_d.sppl_itm_cd IS '発注先品目ＣＤ // #MA.BP_ITM_CD // Supplier item cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.sppl_itm_nm IS '発注先品名 // #MA.BP_ITM_NM // Supplier item name';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_loc_wg_cd IS '仕入返品元場所ＷＧ ＣＤ // #MA.WG_CD // Purchase return-from location WG cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_loc_cd IS '仕入返品元場所ＣＤ // #MA.LOC_CD // Purchase return-from location cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_purc_ret_act_d.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_purc_ret_act_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_id_typ IS '購買識別区分 // #MA.PURC_ID_TYP // Purchase identification type';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_cont_qty IS '仕入有効成分 // #MA.PURC_CONT_QTY // Purchase active ingredient';


COMMENT ON COLUMN mst_purc_ret_act_d.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mst_purc_ret_act_d.ref_purc_act_no IS '参照仕入実績ＮＯ // #MA.PURC_ACT_NO // Reference purchase result No.';


COMMENT ON COLUMN mst_purc_ret_act_d.ref_purc_act_seq IS '参照仕入実績連番 // #MA.SLIP_SEQ // Reference purchase result sequence number';


COMMENT ON COLUMN mst_purc_ret_act_d.ref_purc_act_d_no IS '参照仕入実績明細ＮＯ // #MA.PURC_ACT_D_NO // Reference purchase result details No.';


COMMENT ON COLUMN mst_purc_ret_act_d.ref_purc_act_d_seq IS '参照仕入実績明細連番 // #MA.SLIP_SEQ // Reference purchase result details sequence number';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_schd_d_no IS '仕入返品予定明細ＮＯ // #MA.PURC_RET_SCHD_D_NO // Purchase return schedule details No.';


COMMENT ON COLUMN mst_purc_ret_act_d.sls_act_d_no IS '売上実績明細ＮＯ // #MA.SLS_ACT_D_NO // Sales result details No.';


COMMENT ON COLUMN mst_purc_ret_act_d.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_purc_ret_act_d.intr_rmrks IS '内部明細備考 // #MS.PURC_RET_ACT_D_INTR_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_purc_ret_act_d.purc_ret_print_d_rmrks IS '仕入返品票明細備考 // #MS.PURC_RET_PRINT_D_RMRKS // Purchase return slip details remarks';


COMMENT ON COLUMN mst_purc_ret_act_d.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_purc_ret_act_d.sub_char1 IS '予備１ // #MS.PURC_RET_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_purc_ret_act_d.sub_char2 IS '予備２ // #MS.PURC_RET_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_purc_ret_act_d.sub_char3 IS '予備３ // #MS.PURC_RET_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_purc_ret_act_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_purc_ret_act_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_purc_ret_act_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_purc_ret_act_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_purc_ret_act_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

