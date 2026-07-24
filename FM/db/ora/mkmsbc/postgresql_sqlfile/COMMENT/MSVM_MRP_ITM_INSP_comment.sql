\encoding UTF-8

COMMENT ON VIEW msvm_mrp_itm_insp IS 'ＭＲＰ用品目品管マスタ // Item inspection master for MRP';


COMMENT ON COLUMN msvm_mrp_itm_insp.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_itm_insp.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_itm_insp.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_itm_insp.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.from_site_cd IS '出荷元工場・物流倉庫ＣＤ // #MA.SITE_CD // Shipping point factory/distribution warehouse cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.to_site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvm_mrp_itm_insp.insp_lt IS '検査ＬＴ // #MA.LT // Inspection LT';


COMMENT ON COLUMN msvm_mrp_itm_insp.insp_offst IS '検査オフセット // #MA.OFFST // Inspection offset';


COMMENT ON COLUMN msvm_mrp_itm_insp.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN msvm_mrp_itm_insp.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN msvm_mrp_itm_insp.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

