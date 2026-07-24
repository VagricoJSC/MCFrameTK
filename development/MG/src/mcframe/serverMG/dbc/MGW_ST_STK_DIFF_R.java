package mcframe.serverMG.dbc;

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
 * "月初在庫評価替用ワーク // Beginning inventory revaluation work"DBコンテナRowクラスです。<p>
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
 *  	<td>st_stk_key</td>
 *  	<td>N</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初在庫キー</td>
 *  	<td>Beginning inventory key</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改定差異</td>
 *  	<td>Revised variance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bf_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改定前金額</td>
 *  	<td>Amount before revised</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>af_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>改定後金額</td>
 *  	<td>Revised amount</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ST_STK_DIFF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ST_STK_DIFF";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public static final String $st_stk_key = "st_stk_key";
	private static final MCPermColumnInfo _st_stk_key = createColumnInfo("st_stk_key");
	public final MCNumberPermColumn st_stk_key = createNumberColumn(_st_stk_key);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	private static final MCPermColumnInfo _diff_amt = createColumnInfo("diff_amt");
	public final MCNumberPermColumn diff_amt = createNumberColumn(_diff_amt);
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public static final String $bf_amt = "bf_amt";
	private static final MCPermColumnInfo _bf_amt = createColumnInfo("bf_amt");
	public final MCNumberPermColumn bf_amt = createNumberColumn(_bf_amt);
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public static final String $af_amt = "af_amt";
	private static final MCPermColumnInfo _af_amt = createColumnInfo("af_amt");
	public final MCNumberPermColumn af_amt = createNumberColumn(_af_amt);
	
	public static final MCMeta st_stk_key_META = createCommonMeta($st_stk_key, mcframe.commonMG.meta.MG_META.ROW_NO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bf_amt_META = createCommonMeta($bf_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta af_amt_META = createCommonMeta($af_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_ST_STK_DIFF_R> constMetas = new ConstMetaList<MGW_ST_STK_DIFF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			st_stk_key_META,
			expns_cd_META,
			diff_amt_META,
			bf_amt_META,
			af_amt_META
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
	protected MGW_ST_STK_DIFF_R(ConstMetaList<? extends MGW_ST_STK_DIFF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ST_STK_DIFF_R(ConstMetaList<? extends MGW_ST_STK_DIFF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ST_STK_DIFF_R.$st_stk_key,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ST_STK_DIFF_R.$st_stk_key,
				"st_stk_key",
				st_stk_key,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ST_STK_DIFF_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ST_STK_DIFF_R.$expns_cd,
				"expns_cd",
				expns_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ST_STK_DIFF_R.$diff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ST_STK_DIFF_R.$diff_amt,
				"diff_amt",
				diff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ST_STK_DIFF_R.$bf_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ST_STK_DIFF_R.$bf_amt,
				"bf_amt",
				bf_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ST_STK_DIFF_R.$af_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ST_STK_DIFF_R.$af_amt,
				"af_amt",
				af_amt,
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
	public static MGW_ST_STK_DIFF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ST_STK_DIFF_R create(String alias) {
		MGW_ST_STK_DIFF_R row = new MGW_ST_STK_DIFF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ST_STK_DIFF_R createByName(T proto) {
		MGW_ST_STK_DIFF_R row = MGW_ST_STK_DIFF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_DIFF_R clone() {
		return (MGW_ST_STK_DIFF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_DIFF_R createInstance() {
		return (MGW_ST_STK_DIFF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_DIFF_R getValues(String... names) {
		return (MGW_ST_STK_DIFF_R) super.getValues(names);
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
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public MCNumber st_stk_key() {
		return getConstNumber(offset + 0, $st_stk_key);
	}

	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(MCNumber value) {
		setConstNumber(offset + 0, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(int value) {
		setConstNumber(offset + 0, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(long value) {
		setConstNumber(offset + 0, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(float value) {
		setConstNumber(offset + 0, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(double value) {
		setConstNumber(offset + 0, $st_stk_key, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 1, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 1, $expns_cd, value);
	}

	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 2, $diff_amt);
	}

	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 2, $diff_amt, value);
	}
	
	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 2, $diff_amt, value);
	}
	
	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 2, $diff_amt, value);
	}
	
	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 2, $diff_amt, value);
	}
	
	/**
	 * 改定差異. Revised variance.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 2, $diff_amt, value);
	}
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public MCNumber bf_amt() {
		return getConstNumber(offset + 3, $bf_amt);
	}

	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public void bf_amt(MCNumber value) {
		setConstNumber(offset + 3, $bf_amt, value);
	}
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public void bf_amt(int value) {
		setConstNumber(offset + 3, $bf_amt, value);
	}
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public void bf_amt(long value) {
		setConstNumber(offset + 3, $bf_amt, value);
	}
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public void bf_amt(float value) {
		setConstNumber(offset + 3, $bf_amt, value);
	}
	
	/**
	 * 改定前金額. Amount before revised.<p>
	 *
	 */
	public void bf_amt(double value) {
		setConstNumber(offset + 3, $bf_amt, value);
	}
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public MCNumber af_amt() {
		return getConstNumber(offset + 4, $af_amt);
	}

	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public void af_amt(MCNumber value) {
		setConstNumber(offset + 4, $af_amt, value);
	}
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public void af_amt(int value) {
		setConstNumber(offset + 4, $af_amt, value);
	}
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public void af_amt(long value) {
		setConstNumber(offset + 4, $af_amt, value);
	}
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public void af_amt(float value) {
		setConstNumber(offset + 4, $af_amt, value);
	}
	
	/**
	 * 改定後金額. Revised amount.<p>
	 *
	 */
	public void af_amt(double value) {
		setConstNumber(offset + 4, $af_amt, value);
	}
	
	public String getString(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			return bf_amt();
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			return af_amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			return bf_amt();
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			return af_amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($bf_amt.equalsIgnoreCase(name)) {
			bf_amt(value);
			return;
		}
		if ($af_amt.equalsIgnoreCase(name)) {
			af_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
