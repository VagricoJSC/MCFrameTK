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
 * "原価ＢＯＭ展開一時ワーク // Temporary work for cost BOM explosion"DBコンテナRowクラスです。<p>
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
 *  	<td>bom_lvl</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＢＯＭ階層</td>
 *  	<td>BOM hierarchy</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sort_no</td>
 *  	<td>C</td>
 *  	<td>3000</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ソート順</td>
 *  	<td>Sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bom_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成パタン</td>
 *  	<td>BOM pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_grp_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループＣＤ</td>
 *  	<td>Alternative group cd.</td>
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
 *  	<td>par_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親必要数量</td>
 *  	<td>Parent required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子必要数量</td>
 *  	<td>Child required qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_base_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子投入数量</td>
 *  	<td>Child input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_chd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子固定必要数量</td>
 *  	<td>Child fixed required qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_min_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子最小必要数量</td>
 *  	<td>Child min. required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_batch_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子刻み必要数量</td>
 *  	<td>Increments of child required qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_itm_ratio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目比率</td>
 *  	<td>Alternative item ratio</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親ワーキンググループＣＤ</td>
 *  	<td>Parent WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_sort_no</td>
 *  	<td>C</td>
 *  	<td>3000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>親ソート順</td>
 *  	<td>Parent sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bom_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＯＭワーキンググループＣＤ</td>
 *  	<td>BOM WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計算カテゴリＣＤ</td>
 *  	<td>Calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目計算カテゴリＣＤ</td>
 *  	<td>Item calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dtl_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>詳細計算カテゴリＣＤ</td>
 *  	<td>Details calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買計算カテゴリＣＤ</td>
 *  	<td>Purchase calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>proc_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>加工計算カテゴリＣＤ</td>
 *  	<td>Subcontracting calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給計算カテゴリＣＤ</td>
 *  	<td>Supply calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売計算カテゴリＣＤ</td>
 *  	<td>Sales calculation category cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_calc_ctg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指値計算カテゴリＣＤ</td>
 *  	<td>Limit unit price calculation category cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bottom_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最下位ＦＬＧ</td>
 *  	<td>Bottom flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loop_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ループＦＬＧ</td>
 *  	<td>Loop flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_BOM_EX_TMP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_BOM_EX_TMP";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public static final String $bom_lvl = "bom_lvl";
	private static final MCPermColumnInfo _bom_lvl = createColumnInfo("bom_lvl");
	public final MCNumberPermColumn bom_lvl = createNumberColumn(_bom_lvl);
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public static final String $sort_no = "sort_no";
	private static final MCPermColumnInfo _sort_no = createColumnInfo("sort_no");
	public final MCStringPermColumn sort_no = createStringColumn(_sort_no);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
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
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	private static final MCPermColumnInfo _bom_ptn = createColumnInfo("bom_ptn");
	public final MCStringPermColumn bom_ptn = createStringColumn(_bom_ptn);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	private static final MCPermColumnInfo _alt_grp_cd = createColumnInfo("alt_grp_cd");
	public final MCStringPermColumn alt_grp_cd = createStringColumn(_alt_grp_cd);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public static final String $par_rqmt_qty = "par_rqmt_qty";
	private static final MCPermColumnInfo _par_rqmt_qty = createColumnInfo("par_rqmt_qty");
	public final MCNumberPermColumn par_rqmt_qty = createNumberColumn(_par_rqmt_qty);
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public static final String $chd_rqmt_qty = "chd_rqmt_qty";
	private static final MCPermColumnInfo _chd_rqmt_qty = createColumnInfo("chd_rqmt_qty");
	public final MCNumberPermColumn chd_rqmt_qty = createNumberColumn(_chd_rqmt_qty);
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public static final String $chd_base_qty = "chd_base_qty";
	private static final MCPermColumnInfo _chd_base_qty = createColumnInfo("chd_base_qty");
	public final MCNumberPermColumn chd_base_qty = createNumberColumn(_chd_base_qty);
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public static final String $fxd_chd_rqmt_qty = "fxd_chd_rqmt_qty";
	private static final MCPermColumnInfo _fxd_chd_rqmt_qty = createColumnInfo("fxd_chd_rqmt_qty");
	public final MCNumberPermColumn fxd_chd_rqmt_qty = createNumberColumn(_fxd_chd_rqmt_qty);
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public static final String $chd_min_qty = "chd_min_qty";
	private static final MCPermColumnInfo _chd_min_qty = createColumnInfo("chd_min_qty");
	public final MCNumberPermColumn chd_min_qty = createNumberColumn(_chd_min_qty);
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public static final String $chd_batch_qty = "chd_batch_qty";
	private static final MCPermColumnInfo _chd_batch_qty = createColumnInfo("chd_batch_qty");
	public final MCNumberPermColumn chd_batch_qty = createNumberColumn(_chd_batch_qty);
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	private static final MCPermColumnInfo _alt_itm_ratio = createColumnInfo("alt_itm_ratio");
	public final MCNumberPermColumn alt_itm_ratio = createNumberColumn(_alt_itm_ratio);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 親ワーキンググループＣＤ. Parent WG cd..<p>
	 *
	 */
	public static final String $par_wg_cd = "par_wg_cd";
	private static final MCPermColumnInfo _par_wg_cd = createColumnInfo("par_wg_cd");
	public final MCStringPermColumn par_wg_cd = createStringColumn(_par_wg_cd);
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 親ソート順. Parent sort order.<p>
	 *
	 */
	public static final String $par_sort_no = "par_sort_no";
	private static final MCPermColumnInfo _par_sort_no = createColumnInfo("par_sort_no");
	public final MCStringPermColumn par_sort_no = createStringColumn(_par_sort_no);
	
	/**
	 * ＢＯＭワーキンググループＣＤ. BOM WG cd..<p>
	 *
	 */
	public static final String $bom_wg_cd = "bom_wg_cd";
	private static final MCPermColumnInfo _bom_wg_cd = createColumnInfo("bom_wg_cd");
	public final MCStringPermColumn bom_wg_cd = createStringColumn(_bom_wg_cd);
	
	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	private static final MCPermColumnInfo _calc_ctg_cd = createColumnInfo("calc_ctg_cd");
	public final MCStringPermColumn calc_ctg_cd = createStringColumn(_calc_ctg_cd);
	
	/**
	 * 品目計算カテゴリＣＤ. Item calculation category cd..<p>
	 *
	 */
	public static final String $itm_calc_ctg_cd = "itm_calc_ctg_cd";
	private static final MCPermColumnInfo _itm_calc_ctg_cd = createColumnInfo("itm_calc_ctg_cd");
	public final MCStringPermColumn itm_calc_ctg_cd = createStringColumn(_itm_calc_ctg_cd);
	
	/**
	 * 詳細計算カテゴリＣＤ. Details calculation category cd..<p>
	 *
	 */
	public static final String $dtl_calc_ctg_cd = "dtl_calc_ctg_cd";
	private static final MCPermColumnInfo _dtl_calc_ctg_cd = createColumnInfo("dtl_calc_ctg_cd");
	public final MCStringPermColumn dtl_calc_ctg_cd = createStringColumn(_dtl_calc_ctg_cd);
	
	/**
	 * 購買計算カテゴリＣＤ. Purchase calculation category cd..<p>
	 *
	 */
	public static final String $purc_calc_ctg_cd = "purc_calc_ctg_cd";
	private static final MCPermColumnInfo _purc_calc_ctg_cd = createColumnInfo("purc_calc_ctg_cd");
	public final MCStringPermColumn purc_calc_ctg_cd = createStringColumn(_purc_calc_ctg_cd);
	
	/**
	 * 加工計算カテゴリＣＤ. Subcontracting calculation category cd..<p>
	 *
	 */
	public static final String $proc_calc_ctg_cd = "proc_calc_ctg_cd";
	private static final MCPermColumnInfo _proc_calc_ctg_cd = createColumnInfo("proc_calc_ctg_cd");
	public final MCStringPermColumn proc_calc_ctg_cd = createStringColumn(_proc_calc_ctg_cd);
	
	/**
	 * 支給計算カテゴリＣＤ. Supply calculation category cd..<p>
	 *
	 */
	public static final String $prov_calc_ctg_cd = "prov_calc_ctg_cd";
	private static final MCPermColumnInfo _prov_calc_ctg_cd = createColumnInfo("prov_calc_ctg_cd");
	public final MCStringPermColumn prov_calc_ctg_cd = createStringColumn(_prov_calc_ctg_cd);
	
	/**
	 * 販売計算カテゴリＣＤ. Sales calculation category cd..<p>
	 *
	 */
	public static final String $sls_calc_ctg_cd = "sls_calc_ctg_cd";
	private static final MCPermColumnInfo _sls_calc_ctg_cd = createColumnInfo("sls_calc_ctg_cd");
	public final MCStringPermColumn sls_calc_ctg_cd = createStringColumn(_sls_calc_ctg_cd);
	
	/**
	 * 指値計算カテゴリＣＤ. Limit unit price calculation category cd..<p>
	 *
	 */
	public static final String $fix_calc_ctg_cd = "fix_calc_ctg_cd";
	private static final MCPermColumnInfo _fix_calc_ctg_cd = createColumnInfo("fix_calc_ctg_cd");
	public final MCStringPermColumn fix_calc_ctg_cd = createStringColumn(_fix_calc_ctg_cd);
	
	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	private static final MCPermColumnInfo _bottom_flg = createColumnInfo("bottom_flg");
	public final MCBooleanPermColumn bottom_flg = createBooleanColumn(_bottom_flg);
	
	/**
	 * ループＦＬＧ. Loop flg..<p>
	 *
	 */
	public static final String $loop_flg = "loop_flg";
	private static final MCPermColumnInfo _loop_flg = createColumnInfo("loop_flg");
	public final MCBooleanPermColumn loop_flg = createBooleanColumn(_loop_flg);
	
	public static final MCMeta bom_lvl_META = createCommonMeta($bom_lvl, mcframe.commonMA.meta.MA_META.BOM_LVL);
	public static final MCMeta sort_no_META = createCommonMeta($sort_no, mcframe.commonMA.meta.MA_META.BOM_EX_SORT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta par_rqmt_qty_META = createCommonMeta($par_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_rqmt_qty_META = createCommonMeta($chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_base_qty_META = createCommonMeta($chd_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_chd_rqmt_qty_META = createCommonMeta($fxd_chd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_min_qty_META = createCommonMeta($chd_min_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_batch_qty_META = createCommonMeta($chd_batch_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta par_wg_cd_META = createCommonMeta($par_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta par_sort_no_META = createCommonMeta($par_sort_no, mcframe.commonMA.meta.MA_META.BOM_EX_SORT);
	public static final MCMeta bom_wg_cd_META = createCommonMeta($bom_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta itm_calc_ctg_cd_META = createCommonMeta($itm_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta dtl_calc_ctg_cd_META = createCommonMeta($dtl_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta purc_calc_ctg_cd_META = createCommonMeta($purc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta proc_calc_ctg_cd_META = createCommonMeta($proc_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta prov_calc_ctg_cd_META = createCommonMeta($prov_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta sls_calc_ctg_cd_META = createCommonMeta($sls_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta fix_calc_ctg_cd_META = createCommonMeta($fix_calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loop_flg_META = createCommonMeta($loop_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_BOM_EX_TMP_R> constMetas = new ConstMetaList<MGW_BOM_EX_TMP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bom_lvl_META,
			sort_no_META,
			wg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			bom_ptn_META,
			oper_cd_META,
			oper_seq_META,
			alt_grp_cd_META,
			expns_cd_META,
			par_rqmt_qty_META,
			chd_rqmt_qty_META,
			chd_base_qty_META,
			fxd_chd_rqmt_qty_META,
			chd_min_qty_META,
			chd_batch_qty_META,
			alt_itm_ratio_META,
			disp_seq_META,
			par_wg_cd_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			par_sort_no_META,
			bom_wg_cd_META,
			calc_ctg_cd_META,
			itm_calc_ctg_cd_META,
			dtl_calc_ctg_cd_META,
			purc_calc_ctg_cd_META,
			proc_calc_ctg_cd_META,
			prov_calc_ctg_cd_META,
			sls_calc_ctg_cd_META,
			fix_calc_ctg_cd_META,
			bottom_flg_META,
			loop_flg_META
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
	protected MGW_BOM_EX_TMP_R(ConstMetaList<? extends MGW_BOM_EX_TMP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_BOM_EX_TMP_R(ConstMetaList<? extends MGW_BOM_EX_TMP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$bom_lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$bom_lvl,
				"bom_lvl",
				bom_lvl,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$sort_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$sort_no,
				"sort_no",
				sort_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$itm_cd,
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
			MGW_BOM_EX_TMP_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$itm_sub1,
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
			MGW_BOM_EX_TMP_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$itm_sub2,
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
			MGW_BOM_EX_TMP_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$itm_sub3,
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
			MGW_BOM_EX_TMP_R.$bom_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$bom_ptn,
				"bom_ptn",
				bom_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$oper_seq,
				"oper_seq",
				oper_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$alt_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$alt_grp_cd,
				"alt_grp_cd",
				alt_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$expns_cd,
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
			MGW_BOM_EX_TMP_R.$par_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$par_rqmt_qty,
				"par_rqmt_qty",
				par_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$chd_rqmt_qty,
				"chd_rqmt_qty",
				chd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$chd_base_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$chd_base_qty,
				"chd_base_qty",
				chd_base_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$fxd_chd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$fxd_chd_rqmt_qty,
				"fxd_chd_rqmt_qty",
				fxd_chd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$chd_min_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$chd_min_qty,
				"chd_min_qty",
				chd_min_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$chd_batch_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$chd_batch_qty,
				"chd_batch_qty",
				chd_batch_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$alt_itm_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$alt_itm_ratio,
				"alt_itm_ratio",
				alt_itm_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_BOM_EX_TMP_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_wg_cd,
				"par_wg_cd",
				par_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$par_sort_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$par_sort_no,
				"par_sort_no",
				par_sort_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$bom_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$bom_wg_cd,
				"bom_wg_cd",
				bom_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$calc_ctg_cd,
				"calc_ctg_cd",
				calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$itm_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$itm_calc_ctg_cd,
				"itm_calc_ctg_cd",
				itm_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$dtl_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$dtl_calc_ctg_cd,
				"dtl_calc_ctg_cd",
				dtl_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$purc_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$purc_calc_ctg_cd,
				"purc_calc_ctg_cd",
				purc_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$proc_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$proc_calc_ctg_cd,
				"proc_calc_ctg_cd",
				proc_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$prov_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$prov_calc_ctg_cd,
				"prov_calc_ctg_cd",
				prov_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$sls_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$sls_calc_ctg_cd,
				"sls_calc_ctg_cd",
				sls_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$fix_calc_ctg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_BOM_EX_TMP_R.$fix_calc_ctg_cd,
				"fix_calc_ctg_cd",
				fix_calc_ctg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$bottom_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_BOM_EX_TMP_R.$bottom_flg,
				"bottom_flg",
				bottom_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_BOM_EX_TMP_R.$loop_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_BOM_EX_TMP_R.$loop_flg,
				"loop_flg",
				loop_flg,
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
	public static MGW_BOM_EX_TMP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_BOM_EX_TMP_R create(String alias) {
		MGW_BOM_EX_TMP_R row = new MGW_BOM_EX_TMP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_BOM_EX_TMP_R createByName(T proto) {
		MGW_BOM_EX_TMP_R row = MGW_BOM_EX_TMP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_BOM_EX_TMP_R clone() {
		return (MGW_BOM_EX_TMP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_BOM_EX_TMP_R createInstance() {
		return (MGW_BOM_EX_TMP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_BOM_EX_TMP_R getValues(String... names) {
		return (MGW_BOM_EX_TMP_R) super.getValues(names);
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
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public MCNumber bom_lvl() {
		return getConstNumber(offset + 0, $bom_lvl);
	}

	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public void bom_lvl(MCNumber value) {
		setConstNumber(offset + 0, $bom_lvl, value);
	}
	
	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public void bom_lvl(int value) {
		setConstNumber(offset + 0, $bom_lvl, value);
	}
	
	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public void bom_lvl(long value) {
		setConstNumber(offset + 0, $bom_lvl, value);
	}
	
	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public void bom_lvl(float value) {
		setConstNumber(offset + 0, $bom_lvl, value);
	}
	
	/**
	 * ＢＯＭ階層. BOM hierarchy.<p>
	 *
	 */
	public void bom_lvl(double value) {
		setConstNumber(offset + 0, $bom_lvl, value);
	}
	
	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public String sort_no() {
		return getConstString(offset + 1, $sort_no);
	}

	/**
	 * ソート順. Sort order.<p>
	 *
	 */
	public void sort_no(String value) {
		setConstString(offset + 1, $sort_no, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 7, $bom_ptn);
	}

	/**
	 * 構成パタン. BOM pattern.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 7, $bom_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 8, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 8, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 9, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 9, $oper_seq, value);
	}
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 10, $alt_grp_cd);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 10, $alt_grp_cd, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 11, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 11, $expns_cd, value);
	}

	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public MCNumber par_rqmt_qty() {
		return getConstNumber(offset + 12, $par_rqmt_qty);
	}

	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public void par_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 12, $par_rqmt_qty, value);
	}
	
	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public void par_rqmt_qty(int value) {
		setConstNumber(offset + 12, $par_rqmt_qty, value);
	}
	
	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public void par_rqmt_qty(long value) {
		setConstNumber(offset + 12, $par_rqmt_qty, value);
	}
	
	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public void par_rqmt_qty(float value) {
		setConstNumber(offset + 12, $par_rqmt_qty, value);
	}
	
	/**
	 * 親必要数量. Parent required qty..<p>
	 *
	 */
	public void par_rqmt_qty(double value) {
		setConstNumber(offset + 12, $par_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public MCNumber chd_rqmt_qty() {
		return getConstNumber(offset + 13, $chd_rqmt_qty);
	}

	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 13, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(int value) {
		setConstNumber(offset + 13, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(long value) {
		setConstNumber(offset + 13, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(float value) {
		setConstNumber(offset + 13, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子必要数量. Child required qty..<p>
	 *
	 */
	public void chd_rqmt_qty(double value) {
		setConstNumber(offset + 13, $chd_rqmt_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public MCNumber chd_base_qty() {
		return getConstNumber(offset + 14, $chd_base_qty);
	}

	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_base_qty(MCNumber value) {
		setConstNumber(offset + 14, $chd_base_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_base_qty(int value) {
		setConstNumber(offset + 14, $chd_base_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_base_qty(long value) {
		setConstNumber(offset + 14, $chd_base_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_base_qty(float value) {
		setConstNumber(offset + 14, $chd_base_qty, value);
	}
	
	/**
	 * 子投入数量. Child input qty..<p>
	 *
	 */
	public void chd_base_qty(double value) {
		setConstNumber(offset + 14, $chd_base_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public MCNumber fxd_chd_rqmt_qty() {
		return getConstNumber(offset + 15, $fxd_chd_rqmt_qty);
	}

	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 15, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(int value) {
		setConstNumber(offset + 15, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(long value) {
		setConstNumber(offset + 15, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(float value) {
		setConstNumber(offset + 15, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子固定必要数量. Child fixed required qty..<p>
	 *
	 */
	public void fxd_chd_rqmt_qty(double value) {
		setConstNumber(offset + 15, $fxd_chd_rqmt_qty, value);
	}
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public MCNumber chd_min_qty() {
		return getConstNumber(offset + 16, $chd_min_qty);
	}

	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public void chd_min_qty(MCNumber value) {
		setConstNumber(offset + 16, $chd_min_qty, value);
	}
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public void chd_min_qty(int value) {
		setConstNumber(offset + 16, $chd_min_qty, value);
	}
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public void chd_min_qty(long value) {
		setConstNumber(offset + 16, $chd_min_qty, value);
	}
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public void chd_min_qty(float value) {
		setConstNumber(offset + 16, $chd_min_qty, value);
	}
	
	/**
	 * 子最小必要数量. Child min. required qty..<p>
	 *
	 */
	public void chd_min_qty(double value) {
		setConstNumber(offset + 16, $chd_min_qty, value);
	}
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public MCNumber chd_batch_qty() {
		return getConstNumber(offset + 17, $chd_batch_qty);
	}

	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public void chd_batch_qty(MCNumber value) {
		setConstNumber(offset + 17, $chd_batch_qty, value);
	}
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public void chd_batch_qty(int value) {
		setConstNumber(offset + 17, $chd_batch_qty, value);
	}
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public void chd_batch_qty(long value) {
		setConstNumber(offset + 17, $chd_batch_qty, value);
	}
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public void chd_batch_qty(float value) {
		setConstNumber(offset + 17, $chd_batch_qty, value);
	}
	
	/**
	 * 子刻み必要数量. Increments of child required qty..<p>
	 *
	 */
	public void chd_batch_qty(double value) {
		setConstNumber(offset + 17, $chd_batch_qty, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 18, $alt_itm_ratio);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 19, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 19, $disp_seq, value);
	}
	
	/**
	 * 親ワーキンググループＣＤ. Parent WG cd..<p>
	 *
	 */
	public String par_wg_cd() {
		return getConstString(offset + 20, $par_wg_cd);
	}

	/**
	 * 親ワーキンググループＣＤ. Parent WG cd..<p>
	 *
	 */
	public void par_wg_cd(String value) {
		setConstString(offset + 20, $par_wg_cd, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 21, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 21, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 22, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 22, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 23, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 23, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 24, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 24, $par_itm_sub3, value);
	}

	/**
	 * 親ソート順. Parent sort order.<p>
	 *
	 */
	public String par_sort_no() {
		return getConstString(offset + 25, $par_sort_no);
	}

	/**
	 * 親ソート順. Parent sort order.<p>
	 *
	 */
	public void par_sort_no(String value) {
		setConstString(offset + 25, $par_sort_no, value);
	}

	/**
	 * ＢＯＭワーキンググループＣＤ. BOM WG cd..<p>
	 *
	 */
	public String bom_wg_cd() {
		return getConstString(offset + 26, $bom_wg_cd);
	}

	/**
	 * ＢＯＭワーキンググループＣＤ. BOM WG cd..<p>
	 *
	 */
	public void bom_wg_cd(String value) {
		setConstString(offset + 26, $bom_wg_cd, value);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 27, $calc_ctg_cd);
	}

	/**
	 * 計算カテゴリＣＤ. Calculation category cd..<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 27, $calc_ctg_cd, value);
	}

	/**
	 * 品目計算カテゴリＣＤ. Item calculation category cd..<p>
	 *
	 */
	public String itm_calc_ctg_cd() {
		return getConstString(offset + 28, $itm_calc_ctg_cd);
	}

	/**
	 * 品目計算カテゴリＣＤ. Item calculation category cd..<p>
	 *
	 */
	public void itm_calc_ctg_cd(String value) {
		setConstString(offset + 28, $itm_calc_ctg_cd, value);
	}

	/**
	 * 詳細計算カテゴリＣＤ. Details calculation category cd..<p>
	 *
	 */
	public String dtl_calc_ctg_cd() {
		return getConstString(offset + 29, $dtl_calc_ctg_cd);
	}

	/**
	 * 詳細計算カテゴリＣＤ. Details calculation category cd..<p>
	 *
	 */
	public void dtl_calc_ctg_cd(String value) {
		setConstString(offset + 29, $dtl_calc_ctg_cd, value);
	}

	/**
	 * 購買計算カテゴリＣＤ. Purchase calculation category cd..<p>
	 *
	 */
	public String purc_calc_ctg_cd() {
		return getConstString(offset + 30, $purc_calc_ctg_cd);
	}

	/**
	 * 購買計算カテゴリＣＤ. Purchase calculation category cd..<p>
	 *
	 */
	public void purc_calc_ctg_cd(String value) {
		setConstString(offset + 30, $purc_calc_ctg_cd, value);
	}

	/**
	 * 加工計算カテゴリＣＤ. Subcontracting calculation category cd..<p>
	 *
	 */
	public String proc_calc_ctg_cd() {
		return getConstString(offset + 31, $proc_calc_ctg_cd);
	}

	/**
	 * 加工計算カテゴリＣＤ. Subcontracting calculation category cd..<p>
	 *
	 */
	public void proc_calc_ctg_cd(String value) {
		setConstString(offset + 31, $proc_calc_ctg_cd, value);
	}

	/**
	 * 支給計算カテゴリＣＤ. Supply calculation category cd..<p>
	 *
	 */
	public String prov_calc_ctg_cd() {
		return getConstString(offset + 32, $prov_calc_ctg_cd);
	}

	/**
	 * 支給計算カテゴリＣＤ. Supply calculation category cd..<p>
	 *
	 */
	public void prov_calc_ctg_cd(String value) {
		setConstString(offset + 32, $prov_calc_ctg_cd, value);
	}

	/**
	 * 販売計算カテゴリＣＤ. Sales calculation category cd..<p>
	 *
	 */
	public String sls_calc_ctg_cd() {
		return getConstString(offset + 33, $sls_calc_ctg_cd);
	}

	/**
	 * 販売計算カテゴリＣＤ. Sales calculation category cd..<p>
	 *
	 */
	public void sls_calc_ctg_cd(String value) {
		setConstString(offset + 33, $sls_calc_ctg_cd, value);
	}

	/**
	 * 指値計算カテゴリＣＤ. Limit unit price calculation category cd..<p>
	 *
	 */
	public String fix_calc_ctg_cd() {
		return getConstString(offset + 34, $fix_calc_ctg_cd);
	}

	/**
	 * 指値計算カテゴリＣＤ. Limit unit price calculation category cd..<p>
	 *
	 */
	public void fix_calc_ctg_cd(String value) {
		setConstString(offset + 34, $fix_calc_ctg_cd, value);
	}

	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 35, $bottom_flg);
	}

	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 35, $bottom_flg, value);
	}

	/**
	 * ループＦＬＧ. Loop flg..<p>
	 *
	 */
	public boolean loop_flg() {
		return getConstBoolean(offset + 36, $loop_flg);
	}

	/**
	 * ループＦＬＧ. Loop flg..<p>
	 *
	 */
	public void loop_flg(boolean value) {
		setConstBoolean(offset + 36, $loop_flg, value);
	}

	public String getString(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($par_wg_cd.equalsIgnoreCase(name)) {
			return par_wg_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_sort_no.equalsIgnoreCase(name)) {
			return par_sort_no();
		}
		if ($bom_wg_cd.equalsIgnoreCase(name)) {
			return bom_wg_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			return bom_lvl();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sort_no.equalsIgnoreCase(name)) {
			return sort_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($par_wg_cd.equalsIgnoreCase(name)) {
			return par_wg_cd();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($par_sort_no.equalsIgnoreCase(name)) {
			return par_sort_no();
		}
		if ($bom_wg_cd.equalsIgnoreCase(name)) {
			return bom_wg_cd();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			return itm_calc_ctg_cd();
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			return dtl_calc_ctg_cd();
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return purc_calc_ctg_cd();
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			return proc_calc_ctg_cd();
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			return prov_calc_ctg_cd();
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			return sls_calc_ctg_cd();
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			return fix_calc_ctg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			return bom_lvl();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			return par_rqmt_qty();
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			return chd_rqmt_qty();
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			return chd_base_qty();
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			return fxd_chd_rqmt_qty();
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			return chd_min_qty();
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			return chd_batch_qty();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			return loop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($par_wg_cd.equalsIgnoreCase(name)) {
			par_wg_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_sort_no.equalsIgnoreCase(name)) {
			par_sort_no(value);
			return;
		}
		if ($bom_wg_cd.equalsIgnoreCase(name)) {
			bom_wg_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sort_no.equalsIgnoreCase(name)) {
			sort_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($par_wg_cd.equalsIgnoreCase(name)) {
			par_wg_cd(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($par_sort_no.equalsIgnoreCase(name)) {
			par_sort_no(value);
			return;
		}
		if ($bom_wg_cd.equalsIgnoreCase(name)) {
			bom_wg_cd(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($itm_calc_ctg_cd.equalsIgnoreCase(name)) {
			itm_calc_ctg_cd(value);
			return;
		}
		if ($dtl_calc_ctg_cd.equalsIgnoreCase(name)) {
			dtl_calc_ctg_cd(value);
			return;
		}
		if ($purc_calc_ctg_cd.equalsIgnoreCase(name)) {
			purc_calc_ctg_cd(value);
			return;
		}
		if ($proc_calc_ctg_cd.equalsIgnoreCase(name)) {
			proc_calc_ctg_cd(value);
			return;
		}
		if ($prov_calc_ctg_cd.equalsIgnoreCase(name)) {
			prov_calc_ctg_cd(value);
			return;
		}
		if ($sls_calc_ctg_cd.equalsIgnoreCase(name)) {
			sls_calc_ctg_cd(value);
			return;
		}
		if ($fix_calc_ctg_cd.equalsIgnoreCase(name)) {
			fix_calc_ctg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($bom_lvl.equalsIgnoreCase(name)) {
			bom_lvl(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($par_rqmt_qty.equalsIgnoreCase(name)) {
			par_rqmt_qty(value);
			return;
		}
		if ($chd_rqmt_qty.equalsIgnoreCase(name)) {
			chd_rqmt_qty(value);
			return;
		}
		if ($chd_base_qty.equalsIgnoreCase(name)) {
			chd_base_qty(value);
			return;
		}
		if ($fxd_chd_rqmt_qty.equalsIgnoreCase(name)) {
			fxd_chd_rqmt_qty(value);
			return;
		}
		if ($chd_min_qty.equalsIgnoreCase(name)) {
			chd_min_qty(value);
			return;
		}
		if ($chd_batch_qty.equalsIgnoreCase(name)) {
			chd_batch_qty(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		if ($loop_flg.equalsIgnoreCase(name)) {
			loop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
