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
 * "原価計算工数配賦ビュー // Cost calculation man-hour allocation view"DBコンテナRowクラスです。<p>
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
 *  	<td>alc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦パタンＣＤ</td>
 *  	<td>Allocation pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wk_cost_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数管理ＣＤ</td>
 *  	<td>Work element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tr_alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振替配賦科目ＣＤ</td>
 *  	<td>Transfer allocation account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tr_alc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦パタンＣＤ</td>
 *  	<td>Allocation pattern cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tr_expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ALC_WK_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ALC_WK";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public static final String $alc_ptn_cd = "alc_ptn_cd";
	private static final MCPermColumnInfo _alc_ptn_cd = createColumnInfo("alc_ptn_cd");
	public final MCStringPermColumn alc_ptn_cd = createStringColumn(_alc_ptn_cd);
	
	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	private static final MCPermColumnInfo _wk_cost_cd = createColumnInfo("wk_cost_cd");
	public final MCStringPermColumn wk_cost_cd = createStringColumn(_wk_cost_cd);
	
	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public static final String $tr_alc_ac_cd = "tr_alc_ac_cd";
	private static final MCPermColumnInfo _tr_alc_ac_cd = createColumnInfo("tr_alc_ac_cd");
	public final MCStringPermColumn tr_alc_ac_cd = createStringColumn(_tr_alc_ac_cd);
	
	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public static final String $tr_alc_ptn_cd = "tr_alc_ptn_cd";
	private static final MCPermColumnInfo _tr_alc_ptn_cd = createColumnInfo("tr_alc_ptn_cd");
	public final MCStringPermColumn tr_alc_ptn_cd = createStringColumn(_tr_alc_ptn_cd);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $tr_expns_cd = "tr_expns_cd";
	private static final MCPermColumnInfo _tr_expns_cd = createColumnInfo("tr_expns_cd");
	public final MCStringPermColumn tr_expns_cd = createStringColumn(_tr_expns_cd);
	
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta tr_alc_ac_cd_META = createCommonMeta($tr_alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta tr_alc_ptn_cd_META = createCommonMeta($tr_alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta tr_expns_cd_META = createCommonMeta($tr_expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ALC_WK_R> constMetas = new ConstMetaList<MGVM_ALC_WK_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			alc_ptn_cd_META,
			wk_cost_cd_META,
			tr_alc_ac_cd_META,
			tr_alc_ptn_cd_META,
			tr_expns_cd_META
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
	protected MGVM_ALC_WK_R(ConstMetaList<? extends MGVM_ALC_WK_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ALC_WK_R(ConstMetaList<? extends MGVM_ALC_WK_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ALC_WK_R.$alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_WK_R.$alc_ptn_cd,
				"alc_ptn_cd",
				alc_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_WK_R.$wk_cost_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_WK_R.$wk_cost_cd,
				"wk_cost_cd",
				wk_cost_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_WK_R.$tr_alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_WK_R.$tr_alc_ac_cd,
				"tr_alc_ac_cd",
				tr_alc_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_WK_R.$tr_alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_WK_R.$tr_alc_ptn_cd,
				"tr_alc_ptn_cd",
				tr_alc_ptn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_WK_R.$tr_expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_WK_R.$tr_expns_cd,
				"tr_expns_cd",
				tr_expns_cd,
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
	public static MGVM_ALC_WK_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ALC_WK_R create(String alias) {
		MGVM_ALC_WK_R row = new MGVM_ALC_WK_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ALC_WK_R createByName(T proto) {
		MGVM_ALC_WK_R row = MGVM_ALC_WK_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_WK_R clone() {
		return (MGVM_ALC_WK_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_WK_R createInstance() {
		return (MGVM_ALC_WK_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_WK_R getValues(String... names) {
		return (MGVM_ALC_WK_R) super.getValues(names);
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
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public String alc_ptn_cd() {
		return getConstString(offset + 0, $alc_ptn_cd);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		setConstString(offset + 0, $alc_ptn_cd, value);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 1, $wk_cost_cd);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 1, $wk_cost_cd, value);
	}

	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public String tr_alc_ac_cd() {
		return getConstString(offset + 2, $tr_alc_ac_cd);
	}

	/**
	 * 振替配賦科目ＣＤ. Transfer allocation account cd..<p>
	 *
	 */
	public void tr_alc_ac_cd(String value) {
		setConstString(offset + 2, $tr_alc_ac_cd, value);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public String tr_alc_ptn_cd() {
		return getConstString(offset + 3, $tr_alc_ptn_cd);
	}

	/**
	 * 配賦パタンＣＤ. Allocation pattern cd..<p>
	 *
	 */
	public void tr_alc_ptn_cd(String value) {
		setConstString(offset + 3, $tr_alc_ptn_cd, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String tr_expns_cd() {
		return getConstString(offset + 4, $tr_expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void tr_expns_cd(String value) {
		setConstString(offset + 4, $tr_expns_cd, value);
	}

	public String getString(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($tr_alc_ac_cd.equalsIgnoreCase(name)) {
			return tr_alc_ac_cd();
		}
		if ($tr_alc_ptn_cd.equalsIgnoreCase(name)) {
			return tr_alc_ptn_cd();
		}
		if ($tr_expns_cd.equalsIgnoreCase(name)) {
			return tr_expns_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($tr_alc_ac_cd.equalsIgnoreCase(name)) {
			return tr_alc_ac_cd();
		}
		if ($tr_alc_ptn_cd.equalsIgnoreCase(name)) {
			return tr_alc_ptn_cd();
		}
		if ($tr_expns_cd.equalsIgnoreCase(name)) {
			return tr_expns_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($tr_alc_ac_cd.equalsIgnoreCase(name)) {
			tr_alc_ac_cd(value);
			return;
		}
		if ($tr_alc_ptn_cd.equalsIgnoreCase(name)) {
			tr_alc_ptn_cd(value);
			return;
		}
		if ($tr_expns_cd.equalsIgnoreCase(name)) {
			tr_expns_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($tr_alc_ac_cd.equalsIgnoreCase(name)) {
			tr_alc_ac_cd(value);
			return;
		}
		if ($tr_alc_ptn_cd.equalsIgnoreCase(name)) {
			tr_alc_ptn_cd(value);
			return;
		}
		if ($tr_expns_cd.equalsIgnoreCase(name)) {
			tr_expns_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
