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
 * "品目構成マスタ // Item configuration master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>core_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主品目ＣＤ</td>
 *  	<td>Main item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>core_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番１</td>
 *  	<td>Main branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>core_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番２</td>
 *  	<td>Main branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>core_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主枝番３</td>
 *  	<td>Main branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>comp_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成品目ＣＤ</td>
 *  	<td>Component item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>comp_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番１</td>
 *  	<td>Configuration branch 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>comp_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番２</td>
 *  	<td>Configuration branch 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>comp_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>構成枝番３</td>
 *  	<td>Configuration branch 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_ITM_COMP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_ITM_COMP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public static final String $core_itm_cd = "core_itm_cd";
	private static final MCPermColumnInfo _core_itm_cd = createColumnInfo("core_itm_cd");
	public final MCStringPermColumn core_itm_cd = createStringColumn(_core_itm_cd);
	
	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public static final String $core_itm_sub1 = "core_itm_sub1";
	private static final MCPermColumnInfo _core_itm_sub1 = createColumnInfo("core_itm_sub1");
	public final MCStringPermColumn core_itm_sub1 = createStringColumn(_core_itm_sub1);
	
	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public static final String $core_itm_sub2 = "core_itm_sub2";
	private static final MCPermColumnInfo _core_itm_sub2 = createColumnInfo("core_itm_sub2");
	public final MCStringPermColumn core_itm_sub2 = createStringColumn(_core_itm_sub2);
	
	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public static final String $core_itm_sub3 = "core_itm_sub3";
	private static final MCPermColumnInfo _core_itm_sub3 = createColumnInfo("core_itm_sub3");
	public final MCStringPermColumn core_itm_sub3 = createStringColumn(_core_itm_sub3);
	
	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public static final String $comp_itm_cd = "comp_itm_cd";
	private static final MCPermColumnInfo _comp_itm_cd = createColumnInfo("comp_itm_cd");
	public final MCStringPermColumn comp_itm_cd = createStringColumn(_comp_itm_cd);
	
	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public static final String $comp_itm_sub1 = "comp_itm_sub1";
	private static final MCPermColumnInfo _comp_itm_sub1 = createColumnInfo("comp_itm_sub1");
	public final MCStringPermColumn comp_itm_sub1 = createStringColumn(_comp_itm_sub1);
	
	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public static final String $comp_itm_sub2 = "comp_itm_sub2";
	private static final MCPermColumnInfo _comp_itm_sub2 = createColumnInfo("comp_itm_sub2");
	public final MCStringPermColumn comp_itm_sub2 = createStringColumn(_comp_itm_sub2);
	
	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public static final String $comp_itm_sub3 = "comp_itm_sub3";
	private static final MCPermColumnInfo _comp_itm_sub3 = createColumnInfo("comp_itm_sub3");
	public final MCStringPermColumn comp_itm_sub3 = createStringColumn(_comp_itm_sub3);
	
	public static final MCMeta core_itm_cd_META = createCommonMeta($core_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta core_itm_sub1_META = createCommonMeta($core_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta core_itm_sub2_META = createCommonMeta($core_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta core_itm_sub3_META = createCommonMeta($core_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta comp_itm_cd_META = createCommonMeta($comp_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta comp_itm_sub1_META = createCommonMeta($comp_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta comp_itm_sub2_META = createCommonMeta($comp_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta comp_itm_sub3_META = createCommonMeta($comp_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_ITM_COMP_KEY_R> constMetas = new ConstMetaList<MAW_ITM_COMP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			core_itm_cd_META,
			core_itm_sub1_META,
			core_itm_sub2_META,
			core_itm_sub3_META,
			comp_itm_cd_META,
			comp_itm_sub1_META,
			comp_itm_sub2_META,
			comp_itm_sub3_META
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
	protected MAW_ITM_COMP_KEY_R(ConstMetaList<? extends MAW_ITM_COMP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_ITM_COMP_KEY_R(ConstMetaList<? extends MAW_ITM_COMP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$core_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$core_itm_cd,
				"core_itm_cd",
				core_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$core_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$core_itm_sub1,
				"core_itm_sub1",
				core_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$core_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$core_itm_sub2,
				"core_itm_sub2",
				core_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$core_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$core_itm_sub3,
				"core_itm_sub3",
				core_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$comp_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$comp_itm_cd,
				"comp_itm_cd",
				comp_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$comp_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$comp_itm_sub1,
				"comp_itm_sub1",
				comp_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$comp_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$comp_itm_sub2,
				"comp_itm_sub2",
				comp_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ITM_COMP_KEY_R.$comp_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ITM_COMP_KEY_R.$comp_itm_sub3,
				"comp_itm_sub3",
				comp_itm_sub3,
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
	public static MAW_ITM_COMP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ITM_COMP_KEY_R create(String alias) {
		MAW_ITM_COMP_KEY_R row = new MAW_ITM_COMP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_ITM_COMP_KEY_R createByName(T proto) {
		MAW_ITM_COMP_KEY_R row = MAW_ITM_COMP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITM_COMP_KEY_R clone() {
		return (MAW_ITM_COMP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITM_COMP_KEY_R createInstance() {
		return (MAW_ITM_COMP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ITM_COMP_KEY_R getValues(String... names) {
		return (MAW_ITM_COMP_KEY_R) super.getValues(names);
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
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public String core_itm_cd() {
		return getConstString(offset + 0, $core_itm_cd);
	}

	/**
	 * 主品目ＣＤ. Main item cd..<p>
	 *
	 */
	public void core_itm_cd(String value) {
		setConstString(offset + 0, $core_itm_cd, value);
	}

	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public String core_itm_sub1() {
		return getConstString(offset + 1, $core_itm_sub1);
	}

	/**
	 * 主枝番１. Main branch No. 1.<p>
	 *
	 */
	public void core_itm_sub1(String value) {
		setConstString(offset + 1, $core_itm_sub1, value);
	}

	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public String core_itm_sub2() {
		return getConstString(offset + 2, $core_itm_sub2);
	}

	/**
	 * 主枝番２. Main branch No. 2.<p>
	 *
	 */
	public void core_itm_sub2(String value) {
		setConstString(offset + 2, $core_itm_sub2, value);
	}

	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public String core_itm_sub3() {
		return getConstString(offset + 3, $core_itm_sub3);
	}

	/**
	 * 主枝番３. Main branch No. 3.<p>
	 *
	 */
	public void core_itm_sub3(String value) {
		setConstString(offset + 3, $core_itm_sub3, value);
	}

	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public String comp_itm_cd() {
		return getConstString(offset + 4, $comp_itm_cd);
	}

	/**
	 * 構成品目ＣＤ. Component item cd..<p>
	 *
	 */
	public void comp_itm_cd(String value) {
		setConstString(offset + 4, $comp_itm_cd, value);
	}

	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public String comp_itm_sub1() {
		return getConstString(offset + 5, $comp_itm_sub1);
	}

	/**
	 * 構成枝番１. Configuration branch 1.<p>
	 *
	 */
	public void comp_itm_sub1(String value) {
		setConstString(offset + 5, $comp_itm_sub1, value);
	}

	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public String comp_itm_sub2() {
		return getConstString(offset + 6, $comp_itm_sub2);
	}

	/**
	 * 構成枝番２. Configuration branch 2.<p>
	 *
	 */
	public void comp_itm_sub2(String value) {
		setConstString(offset + 6, $comp_itm_sub2, value);
	}

	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public String comp_itm_sub3() {
		return getConstString(offset + 7, $comp_itm_sub3);
	}

	/**
	 * 構成枝番３. Configuration branch 3.<p>
	 *
	 */
	public void comp_itm_sub3(String value) {
		setConstString(offset + 7, $comp_itm_sub3, value);
	}

	public String getString(String name) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			return core_itm_cd();
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			return core_itm_sub1();
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			return core_itm_sub2();
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			return core_itm_sub3();
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			return comp_itm_cd();
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			return comp_itm_sub1();
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			return comp_itm_sub2();
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			return comp_itm_sub3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			return core_itm_cd();
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			return core_itm_sub1();
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			return core_itm_sub2();
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			return core_itm_sub3();
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			return comp_itm_cd();
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			return comp_itm_sub1();
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			return comp_itm_sub2();
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			return comp_itm_sub3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			core_itm_cd(value);
			return;
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			core_itm_sub1(value);
			return;
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			core_itm_sub2(value);
			return;
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			core_itm_sub3(value);
			return;
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			comp_itm_cd(value);
			return;
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			comp_itm_sub1(value);
			return;
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			comp_itm_sub2(value);
			return;
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			comp_itm_sub3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($core_itm_cd.equalsIgnoreCase(name)) {
			core_itm_cd(value);
			return;
		}
		if ($core_itm_sub1.equalsIgnoreCase(name)) {
			core_itm_sub1(value);
			return;
		}
		if ($core_itm_sub2.equalsIgnoreCase(name)) {
			core_itm_sub2(value);
			return;
		}
		if ($core_itm_sub3.equalsIgnoreCase(name)) {
			core_itm_sub3(value);
			return;
		}
		if ($comp_itm_cd.equalsIgnoreCase(name)) {
			comp_itm_cd(value);
			return;
		}
		if ($comp_itm_sub1.equalsIgnoreCase(name)) {
			comp_itm_sub1(value);
			return;
		}
		if ($comp_itm_sub2.equalsIgnoreCase(name)) {
			comp_itm_sub2(value);
			return;
		}
		if ($comp_itm_sub3.equalsIgnoreCase(name)) {
			comp_itm_sub3(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
