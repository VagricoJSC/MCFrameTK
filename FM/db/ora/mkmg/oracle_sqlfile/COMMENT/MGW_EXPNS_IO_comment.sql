
COMMENT ON TABLE MGW_EXPNS_IO IS '入出庫実績費目別原価作成ワーク // Create cost by GR/GI cost element work';


COMMENT ON COLUMN MGW_EXPNS_IO.ACT_IO_ID IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN MGW_EXPNS_IO.ACT_IO_ID_SUB IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN MGW_EXPNS_IO.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGW_EXPNS_IO.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGW_EXPNS_IO.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_EXPNS_IO.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_EXPNS_IO.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_EXPNS_IO.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_EXPNS_IO.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGW_EXPNS_IO.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGW_EXPNS_IO.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGW_EXPNS_IO.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGW_EXPNS_IO.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGW_EXPNS_IO.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGW_EXPNS_IO.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGW_EXPNS_IO.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGW_EXPNS_IO.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGW_EXPNS_IO.AMT_SET_TYP IS '金額設定区分 // #MA.AMT_SET_TYP // Amount setting type';


COMMENT ON COLUMN MGW_EXPNS_IO.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGW_EXPNS_IO.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

