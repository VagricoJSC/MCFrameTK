\encoding UTF-8

COMMENT ON TABLE mst_wk_schd_p_all IS '工数予定（改訂履歴） // Man-hour schedule (Rev. history)';


COMMENT ON COLUMN mst_wk_schd_p_all.wk_schd_no IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN mst_wk_schd_p_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_wk_schd_p_all.mfg_inst_rev IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN mst_wk_schd_p_all.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_wk_schd_p_all.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_wk_schd_p_all.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_wk_schd_p_all.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mst_wk_schd_p_all.wk_cost_calc_flg IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN mst_wk_schd_p_all.fxd_wk_cost IS '予定工数（固定） // #MA.WK_COST_QTY // Schedule man-hour (Constant)';


COMMENT ON COLUMN mst_wk_schd_p_all.wk_cost IS '予定工数（数量依存） // #MA.WK_COST_QTY // Schedule man-hour (Qty.-dependent)';


COMMENT ON COLUMN mst_wk_schd_p_all.mst_fxd_wk_cost IS 'マスタ工数（固定） // #MA.WK_COST_QTY // Master man-hour (Constant)';


COMMENT ON COLUMN mst_wk_schd_p_all.mst_wk_cost IS 'マスタ工数（数量依存） // #MA.WK_COST_QTY // Master man-hour (Qty.-dependent)';


COMMENT ON COLUMN mst_wk_schd_p_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mst_wk_schd_p_all.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_wk_schd_p_all.intr_rmrks IS '内部備考 // #MS.WK_SCHD_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_wk_schd_p_all.sub_char1 IS '予備１ // #MS.WK_SCHD_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wk_schd_p_all.sub_char2 IS '予備２ // #MS.WK_SCHD_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wk_schd_p_all.sub_char3 IS '予備３ // #MS.WK_SCHD_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wk_schd_p_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wk_schd_p_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wk_schd_p_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wk_schd_p_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wk_schd_p_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

