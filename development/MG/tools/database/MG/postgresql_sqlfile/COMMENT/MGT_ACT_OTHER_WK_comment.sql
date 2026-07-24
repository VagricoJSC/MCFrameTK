\encoding UTF-8

COMMENT ON VIEW mgt_act_other_wk IS '指図外工数実績 // Indirect man-hour result';


COMMENT ON COLUMN mgt_act_other_wk.act_other_wk_id IS '指図外工数実績ＩＤ // #MG.ACT_OTHER_WK_ID // Indirect man-hour result ID';


COMMENT ON COLUMN mgt_act_other_wk.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_act_other_wk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_act_other_wk.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_act_other_wk.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_act_other_wk.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_act_other_wk.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgt_act_other_wk.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_act_other_wk.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_act_other_wk.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_act_other_wk.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_act_other_wk.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_act_other_wk.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_act_other_wk.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_act_other_wk.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_act_other_wk.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgt_act_other_wk.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN mgt_act_other_wk.wk_cost IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN mgt_act_other_wk.rmrks IS '備考 // #MG.ACT_OTHER_WK_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_other_wk.sub_char1 IS '予備１ // #MG.ACT_OTHER_WK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_other_wk.sub_char2 IS '予備２ // #MG.ACT_OTHER_WK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_other_wk.sub_char3 IS '予備３ // #MG.ACT_OTHER_WK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_other_wk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_other_wk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_other_wk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_other_wk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_other_wk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_other_wk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_other_wk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_other_wk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_other_wk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_other_wk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

