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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "配賦パタン選択マスタ // Allocation pattern selection master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>alc_ac_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦科目ＣＤ</td>
 *  	<td>Allocation account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dpt_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門配賦グループ</td>
 *  	<td>Dept. allocation group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>loc_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所配賦グループ</td>
 *  	<td>Location allocation group</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程配賦グループ</td>
 *  	<td>Operation allocation group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>bp_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先配賦グループ</td>
 *  	<td>BP allocation group</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ctg_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品群配賦グループ</td>
 *  	<td>Item category allocation group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目配賦グループ</td>
 *  	<td>Item allocation group</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_ALC_PTN_SEL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_ALC_PTN_SEL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public static final String $alc_ac_cd = "alc_ac_cd";
	private static final MCPermColumnInfo _alc_ac_cd = createColumnInfo("alc_ac_cd");
	public final MCStringPermColumn alc_ac_cd = createStringColumn(_alc_ac_cd);
	
	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public static final String $dpt_alc_grp = "dpt_alc_grp";
	private static final MCPermColumnInfo _dpt_alc_grp = createColumnInfo("dpt_alc_grp");
	public final MCStringPermColumn dpt_alc_grp = createStringColumn(_dpt_alc_grp);
	
	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public static final String $loc_alc_grp = "loc_alc_grp";
	private static final MCPermColumnInfo _loc_alc_grp = createColumnInfo("loc_alc_grp");
	public final MCStringPermColumn loc_alc_grp = createStringColumn(_loc_alc_grp);
	
	/**
	 * 工程配賦グループ. Operation allocation group.<p>
	 *
	 */
	public static final String $oper_alc_grp = "oper_alc_grp";
	private static final MCPermColumnInfo _oper_alc_grp = createColumnInfo("oper_alc_grp");
	public final MCStringPermColumn oper_alc_grp = createStringColumn(_oper_alc_grp);
	
	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public static final String $bp_alc_grp = "bp_alc_grp";
	private static final MCPermColumnInfo _bp_alc_grp = createColumnInfo("bp_alc_grp");
	public final MCStringPermColumn bp_alc_grp = createStringColumn(_bp_alc_grp);
	
	/**
	 * 品群配賦グループ. Item category allocation group.<p>
	 *
	 */
	public static final String $ctg_alc_grp = "ctg_alc_grp";
	private static final MCPermColumnInfo _ctg_alc_grp = createColumnInfo("ctg_alc_grp");
	public final MCStringPermColumn ctg_alc_grp = createStringColumn(_ctg_alc_grp);
	
	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public static final String $itm_alc_grp = "itm_alc_grp";
	private static final MCPermColumnInfo _itm_alc_grp = createColumnInfo("itm_alc_grp");
	public final MCStringPermColumn itm_alc_grp = createStringColumn(_itm_alc_grp);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	public static final MCMeta alc_ac_cd_META = createCommonMeta($alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);
	public static final MCMeta dpt_alc_grp_META = createCommonMeta($dpt_alc_grp, mcframe.commonMA.meta.MA_META.DPT_ALC_GRP);
	public static final MCMeta loc_alc_grp_META = createCommonMeta($loc_alc_grp, mcframe.commonMA.meta.MA_META.LOC_ALC_GRP);
	public static final MCMeta oper_alc_grp_META = createCommonMeta($oper_alc_grp, mcframe.commonMA.meta.MA_META.OPER_ALC_GRP);
	public static final MCMeta bp_alc_grp_META = createCommonMeta($bp_alc_grp, mcframe.commonMA.meta.MA_META.BP_ALC_GRP);
	public static final MCMeta ctg_alc_grp_META = createCommonMeta($ctg_alc_grp, mcframe.commonMA.meta.MA_META.CTG_ALC_GRP);
	public static final MCMeta itm_alc_grp_META = createCommonMeta($itm_alc_grp, mcframe.commonMA.meta.MA_META.ITM_ALC_GRP);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_ALC_PTN_SEL_KEY_R> constMetas = new ConstMetaList<MAW_ALC_PTN_SEL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			alc_ac_cd_META,
			dpt_alc_grp_META,
			loc_alc_grp_META,
			oper_alc_grp_META,
			bp_alc_grp_META,
			ctg_alc_grp_META,
			itm_alc_grp_META,
			term_META,
			calc_ctg_cd_META,
			wg_cd_META
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
	protected MAW_ALC_PTN_SEL_KEY_R(ConstMetaList<? extends MAW_ALC_PTN_SEL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_ALC_PTN_SEL_KEY_R(ConstMetaList<? extends MAW_ALC_PTN_SEL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$alc_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$alc_ac_cd,
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
			MAW_ALC_PTN_SEL_KEY_R.$dpt_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$dpt_alc_grp,
				"dpt_alc_grp",
				dpt_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$loc_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$loc_alc_grp,
				"loc_alc_grp",
				loc_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$oper_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$oper_alc_grp,
				"oper_alc_grp",
				oper_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$bp_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$bp_alc_grp,
				"bp_alc_grp",
				bp_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$ctg_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$ctg_alc_grp,
				"ctg_alc_grp",
				ctg_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$itm_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$itm_alc_grp,
				"itm_alc_grp",
				itm_alc_grp,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_ALC_PTN_SEL_KEY_R.$term,
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
		COLUMN_MAP.put(
			MAW_ALC_PTN_SEL_KEY_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$calc_ctg_cd,
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
			MAW_ALC_PTN_SEL_KEY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_ALC_PTN_SEL_KEY_R.$wg_cd,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ALC_PTN_SEL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_ALC_PTN_SEL_KEY_R create(String alias) {
		MAW_ALC_PTN_SEL_KEY_R row = new MAW_ALC_PTN_SEL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_ALC_PTN_SEL_KEY_R createByName(T proto) {
		MAW_ALC_PTN_SEL_KEY_R row = MAW_ALC_PTN_SEL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ALC_PTN_SEL_KEY_R clone() {
		return (MAW_ALC_PTN_SEL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ALC_PTN_SEL_KEY_R createInstance() {
		return (MAW_ALC_PTN_SEL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_ALC_PTN_SEL_KEY_R getValues(String... names) {
		return (MAW_ALC_PTN_SEL_KEY_R) super.getValues(names);
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
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public String alc_ac_cd() {
		return getConstString(offset + 0, $alc_ac_cd);
	}

	/**
	 * 配賦科目ＣＤ. Allocation account cd..<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		setConstString(offset + 0, $alc_ac_cd, value);
	}

	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public String dpt_alc_grp() {
		return getConstString(offset + 1, $dpt_alc_grp);
	}

	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public void dpt_alc_grp(String value) {
		setConstString(offset + 1, $dpt_alc_grp, value);
	}

	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public String loc_alc_grp() {
		return getConstString(offset + 2, $loc_alc_grp);
	}

	/**
	 * 場所配賦グループ. Location allocation group.<p>
	 *
	 */
	public void loc_alc_grp(String value) {
		setConstString(offset + 2, $loc_alc_grp, value);
	}

	/**
	 * 工程配賦グループ. Operation allocation group.<p>
	 *
	 */
	public String oper_alc_grp() {
		return getConstString(offset + 3, $oper_alc_grp);
	}

	/**
	 * 工程配賦グループ. Operation allocation group.<p>
	 *
	 */
	public void oper_alc_grp(String value) {
		setConstString(offset + 3, $oper_alc_grp, value);
	}

	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public String bp_alc_grp() {
		return getConstString(offset + 4, $bp_alc_grp);
	}

	/**
	 * 取引先配賦グループ. BP allocation group.<p>
	 *
	 */
	public void bp_alc_grp(String value) {
		setConstString(offset + 4, $bp_alc_grp, value);
	}

	/**
	 * 品群配賦グループ. Item category allocation group.<p>
	 *
	 */
	public String ctg_alc_grp() {
		return getConstString(offset + 5, $ctg_alc_grp);
	}

	/**
	 * 品群配賦グループ. Item category allocation group.<p>
	 *
	 */
	public void ctg_alc_grp(String value) {
		setConstString(offset + 5, $ctg_alc_grp, value);
	}

	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public String itm_alc_grp() {
		return getConstString(offset + 6, $itm_alc_grp);
	}

	/**
	 * 品目配賦グループ. Item allocation group.<p>
	 *
	 */
	public void itm_alc_grp(String value) {
		setConstString(offset + 6, $itm_alc_grp, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 7, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 7, $term, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 8, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 8, $calc_ctg_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}

	public String getString(String name) {
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			return dpt_alc_grp();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			return oper_alc_grp();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($ctg_alc_grp.equalsIgnoreCase(name)) {
			return ctg_alc_grp();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			return alc_ac_cd();
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			return dpt_alc_grp();
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			return loc_alc_grp();
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			return oper_alc_grp();
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			return bp_alc_grp();
		}
		if ($ctg_alc_grp.equalsIgnoreCase(name)) {
			return ctg_alc_grp();
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			return itm_alc_grp();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			dpt_alc_grp(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			oper_alc_grp(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($ctg_alc_grp.equalsIgnoreCase(name)) {
			ctg_alc_grp(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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

	public void setStringNE(String name, String value) {
		if ($alc_ac_cd.equalsIgnoreCase(name)) {
			alc_ac_cd(value);
			return;
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			dpt_alc_grp(value);
			return;
		}
		if ($loc_alc_grp.equalsIgnoreCase(name)) {
			loc_alc_grp(value);
			return;
		}
		if ($oper_alc_grp.equalsIgnoreCase(name)) {
			oper_alc_grp(value);
			return;
		}
		if ($bp_alc_grp.equalsIgnoreCase(name)) {
			bp_alc_grp(value);
			return;
		}
		if ($ctg_alc_grp.equalsIgnoreCase(name)) {
			ctg_alc_grp(value);
			return;
		}
		if ($itm_alc_grp.equalsIgnoreCase(name)) {
			itm_alc_grp(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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

}
