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
 * "発番管理マスタ // Wrk No master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>issue_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発番業務区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dept_cd</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>事業部コード</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>prod_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品コード</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ym</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ope_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>作業区分</td>
 *  	<td></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_A_WRK_NO_ISSUE_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_A_WRK_NO_ISSUE_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 発番業務区分. .<p>
	 *
	 */
	public static final String $issue_typ = "issue_typ";
	private static final MCPermColumnInfo _issue_typ = createColumnInfo("issue_typ");
	public final MCStringPermColumn issue_typ = createStringColumn(_issue_typ);
	
	/**
	 * 事業部コード. .<p>
	 *
	 */
	public static final String $dept_cd = "dept_cd";
	private static final MCPermColumnInfo _dept_cd = createColumnInfo("dept_cd");
	public final MCStringPermColumn dept_cd = createStringColumn(_dept_cd);
	
	/**
	 * 製品コード. .<p>
	 *
	 */
	public static final String $prod_cd = "prod_cd";
	private static final MCPermColumnInfo _prod_cd = createColumnInfo("prod_cd");
	public final MCStringPermColumn prod_cd = createStringColumn(_prod_cd);
	
	/**
	 * 年月. .<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCStringPermColumn ym = createStringColumn(_ym);
	
	/**
	 * 作業区分. .<p>
	 *
	 */
	public static final String $ope_typ = "ope_typ";
	private static final MCPermColumnInfo _ope_typ = createColumnInfo("ope_typ");
	public final MCStringPermColumn ope_typ = createStringColumn(_ope_typ);
	
	public static final MCMeta issue_typ_META = createCommonMeta($issue_typ, mcframe.commonMA.meta.MA_META.CNSTR_NO_TYP);
	public static final MCMeta dept_cd_META = createCommonMeta($dept_cd, mcframe.commonMA.meta.MA_META.DEPT_CD);
	public static final MCMeta prod_cd_META = createCommonMeta($prod_cd, mcframe.commonMA.meta.MA_META.PROD_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM_STR);
	public static final MCMeta ope_typ_META = createCommonMeta($ope_typ, mcframe.commonMA.meta.MA_META.WK_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_A_WRK_NO_ISSUE_KEY_R> constMetas = new ConstMetaList<MAW_A_WRK_NO_ISSUE_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			issue_typ_META,
			dept_cd_META,
			prod_cd_META,
			ym_META,
			ope_typ_META
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
	protected MAW_A_WRK_NO_ISSUE_KEY_R(ConstMetaList<? extends MAW_A_WRK_NO_ISSUE_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_A_WRK_NO_ISSUE_KEY_R(ConstMetaList<? extends MAW_A_WRK_NO_ISSUE_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_A_WRK_NO_ISSUE_KEY_R.$issue_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_A_WRK_NO_ISSUE_KEY_R.$issue_typ,
				"issue_typ",
				issue_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_A_WRK_NO_ISSUE_KEY_R.$dept_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_A_WRK_NO_ISSUE_KEY_R.$dept_cd,
				"dept_cd",
				dept_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_A_WRK_NO_ISSUE_KEY_R.$prod_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_A_WRK_NO_ISSUE_KEY_R.$prod_cd,
				"prod_cd",
				prod_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_A_WRK_NO_ISSUE_KEY_R.$ym,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_A_WRK_NO_ISSUE_KEY_R.$ym,
				"ym",
				ym,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_A_WRK_NO_ISSUE_KEY_R.$ope_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_A_WRK_NO_ISSUE_KEY_R.$ope_typ,
				"ope_typ",
				ope_typ,
				true,
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
	public static MAW_A_WRK_NO_ISSUE_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_A_WRK_NO_ISSUE_KEY_R create(String alias) {
		MAW_A_WRK_NO_ISSUE_KEY_R row = new MAW_A_WRK_NO_ISSUE_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_A_WRK_NO_ISSUE_KEY_R createByName(T proto) {
		MAW_A_WRK_NO_ISSUE_KEY_R row = MAW_A_WRK_NO_ISSUE_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_A_WRK_NO_ISSUE_KEY_R clone() {
		return (MAW_A_WRK_NO_ISSUE_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_A_WRK_NO_ISSUE_KEY_R createInstance() {
		return (MAW_A_WRK_NO_ISSUE_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_A_WRK_NO_ISSUE_KEY_R getValues(String... names) {
		return (MAW_A_WRK_NO_ISSUE_KEY_R) super.getValues(names);
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
	 * 発番業務区分. .<p>
	 *
	 */
	public String issue_typ() {
		return getConstString(offset + 0, $issue_typ);
	}

	/**
	 * 発番業務区分. .<p>
	 *
	 */
	public void issue_typ(String value) {
		setConstString(offset + 0, $issue_typ, value);
	}

	/**
	 * 事業部コード. .<p>
	 *
	 */
	public String dept_cd() {
		return getConstString(offset + 1, $dept_cd);
	}

	/**
	 * 事業部コード. .<p>
	 *
	 */
	public void dept_cd(String value) {
		setConstString(offset + 1, $dept_cd, value);
	}

	/**
	 * 製品コード. .<p>
	 *
	 */
	public String prod_cd() {
		return getConstString(offset + 2, $prod_cd);
	}

	/**
	 * 製品コード. .<p>
	 *
	 */
	public void prod_cd(String value) {
		setConstString(offset + 2, $prod_cd, value);
	}

	/**
	 * 年月. .<p>
	 *
	 */
	public String ym() {
		return getConstString(offset + 3, $ym);
	}

	/**
	 * 年月. .<p>
	 *
	 */
	public void ym(String value) {
		setConstString(offset + 3, $ym, value);
	}

	/**
	 * 作業区分. .<p>
	 *
	 */
	public String ope_typ() {
		return getConstString(offset + 4, $ope_typ);
	}

	/**
	 * 作業区分. .<p>
	 *
	 */
	public void ope_typ(String value) {
		setConstString(offset + 4, $ope_typ, value);
	}

	public String getString(String name) {
		if ($issue_typ.equalsIgnoreCase(name)) {
			return issue_typ();
		}
		if ($dept_cd.equalsIgnoreCase(name)) {
			return dept_cd();
		}
		if ($prod_cd.equalsIgnoreCase(name)) {
			return prod_cd();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ope_typ.equalsIgnoreCase(name)) {
			return ope_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($issue_typ.equalsIgnoreCase(name)) {
			return issue_typ();
		}
		if ($dept_cd.equalsIgnoreCase(name)) {
			return dept_cd();
		}
		if ($prod_cd.equalsIgnoreCase(name)) {
			return prod_cd();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ope_typ.equalsIgnoreCase(name)) {
			return ope_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($issue_typ.equalsIgnoreCase(name)) {
			issue_typ(value);
			return;
		}
		if ($dept_cd.equalsIgnoreCase(name)) {
			dept_cd(value);
			return;
		}
		if ($prod_cd.equalsIgnoreCase(name)) {
			prod_cd(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ope_typ.equalsIgnoreCase(name)) {
			ope_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($issue_typ.equalsIgnoreCase(name)) {
			issue_typ(value);
			return;
		}
		if ($dept_cd.equalsIgnoreCase(name)) {
			dept_cd(value);
			return;
		}
		if ($prod_cd.equalsIgnoreCase(name)) {
			prod_cd(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ope_typ.equalsIgnoreCase(name)) {
			ope_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
