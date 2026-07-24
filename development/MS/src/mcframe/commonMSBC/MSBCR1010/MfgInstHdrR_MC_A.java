package mcframe.commonMSBC.MSBCR1010;

import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"MfgInstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstHdrR_MC_A extends MCConstRow {

	/**
	 *  帳票名.<p>
	 *
	 */
	public static final String $form_name = "form_name";
	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 *  バーコード.<p>
	 *
	 */
	public static final String $mfg_inst_no_bd = "mfg_inst_no_bd";
	/**
	 *  工程バーコード.<p>
	 *
	 */
	public static final String $oper_inst_no_bd = "oper_inst_no_bd";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  工程.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 *  工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	/**
	 *  工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 *  工順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  工程場所.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 *  工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 *  工程棚・ライン.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 *  工程棚・ライン名.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public static final String $st_schd_hm = "st_schd_hm";
	/**
	 *  工程終了予定日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
	/**
	 *  工程終了予定時刻.<p>
	 *
	 */
	public static final String $end_schd_hm = "end_schd_hm";
	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public static final String $oper_num = "oper_num";
	/**
	 *  工程単位指図数文字列.<p>
	 *
	 */
	public static final String $s_oper_num = "s_oper_num";
	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public static final String $oper_inst_usr_cd = "oper_inst_usr_cd";
	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public static final String $oper_inst_usr_nm = "oper_inst_usr_nm";
	/**
	 *  工程収率（ラベル）.<p>
	 *
	 */
	public static final String $oper_yield_lbl = "oper_yield_lbl";
	/**
	 *  工程下限収率（ラベル）.<p>
	 *
	 */
	public static final String $oper_lower_yield_lbl = "oper_lower_yield_lbl";
	/**
	 *  工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 *  工程標準収率（ラベル）.<p>
	 *
	 */
	public static final String $oper_std_yield_lbl = "oper_std_yield_lbl";
	/**
	 *  工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 *  工程上限収率（ラベル）.<p>
	 *
	 */
	public static final String $oper_upper_yield_lbl = "oper_upper_yield_lbl";
	/**
	 *  工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 *  指図部門.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  製造場所.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 *  製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	/**
	 *  製造指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	/**
	 *  品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public static final String $sno1_view = "sno1_view";
	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public static final String $sno2_view = "sno2_view";
	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public static final String $sno3_view = "sno3_view";
	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public static final String $sno4_view = "sno4_view";
	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public static final String $sno1_data = "sno1_data";
	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public static final String $sno2_data = "sno2_data";
	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public static final String $sno3_data = "sno3_data";
	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public static final String $sno4_data = "sno4_data";
	/**
	 *  品目収率（ラベル）.<p>
	 *
	 */
	public static final String $itm_yield_lbl = "itm_yield_lbl";
	/**
	 *  品目下限収率（ラベル）.<p>
	 *
	 */
	public static final String $itm_lower_yield_lbl = "itm_lower_yield_lbl";
	/**
	 *  品目下限収率.<p>
	 *
	 */
	public static final String $itm_lower_yield = "itm_lower_yield";
	/**
	 *  品目標準収率（ラベル）.<p>
	 *
	 */
	public static final String $itm_std_yield_lbl = "itm_std_yield_lbl";
	/**
	 *  品目標準収率.<p>
	 *
	 */
	public static final String $itm_std_yield = "itm_std_yield";
	/**
	 *  品目上限収率（ラベル）.<p>
	 *
	 */
	public static final String $itm_upper_yield_lbl = "itm_upper_yield_lbl";
	/**
	 *  品目上限収率.<p>
	 *
	 */
	public static final String $itm_upper_yield = "itm_upper_yield";
	/**
	 *  表示期限.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
	/**
	 *  構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 *  工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 *  ロットＮＯ(表示).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ(表示).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  製造指図数量.<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	/**
	 *  製造指図数量文字列.<p>
	 *
	 */
	public static final String $s_base_unit_inst_qty = "s_base_unit_inst_qty";
	/**
	 *  単位（製造指図）.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  単位名（製造指図）.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  着手予定日.<p>
	 *
	 */
	public static final String $prod_st_dt = "prod_st_dt";
	/**
	 *  着手予定時刻.<p>
	 *
	 */
	public static final String $prod_st_hm = "prod_st_hm";
	/**
	 *  終了予定日.<p>
	 *
	 */
	public static final String $prod_end_dt = "prod_end_dt";
	/**
	 *  終了予定時刻.<p>
	 *
	 */
	public static final String $prod_end_hm = "prod_end_hm";
	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 *  製造指図予備１.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char1 = "mfg_inst_sub_char1";
	/**
	 *  製造指図予備２.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char2 = "mfg_inst_sub_char2";
	/**
	 *  製造指図予備３.<p>
	 *
	 */
	public static final String $mfg_inst_sub_char3 = "mfg_inst_sub_char3";
	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public static final String $oper_inst_sub_char1 = "oper_inst_sub_char1";
	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public static final String $oper_inst_sub_char2 = "oper_inst_sub_char2";
	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public static final String $oper_inst_sub_char3 = "oper_inst_sub_char3";


	public static final MCMeta form_name_META = createStringMeta($form_name);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta mfg_inst_no_bd_META = createStringMeta($mfg_inst_no_bd);
	public static final MCMeta oper_inst_no_bd_META = createStringMeta($oper_inst_no_bd);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_META = createCommonMeta($st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_META = createCommonMeta($end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_num_META = createCommonMeta($oper_num, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_oper_num_META = createStringMeta($s_oper_num);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_inst_usr_cd_META = createCommonMeta($oper_inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_ID);
	public static final MCMeta oper_inst_usr_nm_META = createCommonMeta($oper_inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta oper_yield_lbl_META = createStringMeta($oper_yield_lbl);
	public static final MCMeta oper_lower_yield_lbl_META = createStringMeta($oper_lower_yield_lbl);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_lbl_META = createStringMeta($oper_std_yield_lbl);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_lbl_META = createStringMeta($oper_upper_yield_lbl);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta sno1_view_META = createCommonMeta($sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_view_META = createCommonMeta($sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_view_META = createCommonMeta($sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_view_META = createCommonMeta($sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno1_data_META = createCommonMeta($sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_data_META = createCommonMeta($sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_data_META = createCommonMeta($sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_data_META = createCommonMeta($sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_yield_lbl_META = createStringMeta($itm_yield_lbl);
	public static final MCMeta itm_lower_yield_lbl_META = createStringMeta($itm_lower_yield_lbl);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_lbl_META = createStringMeta($itm_std_yield_lbl);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_lbl_META = createStringMeta($itm_upper_yield_lbl);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta disp_pd_META = createCommonMeta($disp_pd, mcframe.commonMS.meta.MS_META.DISP_PD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_inst_qty_META = createStringMeta($s_base_unit_inst_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prod_st_dt_META = createCommonMeta($prod_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prod_st_hm_META = createCommonMeta($prod_st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta prod_end_dt_META = createCommonMeta($prod_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prod_end_hm_META = createCommonMeta($prod_end_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_sub_char1_META = createCommonMeta($mfg_inst_sub_char1, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR1);
	public static final MCMeta mfg_inst_sub_char2_META = createCommonMeta($mfg_inst_sub_char2, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR2);
	public static final MCMeta mfg_inst_sub_char3_META = createCommonMeta($mfg_inst_sub_char3, mcframe.commonMS.meta.MS_META.MFG_INST_SUB_CHAR3);
	public static final MCMeta oper_inst_sub_char1_META = createCommonMeta($oper_inst_sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char2_META = createCommonMeta($oper_inst_sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR2);
	public static final MCMeta oper_inst_sub_char3_META = createCommonMeta($oper_inst_sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR3);

	protected static final ConstMetaList<MfgInstHdrR> constMetas = new ConstMetaList<MfgInstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			form_name_META,
			mfg_inst_no_META,
			mfg_inst_rev_META,
			oper_inst_no_META,
			mfg_inst_no_bd_META,
			oper_inst_no_bd_META,
			prnt_tm_META,
			oper_cd_META,
			oper_nm_META,
			oper_seq_META,
			disp_seq_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			st_schd_dt_META,
			st_schd_hm_META,
			end_schd_dt_META,
			end_schd_hm_META,
			oper_num_META,
			s_oper_num_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_inst_usr_cd_META,
			oper_inst_usr_nm_META,
			oper_yield_lbl_META,
			oper_lower_yield_lbl_META,
			oper_lower_yield_META,
			oper_std_yield_lbl_META,
			oper_std_yield_META,
			oper_upper_yield_lbl_META,
			oper_upper_yield_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			inst_dt_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub2_view_META,
			itm_sub3_view_META,
			itm_sub1_data_META,
			itm_sub2_data_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			sno1_view_META,
			sno2_view_META,
			sno3_view_META,
			sno4_view_META,
			sno1_data_META,
			sno2_data_META,
			sno3_data_META,
			sno4_data_META,
			itm_yield_lbl_META,
			itm_lower_yield_lbl_META,
			itm_lower_yield_META,
			itm_std_yield_lbl_META,
			itm_std_yield_META,
			itm_upper_yield_lbl_META,
			itm_upper_yield_META,
			disp_pd_META,
			bom_ptn_META,
			oper_ptn_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_view_META,
			sublot_no_data_META,
			base_unit_inst_qty_META,
			s_base_unit_inst_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			prod_st_dt_META,
			prod_st_hm_META,
			prod_end_dt_META,
			prod_end_hm_META,
			itm_ord_no_META,
			mfg_inst_sub_char1_META,
			mfg_inst_sub_char2_META,
			mfg_inst_sub_char3_META,
			oper_inst_sub_char1_META,
			oper_inst_sub_char2_META,
			oper_inst_sub_char3_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * コンストラクタです。
	 */
	protected MfgInstHdrR_MC_A(ConstMetaList<? extends MfgInstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstHdrR clone() {
		return (MfgInstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstHdrR createInstance() {
		return (MfgInstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstHdrR getValues(String... names) {
		return (MfgInstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  帳票名.<p>
	 *
	 */
	public String form_name() {
		return getConstString(offset + 0, $form_name);
	}

	/**
	 *  帳票名.<p>
	 *
	 */
	public void form_name(String value) {
		setConstString(offset + 0, $form_name, value);
	}


	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 *  製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}


	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 2, $mfg_inst_rev);
	}

	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 2, $mfg_inst_rev, value);
	}

	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 2, $mfg_inst_rev, value);
	}

	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 2, $mfg_inst_rev, value);
	}

	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 2, $mfg_inst_rev, value);
	}

	/**
	 *  製造指図改訂番号.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 2, $mfg_inst_rev, value);
	}


	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 3, $oper_inst_no);
	}

	/**
	 *  工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 3, $oper_inst_no, value);
	}


	/**
	 *  バーコード.<p>
	 *
	 */
	public String mfg_inst_no_bd() {
		return getConstString(offset + 4, $mfg_inst_no_bd);
	}

	/**
	 *  バーコード.<p>
	 *
	 */
	public void mfg_inst_no_bd(String value) {
		setConstString(offset + 4, $mfg_inst_no_bd, value);
	}


	/**
	 *  工程バーコード.<p>
	 *
	 */
	public String oper_inst_no_bd() {
		return getConstString(offset + 5, $oper_inst_no_bd);
	}

	/**
	 *  工程バーコード.<p>
	 *
	 */
	public void oper_inst_no_bd(String value) {
		setConstString(offset + 5, $oper_inst_no_bd, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 6, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 6, $prnt_tm, value);
	}


	/**
	 *  工程.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 7, $oper_cd);
	}

	/**
	 *  工程.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 7, $oper_cd, value);
	}


	/**
	 *  工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 8, $oper_nm);
	}

	/**
	 *  工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 8, $oper_nm, value);
	}


	/**
	 *  工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 9, $oper_seq);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}

	/**
	 *  工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}


	/**
	 *  工順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 10, $disp_seq);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 10, $disp_seq, value);
	}


	/**
	 *  工程場所.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 11, $oper_loc_cd);
	}

	/**
	 *  工程場所.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 11, $oper_loc_cd, value);
	}


	/**
	 *  工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 12, $oper_loc_nm);
	}

	/**
	 *  工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 12, $oper_loc_nm, value);
	}


	/**
	 *  工程棚・ライン.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 13, $oper_str_ln_cd);
	}

	/**
	 *  工程棚・ライン.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 13, $oper_str_ln_cd, value);
	}


	/**
	 *  工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 14, $oper_str_ln_nm);
	}

	/**
	 *  工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 14, $oper_str_ln_nm, value);
	}


	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 15, $st_schd_dt);
	}

	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 15, $st_schd_dt, value);
	}


	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return getConstDate(offset + 16, $st_schd_hm);
	}

	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		setConstDate(offset + 16, $st_schd_hm, value);
	}


	/**
	 *  工程終了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 17, $end_schd_dt);
	}

	/**
	 *  工程終了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 17, $end_schd_dt, value);
	}


	/**
	 *  工程終了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return getConstDate(offset + 18, $end_schd_hm);
	}

	/**
	 *  工程終了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		setConstDate(offset + 18, $end_schd_hm, value);
	}


	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public MCNumber oper_num() {
		return getConstNumber(offset + 19, $oper_num);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_num(MCNumber value) {
		setConstNumber(offset + 19, $oper_num, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_num(int value) {
		setConstNumber(offset + 19, $oper_num, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_num(long value) {
		setConstNumber(offset + 19, $oper_num, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_num(float value) {
		setConstNumber(offset + 19, $oper_num, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_num(double value) {
		setConstNumber(offset + 19, $oper_num, value);
	}


	/**
	 *  工程単位指図数文字列.<p>
	 *
	 */
	public String s_oper_num() {
		return getConstString(offset + 20, $s_oper_num);
	}

	/**
	 *  工程単位指図数文字列.<p>
	 *
	 */
	public void s_oper_num(String value) {
		setConstString(offset + 20, $s_oper_num, value);
	}


	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 21, $oper_unit_cd);
	}

	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 21, $oper_unit_cd, value);
	}


	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 22, $oper_unit_nm);
	}

	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 22, $oper_unit_nm, value);
	}


	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public String oper_inst_usr_cd() {
		return getConstString(offset + 23, $oper_inst_usr_cd);
	}

	/**
	 *  工程指図担当者.<p>
	 *
	 */
	public void oper_inst_usr_cd(String value) {
		setConstString(offset + 23, $oper_inst_usr_cd, value);
	}


	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public String oper_inst_usr_nm() {
		return getConstString(offset + 24, $oper_inst_usr_nm);
	}

	/**
	 *  工程指図担当者名.<p>
	 *
	 */
	public void oper_inst_usr_nm(String value) {
		setConstString(offset + 24, $oper_inst_usr_nm, value);
	}


	/**
	 *  工程収率（ラベル）.<p>
	 *
	 */
	public String oper_yield_lbl() {
		return getConstString(offset + 25, $oper_yield_lbl);
	}

	/**
	 *  工程収率（ラベル）.<p>
	 *
	 */
	public void oper_yield_lbl(String value) {
		setConstString(offset + 25, $oper_yield_lbl, value);
	}


	/**
	 *  工程下限収率（ラベル）.<p>
	 *
	 */
	public String oper_lower_yield_lbl() {
		return getConstString(offset + 26, $oper_lower_yield_lbl);
	}

	/**
	 *  工程下限収率（ラベル）.<p>
	 *
	 */
	public void oper_lower_yield_lbl(String value) {
		setConstString(offset + 26, $oper_lower_yield_lbl, value);
	}


	/**
	 *  工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 27, $oper_lower_yield);
	}

	/**
	 *  工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 27, $oper_lower_yield, value);
	}

	/**
	 *  工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 27, $oper_lower_yield, value);
	}

	/**
	 *  工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 27, $oper_lower_yield, value);
	}

	/**
	 *  工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 27, $oper_lower_yield, value);
	}

	/**
	 *  工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 27, $oper_lower_yield, value);
	}


	/**
	 *  工程標準収率（ラベル）.<p>
	 *
	 */
	public String oper_std_yield_lbl() {
		return getConstString(offset + 28, $oper_std_yield_lbl);
	}

	/**
	 *  工程標準収率（ラベル）.<p>
	 *
	 */
	public void oper_std_yield_lbl(String value) {
		setConstString(offset + 28, $oper_std_yield_lbl, value);
	}


	/**
	 *  工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 29, $oper_std_yield);
	}

	/**
	 *  工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 29, $oper_std_yield, value);
	}

	/**
	 *  工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 29, $oper_std_yield, value);
	}

	/**
	 *  工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 29, $oper_std_yield, value);
	}

	/**
	 *  工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 29, $oper_std_yield, value);
	}

	/**
	 *  工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 29, $oper_std_yield, value);
	}


	/**
	 *  工程上限収率（ラベル）.<p>
	 *
	 */
	public String oper_upper_yield_lbl() {
		return getConstString(offset + 30, $oper_upper_yield_lbl);
	}

	/**
	 *  工程上限収率（ラベル）.<p>
	 *
	 */
	public void oper_upper_yield_lbl(String value) {
		setConstString(offset + 30, $oper_upper_yield_lbl, value);
	}


	/**
	 *  工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 31, $oper_upper_yield);
	}

	/**
	 *  工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 *  工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 *  工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 *  工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}

	/**
	 *  工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 31, $oper_upper_yield, value);
	}


	/**
	 *  指図部門.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 32, $inst_dpt_cd);
	}

	/**
	 *  指図部門.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 32, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 33, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 33, $inst_dpt_nm, value);
	}


	/**
	 *  製造場所.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 34, $mfg_loc_cd);
	}

	/**
	 *  製造場所.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 34, $mfg_loc_cd, value);
	}


	/**
	 *  製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 35, $mfg_loc_nm);
	}

	/**
	 *  製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 35, $mfg_loc_nm, value);
	}


	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 36, $mfg_str_ln_cd);
	}

	/**
	 *  製造棚・ライン.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 36, $mfg_str_ln_cd, value);
	}


	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 37, $mfg_str_ln_nm);
	}

	/**
	 *  製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 37, $mfg_str_ln_nm, value);
	}


	/**
	 *  製造指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 38, $inst_dt);
	}

	/**
	 *  製造指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 38, $inst_dt, value);
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 39, $itm_cd);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 39, $itm_cd, value);
	}


	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 40, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 40, $itm_sub1_view, value);
	}


	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 41, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 41, $itm_sub2_view, value);
	}


	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 42, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 42, $itm_sub3_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 43, $itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 43, $itm_sub1_data, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 44, $itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 44, $itm_sub2_data, value);
	}


	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 45, $itm_sub3_data);
	}

	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 45, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 46, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 46, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 47, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 47, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 48, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 48, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 49, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 49, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 50, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 50, $itm_alt_nm4, value);
	}


	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public String sno1_view() {
		return getConstString(offset + 51, $sno1_view);
	}

	/**
	 *  手配ＮＯ１(表示).<p>
	 *
	 */
	public void sno1_view(String value) {
		setConstString(offset + 51, $sno1_view, value);
	}


	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public String sno2_view() {
		return getConstString(offset + 52, $sno2_view);
	}

	/**
	 *  手配ＮＯ２(表示).<p>
	 *
	 */
	public void sno2_view(String value) {
		setConstString(offset + 52, $sno2_view, value);
	}


	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public String sno3_view() {
		return getConstString(offset + 53, $sno3_view);
	}

	/**
	 *  手配ＮＯ３(表示).<p>
	 *
	 */
	public void sno3_view(String value) {
		setConstString(offset + 53, $sno3_view, value);
	}


	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public String sno4_view() {
		return getConstString(offset + 54, $sno4_view);
	}

	/**
	 *  手配ＮＯ４(表示).<p>
	 *
	 */
	public void sno4_view(String value) {
		setConstString(offset + 54, $sno4_view, value);
	}


	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public String sno1_data() {
		return getConstString(offset + 55, $sno1_data);
	}

	/**
	 *  手配ＮＯ１(データ).<p>
	 *
	 */
	public void sno1_data(String value) {
		setConstString(offset + 55, $sno1_data, value);
	}


	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public String sno2_data() {
		return getConstString(offset + 56, $sno2_data);
	}

	/**
	 *  手配ＮＯ２(データ).<p>
	 *
	 */
	public void sno2_data(String value) {
		setConstString(offset + 56, $sno2_data, value);
	}


	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public String sno3_data() {
		return getConstString(offset + 57, $sno3_data);
	}

	/**
	 *  手配ＮＯ３(データ).<p>
	 *
	 */
	public void sno3_data(String value) {
		setConstString(offset + 57, $sno3_data, value);
	}


	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public String sno4_data() {
		return getConstString(offset + 58, $sno4_data);
	}

	/**
	 *  手配ＮＯ４(データ).<p>
	 *
	 */
	public void sno4_data(String value) {
		setConstString(offset + 58, $sno4_data, value);
	}


	/**
	 *  品目収率（ラベル）.<p>
	 *
	 */
	public String itm_yield_lbl() {
		return getConstString(offset + 59, $itm_yield_lbl);
	}

	/**
	 *  品目収率（ラベル）.<p>
	 *
	 */
	public void itm_yield_lbl(String value) {
		setConstString(offset + 59, $itm_yield_lbl, value);
	}


	/**
	 *  品目下限収率（ラベル）.<p>
	 *
	 */
	public String itm_lower_yield_lbl() {
		return getConstString(offset + 60, $itm_lower_yield_lbl);
	}

	/**
	 *  品目下限収率（ラベル）.<p>
	 *
	 */
	public void itm_lower_yield_lbl(String value) {
		setConstString(offset + 60, $itm_lower_yield_lbl, value);
	}


	/**
	 *  品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 61, $itm_lower_yield);
	}

	/**
	 *  品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 61, $itm_lower_yield, value);
	}

	/**
	 *  品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 61, $itm_lower_yield, value);
	}

	/**
	 *  品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 61, $itm_lower_yield, value);
	}

	/**
	 *  品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 61, $itm_lower_yield, value);
	}

	/**
	 *  品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 61, $itm_lower_yield, value);
	}


	/**
	 *  品目標準収率（ラベル）.<p>
	 *
	 */
	public String itm_std_yield_lbl() {
		return getConstString(offset + 62, $itm_std_yield_lbl);
	}

	/**
	 *  品目標準収率（ラベル）.<p>
	 *
	 */
	public void itm_std_yield_lbl(String value) {
		setConstString(offset + 62, $itm_std_yield_lbl, value);
	}


	/**
	 *  品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 63, $itm_std_yield);
	}

	/**
	 *  品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 63, $itm_std_yield, value);
	}

	/**
	 *  品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 63, $itm_std_yield, value);
	}

	/**
	 *  品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 63, $itm_std_yield, value);
	}

	/**
	 *  品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 63, $itm_std_yield, value);
	}

	/**
	 *  品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 63, $itm_std_yield, value);
	}


	/**
	 *  品目上限収率（ラベル）.<p>
	 *
	 */
	public String itm_upper_yield_lbl() {
		return getConstString(offset + 64, $itm_upper_yield_lbl);
	}

	/**
	 *  品目上限収率（ラベル）.<p>
	 *
	 */
	public void itm_upper_yield_lbl(String value) {
		setConstString(offset + 64, $itm_upper_yield_lbl, value);
	}


	/**
	 *  品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 65, $itm_upper_yield);
	}

	/**
	 *  品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 65, $itm_upper_yield, value);
	}

	/**
	 *  品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 65, $itm_upper_yield, value);
	}

	/**
	 *  品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 65, $itm_upper_yield, value);
	}

	/**
	 *  品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 65, $itm_upper_yield, value);
	}

	/**
	 *  品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 65, $itm_upper_yield, value);
	}


	/**
	 *  表示期限.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 66, $disp_pd);
	}

	/**
	 *  表示期限.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 66, $disp_pd, value);
	}


	/**
	 *  構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 67, $bom_ptn);
	}

	/**
	 *  構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 67, $bom_ptn, value);
	}


	/**
	 *  工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 68, $oper_ptn);
	}

	/**
	 *  工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 68, $oper_ptn, value);
	}


	/**
	 *  ロットＮＯ(表示).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 69, $lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 69, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 70, $lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 70, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ(表示).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 71, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ(表示).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 71, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 72, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 72, $sublot_no_data, value);
	}


	/**
	 *  製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 73, $base_unit_inst_qty);
	}

	/**
	 *  製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 73, $base_unit_inst_qty, value);
	}

	/**
	 *  製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 73, $base_unit_inst_qty, value);
	}

	/**
	 *  製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 73, $base_unit_inst_qty, value);
	}

	/**
	 *  製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 73, $base_unit_inst_qty, value);
	}

	/**
	 *  製造指図数量.<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 73, $base_unit_inst_qty, value);
	}


	/**
	 *  製造指図数量文字列.<p>
	 *
	 */
	public String s_base_unit_inst_qty() {
		return getConstString(offset + 74, $s_base_unit_inst_qty);
	}

	/**
	 *  製造指図数量文字列.<p>
	 *
	 */
	public void s_base_unit_inst_qty(String value) {
		setConstString(offset + 74, $s_base_unit_inst_qty, value);
	}


	/**
	 *  単位（製造指図）.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 75, $base_unit_cd);
	}

	/**
	 *  単位（製造指図）.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 75, $base_unit_cd, value);
	}


	/**
	 *  単位名（製造指図）.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 76, $base_unit_nm);
	}

	/**
	 *  単位名（製造指図）.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 76, $base_unit_nm, value);
	}


	/**
	 *  着手予定日.<p>
	 *
	 */
	public MCDate prod_st_dt() {
		return getConstDate(offset + 77, $prod_st_dt);
	}

	/**
	 *  着手予定日.<p>
	 *
	 */
	public void prod_st_dt(MCDate value) {
		setConstDate(offset + 77, $prod_st_dt, value);
	}


	/**
	 *  着手予定時刻.<p>
	 *
	 */
	public MCDate prod_st_hm() {
		return getConstDate(offset + 78, $prod_st_hm);
	}

	/**
	 *  着手予定時刻.<p>
	 *
	 */
	public void prod_st_hm(MCDate value) {
		setConstDate(offset + 78, $prod_st_hm, value);
	}


	/**
	 *  終了予定日.<p>
	 *
	 */
	public MCDate prod_end_dt() {
		return getConstDate(offset + 79, $prod_end_dt);
	}

	/**
	 *  終了予定日.<p>
	 *
	 */
	public void prod_end_dt(MCDate value) {
		setConstDate(offset + 79, $prod_end_dt, value);
	}


	/**
	 *  終了予定時刻.<p>
	 *
	 */
	public MCDate prod_end_hm() {
		return getConstDate(offset + 80, $prod_end_hm);
	}

	/**
	 *  終了予定時刻.<p>
	 *
	 */
	public void prod_end_hm(MCDate value) {
		setConstDate(offset + 80, $prod_end_hm, value);
	}


	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 81, $itm_ord_no);
	}

	/**
	 *  品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 81, $itm_ord_no, value);
	}


	/**
	 *  製造指図予備１.<p>
	 *
	 */
	public String mfg_inst_sub_char1() {
		return getConstString(offset + 82, $mfg_inst_sub_char1);
	}

	/**
	 *  製造指図予備１.<p>
	 *
	 */
	public void mfg_inst_sub_char1(String value) {
		setConstString(offset + 82, $mfg_inst_sub_char1, value);
	}


	/**
	 *  製造指図予備２.<p>
	 *
	 */
	public String mfg_inst_sub_char2() {
		return getConstString(offset + 83, $mfg_inst_sub_char2);
	}

	/**
	 *  製造指図予備２.<p>
	 *
	 */
	public void mfg_inst_sub_char2(String value) {
		setConstString(offset + 83, $mfg_inst_sub_char2, value);
	}


	/**
	 *  製造指図予備３.<p>
	 *
	 */
	public String mfg_inst_sub_char3() {
		return getConstString(offset + 84, $mfg_inst_sub_char3);
	}

	/**
	 *  製造指図予備３.<p>
	 *
	 */
	public void mfg_inst_sub_char3(String value) {
		setConstString(offset + 84, $mfg_inst_sub_char3, value);
	}


	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public String oper_inst_sub_char1() {
		return getConstString(offset + 85, $oper_inst_sub_char1);
	}

	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public void oper_inst_sub_char1(String value) {
		setConstString(offset + 85, $oper_inst_sub_char1, value);
	}


	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public String oper_inst_sub_char2() {
		return getConstString(offset + 86, $oper_inst_sub_char2);
	}

	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public void oper_inst_sub_char2(String value) {
		setConstString(offset + 86, $oper_inst_sub_char2, value);
	}


	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public String oper_inst_sub_char3() {
		return getConstString(offset + 87, $oper_inst_sub_char3);
	}

	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public void oper_inst_sub_char3(String value) {
		setConstString(offset + 87, $oper_inst_sub_char3, value);
	}


	public String getString(String name) {
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no_bd.equalsIgnoreCase(name)) {
			return mfg_inst_no_bd();
		}
		if ($oper_inst_no_bd.equalsIgnoreCase(name)) {
			return oper_inst_no_bd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($s_oper_num.equalsIgnoreCase(name)) {
			return s_oper_num();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			return oper_inst_usr_cd();
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			return oper_inst_usr_nm();
		}
		if ($oper_yield_lbl.equalsIgnoreCase(name)) {
			return oper_yield_lbl();
		}
		if ($oper_lower_yield_lbl.equalsIgnoreCase(name)) {
			return oper_lower_yield_lbl();
		}
		if ($oper_std_yield_lbl.equalsIgnoreCase(name)) {
			return oper_std_yield_lbl();
		}
		if ($oper_upper_yield_lbl.equalsIgnoreCase(name)) {
			return oper_upper_yield_lbl();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($itm_yield_lbl.equalsIgnoreCase(name)) {
			return itm_yield_lbl();
		}
		if ($itm_lower_yield_lbl.equalsIgnoreCase(name)) {
			return itm_lower_yield_lbl();
		}
		if ($itm_std_yield_lbl.equalsIgnoreCase(name)) {
			return itm_std_yield_lbl();
		}
		if ($itm_upper_yield_lbl.equalsIgnoreCase(name)) {
			return itm_upper_yield_lbl();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_base_unit_inst_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char1();
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char2();
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char3();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			return oper_num();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($prod_st_dt.equalsIgnoreCase(name)) {
			return prod_st_dt();
		}
		if ($prod_st_hm.equalsIgnoreCase(name)) {
			return prod_st_hm();
		}
		if ($prod_end_dt.equalsIgnoreCase(name)) {
			return prod_end_dt();
		}
		if ($prod_end_hm.equalsIgnoreCase(name)) {
			return prod_end_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($form_name.equalsIgnoreCase(name)) {
			return form_name();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($mfg_inst_no_bd.equalsIgnoreCase(name)) {
			return mfg_inst_no_bd();
		}
		if ($oper_inst_no_bd.equalsIgnoreCase(name)) {
			return oper_inst_no_bd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($s_oper_num.equalsIgnoreCase(name)) {
			return s_oper_num();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			return oper_inst_usr_cd();
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			return oper_inst_usr_nm();
		}
		if ($oper_yield_lbl.equalsIgnoreCase(name)) {
			return oper_yield_lbl();
		}
		if ($oper_lower_yield_lbl.equalsIgnoreCase(name)) {
			return oper_lower_yield_lbl();
		}
		if ($oper_std_yield_lbl.equalsIgnoreCase(name)) {
			return oper_std_yield_lbl();
		}
		if ($oper_upper_yield_lbl.equalsIgnoreCase(name)) {
			return oper_upper_yield_lbl();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($itm_yield_lbl.equalsIgnoreCase(name)) {
			return itm_yield_lbl();
		}
		if ($itm_lower_yield_lbl.equalsIgnoreCase(name)) {
			return itm_lower_yield_lbl();
		}
		if ($itm_std_yield_lbl.equalsIgnoreCase(name)) {
			return itm_std_yield_lbl();
		}
		if ($itm_upper_yield_lbl.equalsIgnoreCase(name)) {
			return itm_upper_yield_lbl();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_base_unit_inst_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char1();
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char2();
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			return mfg_inst_sub_char3();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			return oper_num();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($prod_st_dt.equalsIgnoreCase(name)) {
			return prod_st_dt();
		}
		if ($prod_st_hm.equalsIgnoreCase(name)) {
			return prod_st_hm();
		}
		if ($prod_end_dt.equalsIgnoreCase(name)) {
			return prod_end_dt();
		}
		if ($prod_end_hm.equalsIgnoreCase(name)) {
			return prod_end_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no_bd.equalsIgnoreCase(name)) {
			mfg_inst_no_bd(value);
			return;
		}
		if ($oper_inst_no_bd.equalsIgnoreCase(name)) {
			oper_inst_no_bd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($s_oper_num.equalsIgnoreCase(name)) {
			s_oper_num(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			oper_inst_usr_cd(value);
			return;
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			oper_inst_usr_nm(value);
			return;
		}
		if ($oper_yield_lbl.equalsIgnoreCase(name)) {
			oper_yield_lbl(value);
			return;
		}
		if ($oper_lower_yield_lbl.equalsIgnoreCase(name)) {
			oper_lower_yield_lbl(value);
			return;
		}
		if ($oper_std_yield_lbl.equalsIgnoreCase(name)) {
			oper_std_yield_lbl(value);
			return;
		}
		if ($oper_upper_yield_lbl.equalsIgnoreCase(name)) {
			oper_upper_yield_lbl(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($itm_yield_lbl.equalsIgnoreCase(name)) {
			itm_yield_lbl(value);
			return;
		}
		if ($itm_lower_yield_lbl.equalsIgnoreCase(name)) {
			itm_lower_yield_lbl(value);
			return;
		}
		if ($itm_std_yield_lbl.equalsIgnoreCase(name)) {
			itm_std_yield_lbl(value);
			return;
		}
		if ($itm_upper_yield_lbl.equalsIgnoreCase(name)) {
			itm_upper_yield_lbl(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($s_base_unit_inst_qty.equalsIgnoreCase(name)) {
			s_base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			mfg_inst_sub_char1(value);
			return;
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			mfg_inst_sub_char2(value);
			return;
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			mfg_inst_sub_char3(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($prod_st_dt.equalsIgnoreCase(name)) {
			prod_st_dt(value);
			return;
		}
		if ($prod_st_hm.equalsIgnoreCase(name)) {
			prod_st_hm(value);
			return;
		}
		if ($prod_end_dt.equalsIgnoreCase(name)) {
			prod_end_dt(value);
			return;
		}
		if ($prod_end_hm.equalsIgnoreCase(name)) {
			prod_end_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($form_name.equalsIgnoreCase(name)) {
			form_name(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($mfg_inst_no_bd.equalsIgnoreCase(name)) {
			mfg_inst_no_bd(value);
			return;
		}
		if ($oper_inst_no_bd.equalsIgnoreCase(name)) {
			oper_inst_no_bd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
			return;
		}
		if ($s_oper_num.equalsIgnoreCase(name)) {
			s_oper_num(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($oper_inst_usr_cd.equalsIgnoreCase(name)) {
			oper_inst_usr_cd(value);
			return;
		}
		if ($oper_inst_usr_nm.equalsIgnoreCase(name)) {
			oper_inst_usr_nm(value);
			return;
		}
		if ($oper_yield_lbl.equalsIgnoreCase(name)) {
			oper_yield_lbl(value);
			return;
		}
		if ($oper_lower_yield_lbl.equalsIgnoreCase(name)) {
			oper_lower_yield_lbl(value);
			return;
		}
		if ($oper_std_yield_lbl.equalsIgnoreCase(name)) {
			oper_std_yield_lbl(value);
			return;
		}
		if ($oper_upper_yield_lbl.equalsIgnoreCase(name)) {
			oper_upper_yield_lbl(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($itm_yield_lbl.equalsIgnoreCase(name)) {
			itm_yield_lbl(value);
			return;
		}
		if ($itm_lower_yield_lbl.equalsIgnoreCase(name)) {
			itm_lower_yield_lbl(value);
			return;
		}
		if ($itm_std_yield_lbl.equalsIgnoreCase(name)) {
			itm_std_yield_lbl(value);
			return;
		}
		if ($itm_upper_yield_lbl.equalsIgnoreCase(name)) {
			itm_upper_yield_lbl(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($s_base_unit_inst_qty.equalsIgnoreCase(name)) {
			s_base_unit_inst_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_sub_char1.equalsIgnoreCase(name)) {
			mfg_inst_sub_char1(value);
			return;
		}
		if ($mfg_inst_sub_char2.equalsIgnoreCase(name)) {
			mfg_inst_sub_char2(value);
			return;
		}
		if ($mfg_inst_sub_char3.equalsIgnoreCase(name)) {
			mfg_inst_sub_char3(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_num.equalsIgnoreCase(name)) {
			oper_num(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($prod_st_dt.equalsIgnoreCase(name)) {
			prod_st_dt(value);
			return;
		}
		if ($prod_st_hm.equalsIgnoreCase(name)) {
			prod_st_hm(value);
			return;
		}
		if ($prod_end_dt.equalsIgnoreCase(name)) {
			prod_end_dt(value);
			return;
		}
		if ($prod_end_hm.equalsIgnoreCase(name)) {
			prod_end_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

