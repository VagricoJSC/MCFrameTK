
COMMENT ON TABLE MGT_ALC_CALC_DTL IS '配賦明細情報（配賦率計算結果） // Allocation details info. (Allocation rate calculation result)';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ALC_GRP_ID IS '配賦グループＩＤ // #MG.ALC_GRP_ID // Allocation group ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.WK_RSN_CD IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ACT_SLS_ID IS '売上実績ＩＤ // #MG.ACT_SLS_ID // Sales result ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ACT_SLS_ID_SUB IS '売上実績ＩＤ枝番 // #MG.ACT_SLS_ID_SUB // Sales result ID branch No.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.GP_ALC_CD IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ALC_TGT_VAL IS '配賦対象 // #MG.ALC_TGT_VAL // Allocation target';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ALC_AMT IS '配賦金額 // #MA.MONEY // Allocation amount';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ADJ_AMT IS '端数調整金額 // #MA.MONEY // Fraction adjustment amount';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.STD_ALC_AMT IS '標準配賦金額 // #MA.MONEY // Standard allocation amount';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.COEF_VAL IS '配賦係数値 // #MA.COEF_VAL // Allocation coefficient value';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.ALC_ORG_TGT_VAL IS '配賦対象（係数無） // #MG.ALC_TGT_VAL // Allocation target (Without coefficient)';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.STD_ALC_TGT_VAL IS '標準配賦対象 // #MG.ALC_TGT_VAL // Standard allocation target';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ALC_CALC_DTL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

