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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "配賦科目マスタ送信ＩＦ // Allocation account master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦科目名</td>
 *  	<td>Allocation account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目名（ロケール１）</td>
 *  	<td>Allocation account name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目名（ロケール２）</td>
 *  	<td>Allocation account name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目名（ロケール３）</td>
 *  	<td>Allocation account name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_ac_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目名（ロケール４）</td>
 *  	<td>Allocation account name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目名（ロケール５）</td>
 *  	<td>Allocation account name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
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
public class MAVM_ALC_AC_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_ALC_AC_IF_ALL";

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
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public static final String $alc_ac_nm = "alc_ac_nm";
	private static final MCPermColumnInfo _alc_ac_nm = createColumnInfo("alc_ac_nm");
	public final MCStringPermColumn alc_ac_nm = createStringColumn(_alc_ac_nm);
	
	/**
	 * 配賦科目名（ロケール１）. Allocation account name (Locale 1).<p>
	 *
	 */
	public static final String $alc_ac_nm_lcl1 = "alc_ac_nm_lcl1";
	private static final MCPermColumnInfo _alc_ac_nm_lcl1 = createColumnInfo("alc_ac_nm_lcl1");
	public final MCStringPermColumn alc_ac_nm_lcl1 = createStringColumn(_alc_ac_nm_lcl1);
	
	/**
	 * 配賦科目名（ロケール２）. Allocation account name (Locale 2).<p>
	 *
	 */
	public static final String $alc_ac_nm_lcl2 = "alc_ac_nm_lcl2";
	private static final MCPermColumnInfo _alc_ac_nm_lcl2 = createColumnInfo("alc_ac_nm_lcl2");
	public final MCStringPermColumn alc_ac_nm_lcl2 = createStringColumn(_alc_ac_nm_lcl2);
	
	/**
	 * 配賦科目名（ロケール３）. Allocation account name (Locale 3).<p>
	 *
	 */
	public static final String $alc_ac_nm_lcl3 = "alc_ac_nm_lcl3";
	private static final MCPermColumnInfo _alc_ac_nm_lcl3 = createColumnInfo("alc_ac_nm_lcl3");
	public final MCStringPermColumn alc_ac_nm_lcl3 = createStringColumn(_alc_ac_nm_lcl3);
	
	/**
	 * 配賦科目名（ロケール４）. Allocation account name (Locale 4).<p>
	 *
	 */
	public static final String $alc_ac_nm_lcl4 = "alc_ac_nm_lcl4";
	private static final MCPermColumnInfo _alc_ac_nm_lcl4 = createColumnInfo("alc_ac_nm_lcl4");
	public final MCStringPermColumn alc_ac_nm_lcl4 = createStringColumn(_alc_ac_nm_lcl4);
	
	/**
	 * 配賦科目名（ロケール５）. Allocation account name (Locale 5).<p>
	 *
	 */
	public static final String $alc_ac_nm_lcl5 = "alc_ac_nm_lcl5";
	private static final MCPermColumnInfo _alc_ac_nm_lcl5 = createColumnInfo("alc_ac_nm_lcl5");
	public final MCStringPermColumn alc_ac_nm_lcl5 = createStringColumn(_alc_ac_nm_lcl5);
	
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
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta alc_ac_nm_META = createCommonMeta($alc_ac_nm, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_nm_lcl1_META = createCommonMeta($alc_ac_nm_lcl1, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_nm_lcl2_META = createCommonMeta($alc_ac_nm_lcl2, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_nm_lcl3_META = createCommonMeta($alc_ac_nm_lcl3, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_nm_lcl4_META = createCommonMeta($alc_ac_nm_lcl4, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta alc_ac_nm_lcl5_META = createCommonMeta($alc_ac_nm_lcl5, mcframe.commonMA.meta.MA_META.ALC_AC_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_ALC_AC_IF_ALL_R> constMetas = new ConstMetaList<MAVM_ALC_AC_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			alc_ac_cd_META,
			alc_ac_nm_META,
			alc_ac_nm_lcl1_META,
			alc_ac_nm_lcl2_META,
			alc_ac_nm_lcl3_META,
			alc_ac_nm_lcl4_META,
			alc_ac_nm_lcl5_META,
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
	protected MAVM_ALC_AC_IF_ALL_R(ConstMetaList<? extends MAVM_ALC_AC_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_ALC_AC_IF_ALL_R(ConstMetaList<? extends MAVM_ALC_AC_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$co_cd,
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
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_cd,
				"alc_ac_cd",
				alc_ac_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm,
				"alc_ac_nm",
				alc_ac_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl1,
				"alc_ac_nm_lcl1",
				alc_ac_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl2,
				"alc_ac_nm_lcl2",
				alc_ac_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl3,
				"alc_ac_nm_lcl3",
				alc_ac_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl4,
				"alc_ac_nm_lcl4",
				alc_ac_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$alc_ac_nm_lcl5,
				"alc_ac_nm_lcl5",
				alc_ac_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ALC_AC_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$memo1,
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
			MAVM_ALC_AC_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$memo2,
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
			MAVM_ALC_AC_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ALC_AC_IF_ALL_R.$memo3,
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
	public static MAVM_ALC_AC_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_ALC_AC_IF_ALL_R create(String alias) {
		MAVM_ALC_AC_IF_ALL_R row = new MAVM_ALC_AC_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_ALC_AC_IF_ALL_R createByName(T proto) {
		MAVM_ALC_AC_IF_ALL_R row = MAVM_ALC_AC_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ALC_AC_IF_ALL_R clone() {
		return (MAVM_ALC_AC_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ALC_AC_IF_ALL_R createInstance() {
		return (MAVM_ALC_AC_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ALC_AC_IF_ALL_R getValues(String... names) {
		return (MAVM_ALC_AC_IF_ALL_R) super.getValues(names);
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
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 1, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 1, $alc_ac_cd, value);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public String alc_ac_nm() {
		return getConstString(offset + 2, $alc_ac_nm);
	}

	/**
	 * 配賦科目名. Allocation account name.<p>
	 *
	 */
	public void alc_ac_nm(String value) {
		setConstString(offset + 2, $alc_ac_nm, value);
	}

	/**
	 * 配賦科目名（ロケール１）. Allocation account name (Locale 1).<p>
	 *
	 */
	public String alc_ac_nm_lcl1() {
		return getConstString(offset + 3, $alc_ac_nm_lcl1);
	}

	/**
	 * 配賦科目名（ロケール１）. Allocation account name (Locale 1).<p>
	 *
	 */
	public void alc_ac_nm_lcl1(String value) {
		setConstString(offset + 3, $alc_ac_nm_lcl1, value);
	}

	/**
	 * 配賦科目名（ロケール２）. Allocation account name (Locale 2).<p>
	 *
	 */
	public String alc_ac_nm_lcl2() {
		return getConstString(offset + 4, $alc_ac_nm_lcl2);
	}

	/**
	 * 配賦科目名（ロケール２）. Allocation account name (Locale 2).<p>
	 *
	 */
	public void alc_ac_nm_lcl2(String value) {
		setConstString(offset + 4, $alc_ac_nm_lcl2, value);
	}

	/**
	 * 配賦科目名（ロケール３）. Allocation account name (Locale 3).<p>
	 *
	 */
	public String alc_ac_nm_lcl3() {
		return getConstString(offset + 5, $alc_ac_nm_lcl3);
	}

	/**
	 * 配賦科目名（ロケール３）. Allocation account name (Locale 3).<p>
	 *
	 */
	public void alc_ac_nm_lcl3(String value) {
		setConstString(offset + 5, $alc_ac_nm_lcl3, value);
	}

	/**
	 * 配賦科目名（ロケール４）. Allocation account name (Locale 4).<p>
	 *
	 */
	public String alc_ac_nm_lcl4() {
		return getConstString(offset + 6, $alc_ac_nm_lcl4);
	}

	/**
	 * 配賦科目名（ロケール４）. Allocation account name (Locale 4).<p>
	 *
	 */
	public void alc_ac_nm_lcl4(String value) {
		setConstString(offset + 6, $alc_ac_nm_lcl4, value);
	}

	/**
	 * 配賦科目名（ロケール５）. Allocation account name (Locale 5).<p>
	 *
	 */
	public String alc_ac_nm_lcl5() {
		return getConstString(offset + 7, $alc_ac_nm_lcl5);
	}

	/**
	 * 配賦科目名（ロケール５）. Allocation account name (Locale 5).<p>
	 *
	 */
	public void alc_ac_nm_lcl5(String value) {
		setConstString(offset + 7, $alc_ac_nm_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_nm_lcl1.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl1();
		}
		if ($alc_ac_nm_lcl2.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl2();
		}
		if ($alc_ac_nm_lcl3.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl3();
		}
		if ($alc_ac_nm_lcl4.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl4();
		}
		if ($alc_ac_nm_lcl5.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl5();
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

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			return alc_ac_nm();
		}
		if ($alc_ac_nm_lcl1.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl1();
		}
		if ($alc_ac_nm_lcl2.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl2();
		}
		if ($alc_ac_nm_lcl3.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl3();
		}
		if ($alc_ac_nm_lcl4.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl4();
		}
		if ($alc_ac_nm_lcl5.equalsIgnoreCase(name)) {
			return alc_ac_nm_lcl5();
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

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_nm_lcl1.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl1(value);
			return;
		}
		if ($alc_ac_nm_lcl2.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl2(value);
			return;
		}
		if ($alc_ac_nm_lcl3.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl3(value);
			return;
		}
		if ($alc_ac_nm_lcl4.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl4(value);
			return;
		}
		if ($alc_ac_nm_lcl5.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl5(value);
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

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($alc_ac_nm.equalsIgnoreCase(name)) {
			alc_ac_nm(value);
			return;
		}
		if ($alc_ac_nm_lcl1.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl1(value);
			return;
		}
		if ($alc_ac_nm_lcl2.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl2(value);
			return;
		}
		if ($alc_ac_nm_lcl3.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl3(value);
			return;
		}
		if ($alc_ac_nm_lcl4.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl4(value);
			return;
		}
		if ($alc_ac_nm_lcl5.equalsIgnoreCase(name)) {
			alc_ac_nm_lcl5(value);
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

}
