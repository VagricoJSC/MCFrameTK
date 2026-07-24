package mcframe.serverMS.dbc;

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
 * "案件管理 // Sales project management"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>wrk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件管理区分</td>
 *  	<td>Sales project management type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wrk_mng_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件管理ＣＤ</td>
 *  	<td>Sales project management cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_WRK_MNG_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_WRK_MNG_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public static final String $wrk_mng_typ = "wrk_mng_typ";
	private static final MCPermColumnInfo _wrk_mng_typ = createColumnInfo("wrk_mng_typ");
	public final MCStringPermColumn wrk_mng_typ = createStringColumn(_wrk_mng_typ);
	
	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public static final String $wrk_mng_cd = "wrk_mng_cd";
	private static final MCPermColumnInfo _wrk_mng_cd = createColumnInfo("wrk_mng_cd");
	public final MCStringPermColumn wrk_mng_cd = createStringColumn(_wrk_mng_cd);
	
	public static final MCMeta wrk_mng_typ_META = createCommonMeta($wrk_mng_typ, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP);
	public static final MCMeta wrk_mng_cd_META = createCommonMeta($wrk_mng_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_WRK_MNG_KEY_R> constMetas = new ConstMetaList<MSW_WRK_MNG_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wrk_mng_typ_META,
			wrk_mng_cd_META
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
	protected MSW_WRK_MNG_KEY_R(ConstMetaList<? extends MSW_WRK_MNG_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_WRK_MNG_KEY_R(ConstMetaList<? extends MSW_WRK_MNG_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_WRK_MNG_KEY_R.$wrk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_WRK_MNG_KEY_R.$wrk_mng_typ,
				"wrk_mng_typ",
				wrk_mng_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_WRK_MNG_KEY_R.$wrk_mng_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_WRK_MNG_KEY_R.$wrk_mng_cd,
				"wrk_mng_cd",
				wrk_mng_cd,
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
	public static MSW_WRK_MNG_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_WRK_MNG_KEY_R create(String alias) {
		MSW_WRK_MNG_KEY_R row = new MSW_WRK_MNG_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_WRK_MNG_KEY_R createByName(T proto) {
		MSW_WRK_MNG_KEY_R row = MSW_WRK_MNG_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_WRK_MNG_KEY_R clone() {
		return (MSW_WRK_MNG_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_WRK_MNG_KEY_R createInstance() {
		return (MSW_WRK_MNG_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_WRK_MNG_KEY_R getValues(String... names) {
		return (MSW_WRK_MNG_KEY_R) super.getValues(names);
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
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public String wrk_mng_typ() {
		return getConstString(offset + 0, $wrk_mng_typ);
	}

	/**
	 * 案件管理区分. Sales project management type.<p>
	 *
	 */
	public void wrk_mng_typ(String value) {
		setConstString(offset + 0, $wrk_mng_typ, value);
	}

	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public String wrk_mng_cd() {
		return getConstString(offset + 1, $wrk_mng_cd);
	}

	/**
	 * 案件管理ＣＤ. Sales project management cd..<p>
	 *
	 */
	public void wrk_mng_cd(String value) {
		setConstString(offset + 1, $wrk_mng_cd, value);
	}

	public String getString(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
