\encoding UTF-8

COMMENT ON VIEW msvt_mrp_sim_rqmt_sd IS 'シミュレーション(需給調整)用日次生産依頼情報 // Daily production request info. for simulation (Demand and supply management)';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.strg_loc_cd IS '格納場所ＣＤ // #MA.LOC_CD // Storage location cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.mfg_loc_cd IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.rqst_loc_cd IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.due_dt IS '納期 // #MA.DT // Due date';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.rqmt_qty IS '所要数量 // #MA.QTY // Requirements qty.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno1_typ IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno2_typ IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno3_typ IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sno4_typ IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.rqmt_typ IS '所要区分 // #MA.RQMT_TYP // Requirements type';


COMMENT ON COLUMN msvt_mrp_sim_rqmt_sd.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';

