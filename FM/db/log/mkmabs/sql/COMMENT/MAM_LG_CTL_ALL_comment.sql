
COMMENT ON TABLE MAM_LG_CTL_ALL IS '物流制御マスタ // Distribution control master';


COMMENT ON COLUMN MAM_LG_CTL_ALL.FR_LG_GRP_CD IS '出荷元物流グループＣＤ // #MA.LG_GRP_CD // Shipping point distribution group cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.TO_LG_GRP_CD IS '出荷先物流グループＣＤ // #MA.LG_GRP_CD // Receiving point distribution group cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.SHIP_TERM_CD IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.XFR_LT IS '移動ＬＴ // #MA.LT // Movement LT';


COMMENT ON COLUMN MAM_LG_CTL_ALL.FIN_CL_TIME IS '出荷締時刻 // #MA.CHAR_HM // Shipping closing time';


COMMENT ON COLUMN MAM_LG_CTL_ALL.ALLOC_DAYS IS '引当可能日数 // #MA.DAYS // Allocatable days';


COMMENT ON COLUMN MAM_LG_CTL_ALL.IV_TRD_FLG IS 'インボイス取引ＦＬＧ // #MA.FLG // Shipping invoice biz flg.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.DEF_TDLV_CD IS '標準配送先ＣＤ // #MA.BP_CD // Standard receiving point cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.SHIP_WK_GRP_CD IS '出荷作業グループＣＤ // #MA.SHIP_WK_GRP_CD // Shipping operation group cd.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.NON_DMND_LT_FLG IS '需要情報ＬＴ無しＦＬＧ // #MA.FLG // Without demand LT flg.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_LG_CTL_ALL.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_LG_CTL_ALL.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_LG_CTL_ALL.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_LG_CTL_ALL.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_LG_CTL_ALL.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_LG_CTL_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_LG_CTL_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_LG_CTL_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_LG_CTL_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_LG_CTL_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAM_LG_CTL_ALL.EARLY_SHIP_DT_ADD_DAYS IS '最早出荷日加算日数 // #MA.DAYS // Number of days added to earliest shipping date';

