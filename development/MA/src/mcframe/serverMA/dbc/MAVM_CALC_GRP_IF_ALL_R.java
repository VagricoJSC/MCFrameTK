package mcframe.serverMA.dbc;

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
 * "計算グループマスタ送信ＩＦ // Calculation group master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループＣＤ</td>
 *  	<td>Calculation group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算グループ名</td>
 *  	<td>Calculation group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算グループ名（ロケール１）</td>
 *  	<td>Calculation group name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算グループ名（ロケール２）</td>
 *  	<td>Calculation group name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算グループ名（ロケール３）</td>
 *  	<td>Calculation group name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算グループ名（ロケール４）</td>
 *  	<td>Calculation group name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算グループ名（ロケール５）</td>
 *  	<td>Calculation group name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算区分</td>
 *  	<td>Cost calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額評価区分</td>
 *  	<td>Amount evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>max_mons</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最大計算月数</td>
 *  	<td>Max. calculation months</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_cnt</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算回数</td>
 *  	<td>Calculation count</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sa_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>予実区分</td>
 *  	<td>Plan/Result type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exp_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>展開計算区分</td>
 *  	<td>BOM explosion calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦計算区分</td>
 *  	<td>Departmental alloc. calculation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦率計算区分</td>
 *  	<td>Allocation rate calculation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_CALC_GRP_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_CALC_GRP_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public static final String $calc_grp_nm = "calc_grp_nm";
	private static final MCPermColumnInfo _calc_grp_nm = createColumnInfo("calc_grp_nm");
	public final MCStringPermColumn calc_grp_nm = createStringColumn(_calc_grp_nm);
	
	/**
	 * 計算グループ名（ロケール１）. Calculation group name (Locale 1).<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl1 = "calc_grp_nm_lcl1";
	private static final MCPermColumnInfo _calc_grp_nm_lcl1 = createColumnInfo("calc_grp_nm_lcl1");
	public final MCStringPermColumn calc_grp_nm_lcl1 = createStringColumn(_calc_grp_nm_lcl1);
	
	/**
	 * 計算グループ名（ロケール２）. Calculation group name (Locale 2).<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl2 = "calc_grp_nm_lcl2";
	private static final MCPermColumnInfo _calc_grp_nm_lcl2 = createColumnInfo("calc_grp_nm_lcl2");
	public final MCStringPermColumn calc_grp_nm_lcl2 = createStringColumn(_calc_grp_nm_lcl2);
	
	/**
	 * 計算グループ名（ロケール３）. Calculation group name (Locale 3).<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl3 = "calc_grp_nm_lcl3";
	private static final MCPermColumnInfo _calc_grp_nm_lcl3 = createColumnInfo("calc_grp_nm_lcl3");
	public final MCStringPermColumn calc_grp_nm_lcl3 = createStringColumn(_calc_grp_nm_lcl3);
	
	/**
	 * 計算グループ名（ロケール４）. Calculation group name (Locale 4).<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl4 = "calc_grp_nm_lcl4";
	private static final MCPermColumnInfo _calc_grp_nm_lcl4 = createColumnInfo("calc_grp_nm_lcl4");
	public final MCStringPermColumn calc_grp_nm_lcl4 = createStringColumn(_calc_grp_nm_lcl4);
	
	/**
	 * 計算グループ名（ロケール５）. Calculation group name (Locale 5).<p>
	 *
	 */
	public static final String $calc_grp_nm_lcl5 = "calc_grp_nm_lcl5";
	private static final MCPermColumnInfo _calc_grp_nm_lcl5 = createColumnInfo("calc_grp_nm_lcl5");
	public final MCStringPermColumn calc_grp_nm_lcl5 = createStringColumn(_calc_grp_nm_lcl5);
	
	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public static final String $cost_calc_typ = "cost_calc_typ";
	private static final MCPermColumnInfo _cost_calc_typ = createColumnInfo("cost_calc_typ");
	public final MCStringPermColumn cost_calc_typ = createStringColumn(_cost_calc_typ);
	
	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public static final String $eval_typ = "eval_typ";
	private static final MCPermColumnInfo _eval_typ = createColumnInfo("eval_typ");
	public final MCStringPermColumn eval_typ = createStringColumn(_eval_typ);
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public static final String $max_mons = "max_mons";
	private static final MCPermColumnInfo _max_mons = createColumnInfo("max_mons");
	public final MCNumberPermColumn max_mons = createNumberColumn(_max_mons);
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public static final String $calc_cnt = "calc_cnt";
	private static final MCPermColumnInfo _calc_cnt = createColumnInfo("calc_cnt");
	public final MCNumberPermColumn calc_cnt = createNumberColumn(_calc_cnt);
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public static final String $sa_typ = "sa_typ";
	private static final MCPermColumnInfo _sa_typ = createColumnInfo("sa_typ");
	public final MCStringPermColumn sa_typ = createStringColumn(_sa_typ);
	
	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public static final String $exp_calc_typ = "exp_calc_typ";
	private static final MCPermColumnInfo _exp_calc_typ = createColumnInfo("exp_calc_typ");
	public final MCStringPermColumn exp_calc_typ = createStringColumn(_exp_calc_typ);
	
	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public static final String $pre_alc_calc_typ = "pre_alc_calc_typ";
	private static final MCPermColumnInfo _pre_alc_calc_typ = createColumnInfo("pre_alc_calc_typ");
	public final MCStringPermColumn pre_alc_calc_typ = createStringColumn(_pre_alc_calc_typ);
	
	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public static final String $alc_calc_typ = "alc_calc_typ";
	private static final MCPermColumnInfo _alc_calc_typ = createColumnInfo("alc_calc_typ");
	public final MCStringPermColumn alc_calc_typ = createStringColumn(_alc_calc_typ);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta calc_grp_nm_META = createCommonMeta($calc_grp_nm, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_lcl1_META = createCommonMeta($calc_grp_nm_lcl1, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_lcl2_META = createCommonMeta($calc_grp_nm_lcl2, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_lcl3_META = createCommonMeta($calc_grp_nm_lcl3, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_lcl4_META = createCommonMeta($calc_grp_nm_lcl4, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta calc_grp_nm_lcl5_META = createCommonMeta($calc_grp_nm_lcl5, mcframe.commonMA.meta.MA_META.CALC_GRP_NM);
	public static final MCMeta cost_calc_typ_META = createCommonMeta($cost_calc_typ, mcframe.commonMA.meta.MA_META.COST_CALC_TYP);
	public static final MCMeta eval_typ_META = createCommonMeta($eval_typ, mcframe.commonMA.meta.MA_META.EVAL_TYP);
	public static final MCMeta max_mons_META = createCommonMeta($max_mons, mcframe.commonMA.meta.MA_META.MAX_MONS);
	public static final MCMeta calc_cnt_META = createCommonMeta($calc_cnt, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta sa_typ_META = createCommonMeta($sa_typ, mcframe.commonMA.meta.MA_META.SA_TYP);
	public static final MCMeta exp_calc_typ_META = createCommonMeta($exp_calc_typ, mcframe.commonMA.meta.MA_META.EXP_CALC_TYP);
	public static final MCMeta pre_alc_calc_typ_META = createCommonMeta($pre_alc_calc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_CALC_TYP);
	public static final MCMeta alc_calc_typ_META = createCommonMeta($alc_calc_typ, mcframe.commonMA.meta.MA_META.ALC_CALC_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_CALC_GRP_IF_ALL_R> constMetas = new ConstMetaList<MAVM_CALC_GRP_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			calc_grp_cd_META,
			calc_grp_nm_META,
			calc_grp_nm_lcl1_META,
			calc_grp_nm_lcl2_META,
			calc_grp_nm_lcl3_META,
			calc_grp_nm_lcl4_META,
			calc_grp_nm_lcl5_META,
			cost_calc_typ_META,
			eval_typ_META,
			max_mons_META,
			calc_cnt_META,
			sa_typ_META,
			exp_calc_typ_META,
			pre_alc_calc_typ_META,
			alc_calc_typ_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected MAVM_CALC_GRP_IF_ALL_R(ConstMetaList<? extends MAVM_CALC_GRP_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_CALC_GRP_IF_ALL_R(ConstMetaList<? extends MAVM_CALC_GRP_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_cd,
				"calc_grp_cd",
				calc_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm,
				"calc_grp_nm",
				calc_grp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl1,
				"calc_grp_nm_lcl1",
				calc_grp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl2,
				"calc_grp_nm_lcl2",
				calc_grp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl3,
				"calc_grp_nm_lcl3",
				calc_grp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl4,
				"calc_grp_nm_lcl4",
				calc_grp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$calc_grp_nm_lcl5,
				"calc_grp_nm_lcl5",
				calc_grp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$cost_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$cost_calc_typ,
				"cost_calc_typ",
				cost_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$eval_typ,
				"eval_typ",
				eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$max_mons,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_CALC_GRP_IF_ALL_R.$max_mons,
				"max_mons",
				max_mons,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$calc_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_CALC_GRP_IF_ALL_R.$calc_cnt,
				"calc_cnt",
				calc_cnt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$sa_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$sa_typ,
				"sa_typ",
				sa_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$exp_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$exp_calc_typ,
				"exp_calc_typ",
				exp_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$pre_alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$pre_alc_calc_typ,
				"pre_alc_calc_typ",
				pre_alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$alc_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$alc_calc_typ,
				"alc_calc_typ",
				alc_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_CALC_GRP_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_CALC_GRP_IF_ALL_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
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
	public static MAVM_CALC_GRP_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_CALC_GRP_IF_ALL_R create(String alias) {
		MAVM_CALC_GRP_IF_ALL_R row = new MAVM_CALC_GRP_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_CALC_GRP_IF_ALL_R createByName(T proto) {
		MAVM_CALC_GRP_IF_ALL_R row = MAVM_CALC_GRP_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_CALC_GRP_IF_ALL_R clone() {
		return (MAVM_CALC_GRP_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_CALC_GRP_IF_ALL_R createInstance() {
		return (MAVM_CALC_GRP_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_CALC_GRP_IF_ALL_R getValues(String... names) {
		return (MAVM_CALC_GRP_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public String calc_grp_cd() {
		return getConstString(offset + 1, $calc_grp_cd);
	}

	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public void calc_grp_cd(String value) {
		setConstString(offset + 1, $calc_grp_cd, value);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public String calc_grp_nm() {
		return getConstString(offset + 2, $calc_grp_nm);
	}

	/**
	 * 計算グループ名. Calculation group name.<p>
	 *
	 */
	public void calc_grp_nm(String value) {
		setConstString(offset + 2, $calc_grp_nm, value);
	}

	/**
	 * 計算グループ名（ロケール１）. Calculation group name (Locale 1).<p>
	 *
	 */
	public String calc_grp_nm_lcl1() {
		return getConstString(offset + 3, $calc_grp_nm_lcl1);
	}

	/**
	 * 計算グループ名（ロケール１）. Calculation group name (Locale 1).<p>
	 *
	 */
	public void calc_grp_nm_lcl1(String value) {
		setConstString(offset + 3, $calc_grp_nm_lcl1, value);
	}

	/**
	 * 計算グループ名（ロケール２）. Calculation group name (Locale 2).<p>
	 *
	 */
	public String calc_grp_nm_lcl2() {
		return getConstString(offset + 4, $calc_grp_nm_lcl2);
	}

	/**
	 * 計算グループ名（ロケール２）. Calculation group name (Locale 2).<p>
	 *
	 */
	public void calc_grp_nm_lcl2(String value) {
		setConstString(offset + 4, $calc_grp_nm_lcl2, value);
	}

	/**
	 * 計算グループ名（ロケール３）. Calculation group name (Locale 3).<p>
	 *
	 */
	public String calc_grp_nm_lcl3() {
		return getConstString(offset + 5, $calc_grp_nm_lcl3);
	}

	/**
	 * 計算グループ名（ロケール３）. Calculation group name (Locale 3).<p>
	 *
	 */
	public void calc_grp_nm_lcl3(String value) {
		setConstString(offset + 5, $calc_grp_nm_lcl3, value);
	}

	/**
	 * 計算グループ名（ロケール４）. Calculation group name (Locale 4).<p>
	 *
	 */
	public String calc_grp_nm_lcl4() {
		return getConstString(offset + 6, $calc_grp_nm_lcl4);
	}

	/**
	 * 計算グループ名（ロケール４）. Calculation group name (Locale 4).<p>
	 *
	 */
	public void calc_grp_nm_lcl4(String value) {
		setConstString(offset + 6, $calc_grp_nm_lcl4, value);
	}

	/**
	 * 計算グループ名（ロケール５）. Calculation group name (Locale 5).<p>
	 *
	 */
	public String calc_grp_nm_lcl5() {
		return getConstString(offset + 7, $calc_grp_nm_lcl5);
	}

	/**
	 * 計算グループ名（ロケール５）. Calculation group name (Locale 5).<p>
	 *
	 */
	public void calc_grp_nm_lcl5(String value) {
		setConstString(offset + 7, $calc_grp_nm_lcl5, value);
	}

	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public String cost_calc_typ() {
		return getConstString(offset + 8, $cost_calc_typ);
	}

	/**
	 * 計算区分. Cost calculation type.<p>
	 *
	 */
	public void cost_calc_typ(String value) {
		setConstString(offset + 8, $cost_calc_typ, value);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public String eval_typ() {
		return getConstString(offset + 9, $eval_typ);
	}

	/**
	 * 金額評価区分. Amount evaluation type.<p>
	 *
	 */
	public void eval_typ(String value) {
		setConstString(offset + 9, $eval_typ, value);
	}

	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public MCNumber max_mons() {
		return getConstNumber(offset + 10, $max_mons);
	}

	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(MCNumber value) {
		setConstNumber(offset + 10, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(int value) {
		setConstNumber(offset + 10, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(long value) {
		setConstNumber(offset + 10, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(float value) {
		setConstNumber(offset + 10, $max_mons, value);
	}
	
	/**
	 * 最大計算月数. Max. calculation months.<p>
	 *
	 */
	public void max_mons(double value) {
		setConstNumber(offset + 10, $max_mons, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public MCNumber calc_cnt() {
		return getConstNumber(offset + 11, $calc_cnt);
	}

	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(MCNumber value) {
		setConstNumber(offset + 11, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(int value) {
		setConstNumber(offset + 11, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(long value) {
		setConstNumber(offset + 11, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(float value) {
		setConstNumber(offset + 11, $calc_cnt, value);
	}
	
	/**
	 * 計算回数. Calculation count.<p>
	 *
	 */
	public void calc_cnt(double value) {
		setConstNumber(offset + 11, $calc_cnt, value);
	}
	
	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public String sa_typ() {
		return getConstString(offset + 12, $sa_typ);
	}

	/**
	 * 予実区分. Plan/Result type.<p>
	 *
	 */
	public void sa_typ(String value) {
		setConstString(offset + 12, $sa_typ, value);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public String exp_calc_typ() {
		return getConstString(offset + 13, $exp_calc_typ);
	}

	/**
	 * 展開計算区分. BOM explosion calculation type.<p>
	 *
	 */
	public void exp_calc_typ(String value) {
		setConstString(offset + 13, $exp_calc_typ, value);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public String pre_alc_calc_typ() {
		return getConstString(offset + 14, $pre_alc_calc_typ);
	}

	/**
	 * 一次配賦計算区分. Departmental alloc. calculation type.<p>
	 *
	 */
	public void pre_alc_calc_typ(String value) {
		setConstString(offset + 14, $pre_alc_calc_typ, value);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public String alc_calc_typ() {
		return getConstString(offset + 15, $alc_calc_typ);
	}

	/**
	 * 配賦率計算区分. Allocation rate calculation type.<p>
	 *
	 */
	public void alc_calc_typ(String value) {
		setConstString(offset + 15, $alc_calc_typ, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 16, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 16, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 17, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 17, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 18, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 18, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl1();
		}
		if ($calc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl2();
		}
		if ($calc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl3();
		}
		if ($calc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl4();
		}
		if ($calc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl5();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			return calc_grp_nm();
		}
		if ($calc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl1();
		}
		if ($calc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl2();
		}
		if ($calc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl3();
		}
		if ($calc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl4();
		}
		if ($calc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return calc_grp_nm_lcl5();
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			return cost_calc_typ();
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			return eval_typ();
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			return sa_typ();
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			return exp_calc_typ();
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			return pre_alc_calc_typ();
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			return alc_calc_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($max_mons.equalsIgnoreCase(name)) {
			return max_mons();
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			return calc_cnt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl1(value);
			return;
		}
		if ($calc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl2(value);
			return;
		}
		if ($calc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl3(value);
			return;
		}
		if ($calc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl4(value);
			return;
		}
		if ($calc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl5(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($calc_grp_nm.equalsIgnoreCase(name)) {
			calc_grp_nm(value);
			return;
		}
		if ($calc_grp_nm_lcl1.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl1(value);
			return;
		}
		if ($calc_grp_nm_lcl2.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl2(value);
			return;
		}
		if ($calc_grp_nm_lcl3.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl3(value);
			return;
		}
		if ($calc_grp_nm_lcl4.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl4(value);
			return;
		}
		if ($calc_grp_nm_lcl5.equalsIgnoreCase(name)) {
			calc_grp_nm_lcl5(value);
			return;
		}
		if ($cost_calc_typ.equalsIgnoreCase(name)) {
			cost_calc_typ(value);
			return;
		}
		if ($eval_typ.equalsIgnoreCase(name)) {
			eval_typ(value);
			return;
		}
		if ($sa_typ.equalsIgnoreCase(name)) {
			sa_typ(value);
			return;
		}
		if ($exp_calc_typ.equalsIgnoreCase(name)) {
			exp_calc_typ(value);
			return;
		}
		if ($pre_alc_calc_typ.equalsIgnoreCase(name)) {
			pre_alc_calc_typ(value);
			return;
		}
		if ($alc_calc_typ.equalsIgnoreCase(name)) {
			alc_calc_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($max_mons.equalsIgnoreCase(name)) {
			max_mons(value);
			return;
		}
		if ($calc_cnt.equalsIgnoreCase(name)) {
			calc_cnt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
