\encoding UTF-8

COMMENT ON VIEW mst_insp_schd IS '検査予定 // Inspection schedule';


COMMENT ON COLUMN mst_insp_schd.insp_schd_no IS '検査予定ＮＯ // #MA.INSP_SCHD_NO // Inspection schedule No.';


COMMENT ON COLUMN mst_insp_schd.src_no1 IS '作成元ＮＯ１ // #MA.SRC_NO // Source No. 1';


COMMENT ON COLUMN mst_insp_schd.src_no2 IS '作成元ＮＯ２ // #MA.SRC_NO // Source No. 2';


COMMENT ON COLUMN mst_insp_schd.src_no3 IS '作成元ＮＯ３ // #MA.SRC_NO // Source No. 3';


COMMENT ON COLUMN mst_insp_schd.src_no4 IS '作成元ＮＯ４ // #MA.SRC_NO // Source No. 4';


COMMENT ON COLUMN mst_insp_schd.insp_typ IS '検査種類区分 // #MS.INSP_TYP // Inspection classification type';


COMMENT ON COLUMN mst_insp_schd.insp_mtd_typ IS '検査方法区分 // #MA.INSP_MTD_TYP // Inspection method type';


COMMENT ON COLUMN mst_insp_schd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_insp_schd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_insp_schd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_insp_schd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_insp_schd.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_insp_schd.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_insp_schd.stk_arrv_bp_cd IS '在庫着荷先ＣＤ // #MA.BP_CD // Inventory arriving point cd.';


COMMENT ON COLUMN mst_insp_schd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_insp_schd.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_insp_schd.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_insp_schd.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_insp_schd.stk_bp_cd IS '在庫取引先ＣＤ // #MA.BP_CD // Inventory BP cd.';


COMMENT ON COLUMN mst_insp_schd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_insp_schd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_insp_schd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_insp_schd.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN mst_insp_schd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_insp_schd.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN mst_insp_schd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_insp_schd.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN mst_insp_schd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_insp_schd.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN mst_insp_schd.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mst_insp_schd.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN mst_insp_schd.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_insp_schd.from_site_cd IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN mst_insp_schd.bp_lot_no IS '業者ロットＮＯ // #MA.BP_LOT_NO // Vendor lot No.';


COMMENT ON COLUMN mst_insp_schd.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_insp_schd.st_tm IS '開始予定日時 // #MA.TM // Scheduled start date and time';


COMMENT ON COLUMN mst_insp_schd.end_tm IS '終了予定日時 // #MA.TM // Scheduled end date and time';


COMMENT ON COLUMN mst_insp_schd.pack_unit_qty IS '荷姿単位数量 // #MA.QTY // SKU qty.';


COMMENT ON COLUMN mst_insp_schd.pack_unit_cd IS '荷姿単位ＣＤ // #MA.UNIT_CD // SKU cd.';


COMMENT ON COLUMN mst_insp_schd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN mst_insp_schd.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_insp_schd.smpl_schd_qty IS '抜取予定数量 // #MA.QTY // Sampling scheduled qty.';


COMMENT ON COLUMN mst_insp_schd.smpl_inst_qty IS '抜取指図数量 // #MA.QTY // Sampling order qty.';


COMMENT ON COLUMN mst_insp_schd.own_insp_no IS '参照検査ＮＯ // #MA.INSP_NO // Reference inspection No.';


COMMENT ON COLUMN mst_insp_schd.own_insp_schd_no IS '参照検査予定ＮＯ // #MA.INSP_SCHD_NO // Reference inspection schedule No.';


COMMENT ON COLUMN mst_insp_schd.org_insp_schd_no IS '初回検査予定ＮＯ // #MA.INSP_SCHD_NO // Initial inspection schedule No.';


COMMENT ON COLUMN mst_insp_schd.latest_flg IS '最新ＦＬＧ // #MA.FLG // Latest flg.';


COMMENT ON COLUMN mst_insp_schd.insp_freq IS '検査回数 // #MS.INSP_FREQ // Number of inspections';


COMMENT ON COLUMN mst_insp_schd.lmt_up_flg IS '期限再検査ＦＬＧ // #MA.FLG // Re-inspection for expiration flg.';


COMMENT ON COLUMN mst_insp_schd.insp_schd_sts_typ IS '検査予定状況区分 // #MS.INSP_STS_TYP // Inspection schedule status type';


COMMENT ON COLUMN mst_insp_schd.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mst_insp_schd.insp_no IS '検査ＮＯ // #MA.INSP_NO // Inspection No.';


COMMENT ON COLUMN mst_insp_schd.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_insp_schd.in_prmt_insp_flg IS '検査中使用許可ＦＬＧ // #MA.FLG // Allow inspecting use flg.';


COMMENT ON COLUMN mst_insp_schd.trd_cd IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN mst_insp_schd.insp_bind_typ IS '検査実施単位区分 // #MA.INSP_BIND_TYP // Inspection implementation unit type';


COMMENT ON COLUMN mst_insp_schd.insp_lt IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN mst_insp_schd.insp_offst IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN mst_insp_schd.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN mst_insp_schd.sub_char1 IS '予備１ // #MS.INSP_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_insp_schd.sub_char2 IS '予備２ // #MS.INSP_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_insp_schd.sub_char3 IS '予備３ // #MS.INSP_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_insp_schd.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_insp_schd.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_insp_schd.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_insp_schd.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_insp_schd.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_insp_schd.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_insp_schd.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_insp_schd.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_insp_schd.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_insp_schd.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

