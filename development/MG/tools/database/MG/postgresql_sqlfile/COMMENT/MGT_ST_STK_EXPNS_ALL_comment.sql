\encoding UTF-8

COMMENT ON TABLE mgt_st_stk_expns_all IS '月初在庫費目別原価 // Beginning cost by inventory cost element';


COMMENT ON COLUMN mgt_st_stk_expns_all.st_stk_key IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN mgt_st_stk_expns_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_st_stk_expns_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_st_stk_expns_all.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_st_stk_expns_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_st_stk_expns_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_st_stk_expns_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_st_stk_expns_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_st_stk_expns_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

