\encoding UTF-8

COMMENT ON VIEW mbt_jnl_history IS '自動仕訳履歴テーブル // Table for Auto-journal history';


COMMENT ON COLUMN mbt_jnl_history.jnl_grp_no IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN mbt_jnl_history.ac_ym IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN mbt_jnl_history.st_dt IS '対象開始日 // #MA.DT // Start date of the term';


COMMENT ON COLUMN mbt_jnl_history.end_dt IS '対象終了日 // #MA.DT // End date of the term';


COMMENT ON COLUMN mbt_jnl_history.ac_slip_dt IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN mbt_jnl_history.jnl_act_cd IS '仕訳実行ＣＤ // #MA.JNL_ACT_CD // Journalizing cd.';


COMMENT ON COLUMN mbt_jnl_history.data_typ IS 'データ状況区分 // #MA.DATA_TYP // Data status type';


COMMENT ON COLUMN mbt_jnl_history.rerun_flg IS '再作成ＦＬＧ // #MA.FLG // Re-create flg.';


COMMENT ON COLUMN mbt_jnl_history.jnl_rmrks IS '仕訳備考 // #MA.JNL_RMRKS // Journal remarks';


COMMENT ON COLUMN mbt_jnl_history.ins_usr_id IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN mbt_jnl_history.ins_usr_nm IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN mbt_jnl_history.ins_ts IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN mbt_jnl_history.ins_func_id IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN mbt_jnl_history.upd_cntr IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN mbt_jnl_history.upd_usr_id IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN mbt_jnl_history.upd_usr_nm IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN mbt_jnl_history.upd_ts IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN mbt_jnl_history.upd_func_id IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN mbt_jnl_history.upd_srv_req_no IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

