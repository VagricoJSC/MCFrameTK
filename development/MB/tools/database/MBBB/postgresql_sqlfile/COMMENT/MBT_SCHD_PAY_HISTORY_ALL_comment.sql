\encoding UTF-8

COMMENT ON TABLE mbt_schd_pay_history_all IS '支払依頼情報作成処理履歴テーブル // Payment request info. creation process history table';


COMMENT ON COLUMN mbt_schd_pay_history_all.proc_no IS '処理ＮＯ // #MA.JNL_PROC_NO // Process No.';


COMMENT ON COLUMN mbt_schd_pay_history_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mbt_schd_pay_history_all.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_schd_pay_history_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mbt_schd_pay_history_all.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_schd_pay_history_all.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_schd_pay_history_all.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_schd_pay_history_all.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_schd_pay_history_all.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

