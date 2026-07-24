package mcframe.serverMS.dbc;

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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "売上集計部門階層ワーク // Sales aggregated dept. hierarchy work"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>crnt_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指定階層部門ＣＤ</td>
 *  	<td>Specified hierarchy dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dw_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下位部門ＣＤ</td>
 *  	<td>Lower dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lvl</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>階層レベル</td>
 *  	<td>Hierarchy level</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SLS_SUM_DPT_LVL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SLS_SUM_DPT_LVL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 指定階層部門ＣＤ. Specified hierarchy dept. cd..<p>
	 *
	 */
	public static final String $crnt_dpt_cd = "crnt_dpt_cd";
	private static final MCPermColumnInfo _crnt_dpt_cd = createColumnInfo("crnt_dpt_cd");
	public final MCStringPermColumn crnt_dpt_cd = createStringColumn(_crnt_dpt_cd);
	
	/**
	 * 下位部門ＣＤ. Lower dept. cd..<p>
	 *
	 */
	public static final String $dw_dpt_cd = "dw_dpt_cd";
	private static final MCPermColumnInfo _dw_dpt_cd = createColumnInfo("dw_dpt_cd");
	public final MCStringPermColumn dw_dpt_cd = createStringColumn(_dw_dpt_cd);
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public static final String $lvl = "lvl";
	private static final MCPermColumnInfo _lvl = createColumnInfo("lvl");
	public final MCNumberPermColumn lvl = createNumberColumn(_lvl);
	
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta crnt_dpt_cd_META = createCommonMeta($crnt_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dw_dpt_cd_META = createCommonMeta($dw_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta lvl_META = createCommonMeta($lvl, mcframe.commonMA.meta.MA_META.INT4);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_SLS_SUM_DPT_LVL_R> constMetas = new ConstMetaList<MSW_SLS_SUM_DPT_LVL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ym_META,
			sls_dpt_cd_META,
			crnt_dpt_cd_META,
			dw_dpt_cd_META,
			lvl_META
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
	protected MSW_SLS_SUM_DPT_LVL_R(ConstMetaList<? extends MSW_SLS_SUM_DPT_LVL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SLS_SUM_DPT_LVL_R(ConstMetaList<? extends MSW_SLS_SUM_DPT_LVL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SLS_SUM_DPT_LVL_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SLS_SUM_DPT_LVL_R.$ym,
				"ym",
				ym,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_DPT_LVL_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_DPT_LVL_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_DPT_LVL_R.$crnt_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_DPT_LVL_R.$crnt_dpt_cd,
				"crnt_dpt_cd",
				crnt_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_DPT_LVL_R.$dw_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_DPT_LVL_R.$dw_dpt_cd,
				"dw_dpt_cd",
				dw_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_DPT_LVL_R.$lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLS_SUM_DPT_LVL_R.$lvl,
				"lvl",
				lvl,
				false,
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
	public static MSW_SLS_SUM_DPT_LVL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SLS_SUM_DPT_LVL_R create(String alias) {
		MSW_SLS_SUM_DPT_LVL_R row = new MSW_SLS_SUM_DPT_LVL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SLS_SUM_DPT_LVL_R createByName(T proto) {
		MSW_SLS_SUM_DPT_LVL_R row = MSW_SLS_SUM_DPT_LVL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_DPT_LVL_R clone() {
		return (MSW_SLS_SUM_DPT_LVL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_DPT_LVL_R createInstance() {
		return (MSW_SLS_SUM_DPT_LVL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_DPT_LVL_R getValues(String... names) {
		return (MSW_SLS_SUM_DPT_LVL_R) super.getValues(names);
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
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 1, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 1, $sls_dpt_cd, value);
	}

	/**
	 * 指定階層部門ＣＤ. Specified hierarchy dept. cd..<p>
	 *
	 */
	public String crnt_dpt_cd() {
		return getConstString(offset + 2, $crnt_dpt_cd);
	}

	/**
	 * 指定階層部門ＣＤ. Specified hierarchy dept. cd..<p>
	 *
	 */
	public void crnt_dpt_cd(String value) {
		setConstString(offset + 2, $crnt_dpt_cd, value);
	}

	/**
	 * 下位部門ＣＤ. Lower dept. cd..<p>
	 *
	 */
	public String dw_dpt_cd() {
		return getConstString(offset + 3, $dw_dpt_cd);
	}

	/**
	 * 下位部門ＣＤ. Lower dept. cd..<p>
	 *
	 */
	public void dw_dpt_cd(String value) {
		setConstString(offset + 3, $dw_dpt_cd, value);
	}

	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public MCNumber lvl() {
		return getConstNumber(offset + 4, $lvl);
	}

	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(MCNumber value) {
		setConstNumber(offset + 4, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(int value) {
		setConstNumber(offset + 4, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(long value) {
		setConstNumber(offset + 4, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(float value) {
		setConstNumber(offset + 4, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(double value) {
		setConstNumber(offset + 4, $lvl, value);
	}
	
	public String getString(String name) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($crnt_dpt_cd.equalsIgnoreCase(name)) {
			return crnt_dpt_cd();
		}
		if ($dw_dpt_cd.equalsIgnoreCase(name)) {
			return dw_dpt_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($crnt_dpt_cd.equalsIgnoreCase(name)) {
			return crnt_dpt_cd();
		}
		if ($dw_dpt_cd.equalsIgnoreCase(name)) {
			return dw_dpt_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($crnt_dpt_cd.equalsIgnoreCase(name)) {
			crnt_dpt_cd(value);
			return;
		}
		if ($dw_dpt_cd.equalsIgnoreCase(name)) {
			dw_dpt_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($crnt_dpt_cd.equalsIgnoreCase(name)) {
			crnt_dpt_cd(value);
			return;
		}
		if ($dw_dpt_cd.equalsIgnoreCase(name)) {
			dw_dpt_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
