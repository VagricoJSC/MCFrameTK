\encoding UTF-8

COMMENT ON VIEW mgvm_itm_sls IS '原価計算品目販売単価ビュー // Cost calculation item sales unit price view';


COMMENT ON COLUMN mgvm_itm_sls.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm_sls.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm_sls.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm_sls.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm_sls.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgvm_itm_sls.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgvm_itm_sls.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgvm_itm_sls.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgvm_itm_sls.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgvm_itm_sls.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgvm_itm_sls.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm_sls.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgvm_itm_sls.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvm_itm_sls.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgvm_itm_sls.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mgvm_itm_sls.prio IS '優先順位 // #MG.SLS_UNIT_PRIO // Priority';


COMMENT ON COLUMN mgvm_itm_sls.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgvm_itm_sls.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgvm_itm_sls.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgvm_itm_sls.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgvm_itm_sls.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';

