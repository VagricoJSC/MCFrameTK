\encoding UTF-8

COMMENT ON VIEW mam_lg_ctl IS '物流制御マスタ // Distribution control master';


COMMENT ON COLUMN mam_lg_ctl.fr_lg_grp_cd IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN mam_lg_ctl.to_lg_grp_cd IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN mam_lg_ctl.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN mam_lg_ctl.xfr_lt IS '移動ＬＴ // #MA.LT // Movement LT';


COMMENT ON COLUMN mam_lg_ctl.fin_cl_time IS '出荷締時刻 // #MA.CHAR_HM // Shipping closing time';


COMMENT ON COLUMN mam_lg_ctl.alloc_days IS '引当可能日数 // #MA.DAYS // Allocatable days';


COMMENT ON COLUMN mam_lg_ctl.iv_trd_flg IS 'インボイス取引ＦＬＧ // #MA.FLG // Shipping invoice biz flg.';


COMMENT ON COLUMN mam_lg_ctl.def_tdlv_cd IS '標準配送先ＣＤ // #MA.BP_CD // Standard receiving point cd.';


COMMENT ON COLUMN mam_lg_ctl.ship_wk_grp_cd IS '出荷作業グループＣＤ // #MA.SHIP_WK_GRP_CD // Shipping operation group cd.';


COMMENT ON COLUMN mam_lg_ctl.non_dmnd_lt_flg IS '需要情報ＬＴ無しＦＬＧ // #MA.FLG // Without demand LT flg.';


COMMENT ON COLUMN mam_lg_ctl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_lg_ctl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_lg_ctl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_lg_ctl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_lg_ctl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_lg_ctl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_lg_ctl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_lg_ctl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_lg_ctl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_lg_ctl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_lg_ctl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_lg_ctl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_lg_ctl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_lg_ctl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_lg_ctl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_lg_ctl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_lg_ctl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN mam_lg_ctl.early_ship_dt_add_days IS '最早出荷日加算日数 // #MA.DAYS // Number of days added to earliest shipping date';

