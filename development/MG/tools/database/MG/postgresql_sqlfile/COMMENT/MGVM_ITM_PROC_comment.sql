\encoding UTF-8

COMMENT ON VIEW mgvm_itm_proc IS '原価計算品目加工単価ビュー // Cost calculation item subcontracting unit price view';


COMMENT ON COLUMN mgvm_itm_proc.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm_proc.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm_proc.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm_proc.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm_proc.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgvm_itm_proc.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm_proc.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgvm_itm_proc.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvm_itm_proc.outsrc_upri_typ IS '外注単価区分 // #MA.OUTSRC_UPRI_TYP // Subcontracting unit price type';


COMMENT ON COLUMN mgvm_itm_proc.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgvm_itm_proc.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mgvm_itm_proc.cost_ratio IS '原価比率 // #MA.COST_RATIO // Cost ratio';

