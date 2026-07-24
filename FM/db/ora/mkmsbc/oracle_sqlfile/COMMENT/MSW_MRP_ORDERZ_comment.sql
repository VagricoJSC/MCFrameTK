
COMMENT ON TABLE MSW_MRP_ORDERZ IS 'ＭＲＰトランザクションワーク // MRP transaction work';


COMMENT ON COLUMN MSW_MRP_ORDERZ.DATA_TYP IS 'ＭＲＰ用データ区分 // #MS.MRP_DATA_TYP // Data type for MRP';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.IO_SCHD_NO IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.IO_SCHD_TYP IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.IO_SCHD_STS_TYP IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_ORD_TYP IS 'オーダ区分 // #MS.ITM_ORD_TYP // Order type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_ORD_STS_TYP IS '品目オーダ状況区分 // #MS.ITM_ORD_STS_TYP // Item order status type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_ORD_STS_TYP IS '工程オーダ状況区分 // #MS.OPER_ORD_STS_TYP // Operation order status type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSW_MRP_ORDERZ.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MSW_MRP_ORDERZ.DISP_SEQ IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALT_GRP_SEQ IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_ORD_NO IS '工程オーダＮＯ // #MA.OPER_ORD_NO // Operation order No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MSW_MRP_ORDERZ.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.LOT_SEQ IS 'ロットシーケンス // #MA.LOT_SEQ // Lot sequence';


COMMENT ON COLUMN MSW_MRP_ORDERZ.MFG_LOC_CD IS '製造場所ＣＤ // #MA.LOC_CD // Mfg. location cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SPPL_CD IS '発注先ＣＤ // #MA.BP_CD // Supplier cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.MAKER_CD IS 'メーカＣＤ // #MA.BP_CD // Maker cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.RQST_LOC_CD IS '依頼先場所ＣＤ // #MA.LOC_CD // Requested location cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.RQST_WG_CD IS '依頼先WG ＣＤ // #MA.WG_CD // Requested WG cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.QTY IS '残数量 // #MA.QTY // Remaining qty.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.MASTER_DT IS 'マスタ適用日 // #MA.DT // Master application date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.PO_SCHD_DT IS '発注予定日 // #MA.DT // Scheduled PO date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.GI_SCHD_DT IS '出庫予定日 // #MA.DT // Scheduled GI date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.MFG_ST_SCHD_DT IS '製造着手予定日 // #MA.DT // Scheduled mfg. start date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.MFG_END_SCHD_DT IS '製造終了予定日 // #MA.DT // Scheduled mfg. end date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ST_SCHD_TM IS '工程着手予定日時 // #MA.TM // Scheduled operation start date and time';


COMMENT ON COLUMN MSW_MRP_ORDERZ.END_SCHD_TM IS '工程終了予定日時 // #MA.TM // Scheduled operation end date and time';


COMMENT ON COLUMN MSW_MRP_ORDERZ.STRG_SCHD_DT IS '格納完了予定日 // #MA.DT // Scheduled storage completion date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ACCPT_SCHD_DT IS '検収予定日 // #MA.DT // Scheduled acceptance date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.INSP_ST_SCHD_DT IS '検査着手予定日 // #MA.DT // Scheduled inspection start date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.INSP_END_SCHD_DT IS '検査終了予定日 // #MA.DT // Scheduled inspection end date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.FIRST_GR_DT IS '最古入庫日 // #MA.DT // Oldest GR date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.AVL_SCHD_DT IS '使用可能予定日 // #MA.DT // Available date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MSW_MRP_ORDERZ.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.EX_SNO1 IS 'オーダ生成用手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1 for order generation';


COMMENT ON COLUMN MSW_MRP_ORDERZ.EX_SNO2 IS 'オーダ生成用手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2 for order generation';


COMMENT ON COLUMN MSW_MRP_ORDERZ.EX_SNO3 IS 'オーダ生成用手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3 for order generation';


COMMENT ON COLUMN MSW_MRP_ORDERZ.EX_SNO4 IS 'オーダ生成用手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4 for order generation';


COMMENT ON COLUMN MSW_MRP_ORDERZ.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.LMT_DT IS '期限切れ日 // #MA.DT // Expired date';


COMMENT ON COLUMN MSW_MRP_ORDERZ.WG_CD IS 'WG ＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.RQMT_NO IS '所要ＮＯ // #MA.RQMT_NO // Requirements No.';


COMMENT ON COLUMN MSW_MRP_ORDERZ.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MSW_MRP_ORDERZ.ALLOC_FLG IS '場所引当ＦＬＧ // #MA.FLG // Location allocation flg.';

