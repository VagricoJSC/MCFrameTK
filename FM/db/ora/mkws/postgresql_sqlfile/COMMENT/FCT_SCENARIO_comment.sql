\encoding UTF-8

COMMENT ON TABLE fct_scenario IS 'シナリオ一覧 // Scenario';


COMMENT ON COLUMN fct_scenario.scenario_no IS 'シナリオＮＯ // #FC.SCENARIO_NO // Scenario No.';


COMMENT ON COLUMN fct_scenario.scenario_cd IS 'シナリオＣＤ // #FC.SCENARIO_CD // Scenario cd.';


COMMENT ON COLUMN fct_scenario.scenario_nm IS 'シナリオ名 // #FC.SCENARIO_NM // Scenario name';


COMMENT ON COLUMN fct_scenario.module_id IS 'ＭｏｄｕｌｅＩＤ // #FC.MODULE_ID // Module ID';


COMMENT ON COLUMN fct_scenario.screen_id IS 'ＳｃｒｅｅｎＩＤ // #FC.SCREEN_ID // Screen ID';


COMMENT ON COLUMN fct_scenario.co_cd IS '会社ＣＤ // #FC.CO_CD // Company cd.';


COMMENT ON COLUMN fct_scenario.user_id IS 'ユーザＩＤ // #FC.USR_ID // User ID';


COMMENT ON COLUMN fct_scenario.check_test IS 'テスト対象 //  // For test';


COMMENT ON COLUMN fct_scenario.scenario_type IS 'シナリオ種別 // #FC.SCENARIO_TYPE // Scenario type';


COMMENT ON COLUMN fct_scenario.is_share IS 'システム共通 // #FC.SHARE_LEVEL // System-common';


COMMENT ON COLUMN fct_scenario.ins_usr_id IS '登録ユーザＩＤ // #FC.USR_ID // Entry user ID';


COMMENT ON COLUMN fct_scenario.ins_usr_nm IS '登録ユーザ名 // #FC.USR_NM // Entry user name';


COMMENT ON COLUMN fct_scenario.ins_ts IS '登録日時 // #FC.SYS_TS // Entry date and time';


COMMENT ON COLUMN fct_scenario.ins_func_id IS '登録機能ＩＤ // #FC.FUNC_ID // Entry function ID';


COMMENT ON COLUMN fct_scenario.upd_cntr IS '更新カウンタ // #FC.UPD_CNT // Update counter';


COMMENT ON COLUMN fct_scenario.upd_usr_id IS '更新ユーザＩＤ // #FC.USR_ID // Update user ID';


COMMENT ON COLUMN fct_scenario.upd_usr_nm IS '更新ユーザ名 // #FC.USR_NM // Update user name';


COMMENT ON COLUMN fct_scenario.upd_ts IS '更新日時 // #FC.SYS_TS // Update date and time';


COMMENT ON COLUMN fct_scenario.upd_func_id IS '更新機能ＩＤ // #FC.FUNC_ID // Update function ID';


COMMENT ON COLUMN fct_scenario.upd_srv_req_no IS '更新サーバリクエストＮＯ // #FC.SRV_REQ_NO // Update server request No.';

