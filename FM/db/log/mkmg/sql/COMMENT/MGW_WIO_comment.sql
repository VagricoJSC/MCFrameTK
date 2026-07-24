
COMMENT ON TABLE MGW_WIO IS '入出庫実績集計ワーク // GR/GI result aggregated work';


COMMENT ON COLUMN MGW_WIO.ACT_IO_ID IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN MGW_WIO.ACT_IO_ID_SUB IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN MGW_WIO.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_WIO.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_WIO.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGW_WIO.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGW_WIO.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGW_WIO.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_WIO.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_WIO.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_WIO.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_WIO.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGW_WIO.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGW_WIO.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGW_WIO.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGW_WIO.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGW_WIO.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGW_WIO.COST_IO_TYP IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN MGW_WIO.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGW_WIO.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGW_WIO.OTHER_WG_CD IS '相手ワーキンググループＣＤ // #MA.WG_CD // Counterpart WG cd.';


COMMENT ON COLUMN MGW_WIO.OTHER_DPT_CD IS '相手部門ＣＤ // #MA.COST_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN MGW_WIO.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGW_WIO.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGW_WIO.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGW_WIO.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGW_WIO.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGW_WIO.TRD_CUR_CD IS '取引通貨ＣＤ // #MA.CUR_CD // Transaction currency cd.';


COMMENT ON COLUMN MGW_WIO.TRD_CUR_AMT IS '取引通貨金額 // #MA.MONEY // Amount (Transaction currency)';


COMMENT ON COLUMN MGW_WIO.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGW_WIO.TRD_GRP IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN MGW_WIO.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGW_WIO.CALC_SEQ IS '計算順序 // #MA.INT3 // Calculation sequence';


COMMENT ON COLUMN MGW_WIO.OTHER_CALC_SEQ IS '相手計算順序 // #MA.INT3 // Counterpart calculation sequence';


COMMENT ON COLUMN MGW_WIO.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

