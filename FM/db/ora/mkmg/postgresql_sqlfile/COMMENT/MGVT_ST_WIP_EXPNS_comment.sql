\encoding UTF-8

COMMENT ON VIEW mgvt_st_wip_expns IS '原価計算月初仕掛費目別原価ビュー // Cost calculation beginning cost by WIP cost element view';


COMMENT ON COLUMN mgvt_st_wip_expns.st_wip_key IS '月初仕掛キー // #MG.ROW_NO // Beginning WIP key';


COMMENT ON COLUMN mgvt_st_wip_expns.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvt_st_wip_expns.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_st_wip_expns.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_st_wip_expns.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_st_wip_expns.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_st_wip_expns.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgvt_st_wip_expns.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_st_wip_expns.wip_amt IS '自レベル金額 // #MA.MONEY // Own level amount';


COMMENT ON COLUMN mgvt_st_wip_expns.inpt_amt IS '下位レベル金額 // #MA.MONEY // Lower level amount';

