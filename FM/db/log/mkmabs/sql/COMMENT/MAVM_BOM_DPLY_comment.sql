
COMMENT ON TABLE MAVM_BOM_DPLY IS '展開用ＢＯＭマスタビュー // BOM master view for explosion';


COMMENT ON COLUMN MAVM_BOM_DPLY.BOM_KEY IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN MAVM_BOM_DPLY.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MAVM_BOM_DPLY.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MAVM_BOM_DPLY.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MAVM_BOM_DPLY.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MAVM_BOM_DPLY.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MAVM_BOM_DPLY.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MAVM_BOM_DPLY.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MAVM_BOM_DPLY.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_ITM_CD IS '子品目ＣＤ // #MA.ITM_CD // Child item cd.';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_ITM_SUB1 IS '子枝番１ // #MA.ITM_SUB1 // Child branch No. 1';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_ITM_SUB2 IS '子枝番２ // #MA.ITM_SUB2 // Child branch No. 2';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_ITM_SUB3 IS '子枝番３ // #MA.ITM_SUB3 // Child branch No. 3';


COMMENT ON COLUMN MAVM_BOM_DPLY.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MAVM_BOM_DPLY.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALT_ITM_FLG IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MAVM_BOM_DPLY.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MAVM_BOM_DPLY.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MAVM_BOM_DPLY.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MAVM_BOM_DPLY.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MAVM_BOM_DPLY.MIN_SNO1 IS '下限手配ＮＯ１ // #MA.SNO1 // Min. SEIBAN No. 1';


COMMENT ON COLUMN MAVM_BOM_DPLY.MAX_SNO1 IS '上限手配ＮＯ１ // #MA.SNO1 // Max. SEIBAN No. 1';


COMMENT ON COLUMN MAVM_BOM_DPLY.MIN_SNO2 IS '下限手配ＮＯ２ // #MA.SNO2 // Min. SEIBAN No. 2';


COMMENT ON COLUMN MAVM_BOM_DPLY.MAX_SNO2 IS '上限手配ＮＯ２ // #MA.SNO2 // Max. SEIBAN No. 2';


COMMENT ON COLUMN MAVM_BOM_DPLY.MIN_SNO3 IS '下限手配ＮＯ３ // #MA.SNO3 // Min. SEIBAN No. 3';


COMMENT ON COLUMN MAVM_BOM_DPLY.MAX_SNO3 IS '上限手配ＮＯ３ // #MA.SNO3 // Max. SEIBAN No. 3';


COMMENT ON COLUMN MAVM_BOM_DPLY.MIN_SNO4 IS '下限手配ＮＯ４ // #MA.SNO4 // Min. SEIBAN No. 4';


COMMENT ON COLUMN MAVM_BOM_DPLY.MAX_SNO4 IS '上限手配ＮＯ４ // #MA.SNO4 // Max. SEIBAN No. 4';


COMMENT ON COLUMN MAVM_BOM_DPLY.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_INPT_RATIO IS '子品目投入比率 // #MA.CHD_RATIO // Child item input ratio';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHD_RQMT_RATIO IS '子品目必要比率 // #MA.CHD_RATIO // Child item requirement ratio';


COMMENT ON COLUMN MAVM_BOM_DPLY.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MAVM_BOM_DPLY.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MAVM_BOM_DPLY.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MAVM_BOM_DPLY.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MAVM_BOM_DPLY.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MAVM_BOM_DPLY.MAIN_ITM_FLG IS '引継対象子品目ＦＬＧ // #MA.FLG // Copy-from child item flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MAVM_BOM_DPLY.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MAVM_BOM_DPLY.CHNG_NO IS '変更ＮＯ // #MA.CHNG_NO // Change No.';


COMMENT ON COLUMN MAVM_BOM_DPLY.EXT_SYS_NO_BOM IS '外部システムＮＯ // #MA.EXT_SYS_NO_BOM // External system No.';


COMMENT ON COLUMN MAVM_BOM_DPLY.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MAVM_BOM_DPLY.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MAVM_BOM_DPLY.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MAVM_BOM_DPLY.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MAVM_BOM_DPLY.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MAVM_BOM_DPLY.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MAVM_BOM_DPLY.DEL_FLG IS '論理削除ＦＬＧ // #MA.FLG // Logical delete flg.';

