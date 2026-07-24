package mcframe.serverMSBC.MSBCL5080;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"RqmtCrt_Calc01_Wk"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RqmtCrt_Calc01_WkR_MC_A extends MCConstRow {

	/**
	 * Production date 生産日付.<p>
	 *
	 */
	public static final String $prod_dt = "prod_dt";
	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public static final String $mps_grp_cd = "mps_grp_cd";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public static final String $prod_rate = "prod_rate";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public static final String $prod_qty_by_day = "prod_qty_by_day";
	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cal_cd = "strg_loc_cal_cd";
	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public static final String $prod_days = "prod_days";


	public static final MCMeta prod_dt_META = createCommonMeta($prod_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mps_grp_cd_META = createCommonMeta($mps_grp_cd, mcframe.commonMA.meta.MA_META.MPS_GRP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_rate_META = createCommonMeta($prod_rate, mcframe.commonMA.meta.MA_META.PROD_RATE);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prod_qty_by_day_META = createCommonMeta($prod_qty_by_day, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta strg_loc_cal_cd_META = createCommonMeta($strg_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta prod_days_META = createCommonMeta($prod_days, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<RqmtCrt_Calc01_WkR> constMetas = new ConstMetaList<RqmtCrt_Calc01_WkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prod_dt_META,
			mps_grp_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			prod_rate_META,
			dec_place_META,
			prod_qty_by_day_META,
			strg_loc_cal_cd_META,
			prod_days_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected RqmtCrt_Calc01_WkR_MC_A(ConstMetaList<? extends RqmtCrt_Calc01_WkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_WkR clone() {
		return (RqmtCrt_Calc01_WkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_WkR createInstance() {
		return (RqmtCrt_Calc01_WkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RqmtCrt_Calc01_WkR getValues(String... names) {
		return (RqmtCrt_Calc01_WkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Production date 生産日付.<p>
	 *
	 */
	public MCDate prod_dt() {
		return getConstDate(offset + 0, $prod_dt);
	}

	/**
	 * Production date 生産日付.<p>
	 *
	 */
	public void prod_dt(MCDate value) {
		setConstDate(offset + 0, $prod_dt, value);
	}


	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public String mps_grp_cd() {
		return getConstString(offset + 1, $mps_grp_cd);
	}

	/**
	 * MPS group cd. ＭＰＳグループＣＤ.<p>
	 *
	 */
	public void mps_grp_cd(String value) {
		setConstString(offset + 1, $mps_grp_cd, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public MCNumber prod_rate() {
		return getConstNumber(offset + 6, $prod_rate);
	}

	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public void prod_rate(MCNumber value) {
		setConstNumber(offset + 6, $prod_rate, value);
	}

	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public void prod_rate(int value) {
		setConstNumber(offset + 6, $prod_rate, value);
	}

	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public void prod_rate(long value) {
		setConstNumber(offset + 6, $prod_rate, value);
	}

	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public void prod_rate(float value) {
		setConstNumber(offset + 6, $prod_rate, value);
	}

	/**
	 * Disaggregation by day proportion ratio 日ばらし案分比率.<p>
	 *
	 */
	public void prod_rate(double value) {
		setConstNumber(offset + 6, $prod_rate, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 7, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 7, $dec_place, value);
	}


	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public MCNumber prod_qty_by_day() {
		return getConstNumber(offset + 8, $prod_qty_by_day);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(MCNumber value) {
		setConstNumber(offset + 8, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(int value) {
		setConstNumber(offset + 8, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(long value) {
		setConstNumber(offset + 8, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(float value) {
		setConstNumber(offset + 8, $prod_qty_by_day, value);
	}

	/**
	 * Production possible qty./day 生産可能数量／日.<p>
	 *
	 */
	public void prod_qty_by_day(double value) {
		setConstNumber(offset + 8, $prod_qty_by_day, value);
	}


	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public String strg_loc_cal_cd() {
		return getConstString(offset + 9, $strg_loc_cal_cd);
	}

	/**
	 * Storage location calendar cd. 格納場所カレンダＣＤ.<p>
	 *
	 */
	public void strg_loc_cal_cd(String value) {
		setConstString(offset + 9, $strg_loc_cal_cd, value);
	}


	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public MCNumber prod_days() {
		return getConstNumber(offset + 10, $prod_days);
	}

	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public void prod_days(MCNumber value) {
		setConstNumber(offset + 10, $prod_days, value);
	}

	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public void prod_days(int value) {
		setConstNumber(offset + 10, $prod_days, value);
	}

	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public void prod_days(long value) {
		setConstNumber(offset + 10, $prod_days, value);
	}

	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public void prod_days(float value) {
		setConstNumber(offset + 10, $prod_days, value);
	}

	/**
	 * Number of operating days 稼動日数.<p>
	 *
	 */
	public void prod_days(double value) {
		setConstNumber(offset + 10, $prod_days, value);
	}


	public String getString(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			return strg_loc_cal_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			return prod_rate();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			return prod_qty_by_day();
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			return prod_days();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prod_dt.equalsIgnoreCase(name)) {
			return prod_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			return mps_grp_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			return strg_loc_cal_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			return prod_rate();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			return prod_qty_by_day();
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			return prod_days();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prod_dt.equalsIgnoreCase(name)) {
			return prod_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			strg_loc_cal_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prod_dt.equalsIgnoreCase(name)) {
			prod_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mps_grp_cd.equalsIgnoreCase(name)) {
			mps_grp_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($strg_loc_cal_cd.equalsIgnoreCase(name)) {
			strg_loc_cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prod_rate.equalsIgnoreCase(name)) {
			prod_rate(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($prod_qty_by_day.equalsIgnoreCase(name)) {
			prod_qty_by_day(value);
			return;
		}
		if ($prod_days.equalsIgnoreCase(name)) {
			prod_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prod_dt.equalsIgnoreCase(name)) {
			prod_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

