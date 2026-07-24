\encoding UTF-8

COMMENT ON VIEW mst_sls_bdg IS '販売予算 // Sales budget';


COMMENT ON COLUMN mst_sls_bdg.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mst_sls_bdg.sls_dpt_cd IS '売上部門ＣＤ // #MA.DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mst_sls_bdg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sls_bdg.sls_itm_grp_cd IS '品目体系ＣＤ // #MA.SLS_ITM_GRP_CD // Item system cd.';


COMMENT ON COLUMN mst_sls_bdg.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mst_sls_bdg.sls_usr_cd IS '売上担当者ＣＤ // #MA.USR_CD // Sales PIC cd.';


COMMENT ON COLUMN mst_sls_bdg.trd_cur_cd IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN mst_sls_bdg.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_sls_bdg.sls_bdg_grp IS '販売予算分類 // #MS.SLS_BDG_GRP // Sales budget classification';


COMMENT ON COLUMN mst_sls_bdg.bdg_sls_amt IS '予算売上金額 // #MA.MONEY // Budget sales amount';


COMMENT ON COLUMN mst_sls_bdg.bdg_sls_prof_rate IS '予算粗利率 // #MA.PER // Budget gross profit ratio';


COMMENT ON COLUMN mst_sls_bdg.bdg_sls_prof_amt IS '予算粗利金額 // #MA.MONEY // Budget gross profit';


COMMENT ON COLUMN mst_sls_bdg.not_sum_flg IS '集計対象外ＦＬＧ // #MA.FLG // Not for aggregation flg.';


COMMENT ON COLUMN mst_sls_bdg.sls_itm_grp_not_sum_flg IS '品目体系集計対象外ＦＬＧ // #MA.FLG // Not for item system aggregation flg.';


COMMENT ON COLUMN mst_sls_bdg.sub_char1 IS '予備１ // #MS.SLS_BDG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sls_bdg.sub_char2 IS '予備２ // #MS.SLS_BDG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sls_bdg.sub_char3 IS '予備３ // #MS.SLS_BDG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sls_bdg.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sls_bdg.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sls_bdg.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sls_bdg.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sls_bdg.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sls_bdg.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sls_bdg.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sls_bdg.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sls_bdg.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sls_bdg.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

