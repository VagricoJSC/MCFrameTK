
COMMENT ON TABLE MGT_CALC_IO IS '計算対象入出庫情報 // (Calculation) Other GR/GI';


COMMENT ON COLUMN MGT_CALC_IO.CALC_NO IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN MGT_CALC_IO.CALC_GRP_CD IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN MGT_CALC_IO.ACT_IO_ID IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN MGT_CALC_IO.ACT_IO_ID_SUB IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN MGT_CALC_IO.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGT_CALC_IO.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGT_CALC_IO.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGT_CALC_IO.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGT_CALC_IO.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGT_CALC_IO.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGT_CALC_IO.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGT_CALC_IO.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGT_CALC_IO.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGT_CALC_IO.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGT_CALC_IO.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGT_CALC_IO.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGT_CALC_IO.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGT_CALC_IO.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGT_CALC_IO.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGT_CALC_IO.COST_IO_TYP IS '原価入出庫区分 // #MA.COST_IO_TYP // Cost GR/GI type';


COMMENT ON COLUMN MGT_CALC_IO.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGT_CALC_IO.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGT_CALC_IO.OTHER_WG_CD IS '相手ワーキンググループＣＤ // #MA.WG_CD // Counterpart WG cd.';


COMMENT ON COLUMN MGT_CALC_IO.OTHER_DPT_CD IS '相手部門ＣＤ // #MA.COST_DPT_CD // Counterpart dept. cd.';


COMMENT ON COLUMN MGT_CALC_IO.BP_CD IS '取引先ＣＤ // #MA.BP_CD // BP cd.';


COMMENT ON COLUMN MGT_CALC_IO.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGT_CALC_IO.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGT_CALC_IO.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGT_CALC_IO.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGT_CALC_IO.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGT_CALC_IO.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGT_CALC_IO.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGT_CALC_IO.TRD_GRP IS '振替グループ // #MA.TRD_GRP // Transfer group';


COMMENT ON COLUMN MGT_CALC_IO.TRD_RATIO IS '振替比率 // #MG.TRD_RATIO // Transfer ratio';


COMMENT ON COLUMN MGT_CALC_IO.ALC_AC_CD IS '配賦科目ＣＤ // #MA.ALC_AC_CD // Allocation account cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_AMT_FLG IS '配賦振替ＦＬＧ // #MA.FLG // Transfer allocation flg.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_WG_CD IS '配賦ワーキンググループＣＤ // #MA.WG_CD // Allocation WG cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_PTN_CD IS '配賦パタンＣＤ // #MA.ALC_PTN_CD // Allocation pattern cd.';


COMMENT ON COLUMN MGT_CALC_IO.EXPNS_CD IS '費目ＣＤ // #MA.EXPNS_CD // Cost element cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_DPT_CD IS '配賦先部門ＣＤ // #MA.COST_DPT_CD // Allocation destination dept. cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_LOC_CD IS '配賦先場所ＣＤ // #MA.LOC_CD // Allocation destination location cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_OPER_CD IS '配賦先工程ＣＤ // #MA.OPER_CD // Allocation destination operation cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_BP_CD IS '配賦先取引先ＣＤ // #MA.BP_CD // Allocation destination BP cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_CTG_CD IS '配賦先品群ＣＤ // #MA.COST_CTG_CD // Allocation destination item category cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_ITM_CD IS '配賦先品目ＣＤ // #MA.ITM_CD // Allocation destination item cd.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_ITM_SUB1 IS '配賦先枝番１ // #MA.ITM_SUB1 // Allocation destination branch No. 1';


COMMENT ON COLUMN MGT_CALC_IO.ALC_ITM_SUB2 IS '配賦先枝番２ // #MA.ITM_SUB2 // Allocation destination branch No. 2';


COMMENT ON COLUMN MGT_CALC_IO.ALC_ITM_SUB3 IS '配賦先枝番３ // #MA.ITM_SUB3 // Allocation destination branch No. 3';


COMMENT ON COLUMN MGT_CALC_IO.ALC_LOT_NO IS '配賦先ロットＮＯ // #MA.LOT_NO // Allocation destination lot No.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_SUBLOT_NO IS '配賦先サブロットＮＯ // #MA.SUBLOT_NO // Allocation destination sublot No.';


COMMENT ON COLUMN MGT_CALC_IO.ALC_SNO1 IS '配賦先手配ＮＯ１ // #MA.SNO1 // Allocation destination SEIBAN No. 1';


COMMENT ON COLUMN MGT_CALC_IO.ALC_SNO2 IS '配賦先手配ＮＯ２ // #MA.SNO2 // Allocation destination SEIBAN No. 2';


COMMENT ON COLUMN MGT_CALC_IO.ALC_SNO3 IS '配賦先手配ＮＯ３ // #MA.SNO3 // Allocation destination SEIBAN No. 3';


COMMENT ON COLUMN MGT_CALC_IO.ALC_SNO4 IS '配賦先手配ＮＯ４ // #MA.SNO4 // Allocation destination SEIBAN No. 4';


COMMENT ON COLUMN MGT_CALC_IO.ALC_ITM_MFG_INST_NO IS '配賦先品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Allocation destination item mfg. order No.';


COMMENT ON COLUMN MGT_CALC_IO.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGT_CALC_IO.EVAL_LOOP_FLG IS '個別評価ループＦＬＧ // #MA.FLG // Individual evaluation loop flg.';


COMMENT ON COLUMN MGT_CALC_IO.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';


COMMENT ON COLUMN MGT_CALC_IO.CALC_CTG_CD IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';

