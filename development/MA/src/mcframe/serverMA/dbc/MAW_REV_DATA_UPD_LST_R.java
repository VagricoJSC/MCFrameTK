package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

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
 * "改訂履歴データ更新リスト // Revision history data update list"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>rev_data_src_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改訂履歴データ作成元ＮＯ</td>
 *  	<td>Revision history data source No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rev_no</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改訂番号</td>
 *  	<td>Rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rev_data_typ</td>
 *  	<td>C</td>
 *  	<td>6</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改訂履歴データ区分</td>
 *  	<td>Revision history data type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_REV_DATA_UPD_LST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_REV_DATA_UPD_LST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 改訂履歴データ作成元ＮＯ. Revision history data source No..<p>
	 *
	 */
	public static final String $rev_data_src_no = "rev_data_src_no";
	private static final MCPermColumnInfo _rev_data_src_no = createColumnInfo("rev_data_src_no");
	public final MCStringPermColumn rev_data_src_no = createStringColumn(_rev_data_src_no);
	
	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public static final String $rev_no = "rev_no";
	private static final MCPermColumnInfo _rev_no = createColumnInfo("rev_no");
	public final MCNumberPermColumn rev_no = createNumberColumn(_rev_no);
	
	/**
	 * 改訂履歴データ区分. Revision history data type.<p>
	 *
	 */
	public static final String $rev_data_typ = "rev_data_typ";
	private static final MCPermColumnInfo _rev_data_typ = createColumnInfo("rev_data_typ");
	public final MCStringPermColumn rev_data_typ = createStringColumn(_rev_data_typ);
	
	public static final MCMeta rev_data_src_no_META = createCommonMeta($rev_data_src_no, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta rev_no_META = createCommonMeta($rev_no, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rev_data_typ_META = createCommonMeta($rev_data_typ, mcframe.commonMA.meta.MA_META.REV_DATA_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAW_REV_DATA_UPD_LST_R> constMetas = new ConstMetaList<MAW_REV_DATA_UPD_LST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rev_data_src_no_META,
			rev_no_META,
			rev_data_typ_META
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
	protected MAW_REV_DATA_UPD_LST_R(ConstMetaList<? extends MAW_REV_DATA_UPD_LST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_REV_DATA_UPD_LST_R(ConstMetaList<? extends MAW_REV_DATA_UPD_LST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_REV_DATA_UPD_LST_R.$rev_data_src_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_REV_DATA_UPD_LST_R.$rev_data_src_no,
				"rev_data_src_no",
				rev_data_src_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_REV_DATA_UPD_LST_R.$rev_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_REV_DATA_UPD_LST_R.$rev_no,
				"rev_no",
				rev_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_REV_DATA_UPD_LST_R.$rev_data_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_REV_DATA_UPD_LST_R.$rev_data_typ,
				"rev_data_typ",
				rev_data_typ,
				false,
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
	public static MAW_REV_DATA_UPD_LST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_REV_DATA_UPD_LST_R create(String alias) {
		MAW_REV_DATA_UPD_LST_R row = new MAW_REV_DATA_UPD_LST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_REV_DATA_UPD_LST_R createByName(T proto) {
		MAW_REV_DATA_UPD_LST_R row = MAW_REV_DATA_UPD_LST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REV_DATA_UPD_LST_R clone() {
		return (MAW_REV_DATA_UPD_LST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REV_DATA_UPD_LST_R createInstance() {
		return (MAW_REV_DATA_UPD_LST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_REV_DATA_UPD_LST_R getValues(String... names) {
		return (MAW_REV_DATA_UPD_LST_R) super.getValues(names);
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
	 * 改訂履歴データ作成元ＮＯ. Revision history data source No..<p>
	 *
	 */
	public String rev_data_src_no() {
		return getConstString(offset + 0, $rev_data_src_no);
	}

	/**
	 * 改訂履歴データ作成元ＮＯ. Revision history data source No..<p>
	 *
	 */
	public void rev_data_src_no(String value) {
		setConstString(offset + 0, $rev_data_src_no, value);
	}

	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public MCNumber rev_no() {
		return getConstNumber(offset + 1, $rev_no);
	}

	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public void rev_no(MCNumber value) {
		setConstNumber(offset + 1, $rev_no, value);
	}
	
	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public void rev_no(int value) {
		setConstNumber(offset + 1, $rev_no, value);
	}
	
	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public void rev_no(long value) {
		setConstNumber(offset + 1, $rev_no, value);
	}
	
	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public void rev_no(float value) {
		setConstNumber(offset + 1, $rev_no, value);
	}
	
	/**
	 * 改訂番号. Rev. number.<p>
	 *
	 */
	public void rev_no(double value) {
		setConstNumber(offset + 1, $rev_no, value);
	}
	
	/**
	 * 改訂履歴データ区分. Revision history data type.<p>
	 *
	 */
	public String rev_data_typ() {
		return getConstString(offset + 2, $rev_data_typ);
	}

	/**
	 * 改訂履歴データ区分. Revision history data type.<p>
	 *
	 */
	public void rev_data_typ(String value) {
		setConstString(offset + 2, $rev_data_typ, value);
	}

	public String getString(String name) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			return rev_data_src_no();
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			return rev_data_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($rev_no.equalsIgnoreCase(name)) {
			return rev_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			return rev_data_src_no();
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			return rev_data_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($rev_no.equalsIgnoreCase(name)) {
			return rev_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			rev_data_src_no(value);
			return;
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			rev_data_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rev_data_src_no.equalsIgnoreCase(name)) {
			rev_data_src_no(value);
			return;
		}
		if ($rev_data_typ.equalsIgnoreCase(name)) {
			rev_data_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rev_no.equalsIgnoreCase(name)) {
			rev_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
