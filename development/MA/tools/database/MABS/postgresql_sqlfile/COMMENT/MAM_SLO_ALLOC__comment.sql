\encoding UTF-8

COMMENT ON VIEW mam_slo_alloc_ IS '受注引当マスタ（マスタ画面用） // Sales order allocation master';


COMMENT ON COLUMN mam_slo_alloc_.to_lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_slo_alloc_.itm_ship_grp_cd IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN mam_slo_alloc_.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_slo_alloc_.loc_cd IS '引当場所ＣＤ // #MA.LOC_CD // Allocation location cd.';


COMMENT ON COLUMN mam_slo_alloc_.lg_grp_cd IS '引当物流グループＣＤ // #MA.LG_GRP_CD // Allocation distribution group cd.';


COMMENT ON COLUMN mam_slo_alloc_.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mam_slo_alloc_.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mam_slo_alloc_.alloc_typ IS '引当区分 // #MA.ALLOC_TYP // Allocation type';


COMMENT ON COLUMN mam_slo_alloc_.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mam_slo_alloc_.def_flg IS 'デフォルトＦＬＧ // #MA.FLG // Default flg.';


COMMENT ON COLUMN mam_slo_alloc_.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_slo_alloc_.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_slo_alloc_.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_slo_alloc_.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_slo_alloc_.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_slo_alloc_.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_slo_alloc_.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_slo_alloc_.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_slo_alloc_.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_slo_alloc_.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_slo_alloc_.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_slo_alloc_.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_slo_alloc_.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_slo_alloc_.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_slo_alloc_.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_slo_alloc_.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_slo_alloc_.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

