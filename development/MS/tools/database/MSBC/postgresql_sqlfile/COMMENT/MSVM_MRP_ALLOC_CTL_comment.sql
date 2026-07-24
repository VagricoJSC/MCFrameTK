\encoding UTF-8

COMMENT ON VIEW msvm_mrp_alloc_ctl IS 'ＭＲＰ用引当制御マスタ // Allocation control master for MRP';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.to_loc_cd IS '移動先場所ＣＤ // #MA.LOC_CD // Location cd. (Destination)';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.fr_loc_cd IS '移動元場所ＣＤ // #MA.LOC_CD // Source location cd.';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.prio IS '引当優先順 // #MA.ALLOC_PRIO // Allocation priority';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.xfr_lot_unit_qty IS '移送ロット単位数量 // #MA.QTY // Transport lot unit qty.';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.in_loc_flg IS '投入場所指定ＦＬＧ // #MA.FLG // Input location specification flg.';


COMMENT ON COLUMN msvm_mrp_alloc_ctl.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

