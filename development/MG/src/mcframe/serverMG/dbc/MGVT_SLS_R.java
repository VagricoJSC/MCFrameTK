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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算売上ビュー // Cost calculation sales view"DBコンテナRowクラスです。<p>
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
 *  	<td>act_sls_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上実績ＩＤ</td>
 *  	<td>Sales result ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>act_sls_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上実績ＩＤ枝番</td>
 *  	<td>Sales result ID branch No.</td>
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
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月</td>
 *  	<td>Year month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mng_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>管理部門ＣＤ</td>
 *  	<td>Management dept. cd.</td>
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
 *  	<td>itm_ext</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目拡張</td>
 *  	<td>Item extension</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
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
 *  	<td>qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>数量</td>
 *  	<td>Quantity</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨金額</td>
 *  	<td>Currency amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
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
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫先ＣＤ</td>
 *  	<td>Company holding inventory cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦部門ＣＤ</td>
 *  	<td>Allocation dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_val1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦基準値１</td>
 *  	<td>Allocation value 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_val2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦基準値２</td>
 *  	<td>Allocation value 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_val3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦基準値３</td>
 *  	<td>Allocation value 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_val4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦基準値４</td>
 *  	<td>Allocation value 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alc_val5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦基準値５</td>
 *  	<td>Allocation value 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rec_eval_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>個別評価区分</td>
 *  	<td>Individual evaluation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>zero_effect_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ゼロ評価ＦＬＧ</td>
 *  	<td>Zero evaluation flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVT_SLS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_SLS";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 売上実績ＩＤ. Sales result ID.<p>
	 *
	 */
	public static final String $act_sls_id = "act_sls_id";
	private static final MCPermColumnInfo _act_sls_id = createColumnInfo("act_sls_id");
	public final MCStringPermColumn act_sls_id = createStringColumn(_act_sls_id);
	
	/**
	 * 売上実績ＩＤ枝番. Sales result ID branch No..<p>
	 *
	 */
	public static final String $act_sls_id_sub = "act_sls_id_sub";
	private static final MCPermColumnInfo _act_sls_id_sub = createColumnInfo("act_sls_id_sub");
	public final MCStringPermColumn act_sls_id_sub = createStringColumn(_act_sls_id_sub);
	
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
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
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
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public static final String $itm_ext = "itm_ext";
	private static final MCPermColumnInfo _itm_ext = createColumnInfo("itm_ext");
	public final MCStringPermColumn itm_ext = createStringColumn(_itm_ext);
	
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
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	private static final MCPermColumnInfo _asst_typ = createColumnInfo("asst_typ");
	public final MCStringPermColumn asst_typ = createStringColumn(_asst_typ);
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public static final String $qty = "qty";
	private static final MCPermColumnInfo _qty = createColumnInfo("qty");
	public final MCNumberPermColumn qty = createNumberColumn(_qty);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public static final String $cur_amt = "cur_amt";
	private static final MCPermColumnInfo _cur_amt = createColumnInfo("cur_amt");
	public final MCNumberPermColumn cur_amt = createNumberColumn(_cur_amt);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	private static final MCPermColumnInfo _stk_bp_cd = createColumnInfo("stk_bp_cd");
	public final MCStringPermColumn stk_bp_cd = createStringColumn(_stk_bp_cd);
	
	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public static final String $alc_dpt_cd = "alc_dpt_cd";
	private static final MCPermColumnInfo _alc_dpt_cd = createColumnInfo("alc_dpt_cd");
	public final MCStringPermColumn alc_dpt_cd = createStringColumn(_alc_dpt_cd);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public static final String $alc_val1 = "alc_val1";
	private static final MCPermColumnInfo _alc_val1 = createColumnInfo("alc_val1");
	public final MCNumberPermColumn alc_val1 = createNumberColumn(_alc_val1);
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public static final String $alc_val2 = "alc_val2";
	private static final MCPermColumnInfo _alc_val2 = createColumnInfo("alc_val2");
	public final MCNumberPermColumn alc_val2 = createNumberColumn(_alc_val2);
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public static final String $alc_val3 = "alc_val3";
	private static final MCPermColumnInfo _alc_val3 = createColumnInfo("alc_val3");
	public final MCNumberPermColumn alc_val3 = createNumberColumn(_alc_val3);
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public static final String $alc_val4 = "alc_val4";
	private static final MCPermColumnInfo _alc_val4 = createColumnInfo("alc_val4");
	public final MCNumberPermColumn alc_val4 = createNumberColumn(_alc_val4);
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public static final String $alc_val5 = "alc_val5";
	private static final MCPermColumnInfo _alc_val5 = createColumnInfo("alc_val5");
	public final MCNumberPermColumn alc_val5 = createNumberColumn(_alc_val5);
	
	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public static final String $rec_eval_typ = "rec_eval_typ";
	private static final MCPermColumnInfo _rec_eval_typ = createColumnInfo("rec_eval_typ");
	public final MCStringPermColumn rec_eval_typ = createStringColumn(_rec_eval_typ);
	
	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public static final String $zero_effect_flg = "zero_effect_flg";
	private static final MCPermColumnInfo _zero_effect_flg = createColumnInfo("zero_effect_flg");
	public final MCBooleanPermColumn zero_effect_flg = createBooleanColumn(_zero_effect_flg);
	
	public static final MCMeta act_sls_id_META = createCommonMeta($act_sls_id, mcframe.commonMG.meta.MG_META.ACT_SLS_ID);
	public static final MCMeta act_sls_id_sub_META = createCommonMeta($act_sls_id_sub, mcframe.commonMG.meta.MG_META.ACT_SLS_ID_SUB);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mng_dpt_cd_META = createCommonMeta($mng_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_ext_META = createCommonMeta($itm_ext, mcframe.commonMG.meta.MG_META.ITM_EXT);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_amt_META = createCommonMeta($cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta alc_dpt_cd_META = createCommonMeta($alc_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta alc_val1_META = createCommonMeta($alc_val1, mcframe.commonMA.meta.MA_META.ALC_VAL1);
	public static final MCMeta alc_val2_META = createCommonMeta($alc_val2, mcframe.commonMA.meta.MA_META.ALC_VAL2);
	public static final MCMeta alc_val3_META = createCommonMeta($alc_val3, mcframe.commonMA.meta.MA_META.ALC_VAL3);
	public static final MCMeta alc_val4_META = createCommonMeta($alc_val4, mcframe.commonMA.meta.MA_META.ALC_VAL4);
	public static final MCMeta alc_val5_META = createCommonMeta($alc_val5, mcframe.commonMA.meta.MA_META.ALC_VAL5);
	public static final MCMeta rec_eval_typ_META = createCommonMeta($rec_eval_typ, mcframe.commonMG.meta.MG_META.REC_EVAL_TYP);
	public static final MCMeta zero_effect_flg_META = createCommonMeta($zero_effect_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVT_SLS_R> constMetas = new ConstMetaList<MGVT_SLS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			act_sls_id_META,
			act_sls_id_sub_META,
			wg_cd_META,
			ym_META,
			ac_dt_META,
			mng_dpt_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_ext_META,
			lot_no_META,
			sublot_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			ac_slip_typ_META,
			ac_rsn_cd_META,
			asst_typ_META,
			qty_META,
			amt_META,
			cur_cd_META,
			cur_amt_META,
			xrate_META,
			cst_cd_META,
			dlv_cd_META,
			po_no_META,
			slo_no_META,
			iv_no_META,
			stk_bp_cd_META,
			alc_dpt_cd_META,
			sls_dpt_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			alc_val1_META,
			alc_val2_META,
			alc_val3_META,
			alc_val4_META,
			alc_val5_META,
			rec_eval_typ_META,
			zero_effect_flg_META
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
	protected MGVT_SLS_R(ConstMetaList<? extends MGVT_SLS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_SLS_R(ConstMetaList<? extends MGVT_SLS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_SLS_R.$act_sls_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$act_sls_id,
				"act_sls_id",
				act_sls_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$act_sls_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$act_sls_id_sub,
				"act_sls_id_sub",
				act_sls_id_sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$wg_cd,
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
			MGVT_SLS_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_SLS_R.$ym,
				"ym",
				ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_SLS_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$mng_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$mng_dpt_cd,
				"mng_dpt_cd",
				mng_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$itm_cd,
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
			MGVT_SLS_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$itm_sub1,
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
			MGVT_SLS_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$itm_sub2,
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
			MGVT_SLS_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$itm_sub3,
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
			MGVT_SLS_R.$itm_ext,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$itm_ext,
				"itm_ext",
				itm_ext,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sno1,
				"sno1",
				sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sno2,
				"sno2",
				sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sno3,
				"sno3",
				sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sno4,
				"sno4",
				sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$asst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$asst_typ,
				"asst_typ",
				asst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$qty,
				"qty",
				qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$amt,
				"amt",
				amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$cur_amt,
				"cur_amt",
				cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$xrate,
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
			MGVT_SLS_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$cst_cd,
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
			MGVT_SLS_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$po_no,
				"po_no",
				po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$stk_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$stk_bp_cd,
				"stk_bp_cd",
				stk_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$alc_dpt_cd,
				"alc_dpt_cd",
				alc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$sls_dpt_cd,
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
			MGVT_SLS_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_val1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$alc_val1,
				"alc_val1",
				alc_val1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_val2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$alc_val2,
				"alc_val2",
				alc_val2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_val3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$alc_val3,
				"alc_val3",
				alc_val3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_val4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$alc_val4,
				"alc_val4",
				alc_val4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$alc_val5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_SLS_R.$alc_val5,
				"alc_val5",
				alc_val5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$rec_eval_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_SLS_R.$rec_eval_typ,
				"rec_eval_typ",
				rec_eval_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_SLS_R.$zero_effect_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_SLS_R.$zero_effect_flg,
				"zero_effect_flg",
				zero_effect_flg,
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
	public static MGVT_SLS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_SLS_R create(String alias) {
		MGVT_SLS_R row = new MGVT_SLS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_SLS_R createByName(T proto) {
		MGVT_SLS_R row = MGVT_SLS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_SLS_R clone() {
		return (MGVT_SLS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_SLS_R createInstance() {
		return (MGVT_SLS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_SLS_R getValues(String... names) {
		return (MGVT_SLS_R) super.getValues(names);
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
	 * 売上実績ＩＤ. Sales result ID.<p>
	 *
	 */
	public String act_sls_id() {
		return getConstString(offset + 0, $act_sls_id);
	}

	/**
	 * 売上実績ＩＤ. Sales result ID.<p>
	 *
	 */
	public void act_sls_id(String value) {
		setConstString(offset + 0, $act_sls_id, value);
	}

	/**
	 * 売上実績ＩＤ枝番. Sales result ID branch No..<p>
	 *
	 */
	public String act_sls_id_sub() {
		return getConstString(offset + 1, $act_sls_id_sub);
	}

	/**
	 * 売上実績ＩＤ枝番. Sales result ID branch No..<p>
	 *
	 */
	public void act_sls_id_sub(String value) {
		setConstString(offset + 1, $act_sls_id_sub, value);
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
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 4, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 4, $ac_dt, value);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public String mng_dpt_cd() {
		return getConstString(offset + 5, $mng_dpt_cd);
	}

	/**
	 * 管理部門ＣＤ. Management dept. cd..<p>
	 *
	 */
	public void mng_dpt_cd(String value) {
		setConstString(offset + 5, $mng_dpt_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 6, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 6, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 7, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 7, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 8, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 8, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 9, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 9, $itm_sub3, value);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public String itm_ext() {
		return getConstString(offset + 10, $itm_ext);
	}

	/**
	 * 品目拡張. Item extension.<p>
	 *
	 */
	public void itm_ext(String value) {
		setConstString(offset + 10, $itm_ext, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 11, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 11, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 12, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 12, $sublot_no, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 13, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 13, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 14, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 14, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 15, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 15, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 16, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 16, $sno4, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 17, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 17, $ac_slip_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 18, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 18, $ac_rsn_cd, value);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 19, $asst_typ);
	}

	/**
	 * 資産区分. Asset type.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 19, $asst_typ, value);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 20, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 20, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 20, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 20, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 20, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 20, $qty, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 21, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 21, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 21, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 21, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 21, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 21, $amt, value);
	}
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 22, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 22, $cur_cd, value);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public MCNumber cur_amt() {
		return getConstNumber(offset + 23, $cur_amt);
	}

	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(MCNumber value) {
		setConstNumber(offset + 23, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(int value) {
		setConstNumber(offset + 23, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(long value) {
		setConstNumber(offset + 23, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(float value) {
		setConstNumber(offset + 23, $cur_amt, value);
	}
	
	/**
	 * 通貨金額. Currency amount.<p>
	 *
	 */
	public void cur_amt(double value) {
		setConstNumber(offset + 23, $cur_amt, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 24, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 24, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 24, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 24, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 24, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 24, $xrate, value);
	}
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 25, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 25, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 26, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 26, $dlv_cd, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 27, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 27, $po_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 28, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 28, $slo_no, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 29, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 29, $iv_no, value);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 30, $stk_bp_cd);
	}

	/**
	 * 在庫先ＣＤ. Company holding inventory cd..<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 30, $stk_bp_cd, value);
	}

	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public String alc_dpt_cd() {
		return getConstString(offset + 31, $alc_dpt_cd);
	}

	/**
	 * 配賦部門ＣＤ. Allocation dept. cd..<p>
	 *
	 */
	public void alc_dpt_cd(String value) {
		setConstString(offset + 31, $alc_dpt_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 32, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 32, $sls_dpt_cd, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 33, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 33, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 34, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 34, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 35, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 35, $dest_cd3, value);
	}

	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public MCNumber alc_val1() {
		return getConstNumber(offset + 36, $alc_val1);
	}

	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public void alc_val1(MCNumber value) {
		setConstNumber(offset + 36, $alc_val1, value);
	}
	
	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public void alc_val1(int value) {
		setConstNumber(offset + 36, $alc_val1, value);
	}
	
	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public void alc_val1(long value) {
		setConstNumber(offset + 36, $alc_val1, value);
	}
	
	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public void alc_val1(float value) {
		setConstNumber(offset + 36, $alc_val1, value);
	}
	
	/**
	 * 配賦基準値１. Allocation value 1.<p>
	 *
	 */
	public void alc_val1(double value) {
		setConstNumber(offset + 36, $alc_val1, value);
	}
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public MCNumber alc_val2() {
		return getConstNumber(offset + 37, $alc_val2);
	}

	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public void alc_val2(MCNumber value) {
		setConstNumber(offset + 37, $alc_val2, value);
	}
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public void alc_val2(int value) {
		setConstNumber(offset + 37, $alc_val2, value);
	}
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public void alc_val2(long value) {
		setConstNumber(offset + 37, $alc_val2, value);
	}
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public void alc_val2(float value) {
		setConstNumber(offset + 37, $alc_val2, value);
	}
	
	/**
	 * 配賦基準値２. Allocation value 2.<p>
	 *
	 */
	public void alc_val2(double value) {
		setConstNumber(offset + 37, $alc_val2, value);
	}
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public MCNumber alc_val3() {
		return getConstNumber(offset + 38, $alc_val3);
	}

	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public void alc_val3(MCNumber value) {
		setConstNumber(offset + 38, $alc_val3, value);
	}
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public void alc_val3(int value) {
		setConstNumber(offset + 38, $alc_val3, value);
	}
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public void alc_val3(long value) {
		setConstNumber(offset + 38, $alc_val3, value);
	}
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public void alc_val3(float value) {
		setConstNumber(offset + 38, $alc_val3, value);
	}
	
	/**
	 * 配賦基準値３. Allocation value 3.<p>
	 *
	 */
	public void alc_val3(double value) {
		setConstNumber(offset + 38, $alc_val3, value);
	}
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public MCNumber alc_val4() {
		return getConstNumber(offset + 39, $alc_val4);
	}

	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public void alc_val4(MCNumber value) {
		setConstNumber(offset + 39, $alc_val4, value);
	}
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public void alc_val4(int value) {
		setConstNumber(offset + 39, $alc_val4, value);
	}
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public void alc_val4(long value) {
		setConstNumber(offset + 39, $alc_val4, value);
	}
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public void alc_val4(float value) {
		setConstNumber(offset + 39, $alc_val4, value);
	}
	
	/**
	 * 配賦基準値４. Allocation value 4.<p>
	 *
	 */
	public void alc_val4(double value) {
		setConstNumber(offset + 39, $alc_val4, value);
	}
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public MCNumber alc_val5() {
		return getConstNumber(offset + 40, $alc_val5);
	}

	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public void alc_val5(MCNumber value) {
		setConstNumber(offset + 40, $alc_val5, value);
	}
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public void alc_val5(int value) {
		setConstNumber(offset + 40, $alc_val5, value);
	}
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public void alc_val5(long value) {
		setConstNumber(offset + 40, $alc_val5, value);
	}
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public void alc_val5(float value) {
		setConstNumber(offset + 40, $alc_val5, value);
	}
	
	/**
	 * 配賦基準値５. Allocation value 5.<p>
	 *
	 */
	public void alc_val5(double value) {
		setConstNumber(offset + 40, $alc_val5, value);
	}
	
	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public String rec_eval_typ() {
		return getConstString(offset + 41, $rec_eval_typ);
	}

	/**
	 * 個別評価区分. Individual evaluation type.<p>
	 *
	 */
	public void rec_eval_typ(String value) {
		setConstString(offset + 41, $rec_eval_typ, value);
	}

	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public boolean zero_effect_flg() {
		return getConstBoolean(offset + 42, $zero_effect_flg);
	}

	/**
	 * ゼロ評価ＦＬＧ. Zero evaluation flg..<p>
	 *
	 */
	public void zero_effect_flg(boolean value) {
		setConstBoolean(offset + 42, $zero_effect_flg, value);
	}

	public String getString(String name) {
		if ($act_sls_id.equalsIgnoreCase(name)) {
			return act_sls_id();
		}
		if ($act_sls_id_sub.equalsIgnoreCase(name)) {
			return act_sls_id_sub();
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($act_sls_id.equalsIgnoreCase(name)) {
			return act_sls_id();
		}
		if ($act_sls_id_sub.equalsIgnoreCase(name)) {
			return act_sls_id_sub();
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			return itm_ext();
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			return alc_dpt_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			return rec_eval_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			return cur_amt();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			return alc_val1();
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			return alc_val2();
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			return alc_val3();
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			return alc_val4();
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			return alc_val5();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			return zero_effect_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($act_sls_id.equalsIgnoreCase(name)) {
			act_sls_id(value);
			return;
		}
		if ($act_sls_id_sub.equalsIgnoreCase(name)) {
			act_sls_id_sub(value);
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_sls_id.equalsIgnoreCase(name)) {
			act_sls_id(value);
			return;
		}
		if ($act_sls_id_sub.equalsIgnoreCase(name)) {
			act_sls_id_sub(value);
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
		if ($itm_ext.equalsIgnoreCase(name)) {
			itm_ext(value);
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
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($alc_dpt_cd.equalsIgnoreCase(name)) {
			alc_dpt_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($rec_eval_typ.equalsIgnoreCase(name)) {
			rec_eval_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($cur_amt.equalsIgnoreCase(name)) {
			cur_amt(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($alc_val1.equalsIgnoreCase(name)) {
			alc_val1(value);
			return;
		}
		if ($alc_val2.equalsIgnoreCase(name)) {
			alc_val2(value);
			return;
		}
		if ($alc_val3.equalsIgnoreCase(name)) {
			alc_val3(value);
			return;
		}
		if ($alc_val4.equalsIgnoreCase(name)) {
			alc_val4(value);
			return;
		}
		if ($alc_val5.equalsIgnoreCase(name)) {
			alc_val5(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($zero_effect_flg.equalsIgnoreCase(name)) {
			zero_effect_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
