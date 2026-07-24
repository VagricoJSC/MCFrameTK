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
 * ブロック"MfgInstYld"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgInstYldR_MC_A extends MCConstRow {

	/**
	 *  出来高予定日.<p>
	 *
	 */
	public static final String $schd_yield_dt = "schd_yield_dt";
	/**
	 *  出来高予定時刻.<p>
	 *
	 */
	public static final String $schd_yield_hm = "schd_yield_hm";
	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public static final String $trd_unit_yield_qty = "trd_unit_yield_qty";
	/**
	 *  出来高予定数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_yield_qty = "s_int_trd_unit_yield_qty";
	/**
	 *  出来高予定数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_yield_qty = "s_dec_trd_unit_yield_qty";
	/**
	 *  単位（出来高予定）.<p>
	 *
	 */
	public static final String $yield_unit_cd = "yield_unit_cd";
	/**
	 *  単位名（出来高予定）.<p>
	 *
	 */
	public static final String $yield_unit_nm = "yield_unit_nm";
	/**
	 *  格納場所.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 *  格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 *  格納棚・ライン.<p>
	 *
	 */
	public static final String $strg_str_ln_cd = "strg_str_ln_cd";
	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	/**
	 *  出来高予定備考.<p>
	 *
	 */
	public static final String $yield_schd_rpt_rmrks = "yield_schd_rpt_rmrks";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $yield_schd_disp_seq = "yield_schd_disp_seq";
	/**
	 *  出来高予定予備１.<p>
	 *
	 */
	public static final String $yield_schd_sub_char1 = "yield_schd_sub_char1";
	/**
	 *  出来高予定予備２.<p>
	 *
	 */
	public static final String $yield_schd_sub_char2 = "yield_schd_sub_char2";
	/**
	 *  出来高予定予備３.<p>
	 *
	 */
	public static final String $yield_schd_sub_char3 = "yield_schd_sub_char3";


	public static final MCMeta schd_yield_dt_META = createCommonMeta($schd_yield_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_yield_hm_META = createCommonMeta($schd_yield_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta trd_unit_yield_qty_META = createCommonMeta($trd_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_yield_qty_META = createStringMeta($s_int_trd_unit_yield_qty);
	public static final MCMeta s_dec_trd_unit_yield_qty_META = createStringMeta($s_dec_trd_unit_yield_qty);
	public static final MCMeta yield_unit_cd_META = createCommonMeta($yield_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta yield_unit_nm_META = createCommonMeta($yield_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta strg_str_ln_cd_META = createCommonMeta($strg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta yield_schd_rpt_rmrks_META = createCommonMeta($yield_schd_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_SCHD_RPT_RMRKS);
	public static final MCMeta yield_schd_disp_seq_META = createCommonMeta($yield_schd_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta yield_schd_sub_char1_META = createCommonMeta($yield_schd_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR1);
	public static final MCMeta yield_schd_sub_char2_META = createCommonMeta($yield_schd_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR2);
	public static final MCMeta yield_schd_sub_char3_META = createCommonMeta($yield_schd_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_SCHD_SUB_CHAR3);

	protected static final ConstMetaList<MfgInstYldR> constMetas = new ConstMetaList<MfgInstYldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			schd_yield_dt_META,
			schd_yield_hm_META,
			trd_unit_yield_qty_META,
			s_int_trd_unit_yield_qty_META,
			s_dec_trd_unit_yield_qty_META,
			yield_unit_cd_META,
			yield_unit_nm_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			strg_str_ln_cd_META,
			strg_str_ln_nm_META,
			yield_schd_rpt_rmrks_META,
			yield_schd_disp_seq_META,
			yield_schd_sub_char1_META,
			yield_schd_sub_char2_META,
			yield_schd_sub_char3_META
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
	protected MfgInstYldR_MC_A(ConstMetaList<? extends MfgInstYldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstYldR clone() {
		return (MfgInstYldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstYldR createInstance() {
		return (MfgInstYldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgInstYldR getValues(String... names) {
		return (MfgInstYldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  出来高予定日.<p>
	 *
	 */
	public MCDate schd_yield_dt() {
		return getConstDate(offset + 0, $schd_yield_dt);
	}

	/**
	 *  出来高予定日.<p>
	 *
	 */
	public void schd_yield_dt(MCDate value) {
		setConstDate(offset + 0, $schd_yield_dt, value);
	}


	/**
	 *  出来高予定時刻.<p>
	 *
	 */
	public MCDate schd_yield_hm() {
		return getConstDate(offset + 1, $schd_yield_hm);
	}

	/**
	 *  出来高予定時刻.<p>
	 *
	 */
	public void schd_yield_hm(MCDate value) {
		setConstDate(offset + 1, $schd_yield_hm, value);
	}


	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return getConstNumber(offset + 2, $trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 2, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		setConstNumber(offset + 2, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		setConstNumber(offset + 2, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		setConstNumber(offset + 2, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数量.<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		setConstNumber(offset + 2, $trd_unit_yield_qty, value);
	}


	/**
	 *  出来高予定数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_yield_qty() {
		return getConstString(offset + 3, $s_int_trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_yield_qty(String value) {
		setConstString(offset + 3, $s_int_trd_unit_yield_qty, value);
	}


	/**
	 *  出来高予定数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_yield_qty() {
		return getConstString(offset + 4, $s_dec_trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_yield_qty(String value) {
		setConstString(offset + 4, $s_dec_trd_unit_yield_qty, value);
	}


	/**
	 *  単位（出来高予定）.<p>
	 *
	 */
	public String yield_unit_cd() {
		return getConstString(offset + 5, $yield_unit_cd);
	}

	/**
	 *  単位（出来高予定）.<p>
	 *
	 */
	public void yield_unit_cd(String value) {
		setConstString(offset + 5, $yield_unit_cd, value);
	}


	/**
	 *  単位名（出来高予定）.<p>
	 *
	 */
	public String yield_unit_nm() {
		return getConstString(offset + 6, $yield_unit_nm);
	}

	/**
	 *  単位名（出来高予定）.<p>
	 *
	 */
	public void yield_unit_nm(String value) {
		setConstString(offset + 6, $yield_unit_nm, value);
	}


	/**
	 *  格納場所.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 7, $strg_loc_cd);
	}

	/**
	 *  格納場所.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 7, $strg_loc_cd, value);
	}


	/**
	 *  格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 8, $strg_loc_nm);
	}

	/**
	 *  格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 8, $strg_loc_nm, value);
	}


	/**
	 *  格納棚・ライン.<p>
	 *
	 */
	public String strg_str_ln_cd() {
		return getConstString(offset + 9, $strg_str_ln_cd);
	}

	/**
	 *  格納棚・ライン.<p>
	 *
	 */
	public void strg_str_ln_cd(String value) {
		setConstString(offset + 9, $strg_str_ln_cd, value);
	}


	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 10, $strg_str_ln_nm);
	}

	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 10, $strg_str_ln_nm, value);
	}


	/**
	 *  出来高予定備考.<p>
	 *
	 */
	public String yield_schd_rpt_rmrks() {
		return getConstString(offset + 11, $yield_schd_rpt_rmrks);
	}

	/**
	 *  出来高予定備考.<p>
	 *
	 */
	public void yield_schd_rpt_rmrks(String value) {
		setConstString(offset + 11, $yield_schd_rpt_rmrks, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber yield_schd_disp_seq() {
		return getConstNumber(offset + 12, $yield_schd_disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void yield_schd_disp_seq(MCNumber value) {
		setConstNumber(offset + 12, $yield_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void yield_schd_disp_seq(int value) {
		setConstNumber(offset + 12, $yield_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void yield_schd_disp_seq(long value) {
		setConstNumber(offset + 12, $yield_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void yield_schd_disp_seq(float value) {
		setConstNumber(offset + 12, $yield_schd_disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void yield_schd_disp_seq(double value) {
		setConstNumber(offset + 12, $yield_schd_disp_seq, value);
	}


	/**
	 *  出来高予定予備１.<p>
	 *
	 */
	public String yield_schd_sub_char1() {
		return getConstString(offset + 13, $yield_schd_sub_char1);
	}

	/**
	 *  出来高予定予備１.<p>
	 *
	 */
	public void yield_schd_sub_char1(String value) {
		setConstString(offset + 13, $yield_schd_sub_char1, value);
	}


	/**
	 *  出来高予定予備２.<p>
	 *
	 */
	public String yield_schd_sub_char2() {
		return getConstString(offset + 14, $yield_schd_sub_char2);
	}

	/**
	 *  出来高予定予備２.<p>
	 *
	 */
	public void yield_schd_sub_char2(String value) {
		setConstString(offset + 14, $yield_schd_sub_char2, value);
	}


	/**
	 *  出来高予定予備３.<p>
	 *
	 */
	public String yield_schd_sub_char3() {
		return getConstString(offset + 15, $yield_schd_sub_char3);
	}

	/**
	 *  出来高予定予備３.<p>
	 *
	 */
	public void yield_schd_sub_char3(String value) {
		setConstString(offset + 15, $yield_schd_sub_char3, value);
	}


	public String getString(String name) {
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_qty();
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_qty();
		}
		if ($yield_unit_cd.equalsIgnoreCase(name)) {
			return yield_unit_cd();
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			return yield_unit_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_rpt_rmrks();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			return yield_schd_disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($schd_yield_dt.equalsIgnoreCase(name)) {
			return schd_yield_dt();
		}
		if ($schd_yield_hm.equalsIgnoreCase(name)) {
			return schd_yield_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_qty();
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_qty();
		}
		if ($yield_unit_cd.equalsIgnoreCase(name)) {
			return yield_unit_cd();
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			return yield_unit_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			return strg_str_ln_cd();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_schd_rpt_rmrks();
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			return yield_schd_sub_char1();
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			return yield_schd_sub_char2();
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			return yield_schd_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			return yield_schd_disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($schd_yield_dt.equalsIgnoreCase(name)) {
			return schd_yield_dt();
		}
		if ($schd_yield_hm.equalsIgnoreCase(name)) {
			return schd_yield_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_qty(value);
			return;
		}
		if ($yield_unit_cd.equalsIgnoreCase(name)) {
			yield_unit_cd(value);
			return;
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			yield_unit_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_schd_rpt_rmrks(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($schd_yield_dt.equalsIgnoreCase(name)) {
			schd_yield_dt(value);
			return;
		}
		if ($schd_yield_hm.equalsIgnoreCase(name)) {
			schd_yield_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_qty(value);
			return;
		}
		if ($yield_unit_cd.equalsIgnoreCase(name)) {
			yield_unit_cd(value);
			return;
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			yield_unit_nm(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_cd.equalsIgnoreCase(name)) {
			strg_str_ln_cd(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($yield_schd_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_schd_rpt_rmrks(value);
			return;
		}
		if ($yield_schd_sub_char1.equalsIgnoreCase(name)) {
			yield_schd_sub_char1(value);
			return;
		}
		if ($yield_schd_sub_char2.equalsIgnoreCase(name)) {
			yield_schd_sub_char2(value);
			return;
		}
		if ($yield_schd_sub_char3.equalsIgnoreCase(name)) {
			yield_schd_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($yield_schd_disp_seq.equalsIgnoreCase(name)) {
			yield_schd_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($schd_yield_dt.equalsIgnoreCase(name)) {
			schd_yield_dt(value);
			return;
		}
		if ($schd_yield_hm.equalsIgnoreCase(name)) {
			schd_yield_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

