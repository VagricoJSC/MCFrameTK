
COMMENT ON TABLE MGT_CALC_INPT_ALL IS '計算対象投入情報 // (Calculation) Input info.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ACT_INPT_ID IS '投入実績ＩＤ // #MG.ACT_INPT_ID // Input result ID';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ACT_INPT_ID_SUB IS '投入実績ＩＤ枝番 // #MG.ACT_INPT_ID_SUB // Input result ID branch No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.CO_CD IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.PAR_ITM_EXT IS '親品目拡張 // #MG.ITM_EXT // Parent item extension';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_MFG_INST_NO IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.STR_LN_CD IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.EVAL_LOOP_FLG IS '個別評価ループＦＬＧ // #MA.FLG // Individual evaluation loop flg.';


COMMENT ON COLUMN MGT_CALC_INPT_ALL.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

