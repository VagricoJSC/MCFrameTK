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
 * "在庫振替実績明細 // Inventory transfer result details"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>stk_xfr_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫振替実績明細ＮＯ</td>
 *  	<td>Inventory transfer result details No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_STK_XFR_ACT_D_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_STK_XFR_ACT_D_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 在庫振替実績明細ＮＯ. Inventory transfer result details No..<p>
	 *
	 */
	public static final String $stk_xfr_act_d_no = "stk_xfr_act_d_no";
	private static final MCPermColumnInfo _stk_xfr_act_d_no = createColumnInfo("stk_xfr_act_d_no");
	public final MCStringPermColumn stk_xfr_act_d_no = createStringColumn(_stk_xfr_act_d_no);
	
	public static final MCMeta stk_xfr_act_d_no_META = createCommonMeta($stk_xfr_act_d_no, mcframe.commonMA.meta.MA_META.STK_XFR_ACT_D_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_STK_XFR_ACT_D_KEY_R> constMetas = new ConstMetaList<MSW_STK_XFR_ACT_D_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			stk_xfr_act_d_no_META
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
	protected MSW_STK_XFR_ACT_D_KEY_R(ConstMetaList<? extends MSW_STK_XFR_ACT_D_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_STK_XFR_ACT_D_KEY_R(ConstMetaList<? extends MSW_STK_XFR_ACT_D_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_STK_XFR_ACT_D_KEY_R.$stk_xfr_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_STK_XFR_ACT_D_KEY_R.$stk_xfr_act_d_no,
				"stk_xfr_act_d_no",
				stk_xfr_act_d_no,
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
	public static MSW_STK_XFR_ACT_D_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_STK_XFR_ACT_D_KEY_R create(String alias) {
		MSW_STK_XFR_ACT_D_KEY_R row = new MSW_STK_XFR_ACT_D_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_STK_XFR_ACT_D_KEY_R createByName(T proto) {
		MSW_STK_XFR_ACT_D_KEY_R row = MSW_STK_XFR_ACT_D_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_XFR_ACT_D_KEY_R clone() {
		return (MSW_STK_XFR_ACT_D_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_XFR_ACT_D_KEY_R createInstance() {
		return (MSW_STK_XFR_ACT_D_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_STK_XFR_ACT_D_KEY_R getValues(String... names) {
		return (MSW_STK_XFR_ACT_D_KEY_R) super.getValues(names);
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
	 * 在庫振替実績明細ＮＯ. Inventory transfer result details No..<p>
	 *
	 */
	public String stk_xfr_act_d_no() {
		return getConstString(offset + 0, $stk_xfr_act_d_no);
	}

	/**
	 * 在庫振替実績明細ＮＯ. Inventory transfer result details No..<p>
	 *
	 */
	public void stk_xfr_act_d_no(String value) {
		setConstString(offset + 0, $stk_xfr_act_d_no, value);
	}

	public String getString(String name) {
		if ($stk_xfr_act_d_no.equalsIgnoreCase(name)) {
			return stk_xfr_act_d_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($stk_xfr_act_d_no.equalsIgnoreCase(name)) {
			return stk_xfr_act_d_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($stk_xfr_act_d_no.equalsIgnoreCase(name)) {
			stk_xfr_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($stk_xfr_act_d_no.equalsIgnoreCase(name)) {
			stk_xfr_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
