\encoding UTF-8

COMMENT ON VIEW mgt_act_ptn_config IS '計算実行パタン構成 // Calculation run pattern configuration';


COMMENT ON COLUMN mgt_act_ptn_config.act_ptn_cd IS '計算実行パタンＣＤ // #MA.ACT_PTN_CD // Calculation run pattern cd.';


COMMENT ON COLUMN mgt_act_ptn_config.calc_act_seq IS '計算実行順序 // #MG.CALC_ACT_SEQ // Calculation execute sequence';


COMMENT ON COLUMN mgt_act_ptn_config.term IS '期 // #MA.YM // Term';


COMMENT ON COLUMN mgt_act_ptn_config.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_act_ptn_config.st_ym IS '計算対象先頭月 // #MA.YM // Calculation first month';


COMMENT ON COLUMN mgt_act_ptn_config.end_ym IS '計算対象末尾月 // #MA.YM // Calculation last month';


COMMENT ON COLUMN mgt_act_ptn_config.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mgt_act_ptn_config.carry_flg IS '繰越ＦＬＧ // #MA.FLG // Carry-over flg.';


COMMENT ON COLUMN mgt_act_ptn_config.err_proceed_flg IS 'エラー時続行ＦＬＧ // #MA.FLG // Continue on error flg.';


COMMENT ON COLUMN mgt_act_ptn_config.rmrks IS '備考 // #MG.ACT_PTN_CONFIG_RMRKS // Remarks';


COMMENT ON COLUMN mgt_act_ptn_config.sub_char1 IS '予備１ // #MG.ACT_PTN_CONFIG_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_act_ptn_config.sub_char2 IS '予備２ // #MG.ACT_PTN_CONFIG_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_act_ptn_config.sub_char3 IS '予備３ // #MG.ACT_PTN_CONFIG_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mgt_act_ptn_config.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mgt_act_ptn_config.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mgt_act_ptn_config.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mgt_act_ptn_config.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mgt_act_ptn_config.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mgt_act_ptn_config.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mgt_act_ptn_config.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mgt_act_ptn_config.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mgt_act_ptn_config.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mgt_act_ptn_config.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

