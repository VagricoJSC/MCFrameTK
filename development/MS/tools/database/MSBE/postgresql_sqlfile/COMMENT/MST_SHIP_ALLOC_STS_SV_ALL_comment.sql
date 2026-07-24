\encoding UTF-8

COMMENT ON TABLE mst_ship_alloc_sts_sv_all IS '出荷引当状況_保存 // Shipping allocation status_save';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_alloc_sts_no IS '出荷引当状況ＮＯ // #MA.SHIP_ALLOC_STS_NO // Shipping allocation status No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_schd_no IS '出荷予定ＮＯ // #MA.SHIP_SCHD_NO // Shipping schedule No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_inst_no IS '出荷指図ＮＯ // #MA.SHIP_INST_NO // Shipping order No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_inst_d_no IS '出荷指図明細ＮＯ // #MA.SHIP_INST_D_NO // Shipping order details No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_str_ln_cd IS '出荷棚・ラインＣＤ // #MA.STR_LN_CD // Shipping rack/line cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ent_unit_qty IS '入力単位数量 // #MA.QTY // Input unit qty.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ent_unit_cd IS '入力単位ＣＤ // #MA.UNIT_CD // Input unit cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ship_act_qty IS '出荷実績数量 // #MA.QTY // Shipping result qty.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.alloc_flg IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.alloc_wait_flg IS '引当保留ＦＬＧ // #MA.FLG // Allocation pending flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.stk_lst_prnt_flg IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sub_char1 IS '予備１ // #MS.SHIP_ALLOC_STS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sub_char2 IS '予備２ // #MS.SHIP_ALLOC_STS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.sub_char3 IS '予備３ // #MS.SHIP_ALLOC_STS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ship_alloc_sts_sv_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

