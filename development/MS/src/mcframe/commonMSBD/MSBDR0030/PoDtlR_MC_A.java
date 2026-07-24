package mcframe.commonMSBD.MSBDR0030;

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
 * ブロック"PoDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoDtlR_MC_A extends MCConstRow {

	/**
	 *  弊社品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  弊社品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  単位.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  打切数量.<p>
	 *
	 */
	public static final String $abort_qty = "abort_qty";
	/**
	 *  打切数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_abort_qty = "s_int_abort_qty";
	/**
	 *  打切数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_abort_qty = "s_dec_abort_qty";
	/**
	 *  基準単位.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public static final String $t_interim = "t_interim";
	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_upri = "s_int_trd_cur_upri";
	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_upri = "s_dec_trd_cur_upri";
	/**
	 *  金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_amt = "s_int_trd_cur_amt";
	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_amt = "s_dec_trd_cur_amt";
	/**
	 *  値引金額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  値引金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_dscnt_amt = "s_int_trd_cur_dscnt_amt";
	/**
	 *  値引金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_dscnt_amt = "s_dec_trd_cur_dscnt_amt";
	/**
	 *  税額（内税）.<p>
	 *
	 */
	public static final String $t_inc_tax = "t_inc_tax";
	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  税額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_tax_amt = "s_int_trd_cur_tax_amt";
	/**
	 *  税額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_tax_amt = "s_dec_trd_cur_tax_amt";
	/**
	 *  納期（日付）.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public static final String $insp_end_dt_lbl = "insp_end_dt_lbl";
	/**
	 *  検査完了日.<p>
	 *
	 */
	public static final String $insp_end_dt = "insp_end_dt";
	/**
	 *  場所.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 *  納入場所.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm1 = "in_to_loc_alt_nm1";
	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm2 = "in_to_loc_alt_nm2";
	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm3 = "in_to_loc_alt_nm3";
	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm4 = "in_to_loc_alt_nm4";
	/**
	 *  貴社品目.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 *  貴社品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 *  メーカ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 *  メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public static final String $maker_alt_nm1 = "maker_alt_nm1";
	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public static final String $maker_alt_nm2 = "maker_alt_nm2";
	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public static final String $maker_alt_nm3 = "maker_alt_nm3";
	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public static final String $maker_alt_nm4 = "maker_alt_nm4";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 *  打切.<p>
	 *
	 */
	public static final String $t_abort = "t_abort";
	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 *  加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_proc_upri = "s_int_trd_cur_proc_upri";
	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_proc_upri = "s_dec_trd_cur_proc_upri";
	/**
	 *  加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_proc_amt = "s_int_trd_cur_proc_amt";
	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_proc_amt = "s_dec_trd_cur_proc_amt";
	/**
	 *  有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_onr_prov_upri = "s_int_trd_cur_onr_prov_upri";
	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_onr_prov_upri = "s_dec_trd_cur_onr_prov_upri";
	/**
	 *  有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_onr_prov_amt = "s_int_trd_cur_onr_prov_amt";
	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_onr_prov_amt = "s_dec_trd_cur_onr_prov_amt";
	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";
	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public static final String $in_to_loc_zip_cd = "in_to_loc_zip_cd";
	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public static final String $in_to_loc_addr1 = "in_to_loc_addr1";
	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public static final String $in_to_loc_addr2 = "in_to_loc_addr2";
	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public static final String $in_to_loc_addr3 = "in_to_loc_addr3";
	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public static final String $in_to_loc_addr4 = "in_to_loc_addr4";
	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public static final String $in_to_loc_addr = "in_to_loc_addr";
	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_loc_tel = "in_to_loc_tel";
	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_loc_fax = "in_to_loc_fax";
	/**
	 *  納入場所部署.<p>
	 *
	 */
	public static final String $in_to_loc_cntct_dpt = "in_to_loc_cntct_dpt";
	/**
	 *  納入場所担当者.<p>
	 *
	 */
	public static final String $in_to_loc_cntct_psn = "in_to_loc_cntct_psn";
	/**
	 *  納入場所国名.<p>
	 *
	 */
	public static final String $in_to_cntry_nm = "in_to_cntry_nm";
	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 *  納品先.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 *  納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 *  納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 *  納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 *  納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 *  納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 *  納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 *  配送先.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 *  配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 *  配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 *  配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 *  配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public static final String $tdlv_addr = "tdlv_addr";
	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 *  配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 *  配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 *  配送先国名.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta abort_qty_META = createCommonMeta($abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_abort_qty_META = createStringMeta($s_int_abort_qty);
	public static final MCMeta s_dec_abort_qty_META = createStringMeta($s_dec_abort_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta t_interim_META = createStringMeta($t_interim, 2);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_upri_META = createStringMeta($s_int_trd_cur_upri);
	public static final MCMeta s_dec_trd_cur_upri_META = createStringMeta($s_dec_trd_cur_upri);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_amt_META = createStringMeta($s_int_trd_cur_amt);
	public static final MCMeta s_dec_trd_cur_amt_META = createStringMeta($s_dec_trd_cur_amt);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_dscnt_amt_META = createStringMeta($s_int_trd_cur_dscnt_amt);
	public static final MCMeta s_dec_trd_cur_dscnt_amt_META = createStringMeta($s_dec_trd_cur_dscnt_amt);
	public static final MCMeta t_inc_tax_META = createStringMeta($t_inc_tax);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_tax_amt_META = createStringMeta($s_int_trd_cur_tax_amt);
	public static final MCMeta s_dec_trd_cur_tax_amt_META = createStringMeta($s_dec_trd_cur_tax_amt);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_end_dt_lbl_META = createStringMeta($insp_end_dt_lbl);
	public static final MCMeta insp_end_dt_META = createCommonMeta($insp_end_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta in_to_loc_alt_nm1_META = createCommonMeta($in_to_loc_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta in_to_loc_alt_nm2_META = createCommonMeta($in_to_loc_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta in_to_loc_alt_nm3_META = createCommonMeta($in_to_loc_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta in_to_loc_alt_nm4_META = createCommonMeta($in_to_loc_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_alt_nm1_META = createCommonMeta($maker_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta maker_alt_nm2_META = createCommonMeta($maker_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta maker_alt_nm3_META = createCommonMeta($maker_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta maker_alt_nm4_META = createCommonMeta($maker_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta t_abort_META = createStringMeta($t_abort);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_proc_upri_META = createCommonMeta($trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_proc_upri_META = createStringMeta($s_int_trd_cur_proc_upri);
	public static final MCMeta s_dec_trd_cur_proc_upri_META = createStringMeta($s_dec_trd_cur_proc_upri);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_proc_amt_META = createStringMeta($s_int_trd_cur_proc_amt);
	public static final MCMeta s_dec_trd_cur_proc_amt_META = createStringMeta($s_dec_trd_cur_proc_amt);
	public static final MCMeta trd_cur_onr_prov_upri_META = createCommonMeta($trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_onr_prov_upri_META = createStringMeta($s_int_trd_cur_onr_prov_upri);
	public static final MCMeta s_dec_trd_cur_onr_prov_upri_META = createStringMeta($s_dec_trd_cur_onr_prov_upri);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_onr_prov_amt_META = createStringMeta($s_int_trd_cur_onr_prov_amt);
	public static final MCMeta s_dec_trd_cur_onr_prov_amt_META = createStringMeta($s_dec_trd_cur_onr_prov_amt);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta in_to_loc_zip_cd_META = createCommonMeta($in_to_loc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_loc_addr1_META = createCommonMeta($in_to_loc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta in_to_loc_addr2_META = createCommonMeta($in_to_loc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta in_to_loc_addr3_META = createCommonMeta($in_to_loc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta in_to_loc_addr4_META = createCommonMeta($in_to_loc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta in_to_loc_addr_META = createStringMeta($in_to_loc_addr);
	public static final MCMeta in_to_loc_tel_META = createCommonMeta($in_to_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_loc_fax_META = createCommonMeta($in_to_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_loc_cntct_dpt_META = createCommonMeta($in_to_loc_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_loc_cntct_psn_META = createCommonMeta($in_to_loc_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_cntry_nm_META = createCommonMeta($in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tdlv_addr_META = createStringMeta($tdlv_addr);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);

	protected static final ConstMetaList<PoDtlR> constMetas = new ConstMetaList<PoDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			iv_itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			ver_no_lbl_META,
			ver_no_META,
			trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			abort_qty_META,
			s_int_abort_qty_META,
			s_dec_abort_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			t_interim_META,
			interim_flg_META,
			trd_cur_upri_META,
			s_int_trd_cur_upri_META,
			s_dec_trd_cur_upri_META,
			trd_cur_amt_META,
			s_int_trd_cur_amt_META,
			s_dec_trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			s_int_trd_cur_dscnt_amt_META,
			s_dec_trd_cur_dscnt_amt_META,
			t_inc_tax_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			s_int_trd_cur_tax_amt_META,
			s_dec_trd_cur_tax_amt_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			insp_end_dt_lbl_META,
			insp_end_dt_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			in_to_loc_alt_nm1_META,
			in_to_loc_alt_nm2_META,
			in_to_loc_alt_nm3_META,
			in_to_loc_alt_nm4_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			bp_lot_no_META,
			maker_cd_META,
			maker_nm_META,
			maker_alt_nm1_META,
			maker_alt_nm2_META,
			maker_alt_nm3_META,
			maker_alt_nm4_META,
			po_print_d_rmrks_META,
			po_d_no_META,
			t_abort_META,
			abort_flg_META,
			trd_cur_proc_upri_META,
			s_int_trd_cur_proc_upri_META,
			s_dec_trd_cur_proc_upri_META,
			trd_cur_proc_amt_META,
			s_int_trd_cur_proc_amt_META,
			s_dec_trd_cur_proc_amt_META,
			trd_cur_onr_prov_upri_META,
			s_int_trd_cur_onr_prov_upri_META,
			s_dec_trd_cur_onr_prov_upri_META,
			trd_cur_onr_prov_amt_META,
			s_int_trd_cur_onr_prov_amt_META,
			s_dec_trd_cur_onr_prov_amt_META,
			repurc_obli_flg_META,
			disp_seq_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			in_to_loc_zip_cd_META,
			in_to_loc_addr1_META,
			in_to_loc_addr2_META,
			in_to_loc_addr3_META,
			in_to_loc_addr4_META,
			in_to_loc_addr_META,
			in_to_loc_tel_META,
			in_to_loc_fax_META,
			in_to_loc_cntct_dpt_META,
			in_to_loc_cntct_psn_META,
			in_to_cntry_nm_META,
			cst_po_no_META,
			cst_po_d_no_META,
			dlv_cd_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntry_nm_META,
			tdlv_cd_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_addr_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_cntry_nm_META
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
	protected PoDtlR_MC_A(ConstMetaList<? extends PoDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoDtlR clone() {
		return (PoDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoDtlR createInstance() {
		return (PoDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoDtlR getValues(String... names) {
		return (PoDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  弊社品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  弊社品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 1, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 1, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 2, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 2, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 3, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 3, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 4, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 4, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 5, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 5, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 6, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 6, $itm_sub3_data, value);
	}


	/**
	 *  弊社品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 *  弊社品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 8, $itm_alt_nm1);
	}

	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 8, $itm_alt_nm1, value);
	}


	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 9, $itm_alt_nm2);
	}

	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 9, $itm_alt_nm2, value);
	}


	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 10, $itm_alt_nm3);
	}

	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 10, $itm_alt_nm3, value);
	}


	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 11, $itm_alt_nm4);
	}

	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 11, $itm_alt_nm4, value);
	}


	/**
	 *  インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 12, $iv_itm_nm);
	}

	/**
	 *  インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 12, $iv_itm_nm, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 13, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 13, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 14, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 14, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 15, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 15, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 16, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 16, $sno4, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 17, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 17, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 18, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 18, $ver_no, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 19, $trd_unit_qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 19, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 19, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 19, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 19, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 19, $trd_unit_qty, value);
	}


	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 20, $s_int_trd_unit_qty);
	}

	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 20, $s_int_trd_unit_qty, value);
	}


	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 21, $s_dec_trd_unit_qty);
	}

	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 21, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  単位.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 22, $trd_unit_cd);
	}

	/**
	 *  単位.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 22, $trd_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 23, $trd_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 23, $trd_unit_nm, value);
	}


	/**
	 *  打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return getConstNumber(offset + 24, $abort_qty);
	}

	/**
	 *  打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		setConstNumber(offset + 24, $abort_qty, value);
	}

	/**
	 *  打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		setConstNumber(offset + 24, $abort_qty, value);
	}

	/**
	 *  打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		setConstNumber(offset + 24, $abort_qty, value);
	}

	/**
	 *  打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		setConstNumber(offset + 24, $abort_qty, value);
	}

	/**
	 *  打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		setConstNumber(offset + 24, $abort_qty, value);
	}


	/**
	 *  打切数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_abort_qty() {
		return getConstString(offset + 25, $s_int_abort_qty);
	}

	/**
	 *  打切数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_abort_qty(String value) {
		setConstString(offset + 25, $s_int_abort_qty, value);
	}


	/**
	 *  打切数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_abort_qty() {
		return getConstString(offset + 26, $s_dec_abort_qty);
	}

	/**
	 *  打切数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_abort_qty(String value) {
		setConstString(offset + 26, $s_dec_abort_qty, value);
	}


	/**
	 *  基準単位.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 27, $base_unit_cd);
	}

	/**
	 *  基準単位.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 27, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 28, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 28, $base_unit_nm, value);
	}


	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public String t_interim() {
		return getConstString(offset + 29, $t_interim);
	}

	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public void t_interim(String value) {
		setConstString(offset + 29, $t_interim, value);
	}


	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 30, $interim_flg);
	}

	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 30, $interim_flg, value);
	}


	/**
	 *  単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 31, $trd_cur_upri);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 31, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 31, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 31, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 31, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 31, $trd_cur_upri, value);
	}


	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_upri() {
		return getConstString(offset + 32, $s_int_trd_cur_upri);
	}

	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_upri(String value) {
		setConstString(offset + 32, $s_int_trd_cur_upri, value);
	}


	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_upri() {
		return getConstString(offset + 33, $s_dec_trd_cur_upri);
	}

	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_upri(String value) {
		setConstString(offset + 33, $s_dec_trd_cur_upri, value);
	}


	/**
	 *  金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 34, $trd_cur_amt);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 34, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 34, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 34, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 34, $trd_cur_amt, value);
	}


	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_amt() {
		return getConstString(offset + 35, $s_int_trd_cur_amt);
	}

	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_amt(String value) {
		setConstString(offset + 35, $s_int_trd_cur_amt, value);
	}


	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_amt() {
		return getConstString(offset + 36, $s_dec_trd_cur_amt);
	}

	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_amt(String value) {
		setConstString(offset + 36, $s_dec_trd_cur_amt, value);
	}


	/**
	 *  値引金額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 37, $trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_dscnt_amt() {
		return getConstString(offset + 38, $s_int_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 38, $s_int_trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_dscnt_amt() {
		return getConstString(offset + 39, $s_dec_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 39, $s_dec_trd_cur_dscnt_amt, value);
	}


	/**
	 *  税額（内税）.<p>
	 *
	 */
	public String t_inc_tax() {
		return getConstString(offset + 40, $t_inc_tax);
	}

	/**
	 *  税額（内税）.<p>
	 *
	 */
	public void t_inc_tax(String value) {
		setConstString(offset + 40, $t_inc_tax, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 41, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 41, $inc_tax_flg, value);
	}


	/**
	 *  税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 42, $trd_cur_tax_amt);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 42, $trd_cur_tax_amt, value);
	}


	/**
	 *  税額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_tax_amt() {
		return getConstString(offset + 43, $s_int_trd_cur_tax_amt);
	}

	/**
	 *  税額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_tax_amt(String value) {
		setConstString(offset + 43, $s_int_trd_cur_tax_amt, value);
	}


	/**
	 *  税額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_amt() {
		return getConstString(offset + 44, $s_dec_trd_cur_tax_amt);
	}

	/**
	 *  税額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_amt(String value) {
		setConstString(offset + 44, $s_dec_trd_cur_tax_amt, value);
	}


	/**
	 *  納期（日付）.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 45, $dlv_rqst_dt);
	}

	/**
	 *  納期（日付）.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 45, $dlv_rqst_dt, value);
	}


	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 46, $dlv_rqst_tm);
	}

	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 46, $dlv_rqst_tm, value);
	}


	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public String insp_end_dt_lbl() {
		return getConstString(offset + 47, $insp_end_dt_lbl);
	}

	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public void insp_end_dt_lbl(String value) {
		setConstString(offset + 47, $insp_end_dt_lbl, value);
	}


	/**
	 *  検査完了日.<p>
	 *
	 */
	public MCDate insp_end_dt() {
		return getConstDate(offset + 48, $insp_end_dt);
	}

	/**
	 *  検査完了日.<p>
	 *
	 */
	public void insp_end_dt(MCDate value) {
		setConstDate(offset + 48, $insp_end_dt, value);
	}


	/**
	 *  場所.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 49, $in_to_loc_cd);
	}

	/**
	 *  場所.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 49, $in_to_loc_cd, value);
	}


	/**
	 *  納入場所.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 50, $in_to_loc_nm);
	}

	/**
	 *  納入場所.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 50, $in_to_loc_nm, value);
	}


	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public String in_to_loc_alt_nm1() {
		return getConstString(offset + 51, $in_to_loc_alt_nm1);
	}

	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public void in_to_loc_alt_nm1(String value) {
		setConstString(offset + 51, $in_to_loc_alt_nm1, value);
	}


	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public String in_to_loc_alt_nm2() {
		return getConstString(offset + 52, $in_to_loc_alt_nm2);
	}

	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public void in_to_loc_alt_nm2(String value) {
		setConstString(offset + 52, $in_to_loc_alt_nm2, value);
	}


	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public String in_to_loc_alt_nm3() {
		return getConstString(offset + 53, $in_to_loc_alt_nm3);
	}

	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public void in_to_loc_alt_nm3(String value) {
		setConstString(offset + 53, $in_to_loc_alt_nm3, value);
	}


	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public String in_to_loc_alt_nm4() {
		return getConstString(offset + 54, $in_to_loc_alt_nm4);
	}

	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public void in_to_loc_alt_nm4(String value) {
		setConstString(offset + 54, $in_to_loc_alt_nm4, value);
	}


	/**
	 *  貴社品目.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 55, $sppl_itm_cd);
	}

	/**
	 *  貴社品目.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 55, $sppl_itm_cd, value);
	}


	/**
	 *  貴社品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 56, $sppl_itm_nm);
	}

	/**
	 *  貴社品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 56, $sppl_itm_nm, value);
	}


	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 57, $bp_lot_no);
	}

	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 57, $bp_lot_no, value);
	}


	/**
	 *  メーカ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 58, $maker_cd);
	}

	/**
	 *  メーカ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 58, $maker_cd, value);
	}


	/**
	 *  メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 59, $maker_nm);
	}

	/**
	 *  メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 59, $maker_nm, value);
	}


	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public String maker_alt_nm1() {
		return getConstString(offset + 60, $maker_alt_nm1);
	}

	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public void maker_alt_nm1(String value) {
		setConstString(offset + 60, $maker_alt_nm1, value);
	}


	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public String maker_alt_nm2() {
		return getConstString(offset + 61, $maker_alt_nm2);
	}

	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public void maker_alt_nm2(String value) {
		setConstString(offset + 61, $maker_alt_nm2, value);
	}


	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public String maker_alt_nm3() {
		return getConstString(offset + 62, $maker_alt_nm3);
	}

	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public void maker_alt_nm3(String value) {
		setConstString(offset + 62, $maker_alt_nm3, value);
	}


	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public String maker_alt_nm4() {
		return getConstString(offset + 63, $maker_alt_nm4);
	}

	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public void maker_alt_nm4(String value) {
		setConstString(offset + 63, $maker_alt_nm4, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 64, $po_print_d_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 64, $po_print_d_rmrks, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 65, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 65, $po_d_no, value);
	}


	/**
	 *  打切.<p>
	 *
	 */
	public String t_abort() {
		return getConstString(offset + 66, $t_abort);
	}

	/**
	 *  打切.<p>
	 *
	 */
	public void t_abort(String value) {
		setConstString(offset + 66, $t_abort, value);
	}


	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 67, $abort_flg);
	}

	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 67, $abort_flg, value);
	}


	/**
	 *  加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 68, $trd_cur_proc_upri);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 68, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 68, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 68, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 68, $trd_cur_proc_upri, value);
	}


	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_proc_upri() {
		return getConstString(offset + 69, $s_int_trd_cur_proc_upri);
	}

	/**
	 *  加工単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_proc_upri(String value) {
		setConstString(offset + 69, $s_int_trd_cur_proc_upri, value);
	}


	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_proc_upri() {
		return getConstString(offset + 70, $s_dec_trd_cur_proc_upri);
	}

	/**
	 *  加工単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_proc_upri(String value) {
		setConstString(offset + 70, $s_dec_trd_cur_proc_upri, value);
	}


	/**
	 *  加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 71, $trd_cur_proc_amt);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 71, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 71, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 71, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 71, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 71, $trd_cur_proc_amt, value);
	}


	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_proc_amt() {
		return getConstString(offset + 72, $s_int_trd_cur_proc_amt);
	}

	/**
	 *  加工金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_proc_amt(String value) {
		setConstString(offset + 72, $s_int_trd_cur_proc_amt, value);
	}


	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_proc_amt() {
		return getConstString(offset + 73, $s_dec_trd_cur_proc_amt);
	}

	/**
	 *  加工金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_proc_amt(String value) {
		setConstString(offset + 73, $s_dec_trd_cur_proc_amt, value);
	}


	/**
	 *  有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 74, $trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 74, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 74, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 74, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 74, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 74, $trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_onr_prov_upri() {
		return getConstString(offset + 75, $s_int_trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_onr_prov_upri(String value) {
		setConstString(offset + 75, $s_int_trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_onr_prov_upri() {
		return getConstString(offset + 76, $s_dec_trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_onr_prov_upri(String value) {
		setConstString(offset + 76, $s_dec_trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 77, $trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 77, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 77, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 77, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 77, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 77, $trd_cur_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_onr_prov_amt() {
		return getConstString(offset + 78, $s_int_trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_onr_prov_amt(String value) {
		setConstString(offset + 78, $s_int_trd_cur_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_onr_prov_amt() {
		return getConstString(offset + 79, $s_dec_trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_onr_prov_amt(String value) {
		setConstString(offset + 79, $s_dec_trd_cur_onr_prov_amt, value);
	}


	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 80, $repurc_obli_flg);
	}

	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 80, $repurc_obli_flg, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 81, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 81, $disp_seq, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 82, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 82, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 83, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 83, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 84, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 84, $d_sub_char3, value);
	}


	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public String in_to_loc_zip_cd() {
		return getConstString(offset + 85, $in_to_loc_zip_cd);
	}

	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public void in_to_loc_zip_cd(String value) {
		setConstString(offset + 85, $in_to_loc_zip_cd, value);
	}


	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public String in_to_loc_addr1() {
		return getConstString(offset + 86, $in_to_loc_addr1);
	}

	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public void in_to_loc_addr1(String value) {
		setConstString(offset + 86, $in_to_loc_addr1, value);
	}


	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public String in_to_loc_addr2() {
		return getConstString(offset + 87, $in_to_loc_addr2);
	}

	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public void in_to_loc_addr2(String value) {
		setConstString(offset + 87, $in_to_loc_addr2, value);
	}


	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public String in_to_loc_addr3() {
		return getConstString(offset + 88, $in_to_loc_addr3);
	}

	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public void in_to_loc_addr3(String value) {
		setConstString(offset + 88, $in_to_loc_addr3, value);
	}


	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public String in_to_loc_addr4() {
		return getConstString(offset + 89, $in_to_loc_addr4);
	}

	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public void in_to_loc_addr4(String value) {
		setConstString(offset + 89, $in_to_loc_addr4, value);
	}


	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public String in_to_loc_addr() {
		return getConstString(offset + 90, $in_to_loc_addr);
	}

	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public void in_to_loc_addr(String value) {
		setConstString(offset + 90, $in_to_loc_addr, value);
	}


	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public String in_to_loc_tel() {
		return getConstString(offset + 91, $in_to_loc_tel);
	}

	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public void in_to_loc_tel(String value) {
		setConstString(offset + 91, $in_to_loc_tel, value);
	}


	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public String in_to_loc_fax() {
		return getConstString(offset + 92, $in_to_loc_fax);
	}

	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public void in_to_loc_fax(String value) {
		setConstString(offset + 92, $in_to_loc_fax, value);
	}


	/**
	 *  納入場所部署.<p>
	 *
	 */
	public String in_to_loc_cntct_dpt() {
		return getConstString(offset + 93, $in_to_loc_cntct_dpt);
	}

	/**
	 *  納入場所部署.<p>
	 *
	 */
	public void in_to_loc_cntct_dpt(String value) {
		setConstString(offset + 93, $in_to_loc_cntct_dpt, value);
	}


	/**
	 *  納入場所担当者.<p>
	 *
	 */
	public String in_to_loc_cntct_psn() {
		return getConstString(offset + 94, $in_to_loc_cntct_psn);
	}

	/**
	 *  納入場所担当者.<p>
	 *
	 */
	public void in_to_loc_cntct_psn(String value) {
		setConstString(offset + 94, $in_to_loc_cntct_psn, value);
	}


	/**
	 *  納入場所国名.<p>
	 *
	 */
	public String in_to_cntry_nm() {
		return getConstString(offset + 95, $in_to_cntry_nm);
	}

	/**
	 *  納入場所国名.<p>
	 *
	 */
	public void in_to_cntry_nm(String value) {
		setConstString(offset + 95, $in_to_cntry_nm, value);
	}


	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 96, $cst_po_no);
	}

	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 96, $cst_po_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 97, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 97, $cst_po_d_no, value);
	}


	/**
	 *  納品先.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 98, $dlv_cd);
	}

	/**
	 *  納品先.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 98, $dlv_cd, value);
	}


	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 99, $dlv_zip_cd);
	}

	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 99, $dlv_zip_cd, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 100, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 100, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 101, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 101, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 102, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 102, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 103, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 103, $dlv_addr4, value);
	}


	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 104, $dlv_addr);
	}

	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 104, $dlv_addr, value);
	}


	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 105, $dlv_tel);
	}

	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 105, $dlv_tel, value);
	}


	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 106, $dlv_fax);
	}

	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 106, $dlv_fax, value);
	}


	/**
	 *  納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 107, $dlv_cntct_dpt);
	}

	/**
	 *  納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 107, $dlv_cntct_dpt, value);
	}


	/**
	 *  納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 108, $dlv_cntct_psn);
	}

	/**
	 *  納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 108, $dlv_cntct_psn, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 109, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 109, $dlv_cntry_nm, value);
	}


	/**
	 *  配送先.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 110, $tdlv_cd);
	}

	/**
	 *  配送先.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 110, $tdlv_cd, value);
	}


	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 111, $tdlv_zip_cd);
	}

	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 111, $tdlv_zip_cd, value);
	}


	/**
	 *  配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 112, $tdlv_addr1);
	}

	/**
	 *  配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 112, $tdlv_addr1, value);
	}


	/**
	 *  配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 113, $tdlv_addr2);
	}

	/**
	 *  配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 113, $tdlv_addr2, value);
	}


	/**
	 *  配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 114, $tdlv_addr3);
	}

	/**
	 *  配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 114, $tdlv_addr3, value);
	}


	/**
	 *  配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 115, $tdlv_addr4);
	}

	/**
	 *  配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 115, $tdlv_addr4, value);
	}


	/**
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public String tdlv_addr() {
		return getConstString(offset + 116, $tdlv_addr);
	}

	/**
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public void tdlv_addr(String value) {
		setConstString(offset + 116, $tdlv_addr, value);
	}


	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 117, $tdlv_tel);
	}

	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 117, $tdlv_tel, value);
	}


	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 118, $tdlv_fax);
	}

	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 118, $tdlv_fax, value);
	}


	/**
	 *  配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 119, $tdlv_cntct_dpt);
	}

	/**
	 *  配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 119, $tdlv_cntct_dpt, value);
	}


	/**
	 *  配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 120, $tdlv_cntct_psn);
	}

	/**
	 *  配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 120, $tdlv_cntct_psn, value);
	}


	/**
	 *  配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 121, $tdlv_cntry_nm);
	}

	/**
	 *  配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 121, $tdlv_cntry_nm, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($s_int_abort_qty.equalsIgnoreCase(name)) {
			return s_int_abort_qty();
		}
		if ($s_dec_abort_qty.equalsIgnoreCase(name)) {
			return s_dec_abort_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			return t_interim();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			return insp_end_dt_lbl();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm1();
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm2();
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm3();
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm4();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			return maker_alt_nm1();
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			return maker_alt_nm2();
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			return maker_alt_nm3();
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			return maker_alt_nm4();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($t_abort.equalsIgnoreCase(name)) {
			return t_abort();
		}
		if ($s_int_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_proc_upri();
		}
		if ($s_dec_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_proc_upri();
		}
		if ($s_int_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_proc_amt();
		}
		if ($s_dec_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_proc_amt();
		}
		if ($s_int_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_onr_prov_upri();
		}
		if ($s_dec_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_onr_prov_upri();
		}
		if ($s_int_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_onr_prov_amt();
		}
		if ($s_dec_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_onr_prov_amt();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return in_to_loc_zip_cd();
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			return in_to_loc_addr1();
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			return in_to_loc_addr2();
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			return in_to_loc_addr3();
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			return in_to_loc_addr4();
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			return in_to_loc_addr();
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			return in_to_loc_tel();
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			return in_to_loc_fax();
		}
		if ($in_to_loc_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_loc_cntct_dpt();
		}
		if ($in_to_loc_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_loc_cntct_psn();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			return tdlv_addr();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($s_int_abort_qty.equalsIgnoreCase(name)) {
			return s_int_abort_qty();
		}
		if ($s_dec_abort_qty.equalsIgnoreCase(name)) {
			return s_dec_abort_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			return t_interim();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			return insp_end_dt_lbl();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm1();
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm2();
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm3();
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm4();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			return maker_alt_nm1();
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			return maker_alt_nm2();
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			return maker_alt_nm3();
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			return maker_alt_nm4();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($t_abort.equalsIgnoreCase(name)) {
			return t_abort();
		}
		if ($s_int_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_proc_upri();
		}
		if ($s_dec_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_proc_upri();
		}
		if ($s_int_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_proc_amt();
		}
		if ($s_dec_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_proc_amt();
		}
		if ($s_int_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_onr_prov_upri();
		}
		if ($s_dec_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_onr_prov_upri();
		}
		if ($s_int_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_onr_prov_amt();
		}
		if ($s_dec_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_onr_prov_amt();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return in_to_loc_zip_cd();
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			return in_to_loc_addr1();
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			return in_to_loc_addr2();
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			return in_to_loc_addr3();
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			return in_to_loc_addr4();
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			return in_to_loc_addr();
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			return in_to_loc_tel();
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			return in_to_loc_fax();
		}
		if ($in_to_loc_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_loc_cntct_dpt();
		}
		if ($in_to_loc_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_loc_cntct_psn();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			return tdlv_addr();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($s_int_abort_qty.equalsIgnoreCase(name)) {
			s_int_abort_qty(value);
			return;
		}
		if ($s_dec_abort_qty.equalsIgnoreCase(name)) {
			s_dec_abort_qty(value);
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
		if ($t_interim.equalsIgnoreCase(name)) {
			t_interim(value);
			return;
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_upri(value);
			return;
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_upri(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			insp_end_dt_lbl(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm1(value);
			return;
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm2(value);
			return;
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm3(value);
			return;
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm4(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			maker_alt_nm1(value);
			return;
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			maker_alt_nm2(value);
			return;
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			maker_alt_nm3(value);
			return;
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			maker_alt_nm4(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($t_abort.equalsIgnoreCase(name)) {
			t_abort(value);
			return;
		}
		if ($s_int_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_proc_upri(value);
			return;
		}
		if ($s_dec_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_proc_upri(value);
			return;
		}
		if ($s_int_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_proc_amt(value);
			return;
		}
		if ($s_dec_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_proc_amt(value);
			return;
		}
		if ($s_int_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($s_dec_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($s_int_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($s_dec_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			in_to_loc_zip_cd(value);
			return;
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			in_to_loc_addr1(value);
			return;
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			in_to_loc_addr2(value);
			return;
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			in_to_loc_addr3(value);
			return;
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			in_to_loc_addr4(value);
			return;
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			in_to_loc_addr(value);
			return;
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			in_to_loc_tel(value);
			return;
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			in_to_loc_fax(value);
			return;
		}
		if ($in_to_loc_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_loc_cntct_dpt(value);
			return;
		}
		if ($in_to_loc_cntct_psn.equalsIgnoreCase(name)) {
			in_to_loc_cntct_psn(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			tdlv_addr(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($s_int_abort_qty.equalsIgnoreCase(name)) {
			s_int_abort_qty(value);
			return;
		}
		if ($s_dec_abort_qty.equalsIgnoreCase(name)) {
			s_dec_abort_qty(value);
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
		if ($t_interim.equalsIgnoreCase(name)) {
			t_interim(value);
			return;
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_upri(value);
			return;
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_upri(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			insp_end_dt_lbl(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm1(value);
			return;
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm2(value);
			return;
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm3(value);
			return;
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm4(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			maker_alt_nm1(value);
			return;
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			maker_alt_nm2(value);
			return;
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			maker_alt_nm3(value);
			return;
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			maker_alt_nm4(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($t_abort.equalsIgnoreCase(name)) {
			t_abort(value);
			return;
		}
		if ($s_int_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_proc_upri(value);
			return;
		}
		if ($s_dec_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_proc_upri(value);
			return;
		}
		if ($s_int_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_proc_amt(value);
			return;
		}
		if ($s_dec_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_proc_amt(value);
			return;
		}
		if ($s_int_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($s_dec_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($s_int_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($s_dec_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			in_to_loc_zip_cd(value);
			return;
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			in_to_loc_addr1(value);
			return;
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			in_to_loc_addr2(value);
			return;
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			in_to_loc_addr3(value);
			return;
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			in_to_loc_addr4(value);
			return;
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			in_to_loc_addr(value);
			return;
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			in_to_loc_tel(value);
			return;
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			in_to_loc_fax(value);
			return;
		}
		if ($in_to_loc_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_loc_cntct_dpt(value);
			return;
		}
		if ($in_to_loc_cntct_psn.equalsIgnoreCase(name)) {
			in_to_loc_cntct_psn(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			tdlv_addr(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_proc_upri.equalsIgnoreCase(name)) {
			trd_cur_proc_upri(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

