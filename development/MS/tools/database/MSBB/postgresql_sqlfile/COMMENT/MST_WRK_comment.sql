\encoding UTF-8

COMMENT ON VIEW mst_wrk IS '案件 // Sales project';


COMMENT ON COLUMN mst_wrk.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_wrk.wrk_nm IS '案件名 // #MA.WRK_NM // Sales project name';


COMMENT ON COLUMN mst_wrk.st_dt IS '案件開始日 // #MA.DT // Sales project start date';


COMMENT ON COLUMN mst_wrk.end_dt IS '案件終了日 // #MA.DT // Sales project end date';


COMMENT ON COLUMN mst_wrk.wrk_desc IS '案件概要 // #MS.WRK_DESC // Sales project overview';


COMMENT ON COLUMN mst_wrk.term_cond IS '契約条件 // #MS.WRK_TERM_COND // Contract terms';


COMMENT ON COLUMN mst_wrk.prj_no IS 'プロジェクトＮＯ // #MA.PRJ_NO // Project No.';


COMMENT ON COLUMN mst_wrk.wrk_sts_cd IS '案件状況ＣＤ // #MS.WRK_MNG_CD // Sales project status cd.';


COMMENT ON COLUMN mst_wrk.slo_acc_cd IS '受注確度ＣＤ // #MS.WRK_MNG_CD // Sales order accuracy cd.';


COMMENT ON COLUMN mst_wrk.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mst_wrk.budget IS '予算 // #MA.MONEY // Budget';


COMMENT ON COLUMN mst_wrk.slo_rsn IS '受注理由 // #MS.WRK_SLO_RSN // Sales order reason';


COMMENT ON COLUMN mst_wrk.fail_rsn IS '失注理由 // #MS.WRK_FAIL_RSN // Failed order reason';


COMMENT ON COLUMN mst_wrk.wrk_rmrks IS '案件備考 // #MS.WRK_RMRKS // Sales project remarks';


COMMENT ON COLUMN mst_wrk.sub_char1 IS '予備１ // #MS.WRK_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wrk.sub_char2 IS '予備２ // #MS.WRK_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wrk.sub_char3 IS '予備３ // #MS.WRK_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wrk.wrk_ar_flg IS '案件別債権管理ＦＬＧ // #MA.FLG // AR management by sales project flg.';


COMMENT ON COLUMN mst_wrk.wrk_ap_flg IS '案件別債務管理ＦＬＧ // #MA.FLG // AP management by sales project flg.';


COMMENT ON COLUMN mst_wrk.can_flg IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN mst_wrk.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wrk.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wrk.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wrk.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wrk.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wrk.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wrk.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wrk.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wrk.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wrk.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

