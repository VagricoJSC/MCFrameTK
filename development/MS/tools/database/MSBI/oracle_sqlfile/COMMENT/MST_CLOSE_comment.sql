
COMMENT ON TABLE MST_CLOSE IS '締処理情報 // Closing info.';


COMMENT ON COLUMN MST_CLOSE.YM IS '年月度 // #MA.DT // Fiscal month';


COMMENT ON COLUMN MST_CLOSE.SLS_CL_FLG IS '売上締ＦＬＧ // #MA.FLG // Sales closing flg.';


COMMENT ON COLUMN MST_CLOSE.RCV_CL_FLG IS '入金締ＦＬＧ // #MA.FLG // Payment received closing flg.';


COMMENT ON COLUMN MST_CLOSE.PURC_CL_FLG IS '仕入締ＦＬＧ // #MA.FLG // Purchase closing flg.';


COMMENT ON COLUMN MST_CLOSE.PAY_CL_FLG IS '支払締ＦＬＧ // #MA.FLG // Payment closing flg.';


COMMENT ON COLUMN MST_CLOSE.STK_CL_FLG IS '在庫締ＦＬＧ // #MA.FLG // Inventory closing flg.';


COMMENT ON COLUMN MST_CLOSE.SLS_CL_TM IS '売上締実行日時 // #MA.TM // Sales closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.RCV_CL_TM IS '入金締実行日時 // #MA.TM // Payment received closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.PURC_CL_TM IS '仕入締実行日時 // #MA.TM // Purchase closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.PAY_CL_TM IS '支払締実行日時 // #MA.TM // Payment closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.STK_CL_TM IS '在庫締実行日時 // #MA.TM // Inventory closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.AR_PRE_CL_TM IS '売掛最終仮締実行日時 // #MA.TM // AR final temporary closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.AP_PRE_CL_TM IS '買掛最終仮締実行日時 // #MA.TM // AP final temporary closing execution date and time';


COMMENT ON COLUMN MST_CLOSE.SLS_CL_USR_CD IS '売上締担当者ＣＤ // #MA.USR_CD // Sales closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.RCV_CL_USR_CD IS '入金締担当者ＣＤ // #MA.USR_CD // Payment received closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.PURC_CL_USR_CD IS '仕入締担当者ＣＤ // #MA.USR_CD // Purchase closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.PAY_CL_USR_CD IS '支払締担当者ＣＤ // #MA.USR_CD // Payment closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.STK_CL_USR_CD IS '在庫締担当者ＣＤ // #MA.USR_CD // Inventory closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.AR_PRE_CL_USR_CD IS '売掛仮締担当者ＣＤ // #MA.USR_CD // AR temporary closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.AP_PRE_CL_USR_CD IS '買掛仮締担当者ＣＤ // #MA.USR_CD // AP temporary closing PIC cd.';


COMMENT ON COLUMN MST_CLOSE.AR_PRE_CL_FLG IS '売掛仮締ＦＬＧ // #MA.FLG // AR temporary closing flg.';


COMMENT ON COLUMN MST_CLOSE.AP_PRE_CL_FLG IS '買掛仮締ＦＬＧ // #MA.FLG // AP temporary closing flg.';


COMMENT ON COLUMN MST_CLOSE.ALL_ACST_PRE_CL_FLG IS '全売掛先仮締ＦＬＧ // #MA.FLG // All AR customer temporary closing flg.';


COMMENT ON COLUMN MST_CLOSE.ALL_ASPPL_PRE_CL_FLG IS '全買掛先仮締ＦＬＧ // #MA.FLG // All AP supplier temporary closing flg.';


COMMENT ON COLUMN MST_CLOSE.SUB_CHAR1 IS '予備１ // #MS.CLOSE_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_CLOSE.SUB_CHAR2 IS '予備２ // #MS.CLOSE_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_CLOSE.SUB_CHAR3 IS '予備３ // #MS.CLOSE_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_CLOSE.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_CLOSE.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_CLOSE.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_CLOSE.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_CLOSE.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_CLOSE.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_CLOSE.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_CLOSE.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_CLOSE.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_CLOSE.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

