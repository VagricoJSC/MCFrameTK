
COMMENT ON TABLE MSVM_MRP_ALLOC_CTL IS 'ＭＲＰ用引当制御マスタ // Allocation control master for MRP';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.TO_LOC_CD IS '移動先場所ＣＤ // #MA.LOC_CD // Location cd. (Destination)';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.FR_LOC_CD IS '移動元場所ＣＤ // #MA.LOC_CD // Source location cd.';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.PRIO IS '引当優先順 // #MA.ALLOC_PRIO // Allocation priority';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.XFR_LOT_UNIT_QTY IS '移送ロット単位数量 // #MA.QTY // Transport lot unit qty.';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.IN_LOC_FLG IS '投入場所指定ＦＬＧ // #MA.FLG // Input location specification flg.';


COMMENT ON COLUMN MSVM_MRP_ALLOC_CTL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

