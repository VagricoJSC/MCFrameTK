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
 * "予備科目区分マスタ // Spare account type master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>ac_subtyp</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予備科目区分</td>
 *  	<td>Spare account type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ac_typ</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>科目区分値</td>
 *  	<td>Account type value</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_AC_SUBTYPEM_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_AC_SUBTYPEM_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 予備科目区分. Spare account type.<p>
	 *
	 */
	public static final String $ac_subtyp = "ac_subtyp";
	private static final MCPermColumnInfo _ac_subtyp = createColumnInfo("ac_subtyp");
	public final MCStringPermColumn ac_subtyp = createStringColumn(_ac_subtyp);
	
	/**
	 * 科目区分値. Account type value.<p>
	 *
	 */
	public static final String $ac_typ = "ac_typ";
	private static final MCPermColumnInfo _ac_typ = createColumnInfo("ac_typ");
	public final MCStringPermColumn ac_typ = createStringColumn(_ac_typ);
	
	public static final MCMeta ac_subtyp_META = createCommonMeta($ac_subtyp, mcframe.commonMA.meta.MA_META.AC_SUBTYP);
	public static final MCMeta ac_typ_META = createCommonMeta($ac_typ, mcframe.commonMA.meta.MA_META.AC_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_AC_SUBTYPEM_KEY_R> constMetas = new ConstMetaList<MAW_AC_SUBTYPEM_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ac_subtyp_META,
			ac_typ_META
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
	protected MAW_AC_SUBTYPEM_KEY_R(ConstMetaList<? extends MAW_AC_SUBTYPEM_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_AC_SUBTYPEM_KEY_R(ConstMetaList<? extends MAW_AC_SUBTYPEM_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_AC_SUBTYPEM_KEY_R.$ac_subtyp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AC_SUBTYPEM_KEY_R.$ac_subtyp,
				"ac_subtyp",
				ac_subtyp,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_AC_SUBTYPEM_KEY_R.$ac_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_AC_SUBTYPEM_KEY_R.$ac_typ,
				"ac_typ",
				ac_typ,
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
	public static MAW_AC_SUBTYPEM_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_AC_SUBTYPEM_KEY_R create(String alias) {
		MAW_AC_SUBTYPEM_KEY_R row = new MAW_AC_SUBTYPEM_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_AC_SUBTYPEM_KEY_R createByName(T proto) {
		MAW_AC_SUBTYPEM_KEY_R row = MAW_AC_SUBTYPEM_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AC_SUBTYPEM_KEY_R clone() {
		return (MAW_AC_SUBTYPEM_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AC_SUBTYPEM_KEY_R createInstance() {
		return (MAW_AC_SUBTYPEM_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_AC_SUBTYPEM_KEY_R getValues(String... names) {
		return (MAW_AC_SUBTYPEM_KEY_R) super.getValues(names);
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
	 * 予備科目区分. Spare account type.<p>
	 *
	 */
	public String ac_subtyp() {
		return getConstString(offset + 0, $ac_subtyp);
	}

	/**
	 * 予備科目区分. Spare account type.<p>
	 *
	 */
	public void ac_subtyp(String value) {
		setConstString(offset + 0, $ac_subtyp, value);
	}

	/**
	 * 科目区分値. Account type value.<p>
	 *
	 */
	public String ac_typ() {
		return getConstString(offset + 1, $ac_typ);
	}

	/**
	 * 科目区分値. Account type value.<p>
	 *
	 */
	public void ac_typ(String value) {
		setConstString(offset + 1, $ac_typ, value);
	}

	public String getString(String name) {
		if ($ac_subtyp.equalsIgnoreCase(name)) {
			return ac_subtyp();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ac_subtyp.equalsIgnoreCase(name)) {
			return ac_subtyp();
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			return ac_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ac_subtyp.equalsIgnoreCase(name)) {
			ac_subtyp(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ac_subtyp.equalsIgnoreCase(name)) {
			ac_subtyp(value);
			return;
		}
		if ($ac_typ.equalsIgnoreCase(name)) {
			ac_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
