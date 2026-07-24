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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "仕訳キー対応マスタ // Journal key mapping master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>cost_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価ＦＬＧ</td>
 *  	<td>Cost flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>jnl_key_col_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳キー項目区分</td>
 *  	<td>Journal key column type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_JNL_KEY_MAP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_JNL_KEY_MAP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 原価ＦＬＧ. Cost flg..<p>
	 *
	 */
	public static final String $cost_flg = "cost_flg";
	private static final MCPermColumnInfo _cost_flg = createColumnInfo("cost_flg");
	public final MCBooleanPermColumn cost_flg = createBooleanColumn(_cost_flg);
	
	/**
	 * 仕訳キー項目区分. Journal key column type.<p>
	 *
	 */
	public static final String $jnl_key_col_typ = "jnl_key_col_typ";
	private static final MCPermColumnInfo _jnl_key_col_typ = createColumnInfo("jnl_key_col_typ");
	public final MCStringPermColumn jnl_key_col_typ = createStringColumn(_jnl_key_col_typ);
	
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta cost_flg_META = createCommonMeta($cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jnl_key_col_typ_META = createCommonMeta($jnl_key_col_typ, mcframe.commonMA.meta.MA_META.JNL_KEY_COL_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_JNL_KEY_MAP_KEY_R> constMetas = new ConstMetaList<MAW_JNL_KEY_MAP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ac_slip_typ_META,
			cost_flg_META,
			jnl_key_col_typ_META
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
	protected MAW_JNL_KEY_MAP_KEY_R(ConstMetaList<? extends MAW_JNL_KEY_MAP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_JNL_KEY_MAP_KEY_R(ConstMetaList<? extends MAW_JNL_KEY_MAP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_JNL_KEY_MAP_KEY_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_JNL_KEY_MAP_KEY_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_JNL_KEY_MAP_KEY_R.$cost_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_JNL_KEY_MAP_KEY_R.$cost_flg,
				"cost_flg",
				cost_flg,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_JNL_KEY_MAP_KEY_R.$jnl_key_col_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_JNL_KEY_MAP_KEY_R.$jnl_key_col_typ,
				"jnl_key_col_typ",
				jnl_key_col_typ,
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
	public static MAW_JNL_KEY_MAP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_JNL_KEY_MAP_KEY_R create(String alias) {
		MAW_JNL_KEY_MAP_KEY_R row = new MAW_JNL_KEY_MAP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_JNL_KEY_MAP_KEY_R createByName(T proto) {
		MAW_JNL_KEY_MAP_KEY_R row = MAW_JNL_KEY_MAP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_KEY_MAP_KEY_R clone() {
		return (MAW_JNL_KEY_MAP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_KEY_MAP_KEY_R createInstance() {
		return (MAW_JNL_KEY_MAP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_KEY_MAP_KEY_R getValues(String... names) {
		return (MAW_JNL_KEY_MAP_KEY_R) super.getValues(names);
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
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 0, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 0, $ac_slip_typ, value);
	}

	/**
	 * 原価ＦＬＧ. Cost flg..<p>
	 *
	 */
	public boolean cost_flg() {
		return getConstBoolean(offset + 1, $cost_flg);
	}

	/**
	 * 原価ＦＬＧ. Cost flg..<p>
	 *
	 */
	public void cost_flg(boolean value) {
		setConstBoolean(offset + 1, $cost_flg, value);
	}

	/**
	 * 仕訳キー項目区分. Journal key column type.<p>
	 *
	 */
	public String jnl_key_col_typ() {
		return getConstString(offset + 2, $jnl_key_col_typ);
	}

	/**
	 * 仕訳キー項目区分. Journal key column type.<p>
	 *
	 */
	public void jnl_key_col_typ(String value) {
		setConstString(offset + 2, $jnl_key_col_typ, value);
	}

	public String getString(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($jnl_key_col_typ.equalsIgnoreCase(name)) {
			return jnl_key_col_typ();
		}
		return super.getString(name);
	}

	public boolean getBoolean(String name) {
		if ($cost_flg.equalsIgnoreCase(name)) {
			return cost_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($jnl_key_col_typ.equalsIgnoreCase(name)) {
			return jnl_key_col_typ();
		}
		return super.getStringNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($cost_flg.equalsIgnoreCase(name)) {
			return cost_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($jnl_key_col_typ.equalsIgnoreCase(name)) {
			jnl_key_col_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($cost_flg.equalsIgnoreCase(name)) {
			cost_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($jnl_key_col_typ.equalsIgnoreCase(name)) {
			jnl_key_col_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($cost_flg.equalsIgnoreCase(name)) {
			cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
