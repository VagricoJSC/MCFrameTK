\encoding UTF-8

COMMENT ON VIEW mgt_calc_itm_mfg_inst IS '計算対象品目製造指図情報 // (Calculation) Item mfg. order info.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_ext IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.mfg_act_no IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.mng_dpt_cd IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.sppl_cd IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.po_no IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.slo_no IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.iv_no IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.asst_typ IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.qty IS '指図数量 // #MA.QTY // Order qty.';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.schd_st_dt IS '着手予定日 // #MA.DT // Scheduled start date';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.schd_end_dt IS '終了予定日 // #MA.DT // Scheduled end date';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.act_st_dt IS '着手実績日 // #MA.DT // Actual start date';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.act_end_dt IS '終了実績日 // #MA.DT // Actual end date';


COMMENT ON COLUMN mgt_calc_itm_mfg_inst.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';

