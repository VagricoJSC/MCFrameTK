
COMMENT ON TABLE MGT_ACT_INPT IS '投入実績 // Input result';


COMMENT ON COLUMN MGT_ACT_INPT.ACT_INPT_ID IS '投入実績ＩＤ // #MG.ACT_INPT_ID // Input result ID';


COMMENT ON COLUMN MGT_ACT_INPT.ACT_INPT_ID_SUB IS '投入実績ＩＤ枝番 // #MG.ACT_INPT_ID_SUB // Input result ID branch No.';


COMMENT ON COLUMN MGT_ACT_INPT.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGT_ACT_INPT.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_ACT_INPT.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_ACT_INPT.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_ACT_INPT.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_ACT_INPT.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_ACT_INPT.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_ACT_INPT.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_ACT_INPT.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_ACT_INPT.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_ACT_INPT.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_ACT_INPT.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_ACT_INPT.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_ACT_INPT.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_ACT_INPT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_ACT_INPT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_ACT_INPT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_ACT_INPT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_ACT_INPT.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_ACT_INPT.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_ACT_INPT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_ACT_INPT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_ACT_INPT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_ACT_INPT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_ACT_INPT.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_ACT_INPT.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_ACT_INPT.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_ACT_INPT.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_ACT_INPT.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_ACT_INPT.MFG_ACT_GRP IS '製造実績グループ // #MG.MFG_ACT_GRP // Mfg. result group';


COMMENT ON COLUMN MGT_ACT_INPT.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_ACT_INPT.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_ACT_INPT.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MGT_ACT_INPT.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MGT_ACT_INPT.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_ACT_INPT.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_ACT_INPT.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_ACT_INPT.EVAL_LOOP_FLG IS '個別評価ループＦＬＧ // #MA.FLG // Individual evaluation loop flg.';


COMMENT ON COLUMN MGT_ACT_INPT.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';


COMMENT ON COLUMN MGT_ACT_INPT.RMRKS IS '備考 // #MG.ACT_INPT_RMRKS // Remarks';


COMMENT ON COLUMN MGT_ACT_INPT.SUB_CHAR1 IS '予備１ // #MG.ACT_INPT_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN MGT_ACT_INPT.SUB_CHAR2 IS '予備２ // #MG.ACT_INPT_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN MGT_ACT_INPT.SUB_CHAR3 IS '予備３ // #MG.ACT_INPT_SUB_CHAR3 // Spare 3';


COMMENT ON COLUMN MGT_ACT_INPT.INS_USR_ID IS '登録ユーザＩＤ // #MA.FCM_USR_ID // Entry user ID';


COMMENT ON COLUMN MGT_ACT_INPT.INS_USR_NM IS '登録ユーザ名 // #MA.FCM_USR_NM // Entry user name';


COMMENT ON COLUMN MGT_ACT_INPT.INS_TS IS '登録日時 // #MA.SYS_TS // Entry date and time';


COMMENT ON COLUMN MGT_ACT_INPT.INS_FUNC_ID IS '登録機能ＩＤ // #MA.FUNC_ID // Entry function ID';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_CNTR IS '更新カウンタ // #MA.UPD_CNT // Update counter';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_USR_ID IS '更新ユーザＩＤ // #MA.FCM_USR_ID // Update user ID';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_USR_NM IS '更新ユーザ名 // #MA.FCM_USR_NM // Update user name';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_TS IS '更新日時 // #MA.SYS_TS // Update date and time';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_FUNC_ID IS '更新機能ＩＤ // #MA.FUNC_ID // Update function ID';


COMMENT ON COLUMN MGT_ACT_INPT.UPD_SRV_REQ_NO IS '更新リクエストＮＯ // #MA.SRV_REQ_NO // Update request No.';

