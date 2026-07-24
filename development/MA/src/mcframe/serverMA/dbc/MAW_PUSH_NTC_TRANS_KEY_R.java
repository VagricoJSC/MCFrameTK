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
 * "プッシュ通知遷移情報明細 // Push notification transition info. details"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>push_ntc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>プッシュ通知ＮＯ</td>
 *  	<td>Push notifications No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>column_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>カラム順序</td>
 *  	<td>Column sequence</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_PUSH_NTC_TRANS_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_PUSH_NTC_TRANS_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public static final String $push_ntc_no = "push_ntc_no";
	private static final MCPermColumnInfo _push_ntc_no = createColumnInfo("push_ntc_no");
	public final MCStringPermColumn push_ntc_no = createStringColumn(_push_ntc_no);
	
	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public static final String $column_seq = "column_seq";
	private static final MCPermColumnInfo _column_seq = createColumnInfo("column_seq");
	public final MCNumberPermColumn column_seq = createNumberColumn(_column_seq);
	
	public static final MCMeta push_ntc_no_META = createCommonMeta($push_ntc_no, mcframe.commonMA.meta.MA_META.PUSH_NTC_NO);
	public static final MCMeta column_seq_META = createCommonMeta($column_seq, mcframe.commonMA.meta.MA_META.INT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_PUSH_NTC_TRANS_KEY_R> constMetas = new ConstMetaList<MAW_PUSH_NTC_TRANS_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			push_ntc_no_META,
			column_seq_META
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
	protected MAW_PUSH_NTC_TRANS_KEY_R(ConstMetaList<? extends MAW_PUSH_NTC_TRANS_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_PUSH_NTC_TRANS_KEY_R(ConstMetaList<? extends MAW_PUSH_NTC_TRANS_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_PUSH_NTC_TRANS_KEY_R.$push_ntc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_TRANS_KEY_R.$push_ntc_no,
				"push_ntc_no",
				push_ntc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_TRANS_KEY_R.$column_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_PUSH_NTC_TRANS_KEY_R.$column_seq,
				"column_seq",
				column_seq,
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
	public static MAW_PUSH_NTC_TRANS_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_PUSH_NTC_TRANS_KEY_R create(String alias) {
		MAW_PUSH_NTC_TRANS_KEY_R row = new MAW_PUSH_NTC_TRANS_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_PUSH_NTC_TRANS_KEY_R createByName(T proto) {
		MAW_PUSH_NTC_TRANS_KEY_R row = MAW_PUSH_NTC_TRANS_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_TRANS_KEY_R clone() {
		return (MAW_PUSH_NTC_TRANS_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_TRANS_KEY_R createInstance() {
		return (MAW_PUSH_NTC_TRANS_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_TRANS_KEY_R getValues(String... names) {
		return (MAW_PUSH_NTC_TRANS_KEY_R) super.getValues(names);
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
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public String push_ntc_no() {
		return getConstString(offset + 0, $push_ntc_no);
	}

	/**
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public void push_ntc_no(String value) {
		setConstString(offset + 0, $push_ntc_no, value);
	}

	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public MCNumber column_seq() {
		return getConstNumber(offset + 1, $column_seq);
	}

	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public void column_seq(MCNumber value) {
		setConstNumber(offset + 1, $column_seq, value);
	}
	
	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public void column_seq(int value) {
		setConstNumber(offset + 1, $column_seq, value);
	}
	
	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public void column_seq(long value) {
		setConstNumber(offset + 1, $column_seq, value);
	}
	
	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public void column_seq(float value) {
		setConstNumber(offset + 1, $column_seq, value);
	}
	
	/**
	 * カラム順序. Column sequence.<p>
	 *
	 */
	public void column_seq(double value) {
		setConstNumber(offset + 1, $column_seq, value);
	}
	
	public String getString(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($column_seq.equalsIgnoreCase(name)) {
			return column_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($column_seq.equalsIgnoreCase(name)) {
			return column_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($column_seq.equalsIgnoreCase(name)) {
			column_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
