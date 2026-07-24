\encoding UTF-8

COMMENT ON VIEW msvm_mrp_stk_rpl IS 'ＭＲＰ用在庫補充マスタ // Inventory replenishment master for MRP';


COMMENT ON COLUMN msvm_mrp_stk_rpl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_stk_rpl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_stk_rpl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_stk_rpl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_stk_rpl.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvm_mrp_stk_rpl.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN msvm_mrp_stk_rpl.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN msvm_mrp_stk_rpl.buf_qty IS '安全在庫数量 // #MA.QTY // Fluctuation inventory qty.';


COMMENT ON COLUMN msvm_mrp_stk_rpl.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

