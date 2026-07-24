\encoding UTF-8

COMMENT ON TABLE mst_xfr_alloc_sts_all IS '移動引当状況 // Movement allocation status';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.xfr_alloc_sts_no IS '移動引当状況ＮＯ // #MA.XFR_ALLOC_STS_NO // Movement allocation status No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.pr_sts_typ IS '進捗状況区分 // #MS.PR_STS_TYP // Progress status type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.xfr_schd_no IS '移動・移送予定ＮＯ // #MA.XFR_SCHD_NO // Movement/transport schedule No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.xfr_inst_d_no IS '移動指図明細ＮＯ // #MA.XFR_INST_D_NO // Movement order details No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.trd_ptn_typ IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gi_str_ln_cd IS '出庫棚・ラインＣＤ // #MA.STR_LN_CD // GI rack/line cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gi_stk_arrv_bp_cd IS '出庫在庫着荷先ＣＤ // #MA.BP_CD // GI inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gr_str_ln_cd IS '入庫棚・ラインＣＤ // #MA.STR_LN_CD // GR rack/line cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gr_stk_arrv_bp_cd IS '入庫在庫着荷先ＣＤ // #MA.BP_CD // GR inventory arriving point cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.alloc_sno1 IS '引当手配ＮＯ１ // #MA.SNO1 // Allocation SEIBAN No. 1';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.alloc_sno2 IS '引当手配ＮＯ２ // #MA.SNO2 // Allocation SEIBAN No. 2';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.alloc_sno3 IS '引当手配ＮＯ３ // #MA.SNO3 // Allocation SEIBAN No. 3';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.alloc_sno4 IS '引当手配ＮＯ４ // #MA.SNO4 // Allocation SEIBAN No. 4';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.trd_unit_qty IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.act_qty IS '移動実績数量 // #MA.QTY // Movement result qty.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.xfr_schd_dt IS '移動予定日 // #MA.DT // Scheduled movement date';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ship_inst_typ IS '出荷指図区分 // #MA.SHIP_INST_TYP // Shipping order type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.rsn_cd IS '理由ＣＤ // #MA.BIZ_RSN_CD // Reason cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.bd_dpt_cd IS '負担部門ＣＤ // #MA.DPT_CD // Charged dept. cd.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.inst_bndl_flg IS '指図まとめＦＬＧ // #MA.FLG // Order aggregation flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.abort_flg IS '打切ＦＬＧ // #MA.FLG // Cancel remaining flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.alloc_flg IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.prov_basis_typ IS '支給計上区分 // #MA.PROV_BASIS_TYP // Supply recording type';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ret_prov_typ IS '支給区分（返品） // #MA.PROV_TYP // Supply type (Return)';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ret_prov_basis_typ IS '支給計上区分（返品） // #MA.PROV_BASIS_TYP // Supply recording type (Return)';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sub_char1 IS '予備１ // #MS.XFR_ALLOC_STS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sub_char2 IS '予備２ // #MS.XFR_ALLOC_STS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.sub_char3 IS '予備３ // #MS.XFR_ALLOC_STS_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.disp_seq IS '表示順 // #MA.DISP_SEQ // Display order';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.dlv_slip_no IS '納品書ＮＯ // #MA.DLV_SLIP_NO // Delivery note No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.dlv_slip_seq IS '納品書連番 // #MA.SLIP_SEQ // Delivery note sequence number';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.dlv_slip_d_no IS '納品書明細ＮＯ // #MA.DLV_SLIP_D_NO // Delivery note details No.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.wms_flg IS 'ＷＭＳＦＬＧ // #MA.FLG // WMS flg.';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.trd_d_rmrks IS '取引明細備考 // #MA.TRD_D_RMRKS // Transaction details remarks';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.inst_d_rmrks IS '指図明細備考 // #MS.XFR_INST_D_RMRKS // Order details remarks';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.intr_d_rmrks IS '内部明細備考 // #MS.XFR_INST_INTR_D_RMRKS // Internal details remarks';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_xfr_alloc_sts_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

