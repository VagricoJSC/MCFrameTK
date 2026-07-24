\encoding UTF-8

COMMENT ON VIEW mavm_lg_grp_mst IS '物流グループマスタビュー // Distribution group master view';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN mavm_lg_grp_mst.loc_flg IS '場所設定ＦＬＧ // #MA.FLG // Location setting flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mavm_lg_grp_mst.ship_slip_flg IS '出荷伝票発行ＦＬＧ // #MA.FLG // Shipping slip issue flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.pick_list_flg IS 'ピッキングリスト発行ＦＬＧ // #MA.FLG // Picking list issue flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.ship_inst_flg IS '出荷指図書発行ＦＬＧ // #MA.FLG // Shipping order sheet issue flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.ship_slip_act_flg IS '出荷伝票発行（実績）ＦＬＧ // #MA.FLG // Shipping slip issue (Result) flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mavm_lg_grp_mst.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mavm_lg_grp_mst.gi_minus_stk_chk_flg IS '出庫時マイナス在庫確認ＦＬＧ // #MA.FLG // Check negative inventory at GI flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.ship_loc_prio_flg IS '出荷場所優先ＦＬＧ // #MA.FLG // Shipping location priority flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_lg_grp_mst.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_lg_grp_mst.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_lg_grp_mst.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_lg_grp_mst.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_lg_grp_mst.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_lg_grp_mst.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_lg_grp_mst.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_lg_grp_mst.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_lg_grp_mst.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_lg_grp_mst.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_lg_grp_mst.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mavm_lg_grp_mst.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm_lcl1 IS '物流グループ名（ロケール１） // #MA.LG_GRP_NM // Distribution group name (Locale 1)';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm_lcl2 IS '物流グループ名（ロケール２） // #MA.LG_GRP_NM // Distribution group name (Locale 2)';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm_lcl3 IS '物流グループ名（ロケール３） // #MA.LG_GRP_NM // Distribution group name (Locale 3)';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm_lcl4 IS '物流グループ名（ロケール４） // #MA.LG_GRP_NM // Distribution group name (Locale 4)';


COMMENT ON COLUMN mavm_lg_grp_mst.lg_grp_nm_lcl5 IS '物流グループ名（ロケール５） // #MA.LG_GRP_NM // Distribution group name (Locale 5)';

