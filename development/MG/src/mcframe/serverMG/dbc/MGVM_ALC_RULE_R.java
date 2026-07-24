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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算配賦方法ビュー // Cost calculation allocation basis view"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>alc_tgt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦対象区分</td>
 *  	<td>Allocation target type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_rule_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦方法区分</td>
 *  	<td>Allocation basis type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差異計算区分</td>
 *  	<td>Variance calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>端数処理区分</td>
 *  	<td>Rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_coef_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦係数ＣＤ</td>
 *  	<td>Allocation coefficient cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>coef_limit_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦係数限定ＦＬＧ</td>
 *  	<td>Allocation coefficient limit flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>non_minus_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マイナス対象外ＦＬＧ</td>
 *  	<td>Not for minus flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>non_os_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注対象外ＦＬＧ</td>
 *  	<td>Not for subcontracting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>scst_alc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先配賦ＦＬＧ</td>
 *  	<td>Delivery destination allocation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_alc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準配賦ＦＬＧ</td>
 *  	<td>Standard allocation flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ALC_RULE_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ALC_RULE";

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
	 * 配賦対象区分. Allocation target type.<p>
	 *
	 */
	public static final String $alc_tgt_typ = "alc_tgt_typ";
	private static final MCPermColumnInfo _alc_tgt_typ = createColumnInfo("alc_tgt_typ");
	public final MCStringPermColumn alc_tgt_typ = createStringColumn(_alc_tgt_typ);
	
	/**
	 * 配賦方法区分. Allocation basis type.<p>
	 *
	 */
	public static final String $alc_rule_typ = "alc_rule_typ";
	private static final MCPermColumnInfo _alc_rule_typ = createColumnInfo("alc_rule_typ");
	public final MCStringPermColumn alc_rule_typ = createStringColumn(_alc_rule_typ);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 差異計算区分. Variance calculation type.<p>
	 *
	 */
	public static final String $diff_calc_typ = "diff_calc_typ";
	private static final MCPermColumnInfo _diff_calc_typ = createColumnInfo("diff_calc_typ");
	public final MCStringPermColumn diff_calc_typ = createStringColumn(_diff_calc_typ);
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	private static final MCPermColumnInfo _rnd_typ = createColumnInfo("rnd_typ");
	public final MCStringPermColumn rnd_typ = createStringColumn(_rnd_typ);
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * 配賦係数ＣＤ. Allocation coefficient cd..<p>
	 *
	 */
	public static final String $alc_coef_cd = "alc_coef_cd";
	private static final MCPermColumnInfo _alc_coef_cd = createColumnInfo("alc_coef_cd");
	public final MCStringPermColumn alc_coef_cd = createStringColumn(_alc_coef_cd);
	
	/**
	 * 配賦係数限定ＦＬＧ. Allocation coefficient limit flg..<p>
	 *
	 */
	public static final String $coef_limit_flg = "coef_limit_flg";
	private static final MCPermColumnInfo _coef_limit_flg = createColumnInfo("coef_limit_flg");
	public final MCBooleanPermColumn coef_limit_flg = createBooleanColumn(_coef_limit_flg);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * マイナス対象外ＦＬＧ. Not for minus flg..<p>
	 *
	 */
	public static final String $non_minus_flg = "non_minus_flg";
	private static final MCPermColumnInfo _non_minus_flg = createColumnInfo("non_minus_flg");
	public final MCBooleanPermColumn non_minus_flg = createBooleanColumn(_non_minus_flg);
	
	/**
	 * 外注対象外ＦＬＧ. Not for subcontracting flg..<p>
	 *
	 */
	public static final String $non_os_flg = "non_os_flg";
	private static final MCPermColumnInfo _non_os_flg = createColumnInfo("non_os_flg");
	public final MCBooleanPermColumn non_os_flg = createBooleanColumn(_non_os_flg);
	
	/**
	 * 納品先配賦ＦＬＧ. Delivery destination allocation flg..<p>
	 *
	 */
	public static final String $scst_alc_flg = "scst_alc_flg";
	private static final MCPermColumnInfo _scst_alc_flg = createColumnInfo("scst_alc_flg");
	public final MCBooleanPermColumn scst_alc_flg = createBooleanColumn(_scst_alc_flg);
	
	/**
	 * 標準配賦ＦＬＧ. Standard allocation flg..<p>
	 *
	 */
	public static final String $std_alc_flg = "std_alc_flg";
	private static final MCPermColumnInfo _std_alc_flg = createColumnInfo("std_alc_flg");
	public final MCBooleanPermColumn std_alc_flg = createBooleanColumn(_std_alc_flg);
	
	public static final MCMeta alc_ptn_cd_META = createCommonMeta($alc_ptn_cd, mcframe.commonMA.meta.MA_META.ALC_PTN_CD);
	public static final MCMeta alc_tgt_typ_META = createCommonMeta($alc_tgt_typ, mcframe.commonMA.meta.MA_META.ALC_TGT_TYP);
	public static final MCMeta alc_rule_typ_META = createCommonMeta($alc_rule_typ, mcframe.commonMA.meta.MA_META.ALC_RULE_TYP);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta diff_calc_typ_META = createCommonMeta($diff_calc_typ, mcframe.commonMA.meta.MA_META.DIFF_CALC_TYP);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta alc_coef_cd_META = createCommonMeta($alc_coef_cd, mcframe.commonMA.meta.MA_META.ALC_COEF_CD);
	public static final MCMeta coef_limit_flg_META = createCommonMeta($coef_limit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta non_minus_flg_META = createCommonMeta($non_minus_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_os_flg_META = createCommonMeta($non_os_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scst_alc_flg_META = createCommonMeta($scst_alc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_alc_flg_META = createCommonMeta($std_alc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ALC_RULE_R> constMetas = new ConstMetaList<MGVM_ALC_RULE_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			alc_ptn_cd_META,
			alc_tgt_typ_META,
			alc_rule_typ_META,
			expns_cd_META,
			diff_calc_typ_META,
			rnd_typ_META,
			dec_place_META,
			alc_coef_cd_META,
			coef_limit_flg_META,
			asst_typ_META,
			non_minus_flg_META,
			non_os_flg_META,
			scst_alc_flg_META,
			std_alc_flg_META
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
	protected MGVM_ALC_RULE_R(ConstMetaList<? extends MGVM_ALC_RULE_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ALC_RULE_R(ConstMetaList<? extends MGVM_ALC_RULE_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$alc_ptn_cd,
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
			MGVM_ALC_RULE_R.$alc_tgt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$alc_tgt_typ,
				"alc_tgt_typ",
				alc_tgt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$alc_rule_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$alc_rule_typ,
				"alc_rule_typ",
				alc_rule_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$expns_cd,
				"expns_cd",
				expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$diff_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$diff_calc_typ,
				"diff_calc_typ",
				diff_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$rnd_typ,
				"rnd_typ",
				rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ALC_RULE_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$alc_coef_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$alc_coef_cd,
				"alc_coef_cd",
				alc_coef_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$coef_limit_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_RULE_R.$coef_limit_flg,
				"coef_limit_flg",
				coef_limit_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ALC_RULE_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$non_minus_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_RULE_R.$non_minus_flg,
				"non_minus_flg",
				non_minus_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$non_os_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_RULE_R.$non_os_flg,
				"non_os_flg",
				non_os_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$scst_alc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_RULE_R.$scst_alc_flg,
				"scst_alc_flg",
				scst_alc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ALC_RULE_R.$std_alc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVM_ALC_RULE_R.$std_alc_flg,
				"std_alc_flg",
				std_alc_flg,
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
	public static MGVM_ALC_RULE_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ALC_RULE_R create(String alias) {
		MGVM_ALC_RULE_R row = new MGVM_ALC_RULE_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ALC_RULE_R createByName(T proto) {
		MGVM_ALC_RULE_R row = MGVM_ALC_RULE_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_RULE_R clone() {
		return (MGVM_ALC_RULE_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_RULE_R createInstance() {
		return (MGVM_ALC_RULE_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ALC_RULE_R getValues(String... names) {
		return (MGVM_ALC_RULE_R) super.getValues(names);
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
	 * 配賦対象区分. Allocation target type.<p>
	 *
	 */
	public String alc_tgt_typ() {
		return getConstString(offset + 1, $alc_tgt_typ);
	}

	/**
	 * 配賦対象区分. Allocation target type.<p>
	 *
	 */
	public void alc_tgt_typ(String value) {
		setConstString(offset + 1, $alc_tgt_typ, value);
	}

	/**
	 * 配賦方法区分. Allocation basis type.<p>
	 *
	 */
	public String alc_rule_typ() {
		return getConstString(offset + 2, $alc_rule_typ);
	}

	/**
	 * 配賦方法区分. Allocation basis type.<p>
	 *
	 */
	public void alc_rule_typ(String value) {
		setConstString(offset + 2, $alc_rule_typ, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 3, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 3, $expns_cd, value);
	}

	/**
	 * 差異計算区分. Variance calculation type.<p>
	 *
	 */
	public String diff_calc_typ() {
		return getConstString(offset + 4, $diff_calc_typ);
	}

	/**
	 * 差異計算区分. Variance calculation type.<p>
	 *
	 */
	public void diff_calc_typ(String value) {
		setConstString(offset + 4, $diff_calc_typ, value);
	}

	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 5, $rnd_typ);
	}

	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 5, $rnd_typ, value);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 6, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 6, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 6, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 6, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 6, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 6, $dec_place, value);
	}
	
	/**
	 * 配賦係数ＣＤ. Allocation coefficient cd..<p>
	 *
	 */
	public String alc_coef_cd() {
		return getConstString(offset + 7, $alc_coef_cd);
	}

	/**
	 * 配賦係数ＣＤ. Allocation coefficient cd..<p>
	 *
	 */
	public void alc_coef_cd(String value) {
		setConstString(offset + 7, $alc_coef_cd, value);
	}

	/**
	 * 配賦係数限定ＦＬＧ. Allocation coefficient limit flg..<p>
	 *
	 */
	public boolean coef_limit_flg() {
		return getConstBoolean(offset + 8, $coef_limit_flg);
	}

	/**
	 * 配賦係数限定ＦＬＧ. Allocation coefficient limit flg..<p>
	 *
	 */
	public void coef_limit_flg(boolean value) {
		setConstBoolean(offset + 8, $coef_limit_flg, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 9, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 9, $asst_typ, value);
	}

	/**
	 * マイナス対象外ＦＬＧ. Not for minus flg..<p>
	 *
	 */
	public boolean non_minus_flg() {
		return getConstBoolean(offset + 10, $non_minus_flg);
	}

	/**
	 * マイナス対象外ＦＬＧ. Not for minus flg..<p>
	 *
	 */
	public void non_minus_flg(boolean value) {
		setConstBoolean(offset + 10, $non_minus_flg, value);
	}

	/**
	 * 外注対象外ＦＬＧ. Not for subcontracting flg..<p>
	 *
	 */
	public boolean non_os_flg() {
		return getConstBoolean(offset + 11, $non_os_flg);
	}

	/**
	 * 外注対象外ＦＬＧ. Not for subcontracting flg..<p>
	 *
	 */
	public void non_os_flg(boolean value) {
		setConstBoolean(offset + 11, $non_os_flg, value);
	}

	/**
	 * 納品先配賦ＦＬＧ. Delivery destination allocation flg..<p>
	 *
	 */
	public boolean scst_alc_flg() {
		return getConstBoolean(offset + 12, $scst_alc_flg);
	}

	/**
	 * 納品先配賦ＦＬＧ. Delivery destination allocation flg..<p>
	 *
	 */
	public void scst_alc_flg(boolean value) {
		setConstBoolean(offset + 12, $scst_alc_flg, value);
	}

	/**
	 * 標準配賦ＦＬＧ. Standard allocation flg..<p>
	 *
	 */
	public boolean std_alc_flg() {
		return getConstBoolean(offset + 13, $std_alc_flg);
	}

	/**
	 * 標準配賦ＦＬＧ. Standard allocation flg..<p>
	 *
	 */
	public void std_alc_flg(boolean value) {
		setConstBoolean(offset + 13, $std_alc_flg, value);
	}

	public String getString(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			return alc_tgt_typ();
		}
		if ($alc_rule_typ.equalsIgnoreCase(name)) {
			return alc_rule_typ();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($diff_calc_typ.equalsIgnoreCase(name)) {
			return diff_calc_typ();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($alc_coef_cd.equalsIgnoreCase(name)) {
			return alc_coef_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($coef_limit_flg.equalsIgnoreCase(name)) {
			return coef_limit_flg();
		}
		if ($non_minus_flg.equalsIgnoreCase(name)) {
			return non_minus_flg();
		}
		if ($non_os_flg.equalsIgnoreCase(name)) {
			return non_os_flg();
		}
		if ($scst_alc_flg.equalsIgnoreCase(name)) {
			return scst_alc_flg();
		}
		if ($std_alc_flg.equalsIgnoreCase(name)) {
			return std_alc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			return alc_ptn_cd();
		}
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			return alc_tgt_typ();
		}
		if ($alc_rule_typ.equalsIgnoreCase(name)) {
			return alc_rule_typ();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($diff_calc_typ.equalsIgnoreCase(name)) {
			return diff_calc_typ();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($alc_coef_cd.equalsIgnoreCase(name)) {
			return alc_coef_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($coef_limit_flg.equalsIgnoreCase(name)) {
			return coef_limit_flg();
		}
		if ($non_minus_flg.equalsIgnoreCase(name)) {
			return non_minus_flg();
		}
		if ($non_os_flg.equalsIgnoreCase(name)) {
			return non_os_flg();
		}
		if ($scst_alc_flg.equalsIgnoreCase(name)) {
			return scst_alc_flg();
		}
		if ($std_alc_flg.equalsIgnoreCase(name)) {
			return std_alc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			alc_tgt_typ(value);
			return;
		}
		if ($alc_rule_typ.equalsIgnoreCase(name)) {
			alc_rule_typ(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($diff_calc_typ.equalsIgnoreCase(name)) {
			diff_calc_typ(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($alc_coef_cd.equalsIgnoreCase(name)) {
			alc_coef_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($coef_limit_flg.equalsIgnoreCase(name)) {
			coef_limit_flg(value);
			return;
		}
		if ($non_minus_flg.equalsIgnoreCase(name)) {
			non_minus_flg(value);
			return;
		}
		if ($non_os_flg.equalsIgnoreCase(name)) {
			non_os_flg(value);
			return;
		}
		if ($scst_alc_flg.equalsIgnoreCase(name)) {
			scst_alc_flg(value);
			return;
		}
		if ($std_alc_flg.equalsIgnoreCase(name)) {
			std_alc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($alc_ptn_cd.equalsIgnoreCase(name)) {
			alc_ptn_cd(value);
			return;
		}
		if ($alc_tgt_typ.equalsIgnoreCase(name)) {
			alc_tgt_typ(value);
			return;
		}
		if ($alc_rule_typ.equalsIgnoreCase(name)) {
			alc_rule_typ(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($diff_calc_typ.equalsIgnoreCase(name)) {
			diff_calc_typ(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($alc_coef_cd.equalsIgnoreCase(name)) {
			alc_coef_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($coef_limit_flg.equalsIgnoreCase(name)) {
			coef_limit_flg(value);
			return;
		}
		if ($non_minus_flg.equalsIgnoreCase(name)) {
			non_minus_flg(value);
			return;
		}
		if ($non_os_flg.equalsIgnoreCase(name)) {
			non_os_flg(value);
			return;
		}
		if ($scst_alc_flg.equalsIgnoreCase(name)) {
			scst_alc_flg(value);
			return;
		}
		if ($std_alc_flg.equalsIgnoreCase(name)) {
			std_alc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
