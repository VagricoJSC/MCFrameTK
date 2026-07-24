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
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "引当場所マップワーク // Allocation location map work"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入場所ＣＤ</td>
 *  	<td>Input location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入棚・ラインＣＤ</td>
 *  	<td>Input rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先物流グループＣＤ</td>
 *  	<td>Delivery destination distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループＣＤ</td>
 *  	<td>Gross allocation location group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫物流グループＣＤ</td>
 *  	<td>GI distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫場所ＣＤ</td>
 *  	<td>GI location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫棚・ラインＣＤ</td>
 *  	<td>GI rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_stk_arrv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出庫在庫着荷先ＣＤ</td>
 *  	<td>GI inventory arriving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫場所ＣＤ</td>
 *  	<td>GR location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gr_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入庫棚・ラインＣＤ</td>
 *  	<td>GR rack/line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_scope_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当範囲区分</td>
 *  	<td>Allocation range type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_ALLOC_LOC_MAP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_ALLOC_LOC_MAP";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	private static final MCPermColumnInfo _inpt_loc_cd = createColumnInfo("inpt_loc_cd");
	public final MCStringPermColumn inpt_loc_cd = createStringColumn(_inpt_loc_cd);
	
	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public static final String $inpt_str_ln_cd = "inpt_str_ln_cd";
	private static final MCPermColumnInfo _inpt_str_ln_cd = createColumnInfo("inpt_str_ln_cd");
	public final MCStringPermColumn inpt_str_ln_cd = createStringColumn(_inpt_str_ln_cd);
	
	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	private static final MCPermColumnInfo _dlv_lg_grp_cd = createColumnInfo("dlv_lg_grp_cd");
	public final MCStringPermColumn dlv_lg_grp_cd = createStringColumn(_dlv_lg_grp_cd);
	
	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	private static final MCPermColumnInfo _alloc_grp_cd = createColumnInfo("alloc_grp_cd");
	public final MCStringPermColumn alloc_grp_cd = createStringColumn(_alloc_grp_cd);
	
	/**
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	private static final MCPermColumnInfo _gi_lg_grp_cd = createColumnInfo("gi_lg_grp_cd");
	public final MCStringPermColumn gi_lg_grp_cd = createStringColumn(_gi_lg_grp_cd);
	
	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	private static final MCPermColumnInfo _gi_loc_cd = createColumnInfo("gi_loc_cd");
	public final MCStringPermColumn gi_loc_cd = createStringColumn(_gi_loc_cd);
	
	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	private static final MCPermColumnInfo _gi_str_ln_cd = createColumnInfo("gi_str_ln_cd");
	public final MCStringPermColumn gi_str_ln_cd = createStringColumn(_gi_str_ln_cd);
	
	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	private static final MCPermColumnInfo _gi_stk_arrv_bp_cd = createColumnInfo("gi_stk_arrv_bp_cd");
	public final MCStringPermColumn gi_stk_arrv_bp_cd = createStringColumn(_gi_stk_arrv_bp_cd);
	
	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	private static final MCPermColumnInfo _gr_loc_cd = createColumnInfo("gr_loc_cd");
	public final MCStringPermColumn gr_loc_cd = createStringColumn(_gr_loc_cd);
	
	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	private static final MCPermColumnInfo _gr_str_ln_cd = createColumnInfo("gr_str_ln_cd");
	public final MCStringPermColumn gr_str_ln_cd = createStringColumn(_gr_str_ln_cd);
	
	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	private static final MCPermColumnInfo _alloc_scope_typ = createColumnInfo("alloc_scope_typ");
	public final MCStringPermColumn alloc_scope_typ = createStringColumn(_alloc_scope_typ);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_str_ln_cd_META = createCommonMeta($inpt_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_ALLOC_LOC_MAP_R> constMetas = new ConstMetaList<MSW_ALLOC_LOC_MAP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ship_term_cd_META,
			inpt_loc_cd_META,
			inpt_str_ln_cd_META,
			dlv_lg_grp_cd_META,
			alloc_grp_cd_META,
			gi_lg_grp_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_stk_arrv_bp_cd_META,
			gr_loc_cd_META,
			gr_str_ln_cd_META,
			alloc_scope_typ_META
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
	protected MSW_ALLOC_LOC_MAP_R(ConstMetaList<? extends MSW_ALLOC_LOC_MAP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_ALLOC_LOC_MAP_R(ConstMetaList<? extends MSW_ALLOC_LOC_MAP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$inpt_loc_cd,
				"inpt_loc_cd",
				inpt_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$inpt_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$inpt_str_ln_cd,
				"inpt_str_ln_cd",
				inpt_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$dlv_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$dlv_lg_grp_cd,
				"dlv_lg_grp_cd",
				dlv_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$alloc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$alloc_grp_cd,
				"alloc_grp_cd",
				alloc_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gi_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gi_lg_grp_cd,
				"gi_lg_grp_cd",
				gi_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gi_loc_cd,
				"gi_loc_cd",
				gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gi_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gi_str_ln_cd,
				"gi_str_ln_cd",
				gi_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gi_stk_arrv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gi_stk_arrv_bp_cd,
				"gi_stk_arrv_bp_cd",
				gi_stk_arrv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gr_loc_cd,
				"gr_loc_cd",
				gr_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$gr_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$gr_str_ln_cd,
				"gr_str_ln_cd",
				gr_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ALLOC_LOC_MAP_R.$alloc_scope_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ALLOC_LOC_MAP_R.$alloc_scope_typ,
				"alloc_scope_typ",
				alloc_scope_typ,
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
	public static MSW_ALLOC_LOC_MAP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_ALLOC_LOC_MAP_R create(String alias) {
		MSW_ALLOC_LOC_MAP_R row = new MSW_ALLOC_LOC_MAP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_ALLOC_LOC_MAP_R createByName(T proto) {
		MSW_ALLOC_LOC_MAP_R row = MSW_ALLOC_LOC_MAP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ALLOC_LOC_MAP_R clone() {
		return (MSW_ALLOC_LOC_MAP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ALLOC_LOC_MAP_R createInstance() {
		return (MSW_ALLOC_LOC_MAP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ALLOC_LOC_MAP_R getValues(String... names) {
		return (MSW_ALLOC_LOC_MAP_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 4, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 4, $ship_term_cd, value);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 5, $inpt_loc_cd);
	}

	/**
	 * 投入場所ＣＤ. Input location cd..<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 5, $inpt_loc_cd, value);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return getConstString(offset + 6, $inpt_str_ln_cd);
	}

	/**
	 * 投入棚・ラインＣＤ. Input rack/line cd..<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		setConstString(offset + 6, $inpt_str_ln_cd, value);
	}

	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 7, $dlv_lg_grp_cd);
	}

	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 7, $dlv_lg_grp_cd, value);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 8, $alloc_grp_cd);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 8, $alloc_grp_cd, value);
	}

	/**
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 9, $gi_lg_grp_cd);
	}

	/**
	 * 出庫物流グループＣＤ. GI distribution group cd..<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 9, $gi_lg_grp_cd, value);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 10, $gi_loc_cd);
	}

	/**
	 * 出庫場所ＣＤ. GI location cd..<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 10, $gi_loc_cd, value);
	}

	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 11, $gi_str_ln_cd);
	}

	/**
	 * 出庫棚・ラインＣＤ. GI rack/line cd..<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 11, $gi_str_ln_cd, value);
	}

	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 12, $gi_stk_arrv_bp_cd);
	}

	/**
	 * 出庫在庫着荷先ＣＤ. GI inventory arriving point cd..<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 12, $gi_stk_arrv_bp_cd, value);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 13, $gr_loc_cd);
	}

	/**
	 * 入庫場所ＣＤ. GR location cd..<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 13, $gr_loc_cd, value);
	}

	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 14, $gr_str_ln_cd);
	}

	/**
	 * 入庫棚・ラインＣＤ. GR rack/line cd..<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 14, $gr_str_ln_cd, value);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 15, $alloc_scope_typ);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 15, $alloc_scope_typ, value);
	}

	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_str_ln_cd();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_str_ln_cd(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
