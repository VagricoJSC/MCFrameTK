
COMMENT ON TABLE MGVT_SLS IS '原価計算売上ビュー // Cost calculation sales view';


COMMENT ON COLUMN MGVT_SLS.ACT_SLS_ID IS '売上実績ＩＤ // #MG.ACT_SLS_ID // Sales result ID';


COMMENT ON COLUMN MGVT_SLS.ACT_SLS_ID_SUB IS '売上実績ＩＤ枝番 // #MG.ACT_SLS_ID_SUB // Sales result ID branch No.';


COMMENT ON COLUMN MGVT_SLS.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVT_SLS.YM IS '年月 // #MA.YM // Year month';


COMMENT ON COLUMN MGVT_SLS.AC_DT IS '計上日 // #MA.DT // Recording date';


COMMENT ON COLUMN MGVT_SLS.MNG_DPT_CD IS '管理部門ＣＤ // #MA.COST_DPT_CD // Management dept. cd.';


COMMENT ON COLUMN MGVT_SLS.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVT_SLS.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVT_SLS.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVT_SLS.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVT_SLS.ITM_EXT IS '品目拡張 // #MG.ITM_EXT // Item extension';


COMMENT ON COLUMN MGVT_SLS.LOT_NO IS 'ロットＮＯ // #MA.LOT_NO // Lot No.';


COMMENT ON COLUMN MGVT_SLS.SUBLOT_NO IS 'サブロットＮＯ // #MA.SUBLOT_NO // Sublot No.';


COMMENT ON COLUMN MGVT_SLS.SNO1 IS '手配ＮＯ１ // #MA.SNO1 // SEIBAN No. 1';


COMMENT ON COLUMN MGVT_SLS.SNO2 IS '手配ＮＯ２ // #MA.SNO2 // SEIBAN No. 2';


COMMENT ON COLUMN MGVT_SLS.SNO3 IS '手配ＮＯ３ // #MA.SNO3 // SEIBAN No. 3';


COMMENT ON COLUMN MGVT_SLS.SNO4 IS '手配ＮＯ４ // #MA.SNO4 // SEIBAN No. 4';


COMMENT ON COLUMN MGVT_SLS.AC_SLIP_TYP IS '会計伝票区分 // #MA.AC_SLIP_TYP // Accounting slip type';


COMMENT ON COLUMN MGVT_SLS.AC_RSN_CD IS '会計理由ＣＤ // #MA.AC_RSN_CD // Accounting reason cd.';


COMMENT ON COLUMN MGVT_SLS.ASST_TYP IS '資産区分 // #MA.ASST_TYP // Asset type';


COMMENT ON COLUMN MGVT_SLS.QTY IS '数量 // #MA.QTY // Quantity';


COMMENT ON COLUMN MGVT_SLS.AMT IS '金額 // #MA.MONEY // Amount';


COMMENT ON COLUMN MGVT_SLS.CUR_CD IS '通貨ＣＤ // #MA.CUR_CD // Currency cd.';


COMMENT ON COLUMN MGVT_SLS.CUR_AMT IS '通貨金額 // #MA.MONEY // Currency amount';


COMMENT ON COLUMN MGVT_SLS.XRATE IS '為替レート // #MA.MONEY // Exchange rate';


COMMENT ON COLUMN MGVT_SLS.CST_CD IS '得意先ＣＤ // #MA.BP_CD // Customer cd.';


COMMENT ON COLUMN MGVT_SLS.DLV_CD IS '納品先ＣＤ // #MA.BP_CD // Delivery destination cd.';


COMMENT ON COLUMN MGVT_SLS.PO_NO IS '発注ＮＯ // #MA.PO_NO // PO No.';


COMMENT ON COLUMN MGVT_SLS.SLO_NO IS '受注ＮＯ // #MA.SLO_NO // Sales order No.';


COMMENT ON COLUMN MGVT_SLS.IV_NO IS 'インボイスＮＯ // #MA.IV_NO // Invoice No.';


COMMENT ON COLUMN MGVT_SLS.STK_BP_CD IS '在庫先ＣＤ // #MA.BP_CD // Company holding inventory cd.';


COMMENT ON COLUMN MGVT_SLS.ALC_DPT_CD IS '配賦部門ＣＤ // #MA.COST_DPT_CD // Allocation dept. cd.';


COMMENT ON COLUMN MGVT_SLS.SLS_DPT_CD IS '売上部門ＣＤ // #MA.COST_DPT_CD // Sales dept. cd.';


COMMENT ON COLUMN MGVT_SLS.DEST_CD1 IS '仕向先ＣＤ１ // #MA.BP_CD // Distribution channel cd. 1';


COMMENT ON COLUMN MGVT_SLS.DEST_CD2 IS '仕向先ＣＤ２ // #MA.BP_CD // Distribution channel cd. 2';


COMMENT ON COLUMN MGVT_SLS.DEST_CD3 IS '仕向先ＣＤ３ // #MA.BP_CD // Distribution channel cd. 3';


COMMENT ON COLUMN MGVT_SLS.ALC_VAL1 IS '配賦基準値１ // #MA.ALC_VAL1 // Allocation value 1';


COMMENT ON COLUMN MGVT_SLS.ALC_VAL2 IS '配賦基準値２ // #MA.ALC_VAL2 // Allocation value 2';


COMMENT ON COLUMN MGVT_SLS.ALC_VAL3 IS '配賦基準値３ // #MA.ALC_VAL3 // Allocation value 3';


COMMENT ON COLUMN MGVT_SLS.ALC_VAL4 IS '配賦基準値４ // #MA.ALC_VAL4 // Allocation value 4';


COMMENT ON COLUMN MGVT_SLS.ALC_VAL5 IS '配賦基準値５ // #MA.ALC_VAL5 // Allocation value 5';


COMMENT ON COLUMN MGVT_SLS.REC_EVAL_TYP IS '個別評価区分 // #MG.REC_EVAL_TYP // Individual evaluation type';


COMMENT ON COLUMN MGVT_SLS.ZERO_EFFECT_FLG IS 'ゼロ評価ＦＬＧ // #MA.FLG // Zero evaluation flg.';

