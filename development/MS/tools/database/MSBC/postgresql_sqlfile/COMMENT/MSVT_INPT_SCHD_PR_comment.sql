\encoding UTF-8

COMMENT ON VIEW msvt_inpt_schd_pr IS '投入予定進捗ビュー // Input schedule progress view';


COMMENT ON COLUMN msvt_inpt_schd_pr.inpt_schd_no IS '投入予定ＮＯ // #MA.INPT_SCHD_NO // Input schedule No.';


COMMENT ON COLUMN msvt_inpt_schd_pr.mfg_sts_typ IS '製造状況区分 // #MS.MFG_STS_TYP // Mfg. status type';


COMMENT ON COLUMN msvt_inpt_schd_pr.mfg_inst_no IS '製造指図ＮＯ // #MA.MFG_INST_NO // Mfg. order No.';


COMMENT ON COLUMN msvt_inpt_schd_pr.itm_mfg_inst_no IS '品目製造指図ＮＯ // #MA.ITM_MFG_INST_NO // Item mfg. order No.';


COMMENT ON COLUMN msvt_inpt_schd_pr.oper_inst_no IS '工程指図ＮＯ // #MA.OPER_INST_NO // Operation order No.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_inpt_qty IS '基準単位投入着手数量 // #MA.QTY // Base unit input start qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_rqmt_qty IS '基準単位必要着手数量 // #MA.QTY // Base unit required start qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_fxd_rqmt_qty IS '基準単位固定必要着手数量 // #MA.QTY // Base unit fixed required qty. to start';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_inpt_rem_qty IS '基準単位投入残数量 // #MA.QTY // Base unit remaining input qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_rqmt_rem_qty IS '基準単位必要残数量 // #MA.QTY // Base unit required remaining qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_fxd_rqmt_rem_qty IS '基準単位固定必要残数量 // #MA.QTY // Remaining qty. of base unit fixed required qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.base_unit_inpt_abort_qty IS '基準単位投入打切数量 // #MA.QTY // Base unit cancelled remaining input qty.';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_inpt_qty IS '有効成分（投入着手数量） // #MA.CONT_QTY // Active ingredient (Input start qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_rqmt_qty IS '有効成分（必要着手数量） // #MA.CONT_QTY // Active ingredient (Required start qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_fxd_rqmt_qty IS '有効成分（固定必要着手数量） // #MA.CONT_QTY // Active ingredient (Fixed required qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_inpt_rem_qty IS '有効成分（投入残数量） // #MA.CONT_QTY // Active ingredient (Remaining input qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_rqmt_rem_qty IS '有効成分（必要残数量） // #MA.CONT_QTY // Active ingredient (Required remaining qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.cont_fxd_rqmt_rem_qty IS '有効成分（固定必要残数量） // #MA.CONT_QTY // Active ingredient (Remaining qty. of fixed required qty.)';


COMMENT ON COLUMN msvt_inpt_schd_pr.sub_char1 IS '予備１ // #MS.INPT_ACT_REM_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN msvt_inpt_schd_pr.sub_char2 IS '予備２ // #MS.INPT_ACT_REM_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN msvt_inpt_schd_pr.sub_char3 IS '予備３ // #MS.INPT_ACT_REM_SUB_CHAR3 // Spare 3';

