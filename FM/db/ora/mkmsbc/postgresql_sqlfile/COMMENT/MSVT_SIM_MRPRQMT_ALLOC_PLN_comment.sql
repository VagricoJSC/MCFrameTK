\encoding UTF-8

COMMENT ON VIEW msvt_sim_mrprqmt_alloc_pln IS 'シミュレーション用ＭＲＰ所要と引当予定を結合したビュー // A view combining MRP requirements and allocation schedules for simulation';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.rqmt_no IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.mrp_rqmt_typ IS 'ＭＲＰ所要区分 // #MS.MRP_RQMT_TYP // MRP required type';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.itm_ord_no IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.oper_ord_no IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.io_schd_typ IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.io_schd_sts_typ IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.io_schd_no IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.ver_no IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.due_dt IS '納期 // #MA.DT // Due date';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.net_rqmt_qty IS '正味所要数量 // #MA.QTY // Net requirements qty.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.alt_grp_cd IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.alt_grp_seq IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.alt_itm_typ IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.alt_itm_ratio IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_itm_cd IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_itm_sub1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_itm_sub2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_itm_sub3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_ver_no IS '子版ＮＯ // #MA.VER_NO // Child version No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_lot_no IS '子ロットＮＯ // #MA.LOT_NO // Child lot No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_sublot_no IS '子サブロットＮＯ // #MA.SUBLOT_NO // Child sublot No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_loc_cd IS '子場所ＣＤ // #MA.LOC_CD // Child location cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_io_schd_pr_no IS '子受払進捗管理ＮＯ // #MA.IO_SCHD_PR_NO // Child GR/GI progress management No.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_schd_alloc_qty IS '子引当予定数量 // #MA.QTY // Allocation scheduled qty. of child';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_gi_schd_dt IS '子出庫予定日 // #MA.DT // Scheduled GI date of child';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_sno1 IS '子手配ＮＯ１ // #MA.SNO1 // Child SEIBAN No. 1';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_sno2 IS '子手配ＮＯ２ // #MA.SNO2 // Child SEIBAN No. 2';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_sno3 IS '子手配ＮＯ３ // #MA.SNO3 // Child SEIBAN No. 3';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_sno4 IS '子手配ＮＯ４ // #MA.SNO4 // Child SEIBAN No. 4';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_alloc_avl_dt IS '子引当可能日 // #MA.DT // Allocable date of child';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_avl_qty IS '子使用可能数量 // #MA.QTY // Available qty. of child';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.chd_lmt_dt IS '子期限切れ日 // #MA.DT // Expired date of child';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN msvt_sim_mrprqmt_alloc_pln.sim_mrp_no IS 'シミュレーションＮＯ // #MA.SIM_MRP_NO // Simulation No.';

