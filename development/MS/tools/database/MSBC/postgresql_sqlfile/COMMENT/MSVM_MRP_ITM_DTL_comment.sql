\encoding UTF-8

COMMENT ON VIEW msvm_mrp_itm_dtl IS 'ＭＲＰ用品目詳細マスタ // Item details master for MRP';


COMMENT ON COLUMN msvm_mrp_itm_dtl.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvm_mrp_itm_dtl.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvm_mrp_itm_dtl.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvm_mrp_itm_dtl.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN msvm_mrp_itm_dtl.st_dt IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sppl_cal_cd IS '発注先カレンダＣＤ // #MA.CAL_CD // Supplier calendar cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_site_cd IS '工場・物流倉庫ＣＤ // #MA.SITE_CD // Factory/Distribution warehouse cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_lg_grp_cd IS '物流グループＣＤ // #MA.LG_GRP_CD // Distribution group cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_lg_cal_cd IS 'カレンダＣＤ // #MA.CAL_CD // Calendar cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.rqst_wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.end_dt IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN msvm_mrp_itm_dtl.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN msvm_mrp_itm_dtl.order_ratio IS 'オーダ比率 // #MA.ORDER_RATIO // Order ratio';


COMMENT ON COLUMN msvm_mrp_itm_dtl.mfg_lt IS '製造ＬＴ // #MA.LT // Mfg. LT';


COMMENT ON COLUMN msvm_mrp_itm_dtl.mfg_lt_add_qty IS '製造ＬＴ加算基準数量 // #MA.QTY // Mfg. LT adds base qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.purc_lt IS '購入ＬＴ // #MA.LT // Purchase LT';


COMMENT ON COLUMN msvm_mrp_itm_dtl.purc_lt_add_qty IS '購入ＬＴ加算基準数量 // #MA.QTY // Purchase LT adds standard qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.accpt_insp_lt IS '検収ＬＴ // #MA.LT // Acceptance LT';


COMMENT ON COLUMN msvm_mrp_itm_dtl.buf_lt IS '安全ＬＴ // #MA.LT // Safety LT';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sz_day_week_typ IS '曜日まとめ区分 // #MA.DAY_WEEK_TYP // Aggregation (by day of week) type';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sz_week IS '曜日まとめ期間（週） // #MA.SZ_WEEK // Aggregation (by day of week) period (Week)';


COMMENT ON COLUMN msvm_mrp_itm_dtl.lot_sz_pd IS 'ロットまとめ期間（日） // #MA.LOT_SZ_PD // Lot sizing period (Days)';


COMMENT ON COLUMN msvm_mrp_itm_dtl.min_lot_qty IS '最小ロット数量 // #MA.QTY // Min. lot qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.batch_lot_qty IS '刻みロット数量 // #MA.QTY // Increments lot qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.max_lot_qty IS '最大ロット数量 // #MA.QTY // Max. lot qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.yield_schd_qty IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.mfg_inst_qty IS '製造指図数量 // #MA.QTY // Mfg. order qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.fxd_rqmt_qty IS '固定必要数量 // #MA.QTY // Fixed required qty.';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvm_mrp_itm_dtl.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvm_mrp_itm_dtl.prio IS '優先順 // #MA.INT // Priority';


COMMENT ON COLUMN msvm_mrp_itm_dtl.max_order IS '最大オーダ件数 // #MA.INT // Number of max. order';


COMMENT ON COLUMN msvm_mrp_itm_dtl.ord_fix_pd IS 'オーダ自動確定期間（日） // #MA.ORD_FIX_PD // Order auto-firming period (Date)';


COMMENT ON COLUMN msvm_mrp_itm_dtl.order_stop_dt IS '所要・オーダ禁止日 // #MA.DT // Requirements/order prohibit date';

