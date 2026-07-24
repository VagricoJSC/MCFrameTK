\encoding UTF-8

COMMENT ON VIEW mgt_acc_top_tmp IS '最上位品目情報（一時テーブル） // Top-level item info. (Temporary table)';


COMMENT ON COLUMN mgt_acc_top_tmp.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_acc_top_tmp.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_acc_top_tmp.top_rec_no IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN mgt_acc_top_tmp.calc_rec_typ IS '計算レコード区分 // #MG.CALC_REC_TYP // Calculation record type';


COMMENT ON COLUMN mgt_acc_top_tmp.cost_io_typ IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN mgt_acc_top_tmp.act_id IS '実績ＩＤ // #MG.ACT_ID // Result ID';


COMMENT ON COLUMN mgt_acc_top_tmp.act_id_sub IS '実績ＩＤ枝番 // #MG.ACT_ID_SUB // Result ID branch No.';


COMMENT ON COLUMN mgt_acc_top_tmp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_acc_top_tmp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_acc_top_tmp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_acc_top_tmp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_acc_top_tmp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

