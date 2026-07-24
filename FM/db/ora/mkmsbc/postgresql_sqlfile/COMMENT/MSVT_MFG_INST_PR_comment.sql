\encoding UTF-8

COMMENT ON VIEW msvt_mfg_inst_pr IS '製造指図進捗ビュー // Mfg. order progress view';


COMMENT ON COLUMN msvt_mfg_inst_pr.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_pr.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN msvt_mfg_inst_pr.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN msvt_mfg_inst_pr.base_unit_mfg_qty IS '基準単位製造着手数量 // #MA.QTY // Base unit mfg. start qty.';


COMMENT ON COLUMN msvt_mfg_inst_pr.base_unit_mfg_rem_qty IS '基準単位製造残数量 // #MA.QTY // Base unit remaining mfg. qty.';


COMMENT ON COLUMN msvt_mfg_inst_pr.base_unit_mfg_abort_qty IS '基準単位製造打切数量 // #MA.QTY // Base unit cancelled remaining mfg. qty.';


COMMENT ON COLUMN msvt_mfg_inst_pr.sub_char1 IS '予備１ // #MS.MFG_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN msvt_mfg_inst_pr.sub_char2 IS '予備２ // #MS.MFG_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN msvt_mfg_inst_pr.sub_char3 IS '予備３ // #MS.MFG_ACT_REM_SUB_CHAR3 // Spare 3';

