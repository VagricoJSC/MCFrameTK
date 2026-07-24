
COMMENT ON TABLE MST_YIELD_ACT_ALL IS '出来高実績 // Output result';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_ACT_NO IS '出来高実績ＮＯ // #MA.YIELD_ACT_NO // Output result No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_SCHD_NO IS '出来高予定ＮＯ // #MA.YIELD_INST_NO // Output schedule No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.MFG_MTD_TYP IS '生産方法区分 // #MS.MFG_MTD_TYP // Production method type';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.TRD_UNIT_QTY IS '取引単位数量 // #MA.QTY // Transaction unit qty.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.TRD_UNIT_CD IS '取引単位ＣＤ // #MA.UNIT_CD // Transaction unit cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.BASE_UNIT_QTY IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_TYP IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_RATE IS '出来高進捗度 // #MA.RATE // Output progress';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.STK_INSP_TYP IS '在庫検査区分 // #MS.STK_INSP_TYP // Inventory inspection type';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_RSN_CD IS '出来高理由ＣＤ // #MA.BIZ_RSN_CD // Output reason cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_LOC_CD IS '出来高場所ＣＤ // #MA.LOC_CD // Output location cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.YIELD_STR_LN_CD IS '出来高棚・ラインＣＤ // #MA.STR_LN_CD // Output rack/line cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.STRG_LOC_CD IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.STRG_STR_LN_CD IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ACT_TM IS '実績日時 // #MA.TM // Actual date and time';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.BKF_CTL_FLG IS 'バックフラッシュ更新許可ＦＬＧ // #MA.FLG // Allow backflush update flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.LOT_CTL_FLG IS '同一ロット発番許可ＦＬＧ // #MA.FLG // Allow same lot numbering flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SUBLOT_CTL_FLG IS '同一サブロット発番許可ＦＬＧ // #MA.FLG // Allow same sublot numbering flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.STK_LST_PRNT_FLG IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.NOT_STK_FLG IS '非在庫ＦＬＧ // #MA.FLG // MRO supply flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.DATA_NO IS 'データＮＯ // #MA.IF_DATA_NO // Data No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.MES_ID IS 'ＭＥＳＩＤ // #MS.MES_ID // MES ID';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.MES_FLG IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.EXT_YIELD_ACT_NO IS '外部出来高実績ＮＯ // #MA.EXT_YIELD_ACT_NO // External output result No.';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INTR_RMRKS IS '内部備考 // #MS.YIELD_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.ACT_RPT_RMRKS IS '記録書備考 // #MS.YIELD_ACT_RPT_RMRKS // Record sheet remarks';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INSP_CNT_RMRKS IS '検査連絡備考 // #MS.INSP_CNT_RMRKS // Inspection contact remarks';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.TRD_RMRKS IS '取引備考 // #MA.TRD_RMRKS // Transaction remarks';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SUB_CHAR1 IS '予備１ // #MS.YIELD_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SUB_CHAR2 IS '予備２ // #MS.YIELD_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.SUB_CHAR3 IS '予備３ // #MS.YIELD_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_YIELD_ACT_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

