\encoding UTF-8

COMMENT ON VIEW mam_oper_wk_cost IS '工程工数マスタ // Operation man-hour master';


COMMENT ON COLUMN mam_oper_wk_cost.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_oper_wk_cost.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_oper_wk_cost.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_oper_wk_cost.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_oper_wk_cost.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_oper_wk_cost.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mam_oper_wk_cost.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mam_oper_wk_cost.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mam_oper_wk_cost.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mam_oper_wk_cost.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_oper_wk_cost.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_oper_wk_cost.fxd_wk_cost IS '工数（固定） // #MA.WK_COST_QTY // Man-hour (Constant)';


COMMENT ON COLUMN mam_oper_wk_cost.wk_cost IS '工数（数量依存） // #MA.WK_COST_QTY // Man-hour (Qty.-dependent)';


COMMENT ON COLUMN mam_oper_wk_cost.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mam_oper_wk_cost.wk_cost_calc_flg IS '自動工数計算ＦＬＧ // #MA.FLG // Auto man-hour calculation flg.';


COMMENT ON COLUMN mam_oper_wk_cost.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_oper_wk_cost.not_cost_flg IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN mam_oper_wk_cost.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_oper_wk_cost.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_oper_wk_cost.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_oper_wk_cost.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_oper_wk_cost.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_oper_wk_cost.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_oper_wk_cost.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_oper_wk_cost.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_oper_wk_cost.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_oper_wk_cost.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_oper_wk_cost.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_oper_wk_cost.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_oper_wk_cost.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_oper_wk_cost.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_oper_wk_cost.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_oper_wk_cost.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_oper_wk_cost.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

