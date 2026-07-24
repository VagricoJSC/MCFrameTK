
COMMENT ON TABLE MGW_BOM_EX_TMP IS '原価ＢＯＭ展開一時ワーク // Temporary work for cost BOM explosion';


COMMENT ON COLUMN MGW_BOM_EX_TMP.BOM_LVL IS 'ＢＯＭ階層 // #MA.BOM_LVL // BOM hierarchy';


COMMENT ON COLUMN MGW_BOM_EX_TMP.SORT_NO IS 'ソート順 // #MA.BOM_EX_SORT // Sort order';


COMMENT ON COLUMN MGW_BOM_EX_TMP.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_BOM_EX_TMP.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGW_BOM_EX_TMP.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_RQMT_QTY IS '親必要数量 // #MA.QTY // Parent required qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.CHD_BASE_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.CHD_MIN_QTY IS '子最小必要数量 // #MA.QTY // Child min. required qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.CHD_BATCH_QTY IS '子刻み必要数量 // #MA.QTY // Increments of child required qty.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MGW_BOM_EX_TMP.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_WG_CD IS '親ワーキンググループＣＤ // #MA.WG_CD // Parent WG cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PAR_SORT_NO IS '親ソート順 // #MA.BOM_EX_SORT // Parent sort order';


COMMENT ON COLUMN MGW_BOM_EX_TMP.BOM_WG_CD IS 'ＢＯＭワーキンググループＣＤ // #MA.WG_CD // BOM WG cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.ITM_CALC_CTG_CD IS '品目計算カテゴリＣＤ // #MA.CALC_CTG_CD // Item calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.DTL_CALC_CTG_CD IS '詳細計算カテゴリＣＤ // #MA.CALC_CTG_CD // Details calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PURC_CALC_CTG_CD IS '購買計算カテゴリＣＤ // #MA.CALC_CTG_CD // Purchase calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PROC_CALC_CTG_CD IS '加工計算カテゴリＣＤ // #MA.CALC_CTG_CD // Subcontracting calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.PROV_CALC_CTG_CD IS '支給計算カテゴリＣＤ // #MA.CALC_CTG_CD // Supply calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.SLS_CALC_CTG_CD IS '販売計算カテゴリＣＤ // #MA.CALC_CTG_CD // Sales calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.FIX_CALC_CTG_CD IS '指値計算カテゴリＣＤ // #MA.CALC_CTG_CD // Limit unit price calculation category cd.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.BOTTOM_FLG IS '最下位ＦＬＧ // #MA.FLG // Bottom flg.';


COMMENT ON COLUMN MGW_BOM_EX_TMP.LOOP_FLG IS 'ループＦＬＧ // #MA.FLG // Loop flg.';

