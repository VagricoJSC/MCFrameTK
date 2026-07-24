\encoding UTF-8

COMMENT ON VIEW mam_grs_alloc_ctl IS '総量・場所引当制御マスタ // Gross/location allocation control master';


COMMENT ON COLUMN mam_grs_alloc_ctl.alloc_grp_cd IS '総量引当場所グループＣＤ // #MA.ALLOC_GRP_CD // Gross allocation location group cd.';


COMMENT ON COLUMN mam_grs_alloc_ctl.itm_ship_grp_cd IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN mam_grs_alloc_ctl.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_grs_alloc_ctl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_grs_alloc_ctl.alloc_scope_typ IS '引当範囲区分 // #MA.ALLOC_SCOPE_TYP // Allocation range type';


COMMENT ON COLUMN mam_grs_alloc_ctl.prio IS '引当優先順 // #MA.ALLOC_PRIO // Allocation priority';


COMMENT ON COLUMN mam_grs_alloc_ctl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_grs_alloc_ctl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_grs_alloc_ctl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_grs_alloc_ctl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_grs_alloc_ctl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_grs_alloc_ctl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_grs_alloc_ctl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_grs_alloc_ctl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_grs_alloc_ctl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_grs_alloc_ctl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_grs_alloc_ctl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_grs_alloc_ctl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

