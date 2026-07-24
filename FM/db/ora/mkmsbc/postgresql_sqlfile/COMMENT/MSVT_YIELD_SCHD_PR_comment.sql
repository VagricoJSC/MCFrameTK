\encoding UTF-8

COMMENT ON VIEW msvt_yield_schd_pr IS '出来高予定進捗ビュー // Output schedule progress view';


COMMENT ON COLUMN msvt_yield_schd_pr.yield_schd_no IS '出来高予定ＮＯ // #MA.YIELD_SCHD_NO // Output schedule No.';


COMMENT ON COLUMN msvt_yield_schd_pr.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN msvt_yield_schd_pr.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_yield_schd_pr.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN msvt_yield_schd_pr.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN msvt_yield_schd_pr.yield_typ IS '出来高区分 // #MA.YIELD_TYP // Output type';


COMMENT ON COLUMN msvt_yield_schd_pr.trd_unit_yield_qty IS '取引単位出来高着手数量 // #MA.QTY // Transaction unit output remaining starting qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.trd_unit_yield_rem_qty IS '取引単位出来高残数量 // #MA.QTY // Transaction unit remaining output qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.trd_unit_yield_abort_qty IS '取引単位出来高打切数量 // #MA.QTY // Transaction unit cancelled remaining output qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.base_unit_yield_qty IS '基準単位出来高着手数量 // #MA.QTY // Base unit output start qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.base_unit_yield_rem_qty IS '基準単位出来高残数量 // #MA.QTY // Base unit remaining output qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.base_unit_yield_abort_qty IS '基準単位出来高打切数量 // #MA.QTY // Base unit cancelled remaining output qty.';


COMMENT ON COLUMN msvt_yield_schd_pr.stk_lst_prnt_flg IS '現品票発行済ＦＬＧ // #MA.FLG // Identification tag issued flg.';


COMMENT ON COLUMN msvt_yield_schd_pr.sub_char1 IS '予備１ // #MS.YIELD_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN msvt_yield_schd_pr.sub_char2 IS '予備２ // #MS.YIELD_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN msvt_yield_schd_pr.sub_char3 IS '予備３ // #MS.YIELD_ACT_REM_SUB_CHAR3 // Spare 3';

