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
 * "原価計算品目指値ビュー // Cost calculation limit unit price view"DBコンテナRowクラスです。<p>
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
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
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
 *  	<td>C</td>
 *  	<td>base_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準数量</td>
 *  	<td>Base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準単価</td>
 *  	<td>Standard unit cost</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ITM_FIX_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ITM_FIX";

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
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	private static final MCPermColumnInfo _base_qty = createColumnInfo("base_qty");
	public final MCNumberPermColumn base_qty = createNumberColumn(_base_qty);
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	private static final MCPermColumnInfo _std_upri = createColumnInfo("std_upri");
	public final MCNumberPermColumn std_upri = createNumberColumn(_std_upri);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ITM_FIX_R> constMetas = new ConstMetaList<MGVM_ITM_FIX_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			expns_cd_META,
			wg_cd_META,
			base_qty_META,
			std_upri_META
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
	protected MGVM_ITM_FIX_R(ConstMetaList<? extends MGVM_ITM_FIX_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ITM_FIX_R(ConstMetaList<? extends MGVM_ITM_FIX_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ITM_FIX_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$itm_cd,
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
			MGVM_ITM_FIX_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$itm_sub1,
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
			MGVM_ITM_FIX_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$itm_sub2,
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
			MGVM_ITM_FIX_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$itm_sub3,
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
			MGVM_ITM_FIX_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$expns_cd,
				"expns_cd",
				expns_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_FIX_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_FIX_R.$wg_cd,
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
			MGVM_ITM_FIX_R.$base_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_FIX_R.$base_qty,
				"base_qty",
				base_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_FIX_R.$std_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_FIX_R.$std_upri,
				"std_upri",
				std_upri,
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
	public static MGVM_ITM_FIX_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ITM_FIX_R create(String alias) {
		MGVM_ITM_FIX_R row = new MGVM_ITM_FIX_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ITM_FIX_R createByName(T proto) {
		MGVM_ITM_FIX_R row = MGVM_ITM_FIX_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_FIX_R clone() {
		return (MGVM_ITM_FIX_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_FIX_R createInstance() {
		return (MGVM_ITM_FIX_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_FIX_R getValues(String... names) {
		return (MGVM_ITM_FIX_R) super.getValues(names);
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
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 4, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 4, $expns_cd, value);
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
	 * 基準数量. Base qty..<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 6, $base_qty);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 6, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 6, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 6, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 6, $base_qty, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 7, $std_upri);
	}

	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 7, $std_upri, value);
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
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
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
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
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
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
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
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
