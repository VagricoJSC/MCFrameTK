\encoding UTF-8

COMMENT ON TABLE mst_sche_exec_all IS 'スケジューラ実行情報 // Scheduler execution info.';


COMMENT ON COLUMN mst_sche_exec_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mst_sche_exec_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mst_sche_exec_all.exec_flg IS '実行中ＦＬＧ // #MA.FLG // Executing flg.';


COMMENT ON COLUMN mst_sche_exec_all.from_dt IS '対象期間開始日 // #MA.DT // Start date of the term';


COMMENT ON COLUMN mst_sche_exec_all.to_dt IS '対象期間終了日 // #MA.DT // End date of the term';


COMMENT ON COLUMN mst_sche_exec_all.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN mst_sche_exec_all.intr_rmrks IS '内部備考 // #MS.SCHEEXEC_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN mst_sche_exec_all.sub_char1 IS '予備１ // #MS.SCHEEXEC_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mst_sche_exec_all.sub_char2 IS '予備２ // #MS.SCHEEXEC_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mst_sche_exec_all.sub_char3 IS '予備３ // #MS.SCHEEXEC_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN mst_sche_exec_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mst_sche_exec_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mst_sche_exec_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mst_sche_exec_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mst_sche_exec_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mst_sche_exec_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mst_sche_exec_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mst_sche_exec_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mst_sche_exec_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mst_sche_exec_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

