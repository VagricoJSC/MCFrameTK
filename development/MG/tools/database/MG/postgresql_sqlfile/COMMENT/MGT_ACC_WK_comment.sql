\encoding UTF-8

COMMENT ON VIEW mgt_acc_wk IS '工数展開情報（原価計算結果） // Man-hour explosion info. (Calculation result)';


COMMENT ON COLUMN mgt_acc_wk.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_acc_wk.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_acc_wk.wk_rec_no IS '工数レコードＮＯ // #MG.WK_REC_NO // Man-hour record No.';


COMMENT ON COLUMN mgt_acc_wk.inpt_rec_no IS '投入レコードＮＯ // #MG.INPT_REC_NO // Input record No.';


COMMENT ON COLUMN mgt_acc_wk.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_acc_wk.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_acc_wk.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_acc_wk.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_acc_wk.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_acc_wk.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgt_acc_wk.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN mgt_acc_wk.act_wk_cost IS '実際工数 // #MA.WK_COST_QTY // Actual man-hour';


COMMENT ON COLUMN mgt_acc_wk.std_wk_cost IS '標準工数 // #MA.WK_COST_QTY // Standard man-hour';


COMMENT ON COLUMN mgt_acc_wk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_acc_wk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_acc_wk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_acc_wk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_acc_wk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_acc_wk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_acc_wk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_acc_wk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_acc_wk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_acc_wk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

