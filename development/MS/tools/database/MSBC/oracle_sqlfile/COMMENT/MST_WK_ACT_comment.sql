
COMMENT ON TABLE MST_WK_ACT IS '工数実績 // Man-hour result';


COMMENT ON COLUMN MST_WK_ACT.WK_ACT_NO IS '工数実績ＮＯ // #MA.WK_ACT_NO // Man-hour result No.';


COMMENT ON COLUMN MST_WK_ACT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MST_WK_ACT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MST_WK_ACT.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MST_WK_ACT.WK_SCHD_NO IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN MST_WK_ACT.DIV_SEQ IS '分割連番 // #MS.DIV_SEQ // Split sequence number';


COMMENT ON COLUMN MST_WK_ACT.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MST_WK_ACT.WK_COST IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN MST_WK_ACT.ST_TM IS '着手時刻 // #MA.TM // Start time';


COMMENT ON COLUMN MST_WK_ACT.END_TM IS '終了時刻 // #MA.TM // End time';


COMMENT ON COLUMN MST_WK_ACT.BRK_PD IS '中断時間 // #MA.INT4 // Downtime';


COMMENT ON COLUMN MST_WK_ACT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MST_WK_ACT.WK_RSN_CD IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN MST_WK_ACT.WK_COST_CALC_CTL_FLG IS '自動工数計算更新許可ＦＬＧ // #MA.FLG // Auto man-hour calculation update permission flg.';


COMMENT ON COLUMN MST_WK_ACT.WK_DAY_CD IS '勤務種類ＣＤ // #MA.WK_DAY_CD // Work type cd.';


COMMENT ON COLUMN MST_WK_ACT.DPT_CD IS '部門ＣＤ // #MA.DPT_CD // Dept. cd.';


COMMENT ON COLUMN MST_WK_ACT.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MST_WK_ACT.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MST_WK_ACT.WK_USR_DPT_CD IS '作業者部門ＣＤ // #MA.DPT_CD // Worker dept. cd.';


COMMENT ON COLUMN MST_WK_ACT.WK_USR_CD IS '作業者ＣＤ // #MA.USR_CD // Worker cd.';


COMMENT ON COLUMN MST_WK_ACT.FCLTY IS '設備 // #MA.FCLTY // Equipment';


COMMENT ON COLUMN MST_WK_ACT.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MST_WK_ACT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MST_WK_ACT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MST_WK_ACT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MST_WK_ACT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MST_WK_ACT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MST_WK_ACT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MST_WK_ACT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MST_WK_ACT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MST_WK_ACT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MST_WK_ACT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MST_WK_ACT.DPT_WG_CD IS '部門ワーキンググループＣＤ // #MA.WG_CD // Dept. WG cd.';


COMMENT ON COLUMN MST_WK_ACT.LOC_WG_CD IS '場所ワーキンググループＣＤ // #MA.WG_CD // Location WG cd.';


COMMENT ON COLUMN MST_WK_ACT.MES_FLG IS 'ＭＥＳＦＬＧ // #MA.FLG // MES flg.';


COMMENT ON COLUMN MST_WK_ACT.EXT_SYS_CD IS '外部システムＣＤ // #MA.EXT_SYS_CD // External system cd.';


COMMENT ON COLUMN MST_WK_ACT.EXT_WK_ACT_NO IS '外部工数実績ＮＯ // #MA.EXT_WK_ACT_NO // External man-hour result No.';


COMMENT ON COLUMN MST_WK_ACT.INTR_RMRKS IS '内部備考 // #MS.WK_ACT_INTR_RMRKS // Internal remarks';


COMMENT ON COLUMN MST_WK_ACT.SUB_CHAR1 IS '予備１ // #MS.WK_ACT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MST_WK_ACT.SUB_CHAR2 IS '予備２ // #MS.WK_ACT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MST_WK_ACT.SUB_CHAR3 IS '予備３ // #MS.WK_ACT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MST_WK_ACT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MST_WK_ACT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MST_WK_ACT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MST_WK_ACT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MST_WK_ACT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MST_WK_ACT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MST_WK_ACT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MST_WK_ACT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MST_WK_ACT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MST_WK_ACT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

