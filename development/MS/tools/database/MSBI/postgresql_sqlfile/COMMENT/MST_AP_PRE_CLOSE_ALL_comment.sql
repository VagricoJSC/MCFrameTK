\encoding UTF-8

COMMENT ON TABLE mst_ap_pre_close_all IS '買掛仮締情報 // AP temporary closing info.';


COMMENT ON COLUMN mst_ap_pre_close_all.ym IS '年月度 // #MA.DT // Fiscal month';


COMMENT ON COLUMN mst_ap_pre_close_all.asppl_cd IS '買掛先ＣＤ // #MA.BP_CD // AP supplier cd.';


COMMENT ON COLUMN mst_ap_pre_close_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_ap_pre_close_all.pre_cl_tm IS '仮締実行日時 // #MA.TM // Temporary closing execution date and time';


COMMENT ON COLUMN mst_ap_pre_close_all.sub_char1 IS '予備１ // #MS.AP_PRE_CL_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_ap_pre_close_all.sub_char2 IS '予備２ // #MS.AP_PRE_CL_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_ap_pre_close_all.sub_char3 IS '予備３ // #MS.AP_PRE_CL_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_ap_pre_close_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_ap_pre_close_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_ap_pre_close_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_ap_pre_close_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_ap_pre_close_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

