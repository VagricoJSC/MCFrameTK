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
 * "原価売上分類マスタ // Cost sales classification master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>cost_sls_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上分類区分</td>
 *  	<td>Sales classification type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>cost_sls_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上分類ＣＤ</td>
 *  	<td>Sales classification cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_COST_SLS_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_COST_SLS_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 売上分類区分. Sales classification type.<p>
	 *
	 */
	public static final String $cost_sls_typ = "cost_sls_typ";
	private static final MCPermColumnInfo _cost_sls_typ = createColumnInfo("cost_sls_typ");
	public final MCStringPermColumn cost_sls_typ = createStringColumn(_cost_sls_typ);
	
	/**
	 * 売上分類ＣＤ. Sales classification cd..<p>
	 *
	 */
	public static final String $cost_sls_cd = "cost_sls_cd";
	private static final MCPermColumnInfo _cost_sls_cd = createColumnInfo("cost_sls_cd");
	public final MCStringPermColumn cost_sls_cd = createStringColumn(_cost_sls_cd);
	
	public static final MCMeta cost_sls_typ_META = createCommonMeta($cost_sls_typ, mcframe.commonMA.meta.MA_META.COST_SLS_TYP);
	public static final MCMeta cost_sls_cd_META = createCommonMeta($cost_sls_cd, mcframe.commonMA.meta.MA_META.COST_SLS_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_COST_SLS_KEY_R> constMetas = new ConstMetaList<MAW_COST_SLS_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cost_sls_typ_META,
			cost_sls_cd_META
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
	protected MAW_COST_SLS_KEY_R(ConstMetaList<? extends MAW_COST_SLS_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_COST_SLS_KEY_R(ConstMetaList<? extends MAW_COST_SLS_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_COST_SLS_KEY_R.$cost_sls_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COST_SLS_KEY_R.$cost_sls_typ,
				"cost_sls_typ",
				cost_sls_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COST_SLS_KEY_R.$cost_sls_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COST_SLS_KEY_R.$cost_sls_cd,
				"cost_sls_cd",
				cost_sls_cd,
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
	public static MAW_COST_SLS_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_COST_SLS_KEY_R create(String alias) {
		MAW_COST_SLS_KEY_R row = new MAW_COST_SLS_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_COST_SLS_KEY_R createByName(T proto) {
		MAW_COST_SLS_KEY_R row = MAW_COST_SLS_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_SLS_KEY_R clone() {
		return (MAW_COST_SLS_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_SLS_KEY_R createInstance() {
		return (MAW_COST_SLS_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_SLS_KEY_R getValues(String... names) {
		return (MAW_COST_SLS_KEY_R) super.getValues(names);
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
	 * 売上分類区分. Sales classification type.<p>
	 *
	 */
	public String cost_sls_typ() {
		return getConstString(offset + 0, $cost_sls_typ);
	}

	/**
	 * 売上分類区分. Sales classification type.<p>
	 *
	 */
	public void cost_sls_typ(String value) {
		setConstString(offset + 0, $cost_sls_typ, value);
	}

	/**
	 * 売上分類ＣＤ. Sales classification cd..<p>
	 *
	 */
	public String cost_sls_cd() {
		return getConstString(offset + 1, $cost_sls_cd);
	}

	/**
	 * 売上分類ＣＤ. Sales classification cd..<p>
	 *
	 */
	public void cost_sls_cd(String value) {
		setConstString(offset + 1, $cost_sls_cd, value);
	}

	public String getString(String name) {
		if ($cost_sls_typ.equalsIgnoreCase(name)) {
			return cost_sls_typ();
		}
		if ($cost_sls_cd.equalsIgnoreCase(name)) {
			return cost_sls_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cost_sls_typ.equalsIgnoreCase(name)) {
			return cost_sls_typ();
		}
		if ($cost_sls_cd.equalsIgnoreCase(name)) {
			return cost_sls_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cost_sls_typ.equalsIgnoreCase(name)) {
			cost_sls_typ(value);
			return;
		}
		if ($cost_sls_cd.equalsIgnoreCase(name)) {
			cost_sls_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cost_sls_typ.equalsIgnoreCase(name)) {
			cost_sls_typ(value);
			return;
		}
		if ($cost_sls_cd.equalsIgnoreCase(name)) {
			cost_sls_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
