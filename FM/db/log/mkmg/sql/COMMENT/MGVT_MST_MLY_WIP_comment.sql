
COMMENT ON TABLE MGVT_MST_MLY_WIP IS '月別仕掛ビュー // Monthly WIP view';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.IN_XFR_TYP IS '積送品区分 //  // In-transit type';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.STK_INSP_TYP IS '在庫検査区分 //  // Inventory inspection type';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.STK_ID_TYP IS '在庫識別区分 //  // Inventory identification type';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.ST_AC_DT IS '着手計上日 // #MA.DT // Start recording date';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.BASE_UNIT_SCHD_QTY IS '基準単位予定数量 // #MA.QTY // Base unit scheduled qty.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.BASE_UNIT_ACT_QTY IS '基準単位実績数量 // #MA.QTY // Base unit result qty.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.END_AC_DT IS '完了計上日 // #MA.DT // Completion recording date';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.BASE_UNIT_WIP_QTY IS '基準単位仕掛数量 // #MA.QTY // Base unit WIP qty.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.WIP_RATE IS '仕掛進捗度 // #MA.RATE // WIP progress';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.CMPL_FLG IS '完了ＦＬＧ // #MA.FLG // Completed flg.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.CLOSING_FLG IS '締処理済ＦＬＧ // #MA.FLG // Closed flg.';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SUB_CHAR1 IS '予備１ //  // Spare 1';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SUB_CHAR2 IS '予備２ //  // Spare 2';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.SUB_CHAR3 IS '予備３ //  // Spare 3';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGVT_MST_MLY_WIP.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

