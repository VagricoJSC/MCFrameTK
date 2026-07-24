\encoding UTF-8

COMMENT ON VIEW msvt_mrp_minus_stk_gi IS 'ＭＲＰ用マイナス在庫出庫予定情報 // Negative inventory issue schedule info. for MRP';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.first_gr_dt IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.lot_seq IS 'ロットシーケンス // #MA.LOT_SEQ // Lot sequence';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.lmt_dt IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN msvt_mrp_minus_stk_gi.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

