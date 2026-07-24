
COMMENT ON TABLE MGT_ACC_TOP_ALL IS '最上位品目情報（原価計算結果） // Top item info. (Calculation result)';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.TOP_REC_NO IS '最上位レコードＮＯ // #MG.TOP_REC_NO // Top record No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CALC_REC_TYP IS '計算レコード区分 // #MG.CALC_REC_TYP // Calculation record type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.MFG_PURC_TYP IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.COST_IO_TYP IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ACT_ID IS '実績ＩＤ // #MG.ACT_ID // Result ID';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ACT_ID_SUB IS '実績ＩＤ枝番 // #MG.ACT_ID_SUB // Result ID branch No.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.OTHER_DPT_CD IS '相手部門ＣＤ // #MA.COST_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STD_QTY IS '標準数量 // #MA.QTY // Standard qty.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STD_AMT IS '標準金額 // #MA.MONEY // Standard amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.CUR_STD_AMT IS '通貨標準金額 // #MA.MONEY // Currency standard amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STD_XRATE IS '標準為替レート // #MA.MONEY // Standard exchange rate';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPRI_DIFF IS '単価差異 // #MA.MONEY // Unit price variance';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.RATE_DIFF IS 'レート差異 // #MA.MONEY // Rate variance';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.TRD_GRP IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ACT_UPRI IS '実際単価 // #MA.MONEY // Actual unit price';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.STD_UPRI IS '標準単価 // #MA.MONEY // Standard unit cost';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SO_ACT_AMT IS '実際相殺金額 // #MA.MONEY // Actual offset amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.SO_STD_AMT IS '標準相殺金額 // #MA.MONEY // Standard offset amount';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PER IS '進捗度 // #MA.RATE // Progress';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.MFG_COST_RATIO IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.GP_ALC_CD IS '汎用配賦分類ＣＤ // #MA.GP_ALC_CD // General purpose allocation classification cd.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.REPURC_OBLI_FLG IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ACC_TOP_ALL.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

