\encoding UTF-8

COMMENT ON VIEW msvt_mrp_sim_io_schd_gr IS 'シミュレーション(需給調整)用入庫予定情報 // Receipt schedule info. for simulation (Demand and supply management)';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.avl_schd_dt IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.lmt_dt IS '使用期限 // #MA.DT // Usage expiration date';


COMMENT ON COLUMN msvt_mrp_sim_io_schd_gr.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

