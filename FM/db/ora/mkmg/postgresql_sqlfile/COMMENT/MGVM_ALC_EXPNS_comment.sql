\encoding UTF-8

COMMENT ON VIEW mgvm_alc_expns IS '原価計算費目配賦ビュー // Cost calculation cost element allocation view';


COMMENT ON COLUMN mgvm_alc_expns.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mgvm_alc_expns.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvm_alc_expns.self_oper_flg IS '自工程対象ＦＬＧ // #MA.FLG // For own operation flg.';


COMMENT ON COLUMN mgvm_alc_expns.inpt_itm_typ IS '投入対象区分 // #MA.INPT_ITM_TYP // Input type';


COMMENT ON COLUMN mgvm_alc_expns.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgvm_alc_expns.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_alc_expns.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_alc_expns.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_alc_expns.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';

