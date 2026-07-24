\encoding UTF-8

COMMENT ON TABLE mst_inpt_stk_rpl_lst_all IS '投入品不足一覧 // Replenishment for input item shortage';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.batch_data_no IS 'バッチデータＮＯ // #MA.BATCH_DATA_NO // Batch data No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.exec_tm IS '実行日時 // #MA.TM // Execution date and time';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.batch_log_no IS 'バッチログＮＯ // #MA.BATCH_LOG_NO // Batch log No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.slip_schd_no IS '受払予定伝票ＮＯ // #MA.SLIP_SCHD_NO // GR/GI schedule slip No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alloc_flg IS '引当ＦＬＧ // #MA.FLG // Allocation flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_seq IS '受払予定連番 // #MA.INT3 // GR/GI schedule sequence number';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_typ1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_no1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_seq1 IS '受払予定予備連番１ // #MA.INT3 // GR/GI schedule spare sequence No. 1';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_typ2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_no2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_seq2 IS '受払予定予備連番２ // #MA.INT3 // GR/GI schedule spare sequence No. 2';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_typ3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_no3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_seq3 IS '受払予定予備連番３ // #MA.INT3 // GR/GI schedule spare sequence No. 3';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_typ4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_no4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_sub_seq4 IS '受払予定予備連番４ // #MA.INT3 // GR/GI schedule spare sequence No. 4';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.schd_dt IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno1_null_flg IS '手配ＮＯ１無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 1 flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno2_null_flg IS '手配ＮＯ２無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 2 flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno3_null_flg IS '手配ＮＯ３無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 3 flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.sno4_null_flg IS '手配ＮＯ４無し可ＦＬＧ // #MA.FLG // Allow without SEIBAN No. 4 flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.short_qty IS '不足数 // #MA.QTY // Insufficient qty.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.not_lot_mix_flg IS 'ロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed lots flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.not_sublot_mix_flg IS 'サブロット混在不可ＦＬＧ // #MA.FLG // Prohibit mixed sublots flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.vld_dt_fr IS '有効期限ＦＲＯＭ // #MA.DT // Expiration date FROM';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_grp_id IS '代替グループＩＤ // #MA.ALT_GRP_ID // Alternative group ID';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_itm_fix_flg IS '代替品目指定ＦＬＧ // #MA.FLG // Alternative item specification flg.';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.alt_alloc_prio IS '代替品目引当優先順位 // #MA.INT // Alternative item allocation priority';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_inpt_stk_rpl_lst_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

