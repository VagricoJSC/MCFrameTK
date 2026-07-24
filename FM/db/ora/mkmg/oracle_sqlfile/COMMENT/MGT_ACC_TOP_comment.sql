
COMMENT ON TABLE MGT_ACC_TOP IS '最上位品目情報（原価計算結果） // Top item info. (Calculation result)';


COMMENT ON COLUMN MGT_ACC_TOP.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_ACC_TOP.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_ACC_TOP.TOP_REC_NO IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN MGT_ACC_TOP.CALC_REC_TYP IS '計算レコード区分 // #MG.CALC_REC_TYP // Calculation record type';


COMMENT ON COLUMN MGT_ACC_TOP.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ACC_TOP.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ACC_TOP.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_ACC_TOP.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ACC_TOP.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ACC_TOP.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ACC_TOP.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ACC_TOP.MFG_PURC_TYP IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN MGT_ACC_TOP.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ACC_TOP.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ACC_TOP.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ACC_TOP.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ACC_TOP.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ACC_TOP.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ACC_TOP.COST_IO_TYP IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN MGT_ACC_TOP.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_ACC_TOP.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_ACC_TOP.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ACC_TOP.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_ACC_TOP.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ACC_TOP.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ACC_TOP.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ACC_TOP.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ACC_TOP.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_ACC_TOP.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_ACC_TOP.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_ACC_TOP.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_ACC_TOP.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_ACC_TOP.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_ACC_TOP.ACT_ID IS '実績ＩＤ // #MG.ACT_ID // Result ID';


COMMENT ON COLUMN MGT_ACC_TOP.ACT_ID_SUB IS '実績ＩＤ枝番 // #MG.ACT_ID_SUB // Result ID branch No.';


COMMENT ON COLUMN MGT_ACC_TOP.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP.OTHER_DPT_CD IS '相手部門ＣＤ // #MA.COST_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_ACC_TOP.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_ACC_TOP.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_ACC_TOP.STD_QTY IS '標準数量 // #MA.QTY // Standard qty.';


COMMENT ON COLUMN MGT_ACC_TOP.STD_AMT IS '標準金額 // #MA.MONEY // Standard amount';


COMMENT ON COLUMN MGT_ACC_TOP.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGT_ACC_TOP.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGT_ACC_TOP.CUR_STD_AMT IS '通貨標準金額 // #MA.MONEY // Currency standard amount';


COMMENT ON COLUMN MGT_ACC_TOP.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_ACC_TOP.STD_XRATE IS '標準為替レート // #MA.MONEY // Standard exchange rate';


COMMENT ON COLUMN MGT_ACC_TOP.UPRI_DIFF IS '単価差異 // #MA.MONEY // Unit price variance';


COMMENT ON COLUMN MGT_ACC_TOP.RATE_DIFF IS 'レート差異 // #MA.MONEY // Rate variance';


COMMENT ON COLUMN MGT_ACC_TOP.TRD_GRP IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN MGT_ACC_TOP.ACT_UPRI IS '実際単価 // #MA.MONEY // Actual unit price';


COMMENT ON COLUMN MGT_ACC_TOP.STD_UPRI IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN MGT_ACC_TOP.SO_ACT_AMT IS '実際相殺金額 // #MA.MONEY // Actual offset amount';


COMMENT ON COLUMN MGT_ACC_TOP.SO_STD_AMT IS '標準相殺金額 // #MA.MONEY // Standard offset amount';


COMMENT ON COLUMN MGT_ACC_TOP.PER IS '進捗度 // #MA.RATE // Progress';


COMMENT ON COLUMN MGT_ACC_TOP.MFG_COST_RATIO IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN MGT_ACC_TOP.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_ACC_TOP.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_ACC_TOP.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_ACC_TOP.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_ACC_TOP.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_ACC_TOP.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_ACC_TOP.GP_ALC_CD IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN MGT_ACC_TOP.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MGT_ACC_TOP.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ACC_TOP.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ACC_TOP.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ACC_TOP.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ACC_TOP.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

