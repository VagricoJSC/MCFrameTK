\encoding UTF-8

COMMENT ON VIEW mam_rpt_key_conf IS '原価レポートキー構成マスタ // Cost report key structure master';


COMMENT ON COLUMN mam_rpt_key_conf.rpt_key_cd IS 'レポートキーＣＤ // #MA.RPT_KEY_CD // Report key cd.';


COMMENT ON COLUMN mam_rpt_key_conf.dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mam_rpt_key_conf.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_rpt_key_conf.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_rpt_key_conf.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_rpt_key_conf.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_rpt_key_conf.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_rpt_key_conf.itm_jnl_cd IS '品目仕訳ＣＤ // #MA.ITM_JNL_CD // Item journal cd.';


COMMENT ON COLUMN mam_rpt_key_conf.itm_grp_typ IS '品目分類区分 // #MA.ITM_GRP_TYP // Item classification type';


COMMENT ON COLUMN mam_rpt_key_conf.itm_grp_cd IS '品目分類ＣＤ // #MA.ITM_GRP_CD // Item classification cd.';


COMMENT ON COLUMN mam_rpt_key_conf.rpt_key_seq IS '表示順 // #MA.INT2 // Display order';


COMMENT ON COLUMN mam_rpt_key_conf.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_rpt_key_conf.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_rpt_key_conf.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_rpt_key_conf.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_rpt_key_conf.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_rpt_key_conf.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_rpt_key_conf.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_rpt_key_conf.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_rpt_key_conf.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_rpt_key_conf.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_rpt_key_conf.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_rpt_key_conf.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_rpt_key_conf.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_rpt_key_conf.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_rpt_key_conf.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_rpt_key_conf.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_rpt_key_conf.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

