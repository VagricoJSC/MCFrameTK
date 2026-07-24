
COMMENT ON TABLE MSW_INV_TRANS IS '在庫推移検索ワーク // Inventory forecasting search work';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_TYP IS '受払予定区分 // #MS.IO_SCHD_TYP // GR/GI schedule type';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_STS_TYP IS '受払予定状況区分 // #MS.IO_SCHD_STS_TYP // GR/GI schedule status type';


COMMENT ON COLUMN MSW_INV_TRANS.TRD_CD IS '取引ＣＤ // #MA.TRD_CD // Transaction cd.';


COMMENT ON COLUMN MSW_INV_TRANS.TRD_PTN_TYP IS '取引パタン区分 // #MA.TRD_PTN_TYP // Transaction pattern type';


COMMENT ON COLUMN MSW_INV_TRANS.TRN_TYP IS 'トランザクション区分 // #MS.TRN_TYP // Transaction type';


COMMENT ON COLUMN MSW_INV_TRANS.IO_ACT_TYP IS '受払区分 // #MS.IO_ACT_TYP // GR/GI type';


COMMENT ON COLUMN MSW_INV_TRANS.IO_TYP IS '入出庫区分 // #MS.IO_TYP // GR/GI type';


COMMENT ON COLUMN MSW_INV_TRANS.DT IS '日付 // #MA.DT // Date';


COMMENT ON COLUMN MSW_INV_TRANS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSW_INV_TRANS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSW_INV_TRANS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSW_INV_TRANS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSW_INV_TRANS.ITM_NM IS '品名 // #MA.ITM_NM // Item name';


COMMENT ON COLUMN MSW_INV_TRANS.VER_FLG IS '版管理対象ＦＬＧ // #MA.FLG // For version control flg.';


COMMENT ON COLUMN MSW_INV_TRANS.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MSW_INV_TRANS.GD_CD IS '格付ＣＤ // #MA.STK_GD_CD // Grading cd.';


COMMENT ON COLUMN MSW_INV_TRANS.QUALITY_TYP IS '良品区分 // #MA.QUALITY_TYP // Conforming type';


COMMENT ON COLUMN MSW_INV_TRANS.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MSW_INV_TRANS.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MSW_INV_TRANS.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MSW_INV_TRANS.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MSW_INV_TRANS.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MSW_INV_TRANS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MSW_INV_TRANS.GR_SCHD_QTY IS '入庫予定数量 // #MA.QTY // GR scheduled qty.';


COMMENT ON COLUMN MSW_INV_TRANS.GI_SCHD_QTY IS '出庫予定数量 // #MA.QTY // GI scheduled qty.';


COMMENT ON COLUMN MSW_INV_TRANS.GR_ACT_QTY IS '入庫実績数量 // #MA.QTY // GR result qty.';


COMMENT ON COLUMN MSW_INV_TRANS.GI_ACT_QTY IS '出庫実績数量 // #MA.QTY // GI result qty.';


COMMENT ON COLUMN MSW_INV_TRANS.STK_QTY IS '在庫数量 // #MA.QTY // Inventory qty.';


COMMENT ON COLUMN MSW_INV_TRANS.BASE_UNIT_CD IS '基準単位ＣＤ // #MA.UNIT_CD // Base unit cd.';


COMMENT ON COLUMN MSW_INV_TRANS.BASE_UNIT_DEC_PLACE IS '基準単位小数部有効桁数 // #MA.DEC_PLACE // Base unit number of decimal places';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_NO IS '受払予定ＮＯ // #MA.IO_SCHD_NO // GR/GI schedule No.';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_TYP1 IS '受払予定予備区分１ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 1';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_NO1 IS '受払予定予備ＮＯ１ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 1';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_TYP2 IS '受払予定予備区分２ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 2';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_NO2 IS '受払予定予備ＮＯ２ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 2';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_TYP3 IS '受払予定予備区分３ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 3';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_NO3 IS '受払予定予備ＮＯ３ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 3';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_TYP4 IS '受払予定予備区分４ // #MS.IO_SCHD_SUB_TYP // GR/GI schedule spare type 4';


COMMENT ON COLUMN MSW_INV_TRANS.IO_SCHD_SUB_NO4 IS '受払予定予備ＮＯ４ // #MA.IO_SCHD_SUB_NO // GR/GI schedule spare No. 4';


COMMENT ON COLUMN MSW_INV_TRANS.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MSW_INV_TRANS.SLO_D_NO IS '受注明細ＮＯ // #MA.SLO_D_NO // Sales order details No.';


COMMENT ON COLUMN MSW_INV_TRANS.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MSW_INV_TRANS.PO_D_NO IS '発注明細ＮＯ // #MA.PO_D_NO // PO details No.';


COMMENT ON COLUMN MSW_INV_TRANS.MFG_INST_NO IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN MSW_INV_TRANS.OPER_INST_NO IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_NM IS '親品名 // #MA.ITM_NM // Parent item name';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_LOT_NO IS '親ロットＮＯ // #MA.LOT_NO // Parent lot No.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_SUBLOT_NO IS '親サブロットＮＯ // #MA.SUBLOT_NO // Parent sublot No.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_SNO1 IS '親手配ＮＯ１ // #MA.SNO1 // Parent SEIBAN No. 1';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_SNO2 IS '親手配ＮＯ２ // #MA.SNO2 // Parent SEIBAN No. 2';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_SNO3 IS '親手配ＮＯ３ // #MA.SNO3 // Parent SEIBAN No. 3';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_SNO4 IS '親手配ＮＯ４ // #MA.SNO4 // Parent SEIBAN No. 4';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_ITM_ORD_NO IS '親品目オーダＮＯ // #MA.ITM_ORD_NO // Parent item order No.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_OPER_ORD_NO IS '親工程オーダＮＯ // #MA.OPER_ORD_NO // Parent operation order No.';


COMMENT ON COLUMN MSW_INV_TRANS.PAR_DT_FR IS '親着手予定日 // #MA.DT // Scheduled parent start date';


COMMENT ON COLUMN MSW_INV_TRANS.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MSW_INV_TRANS.MFG_ACT_NO IS '製造実績ＮＯ // #MA.MFG_ACT_NO // Mfg. result No.';


COMMENT ON COLUMN MSW_INV_TRANS.OPER_ACT_NO IS '工程実績ＮＯ // #MA.OPER_ACT_NO // Operation result No.';


COMMENT ON COLUMN MSW_INV_TRANS.STR_LN_CD IS '棚・ラインＣＤ // #MA.STR_LN_CD // Rack/Line cd.';


COMMENT ON COLUMN MSW_INV_TRANS.PRCD_FLG IS '先行手配ＦＬＧ // #MA.FLG // Long LT flg.';


COMMENT ON COLUMN MSW_INV_TRANS.SIM_FLG IS 'シミュレーションＦＬＧ // #MA.FLG // Simulation flg.';


COMMENT ON COLUMN MSW_INV_TRANS.STK_FLG IS '在庫ＦＬＧ // #MA.FLG // Inventory flg.';

