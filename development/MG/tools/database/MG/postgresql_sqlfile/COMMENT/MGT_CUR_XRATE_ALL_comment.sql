\encoding UTF-8

COMMENT ON TABLE mgt_cur_xrate_all IS '原価為替レート // Cost exchange rate';


COMMENT ON COLUMN mgt_cur_xrate_all.fr_cur_cd IS '換算元通貨ＣＤ // #MA.CUR_CD // Exchange-from currency cd.';


COMMENT ON COLUMN mgt_cur_xrate_all.to_cur_cd IS '換算先通貨ＣＤ // #MA.CUR_CD // Exchange-to currency cd.';


COMMENT ON COLUMN mgt_cur_xrate_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mgt_cur_xrate_all.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_cur_xrate_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_cur_xrate_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_cur_xrate_all.fix_flg IS '確定ＦＬＧ // #MA.FLG // Firm flg.';


COMMENT ON COLUMN mgt_cur_xrate_all.rmrks IS '備考 // #MG.CUR_XRATE_RMRKS // Remarks';


COMMENT ON COLUMN mgt_cur_xrate_all.sub_char1 IS '予備１ // #MG.CUR_XRATE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_cur_xrate_all.sub_char2 IS '予備２ // #MG.CUR_XRATE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_cur_xrate_all.sub_char3 IS '予備３ // #MG.CUR_XRATE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_cur_xrate_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_cur_xrate_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_cur_xrate_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_cur_xrate_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_cur_xrate_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

