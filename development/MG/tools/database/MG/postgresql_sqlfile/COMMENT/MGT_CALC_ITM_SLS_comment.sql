\encoding UTF-8

COMMENT ON VIEW mgt_calc_itm_sls IS '計算対象品目販売単価情報 // (Calculation) Item sales unit price';


COMMENT ON COLUMN mgt_calc_itm_sls.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_itm_sls.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_itm_sls.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_itm_sls.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_itm_sls.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgt_calc_itm_sls.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgt_calc_itm_sls.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgt_calc_itm_sls.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgt_calc_itm_sls.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgt_calc_itm_sls.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mgt_calc_itm_sls.prio IS '優先順位 // #MG.SLS_UNIT_PRIO // Priority';


COMMENT ON COLUMN mgt_calc_itm_sls.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_calc_itm_sls.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_calc_itm_sls.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_calc_itm_sls.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_calc_itm_sls.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_calc_itm_sls.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_calc_itm_sls.rmrks IS '備考 // #MG.CALC_ITM_SLS_RMRKS // Remarks';


COMMENT ON COLUMN mgt_calc_itm_sls.sub_char1 IS '予備１ // #MG.CALC_ITM_SLS_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_calc_itm_sls.sub_char2 IS '予備２ // #MG.CALC_ITM_SLS_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_calc_itm_sls.sub_char3 IS '予備３ // #MG.CALC_ITM_SLS_SUB_CHAR3 // Spare 3';

