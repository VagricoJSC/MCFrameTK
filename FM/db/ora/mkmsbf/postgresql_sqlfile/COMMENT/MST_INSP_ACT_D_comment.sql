\encoding UTF-8

COMMENT ON VIEW mst_insp_act_d IS '検査実績明細 // Inspection result details';


COMMENT ON COLUMN mst_insp_act_d.insp_act_d_no IS '検査実績明細ＮＯ // #MA.INSP_ACT_D_NO // Inspection result details No.';


COMMENT ON COLUMN mst_insp_act_d.insp_act_no IS '検査実績ＮＯ // #MA.INSP_ACT_NO // Inspection result No.';


COMMENT ON COLUMN mst_insp_act_d.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_act_d.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_act_d.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_act_d.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_act_d.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_insp_act_d.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_insp_act_d.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_insp_act_d.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_insp_act_d.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_insp_act_d.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_insp_act_d.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_insp_act_d.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_insp_act_d.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_act_d.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_act_d.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_insp_act_d.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mst_insp_act_d.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_insp_act_d.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mst_insp_act_d.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_insp_act_d.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mst_insp_act_d.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_insp_act_d.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mst_insp_act_d.fix_no_typ IS '確定ＮＯ区分 // #MS.FIX_NO_TYP // Firm No. type';


COMMENT ON COLUMN mst_insp_act_d.fix_no IS '確定ＮＯ // #MA.FIX_NO // Firm No.';


COMMENT ON COLUMN mst_insp_act_d.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_act_d.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_act_d.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_act_d.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_act_d.pack_xfr_pack_unit_qty IS '荷姿振替荷姿単位数量 // #MA.QTY // SKU transfer packing unit qty.';


COMMENT ON COLUMN mst_insp_act_d.pack_xfr_pack_unit_cd IS '荷姿振替荷姿単位ＣＤ // #MA.UNIT_CD // SKU transfer packing unit cd.';


COMMENT ON COLUMN mst_insp_act_d.pack_xfr_base_unit_qty IS '荷姿振替基準単位数量 // #MA.QTY // SKU transfer base unit qty.';


COMMENT ON COLUMN mst_insp_act_d.pack_xfr_base_unit_cd IS '荷姿振替基準単位ＣＤ // #MA.UNIT_CD // SKU transfer base unit cd.';


COMMENT ON COLUMN mst_insp_act_d.dfct_rsn_cd IS '不良理由ＣＤ // #MA.BIZ_RSN_CD // Defective reason cd.';


COMMENT ON COLUMN mst_insp_act_d.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_insp_act_d.intr_rmrks IS '内部備考 // #MS.INSP_ACT_D_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_insp_act_d.sub_char1 IS '予備１ // #MS.INSP_ACT_D_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_insp_act_d.sub_char2 IS '予備２ // #MS.INSP_ACT_D_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_insp_act_d.sub_char3 IS '予備３ // #MS.INSP_ACT_D_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_insp_act_d.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_act_d.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_act_d.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_act_d.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_act_d.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_act_d.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_act_d.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_act_d.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_act_d.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_act_d.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mst_insp_act_d.lims_flg IS 'ＬＩＭＳＦＬＧ // #MA.FLG // LIMS flg.';


COMMENT ON COLUMN mst_insp_act_d.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mst_insp_act_d.ext_insp_act_d_no IS '外部検査実績明細ＮＯ // #MA.EXT_INSP_ACT_D_NO // External inspection result details No.';

