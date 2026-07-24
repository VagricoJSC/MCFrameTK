
COMMENT ON TABLE MGT_PRE_ALC_PATH IS '一次配賦計算過程 // Departmental alloc. calculation process';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_SEQ IS '連番 // #MA.PRE_ALC_MAX_REC // Sequence number';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.INPT_ALC_TYP IS '入力費用区分 // #MG.INPT_ALC_TYP // Input expense type';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.DPT_CD IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.CTG_CD IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_RATE IS '配賦対象 // #MG.PRE_ALC_RATE // Allocation target';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_TOTAL IS '配賦対象合計 // #MG.PRE_ALC_TOTAL // Allocation target total';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_CALC_RATE IS '配賦率 // #MG.PRE_ALC_CALC_RATE // Allocation rate';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_RATE_CD IS '一次配賦基準ＣＤ // #MA.PRE_ALC_RATE_CD // Departmental alloc. basis cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SRC_WG_CD IS '配賦元ワーキンググループＣＤ // #MA.WG_CD // Allocation source WG cd.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.SRC_PRE_ALC_SEQ IS '配賦元連番 // #MA.PRE_ALC_MAX_REC // Allocation source sequence number';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.TOP_PRE_ALC_SEQ IS '最上位連番 // #MA.PRE_ALC_MAX_REC // Top sequence number';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.PRE_ALC_LVL IS '配賦レベル // #MA.PRE_ALC_MAX_LVL // Allocation level';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.FIN_FLG IS '終了ＦＬＧ // #MA.FLG // Terminate flg.';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_PRE_ALC_PATH.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

