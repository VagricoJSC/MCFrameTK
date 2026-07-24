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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "計算対象一次配賦基準選択ワーク // (Calculation) Departmental alloc. basis selection work"DBコンテナRowクラスです。<p>
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
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
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
 *  	<td>K</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_rate_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦基準ＣＤ</td>
 *  	<td>Departmental alloc. basis cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替配賦科目ＣＤ</td>
 *  	<td>Transfer allocation account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替ワーキンググループＣＤ</td>
 *  	<td>Transfer WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_dpt_ptn</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦先部門パタン</td>
 *  	<td>Allocation destination department pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fin_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>終了ＦＬＧ</td>
 *  	<td>Terminate flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_PRE_ALC_RATE_SEL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_PRE_ALC_RATE_SEL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public static final String $pre_alc_rate_cd = "pre_alc_rate_cd";
	private static final MCPermColumnInfo _pre_alc_rate_cd = createColumnInfo("pre_alc_rate_cd");
	public final MCStringPermColumn pre_alc_rate_cd = createStringColumn(_pre_alc_rate_cd);
	
	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public static final String $trd_alc_ac_cd = "trd_alc_ac_cd";
	private static final MCPermColumnInfo _trd_alc_ac_cd = createColumnInfo("trd_alc_ac_cd");
	public final MCStringPermColumn trd_alc_ac_cd = createStringColumn(_trd_alc_ac_cd);
	
	/**
	 * 振替ワーキンググループＣＤ. Transfer WG cd..<p>
	 *
	 */
	public static final String $trd_wg_cd = "trd_wg_cd";
	private static final MCPermColumnInfo _trd_wg_cd = createColumnInfo("trd_wg_cd");
	public final MCStringPermColumn trd_wg_cd = createStringColumn(_trd_wg_cd);
	
	/**
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public static final String $pre_alc_dpt_ptn = "pre_alc_dpt_ptn";
	private static final MCPermColumnInfo _pre_alc_dpt_ptn = createColumnInfo("pre_alc_dpt_ptn");
	public final MCStringPermColumn pre_alc_dpt_ptn = createStringColumn(_pre_alc_dpt_ptn);
	
	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public static final String $fin_flg = "fin_flg";
	private static final MCPermColumnInfo _fin_flg = createColumnInfo("fin_flg");
	public final MCBooleanPermColumn fin_flg = createBooleanColumn(_fin_flg);
	
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta pre_alc_rate_cd_META = createCommonMeta($pre_alc_rate_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_RATE_CD);
	public static final MCMeta trd_alc_ac_cd_META = createCommonMeta($trd_alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta trd_wg_cd_META = createCommonMeta($trd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta pre_alc_dpt_ptn_META = createCommonMeta($pre_alc_dpt_ptn, mcframe.commonMA.meta.MA_META.PRE_ALC_DPT_PTN);
	public static final MCMeta fin_flg_META = createCommonMeta($fin_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_PRE_ALC_RATE_SEL_R> constMetas = new ConstMetaList<MGW_PRE_ALC_RATE_SEL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wg_cd_META,
			alc_ac_cd_META,
			dpt_cd_META,
			pre_alc_rate_cd_META,
			trd_alc_ac_cd_META,
			trd_wg_cd_META,
			pre_alc_dpt_ptn_META,
			fin_flg_META
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
	protected MGW_PRE_ALC_RATE_SEL_R(ConstMetaList<? extends MGW_PRE_ALC_RATE_SEL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_PRE_ALC_RATE_SEL_R(ConstMetaList<? extends MGW_PRE_ALC_RATE_SEL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$alc_ac_cd,
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
			MGW_PRE_ALC_RATE_SEL_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$pre_alc_rate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$pre_alc_rate_cd,
				"pre_alc_rate_cd",
				pre_alc_rate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$trd_alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$trd_alc_ac_cd,
				"trd_alc_ac_cd",
				trd_alc_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$trd_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$trd_wg_cd,
				"trd_wg_cd",
				trd_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$pre_alc_dpt_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_PRE_ALC_RATE_SEL_R.$pre_alc_dpt_ptn,
				"pre_alc_dpt_ptn",
				pre_alc_dpt_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_PRE_ALC_RATE_SEL_R.$fin_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_PRE_ALC_RATE_SEL_R.$fin_flg,
				"fin_flg",
				fin_flg,
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
	public static MGW_PRE_ALC_RATE_SEL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_PRE_ALC_RATE_SEL_R create(String alias) {
		MGW_PRE_ALC_RATE_SEL_R row = new MGW_PRE_ALC_RATE_SEL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_PRE_ALC_RATE_SEL_R createByName(T proto) {
		MGW_PRE_ALC_RATE_SEL_R row = MGW_PRE_ALC_RATE_SEL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PRE_ALC_RATE_SEL_R clone() {
		return (MGW_PRE_ALC_RATE_SEL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PRE_ALC_RATE_SEL_R createInstance() {
		return (MGW_PRE_ALC_RATE_SEL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PRE_ALC_RATE_SEL_R getValues(String... names) {
		return (MGW_PRE_ALC_RATE_SEL_R) super.getValues(names);
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
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
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 2, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 2, $dpt_cd, value);
	}

	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public String pre_alc_rate_cd() {
		return getConstString(offset + 3, $pre_alc_rate_cd);
	}

	/**
	 * 一次配賦基準ＣＤ. Departmental alloc. basis cd..<p>
	 *
	 */
	public void pre_alc_rate_cd(String value) {
		setConstString(offset + 3, $pre_alc_rate_cd, value);
	}

	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public String trd_alc_ac_cd() {
		return getConstString(offset + 4, $trd_alc_ac_cd);
	}

	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public void trd_alc_ac_cd(String value) {
		setConstString(offset + 4, $trd_alc_ac_cd, value);
	}

	/**
	 * 振替ワーキンググループＣＤ. Transfer WG cd..<p>
	 *
	 */
	public String trd_wg_cd() {
		return getConstString(offset + 5, $trd_wg_cd);
	}

	/**
	 * 振替ワーキンググループＣＤ. Transfer WG cd..<p>
	 *
	 */
	public void trd_wg_cd(String value) {
		setConstString(offset + 5, $trd_wg_cd, value);
	}

	/**
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public String pre_alc_dpt_ptn() {
		return getConstString(offset + 6, $pre_alc_dpt_ptn);
	}

	/**
	 * 配賦先部門パタン. Allocation destination department pattern.<p>
	 *
	 */
	public void pre_alc_dpt_ptn(String value) {
		setConstString(offset + 6, $pre_alc_dpt_ptn, value);
	}

	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public boolean fin_flg() {
		return getConstBoolean(offset + 7, $fin_flg);
	}

	/**
	 * 終了ＦＬＧ. Terminate flg..<p>
	 *
	 */
	public void fin_flg(boolean value) {
		setConstBoolean(offset + 7, $fin_flg, value);
	}

	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($trd_alc_ac_cd.equalsIgnoreCase(name)) {
			return trd_alc_ac_cd();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		return super.getString(name);
	}

	public boolean getBoolean(String name) {
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			return pre_alc_rate_cd();
		}
		if ($trd_alc_ac_cd.equalsIgnoreCase(name)) {
			return trd_alc_ac_cd();
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			return trd_wg_cd();
		}
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			return pre_alc_dpt_ptn();
		}
		return super.getStringNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($fin_flg.equalsIgnoreCase(name)) {
			return fin_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($trd_alc_ac_cd.equalsIgnoreCase(name)) {
			trd_alc_ac_cd(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		super.setString(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($pre_alc_rate_cd.equalsIgnoreCase(name)) {
			pre_alc_rate_cd(value);
			return;
		}
		if ($trd_alc_ac_cd.equalsIgnoreCase(name)) {
			trd_alc_ac_cd(value);
			return;
		}
		if ($trd_wg_cd.equalsIgnoreCase(name)) {
			trd_wg_cd(value);
			return;
		}
		if ($pre_alc_dpt_ptn.equalsIgnoreCase(name)) {
			pre_alc_dpt_ptn(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($fin_flg.equalsIgnoreCase(name)) {
			fin_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
