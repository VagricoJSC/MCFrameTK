\encoding UTF-8

COMMENT ON VIEW msvm_mrp_itm_oper IS 'ＭＲＰ用品目工程マスタ // Item operation master for MRP';


COMMENT ON COLUMN msvm_mrp_itm_oper.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_itm_oper.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_itm_oper.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_itm_oper.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_itm_oper.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN msvm_mrp_itm_oper.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN msvm_mrp_itm_oper.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN msvm_mrp_itm_oper.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_lt IS '工程ＬＴ // #MA.LT // Operation LT';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_lt_add_qty IS '工程ＬＴ加算基準数量 // #MA.QTY // Operation LT add base qty.';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_offst_typ IS '工程オフセット区分 // #MA.OFFST_TYP // Operation offset type';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_offst IS '工程オフセット // #MA.OFFST // Operation offset';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_offst_add_qty IS '工程オフセット加算基準数量 // #MA.QTY // Operation offset add base qty.';


COMMENT ON COLUMN msvm_mrp_itm_oper.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN msvm_mrp_itm_oper.oper_loc_cd IS '工程場所ＣＤ // #MA.LOC_CD // Operation location cd.';


COMMENT ON COLUMN msvm_mrp_itm_oper.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvm_mrp_itm_oper.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvm_mrp_itm_oper.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvm_mrp_itm_oper.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvm_mrp_itm_oper.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

