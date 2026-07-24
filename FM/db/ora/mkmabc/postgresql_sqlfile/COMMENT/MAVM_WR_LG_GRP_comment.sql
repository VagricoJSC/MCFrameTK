\encoding UTF-8

COMMENT ON VIEW mavm_wr_lg_grp IS '更新可能物流グループマスタ // Updatable distribution group master';


COMMENT ON COLUMN mavm_wr_lg_grp.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mavm_wr_lg_grp.lg_grp_nm IS '物流グループ名 // #MA.LG_GRP_NM // Distribution group name';


COMMENT ON COLUMN mavm_wr_lg_grp.base_lg_grp_nm IS '物流グループ名（ベース） // #MA.LG_GRP_NM // Distribution group name(Base)';


COMMENT ON COLUMN mavm_wr_lg_grp.loc_flg IS '場所設定ＦＬＧ // #MA.FLG // Location setting flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mavm_wr_lg_grp.ship_slip_flg IS '出荷伝票発行ＦＬＧ // #MA.FLG // Shipping slip issue flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.pick_list_flg IS 'ピッキングリスト発行ＦＬＧ // #MA.FLG // Picking list issue flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.ship_inst_flg IS '出荷指図書発行ＦＬＧ // #MA.FLG // Shipping order sheet issue flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.ship_slip_act_flg IS '出荷伝票発行（実績）ＦＬＧ // #MA.FLG // Shipping slip issue (Result) flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN mavm_wr_lg_grp.site_co_cd IS '倉庫事業者ＣＤ // #MA.SITE_CO_CD // Warehousing business cd.';


COMMENT ON COLUMN mavm_wr_lg_grp.gi_minus_stk_chk_flg IS '出庫時マイナス在庫確認ＦＬＧ // #MA.FLG // Check negative inventory at GI flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.ship_loc_prio_flg IS '出荷場所優先ＦＬＧ // #MA.FLG // Shipping location priority flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_wr_lg_grp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_wr_lg_grp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mavm_wr_lg_grp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mavm_wr_lg_grp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mavm_wr_lg_grp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mavm_wr_lg_grp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mavm_wr_lg_grp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mavm_wr_lg_grp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mavm_wr_lg_grp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mavm_wr_lg_grp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mavm_wr_lg_grp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

