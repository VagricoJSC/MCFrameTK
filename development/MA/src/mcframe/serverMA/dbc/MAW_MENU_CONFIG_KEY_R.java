package mcframe.serverMA.dbc;

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
 * "原価メニュー構成マスタ // Cost menu structure master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>menu_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メニューＣＤ</td>
 *  	<td>Menu cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>menu_no</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メニュー配置番号</td>
 *  	<td>Menu placement number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_MENU_CONFIG_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_MENU_CONFIG_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * メニューＣＤ. Menu cd..<p>
	 *
	 */
	public static final String $menu_cd = "menu_cd";
	private static final MCPermColumnInfo _menu_cd = createColumnInfo("menu_cd");
	public final MCStringPermColumn menu_cd = createStringColumn(_menu_cd);
	
	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public static final String $menu_no = "menu_no";
	private static final MCPermColumnInfo _menu_no = createColumnInfo("menu_no");
	public final MCNumberPermColumn menu_no = createNumberColumn(_menu_no);
	
	public static final MCMeta menu_cd_META = createCommonMeta($menu_cd, mcframe.commonMA.meta.MA_META.MENU_CD);
	public static final MCMeta menu_no_META = createCommonMeta($menu_no, mcframe.commonMA.meta.MA_META.MENU_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_MENU_CONFIG_KEY_R> constMetas = new ConstMetaList<MAW_MENU_CONFIG_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			menu_cd_META,
			menu_no_META
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
	protected MAW_MENU_CONFIG_KEY_R(ConstMetaList<? extends MAW_MENU_CONFIG_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_MENU_CONFIG_KEY_R(ConstMetaList<? extends MAW_MENU_CONFIG_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_MENU_CONFIG_KEY_R.$menu_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_MENU_CONFIG_KEY_R.$menu_cd,
				"menu_cd",
				menu_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_MENU_CONFIG_KEY_R.$menu_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_MENU_CONFIG_KEY_R.$menu_no,
				"menu_no",
				menu_no,
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
	public static MAW_MENU_CONFIG_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_MENU_CONFIG_KEY_R create(String alias) {
		MAW_MENU_CONFIG_KEY_R row = new MAW_MENU_CONFIG_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_MENU_CONFIG_KEY_R createByName(T proto) {
		MAW_MENU_CONFIG_KEY_R row = MAW_MENU_CONFIG_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_MENU_CONFIG_KEY_R clone() {
		return (MAW_MENU_CONFIG_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_MENU_CONFIG_KEY_R createInstance() {
		return (MAW_MENU_CONFIG_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_MENU_CONFIG_KEY_R getValues(String... names) {
		return (MAW_MENU_CONFIG_KEY_R) super.getValues(names);
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
	 * メニューＣＤ. Menu cd..<p>
	 *
	 */
	public String menu_cd() {
		return getConstString(offset + 0, $menu_cd);
	}

	/**
	 * メニューＣＤ. Menu cd..<p>
	 *
	 */
	public void menu_cd(String value) {
		setConstString(offset + 0, $menu_cd, value);
	}

	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public MCNumber menu_no() {
		return getConstNumber(offset + 1, $menu_no);
	}

	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public void menu_no(MCNumber value) {
		setConstNumber(offset + 1, $menu_no, value);
	}
	
	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public void menu_no(int value) {
		setConstNumber(offset + 1, $menu_no, value);
	}
	
	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public void menu_no(long value) {
		setConstNumber(offset + 1, $menu_no, value);
	}
	
	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public void menu_no(float value) {
		setConstNumber(offset + 1, $menu_no, value);
	}
	
	/**
	 * メニュー配置番号. Menu placement number.<p>
	 *
	 */
	public void menu_no(double value) {
		setConstNumber(offset + 1, $menu_no, value);
	}
	
	public String getString(String name) {
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($menu_no.equalsIgnoreCase(name)) {
			return menu_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($menu_cd.equalsIgnoreCase(name)) {
			return menu_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($menu_no.equalsIgnoreCase(name)) {
			return menu_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($menu_cd.equalsIgnoreCase(name)) {
			menu_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($menu_no.equalsIgnoreCase(name)) {
			menu_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
