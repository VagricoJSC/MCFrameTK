\encoding UTF-8

COMMENT ON VIEW msvt_mrp_itm_lnk_fix IS 'ＭＲＰ用品目オーダ順序確定情報 // Item order sequence firm info. for MRP';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.par_itm_ord_no IS '親品目オーダＮＯ // #MA.ITM_ORD_NO // Parent item order No.';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.par_oper_ord_no IS '親工程オーダＮＯ // #MA.OPER_ORD_NO // Parent operation order No.';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_itm_lnk_fix.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

