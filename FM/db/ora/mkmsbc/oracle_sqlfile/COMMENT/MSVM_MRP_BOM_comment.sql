
COMMENT ON TABLE MSVM_MRP_BOM IS 'ＭＲＰ用ＢＯＭマスタ // BOM master for MRP';


COMMENT ON COLUMN MSVM_MRP_BOM.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MSVM_MRP_BOM.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MSVM_MRP_BOM.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MSVM_MRP_BOM.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MSVM_MRP_BOM.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MSVM_MRP_BOM.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MSVM_MRP_BOM.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MSVM_MRP_BOM.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MSVM_MRP_BOM.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MSVM_MRP_BOM.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MSVM_MRP_BOM.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MSVM_MRP_BOM.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MSVM_MRP_BOM.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MSVM_MRP_BOM.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MSVM_MRP_BOM.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MSVM_MRP_BOM.ALT_GRP_SEQ IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN MSVM_MRP_BOM.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MSVM_MRP_BOM.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MSVM_MRP_BOM.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MSVM_MRP_BOM.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MSVM_MRP_BOM.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MSVM_MRP_BOM.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MSVM_MRP_BOM.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MSVM_MRP_BOM.MIN_SNO1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN MSVM_MRP_BOM.MAX_SNO1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN MSVM_MRP_BOM.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MSVM_MRP_BOM.MIN_SNO2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN MSVM_MRP_BOM.MAX_SNO2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN MSVM_MRP_BOM.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MSVM_MRP_BOM.MIN_SNO3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN MSVM_MRP_BOM.MAX_SNO3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN MSVM_MRP_BOM.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MSVM_MRP_BOM.MIN_SNO4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN MSVM_MRP_BOM.MAX_SNO4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN MSVM_MRP_BOM.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MSVM_MRP_BOM.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MSVM_MRP_BOM.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MSVM_MRP_BOM.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MSVM_MRP_BOM.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MSVM_MRP_BOM.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';

