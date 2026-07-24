\encoding UTF-8

COMMENT ON TABLE mam_dmnd_div_all IS '需要情報分割マスタ // Demand split master';


COMMENT ON COLUMN mam_dmnd_div_all.to_lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_dmnd_div_all.itm_ship_grp_cd IS '品目出荷グループＣＤ // #MA.ITM_SHIP_GRP_CD // Item shipping group cd.';


COMMENT ON COLUMN mam_dmnd_div_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_dmnd_div_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_dmnd_div_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_dmnd_div_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_dmnd_div_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mam_dmnd_div_all.sls_dpt_cd IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN mam_dmnd_div_all.ship_loc_cd IS '出荷場所ＣＤ // #MA.LOC_CD // Shipping location cd.';


COMMENT ON COLUMN mam_dmnd_div_all.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_dmnd_div_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mam_dmnd_div_all.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_dmnd_div_all.dmnd_div_ratio IS '需要分割比率 // #MA.DMND_DIV_RATIO // Demand split ratio';


COMMENT ON COLUMN mam_dmnd_div_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_dmnd_div_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_dmnd_div_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_dmnd_div_all.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_dmnd_div_all.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_dmnd_div_all.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_dmnd_div_all.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_dmnd_div_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_dmnd_div_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_dmnd_div_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_dmnd_div_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_dmnd_div_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_dmnd_div_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_dmnd_div_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_dmnd_div_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_dmnd_div_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_dmnd_div_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

