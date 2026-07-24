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
 * "売上実績受払 // Sales result GR/GI"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>sls_act_io_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上実績受払ＮＯ</td>
 *  	<td>Sales result GR/GI No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sls_act_io_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上実績受払連番</td>
 *  	<td>Sales result GR/GI sequence number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SLS_ACT_IO_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SLS_ACT_IO_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 売上実績受払ＮＯ. Sales result GR/GI No..<p>
	 *
	 */
	public static final String $sls_act_io_no = "sls_act_io_no";
	private static final MCPermColumnInfo _sls_act_io_no = createColumnInfo("sls_act_io_no");
	public final MCStringPermColumn sls_act_io_no = createStringColumn(_sls_act_io_no);
	
	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public static final String $sls_act_io_seq = "sls_act_io_seq";
	private static final MCPermColumnInfo _sls_act_io_seq = createColumnInfo("sls_act_io_seq");
	public final MCNumberPermColumn sls_act_io_seq = createNumberColumn(_sls_act_io_seq);
	
	public static final MCMeta sls_act_io_no_META = createCommonMeta($sls_act_io_no, mcframe.commonMA.meta.MA_META.SLS_ACT_IO_NO);
	public static final MCMeta sls_act_io_seq_META = createCommonMeta($sls_act_io_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_SLS_ACT_IO_KEY_R> constMetas = new ConstMetaList<MSW_SLS_ACT_IO_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			sls_act_io_no_META,
			sls_act_io_seq_META
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
	protected MSW_SLS_ACT_IO_KEY_R(ConstMetaList<? extends MSW_SLS_ACT_IO_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SLS_ACT_IO_KEY_R(ConstMetaList<? extends MSW_SLS_ACT_IO_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SLS_ACT_IO_KEY_R.$sls_act_io_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_ACT_IO_KEY_R.$sls_act_io_no,
				"sls_act_io_no",
				sls_act_io_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_ACT_IO_KEY_R.$sls_act_io_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLS_ACT_IO_KEY_R.$sls_act_io_seq,
				"sls_act_io_seq",
				sls_act_io_seq,
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
	public static MSW_SLS_ACT_IO_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SLS_ACT_IO_KEY_R create(String alias) {
		MSW_SLS_ACT_IO_KEY_R row = new MSW_SLS_ACT_IO_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SLS_ACT_IO_KEY_R createByName(T proto) {
		MSW_SLS_ACT_IO_KEY_R row = MSW_SLS_ACT_IO_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_ACT_IO_KEY_R clone() {
		return (MSW_SLS_ACT_IO_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_ACT_IO_KEY_R createInstance() {
		return (MSW_SLS_ACT_IO_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_ACT_IO_KEY_R getValues(String... names) {
		return (MSW_SLS_ACT_IO_KEY_R) super.getValues(names);
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
	 * 売上実績受払ＮＯ. Sales result GR/GI No..<p>
	 *
	 */
	public String sls_act_io_no() {
		return getConstString(offset + 0, $sls_act_io_no);
	}

	/**
	 * 売上実績受払ＮＯ. Sales result GR/GI No..<p>
	 *
	 */
	public void sls_act_io_no(String value) {
		setConstString(offset + 0, $sls_act_io_no, value);
	}

	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public MCNumber sls_act_io_seq() {
		return getConstNumber(offset + 1, $sls_act_io_seq);
	}

	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public void sls_act_io_seq(MCNumber value) {
		setConstNumber(offset + 1, $sls_act_io_seq, value);
	}
	
	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public void sls_act_io_seq(int value) {
		setConstNumber(offset + 1, $sls_act_io_seq, value);
	}
	
	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public void sls_act_io_seq(long value) {
		setConstNumber(offset + 1, $sls_act_io_seq, value);
	}
	
	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public void sls_act_io_seq(float value) {
		setConstNumber(offset + 1, $sls_act_io_seq, value);
	}
	
	/**
	 * 売上実績受払連番. Sales result GR/GI sequence number.<p>
	 *
	 */
	public void sls_act_io_seq(double value) {
		setConstNumber(offset + 1, $sls_act_io_seq, value);
	}
	
	public String getString(String name) {
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			return sls_act_io_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			return sls_act_io_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_act_io_no.equalsIgnoreCase(name)) {
			sls_act_io_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($sls_act_io_seq.equalsIgnoreCase(name)) {
			sls_act_io_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
