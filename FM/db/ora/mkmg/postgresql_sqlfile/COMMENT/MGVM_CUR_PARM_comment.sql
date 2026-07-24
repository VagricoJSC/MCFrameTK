\encoding UTF-8

COMMENT ON VIEW mgvm_cur_parm IS '原価計算通貨パラメータビュー // Cost calculation currency parameter view';


COMMENT ON COLUMN mgvm_cur_parm.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvm_cur_parm.amt_rnd_typ IS '金額端数処理区分 // #MA.RND_TYP // Rounding type (Amount)';


COMMENT ON COLUMN mgvm_cur_parm.amt_dec_place IS '金額小数部有効桁数 // #MA.DEC_PLACE // Amount number of decimal places';


COMMENT ON COLUMN mgvm_cur_parm.ave_rnd_typ IS '単価端数処理区分 // #MA.RND_TYP // Rounding type (Unit price)';


COMMENT ON COLUMN mgvm_cur_parm.ave_dec_place IS '単価小数部有効桁数 // #MA.DEC_PLACE // Unit price number of decimal places';

