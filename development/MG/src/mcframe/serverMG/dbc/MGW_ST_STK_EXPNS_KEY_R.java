package mcframe.serverMG.dbc;

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
 * "月初在庫費目別原価 // Beginning cost by inventory cost element"PKワークテーブルDBコンテナRowクラスです。<p>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ST_STK_EXPNS_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ST_STK_EXPNS_KEY";

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
	
	public static final MCMeta st_stk_key_META = createCommonMeta($st_stk_key, mcframe.commonMG.meta.MG_META.ROW_NO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MGW_ST_STK_EXPNS_KEY_R> constMetas = new ConstMetaList<MGW_ST_STK_EXPNS_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			st_stk_key_META,
			expns_cd_META
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
	protected MGW_ST_STK_EXPNS_KEY_R(ConstMetaList<? extends MGW_ST_STK_EXPNS_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ST_STK_EXPNS_KEY_R(ConstMetaList<? extends MGW_ST_STK_EXPNS_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ST_STK_EXPNS_KEY_R.$st_stk_key,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ST_STK_EXPNS_KEY_R.$st_stk_key,
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
			MGW_ST_STK_EXPNS_KEY_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ST_STK_EXPNS_KEY_R.$expns_cd,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ST_STK_EXPNS_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ST_STK_EXPNS_KEY_R create(String alias) {
		MGW_ST_STK_EXPNS_KEY_R row = new MGW_ST_STK_EXPNS_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ST_STK_EXPNS_KEY_R createByName(T proto) {
		MGW_ST_STK_EXPNS_KEY_R row = MGW_ST_STK_EXPNS_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_EXPNS_KEY_R clone() {
		return (MGW_ST_STK_EXPNS_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_EXPNS_KEY_R createInstance() {
		return (MGW_ST_STK_EXPNS_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ST_STK_EXPNS_KEY_R getValues(String... names) {
		return (MGW_ST_STK_EXPNS_KEY_R) super.getValues(names);
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
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
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
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
