package mcframe.commonMSBB.MSBBR0070;

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
 * ブロック"SloPrmsDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SloPrmsDtlR_MC_A extends MCConstRow {

	/**
	 *  受注納期回答ＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_no = "slo_prms_no";
	/**
	 *  回答数量.<p>
	 *
	 */
	public static final String $trd_unit_prms_qty = "trd_unit_prms_qty";
	/**
	 *  回答数量（整数部）文字列.<p>
	 *
	 */
	public static final String $s_int_trd_unit_prms_qty = "s_int_trd_unit_prms_qty";
	/**
	 *  回答数量（小数部）文字列.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_prms_qty = "s_dec_trd_unit_prms_qty";
	/**
	 *  回答単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_prms_unit_cd = "trd_unit_prms_unit_cd";
	/**
	 *  回答単位名.<p>
	 *
	 */
	public static final String $trd_unit_prms_unit_nm = "trd_unit_prms_unit_nm";
	/**
	 *  納期（日付）.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public static final String $prms_dlv_tm = "prms_dlv_tm";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $slo_prms_sub_char1 = "slo_prms_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $slo_prms_sub_char2 = "slo_prms_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $slo_prms_sub_char3 = "slo_prms_sub_char3";


	public static final MCMeta slo_prms_no_META = createCommonMeta($slo_prms_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_NO);
	public static final MCMeta trd_unit_prms_qty_META = createCommonMeta($trd_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_prms_qty_META = createStringMeta($s_int_trd_unit_prms_qty);
	public static final MCMeta s_dec_trd_unit_prms_qty_META = createStringMeta($s_dec_trd_unit_prms_qty);
	public static final MCMeta trd_unit_prms_unit_cd_META = createCommonMeta($trd_unit_prms_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_prms_unit_nm_META = createCommonMeta($trd_unit_prms_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prms_dlv_tm_META = createCommonMeta($prms_dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.SLO_PRMS_RMRKS);
	public static final MCMeta slo_prms_sub_char1_META = createCommonMeta($slo_prms_sub_char1, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR1);
	public static final MCMeta slo_prms_sub_char2_META = createCommonMeta($slo_prms_sub_char2, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR2);
	public static final MCMeta slo_prms_sub_char3_META = createCommonMeta($slo_prms_sub_char3, mcframe.commonMS.meta.MS_META.SLO_PRMS_SUB_CHAR3);

	protected static final ConstMetaList<SloPrmsDtlR> constMetas = new ConstMetaList<SloPrmsDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			slo_prms_no_META,
			trd_unit_prms_qty_META,
			s_int_trd_unit_prms_qty_META,
			s_dec_trd_unit_prms_qty_META,
			trd_unit_prms_unit_cd_META,
			trd_unit_prms_unit_nm_META,
			prms_dlv_dt_META,
			prms_dlv_tm_META,
			prms_rmrks_META,
			slo_prms_sub_char1_META,
			slo_prms_sub_char2_META,
			slo_prms_sub_char3_META
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
	protected SloPrmsDtlR_MC_A(ConstMetaList<? extends SloPrmsDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsDtlR clone() {
		return (SloPrmsDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsDtlR createInstance() {
		return (SloPrmsDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsDtlR getValues(String... names) {
		return (SloPrmsDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  受注納期回答ＮＯ.<p>
	 *
	 */
	public String slo_prms_no() {
		return getConstString(offset + 0, $slo_prms_no);
	}

	/**
	 *  受注納期回答ＮＯ.<p>
	 *
	 */
	public void slo_prms_no(String value) {
		setConstString(offset + 0, $slo_prms_no, value);
	}


	/**
	 *  回答数量.<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return getConstNumber(offset + 1, $trd_unit_prms_qty);
	}

	/**
	 *  回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 1, $trd_unit_prms_qty, value);
	}

	/**
	 *  回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		setConstNumber(offset + 1, $trd_unit_prms_qty, value);
	}

	/**
	 *  回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		setConstNumber(offset + 1, $trd_unit_prms_qty, value);
	}

	/**
	 *  回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		setConstNumber(offset + 1, $trd_unit_prms_qty, value);
	}

	/**
	 *  回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		setConstNumber(offset + 1, $trd_unit_prms_qty, value);
	}


	/**
	 *  回答数量（整数部）文字列.<p>
	 *
	 */
	public String s_int_trd_unit_prms_qty() {
		return getConstString(offset + 2, $s_int_trd_unit_prms_qty);
	}

	/**
	 *  回答数量（整数部）文字列.<p>
	 *
	 */
	public void s_int_trd_unit_prms_qty(String value) {
		setConstString(offset + 2, $s_int_trd_unit_prms_qty, value);
	}


	/**
	 *  回答数量（小数部）文字列.<p>
	 *
	 */
	public String s_dec_trd_unit_prms_qty() {
		return getConstString(offset + 3, $s_dec_trd_unit_prms_qty);
	}

	/**
	 *  回答数量（小数部）文字列.<p>
	 *
	 */
	public void s_dec_trd_unit_prms_qty(String value) {
		setConstString(offset + 3, $s_dec_trd_unit_prms_qty, value);
	}


	/**
	 *  回答単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_prms_unit_cd() {
		return getConstString(offset + 4, $trd_unit_prms_unit_cd);
	}

	/**
	 *  回答単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_prms_unit_cd(String value) {
		setConstString(offset + 4, $trd_unit_prms_unit_cd, value);
	}


	/**
	 *  回答単位名.<p>
	 *
	 */
	public String trd_unit_prms_unit_nm() {
		return getConstString(offset + 5, $trd_unit_prms_unit_nm);
	}

	/**
	 *  回答単位名.<p>
	 *
	 */
	public void trd_unit_prms_unit_nm(String value) {
		setConstString(offset + 5, $trd_unit_prms_unit_nm, value);
	}


	/**
	 *  納期（日付）.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 6, $prms_dlv_dt);
	}

	/**
	 *  納期（日付）.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 6, $prms_dlv_dt, value);
	}


	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public MCDate prms_dlv_tm() {
		return getConstDate(offset + 7, $prms_dlv_tm);
	}

	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public void prms_dlv_tm(MCDate value) {
		setConstDate(offset + 7, $prms_dlv_tm, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 8, $prms_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 8, $prms_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String slo_prms_sub_char1() {
		return getConstString(offset + 9, $slo_prms_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void slo_prms_sub_char1(String value) {
		setConstString(offset + 9, $slo_prms_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String slo_prms_sub_char2() {
		return getConstString(offset + 10, $slo_prms_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void slo_prms_sub_char2(String value) {
		setConstString(offset + 10, $slo_prms_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String slo_prms_sub_char3() {
		return getConstString(offset + 11, $slo_prms_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void slo_prms_sub_char3(String value) {
		setConstString(offset + 11, $slo_prms_sub_char3, value);
	}


	public String getString(String name) {
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($s_int_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_prms_qty();
		}
		if ($s_dec_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_prms_qty();
		}
		if ($trd_unit_prms_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_prms_unit_cd();
		}
		if ($trd_unit_prms_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_prms_unit_nm();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($slo_prms_sub_char1.equalsIgnoreCase(name)) {
			return slo_prms_sub_char1();
		}
		if ($slo_prms_sub_char2.equalsIgnoreCase(name)) {
			return slo_prms_sub_char2();
		}
		if ($slo_prms_sub_char3.equalsIgnoreCase(name)) {
			return slo_prms_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			return prms_dlv_tm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			return slo_prms_no();
		}
		if ($s_int_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_prms_qty();
		}
		if ($s_dec_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_prms_qty();
		}
		if ($trd_unit_prms_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_prms_unit_cd();
		}
		if ($trd_unit_prms_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_prms_unit_nm();
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
		}
		if ($slo_prms_sub_char1.equalsIgnoreCase(name)) {
			return slo_prms_sub_char1();
		}
		if ($slo_prms_sub_char2.equalsIgnoreCase(name)) {
			return slo_prms_sub_char2();
		}
		if ($slo_prms_sub_char3.equalsIgnoreCase(name)) {
			return slo_prms_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			return prms_dlv_tm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($s_int_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_prms_qty(value);
			return;
		}
		if ($s_dec_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_prms_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_prms_unit_cd(value);
			return;
		}
		if ($trd_unit_prms_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_prms_unit_nm(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($slo_prms_sub_char1.equalsIgnoreCase(name)) {
			slo_prms_sub_char1(value);
			return;
		}
		if ($slo_prms_sub_char2.equalsIgnoreCase(name)) {
			slo_prms_sub_char2(value);
			return;
		}
		if ($slo_prms_sub_char3.equalsIgnoreCase(name)) {
			slo_prms_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			prms_dlv_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_prms_no.equalsIgnoreCase(name)) {
			slo_prms_no(value);
			return;
		}
		if ($s_int_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_prms_qty(value);
			return;
		}
		if ($s_dec_trd_unit_prms_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_prms_qty(value);
			return;
		}
		if ($trd_unit_prms_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_prms_unit_cd(value);
			return;
		}
		if ($trd_unit_prms_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_prms_unit_nm(value);
			return;
		}
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
			return;
		}
		if ($slo_prms_sub_char1.equalsIgnoreCase(name)) {
			slo_prms_sub_char1(value);
			return;
		}
		if ($slo_prms_sub_char2.equalsIgnoreCase(name)) {
			slo_prms_sub_char2(value);
			return;
		}
		if ($slo_prms_sub_char3.equalsIgnoreCase(name)) {
			slo_prms_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($prms_dlv_tm.equalsIgnoreCase(name)) {
			prms_dlv_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

