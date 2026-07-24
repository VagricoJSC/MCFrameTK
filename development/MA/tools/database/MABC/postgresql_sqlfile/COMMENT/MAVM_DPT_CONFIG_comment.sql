\encoding UTF-8

COMMENT ON VIEW mavm_dpt_config IS '原価部門構成ビュー // Cost dept. structure view';


COMMENT ON COLUMN mavm_dpt_config.par_dpt_cd IS '親部門ＣＤ // #MA.COST_DPT_CD // Parent dept. cd.';


COMMENT ON COLUMN mavm_dpt_config.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mavm_dpt_config.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mavm_dpt_config.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mavm_dpt_config.oper_null_flg IS '工程無ＦＬＧ // #MA.FLG // No operation flg.';


COMMENT ON COLUMN mavm_dpt_config.term IS '期 // #MA.YM // Term';

