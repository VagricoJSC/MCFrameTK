\encoding UTF-8

COMMENT ON VIEW mgvm_itm_wk IS '原価計算品目工数ビュー // Cost calculation item man-hour view';


COMMENT ON COLUMN mgvm_itm_wk.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm_wk.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm_wk.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm_wk.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm_wk.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvm_itm_wk.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mgvm_itm_wk.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgvm_itm_wk.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgvm_itm_wk.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgvm_itm_wk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm_wk.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgvm_itm_wk.fxd_wk_cost IS '工数（固定） // #MA.WK_COST_QTY // Man-hour (Constant)';


COMMENT ON COLUMN mgvm_itm_wk.wk_cost IS '工数（数量依存） // #MA.WK_COST_QTY // Man-hour (Qty.-dependent)';


COMMENT ON COLUMN mgvm_itm_wk.min_wk_cost IS '最小工数 // #MA.WK_COST_QTY // Min. Man-hour';


COMMENT ON COLUMN mgvm_itm_wk.batch_wk_cost IS '刻み工数 // #MA.WK_COST_QTY // Increments of man-hour';

