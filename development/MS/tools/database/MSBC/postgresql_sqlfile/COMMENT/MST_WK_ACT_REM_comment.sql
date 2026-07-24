\encoding UTF-8

COMMENT ON VIEW mst_wk_act_rem IS '工数実績残 // Remaining man-hour result';


COMMENT ON COLUMN mst_wk_act_rem.wk_schd_no IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN mst_wk_act_rem.div_seq IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN mst_wk_act_rem.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN mst_wk_act_rem.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN mst_wk_act_rem.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mst_wk_act_rem.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN mst_wk_act_rem.fxd_wk_cost IS '固定工数 // #MA.WK_COST_QTY // Constant man-hour';


COMMENT ON COLUMN mst_wk_act_rem.wk_cost IS '数量依存工数 // #MA.WK_COST_QTY // Qty.-dependent man-hours';


COMMENT ON COLUMN mst_wk_act_rem.rem_wk_cost IS '残工数 // #MA.WK_COST_QTY // Remaining man-hour';


COMMENT ON COLUMN mst_wk_act_rem.abort_wk_cost IS '打切工数 // #MA.WK_COST_QTY // Cancel remaining man-hour';


COMMENT ON COLUMN mst_wk_act_rem.sub_char1 IS '予備１ // #MS.WK_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wk_act_rem.sub_char2 IS '予備２ // #MS.WK_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wk_act_rem.sub_char3 IS '予備３ // #MS.WK_ACT_REM_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wk_act_rem.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wk_act_rem.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wk_act_rem.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wk_act_rem.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wk_act_rem.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wk_act_rem.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wk_act_rem.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wk_act_rem.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wk_act_rem.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wk_act_rem.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

