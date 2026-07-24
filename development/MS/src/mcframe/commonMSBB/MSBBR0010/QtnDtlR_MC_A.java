package mcframe.commonMSBB.MSBBR0010;

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
 * ブロック"QtnDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class QtnDtlR_MC_A extends MCConstRow {

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（データ）.<p>
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
	 *  インボイス表記用品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 *  得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  取引単位数量（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  取引単位数量（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 *  仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public static final String $t_interim = "t_interim";
	/**
	 *  内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 *  内税文字列.<p>
	 *
	 */
	public static final String $t_inc_tax = "t_inc_tax";
	/**
	 *  仕切単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 *  仕切単価（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_upri = "s_int_trd_cur_upri";
	/**
	 *  仕切単価（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_upri = "s_dec_trd_cur_upri";
	/**
	 *  標準単価.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_upri = "trd_cur_std_sls_upri";
	/**
	 *  標準単価（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_std_sls_upri = "s_int_trd_cur_std_sls_upri";
	/**
	 *  標準単価（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_std_sls_upri = "s_dec_trd_cur_std_sls_upri";
	/**
	 *  仕切金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  仕切金額（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_amt = "s_int_trd_cur_amt";
	/**
	 *  仕切金額（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_amt = "s_dec_trd_cur_amt";
	/**
	 *  標準金額.<p>
	 *
	 */
	public static final String $trd_cur_std_sls_amt = "trd_cur_std_sls_amt";
	/**
	 *  標準金額（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_std_sls_amt = "s_int_trd_cur_std_sls_amt";
	/**
	 *  標準金額（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_std_sls_amt = "s_dec_trd_cur_std_sls_amt";
	/**
	 *  値引金額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 *  値引金額（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_dscnt_amt = "s_int_trd_cur_dscnt_amt";
	/**
	 *  値引金額（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_dscnt_amt = "s_dec_trd_cur_dscnt_amt";
	/**
	 *  仕切税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 *  仕切税額（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_cur_tax_amt = "s_int_trd_cur_tax_amt";
	/**
	 *  仕切税額（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_tax_amt = "s_dec_trd_cur_tax_amt";
	/**
	 *  税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 *  税率文字列.<p>
	 *
	 */
	public static final String $s_tax_rate = "s_tax_rate";
	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 *  納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 *  納品先別名１.<p>
	 *
	 */
	public static final String $dlv_alt_nm1 = "dlv_alt_nm1";
	/**
	 *  納品先別名２.<p>
	 *
	 */
	public static final String $dlv_alt_nm2 = "dlv_alt_nm2";
	/**
	 *  納品先別名３.<p>
	 *
	 */
	public static final String $dlv_alt_nm3 = "dlv_alt_nm3";
	/**
	 *  納品先別名４.<p>
	 *
	 */
	public static final String $dlv_alt_nm4 = "dlv_alt_nm4";
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
	 *  納品先住所１～４.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 *  見積明細備考.<p>
	 *
	 */
	public static final String $qtn_d_rmrks = "qtn_d_rmrks";
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
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta t_interim_META = createStringMeta($t_interim);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta t_inc_tax_META = createStringMeta($t_inc_tax);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_upri_META = createStringMeta($s_int_trd_cur_upri);
	public static final MCMeta s_dec_trd_cur_upri_META = createStringMeta($s_dec_trd_cur_upri);
	public static final MCMeta trd_cur_std_sls_upri_META = createCommonMeta($trd_cur_std_sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_std_sls_upri_META = createStringMeta($s_int_trd_cur_std_sls_upri);
	public static final MCMeta s_dec_trd_cur_std_sls_upri_META = createStringMeta($s_dec_trd_cur_std_sls_upri);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_amt_META = createStringMeta($s_int_trd_cur_amt);
	public static final MCMeta s_dec_trd_cur_amt_META = createStringMeta($s_dec_trd_cur_amt);
	public static final MCMeta trd_cur_std_sls_amt_META = createCommonMeta($trd_cur_std_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_std_sls_amt_META = createStringMeta($s_int_trd_cur_std_sls_amt);
	public static final MCMeta s_dec_trd_cur_std_sls_amt_META = createStringMeta($s_dec_trd_cur_std_sls_amt);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_dscnt_amt_META = createStringMeta($s_int_trd_cur_dscnt_amt);
	public static final MCMeta s_dec_trd_cur_dscnt_amt_META = createStringMeta($s_dec_trd_cur_dscnt_amt);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_tax_amt_META = createStringMeta($s_int_trd_cur_tax_amt);
	public static final MCMeta s_dec_trd_cur_tax_amt_META = createStringMeta($s_dec_trd_cur_tax_amt);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta s_tax_rate_META = createStringMeta($s_tax_rate);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_alt_nm1_META = createCommonMeta($dlv_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_alt_nm2_META = createCommonMeta($dlv_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_alt_nm3_META = createCommonMeta($dlv_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_alt_nm4_META = createCommonMeta($dlv_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta qtn_d_rmrks_META = createCommonMeta($qtn_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RMRKS);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR3);

	protected static final ConstMetaList<QtnDtlR> constMetas = new ConstMetaList<QtnDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
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
			iv_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			cntry_org_cd_META,
			interim_flg_META,
			t_interim_META,
			inc_tax_flg_META,
			t_inc_tax_META,
			trd_cur_upri_META,
			s_int_trd_cur_upri_META,
			s_dec_trd_cur_upri_META,
			trd_cur_std_sls_upri_META,
			s_int_trd_cur_std_sls_upri_META,
			s_dec_trd_cur_std_sls_upri_META,
			trd_cur_amt_META,
			s_int_trd_cur_amt_META,
			s_dec_trd_cur_amt_META,
			trd_cur_std_sls_amt_META,
			s_int_trd_cur_std_sls_amt_META,
			s_dec_trd_cur_std_sls_amt_META,
			trd_cur_dscnt_amt_META,
			s_int_trd_cur_dscnt_amt_META,
			s_dec_trd_cur_dscnt_amt_META,
			trd_cur_tax_amt_META,
			s_int_trd_cur_tax_amt_META,
			s_dec_trd_cur_tax_amt_META,
			tax_rate_META,
			s_tax_rate_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_alt_nm1_META,
			dlv_alt_nm2_META,
			dlv_alt_nm3_META,
			dlv_alt_nm4_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_cntry_nm_META,
			qtn_d_rmrks_META,
			disp_seq_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META
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
	protected QtnDtlR_MC_A(ConstMetaList<? extends QtnDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnDtlR clone() {
		return (QtnDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnDtlR createInstance() {
		return (QtnDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnDtlR getValues(String... names) {
		return (QtnDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
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
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 2, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 2, $itm_sub2_view, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 3, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 3, $itm_sub3_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 4, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 4, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 5, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 5, $itm_sub2_data, value);
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
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 8, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 8, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 9, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 9, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 10, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 10, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 11, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 11, $itm_alt_nm4, value);
	}


	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 12, $iv_itm_nm);
	}

	/**
	 *  インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 12, $iv_itm_nm, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 13, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 13, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 14, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 14, $cst_itm_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 15, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 15, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 15, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 15, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 15, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 15, $trd_unit_qty, value);
	}


	/**
	 *  取引単位数量（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 16, $s_int_trd_unit_qty);
	}

	/**
	 *  取引単位数量（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 16, $s_int_trd_unit_qty, value);
	}


	/**
	 *  取引単位数量（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 17, $s_dec_trd_unit_qty);
	}

	/**
	 *  取引単位数量（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 17, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 18, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 18, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 19, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 19, $trd_unit_nm, value);
	}


	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 20, $cntry_org_cd);
	}

	/**
	 *  原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 20, $cntry_org_cd, value);
	}


	/**
	 *  仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 21, $interim_flg);
	}

	/**
	 *  仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 21, $interim_flg, value);
	}


	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public String t_interim() {
		return getConstString(offset + 22, $t_interim);
	}

	/**
	 *  仮単価文字列.<p>
	 *
	 */
	public void t_interim(String value) {
		setConstString(offset + 22, $t_interim, value);
	}


	/**
	 *  内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 23, $inc_tax_flg);
	}

	/**
	 *  内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 23, $inc_tax_flg, value);
	}


	/**
	 *  内税文字列.<p>
	 *
	 */
	public String t_inc_tax() {
		return getConstString(offset + 24, $t_inc_tax);
	}

	/**
	 *  内税文字列.<p>
	 *
	 */
	public void t_inc_tax(String value) {
		setConstString(offset + 24, $t_inc_tax, value);
	}


	/**
	 *  仕切単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 25, $trd_cur_upri);
	}

	/**
	 *  仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_upri, value);
	}

	/**
	 *  仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 25, $trd_cur_upri, value);
	}

	/**
	 *  仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 25, $trd_cur_upri, value);
	}

	/**
	 *  仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 25, $trd_cur_upri, value);
	}

	/**
	 *  仕切単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 25, $trd_cur_upri, value);
	}


	/**
	 *  仕切単価（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_upri() {
		return getConstString(offset + 26, $s_int_trd_cur_upri);
	}

	/**
	 *  仕切単価（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_upri(String value) {
		setConstString(offset + 26, $s_int_trd_cur_upri, value);
	}


	/**
	 *  仕切単価（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_upri() {
		return getConstString(offset + 27, $s_dec_trd_cur_upri);
	}

	/**
	 *  仕切単価（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_upri(String value) {
		setConstString(offset + 27, $s_dec_trd_cur_upri, value);
	}


	/**
	 *  標準単価.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_upri() {
		return getConstNumber(offset + 28, $trd_cur_std_sls_upri);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(MCNumber value) {
		setConstNumber(offset + 28, $trd_cur_std_sls_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(int value) {
		setConstNumber(offset + 28, $trd_cur_std_sls_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(long value) {
		setConstNumber(offset + 28, $trd_cur_std_sls_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(float value) {
		setConstNumber(offset + 28, $trd_cur_std_sls_upri, value);
	}

	/**
	 *  標準単価.<p>
	 *
	 */
	public void trd_cur_std_sls_upri(double value) {
		setConstNumber(offset + 28, $trd_cur_std_sls_upri, value);
	}


	/**
	 *  標準単価（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_std_sls_upri() {
		return getConstString(offset + 29, $s_int_trd_cur_std_sls_upri);
	}

	/**
	 *  標準単価（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_std_sls_upri(String value) {
		setConstString(offset + 29, $s_int_trd_cur_std_sls_upri, value);
	}


	/**
	 *  標準単価（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_std_sls_upri() {
		return getConstString(offset + 30, $s_dec_trd_cur_std_sls_upri);
	}

	/**
	 *  標準単価（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_std_sls_upri(String value) {
		setConstString(offset + 30, $s_dec_trd_cur_std_sls_upri, value);
	}


	/**
	 *  仕切金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 31, $trd_cur_amt);
	}

	/**
	 *  仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 *  仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 *  仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 *  仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}

	/**
	 *  仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 31, $trd_cur_amt, value);
	}


	/**
	 *  仕切金額（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_amt() {
		return getConstString(offset + 32, $s_int_trd_cur_amt);
	}

	/**
	 *  仕切金額（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_amt(String value) {
		setConstString(offset + 32, $s_int_trd_cur_amt, value);
	}


	/**
	 *  仕切金額（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_amt() {
		return getConstString(offset + 33, $s_dec_trd_cur_amt);
	}

	/**
	 *  仕切金額（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_amt(String value) {
		setConstString(offset + 33, $s_dec_trd_cur_amt, value);
	}


	/**
	 *  標準金額.<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_amt() {
		return getConstNumber(offset + 34, $trd_cur_std_sls_amt);
	}

	/**
	 *  標準金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(MCNumber value) {
		setConstNumber(offset + 34, $trd_cur_std_sls_amt, value);
	}

	/**
	 *  標準金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(int value) {
		setConstNumber(offset + 34, $trd_cur_std_sls_amt, value);
	}

	/**
	 *  標準金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(long value) {
		setConstNumber(offset + 34, $trd_cur_std_sls_amt, value);
	}

	/**
	 *  標準金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(float value) {
		setConstNumber(offset + 34, $trd_cur_std_sls_amt, value);
	}

	/**
	 *  標準金額.<p>
	 *
	 */
	public void trd_cur_std_sls_amt(double value) {
		setConstNumber(offset + 34, $trd_cur_std_sls_amt, value);
	}


	/**
	 *  標準金額（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_std_sls_amt() {
		return getConstString(offset + 35, $s_int_trd_cur_std_sls_amt);
	}

	/**
	 *  標準金額（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_std_sls_amt(String value) {
		setConstString(offset + 35, $s_int_trd_cur_std_sls_amt, value);
	}


	/**
	 *  標準金額（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_std_sls_amt() {
		return getConstString(offset + 36, $s_dec_trd_cur_std_sls_amt);
	}

	/**
	 *  標準金額（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_std_sls_amt(String value) {
		setConstString(offset + 36, $s_dec_trd_cur_std_sls_amt, value);
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
	 *  値引金額（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_dscnt_amt() {
		return getConstString(offset + 38, $s_int_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 38, $s_int_trd_cur_dscnt_amt, value);
	}


	/**
	 *  値引金額（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_dscnt_amt() {
		return getConstString(offset + 39, $s_dec_trd_cur_dscnt_amt);
	}

	/**
	 *  値引金額（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_dscnt_amt(String value) {
		setConstString(offset + 39, $s_dec_trd_cur_dscnt_amt, value);
	}


	/**
	 *  仕切税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 40, $trd_cur_tax_amt);
	}

	/**
	 *  仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 40, $trd_cur_tax_amt, value);
	}


	/**
	 *  仕切税額（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_cur_tax_amt() {
		return getConstString(offset + 41, $s_int_trd_cur_tax_amt);
	}

	/**
	 *  仕切税額（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_cur_tax_amt(String value) {
		setConstString(offset + 41, $s_int_trd_cur_tax_amt, value);
	}


	/**
	 *  仕切税額（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_amt() {
		return getConstString(offset + 42, $s_dec_trd_cur_tax_amt);
	}

	/**
	 *  仕切税額（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_amt(String value) {
		setConstString(offset + 42, $s_dec_trd_cur_tax_amt, value);
	}


	/**
	 *  税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 43, $tax_rate);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}

	/**
	 *  税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 43, $tax_rate, value);
	}


	/**
	 *  税率文字列.<p>
	 *
	 */
	public String s_tax_rate() {
		return getConstString(offset + 44, $s_tax_rate);
	}

	/**
	 *  税率文字列.<p>
	 *
	 */
	public void s_tax_rate(String value) {
		setConstString(offset + 44, $s_tax_rate, value);
	}


	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 45, $dlv_cd);
	}

	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 45, $dlv_cd, value);
	}


	/**
	 *  納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 46, $dlv_nm);
	}

	/**
	 *  納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 46, $dlv_nm, value);
	}


	/**
	 *  納品先別名１.<p>
	 *
	 */
	public String dlv_alt_nm1() {
		return getConstString(offset + 47, $dlv_alt_nm1);
	}

	/**
	 *  納品先別名１.<p>
	 *
	 */
	public void dlv_alt_nm1(String value) {
		setConstString(offset + 47, $dlv_alt_nm1, value);
	}


	/**
	 *  納品先別名２.<p>
	 *
	 */
	public String dlv_alt_nm2() {
		return getConstString(offset + 48, $dlv_alt_nm2);
	}

	/**
	 *  納品先別名２.<p>
	 *
	 */
	public void dlv_alt_nm2(String value) {
		setConstString(offset + 48, $dlv_alt_nm2, value);
	}


	/**
	 *  納品先別名３.<p>
	 *
	 */
	public String dlv_alt_nm3() {
		return getConstString(offset + 49, $dlv_alt_nm3);
	}

	/**
	 *  納品先別名３.<p>
	 *
	 */
	public void dlv_alt_nm3(String value) {
		setConstString(offset + 49, $dlv_alt_nm3, value);
	}


	/**
	 *  納品先別名４.<p>
	 *
	 */
	public String dlv_alt_nm4() {
		return getConstString(offset + 50, $dlv_alt_nm4);
	}

	/**
	 *  納品先別名４.<p>
	 *
	 */
	public void dlv_alt_nm4(String value) {
		setConstString(offset + 50, $dlv_alt_nm4, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 51, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 51, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 52, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 52, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 53, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 53, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 54, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 54, $dlv_addr4, value);
	}


	/**
	 *  納品先住所１～４.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 55, $dlv_addr);
	}

	/**
	 *  納品先住所１～４.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 55, $dlv_addr, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 56, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 56, $dlv_cntry_nm, value);
	}


	/**
	 *  見積明細備考.<p>
	 *
	 */
	public String qtn_d_rmrks() {
		return getConstString(offset + 57, $qtn_d_rmrks);
	}

	/**
	 *  見積明細備考.<p>
	 *
	 */
	public void qtn_d_rmrks(String value) {
		setConstString(offset + 57, $qtn_d_rmrks, value);
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
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 59, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 59, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 60, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 60, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 61, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 61, $d_sub_char3, value);
	}


	public String getString(String name) {
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			return t_interim();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_int_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_std_sls_upri();
		}
		if ($s_dec_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_std_sls_upri();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($s_int_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_std_sls_amt();
		}
		if ($s_dec_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_std_sls_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			return t_interim();
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			return t_inc_tax();
		}
		if ($s_int_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_upri();
		}
		if ($s_dec_trd_cur_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_upri();
		}
		if ($s_int_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return s_int_trd_cur_std_sls_upri();
		}
		if ($s_dec_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_std_sls_upri();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($s_int_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_std_sls_amt();
		}
		if ($s_dec_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_std_sls_amt();
		}
		if ($s_int_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_dscnt_amt();
		}
		if ($s_dec_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_dscnt_amt();
		}
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt();
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt();
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			return s_tax_rate();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			t_interim(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
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
		if ($s_int_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_std_sls_upri(value);
			return;
		}
		if ($s_dec_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_std_sls_upri(value);
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
		if ($s_int_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_std_sls_amt(value);
			return;
		}
		if ($s_dec_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_std_sls_amt(value);
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
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($t_interim.equalsIgnoreCase(name)) {
			t_interim(value);
			return;
		}
		if ($t_inc_tax.equalsIgnoreCase(name)) {
			t_inc_tax(value);
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
		if ($s_int_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			s_int_trd_cur_std_sls_upri(value);
			return;
		}
		if ($s_dec_trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			s_dec_trd_cur_std_sls_upri(value);
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
		if ($s_int_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_std_sls_amt(value);
			return;
		}
		if ($s_dec_trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_std_sls_amt(value);
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
		if ($s_int_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt(value);
			return;
		}
		if ($s_tax_rate.equalsIgnoreCase(name)) {
			s_tax_rate(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
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
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
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
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
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
		super.setBooleanNE(name, value);
	}



}

