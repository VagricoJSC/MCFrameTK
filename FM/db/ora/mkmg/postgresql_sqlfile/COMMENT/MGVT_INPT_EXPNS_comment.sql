\encoding UTF-8

COMMENT ON VIEW mgvt_inpt_expns IS '原価計算投入費目別原価ビュー // Cost calculation cost by input cost element view';


COMMENT ON COLUMN mgvt_inpt_expns.act_inpt_id IS '投入実績ＩＤ // #MG.ACT_INPT_ID // Input result ID';


COMMENT ON COLUMN mgvt_inpt_expns.act_inpt_id_sub IS '投入実績ＩＤ枝番 // #MG.ACT_INPT_ID_SUB // Input result ID branch No.';


COMMENT ON COLUMN mgvt_inpt_expns.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvt_inpt_expns.itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mgvt_inpt_expns.itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mgvt_inpt_expns.itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mgvt_inpt_expns.itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mgvt_inpt_expns.itm_ext IS '親品目拡張 // #MG.ITM_EXT // Parent item extension';


COMMENT ON COLUMN mgvt_inpt_expns.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_inpt_expns.amt IS '金額 // #MA.MONEY // Amount';

