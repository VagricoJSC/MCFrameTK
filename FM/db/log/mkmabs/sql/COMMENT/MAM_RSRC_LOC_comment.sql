
COMMENT ON TABLE MAM_RSRC_LOC IS '場所別資源マスタ // Resource master by location';


COMMENT ON COLUMN MAM_RSRC_LOC.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MAM_RSRC_LOC.RSRC_CD IS '資源ＣＤ // #MA.RSRC_CD // Resource cd.';


COMMENT ON COLUMN MAM_RSRC_LOC.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_RSRC_LOC.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_RSRC_LOC.RSRC_BASE_QTY IS '基準値／日 // #MA.QTY // Reference value/day';


COMMENT ON COLUMN MAM_RSRC_LOC.VAR_PER IS '変動率（％） // #MA.PER // Variation rates (%)';


COMMENT ON COLUMN MAM_RSRC_LOC.ALERT_PER IS 'アラート通知率（％） // #MA.PER // Alert notification rate (%)';


COMMENT ON COLUMN MAM_RSRC_LOC.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MAM_RSRC_LOC.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_RSRC_LOC.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_RSRC_LOC.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_RSRC_LOC.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_RSRC_LOC.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_RSRC_LOC.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_RSRC_LOC.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_RSRC_LOC.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_RSRC_LOC.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_RSRC_LOC.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_RSRC_LOC.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_RSRC_LOC.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

