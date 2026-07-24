\encoding UTF-8

COMMENT ON VIEW mgvm_alc_wk IS '原価計算工数配賦ビュー // Cost calculation man-hour allocation view';


COMMENT ON COLUMN mgvm_alc_wk.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mgvm_alc_wk.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgvm_alc_wk.tr_alc_ac_cd IS '振替配賦科目ＣＤ // #MA.ALC_AC_CD // Transfer allocation account cd.';


COMMENT ON COLUMN mgvm_alc_wk.tr_alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mgvm_alc_wk.tr_expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';

