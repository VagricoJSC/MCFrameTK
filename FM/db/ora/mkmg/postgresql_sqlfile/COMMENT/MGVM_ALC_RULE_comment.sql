\encoding UTF-8

COMMENT ON VIEW mgvm_alc_rule IS '原価計算配賦方法ビュー // Cost calculation allocation basis view';


COMMENT ON COLUMN mgvm_alc_rule.alc_ptn_cd IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN mgvm_alc_rule.alc_tgt_typ IS '配賦対象区分 // #MA.ALC_TGT_TYP // Allocation target type';


COMMENT ON COLUMN mgvm_alc_rule.alc_rule_typ IS '配賦方法区分 // #MA.ALC_RULE_TYP // Allocation basis type';


COMMENT ON COLUMN mgvm_alc_rule.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvm_alc_rule.diff_calc_typ IS '差異計算区分 // #MA.DIFF_CALC_TYP // Variance calculation type';


COMMENT ON COLUMN mgvm_alc_rule.rnd_typ IS '端数処理区分 // #MA.RND_TYP // Rounding type';


COMMENT ON COLUMN mgvm_alc_rule.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mgvm_alc_rule.alc_coef_cd IS '配賦係数ＣＤ // #MA.ALC_COEF_CD // Allocation coefficient cd.';


COMMENT ON COLUMN mgvm_alc_rule.coef_limit_flg IS '配賦係数限定ＦＬＧ // #MA.FLG // Allocation coefficient limit flg.';


COMMENT ON COLUMN mgvm_alc_rule.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgvm_alc_rule.non_minus_flg IS 'マイナス対象外ＦＬＧ // #MA.FLG // Not for minus flg.';


COMMENT ON COLUMN mgvm_alc_rule.non_os_flg IS '外注対象外ＦＬＧ // #MA.FLG // Not for subcontracting flg.';


COMMENT ON COLUMN mgvm_alc_rule.scst_alc_flg IS '納品先配賦ＦＬＧ // #MA.FLG // Delivery destination allocation flg.';


COMMENT ON COLUMN mgvm_alc_rule.std_alc_flg IS '標準配賦ＦＬＧ // #MA.FLG // Standard allocation flg.';

