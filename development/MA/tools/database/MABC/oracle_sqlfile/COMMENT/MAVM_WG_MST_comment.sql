
COMMENT ON TABLE MAVM_WG_MST IS 'ワーキンググループマスタビュー // WG master view';


COMMENT ON COLUMN MAVM_WG_MST.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM IS 'ワーキンググループ名 // #MA.WG_NM // WG name';


COMMENT ON COLUMN MAVM_WG_MST.SLS_FLG IS '販売ＦＬＧ // #MA.FLG // Sales flg.';


COMMENT ON COLUMN MAVM_WG_MST.LG_FLG IS '物流ＦＬＧ // #MA.FLG // Distribution flg.';


COMMENT ON COLUMN MAVM_WG_MST.MFG_FLG IS '製造ＦＬＧ // #MA.FLG // Mfg. flg.';


COMMENT ON COLUMN MAVM_WG_MST.PURC_FLG IS '購買ＦＬＧ // #MA.FLG // Purchasing flg.';


COMMENT ON COLUMN MAVM_WG_MST.AR_FLG IS '債権ＦＬＧ // #MA.FLG // AR flg.';


COMMENT ON COLUMN MAVM_WG_MST.AP_FLG IS '債務ＦＬＧ // #MA.FLG // AP flg.';


COMMENT ON COLUMN MAVM_WG_MST.SD_FLG IS '需給ＦＬＧ // #MA.FLG // Demand and supply flg.';


COMMENT ON COLUMN MAVM_WG_MST.MRP_PREFIX IS 'ＭＲＰ発番用接頭語 // #MA.MRP_PREFIX // Prefix for MRP numbering';


COMMENT ON COLUMN MAVM_WG_MST.MFG_INST_UNIT_TYP IS '製造指図単位区分 // #MA.MFG_INST_UNIT_TYP // Mfg. order unit type';


COMMENT ON COLUMN MAVM_WG_MST.MRP_PROC_TYP IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN MAVM_WG_MST.ALLOC_MARGIN_DAYS IS '引当余裕日数 // #MA.DAYS // Allocation extra days';


COMMENT ON COLUMN MAVM_WG_MST.NOT_XFR_FLG IS '移動・移送引当対象外ＦＬＧ // #MA.FLG // Not for movement/transport allocation flg.';


COMMENT ON COLUMN MAVM_WG_MST.MRP_ALLOC_MARGIN_DAYS IS 'ＭＲＰ引当余裕日数 // #MA.DAYS // MRP allocation extra days';


COMMENT ON COLUMN MAVM_WG_MST.MRP_OPN_XFR_DAYS IS 'ＭＲＰ未確定移送依頼考慮日数 // #MA.DAYS // Days to consider unfirm transport request in MRP';


COMMENT ON COLUMN MAVM_WG_MST.RQMT_TYP IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN MAVM_WG_MST.PROD_PLN_TYP IS '生産計画立案区分 // #MA.PROD_PLN_TYP // Production planning type';


COMMENT ON COLUMN MAVM_WG_MST.DMND_DATE_DIV_MONS IS '需要日ばらし月数 // #MA.MONS // Number of months for demand disaggregation by day';


COMMENT ON COLUMN MAVM_WG_MST.PLM_FLG IS 'ＰＬＭ ＦＬＧ // #MA.FLG // PLM flg.';


COMMENT ON COLUMN MAVM_WG_MST.CALC_SEQ IS '計算順序 // #MA.INT3 // Calculation sequence';


COMMENT ON COLUMN MAVM_WG_MST.CMN_UPRI_FLG IS '共通単価ＦＬＧ // #MA.FLG // Common unit price flg.';


COMMENT ON COLUMN MAVM_WG_MST.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_WG_MST.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_WG_MST.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAVM_WG_MST.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';


COMMENT ON COLUMN MAVM_WG_MST.DEL_USR_ID IS '論理削除ユーザＩＤ // #MA.FCM_USR_ID // Logical delete user ID';


COMMENT ON COLUMN MAVM_WG_MST.DEL_USR_NM IS '論理削除ユーザ名 // #MA.FCM_USR_NM // Logical delete user name';


COMMENT ON COLUMN MAVM_WG_MST.DEL_TS IS '論理削除日時 // #MA.SYS_TS // Logical delete date and time';


COMMENT ON COLUMN MAVM_WG_MST.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MAVM_WG_MST.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MAVM_WG_MST.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MAVM_WG_MST.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MAVM_WG_MST.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MAVM_WG_MST.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MAVM_WG_MST.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MAVM_WG_MST.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MAVM_WG_MST.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MAVM_WG_MST.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';


COMMENT ON COLUMN MAVM_WG_MST.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM_LCL1 IS 'ワーキンググループ名（ロケール１） // #MA.WG_NM // WG name (Locale 1)';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM_LCL2 IS 'ワーキンググループ名（ロケール２） // #MA.WG_NM // WG name (Locale 2)';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM_LCL3 IS 'ワーキンググループ名（ロケール３） // #MA.WG_NM // WG name (Locale 3)';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM_LCL4 IS 'ワーキンググループ名（ロケール４） // #MA.WG_NM // WG name (Locale 4)';


COMMENT ON COLUMN MAVM_WG_MST.WG_NM_LCL5 IS 'ワーキンググループ名（ロケール５） // #MA.WG_NM // WG name (Locale 5)';

