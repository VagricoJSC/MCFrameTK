
COMMENT ON TABLE MGW_WIO2 IS '入出庫実績集計ワーク２ // Other GR/GI result aggregated work 2';


COMMENT ON COLUMN MGW_WIO2.GI_ACT_IO_ID IS '出庫入出庫実績ＩＤ // #MG.ACT_IO_ID // GI result ID';


COMMENT ON COLUMN MGW_WIO2.GI_ACT_IO_ID_SUB IS '出庫入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GI result ID branch No.';


COMMENT ON COLUMN MGW_WIO2.GR_ACT_IO_ID IS '入出庫実績ＩＤ // #MG.ACT_IO_ID // GR/GI result ID';


COMMENT ON COLUMN MGW_WIO2.GR_ACT_IO_ID_SUB IS '入出庫実績ＩＤ枝番 // #MG.ACT_IO_ID_SUB // GR/GI result ID branch No.';


COMMENT ON COLUMN MGW_WIO2.GI_CALC_CTG_CD IS '出庫計算カテゴリＣＤ // #MA.CALC_CTG_CD // GI calculation category cd.';


COMMENT ON COLUMN MGW_WIO2.GI_WG_CD IS '出庫ワーキンググループＣＤ // #MA.WG_CD // GI WG cd.';


COMMENT ON COLUMN MGW_WIO2.GI_YM IS '出庫年月 // #MA.YM // GI month';


COMMENT ON COLUMN MGW_WIO2.GI_AC_DT IS '出庫計上日 // #MA.DT // GI recording date';


COMMENT ON COLUMN MGW_WIO2.GI_MNG_DPT_CD IS '出庫管理部門ＣＤ // #MA.COST_DPT_CD // GI management dept. cd.';


COMMENT ON COLUMN MGW_WIO2.GI_ITM_CD IS '出庫品目ＣＤ // #MA.ITM_CD // GI item cd.';


COMMENT ON COLUMN MGW_WIO2.GI_ITM_SUB1 IS '出庫枝番１ // #MA.ITM_SUB1 // GI branch No. 1';


COMMENT ON COLUMN MGW_WIO2.GI_ITM_SUB2 IS '出庫枝番２ // #MA.ITM_SUB2 // GI branch No. 2';


COMMENT ON COLUMN MGW_WIO2.GI_ITM_SUB3 IS '出庫枝番３ // #MA.ITM_SUB3 // GI branch No. 3';


COMMENT ON COLUMN MGW_WIO2.GI_LOT_NO IS '出庫ロットＮＯ // #MA.LOT_NO // GI lot No.';


COMMENT ON COLUMN MGW_WIO2.GI_SUBLOT_NO IS '出庫サブロットＮＯ // #MA.SUBLOT_NO // GI sublot No.';


COMMENT ON COLUMN MGW_WIO2.GI_SNO1 IS '出庫手配ＮＯ１ // #MA.SNO1 // GI SEIBAN No. 1';


COMMENT ON COLUMN MGW_WIO2.GI_SNO2 IS '出庫手配ＮＯ２ // #MA.SNO2 // GI SEIBAN No. 2';


COMMENT ON COLUMN MGW_WIO2.GI_SNO3 IS '出庫手配ＮＯ３ // #MA.SNO3 // GI SEIBAN No. 3';


COMMENT ON COLUMN MGW_WIO2.GI_SNO4 IS '出庫手配ＮＯ４ // #MA.SNO4 // GI SEIBAN No. 4';


COMMENT ON COLUMN MGW_WIO2.GI_COST_IO_TYP IS '出庫原価入出庫区分 // #MA.COST_IO_TYP // GI cost GR/GI type';


COMMENT ON COLUMN MGW_WIO2.GI_AC_SLIP_TYP IS '出庫会計伝票区分 // #MA.AC_SLIP_TYP // GI accounting slip type';


COMMENT ON COLUMN MGW_WIO2.GI_AC_RSN_CD IS '出庫会計理由ＣＤ // #MA.AC_RSN_CD // GI accounting reason cd.';


COMMENT ON COLUMN MGW_WIO2.GI_BP_CD IS '出庫取引先ＣＤ // #MA.BP_CD // GI BP cd.';


COMMENT ON COLUMN MGW_WIO2.GI_STK_BP_CD IS '出庫在庫先ＣＤ // #MA.BP_CD // GI company holding inventory cd.';


COMMENT ON COLUMN MGW_WIO2.GI_ASST_TYP IS '出庫資産区分 // #MA.ASST_TYP // GI asset type';


COMMENT ON COLUMN MGW_WIO2.GI_QTY IS '出庫数量 // #MA.QTY // GI qty.';


COMMENT ON COLUMN MGW_WIO2.GI_AMT IS '出庫金額 // #MA.MONEY // GI amount';


COMMENT ON COLUMN MGW_WIO2.GI_TRD_CUR_CD IS '出庫取引通貨ＣＤ // #MA.CUR_CD // GI transaction currency cd.';


COMMENT ON COLUMN MGW_WIO2.GI_TRD_CUR_AMT IS '出庫取引通貨金額 // #MA.MONEY // GI amount (Transaction currency)';


COMMENT ON COLUMN MGW_WIO2.GI_XRATE IS '出庫為替レート // #MA.MONEY // GI exchange rate';


COMMENT ON COLUMN MGW_WIO2.GI_TRD_GRP IS '出庫振替グループ // #MA.TRD_GRP // GI transfer group';


