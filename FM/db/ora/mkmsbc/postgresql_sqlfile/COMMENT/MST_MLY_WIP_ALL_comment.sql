\encoding UTF-8

COMMENT ON TABLE mst_mly_wip_all IS '月別仕掛 // Monthly WIP';


COMMENT ON COLUMN mst_mly_wip_all.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mst_mly_wip_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_mly_wip_all.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mst_mly_wip_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_mly_wip_all.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN mst_mly_wip_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_mly_wip_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_mly_wip_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_mly_wip_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_mly_wip_all.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mst_mly_wip_all.str_ln_cd IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN mst_mly_wip_all.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mst_mly_wip_all.in_xfr_typ IS '積送品区分 // #MS.IN_XFR_TYP // In-transit type';


COMMENT ON COLUMN mst_mly_wip_all.quality_typ IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN mst_mly_wip_all.stk_insp_typ IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN mst_mly_wip_all.stk_id_typ IS '在庫識別区分 // #MS.STK_ID_TYP // Inventory identification type';


COMMENT ON COLUMN mst_mly_wip_all.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN mst_mly_wip_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_mly_wip_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_mly_wip_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_mly_wip_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_mly_wip_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_mly_wip_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_mly_wip_all.st_ac_dt IS '着手計上日 // #MA.DT // Start recording date';


COMMENT ON COLUMN mst_mly_wip_all.base_unit_schd_qty IS '基準単位予定数量 // #MA.QTY // Base unit scheduled qty.';


COMMENT ON COLUMN mst_mly_wip_all.base_unit_act_qty IS '基準単位実績数量 // #MA.QTY // Base unit result qty.';


COMMENT ON COLUMN mst_mly_wip_all.end_ac_dt IS '完了計上日 // #MA.DT // Completion recording date';


COMMENT ON COLUMN mst_mly_wip_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_mly_wip_all.base_unit_wip_qty IS '基準単位仕掛数量 // #MA.QTY // Base unit WIP qty.';


COMMENT ON COLUMN mst_mly_wip_all.wip_rate IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN mst_mly_wip_all.cmpl_flg IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN mst_mly_wip_all.closing_flg IS '締処理済ＦＬＧ // #MA.FLG // Closed flg.';


COMMENT ON COLUMN mst_mly_wip_all.sub_char1 IS '予備１ // #MS.MLY_WIP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_mly_wip_all.sub_char2 IS '予備２ // #MS.MLY_WIP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_mly_wip_all.sub_char3 IS '予備３ // #MS.MLY_WIP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_mly_wip_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_mly_wip_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_mly_wip_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_mly_wip_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_mly_wip_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_mly_wip_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_mly_wip_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_mly_wip_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_mly_wip_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_mly_wip_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

