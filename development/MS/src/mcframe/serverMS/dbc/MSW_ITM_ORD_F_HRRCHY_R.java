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
 * "オーダ正展開用ワーク // Work for order forward explosion"DBコンテナRowクラスです。<p>
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
 *  	<td>root_id</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ルートＩＤ</td>
 *  	<td>Route ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sort_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ソート順</td>
 *  	<td>Sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>hrrchy</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>階層</td>
 *  	<td>Hierarchy</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目ＣＤ</td>
 *  	<td>Child item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目枝番１</td>
 *  	<td>Child branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目枝番２</td>
 *  	<td>Child branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目枝番３</td>
 *  	<td>Child branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子場所ＣＤ</td>
 *  	<td>Child location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子受払進捗管理ＮＯ</td>
 *  	<td>Child GR/GI progress management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_schd_alloc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目引当予定数</td>
 *  	<td>Child item allocation scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目出庫予定日</td>
 *  	<td>Scheduled child item GI date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ１</td>
 *  	<td>Child SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ２</td>
 *  	<td>Child SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ３</td>
 *  	<td>Child SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ４</td>
 *  	<td>Child SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>WG ＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_ITM_ORD_F_HRRCHY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_ITM_ORD_F_HRRCHY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ルートＩＤ. Route ID.<p>
	 *
	 */
	public static final String $root_id = "root_id";
	private static final MCPermColumnInfo _root_id = createColumnInfo("root_id");
	public final MCStringPermColumn root_id = createStringColumn(_root_id);
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public static final String $sort_no = "sort_no";
	private static final MCPermColumnInfo _sort_no = createColumnInfo("sort_no");
	public final MCNumberPermColumn sort_no = createNumberColumn(_sort_no);
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public static final String $hrrchy = "hrrchy";
	private static final MCPermColumnInfo _hrrchy = createColumnInfo("hrrchy");
	public final MCNumberPermColumn hrrchy = createNumberColumn(_hrrchy);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	private static final MCPermColumnInfo _chd_itm_cd = createColumnInfo("chd_itm_cd");
	public final MCStringPermColumn chd_itm_cd = createStringColumn(_chd_itm_cd);
	
	/**
	 * 子品目枝番１. Child branch No. 1.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	private static final MCPermColumnInfo _chd_itm_sub1 = createColumnInfo("chd_itm_sub1");
	public final MCStringPermColumn chd_itm_sub1 = createStringColumn(_chd_itm_sub1);
	
	/**
	 * 子品目枝番２. Child branch No. 2.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	private static final MCPermColumnInfo _chd_itm_sub2 = createColumnInfo("chd_itm_sub2");
	public final MCStringPermColumn chd_itm_sub2 = createStringColumn(_chd_itm_sub2);
	
	/**
	 * 子品目枝番３. Child branch No. 3.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	private static final MCPermColumnInfo _chd_itm_sub3 = createColumnInfo("chd_itm_sub3");
	public final MCStringPermColumn chd_itm_sub3 = createStringColumn(_chd_itm_sub3);
	
	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public static final String $chd_loc_cd = "chd_loc_cd";
	private static final MCPermColumnInfo _chd_loc_cd = createColumnInfo("chd_loc_cd");
	public final MCStringPermColumn chd_loc_cd = createStringColumn(_chd_loc_cd);
	
	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public static final String $chd_io_schd_pr_no = "chd_io_schd_pr_no";
	private static final MCPermColumnInfo _chd_io_schd_pr_no = createColumnInfo("chd_io_schd_pr_no");
	public final MCStringPermColumn chd_io_schd_pr_no = createStringColumn(_chd_io_schd_pr_no);
	
	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	private static final MCPermColumnInfo _chd_lot_no = createColumnInfo("chd_lot_no");
	public final MCStringPermColumn chd_lot_no = createStringColumn(_chd_lot_no);
	
	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	private static final MCPermColumnInfo _chd_sublot_no = createColumnInfo("chd_sublot_no");
	public final MCStringPermColumn chd_sublot_no = createStringColumn(_chd_sublot_no);
	
	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public static final String $chd_schd_alloc_qty = "chd_schd_alloc_qty";
	private static final MCPermColumnInfo _chd_schd_alloc_qty = createColumnInfo("chd_schd_alloc_qty");
	public final MCNumberPermColumn chd_schd_alloc_qty = createNumberColumn(_chd_schd_alloc_qty);
	
	/**
	 * 子品目出庫予定日. Scheduled child item GI date.<p>
	 *
	 */
	public static final String $chd_gi_schd_dt = "chd_gi_schd_dt";
	private static final MCPermColumnInfo _chd_gi_schd_dt = createColumnInfo("chd_gi_schd_dt");
	public final MCDatePermColumn chd_gi_schd_dt = createDateColumn(_chd_gi_schd_dt);
	
	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public static final String $chd_sno1 = "chd_sno1";
	private static final MCPermColumnInfo _chd_sno1 = createColumnInfo("chd_sno1");
	public final MCStringPermColumn chd_sno1 = createStringColumn(_chd_sno1);
	
	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public static final String $chd_sno2 = "chd_sno2";
	private static final MCPermColumnInfo _chd_sno2 = createColumnInfo("chd_sno2");
	public final MCStringPermColumn chd_sno2 = createStringColumn(_chd_sno2);
	
	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public static final String $chd_sno3 = "chd_sno3";
	private static final MCPermColumnInfo _chd_sno3 = createColumnInfo("chd_sno3");
	public final MCStringPermColumn chd_sno3 = createStringColumn(_chd_sno3);
	
	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public static final String $chd_sno4 = "chd_sno4";
	private static final MCPermColumnInfo _chd_sno4 = createColumnInfo("chd_sno4");
	public final MCStringPermColumn chd_sno4 = createStringColumn(_chd_sno4);
	
	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	public static final MCMeta root_id_META = createCommonMeta($root_id, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta sort_no_META = createCommonMeta($sort_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hrrchy_META = createCommonMeta($hrrchy, mcframe.commonMA.meta.MA_META.TREE_LVL);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta chd_loc_cd_META = createCommonMeta($chd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta chd_io_schd_pr_no_META = createCommonMeta($chd_io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta chd_schd_alloc_qty_META = createCommonMeta($chd_schd_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_gi_schd_dt_META = createCommonMeta($chd_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chd_sno1_META = createCommonMeta($chd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta chd_sno2_META = createCommonMeta($chd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta chd_sno3_META = createCommonMeta($chd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta chd_sno4_META = createCommonMeta($chd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_ITM_ORD_F_HRRCHY_R> constMetas = new ConstMetaList<MSW_ITM_ORD_F_HRRCHY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			root_id_META,
			sort_no_META,
			hrrchy_META,
			itm_ord_no_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			ver_no_META,
			chd_loc_cd_META,
			chd_io_schd_pr_no_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			chd_schd_alloc_qty_META,
			chd_gi_schd_dt_META,
			chd_sno1_META,
			chd_sno2_META,
			chd_sno3_META,
			chd_sno4_META,
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
	protected MSW_ITM_ORD_F_HRRCHY_R(ConstMetaList<? extends MSW_ITM_ORD_F_HRRCHY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_ITM_ORD_F_HRRCHY_R(ConstMetaList<? extends MSW_ITM_ORD_F_HRRCHY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$root_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$root_id,
				"root_id",
				root_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$sort_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORD_F_HRRCHY_R.$sort_no,
				"sort_no",
				sort_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$hrrchy,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORD_F_HRRCHY_R.$hrrchy,
				"hrrchy",
				hrrchy,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_cd,
				"chd_itm_cd",
				chd_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub1,
				"chd_itm_sub1",
				chd_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub2,
				"chd_itm_sub2",
				chd_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_itm_sub3,
				"chd_itm_sub3",
				chd_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$ver_no,
				"ver_no",
				ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_loc_cd,
				"chd_loc_cd",
				chd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_io_schd_pr_no,
				"chd_io_schd_pr_no",
				chd_io_schd_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_lot_no,
				"chd_lot_no",
				chd_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_sublot_no,
				"chd_sublot_no",
				chd_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_schd_alloc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_schd_alloc_qty,
				"chd_schd_alloc_qty",
				chd_schd_alloc_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_gi_schd_dt,
				"chd_gi_schd_dt",
				chd_gi_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_sno1,
				"chd_sno1",
				chd_sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_sno2,
				"chd_sno2",
				chd_sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_sno3,
				"chd_sno3",
				chd_sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$chd_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$chd_sno4,
				"chd_sno4",
				chd_sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_ITM_ORD_F_HRRCHY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_ITM_ORD_F_HRRCHY_R.$wg_cd,
				"wg_cd",
				wg_cd,
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
	public static MSW_ITM_ORD_F_HRRCHY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_ITM_ORD_F_HRRCHY_R create(String alias) {
		MSW_ITM_ORD_F_HRRCHY_R row = new MSW_ITM_ORD_F_HRRCHY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_ITM_ORD_F_HRRCHY_R createByName(T proto) {
		MSW_ITM_ORD_F_HRRCHY_R row = MSW_ITM_ORD_F_HRRCHY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORD_F_HRRCHY_R clone() {
		return (MSW_ITM_ORD_F_HRRCHY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORD_F_HRRCHY_R createInstance() {
		return (MSW_ITM_ORD_F_HRRCHY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_ITM_ORD_F_HRRCHY_R getValues(String... names) {
		return (MSW_ITM_ORD_F_HRRCHY_R) super.getValues(names);
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
	 * ルートＩＤ. Route ID.<p>
	 *
	 */
	public String root_id() {
		return getConstString(offset + 0, $root_id);
	}

	/**
	 * ルートＩＤ. Route ID.<p>
	 *
	 */
	public void root_id(String value) {
		setConstString(offset + 0, $root_id, value);
	}

	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public MCNumber sort_no() {
		return getConstNumber(offset + 1, $sort_no);
	}

	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(MCNumber value) {
		setConstNumber(offset + 1, $sort_no, value);
	}
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(int value) {
		setConstNumber(offset + 1, $sort_no, value);
	}
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(long value) {
		setConstNumber(offset + 1, $sort_no, value);
	}
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(float value) {
		setConstNumber(offset + 1, $sort_no, value);
	}
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(double value) {
		setConstNumber(offset + 1, $sort_no, value);
	}
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public MCNumber hrrchy() {
		return getConstNumber(offset + 2, $hrrchy);
	}

	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public void hrrchy(MCNumber value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public void hrrchy(int value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public void hrrchy(long value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public void hrrchy(float value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}
	
	/**
	 * 階層. Hierarchy.<p>
	 *
	 */
	public void hrrchy(double value) {
		setConstNumber(offset + 2, $hrrchy, value);
	}
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 3, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 3, $itm_ord_no, value);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 4, $chd_itm_cd);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 4, $chd_itm_cd, value);
	}

	/**
	 * 子品目枝番１. Child branch No. 1.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 5, $chd_itm_sub1);
	}

	/**
	 * 子品目枝番１. Child branch No. 1.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 5, $chd_itm_sub1, value);
	}

	/**
	 * 子品目枝番２. Child branch No. 2.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 6, $chd_itm_sub2);
	}

	/**
	 * 子品目枝番２. Child branch No. 2.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 6, $chd_itm_sub2, value);
	}

	/**
	 * 子品目枝番３. Child branch No. 3.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 7, $chd_itm_sub3);
	}

	/**
	 * 子品目枝番３. Child branch No. 3.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 7, $chd_itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 8, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 8, $ver_no, value);
	}

	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public String chd_loc_cd() {
		return getConstString(offset + 9, $chd_loc_cd);
	}

	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public void chd_loc_cd(String value) {
		setConstString(offset + 9, $chd_loc_cd, value);
	}

	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public String chd_io_schd_pr_no() {
		return getConstString(offset + 10, $chd_io_schd_pr_no);
	}

	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public void chd_io_schd_pr_no(String value) {
		setConstString(offset + 10, $chd_io_schd_pr_no, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 11, $chd_lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 11, $chd_lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 12, $chd_sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 12, $chd_sublot_no, value);
	}

	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public MCNumber chd_schd_alloc_qty() {
		return getConstNumber(offset + 13, $chd_schd_alloc_qty);
	}

	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public void chd_schd_alloc_qty(MCNumber value) {
		setConstNumber(offset + 13, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public void chd_schd_alloc_qty(int value) {
		setConstNumber(offset + 13, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public void chd_schd_alloc_qty(long value) {
		setConstNumber(offset + 13, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public void chd_schd_alloc_qty(float value) {
		setConstNumber(offset + 13, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子品目引当予定数. Child item allocation scheduled qty..<p>
	 *
	 */
	public void chd_schd_alloc_qty(double value) {
		setConstNumber(offset + 13, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子品目出庫予定日. Scheduled child item GI date.<p>
	 *
	 */
	public MCDate chd_gi_schd_dt() {
		return getConstDate(offset + 14, $chd_gi_schd_dt);
	}

	/**
	 * 子品目出庫予定日. Scheduled child item GI date.<p>
	 *
	 */
	public void chd_gi_schd_dt(MCDate value) {
		setConstDate(offset + 14, $chd_gi_schd_dt, value);
	}

	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public String chd_sno1() {
		return getConstString(offset + 15, $chd_sno1);
	}

	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public void chd_sno1(String value) {
		setConstString(offset + 15, $chd_sno1, value);
	}

	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public String chd_sno2() {
		return getConstString(offset + 16, $chd_sno2);
	}

	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public void chd_sno2(String value) {
		setConstString(offset + 16, $chd_sno2, value);
	}

	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public String chd_sno3() {
		return getConstString(offset + 17, $chd_sno3);
	}

	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public void chd_sno3(String value) {
		setConstString(offset + 17, $chd_sno3, value);
	}

	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public String chd_sno4() {
		return getConstString(offset + 18, $chd_sno4);
	}

	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public void chd_sno4(String value) {
		setConstString(offset + 18, $chd_sno4, value);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 19, $wg_cd);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 19, $wg_cd, value);
	}

	public String getString(String name) {
		if ($root_id.equalsIgnoreCase(name)) {
			return root_id();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			return chd_loc_cd();
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			return chd_io_schd_pr_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			return chd_schd_alloc_qty();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			return chd_gi_schd_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($root_id.equalsIgnoreCase(name)) {
			return root_id();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			return chd_loc_cd();
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			return chd_io_schd_pr_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			return hrrchy();
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			return chd_schd_alloc_qty();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			return chd_gi_schd_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($root_id.equalsIgnoreCase(name)) {
			root_id(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			chd_loc_cd(value);
			return;
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			chd_io_schd_pr_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			chd_gi_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($root_id.equalsIgnoreCase(name)) {
			root_id(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			chd_loc_cd(value);
			return;
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			chd_io_schd_pr_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($hrrchy.equalsIgnoreCase(name)) {
			hrrchy(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			chd_gi_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
