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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "売上集計受注ワーク // Sales aggregated orders work"DBコンテナRowクラスです。<p>
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
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上担当者ＣＤ</td>
 *  	<td>Sales PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目体系ＣＤ</td>
 *  	<td>Item system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上数量</td>
 *  	<td>Sales qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上金額</td>
 *  	<td>Sales amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨売上金額</td>
 *  	<td>Sales amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cost_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上原価金額</td>
 *  	<td>Cost of goods sold</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注数量</td>
 *  	<td>Sales order qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注金額</td>
 *  	<td>Sales order amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_cost_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注原価金額</td>
 *  	<td>Sales order cost amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_bl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注残数量</td>
 *  	<td>Sales order backlog qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_bl_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注残金額</td>
 *  	<td>Sales order backlog amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_bl_cost_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注残原価金額</td>
 *  	<td>Sales order backlog cost amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>spln_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計画数量</td>
 *  	<td>Plan qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>spln_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計画金額</td>
 *  	<td>Plan amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bdg_sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予算売上金額</td>
 *  	<td>Budget sales amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bdg_sls_prof_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予算売上粗利金額</td>
 *  	<td>Budget gross profit</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_lvl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門階層ＣＤ</td>
 *  	<td>Dept. hierarchy cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ１</td>
 *  	<td>Dept. cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ２</td>
 *  	<td>Dept. cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_itm_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目体系ＣＤ１</td>
 *  	<td>Item system cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_itm_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目体系ＣＤ２</td>
 *  	<td>Item system cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_sum_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計対象外ＦＬＧ</td>
 *  	<td>Not for aggregation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>spln_usr_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売計画担当者ＦＬＧ</td>
 *  	<td>Sales plan PIC flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SLO_SLS_SUM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SLO_SLS_SUM";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	private static final MCPermColumnInfo _sls_usr_cd = createColumnInfo("sls_usr_cd");
	public final MCStringPermColumn sls_usr_cd = createStringColumn(_sls_usr_cd);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
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
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 品目体系ＣＤ. Item system cd..<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	private static final MCPermColumnInfo _sls_itm_grp_cd = createColumnInfo("sls_itm_grp_cd");
	public final MCStringPermColumn sls_itm_grp_cd = createStringColumn(_sls_itm_grp_cd);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	private static final MCPermColumnInfo _sls_qty = createColumnInfo("sls_qty");
	public final MCNumberPermColumn sls_qty = createNumberColumn(_sls_qty);
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	private static final MCPermColumnInfo _sls_amt = createColumnInfo("sls_amt");
	public final MCNumberPermColumn sls_amt = createNumberColumn(_sls_amt);
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_sls_amt = "base_cur_sls_amt";
	private static final MCPermColumnInfo _base_cur_sls_amt = createColumnInfo("base_cur_sls_amt");
	public final MCNumberPermColumn base_cur_sls_amt = createNumberColumn(_base_cur_sls_amt);
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public static final String $sls_cost_amt = "sls_cost_amt";
	private static final MCPermColumnInfo _sls_cost_amt = createColumnInfo("sls_cost_amt");
	public final MCNumberPermColumn sls_cost_amt = createNumberColumn(_sls_cost_amt);
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public static final String $slo_qty = "slo_qty";
	private static final MCPermColumnInfo _slo_qty = createColumnInfo("slo_qty");
	public final MCNumberPermColumn slo_qty = createNumberColumn(_slo_qty);
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public static final String $slo_amt = "slo_amt";
	private static final MCPermColumnInfo _slo_amt = createColumnInfo("slo_amt");
	public final MCNumberPermColumn slo_amt = createNumberColumn(_slo_amt);
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public static final String $slo_cost_amt = "slo_cost_amt";
	private static final MCPermColumnInfo _slo_cost_amt = createColumnInfo("slo_cost_amt");
	public final MCNumberPermColumn slo_cost_amt = createNumberColumn(_slo_cost_amt);
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public static final String $slo_bl_qty = "slo_bl_qty";
	private static final MCPermColumnInfo _slo_bl_qty = createColumnInfo("slo_bl_qty");
	public final MCNumberPermColumn slo_bl_qty = createNumberColumn(_slo_bl_qty);
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public static final String $slo_bl_amt = "slo_bl_amt";
	private static final MCPermColumnInfo _slo_bl_amt = createColumnInfo("slo_bl_amt");
	public final MCNumberPermColumn slo_bl_amt = createNumberColumn(_slo_bl_amt);
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public static final String $slo_bl_cost_amt = "slo_bl_cost_amt";
	private static final MCPermColumnInfo _slo_bl_cost_amt = createColumnInfo("slo_bl_cost_amt");
	public final MCNumberPermColumn slo_bl_cost_amt = createNumberColumn(_slo_bl_cost_amt);
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public static final String $spln_qty = "spln_qty";
	private static final MCPermColumnInfo _spln_qty = createColumnInfo("spln_qty");
	public final MCNumberPermColumn spln_qty = createNumberColumn(_spln_qty);
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public static final String $spln_amt = "spln_amt";
	private static final MCPermColumnInfo _spln_amt = createColumnInfo("spln_amt");
	public final MCNumberPermColumn spln_amt = createNumberColumn(_spln_amt);
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public static final String $bdg_sls_amt = "bdg_sls_amt";
	private static final MCPermColumnInfo _bdg_sls_amt = createColumnInfo("bdg_sls_amt");
	public final MCNumberPermColumn bdg_sls_amt = createNumberColumn(_bdg_sls_amt);
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public static final String $bdg_sls_prof_amt = "bdg_sls_prof_amt";
	private static final MCPermColumnInfo _bdg_sls_prof_amt = createColumnInfo("bdg_sls_prof_amt");
	public final MCNumberPermColumn bdg_sls_prof_amt = createNumberColumn(_bdg_sls_prof_amt);
	
	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	private static final MCPermColumnInfo _dpt_lvl_cd = createColumnInfo("dpt_lvl_cd");
	public final MCStringPermColumn dpt_lvl_cd = createStringColumn(_dpt_lvl_cd);
	
	/**
	 * 部門ＣＤ１. Dept. cd. 1.<p>
	 *
	 */
	public static final String $dpt_cd1 = "dpt_cd1";
	private static final MCPermColumnInfo _dpt_cd1 = createColumnInfo("dpt_cd1");
	public final MCStringPermColumn dpt_cd1 = createStringColumn(_dpt_cd1);
	
	/**
	 * 部門ＣＤ２. Dept. cd. 2.<p>
	 *
	 */
	public static final String $dpt_cd2 = "dpt_cd2";
	private static final MCPermColumnInfo _dpt_cd2 = createColumnInfo("dpt_cd2");
	public final MCStringPermColumn dpt_cd2 = createStringColumn(_dpt_cd2);
	
	/**
	 * 品目体系ＣＤ１. Item system cd. 1.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd1 = "sls_itm_grp_cd1";
	private static final MCPermColumnInfo _sls_itm_grp_cd1 = createColumnInfo("sls_itm_grp_cd1");
	public final MCStringPermColumn sls_itm_grp_cd1 = createStringColumn(_sls_itm_grp_cd1);
	
	/**
	 * 品目体系ＣＤ２. Item system cd. 2.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd2 = "sls_itm_grp_cd2";
	private static final MCPermColumnInfo _sls_itm_grp_cd2 = createColumnInfo("sls_itm_grp_cd2");
	public final MCStringPermColumn sls_itm_grp_cd2 = createStringColumn(_sls_itm_grp_cd2);
	
	/**
	 * 集計対象外ＦＬＧ. Not for aggregation flg..<p>
	 *
	 */
	public static final String $not_sum_flg = "not_sum_flg";
	private static final MCPermColumnInfo _not_sum_flg = createColumnInfo("not_sum_flg");
	public final MCBooleanPermColumn not_sum_flg = createBooleanColumn(_not_sum_flg);
	
	/**
	 * 販売計画担当者ＦＬＧ. Sales plan PIC flg..<p>
	 *
	 */
	public static final String $spln_usr_flg = "spln_usr_flg";
	private static final MCPermColumnInfo _spln_usr_flg = createColumnInfo("spln_usr_flg");
	public final MCBooleanPermColumn spln_usr_flg = createBooleanColumn(_spln_usr_flg);
	
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_sls_amt_META = createCommonMeta($base_cur_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_cost_amt_META = createCommonMeta($sls_cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_qty_META = createCommonMeta($slo_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_amt_META = createCommonMeta($slo_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_cost_amt_META = createCommonMeta($slo_cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_bl_qty_META = createCommonMeta($slo_bl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_bl_amt_META = createCommonMeta($slo_bl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slo_bl_cost_amt_META = createCommonMeta($slo_bl_cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta spln_qty_META = createCommonMeta($spln_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta spln_amt_META = createCommonMeta($spln_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_sls_amt_META = createCommonMeta($bdg_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bdg_sls_prof_amt_META = createCommonMeta($bdg_sls_prof_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_cd1_META = createCommonMeta($dpt_cd1, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_cd2_META = createCommonMeta($dpt_cd2, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_itm_grp_cd1_META = createCommonMeta($sls_itm_grp_cd1, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_cd2_META = createCommonMeta($sls_itm_grp_cd2, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta not_sum_flg_META = createCommonMeta($not_sum_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_usr_flg_META = createCommonMeta($spln_usr_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_SLO_SLS_SUM_R> constMetas = new ConstMetaList<MSW_SLO_SLS_SUM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ym_META,
			sls_dpt_cd_META,
			sls_usr_cd_META,
			cst_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			trd_cur_cd_META,
			wrk_no_META,
			sls_itm_grp_cd_META,
			xrate_META,
			sls_qty_META,
			sls_amt_META,
			base_cur_sls_amt_META,
			sls_cost_amt_META,
			slo_qty_META,
			slo_amt_META,
			slo_cost_amt_META,
			slo_bl_qty_META,
			slo_bl_amt_META,
			slo_bl_cost_amt_META,
			spln_qty_META,
			spln_amt_META,
			bdg_sls_amt_META,
			bdg_sls_prof_amt_META,
			dpt_lvl_cd_META,
			dpt_cd1_META,
			dpt_cd2_META,
			sls_itm_grp_cd1_META,
			sls_itm_grp_cd2_META,
			not_sum_flg_META,
			spln_usr_flg_META
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
	protected MSW_SLO_SLS_SUM_R(ConstMetaList<? extends MSW_SLO_SLS_SUM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SLO_SLS_SUM_R(ConstMetaList<? extends MSW_SLO_SLS_SUM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SLO_SLS_SUM_R.$ym,
				"ym",
				ym,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$sls_usr_cd,
				"sls_usr_cd",
				sls_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd,
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
			MSW_SLO_SLS_SUM_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$xrate,
				"xrate",
				xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$sls_qty,
				"sls_qty",
				sls_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$sls_amt,
				"sls_amt",
				sls_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$base_cur_sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$base_cur_sls_amt,
				"base_cur_sls_amt",
				base_cur_sls_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_cost_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$sls_cost_amt,
				"sls_cost_amt",
				sls_cost_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_qty,
				"slo_qty",
				slo_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_amt,
				"slo_amt",
				slo_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_cost_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_cost_amt,
				"slo_cost_amt",
				slo_cost_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_bl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_bl_qty,
				"slo_bl_qty",
				slo_bl_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_bl_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_bl_amt,
				"slo_bl_amt",
				slo_bl_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$slo_bl_cost_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$slo_bl_cost_amt,
				"slo_bl_cost_amt",
				slo_bl_cost_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$spln_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$spln_qty,
				"spln_qty",
				spln_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$spln_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$spln_amt,
				"spln_amt",
				spln_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$bdg_sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$bdg_sls_amt,
				"bdg_sls_amt",
				bdg_sls_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$bdg_sls_prof_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_SLO_SLS_SUM_R.$bdg_sls_prof_amt,
				"bdg_sls_prof_amt",
				bdg_sls_prof_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$dpt_lvl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$dpt_lvl_cd,
				"dpt_lvl_cd",
				dpt_lvl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$dpt_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$dpt_cd1,
				"dpt_cd1",
				dpt_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$dpt_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$dpt_cd2,
				"dpt_cd2",
				dpt_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd1,
				"sls_itm_grp_cd1",
				sls_itm_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SLO_SLS_SUM_R.$sls_itm_grp_cd2,
				"sls_itm_grp_cd2",
				sls_itm_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$not_sum_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SLO_SLS_SUM_R.$not_sum_flg,
				"not_sum_flg",
				not_sum_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SLO_SLS_SUM_R.$spln_usr_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_SLO_SLS_SUM_R.$spln_usr_flg,
				"spln_usr_flg",
				spln_usr_flg,
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
	public static MSW_SLO_SLS_SUM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SLO_SLS_SUM_R create(String alias) {
		MSW_SLO_SLS_SUM_R row = new MSW_SLO_SLS_SUM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SLO_SLS_SUM_R createByName(T proto) {
		MSW_SLO_SLS_SUM_R row = MSW_SLO_SLS_SUM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLO_SLS_SUM_R clone() {
		return (MSW_SLO_SLS_SUM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLO_SLS_SUM_R createInstance() {
		return (MSW_SLO_SLS_SUM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SLO_SLS_SUM_R getValues(String... names) {
		return (MSW_SLO_SLS_SUM_R) super.getValues(names);
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
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 1, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 1, $sls_dpt_cd, value);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 2, $sls_usr_cd);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 2, $sls_usr_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 8, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 8, $trd_cur_cd, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 9, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 9, $wrk_no, value);
	}

	/**
	 * 品目体系ＣＤ. Item system cd..<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 10, $sls_itm_grp_cd);
	}

	/**
	 * 品目体系ＣＤ. Item system cd..<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 10, $sls_itm_grp_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 11, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 12, $sls_qty);
	}

	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 12, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 12, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 12, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 12, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 12, $sls_qty, value);
	}
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 13, $sls_amt);
	}

	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}
	
	/**
	 * 売上金額. Sales amount.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 13, $sls_amt, value);
	}
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_sls_amt() {
		return getConstNumber(offset + 14, $base_cur_sls_amt);
	}

	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public void base_cur_sls_amt(MCNumber value) {
		setConstNumber(offset + 14, $base_cur_sls_amt, value);
	}
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public void base_cur_sls_amt(int value) {
		setConstNumber(offset + 14, $base_cur_sls_amt, value);
	}
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public void base_cur_sls_amt(long value) {
		setConstNumber(offset + 14, $base_cur_sls_amt, value);
	}
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public void base_cur_sls_amt(float value) {
		setConstNumber(offset + 14, $base_cur_sls_amt, value);
	}
	
	/**
	 * 基準通貨売上金額. Sales amount (Base currency).<p>
	 *
	 */
	public void base_cur_sls_amt(double value) {
		setConstNumber(offset + 14, $base_cur_sls_amt, value);
	}
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public MCNumber sls_cost_amt() {
		return getConstNumber(offset + 15, $sls_cost_amt);
	}

	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost_amt(MCNumber value) {
		setConstNumber(offset + 15, $sls_cost_amt, value);
	}
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost_amt(int value) {
		setConstNumber(offset + 15, $sls_cost_amt, value);
	}
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost_amt(long value) {
		setConstNumber(offset + 15, $sls_cost_amt, value);
	}
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost_amt(float value) {
		setConstNumber(offset + 15, $sls_cost_amt, value);
	}
	
	/**
	 * 売上原価金額. Cost of goods sold.<p>
	 *
	 */
	public void sls_cost_amt(double value) {
		setConstNumber(offset + 15, $sls_cost_amt, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public MCNumber slo_qty() {
		return getConstNumber(offset + 16, $slo_qty);
	}

	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(int value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(long value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(float value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}
	
	/**
	 * 受注数量. Sales order qty..<p>
	 *
	 */
	public void slo_qty(double value) {
		setConstNumber(offset + 16, $slo_qty, value);
	}
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public MCNumber slo_amt() {
		return getConstNumber(offset + 17, $slo_amt);
	}

	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public void slo_amt(MCNumber value) {
		setConstNumber(offset + 17, $slo_amt, value);
	}
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public void slo_amt(int value) {
		setConstNumber(offset + 17, $slo_amt, value);
	}
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public void slo_amt(long value) {
		setConstNumber(offset + 17, $slo_amt, value);
	}
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public void slo_amt(float value) {
		setConstNumber(offset + 17, $slo_amt, value);
	}
	
	/**
	 * 受注金額. Sales order amount.<p>
	 *
	 */
	public void slo_amt(double value) {
		setConstNumber(offset + 17, $slo_amt, value);
	}
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public MCNumber slo_cost_amt() {
		return getConstNumber(offset + 18, $slo_cost_amt);
	}

	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public void slo_cost_amt(MCNumber value) {
		setConstNumber(offset + 18, $slo_cost_amt, value);
	}
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public void slo_cost_amt(int value) {
		setConstNumber(offset + 18, $slo_cost_amt, value);
	}
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public void slo_cost_amt(long value) {
		setConstNumber(offset + 18, $slo_cost_amt, value);
	}
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public void slo_cost_amt(float value) {
		setConstNumber(offset + 18, $slo_cost_amt, value);
	}
	
	/**
	 * 受注原価金額. Sales order cost amount.<p>
	 *
	 */
	public void slo_cost_amt(double value) {
		setConstNumber(offset + 18, $slo_cost_amt, value);
	}
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public MCNumber slo_bl_qty() {
		return getConstNumber(offset + 19, $slo_bl_qty);
	}

	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public void slo_bl_qty(MCNumber value) {
		setConstNumber(offset + 19, $slo_bl_qty, value);
	}
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public void slo_bl_qty(int value) {
		setConstNumber(offset + 19, $slo_bl_qty, value);
	}
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public void slo_bl_qty(long value) {
		setConstNumber(offset + 19, $slo_bl_qty, value);
	}
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public void slo_bl_qty(float value) {
		setConstNumber(offset + 19, $slo_bl_qty, value);
	}
	
	/**
	 * 受注残数量. Sales order backlog qty..<p>
	 *
	 */
	public void slo_bl_qty(double value) {
		setConstNumber(offset + 19, $slo_bl_qty, value);
	}
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public MCNumber slo_bl_amt() {
		return getConstNumber(offset + 20, $slo_bl_amt);
	}

	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public void slo_bl_amt(MCNumber value) {
		setConstNumber(offset + 20, $slo_bl_amt, value);
	}
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public void slo_bl_amt(int value) {
		setConstNumber(offset + 20, $slo_bl_amt, value);
	}
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public void slo_bl_amt(long value) {
		setConstNumber(offset + 20, $slo_bl_amt, value);
	}
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public void slo_bl_amt(float value) {
		setConstNumber(offset + 20, $slo_bl_amt, value);
	}
	
	/**
	 * 受注残金額. Sales order backlog amount.<p>
	 *
	 */
	public void slo_bl_amt(double value) {
		setConstNumber(offset + 20, $slo_bl_amt, value);
	}
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public MCNumber slo_bl_cost_amt() {
		return getConstNumber(offset + 21, $slo_bl_cost_amt);
	}

	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public void slo_bl_cost_amt(MCNumber value) {
		setConstNumber(offset + 21, $slo_bl_cost_amt, value);
	}
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public void slo_bl_cost_amt(int value) {
		setConstNumber(offset + 21, $slo_bl_cost_amt, value);
	}
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public void slo_bl_cost_amt(long value) {
		setConstNumber(offset + 21, $slo_bl_cost_amt, value);
	}
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public void slo_bl_cost_amt(float value) {
		setConstNumber(offset + 21, $slo_bl_cost_amt, value);
	}
	
	/**
	 * 受注残原価金額. Sales order backlog cost amount.<p>
	 *
	 */
	public void slo_bl_cost_amt(double value) {
		setConstNumber(offset + 21, $slo_bl_cost_amt, value);
	}
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public MCNumber spln_qty() {
		return getConstNumber(offset + 22, $spln_qty);
	}

	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		setConstNumber(offset + 22, $spln_qty, value);
	}
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public void spln_qty(int value) {
		setConstNumber(offset + 22, $spln_qty, value);
	}
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public void spln_qty(long value) {
		setConstNumber(offset + 22, $spln_qty, value);
	}
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public void spln_qty(float value) {
		setConstNumber(offset + 22, $spln_qty, value);
	}
	
	/**
	 * 計画数量. Plan qty..<p>
	 *
	 */
	public void spln_qty(double value) {
		setConstNumber(offset + 22, $spln_qty, value);
	}
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public MCNumber spln_amt() {
		return getConstNumber(offset + 23, $spln_amt);
	}

	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public void spln_amt(MCNumber value) {
		setConstNumber(offset + 23, $spln_amt, value);
	}
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public void spln_amt(int value) {
		setConstNumber(offset + 23, $spln_amt, value);
	}
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public void spln_amt(long value) {
		setConstNumber(offset + 23, $spln_amt, value);
	}
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public void spln_amt(float value) {
		setConstNumber(offset + 23, $spln_amt, value);
	}
	
	/**
	 * 計画金額. Plan amount.<p>
	 *
	 */
	public void spln_amt(double value) {
		setConstNumber(offset + 23, $spln_amt, value);
	}
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public MCNumber bdg_sls_amt() {
		return getConstNumber(offset + 24, $bdg_sls_amt);
	}

	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public void bdg_sls_amt(MCNumber value) {
		setConstNumber(offset + 24, $bdg_sls_amt, value);
	}
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public void bdg_sls_amt(int value) {
		setConstNumber(offset + 24, $bdg_sls_amt, value);
	}
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public void bdg_sls_amt(long value) {
		setConstNumber(offset + 24, $bdg_sls_amt, value);
	}
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public void bdg_sls_amt(float value) {
		setConstNumber(offset + 24, $bdg_sls_amt, value);
	}
	
	/**
	 * 予算売上金額. Budget sales amount.<p>
	 *
	 */
	public void bdg_sls_amt(double value) {
		setConstNumber(offset + 24, $bdg_sls_amt, value);
	}
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public MCNumber bdg_sls_prof_amt() {
		return getConstNumber(offset + 25, $bdg_sls_prof_amt);
	}

	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public void bdg_sls_prof_amt(MCNumber value) {
		setConstNumber(offset + 25, $bdg_sls_prof_amt, value);
	}
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public void bdg_sls_prof_amt(int value) {
		setConstNumber(offset + 25, $bdg_sls_prof_amt, value);
	}
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public void bdg_sls_prof_amt(long value) {
		setConstNumber(offset + 25, $bdg_sls_prof_amt, value);
	}
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public void bdg_sls_prof_amt(float value) {
		setConstNumber(offset + 25, $bdg_sls_prof_amt, value);
	}
	
	/**
	 * 予算売上粗利金額. Budget gross profit.<p>
	 *
	 */
	public void bdg_sls_prof_amt(double value) {
		setConstNumber(offset + 25, $bdg_sls_prof_amt, value);
	}
	
	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 26, $dpt_lvl_cd);
	}

	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 26, $dpt_lvl_cd, value);
	}

	/**
	 * 部門ＣＤ１. Dept. cd. 1.<p>
	 *
	 */
	public String dpt_cd1() {
		return getConstString(offset + 27, $dpt_cd1);
	}

	/**
	 * 部門ＣＤ１. Dept. cd. 1.<p>
	 *
	 */
	public void dpt_cd1(String value) {
		setConstString(offset + 27, $dpt_cd1, value);
	}

	/**
	 * 部門ＣＤ２. Dept. cd. 2.<p>
	 *
	 */
	public String dpt_cd2() {
		return getConstString(offset + 28, $dpt_cd2);
	}

	/**
	 * 部門ＣＤ２. Dept. cd. 2.<p>
	 *
	 */
	public void dpt_cd2(String value) {
		setConstString(offset + 28, $dpt_cd2, value);
	}

	/**
	 * 品目体系ＣＤ１. Item system cd. 1.<p>
	 *
	 */
	public String sls_itm_grp_cd1() {
		return getConstString(offset + 29, $sls_itm_grp_cd1);
	}

	/**
	 * 品目体系ＣＤ１. Item system cd. 1.<p>
	 *
	 */
	public void sls_itm_grp_cd1(String value) {
		setConstString(offset + 29, $sls_itm_grp_cd1, value);
	}

	/**
	 * 品目体系ＣＤ２. Item system cd. 2.<p>
	 *
	 */
	public String sls_itm_grp_cd2() {
		return getConstString(offset + 30, $sls_itm_grp_cd2);
	}

	/**
	 * 品目体系ＣＤ２. Item system cd. 2.<p>
	 *
	 */
	public void sls_itm_grp_cd2(String value) {
		setConstString(offset + 30, $sls_itm_grp_cd2, value);
	}

	/**
	 * 集計対象外ＦＬＧ. Not for aggregation flg..<p>
	 *
	 */
	public boolean not_sum_flg() {
		return getConstBoolean(offset + 31, $not_sum_flg);
	}

	/**
	 * 集計対象外ＦＬＧ. Not for aggregation flg..<p>
	 *
	 */
	public void not_sum_flg(boolean value) {
		setConstBoolean(offset + 31, $not_sum_flg, value);
	}

	/**
	 * 販売計画担当者ＦＬＧ. Sales plan PIC flg..<p>
	 *
	 */
	public boolean spln_usr_flg() {
		return getConstBoolean(offset + 32, $spln_usr_flg);
	}

	/**
	 * 販売計画担当者ＦＬＧ. Sales plan PIC flg..<p>
	 *
	 */
	public void spln_usr_flg(boolean value) {
		setConstBoolean(offset + 32, $spln_usr_flg, value);
	}

	public String getString(String name) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_cd1.equalsIgnoreCase(name)) {
			return dpt_cd1();
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($sls_itm_grp_cd1.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd1();
		}
		if ($sls_itm_grp_cd2.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd2();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_sls_amt();
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			return sls_cost_amt();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			return slo_cost_amt();
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			return slo_bl_qty();
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			return slo_bl_amt();
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			return slo_bl_cost_amt();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			return bdg_sls_amt();
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_sls_prof_amt();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			return not_sum_flg();
		}
		if ($spln_usr_flg.equalsIgnoreCase(name)) {
			return spln_usr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_cd1.equalsIgnoreCase(name)) {
			return dpt_cd1();
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($sls_itm_grp_cd1.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd1();
		}
		if ($sls_itm_grp_cd2.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd2();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			return base_cur_sls_amt();
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			return sls_cost_amt();
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			return slo_qty();
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			return slo_amt();
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			return slo_cost_amt();
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			return slo_bl_qty();
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			return slo_bl_amt();
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			return slo_bl_cost_amt();
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			return spln_qty();
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			return spln_amt();
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			return bdg_sls_amt();
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			return bdg_sls_prof_amt();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			return not_sum_flg();
		}
		if ($spln_usr_flg.equalsIgnoreCase(name)) {
			return spln_usr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_cd1.equalsIgnoreCase(name)) {
			dpt_cd1(value);
			return;
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($sls_itm_grp_cd1.equalsIgnoreCase(name)) {
			sls_itm_grp_cd1(value);
			return;
		}
		if ($sls_itm_grp_cd2.equalsIgnoreCase(name)) {
			sls_itm_grp_cd2(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			not_sum_flg(value);
			return;
		}
		if ($spln_usr_flg.equalsIgnoreCase(name)) {
			spln_usr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_cd1.equalsIgnoreCase(name)) {
			dpt_cd1(value);
			return;
		}
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($sls_itm_grp_cd1.equalsIgnoreCase(name)) {
			sls_itm_grp_cd1(value);
			return;
		}
		if ($sls_itm_grp_cd2.equalsIgnoreCase(name)) {
			sls_itm_grp_cd2(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($base_cur_sls_amt.equalsIgnoreCase(name)) {
			base_cur_sls_amt(value);
			return;
		}
		if ($sls_cost_amt.equalsIgnoreCase(name)) {
			sls_cost_amt(value);
			return;
		}
		if ($slo_qty.equalsIgnoreCase(name)) {
			slo_qty(value);
			return;
		}
		if ($slo_amt.equalsIgnoreCase(name)) {
			slo_amt(value);
			return;
		}
		if ($slo_cost_amt.equalsIgnoreCase(name)) {
			slo_cost_amt(value);
			return;
		}
		if ($slo_bl_qty.equalsIgnoreCase(name)) {
			slo_bl_qty(value);
			return;
		}
		if ($slo_bl_amt.equalsIgnoreCase(name)) {
			slo_bl_amt(value);
			return;
		}
		if ($slo_bl_cost_amt.equalsIgnoreCase(name)) {
			slo_bl_cost_amt(value);
			return;
		}
		if ($spln_qty.equalsIgnoreCase(name)) {
			spln_qty(value);
			return;
		}
		if ($spln_amt.equalsIgnoreCase(name)) {
			spln_amt(value);
			return;
		}
		if ($bdg_sls_amt.equalsIgnoreCase(name)) {
			bdg_sls_amt(value);
			return;
		}
		if ($bdg_sls_prof_amt.equalsIgnoreCase(name)) {
			bdg_sls_prof_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($not_sum_flg.equalsIgnoreCase(name)) {
			not_sum_flg(value);
			return;
		}
		if ($spln_usr_flg.equalsIgnoreCase(name)) {
			spln_usr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
