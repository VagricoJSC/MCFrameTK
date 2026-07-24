\encoding UTF-8

COMMENT ON TABLE mam_lg_grp_all IS '物流グループマスタ_（全社）_ // Distribution group master_(Company-wide)_';


COMMENT ON COLUMN mam_lg_grp_all.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_lg_grp_all.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN mam_lg_grp_all.loc_flg IS '場所設定ＦＬＧ // #MA.FLG // Location setting flg.';


COMMENT ON COLUMN mam_lg_grp_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_lg_grp_all.ship_slip_flg IS '出荷伝票発行ＦＬＧ // #MA.FLG // Shipping slip issue flg.';


COMMENT ON COLUMN mam_lg_grp_all.pick_list_flg IS 'ピッキングリスト発行ＦＬＧ // #MA.FLG // Picking list issue flg.';


COMMENT ON COLUMN mam_lg_grp_all.ship_inst_flg IS '出荷指図書発行ＦＬＧ // #MA.FLG // Shipping order sheet issue flg.';


COMMENT ON COLUMN mam_lg_grp_all.ship_slip_act_flg IS '出荷伝票発行（実績）ＦＬＧ // #MA.FLG // Shipping slip issue (Result) flg.';


COMMENT ON COLUMN mam_lg_grp_all.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mam_lg_grp_all.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mam_lg_grp_all.gi_minus_stk_chk_flg IS '出庫時マイナス在庫確認ＦＬＧ // #MA.FLG // Check negative inventory at GI flg.';


COMMENT ON COLUMN mam_lg_grp_all.ship_loc_prio_flg IS '出荷場所優先ＦＬＧ // #MA.FLG // Shipping location priority flg.';


COMMENT ON COLUMN mam_lg_grp_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_lg_grp_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_lg_grp_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_lg_grp_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_lg_grp_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_lg_grp_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_lg_grp_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_lg_grp_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_lg_grp_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_lg_grp_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_lg_grp_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_lg_grp_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_lg_grp_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_lg_grp_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_lg_grp_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_lg_grp_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_lg_grp_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_lg_grp_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

