
COMMENT ON TABLE MGVM_ITM_WK IS '原価計算品目工数ビュー // Cost calculation item man-hour view';


COMMENT ON COLUMN MGVM_ITM_WK.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGVM_ITM_WK.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGVM_ITM_WK.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGVM_ITM_WK.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGVM_ITM_WK.LOC_CD IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN MGVM_ITM_WK.OPER_PTN IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN MGVM_ITM_WK.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGVM_ITM_WK.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGVM_ITM_WK.WK_COST_CD IS '工数管理ＣＤ // #MA.WK_COST_CD // Work element cd.';


COMMENT ON COLUMN MGVM_ITM_WK.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGVM_ITM_WK.BASE_QTY IS '基準数量 // #MA.QTY // Base qty.';


COMMENT ON COLUMN MGVM_ITM_WK.FXD_WK_COST IS '工数（固定） // #MA.WK_COST_QTY // Man-hour (Constant)';


COMMENT ON COLUMN MGVM_ITM_WK.WK_COST IS '工数（数量依存） // #MA.WK_COST_QTY // Man-hour (Qty.-dependent)';


COMMENT ON COLUMN MGVM_ITM_WK.MIN_WK_COST IS '最小工数 // #MA.WK_COST_QTY // Min. Man-hour';


COMMENT ON COLUMN MGVM_ITM_WK.BATCH_WK_COST IS '刻み工数 // #MA.WK_COST_QTY // Increments of man-hour';

