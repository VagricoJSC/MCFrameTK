\encoding UTF-8

COMMENT ON TABLE mgt_calc_bom_all IS '計算対象ＢＯＭ情報 // (Calculation) BOM';


COMMENT ON COLUMN mgt_calc_bom_all.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_bom_all.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_bom_all.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mgt_calc_bom_all.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mgt_calc_bom_all.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mgt_calc_bom_all.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mgt_calc_bom_all.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN mgt_calc_bom_all.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_calc_bom_all.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_calc_bom_all.chd_itm_cd IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN mgt_calc_bom_all.chd_itm_sub1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN mgt_calc_bom_all.chd_itm_sub2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN mgt_calc_bom_all.chd_itm_sub3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN mgt_calc_bom_all.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN mgt_calc_bom_all.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_calc_bom_all.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_bom_all.co_cd IS '会社ＣＤ // #MA.CO_CD // Company cd.';


COMMENT ON COLUMN mgt_calc_bom_all.disp_seq IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN mgt_calc_bom_all.par_rqmt_qty IS '親必要数量 // #MA.QTY // Parent required qty.';


COMMENT ON COLUMN mgt_calc_bom_all.chd_rqmt_qty IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN mgt_calc_bom_all.chd_base_qty IS '子基準数量 // #MA.QTY // Child base qty.';


COMMENT ON COLUMN mgt_calc_bom_all.fxd_chd_rqmt_qty IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN mgt_calc_bom_all.chd_min_qty IS '子最小必要数量 // #MA.QTY // Child min. required qty.';


COMMENT ON COLUMN mgt_calc_bom_all.chd_batch_qty IS '子刻み必要数量 // #MA.QTY // Increments of child required qty.';


COMMENT ON COLUMN mgt_calc_bom_all.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN mgt_calc_bom_all.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_calc_bom_all.rmrks IS '備考 // #MG.CALC_BOM_RMRKS // Remarks';


COMMENT ON COLUMN mgt_calc_bom_all.sub_char1 IS '予備１ // #MG.CALC_BOM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_calc_bom_all.sub_char2 IS '予備２ // #MG.CALC_BOM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_calc_bom_all.sub_char3 IS '予備３ // #MG.CALC_BOM_SUB_CHAR3 // Spare 3';

