\encoding UTF-8

COMMENT ON VIEW mgvm_itm_prov IS '原価計算品目支給単価ビュー // Cost calculation item supply unit price view';


COMMENT ON COLUMN mgvm_itm_prov.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm_prov.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm_prov.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm_prov.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm_prov.prsppl_cd IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mgvm_itm_prov.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm_prov.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mgvm_itm_prov.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgvm_itm_prov.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvm_itm_prov.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgvm_itm_prov.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';

