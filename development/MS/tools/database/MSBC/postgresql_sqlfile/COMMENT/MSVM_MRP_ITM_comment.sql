\encoding UTF-8

COMMENT ON VIEW msvm_mrp_itm IS 'ＭＲＰ用品目マスタ // Item master for MRP';


COMMENT ON COLUMN msvm_mrp_itm.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_itm.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_itm.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_itm.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_itm.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvm_mrp_itm.mrp_proc_typ IS 'ＭＲＰ処理区分 // #MA.MRP_PROC_TYP // MRP process type';


COMMENT ON COLUMN msvm_mrp_itm.unit_cd IS '単位ＣＤ // #MA.UNIT_CD // Unit cd.';


COMMENT ON COLUMN msvm_mrp_itm.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN msvm_mrp_itm.sch_flg IS 'スケジューラＦＬＧ // #MA.FLG // Scheduler flg.';


COMMENT ON COLUMN msvm_mrp_itm.rqmt_rstr_qty IS '所要抑制量 // #MA.QTY // Requirements restricted qty.';


COMMENT ON COLUMN msvm_mrp_itm.ship_term_cd IS '出荷条件ＣＤ // #MA.SHIP_TERM_CD // Shipping conditions cd.';


COMMENT ON COLUMN msvm_mrp_itm.lot_mng_typ IS 'ロット管理区分 // #MA.LOT_MNG_TYP // Lot management type';


COMMENT ON COLUMN msvm_mrp_itm.sublot_mng_typ IS 'サブロット管理区分 // #MA.SUBLOT_MNG_TYP // Sublot management type';


COMMENT ON COLUMN msvm_mrp_itm.sno1_mng_typ IS '手配ＮＯ１管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 1 management type';


COMMENT ON COLUMN msvm_mrp_itm.sno2_mng_typ IS '手配ＮＯ２管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 2 management type';


COMMENT ON COLUMN msvm_mrp_itm.sno3_mng_typ IS '手配ＮＯ３管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 3 management type';


COMMENT ON COLUMN msvm_mrp_itm.sno4_mng_typ IS '手配ＮＯ４管理区分 // #MA.SNO_MNG_TYP // SEIBAN No. 4 management type';


COMMENT ON COLUMN msvm_mrp_itm.order_stop_dt IS '所要・オーダ禁止日 // #MA.DT // Requirements/order prohibit date';


COMMENT ON COLUMN msvm_mrp_itm.release_flg IS 'リリースＦＬＧ // #MA.FLG // Release flg.';

