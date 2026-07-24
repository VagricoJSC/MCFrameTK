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
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価受払表 // T account"DBコンテナRowクラスです。<p>
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
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
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
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管理部門ＣＤ</td>
 *  	<td>Management dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>asst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産区分</td>
 *  	<td>Asset type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準数量</td>
 *  	<td>Base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ave_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>総平均単価</td>
 *  	<td>Weighted average unit price</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準単価</td>
 *  	<td>Standard unit cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_stk_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初在庫数量</td>
 *  	<td>Beginning inventory qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_stk_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初在庫原価</td>
 *  	<td>Beginning inventory cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造数量</td>
 *  	<td>Mfg. qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造原価</td>
 *  	<td>Mfg. cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買数量</td>
 *  	<td>Purchase qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買原価</td>
 *  	<td>Purchase cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_gr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造受入数量</td>
 *  	<td>Mfg. receipt qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_gr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造受入原価</td>
 *  	<td>Mfg. receipt cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>othr_gr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫数量</td>
 *  	<td>GR qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>othr_gr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入庫原価</td>
 *  	<td>GR cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配賦原価</td>
 *  	<td>Allocation cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入数量</td>
 *  	<td>Input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入原価</td>
 *  	<td>Input cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_gi_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売倉入数量</td>
 *  	<td>Sales warehousing qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_gi_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売倉入原価</td>
 *  	<td>Sales warehousing cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>othr_gi_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫数量</td>
 *  	<td>GI qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>othr_gi_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫原価</td>
 *  	<td>GI cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有償支給数量</td>
 *  	<td>Chargeable supply qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有償支給原価</td>
 *  	<td>Chargeable supply cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上数量</td>
 *  	<td>Sales qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上原価</td>
 *  	<td>Cost of goods sold</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_stk_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月末在庫数量</td>
 *  	<td>Ending inventory qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_stk_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月末在庫原価</td>
 *  	<td>Ending inventory cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>diff_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量差</td>
 *  	<td>Quantity difference</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金額差</td>
 *  	<td>Amount variance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xpns_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>経費投入数量</td>
 *  	<td>Expenses input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xpns_inpt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>経費投入原価</td>
 *  	<td>Expenses input costs</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ym_sub</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>年月サブ</td>
 *  	<td>Year month sub</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGT_IO_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MGT_IO";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 計算グループＣＤ. Calculation group cd..<p>
	 *
	 */
	public static final String $calc_grp_cd = "calc_grp_cd";
	private static final MCPermColumnInfo _calc_grp_cd = createColumnInfo("calc_grp_cd");
	public final MCStringPermColumn calc_grp_cd = createStringColumn(_calc_grp_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 年月. Year month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public static final String $mng_dpt_cd = "mng_dpt_cd";
	private static final MCPermColumnInfo _mng_dpt_cd = createColumnInfo("mng_dpt_cd");
	public final MCStringPermColumn mng_dpt_cd = createStringColumn(_mng_dpt_cd);
	
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
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	private static final MCPermColumnInfo _sublot_no = createColumnInfo("sublot_no");
	public final MCStringPermColumn sublot_no = createStringColumn(_sublot_no);
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	private static final MCPermColumnInfo _std_qty = createColumnInfo("std_qty");
	public final MCNumberPermColumn std_qty = createNumberColumn(_std_qty);
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public static final String $ave_upri = "ave_upri";
	private static final MCPermColumnInfo _ave_upri = createColumnInfo("ave_upri");
	public final MCNumberPermColumn ave_upri = createNumberColumn(_ave_upri);
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	private static final MCPermColumnInfo _std_upri = createColumnInfo("std_upri");
	public final MCNumberPermColumn std_upri = createNumberColumn(_std_upri);
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public static final String $st_stk_qty = "st_stk_qty";
	private static final MCPermColumnInfo _st_stk_qty = createColumnInfo("st_stk_qty");
	public final MCNumberPermColumn st_stk_qty = createNumberColumn(_st_stk_qty);
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public static final String $st_stk_amt = "st_stk_amt";
	private static final MCPermColumnInfo _st_stk_amt = createColumnInfo("st_stk_amt");
	public final MCNumberPermColumn st_stk_amt = createNumberColumn(_st_stk_amt);
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public static final String $mfg_qty = "mfg_qty";
	private static final MCPermColumnInfo _mfg_qty = createColumnInfo("mfg_qty");
	public final MCNumberPermColumn mfg_qty = createNumberColumn(_mfg_qty);
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public static final String $mfg_amt = "mfg_amt";
	private static final MCPermColumnInfo _mfg_amt = createColumnInfo("mfg_amt");
	public final MCNumberPermColumn mfg_amt = createNumberColumn(_mfg_amt);
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	private static final MCPermColumnInfo _purc_qty = createColumnInfo("purc_qty");
	public final MCNumberPermColumn purc_qty = createNumberColumn(_purc_qty);
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	private static final MCPermColumnInfo _purc_amt = createColumnInfo("purc_amt");
	public final MCNumberPermColumn purc_amt = createNumberColumn(_purc_amt);
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public static final String $mfg_gr_qty = "mfg_gr_qty";
	private static final MCPermColumnInfo _mfg_gr_qty = createColumnInfo("mfg_gr_qty");
	public final MCNumberPermColumn mfg_gr_qty = createNumberColumn(_mfg_gr_qty);
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public static final String $mfg_gr_amt = "mfg_gr_amt";
	private static final MCPermColumnInfo _mfg_gr_amt = createColumnInfo("mfg_gr_amt");
	public final MCNumberPermColumn mfg_gr_amt = createNumberColumn(_mfg_gr_amt);
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public static final String $othr_gr_qty = "othr_gr_qty";
	private static final MCPermColumnInfo _othr_gr_qty = createColumnInfo("othr_gr_qty");
	public final MCNumberPermColumn othr_gr_qty = createNumberColumn(_othr_gr_qty);
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public static final String $othr_gr_amt = "othr_gr_amt";
	private static final MCPermColumnInfo _othr_gr_amt = createColumnInfo("othr_gr_amt");
	public final MCNumberPermColumn othr_gr_amt = createNumberColumn(_othr_gr_amt);
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public static final String $alc_amt = "alc_amt";
	private static final MCPermColumnInfo _alc_amt = createColumnInfo("alc_amt");
	public final MCNumberPermColumn alc_amt = createNumberColumn(_alc_amt);
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public static final String $inpt_qty = "inpt_qty";
	private static final MCPermColumnInfo _inpt_qty = createColumnInfo("inpt_qty");
	public final MCNumberPermColumn inpt_qty = createNumberColumn(_inpt_qty);
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public static final String $inpt_amt = "inpt_amt";
	private static final MCPermColumnInfo _inpt_amt = createColumnInfo("inpt_amt");
	public final MCNumberPermColumn inpt_amt = createNumberColumn(_inpt_amt);
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public static final String $plnt_gi_qty = "plnt_gi_qty";
	private static final MCPermColumnInfo _plnt_gi_qty = createColumnInfo("plnt_gi_qty");
	public final MCNumberPermColumn plnt_gi_qty = createNumberColumn(_plnt_gi_qty);
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public static final String $plnt_gi_amt = "plnt_gi_amt";
	private static final MCPermColumnInfo _plnt_gi_amt = createColumnInfo("plnt_gi_amt");
	public final MCNumberPermColumn plnt_gi_amt = createNumberColumn(_plnt_gi_amt);
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public static final String $othr_gi_qty = "othr_gi_qty";
	private static final MCPermColumnInfo _othr_gi_qty = createColumnInfo("othr_gi_qty");
	public final MCNumberPermColumn othr_gi_qty = createNumberColumn(_othr_gi_qty);
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public static final String $othr_gi_amt = "othr_gi_amt";
	private static final MCPermColumnInfo _othr_gi_amt = createColumnInfo("othr_gi_amt");
	public final MCNumberPermColumn othr_gi_amt = createNumberColumn(_othr_gi_amt);
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public static final String $prov_qty = "prov_qty";
	private static final MCPermColumnInfo _prov_qty = createColumnInfo("prov_qty");
	public final MCNumberPermColumn prov_qty = createNumberColumn(_prov_qty);
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public static final String $prov_amt = "prov_amt";
	private static final MCPermColumnInfo _prov_amt = createColumnInfo("prov_amt");
	public final MCNumberPermColumn prov_amt = createNumberColumn(_prov_amt);
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	private static final MCPermColumnInfo _sls_qty = createColumnInfo("sls_qty");
	public final MCNumberPermColumn sls_qty = createNumberColumn(_sls_qty);
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	private static final MCPermColumnInfo _sls_amt = createColumnInfo("sls_amt");
	public final MCNumberPermColumn sls_amt = createNumberColumn(_sls_amt);
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public static final String $end_stk_qty = "end_stk_qty";
	private static final MCPermColumnInfo _end_stk_qty = createColumnInfo("end_stk_qty");
	public final MCNumberPermColumn end_stk_qty = createNumberColumn(_end_stk_qty);
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public static final String $end_stk_amt = "end_stk_amt";
	private static final MCPermColumnInfo _end_stk_amt = createColumnInfo("end_stk_amt");
	public final MCNumberPermColumn end_stk_amt = createNumberColumn(_end_stk_amt);
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public static final String $diff_qty = "diff_qty";
	private static final MCPermColumnInfo _diff_qty = createColumnInfo("diff_qty");
	public final MCNumberPermColumn diff_qty = createNumberColumn(_diff_qty);
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public static final String $diff_amt = "diff_amt";
	private static final MCPermColumnInfo _diff_amt = createColumnInfo("diff_amt");
	public final MCNumberPermColumn diff_amt = createNumberColumn(_diff_amt);
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public static final String $xpns_inpt_qty = "xpns_inpt_qty";
	private static final MCPermColumnInfo _xpns_inpt_qty = createColumnInfo("xpns_inpt_qty");
	public final MCNumberPermColumn xpns_inpt_qty = createNumberColumn(_xpns_inpt_qty);
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public static final String $xpns_inpt_amt = "xpns_inpt_amt";
	private static final MCPermColumnInfo _xpns_inpt_amt = createColumnInfo("xpns_inpt_amt");
	public final MCNumberPermColumn xpns_inpt_amt = createNumberColumn(_xpns_inpt_amt);
	
	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public static final String $ym_sub = "ym_sub";
	private static final MCPermColumnInfo _ym_sub = createColumnInfo("ym_sub");
	public final MCDatePermColumn ym_sub = createDateColumn(_ym_sub);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta calc_grp_cd_META = createCommonMeta($calc_grp_cd, mcframe.commonMA.meta.MA_META.CALC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ave_upri_META = createCommonMeta($ave_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta st_stk_qty_META = createCommonMeta($st_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta st_stk_amt_META = createCommonMeta($st_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_qty_META = createCommonMeta($mfg_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_amt_META = createCommonMeta($mfg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mfg_gr_qty_META = createCommonMeta($mfg_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_gr_amt_META = createCommonMeta($mfg_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gr_qty_META = createCommonMeta($othr_gr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta othr_gr_amt_META = createCommonMeta($othr_gr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta alc_amt_META = createCommonMeta($alc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta inpt_qty_META = createCommonMeta($inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inpt_amt_META = createCommonMeta($inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta plnt_gi_qty_META = createCommonMeta($plnt_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta plnt_gi_amt_META = createCommonMeta($plnt_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta othr_gi_qty_META = createCommonMeta($othr_gi_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta othr_gi_amt_META = createCommonMeta($othr_gi_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prov_qty_META = createCommonMeta($prov_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prov_amt_META = createCommonMeta($prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_stk_qty_META = createCommonMeta($end_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta end_stk_amt_META = createCommonMeta($end_stk_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta diff_qty_META = createCommonMeta($diff_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta diff_amt_META = createCommonMeta($diff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xpns_inpt_qty_META = createCommonMeta($xpns_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta xpns_inpt_amt_META = createCommonMeta($xpns_inpt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ym_sub_META = createCommonMeta($ym_sub, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $ARG1 = "ARG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MGT_ARG",
				$ARG1,
				new String[][]{
						{"calc_no", "calc_no"},
						{"calc_grp_cd", "calc_grp_cd"}
				},
				() -> {
					return mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
				},
				(alias) -> {
					MGT_IO_R own = MGT_IO_R.create(alias);
					mcframe.serverMG.dbc.MGT_ARG_R ref = mcframe.serverMG.dbc.MGT_ARG_R.create("ARG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.calc_no.eq(ref.calc_no));
					cond = cond.and(own.calc_grp_cd.eq(ref.calc_grp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MGT_IO_R> constMetas = new ConstMetaList<MGT_IO_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			calc_no_META,
			calc_grp_cd_META,
			wg_cd_META,
			ym_META,
			mng_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			asst_typ_META,
			std_qty_META,
			ave_upri_META,
			std_upri_META,
			st_stk_qty_META,
			st_stk_amt_META,
			mfg_qty_META,
			mfg_amt_META,
			purc_qty_META,
			purc_amt_META,
			mfg_gr_qty_META,
			mfg_gr_amt_META,
			othr_gr_qty_META,
			othr_gr_amt_META,
			alc_amt_META,
			inpt_qty_META,
			inpt_amt_META,
			plnt_gi_qty_META,
			plnt_gi_amt_META,
			othr_gi_qty_META,
			othr_gi_amt_META,
			prov_qty_META,
			prov_amt_META,
			sls_qty_META,
			sls_amt_META,
			end_stk_qty_META,
			end_stk_amt_META,
			diff_qty_META,
			diff_amt_META,
			xpns_inpt_qty_META,
			xpns_inpt_amt_META,
			ym_sub_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META
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
	protected MGT_IO_R(ConstMetaList<? extends MGT_IO_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGT_IO_R(ConstMetaList<? extends MGT_IO_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGT_IO_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$calc_no,
				"calc_no",
				calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$calc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$calc_grp_cd,
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
			MGT_IO_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$wg_cd,
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
			MGT_IO_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_IO_R.$ym,
				"ym",
				ym,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$lot_no,
				"lot_no",
				lot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$sublot_no,
				"sublot_no",
				sublot_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$sno1,
				"sno1",
				sno1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$sno2,
				"sno2",
				sno2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$sno3,
				"sno3",
				sno3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$sno4,
				"sno4",
				sno4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$asst_typ,
				"asst_typ",
				asst_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$std_qty,
				"std_qty",
				std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ave_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$ave_upri,
				"ave_upri",
				ave_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$std_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$std_upri,
				"std_upri",
				std_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$st_stk_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$st_stk_qty,
				"st_stk_qty",
				st_stk_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$st_stk_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$st_stk_amt,
				"st_stk_amt",
				st_stk_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$mfg_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$mfg_qty,
				"mfg_qty",
				mfg_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$mfg_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$mfg_amt,
				"mfg_amt",
				mfg_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$purc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$purc_qty,
				"purc_qty",
				purc_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$purc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$purc_amt,
				"purc_amt",
				purc_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$mfg_gr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$mfg_gr_qty,
				"mfg_gr_qty",
				mfg_gr_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$mfg_gr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$mfg_gr_amt,
				"mfg_gr_amt",
				mfg_gr_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$othr_gr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$othr_gr_qty,
				"othr_gr_qty",
				othr_gr_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$othr_gr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$othr_gr_amt,
				"othr_gr_amt",
				othr_gr_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$alc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$alc_amt,
				"alc_amt",
				alc_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$inpt_qty,
				"inpt_qty",
				inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$inpt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$inpt_amt,
				"inpt_amt",
				inpt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$plnt_gi_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$plnt_gi_qty,
				"plnt_gi_qty",
				plnt_gi_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$plnt_gi_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$plnt_gi_amt,
				"plnt_gi_amt",
				plnt_gi_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$othr_gi_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$othr_gi_qty,
				"othr_gi_qty",
				othr_gi_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$othr_gi_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$othr_gi_amt,
				"othr_gi_amt",
				othr_gi_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$prov_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$prov_qty,
				"prov_qty",
				prov_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$prov_amt,
				"prov_amt",
				prov_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sls_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$sls_qty,
				"sls_qty",
				sls_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$sls_amt,
				"sls_amt",
				sls_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$end_stk_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$end_stk_qty,
				"end_stk_qty",
				end_stk_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$end_stk_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$end_stk_amt,
				"end_stk_amt",
				end_stk_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$diff_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$diff_qty,
				"diff_qty",
				diff_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$diff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$diff_amt,
				"diff_amt",
				diff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$xpns_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$xpns_inpt_qty,
				"xpns_inpt_qty",
				xpns_inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$xpns_inpt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$xpns_inpt_amt,
				"xpns_inpt_amt",
				xpns_inpt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ym_sub,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGT_IO_R.$ym_sub,
				"ym_sub",
				ym_sub,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_IO_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGT_IO_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGT_IO_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGT_IO_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGT_IO_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
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
	public static MGT_IO_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGT_IO_R create(String alias) {
		MGT_IO_R row = new MGT_IO_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGT_IO_R createByName(T proto) {
		MGT_IO_R row = MGT_IO_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_IO_R clone() {
		return (MGT_IO_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_IO_R createInstance() {
		return (MGT_IO_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGT_IO_R getValues(String... names) {
		return (MGT_IO_R) super.getValues(names);
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
		return true;
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
	 public MGW_IO_KEY_R getPkWorkDbc(String alias) {
	 	return MGW_IO_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MGW_IO_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MGW_IO_KEY_R.TABLE_NAME);
	 }

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 0, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 0, $calc_no, value);
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
	 * 年月. Year month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 3, $ym);
	}

	/**
	 * 年月. Year month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 3, $ym, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 4, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 4, $mng_dpt_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 5, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 5, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 6, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 6, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 7, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 7, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 8, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 8, $itm_sub3, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 9, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 9, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 10, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 10, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 11, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 11, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 12, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 12, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 13, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 13, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 14, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 14, $sno4, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 15, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 15, $asst_typ, value);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 16, $std_qty);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 16, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 16, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 16, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 16, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 16, $std_qty, value);
	}
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public MCNumber ave_upri() {
		return getConstNumber(offset + 17, $ave_upri);
	}

	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public void ave_upri(MCNumber value) {
		setConstNumber(offset + 17, $ave_upri, value);
	}
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public void ave_upri(int value) {
		setConstNumber(offset + 17, $ave_upri, value);
	}
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public void ave_upri(long value) {
		setConstNumber(offset + 17, $ave_upri, value);
	}
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public void ave_upri(float value) {
		setConstNumber(offset + 17, $ave_upri, value);
	}
	
	/**
	 * 総平均単価. Weighted average unit price.<p>
	 *
	 */
	public void ave_upri(double value) {
		setConstNumber(offset + 17, $ave_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 18, $std_upri);
	}

	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 18, $std_upri, value);
	}
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public MCNumber st_stk_qty() {
		return getConstNumber(offset + 19, $st_stk_qty);
	}

	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public void st_stk_qty(MCNumber value) {
		setConstNumber(offset + 19, $st_stk_qty, value);
	}
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public void st_stk_qty(int value) {
		setConstNumber(offset + 19, $st_stk_qty, value);
	}
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public void st_stk_qty(long value) {
		setConstNumber(offset + 19, $st_stk_qty, value);
	}
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public void st_stk_qty(float value) {
		setConstNumber(offset + 19, $st_stk_qty, value);
	}
	
	/**
	 * 月初在庫数量. Beginning inventory qty..<p>
	 *
	 */
	public void st_stk_qty(double value) {
		setConstNumber(offset + 19, $st_stk_qty, value);
	}
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public MCNumber st_stk_amt() {
		return getConstNumber(offset + 20, $st_stk_amt);
	}

	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public void st_stk_amt(MCNumber value) {
		setConstNumber(offset + 20, $st_stk_amt, value);
	}
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public void st_stk_amt(int value) {
		setConstNumber(offset + 20, $st_stk_amt, value);
	}
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public void st_stk_amt(long value) {
		setConstNumber(offset + 20, $st_stk_amt, value);
	}
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public void st_stk_amt(float value) {
		setConstNumber(offset + 20, $st_stk_amt, value);
	}
	
	/**
	 * 月初在庫原価. Beginning inventory cost.<p>
	 *
	 */
	public void st_stk_amt(double value) {
		setConstNumber(offset + 20, $st_stk_amt, value);
	}
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public MCNumber mfg_qty() {
		return getConstNumber(offset + 21, $mfg_qty);
	}

	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public void mfg_qty(MCNumber value) {
		setConstNumber(offset + 21, $mfg_qty, value);
	}
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public void mfg_qty(int value) {
		setConstNumber(offset + 21, $mfg_qty, value);
	}
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public void mfg_qty(long value) {
		setConstNumber(offset + 21, $mfg_qty, value);
	}
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public void mfg_qty(float value) {
		setConstNumber(offset + 21, $mfg_qty, value);
	}
	
	/**
	 * 製造数量. Mfg. qty..<p>
	 *
	 */
	public void mfg_qty(double value) {
		setConstNumber(offset + 21, $mfg_qty, value);
	}
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public MCNumber mfg_amt() {
		return getConstNumber(offset + 22, $mfg_amt);
	}

	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public void mfg_amt(MCNumber value) {
		setConstNumber(offset + 22, $mfg_amt, value);
	}
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public void mfg_amt(int value) {
		setConstNumber(offset + 22, $mfg_amt, value);
	}
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public void mfg_amt(long value) {
		setConstNumber(offset + 22, $mfg_amt, value);
	}
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public void mfg_amt(float value) {
		setConstNumber(offset + 22, $mfg_amt, value);
	}
	
	/**
	 * 製造原価. Mfg. cost.<p>
	 *
	 */
	public void mfg_amt(double value) {
		setConstNumber(offset + 22, $mfg_amt, value);
	}
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 23, $purc_qty);
	}

	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 23, $purc_qty, value);
	}
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 23, $purc_qty, value);
	}
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 23, $purc_qty, value);
	}
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 23, $purc_qty, value);
	}
	
	/**
	 * 購買数量. Purchase qty..<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 23, $purc_qty, value);
	}
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 24, $purc_amt);
	}

	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 24, $purc_amt, value);
	}
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 24, $purc_amt, value);
	}
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 24, $purc_amt, value);
	}
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 24, $purc_amt, value);
	}
	
	/**
	 * 購買原価. Purchase cost.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 24, $purc_amt, value);
	}
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public MCNumber mfg_gr_qty() {
		return getConstNumber(offset + 25, $mfg_gr_qty);
	}

	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public void mfg_gr_qty(MCNumber value) {
		setConstNumber(offset + 25, $mfg_gr_qty, value);
	}
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public void mfg_gr_qty(int value) {
		setConstNumber(offset + 25, $mfg_gr_qty, value);
	}
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public void mfg_gr_qty(long value) {
		setConstNumber(offset + 25, $mfg_gr_qty, value);
	}
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public void mfg_gr_qty(float value) {
		setConstNumber(offset + 25, $mfg_gr_qty, value);
	}
	
	/**
	 * 製造受入数量. Mfg. receipt qty..<p>
	 *
	 */
	public void mfg_gr_qty(double value) {
		setConstNumber(offset + 25, $mfg_gr_qty, value);
	}
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public MCNumber mfg_gr_amt() {
		return getConstNumber(offset + 26, $mfg_gr_amt);
	}

	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public void mfg_gr_amt(MCNumber value) {
		setConstNumber(offset + 26, $mfg_gr_amt, value);
	}
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public void mfg_gr_amt(int value) {
		setConstNumber(offset + 26, $mfg_gr_amt, value);
	}
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public void mfg_gr_amt(long value) {
		setConstNumber(offset + 26, $mfg_gr_amt, value);
	}
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public void mfg_gr_amt(float value) {
		setConstNumber(offset + 26, $mfg_gr_amt, value);
	}
	
	/**
	 * 製造受入原価. Mfg. receipt cost.<p>
	 *
	 */
	public void mfg_gr_amt(double value) {
		setConstNumber(offset + 26, $mfg_gr_amt, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public MCNumber othr_gr_qty() {
		return getConstNumber(offset + 27, $othr_gr_qty);
	}

	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void othr_gr_qty(MCNumber value) {
		setConstNumber(offset + 27, $othr_gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void othr_gr_qty(int value) {
		setConstNumber(offset + 27, $othr_gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void othr_gr_qty(long value) {
		setConstNumber(offset + 27, $othr_gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void othr_gr_qty(float value) {
		setConstNumber(offset + 27, $othr_gr_qty, value);
	}
	
	/**
	 * 入庫数量. GR qty..<p>
	 *
	 */
	public void othr_gr_qty(double value) {
		setConstNumber(offset + 27, $othr_gr_qty, value);
	}
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public MCNumber othr_gr_amt() {
		return getConstNumber(offset + 28, $othr_gr_amt);
	}

	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public void othr_gr_amt(MCNumber value) {
		setConstNumber(offset + 28, $othr_gr_amt, value);
	}
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public void othr_gr_amt(int value) {
		setConstNumber(offset + 28, $othr_gr_amt, value);
	}
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public void othr_gr_amt(long value) {
		setConstNumber(offset + 28, $othr_gr_amt, value);
	}
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public void othr_gr_amt(float value) {
		setConstNumber(offset + 28, $othr_gr_amt, value);
	}
	
	/**
	 * 入庫原価. GR cost.<p>
	 *
	 */
	public void othr_gr_amt(double value) {
		setConstNumber(offset + 28, $othr_gr_amt, value);
	}
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public MCNumber alc_amt() {
		return getConstNumber(offset + 29, $alc_amt);
	}

	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public void alc_amt(MCNumber value) {
		setConstNumber(offset + 29, $alc_amt, value);
	}
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public void alc_amt(int value) {
		setConstNumber(offset + 29, $alc_amt, value);
	}
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public void alc_amt(long value) {
		setConstNumber(offset + 29, $alc_amt, value);
	}
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public void alc_amt(float value) {
		setConstNumber(offset + 29, $alc_amt, value);
	}
	
	/**
	 * 配賦原価. Allocation cost.<p>
	 *
	 */
	public void alc_amt(double value) {
		setConstNumber(offset + 29, $alc_amt, value);
	}
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public MCNumber inpt_qty() {
		return getConstNumber(offset + 30, $inpt_qty);
	}

	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public void inpt_qty(MCNumber value) {
		setConstNumber(offset + 30, $inpt_qty, value);
	}
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public void inpt_qty(int value) {
		setConstNumber(offset + 30, $inpt_qty, value);
	}
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public void inpt_qty(long value) {
		setConstNumber(offset + 30, $inpt_qty, value);
	}
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public void inpt_qty(float value) {
		setConstNumber(offset + 30, $inpt_qty, value);
	}
	
	/**
	 * 投入数量. Input qty..<p>
	 *
	 */
	public void inpt_qty(double value) {
		setConstNumber(offset + 30, $inpt_qty, value);
	}
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public MCNumber inpt_amt() {
		return getConstNumber(offset + 31, $inpt_amt);
	}

	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public void inpt_amt(MCNumber value) {
		setConstNumber(offset + 31, $inpt_amt, value);
	}
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public void inpt_amt(int value) {
		setConstNumber(offset + 31, $inpt_amt, value);
	}
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public void inpt_amt(long value) {
		setConstNumber(offset + 31, $inpt_amt, value);
	}
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public void inpt_amt(float value) {
		setConstNumber(offset + 31, $inpt_amt, value);
	}
	
	/**
	 * 投入原価. Input cost.<p>
	 *
	 */
	public void inpt_amt(double value) {
		setConstNumber(offset + 31, $inpt_amt, value);
	}
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public MCNumber plnt_gi_qty() {
		return getConstNumber(offset + 32, $plnt_gi_qty);
	}

	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public void plnt_gi_qty(MCNumber value) {
		setConstNumber(offset + 32, $plnt_gi_qty, value);
	}
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public void plnt_gi_qty(int value) {
		setConstNumber(offset + 32, $plnt_gi_qty, value);
	}
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public void plnt_gi_qty(long value) {
		setConstNumber(offset + 32, $plnt_gi_qty, value);
	}
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public void plnt_gi_qty(float value) {
		setConstNumber(offset + 32, $plnt_gi_qty, value);
	}
	
	/**
	 * 販売倉入数量. Sales warehousing qty..<p>
	 *
	 */
	public void plnt_gi_qty(double value) {
		setConstNumber(offset + 32, $plnt_gi_qty, value);
	}
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public MCNumber plnt_gi_amt() {
		return getConstNumber(offset + 33, $plnt_gi_amt);
	}

	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public void plnt_gi_amt(MCNumber value) {
		setConstNumber(offset + 33, $plnt_gi_amt, value);
	}
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public void plnt_gi_amt(int value) {
		setConstNumber(offset + 33, $plnt_gi_amt, value);
	}
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public void plnt_gi_amt(long value) {
		setConstNumber(offset + 33, $plnt_gi_amt, value);
	}
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public void plnt_gi_amt(float value) {
		setConstNumber(offset + 33, $plnt_gi_amt, value);
	}
	
	/**
	 * 販売倉入原価. Sales warehousing cost.<p>
	 *
	 */
	public void plnt_gi_amt(double value) {
		setConstNumber(offset + 33, $plnt_gi_amt, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public MCNumber othr_gi_qty() {
		return getConstNumber(offset + 34, $othr_gi_qty);
	}

	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void othr_gi_qty(MCNumber value) {
		setConstNumber(offset + 34, $othr_gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void othr_gi_qty(int value) {
		setConstNumber(offset + 34, $othr_gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void othr_gi_qty(long value) {
		setConstNumber(offset + 34, $othr_gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void othr_gi_qty(float value) {
		setConstNumber(offset + 34, $othr_gi_qty, value);
	}
	
	/**
	 * 出庫数量. GI qty..<p>
	 *
	 */
	public void othr_gi_qty(double value) {
		setConstNumber(offset + 34, $othr_gi_qty, value);
	}
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public MCNumber othr_gi_amt() {
		return getConstNumber(offset + 35, $othr_gi_amt);
	}

	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public void othr_gi_amt(MCNumber value) {
		setConstNumber(offset + 35, $othr_gi_amt, value);
	}
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public void othr_gi_amt(int value) {
		setConstNumber(offset + 35, $othr_gi_amt, value);
	}
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public void othr_gi_amt(long value) {
		setConstNumber(offset + 35, $othr_gi_amt, value);
	}
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public void othr_gi_amt(float value) {
		setConstNumber(offset + 35, $othr_gi_amt, value);
	}
	
	/**
	 * 出庫原価. GI cost.<p>
	 *
	 */
	public void othr_gi_amt(double value) {
		setConstNumber(offset + 35, $othr_gi_amt, value);
	}
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public MCNumber prov_qty() {
		return getConstNumber(offset + 36, $prov_qty);
	}

	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public void prov_qty(MCNumber value) {
		setConstNumber(offset + 36, $prov_qty, value);
	}
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public void prov_qty(int value) {
		setConstNumber(offset + 36, $prov_qty, value);
	}
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public void prov_qty(long value) {
		setConstNumber(offset + 36, $prov_qty, value);
	}
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public void prov_qty(float value) {
		setConstNumber(offset + 36, $prov_qty, value);
	}
	
	/**
	 * 有償支給数量. Chargeable supply qty..<p>
	 *
	 */
	public void prov_qty(double value) {
		setConstNumber(offset + 36, $prov_qty, value);
	}
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public MCNumber prov_amt() {
		return getConstNumber(offset + 37, $prov_amt);
	}

	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public void prov_amt(MCNumber value) {
		setConstNumber(offset + 37, $prov_amt, value);
	}
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public void prov_amt(int value) {
		setConstNumber(offset + 37, $prov_amt, value);
	}
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public void prov_amt(long value) {
		setConstNumber(offset + 37, $prov_amt, value);
	}
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public void prov_amt(float value) {
		setConstNumber(offset + 37, $prov_amt, value);
	}
	
	/**
	 * 有償支給原価. Chargeable supply cost.<p>
	 *
	 */
	public void prov_amt(double value) {
		setConstNumber(offset + 37, $prov_amt, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 38, $sls_qty);
	}

	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 38, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 38, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 38, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 38, $sls_qty, value);
	}
	
	/**
	 * 売上数量. Sales qty..<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 38, $sls_qty, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 39, $sls_amt);
	}

	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}
	
	/**
	 * 売上原価. Cost of goods sold.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 39, $sls_amt, value);
	}
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public MCNumber end_stk_qty() {
		return getConstNumber(offset + 40, $end_stk_qty);
	}

	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public void end_stk_qty(MCNumber value) {
		setConstNumber(offset + 40, $end_stk_qty, value);
	}
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public void end_stk_qty(int value) {
		setConstNumber(offset + 40, $end_stk_qty, value);
	}
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public void end_stk_qty(long value) {
		setConstNumber(offset + 40, $end_stk_qty, value);
	}
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public void end_stk_qty(float value) {
		setConstNumber(offset + 40, $end_stk_qty, value);
	}
	
	/**
	 * 月末在庫数量. Ending inventory qty..<p>
	 *
	 */
	public void end_stk_qty(double value) {
		setConstNumber(offset + 40, $end_stk_qty, value);
	}
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public MCNumber end_stk_amt() {
		return getConstNumber(offset + 41, $end_stk_amt);
	}

	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public void end_stk_amt(MCNumber value) {
		setConstNumber(offset + 41, $end_stk_amt, value);
	}
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public void end_stk_amt(int value) {
		setConstNumber(offset + 41, $end_stk_amt, value);
	}
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public void end_stk_amt(long value) {
		setConstNumber(offset + 41, $end_stk_amt, value);
	}
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public void end_stk_amt(float value) {
		setConstNumber(offset + 41, $end_stk_amt, value);
	}
	
	/**
	 * 月末在庫原価. Ending inventory cost.<p>
	 *
	 */
	public void end_stk_amt(double value) {
		setConstNumber(offset + 41, $end_stk_amt, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public MCNumber diff_qty() {
		return getConstNumber(offset + 42, $diff_qty);
	}

	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(MCNumber value) {
		setConstNumber(offset + 42, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(int value) {
		setConstNumber(offset + 42, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(long value) {
		setConstNumber(offset + 42, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(float value) {
		setConstNumber(offset + 42, $diff_qty, value);
	}
	
	/**
	 * 数量差. Quantity difference.<p>
	 *
	 */
	public void diff_qty(double value) {
		setConstNumber(offset + 42, $diff_qty, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public MCNumber diff_amt() {
		return getConstNumber(offset + 43, $diff_amt);
	}

	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(MCNumber value) {
		setConstNumber(offset + 43, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(int value) {
		setConstNumber(offset + 43, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(long value) {
		setConstNumber(offset + 43, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(float value) {
		setConstNumber(offset + 43, $diff_amt, value);
	}
	
	/**
	 * 金額差. Amount variance.<p>
	 *
	 */
	public void diff_amt(double value) {
		setConstNumber(offset + 43, $diff_amt, value);
	}
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public MCNumber xpns_inpt_qty() {
		return getConstNumber(offset + 44, $xpns_inpt_qty);
	}

	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public void xpns_inpt_qty(MCNumber value) {
		setConstNumber(offset + 44, $xpns_inpt_qty, value);
	}
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public void xpns_inpt_qty(int value) {
		setConstNumber(offset + 44, $xpns_inpt_qty, value);
	}
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public void xpns_inpt_qty(long value) {
		setConstNumber(offset + 44, $xpns_inpt_qty, value);
	}
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public void xpns_inpt_qty(float value) {
		setConstNumber(offset + 44, $xpns_inpt_qty, value);
	}
	
	/**
	 * 経費投入数量. Expenses input qty..<p>
	 *
	 */
	public void xpns_inpt_qty(double value) {
		setConstNumber(offset + 44, $xpns_inpt_qty, value);
	}
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public MCNumber xpns_inpt_amt() {
		return getConstNumber(offset + 45, $xpns_inpt_amt);
	}

	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public void xpns_inpt_amt(MCNumber value) {
		setConstNumber(offset + 45, $xpns_inpt_amt, value);
	}
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public void xpns_inpt_amt(int value) {
		setConstNumber(offset + 45, $xpns_inpt_amt, value);
	}
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public void xpns_inpt_amt(long value) {
		setConstNumber(offset + 45, $xpns_inpt_amt, value);
	}
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public void xpns_inpt_amt(float value) {
		setConstNumber(offset + 45, $xpns_inpt_amt, value);
	}
	
	/**
	 * 経費投入原価. Expenses input costs.<p>
	 *
	 */
	public void xpns_inpt_amt(double value) {
		setConstNumber(offset + 45, $xpns_inpt_amt, value);
	}
	
	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public MCDate ym_sub() {
		return getConstDate(offset + 46, $ym_sub);
	}

	/**
	 * 年月サブ. Year month sub.<p>
	 *
	 */
	public void ym_sub(MCDate value) {
		setConstDate(offset + 46, $ym_sub, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			return st_stk_qty();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			return mfg_gr_qty();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			return othr_gr_qty();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			return plnt_gi_qty();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			return othr_gi_qty();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			return prov_qty();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			return xpns_inpt_qty();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			return ym_sub();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			return calc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			return mng_dpt_cd();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			return ave_upri();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			return st_stk_qty();
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			return st_stk_amt();
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			return mfg_qty();
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			return mfg_amt();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			return mfg_gr_qty();
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			return mfg_gr_amt();
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			return othr_gr_qty();
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			return othr_gr_amt();
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			return alc_amt();
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			return inpt_qty();
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			return inpt_amt();
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			return plnt_gi_qty();
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			return plnt_gi_amt();
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			return othr_gi_qty();
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			return othr_gi_amt();
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			return prov_qty();
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			return prov_amt();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			return end_stk_qty();
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			return end_stk_amt();
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			return diff_qty();
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			return diff_amt();
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			return xpns_inpt_qty();
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			return xpns_inpt_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			return ym_sub();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			ym_sub(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		if ($calc_grp_cd.equalsIgnoreCase(name)) {
			calc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mng_dpt_cd.equalsIgnoreCase(name)) {
			mng_dpt_cd(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($ave_upri.equalsIgnoreCase(name)) {
			ave_upri(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($st_stk_qty.equalsIgnoreCase(name)) {
			st_stk_qty(value);
			return;
		}
		if ($st_stk_amt.equalsIgnoreCase(name)) {
			st_stk_amt(value);
			return;
		}
		if ($mfg_qty.equalsIgnoreCase(name)) {
			mfg_qty(value);
			return;
		}
		if ($mfg_amt.equalsIgnoreCase(name)) {
			mfg_amt(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($mfg_gr_qty.equalsIgnoreCase(name)) {
			mfg_gr_qty(value);
			return;
		}
		if ($mfg_gr_amt.equalsIgnoreCase(name)) {
			mfg_gr_amt(value);
			return;
		}
		if ($othr_gr_qty.equalsIgnoreCase(name)) {
			othr_gr_qty(value);
			return;
		}
		if ($othr_gr_amt.equalsIgnoreCase(name)) {
			othr_gr_amt(value);
			return;
		}
		if ($alc_amt.equalsIgnoreCase(name)) {
			alc_amt(value);
			return;
		}
		if ($inpt_qty.equalsIgnoreCase(name)) {
			inpt_qty(value);
			return;
		}
		if ($inpt_amt.equalsIgnoreCase(name)) {
			inpt_amt(value);
			return;
		}
		if ($plnt_gi_qty.equalsIgnoreCase(name)) {
			plnt_gi_qty(value);
			return;
		}
		if ($plnt_gi_amt.equalsIgnoreCase(name)) {
			plnt_gi_amt(value);
			return;
		}
		if ($othr_gi_qty.equalsIgnoreCase(name)) {
			othr_gi_qty(value);
			return;
		}
		if ($othr_gi_amt.equalsIgnoreCase(name)) {
			othr_gi_amt(value);
			return;
		}
		if ($prov_qty.equalsIgnoreCase(name)) {
			prov_qty(value);
			return;
		}
		if ($prov_amt.equalsIgnoreCase(name)) {
			prov_amt(value);
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
		if ($end_stk_qty.equalsIgnoreCase(name)) {
			end_stk_qty(value);
			return;
		}
		if ($end_stk_amt.equalsIgnoreCase(name)) {
			end_stk_amt(value);
			return;
		}
		if ($diff_qty.equalsIgnoreCase(name)) {
			diff_qty(value);
			return;
		}
		if ($diff_amt.equalsIgnoreCase(name)) {
			diff_amt(value);
			return;
		}
		if ($xpns_inpt_qty.equalsIgnoreCase(name)) {
			xpns_inpt_qty(value);
			return;
		}
		if ($xpns_inpt_amt.equalsIgnoreCase(name)) {
			xpns_inpt_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_sub.equalsIgnoreCase(name)) {
			ym_sub(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

}
