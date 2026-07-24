\encoding UTF-8

COMMENT ON TABLE mst_wrk_comp_all IS '案件競合情報 // Sales project competitive info.';


COMMENT ON COLUMN mst_wrk_comp_all.wrk_no IS '案件ＮＯ // #MA.WRK_NO // Sales project No.';


COMMENT ON COLUMN mst_wrk_comp_all.comp_no IS '競合ＮＯ // #MA.INT // Conflict No.';


COMMENT ON COLUMN mst_wrk_comp_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_wrk_comp_all.comp_dt IS '競合発生日 // #MA.DT // Conflict occurred date';


COMMENT ON COLUMN mst_wrk_comp_all.comp_info IS '競合情報 // #MS.WRK_COMP_INFO // Conflict info.';


COMMENT ON COLUMN mst_wrk_comp_all.sub_char1 IS '予備１ // #MS.WRK_COMP_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_wrk_comp_all.sub_char2 IS '予備２ // #MS.WRK_COMP_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_wrk_comp_all.sub_char3 IS '予備３ // #MS.WRK_COMP_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_wrk_comp_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_wrk_comp_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_wrk_comp_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_wrk_comp_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_wrk_comp_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_wrk_comp_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_wrk_comp_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_wrk_comp_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_wrk_comp_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_wrk_comp_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

