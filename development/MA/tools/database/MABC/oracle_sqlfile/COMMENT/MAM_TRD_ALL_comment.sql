
COMMENT ON TABLE MAM_TRD_ALL IS '取引マスタ_（全社）_ // Transaction master_(Company-wide)_';


COMMENT ON COLUMN MAM_TRD_ALL.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MAM_TRD_ALL.TRD_NM IS '取引名 // #MA.TRD_NM // Transaction name';


COMMENT ON COLUMN MAM_TRD_ALL.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MAM_TRD_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MAM_TRD_ALL.SLIP_EACH_LOT_TYP IS 'ロット明細分割区分 // #MA.SLIP_EACH_LOT_TYP // Lot details split type';


COMMENT ON COLUMN MAM_TRD_ALL.SLIP_FORM_CD IS '伝票帳票ＣＤ // #MA.SLIP_FORM_CD // Slip report cd.';


COMMENT ON COLUMN MAM_TRD_ALL.AUTO_ADOPT_FLG IS '自動時採用ＦＬＧ // #MA.FLG // Adopt at auto flg.';


COMMENT ON COLUMN MAM_TRD_ALL.NOT_SLS_SLIP_SND_FLG IS '売上伝票送信対象外ＦＬＧ // #MA.FLG // Sales slip not to be exported flg.';


COMMENT ON COLUMN MAM_TRD_ALL.NOT_PURC_SLIP_SND_FLG IS '仕入伝票送信対象外ＦＬＧ // #MA.FLG // Purchase slip not to be exported flg.';


COMMENT ON COLUMN MAM_TRD_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_TRD_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_TRD_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_TRD_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_TRD_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_TRD_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_TRD_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_TRD_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_TRD_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_TRD_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_TRD_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_TRD_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_TRD_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';

