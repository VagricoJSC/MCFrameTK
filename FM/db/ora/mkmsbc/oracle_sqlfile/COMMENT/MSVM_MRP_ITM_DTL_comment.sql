
COMMENT ON TABLE MSVM_MRP_ITM_DTL IS 'ＭＲＰ用品目詳細マスタ // Item details master for MRP';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SPPL_CAL_CD IS '発注先カレンダＣＤ // #MA.CAL_CD // Supplier calendar cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_SITE_CD IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_LG_GRP_CD IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_LG_CAL_CD IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.RQST_WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ORDER_RATIO IS 'オーダ比率 // #MA.ORDER_RATIO // Order ratio';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MFG_LT IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MFG_LT_ADD_QTY IS '製造ＬＴ加算基準数量 // #MA.QTY // Mfg. LT adds base qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.PURC_LT IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.PURC_LT_ADD_QTY IS '購入ＬＴ加算基準数量 // #MA.QTY // Purchase LT adds standard qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ACCPT_INSP_LT IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.BUF_LT IS '安全ＬＴ // #MA.LT // Safety LT';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SZ_DAY_WEEK_TYP IS '曜日まとめ区分 // #MA.DAY_WEEK_TYP // Aggregation (by day of week) type';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SZ_WEEK IS '曜日まとめ期間（週） // #MA.SZ_WEEK // Aggregation (by day of week) period (Week)';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.LOT_SZ_PD IS 'ロットまとめ期間（日） // #MA.LOT_SZ_PD // Lot sizing period (Days)';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MIN_LOT_QTY IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.BATCH_LOT_QTY IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MAX_LOT_QTY IS '最大ロット数量 // #MA.QTY // Max. lot qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.YIELD_SCHD_QTY IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MFG_INST_QTY IS '製造指図数量 // #MA.QTY // Mfg. order qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.FXD_RQMT_QTY IS '固定必要数量 // #MA.QTY // Fixed required qty.';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.PRIO IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.MAX_ORDER IS '最大オーダ件数 // #MA.INT // Number of max. order';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ORD_FIX_PD IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN MSVM_MRP_ITM_DTL.ORDER_STOP_DT IS '所要・オーダ禁止日 // #MA.DT // Requirements/order prohibit date';

