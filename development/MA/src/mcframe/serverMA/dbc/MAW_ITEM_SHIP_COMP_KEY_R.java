package mcframe.serverMA.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "製品出荷構成マスタ // Item shipping configuration master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>prod_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製品ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>prod_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製品枝番１</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>prod_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製品枝番２</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>prod_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製品枝番３</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>surv_line_qty</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>測線数</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>diameter</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>口径</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目枝番１</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目枝番２</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目枝番３</td>
 *  	<td></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_ITEM_SHIP_COMP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_ITEM_SHIP_COMP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 製品ＣＤ. .<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	private static final MCPermColumnInfo _prod_itm_cd = createColumnInfo("prod_itm_cd");
	public final MCStringPermColumn prod_itm_cd = createStringColumn(_prod_itm_cd);
	
	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	private static final MCPermColumnInfo _prod_itm_sub1 = createColumnInfo("prod_itm_sub1");
	public final MCStringPermColumn prod_itm_sub1 = createStringColumn(_prod_itm_sub1);
	
	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	private static final MCPermColumnInfo _prod_itm_sub2 = createColumnInfo("prod_itm_sub2");
	public final MCStringPermColumn prod_itm_sub2 = createStringColumn(_prod_itm_sub2);
	
	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	private static final MCPermColumnInfo _prod_itm_sub3 = createColumnInfo("prod_itm_sub3");
	public final MCStringPermColumn prod_itm_sub3 = createStringColumn(_prod_itm_sub3);
	
	/**
	 * 測線数. .<p>
	 *
	 */
	public static final String $surv_line_qty = "surv_line_qty";
	private static final MCPermColumnInfo _surv_line_qty = createColumnInfo("surv_line_qty");
	public final MCStringPermColumn surv_line_qty = createStringColumn(_surv_line_qty);
	
	/**
	 * 口径. .<p>
	 *
	 */
	public static final String $diameter = "diameter";
	private static final MCPermColumnInfo _diameter = createColumnInfo("diameter");
	public final MCStringPermColumn diameter = createStringColumn(_diameter);
	
	/**
	 * 構成品目ＣＤ. .<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 構成品目枝番１. .<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 構成品目枝番２. .<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 構成品目枝番３. .<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta surv_line_qty_META = createCommonMeta($surv_line_qty, mcframe.commonMA.meta.MA_META.SURV_LINE_QTY);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_ITEM_SHIP_COMP_KEY_R> constMetas = new ConstMetaList<MAW_ITEM_SHIP_COMP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			surv_line_qty_META,
			diameter_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META
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
	protected MAW_ITEM_SHIP_COMP_KEY_R(ConstMetaList<? extends MAW_ITEM_SHIP_COMP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_ITEM_SHIP_COMP_KEY_R(ConstMetaList<? extends MAW_ITEM_SHIP_COMP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_cd,
				"prod_itm_cd",
				prod_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub1,
				"prod_itm_sub1",
				prod_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub2,
				"prod_itm_sub2",
				prod_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$prod_itm_sub3,
				"prod_itm_sub3",
				prod_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$surv_line_qty,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$surv_line_qty,
				"surv_line_qty",
				surv_line_qty,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$diameter,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$diameter,
				"diameter",
				diameter,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITEM_SHIP_COMP_KEY_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$itm_cd,
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
			MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub1,
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
			MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub2,
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
			MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITEM_SHIP_COMP_KEY_R.$itm_sub3,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ITEM_SHIP_COMP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ITEM_SHIP_COMP_KEY_R create(String alias) {
		MAW_ITEM_SHIP_COMP_KEY_R row = new MAW_ITEM_SHIP_COMP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_ITEM_SHIP_COMP_KEY_R createByName(T proto) {
		MAW_ITEM_SHIP_COMP_KEY_R row = MAW_ITEM_SHIP_COMP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITEM_SHIP_COMP_KEY_R clone() {
		return (MAW_ITEM_SHIP_COMP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITEM_SHIP_COMP_KEY_R createInstance() {
		return (MAW_ITEM_SHIP_COMP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITEM_SHIP_COMP_KEY_R getValues(String... names) {
		return (MAW_ITEM_SHIP_COMP_KEY_R) super.getValues(names);
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
	 * 製品ＣＤ. .<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 0, $prod_itm_cd);
	}

	/**
	 * 製品ＣＤ. .<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 0, $prod_itm_cd, value);
	}

	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 1, $prod_itm_sub1);
	}

	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 1, $prod_itm_sub1, value);
	}

	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 2, $prod_itm_sub2);
	}

	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 2, $prod_itm_sub2, value);
	}

	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 3, $prod_itm_sub3);
	}

	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 3, $prod_itm_sub3, value);
	}

	/**
	 * 測線数. .<p>
	 *
	 */
	public String surv_line_qty() {
		return getConstString(offset + 4, $surv_line_qty);
	}

	/**
	 * 測線数. .<p>
	 *
	 */
	public void surv_line_qty(String value) {
		setConstString(offset + 4, $surv_line_qty, value);
	}

	/**
	 * 口径. .<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 5, $diameter);
	}

	/**
	 * 口径. .<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 5, $diameter, value);
	}

	/**
	 * 構成品目ＣＤ. .<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * 構成品目ＣＤ. .<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}

	/**
	 * 構成品目枝番１. .<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * 構成品目枝番１. .<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}

	/**
	 * 構成品目枝番２. .<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * 構成品目枝番２. .<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}

	/**
	 * 構成品目枝番３. .<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * 構成品目枝番３. .<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}

	public String getString(String name) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
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
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
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
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
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
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
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
		super.setStringNE(name, value);
	}

}
