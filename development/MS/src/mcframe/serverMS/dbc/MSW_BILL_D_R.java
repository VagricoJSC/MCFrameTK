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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "請求明細ワーク // Billing details work"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求明細ＮＯ</td>
 *  	<td>Billing details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発行</td>
 *  	<td>Issue</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求方式区分</td>
 *  	<td>Billing method type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税額</td>
 *  	<td>Tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_prnt_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書出力ＦＬＧ</td>
 *  	<td>Invoice output flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_BILL_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_BILL_D";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	private static final MCPermColumnInfo _bill_d_no = createColumnInfo("bill_d_no");
	public final MCStringPermColumn bill_d_no = createStringColumn(_bill_d_no);
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
	/**
	 * 発行. Issue.<p>
	 *
	 */
	public static final String $cl_flg = "cl_flg";
	private static final MCPermColumnInfo _cl_flg = createColumnInfo("cl_flg");
	public final MCBooleanPermColumn cl_flg = createBooleanColumn(_cl_flg);
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public static final String $dat_cntr = "dat_cntr";
	private static final MCPermColumnInfo _dat_cntr = createColumnInfo("dat_cntr");
	public final MCNumberPermColumn dat_cntr = createNumberColumn(_dat_cntr);
	
	/**
	 * 請求方式区分. Billing method type.<p>
	 *
	 */
	public static final String $bill_mtd_typ = "bill_mtd_typ";
	private static final MCPermColumnInfo _bill_mtd_typ = createColumnInfo("bill_mtd_typ");
	public final MCStringPermColumn bill_mtd_typ = createStringColumn(_bill_mtd_typ);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 請求書出力ＦＬＧ. Invoice output flg..<p>
	 *
	 */
	public static final String $bill_prnt_tgt_flg = "bill_prnt_tgt_flg";
	private static final MCPermColumnInfo _bill_prnt_tgt_flg = createColumnInfo("bill_prnt_tgt_flg");
	public final MCBooleanPermColumn bill_prnt_tgt_flg = createBooleanColumn(_bill_prnt_tgt_flg);
	
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta cl_flg_META = createCommonMeta($cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dat_cntr_META = createCommonMeta($dat_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bill_mtd_typ_META = createCommonMeta($bill_mtd_typ, mcframe.commonMS.meta.MS_META.BILL_MTD_TYP);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_prnt_tgt_flg_META = createCommonMeta($bill_prnt_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_BILL_D_R> constMetas = new ConstMetaList<MSW_BILL_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bill_d_no_META,
			bill_mng_no_META,
			cl_flg_META,
			dat_cntr_META,
			bill_mtd_typ_META,
			amt_META,
			tax_amt_META,
			bill_prnt_tgt_flg_META
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
	protected MSW_BILL_D_R(ConstMetaList<? extends MSW_BILL_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_BILL_D_R(ConstMetaList<? extends MSW_BILL_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_BILL_D_R.$bill_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_R.$bill_d_no,
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
			MSW_BILL_D_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_R.$bill_mng_no,
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
			MSW_BILL_D_R.$cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_BILL_D_R.$cl_flg,
				"cl_flg",
				cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_R.$dat_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_BILL_D_R.$dat_cntr,
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
		COLUMN_MAP.put(
			MSW_BILL_D_R.$bill_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_BILL_D_R.$bill_mtd_typ,
				"bill_mtd_typ",
				bill_mtd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_BILL_D_R.$amt,
				"amt",
				amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_BILL_D_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_BILL_D_R.$bill_prnt_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_BILL_D_R.$bill_prnt_tgt_flg,
				"bill_prnt_tgt_flg",
				bill_prnt_tgt_flg,
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
	public static MSW_BILL_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_BILL_D_R create(String alias) {
		MSW_BILL_D_R row = new MSW_BILL_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_BILL_D_R createByName(T proto) {
		MSW_BILL_D_R row = MSW_BILL_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_R clone() {
		return (MSW_BILL_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_R createInstance() {
		return (MSW_BILL_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_BILL_D_R getValues(String... names) {
		return (MSW_BILL_D_R) super.getValues(names);
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
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 0, $bill_d_no);
	}

	/**
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 0, $bill_d_no, value);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 1, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 1, $bill_mng_no, value);
	}

	/**
	 * 発行. Issue.<p>
	 *
	 */
	public boolean cl_flg() {
		return getConstBoolean(offset + 2, $cl_flg);
	}

	/**
	 * 発行. Issue.<p>
	 *
	 */
	public void cl_flg(boolean value) {
		setConstBoolean(offset + 2, $cl_flg, value);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public MCNumber dat_cntr() {
		return getConstNumber(offset + 3, $dat_cntr);
	}

	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(MCNumber value) {
		setConstNumber(offset + 3, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(int value) {
		setConstNumber(offset + 3, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(long value) {
		setConstNumber(offset + 3, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(float value) {
		setConstNumber(offset + 3, $dat_cntr, value);
	}
	
	/**
	 * データカウンタ. Data counter.<p>
	 *
	 */
	public void dat_cntr(double value) {
		setConstNumber(offset + 3, $dat_cntr, value);
	}
	
	/**
	 * 請求方式区分. Billing method type.<p>
	 *
	 */
	public String bill_mtd_typ() {
		return getConstString(offset + 4, $bill_mtd_typ);
	}

	/**
	 * 請求方式区分. Billing method type.<p>
	 *
	 */
	public void bill_mtd_typ(String value) {
		setConstString(offset + 4, $bill_mtd_typ, value);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 5, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 5, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 5, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 5, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 5, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 5, $amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 6, $tax_amt);
	}

	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 6, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 6, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 6, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 6, $tax_amt, value);
	}
	
	/**
	 * 税額. Tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 6, $tax_amt, value);
	}
	
	/**
	 * 請求書出力ＦＬＧ. Invoice output flg..<p>
	 *
	 */
	public boolean bill_prnt_tgt_flg() {
		return getConstBoolean(offset + 7, $bill_prnt_tgt_flg);
	}

	/**
	 * 請求書出力ＦＬＧ. Invoice output flg..<p>
	 *
	 */
	public void bill_prnt_tgt_flg(boolean value) {
		setConstBoolean(offset + 7, $bill_prnt_tgt_flg, value);
	}

	public String getString(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			return bill_mtd_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			return dat_cntr();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			return cl_flg();
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			return bill_prnt_tgt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bill_mtd_typ.equalsIgnoreCase(name)) {
			bill_mtd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dat_cntr.equalsIgnoreCase(name)) {
			dat_cntr(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($cl_flg.equalsIgnoreCase(name)) {
			cl_flg(value);
			return;
		}
		if ($bill_prnt_tgt_flg.equalsIgnoreCase(name)) {
			bill_prnt_tgt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
