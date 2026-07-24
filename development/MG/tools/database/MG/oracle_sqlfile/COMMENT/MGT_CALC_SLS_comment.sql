
COMMENT ON TABLE MGT_CALC_SLS IS '計算対象売上情報 // (Calculation) Sales';


COMMENT ON COLUMN MGT_CALC_SLS.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_CALC_SLS.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_CALC_SLS.ACT_SLS_ID IS '売上実績ＩＤ // #MG.ACT_SLS_ID // Sales result ID';


COMMENT ON COLUMN MGT_CALC_SLS.ACT_SLS_ID_SUB IS '売上実績ＩＤ枝番 // #MG.ACT_SLS_ID_SUB // Sales result ID branch No.';


COMMENT ON COLUMN MGT_CALC_SLS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_CALC_SLS.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_CALC_SLS.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_CALC_SLS.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_CALC_SLS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_CALC_SLS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_CALC_SLS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_CALC_SLS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_CALC_SLS.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGT_CALC_SLS.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_CALC_SLS.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_CALC_SLS.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_CALC_SLS.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_CALC_SLS.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_CALC_SLS.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_CALC_SLS.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_CALC_SLS.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_CALC_SLS.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_CALC_SLS.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_CALC_SLS.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_CALC_SLS.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGT_CALC_SLS.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGT_CALC_SLS.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_CALC_SLS.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MGT_CALC_SLS.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MGT_CALC_SLS.SLS_DPT_CD IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MGT_CALC_SLS.SLS_USR_CD IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN MGT_CALC_SLS.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGT_CALC_SLS.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGT_CALC_SLS.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGT_CALC_SLS.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGT_CALC_SLS.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MGT_CALC_SLS.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MGT_CALC_SLS.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MGT_CALC_SLS.COST_SLS_CD1 IS '売上分類１ // #MA.COST_SLS_CD // Sales classification 1';


COMMENT ON COLUMN MGT_CALC_SLS.COST_SLS_CD2 IS '売上分類２ // #MA.COST_SLS_CD // Sales classification 2';


COMMENT ON COLUMN MGT_CALC_SLS.COST_SLS_CD3 IS '売上分類３ // #MA.COST_SLS_CD // Sales classification 3';


COMMENT ON COLUMN MGT_CALC_SLS.COST_SLS_CD4 IS '売上分類４ // #MA.COST_SLS_CD // Sales classification 4';


COMMENT ON COLUMN MGT_CALC_SLS.COST_SLS_CD5 IS '売上分類５ // #MA.COST_SLS_CD // Sales classification 5';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGT_CALC_SLS.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGT_CALC_SLS.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_CALC_SLS.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

