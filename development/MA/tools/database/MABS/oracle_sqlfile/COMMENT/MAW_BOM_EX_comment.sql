
COMMENT ON TABLE MAW_BOM_EX IS 'ＢＯＭ展開用ワークテーブル // Work table for BOM explosion';


COMMENT ON COLUMN MAW_BOM_EX.SORT_NO IS 'ソート順 // #MA.BOM_EX_SORT // Sort order';


COMMENT ON COLUMN MAW_BOM_EX.BOM_LVL IS 'ＢＯＭ階層 // #MA.BOM_LVL // BOM hierarchy';


COMMENT ON COLUMN MAW_BOM_EX.BOTTOM_FLG IS '最下位ＦＬＧ // #MA.FLG // Bottom flg.';


COMMENT ON COLUMN MAW_BOM_EX.LOOP_FLG IS 'ループＦＬＧ // #MA.FLG // Loop flg.';


COMMENT ON COLUMN MAW_BOM_EX.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAW_BOM_EX.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MAW_BOM_EX.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MAW_BOM_EX.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MAW_BOM_EX.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MAW_BOM_EX.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MAW_BOM_EX.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAW_BOM_EX.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MAW_BOM_EX.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MAW_BOM_EX.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MAW_BOM_EX.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MAW_BOM_EX.ALT_ITM_FLG IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN MAW_BOM_EX.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MAW_BOM_EX.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MAW_BOM_EX.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MAW_BOM_EX.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MAW_BOM_EX.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MAW_BOM_EX.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MAW_BOM_EX.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MAW_BOM_EX.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MAW_BOM_EX.MIN_SNO1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN MAW_BOM_EX.MAX_SNO1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN MAW_BOM_EX.MIN_SNO2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN MAW_BOM_EX.MAX_SNO2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN MAW_BOM_EX.MIN_SNO3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN MAW_BOM_EX.MAX_SNO3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN MAW_BOM_EX.MIN_SNO4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN MAW_BOM_EX.MAX_SNO4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN MAW_BOM_EX.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MAW_BOM_EX.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MAW_BOM_EX.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MAW_BOM_EX.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MAW_BOM_EX.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MAW_BOM_EX.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MAW_BOM_EX.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MAW_BOM_EX.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MAW_BOM_EX.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MAW_BOM_EX.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MAW_BOM_EX.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MAW_BOM_EX.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MAW_BOM_EX.MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MAW_BOM_EX.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MAW_BOM_EX.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MAW_BOM_EX.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MAW_BOM_EX.CHNG_NO IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN MAW_BOM_EX.EXT_SYS_NO_BOM IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN MAW_BOM_EX.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAW_BOM_EX.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAW_BOM_EX.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAW_BOM_EX.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MAW_BOM_EX.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MAW_BOM_EX.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MAW_BOM_EX.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MAW_BOM_EX.PAR_SORT_NO IS '親ソート順 // #MA.BOM_EX_SORT // Parent sort order';


COMMENT ON COLUMN MAW_BOM_EX.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MAW_BOM_EX.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MAW_BOM_EX.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MAW_BOM_EX.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';

