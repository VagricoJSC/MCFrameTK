package mcframe.serverMA.dbc;

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
 * "照合展開マスタ // Collation Expansion Master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>match_key</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>照合キー</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sub</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>typ</td>
 *  	<td>N</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_COLLAT_EXP_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_COLLAT_EXP_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 照合キー. .<p>
	 *
	 */
	public static final String $match_key = "match_key";
	private static final MCPermColumnInfo _match_key = createColumnInfo("match_key");
	public final MCStringPermColumn match_key = createStringColumn(_match_key);
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public static final String $sub = "sub";
	private static final MCPermColumnInfo _sub = createColumnInfo("sub");
	public final MCNumberPermColumn sub = createNumberColumn(_sub);
	
	/**
	 * 区分. .<p>
	 *
	 */
	public static final String $typ = "typ";
	private static final MCPermColumnInfo _typ = createColumnInfo("typ");
	public final MCNumberPermColumn typ = createNumberColumn(_typ);
	
	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	public static final MCMeta match_key_META = createCommonMeta($match_key, mcframe.commonMA.meta.MA_META.MATCH_KEY);
	public static final MCMeta sub_META = createCommonMeta($sub, mcframe.commonMA.meta.MA_META.SUB);
	public static final MCMeta typ_META = createCommonMeta($typ, mcframe.commonMA.meta.MA_META.TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_COLLAT_EXP_KEY_R> constMetas = new ConstMetaList<MAW_COLLAT_EXP_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			match_key_META,
			sub_META,
			typ_META,
			itm_cd_META
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
	protected MAW_COLLAT_EXP_KEY_R(ConstMetaList<? extends MAW_COLLAT_EXP_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_COLLAT_EXP_KEY_R(ConstMetaList<? extends MAW_COLLAT_EXP_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_COLLAT_EXP_KEY_R.$match_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COLLAT_EXP_KEY_R.$match_key,
				"match_key",
				match_key,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COLLAT_EXP_KEY_R.$sub,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COLLAT_EXP_KEY_R.$sub,
				"sub",
				sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COLLAT_EXP_KEY_R.$typ,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COLLAT_EXP_KEY_R.$typ,
				"typ",
				typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COLLAT_EXP_KEY_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COLLAT_EXP_KEY_R.$itm_cd,
				"itm_cd",
				itm_cd,
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
	public static MAW_COLLAT_EXP_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_COLLAT_EXP_KEY_R create(String alias) {
		MAW_COLLAT_EXP_KEY_R row = new MAW_COLLAT_EXP_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_COLLAT_EXP_KEY_R createByName(T proto) {
		MAW_COLLAT_EXP_KEY_R row = MAW_COLLAT_EXP_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COLLAT_EXP_KEY_R clone() {
		return (MAW_COLLAT_EXP_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COLLAT_EXP_KEY_R createInstance() {
		return (MAW_COLLAT_EXP_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COLLAT_EXP_KEY_R getValues(String... names) {
		return (MAW_COLLAT_EXP_KEY_R) super.getValues(names);
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
	 * 照合キー. .<p>
	 *
	 */
	public String match_key() {
		return getConstString(offset + 0, $match_key);
	}

	/**
	 * 照合キー. .<p>
	 *
	 */
	public void match_key(String value) {
		setConstString(offset + 0, $match_key, value);
	}

	/**
	 * 枝番. .<p>
	 *
	 */
	public MCNumber sub() {
		return getConstNumber(offset + 1, $sub);
	}

	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(MCNumber value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(int value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(long value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(float value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(double value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public MCNumber typ() {
		return getConstNumber(offset + 2, $typ);
	}

	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(MCNumber value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(int value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(long value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(float value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(double value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}

	public String getString(String name) {
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
