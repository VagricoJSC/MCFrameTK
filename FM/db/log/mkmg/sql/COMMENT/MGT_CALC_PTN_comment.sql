
COMMENT ON TABLE MGT_CALC_PTN IS '計算対象計算パタン情報 // (Calculation) Calculation pattern info.';


COMMENT ON COLUMN MGT_CALC_PTN.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_CALC_PTN.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_CALC_PTN.CALC_PTN_CD IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN MGT_CALC_PTN.MFG_PURC_TYP IS '製造購買区分 // #MA.MFG_PURC_TYP // Mfg. purchase type';


COMMENT ON COLUMN MGT_CALC_PTN.EVAL_TYP IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN MGT_CALC_PTN.DPT_TYP IS '部門計算区分 // #MA.UNIT_CALC_TYP // Dept. calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.LOT_TYP IS 'ロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Lot No. calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.SUBLOT_TYP IS 'サブロットＮＯ計算区分 // #MA.UNIT_CALC_TYP // Sublot No. calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO1_TYP IS '手配ＮＯ１計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 1 calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO2_TYP IS '手配ＮＯ２計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 2 calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO3_TYP IS '手配ＮＯ３計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 3 calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO4_TYP IS '手配ＮＯ４計算区分 // #MA.UNIT_CALC_TYP // SEIBAN No. 4 calculation type';


COMMENT ON COLUMN MGT_CALC_PTN.LOT_EXP_TYP IS 'ロットＮＯ展開区分 // #MA.EXP_SET_TYP // Lot No. explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.SUBLOT_EXP_TYP IS 'サブロットＮＯ展開区分 // #MA.EXP_SET_TYP // Sublot No. explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO1_EXP_TYP IS '手配ＮＯ１展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 1 explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO2_EXP_TYP IS '手配ＮＯ２展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 2 explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO3_EXP_TYP IS '手配ＮＯ３展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 3 explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.SNO4_EXP_TYP IS '手配ＮＯ４展開区分 // #MA.EXP_SET_TYP // SEIBAN No. 4 explosion type';


COMMENT ON COLUMN MGT_CALC_PTN.STD_RND_TYP IS '標準端数処理区分 // #MA.RND_TYP // Rounding type (Standard)';


COMMENT ON COLUMN MGT_CALC_PTN.STD_DEC_PLACE IS '標準小数部有効桁数 // #MA.DEC_PLACE // Standard number of decimal places';


COMMENT ON COLUMN MGT_CALC_PTN.AMT_RND_TYP IS '金額端数処理区分 // #MA.RND_TYP // Rounding type (Amount)';


COMMENT ON COLUMN MGT_CALC_PTN.AMT_DEC_PLACE IS '金額小数部有効桁数 // #MA.DEC_PLACE // Amount number of decimal places';


COMMENT ON COLUMN MGT_CALC_PTN.AVE_RND_TYP IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN MGT_CALC_PTN.AVE_DEC_PLACE IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';


COMMENT ON COLUMN MGT_CALC_PTN.ADJ_TYP IS '端数調整区分 // #MA.ADJ_TYP // Fraction adjustment type';


COMMENT ON COLUMN MGT_CALC_PTN.WIP_TYP IS '仕掛区分 // #MA.WIP_TYP // WIP type';


COMMENT ON COLUMN MGT_CALC_PTN.BD_AGG_TYP IS '内訳集計区分 // #MA.BD_AGG_TYP // Breakdown aggregated type';


COMMENT ON COLUMN MGT_CALC_PTN.MRGN_EXPNS_CD IS '調整費目ＣＤ // #MA.EXPNS_CD // Adjustment cost element cd.';


COMMENT ON COLUMN MGT_CALC_PTN.PURC_EXPNS_CD IS '購買費目ＣＤ // #MA.EXPNS_CD // Purchase cost element item cd.';


COMMENT ON COLUMN MGT_CALC_PTN.OUT_EXPNS_CD IS '外注費目ＣＤ // #MA.EXPNS_CD // Subcontract cost element cd.';


COMMENT ON COLUMN MGT_CALC_PTN.INPT_EXPNS_CD IS '投入費目ＣＤ // #MA.EXPNS_CD // Input cost element cd.';


COMMENT ON COLUMN MGT_CALC_PTN.SS_EXPNS_CD IS '自給費目ＣＤ // #MA.EXPNS_CD // Self supply cost element cd.';


COMMENT ON COLUMN MGT_CALC_PTN.PROV_EXPNS_CD IS '有償差額費目ＣＤ // #MA.EXPNS_CD // Cost element cd. for gain or loss of chargeable item';


COMMENT ON COLUMN MGT_CALC_PTN.EXP_ALLOC_TYP IS '展開割付区分 // #MA.EXP_ALLOC_TYP // Explosion allocation type';

