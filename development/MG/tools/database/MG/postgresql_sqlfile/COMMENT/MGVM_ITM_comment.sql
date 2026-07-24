\encoding UTF-8

COMMENT ON VIEW mgvm_itm IS '原価計算品目ビュー // Calculation item view';


COMMENT ON COLUMN mgvm_itm.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgvm_itm.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm.itm_typ IS '品目区分 // #MA.ITM_TYP // Item type';


COMMENT ON COLUMN mgvm_itm.calc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';


COMMENT ON COLUMN mgvm_itm.std_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgvm_itm.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mgvm_itm.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';

