\encoding UTF-8

COMMENT ON VIEW mst_wrk_comp IS '案件競合情報 // Sales project competitive info.';


COMMENT ON COLUMN mst_wrk_comp.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_wrk_comp.comp_no IS '競合ＮＯ // #MA.INT // Conflict No.';


COMMENT ON COLUMN mst_wrk_comp.comp_dt IS '競合発生日 // #MA.DT // Conflict occurred date';


COMMENT ON COLUMN mst_wrk_comp.comp_info IS '競合情報 // #MS.WRK_COMP_INFO // Conflict info.';


COMMENT ON COLUMN mst_wrk_comp.sub_char1 IS '予備１ // #MS.WRK_COMP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wrk_comp.sub_char2 IS '予備２ // #MS.WRK_COMP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wrk_comp.sub_char3 IS '予備３ // #MS.WRK_COMP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wrk_comp.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wrk_comp.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wrk_comp.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wrk_comp.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wrk_comp.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wrk_comp.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wrk_comp.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wrk_comp.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wrk_comp.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wrk_comp.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

