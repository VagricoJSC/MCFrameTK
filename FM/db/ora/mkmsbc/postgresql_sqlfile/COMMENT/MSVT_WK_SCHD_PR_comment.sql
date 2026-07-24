\encoding UTF-8

COMMENT ON VIEW msvt_wk_schd_pr IS '工数予定進捗ビュー // Man-hour schedule progress view';


COMMENT ON COLUMN msvt_wk_schd_pr.wk_schd_no IS '工数予定ＮＯ // #MA.WK_SCHD_NO // Man-hour schedule No.';


COMMENT ON COLUMN msvt_wk_schd_pr.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN msvt_wk_schd_pr.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_wk_schd_pr.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN msvt_wk_schd_pr.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN msvt_wk_schd_pr.fxd_wk_cost IS '固定工数 // #MA.WK_COST_QTY // Constant man-hour';


COMMENT ON COLUMN msvt_wk_schd_pr.wk_cost IS '数量依存工数 // #MA.WK_COST_QTY // Qty.-dependent man-hours';


COMMENT ON COLUMN msvt_wk_schd_pr.rem_wk_cost IS '残工数 // #MA.WK_COST_QTY // Remaining man-hour';


COMMENT ON COLUMN msvt_wk_schd_pr.abort_wk_cost IS '打切工数 // #MA.QTY // Cancel remaining man-hour';


COMMENT ON COLUMN msvt_wk_schd_pr.sub_char1 IS '予備１ // #MS.WK_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN msvt_wk_schd_pr.sub_char2 IS '予備２ // #MS.WK_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN msvt_wk_schd_pr.sub_char3 IS '予備３ // #MS.WK_ACT_REM_SUB_CHAR3 // Spare 3';

