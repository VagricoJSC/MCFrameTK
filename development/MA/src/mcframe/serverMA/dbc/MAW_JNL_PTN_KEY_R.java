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
 * "自動仕訳パタンマスタ // Auto-journal pattern master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>jnl_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕訳パタンＣＤ</td>
 *  	<td>Journal pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>jnl_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>連番</td>
 *  	<td>Sequence number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_JNL_PTN_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_JNL_PTN_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public static final String $jnl_ptn_cd = "jnl_ptn_cd";
	private static final MCPermColumnInfo _jnl_ptn_cd = createColumnInfo("jnl_ptn_cd");
	public final MCStringPermColumn jnl_ptn_cd = createStringColumn(_jnl_ptn_cd);
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public static final String $jnl_seq = "jnl_seq";
	private static final MCPermColumnInfo _jnl_seq = createColumnInfo("jnl_seq");
	public final MCNumberPermColumn jnl_seq = createNumberColumn(_jnl_seq);
	
	public static final MCMeta jnl_ptn_cd_META = createCommonMeta($jnl_ptn_cd, mcframe.commonMA.meta.MA_META.JNL_PTN_CD);
	public static final MCMeta jnl_seq_META = createCommonMeta($jnl_seq, mcframe.commonMA.meta.MA_META.INT4);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_JNL_PTN_KEY_R> constMetas = new ConstMetaList<MAW_JNL_PTN_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			jnl_ptn_cd_META,
			jnl_seq_META
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
	protected MAW_JNL_PTN_KEY_R(ConstMetaList<? extends MAW_JNL_PTN_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_JNL_PTN_KEY_R(ConstMetaList<? extends MAW_JNL_PTN_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_JNL_PTN_KEY_R.$jnl_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_JNL_PTN_KEY_R.$jnl_ptn_cd,
				"jnl_ptn_cd",
				jnl_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_JNL_PTN_KEY_R.$jnl_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_JNL_PTN_KEY_R.$jnl_seq,
				"jnl_seq",
				jnl_seq,
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
	public static MAW_JNL_PTN_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_JNL_PTN_KEY_R create(String alias) {
		MAW_JNL_PTN_KEY_R row = new MAW_JNL_PTN_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_JNL_PTN_KEY_R createByName(T proto) {
		MAW_JNL_PTN_KEY_R row = MAW_JNL_PTN_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_PTN_KEY_R clone() {
		return (MAW_JNL_PTN_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_PTN_KEY_R createInstance() {
		return (MAW_JNL_PTN_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_JNL_PTN_KEY_R getValues(String... names) {
		return (MAW_JNL_PTN_KEY_R) super.getValues(names);
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
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public String jnl_ptn_cd() {
		return getConstString(offset + 0, $jnl_ptn_cd);
	}

	/**
	 * 仕訳パタンＣＤ. Journal pattern cd..<p>
	 *
	 */
	public void jnl_ptn_cd(String value) {
		setConstString(offset + 0, $jnl_ptn_cd, value);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public MCNumber jnl_seq() {
		return getConstNumber(offset + 1, $jnl_seq);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(MCNumber value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(int value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(long value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(float value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void jnl_seq(double value) {
		setConstNumber(offset + 1, $jnl_seq, value);
	}
	
	public String getString(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			return jnl_ptn_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			return jnl_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($jnl_ptn_cd.equalsIgnoreCase(name)) {
			jnl_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($jnl_seq.equalsIgnoreCase(name)) {
			jnl_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
