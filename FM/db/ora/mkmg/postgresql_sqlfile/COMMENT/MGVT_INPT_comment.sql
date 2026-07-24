\encoding UTF-8

COMMENT ON VIEW mgvt_inpt IS '原価計算投入ビュー // Cost calculation input view';


COMMENT ON COLUMN mgvt_inpt.act_inpt_id IS '投入実績ＩＤ // #MG.ACT_INPT_ID // Input result ID';


COMMENT ON COLUMN mgvt_inpt.act_inpt_id_sub IS '投入実績ＩＤ枝番 // #MG.ACT_INPT_ID_SUB // Input result ID branch No.';


COMMENT ON COLUMN mgvt_inpt.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_inpt.ym IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN mgvt_inpt.ac_dt IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN mgvt_inpt.par_itm_cd IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN mgvt_inpt.par_itm_sub1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN mgvt_inpt.par_itm_sub2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN mgvt_inpt.par_itm_sub3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN mgvt_inpt.par_itm_ext IS '親品目拡張 // #MG.ITM_EXT // Parent item extension';


COMMENT ON COLUMN mgvt_inpt.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgvt_inpt.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgvt_inpt.oper_act_no IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN mgvt_inpt.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgvt_inpt.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgvt_inpt.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgvt_inpt.str_ln_cd IS 'ラインＣＤ // #MA.STR_LN_CD // Line cd.';


COMMENT ON COLUMN mgvt_inpt.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgvt_inpt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_inpt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_inpt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_inpt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_inpt.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgvt_inpt.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_inpt.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_inpt.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgvt_inpt.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgvt_inpt.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgvt_inpt.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgvt_inpt.ac_slip_typ IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN mgvt_inpt.ac_rsn_cd IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN mgvt_inpt.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgvt_inpt.stk_bp_cd IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN mgvt_inpt.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgvt_inpt.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgvt_inpt.amt IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN mgvt_inpt.cur_cd IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN mgvt_inpt.cur_amt IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN mgvt_inpt.xrate IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN mgvt_inpt.rec_eval_typ IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN mgvt_inpt.expns_cd IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN mgvt_inpt.eval_loop_flg IS '個別評価ループＦＬＧ // #MA.FLG // Individual evaluation loop flg.';


COMMENT ON COLUMN mgvt_inpt.zero_effect_flg IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

