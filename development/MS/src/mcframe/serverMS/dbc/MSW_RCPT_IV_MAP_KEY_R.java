package mcframe.serverMS.dbc;

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
 * "受領インボイスマップ // Purchase invoice map"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>rcpt_iv_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイス明細ＮＯ</td>
 *  	<td>Purchase invoice details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>arr_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷予定ＮＯ</td>
 *  	<td>Receipt schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>arr_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷実績ＮＯ</td>
 *  	<td>Receipt result No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_RCPT_IV_MAP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_RCPT_IV_MAP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	private static final MCPermColumnInfo _rcpt_iv_d_no = createColumnInfo("rcpt_iv_d_no");
	public final MCStringPermColumn rcpt_iv_d_no = createStringColumn(_rcpt_iv_d_no);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	private static final MCPermColumnInfo _arr_schd_no = createColumnInfo("arr_schd_no");
	public final MCStringPermColumn arr_schd_no = createStringColumn(_arr_schd_no);
	
	/**
	 * 入荷実績ＮＯ. Receipt result No..<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	private static final MCPermColumnInfo _arr_act_no = createColumnInfo("arr_act_no");
	public final MCStringPermColumn arr_act_no = createStringColumn(_arr_act_no);
	
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_RCPT_IV_MAP_KEY_R> constMetas = new ConstMetaList<MSW_RCPT_IV_MAP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcpt_iv_d_no_META,
			rcpt_iv_no_META,
			arr_schd_no_META,
			arr_act_no_META
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
	protected MSW_RCPT_IV_MAP_KEY_R(ConstMetaList<? extends MSW_RCPT_IV_MAP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_RCPT_IV_MAP_KEY_R(ConstMetaList<? extends MSW_RCPT_IV_MAP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_RCPT_IV_MAP_KEY_R.$rcpt_iv_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCPT_IV_MAP_KEY_R.$rcpt_iv_d_no,
				"rcpt_iv_d_no",
				rcpt_iv_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCPT_IV_MAP_KEY_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCPT_IV_MAP_KEY_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCPT_IV_MAP_KEY_R.$arr_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCPT_IV_MAP_KEY_R.$arr_schd_no,
				"arr_schd_no",
				arr_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCPT_IV_MAP_KEY_R.$arr_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCPT_IV_MAP_KEY_R.$arr_act_no,
				"arr_act_no",
				arr_act_no,
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
	public static MSW_RCPT_IV_MAP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_RCPT_IV_MAP_KEY_R create(String alias) {
		MSW_RCPT_IV_MAP_KEY_R row = new MSW_RCPT_IV_MAP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_RCPT_IV_MAP_KEY_R createByName(T proto) {
		MSW_RCPT_IV_MAP_KEY_R row = MSW_RCPT_IV_MAP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCPT_IV_MAP_KEY_R clone() {
		return (MSW_RCPT_IV_MAP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCPT_IV_MAP_KEY_R createInstance() {
		return (MSW_RCPT_IV_MAP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCPT_IV_MAP_KEY_R getValues(String... names) {
		return (MSW_RCPT_IV_MAP_KEY_R) super.getValues(names);
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
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 0, $rcpt_iv_d_no);
	}

	/**
	 * 受領インボイス明細ＮＯ. Purchase invoice details No..<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 0, $rcpt_iv_d_no, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 1, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 1, $rcpt_iv_no, value);
	}

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 2, $arr_schd_no);
	}

	/**
	 * 入荷予定ＮＯ. Receipt schedule No..<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 2, $arr_schd_no, value);
	}

	/**
	 * 入荷実績ＮＯ. Receipt result No..<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 3, $arr_act_no);
	}

	/**
	 * 入荷実績ＮＯ. Receipt result No..<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 3, $arr_act_no, value);
	}

	public String getString(String name) {
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
