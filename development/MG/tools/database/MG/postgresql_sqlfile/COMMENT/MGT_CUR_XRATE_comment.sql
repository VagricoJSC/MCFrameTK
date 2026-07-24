\encoding UTF-8

COMMENT ON VIEW mgt_cur_xrate IS '原価為替レート // Cost exchange rate';


COMMENT ON COLUMN mgt_cur_xrate.fr_cur_cd IS '換算元通貨ＣＤ // #MA.CUR_CD // Exchange-from currency cd.';


COMMENT ON COLUMN mgt_cur_xrate.to_cur_cd IS '換算先通貨ＣＤ // #MA.CUR_CD // Exchange-to currency cd.';


COMMENT ON COLUMN mgt_cur_xrate.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mgt_cur_xrate.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_cur_xrate.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_cur_xrate.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mgt_cur_xrate.rmrks IS '備考 // #MG.CUR_XRATE_RMRKS // Remarks';


COMMENT ON COLUMN mgt_cur_xrate.sub_char1 IS '予備１ // #MG.CUR_XRATE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_cur_xrate.sub_char2 IS '予備２ // #MG.CUR_XRATE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_cur_xrate.sub_char3 IS '予備３ // #MG.CUR_XRATE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_cur_xrate.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_cur_xrate.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_cur_xrate.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_cur_xrate.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_cur_xrate.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_cur_xrate.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_cur_xrate.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_cur_xrate.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_cur_xrate.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_cur_xrate.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

