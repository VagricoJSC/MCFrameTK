
COMMENT ON TABLE MAM_AUTO_JNL_ALL IS '自動仕訳マスタ_（全社）_ // Auto-journal master_(Company-wide)_';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.AUTO_JNL_KEY_CD IS '自動仕訳キーＣＤ // #MA.AUTO_JNL_KEY_CD // Auto-journal key cd.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.AUTO_JNL_GRP IS '自動仕訳グループ // #MA.AUTO_JNL_GRP // Auto-journal group';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.JNL_PTN_CD IS '仕訳パタンＣＤ // #MA.JNL_PTN_CD // Journal pattern cd.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.PRIO IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.AC_IF_TYP IS '会計ＩＦ区分 // #MA.AC_IF_TYP // Accounting IF type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.ID_TYP IS '伝票ＩＤ区分 // #MA.ID_TYP // Slip ID type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.SLIP_CNT_ID IS '伝票グループＩＤ // #MA.SLIP_CNT_ID // Slip group ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.STD_RND_TYP IS '標準評価端数処理区分 // #MA.RND_TYP // Standard evaluation rounding type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.CLS_JNL_TYP IS '決算仕訳区分 // #MA.CLS_JNL_TYP // Closing entry type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.COMPOUND_JNL_TYP IS '複合仕訳区分 // #MA.COMPOUND_JNL_TYP // Compound journal type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.ALLOC_JNL_FLG IS '配賦仕訳ＦＬＧ // #MA.FLG // Allocation journal flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.MINUS_FLG IS 'マイナスＦＬＧ // #MA.FLG // Minus flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.REV_FLG IS '貸借逆転ＦＬＧ // #MA.FLG // Debit credit reverse flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.MINUS_REV_FLG IS 'マイナス逆転ＦＬＧ // #MA.FLG // Reverse minus flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.DEFAULT_FLG IS 'デフォルトＦＬＧ // #MA.FLG // Default flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.ABS_TYP IS '摘要区分 // #MA.ABS_TYP // Abstract type';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.ABSTRACT1 IS '摘要 // #MA.ABSTRACT_M // Abstract';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_AUTO_JNL_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';

