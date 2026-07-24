\encoding UTF-8

COMMENT ON VIEW mavm_calc_grp_if_all IS '計算グループマスタ送信ＩＦ // Calculation group master export IF';


COMMENT ON COLUMN mavm_calc_grp_if_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm IS '計算グループ名 // #MA.CALC_GRP_NM // Calculation group name';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm_lcl1 IS '計算グループ名（ロケール１） // #MA.CALC_GRP_NM // Calculation group name (Locale 1)';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm_lcl2 IS '計算グループ名（ロケール２） // #MA.CALC_GRP_NM // Calculation group name (Locale 2)';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm_lcl3 IS '計算グループ名（ロケール３） // #MA.CALC_GRP_NM // Calculation group name (Locale 3)';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm_lcl4 IS '計算グループ名（ロケール４） // #MA.CALC_GRP_NM // Calculation group name (Locale 4)';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_grp_nm_lcl5 IS '計算グループ名（ロケール５） // #MA.CALC_GRP_NM // Calculation group name (Locale 5)';


COMMENT ON COLUMN mavm_calc_grp_if_all.cost_calc_typ IS '計算区分 // #MA.COST_CALC_TYP // Cost calculation type';


COMMENT ON COLUMN mavm_calc_grp_if_all.eval_typ IS '金額評価区分 // #MA.EVAL_TYP // Amount evaluation type';


COMMENT ON COLUMN mavm_calc_grp_if_all.max_mons IS '最大計算月数 // #MA.MAX_MONS // Max. calculation months';


COMMENT ON COLUMN mavm_calc_grp_if_all.calc_cnt IS '計算回数 // #MA.INT2 // Calculation count';


COMMENT ON COLUMN mavm_calc_grp_if_all.sa_typ IS '予実区分 // #MA.SA_TYP // Plan/Result type';


COMMENT ON COLUMN mavm_calc_grp_if_all.exp_calc_typ IS '展開計算区分 // #MA.EXP_CALC_TYP // BOM explosion calculation type';


COMMENT ON COLUMN mavm_calc_grp_if_all.pre_alc_calc_typ IS '一次配賦計算区分 // #MA.PRE_ALC_CALC_TYP // Departmental alloc. calculation type';


COMMENT ON COLUMN mavm_calc_grp_if_all.alc_calc_typ IS '配賦率計算区分 // #MA.ALC_CALC_TYP // Allocation rate calculation type';


COMMENT ON COLUMN mavm_calc_grp_if_all.memo1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN mavm_calc_grp_if_all.memo2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN mavm_calc_grp_if_all.memo3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';

