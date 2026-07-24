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
 * "品揃マスタ // Assortment master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>set_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃グループＣＤ</td>
 *  	<td>Assortment group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表品目ＣＤ</td>
 *  	<td>Representative item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>main_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番１</td>
 *  	<td>Representative branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番２</td>
 *  	<td>Representative branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>main_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番３</td>
 *  	<td>Representative branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表品目単位ＣＤ</td>
 *  	<td>Representative item unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>set_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃品目ＣＤ</td>
 *  	<td>Assortment item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>set_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番１</td>
 *  	<td>Assortment branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>set_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番２</td>
 *  	<td>Assortment branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>set_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番３</td>
 *  	<td>Assortment branch No. 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_SET_ITM_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_SET_ITM_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	private static final MCPermColumnInfo _set_grp_cd = createColumnInfo("set_grp_cd");
	public final MCStringPermColumn set_grp_cd = createStringColumn(_set_grp_cd);
	
	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public static final String $main_itm_cd = "main_itm_cd";
	private static final MCPermColumnInfo _main_itm_cd = createColumnInfo("main_itm_cd");
	public final MCStringPermColumn main_itm_cd = createStringColumn(_main_itm_cd);
	
	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public static final String $main_itm_sub1 = "main_itm_sub1";
	private static final MCPermColumnInfo _main_itm_sub1 = createColumnInfo("main_itm_sub1");
	public final MCStringPermColumn main_itm_sub1 = createStringColumn(_main_itm_sub1);
	
	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public static final String $main_itm_sub2 = "main_itm_sub2";
	private static final MCPermColumnInfo _main_itm_sub2 = createColumnInfo("main_itm_sub2");
	public final MCStringPermColumn main_itm_sub2 = createStringColumn(_main_itm_sub2);
	
	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public static final String $main_itm_sub3 = "main_itm_sub3";
	private static final MCPermColumnInfo _main_itm_sub3 = createColumnInfo("main_itm_sub3");
	public final MCStringPermColumn main_itm_sub3 = createStringColumn(_main_itm_sub3);
	
	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public static final String $main_itm_unit_cd = "main_itm_unit_cd";
	private static final MCPermColumnInfo _main_itm_unit_cd = createColumnInfo("main_itm_unit_cd");
	public final MCStringPermColumn main_itm_unit_cd = createStringColumn(_main_itm_unit_cd);
	
	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public static final String $set_itm_cd = "set_itm_cd";
	private static final MCPermColumnInfo _set_itm_cd = createColumnInfo("set_itm_cd");
	public final MCStringPermColumn set_itm_cd = createStringColumn(_set_itm_cd);
	
	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public static final String $set_itm_sub1 = "set_itm_sub1";
	private static final MCPermColumnInfo _set_itm_sub1 = createColumnInfo("set_itm_sub1");
	public final MCStringPermColumn set_itm_sub1 = createStringColumn(_set_itm_sub1);
	
	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public static final String $set_itm_sub2 = "set_itm_sub2";
	private static final MCPermColumnInfo _set_itm_sub2 = createColumnInfo("set_itm_sub2");
	public final MCStringPermColumn set_itm_sub2 = createStringColumn(_set_itm_sub2);
	
	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public static final String $set_itm_sub3 = "set_itm_sub3";
	private static final MCPermColumnInfo _set_itm_sub3 = createColumnInfo("set_itm_sub3");
	public final MCStringPermColumn set_itm_sub3 = createStringColumn(_set_itm_sub3);
	
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta main_itm_cd_META = createCommonMeta($main_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta main_itm_sub1_META = createCommonMeta($main_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta main_itm_sub2_META = createCommonMeta($main_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta main_itm_sub3_META = createCommonMeta($main_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta main_itm_unit_cd_META = createCommonMeta($main_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta set_itm_cd_META = createCommonMeta($set_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta set_itm_sub1_META = createCommonMeta($set_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta set_itm_sub2_META = createCommonMeta($set_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta set_itm_sub3_META = createCommonMeta($set_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_SET_ITM_KEY_R> constMetas = new ConstMetaList<MAW_SET_ITM_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			set_grp_cd_META,
			main_itm_cd_META,
			main_itm_sub1_META,
			main_itm_sub2_META,
			main_itm_sub3_META,
			main_itm_unit_cd_META,
			set_itm_cd_META,
			set_itm_sub1_META,
			set_itm_sub2_META,
			set_itm_sub3_META
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
	protected MAW_SET_ITM_KEY_R(ConstMetaList<? extends MAW_SET_ITM_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_SET_ITM_KEY_R(ConstMetaList<? extends MAW_SET_ITM_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$set_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$set_grp_cd,
				"set_grp_cd",
				set_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$main_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$main_itm_cd,
				"main_itm_cd",
				main_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$main_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$main_itm_sub1,
				"main_itm_sub1",
				main_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$main_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$main_itm_sub2,
				"main_itm_sub2",
				main_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$main_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$main_itm_sub3,
				"main_itm_sub3",
				main_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$main_itm_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$main_itm_unit_cd,
				"main_itm_unit_cd",
				main_itm_unit_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$set_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$set_itm_cd,
				"set_itm_cd",
				set_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$set_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$set_itm_sub1,
				"set_itm_sub1",
				set_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$set_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$set_itm_sub2,
				"set_itm_sub2",
				set_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SET_ITM_KEY_R.$set_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SET_ITM_KEY_R.$set_itm_sub3,
				"set_itm_sub3",
				set_itm_sub3,
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
	public static MAW_SET_ITM_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SET_ITM_KEY_R create(String alias) {
		MAW_SET_ITM_KEY_R row = new MAW_SET_ITM_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_SET_ITM_KEY_R createByName(T proto) {
		MAW_SET_ITM_KEY_R row = MAW_SET_ITM_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SET_ITM_KEY_R clone() {
		return (MAW_SET_ITM_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SET_ITM_KEY_R createInstance() {
		return (MAW_SET_ITM_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SET_ITM_KEY_R getValues(String... names) {
		return (MAW_SET_ITM_KEY_R) super.getValues(names);
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
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 0, $set_grp_cd);
	}

	/**
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 0, $set_grp_cd, value);
	}

	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public String main_itm_cd() {
		return getConstString(offset + 1, $main_itm_cd);
	}

	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public void main_itm_cd(String value) {
		setConstString(offset + 1, $main_itm_cd, value);
	}

	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public String main_itm_sub1() {
		return getConstString(offset + 2, $main_itm_sub1);
	}

	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		setConstString(offset + 2, $main_itm_sub1, value);
	}

	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public String main_itm_sub2() {
		return getConstString(offset + 3, $main_itm_sub2);
	}

	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		setConstString(offset + 3, $main_itm_sub2, value);
	}

	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public String main_itm_sub3() {
		return getConstString(offset + 4, $main_itm_sub3);
	}

	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		setConstString(offset + 4, $main_itm_sub3, value);
	}

	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public String main_itm_unit_cd() {
		return getConstString(offset + 5, $main_itm_unit_cd);
	}

	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public void main_itm_unit_cd(String value) {
		setConstString(offset + 5, $main_itm_unit_cd, value);
	}

	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public String set_itm_cd() {
		return getConstString(offset + 6, $set_itm_cd);
	}

	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public void set_itm_cd(String value) {
		setConstString(offset + 6, $set_itm_cd, value);
	}

	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public String set_itm_sub1() {
		return getConstString(offset + 7, $set_itm_sub1);
	}

	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		setConstString(offset + 7, $set_itm_sub1, value);
	}

	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public String set_itm_sub2() {
		return getConstString(offset + 8, $set_itm_sub2);
	}

	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		setConstString(offset + 8, $set_itm_sub2, value);
	}

	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public String set_itm_sub3() {
		return getConstString(offset + 9, $set_itm_sub3);
	}

	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		setConstString(offset + 9, $set_itm_sub3, value);
	}

	public String getString(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
