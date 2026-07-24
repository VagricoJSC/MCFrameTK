\encoding UTF-8

COMMENT ON VIEW mgvt_other_wk IS '原価計算その他工数ビュー // Cost calculation other man-hour view';


COMMENT ON COLUMN mgvt_other_wk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_other_wk.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgvt_other_wk.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgvt_other_wk.dpt_cd IS '部門ＣＤ // #MA.COST_DPT_CD // Dept. cd.';


COMMENT ON COLUMN mgvt_other_wk.ctg_cd IS '品群ＣＤ // #MA.COST_CTG_CD // Item category cd.';


COMMENT ON COLUMN mgvt_other_wk.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvt_other_wk.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgvt_other_wk.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_other_wk.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_other_wk.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgvt_other_wk.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgvt_other_wk.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgvt_other_wk.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgvt_other_wk.wk_cost_cd IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN mgvt_other_wk.wk_rsn_cd IS '工数理由ＣＤ // #MA.WK_RSN_CD // Man-hour reason cd.';


COMMENT ON COLUMN mgvt_other_wk.wk_cost IS '工数 // #MA.WK_COST_QTY // Man-hour';


COMMENT ON COLUMN mgvt_other_wk.alc_ptn_cd IS '計算パタンＣＤ // #MA.CALC_PTN_CD // Calculation pattern cd.';

