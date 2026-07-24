
COMMENT ON TABLE MBT_JNL_HISTORY IS '自動仕訳履歴テーブル // Table for Auto-journal history';


COMMENT ON COLUMN MBT_JNL_HISTORY.JNL_GRP_NO IS '仕訳グループＮＯ // #MA.JNL_GRP_NO // Journal group No.';


COMMENT ON COLUMN MBT_JNL_HISTORY.AC_YM IS '計上年月 // #MA.YM // Recording month';


COMMENT ON COLUMN MBT_JNL_HISTORY.ST_DT IS '対象開始日 // #MA.DT // Start date of the term';


COMMENT ON COLUMN MBT_JNL_HISTORY.END_DT IS '対象終了日 // #MA.DT // End date of the term';


COMMENT ON COLUMN MBT_JNL_HISTORY.AC_SLIP_DT IS '会計伝票日付 // #MA.DT // Accounting slip date';


COMMENT ON COLUMN MBT_JNL_HISTORY.JNL_ACT_CD IS '仕訳実行ＣＤ // #MA.JNL_ACT_CD // Journalizing cd.';


COMMENT ON COLUMN MBT_JNL_HISTORY.DATA_TYP IS 'データ状況区分 // #MA.DATA_TYP // Data status type';


COMMENT ON COLUMN MBT_JNL_HISTORY.RERUN_FLG IS '再作成ＦＬＧ // #MA.FLG // Re-create flg.';


COMMENT ON COLUMN MBT_JNL_HISTORY.JNL_RMRKS IS '仕訳備考 // #MA.JNL_RMRKS // Journal remarks';


COMMENT ON COLUMN MBT_JNL_HISTORY.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MBT_JNL_HISTORY.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MBT_JNL_HISTORY.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MBT_JNL_HISTORY.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MBT_JNL_HISTORY.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

