\encoding UTF-8

COMMENT ON VIEW mst_wrk_act_hist IS '案件活動履歴 // Sales project activity history';


COMMENT ON COLUMN mst_wrk_act_hist.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_wrk_act_hist.hist_no IS '履歴ＮＯ // #MA.INT // History No.';


COMMENT ON COLUMN mst_wrk_act_hist.act_sts_cd IS '活動状況ＣＤ // #MS.WRK_MNG_CD // Activities cd.';


COMMENT ON COLUMN mst_wrk_act_hist.act_hist IS '活動経緯 // #MS.WRK_ACT_HIST // Activity history';


COMMENT ON COLUMN mst_wrk_act_hist.act_schd_dt IS '活動予定日 // #MA.DT // Scheduled activity date';


COMMENT ON COLUMN mst_wrk_act_hist.act_schd IS '活動予定 // #MS.WRK_ACT_SCHD // Activity schedule';


COMMENT ON COLUMN mst_wrk_act_hist.act_act_dt IS '活動実績日 // #MA.DT // Actual activity result date';


COMMENT ON COLUMN mst_wrk_act_hist.act_act IS '活動実績 // #MS.WRK_ACT_ACT // Results of activities';


COMMENT ON COLUMN mst_wrk_act_hist.sub_char1 IS '予備１ // #MS.WRK_ACT_HIST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wrk_act_hist.sub_char2 IS '予備２ // #MS.WRK_ACT_HIST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wrk_act_hist.sub_char3 IS '予備３ // #MS.WRK_ACT_HIST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wrk_act_hist.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wrk_act_hist.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wrk_act_hist.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wrk_act_hist.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wrk_act_hist.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wrk_act_hist.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wrk_act_hist.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wrk_act_hist.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wrk_act_hist.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wrk_act_hist.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

