\encoding UTF-8

COMMENT ON TABLE mst_yield_schd_p_all IS '出来高予定（改訂履歴） // Output schedule (Rev. history)';


COMMENT ON COLUMN mst_yield_schd_p_all.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_SCHD_NO // Output schedule No.';


COMMENT ON COLUMN mst_yield_schd_p_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_yield_schd_p_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_yield_schd_p_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_yield_schd_p_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_yield_schd_p_all.io_schd_pr_no IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN mst_yield_schd_p_all.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN mst_yield_schd_p_all.schd_tm IS '予定日時 // #MA.TM // Scheduled date and time';


COMMENT ON COLUMN mst_yield_schd_p_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mst_yield_schd_p_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mst_yield_schd_p_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mst_yield_schd_p_all.trd_unit_yield_qty IS '取引単位出来高予定数量 // #MA.QTY // Transaction unit scheduled output qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.trd_unit_cd IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.base_unit_yield_qty IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.base_unit_cd IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mst_yield_schd_p_all.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mst_yield_schd_p_all.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mst_yield_schd_p_all.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mst_yield_schd_p_all.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mst_yield_schd_p_all.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mst_yield_schd_p_all.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.strg_str_ln_cd IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN mst_yield_schd_p_all.bkf_typ IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN mst_yield_schd_p_all.par_inst_qty IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.chd_inpt_qty IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.chd_rqmt_qty IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.fxd_chd_rqmt_qty IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN mst_yield_schd_p_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_yield_schd_p_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mst_yield_schd_p_all.intr_rmrks IS '内部備考 // #MS.YIELD_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_yield_schd_p_all.inst_rpt_rmrks IS '指図書備考 // #MS.YIELD_SCHD_RPT_RMRKS // Order sheet remarks';


COMMENT ON COLUMN mst_yield_schd_p_all.insp_cnt_rmrks IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN mst_yield_schd_p_all.sub_char1 IS '予備１ // #MS.YIELD_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_yield_schd_p_all.sub_char2 IS '予備２ // #MS.YIELD_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_yield_schd_p_all.sub_char3 IS '予備３ // #MS.YIELD_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_yield_schd_p_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_yield_schd_p_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_yield_schd_p_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_yield_schd_p_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_yield_schd_p_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

