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
 * "計算グループカテゴリワーク // Calculation group category work"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_ctg_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算カテゴリ区分</td>
 *  	<td>Calculation category type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ctg_prio</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>優先順位</td>
 *  	<td>Priority</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_CALC_GRP_CTG_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_CALC_GRP_CTG";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 計算カテゴリ区分. Calculation category type.<p>
	 *
	 */
	public static final String $calc_ctg_typ = "calc_ctg_typ";
	private static final MCPermColumnInfo _calc_ctg_typ = createColumnInfo("calc_ctg_typ");
	public final MCStringPermColumn calc_ctg_typ = createStringColumn(_calc_ctg_typ);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public static final String $ctg_prio = "ctg_prio";
	private static final MCPermColumnInfo _ctg_prio = createColumnInfo("ctg_prio");
	public final MCNumberPermColumn ctg_prio = createNumberColumn(_ctg_prio);
	
	public static final MCMeta calc_ctg_typ_META = createCommonMeta($calc_ctg_typ, mcframe.commonMA.meta.MA_META.CALC_CTG_TYP);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta ctg_prio_META = createCommonMeta($ctg_prio, mcframe.commonMA.meta.MA_META.INT2);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_CALC_GRP_CTG_R> constMetas = new ConstMetaList<MGW_CALC_GRP_CTG_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_ctg_typ_META,
			calc_ctg_cd_META,
			ctg_prio_META
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
	protected MGW_CALC_GRP_CTG_R(ConstMetaList<? extends MGW_CALC_GRP_CTG_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_CALC_GRP_CTG_R(ConstMetaList<? extends MGW_CALC_GRP_CTG_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_CALC_GRP_CTG_R.$calc_ctg_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_CALC_GRP_CTG_R.$calc_ctg_typ,
				"calc_ctg_typ",
				calc_ctg_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_CALC_GRP_CTG_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_CALC_GRP_CTG_R.$calc_ctg_cd,
				"calc_ctg_cd",
				calc_ctg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_CALC_GRP_CTG_R.$ctg_prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_CALC_GRP_CTG_R.$ctg_prio,
				"ctg_prio",
				ctg_prio,
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
	public static MGW_CALC_GRP_CTG_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_CALC_GRP_CTG_R create(String alias) {
		MGW_CALC_GRP_CTG_R row = new MGW_CALC_GRP_CTG_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_CALC_GRP_CTG_R createByName(T proto) {
		MGW_CALC_GRP_CTG_R row = MGW_CALC_GRP_CTG_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_CALC_GRP_CTG_R clone() {
		return (MGW_CALC_GRP_CTG_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_CALC_GRP_CTG_R createInstance() {
		return (MGW_CALC_GRP_CTG_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_CALC_GRP_CTG_R getValues(String... names) {
		return (MGW_CALC_GRP_CTG_R) super.getValues(names);
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
	 * 計算カテゴリ区分. Calculation category type.<p>
	 *
	 */
	public String calc_ctg_typ() {
		return getConstString(offset + 0, $calc_ctg_typ);
	}

	/**
	 * 計算カテゴリ区分. Calculation category type.<p>
	 *
	 */
	public void calc_ctg_typ(String value) {
		setConstString(offset + 0, $calc_ctg_typ, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 1, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 1, $calc_ctg_cd, value);
	}

	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public MCNumber ctg_prio() {
		return getConstNumber(offset + 2, $ctg_prio);
	}

	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public void ctg_prio(MCNumber value) {
		setConstNumber(offset + 2, $ctg_prio, value);
	}
	
	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public void ctg_prio(int value) {
		setConstNumber(offset + 2, $ctg_prio, value);
	}
	
	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public void ctg_prio(long value) {
		setConstNumber(offset + 2, $ctg_prio, value);
	}
	
	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public void ctg_prio(float value) {
		setConstNumber(offset + 2, $ctg_prio, value);
	}
	
	/**
	 * 優先順位. Priority.<p>
	 *
	 */
	public void ctg_prio(double value) {
		setConstNumber(offset + 2, $ctg_prio, value);
	}
	
	public String getString(String name) {
		if ($calc_ctg_typ.equalsIgnoreCase(name)) {
			return calc_ctg_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			return ctg_prio();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($calc_ctg_typ.equalsIgnoreCase(name)) {
			return calc_ctg_typ();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			return ctg_prio();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_ctg_typ.equalsIgnoreCase(name)) {
			calc_ctg_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_ctg_typ.equalsIgnoreCase(name)) {
			calc_ctg_typ(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($ctg_prio.equalsIgnoreCase(name)) {
			ctg_prio(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
