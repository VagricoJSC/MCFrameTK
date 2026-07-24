package mcframe.commonMSBG.MSBGR0070;

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
 * ブロック"CtaxDiffDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CtaxDiffDtlR_MC_A extends MCConstRow {

	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $acst_nm = "acst_nm";
	/**
	 *  取引先別名１.<p>
	 *
	 */
	public static final String $acst_alt_nm1 = "acst_alt_nm1";
	/**
	 *  取引先別名２.<p>
	 *
	 */
	public static final String $acst_alt_nm2 = "acst_alt_nm2";
	/**
	 *  取引先別名３.<p>
	 *
	 */
	public static final String $acst_alt_nm3 = "acst_alt_nm3";
	/**
	 *  取引先別名４.<p>
	 *
	 */
	public static final String $acst_alt_nm4 = "acst_alt_nm4";
	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $ar_dpt_nm = "ar_dpt_nm";
	/**
	 *  債権区分.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	/**
	 *  債権区分名.<p>
	 *
	 */
	public static final String $ar_typ_nm = "ar_typ_nm";
	/**
	 *  インボイスＮＯ（表示用）.<p>
	 *
	 */
	public static final String $iv_no_view = "iv_no_view";
	/**
	 *  インボイスＮＯ（データ）.<p>
	 *
	 */
	public static final String $iv_no_data = "iv_no_data";
	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	/**
	 *  取引通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_tax_amt1 = "s_int_trd_cur_tax_amt1";
	/**
	 *  取引通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_tax_amt1 = "s_dec_trd_cur_tax_amt1";
	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	/**
	 *  基準通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_base_cur_tax_amt1 = "s_int_base_cur_tax_amt1";
	/**
	 *  基準通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_base_cur_tax_amt1 = "s_dec_base_cur_tax_amt1";
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


	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acst_alt_nm1_META = createCommonMeta($acst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta acst_alt_nm2_META = createCommonMeta($acst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta acst_alt_nm3_META = createCommonMeta($acst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta acst_alt_nm4_META = createCommonMeta($acst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_typ_nm_META = createCommonMeta($ar_typ_nm, mcframe.commonMA.meta.MA_META.AR_TYP_NM);
	public static final MCMeta iv_no_view_META = createCommonMeta($iv_no_view, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_no_data_META = createCommonMeta($iv_no_data, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_tax_amt1_META = createStringMeta($s_int_trd_cur_tax_amt1);
	public static final MCMeta s_dec_trd_cur_tax_amt1_META = createStringMeta($s_dec_trd_cur_tax_amt1);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_base_cur_tax_amt1_META = createStringMeta($s_int_base_cur_tax_amt1);
	public static final MCMeta s_dec_base_cur_tax_amt1_META = createStringMeta($s_dec_base_cur_tax_amt1);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR3);

	protected static final ConstMetaList<CtaxDiffDtlR> constMetas = new ConstMetaList<CtaxDiffDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_seq_META,
			acst_cd_META,
			acst_nm_META,
			acst_alt_nm1_META,
			acst_alt_nm2_META,
			acst_alt_nm3_META,
			acst_alt_nm4_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			ar_typ_META,
			ar_typ_nm_META,
			iv_no_view_META,
			iv_no_data_META,
			trd_cur_tax_amt1_META,
			s_int_trd_cur_tax_amt1_META,
			s_dec_trd_cur_tax_amt1_META,
			base_cur_tax_amt1_META,
			s_int_base_cur_tax_amt1_META,
			s_dec_base_cur_tax_amt1_META,
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
	protected CtaxDiffDtlR_MC_A(ConstMetaList<? extends CtaxDiffDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffDtlR clone() {
		return (CtaxDiffDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffDtlR createInstance() {
		return (CtaxDiffDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CtaxDiffDtlR getValues(String... names) {
		return (CtaxDiffDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 0, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}


	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 1, $acst_cd);
	}

	/**
	 *  売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 1, $acst_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 2, $acst_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 2, $acst_nm, value);
	}


	/**
	 *  取引先別名１.<p>
	 *
	 */
	public String acst_alt_nm1() {
		return getConstString(offset + 3, $acst_alt_nm1);
	}

	/**
	 *  取引先別名１.<p>
	 *
	 */
	public void acst_alt_nm1(String value) {
		setConstString(offset + 3, $acst_alt_nm1, value);
	}


	/**
	 *  取引先別名２.<p>
	 *
	 */
	public String acst_alt_nm2() {
		return getConstString(offset + 4, $acst_alt_nm2);
	}

	/**
	 *  取引先別名２.<p>
	 *
	 */
	public void acst_alt_nm2(String value) {
		setConstString(offset + 4, $acst_alt_nm2, value);
	}


	/**
	 *  取引先別名３.<p>
	 *
	 */
	public String acst_alt_nm3() {
		return getConstString(offset + 5, $acst_alt_nm3);
	}

	/**
	 *  取引先別名３.<p>
	 *
	 */
	public void acst_alt_nm3(String value) {
		setConstString(offset + 5, $acst_alt_nm3, value);
	}


	/**
	 *  取引先別名４.<p>
	 *
	 */
	public String acst_alt_nm4() {
		return getConstString(offset + 6, $acst_alt_nm4);
	}

	/**
	 *  取引先別名４.<p>
	 *
	 */
	public void acst_alt_nm4(String value) {
		setConstString(offset + 6, $acst_alt_nm4, value);
	}


	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 7, $ar_dpt_cd);
	}

	/**
	 *  債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 7, $ar_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 8, $ar_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 8, $ar_dpt_nm, value);
	}


	/**
	 *  債権区分.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 9, $ar_typ);
	}

	/**
	 *  債権区分.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 9, $ar_typ, value);
	}


	/**
	 *  債権区分名.<p>
	 *
	 */
	public String ar_typ_nm() {
		return getConstString(offset + 10, $ar_typ_nm);
	}

	/**
	 *  債権区分名.<p>
	 *
	 */
	public void ar_typ_nm(String value) {
		setConstString(offset + 10, $ar_typ_nm, value);
	}


	/**
	 *  インボイスＮＯ（表示用）.<p>
	 *
	 */
	public String iv_no_view() {
		return getConstString(offset + 11, $iv_no_view);
	}

	/**
	 *  インボイスＮＯ（表示用）.<p>
	 *
	 */
	public void iv_no_view(String value) {
		setConstString(offset + 11, $iv_no_view, value);
	}


	/**
	 *  インボイスＮＯ（データ）.<p>
	 *
	 */
	public String iv_no_data() {
		return getConstString(offset + 12, $iv_no_data);
	}

	/**
	 *  インボイスＮＯ（データ）.<p>
	 *
	 */
	public void iv_no_data(String value) {
		setConstString(offset + 12, $iv_no_data, value);
	}


	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 13, $trd_cur_tax_amt1);
	}

	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 13, $trd_cur_tax_amt1, value);
	}

	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 13, $trd_cur_tax_amt1, value);
	}

	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 13, $trd_cur_tax_amt1, value);
	}

	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 13, $trd_cur_tax_amt1, value);
	}

	/**
	 *  取引通貨内税額１.<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 13, $trd_cur_tax_amt1, value);
	}


	/**
	 *  取引通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_tax_amt1() {
		return getConstString(offset + 14, $s_int_trd_cur_tax_amt1);
	}

	/**
	 *  取引通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_tax_amt1(String value) {
		setConstString(offset + 14, $s_int_trd_cur_tax_amt1, value);
	}


	/**
	 *  取引通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_tax_amt1() {
		return getConstString(offset + 15, $s_dec_trd_cur_tax_amt1);
	}

	/**
	 *  取引通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_tax_amt1(String value) {
		setConstString(offset + 15, $s_dec_trd_cur_tax_amt1, value);
	}


	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 16, $base_cur_tax_amt1);
	}

	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 16, $base_cur_tax_amt1, value);
	}

	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 16, $base_cur_tax_amt1, value);
	}

	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 16, $base_cur_tax_amt1, value);
	}

	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 16, $base_cur_tax_amt1, value);
	}

	/**
	 *  基準通貨内税額１.<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 16, $base_cur_tax_amt1, value);
	}


	/**
	 *  基準通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public String s_int_base_cur_tax_amt1() {
		return getConstString(offset + 17, $s_int_base_cur_tax_amt1);
	}

	/**
	 *  基準通貨内税額１文字列（整数部）.<p>
	 *
	 */
	public void s_int_base_cur_tax_amt1(String value) {
		setConstString(offset + 17, $s_int_base_cur_tax_amt1, value);
	}


	/**
	 *  基準通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public String s_dec_base_cur_tax_amt1() {
		return getConstString(offset + 18, $s_dec_base_cur_tax_amt1);
	}

	/**
	 *  基準通貨内税額１文字列（小数部）.<p>
	 *
	 */
	public void s_dec_base_cur_tax_amt1(String value) {
		setConstString(offset + 18, $s_dec_base_cur_tax_amt1, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 19, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 19, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 20, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 20, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 21, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 21, $d_sub_char3, value);
	}


	public String getString(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($acst_alt_nm1.equalsIgnoreCase(name)) {
			return acst_alt_nm1();
		}
		if ($acst_alt_nm2.equalsIgnoreCase(name)) {
			return acst_alt_nm2();
		}
		if ($acst_alt_nm3.equalsIgnoreCase(name)) {
			return acst_alt_nm3();
		}
		if ($acst_alt_nm4.equalsIgnoreCase(name)) {
			return acst_alt_nm4();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($iv_no_view.equalsIgnoreCase(name)) {
			return iv_no_view();
		}
		if ($iv_no_data.equalsIgnoreCase(name)) {
			return iv_no_data();
		}
		if ($s_int_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt1();
		}
		if ($s_dec_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt1();
		}
		if ($s_int_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_int_base_cur_tax_amt1();
		}
		if ($s_dec_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_dec_base_cur_tax_amt1();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($acst_alt_nm1.equalsIgnoreCase(name)) {
			return acst_alt_nm1();
		}
		if ($acst_alt_nm2.equalsIgnoreCase(name)) {
			return acst_alt_nm2();
		}
		if ($acst_alt_nm3.equalsIgnoreCase(name)) {
			return acst_alt_nm3();
		}
		if ($acst_alt_nm4.equalsIgnoreCase(name)) {
			return acst_alt_nm4();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			return ar_typ_nm();
		}
		if ($iv_no_view.equalsIgnoreCase(name)) {
			return iv_no_view();
		}
		if ($iv_no_data.equalsIgnoreCase(name)) {
			return iv_no_data();
		}
		if ($s_int_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_int_trd_cur_tax_amt1();
		}
		if ($s_dec_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_tax_amt1();
		}
		if ($s_int_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_int_base_cur_tax_amt1();
		}
		if ($s_dec_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return s_dec_base_cur_tax_amt1();
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($acst_alt_nm1.equalsIgnoreCase(name)) {
			acst_alt_nm1(value);
			return;
		}
		if ($acst_alt_nm2.equalsIgnoreCase(name)) {
			acst_alt_nm2(value);
			return;
		}
		if ($acst_alt_nm3.equalsIgnoreCase(name)) {
			acst_alt_nm3(value);
			return;
		}
		if ($acst_alt_nm4.equalsIgnoreCase(name)) {
			acst_alt_nm4(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($iv_no_view.equalsIgnoreCase(name)) {
			iv_no_view(value);
			return;
		}
		if ($iv_no_data.equalsIgnoreCase(name)) {
			iv_no_data(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt1(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt1(value);
			return;
		}
		if ($s_int_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_int_base_cur_tax_amt1(value);
			return;
		}
		if ($s_dec_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_dec_base_cur_tax_amt1(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
			return;
		}
		if ($acst_alt_nm1.equalsIgnoreCase(name)) {
			acst_alt_nm1(value);
			return;
		}
		if ($acst_alt_nm2.equalsIgnoreCase(name)) {
			acst_alt_nm2(value);
			return;
		}
		if ($acst_alt_nm3.equalsIgnoreCase(name)) {
			acst_alt_nm3(value);
			return;
		}
		if ($acst_alt_nm4.equalsIgnoreCase(name)) {
			acst_alt_nm4(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			ar_dpt_nm(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_typ_nm.equalsIgnoreCase(name)) {
			ar_typ_nm(value);
			return;
		}
		if ($iv_no_view.equalsIgnoreCase(name)) {
			iv_no_view(value);
			return;
		}
		if ($iv_no_data.equalsIgnoreCase(name)) {
			iv_no_data(value);
			return;
		}
		if ($s_int_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_int_trd_cur_tax_amt1(value);
			return;
		}
		if ($s_dec_trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_dec_trd_cur_tax_amt1(value);
			return;
		}
		if ($s_int_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_int_base_cur_tax_amt1(value);
			return;
		}
		if ($s_dec_base_cur_tax_amt1.equalsIgnoreCase(name)) {
			s_dec_base_cur_tax_amt1(value);
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
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

