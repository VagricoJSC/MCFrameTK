package mcframe.serverMS.dbc;

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
 * "入金実績明細ワーク // Payment received result details work"DBコンテナRowクラスです。<p>
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
 *  	<td>rcv_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績明細連番</td>
 *  	<td>Payment received result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績ＮＯ</td>
 *  	<td>Payment received result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績連番</td>
 *  	<td>Payment received result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dat_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データカウンタ</td>
 *  	<td>Data counter</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_RCV_ACT_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_RCV_ACT_D";

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
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
	private static final MCPermColumnInfo _rcv_act_d_seq = createColumnInfo("rcv_act_d_seq");
	public final MCNumberPermColumn rcv_act_d_seq = createNumberColumn(_rcv_act_d_seq);
	
	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	private static final MCPermColumnInfo _rcv_act_no = createColumnInfo("rcv_act_no");
	public final MCStringPermColumn rcv_act_no = createStringColumn(_rcv_act_no);
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	private static final MCPermColumnInfo _rcv_act_seq = createColumnInfo("rcv_act_seq");
	public final MCNumberPermColumn rcv_act_seq = createNumberColumn(_rcv_act_seq);
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public static final String $dat_cntr = "dat_cntr";
	private static final MCPermColumnInfo _dat_cntr = createColumnInfo("dat_cntr");
	public final MCNumberPermColumn dat_cntr = createNumberColumn(_dat_cntr);
	
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta dat_cntr_META = createCommonMeta($dat_cntr, mcframe.commonMA.meta.MA_META.INT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_RCV_ACT_D_R> constMetas = new ConstMetaList<MSW_RCV_ACT_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			bill_mng_no_META,
			dat_cntr_META
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
	protected MSW_RCV_ACT_D_R(ConstMetaList<? extends MSW_RCV_ACT_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_RCV_ACT_D_R(ConstMetaList<? extends MSW_RCV_ACT_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_RCV_ACT_D_R.$rcv_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCV_ACT_D_R.$rcv_act_d_no,
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
			MSW_RCV_ACT_D_R.$rcv_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_RCV_ACT_D_R.$rcv_act_d_seq,
				"rcv_act_d_seq",
				rcv_act_d_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCV_ACT_D_R.$rcv_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCV_ACT_D_R.$rcv_act_no,
				"rcv_act_no",
				rcv_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCV_ACT_D_R.$rcv_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_RCV_ACT_D_R.$rcv_act_seq,
				"rcv_act_seq",
				rcv_act_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCV_ACT_D_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_RCV_ACT_D_R.$bill_mng_no,
				"bill_mng_no",
				bill_mng_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_RCV_ACT_D_R.$dat_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_RCV_ACT_D_R.$dat_cntr,
				"dat_cntr",
				dat_cntr,
				false,
				true,
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
	public static MSW_RCV_ACT_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_RCV_ACT_D_R create(String alias) {
		MSW_RCV_ACT_D_R row = new MSW_RCV_ACT_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_RCV_ACT_D_R createByName(T proto) {
		MSW_RCV_ACT_D_R row = MSW_RCV_ACT_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCV_ACT_D_R clone() {
		return (MSW_RCV_ACT_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCV_ACT_D_R createInstance() {
		return (MSW_RCV_ACT_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_RCV_ACT_D_R getValues(String... names) {
		return (MSW_RCV_ACT_D_R) super.getValues(names);
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
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 1, $rcv_act_d_seq);
	}

	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 2, $rcv_act_no);
	}

	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 2, $rcv_act_no, value);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 3, $rcv_act_seq);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 4, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 4, $bill_mng_no, value);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public MCNumber dat_cntr() {
		return getConstNumber(offset + 5, $dat_cntr);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(MCNumber value) {
		setConstNumber(offset + 5, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(int value) {
		setConstNumber(offset + 5, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(long value) {
		setConstNumber(offset + 5, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(float value) {
		setConstNumber(offset + 5, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(double value) {
		setConstNumber(offset + 5, $dat_cntr, value);
	}
	
	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
