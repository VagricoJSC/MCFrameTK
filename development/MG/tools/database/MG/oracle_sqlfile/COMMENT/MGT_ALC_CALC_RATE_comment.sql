
COMMENT ON TABLE MGT_ALC_CALC_RATE IS '配賦率情報（配賦率計算結果） // Allocation rate info. (Allocation rate calculation result)';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_GRP_ID IS '配賦グループＩＤ // #MG.ALC_GRP_ID // Allocation group ID';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.INPT_ALC_TYP IS '入力費用区分 // #MG.INPT_ALC_TYP // Input expense type';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.DPT_CD IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.CTG_CD IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.AMT IS '入力金額 // #MA.MONEY // Input amount';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_TGT_VAL IS '配賦対象 // #MG.ALC_TGT_VAL // Allocation target';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_RATE IS '配賦率 // #MA.ALC_RATE // Allocation rate';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_AMT IS '配賦金額 // #MA.MONEY // Allocation amount';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.TRD_ALC_TGT_VAL IS '振替配賦対象 // #MG.ALC_TGT_VAL // Transfer allocation target';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.TRD_ALC_AMT IS '振替金額 // #MA.MONEY // Transfer amount';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.STD_ALC_RATE IS '標準配賦率 // #MA.ALC_RATE // Standard allocation rate';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.STD_ALC_AMT IS '標準配賦金額 // #MA.MONEY // Standard allocation amount';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.STD_ALC_TGT_VAL IS '標準配賦対象 // #MG.ALC_TGT_VAL // Standard allocation target';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.ALC_PTN_CD IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.DIFF_CALC_TYP IS '差異計算区分 // #MA.DIFF_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ALC_CALC_RATE.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

