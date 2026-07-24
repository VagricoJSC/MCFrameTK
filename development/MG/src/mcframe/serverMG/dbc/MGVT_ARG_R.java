package mcframe.serverMG.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算設定情報ビュー // Calculation setting info. view"DBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sa_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予実区分</td>
 *  	<td>Plan/Result type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>対象期間先頭年月</td>
 *  	<td>First month of the term</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>対象期間末尾年月</td>
 *  	<td>Last month of the term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額評価区分</td>
 *  	<td>Amount evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exp_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>展開計算区分</td>
 *  	<td>BOM explosion calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入計算ＦＬＧ</td>
 *  	<td>Input calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数計算ＦＬＧ</td>
 *  	<td>Man-hour calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給計算ＦＬＧ</td>
 *  	<td>Supply calculation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_calc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動計算ＦＬＧ</td>
 *  	<td>Movement calculation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率計算区分</td>
 *  	<td>Allocation rate calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算区分</td>
 *  	<td>Calculation type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVT_ARG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_ARG";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	private static final MCPermColumnInfo _sa_typ = createColumnInfo("sa_typ");
	public final MCStringPermColumn sa_typ = createStringColumn(_sa_typ);
	
	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public static final String $st_ym = "st_ym";
	private static final MCPermColumnInfo _st_ym = createColumnInfo("st_ym");
	public final MCDatePermColumn st_ym = createDateColumn(_st_ym);
	
	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public static final String $end_ym = "end_ym";
	private static final MCPermColumnInfo _end_ym = createColumnInfo("end_ym");
	public final MCDatePermColumn end_ym = createDateColumn(_end_ym);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public static final String $exp_calc_typ = "exp_calc_typ";
	private static final MCPermColumnInfo _exp_calc_typ = createColumnInfo("exp_calc_typ");
	public final MCStringPermColumn exp_calc_typ = createStringColumn(_exp_calc_typ);
	
	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public static final String $inpt_calc_flg = "inpt_calc_flg";
	private static final MCPermColumnInfo _inpt_calc_flg = createColumnInfo("inpt_calc_flg");
	public final MCBooleanPermColumn inpt_calc_flg = createBooleanColumn(_inpt_calc_flg);
	
	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public static final String $wk_calc_flg = "wk_calc_flg";
	private static final MCPermColumnInfo _wk_calc_flg = createColumnInfo("wk_calc_flg");
	public final MCBooleanPermColumn wk_calc_flg = createBooleanColumn(_wk_calc_flg);
	
	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public static final String $prov_calc_flg = "prov_calc_flg";
	private static final MCPermColumnInfo _prov_calc_flg = createColumnInfo("prov_calc_flg");
	public final MCBooleanPermColumn prov_calc_flg = createBooleanColumn(_prov_calc_flg);
	
	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public static final String $xfr_calc_flg = "xfr_calc_flg";
	private static final MCPermColumnInfo _xfr_calc_flg = createColumnInfo("xfr_calc_flg");
	public final MCBooleanPermColumn xfr_calc_flg = createBooleanColumn(_xfr_calc_flg);
	
	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";
	private static final MCPermColumnInfo _alc_calc_typ = createColumnInfo("alc_calc_typ");
	public final MCStringPermColumn alc_calc_typ = createStringColumn(_alc_calc_typ);
	
	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	private static final MCPermColumnInfo _cost_calc_typ = createColumnInfo("cost_calc_typ");
	public final MCStringPermColumn cost_calc_typ = createStringColumn(_cost_calc_typ);
	
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta st_ym_META = createCommonMeta($st_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta end_ym_META = createCommonMeta($end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta exp_calc_typ_META = createCommonMeta($exp_calc_typ, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP);
	public static final MCMeta inpt_calc_flg_META = createCommonMeta($inpt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wk_calc_flg_META = createCommonMeta($wk_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_calc_flg_META = createCommonMeta($prov_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_calc_flg_META = createCommonMeta($xfr_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVT_ARG_R> constMetas = new ConstMetaList<MGVT_ARG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			sa_typ_META,
			st_ym_META,
			end_ym_META,
			eval_typ_META,
			exp_calc_typ_META,
			inpt_calc_flg_META,
			wk_calc_flg_META,
			prov_calc_flg_META,
			xfr_calc_flg_META,
			alc_calc_typ_META,
			cost_calc_typ_META
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
	protected MGVT_ARG_R(ConstMetaList<? extends MGVT_ARG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_ARG_R(ConstMetaList<? extends MGVT_ARG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_ARG_R.$sa_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ARG_R.$sa_typ,
				"sa_typ",
				sa_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$st_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ARG_R.$st_ym,
				"st_ym",
				st_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$end_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_ARG_R.$end_ym,
				"end_ym",
				end_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ARG_R.$eval_typ,
				"eval_typ",
				eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$exp_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ARG_R.$exp_calc_typ,
				"exp_calc_typ",
				exp_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$inpt_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ARG_R.$inpt_calc_flg,
				"inpt_calc_flg",
				inpt_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$wk_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ARG_R.$wk_calc_flg,
				"wk_calc_flg",
				wk_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$prov_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ARG_R.$prov_calc_flg,
				"prov_calc_flg",
				prov_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$xfr_calc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_ARG_R.$xfr_calc_flg,
				"xfr_calc_flg",
				xfr_calc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ARG_R.$alc_calc_typ,
				"alc_calc_typ",
				alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ARG_R.$cost_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ARG_R.$cost_calc_typ,
				"cost_calc_typ",
				cost_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_ARG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_ARG_R create(String alias) {
		MGVT_ARG_R row = new MGVT_ARG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_ARG_R createByName(T proto) {
		MGVT_ARG_R row = MGVT_ARG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ARG_R clone() {
		return (MGVT_ARG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ARG_R createInstance() {
		return (MGVT_ARG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ARG_R getValues(String... names) {
		return (MGVT_ARG_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 0, $sa_typ);
	}

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 0, $sa_typ, value);
	}

	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public MCDate st_ym() {
		return getConstDate(offset + 1, $st_ym);
	}

	/**
	 * 対象期間先頭年月. First month of the term.<p>
	 *
	 */
	public void st_ym(MCDate value) {
		setConstDate(offset + 1, $st_ym, value);
	}

	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public MCDate end_ym() {
		return getConstDate(offset + 2, $end_ym);
	}

	/**
	 * 対象期間末尾年月. Last month of the term.<p>
	 *
	 */
	public void end_ym(MCDate value) {
		setConstDate(offset + 2, $end_ym, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 3, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 3, $eval_typ, value);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public String exp_calc_typ() {
		return getConstString(offset + 4, $exp_calc_typ);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public void exp_calc_typ(String value) {
		setConstString(offset + 4, $exp_calc_typ, value);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public boolean inpt_calc_flg() {
		return getConstBoolean(offset + 5, $inpt_calc_flg);
	}

	/**
	 * 投入計算ＦＬＧ. Input calculation flg..<p>
	 *
	 */
	public void inpt_calc_flg(boolean value) {
		setConstBoolean(offset + 5, $inpt_calc_flg, value);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public boolean wk_calc_flg() {
		return getConstBoolean(offset + 6, $wk_calc_flg);
	}

	/**
	 * 工数計算ＦＬＧ. Man-hour calculation flg..<p>
	 *
	 */
	public void wk_calc_flg(boolean value) {
		setConstBoolean(offset + 6, $wk_calc_flg, value);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public boolean prov_calc_flg() {
		return getConstBoolean(offset + 7, $prov_calc_flg);
	}

	/**
	 * 支給計算ＦＬＧ. Supply calculation flg..<p>
	 *
	 */
	public void prov_calc_flg(boolean value) {
		setConstBoolean(offset + 7, $prov_calc_flg, value);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public boolean xfr_calc_flg() {
		return getConstBoolean(offset + 8, $xfr_calc_flg);
	}

	/**
	 * 移動計算ＦＬＧ. Movement calculation flg..<p>
	 *
	 */
	public void xfr_calc_flg(boolean value) {
		setConstBoolean(offset + 8, $xfr_calc_flg, value);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 9, $alc_calc_typ);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 9, $alc_calc_typ, value);
	}

	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 10, $cost_calc_typ);
	}

	/**
	 * 原価計算区分. Calculation type.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 10, $cost_calc_typ, value);
	}

	public String getString(String name) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_ym.equalsIgnoreCase(name)) {
			return st_ym();
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			return end_ym();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			return inpt_calc_flg();
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			return wk_calc_flg();
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			return prov_calc_flg();
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			return xfr_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_ym.equalsIgnoreCase(name)) {
			st_ym(value);
			return;
		}
		if ($end_ym.equalsIgnoreCase(name)) {
			end_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($inpt_calc_flg.equalsIgnoreCase(name)) {
			inpt_calc_flg(value);
			return;
		}
		if ($wk_calc_flg.equalsIgnoreCase(name)) {
			wk_calc_flg(value);
			return;
		}
		if ($prov_calc_flg.equalsIgnoreCase(name)) {
			prov_calc_flg(value);
			return;
		}
		if ($xfr_calc_flg.equalsIgnoreCase(name)) {
			xfr_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
