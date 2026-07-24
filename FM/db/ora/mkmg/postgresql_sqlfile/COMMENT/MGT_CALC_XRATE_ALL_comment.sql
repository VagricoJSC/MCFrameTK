\encoding UTF-8

COMMENT ON TABLE mgt_calc_xrate_all IS '計算対象為替レート情報 // (Calculation) Exchange rate';


COMMENT ON COLUMN mgt_calc_xrate_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_xrate_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_xrate_all.fr_cur_cd IS '換算元通貨ＣＤ // #MA.CUR_CD // Exchange-from currency cd.';


COMMENT ON COLUMN mgt_calc_xrate_all.to_cur_cd IS '換算先通貨ＣＤ // #MA.CUR_CD // Exchange-to currency cd.';


COMMENT ON COLUMN mgt_calc_xrate_all.xrate_cd IS '為替レートＣＤ // #MA.XRATE_CD // Exchange rate cd.';


COMMENT ON COLUMN mgt_calc_xrate_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_calc_xrate_all.xrate IS '為替レート // #MA.MONEY // Exchange rate';

