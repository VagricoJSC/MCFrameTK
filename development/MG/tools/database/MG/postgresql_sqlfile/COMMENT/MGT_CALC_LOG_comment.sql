\encoding UTF-8

COMMENT ON VIEW mgt_calc_log IS '原価計算ログ情報 // Calculation log info.';


COMMENT ON COLUMN mgt_calc_log.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_log.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_log.seq_no IS 'シーケンス // #MG.SEQ_NO // Sequence';


COMMENT ON COLUMN mgt_calc_log.msg_id IS 'メッセージＩＤ // #MA.MSG_ID // Message ID';


COMMENT ON COLUMN mgt_calc_log.msg IS 'メッセージ // #MA.MSG // Message';


COMMENT ON COLUMN mgt_calc_log.log_time IS 'ログ出力日時 // #MG.LOG_TIME // Log output date and time';


COMMENT ON COLUMN mgt_calc_log.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_calc_log.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_calc_log.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_calc_log.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_calc_log.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_calc_log.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_calc_log.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_calc_log.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_calc_log.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_calc_log.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

