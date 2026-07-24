
COMMENT ON TABLE MAM_JNL_ACT IS '仕訳実行マスタ // Journalizing master';


COMMENT ON COLUMN MAM_JNL_ACT.JNL_ACT_CD IS '仕訳実行ＣＤ // #MA.JNL_ACT_CD // Journalizing cd.';


COMMENT ON COLUMN MAM_JNL_ACT.JNL_ACT_NM IS '仕訳実行名 // #MA.JNL_ACT_NM // Journalizing name';


COMMENT ON COLUMN MAM_JNL_ACT.BASE_JNL_ACT_NM IS '仕訳実行名（ベース） // #MA.JNL_ACT_NM // Journalizing name(Base)';


COMMENT ON COLUMN MAM_JNL_ACT.JNL_DEL_FLG IS '仕訳削除ＦＬＧ // #MA.FLG // Journal deletion flg.';


COMMENT ON COLUMN MAM_JNL_ACT.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_JNL_ACT.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_JNL_ACT.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_JNL_ACT.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_JNL_ACT.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_JNL_ACT.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_JNL_ACT.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_JNL_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_JNL_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_JNL_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_JNL_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_JNL_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

