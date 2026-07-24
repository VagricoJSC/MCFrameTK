\encoding UTF-8

COMMENT ON VIEW mavm_cost_sls_mst IS '原価売上分類ビュー // Cost sales classification view';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_typ IS '売上分類区分 // #MA.COST_SLS_TYP // Sales classification type';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_cd IS '売上分類ＣＤ // #MA.COST_SLS_CD // Sales classification cd.';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm IS '売上分類名 // #MA.COST_SLS_NM // Sales classification name';


COMMENT ON COLUMN mavm_cost_sls_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_cost_sls_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_cost_sls_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_cost_sls_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_cost_sls_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_cost_sls_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_cost_sls_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_cost_sls_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_cost_sls_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_cost_sls_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_cost_sls_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_cost_sls_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_cost_sls_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm_lcl1 IS '売上分類名（ロケール１） // #MA.COST_SLS_NM // Sales classification name (Locale 1)';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm_lcl2 IS '売上分類名（ロケール２） // #MA.COST_SLS_NM // Sales classification name (Locale 2)';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm_lcl3 IS '売上分類名（ロケール３） // #MA.COST_SLS_NM // Sales classification name (Locale 3)';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm_lcl4 IS '売上分類名（ロケール４） // #MA.COST_SLS_NM // Sales classification name (Locale 4)';


COMMENT ON COLUMN mavm_cost_sls_mst.cost_sls_nm_lcl5 IS '売上分類名（ロケール５） // #MA.COST_SLS_NM // Sales classification name (Locale 5)';

