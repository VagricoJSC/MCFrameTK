\encoding UTF-8

COMMENT ON VIEW mst_inpt_alloc_sts IS '投入引当状況 // Input allocation status type';


COMMENT ON COLUMN mst_inpt_alloc_sts.inpt_alloc_sts_no IS '投入引当状況ＮＯ // #MA.INPT_ALLOC_STS_NO // Input allocation status No.';


COMMENT ON COLUMN mst_inpt_alloc_sts.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN mst_inpt_alloc_sts.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_inpt_alloc_sts.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_inpt_alloc_sts.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_alloc_sts.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_inpt_alloc_sts.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_inpt_alloc_sts.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_inpt_alloc_sts.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_inpt_alloc_sts.to_stk_id_typ IS '移動先在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type (Destination)';


COMMENT ON COLUMN mst_inpt_alloc_sts.to_stk_bp_cd IS '移動先在庫取引先ＣＤ // #MA.BP_CD // Inventory destination cd. (Destination)';


COMMENT ON COLUMN mst_inpt_alloc_sts.to_stk_arrv_bp_cd IS '移動先在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd. (Destination)';


COMMENT ON COLUMN mst_inpt_alloc_sts.sub_char1 IS '予備１ // #MS.INPT_ALLOC_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_inpt_alloc_sts.sub_char2 IS '予備２ // #MS.INPT_ALLOC_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_inpt_alloc_sts.sub_char3 IS '予備３ // #MS.INPT_ALLOC_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_inpt_alloc_sts.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_alloc_sts.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_alloc_sts.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_alloc_sts.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_alloc_sts.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

