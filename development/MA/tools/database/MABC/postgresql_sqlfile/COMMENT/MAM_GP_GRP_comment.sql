\encoding UTF-8

COMMENT ON VIEW mam_gp_grp IS '汎用分類マスタ // General purpose classification master';


COMMENT ON COLUMN mam_gp_grp.gp_grp_cd IS '汎用分類ＣＤ // #MA.GP_GRP_CD // General purpose classification cd.';


COMMENT ON COLUMN mam_gp_grp.gp_grp_nm IS '汎用分類名 // #MA.GP_GRP_NM // General purpose classification name';


COMMENT ON COLUMN mam_gp_grp.base_gp_grp_nm IS '汎用分類名（ベース） // #MA.GP_GRP_NM // General purpose classification name(Base)';


COMMENT ON COLUMN mam_gp_grp.auth_str_srch IS '権限文字列（参照） // #MA.AUTH_STR // Authority string (Reference)';


COMMENT ON COLUMN mam_gp_grp.auth_str_upd IS '権限文字列（登録） // #MA.AUTH_STR // Authority string (Entry)';


COMMENT ON COLUMN mam_gp_grp.auth_str_del IS '権限文字列（削除） // #MA.AUTH_STR // Authority string (Deletion)';


COMMENT ON COLUMN mam_gp_grp.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_gp_grp.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_gp_grp.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_gp_grp.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_gp_grp.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_gp_grp.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_gp_grp.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_gp_grp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_gp_grp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_gp_grp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_gp_grp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_gp_grp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_gp_grp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_gp_grp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_gp_grp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_gp_grp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_gp_grp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

