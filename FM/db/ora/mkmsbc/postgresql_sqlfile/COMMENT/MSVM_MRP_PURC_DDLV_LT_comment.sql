\encoding UTF-8

COMMENT ON VIEW msvm_mrp_purc_ddlv_lt IS 'ＭＲＰ用仕入直送ＬＴマスタ // Direct delivery LT master for MRP';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.purc_lt IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN msvm_mrp_purc_ddlv_lt.purc_lt_add_qty IS '購入ＬＴ加算基準数量 // #MA.QTY // Purchase LT adds standard qty.';

