\encoding UTF-8

COMMENT ON VIEW mgvt_st_stk IS '原価計算月初在庫数ビュー // Cost calculation beginning inventory qty. view';


COMMENT ON COLUMN mgvt_st_stk.st_stk_key IS '月初在庫キー // #MG.ROW_NO // Beginning inventory key';


COMMENT ON COLUMN mgvt_st_stk.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgvt_st_stk.gr_dt IS '入庫日 // #MA.DT // GR date';


COMMENT ON COLUMN mgvt_st_stk.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgvt_st_stk.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgvt_st_stk.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgvt_st_stk.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgvt_st_stk.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgvt_st_stk.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgvt_st_stk.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgvt_st_stk.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgvt_st_stk.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgvt_st_stk.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgvt_st_stk.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgvt_st_stk.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgvt_st_stk.bp_cd IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN mgvt_st_stk.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgvt_st_stk.qty IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN mgvt_st_stk.repurc_obli_flg IS '買戻義務ＦＬＧ // #MA.FLG // Repurchase obligation flg.';

