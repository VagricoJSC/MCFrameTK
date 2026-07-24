\encoding UTF-8

COMMENT ON VIEW mgvm_xrate IS '原価計算為替レートビュー // Cost calculation exchange rate view';


COMMENT ON COLUMN mgvm_xrate.fr_cur_cd IS '換算元通貨ＣＤ // #MA.CUR_CD // Exchange-from currency cd.';


COMMENT ON COLUMN mgvm_xrate.to_cur_cd IS '換算先通貨ＣＤ // #MA.CUR_CD // Exchange-to currency cd.';


COMMENT ON COLUMN mgvm_xrate.xrate IS '為替レート // #MA.MONEY // Exchange rate';

