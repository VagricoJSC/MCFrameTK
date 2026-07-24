package mcframe.commonMSBC.MSBCR1020;

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
 * ブロック"MfgActYld"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MfgActYldR_MC_A extends MCConstRow {

	/**
	 *  出来高実績日.<p>
	 *
	 */
	public static final String $act_dt = "act_dt";
	/**
	 *  出来高実績時刻.<p>
	 *
	 */
	public static final String $act_hm = "act_hm";
	/**
	 *  出来高予定ＮＯ.<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	/**
	 *  出来高予定数.<p>
	 *
	 */
	public static final String $trd_unit_yield_qty = "trd_unit_yield_qty";
	/**
	 *  出来高予定数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_yield_qty = "s_int_trd_unit_yield_qty";
	/**
	 *  出来高予定数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_yield_qty = "s_dec_trd_unit_yield_qty";
	/**
	 *  出来高単位名（出来高予定数）.<p>
	 *
	 */
	public static final String $yield_unit_nm = "yield_unit_nm";
	/**
	 *  出来高実績数.<p>
	 *
	 */
	public static final String $trd_unit_yield_act_qty = "trd_unit_yield_act_qty";
	/**
	 *  出来高実績数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_yield_act_qty = "s_int_trd_unit_yield_act_qty";
	/**
	 *  出来高実績数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_yield_act_qty = "s_dec_trd_unit_yield_act_qty";
	/**
	 *  出来高単位名（出来高実績数）.<p>
	 *
	 */
	public static final String $yield_act_unit_nm = "yield_act_unit_nm";
	/**
	 *  ロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public static final String $yield_act_lot_no_view = "yield_act_lot_no_view";
	/**
	 *  ロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public static final String $yield_act_lot_no_data = "yield_act_lot_no_data";
	/**
	 *  サブロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public static final String $yield_act_sublot_no_view = "yield_act_sublot_no_view";
	/**
	 *  サブロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public static final String $yield_act_sublot_no_data = "yield_act_sublot_no_data";
	/**
	 *  出来高区分名.<p>
	 *
	 */
	public static final String $yield_typ_nm = "yield_typ_nm";
	/**
	 *  格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 *  格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public static final String $strg_str_ln_nm = "strg_str_ln_nm";
	/**
	 *  出来高実績備考.<p>
	 *
	 */
	public static final String $yield_act_rpt_rmrks = "yield_act_rpt_rmrks";
	/**
	 *  出来高実績予備１.<p>
	 *
	 */
	public static final String $yield_act_sub_char1 = "yield_act_sub_char1";
	/**
	 *  出来高実績予備２.<p>
	 *
	 */
	public static final String $yield_act_sub_char2 = "yield_act_sub_char2";
	/**
	 *  出来高実績予備３.<p>
	 *
	 */
	public static final String $yield_act_sub_char3 = "yield_act_sub_char3";


	public static final MCMeta act_dt_META = createCommonMeta($act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_hm_META = createCommonMeta($act_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_INST_NO);
	public static final MCMeta trd_unit_yield_qty_META = createCommonMeta($trd_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_yield_qty_META = createStringMeta($s_int_trd_unit_yield_qty);
	public static final MCMeta s_dec_trd_unit_yield_qty_META = createStringMeta($s_dec_trd_unit_yield_qty);
	public static final MCMeta yield_unit_nm_META = createCommonMeta($yield_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_yield_act_qty_META = createCommonMeta($trd_unit_yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_yield_act_qty_META = createStringMeta($s_int_trd_unit_yield_act_qty);
	public static final MCMeta s_dec_trd_unit_yield_act_qty_META = createStringMeta($s_dec_trd_unit_yield_act_qty);
	public static final MCMeta yield_act_unit_nm_META = createCommonMeta($yield_act_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta yield_act_lot_no_view_META = createCommonMeta($yield_act_lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta yield_act_lot_no_data_META = createCommonMeta($yield_act_lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta yield_act_sublot_no_view_META = createCommonMeta($yield_act_sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta yield_act_sublot_no_data_META = createCommonMeta($yield_act_sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta yield_typ_nm_META = createCommonMeta($yield_typ_nm, mcframe.commonMA.meta.MA_META.YIELD_TYP_NM);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_str_ln_nm_META = createCommonMeta($strg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta yield_act_rpt_rmrks_META = createCommonMeta($yield_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.YIELD_ACT_RPT_RMRKS);
	public static final MCMeta yield_act_sub_char1_META = createCommonMeta($yield_act_sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR1);
	public static final MCMeta yield_act_sub_char2_META = createCommonMeta($yield_act_sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR2);
	public static final MCMeta yield_act_sub_char3_META = createCommonMeta($yield_act_sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_SUB_CHAR3);

	protected static final ConstMetaList<MfgActYldR> constMetas = new ConstMetaList<MfgActYldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			act_dt_META,
			act_hm_META,
			yield_schd_no_META,
			trd_unit_yield_qty_META,
			s_int_trd_unit_yield_qty_META,
			s_dec_trd_unit_yield_qty_META,
			yield_unit_nm_META,
			trd_unit_yield_act_qty_META,
			s_int_trd_unit_yield_act_qty_META,
			s_dec_trd_unit_yield_act_qty_META,
			yield_act_unit_nm_META,
			yield_act_lot_no_view_META,
			yield_act_lot_no_data_META,
			yield_act_sublot_no_view_META,
			yield_act_sublot_no_data_META,
			yield_typ_nm_META,
			gd_nm_META,
			strg_loc_nm_META,
			strg_str_ln_nm_META,
			yield_act_rpt_rmrks_META,
			yield_act_sub_char1_META,
			yield_act_sub_char2_META,
			yield_act_sub_char3_META
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
	protected MfgActYldR_MC_A(ConstMetaList<? extends MfgActYldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActYldR clone() {
		return (MfgActYldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActYldR createInstance() {
		return (MfgActYldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MfgActYldR getValues(String... names) {
		return (MfgActYldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  出来高実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return getConstDate(offset + 0, $act_dt);
	}

	/**
	 *  出来高実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		setConstDate(offset + 0, $act_dt, value);
	}


	/**
	 *  出来高実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return getConstDate(offset + 1, $act_hm);
	}

	/**
	 *  出来高実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		setConstDate(offset + 1, $act_hm, value);
	}


	/**
	 *  出来高予定ＮＯ.<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 2, $yield_schd_no);
	}

	/**
	 *  出来高予定ＮＯ.<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 2, $yield_schd_no, value);
	}


	/**
	 *  出来高予定数.<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return getConstNumber(offset + 3, $trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数.<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 3, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数.<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		setConstNumber(offset + 3, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数.<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		setConstNumber(offset + 3, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数.<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		setConstNumber(offset + 3, $trd_unit_yield_qty, value);
	}

	/**
	 *  出来高予定数.<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		setConstNumber(offset + 3, $trd_unit_yield_qty, value);
	}


	/**
	 *  出来高予定数文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_yield_qty() {
		return getConstString(offset + 4, $s_int_trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_yield_qty(String value) {
		setConstString(offset + 4, $s_int_trd_unit_yield_qty, value);
	}


	/**
	 *  出来高予定数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_yield_qty() {
		return getConstString(offset + 5, $s_dec_trd_unit_yield_qty);
	}

	/**
	 *  出来高予定数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_yield_qty(String value) {
		setConstString(offset + 5, $s_dec_trd_unit_yield_qty, value);
	}


	/**
	 *  出来高単位名（出来高予定数）.<p>
	 *
	 */
	public String yield_unit_nm() {
		return getConstString(offset + 6, $yield_unit_nm);
	}

	/**
	 *  出来高単位名（出来高予定数）.<p>
	 *
	 */
	public void yield_unit_nm(String value) {
		setConstString(offset + 6, $yield_unit_nm, value);
	}


	/**
	 *  出来高実績数.<p>
	 *
	 */
	public MCNumber trd_unit_yield_act_qty() {
		return getConstNumber(offset + 7, $trd_unit_yield_act_qty);
	}

	/**
	 *  出来高実績数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 *  出来高実績数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 *  出来高実績数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 *  出来高実績数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}

	/**
	 *  出来高実績数.<p>
	 *
	 */
	public void trd_unit_yield_act_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_yield_act_qty, value);
	}


	/**
	 *  出来高実績数文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_yield_act_qty() {
		return getConstString(offset + 8, $s_int_trd_unit_yield_act_qty);
	}

	/**
	 *  出来高実績数文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_yield_act_qty(String value) {
		setConstString(offset + 8, $s_int_trd_unit_yield_act_qty, value);
	}


	/**
	 *  出来高実績数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_yield_act_qty() {
		return getConstString(offset + 9, $s_dec_trd_unit_yield_act_qty);
	}

	/**
	 *  出来高実績数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_yield_act_qty(String value) {
		setConstString(offset + 9, $s_dec_trd_unit_yield_act_qty, value);
	}


	/**
	 *  出来高単位名（出来高実績数）.<p>
	 *
	 */
	public String yield_act_unit_nm() {
		return getConstString(offset + 10, $yield_act_unit_nm);
	}

	/**
	 *  出来高単位名（出来高実績数）.<p>
	 *
	 */
	public void yield_act_unit_nm(String value) {
		setConstString(offset + 10, $yield_act_unit_nm, value);
	}


	/**
	 *  ロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public String yield_act_lot_no_view() {
		return getConstString(offset + 11, $yield_act_lot_no_view);
	}

	/**
	 *  ロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public void yield_act_lot_no_view(String value) {
		setConstString(offset + 11, $yield_act_lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public String yield_act_lot_no_data() {
		return getConstString(offset + 12, $yield_act_lot_no_data);
	}

	/**
	 *  ロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public void yield_act_lot_no_data(String value) {
		setConstString(offset + 12, $yield_act_lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public String yield_act_sublot_no_view() {
		return getConstString(offset + 13, $yield_act_sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（出来高）(表示).<p>
	 *
	 */
	public void yield_act_sublot_no_view(String value) {
		setConstString(offset + 13, $yield_act_sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public String yield_act_sublot_no_data() {
		return getConstString(offset + 14, $yield_act_sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（出来高）(データ).<p>
	 *
	 */
	public void yield_act_sublot_no_data(String value) {
		setConstString(offset + 14, $yield_act_sublot_no_data, value);
	}


	/**
	 *  出来高区分名.<p>
	 *
	 */
	public String yield_typ_nm() {
		return getConstString(offset + 15, $yield_typ_nm);
	}

	/**
	 *  出来高区分名.<p>
	 *
	 */
	public void yield_typ_nm(String value) {
		setConstString(offset + 15, $yield_typ_nm, value);
	}


	/**
	 *  格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 16, $gd_nm);
	}

	/**
	 *  格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 16, $gd_nm, value);
	}


	/**
	 *  格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 17, $strg_loc_nm);
	}

	/**
	 *  格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 17, $strg_loc_nm, value);
	}


	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public String strg_str_ln_nm() {
		return getConstString(offset + 18, $strg_str_ln_nm);
	}

	/**
	 *  格納棚・ライン名.<p>
	 *
	 */
	public void strg_str_ln_nm(String value) {
		setConstString(offset + 18, $strg_str_ln_nm, value);
	}


	/**
	 *  出来高実績備考.<p>
	 *
	 */
	public String yield_act_rpt_rmrks() {
		return getConstString(offset + 19, $yield_act_rpt_rmrks);
	}

	/**
	 *  出来高実績備考.<p>
	 *
	 */
	public void yield_act_rpt_rmrks(String value) {
		setConstString(offset + 19, $yield_act_rpt_rmrks, value);
	}


	/**
	 *  出来高実績予備１.<p>
	 *
	 */
	public String yield_act_sub_char1() {
		return getConstString(offset + 20, $yield_act_sub_char1);
	}

	/**
	 *  出来高実績予備１.<p>
	 *
	 */
	public void yield_act_sub_char1(String value) {
		setConstString(offset + 20, $yield_act_sub_char1, value);
	}


	/**
	 *  出来高実績予備２.<p>
	 *
	 */
	public String yield_act_sub_char2() {
		return getConstString(offset + 21, $yield_act_sub_char2);
	}

	/**
	 *  出来高実績予備２.<p>
	 *
	 */
	public void yield_act_sub_char2(String value) {
		setConstString(offset + 21, $yield_act_sub_char2, value);
	}


	/**
	 *  出来高実績予備３.<p>
	 *
	 */
	public String yield_act_sub_char3() {
		return getConstString(offset + 22, $yield_act_sub_char3);
	}

	/**
	 *  出来高実績予備３.<p>
	 *
	 */
	public void yield_act_sub_char3(String value) {
		setConstString(offset + 22, $yield_act_sub_char3, value);
	}


	public String getString(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_qty();
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_qty();
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			return yield_unit_nm();
		}
		if ($s_int_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_act_qty();
		}
		if ($s_dec_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_act_qty();
		}
		if ($yield_act_unit_nm.equalsIgnoreCase(name)) {
			return yield_act_unit_nm();
		}
		if ($yield_act_lot_no_view.equalsIgnoreCase(name)) {
			return yield_act_lot_no_view();
		}
		if ($yield_act_lot_no_data.equalsIgnoreCase(name)) {
			return yield_act_lot_no_data();
		}
		if ($yield_act_sublot_no_view.equalsIgnoreCase(name)) {
			return yield_act_sublot_no_view();
		}
		if ($yield_act_sublot_no_data.equalsIgnoreCase(name)) {
			return yield_act_sublot_no_data();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
		}
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_qty();
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_qty();
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			return yield_unit_nm();
		}
		if ($s_int_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_yield_act_qty();
		}
		if ($s_dec_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_yield_act_qty();
		}
		if ($yield_act_unit_nm.equalsIgnoreCase(name)) {
			return yield_act_unit_nm();
		}
		if ($yield_act_lot_no_view.equalsIgnoreCase(name)) {
			return yield_act_lot_no_view();
		}
		if ($yield_act_lot_no_data.equalsIgnoreCase(name)) {
			return yield_act_lot_no_data();
		}
		if ($yield_act_sublot_no_view.equalsIgnoreCase(name)) {
			return yield_act_sublot_no_view();
		}
		if ($yield_act_sublot_no_data.equalsIgnoreCase(name)) {
			return yield_act_sublot_no_data();
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			return yield_typ_nm();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			return strg_str_ln_nm();
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return yield_act_rpt_rmrks();
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			return yield_act_sub_char1();
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			return yield_act_sub_char2();
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			return yield_act_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($act_dt.equalsIgnoreCase(name)) {
			return act_dt();
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			return act_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_qty(value);
			return;
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			yield_unit_nm(value);
			return;
		}
		if ($s_int_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_act_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_act_qty(value);
			return;
		}
		if ($yield_act_unit_nm.equalsIgnoreCase(name)) {
			yield_act_unit_nm(value);
			return;
		}
		if ($yield_act_lot_no_view.equalsIgnoreCase(name)) {
			yield_act_lot_no_view(value);
			return;
		}
		if ($yield_act_lot_no_data.equalsIgnoreCase(name)) {
			yield_act_lot_no_data(value);
			return;
		}
		if ($yield_act_sublot_no_view.equalsIgnoreCase(name)) {
			yield_act_sublot_no_view(value);
			return;
		}
		if ($yield_act_sublot_no_data.equalsIgnoreCase(name)) {
			yield_act_sublot_no_data(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
			return;
		}
		if ($s_int_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_qty(value);
			return;
		}
		if ($yield_unit_nm.equalsIgnoreCase(name)) {
			yield_unit_nm(value);
			return;
		}
		if ($s_int_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_yield_act_qty(value);
			return;
		}
		if ($s_dec_trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_yield_act_qty(value);
			return;
		}
		if ($yield_act_unit_nm.equalsIgnoreCase(name)) {
			yield_act_unit_nm(value);
			return;
		}
		if ($yield_act_lot_no_view.equalsIgnoreCase(name)) {
			yield_act_lot_no_view(value);
			return;
		}
		if ($yield_act_lot_no_data.equalsIgnoreCase(name)) {
			yield_act_lot_no_data(value);
			return;
		}
		if ($yield_act_sublot_no_view.equalsIgnoreCase(name)) {
			yield_act_sublot_no_view(value);
			return;
		}
		if ($yield_act_sublot_no_data.equalsIgnoreCase(name)) {
			yield_act_sublot_no_data(value);
			return;
		}
		if ($yield_typ_nm.equalsIgnoreCase(name)) {
			yield_typ_nm(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($strg_str_ln_nm.equalsIgnoreCase(name)) {
			strg_str_ln_nm(value);
			return;
		}
		if ($yield_act_rpt_rmrks.equalsIgnoreCase(name)) {
			yield_act_rpt_rmrks(value);
			return;
		}
		if ($yield_act_sub_char1.equalsIgnoreCase(name)) {
			yield_act_sub_char1(value);
			return;
		}
		if ($yield_act_sub_char2.equalsIgnoreCase(name)) {
			yield_act_sub_char2(value);
			return;
		}
		if ($yield_act_sub_char3.equalsIgnoreCase(name)) {
			yield_act_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_act_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($act_dt.equalsIgnoreCase(name)) {
			act_dt(value);
			return;
		}
		if ($act_hm.equalsIgnoreCase(name)) {
			act_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

