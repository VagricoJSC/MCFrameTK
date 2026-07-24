\encoding UTF-8

COMMENT ON VIEW mam_ship_valid IS '出荷有効期限グループマスタ // Shipping expiration date group master';


COMMENT ON COLUMN mam_ship_valid.ship_valid_grp_cd IS '出荷有効期限グループＣＤ // #MA.SHIP_VALID_GRP_CD // Shipping expiration date group cd.';


COMMENT ON COLUMN mam_ship_valid.ship_valid_grp_nm IS '出荷有効期限グループ名 // #MA.SHIP_VALID_GRP_NM // Shipping expiration date group name';


COMMENT ON COLUMN mam_ship_valid.base_ship_valid_grp_nm IS '出荷有効期限グループ名（ベース） // #MA.SHIP_VALID_GRP_NM // Shipping expiration date group name(Base)';


COMMENT ON COLUMN mam_ship_valid.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_ship_valid.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_ship_valid.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_ship_valid.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_ship_valid.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_ship_valid.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_ship_valid.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_ship_valid.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_ship_valid.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_ship_valid.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_ship_valid.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_ship_valid.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_ship_valid.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_ship_valid.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_ship_valid.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_ship_valid.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_ship_valid.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

