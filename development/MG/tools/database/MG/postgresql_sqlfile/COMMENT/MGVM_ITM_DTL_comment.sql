\encoding UTF-8

COMMENT ON VIEW mgvm_itm_dtl IS '原価計算品目詳細ビュー // Cost calculation item details view';


COMMENT ON COLUMN mgvm_itm_dtl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvm_itm_dtl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvm_itm_dtl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvm_itm_dtl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvm_itm_dtl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvm_itm_dtl.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgvm_itm_dtl.rqst_wg_cd IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN mgvm_itm_dtl.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvm_itm_dtl.cost_ratio IS '原価比率 // #MA.COST_RATIO // Cost ratio';


COMMENT ON COLUMN mgvm_itm_dtl.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mgvm_itm_dtl.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mgvm_itm_dtl.min_lot_qty IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN mgvm_itm_dtl.batch_lot_qty IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN mgvm_itm_dtl.fxd_lot_qty IS '固定基準ロット数量 // #MA.QTY // Constant reference lot qty.';


COMMENT ON COLUMN mgvm_itm_dtl.fxd_yield_qty IS '固定歩留数量 // #MA.QTY // Constant yield qty.';


COMMENT ON COLUMN mgvm_itm_dtl.nmr_qty IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN mgvm_itm_dtl.dnm_qty IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN mgvm_itm_dtl.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgvm_itm_dtl.exp_dpt_cd IS '展開部門ＣＤ // #MA.COST_DPT_CD // Exploded dept. cd.';


COMMENT ON COLUMN mgvm_itm_dtl.exp_prio IS '展開優先順位 // #MG.EXP_PRIO // Explosion priority';


COMMENT ON COLUMN mgvm_itm_dtl.max_qty IS '月次最大数量 // #MA.QTY // Monthly max. qty.';


COMMENT ON COLUMN mgvm_itm_dtl.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgvm_itm_dtl.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgvm_itm_dtl.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgvm_itm_dtl.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgvm_itm_dtl.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';

