package mcframe.serverMB.dbc;

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
 * "自動仕訳履歴削除用テーブル // Table for deleting auto-journal history"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>data_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>jnl_grp_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳グループＮＯ</td>
 *  	<td>Journal group No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>table_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計ＩＦテーブル区分</td>
 *  	<td>Accounting IF table type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBW_JNL_HISTORYD_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MBW_JNL_HISTORYD_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCStringPermColumn data_no = createStringColumn(_data_no);
	
	/**
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public static final String $jnl_grp_no = "jnl_grp_no";
	private static final MCPermColumnInfo _jnl_grp_no = createColumnInfo("jnl_grp_no");
	public final MCStringPermColumn jnl_grp_no = createStringColumn(_jnl_grp_no);
	
	/**
	 * 会計ＩＦテーブル区分. Accounting IF table type.<p>
	 *
	 */
	public static final String $table_typ = "table_typ";
	private static final MCPermColumnInfo _table_typ = createColumnInfo("table_typ");
	public final MCStringPermColumn table_typ = createStringColumn(_table_typ);
	
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta jnl_grp_no_META = createCommonMeta($jnl_grp_no, mcframe.commonMA.meta.MA_META.JNL_GRP_NO);
	public static final MCMeta table_typ_META = createCommonMeta($table_typ, mcframe.commonMA.meta.MA_META.AC_TABLE_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MBW_JNL_HISTORYD_KEY_R> constMetas = new ConstMetaList<MBW_JNL_HISTORYD_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_no_META,
			jnl_grp_no_META,
			table_typ_META
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
	protected MBW_JNL_HISTORYD_KEY_R(ConstMetaList<? extends MBW_JNL_HISTORYD_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBW_JNL_HISTORYD_KEY_R(ConstMetaList<? extends MBW_JNL_HISTORYD_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBW_JNL_HISTORYD_KEY_R.$data_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JNL_HISTORYD_KEY_R.$data_no,
				"data_no",
				data_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JNL_HISTORYD_KEY_R.$jnl_grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JNL_HISTORYD_KEY_R.$jnl_grp_no,
				"jnl_grp_no",
				jnl_grp_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_JNL_HISTORYD_KEY_R.$table_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_JNL_HISTORYD_KEY_R.$table_typ,
				"table_typ",
				table_typ,
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
	public static MBW_JNL_HISTORYD_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBW_JNL_HISTORYD_KEY_R create(String alias) {
		MBW_JNL_HISTORYD_KEY_R row = new MBW_JNL_HISTORYD_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBW_JNL_HISTORYD_KEY_R createByName(T proto) {
		MBW_JNL_HISTORYD_KEY_R row = MBW_JNL_HISTORYD_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JNL_HISTORYD_KEY_R clone() {
		return (MBW_JNL_HISTORYD_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JNL_HISTORYD_KEY_R createInstance() {
		return (MBW_JNL_HISTORYD_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_JNL_HISTORYD_KEY_R getValues(String... names) {
		return (MBW_JNL_HISTORYD_KEY_R) super.getValues(names);
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
	 * データＮＯ. Data No..<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 0, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 0, $data_no, value);
	}

	/**
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public String jnl_grp_no() {
		return getConstString(offset + 1, $jnl_grp_no);
	}

	/**
	 * 仕訳グループＮＯ. Journal group No..<p>
	 *
	 */
	public void jnl_grp_no(String value) {
		setConstString(offset + 1, $jnl_grp_no, value);
	}

	/**
	 * 会計ＩＦテーブル区分. Accounting IF table type.<p>
	 *
	 */
	public String table_typ() {
		return getConstString(offset + 2, $table_typ);
	}

	/**
	 * 会計ＩＦテーブル区分. Accounting IF table type.<p>
	 *
	 */
	public void table_typ(String value) {
		setConstString(offset + 2, $table_typ, value);
	}

	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			return table_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			return jnl_grp_no();
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			return table_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			table_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($jnl_grp_no.equalsIgnoreCase(name)) {
			jnl_grp_no(value);
			return;
		}
		if ($table_typ.equalsIgnoreCase(name)) {
			table_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
