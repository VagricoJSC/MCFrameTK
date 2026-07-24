\encoding UTF-8

COMMENT ON VIEW msvt_mrp_io_schd_gi_sd IS 'シミュレーション(需給調整)用出庫受払予定情報 // GI info. of GR/GI schedule info. for simulation (Demand and supply managemnet)';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.base_unit_qty IS '基準単位数量 // #MA.QTY // Base unit qty.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.schd_dt IS '予定日付 // #MA.DT // Scheduled date';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alt_alloc_prio IS '代替品目引当優先順 // #MA.INT // Alternative item allocation order of priority';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.lot_no IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sublot_no IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno_typ1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno_typ2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno_typ3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.sno_typ4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.ex_sno1 IS 'オーダ生成用手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1 for order generation';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.ex_sno2 IS 'オーダ生成用手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2 for order generation';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.ex_sno3 IS 'オーダ生成用手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3 for order generation';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.ex_sno4 IS 'オーダ生成用手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4 for order generation';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.gd_cd IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.inpt_ctl_typ IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.alloc_flg IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';


COMMENT ON COLUMN msvt_mrp_io_schd_gi_sd.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

