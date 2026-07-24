\encoding UTF-8

COMMENT ON VIEW mam_scm_if_ctl IS 'ＳＣＭ ＩＦ制御マスタ // SCM IF control master';


COMMENT ON COLUMN mam_scm_if_ctl.if_proc_typ IS 'ＩＦ処理区分 // #MA.IF_PROC_TYP // IF process type';


COMMENT ON COLUMN mam_scm_if_ctl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mam_scm_if_ctl.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN mam_scm_if_ctl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mam_scm_if_ctl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mam_scm_if_ctl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mam_scm_if_ctl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mam_scm_if_ctl.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mam_scm_if_ctl.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mam_scm_if_ctl.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mam_scm_if_ctl.gr_loc_cd IS '入庫場所ＣＤ // #MA.LOC_CD // GR location cd.';


COMMENT ON COLUMN mam_scm_if_ctl.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN mam_scm_if_ctl.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN mam_scm_if_ctl.ext_sys_cd IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN mam_scm_if_ctl.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mam_scm_if_ctl.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mam_scm_if_ctl.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN mam_scm_if_ctl.del_flg IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN mam_scm_if_ctl.del_usr_id IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN mam_scm_if_ctl.del_usr_nm IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN mam_scm_if_ctl.del_ts IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN mam_scm_if_ctl.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mam_scm_if_ctl.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mam_scm_if_ctl.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mam_scm_if_ctl.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mam_scm_if_ctl.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mam_scm_if_ctl.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mam_scm_if_ctl.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mam_scm_if_ctl.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mam_scm_if_ctl.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mam_scm_if_ctl.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

