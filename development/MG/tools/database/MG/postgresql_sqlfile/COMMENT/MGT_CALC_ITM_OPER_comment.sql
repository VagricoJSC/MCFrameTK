\encoding UTF-8

COMMENT ON VIEW mgt_calc_itm_oper IS '計算対象品目工程情報 // (Calculation) Item operation info.';


COMMENT ON COLUMN mgt_calc_itm_oper.calc_no IS '原価計算ＮＯ // #MA.CALC_NO // Calculation No.';


COMMENT ON COLUMN mgt_calc_itm_oper.calc_grp_cd IS '計算グループＣＤ // #MA.CALC_GRP_CD // Calculation group cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.itm_cd IS '品目ＣＤ // #MA.ITM_CD // Item cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.itm_sub1 IS '枝番１ // #MA.ITM_SUB1 // Branch No. 1';


COMMENT ON COLUMN mgt_calc_itm_oper.itm_sub2 IS '枝番２ // #MA.ITM_SUB2 // Branch No. 2';


COMMENT ON COLUMN mgt_calc_itm_oper.itm_sub3 IS '枝番３ // #MA.ITM_SUB3 // Branch No. 3';


COMMENT ON COLUMN mgt_calc_itm_oper.loc_cd IS '場所ＣＤ // #MA.LOC_CD // Location cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_ptn IS '工程パタン // #MA.OPER_PTN // Operation pattern';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_cd IS '工程ＣＤ // #MA.OPER_CD // Operation cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_seq IS '工程連番 // #MA.OPER_SEQ // Operation sequence number';


COMMENT ON COLUMN mgt_calc_itm_oper.wg_cd IS 'ワーキンググループＣＤ // #MA.WG_CD // WG cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.disp_seq IS '工順 // #MA.INT // Routing';


COMMENT ON COLUMN mgt_calc_itm_oper.nmr_qty IS '歩留製造数量 // #MA.QTY // Yield mfg. qty.';


COMMENT ON COLUMN mgt_calc_itm_oper.dnm_qty IS '理論製造数量 // #MA.QTY // Ideal mfg. qty.';


COMMENT ON COLUMN mgt_calc_itm_oper.yield_oper_flg IS '出来高計上工程ＦＬＧ // #MA.FLG // Create inventory flg.';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_unit_cd IS '工程管理単位ＣＤ // #MA.UNIT_CD // Operation management unit cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_std_qty IS '工程基準単位数量 // #MA.QTY // Operation base unit qty.';


COMMENT ON COLUMN mgt_calc_itm_oper.oper_conv_qty IS '工程換算単位数量 // #MA.QTY // Operation conversion unit qty.';


COMMENT ON COLUMN mgt_calc_itm_oper.dec_place IS '小数部有効桁数 // #MA.DEC_PLACE // Number of decimal places';


COMMENT ON COLUMN mgt_calc_itm_oper.unit_conv_rnd_typ IS '換算端数処理区分 // #MA.RND_TYP // Rounding type (Conversion)';


COMMENT ON COLUMN mgt_calc_itm_oper.calc_ctg_cd IS '計算カテゴリＣＤ // #MA.CALC_CTG_CD // Calculation category cd.';


COMMENT ON COLUMN mgt_calc_itm_oper.rmrks IS '備考 // #MG.CALC_ITM_OPER_RMRKS // Remarks';


COMMENT ON COLUMN mgt_calc_itm_oper.sub_char1 IS '予備１ // #MG.CALC_ITM_OPER_SUB_CHAR1 // Spare 1';


COMMENT ON COLUMN mgt_calc_itm_oper.sub_char2 IS '予備２ // #MG.CALC_ITM_OPER_SUB_CHAR2 // Spare 2';


COMMENT ON COLUMN mgt_calc_itm_oper.sub_char3 IS '予備３ // #MG.CALC_ITM_OPER_SUB_CHAR3 // Spare 3';

