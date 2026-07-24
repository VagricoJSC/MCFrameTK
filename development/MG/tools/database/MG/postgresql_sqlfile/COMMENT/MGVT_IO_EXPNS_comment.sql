\encoding UTF-8

COMMENT ON VIEW mgvt_io_expns IS '原価計算入出庫費目別原価ビュー // Cost calculation cost by GR/GI cost element view';


COMMENT ON COLUMN mgvt_io_expns.act_io_id IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN mgvt_io_expns.act_io_id_sub IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN mgvt_io_expns.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvt_io_expns.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_io_expns.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_io_expns.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_io_expns.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_io_expns.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgvt_io_expns.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_io_expns.amt IS '金額 // #MA.MONEY // Amount';

