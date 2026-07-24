\encoding UTF-8

COMMENT ON TABLE mgt_std_wk_all IS '工数展開情報（標準計算結果） // Man-hour explosion info. (Standard calculation result)';


COMMENT ON COLUMN mgt_std_wk_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_std_wk_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_std_wk_all.wk_rec_no IS '工数レコードＮＯ // #MG.WK_REC_NO // Man-hour record No.';


COMMENT ON COLUMN mgt_std_wk_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_std_wk_all.oper_rec_no IS '工程レコードＮＯ // #MG.OPER_REC_NO // Operation record No.';


COMMENT ON COLUMN mgt_std_wk_all.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgt_std_wk_all.std_wk_cost IS '標準工数 // #MA.WK_COST_QTY // Standard man-hour';


COMMENT ON COLUMN mgt_std_wk_all.the_wk_cost IS '理論工数 // #MA.WK_COST_QTY // Ideal man-hour';


COMMENT ON COLUMN mgt_std_wk_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_std_wk_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_std_wk_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_std_wk_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_std_wk_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_std_wk_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_std_wk_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_std_wk_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_std_wk_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_std_wk_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

