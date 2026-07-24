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
 * "原価計算月初在庫費目別原価ビュー // Cost calculation beginning cost by inventory cost element view"DBコンテナRowクラスです。<p>
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
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>st_stk_key</td>
 *  	<td>N</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初在庫キー</td>
 *  	<td>Beginning inventory key</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ext</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目拡張</td>
 *  	<td>Item extension</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVT_ST_STK_EXPNS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_ST_STK_EXPNS";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public static final String $itm_ext = "itm_ext";
	private static final MCPermColumnInfo _itm_ext = createColumnInfo("itm_ext");
	public final MCStringPermColumn itm_ext = createStringColumn(_itm_ext);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta st_stk_key_META = createCommonMeta($st_stk_key, mcframe.commonMG.meta.MG_META.ROW_NO);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_ext_META = createCommonMeta($itm_ext, mcframe.commonMG.meta.MG_META.ITM_EXT);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVT_ST_STK_EXPNS_R> constMetas = new ConstMetaList<MGVT_ST_STK_EXPNS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wg_cd_META,
			st_stk_key_META,
			expns_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_ext_META,
			amt_META
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
	protected MGVT_ST_STK_EXPNS_R(ConstMetaList<? extends MGVT_ST_STK_EXPNS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_ST_STK_EXPNS_R(ConstMetaList<? extends MGVT_ST_STK_EXPNS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$st_stk_key,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ST_STK_EXPNS_R.$st_stk_key,
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
			MGVT_ST_STK_EXPNS_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$expns_cd,
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
			MGVT_ST_STK_EXPNS_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$itm_ext,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_ST_STK_EXPNS_R.$itm_ext,
				"itm_ext",
				itm_ext,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_ST_STK_EXPNS_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_ST_STK_EXPNS_R.$amt,
				"amt",
				amt,
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
	public static MGVT_ST_STK_EXPNS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_ST_STK_EXPNS_R create(String alias) {
		MGVT_ST_STK_EXPNS_R row = new MGVT_ST_STK_EXPNS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_ST_STK_EXPNS_R createByName(T proto) {
		MGVT_ST_STK_EXPNS_R row = MGVT_ST_STK_EXPNS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ST_STK_EXPNS_R clone() {
		return (MGVT_ST_STK_EXPNS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ST_STK_EXPNS_R createInstance() {
		return (MGVT_ST_STK_EXPNS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_ST_STK_EXPNS_R getValues(String... names) {
		return (MGVT_ST_STK_EXPNS_R) super.getValues(names);
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}

	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public MCNumber st_stk_key() {
		return getConstNumber(offset + 1, $st_stk_key);
	}

	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(MCNumber value) {
		setConstNumber(offset + 1, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(int value) {
		setConstNumber(offset + 1, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(long value) {
		setConstNumber(offset + 1, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(float value) {
		setConstNumber(offset + 1, $st_stk_key, value);
	}
	
	/**
	 * 月初在庫キー. Beginning inventory key.<p>
	 *
	 */
	public void st_stk_key(double value) {
		setConstNumber(offset + 1, $st_stk_key, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 2, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 2, $expns_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public String itm_ext() {
		return getConstString(offset + 7, $itm_ext);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public void itm_ext(String value) {
		setConstString(offset + 7, $itm_ext, value);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 8, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 8, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 8, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 8, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 8, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 8, $amt, value);
	}
	
	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			return st_stk_key();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($st_stk_key.equalsIgnoreCase(name)) {
			st_stk_key(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
