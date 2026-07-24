package mcframe.commonMSBE.MSBER0310;

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
 * ブロック"StkDiffLstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class StkDiffLstDtlR_MC_A extends MCConstRow {

	/**
	 *  棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 *  棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 *  品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
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
	 *  積送品区分（データ）.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 *  積送品区分名（データ）.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
	/**
	 *  良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 *  良品区分(データ).<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 *  格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 *  格付ＣＤ(データ).<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 *  在庫検査区分（ラベル）.<p>
	 *
	 */
	public static final String $stk_insp_typ_lbl = "stk_insp_typ_lbl";
	/**
	 *  在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 *  在庫検査区分（データ）.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 *  在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 *  在庫識別区分(データ).<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm1 = "stk_bp_alt_nm1";
	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm2 = "stk_bp_alt_nm2";
	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm3 = "stk_bp_alt_nm3";
	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm4 = "stk_bp_alt_nm4";
	/**
	 *  在庫取引先ＣＤ（データ）.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 *  在庫着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	/**
	 *  在庫着荷先別名１.<p>
	 *
	 */
	public static final String $stk_arrv_bp_alt_nm1 = "stk_arrv_bp_alt_nm1";
	/**
	 *  在庫着荷先別名２.<p>
	 *
	 */
	public static final String $stk_arrv_bp_alt_nm2 = "stk_arrv_bp_alt_nm2";
	/**
	 *  在庫着荷先別名３.<p>
	 *
	 */
	public static final String $stk_arrv_bp_alt_nm3 = "stk_arrv_bp_alt_nm3";
	/**
	 *  在庫着荷先別名４.<p>
	 *
	 */
	public static final String $stk_arrv_bp_alt_nm4 = "stk_arrv_bp_alt_nm4";
	/**
	 *  在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public static final String $sno1_lbl = "sno1_lbl";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_view = "sno1_view";
	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public static final String $sno1_data = "sno1_data";
	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public static final String $sno2_lbl = "sno2_lbl";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_view = "sno2_view";
	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public static final String $sno2_data = "sno2_data";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_lbl = "sno3_lbl";
	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public static final String $sno3_view = "sno3_view";
	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public static final String $sno3_data = "sno3_data";
	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public static final String $sno4_lbl = "sno4_lbl";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_view = "sno4_view";
	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public static final String $sno4_data = "sno4_data";
	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public static final String $tor_qty = "tor_qty";
	/**
	 *  理論在庫数（文字列）.<p>
	 *
	 */
	public static final String $s_tor_qty = "s_tor_qty";
	/**
	 *  理論在庫数（整数部）.<p>
	 *
	 */
	public static final String $s_int_tor_qty = "s_int_tor_qty";
	/**
	 *  理論在庫数（小数部）.<p>
	 *
	 */
	public static final String $s_dec_tor_qty = "s_dec_tor_qty";
	/**
	 *  標準単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 *  荷姿名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public static final String $act_qty = "act_qty";
	/**
	 *  実棚数（文字列）.<p>
	 *
	 */
	public static final String $s_act_qty = "s_act_qty";
	/**
	 *  実棚数（整数部）.<p>
	 *
	 */
	public static final String $s_int_act_qty = "s_int_act_qty";
	/**
	 *  実棚数（小数部）.<p>
	 *
	 */
	public static final String $s_dec_act_qty = "s_dec_act_qty";
	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public static final String $act_diff_qty = "act_diff_qty";
	/**
	 *  実棚差異数（整数部）.<p>
	 *
	 */
	public static final String $s_int_act_diff_qty = "s_int_act_diff_qty";
	/**
	 *  実棚差異数（小数部）.<p>
	 *
	 */
	public static final String $s_dec_act_diff_qty = "s_dec_act_diff_qty";
	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public static final String $act_diff_amt = "act_diff_amt";
	/**
	 *  実棚差異金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_act_diff_amt = "s_int_act_diff_amt";
	/**
	 *  実棚差異金額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_act_diff_amt = "s_dec_act_diff_amt";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $stktk_act_rmrks = "stktk_act_rmrks";
	/**
	 *  予備１（データ）.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２（データ）.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３（データ）.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";


	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
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
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta stk_insp_typ_lbl_META = createStringMeta($stk_insp_typ_lbl);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_bp_alt_nm1_META = createCommonMeta($stk_bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta stk_bp_alt_nm2_META = createCommonMeta($stk_bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta stk_bp_alt_nm3_META = createCommonMeta($stk_bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta stk_bp_alt_nm4_META = createCommonMeta($stk_bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_alt_nm1_META = createCommonMeta($stk_arrv_bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta stk_arrv_bp_alt_nm2_META = createCommonMeta($stk_arrv_bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta stk_arrv_bp_alt_nm3_META = createCommonMeta($stk_arrv_bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta stk_arrv_bp_alt_nm4_META = createCommonMeta($stk_arrv_bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_lbl_META = createStringMeta($sno1_lbl);
	public static final MCMeta sno1_view_META = createCommonMeta($sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_data_META = createCommonMeta($sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_lbl_META = createStringMeta($sno2_lbl);
	public static final MCMeta sno2_view_META = createCommonMeta($sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_data_META = createCommonMeta($sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_lbl_META = createStringMeta($sno3_lbl);
	public static final MCMeta sno3_view_META = createCommonMeta($sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_data_META = createCommonMeta($sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_lbl_META = createStringMeta($sno4_lbl);
	public static final MCMeta sno4_view_META = createCommonMeta($sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_data_META = createCommonMeta($sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta tor_qty_META = createCommonMeta($tor_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_tor_qty_META = createStringMeta($s_tor_qty);
	public static final MCMeta s_int_tor_qty_META = createStringMeta($s_int_tor_qty);
	public static final MCMeta s_dec_tor_qty_META = createStringMeta($s_dec_tor_qty);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_act_qty_META = createStringMeta($s_act_qty);
	public static final MCMeta s_int_act_qty_META = createStringMeta($s_int_act_qty);
	public static final MCMeta s_dec_act_qty_META = createStringMeta($s_dec_act_qty);
	public static final MCMeta act_diff_qty_META = createCommonMeta($act_diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_act_diff_qty_META = createStringMeta($s_int_act_diff_qty);
	public static final MCMeta s_dec_act_diff_qty_META = createStringMeta($s_dec_act_diff_qty);
	public static final MCMeta act_diff_amt_META = createCommonMeta($act_diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_act_diff_amt_META = createStringMeta($s_int_act_diff_amt);
	public static final MCMeta s_dec_act_diff_amt_META = createStringMeta($s_dec_act_diff_amt);
	public static final MCMeta stktk_act_rmrks_META = createCommonMeta($stktk_act_rmrks, mcframe.commonMS.meta.MS_META.STKTK_ACT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.STKTK_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.STKTK_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.STKTK_ACT_SUB_CHAR3);

	protected static final ConstMetaList<StkDiffLstDtlR> constMetas = new ConstMetaList<StkDiffLstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			str_ln_nm_META,
			str_ln_cd_META,
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
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			quality_typ_nm_META,
			quality_typ_META,
			gd_nm_META,
			gd_cd_META,
			stk_insp_typ_lbl_META,
			stk_insp_typ_nm_META,
			stk_insp_typ_META,
			stk_id_typ_nm_META,
			stk_id_typ_META,
			stk_bp_nm_META,
			stk_bp_alt_nm1_META,
			stk_bp_alt_nm2_META,
			stk_bp_alt_nm3_META,
			stk_bp_alt_nm4_META,
			stk_bp_cd_META,
			stk_arrv_bp_nm_META,
			stk_arrv_bp_alt_nm1_META,
			stk_arrv_bp_alt_nm2_META,
			stk_arrv_bp_alt_nm3_META,
			stk_arrv_bp_alt_nm4_META,
			stk_arrv_bp_cd_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_view_META,
			sublot_no_data_META,
			sno1_lbl_META,
			sno1_view_META,
			sno1_data_META,
			sno2_lbl_META,
			sno2_view_META,
			sno2_data_META,
			sno3_lbl_META,
			sno3_view_META,
			sno3_data_META,
			sno4_lbl_META,
			sno4_view_META,
			sno4_data_META,
			tor_qty_META,
			s_tor_qty_META,
			s_int_tor_qty_META,
			s_dec_tor_qty_META,
			std_upri_META,
			pack_unit_nm_META,
			act_qty_META,
			s_act_qty_META,
			s_int_act_qty_META,
			s_dec_act_qty_META,
			act_diff_qty_META,
			s_int_act_diff_qty_META,
			s_dec_act_diff_qty_META,
			act_diff_amt_META,
			s_int_act_diff_amt_META,
			s_dec_act_diff_amt_META,
			stktk_act_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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
	protected StkDiffLstDtlR_MC_A(ConstMetaList<? extends StkDiffLstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkDiffLstDtlR clone() {
		return (StkDiffLstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkDiffLstDtlR createInstance() {
		return (StkDiffLstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public StkDiffLstDtlR getValues(String... names) {
		return (StkDiffLstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 0, $str_ln_nm);
	}

	/**
	 *  棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 0, $str_ln_nm, value);
	}


	/**
	 *  棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 1, $str_ln_cd);
	}

	/**
	 *  棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 1, $str_ln_cd, value);
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 3, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 3, $itm_sub1_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 4, $itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 4, $itm_sub1_data, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 5, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 5, $itm_sub2_view, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 6, $itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 6, $itm_sub2_data, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 7, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 7, $itm_sub3_view, value);
	}


	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 8, $itm_sub3_data);
	}

	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 8, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 9, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 9, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 10, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 10, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 11, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 11, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 12, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 12, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 13, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 13, $itm_alt_nm4, value);
	}


	/**
	 *  積送品区分（データ）.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 14, $in_xfr_typ);
	}

	/**
	 *  積送品区分（データ）.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 14, $in_xfr_typ, value);
	}


	/**
	 *  積送品区分名（データ）.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 15, $in_xfr_typ_nm);
	}

	/**
	 *  積送品区分名（データ）.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 15, $in_xfr_typ_nm, value);
	}


	/**
	 *  良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 16, $quality_typ_nm);
	}

	/**
	 *  良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 16, $quality_typ_nm, value);
	}


	/**
	 *  良品区分(データ).<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 17, $quality_typ);
	}

	/**
	 *  良品区分(データ).<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 17, $quality_typ, value);
	}


	/**
	 *  格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 18, $gd_nm);
	}

	/**
	 *  格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 18, $gd_nm, value);
	}


	/**
	 *  格付ＣＤ(データ).<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 19, $gd_cd);
	}

	/**
	 *  格付ＣＤ(データ).<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 19, $gd_cd, value);
	}


	/**
	 *  在庫検査区分（ラベル）.<p>
	 *
	 */
	public String stk_insp_typ_lbl() {
		return getConstString(offset + 20, $stk_insp_typ_lbl);
	}

	/**
	 *  在庫検査区分（ラベル）.<p>
	 *
	 */
	public void stk_insp_typ_lbl(String value) {
		setConstString(offset + 20, $stk_insp_typ_lbl, value);
	}


	/**
	 *  在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 21, $stk_insp_typ_nm);
	}

	/**
	 *  在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 21, $stk_insp_typ_nm, value);
	}


	/**
	 *  在庫検査区分（データ）.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 22, $stk_insp_typ);
	}

	/**
	 *  在庫検査区分（データ）.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 22, $stk_insp_typ, value);
	}


	/**
	 *  在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 23, $stk_id_typ_nm);
	}

	/**
	 *  在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 23, $stk_id_typ_nm, value);
	}


	/**
	 *  在庫識別区分(データ).<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 24, $stk_id_typ);
	}

	/**
	 *  在庫識別区分(データ).<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 24, $stk_id_typ, value);
	}


	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 25, $stk_bp_nm);
	}

	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 25, $stk_bp_nm, value);
	}


	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public String stk_bp_alt_nm1() {
		return getConstString(offset + 26, $stk_bp_alt_nm1);
	}

	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public void stk_bp_alt_nm1(String value) {
		setConstString(offset + 26, $stk_bp_alt_nm1, value);
	}


	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public String stk_bp_alt_nm2() {
		return getConstString(offset + 27, $stk_bp_alt_nm2);
	}

	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public void stk_bp_alt_nm2(String value) {
		setConstString(offset + 27, $stk_bp_alt_nm2, value);
	}


	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public String stk_bp_alt_nm3() {
		return getConstString(offset + 28, $stk_bp_alt_nm3);
	}

	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public void stk_bp_alt_nm3(String value) {
		setConstString(offset + 28, $stk_bp_alt_nm3, value);
	}


	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public String stk_bp_alt_nm4() {
		return getConstString(offset + 29, $stk_bp_alt_nm4);
	}

	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public void stk_bp_alt_nm4(String value) {
		setConstString(offset + 29, $stk_bp_alt_nm4, value);
	}


	/**
	 *  在庫取引先ＣＤ（データ）.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 30, $stk_bp_cd);
	}

	/**
	 *  在庫取引先ＣＤ（データ）.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 30, $stk_bp_cd, value);
	}


	/**
	 *  在庫着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 31, $stk_arrv_bp_nm);
	}

	/**
	 *  在庫着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 31, $stk_arrv_bp_nm, value);
	}


	/**
	 *  在庫着荷先別名１.<p>
	 *
	 */
	public String stk_arrv_bp_alt_nm1() {
		return getConstString(offset + 32, $stk_arrv_bp_alt_nm1);
	}

	/**
	 *  在庫着荷先別名１.<p>
	 *
	 */
	public void stk_arrv_bp_alt_nm1(String value) {
		setConstString(offset + 32, $stk_arrv_bp_alt_nm1, value);
	}


	/**
	 *  在庫着荷先別名２.<p>
	 *
	 */
	public String stk_arrv_bp_alt_nm2() {
		return getConstString(offset + 33, $stk_arrv_bp_alt_nm2);
	}

	/**
	 *  在庫着荷先別名２.<p>
	 *
	 */
	public void stk_arrv_bp_alt_nm2(String value) {
		setConstString(offset + 33, $stk_arrv_bp_alt_nm2, value);
	}


	/**
	 *  在庫着荷先別名３.<p>
	 *
	 */
	public String stk_arrv_bp_alt_nm3() {
		return getConstString(offset + 34, $stk_arrv_bp_alt_nm3);
	}

	/**
	 *  在庫着荷先別名３.<p>
	 *
	 */
	public void stk_arrv_bp_alt_nm3(String value) {
		setConstString(offset + 34, $stk_arrv_bp_alt_nm3, value);
	}


	/**
	 *  在庫着荷先別名４.<p>
	 *
	 */
	public String stk_arrv_bp_alt_nm4() {
		return getConstString(offset + 35, $stk_arrv_bp_alt_nm4);
	}

	/**
	 *  在庫着荷先別名４.<p>
	 *
	 */
	public void stk_arrv_bp_alt_nm4(String value) {
		setConstString(offset + 35, $stk_arrv_bp_alt_nm4, value);
	}


	/**
	 *  在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 36, $stk_arrv_bp_cd);
	}

	/**
	 *  在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 36, $stk_arrv_bp_cd, value);
	}


	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 37, $lot_no_view);
	}

	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 37, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 38, $lot_no_data);
	}

	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 38, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 39, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 39, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 40, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 40, $sublot_no_data, value);
	}


	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public String sno1_lbl() {
		return getConstString(offset + 41, $sno1_lbl);
	}

	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public void sno1_lbl(String value) {
		setConstString(offset + 41, $sno1_lbl, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1_view() {
		return getConstString(offset + 42, $sno1_view);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1_view(String value) {
		setConstString(offset + 42, $sno1_view, value);
	}


	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public String sno1_data() {
		return getConstString(offset + 43, $sno1_data);
	}

	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public void sno1_data(String value) {
		setConstString(offset + 43, $sno1_data, value);
	}


	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public String sno2_lbl() {
		return getConstString(offset + 44, $sno2_lbl);
	}

	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public void sno2_lbl(String value) {
		setConstString(offset + 44, $sno2_lbl, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2_view() {
		return getConstString(offset + 45, $sno2_view);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2_view(String value) {
		setConstString(offset + 45, $sno2_view, value);
	}


	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public String sno2_data() {
		return getConstString(offset + 46, $sno2_data);
	}

	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public void sno2_data(String value) {
		setConstString(offset + 46, $sno2_data, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3_lbl() {
		return getConstString(offset + 47, $sno3_lbl);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3_lbl(String value) {
		setConstString(offset + 47, $sno3_lbl, value);
	}


	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public String sno3_view() {
		return getConstString(offset + 48, $sno3_view);
	}

	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public void sno3_view(String value) {
		setConstString(offset + 48, $sno3_view, value);
	}


	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public String sno3_data() {
		return getConstString(offset + 49, $sno3_data);
	}

	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public void sno3_data(String value) {
		setConstString(offset + 49, $sno3_data, value);
	}


	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public String sno4_lbl() {
		return getConstString(offset + 50, $sno4_lbl);
	}

	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public void sno4_lbl(String value) {
		setConstString(offset + 50, $sno4_lbl, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4_view() {
		return getConstString(offset + 51, $sno4_view);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4_view(String value) {
		setConstString(offset + 51, $sno4_view, value);
	}


	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public String sno4_data() {
		return getConstString(offset + 52, $sno4_data);
	}

	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public void sno4_data(String value) {
		setConstString(offset + 52, $sno4_data, value);
	}


	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public MCNumber tor_qty() {
		return getConstNumber(offset + 53, $tor_qty);
	}

	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public void tor_qty(MCNumber value) {
		setConstNumber(offset + 53, $tor_qty, value);
	}

	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public void tor_qty(int value) {
		setConstNumber(offset + 53, $tor_qty, value);
	}

	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public void tor_qty(long value) {
		setConstNumber(offset + 53, $tor_qty, value);
	}

	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public void tor_qty(float value) {
		setConstNumber(offset + 53, $tor_qty, value);
	}

	/**
	 *  理論在庫数（データ）.<p>
	 *
	 */
	public void tor_qty(double value) {
		setConstNumber(offset + 53, $tor_qty, value);
	}


	/**
	 *  理論在庫数（文字列）.<p>
	 *
	 */
	public String s_tor_qty() {
		return getConstString(offset + 54, $s_tor_qty);
	}

	/**
	 *  理論在庫数（文字列）.<p>
	 *
	 */
	public void s_tor_qty(String value) {
		setConstString(offset + 54, $s_tor_qty, value);
	}


	/**
	 *  理論在庫数（整数部）.<p>
	 *
	 */
	public String s_int_tor_qty() {
		return getConstString(offset + 55, $s_int_tor_qty);
	}

	/**
	 *  理論在庫数（整数部）.<p>
	 *
	 */
	public void s_int_tor_qty(String value) {
		setConstString(offset + 55, $s_int_tor_qty, value);
	}


	/**
	 *  理論在庫数（小数部）.<p>
	 *
	 */
	public String s_dec_tor_qty() {
		return getConstString(offset + 56, $s_dec_tor_qty);
	}

	/**
	 *  理論在庫数（小数部）.<p>
	 *
	 */
	public void s_dec_tor_qty(String value) {
		setConstString(offset + 56, $s_dec_tor_qty, value);
	}


	/**
	 *  標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 57, $std_upri);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 57, $std_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 57, $std_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 57, $std_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 57, $std_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 57, $std_upri, value);
	}


	/**
	 *  荷姿名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 58, $pack_unit_nm);
	}

	/**
	 *  荷姿名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 58, $pack_unit_nm, value);
	}


	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 59, $act_qty);
	}

	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 59, $act_qty, value);
	}

	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 59, $act_qty, value);
	}

	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 59, $act_qty, value);
	}

	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 59, $act_qty, value);
	}

	/**
	 *  実棚数（データ）.<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 59, $act_qty, value);
	}


	/**
	 *  実棚数（文字列）.<p>
	 *
	 */
	public String s_act_qty() {
		return getConstString(offset + 60, $s_act_qty);
	}

	/**
	 *  実棚数（文字列）.<p>
	 *
	 */
	public void s_act_qty(String value) {
		setConstString(offset + 60, $s_act_qty, value);
	}


	/**
	 *  実棚数（整数部）.<p>
	 *
	 */
	public String s_int_act_qty() {
		return getConstString(offset + 61, $s_int_act_qty);
	}

	/**
	 *  実棚数（整数部）.<p>
	 *
	 */
	public void s_int_act_qty(String value) {
		setConstString(offset + 61, $s_int_act_qty, value);
	}


	/**
	 *  実棚数（小数部）.<p>
	 *
	 */
	public String s_dec_act_qty() {
		return getConstString(offset + 62, $s_dec_act_qty);
	}

	/**
	 *  実棚数（小数部）.<p>
	 *
	 */
	public void s_dec_act_qty(String value) {
		setConstString(offset + 62, $s_dec_act_qty, value);
	}


	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public MCNumber act_diff_qty() {
		return getConstNumber(offset + 63, $act_diff_qty);
	}

	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public void act_diff_qty(MCNumber value) {
		setConstNumber(offset + 63, $act_diff_qty, value);
	}

	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public void act_diff_qty(int value) {
		setConstNumber(offset + 63, $act_diff_qty, value);
	}

	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public void act_diff_qty(long value) {
		setConstNumber(offset + 63, $act_diff_qty, value);
	}

	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public void act_diff_qty(float value) {
		setConstNumber(offset + 63, $act_diff_qty, value);
	}

	/**
	 *  実棚差異数（データ）.<p>
	 *
	 */
	public void act_diff_qty(double value) {
		setConstNumber(offset + 63, $act_diff_qty, value);
	}


	/**
	 *  実棚差異数（整数部）.<p>
	 *
	 */
	public String s_int_act_diff_qty() {
		return getConstString(offset + 64, $s_int_act_diff_qty);
	}

	/**
	 *  実棚差異数（整数部）.<p>
	 *
	 */
	public void s_int_act_diff_qty(String value) {
		setConstString(offset + 64, $s_int_act_diff_qty, value);
	}


	/**
	 *  実棚差異数（小数部）.<p>
	 *
	 */
	public String s_dec_act_diff_qty() {
		return getConstString(offset + 65, $s_dec_act_diff_qty);
	}

	/**
	 *  実棚差異数（小数部）.<p>
	 *
	 */
	public void s_dec_act_diff_qty(String value) {
		setConstString(offset + 65, $s_dec_act_diff_qty, value);
	}


	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public MCNumber act_diff_amt() {
		return getConstNumber(offset + 66, $act_diff_amt);
	}

	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public void act_diff_amt(MCNumber value) {
		setConstNumber(offset + 66, $act_diff_amt, value);
	}

	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public void act_diff_amt(int value) {
		setConstNumber(offset + 66, $act_diff_amt, value);
	}

	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public void act_diff_amt(long value) {
		setConstNumber(offset + 66, $act_diff_amt, value);
	}

	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public void act_diff_amt(float value) {
		setConstNumber(offset + 66, $act_diff_amt, value);
	}

	/**
	 *  実棚差異金額（データ）.<p>
	 *
	 */
	public void act_diff_amt(double value) {
		setConstNumber(offset + 66, $act_diff_amt, value);
	}


	/**
	 *  実棚差異金額（整数部）.<p>
	 *
	 */
	public String s_int_act_diff_amt() {
		return getConstString(offset + 67, $s_int_act_diff_amt);
	}

	/**
	 *  実棚差異金額（整数部）.<p>
	 *
	 */
	public void s_int_act_diff_amt(String value) {
		setConstString(offset + 67, $s_int_act_diff_amt, value);
	}


	/**
	 *  実棚差異金額（小数部）.<p>
	 *
	 */
	public String s_dec_act_diff_amt() {
		return getConstString(offset + 68, $s_dec_act_diff_amt);
	}

	/**
	 *  実棚差異金額（小数部）.<p>
	 *
	 */
	public void s_dec_act_diff_amt(String value) {
		setConstString(offset + 68, $s_dec_act_diff_amt, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String stktk_act_rmrks() {
		return getConstString(offset + 69, $stktk_act_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void stktk_act_rmrks(String value) {
		setConstString(offset + 69, $stktk_act_rmrks, value);
	}


	/**
	 *  予備１（データ）.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 70, $sub_char1);
	}

	/**
	 *  予備１（データ）.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 70, $sub_char1, value);
	}


	/**
	 *  予備２（データ）.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 71, $sub_char2);
	}

	/**
	 *  予備２（データ）.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 71, $sub_char2, value);
	}


	/**
	 *  予備３（データ）.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 72, $sub_char3);
	}

	/**
	 *  予備３（データ）.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 72, $sub_char3, value);
	}


	public String getString(String name) {
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			return stk_insp_typ_lbl();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm1();
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm2();
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm3();
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm4();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_arrv_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm1();
		}
		if ($stk_arrv_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm2();
		}
		if ($stk_arrv_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm3();
		}
		if ($stk_arrv_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm4();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($s_tor_qty.equalsIgnoreCase(name)) {
			return s_tor_qty();
		}
		if ($s_int_tor_qty.equalsIgnoreCase(name)) {
			return s_int_tor_qty();
		}
		if ($s_dec_tor_qty.equalsIgnoreCase(name)) {
			return s_dec_tor_qty();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($s_act_qty.equalsIgnoreCase(name)) {
			return s_act_qty();
		}
		if ($s_int_act_qty.equalsIgnoreCase(name)) {
			return s_int_act_qty();
		}
		if ($s_dec_act_qty.equalsIgnoreCase(name)) {
			return s_dec_act_qty();
		}
		if ($s_int_act_diff_qty.equalsIgnoreCase(name)) {
			return s_int_act_diff_qty();
		}
		if ($s_dec_act_diff_qty.equalsIgnoreCase(name)) {
			return s_dec_act_diff_qty();
		}
		if ($s_int_act_diff_amt.equalsIgnoreCase(name)) {
			return s_int_act_diff_amt();
		}
		if ($s_dec_act_diff_amt.equalsIgnoreCase(name)) {
			return s_dec_act_diff_amt();
		}
		if ($stktk_act_rmrks.equalsIgnoreCase(name)) {
			return stktk_act_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			return tor_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			return act_diff_qty();
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			return act_diff_amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			return stk_insp_typ_lbl();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm1();
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm2();
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm3();
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm4();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($stk_arrv_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm1();
		}
		if ($stk_arrv_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm2();
		}
		if ($stk_arrv_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm3();
		}
		if ($stk_arrv_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_arrv_bp_alt_nm4();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
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
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($s_tor_qty.equalsIgnoreCase(name)) {
			return s_tor_qty();
		}
		if ($s_int_tor_qty.equalsIgnoreCase(name)) {
			return s_int_tor_qty();
		}
		if ($s_dec_tor_qty.equalsIgnoreCase(name)) {
			return s_dec_tor_qty();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($s_act_qty.equalsIgnoreCase(name)) {
			return s_act_qty();
		}
		if ($s_int_act_qty.equalsIgnoreCase(name)) {
			return s_int_act_qty();
		}
		if ($s_dec_act_qty.equalsIgnoreCase(name)) {
			return s_dec_act_qty();
		}
		if ($s_int_act_diff_qty.equalsIgnoreCase(name)) {
			return s_int_act_diff_qty();
		}
		if ($s_dec_act_diff_qty.equalsIgnoreCase(name)) {
			return s_dec_act_diff_qty();
		}
		if ($s_int_act_diff_amt.equalsIgnoreCase(name)) {
			return s_int_act_diff_amt();
		}
		if ($s_dec_act_diff_amt.equalsIgnoreCase(name)) {
			return s_dec_act_diff_amt();
		}
		if ($stktk_act_rmrks.equalsIgnoreCase(name)) {
			return stktk_act_rmrks();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			return tor_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			return act_diff_qty();
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			return act_diff_amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			stk_insp_typ_lbl(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_bp_alt_nm1(value);
			return;
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_bp_alt_nm2(value);
			return;
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_bp_alt_nm3(value);
			return;
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_bp_alt_nm4(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm1(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm2(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm3(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm4(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($s_tor_qty.equalsIgnoreCase(name)) {
			s_tor_qty(value);
			return;
		}
		if ($s_int_tor_qty.equalsIgnoreCase(name)) {
			s_int_tor_qty(value);
			return;
		}
		if ($s_dec_tor_qty.equalsIgnoreCase(name)) {
			s_dec_tor_qty(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($s_act_qty.equalsIgnoreCase(name)) {
			s_act_qty(value);
			return;
		}
		if ($s_int_act_qty.equalsIgnoreCase(name)) {
			s_int_act_qty(value);
			return;
		}
		if ($s_dec_act_qty.equalsIgnoreCase(name)) {
			s_dec_act_qty(value);
			return;
		}
		if ($s_int_act_diff_qty.equalsIgnoreCase(name)) {
			s_int_act_diff_qty(value);
			return;
		}
		if ($s_dec_act_diff_qty.equalsIgnoreCase(name)) {
			s_dec_act_diff_qty(value);
			return;
		}
		if ($s_int_act_diff_amt.equalsIgnoreCase(name)) {
			s_int_act_diff_amt(value);
			return;
		}
		if ($s_dec_act_diff_amt.equalsIgnoreCase(name)) {
			s_dec_act_diff_amt(value);
			return;
		}
		if ($stktk_act_rmrks.equalsIgnoreCase(name)) {
			stktk_act_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			stk_insp_typ_lbl(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_bp_alt_nm1(value);
			return;
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_bp_alt_nm2(value);
			return;
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_bp_alt_nm3(value);
			return;
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_bp_alt_nm4(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm1(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm2(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm3(value);
			return;
		}
		if ($stk_arrv_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_arrv_bp_alt_nm4(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
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
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($s_tor_qty.equalsIgnoreCase(name)) {
			s_tor_qty(value);
			return;
		}
		if ($s_int_tor_qty.equalsIgnoreCase(name)) {
			s_int_tor_qty(value);
			return;
		}
		if ($s_dec_tor_qty.equalsIgnoreCase(name)) {
			s_dec_tor_qty(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($s_act_qty.equalsIgnoreCase(name)) {
			s_act_qty(value);
			return;
		}
		if ($s_int_act_qty.equalsIgnoreCase(name)) {
			s_int_act_qty(value);
			return;
		}
		if ($s_dec_act_qty.equalsIgnoreCase(name)) {
			s_dec_act_qty(value);
			return;
		}
		if ($s_int_act_diff_qty.equalsIgnoreCase(name)) {
			s_int_act_diff_qty(value);
			return;
		}
		if ($s_dec_act_diff_qty.equalsIgnoreCase(name)) {
			s_dec_act_diff_qty(value);
			return;
		}
		if ($s_int_act_diff_amt.equalsIgnoreCase(name)) {
			s_int_act_diff_amt(value);
			return;
		}
		if ($s_dec_act_diff_amt.equalsIgnoreCase(name)) {
			s_dec_act_diff_amt(value);
			return;
		}
		if ($stktk_act_rmrks.equalsIgnoreCase(name)) {
			stktk_act_rmrks(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($tor_qty.equalsIgnoreCase(name)) {
			tor_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($act_diff_qty.equalsIgnoreCase(name)) {
			act_diff_qty(value);
			return;
		}
		if ($act_diff_amt.equalsIgnoreCase(name)) {
			act_diff_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

