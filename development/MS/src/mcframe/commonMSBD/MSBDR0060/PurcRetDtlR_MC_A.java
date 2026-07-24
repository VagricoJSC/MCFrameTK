package mcframe.commonMSBD.MSBDR0060;

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
 * ブロック"PurcRetDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcRetDtlR_MC_A extends MCConstRow {

	/**
	 *  弊社品目.<p>
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
	 *  ロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
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
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public static final String $t_interim = "t_interim";
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
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  税額（内税）.<p>
	 *
	 */
	public static final String $t_inc_tax = "t_inc_tax";
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
	 *  返品理由.<p>
	 *
	 */
	public static final String $ret_rsn_cd = "ret_rsn_cd";
	/**
	 *  返品理由名.<p>
	 *
	 */
	public static final String $ret_rsn_nm = "ret_rsn_nm";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
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
	 *  仕入返品票明細備考.<p>
	 *
	 */
	public static final String $purc_ret_print_d_rmrks = "purc_ret_print_d_rmrks";
	/**
	 *  加工単価.<p>
	 *
	 */
	public static final String $trd_cur_proc_upri = "trd_cur_proc_upri";
	/**
	 *  加工単価（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_proc_upri = "s_int_trd_cur_proc_upri";
	/**
	 *  加工単価（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_proc_upri = "s_dec_trd_cur_proc_upri";
	/**
	 *  加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 *  加工金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_proc_amt = "s_int_trd_cur_proc_amt";
	/**
	 *  加工金額（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_proc_amt = "s_dec_trd_cur_proc_amt";
	/**
	 *  有償支給単価.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_upri = "trd_cur_onr_prov_upri";
	/**
	 *  有償支給単価（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_onr_prov_upri = "s_int_trd_cur_onr_prov_upri";
	/**
	 *  有償支給単価（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_onr_prov_upri = "s_dec_trd_cur_onr_prov_upri";
	/**
	 *  有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 *  有償支給金額（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_onr_prov_amt = "s_int_trd_cur_onr_prov_amt";
	/**
	 *  有償支給金額（小数部）.<p>
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
	 *  仕入返品実績明細予備１.<p>
	 *
	 */
	public static final String $purc_ret_act_d_sub_char1 = "purc_ret_act_d_sub_char1";
	/**
	 *  仕入返品実績明細予備２.<p>
	 *
	 */
	public static final String $purc_ret_act_d_sub_char2 = "purc_ret_act_d_sub_char2";
	/**
	 *  仕入返品実績明細予備３.<p>
	 *
	 */
	public static final String $purc_ret_act_d_sub_char3 = "purc_ret_act_d_sub_char3";
	/**
	 *  仕入実績明細予備１.<p>
	 *
	 */
	public static final String $purc_act_d_sub_char1 = "purc_act_d_sub_char1";
	/**
	 *  仕入実績明細予備２.<p>
	 *
	 */
	public static final String $purc_act_d_sub_char2 = "purc_act_d_sub_char2";
	/**
	 *  仕入実績明細予備３.<p>
	 *
	 */
	public static final String $purc_act_d_sub_char3 = "purc_act_d_sub_char3";


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
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta t_interim_META = createStringMeta($t_interim);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_upri_META = createStringMeta($s_int_trd_cur_upri);
	public static final MCMeta s_dec_trd_cur_upri_META = createStringMeta($s_dec_trd_cur_upri);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_amt_META = createStringMeta($s_int_trd_cur_amt);
	public static final MCMeta s_dec_trd_cur_amt_META = createStringMeta($s_dec_trd_cur_amt);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta t_inc_tax_META = createStringMeta($t_inc_tax);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_tax_amt_META = createStringMeta($s_int_trd_cur_tax_amt);
	public static final MCMeta s_dec_trd_cur_tax_amt_META = createStringMeta($s_dec_trd_cur_tax_amt);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_dscnt_amt_META = createStringMeta($s_int_trd_cur_dscnt_amt);
	public static final MCMeta s_dec_trd_cur_dscnt_amt_META = createStringMeta($s_dec_trd_cur_dscnt_amt);
	public static final MCMeta ret_rsn_cd_META = createCommonMeta($ret_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta ret_rsn_nm_META = createCommonMeta($ret_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta purc_ret_print_d_rmrks_META = createCommonMeta($purc_ret_print_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_RMRKS);
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
	public static final MCMeta purc_ret_act_d_sub_char1_META = createCommonMeta($purc_ret_act_d_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR1);
	public static final MCMeta purc_ret_act_d_sub_char2_META = createCommonMeta($purc_ret_act_d_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR2);
	public static final MCMeta purc_ret_act_d_sub_char3_META = createCommonMeta($purc_ret_act_d_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_D_SUB_CHAR3);
	public static final MCMeta purc_act_d_sub_char1_META = createCommonMeta($purc_act_d_sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR1);
	public static final MCMeta purc_act_d_sub_char2_META = createCommonMeta($purc_act_d_sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR2);
	public static final MCMeta purc_act_d_sub_char3_META = createCommonMeta($purc_act_d_sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR3);

	protected static final ConstMetaList<PurcRetDtlR> constMetas = new ConstMetaList<PurcRetDtlR>(
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
			sublot_no_META,
			lot_no_META,
			ver_no_lbl_META,
			ver_no_META,
			trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			interim_flg_META,
			t_interim_META,
			trd_cur_upri_META,
			s_int_trd_cur_upri_META,
			s_dec_trd_cur_upri_META,
			trd_cur_amt_META,
			s_int_trd_cur_amt_META,
			s_dec_trd_cur_amt_META,
			inc_tax_flg_META,
			t_inc_tax_META,
			trd_cur_tax_amt_META,
			s_int_trd_cur_tax_amt_META,
			s_dec_trd_cur_tax_amt_META,
			trd_cur_dscnt_amt_META,
			s_int_trd_cur_dscnt_amt_META,
			s_dec_trd_cur_dscnt_amt_META,
			ret_rsn_cd_META,
			ret_rsn_nm_META,
			po_no_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			bp_lot_no_META,
			purc_ret_print_d_rmrks_META,
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
			purc_ret_act_d_sub_char1_META,
			purc_ret_act_d_sub_char2_META,
			purc_ret_act_d_sub_char3_META,
			purc_act_d_sub_char1_META,
			purc_act_d_sub_char2_META,
			purc_act_d_sub_char3_META
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
	protected PurcRetDtlR_MC_A(ConstMetaList<? extends PurcRetDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetDtlR clone() {
		return (PurcRetDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetDtlR createInstance() {
		return (PurcRetDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetDtlR getValues(String... names) {
		return (PurcRetDtlR) super.getValues(names);
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
	 *  枝番１(表示用).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 1, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 1, $itm_sub1_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 2, $itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 2, $itm_sub1_data, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 3, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 3, $itm_sub2_view, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 4, $itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 4, $itm_sub2_data, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 5, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 5, $itm_sub3_view, value);
	}


	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 6, $itm_sub3_data);
	}

	/**
	 *  枝番３(データ).<p>
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
	 *  ロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 13, $sublot_no);
	}

	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 13, $sublot_no, value);
	}


	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 14, $lot_no);
	}

	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 14, $lot_no, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 15, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 15, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 16, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 16, $ver_no, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 17, $trd_unit_qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 17, $trd_unit_qty, value);
	}


	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 18, $s_int_trd_unit_qty);
	}

	/**
	 *  数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 18, $s_int_trd_unit_qty, value);
	}


	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 19, $s_dec_trd_unit_qty);
	}

	/**
	 *  数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 19, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  単位.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 20, $trd_unit_cd);
	}

	/**
	 *  単位.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 20, $trd_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 21, $trd_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 21, $trd_unit_nm, value);
	}


	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 22, $interim_flg);
	}

	/**
	 *  仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 22, $interim_flg, value);
	}


	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public String t_interim() {
		return getConstString(offset + 23, $t_interim);
	}

	/**
	 *  単価（仮単価）.<p>
	 *
	 */
	public void t_interim(String value) {
		setConstString(offset + 23, $t_interim, value);
	}


	/**
	 *  単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 24, $trd_cur_upri);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}

	/**
	 *  単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}


	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_upri() {
		return getConstString(offset + 25, $s_int_trd_cur_upri);
	}

	/**
	 *  単価文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_upri(String value) {
		setConstString(offset + 25, $s_int_trd_cur_upri, value);
	}


	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_upri() {
		return getConstString(offset + 26, $s_dec_trd_cur_upri);
	}

	/**
	 *  単価文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_upri(String value) {
		setConstString(offset + 26, $s_dec_trd_cur_upri, value);
	}


	/**
	 *  金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 27, $trd_cur_amt);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}

	/**
	 *  金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 27, $trd_cur_amt, value);
	}


	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_amt() {
		return getConstString(offset + 28, $s_int_trd_cur_amt);
	}

	/**
	 *  金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_amt(String value) {
		setConstString(offset + 28, $s_int_trd_cur_amt, value);
	}


	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_amt() {
		return getConstString(offset + 29, $s_dec_trd_cur_amt);
	}

	/**
	 *  金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_amt(String value) {
		setConstString(offset + 29, $s_dec_trd_cur_amt, value);
	}


	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 30, $inc_tax_flg);
	}

	/**
	 *  内税ＦＬＧ.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 30, $inc_tax_flg, value);
	}


	/**
	 *  税額（内税）.<p>
	 *
	 */
	public String t_inc_tax() {
		return getConstString(offset + 31, $t_inc_tax);
	}

	/**
	 *  税額（内税）.<p>
	 *
	 */
	public void t_inc_tax(String value) {
		setConstString(offset + 31, $t_inc_tax, value);
	}


	/**
	 *  税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 32, $trd_cur_tax_amt);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}

	/**
	 *  税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 32, $trd_cur_tax_amt, value);
	}


	/**
	 *  税額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_tax_amt() {
		return getConstString(offset + 33, $s_int_trd_cur_tax_amt);
	}

	/**
	 *  税額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_tax_amt(String value) {
		setConstString(offset + 33, $s_int_trd_cur_tax_amt, value);
	}


	/**
	 *  税額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_amt() {
		return getConstString(offset + 34, $s_dec_trd_cur_tax_amt);
	}

	/**
	 *  税額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_amt(String value) {
		setConstString(offset + 34, $s_dec_trd_cur_tax_amt, value);
	}


	/**
	 *  値引金額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 35, $trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 35, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 35, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 35, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 35, $trd_cur_dscnt_amt, value);
	}

	/**
	 *  値引金額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 35, $trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_dscnt_amt() {
		return getConstString(offset + 36, $s_int_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 36, $s_int_trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_dscnt_amt() {
		return getConstString(offset + 37, $s_dec_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 37, $s_dec_trd_cur_dscnt_amt, value);
	}


	/**
	 *  返品理由.<p>
	 *
	 */
	public String ret_rsn_cd() {
		return getConstString(offset + 38, $ret_rsn_cd);
	}

	/**
	 *  返品理由.<p>
	 *
	 */
	public void ret_rsn_cd(String value) {
		setConstString(offset + 38, $ret_rsn_cd, value);
	}


	/**
	 *  返品理由名.<p>
	 *
	 */
	public String ret_rsn_nm() {
		return getConstString(offset + 39, $ret_rsn_nm);
	}

	/**
	 *  返品理由名.<p>
	 *
	 */
	public void ret_rsn_nm(String value) {
		setConstString(offset + 39, $ret_rsn_nm, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 40, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 40, $po_no, value);
	}


	/**
	 *  貴社品目.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 41, $sppl_itm_cd);
	}

	/**
	 *  貴社品目.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 41, $sppl_itm_cd, value);
	}


	/**
	 *  貴社品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 42, $sppl_itm_nm);
	}

	/**
	 *  貴社品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 42, $sppl_itm_nm, value);
	}


	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 43, $bp_lot_no);
	}

	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 43, $bp_lot_no, value);
	}


	/**
	 *  仕入返品票明細備考.<p>
	 *
	 */
	public String purc_ret_print_d_rmrks() {
		return getConstString(offset + 44, $purc_ret_print_d_rmrks);
	}

	/**
	 *  仕入返品票明細備考.<p>
	 *
	 */
	public void purc_ret_print_d_rmrks(String value) {
		setConstString(offset + 44, $purc_ret_print_d_rmrks, value);
	}


	/**
	 *  加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return getConstNumber(offset + 45, $trd_cur_proc_upri);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 45, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		setConstNumber(offset + 45, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		setConstNumber(offset + 45, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		setConstNumber(offset + 45, $trd_cur_proc_upri, value);
	}

	/**
	 *  加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		setConstNumber(offset + 45, $trd_cur_proc_upri, value);
	}


	/**
	 *  加工単価（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_proc_upri() {
		return getConstString(offset + 46, $s_int_trd_cur_proc_upri);
	}

	/**
	 *  加工単価（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_proc_upri(String value) {
		setConstString(offset + 46, $s_int_trd_cur_proc_upri, value);
	}


	/**
	 *  加工単価（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_proc_upri() {
		return getConstString(offset + 47, $s_dec_trd_cur_proc_upri);
	}

	/**
	 *  加工単価（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_proc_upri(String value) {
		setConstString(offset + 47, $s_dec_trd_cur_proc_upri, value);
	}


	/**
	 *  加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 48, $trd_cur_proc_amt);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 48, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 48, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 48, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 48, $trd_cur_proc_amt, value);
	}

	/**
	 *  加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 48, $trd_cur_proc_amt, value);
	}


	/**
	 *  加工金額（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_proc_amt() {
		return getConstString(offset + 49, $s_int_trd_cur_proc_amt);
	}

	/**
	 *  加工金額（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_proc_amt(String value) {
		setConstString(offset + 49, $s_int_trd_cur_proc_amt, value);
	}


	/**
	 *  加工金額（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_proc_amt() {
		return getConstString(offset + 50, $s_dec_trd_cur_proc_amt);
	}

	/**
	 *  加工金額（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_proc_amt(String value) {
		setConstString(offset + 50, $s_dec_trd_cur_proc_amt, value);
	}


	/**
	 *  有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 51, $trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 51, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 51, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 51, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 51, $trd_cur_onr_prov_upri, value);
	}

	/**
	 *  有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 51, $trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_onr_prov_upri() {
		return getConstString(offset + 52, $s_int_trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_onr_prov_upri(String value) {
		setConstString(offset + 52, $s_int_trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給単価（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_onr_prov_upri() {
		return getConstString(offset + 53, $s_dec_trd_cur_onr_prov_upri);
	}

	/**
	 *  有償支給単価（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_onr_prov_upri(String value) {
		setConstString(offset + 53, $s_dec_trd_cur_onr_prov_upri, value);
	}


	/**
	 *  有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 54, $trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 54, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 54, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 54, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 54, $trd_cur_onr_prov_amt, value);
	}

	/**
	 *  有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 54, $trd_cur_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_onr_prov_amt() {
		return getConstString(offset + 55, $s_int_trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_onr_prov_amt(String value) {
		setConstString(offset + 55, $s_int_trd_cur_onr_prov_amt, value);
	}


	/**
	 *  有償支給金額（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_onr_prov_amt() {
		return getConstString(offset + 56, $s_dec_trd_cur_onr_prov_amt);
	}

	/**
	 *  有償支給金額（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_onr_prov_amt(String value) {
		setConstString(offset + 56, $s_dec_trd_cur_onr_prov_amt, value);
	}


	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 57, $repurc_obli_flg);
	}

	/**
	 *  買戻義務ＦＬＧ.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 57, $repurc_obli_flg, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 58, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 58, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 58, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 58, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 58, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 58, $disp_seq, value);
	}


	/**
	 *  仕入返品実績明細予備１.<p>
	 *
	 */
	public String purc_ret_act_d_sub_char1() {
		return getConstString(offset + 59, $purc_ret_act_d_sub_char1);
	}

	/**
	 *  仕入返品実績明細予備１.<p>
	 *
	 */
	public void purc_ret_act_d_sub_char1(String value) {
		setConstString(offset + 59, $purc_ret_act_d_sub_char1, value);
	}


	/**
	 *  仕入返品実績明細予備２.<p>
	 *
	 */
	public String purc_ret_act_d_sub_char2() {
		return getConstString(offset + 60, $purc_ret_act_d_sub_char2);
	}

	/**
	 *  仕入返品実績明細予備２.<p>
	 *
	 */
	public void purc_ret_act_d_sub_char2(String value) {
		setConstString(offset + 60, $purc_ret_act_d_sub_char2, value);
	}


	/**
	 *  仕入返品実績明細予備３.<p>
	 *
	 */
	public String purc_ret_act_d_sub_char3() {
		return getConstString(offset + 61, $purc_ret_act_d_sub_char3);
	}

	/**
	 *  仕入返品実績明細予備３.<p>
	 *
	 */
	public void purc_ret_act_d_sub_char3(String value) {
		setConstString(offset + 61, $purc_ret_act_d_sub_char3, value);
	}


	/**
	 *  仕入実績明細予備１.<p>
	 *
	 */
	public String purc_act_d_sub_char1() {
		return getConstString(offset + 62, $purc_act_d_sub_char1);
	}

	/**
	 *  仕入実績明細予備１.<p>
	 *
	 */
	public void purc_act_d_sub_char1(String value) {
		setConstString(offset + 62, $purc_act_d_sub_char1, value);
	}


	/**
	 *  仕入実績明細予備２.<p>
	 *
	 */
	public String purc_act_d_sub_char2() {
		return getConstString(offset + 63, $purc_act_d_sub_char2);
	}

	/**
	 *  仕入実績明細予備２.<p>
	 *
	 */
	public void purc_act_d_sub_char2(String value) {
		setConstString(offset + 63, $purc_act_d_sub_char2, value);
	}


	/**
	 *  仕入実績明細予備３.<p>
	 *
	 */
	public String purc_act_d_sub_char3() {
		return getConstString(offset + 64, $purc_act_d_sub_char3);
	}

	/**
	 *  仕入実績明細予備３.<p>
	 *
	 */
	public void purc_act_d_sub_char3(String value) {
		setConstString(offset + 64, $purc_act_d_sub_char3, value);
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
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
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
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			return ret_rsn_cd();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
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
		if ($purc_ret_act_d_sub_char1.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char1();
		}
		if ($purc_ret_act_d_sub_char2.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char2();
		}
		if ($purc_ret_act_d_sub_char3.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char3();
		}
		if ($purc_act_d_sub_char1.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char1();
		}
		if ($purc_act_d_sub_char2.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char2();
		}
		if ($purc_act_d_sub_char3.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
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
	public boolean getBoolean(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
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
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
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
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			return ret_rsn_cd();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
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
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_d_rmrks();
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
		if ($purc_ret_act_d_sub_char1.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char1();
		}
		if ($purc_ret_act_d_sub_char2.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char2();
		}
		if ($purc_ret_act_d_sub_char3.equalsIgnoreCase(name)) {
			return purc_ret_act_d_sub_char3();
		}
		if ($purc_act_d_sub_char1.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char1();
		}
		if ($purc_act_d_sub_char2.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char2();
		}
		if ($purc_act_d_sub_char3.equalsIgnoreCase(name)) {
			return purc_act_d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
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
	public boolean getBooleanNE(String name) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
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
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
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
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			ret_rsn_cd(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
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
		if ($purc_ret_act_d_sub_char1.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char1(value);
			return;
		}
		if ($purc_ret_act_d_sub_char2.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char2(value);
			return;
		}
		if ($purc_ret_act_d_sub_char3.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char3(value);
			return;
		}
		if ($purc_act_d_sub_char1.equalsIgnoreCase(name)) {
			purc_act_d_sub_char1(value);
			return;
		}
		if ($purc_act_d_sub_char2.equalsIgnoreCase(name)) {
			purc_act_d_sub_char2(value);
			return;
		}
		if ($purc_act_d_sub_char3.equalsIgnoreCase(name)) {
			purc_act_d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
	public void setBoolean(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
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
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
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
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_dscnt_amt(value);
			return;
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_dscnt_amt(value);
			return;
		}
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			ret_rsn_cd(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
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
		if ($purc_ret_print_d_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_d_rmrks(value);
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
		if ($purc_ret_act_d_sub_char1.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char1(value);
			return;
		}
		if ($purc_ret_act_d_sub_char2.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char2(value);
			return;
		}
		if ($purc_ret_act_d_sub_char3.equalsIgnoreCase(name)) {
			purc_ret_act_d_sub_char3(value);
			return;
		}
		if ($purc_act_d_sub_char1.equalsIgnoreCase(name)) {
			purc_act_d_sub_char1(value);
			return;
		}
		if ($purc_act_d_sub_char2.equalsIgnoreCase(name)) {
			purc_act_d_sub_char2(value);
			return;
		}
		if ($purc_act_d_sub_char3.equalsIgnoreCase(name)) {
			purc_act_d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

