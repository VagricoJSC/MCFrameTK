
COMMENT ON TABLE MSW_BOM_EXP_RSLT IS 'ＢＯＭ展開結果情報ワーク // BOM explosion result info. work';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.PEG_NO IS '紐付けＮＯ // #MA.INT // Pegging No.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ITM_ORD_NO IS '品目オーダＮＯ // #MA.ITM_ORD_NO // Item order No.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.BOM_KEY IS 'ＢＯＭキー // #MA.BOM_KEY // BOM key';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.VER_NO IS '版ＮＯ // #MA.VER_NO // Version No.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.RQMT_QTY IS '必要数量（固定込み） // #MA.QTY // Required qty. (Including constant)';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.LOSS_RQMT_QTY IS '必要数量（固定無し） // #MA.QTY // Required qty. (No constant)';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.INPT_QTY IS '投入数量 // #MA.QTY // Input qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.FXD_RQMT_QTY IS '固定必要数量 // #MA.QTY // Fixed required qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_ITM_FLG IS '代替品目ＦＬＧ // #MA.FLG // Alternative item flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_GRP_SEQ IS '代替グループ連番 // #MA.INT // Alternative group sequence number';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_ITM_TYP IS '代替品目選択区分 // #MA.ALT_ITM_TYP // Alternative item selection type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALT_ALLOC_PRIO IS '引当優先順 // #MA.INT // Allocation priority';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO_TYP1 IS '手配ＮＯ１区分 // #MA.SNO_TYP // SEIBAN No. 1 type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO_TYP2 IS '手配ＮＯ２区分 // #MA.SNO_TYP // SEIBAN No. 2 type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO_TYP3 IS '手配ＮＯ３区分 // #MA.SNO_TYP // SEIBAN No. 3 type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SNO_TYP4 IS '手配ＮＯ４区分 // #MA.SNO_TYP // SEIBAN No. 4 type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.PAR_INST_QTY IS '親指図数量 // #MA.QTY // Parent order qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.CHD_RQMT_RATIO IS '子品目必要比率 // #MA.CHD_RATIO // Child item requirement ratio';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.CHD_INPT_RATIO IS '子品目投入比率 // #MA.CHD_RATIO // Child item input ratio';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.IN_OFFST_TYP IS '投入オフセット区分 // #MA.OFFST_TYP // Input offset type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.IN_OFFST IS '投入オフセット // #MA.OFFST // Input offset';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.BKF_TYP IS 'バックフラッシュ区分 // #MA.BKF_TYP // Backflush type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.INST_LOT_FIX_FLG IS '指図時ロット指定ＦＬＧ // #MA.FLG // Lot specification at order flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.LOT_MIX_FLG IS 'ロット混在ＦＬＧ // #MA.FLG // Lot mixed flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.SUBLOT_MIX_FLG IS 'サブロット混在ＦＬＧ // #MA.FLG // Sublot mixed flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.ALLOC_CTL_TYP IS '引当制御区分 // #MA.ALLOC_CTL_TYP // Allocation control type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.MAIN_ITM_FLG IS '主原料ＦＬＧ // #MA.FLG // Main raw material flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.YIELD_CALC_FLG IS '収率計算用ＦＬＧ // #MA.FLG // Yield calculation flg.';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.MEMO1 IS 'メモ１ // #MA.MST_MEMO1 // Memo 1';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.MEMO2 IS 'メモ２ // #MA.MST_MEMO2 // Memo 2';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.MEMO3 IS 'メモ３ // #MA.MST_MEMO3 // Memo 3';


COMMENT ON COLUMN MSW_BOM_EXP_RSLT.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';

