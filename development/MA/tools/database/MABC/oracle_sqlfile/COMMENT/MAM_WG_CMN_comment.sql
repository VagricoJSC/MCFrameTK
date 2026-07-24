
COMMENT ON TABLE MAM_WG_CMN IS 'ワーキンググループマスタ_（共通）_ // WG master_(Common)_';


COMMENT ON COLUMN MAM_WG_CMN.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAM_WG_CMN.WG_NM IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN MAM_WG_CMN.SLS_FLG IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAM_WG_CMN.LG_FLG IS '物流ＦＬＧ // #MA.FLG // Distribution flg.';


COMMENT ON COLUMN MAM_WG_CMN.MFG_FLG IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN MAM_WG_CMN.PURC_FLG IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN MAM_WG_CMN.AR_FLG IS '債権ＦＬＧ // #MA.FLG // AR flg.';


COMMENT ON COLUMN MAM_WG_CMN.AP_FLG IS '債務ＦＬＧ // #MA.FLG // AP flg.';


COMMENT ON COLUMN MAM_WG_CMN.SD_FLG IS '需給ＦＬＧ // #MA.FLG // Demand and supply flg.';


COMMENT ON COLUMN MAM_WG_CMN.MRP_PREFIX IS 'ＭＲＰ発番用接頭語 // #MA.MRP_PREFIX // Prefix for MRP numbering';


COMMENT ON COLUMN MAM_WG_CMN.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MAM_WG_CMN.MRP_PROC_TYP IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN MAM_WG_CMN.ALLOC_MARGIN_DAYS IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN MAM_WG_CMN.NOT_XFR_FLG IS '移動・移送引当対象外ＦＬＧ // #MA.FLG // Not for movement/transport allocation flg.';


COMMENT ON COLUMN MAM_WG_CMN.MRP_ALLOC_MARGIN_DAYS IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN MAM_WG_CMN.MRP_OPN_XFR_DAYS IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN MAM_WG_CMN.RQMT_TYP IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN MAM_WG_CMN.PROD_PLN_TYP IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN MAM_WG_CMN.DMND_DATE_DIV_MONS IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN MAM_WG_CMN.PLM_FLG IS 'ＰＬＭ ＦＬＧ // #MA.FLG // PLM flg.';


COMMENT ON COLUMN MAM_WG_CMN.CALC_SEQ IS '計算順序 // #MA.INT3 // Calculation sequence';


COMMENT ON COLUMN MAM_WG_CMN.CMN_UPRI_FLG IS '共通単価ＦＬＧ // #MA.FLG // Common unit price flg.';


COMMENT ON COLUMN MAM_WG_CMN.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAM_WG_CMN.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAM_WG_CMN.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAM_WG_CMN.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAM_WG_CMN.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAM_WG_CMN.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAM_WG_CMN.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAM_WG_CMN.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAM_WG_CMN.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAM_WG_CMN.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAM_WG_CMN.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAM_WG_CMN.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAM_WG_CMN.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAM_WG_CMN.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAM_WG_CMN.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAM_WG_CMN.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAM_WG_CMN.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

