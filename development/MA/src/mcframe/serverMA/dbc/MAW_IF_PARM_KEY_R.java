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
 * "原価ＩＦパラメータマスタ // Cost IF parameter master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>cost_table_typ</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価テーブル区分</td>
 *  	<td>Cost table type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>tgt_col_typ</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>対象項目区分</td>
 *  	<td>Column type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_IF_PARM_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_IF_PARM_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価テーブル区分. Cost table type.<p>
	 *
	 */
	public static final String $cost_table_typ = "cost_table_typ";
	private static final MCPermColumnInfo _cost_table_typ = createColumnInfo("cost_table_typ");
	public final MCStringPermColumn cost_table_typ = createStringColumn(_cost_table_typ);
	
	/**
	 * 対象項目区分. Column type.<p>
	 *
	 */
	public static final String $tgt_col_typ = "tgt_col_typ";
	private static final MCPermColumnInfo _tgt_col_typ = createColumnInfo("tgt_col_typ");
	public final MCStringPermColumn tgt_col_typ = createStringColumn(_tgt_col_typ);
	
	public static final MCMeta cost_table_typ_META = createCommonMeta($cost_table_typ, mcframe.commonMA.meta.MA_META.COST_TABLE_TYP);
	public static final MCMeta tgt_col_typ_META = createCommonMeta($tgt_col_typ, mcframe.commonMA.meta.MA_META.TGT_COL_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_IF_PARM_KEY_R> constMetas = new ConstMetaList<MAW_IF_PARM_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cost_table_typ_META,
			tgt_col_typ_META
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
	protected MAW_IF_PARM_KEY_R(ConstMetaList<? extends MAW_IF_PARM_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_IF_PARM_KEY_R(ConstMetaList<? extends MAW_IF_PARM_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_IF_PARM_KEY_R.$cost_table_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_PARM_KEY_R.$cost_table_typ,
				"cost_table_typ",
				cost_table_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_IF_PARM_KEY_R.$tgt_col_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_PARM_KEY_R.$tgt_col_typ,
				"tgt_col_typ",
				tgt_col_typ,
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
	public static MAW_IF_PARM_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_IF_PARM_KEY_R create(String alias) {
		MAW_IF_PARM_KEY_R row = new MAW_IF_PARM_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_IF_PARM_KEY_R createByName(T proto) {
		MAW_IF_PARM_KEY_R row = MAW_IF_PARM_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_PARM_KEY_R clone() {
		return (MAW_IF_PARM_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_PARM_KEY_R createInstance() {
		return (MAW_IF_PARM_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_PARM_KEY_R getValues(String... names) {
		return (MAW_IF_PARM_KEY_R) super.getValues(names);
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
	 * 原価テーブル区分. Cost table type.<p>
	 *
	 */
	public String cost_table_typ() {
		return getConstString(offset + 0, $cost_table_typ);
	}

	/**
	 * 原価テーブル区分. Cost table type.<p>
	 *
	 */
	public void cost_table_typ(String value) {
		setConstString(offset + 0, $cost_table_typ, value);
	}

	/**
	 * 対象項目区分. Column type.<p>
	 *
	 */
	public String tgt_col_typ() {
		return getConstString(offset + 1, $tgt_col_typ);
	}

	/**
	 * 対象項目区分. Column type.<p>
	 *
	 */
	public void tgt_col_typ(String value) {
		setConstString(offset + 1, $tgt_col_typ, value);
	}

	public String getString(String name) {
		if ($cost_table_typ.equalsIgnoreCase(name)) {
			return cost_table_typ();
		}
		if ($tgt_col_typ.equalsIgnoreCase(name)) {
			return tgt_col_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($cost_table_typ.equalsIgnoreCase(name)) {
			return cost_table_typ();
		}
		if ($tgt_col_typ.equalsIgnoreCase(name)) {
			return tgt_col_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($cost_table_typ.equalsIgnoreCase(name)) {
			cost_table_typ(value);
			return;
		}
		if ($tgt_col_typ.equalsIgnoreCase(name)) {
			tgt_col_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cost_table_typ.equalsIgnoreCase(name)) {
			cost_table_typ(value);
			return;
		}
		if ($tgt_col_typ.equalsIgnoreCase(name)) {
			tgt_col_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
