\encoding UTF-8

COMMENT ON VIEW mgt_st_stk_diff IS '月初在庫改定差異 // Beginning inventory revaluation variance';


COMMENT ON COLUMN mgt_st_stk_diff.st_stk_key IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN mgt_st_stk_diff.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_st_stk_diff.diff_amt IS '改定差異 // #MA.MONEY // Revised variance';


COMMENT ON COLUMN mgt_st_stk_diff.bf_amt IS '改定前金額 // #MA.MONEY // Amount before revised';


COMMENT ON COLUMN mgt_st_stk_diff.af_amt IS '改定後金額 // #MA.MONEY // Revised amount';


COMMENT ON COLUMN mgt_st_stk_diff.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_st_stk_diff.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_st_stk_diff.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_st_stk_diff.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_st_stk_diff.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_st_stk_diff.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_st_stk_diff.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_st_stk_diff.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_st_stk_diff.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_st_stk_diff.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

