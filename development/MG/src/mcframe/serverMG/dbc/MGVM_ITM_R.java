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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算品目ビュー // Calculation item view"DBコンテナRowクラスです。<p>
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
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_ext</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目拡張</td>
 *  	<td>Item extension</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目区分</td>
 *  	<td>Item type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算パタンＣＤ</td>
 *  	<td>Calculation pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準数量</td>
 *  	<td>Base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>端数処理区分</td>
 *  	<td>Rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ITM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ITM";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public static final String $itm_ext = "itm_ext";
	private static final MCPermColumnInfo _itm_ext = createColumnInfo("itm_ext");
	public final MCStringPermColumn itm_ext = createStringColumn(_itm_ext);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	private static final MCPermColumnInfo _itm_typ = createColumnInfo("itm_typ");
	public final MCStringPermColumn itm_typ = createStringColumn(_itm_typ);
	
	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public static final String $calc_ptn_cd = "calc_ptn_cd";
	private static final MCPermColumnInfo _calc_ptn_cd = createColumnInfo("calc_ptn_cd");
	public final MCStringPermColumn calc_ptn_cd = createStringColumn(_calc_ptn_cd);
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	private static final MCPermColumnInfo _std_qty = createColumnInfo("std_qty");
	public final MCNumberPermColumn std_qty = createNumberColumn(_std_qty);
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	private static final MCPermColumnInfo _rnd_typ = createColumnInfo("rnd_typ");
	public final MCStringPermColumn rnd_typ = createStringColumn(_rnd_typ);
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_ext_META = createCommonMeta($itm_ext, mcframe.commonMG.meta.MG_META.ITM_EXT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta calc_ptn_cd_META = createCommonMeta($calc_ptn_cd, mcframe.commonMA.meta.MA_META.CALC_PTN_CD);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ITM_R> constMetas = new ConstMetaList<MGVM_ITM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_ext_META,
			wg_cd_META,
			itm_typ_META,
			calc_ptn_cd_META,
			std_qty_META,
			rnd_typ_META,
			dec_place_META
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
	protected MGVM_ITM_R(ConstMetaList<? extends MGVM_ITM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ITM_R(ConstMetaList<? extends MGVM_ITM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_ext,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_ext,
				"itm_ext",
				itm_ext,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$itm_typ,
				"itm_typ",
				itm_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$calc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$calc_ptn_cd,
				"calc_ptn_cd",
				calc_ptn_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_R.$std_qty,
				"std_qty",
				std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_R.$rnd_typ,
				"rnd_typ",
				rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_R.$dec_place,
				"dec_place",
				dec_place,
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
	public static MGVM_ITM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ITM_R create(String alias) {
		MGVM_ITM_R row = new MGVM_ITM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ITM_R createByName(T proto) {
		MGVM_ITM_R row = MGVM_ITM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_R clone() {
		return (MGVM_ITM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_R createInstance() {
		return (MGVM_ITM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_R getValues(String... names) {
		return (MGVM_ITM_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public String itm_ext() {
		return getConstString(offset + 4, $itm_ext);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public void itm_ext(String value) {
		setConstString(offset + 4, $itm_ext, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 6, $itm_typ);
	}

	/**
	 * 品目区分. Item type.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 6, $itm_typ, value);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public String calc_ptn_cd() {
		return getConstString(offset + 7, $calc_ptn_cd);
	}

	/**
	 * 計算パタンＣＤ. Calculation pattern cd..<p>
	 *
	 */
	public void calc_ptn_cd(String value) {
		setConstString(offset + 7, $calc_ptn_cd, value);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 8, $std_qty);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 8, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 8, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 8, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 8, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 8, $std_qty, value);
	}
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 9, $rnd_typ);
	}

	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 9, $rnd_typ, value);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 10, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 10, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 10, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 10, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 10, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 10, $dec_place, value);
	}
	
	public String getString(String name) {
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			return calc_ptn_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($calc_ptn_cd.equalsIgnoreCase(name)) {
			calc_ptn_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
