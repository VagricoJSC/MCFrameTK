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
 * "販売分析マスタ // Sales analysis master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>sls_anly_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売分析区分</td>
 *  	<td>Sales analysis type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sls_anly_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ</td>
 *  	<td>Sales analysis cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_SLS_ANLY_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_SLS_ANLY_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 販売分析区分. Sales analysis type.<p>
	 *
	 */
	public static final String $sls_anly_typ = "sls_anly_typ";
	private static final MCPermColumnInfo _sls_anly_typ = createColumnInfo("sls_anly_typ");
	public final MCStringPermColumn sls_anly_typ = createStringColumn(_sls_anly_typ);
	
	/**
	 * 販売分析ＣＤ. Sales analysis cd..<p>
	 *
	 */
	public static final String $sls_anly_cd = "sls_anly_cd";
	private static final MCPermColumnInfo _sls_anly_cd = createColumnInfo("sls_anly_cd");
	public final MCStringPermColumn sls_anly_cd = createStringColumn(_sls_anly_cd);
	
	public static final MCMeta sls_anly_typ_META = createCommonMeta($sls_anly_typ, mcframe.commonMA.meta.MA_META.SLS_ANLY_TYP);
	public static final MCMeta sls_anly_cd_META = createCommonMeta($sls_anly_cd, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_SLS_ANLY_KEY_R> constMetas = new ConstMetaList<MAW_SLS_ANLY_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			sls_anly_typ_META,
			sls_anly_cd_META
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
	protected MAW_SLS_ANLY_KEY_R(ConstMetaList<? extends MAW_SLS_ANLY_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_SLS_ANLY_KEY_R(ConstMetaList<? extends MAW_SLS_ANLY_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_SLS_ANLY_KEY_R.$sls_anly_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_ANLY_KEY_R.$sls_anly_typ,
				"sls_anly_typ",
				sls_anly_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SLS_ANLY_KEY_R.$sls_anly_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SLS_ANLY_KEY_R.$sls_anly_cd,
				"sls_anly_cd",
				sls_anly_cd,
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
	public static MAW_SLS_ANLY_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SLS_ANLY_KEY_R create(String alias) {
		MAW_SLS_ANLY_KEY_R row = new MAW_SLS_ANLY_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_SLS_ANLY_KEY_R createByName(T proto) {
		MAW_SLS_ANLY_KEY_R row = MAW_SLS_ANLY_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_ANLY_KEY_R clone() {
		return (MAW_SLS_ANLY_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_ANLY_KEY_R createInstance() {
		return (MAW_SLS_ANLY_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SLS_ANLY_KEY_R getValues(String... names) {
		return (MAW_SLS_ANLY_KEY_R) super.getValues(names);
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
	 * 販売分析区分. Sales analysis type.<p>
	 *
	 */
	public String sls_anly_typ() {
		return getConstString(offset + 0, $sls_anly_typ);
	}

	/**
	 * 販売分析区分. Sales analysis type.<p>
	 *
	 */
	public void sls_anly_typ(String value) {
		setConstString(offset + 0, $sls_anly_typ, value);
	}

	/**
	 * 販売分析ＣＤ. Sales analysis cd..<p>
	 *
	 */
	public String sls_anly_cd() {
		return getConstString(offset + 1, $sls_anly_cd);
	}

	/**
	 * 販売分析ＣＤ. Sales analysis cd..<p>
	 *
	 */
	public void sls_anly_cd(String value) {
		setConstString(offset + 1, $sls_anly_cd, value);
	}

	public String getString(String name) {
		if ($sls_anly_typ.equalsIgnoreCase(name)) {
			return sls_anly_typ();
		}
		if ($sls_anly_cd.equalsIgnoreCase(name)) {
			return sls_anly_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($sls_anly_typ.equalsIgnoreCase(name)) {
			return sls_anly_typ();
		}
		if ($sls_anly_cd.equalsIgnoreCase(name)) {
			return sls_anly_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_anly_typ.equalsIgnoreCase(name)) {
			sls_anly_typ(value);
			return;
		}
		if ($sls_anly_cd.equalsIgnoreCase(name)) {
			sls_anly_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_anly_typ.equalsIgnoreCase(name)) {
			sls_anly_typ(value);
			return;
		}
		if ($sls_anly_cd.equalsIgnoreCase(name)) {
			sls_anly_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
