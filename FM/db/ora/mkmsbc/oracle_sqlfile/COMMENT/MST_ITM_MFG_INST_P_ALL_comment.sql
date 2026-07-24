
COMMENT ON TABLE MST_ITM_MFG_INST_P_ALL IS '品目製造指図（改訂履歴） // Item mfg. order (Rev. history)';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MFG_INST_REV IS '製造指図改訂番号 // #MA.SLIP_REV // Mfg. order rev. number';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.IO_SCHD_PR_NO IS '受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // GR/GI progress management No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.FRST_MFG_INST_NO IS '初回製造指図ＮＯ // #MA.MFG_INST_NO // Initial mfg. order No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MFG_MTD_TYP IS '生産方法区分 // #MS.MFG_MTD_TYP // Production method type';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SPPL_CD IS '外注先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.BASE_UNIT_YIELD_QTY IS '基準単位出来高予定数量 // #MA.QTY // Base unit output scheduled qty.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.BASE_UNIT_INST_QTY IS '基準単位製造指図数量 // #MA.QTY // Base unit mfg. order qty.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UNSCHD_INST_FLG IS '計画外指図ＦＬＧ // #MA.FLG // Unplanned order flg.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UNSCHD_ACT_FLG IS '計画外実績ＦＬＧ // #MA.FLG // Unplanned result flg.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.STRG_LOC_CD IS '格納先場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.STRG_STR_LN_CD IS '格納棚・ラインＣＤ // #MA.STR_LN_CD // Storage rack/line cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.MFG_STR_LN_CD IS '製造棚・ラインＣＤ // #MA.STR_LN_CD // Mfg. rack/line cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_LOWER_YIELD IS '品目下限収率 // #MA.YIELD // Item min. yield';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_STD_YIELD IS '品目標準収率 // #MA.YIELD // Item standard yield';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.ITM_UPPER_YIELD IS '品目上限収率 // #MA.YIELD // Item max. yield';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.CAN_FLG IS '取消ＦＬＧ // #MA.FLG // Cancel flg.';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SUB_CHAR1 IS '予備１ // #MS.ITM_MFG_INST_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SUB_CHAR2 IS '予備２ // #MS.ITM_MFG_INST_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.SUB_CHAR3 IS '予備３ // #MS.ITM_MFG_INST_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_ITM_MFG_INST_P_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

