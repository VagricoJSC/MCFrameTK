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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算費目ビュー // Cost calculation cost element view"DBコンテナRowクラスです。<p>
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
 *  	<td>expns_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目区分</td>
 *  	<td>Cost element type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>direct_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>直間区分</td>
 *  	<td>Direct/Indirect type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>var_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>固変区分</td>
 *  	<td>Constant/variable type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_EXPNS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_EXPNS";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public static final String $expns_typ = "expns_typ";
	private static final MCPermColumnInfo _expns_typ = createColumnInfo("expns_typ");
	public final MCStringPermColumn expns_typ = createStringColumn(_expns_typ);
	
	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public static final String $direct_typ = "direct_typ";
	private static final MCPermColumnInfo _direct_typ = createColumnInfo("direct_typ");
	public final MCStringPermColumn direct_typ = createStringColumn(_direct_typ);
	
	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public static final String $var_typ = "var_typ";
	private static final MCPermColumnInfo _var_typ = createColumnInfo("var_typ");
	public final MCStringPermColumn var_typ = createStringColumn(_var_typ);
	
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta expns_typ_META = createCommonMeta($expns_typ, mcframe.commonMA.meta.MA_META.EXPNS_TYP);
	public static final MCMeta direct_typ_META = createCommonMeta($direct_typ, mcframe.commonMA.meta.MA_META.DIRECT_TYP);
	public static final MCMeta var_typ_META = createCommonMeta($var_typ, mcframe.commonMA.meta.MA_META.VAR_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_EXPNS_R> constMetas = new ConstMetaList<MGVM_EXPNS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			expns_cd_META,
			expns_typ_META,
			direct_typ_META,
			var_typ_META
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
	protected MGVM_EXPNS_R(ConstMetaList<? extends MGVM_EXPNS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_EXPNS_R(ConstMetaList<? extends MGVM_EXPNS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_EXPNS_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_EXPNS_R.$expns_cd,
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
			MGVM_EXPNS_R.$expns_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_EXPNS_R.$expns_typ,
				"expns_typ",
				expns_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_EXPNS_R.$direct_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_EXPNS_R.$direct_typ,
				"direct_typ",
				direct_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_EXPNS_R.$var_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_EXPNS_R.$var_typ,
				"var_typ",
				var_typ,
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
	public static MGVM_EXPNS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_EXPNS_R create(String alias) {
		MGVM_EXPNS_R row = new MGVM_EXPNS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_EXPNS_R createByName(T proto) {
		MGVM_EXPNS_R row = MGVM_EXPNS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_EXPNS_R clone() {
		return (MGVM_EXPNS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_EXPNS_R createInstance() {
		return (MGVM_EXPNS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_EXPNS_R getValues(String... names) {
		return (MGVM_EXPNS_R) super.getValues(names);
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
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 0, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 0, $expns_cd, value);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public String expns_typ() {
		return getConstString(offset + 1, $expns_typ);
	}

	/**
	 * 費目区分. Cost element type.<p>
	 *
	 */
	public void expns_typ(String value) {
		setConstString(offset + 1, $expns_typ, value);
	}

	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public String direct_typ() {
		return getConstString(offset + 2, $direct_typ);
	}

	/**
	 * 直間区分. Direct/Indirect type.<p>
	 *
	 */
	public void direct_typ(String value) {
		setConstString(offset + 2, $direct_typ, value);
	}

	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public String var_typ() {
		return getConstString(offset + 3, $var_typ);
	}

	/**
	 * 固変区分. Constant/variable type.<p>
	 *
	 */
	public void var_typ(String value) {
		setConstString(offset + 3, $var_typ, value);
	}

	public String getString(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			return expns_typ();
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			return direct_typ();
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			return var_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($expns_typ.equalsIgnoreCase(name)) {
			expns_typ(value);
			return;
		}
		if ($direct_typ.equalsIgnoreCase(name)) {
			direct_typ(value);
			return;
		}
		if ($var_typ.equalsIgnoreCase(name)) {
			var_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
