\encoding UTF-8

COMMENT ON VIEW mst_io_schd IS '受払予定 // GR/GI schedule';


COMMENT ON COLUMN mst_io_schd.slip_schd_no IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN mst_io_schd.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN mst_io_schd.io_typ IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN mst_io_schd.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN mst_io_schd.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN mst_io_schd.io_schd_seq IS '受払予定連番 // #MA.INT3 // GR/GI schedule sequence number';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_typ1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_no1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_seq1 IS '受払予定予備連番１ // #MA.INT3 // GR/GI schedule spare sequence No. 1';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_typ2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_no2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_seq2 IS '受払予定予備連番２ // #MA.INT3 // GR/GI schedule spare sequence No. 2';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_typ3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_no3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_seq3 IS '受払予定予備連番３ // #MA.INT3 // GR/GI schedule spare sequence No. 3';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_typ4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_no4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN mst_io_schd.io_schd_sub_seq4 IS '受払予定予備連番４ // #MA.INT3 // GR/GI schedule spare sequence No. 4';


COMMENT ON COLUMN mst_io_schd.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_io_schd.schd_dt IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN mst_io_schd.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN mst_io_schd.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN mst_io_schd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_io_schd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_io_schd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_io_schd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_io_schd.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_io_schd.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mst_io_schd.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN mst_io_schd.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_io_schd.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mst_io_schd.alt_qty IS '代替元数量 // #MA.QTY // Alternative source qty.';


COMMENT ON COLUMN mst_io_schd.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mst_io_schd.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mst_io_schd.alt_alloc_prio IS '代替品目引当優先順 // #MA.INT // Alternative item allocation order of priority';


COMMENT ON COLUMN mst_io_schd.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_io_schd.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_io_schd.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_io_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_io_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_io_schd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_io_schd.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_io_schd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_io_schd.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_io_schd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_io_schd.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_io_schd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_io_schd.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_io_schd.ex_sno1 IS 'オーダ生成用手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1 for order generation';


COMMENT ON COLUMN mst_io_schd.ex_sno2 IS 'オーダ生成用手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2 for order generation';


COMMENT ON COLUMN mst_io_schd.ex_sno3 IS 'オーダ生成用手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3 for order generation';


COMMENT ON COLUMN mst_io_schd.ex_sno4 IS 'オーダ生成用手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4 for order generation';


COMMENT ON COLUMN mst_io_schd.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_io_schd.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_io_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_io_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_io_schd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_io_schd.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_io_schd.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_io_schd.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mst_io_schd.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_io_schd.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_io_schd.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_io_schd.alloc_tgt_flg IS '引当対象ＦＬＧ // #MA.FLG // To allocate flg.';


COMMENT ON COLUMN mst_io_schd.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mst_io_schd.alloc_flg IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN mst_io_schd.alloc_wait_flg IS '引当保留ＦＬＧ // #MA.FLG // Allocation pending flg.';


COMMENT ON COLUMN mst_io_schd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_io_schd.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_io_schd.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_io_schd.vld_dt_to IS '有効期限ＴＯ // #MA.DT // Expiration date TO';


COMMENT ON COLUMN mst_io_schd.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mst_io_schd.gi_loc_cd IS '出庫場所ＣＤ // #MA.LOC_CD // GI location cd.';


COMMENT ON COLUMN mst_io_schd.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mst_io_schd.accrual_flg IS '在庫発生基準ＦＬＧ // #MA.FLG // Inventory accrual base flg.';


COMMENT ON COLUMN mst_io_schd.accpt_flg IS '資産発生基準ＦＬＧ // #MA.FLG // Asset accrual base flg.';


COMMENT ON COLUMN mst_io_schd.avl_flg IS '使用可能日基準ＦＬＧ // #MA.FLG // Available date basis flg.';


COMMENT ON COLUMN mst_io_schd.sub_char1 IS '予備ＣＨＡＲ項目１ // #MS.IO_SCHD_SUB_CHAR1 // Spare CHAR column 1';


COMMENT ON COLUMN mst_io_schd.sub_char2 IS '予備ＣＨＡＲ項目２ // #MS.IO_SCHD_SUB_CHAR2 // Spare CHAR column 2';


COMMENT ON COLUMN mst_io_schd.sub_char3 IS '予備ＣＨＡＲ項目３ // #MS.IO_SCHD_SUB_CHAR3 // Spare CHAR column 3';


COMMENT ON COLUMN mst_io_schd.sub_char4 IS '予備ＣＨＡＲ項目４ // #MS.IO_SCHD_SUB_CHAR4 // Spare CHAR column 4';


COMMENT ON COLUMN mst_io_schd.sub_char5 IS '予備ＣＨＡＲ項目５ // #MS.IO_SCHD_SUB_CHAR5 // Spare CHAR column 5';


COMMENT ON COLUMN mst_io_schd.sub_num1 IS '予備ＮＵＭ項目１ // #MS.IO_SCHD_SUB_NUM1 // Spare NUM column 1';


COMMENT ON COLUMN mst_io_schd.sub_num2 IS '予備ＮＵＭ項目２ // #MS.IO_SCHD_SUB_NUM2 // Spare NUM column 2';


COMMENT ON COLUMN mst_io_schd.sub_num3 IS '予備ＮＵＭ項目３ // #MS.IO_SCHD_SUB_NUM3 // Spare NUM column 3';


COMMENT ON COLUMN mst_io_schd.sub_dt1 IS '予備ＤＡＴＥ項目１ // #MA.DT // Spare DATE column 1';


COMMENT ON COLUMN mst_io_schd.sub_dt2 IS '予備ＤＡＴＥ項目２ // #MA.DT // Spare DATE column 2';


COMMENT ON COLUMN mst_io_schd.sub_dt3 IS '予備ＤＡＴＥ項目３ // #MA.DT // Spare DATE column 3';


COMMENT ON COLUMN mst_io_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_io_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_io_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_io_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_io_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_io_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_io_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_io_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_io_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_io_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

