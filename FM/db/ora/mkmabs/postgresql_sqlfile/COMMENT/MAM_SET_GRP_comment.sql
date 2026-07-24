\encoding UTF-8

COMMENT ON VIEW mam_set_grp IS '品揃グループマスタ // Assortment group master';


COMMENT ON COLUMN mam_set_grp.set_grp_cd IS '品揃グループＣＤ // #MA.SET_GRP_CD // Assortment group cd.';


COMMENT ON COLUMN mam_set_grp.set_grp_nm IS '品揃グループ名 // #MA.SET_GRP_NM // Assortment group name';


COMMENT ON COLUMN mam_set_grp.base_set_grp_nm IS '品揃グループ名（ベース） // #MA.SET_GRP_NM // Assortment group name(Base)';


COMMENT ON COLUMN mam_set_grp.ship_assort_flg IS '出荷品揃ＦＬＧ // #MA.FLG // Assortment shipment flg.';


COMMENT ON COLUMN mam_set_grp.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_set_grp.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_set_grp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_set_grp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_set_grp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_set_grp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_set_grp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_set_grp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_set_grp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_set_grp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_set_grp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_set_grp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_set_grp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_set_grp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_set_grp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_set_grp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_set_grp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_set_grp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_set_grp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

