package mcframe.serverMS.dbc;

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
 * "納品伝票明細 // Delivery slip details"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dlv_slip_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品書明細連番</td>
 *  	<td>Delivery note details serial number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_DLV_SLIP_D_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_DLV_SLIP_D_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	private static final MCPermColumnInfo _dlv_slip_d_no = createColumnInfo("dlv_slip_d_no");
	public final MCStringPermColumn dlv_slip_d_no = createStringColumn(_dlv_slip_d_no);
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public static final String $dlv_slip_d_seq = "dlv_slip_d_seq";
	private static final MCPermColumnInfo _dlv_slip_d_seq = createColumnInfo("dlv_slip_d_seq");
	public final MCNumberPermColumn dlv_slip_d_seq = createNumberColumn(_dlv_slip_d_seq);
	
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_d_seq_META = createCommonMeta($dlv_slip_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_DLV_SLIP_D_KEY_R> constMetas = new ConstMetaList<MSW_DLV_SLIP_D_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dlv_slip_d_no_META,
			dlv_slip_d_seq_META
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
	protected MSW_DLV_SLIP_D_KEY_R(ConstMetaList<? extends MSW_DLV_SLIP_D_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_DLV_SLIP_D_KEY_R(ConstMetaList<? extends MSW_DLV_SLIP_D_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_DLV_SLIP_D_KEY_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_DLV_SLIP_D_KEY_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_DLV_SLIP_D_KEY_R.$dlv_slip_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_DLV_SLIP_D_KEY_R.$dlv_slip_d_seq,
				"dlv_slip_d_seq",
				dlv_slip_d_seq,
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
	public static MSW_DLV_SLIP_D_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_DLV_SLIP_D_KEY_R create(String alias) {
		MSW_DLV_SLIP_D_KEY_R row = new MSW_DLV_SLIP_D_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_DLV_SLIP_D_KEY_R createByName(T proto) {
		MSW_DLV_SLIP_D_KEY_R row = MSW_DLV_SLIP_D_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_DLV_SLIP_D_KEY_R clone() {
		return (MSW_DLV_SLIP_D_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_DLV_SLIP_D_KEY_R createInstance() {
		return (MSW_DLV_SLIP_D_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_DLV_SLIP_D_KEY_R getValues(String... names) {
		return (MSW_DLV_SLIP_D_KEY_R) super.getValues(names);
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
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 0, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 0, $dlv_slip_d_no, value);
	}

	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public MCNumber dlv_slip_d_seq() {
		return getConstNumber(offset + 1, $dlv_slip_d_seq);
	}

	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(int value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(long value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(float value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	/**
	 * 納品書明細連番. Delivery note details serial number.<p>
	 *
	 */
	public void dlv_slip_d_seq(double value) {
		setConstNumber(offset + 1, $dlv_slip_d_seq, value);
	}
	
	public String getString(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			return dlv_slip_d_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dlv_slip_d_seq.equalsIgnoreCase(name)) {
			dlv_slip_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
