package mcframe.serverMA.dbc;

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
 * "汎用マスタ // General purpose master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>gp_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>汎用分類ＣＤ</td>
 *  	<td>General purpose classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１</td>
 *  	<td>Key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー２</td>
 *  	<td>Key 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー３</td>
 *  	<td>Key 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key4</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー４</td>
 *  	<td>Key 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key5</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー５</td>
 *  	<td>Key 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key6</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー６</td>
 *  	<td>Key 6</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key7</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー７</td>
 *  	<td>Key 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key8</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー８</td>
 *  	<td>Key 8</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key9</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー９</td>
 *  	<td>Key 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key10</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１０</td>
 *  	<td>Key 10</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_GP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_GP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	private static final MCPermColumnInfo _gp_grp_cd = createColumnInfo("gp_grp_cd");
	public final MCStringPermColumn gp_grp_cd = createStringColumn(_gp_grp_cd);
	
	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public static final String $key1 = "key1";
	private static final MCPermColumnInfo _key1 = createColumnInfo("key1");
	public final MCStringPermColumn key1 = createStringColumn(_key1);
	
	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public static final String $key2 = "key2";
	private static final MCPermColumnInfo _key2 = createColumnInfo("key2");
	public final MCStringPermColumn key2 = createStringColumn(_key2);
	
	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public static final String $key3 = "key3";
	private static final MCPermColumnInfo _key3 = createColumnInfo("key3");
	public final MCStringPermColumn key3 = createStringColumn(_key3);
	
	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public static final String $key4 = "key4";
	private static final MCPermColumnInfo _key4 = createColumnInfo("key4");
	public final MCStringPermColumn key4 = createStringColumn(_key4);
	
	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public static final String $key5 = "key5";
	private static final MCPermColumnInfo _key5 = createColumnInfo("key5");
	public final MCStringPermColumn key5 = createStringColumn(_key5);
	
	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public static final String $key6 = "key6";
	private static final MCPermColumnInfo _key6 = createColumnInfo("key6");
	public final MCStringPermColumn key6 = createStringColumn(_key6);
	
	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public static final String $key7 = "key7";
	private static final MCPermColumnInfo _key7 = createColumnInfo("key7");
	public final MCStringPermColumn key7 = createStringColumn(_key7);
	
	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public static final String $key8 = "key8";
	private static final MCPermColumnInfo _key8 = createColumnInfo("key8");
	public final MCStringPermColumn key8 = createStringColumn(_key8);
	
	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public static final String $key9 = "key9";
	private static final MCPermColumnInfo _key9 = createColumnInfo("key9");
	public final MCStringPermColumn key9 = createStringColumn(_key9);
	
	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public static final String $key10 = "key10";
	private static final MCPermColumnInfo _key10 = createColumnInfo("key10");
	public final MCStringPermColumn key10 = createStringColumn(_key10);
	
	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_GP_KEY_R> constMetas = new ConstMetaList<MAW_GP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META
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
	protected MAW_GP_KEY_R(ConstMetaList<? extends MAW_GP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_GP_KEY_R(ConstMetaList<? extends MAW_GP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$gp_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$gp_grp_cd,
				"gp_grp_cd",
				gp_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key1,
				"key1",
				key1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key2,
				"key2",
				key2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key3,
				"key3",
				key3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key4,
				"key4",
				key4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key5,
				"key5",
				key5,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key6,
				"key6",
				key6,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key7,
				"key7",
				key7,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key8,
				"key8",
				key8,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key9,
				"key9",
				key9,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_GP_KEY_R.$key10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_GP_KEY_R.$key10,
				"key10",
				key10,
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
	public static MAW_GP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_GP_KEY_R create(String alias) {
		MAW_GP_KEY_R row = new MAW_GP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_GP_KEY_R createByName(T proto) {
		MAW_GP_KEY_R row = MAW_GP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_GP_KEY_R clone() {
		return (MAW_GP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_GP_KEY_R createInstance() {
		return (MAW_GP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_GP_KEY_R getValues(String... names) {
		return (MAW_GP_KEY_R) super.getValues(names);
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
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 0, $gp_grp_cd);
	}

	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 0, $gp_grp_cd, value);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 1, $key1);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 1, $key1, value);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 2, $key2);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 2, $key2, value);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 3, $key3);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 3, $key3, value);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 4, $key4);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 4, $key4, value);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 5, $key5);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 5, $key5, value);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 6, $key6);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 6, $key6, value);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 7, $key7);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 7, $key7, value);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 8, $key8);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 8, $key8, value);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 9, $key9);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 9, $key9, value);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 10, $key10);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 10, $key10, value);
	}

	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
