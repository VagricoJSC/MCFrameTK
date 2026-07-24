package mcframe.serverMA.dbc;

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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価部門構成マスタ // Cost dept. structure master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>par_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親部門ＣＤ</td>
 *  	<td>Parent dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程無ＦＬＧ</td>
 *  	<td>No operation flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_DPT_CONFIG_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_DPT_CONFIG_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 親部門ＣＤ. Parent dept. cd..<p>
	 *
	 */
	public static final String $par_dpt_cd = "par_dpt_cd";
	private static final MCPermColumnInfo _par_dpt_cd = createColumnInfo("par_dpt_cd");
	public final MCStringPermColumn par_dpt_cd = createStringColumn(_par_dpt_cd);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程無ＦＬＧ. No operation flg..<p>
	 *
	 */
	public static final String $oper_null_flg = "oper_null_flg";
	private static final MCPermColumnInfo _oper_null_flg = createColumnInfo("oper_null_flg");
	public final MCBooleanPermColumn oper_null_flg = createBooleanColumn(_oper_null_flg);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	public static final MCMeta par_dpt_cd_META = createCommonMeta($par_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_null_flg_META = createCommonMeta($oper_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_DPT_CONFIG_KEY_R> constMetas = new ConstMetaList<MAW_DPT_CONFIG_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			par_dpt_cd_META,
			dpt_cd_META,
			loc_cd_META,
			oper_cd_META,
			oper_null_flg_META,
			term_META
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
	protected MAW_DPT_CONFIG_KEY_R(ConstMetaList<? extends MAW_DPT_CONFIG_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_DPT_CONFIG_KEY_R(ConstMetaList<? extends MAW_DPT_CONFIG_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$par_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_DPT_CONFIG_KEY_R.$par_dpt_cd,
				"par_dpt_cd",
				par_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_DPT_CONFIG_KEY_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_DPT_CONFIG_KEY_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_DPT_CONFIG_KEY_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$oper_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAW_DPT_CONFIG_KEY_R.$oper_null_flg,
				"oper_null_flg",
				oper_null_flg,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_DPT_CONFIG_KEY_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_DPT_CONFIG_KEY_R.$term,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_DPT_CONFIG_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_DPT_CONFIG_KEY_R create(String alias) {
		MAW_DPT_CONFIG_KEY_R row = new MAW_DPT_CONFIG_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_DPT_CONFIG_KEY_R createByName(T proto) {
		MAW_DPT_CONFIG_KEY_R row = MAW_DPT_CONFIG_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_DPT_CONFIG_KEY_R clone() {
		return (MAW_DPT_CONFIG_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_DPT_CONFIG_KEY_R createInstance() {
		return (MAW_DPT_CONFIG_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_DPT_CONFIG_KEY_R getValues(String... names) {
		return (MAW_DPT_CONFIG_KEY_R) super.getValues(names);
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
	 * 親部門ＣＤ. Parent dept. cd..<p>
	 *
	 */
	public String par_dpt_cd() {
		return getConstString(offset + 0, $par_dpt_cd);
	}

	/**
	 * 親部門ＣＤ. Parent dept. cd..<p>
	 *
	 */
	public void par_dpt_cd(String value) {
		setConstString(offset + 0, $par_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 2, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 2, $loc_cd, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 3, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 3, $oper_cd, value);
	}

	/**
	 * 工程無ＦＬＧ. No operation flg..<p>
	 *
	 */
	public boolean oper_null_flg() {
		return getConstBoolean(offset + 4, $oper_null_flg);
	}

	/**
	 * 工程無ＦＬＧ. No operation flg..<p>
	 *
	 */
	public void oper_null_flg(boolean value) {
		setConstBoolean(offset + 4, $oper_null_flg, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 5, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 5, $term, value);
	}

	public String getString(String name) {
		if ($par_dpt_cd.equalsIgnoreCase(name)) {
			return par_dpt_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($oper_null_flg.equalsIgnoreCase(name)) {
			return oper_null_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($par_dpt_cd.equalsIgnoreCase(name)) {
			return par_dpt_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($oper_null_flg.equalsIgnoreCase(name)) {
			return oper_null_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($par_dpt_cd.equalsIgnoreCase(name)) {
			par_dpt_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($oper_null_flg.equalsIgnoreCase(name)) {
			oper_null_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($par_dpt_cd.equalsIgnoreCase(name)) {
			par_dpt_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($oper_null_flg.equalsIgnoreCase(name)) {
			oper_null_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
