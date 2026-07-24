\encoding UTF-8

COMMENT ON TABLE mgt_calc_io_expns_amt_all IS '計算対象入出庫費目別原価追加情報 // (Calculation) Add cost by GR/GI cost element info.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.act_io_id IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.act_io_id_sub IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.amt_add_typ IS '金額追加区分 // #MG.AMT_ADD_TYP // Amount addition type';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_calc_io_expns_amt_all.amt IS '金額 // #MA.MONEY // Amount';

