\encoding UTF-8

COMMENT ON VIEW mgt_calc_itm_prov IS '計算対象品目支給単価情報 // (Calculation) Item supply unit price info.';


COMMENT ON COLUMN mgt_calc_itm_prov.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_itm_prov.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_itm_prov.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_itm_prov.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_itm_prov.prsppl_cd IS '支給先ＣＤ // #MA.BP_CD // Subcontractor cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.prov_typ IS '支給区分 // #MA.PROV_TYP // Supply type';


COMMENT ON COLUMN mgt_calc_itm_prov.base_qty IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN mgt_calc_itm_prov.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.upri IS '単価 // #MA.MONEY // Unit price';


COMMENT ON COLUMN mgt_calc_itm_prov.base_cur_upri IS '基準通貨単価 // #MA.MONEY // Unit price (Base currency)';


COMMENT ON COLUMN mgt_calc_itm_prov.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_calc_itm_prov.rmrks IS '備考 // #MG.CALC_ITM_PROV_RMRKS // Remarks';


COMMENT ON COLUMN mgt_calc_itm_prov.sub_char1 IS '予備１ // #MG.CALC_ITM_PROV_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_calc_itm_prov.sub_char2 IS '予備２ // #MG.CALC_ITM_PROV_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_calc_itm_prov.sub_char3 IS '予備３ // #MG.CALC_ITM_PROV_SUB_CHAR3 // Spare 3';

