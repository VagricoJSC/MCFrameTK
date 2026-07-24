\encoding UTF-8

COMMENT ON VIEW mst_itm_mfg_inst_p IS '品目製造指図（改訂履歴） // Item mfg. order (Rev. history)';


COMMENT ON COLUMN mst_itm_mfg_inst_p.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.frst_mfg_inst_no IS '初回製造指図ＮＯ // #MA.MFG_INST_NO // Initial mfg. order No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.mfg_mtd_typ IS '生産方法区分 // #MS.MFG_MTD_TYP // Production method type';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sppl_cd IS '外注先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_itm_mfg_inst_p.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mst_itm_mfg_inst_p.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mst_itm_mfg_inst_p.base_unit_yield_qty IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.base_unit_inst_qty IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_itm_mfg_inst_p.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_itm_mfg_inst_p.unschd_inst_flg IS '計画外指図ＦＬＧ // #MA.FLG // Unplanned order flg.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.unschd_act_flg IS '計画外実績ＦＬＧ // #MA.FLG // Unplanned result flg.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.strg_loc_cd IS '格納先場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.mfg_str_ln_cd IS '製造棚・ラインＣＤ // #MA.STR_LN_CD // Mfg. rack/line cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_lower_yield IS '品目下限収率 // #MA.YIELD // Item min. yield';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_std_yield IS '品目標準収率 // #MA.YIELD // Item standard yield';


COMMENT ON COLUMN mst_itm_mfg_inst_p.itm_upper_yield IS '品目上限収率 // #MA.YIELD // Item max. yield';


COMMENT ON COLUMN mst_itm_mfg_inst_p.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sub_char1 IS '予備１ // #MS.ITM_MFG_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sub_char2 IS '予備２ // #MS.ITM_MFG_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_itm_mfg_inst_p.sub_char3 IS '予備３ // #MS.ITM_MFG_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_itm_mfg_inst_p.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_itm_mfg_inst_p.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_itm_mfg_inst_p.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_itm_mfg_inst_p.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_itm_mfg_inst_p.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

