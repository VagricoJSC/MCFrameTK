\encoding UTF-8

COMMENT ON VIEW mgt_calc_sls IS '計算対象売上情報 // (Calculation) Sales';


COMMENT ON COLUMN mgt_calc_sls.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_sls.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_sls.act_sls_id IS '売上実績ＩＤ // #MG.ACT_SLS_ID // Sales result ID';


COMMENT ON COLUMN mgt_calc_sls.act_sls_id_sub IS '売上実績ＩＤ枝番 // #MG.ACT_SLS_ID_SUB // Sales result ID branch No.';


COMMENT ON COLUMN mgt_calc_sls.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_sls.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_calc_sls.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_calc_sls.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_calc_sls.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_sls.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_sls.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_sls.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_sls.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_calc_sls.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_calc_sls.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_calc_sls.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_calc_sls.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_calc_sls.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_calc_sls.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_calc_sls.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_calc_sls.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_calc_sls.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_calc_sls.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_calc_sls.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_calc_sls.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_calc_sls.cur_amt IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN mgt_calc_sls.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_calc_sls.cst_cd IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN mgt_calc_sls.dlv_cd IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN mgt_calc_sls.sls_dpt_cd IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN mgt_calc_sls.sls_usr_cd IS '担当者ＣＤ // #MA.USR_CD // PIC cd.';


COMMENT ON COLUMN mgt_calc_sls.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_calc_sls.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_calc_sls.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_calc_sls.stk_bp_cd IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN mgt_calc_sls.alc_dpt_cd IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN mgt_calc_sls.dest_cd1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN mgt_calc_sls.dest_cd2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN mgt_calc_sls.dest_cd3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN mgt_calc_sls.cost_sls_cd1 IS '売上分類１ // #MA.COST_SLS_CD // Sales classification 1';


COMMENT ON COLUMN mgt_calc_sls.cost_sls_cd2 IS '売上分類２ // #MA.COST_SLS_CD // Sales classification 2';


COMMENT ON COLUMN mgt_calc_sls.cost_sls_cd3 IS '売上分類３ // #MA.COST_SLS_CD // Sales classification 3';


COMMENT ON COLUMN mgt_calc_sls.cost_sls_cd4 IS '売上分類４ // #MA.COST_SLS_CD // Sales classification 4';


COMMENT ON COLUMN mgt_calc_sls.cost_sls_cd5 IS '売上分類５ // #MA.COST_SLS_CD // Sales classification 5';


COMMENT ON COLUMN mgt_calc_sls.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_calc_sls.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_calc_sls.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_calc_sls.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_calc_sls.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN mgt_calc_sls.rec_eval_typ IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN mgt_calc_sls.zero_effect_flg IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

