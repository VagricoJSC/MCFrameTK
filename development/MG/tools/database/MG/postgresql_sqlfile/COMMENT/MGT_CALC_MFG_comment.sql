\encoding UTF-8

COMMENT ON VIEW mgt_calc_mfg IS '計算対象製造情報 // (Calculation) Mfg. info.';


COMMENT ON COLUMN mgt_calc_mfg.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_mfg.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_mfg.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_mfg.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgt_calc_mfg.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgt_calc_mfg.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_mfg.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_mfg.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_mfg.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_mfg.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_calc_mfg.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_calc_mfg.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_calc_mfg.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgt_calc_mfg.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_calc_mfg.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_calc_mfg.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_calc_mfg.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_calc_mfg.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_calc_mfg.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_calc_mfg.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_calc_mfg.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_calc_mfg.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_calc_mfg.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgt_calc_mfg.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgt_calc_mfg.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgt_calc_mfg.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgt_calc_mfg.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_calc_mfg.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_calc_mfg.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgt_calc_mfg.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgt_calc_mfg.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgt_calc_mfg.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgt_calc_mfg.cur_amt IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN mgt_calc_mfg.mfg_per IS '製造進捗度 // #MA.RATE // Mfg. progress';


COMMENT ON COLUMN mgt_calc_mfg.mfg_cost_ratio IS '製造原価比率 // #MG.MFG_COST_RATIO // Mfg. cost ratio';


COMMENT ON COLUMN mgt_calc_mfg.alc_val1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN mgt_calc_mfg.alc_val2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN mgt_calc_mfg.alc_val3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN mgt_calc_mfg.alc_val4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN mgt_calc_mfg.alc_val5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';

