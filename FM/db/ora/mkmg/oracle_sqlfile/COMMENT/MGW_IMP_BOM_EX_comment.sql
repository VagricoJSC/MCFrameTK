
COMMENT ON TABLE MGW_IMP_BOM_EX IS '原価ＢＯＭ取込展開ワーク // Work for cost BOM import explosion';


COMMENT ON COLUMN MGW_IMP_BOM_EX.BOM_LVL IS 'ＢＯＭ階層 // #MA.BOM_LVL // BOM hierarchy';


COMMENT ON COLUMN MGW_IMP_BOM_EX.WG_CD IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ITM_CD IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ITM_SUB1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ITM_SUB2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ITM_SUB3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN MGW_IMP_BOM_EX.BOM_PTN IS '構成パタン // #MA.BOM_PTN // BOM pattern';


COMMENT ON COLUMN MGW_IMP_BOM_EX.OPER_CD IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.OPER_SEQ IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PH_FLG IS '架空ＦＬＧ // #MA.FLG // Phantom flg.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PH_BOM_PTN IS '架空構成パタン // #MA.BOM_PTN // Phantom BOM pattern';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ALT_GRP_CD IS '代替グループＣＤ // #MA.ALT_GRP_CD // Alternative group cd.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PAR_INST_QTY IS '親必要数量 // #MA.QTY // Parent required qty.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.CHD_RQMT_QTY IS '子必要数量 // #MA.QTY // Child required qty.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.CHD_INPT_QTY IS '子投入数量 // #MA.QTY // Child input qty.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.FXD_CHD_RQMT_QTY IS '子固定必要数量 // #MA.QTY // Child fixed required qty.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.BYPROD_FLG IS '副産品ＦＬＧ // #MA.FLG // By-product flg.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ALT_ITM_RATIO IS '代替品目比率 // #MA.ALT_ITM_RATIO // Alternative item ratio';


COMMENT ON COLUMN MGW_IMP_BOM_EX.INPT_CTL_TYP IS '投入制御区分 // #MA.INPT_CTL_TYP // Input control type';


COMMENT ON COLUMN MGW_IMP_BOM_EX.DISP_SEQ IS '表示順 // #MA.INT // Display order';


COMMENT ON COLUMN MGW_IMP_BOM_EX.NOT_COST_FLG IS '原価対象外ＦＬＧ // #MA.FLG // Not costing flg.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.ST_DT IS '適用開始日 // #MA.DT // Application start date';


COMMENT ON COLUMN MGW_IMP_BOM_EX.END_DT IS '適用終了日 // #MA.DT // Application end date';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PAR_ITM_CD IS '親品目ＣＤ // #MA.ITM_CD // Parent item cd.';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PAR_ITM_SUB1 IS '親枝番１ // #MA.ITM_SUB1 // Parent branch No. 1';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PAR_ITM_SUB2 IS '親枝番２ // #MA.ITM_SUB2 // Parent branch No. 2';


COMMENT ON COLUMN MGW_IMP_BOM_EX.PAR_ITM_SUB3 IS '親枝番３ // #MA.ITM_SUB3 // Parent branch No. 3';

