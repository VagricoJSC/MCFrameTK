\encoding UTF-8

COMMENT ON VIEW mgvt_arg IS '原価計算設定情報ビュー // Calculation setting info. view';


COMMENT ON COLUMN mgvt_arg.sa_typ IS '予実区分 // #MA.SA_TYP // Plan/Result type';


COMMENT ON COLUMN mgvt_arg.st_ym IS '対象期間先頭年月 // #MA.YM // First month of the term';


COMMENT ON COLUMN mgvt_arg.end_ym IS '対象期間末尾年月 // #MA.YM // Last month of the term';


COMMENT ON COLUMN mgvt_arg.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mgvt_arg.exp_calc_typ IS '展開計算区分 // #MA.EXP_CALC_TYP // BOM explosion calculation type';


COMMENT ON COLUMN mgvt_arg.inpt_calc_flg IS '投入計算ＦＬＧ // #MA.FLG // Input calculation flg.';


COMMENT ON COLUMN mgvt_arg.wk_calc_flg IS '工数計算ＦＬＧ // #MA.FLG // Man-hour calculation flg.';


COMMENT ON COLUMN mgvt_arg.prov_calc_flg IS '支給計算ＦＬＧ // #MA.FLG // Supply calculation flg.';


COMMENT ON COLUMN mgvt_arg.xfr_calc_flg IS '移動計算ＦＬＧ // #MA.FLG // Movement calculation flg.';


COMMENT ON COLUMN mgvt_arg.alc_calc_typ IS '配賦率計算区分 // #MA.ALC_CALC_TYP // Allocation rate calculation type';


COMMENT ON COLUMN mgvt_arg.cost_calc_typ IS '原価計算区分 // #MA.COST_CALC_TYP // Calculation type';

