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
 * "原価レポート比較構成マスタ // Cost report comparison structure master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>cmp_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>比較パタンＣＤ</td>
 *  	<td>Comparison pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>col_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>項目ＣＤ</td>
 *  	<td>Column cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_RPT_CMP_CONF_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_RPT_CMP_CONF_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 比較パタンＣＤ. Comparison pattern cd..<p>
	 *
	 */
	public static final String $cmp_ptn_cd = "cmp_ptn_cd";
	private static final MCPermColumnInfo _cmp_ptn_cd = createColumnInfo("cmp_ptn_cd");
	public final MCStringPermColumn cmp_ptn_cd = createStringColumn(_cmp_ptn_cd);
	
	/**
	 * 項目ＣＤ. Column cd..<p>
	 *
	 */
	public static final String $col_cd = "col_cd";
	private static final MCPermColumnInfo _col_cd = createColumnInfo("col_cd");
	public final MCStringPermColumn col_cd = createStringColumn(_col_cd);
	
	public static final MCMeta cmp_ptn_cd_META = createCommonMeta($cmp_ptn_cd, mcframe.commonMA.meta.MA_META.CMP_PTN_CD);
	public static final MCMeta col_cd_META = createCommonMeta($col_cd, mcframe.commonMA.meta.MA_META.COL_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_RPT_CMP_CONF_KEY_R> constMetas = new ConstMetaList<MAW_RPT_CMP_CONF_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cmp_ptn_cd_META,
			col_cd_META
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
	protected MAW_RPT_CMP_CONF_KEY_R(ConstMetaList<? extends MAW_RPT_CMP_CONF_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_RPT_CMP_CONF_KEY_R(ConstMetaList<? extends MAW_RPT_CMP_CONF_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_RPT_CMP_CONF_KEY_R.$cmp_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_RPT_CMP_CONF_KEY_R.$cmp_ptn_cd,
				"cmp_ptn_cd",
				cmp_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_RPT_CMP_CONF_KEY_R.$col_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_RPT_CMP_CONF_KEY_R.$col_cd,
				"col_cd",
				col_cd,
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
	public static MAW_RPT_CMP_CONF_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_RPT_CMP_CONF_KEY_R create(String alias) {
		MAW_RPT_CMP_CONF_KEY_R row = new MAW_RPT_CMP_CONF_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_RPT_CMP_CONF_KEY_R createByName(T proto) {
		MAW_RPT_CMP_CONF_KEY_R row = MAW_RPT_CMP_CONF_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_RPT_CMP_CONF_KEY_R clone() {
		return (MAW_RPT_CMP_CONF_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_RPT_CMP_CONF_KEY_R createInstance() {
		return (MAW_RPT_CMP_CONF_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_RPT_CMP_CONF_KEY_R getValues(String... names) {
		return (MAW_RPT_CMP_CONF_KEY_R) super.getValues(names);
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
	 * 比較パタンＣＤ. Comparison pattern cd..<p>
	 *
	 */
	public String cmp_ptn_cd() {
		return getConstString(offset + 0, $cmp_ptn_cd);
	}

	/**
	 * 比較パタンＣＤ. Comparison pattern cd..<p>
	 *
	 */
	public void cmp_ptn_cd(String value) {
		setConstString(offset + 0, $cmp_ptn_cd, value);
	}

	/**
	 * 項目ＣＤ. Column cd..<p>
	 *
	 */
	public String col_cd() {
		return getConstString(offset + 1, $col_cd);
	}

	/**
	 * 項目ＣＤ. Column cd..<p>
	 *
	 */
	public void col_cd(String value) {
		setConstString(offset + 1, $col_cd, value);
	}

	public String getString(String name) {
		if ($cmp_ptn_cd.equalsIgnoreCase(name)) {
			return cmp_ptn_cd();
		}
		if ($col_cd.equalsIgnoreCase(name)) {
			return col_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cmp_ptn_cd.equalsIgnoreCase(name)) {
			return cmp_ptn_cd();
		}
		if ($col_cd.equalsIgnoreCase(name)) {
			return col_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cmp_ptn_cd.equalsIgnoreCase(name)) {
			cmp_ptn_cd(value);
			return;
		}
		if ($col_cd.equalsIgnoreCase(name)) {
			col_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cmp_ptn_cd.equalsIgnoreCase(name)) {
			cmp_ptn_cd(value);
			return;
		}
		if ($col_cd.equalsIgnoreCase(name)) {
			col_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
