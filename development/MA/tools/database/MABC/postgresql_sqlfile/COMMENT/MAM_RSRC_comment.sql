\encoding UTF-8

COMMENT ON VIEW mam_rsrc IS '資源マスタ // Resource master';


COMMENT ON COLUMN mam_rsrc.rsrc_cd IS '資源ＣＤ // #MA.RSRC_CD // Resource cd.';


COMMENT ON COLUMN mam_rsrc.rsrc_nm IS '資源名 // #MA.RSRC_NM // Resource name';


COMMENT ON COLUMN mam_rsrc.base_rsrc_nm IS '資源名（ベース） // #MA.RSRC_NM // Resource name(Base)';


COMMENT ON COLUMN mam_rsrc.rsrc_unit_nm IS '資源単位名 // #MA.RSRC_UNIT_NM // Resource unit name';


COMMENT ON COLUMN mam_rsrc.base_rsrc_unit_nm IS '資源単位名（ベース） // #MA.RSRC_UNIT_NM // Resource unit name(Base)';


COMMENT ON COLUMN mam_rsrc.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mam_rsrc.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mam_rsrc.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rsrc.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rsrc.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rsrc.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rsrc.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rsrc.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rsrc.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rsrc.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rsrc.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rsrc.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rsrc.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rsrc.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rsrc.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rsrc.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rsrc.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rsrc.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rsrc.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

