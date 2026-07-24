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
 * "売上集計品目体系階層ワーク // Sales aggregated item system hierarchy work"DBコンテナRowクラスです。<p>
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
 *  	<td>sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売品目体系ＣＤ</td>
 *  	<td>Sales item system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>crnt_sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指定階層品目体系ＣＤ</td>
 *  	<td>Specified hierarchy item system cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dw_sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>下位品目体系ＣＤ</td>
 *  	<td>Lower item system cd.</td>
 *  </tr>
 *  <tr >
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
public class MSW_SLS_SUM_IG_LVL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SLS_SUM_IG_LVL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	private static final MCPermColumnInfo _sls_itm_grp_cd = createColumnInfo("sls_itm_grp_cd");
	public final MCStringPermColumn sls_itm_grp_cd = createStringColumn(_sls_itm_grp_cd);
	
	/**
	 * 指定階層品目体系ＣＤ. Specified hierarchy item system cd..<p>
	 *
	 */
	public static final String $crnt_sls_itm_grp_cd = "crnt_sls_itm_grp_cd";
	private static final MCPermColumnInfo _crnt_sls_itm_grp_cd = createColumnInfo("crnt_sls_itm_grp_cd");
	public final MCStringPermColumn crnt_sls_itm_grp_cd = createStringColumn(_crnt_sls_itm_grp_cd);
	
	/**
	 * 下位品目体系ＣＤ. Lower item system cd..<p>
	 *
	 */
	public static final String $dw_sls_itm_grp_cd = "dw_sls_itm_grp_cd";
	private static final MCPermColumnInfo _dw_sls_itm_grp_cd = createColumnInfo("dw_sls_itm_grp_cd");
	public final MCStringPermColumn dw_sls_itm_grp_cd = createStringColumn(_dw_sls_itm_grp_cd);
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public static final String $lvl = "lvl";
	private static final MCPermColumnInfo _lvl = createColumnInfo("lvl");
	public final MCNumberPermColumn lvl = createNumberColumn(_lvl);
	
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta crnt_sls_itm_grp_cd_META = createCommonMeta($crnt_sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta dw_sls_itm_grp_cd_META = createCommonMeta($dw_sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta lvl_META = createCommonMeta($lvl, mcframe.commonMA.meta.MA_META.INT4);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_SLS_SUM_IG_LVL_R> constMetas = new ConstMetaList<MSW_SLS_SUM_IG_LVL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			sls_itm_grp_cd_META,
			crnt_sls_itm_grp_cd_META,
			dw_sls_itm_grp_cd_META,
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
	protected MSW_SLS_SUM_IG_LVL_R(ConstMetaList<? extends MSW_SLS_SUM_IG_LVL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SLS_SUM_IG_LVL_R(ConstMetaList<? extends MSW_SLS_SUM_IG_LVL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SLS_SUM_IG_LVL_R.$sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_IG_LVL_R.$sls_itm_grp_cd,
				"sls_itm_grp_cd",
				sls_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_IG_LVL_R.$crnt_sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_IG_LVL_R.$crnt_sls_itm_grp_cd,
				"crnt_sls_itm_grp_cd",
				crnt_sls_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_IG_LVL_R.$dw_sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLS_SUM_IG_LVL_R.$dw_sls_itm_grp_cd,
				"dw_sls_itm_grp_cd",
				dw_sls_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLS_SUM_IG_LVL_R.$lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLS_SUM_IG_LVL_R.$lvl,
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
	public static MSW_SLS_SUM_IG_LVL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SLS_SUM_IG_LVL_R create(String alias) {
		MSW_SLS_SUM_IG_LVL_R row = new MSW_SLS_SUM_IG_LVL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SLS_SUM_IG_LVL_R createByName(T proto) {
		MSW_SLS_SUM_IG_LVL_R row = MSW_SLS_SUM_IG_LVL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_IG_LVL_R clone() {
		return (MSW_SLS_SUM_IG_LVL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_IG_LVL_R createInstance() {
		return (MSW_SLS_SUM_IG_LVL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLS_SUM_IG_LVL_R getValues(String... names) {
		return (MSW_SLS_SUM_IG_LVL_R) super.getValues(names);
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
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 0, $sls_itm_grp_cd);
	}

	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 0, $sls_itm_grp_cd, value);
	}

	/**
	 * 指定階層品目体系ＣＤ. Specified hierarchy item system cd..<p>
	 *
	 */
	public String crnt_sls_itm_grp_cd() {
		return getConstString(offset + 1, $crnt_sls_itm_grp_cd);
	}

	/**
	 * 指定階層品目体系ＣＤ. Specified hierarchy item system cd..<p>
	 *
	 */
	public void crnt_sls_itm_grp_cd(String value) {
		setConstString(offset + 1, $crnt_sls_itm_grp_cd, value);
	}

	/**
	 * 下位品目体系ＣＤ. Lower item system cd..<p>
	 *
	 */
	public String dw_sls_itm_grp_cd() {
		return getConstString(offset + 2, $dw_sls_itm_grp_cd);
	}

	/**
	 * 下位品目体系ＣＤ. Lower item system cd..<p>
	 *
	 */
	public void dw_sls_itm_grp_cd(String value) {
		setConstString(offset + 2, $dw_sls_itm_grp_cd, value);
	}

	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public MCNumber lvl() {
		return getConstNumber(offset + 3, $lvl);
	}

	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(MCNumber value) {
		setConstNumber(offset + 3, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(int value) {
		setConstNumber(offset + 3, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(long value) {
		setConstNumber(offset + 3, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(float value) {
		setConstNumber(offset + 3, $lvl, value);
	}
	
	/**
	 * 階層レベル. Hierarchy level.<p>
	 *
	 */
	public void lvl(double value) {
		setConstNumber(offset + 3, $lvl, value);
	}
	
	public String getString(String name) {
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($crnt_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return crnt_sls_itm_grp_cd();
		}
		if ($dw_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return dw_sls_itm_grp_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($crnt_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return crnt_sls_itm_grp_cd();
		}
		if ($dw_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return dw_sls_itm_grp_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($crnt_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			crnt_sls_itm_grp_cd(value);
			return;
		}
		if ($dw_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			dw_sls_itm_grp_cd(value);
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

	public void setStringNE(String name, String value) {
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($crnt_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			crnt_sls_itm_grp_cd(value);
			return;
		}
		if ($dw_sls_itm_grp_cd.equalsIgnoreCase(name)) {
			dw_sls_itm_grp_cd(value);
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

}
