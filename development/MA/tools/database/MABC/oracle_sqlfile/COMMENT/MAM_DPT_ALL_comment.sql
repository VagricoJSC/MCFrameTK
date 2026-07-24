
COMMENT ON TABLE MAM_DPT_ALL IS '部門マスタ_（全社）_ // Dept. master_(Company-wide)_';


COMMENT ON COLUMN MAM_DPT_ALL.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MAM_DPT_ALL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAM_DPT_ALL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAM_DPT_ALL.DPT_NM IS '部門名 // #MA.DPT_NM // Dept. name';


COMMENT ON COLUMN MAM_DPT_ALL.DPT_LVL_CD IS '部門階層ＣＤ // #MA.DPT_LVL_CD // Dept. hierarchy cd.';


COMMENT ON COLUMN MAM_DPT_ALL.UP_LV_DPT_CD IS '上位部門ＣＤ // #MA.DPT_CD // Upper dept. cd.';


COMMENT ON COLUMN MAM_DPT_ALL.AC_DPT_CD IS '会計部門ＣＤ // #MA.AC_DPT_CD // Accounting dept. cd.';


COMMENT ON COLUMN MAM_DPT_ALL.COST_DPT_CD IS '原価部門ＣＤ // #MA.COST_DPT_CD // Cost dept. cd.';


COMMENT ON COLUMN MAM_DPT_ALL.NEW_DPT_CD IS '新部門ＣＤ // #MA.DPT_CD // New dept. cd.';


COMMENT ON COLUMN MAM_DPT_ALL.ZIP_CD IS '郵便番号 // #MA.ZIP_CD // Zip code';


COMMENT ON COLUMN MAM_DPT_ALL.ADDR1 IS '住所１ // #MA.ADDR1 // Address 1';


COMMENT ON COLUMN MAM_DPT_ALL.ADDR2 IS '住所２ // #MA.ADDR2 // Address 2';


COMMENT ON COLUMN MAM_DPT_ALL.ADDR3 IS '住所３ // #MA.ADDR3 // Address 3';


COMMENT ON COLUMN MAM_DPT_ALL.ADDR4 IS '住所４ // #MA.ADDR4 // Address 4';


COMMENT ON COLUMN MAM_DPT_ALL.TEL IS 'ＴＥＬ // #MA.TEL // TEL';


COMMENT ON COLUMN MAM_DPT_ALL.FAX IS 'ＦＡＸ // #MA.TEL // FAX';


COMMENT ON COLUMN MAM_DPT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_DPT_ALL.RCV_BANK_AC_CD IS '入金口座ＣＤ // #MA.BANK_AC_CD // Payment received bank account cd.';


COMMENT ON COLUMN MAM_DPT_ALL.PAY_BANK_AC_CD IS '支払口座ＣＤ // #MA.BANK_AC_CD // Payment account cd.';


COMMENT ON COLUMN MAM_DPT_ALL.CAL_CD IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN MAM_DPT_ALL.ASST_DPT_FLG IS '資産管理部門ＦＬＧ // #MA.FLG // Asset management dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.AR_DPT_FLG IS '債権部門ＦＬＧ // #MA.FLG // AR dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.AP_DPT_FLG IS '債務部門ＦＬＧ // #MA.FLG // AP dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.SLS_DPT_FLG IS '営業部門ＦＬＧ // #MA.FLG // Sales dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.PURC_DPT_FLG IS '購買部門ＦＬＧ // #MA.FLG // Purchasing dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.SHIP_DPT_FLG IS '出荷部門ＦＬＧ // #MA.FLG // Shipping dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.ARR_DPT_FLG IS '入荷部門ＦＬＧ // #MA.FLG // Receipt dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.MFG_DPT_FLG IS '製造部門ＦＬＧ // #MA.FLG // Mfg. dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.SD_DPT_FLG IS '需給部門ＦＬＧ // #MA.FLG // Demand and supply dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.INSP_DPT_FLG IS '検査部門ＦＬＧ // #MA.FLG // Inspection dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.BD_DPT_FLG IS '負担部門ＦＬＧ // #MA.FLG // Charged dept. flg.';


COMMENT ON COLUMN MAM_DPT_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_DPT_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_DPT_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_DPT_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_DPT_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_DPT_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_DPT_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_DPT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_DPT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_DPT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_DPT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_DPT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_DPT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';

