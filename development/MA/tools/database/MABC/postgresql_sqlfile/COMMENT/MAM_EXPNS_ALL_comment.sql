\encoding UTF-8

COMMENT ON TABLE mam_expns_all IS '原価費目マスタ_（全社）_ // Cost element master_(Company-wide)_';


COMMENT ON COLUMN mam_expns_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mam_expns_all.expns_nm IS '費目名 // #MA.EXPNS_NM // Cost element name';


COMMENT ON COLUMN mam_expns_all.expns_grp_cd IS '費目グループＣＤ // #MA.EXPNS_GRP_CD // Cost element group cd.';


COMMENT ON COLUMN mam_expns_all.expns_typ IS '費目区分 // #MA.EXPNS_TYP // Cost element type';


COMMENT ON COLUMN mam_expns_all.direct_typ IS '直間区分 // #MA.DIRECT_TYP // Direct/Indirect type';


COMMENT ON COLUMN mam_expns_all.var_typ IS '固変区分 // #MA.VAR_TYP // Constant/variable type';


COMMENT ON COLUMN mam_expns_all.expns_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mam_expns_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_expns_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_expns_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_expns_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_expns_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_expns_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_expns_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_expns_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_expns_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_expns_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_expns_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_expns_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_expns_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_expns_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_expns_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_expns_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_expns_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_expns_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';

