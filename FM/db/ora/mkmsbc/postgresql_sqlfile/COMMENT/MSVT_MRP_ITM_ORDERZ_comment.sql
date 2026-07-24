\encoding UTF-8

COMMENT ON VIEW msvt_mrp_itm_orderz IS 'ＭＲＰ用品目オーダ情報 // Item order info. for MRP';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_ord_typ IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_ord_sts_typ IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_itm_orderz.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_itm_orderz.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.bom_ptn IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN msvt_mrp_itm_orderz.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN msvt_mrp_itm_orderz.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.maker_cd IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.rqst_wg_cd IS '依頼先ワーキンググループＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.yield_schd_qty IS '出来高予定数量 // #MA.QTY // Output scheduled qty.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.master_dt IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.po_schd_dt IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.gi_schd_dt IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.mfg_st_schd_dt IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.mfg_end_schd_dt IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.strg_schd_dt IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.accpt_schd_dt IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.insp_st_schd_dt IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.insp_end_schd_dt IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mrp_itm_orderz.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN msvt_mrp_itm_orderz.lmt_dt IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN msvt_mrp_itm_orderz.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN msvt_mrp_itm_orderz.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

