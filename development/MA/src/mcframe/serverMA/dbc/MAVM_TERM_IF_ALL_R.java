package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "対象期間マスタ送信ＩＦ // Term master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_end_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期終了年月</td>
 *  	<td>End month of term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>term_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期名称</td>
 *  	<td>Term name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期名称（ロケール１）</td>
 *  	<td>Term name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>term_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期名称（ロケール２）</td>
 *  	<td>Term name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期名称（ロケール３）</td>
 *  	<td>Term name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>term_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期名称（ロケール４）</td>
 *  	<td>Term name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期名称（ロケール５）</td>
 *  	<td>Term name (Locale 5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_TERM_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_TERM_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 期終了年月. End month of term.<p>
	 *
	 */
	public static final String $term_end_ym = "term_end_ym";
	private static final MCPermColumnInfo _term_end_ym = createColumnInfo("term_end_ym");
	public final MCDatePermColumn term_end_ym = createDateColumn(_term_end_ym);
	
	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	private static final MCPermColumnInfo _term_nm = createColumnInfo("term_nm");
	public final MCStringPermColumn term_nm = createStringColumn(_term_nm);
	
	/**
	 * 期名称（ロケール１）. Term name (Locale 1).<p>
	 *
	 */
	public static final String $term_nm_lcl1 = "term_nm_lcl1";
	private static final MCPermColumnInfo _term_nm_lcl1 = createColumnInfo("term_nm_lcl1");
	public final MCStringPermColumn term_nm_lcl1 = createStringColumn(_term_nm_lcl1);
	
	/**
	 * 期名称（ロケール２）. Term name (Locale 2).<p>
	 *
	 */
	public static final String $term_nm_lcl2 = "term_nm_lcl2";
	private static final MCPermColumnInfo _term_nm_lcl2 = createColumnInfo("term_nm_lcl2");
	public final MCStringPermColumn term_nm_lcl2 = createStringColumn(_term_nm_lcl2);
	
	/**
	 * 期名称（ロケール３）. Term name (Locale 3).<p>
	 *
	 */
	public static final String $term_nm_lcl3 = "term_nm_lcl3";
	private static final MCPermColumnInfo _term_nm_lcl3 = createColumnInfo("term_nm_lcl3");
	public final MCStringPermColumn term_nm_lcl3 = createStringColumn(_term_nm_lcl3);
	
	/**
	 * 期名称（ロケール４）. Term name (Locale 4).<p>
	 *
	 */
	public static final String $term_nm_lcl4 = "term_nm_lcl4";
	private static final MCPermColumnInfo _term_nm_lcl4 = createColumnInfo("term_nm_lcl4");
	public final MCStringPermColumn term_nm_lcl4 = createStringColumn(_term_nm_lcl4);
	
	/**
	 * 期名称（ロケール５）. Term name (Locale 5).<p>
	 *
	 */
	public static final String $term_nm_lcl5 = "term_nm_lcl5";
	private static final MCPermColumnInfo _term_nm_lcl5 = createColumnInfo("term_nm_lcl5");
	public final MCStringPermColumn term_nm_lcl5 = createStringColumn(_term_nm_lcl5);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_end_ym_META = createCommonMeta($term_end_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_nm_lcl1_META = createCommonMeta($term_nm_lcl1, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_nm_lcl2_META = createCommonMeta($term_nm_lcl2, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_nm_lcl3_META = createCommonMeta($term_nm_lcl3, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_nm_lcl4_META = createCommonMeta($term_nm_lcl4, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta term_nm_lcl5_META = createCommonMeta($term_nm_lcl5, mcframe.commonMA.meta.MA_META.TERM_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_TERM_IF_ALL_R> constMetas = new ConstMetaList<MAVM_TERM_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			term_META,
			term_end_ym_META,
			term_nm_META,
			term_nm_lcl1_META,
			term_nm_lcl2_META,
			term_nm_lcl3_META,
			term_nm_lcl4_META,
			term_nm_lcl5_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected MAVM_TERM_IF_ALL_R(ConstMetaList<? extends MAVM_TERM_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_TERM_IF_ALL_R(ConstMetaList<? extends MAVM_TERM_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_TERM_IF_ALL_R.$term,
				"term",
				term,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_end_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_TERM_IF_ALL_R.$term_end_ym,
				"term_end_ym",
				term_end_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm,
				"term_nm",
				term_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm_lcl1,
				"term_nm_lcl1",
				term_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm_lcl2,
				"term_nm_lcl2",
				term_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm_lcl3,
				"term_nm_lcl3",
				term_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm_lcl4,
				"term_nm_lcl4",
				term_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$term_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$term_nm_lcl5,
				"term_nm_lcl5",
				term_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_TERM_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_TERM_IF_ALL_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
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
	public static MAVM_TERM_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_TERM_IF_ALL_R create(String alias) {
		MAVM_TERM_IF_ALL_R row = new MAVM_TERM_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_TERM_IF_ALL_R createByName(T proto) {
		MAVM_TERM_IF_ALL_R row = MAVM_TERM_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TERM_IF_ALL_R clone() {
		return (MAVM_TERM_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TERM_IF_ALL_R createInstance() {
		return (MAVM_TERM_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_TERM_IF_ALL_R getValues(String... names) {
		return (MAVM_TERM_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 1, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 1, $term, value);
	}

	/**
	 * 期終了年月. End month of term.<p>
	 *
	 */
	public MCDate term_end_ym() {
		return getConstDate(offset + 2, $term_end_ym);
	}

	/**
	 * 期終了年月. End month of term.<p>
	 *
	 */
	public void term_end_ym(MCDate value) {
		setConstDate(offset + 2, $term_end_ym, value);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 3, $term_nm);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 3, $term_nm, value);
	}

	/**
	 * 期名称（ロケール１）. Term name (Locale 1).<p>
	 *
	 */
	public String term_nm_lcl1() {
		return getConstString(offset + 4, $term_nm_lcl1);
	}

	/**
	 * 期名称（ロケール１）. Term name (Locale 1).<p>
	 *
	 */
	public void term_nm_lcl1(String value) {
		setConstString(offset + 4, $term_nm_lcl1, value);
	}

	/**
	 * 期名称（ロケール２）. Term name (Locale 2).<p>
	 *
	 */
	public String term_nm_lcl2() {
		return getConstString(offset + 5, $term_nm_lcl2);
	}

	/**
	 * 期名称（ロケール２）. Term name (Locale 2).<p>
	 *
	 */
	public void term_nm_lcl2(String value) {
		setConstString(offset + 5, $term_nm_lcl2, value);
	}

	/**
	 * 期名称（ロケール３）. Term name (Locale 3).<p>
	 *
	 */
	public String term_nm_lcl3() {
		return getConstString(offset + 6, $term_nm_lcl3);
	}

	/**
	 * 期名称（ロケール３）. Term name (Locale 3).<p>
	 *
	 */
	public void term_nm_lcl3(String value) {
		setConstString(offset + 6, $term_nm_lcl3, value);
	}

	/**
	 * 期名称（ロケール４）. Term name (Locale 4).<p>
	 *
	 */
	public String term_nm_lcl4() {
		return getConstString(offset + 7, $term_nm_lcl4);
	}

	/**
	 * 期名称（ロケール４）. Term name (Locale 4).<p>
	 *
	 */
	public void term_nm_lcl4(String value) {
		setConstString(offset + 7, $term_nm_lcl4, value);
	}

	/**
	 * 期名称（ロケール５）. Term name (Locale 5).<p>
	 *
	 */
	public String term_nm_lcl5() {
		return getConstString(offset + 8, $term_nm_lcl5);
	}

	/**
	 * 期名称（ロケール５）. Term name (Locale 5).<p>
	 *
	 */
	public void term_nm_lcl5(String value) {
		setConstString(offset + 8, $term_nm_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 9, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 9, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 10, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 10, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 11, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 11, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($term_nm_lcl1.equalsIgnoreCase(name)) {
			return term_nm_lcl1();
		}
		if ($term_nm_lcl2.equalsIgnoreCase(name)) {
			return term_nm_lcl2();
		}
		if ($term_nm_lcl3.equalsIgnoreCase(name)) {
			return term_nm_lcl3();
		}
		if ($term_nm_lcl4.equalsIgnoreCase(name)) {
			return term_nm_lcl4();
		}
		if ($term_nm_lcl5.equalsIgnoreCase(name)) {
			return term_nm_lcl5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		if ($term_nm_lcl1.equalsIgnoreCase(name)) {
			return term_nm_lcl1();
		}
		if ($term_nm_lcl2.equalsIgnoreCase(name)) {
			return term_nm_lcl2();
		}
		if ($term_nm_lcl3.equalsIgnoreCase(name)) {
			return term_nm_lcl3();
		}
		if ($term_nm_lcl4.equalsIgnoreCase(name)) {
			return term_nm_lcl4();
		}
		if ($term_nm_lcl5.equalsIgnoreCase(name)) {
			return term_nm_lcl5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			return term_end_ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($term_nm_lcl1.equalsIgnoreCase(name)) {
			term_nm_lcl1(value);
			return;
		}
		if ($term_nm_lcl2.equalsIgnoreCase(name)) {
			term_nm_lcl2(value);
			return;
		}
		if ($term_nm_lcl3.equalsIgnoreCase(name)) {
			term_nm_lcl3(value);
			return;
		}
		if ($term_nm_lcl4.equalsIgnoreCase(name)) {
			term_nm_lcl4(value);
			return;
		}
		if ($term_nm_lcl5.equalsIgnoreCase(name)) {
			term_nm_lcl5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		if ($term_nm_lcl1.equalsIgnoreCase(name)) {
			term_nm_lcl1(value);
			return;
		}
		if ($term_nm_lcl2.equalsIgnoreCase(name)) {
			term_nm_lcl2(value);
			return;
		}
		if ($term_nm_lcl3.equalsIgnoreCase(name)) {
			term_nm_lcl3(value);
			return;
		}
		if ($term_nm_lcl4.equalsIgnoreCase(name)) {
			term_nm_lcl4(value);
			return;
		}
		if ($term_nm_lcl5.equalsIgnoreCase(name)) {
			term_nm_lcl5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		if ($term_end_ym.equalsIgnoreCase(name)) {
			term_end_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
