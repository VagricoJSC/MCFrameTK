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
 * "請求明細消込実績 // Billing details reconciled result"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>rcv_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績明細ＮＯ</td>
 *  	<td>Payment received result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>bill_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>消込請求明細ＮＯ</td>
 *  	<td>Reconcile invoice details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>parent_bill_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>消込親請求明細ＮＯ</td>
 *  	<td>Reconcile parent invoice details No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_BILL_D_APPL_ACT_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_BILL_D_APPL_ACT_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	private static final MCPermColumnInfo _rcv_act_d_no = createColumnInfo("rcv_act_d_no");
	public final MCStringPermColumn rcv_act_d_no = createStringColumn(_rcv_act_d_no);
	
	/**
	 * 消込請求明細ＮＯ. Reconcile invoice details No..<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	private static final MCPermColumnInfo _bill_d_no = createColumnInfo("bill_d_no");
	public final MCStringPermColumn bill_d_no = createStringColumn(_bill_d_no);
	
	/**
	 * 消込親請求明細ＮＯ. Reconcile parent invoice details No..<p>
	 *
	 */
	public static final String $parent_bill_d_no = "parent_bill_d_no";
	private static final MCPermColumnInfo _parent_bill_d_no = createColumnInfo("parent_bill_d_no");
	public final MCStringPermColumn parent_bill_d_no = createStringColumn(_parent_bill_d_no);
	
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta parent_bill_d_no_META = createCommonMeta($parent_bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_BILL_D_APPL_ACT_KEY_R> constMetas = new ConstMetaList<MSW_BILL_D_APPL_ACT_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			bill_d_no_META,
			parent_bill_d_no_META
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
	protected MSW_BILL_D_APPL_ACT_KEY_R(ConstMetaList<? extends MSW_BILL_D_APPL_ACT_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_BILL_D_APPL_ACT_KEY_R(ConstMetaList<? extends MSW_BILL_D_APPL_ACT_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_BILL_D_APPL_ACT_KEY_R.$rcv_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_APPL_ACT_KEY_R.$rcv_act_d_no,
				"rcv_act_d_no",
				rcv_act_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_APPL_ACT_KEY_R.$bill_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_APPL_ACT_KEY_R.$bill_d_no,
				"bill_d_no",
				bill_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_APPL_ACT_KEY_R.$parent_bill_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_APPL_ACT_KEY_R.$parent_bill_d_no,
				"parent_bill_d_no",
				parent_bill_d_no,
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
	public static MSW_BILL_D_APPL_ACT_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_BILL_D_APPL_ACT_KEY_R create(String alias) {
		MSW_BILL_D_APPL_ACT_KEY_R row = new MSW_BILL_D_APPL_ACT_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_BILL_D_APPL_ACT_KEY_R createByName(T proto) {
		MSW_BILL_D_APPL_ACT_KEY_R row = MSW_BILL_D_APPL_ACT_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_APPL_ACT_KEY_R clone() {
		return (MSW_BILL_D_APPL_ACT_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_APPL_ACT_KEY_R createInstance() {
		return (MSW_BILL_D_APPL_ACT_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_APPL_ACT_KEY_R getValues(String... names) {
		return (MSW_BILL_D_APPL_ACT_KEY_R) super.getValues(names);
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
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 0, $rcv_act_d_no);
	}

	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 0, $rcv_act_d_no, value);
	}

	/**
	 * 消込請求明細ＮＯ. Reconcile invoice details No..<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 1, $bill_d_no);
	}

	/**
	 * 消込請求明細ＮＯ. Reconcile invoice details No..<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 1, $bill_d_no, value);
	}

	/**
	 * 消込親請求明細ＮＯ. Reconcile parent invoice details No..<p>
	 *
	 */
	public String parent_bill_d_no() {
		return getConstString(offset + 2, $parent_bill_d_no);
	}

	/**
	 * 消込親請求明細ＮＯ. Reconcile parent invoice details No..<p>
	 *
	 */
	public void parent_bill_d_no(String value) {
		setConstString(offset + 2, $parent_bill_d_no, value);
	}

	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			return parent_bill_d_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($parent_bill_d_no.equalsIgnoreCase(name)) {
			parent_bill_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