COMMENT ON COLUMN MGW_WIO2.GI_REC_EVAL_TYP IS '出庫個別評価区分 // #MG.REC_EVAL_TYP // GI individual evaluation type';


COMMENT ON COLUMN MGW_WIO2.GI_CALC_SEQ IS '出庫計算順序 // #MA.INT3 // GI calculation sequence';


COMMENT ON COLUMN MGW_WIO2.GI_ZERO_EFFECT_FLG IS '出庫ゼロ評価ＦＬＧ // #MA.FLG // GI zero evaluation flg.';


COMMENT ON COLUMN MGW_WIO2.GR_CALC_CTG_CD IS '入庫計算カテゴリＣＤ // #MA.CALC_CTG_CD // GR calculation category cd.';


COMMENT ON COLUMN MGW_WIO2.GR_WG_CD IS '入庫ワーキンググループＣＤ // #MA.WG_CD // GR WG cd.';


COMMENT ON COLUMN MGW_WIO2.GR_YM IS '入庫年月 // #MA.YM // GR month';


COMMENT ON COLUMN MGW_WIO2.GR_AC_DT IS '入庫計上日 // #MA.DT // GR recording date';


COMMENT ON COLUMN MGW_WIO2.GR_MNG_DPT_CD IS '入庫管理部門ＣＤ // #MA.COST_DPT_CD // GR management dept. cd.';


COMMENT ON COLUMN MGW_WIO2.GR_ITM_CD IS '入庫品目ＣＤ // #MA.ITM_CD // GR item cd.';


COMMENT ON COLUMN MGW_WIO2.GR_ITM_SUB1 IS '入庫枝番１ // #MA.ITM_SUB1 // GR branch No. 1';


COMMENT ON COLUMN MGW_WIO2.GR_ITM_SUB2 IS '入庫枝番２ // #MA.ITM_SUB2 // GR branch No. 2';


COMMENT ON COLUMN MGW_WIO2.GR_ITM_SUB3 IS '入庫枝番３ // #MA.ITM_SUB3 // GR branch No. 3';


COMMENT ON COLUMN MGW_WIO2.GR_LOT_NO IS '入庫ロットＮＯ // #MA.LOT_NO // GR lot No.';


COMMENT ON COLUMN MGW_WIO2.GR_SUBLOT_NO IS '入庫サブロットＮＯ // #MA.SUBLOT_NO // GR sublot No.';


COMMENT ON COLUMN MGW_WIO2.GR_SNO1 IS '入庫手配ＮＯ１ // #MA.SNO1 // GR SEIBAN No. 1';


COMMENT ON COLUMN MGW_WIO2.GR_SNO2 IS '入庫手配ＮＯ２ // #MA.SNO2 // GR SEIBAN No. 2';


COMMENT ON COLUMN MGW_WIO2.GR_SNO3 IS '入庫手配ＮＯ３ // #MA.SNO3 // GR SEIBAN No. 3';


COMMENT ON COLUMN MGW_WIO2.GR_SNO4 IS '入庫手配ＮＯ４ // #MA.SNO4 // GR SEIBAN No. 4';


COMMENT ON COLUMN MGW_WIO2.GR_COST_IO_TYP IS '入庫原価入出庫区分 // #MA.COST_IO_TYP // GR cost GR/GI type';


COMMENT ON COLUMN MGW_WIO2.GR_AC_SLIP_TYP IS '入庫会計伝票区分 // #MA.AC_SLIP_TYP // GR accounting slip type';


COMMENT ON COLUMN MGW_WIO2.GR_AC_RSN_CD IS '入庫会計理由ＣＤ // #MA.AC_RSN_CD // GR accounting reason cd.';


COMMENT ON COLUMN MGW_WIO2.GR_BP_CD IS '入庫取引先ＣＤ // #MA.BP_CD // GR BP cd.';


COMMENT ON COLUMN MGW_WIO2.GR_STK_BP_CD IS '入庫在庫先ＣＤ // #MA.BP_CD // GR company holding inventory cd.';


COMMENT ON COLUMN MGW_WIO2.GR_ASST_TYP IS '入庫資産区分 // #MA.ASST_TYP // GR asset type';


COMMENT ON COLUMN MGW_WIO2.GR_QTY IS '入庫数量 // #MA.QTY // GR qty.';


COMMENT ON COLUMN MGW_WIO2.GR_AMT IS '入庫金額 // #MA.MONEY // GR amount';


COMMENT ON COLUMN MGW_WIO2.GR_TRD_CUR_CD IS '入庫取引通貨ＣＤ // #MA.CUR_CD // GR transaction currency cd.';


COMMENT ON COLUMN MGW_WIO2.GR_TRD_CUR_AMT IS '入庫取引通貨金額 // #MA.MONEY // GR amount (Transaction currency)';


COMMENT ON COLUMN MGW_WIO2.GR_XRATE IS '入庫為替レート // #MA.MONEY // GR exchange rate';


COMMENT ON COLUMN MGW_WIO2.GR_TRD_GRP IS '入庫振替グループ // #MA.TRD_GRP // GR transfer group';


COMMENT ON COLUMN MGW_WIO2.GR_REC_EVAL_TYP IS '入庫個別評価区分 // #MG.REC_EVAL_TYP // GR specific evaluation type';


COMMENT ON COLUMN MGW_WIO2.GR_CALC_SEQ IS '入庫計算順序 // #MA.INT3 // GR calculation sequence';


COMMENT ON COLUMN MGW_WIO2.GR_ZERO_EFFECT_FLG IS '入庫ゼロ評価ＦＬＧ // #MA.FLG // GR zero evaluation flg.';

